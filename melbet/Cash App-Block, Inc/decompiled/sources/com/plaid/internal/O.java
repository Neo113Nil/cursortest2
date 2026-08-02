package com.plaid.internal;

import android.util.Log;

/* loaded from: classes5.dex */
public final class O implements X3 {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[W3.values().length];
            a = iArr;
            try {
                iArr[W3.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[W3.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[W3.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[W3.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.plaid.internal.X3
    public final void a(W3 w3, String str) {
        int i = a.a[w3.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                i2 = 3;
            } else if (i != 3) {
                i2 = 4;
                if (i == 4) {
                    i2 = 6;
                }
            } else {
                i2 = 5;
            }
        }
        Log.println(i2, "ProveSDK", str);
    }

    @Override // com.plaid.internal.X3
    public final void a(W3 w3, String str, Exception exc) {
        a(w3, str + '\n' + Log.getStackTraceString(exc));
    }
}
