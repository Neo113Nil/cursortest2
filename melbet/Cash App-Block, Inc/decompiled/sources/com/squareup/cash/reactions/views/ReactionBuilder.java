package com.squareup.cash.reactions.views;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda8;
import com.squareup.cash.savings.views.ButtonGroupKt$$ExternalSyntheticLambda11;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.common.Reaction;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ReactionBuilder {
    public boolean acceptingEmojis;
    public boolean active;
    public final ButtonGroupKt$$ExternalSyntheticLambda11 appendedEmoji;
    public final RealSandboxer$$ExternalSyntheticLambda0 builtReaction;
    public final Handler handler = new Handler();
    public final int maxEmojis;
    public final KnotView$$ExternalSyntheticLambda1 reactionTimeout;
    public final ArrayList selectedEmojis;
    public long timeoutScheduledFor;

    public ReactionBuilder(int i, ButtonGroupKt$$ExternalSyntheticLambda11 buttonGroupKt$$ExternalSyntheticLambda11, RealSandboxer$$ExternalSyntheticLambda0 realSandboxer$$ExternalSyntheticLambda0) {
        this.maxEmojis = i;
        this.appendedEmoji = buttonGroupKt$$ExternalSyntheticLambda11;
        this.builtReaction = realSandboxer$$ExternalSyntheticLambda0;
        this.acceptingEmojis = i > 0;
        this.selectedEmojis = new ArrayList();
        this.reactionTimeout = new KnotView$$ExternalSyntheticLambda1(this, 29);
        this.timeoutScheduledFor = -1L;
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("ReactionBuilder is for use on MainThread only. ");
        throw null;
    }

    public final void appendToReaction(Reaction reaction, View view, View view2) {
        reaction.getClass();
        if (this.acceptingEmojis) {
            this.active = true;
            ArrayList arrayList = this.selectedEmojis;
            arrayList.add(reaction);
            this.appendedEmoji.invoke(reaction, view, view2);
            if (arrayList.size() < this.maxEmojis) {
                updateTimeout(1000L);
            } else {
                submitReaction();
            }
        }
    }

    public final void submitReaction() {
        this.acceptingEmojis = false;
        this.active = false;
        this.handler.removeCallbacks(this.reactionTimeout);
        this.timeoutScheduledFor = -1L;
        this.builtReaction.invoke(CollectionsKt.joinToString$default(this.selectedEmojis, "", null, null, 0, null, new OpenSourceKt$$ExternalSyntheticLambda8(21), 30));
    }

    public final void updateTimeout(long j) {
        long currentTimeMillis = System.currentTimeMillis() + j;
        if (this.active && this.acceptingEmojis && currentTimeMillis > this.timeoutScheduledFor) {
            Handler handler = this.handler;
            KnotView$$ExternalSyntheticLambda1 knotView$$ExternalSyntheticLambda1 = this.reactionTimeout;
            handler.removeCallbacks(knotView$$ExternalSyntheticLambda1);
            handler.postDelayed(knotView$$ExternalSyntheticLambda1, j);
            this.timeoutScheduledFor = currentTimeMillis;
        }
    }
}
