package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC4811a;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4162xa extends AbstractC4811a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f35023a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final List f35024b = Arrays.asList(((String) q2.r.f40204e.f40207c.a(AbstractC3569ma.ob)).split(","));

    /* renamed from: c, reason: collision with root package name */
    public final C4216ya f35025c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4811a f35026d;

    /* renamed from: e, reason: collision with root package name */
    public final C3315ho f35027e;

    public C4162xa(C4216ya c4216ya, AbstractC4811a abstractC4811a, C3315ho c3315ho) {
        this.f35026d = abstractC4811a;
        this.f35025c = c4216ya;
        this.f35027e = c3315ho;
    }

    @Override // p.AbstractC4811a
    public final void a(String str, Bundle bundle) {
        AbstractC4811a abstractC4811a = this.f35026d;
        if (abstractC4811a != null) {
            abstractC4811a.a(str, bundle);
        }
    }

    @Override // p.AbstractC4811a
    public final Bundle b(String str, Bundle bundle) {
        AbstractC4811a abstractC4811a = this.f35026d;
        if (abstractC4811a != null) {
            return abstractC4811a.b(str, bundle);
        }
        return null;
    }

    @Override // p.AbstractC4811a
    public final void c(int i, int i6, Bundle bundle) {
        AbstractC4811a abstractC4811a = this.f35026d;
        if (abstractC4811a != null) {
            abstractC4811a.c(i, i6, bundle);
        }
    }

    @Override // p.AbstractC4811a
    public final void d(Bundle bundle) {
        this.f35023a.set(false);
        AbstractC4811a abstractC4811a = this.f35026d;
        if (abstractC4811a != null) {
            abstractC4811a.d(bundle);
        }
    }

    @Override // p.AbstractC4811a
    public final void e(int i, Bundle bundle) {
        this.f35023a.set(false);
        AbstractC4811a abstractC4811a = this.f35026d;
        if (abstractC4811a != null) {
            abstractC4811a.e(i, bundle);
        }
        C4835j c4835j = C4835j.f39730C;
        c4835j.f39742k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C4216ya c4216ya = this.f35025c;
        c4216ya.f35170j = currentTimeMillis;
        List list = this.f35024b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        c4835j.f39742k.getClass();
        c4216ya.i = SystemClock.elapsedRealtime() + ((Integer) q2.r.f40204e.f40207c.a(AbstractC3569ma.lb)).intValue();
        if (c4216ya.f35166e == null) {
            c4216ya.f35166e = new RunnableC3111e(14, c4216ya);
        }
        c4216ya.d();
        com.bumptech.glide.d.p(this.f35027e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // p.AbstractC4811a
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f35023a.set(true);
                com.bumptech.glide.d.p(this.f35027e, "pact_action", new Pair("pe", "pact_con"));
                this.f35025c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e9) {
            u2.z.l("Message is not in JSON format: ", e9);
        }
        AbstractC4811a abstractC4811a = this.f35026d;
        if (abstractC4811a != null) {
            abstractC4811a.f(str, bundle);
        }
    }

    @Override // p.AbstractC4811a
    public final void g(int i, Uri uri, boolean z3, Bundle bundle) {
        AbstractC4811a abstractC4811a = this.f35026d;
        if (abstractC4811a != null) {
            abstractC4811a.g(i, uri, z3, bundle);
        }
    }
}
