package ru.yandex.taxi.requirements.glued.interactor;

import defpackage.f6v;
import defpackage.fnx0;
import defpackage.mi31;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.vfx0;
import defpackage.vpr;
import defpackage.yfx0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1 gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1) {
            gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1 = (GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1) continuation;
            int i2 = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    fnx0 fnx0Var = (fnx0) obj;
                    c cVar = this.b;
                    yfx0 yfx0Var = cVar.d;
                    pex0 pex0Var = fnx0Var.c;
                    yfx0Var.getClass();
                    ArrayList a = yfx0.a(pex0Var);
                    vfx0 vfx0Var = cVar.e;
                    mi31 mi31Var = fnx0Var.a;
                    vfx0Var.getClass();
                    f6v b = ru.yandex.taxi.requirements.utils.c.b(a, vfx0.a(mi31Var));
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.L$0 = null;
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.L$1 = null;
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.L$2 = null;
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.L$3 = null;
                    gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b, gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1 = new GluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gluedRequirementsInteractor$gluedSupportedRequirementsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
