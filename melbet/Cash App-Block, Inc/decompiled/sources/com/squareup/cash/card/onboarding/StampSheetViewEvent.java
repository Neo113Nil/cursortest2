package com.squareup.cash.card.onboarding;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.common.Stamp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface StampSheetViewEvent {

    public final class Cancel implements StampSheetViewEvent {
        public static final Cancel INSTANCE = new Cancel();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 492629654;
        }

        public final String toString() {
            return "Cancel";
        }
    }

    public final class Done implements StampSheetViewEvent {
        public final List stamp;

        public Done(List list) {
            list.getClass();
            this.stamp = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Done) && Intrinsics.areEqual(this.stamp, ((Done) obj).stamp);
        }

        public final int hashCode() {
            return this.stamp.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Done(stamp=", ")", this.stamp);
        }
    }

    public final class SelectStamp implements StampSheetViewEvent {
        public final Stamp stamp;

        public SelectStamp(Stamp stamp) {
            stamp.getClass();
            this.stamp = stamp;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectStamp) && Intrinsics.areEqual(this.stamp, ((SelectStamp) obj).stamp);
        }

        public final int hashCode() {
            return this.stamp.hashCode();
        }

        public final String toString() {
            return "SelectStamp(stamp=" + this.stamp + ")";
        }
    }
}
