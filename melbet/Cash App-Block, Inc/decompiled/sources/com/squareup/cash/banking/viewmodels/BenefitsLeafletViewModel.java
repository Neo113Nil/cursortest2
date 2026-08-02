package com.squareup.cash.banking.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BenefitsLeafletViewModel {

    public final class Error implements BenefitsLeafletViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1865679298;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements BenefitsLeafletViewModel {
        public final List elements;

        public Loaded(List list) {
            list.getClass();
            this.elements = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.elements, ((Loaded) obj).elements);
        }

        public final int hashCode() {
            return this.elements.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(elements=", ")", this.elements);
        }
    }

    public final class Loading implements BenefitsLeafletViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -562886026;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
