package com.squareup.cash.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

/* loaded from: classes.dex */
public interface DelayStrategy {

    /* loaded from: classes5.dex */
    public final class Backoff implements DelayStrategy {
        public final List durations;

        public Backoff(List list) {
            list.getClass();
            this.durations = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Backoff) && Intrinsics.areEqual(this.durations, ((Backoff) obj).durations);
        }

        public final int hashCode() {
            return this.durations.hashCode();
        }

        @Override // com.squareup.cash.api.DelayStrategy
        /* renamed from: nextDelay-LV8wdWc */
        public final Duration mo2979nextDelayLV8wdWc(int i) {
            List list = this.durations;
            return i > CollectionsKt__CollectionsKt.getLastIndex(list) ? (Duration) CollectionsKt.lastOrNull(list) : (Duration) CollectionsKt.getOrNull(i, list);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Backoff(durations=", ")", this.durations);
        }
    }

    public final class Stable implements DelayStrategy {
        public final long delay;

        public Stable(long j) {
            this.delay = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stable) && Duration.m4166equalsimpl0(this.delay, ((Stable) obj).delay);
        }

        public final int hashCode() {
            Duration.Companion companion = Duration.Companion;
            return Long.hashCode(this.delay);
        }

        @Override // com.squareup.cash.api.DelayStrategy
        /* renamed from: nextDelay-LV8wdWc */
        public final Duration mo2979nextDelayLV8wdWc(int i) {
            return new Duration(this.delay);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Stable(delay=", Duration.m4177toStringimpl(this.delay), ")");
        }
    }

    /* renamed from: nextDelay-LV8wdWc, reason: not valid java name */
    Duration mo2979nextDelayLV8wdWc(int i);
}
