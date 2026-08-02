package com.plaid.internal;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;

/* renamed from: com.plaid.internal.w7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0321w7 extends Exception {

    /* renamed from: com.plaid.internal.w7$a */
    public static final class a extends AbstractC0321w7 {
        public static final a a = new a();

        public a() {
            super("Cellular network not available.", "ConnectivityManager established that a cellular network is not available, running on a simulator or a device with no sim card is no supported.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.w7$b */
    public static final class b extends AbstractC0321w7 {
        public static final b a = new b();

        public b() {
            super("Invalid URL, please check the format.", "Unable to convert the URL string to an URL object.", null, 4);
        }
    }

    /* renamed from: com.plaid.internal.w7$c */
    public static final class c extends AbstractC0321w7 {
        public final Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Exception exc) {
            super(Fragment$5$$ExternalSyntheticOutline0.m(exc, new StringBuilder("Networking error, cause: ")), null, exc, 2);
            exc.getClass();
            this.a = exc;
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

        @Override // java.lang.Throwable
        public final String toString() {
            return "NetworkRequestException(exception=" + this.a + ')';
        }
    }

    /* renamed from: com.plaid.internal.w7$d */
    public static final class d extends AbstractC0321w7 {
        public final String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super("Unable to get a valid result from the requested URL (" + str + ").", "Unable to get a redirection path or a result path from the URL, probably the SNAURL is corrupted (or maybe expired).", null, 4);
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.areEqual(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("NoResultFromUrl(result="), this.a, ')');
        }
    }

    /* renamed from: com.plaid.internal.w7$e */
    public static final class e extends AbstractC0321w7 {
        public static final e a = new e();

        public e() {
            super("Can't run inside main thread.", null, null, 6);
        }
    }

    /* renamed from: com.plaid.internal.w7$f */
    public static final class f extends AbstractC0321w7 {
        public final Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc) {
            super("Unexpected error happened: " + exc.getMessage() + '.', null, null, 6);
            exc.getClass();
            this.a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.areEqual(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnexpectedException(exception=" + this.a + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0321w7(String str, String str2, Exception exc, int i) {
        super(StringsKt__IndentKt.replaceIndent(r3.toString()), exc);
        str2 = (i & 2) != 0 ? null : str2;
        exc = (i & 4) != 0 ? null : exc;
        StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("\n    ", str, "\n    TechnicalError: ");
        m3m.append(str2 == null ? "Undefined" : str2);
        m3m.append("\n  ");
    }
}
