package ru.yandex.taxi.layers.source;

import defpackage.byx;
import defpackage.cd70;
import defpackage.cq60;
import defpackage.fkp;
import defpackage.jmp;
import defpackage.kq00;
import defpackage.lq00;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.uc4;
import defpackage.ump;
import defpackage.vpr;
import defpackage.zlp;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;

    public i(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ObjectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1 objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1;
        int i;
        kq00 kq00Var;
        if (continuation instanceof ObjectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1) {
            objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1 = (ObjectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1) continuation;
            int i2 = objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cq60 cq60Var = (cq60) obj;
                    cd70 cd70Var = cq60Var.f;
                    if (cd70Var == null || (cd70Var.getA() == null && cd70Var.getB() == null)) {
                        kq00Var = lq00.a;
                    } else {
                        uc4 uc4Var = cd70Var.a;
                        String str = cd70Var.b;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        String str3 = cd70Var.c;
                        List<fkp> list = cq60Var.g;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        for (fkp fkpVar : list) {
                            zlp zlpVar = fkpVar.c;
                            zzs zzsVar = zlpVar != null ? zlpVar.a : null;
                            jmp jmpVar = fkpVar.b;
                            arrayList.add(new ump(zzsVar, ru.yandex.taxi.layers.source.factory.a.l((jmpVar != null ? jmpVar.j : null).c)));
                        }
                        byx byxVar = cq60Var.n;
                        if (byxVar == null) {
                            byxVar = null;
                        }
                        kq00Var = new kq00(uc4Var, str2, str3, arrayList, byxVar.b.a);
                    }
                    objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.L$0 = null;
                    objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.L$1 = null;
                    objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.L$2 = null;
                    objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.L$3 = null;
                    objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kq00Var, objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1) == coroutineSingletons) {
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
        objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1 = new ObjectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1(this, continuation);
        Object obj22 = objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = objectsRepository$listenToMapObservationConfig$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
