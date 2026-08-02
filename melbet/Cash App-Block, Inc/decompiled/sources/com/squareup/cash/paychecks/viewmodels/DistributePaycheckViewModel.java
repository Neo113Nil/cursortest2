package com.squareup.cash.paychecks.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface DistributePaycheckViewModel {

    public final class Loaded implements DistributePaycheckViewModel {
        public final ArrayList allocations;
        public final String buttonText;
        public final String title;
        public final DistributionWheelViewModel wheelViewModel;

        public Loaded(String str, String str2, DistributionWheelViewModel distributionWheelViewModel, ArrayList arrayList) {
            str.getClass();
            str2.getClass();
            this.title = str;
            this.buttonText = str2;
            this.wheelViewModel = distributionWheelViewModel;
            this.allocations = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.buttonText, loaded.buttonText) && this.wheelViewModel.equals(loaded.wheelViewModel) && this.allocations.equals(loaded.allocations);
        }

        public final int hashCode() {
            return this.allocations.hashCode() + ((this.wheelViewModel.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.buttonText)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(title=", this.title, ", buttonText=", this.buttonText, ", wheelViewModel=");
            m.append(this.wheelViewModel);
            m.append(", allocations=");
            m.append(this.allocations);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements DistributePaycheckViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 299637695;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
