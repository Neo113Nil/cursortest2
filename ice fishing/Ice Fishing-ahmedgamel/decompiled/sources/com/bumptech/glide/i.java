package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.gms.internal.ads.C2964aq;
import i1.C4585b;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f24178k;

    /* renamed from: a, reason: collision with root package name */
    public final C2964aq f24179a;

    /* renamed from: b, reason: collision with root package name */
    public final P1.h f24180b;

    /* renamed from: c, reason: collision with root package name */
    public final G3.e f24181c;

    /* renamed from: d, reason: collision with root package name */
    public final O2.i f24182d;

    /* renamed from: e, reason: collision with root package name */
    public final List f24183e;

    /* renamed from: f, reason: collision with root package name */
    public final s.b f24184f;

    /* renamed from: g, reason: collision with root package name */
    public final w1.k f24185g;

    /* renamed from: h, reason: collision with root package name */
    public final C4585b f24186h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public L1.e f24187j;

    static {
        a aVar = new a();
        aVar.f24154n = N1.b.f1908a;
        f24178k = aVar;
    }

    public i(Context context, C2964aq c2964aq, com.bumptech.glide.manager.o oVar, G3.e eVar, O2.i iVar, s.b bVar, List list, w1.k kVar, C4585b c4585b) {
        super(context.getApplicationContext());
        this.f24179a = c2964aq;
        this.f24181c = eVar;
        this.f24182d = iVar;
        this.f24183e = list;
        this.f24184f = bVar;
        this.f24185g = kVar;
        this.f24186h = c4585b;
        this.i = 4;
        this.f24180b = new P1.h(oVar);
    }

    public final l a() {
        return (l) this.f24180b.get();
    }
}
