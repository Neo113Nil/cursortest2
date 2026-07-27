package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.anythink.basead.ui.BaseATView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.gb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3248gb extends AbstractBinderC3570mb {

    /* renamed from: B, reason: collision with root package name */
    public static final int f30573B;

    /* renamed from: C, reason: collision with root package name */
    public static final int f30574C;

    /* renamed from: A, reason: collision with root package name */
    public final int f30575A;

    /* renamed from: n, reason: collision with root package name */
    public final String f30576n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f30577u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f30578v;

    /* renamed from: w, reason: collision with root package name */
    public final int f30579w;

    /* renamed from: x, reason: collision with root package name */
    public final int f30580x;

    /* renamed from: y, reason: collision with root package name */
    public final int f30581y;

    /* renamed from: z, reason: collision with root package name */
    public final int f30582z;

    static {
        int rgb = Color.rgb(12, 174, BaseATView.a.f9769E);
        f30573B = Color.rgb(BaseATView.a.f9767C, BaseATView.a.f9767C, BaseATView.a.f9767C);
        f30574C = rgb;
    }

    public BinderC3248gb(String str, List list, Integer num, Integer num2, Integer num3, int i, int i6) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f30577u = new ArrayList();
        this.f30578v = new ArrayList();
        this.f30576n = str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            BinderC3356ib binderC3356ib = (BinderC3356ib) list.get(i9);
            this.f30577u.add(binderC3356ib);
            this.f30578v.add(binderC3356ib);
        }
        this.f30579w = num != null ? num.intValue() : f30573B;
        this.f30580x = num2 != null ? num2.intValue() : f30574C;
        this.f30581y = num3 != null ? num3.intValue() : 12;
        this.f30582z = i;
        this.f30575A = i6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3624nb
    public final String c() {
        return this.f30576n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3624nb
    public final ArrayList f() {
        return this.f30578v;
    }
}
