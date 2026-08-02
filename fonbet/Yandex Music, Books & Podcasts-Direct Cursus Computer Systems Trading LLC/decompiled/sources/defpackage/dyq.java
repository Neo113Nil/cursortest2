package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class dyq {
    public final Context a;
    public final u12 b;
    public final boolean c;
    public final tf6 d;
    public final jyr e;
    public final jyr f;
    public final xdr g;
    public final xdr h;
    public final xdr i;
    public final jyr j;
    public final xdr k;
    public final jyr l;

    public dyq(Context context, u12 u12Var, jyr jyrVar, jyr jyrVar2, boolean z) {
        context.getClass();
        this.a = context;
        this.b = u12Var;
        this.c = z;
        this.d = gld.e(dm6.b);
        this.e = jyrVar;
        this.f = jyrVar2;
        Boolean bool = Boolean.FALSE;
        xdr a = ydr.a(bool);
        this.g = a;
        this.h = a;
        this.i = ydr.a(null);
        final int i = 0;
        this.j = btf.b(new Function0(this) { // from class: ayq
            public final /* synthetic */ dyq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                pjc pjcVar;
                int i2 = i;
                dyq dyqVar = this.b;
                int i3 = 1;
                switch (i2) {
                    case 0:
                        z22 z22Var = (z22) ((c72) dyqVar.f.getValue());
                        return zsd.u0(new cz(z22Var.l(), z22Var, 6), new bca(dyqVar.i, 18));
                    default:
                        boolean z2 = dyqVar.c;
                        Continuation continuation = null;
                        if (z2) {
                            xdr xdrVar = dyqVar.h;
                            pjc pjcVar2 = (pjc) dyqVar.j.getValue();
                            xdr xdrVar2 = dyqVar.k;
                            j22 j22Var = (j22) ((g22) dyqVar.e.getValue());
                            pjcVar = new clc(zsd.R(xdrVar, pjcVar2, xdrVar2, new cz(((wb7) j22Var.b.getValue()).getData(), j22Var, 5), new eno(new fpq(dyqVar, (Continuation) null, 4)), new cyq(null)), new byq(dyqVar, continuation, i3));
                        } else {
                            if (z2) {
                                b6e.s();
                                return null;
                            }
                            pjcVar = dyqVar.g;
                        }
                        return lg3.u0(pjcVar, dyqVar.d, Boolean.FALSE);
                }
            }
        });
        this.k = ydr.a(bool);
        final int i2 = 1;
        this.l = btf.b(new Function0(this) { // from class: ayq
            public final /* synthetic */ dyq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                pjc pjcVar;
                int i22 = i2;
                dyq dyqVar = this.b;
                int i3 = 1;
                switch (i22) {
                    case 0:
                        z22 z22Var = (z22) ((c72) dyqVar.f.getValue());
                        return zsd.u0(new cz(z22Var.l(), z22Var, 6), new bca(dyqVar.i, 18));
                    default:
                        boolean z2 = dyqVar.c;
                        Continuation continuation = null;
                        if (z2) {
                            xdr xdrVar = dyqVar.h;
                            pjc pjcVar2 = (pjc) dyqVar.j.getValue();
                            xdr xdrVar2 = dyqVar.k;
                            j22 j22Var = (j22) ((g22) dyqVar.e.getValue());
                            pjcVar = new clc(zsd.R(xdrVar, pjcVar2, xdrVar2, new cz(((wb7) j22Var.b.getValue()).getData(), j22Var, 5), new eno(new fpq(dyqVar, (Continuation) null, 4)), new cyq(null)), new byq(dyqVar, continuation, i3));
                        } else {
                            if (z2) {
                                b6e.s();
                                return null;
                            }
                            pjcVar = dyqVar.g;
                        }
                        return lg3.u0(pjcVar, dyqVar.d, Boolean.FALSE);
                }
            }
        });
    }

    public final void a(boolean z) {
        boolean z2;
        v3w.n(z, this.i, null);
        if (z) {
            Context context = this.a;
            if (jo0.D(context) || jo0.b(context)) {
                z2 = true;
                v3w.n(z2, this.g, null);
            }
        }
        z2 = false;
        v3w.n(z2, this.g, null);
    }
}
