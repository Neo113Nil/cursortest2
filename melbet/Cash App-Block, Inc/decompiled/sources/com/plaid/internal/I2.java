package com.plaid.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes5.dex */
public abstract class I2 {

    public static final class a extends I2 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.a, "Delay(delayMillis=", ")");
        }
    }

    public static final class b extends I2 {
        public static final b a = new b();
    }

    public static final class c extends I2 {
        public static final c a = new c();
    }

    public static final class d extends I2 {
        public static final d a = new d();
    }
}
