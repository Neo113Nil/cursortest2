package com.anythink.expressad.foundation.e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import com.google.android.gms.internal.ads.Wv;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import u.AbstractC5050e;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19791a = "FailureReason";

    /* renamed from: b, reason: collision with root package name */
    private int f19792b;

    /* renamed from: c, reason: collision with root package name */
    private int f19793c;

    /* renamed from: d, reason: collision with root package name */
    private String f19794d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f19795e;

    /* renamed from: f, reason: collision with root package name */
    private d f19796f;

    /* renamed from: g, reason: collision with root package name */
    private String f19797g;

    /* renamed from: h, reason: collision with root package name */
    private String f19798h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private int f19799j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f19800k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f19801l;

    /* renamed from: m, reason: collision with root package name */
    private int f19802m;

    /* renamed from: n, reason: collision with root package name */
    private String f19803n;

    /* renamed from: o, reason: collision with root package name */
    private String f19804o;

    /* renamed from: p, reason: collision with root package name */
    private String f19805p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19806q;

    /* renamed from: r, reason: collision with root package name */
    private String f19807r;

    /* renamed from: s, reason: collision with root package name */
    private String f19808s;

    public c(int i) {
        this.f19792b = i;
        this.f19793c = b.b(i);
    }

    private void a(int i) {
        this.f19792b = i;
    }

    private String d(String str) {
        String e9 = AbstractC5128c.e(this.f19792b, " # ", new StringBuilder());
        int i = this.f19792b;
        if (i != -1) {
            e9 = b.a(i);
        }
        if (!TextUtils.isEmpty(this.f19794d)) {
            StringBuilder c9 = AbstractC5050e.c(e9, " # ");
            c9.append(this.f19794d);
            e9 = c9.toString();
        }
        Throwable th = this.f19795e;
        if (th != null) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                e9 = Wv.h(e9, " # ", message);
            }
        }
        return !TextUtils.isEmpty(str) ? Wv.h(e9, " # ", str) : e9;
    }

    private void e(String str) {
        this.f19797g = str;
    }

    private void f(String str) {
        this.f19798h = str;
    }

    private int g() {
        return this.f19792b;
    }

    private Throwable h() {
        return this.f19795e;
    }

    private String i() {
        return TextUtils.isEmpty(this.f19797g) ? "" : this.f19797g;
    }

    private String j() {
        return this.f19798h;
    }

    private String k() {
        if (this.f19801l == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<Object, Object> entry : this.f19801l.entrySet()) {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
        return "";
    }

    private int l() {
        return this.f19802m;
    }

    private String m() {
        return this.f19803n;
    }

    private String n() {
        return this.f19804o;
    }

    private String o() {
        return this.f19805p;
    }

    private boolean p() {
        return this.f19806q;
    }

    private String q() {
        return this.f19807r;
    }

    private String r() {
        return this.f19808s;
    }

    public final d b() {
        return this.f19796f;
    }

    public final boolean c() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MBFailureReason{errorCode=");
        sb.append(this.f19792b);
        sb.append(", errorSubType=");
        sb.append(this.f19793c);
        sb.append(", message='");
        sb.append(this.f19794d);
        sb.append("', cause=");
        sb.append(this.f19795e);
        sb.append(", campaign=");
        sb.append(this.f19796f);
        sb.append(", requestId='");
        sb.append(this.f19797g);
        sb.append("', localRequestId='");
        sb.append(this.f19798h);
        sb.append("', isHeaderBidding=");
        sb.append(this.i);
        sb.append(", typeD=");
        sb.append(this.f19799j);
        sb.append(", reasonD='");
        sb.append(this.f19800k);
        sb.append("', extraMap=");
        sb.append(this.f19801l);
        sb.append(", serverErrorCode=");
        sb.append(this.f19802m);
        sb.append(", errorUrl='");
        sb.append(this.f19803n);
        sb.append("', serverErrorResponse='");
        sb.append(this.f19804o);
        sb.append("', unitId='");
        sb.append(this.f19807r);
        sb.append("', placementId='");
        return Wv.i(sb, this.f19808s, "'}");
    }

    private void b(int i) {
        this.f19793c = i;
    }

    private void c(int i) {
        this.f19799j = i;
    }

    private void g(String str) {
        this.f19800k = str;
    }

    private void h(String str) {
        this.f19803n = str;
    }

    private void j(String str) {
        this.f19805p = str;
    }

    public final String a() {
        int i;
        String str = !TextUtils.isEmpty(this.f19794d) ? this.f19794d : "";
        if (TextUtils.isEmpty(str) && (i = this.f19792b) != -1) {
            str = b.a(i);
        }
        Throwable th = this.f19795e;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? Wv.h(str, " # ", message) : str;
    }

    public final int e() {
        return this.f19799j;
    }

    public final String f() {
        return this.f19800k;
    }

    private void b(boolean z6) {
        this.f19806q = z6;
    }

    public final void c(String str) {
        this.f19808s = str;
    }

    private void i(String str) {
        this.f19804o = str;
    }

    public final void b(String str) {
        this.f19807r = str;
    }

    public c(int i, String str) {
        this.f19792b = i;
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.f20206M, str);
        }
        this.f19794d = str;
        this.f19793c = b.b(i);
    }

    public c(int i, int i4, String str) {
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.f20206M, str);
            this.f19794d = str;
        } else {
            this.f19794d = b.a(i4);
        }
        this.f19802m = i;
        this.f19793c = b.b(i4);
    }

    public final void a(String str) {
        this.f19794d = str;
    }

    private c(int i, Throwable th, d dVar) {
        this.f19792b = i;
        this.f19795e = th;
        this.f19796f = dVar;
        this.f19793c = b.b(i);
    }

    public final void a(Throwable th) {
        this.f19795e = th;
    }

    public final void a(d dVar) {
        this.f19796f = dVar;
    }

    public final void a(boolean z6) {
        this.i = z6;
    }

    private void a(Object obj, Object obj2) {
        if (this.f19801l == null) {
            this.f19801l = new HashMap<>();
        }
        this.f19801l.put(obj, obj2);
    }

    private c(int i, String str, Throwable th, d dVar) {
        this.f19792b = i;
        this.f19794d = str;
        this.f19795e = th;
        this.f19796f = dVar;
        this.f19793c = b.b(i);
    }

    private Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f19801l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f19801l.get(obj);
        }
        return null;
    }

    public final int d() {
        return this.f19793c;
    }

    private void d(int i) {
        this.f19802m = i;
    }
}
