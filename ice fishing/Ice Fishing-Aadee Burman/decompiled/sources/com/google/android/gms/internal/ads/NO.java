package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class NO implements Function {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ NO f26486b = new NO(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ NO f26487c = new NO(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26488a;

    public /* synthetic */ NO(int i) {
        this.f26488a = i;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        switch (this.f26488a) {
        }
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
