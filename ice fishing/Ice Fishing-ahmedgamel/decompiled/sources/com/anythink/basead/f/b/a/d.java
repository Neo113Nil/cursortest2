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
    protected int f9661A;

    /* renamed from: B, reason: collision with root package name */
    protected int f9662B;

    /* renamed from: C, reason: collision with root package name */
    JSONArray f9663C;

    /* renamed from: D, reason: collision with root package name */
    protected long f9664D;

    /* renamed from: a, reason: collision with root package name */
    private final String f9665a = "d";

    /* renamed from: r, reason: collision with root package name */
    protected Context f9666r;

    /* renamed from: s, reason: collision with root package name */
    bj f9667s;

    /* renamed from: t, reason: collision with root package name */
    x f9668t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f9669u;

    /* renamed from: v, reason: collision with root package name */
    protected com.anythink.basead.g.a f9670v;

    /* renamed from: w, reason: collision with root package name */
    protected a.InterfaceC0050a f9671w;

    /* renamed from: x, reason: collision with root package name */
    boolean f9672x;

    /* renamed from: y, reason: collision with root package name */
    String f9673y;

    /* renamed from: z, reason: collision with root package name */
    protected int f9674z;

    public d(Context context, bj bjVar, x xVar, boolean z6) {
        this.f9674z = 1;
        this.f9666r = context.getApplicationContext();
        this.f9667s = bjVar;
        this.f9668t = xVar;
        this.f9669u = z6;
        this.f9674z = com.anythink.basead.b.e.a(bjVar, xVar) ? 1 : 2;
    }

    @Override // com.anythink.basead.f.a
    public final int A() {
        bj bjVar;
        if (this.f9669u || (bjVar = this.f9667s) == null) {
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
        bj bjVar = this.f9667s;
        if (bjVar != null) {
            return bjVar.V();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int E() {
        bj bjVar = this.f9667s;
        if (bjVar != null) {
            return bjVar.W();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final long F() {
        bj bjVar = this.f9667s;
        if (bjVar != null) {
            return bjVar.X();
        }
        return 0L;
    }

    public abstract View H();

    public final j M() {
        j jVar = new j(this.f9668t, "");
        View H8 = H();
        if (H8 != null) {
            jVar.f6998g = H8.getWidth();
            jVar.f6999h = H8.getHeight();
            try {
                int[] iArr = new int[2];
                H8.getLocationOnScreen(iArr);
                jVar.f7004n = iArr[0];
                jVar.f7005o = iArr[1];
            } catch (Throwable unused) {
            }
            jVar.f7006p = f.b.a(H8);
            long j6 = this.f9664D;
            if (j6 > 0) {
                jVar.f7007q = j6;
            }
        }
        return jVar;
    }

    @Override // com.anythink.basead.f.a
    public void a(int i, int i4) {
        this.f9661A = i;
        this.f9662B = i4;
    }

    @Override // com.anythink.basead.f.a
    public void b(boolean z6) {
    }

    @Override // com.anythink.basead.f.a
    public final String c() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.x() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String d() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.y() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String e() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.D() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String f() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.z() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String g() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.B() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String h() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.C() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String i() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.aL() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String j() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.M() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String k() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.P() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String l() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.O() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String m() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.N() : "";
    }

    @Override // com.anythink.basead.f.a
    public final String n() {
        bj bjVar = this.f9667s;
        return bjVar != null ? bjVar.h() : "";
    }

    @Override // com.anythink.basead.f.a
    public final boolean o() {
        bj bjVar = this.f9667s;
        if (bjVar != null) {
            return (TextUtils.isEmpty(bjVar.M()) && TextUtils.isEmpty(this.f9667s.aL()) && TextUtils.isEmpty(this.f9667s.P()) && TextUtils.isEmpty(this.f9667s.O()) && TextUtils.isEmpty(this.f9667s.h()) && TextUtils.isEmpty(this.f9667s.N())) ? false : true;
        }
        return false;
    }

    @Override // com.anythink.basead.f.a
    public boolean p() {
        return this.f9669u;
    }

    @Override // com.anythink.basead.f.a
    public void q() {
    }

    @Override // com.anythink.basead.f.a
    public void r() {
        q();
        this.f9670v = null;
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
        return this.f9674z;
    }

    @Override // com.anythink.basead.f.a
    public final int x() {
        bj bjVar = this.f9667s;
        if (bjVar != null) {
            return bjVar.ab();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int y() {
        bj bjVar = this.f9667s;
        if (bjVar != null) {
            return bjVar.ac();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final int z() {
        bj bjVar = this.f9667s;
        if (bjVar != null) {
            return bjVar.K();
        }
        return 0;
    }

    @Override // com.anythink.basead.f.a
    public final void a(JSONArray jSONArray) {
        this.f9663C = jSONArray;
    }

    @Override // com.anythink.basead.f.a
    public final w a() {
        return this.f9667s;
    }

    @Override // com.anythink.basead.f.a
    public void a(com.anythink.basead.g.a aVar) {
        this.f9670v = aVar;
    }

    @Override // com.anythink.basead.f.a
    public void a(boolean z6) {
        this.f9672x = z6;
    }

    @Override // com.anythink.basead.f.a
    public void a(String str) {
        this.f9673y = str;
    }

    @Override // com.anythink.basead.f.a
    public final boolean a(boolean z6, boolean z9) {
        if (this.f9667s.t() != 67) {
            return false;
        }
        return this.f9667s.a(z6, z9);
    }

    @Override // com.anythink.basead.f.a
    public final void a(a.InterfaceC0050a interfaceC0050a) {
        this.f9671w = interfaceC0050a;
    }
}
