package com.plaid.internal;

import android.content.res.Resources;
import androidx.lifecycle.ViewModel;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class V0 extends ViewModel {
    public final Resources a;

    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.b, aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + C0322x.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            String str = this.a;
            String str2 = this.b;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ErrorTexts(header=", str, ", content=", str2, ", buttonText="), this.c, ")");
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[H3.values().length];
            try {
                iArr[H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public V0(Resources resources) {
        resources.getClass();
        this.a = resources;
    }
}
