package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.anythink.basead.ui.BaseATView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3271gb extends AbstractBinderC3593mb {

    /* renamed from: B, reason: collision with root package name */
    public static final int f31340B;

    /* renamed from: C, reason: collision with root package name */
    public static final int f31341C;

    /* renamed from: A, reason: collision with root package name */
    public final int f31342A;

    /* renamed from: n, reason: collision with root package name */
    public final String f31343n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f31344u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f31345v;

    /* renamed from: w, reason: collision with root package name */
    public final int f31346w;

    /* renamed from: x, reason: collision with root package name */
    public final int f31347x;

    /* renamed from: y, reason: collision with root package name */
    public final int f31348y;

    /* renamed from: z, reason: collision with root package name */
    public final int f31349z;

    static {
        int rgb = Color.rgb(12, 174, BaseATView.a.f10555E);
        f31340B = Color.rgb(BaseATView.a.f10553C, BaseATView.a.f10553C, BaseATView.a.f10553C);
        f31341C = rgb;
    }

    public BinderC3271gb(String str, List list, Integer num, Integer num2, Integer num3, int i, int i4) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f31344u = new ArrayList();
        this.f31345v = new ArrayList();
        this.f31343n = str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            BinderC3379ib binderC3379ib = (BinderC3379ib) list.get(i6);
            this.f31344u.add(binderC3379ib);
            this.f31345v.add(binderC3379ib);
        }
        this.f31346w = num != null ? num.intValue() : f31340B;
        this.f31347x = num2 != null ? num2.intValue() : f31341C;
        this.f31348y = num3 != null ? num3.intValue() : 12;
        this.f31349z = i;
        this.f31342A = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3647nb
    public final String c() {
        return this.f31343n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3647nb
    public final ArrayList f() {
        return this.f31345v;
    }
}
