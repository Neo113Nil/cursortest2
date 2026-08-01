package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;

/* renamed from: com.google.android.gms.internal.ads.bk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2989bk {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29317a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f29318b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f29319c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f29320d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f29321e;

    static {
        String str = AbstractC3159eu.f29993a;
        f29317a = Integer.toString(0, 36);
        f29318b = Integer.toString(1, 36);
        f29319c = Integer.toString(2, 36);
        f29320d = Integer.toString(3, 36);
        f29321e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f29317a, spanned.getSpanStart(obj));
        bundle2.putInt(f29318b, spanned.getSpanEnd(obj));
        bundle2.putInt(f29319c, spanned.getSpanFlags(obj));
        bundle2.putInt(f29320d, i);
        if (bundle != null) {
            bundle2.putBundle(f29321e, bundle);
        }
        return bundle2;
    }
}
