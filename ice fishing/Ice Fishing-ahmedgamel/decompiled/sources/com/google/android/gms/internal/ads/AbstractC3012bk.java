package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3012bk {

    /* renamed from: a, reason: collision with root package name */
    public static final String f30106a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f30107b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f30108c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f30109d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f30110e;

    static {
        String str = AbstractC3182eu.f30782a;
        f30106a = Integer.toString(0, 36);
        f30107b = Integer.toString(1, 36);
        f30108c = Integer.toString(2, 36);
        f30109d = Integer.toString(3, 36);
        f30110e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f30106a, spanned.getSpanStart(obj));
        bundle2.putInt(f30107b, spanned.getSpanEnd(obj));
        bundle2.putInt(f30108c, spanned.getSpanFlags(obj));
        bundle2.putInt(f30109d, i);
        if (bundle != null) {
            bundle2.putBundle(f30110e, bundle);
        }
        return bundle2;
    }
}
