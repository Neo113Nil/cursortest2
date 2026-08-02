package com.squareup.cash.cashapplite.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface LiteCashInViewModel {

    public final class Error implements LiteCashInViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 269175165;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements LiteCashInViewModel {
        public final List rows;

        public Loaded(List list) {
            list.getClass();
            this.rows = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.rows, ((Loaded) obj).rows);
        }

        public final int hashCode() {
            return this.rows.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("Loaded(rows=", ")", this.rows);
        }
    }

    public final class Loading implements LiteCashInViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1500033167;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
