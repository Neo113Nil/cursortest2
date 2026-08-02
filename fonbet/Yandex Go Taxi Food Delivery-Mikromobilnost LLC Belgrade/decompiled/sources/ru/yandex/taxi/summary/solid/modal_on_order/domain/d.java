package ru.yandex.taxi.summary.solid.modal_on_order.domain;

import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.dxw0;
import defpackage.j18;
import defpackage.ny61;
import defpackage.tj;
import defpackage.uj;
import defpackage.x880;
import defpackage.y880;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class d {
    public final ArrayList a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, uj] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00be -> B:10:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(x880 x880Var, ContinuationImpl continuationImpl) {
        SuspendableChainProcessor$startChainProcessing$1 suspendableChainProcessor$startChainProcessing$1;
        int i;
        x880 x880Var2;
        y880 y880Var;
        if (continuationImpl instanceof SuspendableChainProcessor$startChainProcessing$1) {
            suspendableChainProcessor$startChainProcessing$1 = (SuspendableChainProcessor$startChainProcessing$1) continuationImpl;
            int i2 = suspendableChainProcessor$startChainProcessing$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suspendableChainProcessor$startChainProcessing$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suspendableChainProcessor$startChainProcessing$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suspendableChainProcessor$startChainProcessing$1.label;
                zy11 zy11Var = zy11.a;
                ArrayList arrayList = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x880Var2 = x880Var;
                    if (arrayList.isEmpty()) {
                    }
                    x880Var2.n();
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) suspendableChainProcessor$startChainProcessing$1.L$2;
                x880 x880Var3 = (x880) suspendableChainProcessor$startChainProcessing$1.L$0;
                kotlin.b.b(obj);
                x880Var2 = x880Var3;
                if (!ref$BooleanRef.element) {
                    x880Var2.o();
                    arrayList.clear();
                    return zy11Var;
                }
                if (!arrayList.isEmpty() || (y880Var = (y880) ycc.y(arrayList)) == null) {
                    x880Var2.n();
                    return zy11Var;
                }
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                suspendableChainProcessor$startChainProcessing$1.L$0 = x880Var2;
                suspendableChainProcessor$startChainProcessing$1.L$1 = y880Var;
                suspendableChainProcessor$startChainProcessing$1.L$2 = ref$BooleanRef2;
                suspendableChainProcessor$startChainProcessing$1.label = 1;
                j18 j18Var = new j18(1, dvw.b(suspendableChainProcessor$startChainProcessing$1));
                Ref$ObjectRef y = b64.y(j18Var);
                cx60 cx60Var = new cx60(11, y);
                cl7 cl7Var = new cl7(j18Var, cx60Var);
                y880Var.a(new dxw0(new tj(27, ref$BooleanRef2, new SuspendableChainProcessor$startChainProcessing$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0))));
                y.element = uj.I;
                if (cl7Var.c()) {
                    cx60Var.invoke();
                } else {
                    j18Var.w(new dx60(cl7Var, 12));
                }
                Object s = j18Var.s();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (s == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
                if (!ref$BooleanRef.element) {
                }
                if (arrayList.isEmpty()) {
                }
                x880Var2.n();
                return zy11Var;
            }
        }
        suspendableChainProcessor$startChainProcessing$1 = new SuspendableChainProcessor$startChainProcessing$1(this, continuationImpl);
        Object obj2 = suspendableChainProcessor$startChainProcessing$1.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suspendableChainProcessor$startChainProcessing$1.label;
        zy11 zy11Var2 = zy11.a;
        ArrayList arrayList2 = this.a;
        if (i != 0) {
        }
    }
}
