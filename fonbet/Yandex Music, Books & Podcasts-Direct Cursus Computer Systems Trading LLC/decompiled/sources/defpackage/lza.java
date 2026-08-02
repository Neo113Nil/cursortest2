package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class lza implements w0b {
    public final /* synthetic */ mza a;
    public final /* synthetic */ ih4 b;
    public final /* synthetic */ w0b c;
    public final /* synthetic */ es6 d;

    public lza(mza mzaVar, ih4 ih4Var, w0b w0bVar, es6 es6Var) {
        this.a = mzaVar;
        this.b = ih4Var;
        this.c = w0bVar;
        this.d = es6Var;
    }

    @Override // defpackage.w0b
    public final void a() {
        mza mzaVar = this.a;
        xdr xdrVar = mzaVar.g;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        nmb nmbVar = mzaVar.d.a;
        ih4 ih4Var = this.b;
        String str = ih4Var.a;
        wjb H = ywf.H(ih4Var);
        pkb I = ywf.I(ih4Var);
        hlb hlbVar = hlb.Fullscreen;
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hash", str);
        linkedHashMap.put("page_id", H.a);
        linkedHashMap.put("page_style", "bottomsheet");
        linkedHashMap.put("skeleton_id", "");
        linkedHashMap.put("main_object_type", I.a);
        linkedHashMap.put("main_object_id", "");
        eta.m(0, "tab_id", "", "tab_pos", linkedHashMap);
        linkedHashMap.put("is_tab_selected_by_default", String.valueOf(false));
        linkedHashMap.put("_meta", nmb.u(2));
        nmbVar.C("Screen.Closed", linkedHashMap);
        x97.y(cmd.a, null, null, new jza(ih4Var, mzaVar, null, 1), 3);
        w0b w0bVar = this.c;
        if (w0bVar != null) {
            w0bVar.a();
        }
    }

    @Override // defpackage.w0b
    public final void b() {
        mza mzaVar = this.a;
        tya tyaVar = mzaVar.d;
        hlb hlbVar = hlb.Bottomsheet;
        ih4 ih4Var = this.b;
        tyaVar.a(new pya(7, hlbVar, ywf.I(ih4Var)), ywf.H(ih4Var), ih4Var.a);
        nnk nnkVar = mzaVar.h;
        if (nnkVar != null) {
            nnkVar.A();
        }
        w0b w0bVar = this.c;
        if (w0bVar != null) {
            w0bVar.b();
        }
        xdr xdrVar = mzaVar.g;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }

    @Override // defpackage.w0b
    public final void c() {
        mza mzaVar = this.a;
        tya tyaVar = mzaVar.d;
        hlb hlbVar = hlb.Bottomsheet;
        ih4 ih4Var = this.b;
        tyaVar.a(new oya(7, hlbVar, ywf.I(ih4Var)), ywf.H(ih4Var), ih4Var.a);
        nnk nnkVar = mzaVar.h;
        if (nnkVar != null) {
            nnkVar.A();
        }
        xdr xdrVar = mzaVar.g;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        x97.y(cmd.a, null, null, new iza(mzaVar, null, 2), 3);
        w0b w0bVar = this.c;
        if (w0bVar != null) {
            w0bVar.c();
        }
    }

    @Override // defpackage.w0b
    public final void d() {
        mza mzaVar = this.a;
        tya tyaVar = mzaVar.d;
        hlb hlbVar = hlb.Bottomsheet;
        ih4 ih4Var = this.b;
        tyaVar.a(new rya(7, hlbVar, ywf.I(ih4Var)), ywf.H(ih4Var), ih4Var.a);
        nnk nnkVar = mzaVar.h;
        if (nnkVar != null) {
            nnkVar.A();
        }
        xdr xdrVar = mzaVar.g;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
        w0b w0bVar = this.c;
        if (w0bVar != null) {
            w0bVar.d();
        }
    }

    @Override // defpackage.w0b
    public final void e() {
        mza mzaVar = this.a;
        tya tyaVar = mzaVar.d;
        hlb hlbVar = hlb.Bottomsheet;
        ih4 ih4Var = this.b;
        tyaVar.a(new qya(7, hlbVar, ywf.I(ih4Var)), ywf.H(ih4Var), ih4Var.a);
        this.d.U(new i0b());
        nnk nnkVar = mzaVar.h;
        if (nnkVar != null) {
            nnkVar.A();
        }
        w0b w0bVar = this.c;
        if (w0bVar != null) {
            w0bVar.e();
        }
        xdr xdrVar = mzaVar.g;
        Boolean bool = Boolean.FALSE;
        xdrVar.getClass();
        xdrVar.m(null, bool);
    }
}
