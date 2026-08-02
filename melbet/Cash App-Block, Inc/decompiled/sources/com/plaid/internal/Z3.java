package com.plaid.internal;

import android.util.Log;

/* loaded from: classes5.dex */
public final class Z3 {
    public static final W3 a;
    public static final X3 b;
    public static final a c;

    public class b {
    }

    static {
        O o = new O();
        a = W3.INFO;
        b = o;
        c = new a();
    }

    public class a implements X3 {
        @Override // com.plaid.internal.X3
        public final void a(W3 w3, String str) {
            try {
                Z3.b.a(w3, str);
            } catch (Exception e) {
                Log.e("ProveSDK", "log writer error!", e);
            }
        }

        @Override // com.plaid.internal.X3
        public final void a(W3 w3, String str, Exception exc) {
            try {
                Z3.b.a(w3, str, exc);
            } catch (Exception e) {
                Log.e("ProveSDK", "log writer error!", e);
            }
        }
    }
}
