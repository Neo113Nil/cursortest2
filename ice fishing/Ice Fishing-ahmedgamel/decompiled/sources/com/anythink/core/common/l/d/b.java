package com.anythink.core.common.l.d;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.IATBaseAdAdapter;
import com.anythink.core.common.d.j;
import com.anythink.core.common.k;
import com.anythink.core.common.v.q;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f14365a = -1;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f14366b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f14367c;

    /* renamed from: d, reason: collision with root package name */
    private int f14368d;

    /* renamed from: e, reason: collision with root package name */
    private int f14369e;

    /* renamed from: f, reason: collision with root package name */
    private int f14370f;

    /* renamed from: g, reason: collision with root package name */
    private String f14371g;

    /* renamed from: h, reason: collision with root package name */
    private IATBaseAdAdapter f14372h;
    private int i;

    public b(Map<String, Object> map) {
        this.i = 0;
        this.f14366b = map;
        this.f14368d = ((Integer) q.a(map, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, -1)).intValue();
        this.f14369e = ((Integer) q.a(map, "ad_type", -1)).intValue();
        this.f14370f = ((Integer) q.a(map, k.aH, 0)).intValue();
        this.f14371g = (String) q.a(map, k.aI, "");
        this.i = ((Integer) q.a(map, j.w.f12608E, 0)).intValue();
    }

    public final <T> T a(String str, T t6) {
        return (T) q.a(this.f14366b, str, t6);
    }

    public final int b() {
        return this.f14369e;
    }

    public final int c() {
        return this.f14370f;
    }

    public final String d() {
        return this.f14371g;
    }

    public final int e() {
        return this.f14368d;
    }

    public final boolean f() {
        return String.valueOf(this.f14368d).equals("2");
    }

    public final boolean g() {
        return String.valueOf(this.f14368d).equals("4");
    }

    public final boolean h() {
        return String.valueOf(this.f14368d).equals("3");
    }

    public final boolean i() {
        return String.valueOf(this.f14368d).equals("1");
    }

    public final boolean j() {
        return String.valueOf(this.f14368d).equals("0");
    }

    public final boolean k() {
        int i;
        int i6 = this.f14368d;
        return (i6 == -1 || (i = this.f14369e) == -1 || i6 == i) ? false : true;
    }

    public final boolean l() {
        return k() && this.f14369e == 0;
    }

    public final boolean m() {
        return k() && this.f14369e == 4;
    }

    public final boolean n() {
        return k() && this.f14369e == 2;
    }

    public final boolean o() {
        return k() && this.f14369e == 3;
    }

    public final int p() {
        return this.i;
    }

    public final Map<String, Object> q() {
        return this.f14367c;
    }

    public final IATBaseAdAdapter r() {
        return this.f14372h;
    }

    private void b(int i) {
        this.f14370f = i;
    }

    private void c(int i) {
        this.f14368d = i;
    }

    public final Map<String, Object> a() {
        return this.f14366b;
    }

    private void a(int i) {
        this.f14369e = i;
    }

    private void a(String str) {
        this.f14371g = str;
    }

    public final void a(Map<String, Object> map) {
        this.f14367c = map;
    }

    public final void a(IATBaseAdAdapter iATBaseAdAdapter) {
        this.f14372h = iATBaseAdAdapter;
    }
}
