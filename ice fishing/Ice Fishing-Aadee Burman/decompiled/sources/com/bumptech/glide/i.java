package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.google.android.gms.internal.ads.C2941aq;
import g1.C4522b;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f23391k;

    /* renamed from: a, reason: collision with root package name */
    public final C2941aq f23392a;

    /* renamed from: b, reason: collision with root package name */
    public final N1.h f23393b;

    /* renamed from: c, reason: collision with root package name */
    public final M2.i f23394c;

    /* renamed from: d, reason: collision with root package name */
    public final a4.e f23395d;

    /* renamed from: e, reason: collision with root package name */
    public final List f23396e;

    /* renamed from: f, reason: collision with root package name */
    public final s.b f23397f;

    /* renamed from: g, reason: collision with root package name */
    public final u1.l f23398g;

    /* renamed from: h, reason: collision with root package name */
    public final C4522b f23399h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public J1.e f23400j;

    static {
        a aVar = new a();
        aVar.f23367n = L1.b.f1619a;
        f23391k = aVar;
    }

    public i(Context context, C2941aq c2941aq, com.bumptech.glide.manager.p pVar, M2.i iVar, a4.e eVar, s.b bVar, List list, u1.l lVar, C4522b c4522b) {
        super(context.getApplicationContext());
        this.f23392a = c2941aq;
        this.f23394c = iVar;
        this.f23395d = eVar;
        this.f23396e = list;
        this.f23397f = bVar;
        this.f23398g = lVar;
        this.f23399h = c4522b;
        this.i = 4;
        this.f23393b = new N1.h(pVar);
    }

    public final l a() {
        return (l) this.f23393b.get();
    }
}
