package ru.yandex.taxi.address.interactor;

import defpackage.e1c0;
import defpackage.f1c0;
import defpackage.jl40;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.sxb0;
import defpackage.txb0;
import defpackage.w511;
import defpackage.wxb0;
import defpackage.xxb0;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final f1c0 a;

    public a(f1c0 f1c0Var) {
        this.a = f1c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0093 A[EDGE_INSN: B:40:0x0093->B:31:0x0093 BREAK  A[LOOP:0: B:11:0x0055->B:28:0x0055], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(kb5 kb5Var, ContinuationImpl continuationImpl) {
        PinV2OverridesInteractor$sourceOverride$1 pinV2OverridesInteractor$sourceOverride$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PinV2OverridesInteractor$sourceOverride$1) {
            pinV2OverridesInteractor$sourceOverride$1 = (PinV2OverridesInteractor$sourceOverride$1) continuationImpl;
            int i2 = pinV2OverridesInteractor$sourceOverride$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinV2OverridesInteractor$sourceOverride$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinV2OverridesInteractor$sourceOverride$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinV2OverridesInteractor$sourceOverride$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinV2OverridesInteractor$sourceOverride$1.L$0 = kb5Var;
                    pinV2OverridesInteractor$sourceOverride$1.L$1 = this;
                    pinV2OverridesInteractor$sourceOverride$1.label = 1;
                    obj = this.a.a(pinV2OverridesInteractor$sourceOverride$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) pinV2OverridesInteractor$sourceOverride$1.L$1;
                    kb5Var = (kb5) pinV2OverridesInteractor$sourceOverride$1.L$0;
                    kotlin.b.b(obj);
                }
                this.getClass();
                it = ((e1c0) obj).g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    xxb0 xxb0Var = (xxb0) it.next();
                    if (!jl40.l(xxb0Var, txb0.INSTANCE)) {
                        if (!(xxb0Var instanceof sxb0)) {
                            if (!(xxb0Var instanceof wxb0)) {
                                w511.b();
                                break;
                            }
                            wxb0 wxb0Var = (wxb0) xxb0Var;
                            if (wxb0Var.a.contains(kb5Var.a)) {
                                return wxb0Var.b;
                            }
                        } else {
                            sxb0 sxb0Var = (sxb0) xxb0Var;
                            if (sxb0Var.a.contains(kb5Var.b)) {
                                return sxb0Var.b;
                            }
                        }
                    }
                }
                return null;
            }
        }
        pinV2OverridesInteractor$sourceOverride$1 = new PinV2OverridesInteractor$sourceOverride$1(this, continuationImpl);
        Object obj2 = pinV2OverridesInteractor$sourceOverride$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinV2OverridesInteractor$sourceOverride$1.label;
        if (i != 0) {
        }
        this.getClass();
        it = ((e1c0) obj2).g.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        return null;
    }
}
