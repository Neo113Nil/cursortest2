package com.squareup.cash.limits.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class LimitItemViewModel {

    public final class ProgressBarLimit extends LimitItemViewModel {
        public final String header;
        public final List progressBars;

        public ProgressBarLimit(String str, List list) {
            list.getClass();
            this.header = str;
            this.progressBars = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProgressBarLimit)) {
                return false;
            }
            ProgressBarLimit progressBarLimit = (ProgressBarLimit) obj;
            return Intrinsics.areEqual(this.header, progressBarLimit.header) && Intrinsics.areEqual(this.progressBars, progressBarLimit.progressBars);
        }

        public final int hashCode() {
            String str = this.header;
            return this.progressBars.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ProgressBarLimit(header=", this.header, ", progressBars=", ")", this.progressBars);
        }
    }

    public final class StaticLimit extends LimitItemViewModel {
        public final String header;
        public final List items;
        public final List parsedItems;

        public StaticLimit(String str, ArrayList arrayList, List list) {
            list.getClass();
            this.header = str;
            this.items = list;
            this.parsedItems = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StaticLimit)) {
                return false;
            }
            StaticLimit staticLimit = (StaticLimit) obj;
            return Intrinsics.areEqual(this.header, staticLimit.header) && Intrinsics.areEqual(this.items, staticLimit.items) && Intrinsics.areEqual(this.parsedItems, staticLimit.parsedItems);
        }

        public final int hashCode() {
            String str = this.header;
            int m = Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
            List list = this.parsedItems;
            return m + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(NavAction$$ExternalSyntheticOutline0.m("StaticLimit(header=", this.header, ", items=", ", parsedItems=", this.items), this.parsedItems, ")");
        }
    }
}
