package defpackage;

import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class qjb implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ qjb(k kVar, int i) {
        this.a = i;
        this.b = kVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        r1a0 r1a0Var;
        Object value;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        k kVar = this.b;
        switch (i) {
            case 0:
                kVar.m.b();
                break;
            case 1:
                g4a0 g4a0Var = (g4a0) obj;
                fnb fnbVar = kVar.b;
                if (jl40.l(fnbVar.i.getValue(), klb.a)) {
                    Object value2 = fnbVar.b.getValue();
                    wmb wmbVar = value2 instanceof wmb ? (wmb) value2 : null;
                    r1a0Var = wmbVar != null ? wmbVar.c : null;
                    if (r1a0Var != null) {
                        kVar.l(new rlc(r1a0Var.b, g4a0Var));
                        break;
                    }
                }
                break;
            default:
                yka0 yka0Var = (yka0) obj;
                fnb fnbVar2 = kVar.a;
                Object value3 = kVar.b.b.getValue();
                wmb wmbVar2 = value3 instanceof wmb ? (wmb) value3 : null;
                r1a0Var = wmbVar2 != null ? wmbVar2.c : null;
                if (r1a0Var != null) {
                    if (jl40.l(yka0Var, uka0.a)) {
                        fnbVar2.e(enb.e(r1a0Var));
                    }
                    boolean z = yka0Var instanceof wka0;
                    r0 r0Var = fnbVar2.j;
                    do {
                        value = r0Var.getValue();
                        ((Boolean) value).getClass();
                    } while (!r0Var.k(value, Boolean.valueOf(z)));
                }
                break;
        }
        return zy11Var;
    }
}
