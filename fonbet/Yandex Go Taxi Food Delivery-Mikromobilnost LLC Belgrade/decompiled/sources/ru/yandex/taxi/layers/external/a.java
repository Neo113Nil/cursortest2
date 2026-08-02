package ru.yandex.taxi.layers.external;

import defpackage.cq60;
import defpackage.evu0;
import defpackage.fkp;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LayersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1 layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1;
        int i;
        fkp fkpVar;
        Object obj2;
        if (continuation instanceof LayersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1) {
            layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1 = (LayersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1) continuation;
            int i2 = layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    List list = ((cq60) ((Pair) obj).getFirst()).g;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = ((fkp) obj2).a;
                            if (str != null && evu0.y(str, this.b, false)) {
                                break;
                            }
                        }
                        fkpVar = (fkp) obj2;
                    } else {
                        fkpVar = null;
                    }
                    layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.L$0 = null;
                    layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.L$1 = null;
                    layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.L$2 = null;
                    layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.L$3 = null;
                    layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(fkpVar, layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1 = new LayersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = layersObjectsRepository$listenToFeatureUpdatesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
