package com.plaid.internal;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.i4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0193i4<T, U> {

    /* renamed from: com.plaid.internal.i4$a */
    public static final class a<U> extends AbstractC0193i4 {
        public final U a;
        public final int b;

        public a(U u, int i) {
            this.a = u;
            this.b = i;
        }

        public final int b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            U u = this.a;
            return Integer.hashCode(this.b) + ((u == null ? 0 : u.hashCode()) * 31);
        }

        public final String toString() {
            return "HttpError(body=" + this.a + ", code=" + this.b + ")";
        }
    }

    /* renamed from: com.plaid.internal.i4$b */
    public static final class b extends AbstractC0193i4 {
        public final IOException a;

        public b(IOException iOException) {
            iOException.getClass();
            this.a = iOException;
        }

        public final IOException b() {
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
            return "NetworkError(error=" + this.a + ")";
        }
    }

    /* renamed from: com.plaid.internal.i4$c */
    public static final class c<T> extends AbstractC0193i4 {
        public final T a;

        public c(T t) {
            t.getClass();
            this.a = t;
        }

        public final T b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.areEqual(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Success(body=", ")", this.a);
        }
    }

    /* renamed from: com.plaid.internal.i4$d */
    public static final class d extends AbstractC0193i4 {
        public final Throwable a;

        public d(Throwable th) {
            this.a = th;
        }

        public final Throwable b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            Throwable th = this.a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("UnknownError(error=", ")", this.a);
        }
    }

    public final boolean a() {
        return !(this instanceof c);
    }
}
