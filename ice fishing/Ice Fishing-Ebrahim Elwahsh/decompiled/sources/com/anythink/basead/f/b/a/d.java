package com.anythink.basead.f.b.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.anythink.basead.d.j;
import com.anythink.basead.ui.a;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.a.f;
import org.json.JSONArray;

/* loaded from: classes.dex */
public abstract class d implements com.anythink.basead.f.a {

    /* renamed from: A, reason: collision with root package name */
    protected int f9032A;

    /* renamed from: B, reason: collision with root package name */
    protected int f9033B;

    /* renamed from: C, reason: collision with root package name */
    JSONArray f9034C;

    /* renamed from: D, reason: collision with root package name */
    protected long f9035D;

    /* renamed from: a, reason: collision with root package name */
    private final String f9036a = "d";

    /* renamed from: r, reason: collision with root package name */
    protected Context f9037r;

    /* renamed from: s, reason: collision with root package name */
    bj f9038s;

    /* renamed from: t, reason: collision with root package name */
    x f9039t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f9040u;

    /* renamed from: v, reason: collision with root package name */
    protected com.anythink.basead.g.a f9041v;

    /* renamed from: w, reason: collision with root package name */
    protected a.InterfaceC0049a f9042w;

    /* renamed from: x, reason: collision with root package name */
    boolean f9043x;

    /* renamed from: y, reason: collision with root package name */
    String f9044y;

    /* renamed from: z, reason: collision with root package name */
    protected int f9045z;

    public d(Context context, bj bjVar, x xVar, boolean z8) {
        this.f9045z = 1;
        this.f9037r = context.getApplicationContext();
        this.f9038s = bjVar;
        this.f9039t = xVar;
        this.f9040u = z8;
        this.f9045z = com.anythink.basead.b.e.a(bjVar, xVar) ? 1 : 2;
    }

    @Override // com.anythink.basead.f.a
    public final int A() {
        bj bjVar;
        if (this.f9040u || (bjVar = this.f9038s) == null) {
            return 0;
        }
        return bjVar.aa();
    }

    @Override // com.anythink.basead.f.a
    public View B() {
        return null;
    }

    @Override // com.anythink.basead.f.a
    public long C() {
        return 0L;
    }

    @Override // com.anythink.basead.f.a
    public final int D() {
        bj bjVar = this.f9038s;
        if (bjVar != null) {
            return bjVar.V();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int E() {
        bj bjVar = this.f9038s;
        if (bjVar != null) {
            return bjVar.W();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final long F() {
        bj bjVar = this.f9038s;
        if (bjVar != null) {
            return bjVar.X();
        }
        return 0L;
    }

    public abstract View H();

    public final j M() {
        j jVar = new j(this.f9039t, "");
        View H6 = H();
        if (H6 != null) {
            jVar.f6369g = H6.getWidth();
            jVar.f6370h = H6.getHeight();
            try {
                int[] iArr = new int[2];
                H6.getLocationOnScreen(iArr);
                jVar.f6375n = iArr[0];
                jVar.f6376o = iArr[1];
            } catch (Throwable unused) {
            }
            jVar.f6377p = f.b.a(H6);
            long j9 = this.f9035D;
            if (j9 > 0) {
                jVar.f6378q = j9;
            }
        }
        return jVar;
    }

    @Override // com.anythink.basead.f.a
    public void a(int i, int i4) {
        this.f9032A = i;
        this.f9033B = i4;
    }

    @Override // com.anythink.basead.f.a
    public void b(boolean z8) {
    }

    @Override // com.anythink.basead.f.a
    public final String c() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.x() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String d() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.y() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String e() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.D() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String f() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.z() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String g() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.B() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String h() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.C() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String i() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.aL() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String j() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.M() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String k() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.P() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String l() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.O() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String m() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.N() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String n() {
        bj bjVar = this.f9038s;
        return bjVar != null ? bjVar.h() : "";
    }

    @Override // com.anythink.basead.f.a
    public final boolean o() {
        bj bjVar = this.f9038s;
        if (bjVar != null) {
            return (TextUtils.isEmpty(bjVar.M()) && TextUtils.isEmpty(this.f9038s.aL()) && TextUtils.isEmpty(this.f9038s.P()) && TextUtils.isEmpty(this.f9038s.O()) && TextUtils.isEmpty(this.f9038s.h()) && TextUtils.isEmpty(this.f9038s.N())) ? false : true;
        }
        return false;
    }

    @Override // com.anythink.basead.f.a
    public boolean p() {
        return this.f9040u;
    }

    @Override // com.anythink.basead.f.a
    public void q() {
    }

    @Override // com.anythink.basead.f.a
    public void r() {
        q();
        this.f9041v = null;
    }

    @Override // com.anythink.basead.f.a
    public void s() {
        u();
    }

    @Override // com.anythink.basead.f.a
    public void t() {
        v();
    }

    @Override // com.anythink.basead.f.a
    public void u() {
    }

    @Override // com.anythink.basead.f.a
    public void v() {
    }

    @Override // com.anythink.basead.f.a
    public final int w() {
        return this.f9045z;
    }

    @Override // com.anythink.basead.f.a
    public final int x() {
        bj bjVar = this.f9038s;
        if (bjVar != null) {
            return bjVar.ab();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int y() {
        bj bjVar = this.f9038s;
        if (bjVar != null) {
            return bjVar.ac();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int z() {
        bj bjVar = this.f9038s;
        if (bjVar != null) {
            return bjVar.K();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final void a(JSONArray jSONArray) {
        this.f9034C = jSONArray;
    }

    @Override // com.anythink.basead.f.a
    public final w a() {
        return this.f9038s;
    }

    @Override // com.anythink.basead.f.a
    public void a(com.anythink.basead.g.a aVar) {
        this.f9041v = aVar;
    }

    @Override // com.anythink.basead.f.a
    public void a(boolean z8) {
        this.f9043x = z8;
    }

    @Override // com.anythink.basead.f.a
    public void a(String str) {
        this.f9044y = str;
    }

    @Override // com.anythink.basead.f.a
    public final boolean a(boolean z8, boolean z9) {
        if (this.f9038s.t() != 67) {
            return false;
        }
        return this.f9038s.a(z8, z9);
    }

    @Override // com.anythink.basead.f.a
    public final void a(a.InterfaceC0049a interfaceC0049a) {
        this.f9042w = interfaceC0049a;
    }
}
