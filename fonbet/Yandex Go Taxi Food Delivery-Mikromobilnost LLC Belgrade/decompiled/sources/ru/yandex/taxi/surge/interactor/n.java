package ru.yandex.taxi.surge.interactor;

import android.graphics.drawable.BitmapDrawable;
import defpackage.nuq;
import defpackage.ny61;
import defpackage.puq;
import defpackage.q47;
import defpackage.qye0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ nuq b;
    public final /* synthetic */ p c;

    public n(vpr vprVar, nuq nuqVar, p pVar) {
        this.a = vprVar;
        this.b = nuqVar;
        this.c = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f8, code lost:
    
        if (r3.emit(r4, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SurgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1 surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        vpr vprVar;
        String str2;
        Object b;
        vpr vprVar2;
        BitmapDrawable bitmapDrawable;
        if (continuation instanceof SurgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1) {
            surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1 = (SurgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label;
                p pVar = this.c;
                nuq nuqVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    str = nuqVar.a;
                    String str3 = nuqVar.b;
                    ru.yandex.taxi.widget.utils.e eVar = pVar.c;
                    String str4 = nuqVar.c;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$6 = str3;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$7 = str;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    Object f = ru.yandex.taxi.widget.utils.e.f(eVar, str4, null, surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1, 6);
                    if (f != coroutineSingletons) {
                        str2 = str3;
                        obj2 = f;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    String str5 = (String) surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$7;
                    String str6 = (String) surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$6;
                    vpr vprVar3 = (vpr) surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    str = str5;
                    vprVar = vprVar3;
                    str2 = str6;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    bitmapDrawable = (BitmapDrawable) surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$8;
                    str = (String) surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$7;
                    str2 = (String) surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$6;
                    vprVar2 = (vpr) surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                    puq puqVar = new puq(str, str2, bitmapDrawable, (q47) obj2);
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$4 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$7 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$8 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$9 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label = 3;
                }
                BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
                qye0 qye0Var = nuqVar.d;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$6 = str2;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$7 = str;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$8 = bitmapDrawable2;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$9 = null;
                surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label = 2;
                b = p.b(pVar, qye0Var, surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1);
                if (b != coroutineSingletons) {
                    vprVar2 = vprVar;
                    bitmapDrawable = bitmapDrawable2;
                    obj2 = b;
                    puq puqVar2 = new puq(str, str2, bitmapDrawable, (q47) obj2);
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$4 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$6 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$7 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$8 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$9 = null;
                    surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label = 3;
                }
                return coroutineSingletons;
            }
        }
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1 = new SurgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label;
        p pVar2 = this.c;
        nuq nuqVar2 = this.b;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable22 = (BitmapDrawable) obj22;
        qye0 qye0Var2 = nuqVar2.d;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$4 = vprVar;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$5 = null;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$6 = str2;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$7 = str;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$8 = bitmapDrawable22;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.L$9 = null;
        surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1.label = 2;
        b = p.b(pVar2, qye0Var2, surgeFeedbackSentStateInteractor$stateFlow$$inlined$map$1$2$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
