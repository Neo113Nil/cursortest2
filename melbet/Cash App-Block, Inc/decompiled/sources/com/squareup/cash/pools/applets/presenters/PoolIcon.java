package com.squareup.cash.pools.applets.presenters;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;

/* loaded from: classes6.dex */
public abstract class PoolIcon {

    public final class Overflow extends PoolIcon {
        public final String count;

        public Overflow(String str) {
            this.count = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Overflow) && this.count.equals(((Overflow) obj).count);
        }

        public final int hashCode() {
            return this.count.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Overflow(count=", this.count, ")");
        }
    }

    public final class Pool extends PoolIcon {
        public final ImmutableList participants;
        public final float progressPercent;

        public Pool(float f, AbstractPersistentList abstractPersistentList) {
            abstractPersistentList.getClass();
            this.progressPercent = f;
            this.participants = abstractPersistentList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pool)) {
                return false;
            }
            Pool pool = (Pool) obj;
            return Float.compare(this.progressPercent, pool.progressPercent) == 0 && Intrinsics.areEqual(this.participants, pool.participants);
        }

        public final int hashCode() {
            return this.participants.hashCode() + (Float.hashCode(this.progressPercent) * 961);
        }

        public final String toString() {
            return "Pool(progressPercent=" + this.progressPercent + ", iconAccessibilityLabel=null, participants=" + this.participants + ")";
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.CompleteScenario.deepLinkSpecs;
    }

    public static final void setAlpha(TextPaint textPaint, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        if (f < RecyclerView.DECELERATION_RATE) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(Math.round(f * 255.0f));
    }
}
