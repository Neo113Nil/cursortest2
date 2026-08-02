package com.squareup.cash.cashapppay.settings.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class CashAppPaySettingsViewModel {

    public final class Loaded extends CashAppPaySettingsViewModel {
        public final List linkedBusinesses;

        public Loaded(List list) {
            list.getClass();
            this.linkedBusinesses = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.linkedBusinesses, ((Loaded) obj).linkedBusinesses);
        }

        public final int hashCode() {
            return this.linkedBusinesses.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(linkedBusinesses=", ")", this.linkedBusinesses);
        }
    }

    public final class Loading extends CashAppPaySettingsViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -318562337;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
