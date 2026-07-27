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
    protected int f8875A;

    /* renamed from: B, reason: collision with root package name */
    protected int f8876B;

    /* renamed from: C, reason: collision with root package name */
    JSONArray f8877C;

    /* renamed from: D, reason: collision with root package name */
    protected long f8878D;

    /* renamed from: a, reason: collision with root package name */
    private final String f8879a = "d";

    /* renamed from: r, reason: collision with root package name */
    protected Context f8880r;

    /* renamed from: s, reason: collision with root package name */
    bj f8881s;

    /* renamed from: t, reason: collision with root package name */
    x f8882t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f8883u;

    /* renamed from: v, reason: collision with root package name */
    protected com.anythink.basead.g.a f8884v;

    /* renamed from: w, reason: collision with root package name */
    protected a.InterfaceC0050a f8885w;

    /* renamed from: x, reason: collision with root package name */
    boolean f8886x;

    /* renamed from: y, reason: collision with root package name */
    String f8887y;

    /* renamed from: z, reason: collision with root package name */
    protected int f8888z;

    public d(Context context, bj bjVar, x xVar, boolean z3) {
        this.f8888z = 1;
        this.f8880r = context.getApplicationContext();
        this.f8881s = bjVar;
        this.f8882t = xVar;
        this.f8883u = z3;
        this.f8888z = com.anythink.basead.b.e.a(bjVar, xVar) ? 1 : 2;
    }

    @Override // com.anythink.basead.f.a
    public final int A() {
        bj bjVar;
        if (this.f8883u || (bjVar = this.f8881s) == null) {
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
        bj bjVar = this.f8881s;
        if (bjVar != null) {
            return bjVar.V();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int E() {
        bj bjVar = this.f8881s;
        if (bjVar != null) {
            return bjVar.W();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final long F() {
        bj bjVar = this.f8881s;
        if (bjVar != null) {
            return bjVar.X();
        }
        return 0L;
    }

    public abstract View H();

    public final j M() {
        j jVar = new j(this.f8882t, "");
        View H8 = H();
        if (H8 != null) {
            jVar.f6212g = H8.getWidth();
            jVar.f6213h = H8.getHeight();
            try {
                int[] iArr = new int[2];
                H8.getLocationOnScreen(iArr);
                jVar.f6218n = iArr[0];
                jVar.f6219o = iArr[1];
            } catch (Throwable unused) {
            }
            jVar.f6220p = f.b.a(H8);
            long j6 = this.f8878D;
            if (j6 > 0) {
                jVar.f6221q = j6;
            }
        }
        return jVar;
    }

    @Override // com.anythink.basead.f.a
    public void a(int i, int i6) {
        this.f8875A = i;
        this.f8876B = i6;
    }

    @Override // com.anythink.basead.f.a
    public void b(boolean z3) {
    }

    @Override // com.anythink.basead.f.a
    public final String c() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.x() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String d() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.y() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String e() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.D() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String f() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.z() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String g() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.B() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String h() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.C() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String i() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.aL() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String j() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.M() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String k() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.P() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String l() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.O() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String m() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.N() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String n() {
        bj bjVar = this.f8881s;
        return bjVar != null ? bjVar.h() : "";
    }

    @Override // com.anythink.basead.f.a
    public final boolean o() {
        bj bjVar = this.f8881s;
        if (bjVar != null) {
            return (TextUtils.isEmpty(bjVar.M()) && TextUtils.isEmpty(this.f8881s.aL()) && TextUtils.isEmpty(this.f8881s.P()) && TextUtils.isEmpty(this.f8881s.O()) && TextUtils.isEmpty(this.f8881s.h()) && TextUtils.isEmpty(this.f8881s.N())) ? false : true;
        }
        return false;
    }

    @Override // com.anythink.basead.f.a
    public boolean p() {
        return this.f8883u;
    }

    @Override // com.anythink.basead.f.a
    public void q() {
    }

    @Override // com.anythink.basead.f.a
    public void r() {
        q();
        this.f8884v = null;
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
        return this.f8888z;
    }

    @Override // com.anythink.basead.f.a
    public final int x() {
        bj bjVar = this.f8881s;
        if (bjVar != null) {
            return bjVar.ab();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int y() {
        bj bjVar = this.f8881s;
        if (bjVar != null) {
            return bjVar.ac();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int z() {
        bj bjVar = this.f8881s;
        if (bjVar != null) {
            return bjVar.K();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final void a(JSONArray jSONArray) {
        this.f8877C = jSONArray;
    }

    @Override // com.anythink.basead.f.a
    public final w a() {
        return this.f8881s;
    }

    @Override // com.anythink.basead.f.a
    public void a(com.anythink.basead.g.a aVar) {
        this.f8884v = aVar;
    }

    @Override // com.anythink.basead.f.a
    public void a(boolean z3) {
        this.f8886x = z3;
    }

    @Override // com.anythink.basead.f.a
    public void a(String str) {
        this.f8887y = str;
    }

    @Override // com.anythink.basead.f.a
    public final boolean a(boolean z3, boolean z6) {
        if (this.f8881s.t() != 67) {
            return false;
        }
        return this.f8881s.a(z3, z6);
    }

    @Override // com.anythink.basead.f.a
    public final void a(a.InterfaceC0050a interfaceC0050a) {
        this.f8885w = interfaceC0050a;
    }
}
