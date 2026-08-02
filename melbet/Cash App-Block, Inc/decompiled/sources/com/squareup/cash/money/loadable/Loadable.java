package com.squareup.cash.money.loadable;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface Loadable {

    public final class Loaded implements Loadable {
        public final Object value;

        public Loaded(Object obj) {
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

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(value=", ")", this.value);
        }
    }

    /* loaded from: classes5.dex */
    public final class Loading implements Loadable {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -591022820;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
