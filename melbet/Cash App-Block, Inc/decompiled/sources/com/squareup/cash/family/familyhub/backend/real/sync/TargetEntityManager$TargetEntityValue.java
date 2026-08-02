package com.squareup.cash.family.familyhub.backend.real.sync;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public abstract class TargetEntityManager$TargetEntityValue {

    public final class Failed extends TargetEntityManager$TargetEntityValue {
        public static final Failed INSTANCE = new Failed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Failed);
        }

        public final int hashCode() {
            return 1282903189;
        }

        public final String toString() {
            return "Failed";
        }
    }

    public final class Loading extends TargetEntityManager$TargetEntityValue {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1756433436;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready extends TargetEntityManager$TargetEntityValue {
        public final List investmentHoldings;
        public final List recurringPreferences;
        public final List syncValues;

        public Ready(List list, List list2, List list3, int i) {
            list = (i & 1) != 0 ? EmptyList.INSTANCE : list;
            list2 = (i & 2) != 0 ? EmptyList.INSTANCE : list2;
            list3 = (i & 4) != 0 ? EmptyList.INSTANCE : list3;
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.syncValues = list;
            this.recurringPreferences = list2;
            this.investmentHoldings = list3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.syncValues.equals(ready.syncValues) && this.recurringPreferences.equals(ready.recurringPreferences) && this.investmentHoldings.equals(ready.investmentHoldings);
        }

        public final int hashCode() {
            return this.investmentHoldings.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.syncValues.hashCode() * 31, 31, this.recurringPreferences);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(re$$ExternalSyntheticOutline0.m("Ready(syncValues=", ", recurringPreferences=", ", investmentHoldings=", this.syncValues, this.recurringPreferences), this.investmentHoldings, ")");
        }
    }
}
