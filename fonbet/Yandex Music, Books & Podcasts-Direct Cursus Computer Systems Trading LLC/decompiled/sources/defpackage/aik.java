package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class aik {
    public final jyr a;
    public final jyr b;

    public aik(bik bikVar, jyr jyrVar) {
        this.a = jyrVar;
        this.b = btf.b(new d1j(10, bikVar));
    }

    public final void a() {
        nmb nmbVar = (nmb) this.a.getValue();
        rjb rjbVar = (rjb) this.b.getValue();
        nmbVar.getClass();
        rjbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dfi.p(1, "button_type", rjbVar.a, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Button.Tapped", linkedHashMap);
    }

    public final void b() {
        nmb nmbVar = (nmb) this.a.getValue();
        rjb rjbVar = (rjb) this.b.getValue();
        nmbVar.getClass();
        rjbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dfi.p(1, "button_type", rjbVar.a, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Button.Loaded", linkedHashMap);
    }

    public final void c() {
        nmb nmbVar = (nmb) this.a.getValue();
        rjb rjbVar = (rjb) this.b.getValue();
        nmbVar.getClass();
        rjbVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        dfi.p(1, "button_type", rjbVar.a, "_meta", linkedHashMap);
        nmbVar.C("PayWallScreen.Button.Showed", linkedHashMap);
    }
}
