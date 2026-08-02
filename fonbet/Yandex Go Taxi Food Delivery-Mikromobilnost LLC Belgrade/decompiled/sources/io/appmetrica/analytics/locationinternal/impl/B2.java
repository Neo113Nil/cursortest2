package io.appmetrica.analytics.locationinternal.impl;

import android.text.TextUtils;
import java.util.Comparator;

/* loaded from: classes9.dex */
public final class B2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        w2 w2Var = (w2) obj;
        w2 w2Var2 = (w2) obj2;
        return (TextUtils.equals(w2Var.a, w2Var2.a) && TextUtils.equals(w2Var.b, w2Var2.b)) ? 0 : 10;
    }
}
