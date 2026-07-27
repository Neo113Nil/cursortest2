package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* renamed from: com.google.android.gms.internal.ads.aP, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2930aP implements Function {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C2930aP f29203b = new C2930aP(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ C2930aP f29204c = new C2930aP(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29205a;

    public /* synthetic */ C2930aP(int i) {
        this.f29205a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f29205a) {
        }
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
