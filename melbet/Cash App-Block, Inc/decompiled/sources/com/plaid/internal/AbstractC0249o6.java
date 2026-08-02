package com.plaid.internal;

/* renamed from: com.plaid.internal.o6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0249o6 {

    /* renamed from: com.plaid.internal.o6$a */
    public static final class a extends AbstractC0249o6 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 637371670;
        }

        public final String toString() {
            return "NotReady";
        }
    }

    /* renamed from: com.plaid.internal.o6$b */
    public static final class b extends AbstractC0249o6 {
        public b(String str) {
            str.getClass();
        }
    }

    /* renamed from: com.plaid.internal.o6$c */
    public static final class c extends AbstractC0249o6 {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
        }

        public final String a() {
            return this.a;
        }
    }

    /* renamed from: com.plaid.internal.o6$d */
    public static final class d extends AbstractC0249o6 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1655299293;
        }

        public final String toString() {
            return "Ready";
        }
    }
}
