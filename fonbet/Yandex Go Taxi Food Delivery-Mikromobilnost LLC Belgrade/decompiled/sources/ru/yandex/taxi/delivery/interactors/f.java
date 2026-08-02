package ru.yandex.taxi.delivery.interactors;

import defpackage.b580;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.omi;
import defpackage.vpr;
import defpackage.x8;
import defpackage.z6s;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.delivery.extracted_form_common_data.models.ui.DeliveryFormType;

/* loaded from: classes5.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ h c;

    public f(vpr vprVar, ArrayList arrayList, h hVar) {
        this.a = vprVar;
        this.b = arrayList;
        this.c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1 deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1;
        int i;
        DeliveryFormType deliveryFormType;
        Object obj2;
        if (continuation instanceof DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1) {
            deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1 = (DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1) continuation;
            int i2 = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Iterator it = this.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            deliveryFormType = null;
                            break;
                        }
                        z6s z6sVar = (z6s) it.next();
                        h hVar = this.c;
                        Iterator it2 = ((x8) hVar.a).d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (jl40.l(((b580) obj2).a, z6sVar.a.b)) {
                                break;
                            }
                        }
                        Object obj4 = z6sVar.a.c;
                        hVar.c.getClass();
                        if (omi.a((b580) obj2, obj4)) {
                            deliveryFormType = z6sVar.b;
                            break;
                        }
                    }
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.L$0 = null;
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.L$1 = null;
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.L$2 = null;
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.L$3 = null;
                    deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(deliveryFormType, deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1 = new DeliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj32 = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryFormTypeInteractor$formTypeByRequirementsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
