package com.google.android.gms.internal.ads;

import android.graphics.Color;
import com.anythink.basead.ui.BaseATView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.bb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2989bb extends AbstractBinderC3369ib {

    /* renamed from: B, reason: collision with root package name */
    public static final int f29510B;

    /* renamed from: C, reason: collision with root package name */
    public static final int f29511C;

    /* renamed from: A, reason: collision with root package name */
    public final int f29512A;

    /* renamed from: n, reason: collision with root package name */
    public final String f29513n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f29514u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f29515v;

    /* renamed from: w, reason: collision with root package name */
    public final int f29516w;

    /* renamed from: x, reason: collision with root package name */
    public final int f29517x;

    /* renamed from: y, reason: collision with root package name */
    public final int f29518y;

    /* renamed from: z, reason: collision with root package name */
    public final int f29519z;

    static {
        int rgb = Color.rgb(12, 174, BaseATView.a.f9926E);
        f29510B = Color.rgb(BaseATView.a.f9924C, BaseATView.a.f9924C, BaseATView.a.f9924C);
        f29511C = rgb;
    }

    public BinderC2989bb(String str, List list, Integer num, Integer num2, Integer num3, int i, int i4) {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        this.f29514u = new ArrayList();
        this.f29515v = new ArrayList();
        this.f29513n = str;
        for (int i9 = 0; i9 < list.size(); i9++) {
            BinderC3098db binderC3098db = (BinderC3098db) list.get(i9);
            this.f29514u.add(binderC3098db);
            this.f29515v.add(binderC3098db);
        }
        this.f29516w = num != null ? num.intValue() : f29510B;
        this.f29517x = num2 != null ? num2.intValue() : f29511C;
        this.f29518y = num3 != null ? num3.intValue() : 12;
        this.f29519z = i;
        this.f29512A = i4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3421jb
    public final String d() {
        return this.f29513n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3421jb
    public final ArrayList i() {
        return this.f29515v;
    }
}
