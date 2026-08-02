package ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view;

import defpackage.e5s;
import defpackage.f230;
import defpackage.f5s;
import defpackage.g230;
import defpackage.g5s;
import defpackage.h230;
import defpackage.h5s;
import defpackage.i230;
import defpackage.j130;
import defpackage.j5s;
import defpackage.jl40;
import defpackage.k130;
import defpackage.ny61;
import defpackage.t3s;
import defpackage.vpr;
import defpackage.w511;
import defpackage.x2s;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ k130 b;

    public b(vpr vprVar, k130 k130Var) {
        this.a = vprVar;
        this.b = k130Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ModalViewCoreModelRepository$getForm$$inlined$map$1$2$1 modalViewCoreModelRepository$getForm$$inlined$map$1$2$1;
        int i;
        h5s h5sVar;
        j130 j130Var;
        i230 f230Var;
        Object obj2;
        if (continuation instanceof ModalViewCoreModelRepository$getForm$$inlined$map$1$2$1) {
            modalViewCoreModelRepository$getForm$$inlined$map$1$2$1 = (ModalViewCoreModelRepository$getForm$$inlined$map$1$2$1) continuation;
            int i2 = modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    j5s j5sVar = (j5s) obj;
                    if (j5sVar != null) {
                        Iterator it = j5sVar.e.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (jl40.l(((h5s) obj2).getId(), this.b.a)) {
                                break;
                            }
                        }
                        h5sVar = (h5s) obj2;
                    } else {
                        h5sVar = null;
                    }
                    t3s layout = h5sVar != null ? h5sVar.getLayout() : null;
                    if (layout != null) {
                        List list = layout.a;
                        List list2 = layout.b;
                        List list3 = layout.c;
                        List list4 = layout.d;
                        List list5 = layout.e;
                        x2s x2sVar = layout.f;
                        String str = layout.g;
                        int i3 = layout.h;
                        if (h5sVar instanceof g5s) {
                            f230Var = h230.a;
                        } else if (h5sVar instanceof f5s) {
                            f230Var = new g230(((f5s) h5sVar).c);
                        } else {
                            if (!(h5sVar instanceof e5s)) {
                                w511.b();
                                return null;
                            }
                            f230Var = new f230(((e5s) h5sVar).c);
                        }
                        j130Var = new j130(list, list2, list3, list4, list5, x2sVar, str, i3, f230Var);
                    } else {
                        j130Var = null;
                    }
                    modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.L$0 = null;
                    modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.L$1 = null;
                    modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.L$2 = null;
                    modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.L$3 = null;
                    modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.I$0 = 0;
                    modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(j130Var, modalViewCoreModelRepository$getForm$$inlined$map$1$2$1) == coroutineSingletons) {
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
        modalViewCoreModelRepository$getForm$$inlined$map$1$2$1 = new ModalViewCoreModelRepository$getForm$$inlined$map$1$2$1(this, continuation);
        Object obj32 = modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = modalViewCoreModelRepository$getForm$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
