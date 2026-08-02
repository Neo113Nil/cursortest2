package com.yandex.music.shared.ynison.api.queue;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import defpackage.gmw;
import defpackage.k5r;
import defpackage.law;
import defpackage.qnw;
import defpackage.y3l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/music/shared/ynison/api/queue/StartYnisonQueueCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueLaunch$Basic;", "Lqnw;", "startRequest", "Lqnw;", "e", "()Lqnw;", "", "playWhenReady", "Z", "c", "()Z", "Ly3l;", "queueStartValidator", "Ly3l;", "d", "()Ly3l;", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "", "onError", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "shared-ynison-queue"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class StartYnisonQueueCommand implements PlaybackCommand$QueueLaunch.Basic {
    private final Function1<Throwable, Unit> onError;
    private final Function0<Unit> onSuccess;
    private final boolean playWhenReady;

    @NotNull
    private final y3l queueStartValidator;

    @NotNull
    private final qnw startRequest;

    public StartYnisonQueueCommand(qnw qnwVar, boolean z, y3l y3lVar, law lawVar, gmw gmwVar) {
        y3lVar.getClass();
        this.startRequest = qnwVar;
        this.playWhenReady = z;
        this.queueStartValidator = y3lVar;
        this.onSuccess = lawVar;
        this.onError = gmwVar;
    }

    /* renamed from: a, reason: from getter */
    public final Function1 getOnError() {
        return this.onError;
    }

    /* renamed from: b, reason: from getter */
    public final Function0 getOnSuccess() {
        return this.onSuccess;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    /* renamed from: d, reason: from getter */
    public final y3l getQueueStartValidator() {
        return this.queueStartValidator;
    }

    /* renamed from: e, reason: from getter */
    public final qnw getStartRequest() {
        return this.startRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartYnisonQueueCommand)) {
            return false;
        }
        StartYnisonQueueCommand startYnisonQueueCommand = (StartYnisonQueueCommand) obj;
        return Intrinsics.d(this.startRequest, startYnisonQueueCommand.startRequest) && this.playWhenReady == startYnisonQueueCommand.playWhenReady && Intrinsics.d(this.queueStartValidator, startYnisonQueueCommand.queueStartValidator) && Intrinsics.d(this.onSuccess, startYnisonQueueCommand.onSuccess) && Intrinsics.d(this.onError, startYnisonQueueCommand.onError);
    }

    public final int hashCode() {
        int hashCode = (this.queueStartValidator.hashCode() + k5r.e(this.startRequest.hashCode() * 31, 31, this.playWhenReady)) * 31;
        Function0<Unit> function0 = this.onSuccess;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.onError;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "StartYnisonQueueCommand(startRequest=" + this.startRequest + ", playWhenReady=" + this.playWhenReady + ", queueStartValidator=" + this.queueStartValidator + ", onSuccess=" + this.onSuccess + ", onError=" + this.onError + ")";
    }
}
