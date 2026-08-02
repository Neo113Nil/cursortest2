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
import p.AbstractC4815a;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4185xa extends AbstractC4815a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f35802a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final List f35803b = Arrays.asList(((String) s2.r.f40506e.f40509c.a(AbstractC3592ma.ob)).split(","));

    /* renamed from: c, reason: collision with root package name */
    public final C4239ya f35804c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4815a f35805d;

    /* renamed from: e, reason: collision with root package name */
    public final C3391io f35806e;

    public C4185xa(C4239ya c4239ya, AbstractC4815a abstractC4815a, C3391io c3391io) {
        this.f35805d = abstractC4815a;
        this.f35804c = c4239ya;
        this.f35806e = c3391io;
    }

    @Override // p.AbstractC4815a
    public final void a(String str, Bundle bundle) {
        AbstractC4815a abstractC4815a = this.f35805d;
        if (abstractC4815a != null) {
            abstractC4815a.a(str, bundle);
        }
    }

    @Override // p.AbstractC4815a
    public final Bundle b(String str, Bundle bundle) {
        AbstractC4815a abstractC4815a = this.f35805d;
        if (abstractC4815a != null) {
            return abstractC4815a.b(str, bundle);
        }
        return null;
    }

    @Override // p.AbstractC4815a
    public final void c(int i, int i4, Bundle bundle) {
        AbstractC4815a abstractC4815a = this.f35805d;
        if (abstractC4815a != null) {
            abstractC4815a.c(i, i4, bundle);
        }
    }

    @Override // p.AbstractC4815a
    public final void d(Bundle bundle) {
        this.f35802a.set(false);
        AbstractC4815a abstractC4815a = this.f35805d;
        if (abstractC4815a != null) {
            abstractC4815a.d(bundle);
        }
    }

    @Override // p.AbstractC4815a
    public final void e(int i, Bundle bundle) {
        this.f35802a.set(false);
        AbstractC4815a abstractC4815a = this.f35805d;
        if (abstractC4815a != null) {
            abstractC4815a.e(i, bundle);
        }
        C4906k c4906k = C4906k.f40186C;
        c4906k.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C4239ya c4239ya = this.f35804c;
        c4239ya.f35960j = currentTimeMillis;
        List list = this.f35803b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        c4906k.f40198k.getClass();
        c4239ya.i = SystemClock.elapsedRealtime() + ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.lb)).intValue();
        if (c4239ya.f35956e == null) {
            c4239ya.f35956e = new RunnableC3134e(14, c4239ya);
        }
        c4239ya.d();
        t8.g.z(this.f35806e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // p.AbstractC4815a
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f35802a.set(true);
                t8.g.z(this.f35806e, "pact_action", new Pair("pe", "pact_con"));
                this.f35804c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e9) {
            w2.z.l("Message is not in JSON format: ", e9);
        }
        AbstractC4815a abstractC4815a = this.f35805d;
        if (abstractC4815a != null) {
            abstractC4815a.f(str, bundle);
        }
    }

    @Override // p.AbstractC4815a
    public final void g(int i, Uri uri, boolean z6, Bundle bundle) {
        AbstractC4815a abstractC4815a = this.f35805d;
        if (abstractC4815a != null) {
            abstractC4815a.g(i, uri, z6, bundle);
        }
    }
}
