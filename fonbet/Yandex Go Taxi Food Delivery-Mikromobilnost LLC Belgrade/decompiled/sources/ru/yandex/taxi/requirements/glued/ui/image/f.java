package ru.yandex.taxi.requirements.glued.ui.image;

import defpackage.bvf0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public f(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (r7.emit(r2, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DefaultCarImageBinder$attach$$inlined$map$3$2$1 defaultCarImageBinder$attach$$inlined$map$3$2$1;
        int i;
        String str;
        vpr vprVar;
        if (continuation instanceof DefaultCarImageBinder$attach$$inlined$map$3$2$1) {
            defaultCarImageBinder$attach$$inlined$map$3$2$1 = (DefaultCarImageBinder$attach$$inlined$map$3$2$1) continuation;
            int i2 = defaultCarImageBinder$attach$$inlined$map$3$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCarImageBinder$attach$$inlined$map$3$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = defaultCarImageBinder$attach$$inlined$map$3$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultCarImageBinder$attach$$inlined$map$3$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    String str2 = (String) pair.getFirst();
                    List list = (List) pair.getSecond();
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$0 = null;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$1 = null;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$2 = null;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$4 = vprVar2;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$5 = null;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$6 = null;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$7 = null;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.L$8 = str2;
                    defaultCarImageBinder$attach$$inlined$map$3$2$1.label = 1;
                    Object n = bvf0.n(new DefaultCarImageBinder$mapOptionsForRender$2(list, this.b, null), defaultCarImageBinder$attach$$inlined$map$3$2$1);
                    if (n != coroutineSingletons) {
                        obj2 = n;
                        str = str2;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                str = (String) defaultCarImageBinder$attach$$inlined$map$3$2$1.L$8;
                vprVar = (vpr) defaultCarImageBinder$attach$$inlined$map$3$2$1.L$4;
                kotlin.b.b(obj2);
                Pair pair2 = new Pair(str, obj2);
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$0 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$1 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$2 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$3 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$4 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$5 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$6 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$7 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.L$8 = null;
                defaultCarImageBinder$attach$$inlined$map$3$2$1.label = 2;
            }
        }
        defaultCarImageBinder$attach$$inlined$map$3$2$1 = new DefaultCarImageBinder$attach$$inlined$map$3$2$1(this, continuation);
        Object obj22 = defaultCarImageBinder$attach$$inlined$map$3$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultCarImageBinder$attach$$inlined$map$3$2$1.label;
        if (i != 0) {
        }
        Pair pair22 = new Pair(str, obj22);
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$0 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$1 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$2 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$3 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$4 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$5 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$6 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$7 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.L$8 = null;
        defaultCarImageBinder$attach$$inlined$map$3$2$1.label = 2;
    }
}
