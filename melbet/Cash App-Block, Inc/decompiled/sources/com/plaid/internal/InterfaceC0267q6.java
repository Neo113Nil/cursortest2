package com.plaid.internal;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.q6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC0267q6 {

    /* renamed from: com.plaid.internal.q6$a */
    public static final class a implements InterfaceC0267q6 {
        public final AbstractC0321w7 a;

        public a(AbstractC0321w7 abstractC0321w7) {
            abstractC0321w7.getClass();
            this.a = abstractC0321w7;
        }

        public final AbstractC0321w7 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Fail(twilioVerifySnaException=" + this.a + ')';
        }
    }

    /* renamed from: com.plaid.internal.q6$b */
    public static final class b implements InterfaceC0267q6 {
        public final C0184h4 a;

        public b(C0184h4 c0184h4) {
            c0184h4.getClass();
            this.a = c0184h4;
        }

        public final C0184h4 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(networkRequestResult=" + this.a + ')';
        }
    }
}
