package ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor;

import defpackage.c9x0;
import defpackage.e5s;
import defpackage.h5s;
import defpackage.j5s;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c9x0 b;

    public f(vpr vprVar, c9x0 c9x0Var) {
        this.a = vprVar;
        this.b = c9x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1 openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        h5s h5sVar;
        Object obj2;
        if (continuation instanceof OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
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
                    e5s e5sVar = h5sVar instanceof e5s ? (e5s) h5sVar : null;
                    if (e5sVar != null) {
                        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(e5sVar, openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new OpenOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = openOverCameraModalViewInteractor$observeCameraTypeChanges$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
