package ru.yandex.taxi.requirements.glued.ui.image;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ i b;

    public e(tpr tprVar, i iVar) {
        this.a = tprVar;
        this.b = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        DefaultCarImageBinder$attach$$inlined$map$2$1 defaultCarImageBinder$attach$$inlined$map$2$1;
        int i;
        if (continuation instanceof DefaultCarImageBinder$attach$$inlined$map$2$1) {
            defaultCarImageBinder$attach$$inlined$map$2$1 = (DefaultCarImageBinder$attach$$inlined$map$2$1) continuation;
            int i2 = defaultCarImageBinder$attach$$inlined$map$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCarImageBinder$attach$$inlined$map$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultCarImageBinder$attach$$inlined$map$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultCarImageBinder$attach$$inlined$map$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    defaultCarImageBinder$attach$$inlined$map$2$1.L$0 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$1.L$1 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$1.L$2 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$1.label = 1;
                    if (this.a.collect(dVar, defaultCarImageBinder$attach$$inlined$map$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        defaultCarImageBinder$attach$$inlined$map$2$1 = new DefaultCarImageBinder$attach$$inlined$map$2$1(this, continuation);
        Object obj2 = defaultCarImageBinder$attach$$inlined$map$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultCarImageBinder$attach$$inlined$map$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
