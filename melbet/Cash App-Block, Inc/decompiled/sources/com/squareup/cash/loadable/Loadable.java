package com.squareup.cash.loadable;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Loadable {
    public final Object value;

    public final class Failed extends Loadable {
        public final Throwable error;

        public Failed(Throwable th) {
            super(null);
            this.error = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && this.error.equals(((Failed) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode() * 31;
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Failed(error=", ", value=null)", this.error);
        }
    }

    public final class Loaded extends Loadable {
        public final Object value;

        public Loaded(Object obj) {
            super(obj);
            this.value = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.value, ((Loaded) obj).value);
        }

        public final int hashCode() {
            Object obj = this.value;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // com.squareup.cash.loadable.Loadable
        public final Object invoke() {
            return this.value;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(value=", ")", this.value);
        }
    }

    public final class Loading extends Loadable {
        public static final Loading INSTANCE = new Loading(null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1661609802;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public Loadable(Object obj) {
        this.value = obj;
    }

    public Object invoke() {
        return this.value;
    }
}
