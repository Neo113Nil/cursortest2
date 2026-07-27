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
    public static final C4126ws f25981j = new C4126ws(new JSONArray().toString(), new Bundle(), "");

    /* renamed from: a, reason: collision with root package name */
    public final C3360ig f25982a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f25983b;

    /* renamed from: c, reason: collision with root package name */
    public final C3963tr f25984c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f25985d;

    /* renamed from: e, reason: collision with root package name */
    public final C3052cu f25986e;

    /* renamed from: f, reason: collision with root package name */
    public final C3855rr f25987f;

    /* renamed from: g, reason: collision with root package name */
    public final C2748Qn f25988g;

    /* renamed from: h, reason: collision with root package name */
    public final C2528Do f25989h;
    public final String i;

    public Ks(C3360ig c3360ig, ScheduledExecutorService scheduledExecutorService, String str, C3963tr c3963tr, Context context, C3052cu c3052cu, C3855rr c3855rr, C2748Qn c2748Qn, C2528Do c2528Do) {
        this.f25982a = c3360ig;
        this.f25983b = scheduledExecutorService;
        this.i = str;
        this.f25984c = c3963tr;
        this.f25985d = context;
        this.f25986e = c3052cu;
        this.f25987f = c3855rr;
        this.f25988g = c2748Qn;
        this.f25989h = c2528Do;
    }

    public final void a(ArrayList arrayList, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            C4125wr c4125wr = (C4125wr) ((Map.Entry) it.next()).getValue();
            String str = c4125wr.f34891a;
            Bundle bundle = this.f25986e.f29623d.f40099F;
            arrayList.add(b(str, Collections.singletonList(c4125wr.f34895e), bundle != null ? bundle.getBundle(str) : null, c4125wr.f34892b, c4125wr.f34893c));
        }
    }

    public final ID b(String str, List list, Bundle bundle, boolean z3, boolean z6) {
        Is is = new Is(this, str, list, bundle, z3, z6);
        C3360ig c3360ig = this.f25982a;
        ID s9 = ID.s(QC.p(is, c3360ig));
        C3301ha c3301ha = AbstractC3569ma.f32253g2;
        q2.r rVar = q2.r.f40204e;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
            s9 = (ID) QC.s(s9, ((Long) rVar.f40207c.a(AbstractC3569ma.f32185Z1)).longValue(), TimeUnit.MILLISECONDS, this.f25983b);
        }
        return QC.q(s9, Throwable.class, new C2981bc(str, 3), c3360ig);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final N3.a c() {
        C3052cu c3052cu = this.f25986e;
        if (c3052cu.f29637s) {
            if (!Arrays.asList(((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32308m2)).split(",")).contains(com.bumptech.glide.d.m(com.bumptech.glide.d.n(c3052cu.f29623d)))) {
                return QC.c(f25981j);
            }
        }
        return QC.p(new C4178xq(3, this), this.f25982a);
    }

    @Override // com.google.android.gms.internal.ads.Ps
    public final int f() {
        return 32;
    }
}
