package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class nxt implements oxt {
    public final oxt a;
    public final m86 b;

    public nxt(oxt oxtVar, m86 m86Var) {
        this.a = oxtVar;
        this.b = m86Var;
    }

    @Override // defpackage.xxt
    public final Object get(String str) {
        Object o0 = bg3.o0(this.b.a.get(str));
        return o0 == null ? this.a.get(str) : o0;
    }

    @Override // defpackage.oxt
    public final ja8 j(List list, nat natVar) {
        return ja8.b0;
    }

    @Override // defpackage.oxt
    public final ja8 k(String str, dfb dfbVar, boolean z, Function1 function1) {
        return this.a.k(str, dfbVar, z, function1);
    }

    @Override // defpackage.oxt
    public final void l(kxt kxtVar) {
        this.a.l(kxtVar);
    }

    @Override // defpackage.oxt
    public final ja8 m(ArrayList arrayList, gcp gcpVar) {
        return this.a.m(arrayList, gcpVar);
    }

    @Override // defpackage.oxt
    public final void u(xzb xzbVar, Function1 function1) {
        this.a.u(xzbVar, function1);
    }

    @Override // defpackage.oxt
    public final kxt x(String str) {
        return this.a.x(str);
    }

    @Override // defpackage.oxt
    public final void s() {
    }

    @Override // defpackage.oxt
    public final void w() {
    }
}
