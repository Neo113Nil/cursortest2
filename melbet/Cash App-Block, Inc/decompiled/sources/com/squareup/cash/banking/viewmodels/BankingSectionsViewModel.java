package com.squareup.cash.banking.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface BankingSectionsViewModel {

    public final class Loaded implements BankingSectionsViewModel {
        public final List sections;

        public Loaded(List list) {
            list.getClass();
            this.sections = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.sections, ((Loaded) obj).sections);
        }

        public final int hashCode() {
            return this.sections.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(sections=", ")", this.sections);
        }
    }

    public final class Loading implements BankingSectionsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 745628163;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
