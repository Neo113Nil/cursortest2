package ru.yandex.taxi.preorder.tollroad;

import defpackage.cwd;
import defpackage.hqz0;
import defpackage.ktj0;
import defpackage.ltj0;
import defpackage.mtj0;
import defpackage.noz0;
import defpackage.nrz0;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.quk0;
import defpackage.vpr;
import defpackage.vrz0;
import defpackage.w511;
import defpackage.xdf;
import defpackage.yal0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class k implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ o b;

    public k(vpr vprVar, o oVar) {
        this.a = vprVar;
        this.b = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TollRoadsDialogInteractor$special$$inlined$map$3$2$1 tollRoadsDialogInteractor$special$$inlined$map$3$2$1;
        int i;
        noz0 noz0Var;
        nrz0 nrz0Var;
        xdf xdfVar = this.b.f;
        if (continuation instanceof TollRoadsDialogInteractor$special$$inlined$map$3$2$1) {
            tollRoadsDialogInteractor$special$$inlined$map$3$2$1 = (TollRoadsDialogInteractor$special$$inlined$map$3$2$1) continuation;
            int i2 = tollRoadsDialogInteractor$special$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadsDialogInteractor$special$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tollRoadsDialogInteractor$special$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadsDialogInteractor$special$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ntj0 ntj0Var = ((quk0) obj).b;
                    if ((ntj0Var instanceof mtj0) || (ntj0Var instanceof ltj0)) {
                        noz0Var = noz0.e;
                    } else {
                        if (!(ntj0Var instanceof ktj0)) {
                            w511.b();
                            return null;
                        }
                        yal0 yal0Var = ((cwd) ((ktj0) ntj0Var).b).b;
                        vrz0 vrz0Var = yal0Var != null ? yal0Var.j : null;
                        noz0Var = new noz0(xdfVar.a(yal0Var != null ? yal0Var.g() : null, vrz0Var != null ? vrz0Var.d : null, false, true), vrz0Var != null ? Boolean.valueOf(vrz0Var.f) : null, xdfVar.a(yal0Var != null ? yal0Var.g() : null, vrz0Var != null ? vrz0Var.e : null, false, true), (vrz0Var == null || (nrz0Var = vrz0Var.g) == null) ? null : new hqz0(nrz0Var.a, nrz0Var.b, nrz0Var.c));
                    }
                    tollRoadsDialogInteractor$special$$inlined$map$3$2$1.L$0 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$3$2$1.L$1 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$3$2$1.L$2 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$3$2$1.L$3 = null;
                    tollRoadsDialogInteractor$special$$inlined$map$3$2$1.label = 1;
                    if (this.a.emit(noz0Var, tollRoadsDialogInteractor$special$$inlined$map$3$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        tollRoadsDialogInteractor$special$$inlined$map$3$2$1 = new TollRoadsDialogInteractor$special$$inlined$map$3$2$1(this, continuation);
        Object obj22 = tollRoadsDialogInteractor$special$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadsDialogInteractor$special$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
