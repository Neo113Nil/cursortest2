package com.anythink.expressad.foundation.e;

import android.text.TextUtils;
import com.anythink.expressad.foundation.d.d;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import u.AbstractC5049e;
import u1.h;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19004a = "FailureReason";

    /* renamed from: b, reason: collision with root package name */
    private int f19005b;

    /* renamed from: c, reason: collision with root package name */
    private int f19006c;

    /* renamed from: d, reason: collision with root package name */
    private String f19007d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f19008e;

    /* renamed from: f, reason: collision with root package name */
    private d f19009f;

    /* renamed from: g, reason: collision with root package name */
    private String f19010g;

    /* renamed from: h, reason: collision with root package name */
    private String f19011h;
    private boolean i;

    /* renamed from: j, reason: collision with root package name */
    private int f19012j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f19013k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f19014l;

    /* renamed from: m, reason: collision with root package name */
    private int f19015m;

    /* renamed from: n, reason: collision with root package name */
    private String f19016n;

    /* renamed from: o, reason: collision with root package name */
    private String f19017o;

    /* renamed from: p, reason: collision with root package name */
    private String f19018p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19019q;

    /* renamed from: r, reason: collision with root package name */
    private String f19020r;

    /* renamed from: s, reason: collision with root package name */
    private String f19021s;

    public c(int i) {
        this.f19005b = i;
        this.f19006c = b.b(i);
    }

    private void a(int i) {
        this.f19005b = i;
    }

    private String d(String str) {
        String e9 = h.e(this.f19005b, " # ", new StringBuilder());
        int i = this.f19005b;
        if (i != -1) {
            e9 = b.a(i);
        }
        if (!TextUtils.isEmpty(this.f19007d)) {
            StringBuilder c9 = AbstractC5049e.c(e9, " # ");
            c9.append(this.f19007d);
            e9 = c9.toString();
        }
        Throwable th = this.f19008e;
        if (th != null) {
            String message = th.getMessage();
            if (!TextUtils.isEmpty(message)) {
                e9 = AbstractC4404f.g(e9, " # ", message);
            }
        }
        return !TextUtils.isEmpty(str) ? AbstractC4404f.g(e9, " # ", str) : e9;
    }

    private void e(String str) {
        this.f19010g = str;
    }

    private void f(String str) {
        this.f19011h = str;
    }

    private int g() {
        return this.f19005b;
    }

    private Throwable h() {
        return this.f19008e;
    }

    private String i() {
        return TextUtils.isEmpty(this.f19010g) ? "" : this.f19010g;
    }

    private String j() {
        return this.f19011h;
    }

    private String k() {
        if (this.f19014l == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<Object, Object> entry : this.f19014l.entrySet()) {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
        return "";
    }

    private int l() {
        return this.f19015m;
    }

    private String m() {
        return this.f19016n;
    }

    private String n() {
        return this.f19017o;
    }

    private String o() {
        return this.f19018p;
    }

    private boolean p() {
        return this.f19019q;
    }

    private String q() {
        return this.f19020r;
    }

    private String r() {
        return this.f19021s;
    }

    public final d b() {
        return this.f19009f;
    }

    public final boolean c() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MBFailureReason{errorCode=");
        sb.append(this.f19005b);
        sb.append(", errorSubType=");
        sb.append(this.f19006c);
        sb.append(", message='");
        sb.append(this.f19007d);
        sb.append("', cause=");
        sb.append(this.f19008e);
        sb.append(", campaign=");
        sb.append(this.f19009f);
        sb.append(", requestId='");
        sb.append(this.f19010g);
        sb.append("', localRequestId='");
        sb.append(this.f19011h);
        sb.append("', isHeaderBidding=");
        sb.append(this.i);
        sb.append(", typeD=");
        sb.append(this.f19012j);
        sb.append(", reasonD='");
        sb.append(this.f19013k);
        sb.append("', extraMap=");
        sb.append(this.f19014l);
        sb.append(", serverErrorCode=");
        sb.append(this.f19015m);
        sb.append(", errorUrl='");
        sb.append(this.f19016n);
        sb.append("', serverErrorResponse='");
        sb.append(this.f19017o);
        sb.append("', unitId='");
        sb.append(this.f19020r);
        sb.append("', placementId='");
        return h.g(sb, this.f19021s, "'}");
    }

    private void b(int i) {
        this.f19006c = i;
    }

    private void c(int i) {
        this.f19012j = i;
    }

    private void g(String str) {
        this.f19013k = str;
    }

    private void h(String str) {
        this.f19016n = str;
    }

    private void j(String str) {
        this.f19018p = str;
    }

    public final String a() {
        int i;
        String str = !TextUtils.isEmpty(this.f19007d) ? this.f19007d : "";
        if (TextUtils.isEmpty(str) && (i = this.f19005b) != -1) {
            str = b.a(i);
        }
        Throwable th = this.f19008e;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        return !TextUtils.isEmpty(message) ? AbstractC4404f.g(str, " # ", message) : str;
    }

    public final int e() {
        return this.f19012j;
    }

    public final String f() {
        return this.f19013k;
    }

    private void b(boolean z3) {
        this.f19019q = z3;
    }

    public final void c(String str) {
        this.f19021s = str;
    }

    private void i(String str) {
        this.f19017o = str;
    }

    public final void b(String str) {
        this.f19020r = str;
    }

    public c(int i, String str) {
        this.f19005b = i;
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.f19419M, str);
        }
        this.f19007d = str;
        this.f19006c = b.b(i);
    }

    public c(int i, int i6, String str) {
        if (!TextUtils.isEmpty(str)) {
            a(com.anythink.expressad.foundation.g.g.a.b.f19419M, str);
            this.f19007d = str;
        } else {
            this.f19007d = b.a(i6);
        }
        this.f19015m = i;
        this.f19006c = b.b(i6);
    }

    public final void a(String str) {
        this.f19007d = str;
    }

    private c(int i, Throwable th, d dVar) {
        this.f19005b = i;
        this.f19008e = th;
        this.f19009f = dVar;
        this.f19006c = b.b(i);
    }

    public final void a(Throwable th) {
        this.f19008e = th;
    }

    public final void a(d dVar) {
        this.f19009f = dVar;
    }

    public final void a(boolean z3) {
        this.i = z3;
    }

    private void a(Object obj, Object obj2) {
        if (this.f19014l == null) {
            this.f19014l = new HashMap<>();
        }
        this.f19014l.put(obj, obj2);
    }

    private c(int i, String str, Throwable th, d dVar) {
        this.f19005b = i;
        this.f19007d = str;
        this.f19008e = th;
        this.f19009f = dVar;
        this.f19006c = b.b(i);
    }

    private Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f19014l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f19014l.get(obj);
        }
        return null;
    }

    public final int d() {
        return this.f19006c;
    }

    private void d(int i) {
        this.f19015m = i;
    }
}
