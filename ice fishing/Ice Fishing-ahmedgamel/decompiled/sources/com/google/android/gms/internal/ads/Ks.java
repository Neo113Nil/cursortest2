package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class Ks implements Ps {

    /* renamed from: j, reason: collision with root package name */
    public static final C4149ws f26781j = new C4149ws(new JSONArray().toString(), new Bundle(), "");

    /* renamed from: a, reason: collision with root package name */
    public final C3383ig f26782a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f26783b;

    /* renamed from: c, reason: collision with root package name */
    public final C3986tr f26784c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f26785d;

    /* renamed from: e, reason: collision with root package name */
    public final C3075cu f26786e;

    /* renamed from: f, reason: collision with root package name */
    public final C3878rr f26787f;

    /* renamed from: g, reason: collision with root package name */
    public final C2785Rn f26788g;

    /* renamed from: h, reason: collision with root package name */
    public final C2565Eo f26789h;
    public final String i;

    public Ks(C3383ig c3383ig, ScheduledExecutorService scheduledExecutorService, String str, C3986tr c3986tr, Context context, C3075cu c3075cu, C3878rr c3878rr, C2785Rn c2785Rn, C2565Eo c2565Eo) {
        this.f26782a = c3383ig;
        this.f26783b = scheduledExecutorService;
        this.i = str;
        this.f26784c = c3986tr;
        this.f26785d = context;
        this.f26786e = c3075cu;
        this.f26787f = c3878rr;
        this.f26788g = c2785Rn;
        this.f26789h = c2565Eo;
    }

    public final void a(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            C4148wr c4148wr = (C4148wr) ((Map.Entry) it.next()).getValue();
            String str = c4148wr.f35672a;
            Bundle bundle = this.f26786e.f30393d.f40401F;
            arrayList.add(b(str, Collections.singletonList(c4148wr.f35676e), bundle != null ? bundle.getBundle(str) : null, c4148wr.f35673b, c4148wr.f35674c));
        }
    }

    public final ID b(String str, List list, Bundle bundle, boolean z6, boolean z9) {
        Is is = new Is(this, str, list, bundle, z6, z9);
        C3383ig c3383ig = this.f26782a;
        ID s9 = ID.s(QC.p(is, c3383ig));
        C3324ha c3324ha = AbstractC3592ma.f33033g2;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            s9 = (ID) QC.s(s9, ((Long) rVar.f40509c.a(AbstractC3592ma.f32964Z1)).longValue(), TimeUnit.MILLISECONDS, this.f26783b);
        }
        return QC.q(s9, Throwable.class, new C3004bc(str, 3), c3383ig);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final P3.a c() {
        C3075cu c3075cu = this.f26786e;
        if (c3075cu.f30407s) {
            if (!Arrays.asList(((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33087m2)).split(",")).contains(t8.g.s(t8.g.u(c3075cu.f30393d)))) {
                return QC.c(f26781j);
            }
        }
        return QC.p(new C4201xq(3, this), this.f26782a);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 32;
    }
}
