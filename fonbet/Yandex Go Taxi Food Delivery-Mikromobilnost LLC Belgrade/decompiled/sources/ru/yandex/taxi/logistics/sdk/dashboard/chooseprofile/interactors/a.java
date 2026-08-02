package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors;

import defpackage.bpc;
import defpackage.cpc;
import defpackage.d6w;
import defpackage.ehg;
import defpackage.ny61;
import defpackage.rrb;
import defpackage.ugg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final com.yandex.delivery.utils.dialogmanager.a a;

    public a(com.yandex.delivery.utils.dialogmanager.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (com.yandex.delivery.utils.dialogmanager.a.e(r8.a, r9, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bpc bpcVar, wls wlsVar, ContinuationImpl continuationImpl) {
        ChooseProfileDialogInteractor$showErrorDialog$1 chooseProfileDialogInteractor$showErrorDialog$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zy11 zy11Var;
        Integer num;
        if (continuationImpl instanceof ChooseProfileDialogInteractor$showErrorDialog$1) {
            chooseProfileDialogInteractor$showErrorDialog$1 = (ChooseProfileDialogInteractor$showErrorDialog$1) continuationImpl;
            int i2 = chooseProfileDialogInteractor$showErrorDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chooseProfileDialogInteractor$showErrorDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chooseProfileDialogInteractor$showErrorDialog$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chooseProfileDialogInteractor$showErrorDialog$1.label;
                zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chooseProfileDialogInteractor$showErrorDialog$1.L$0 = bpcVar;
                    chooseProfileDialogInteractor$showErrorDialog$1.L$1 = wlsVar;
                    chooseProfileDialogInteractor$showErrorDialog$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    wlsVar = (wls) chooseProfileDialogInteractor$showErrorDialog$1.L$1;
                    bpcVar = (bpc) chooseProfileDialogInteractor$showErrorDialog$1.L$0;
                    kotlin.b.b(obj);
                }
                cpc cpcVar = !(bpcVar instanceof cpc) ? (cpc) bpcVar : null;
                num = cpcVar == null ? cpcVar.b : null;
                d6w d6wVar = rrb.a;
                if (num != null || !d6wVar.g(num.intValue())) {
                    d6w d6wVar2 = rrb.b;
                    if (num != null || !d6wVar2.g(num.intValue())) {
                        chooseProfileDialogInteractor$showErrorDialog$1.L$0 = null;
                        chooseProfileDialogInteractor$showErrorDialog$1.L$1 = null;
                        chooseProfileDialogInteractor$showErrorDialog$1.label = 3;
                        return wlsVar.invoke(ugg.a, chooseProfileDialogInteractor$showErrorDialog$1) != coroutineSingletons ? coroutineSingletons : zy11Var;
                    }
                }
                ehg ehgVar = new ehg(null);
                chooseProfileDialogInteractor$showErrorDialog$1.L$0 = null;
                chooseProfileDialogInteractor$showErrorDialog$1.L$1 = null;
                chooseProfileDialogInteractor$showErrorDialog$1.label = 2;
                if (wlsVar.invoke(ehgVar, chooseProfileDialogInteractor$showErrorDialog$1) == coroutineSingletons) {
                }
            }
        }
        chooseProfileDialogInteractor$showErrorDialog$1 = new ChooseProfileDialogInteractor$showErrorDialog$1(this, continuationImpl);
        Object obj2 = chooseProfileDialogInteractor$showErrorDialog$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chooseProfileDialogInteractor$showErrorDialog$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
        if (!(bpcVar instanceof cpc)) {
        }
        if (cpcVar == null) {
        }
        d6w d6wVar3 = rrb.a;
        if (num != null) {
        }
        d6w d6wVar22 = rrb.b;
        if (num != null) {
        }
        chooseProfileDialogInteractor$showErrorDialog$1.L$0 = null;
        chooseProfileDialogInteractor$showErrorDialog$1.L$1 = null;
        chooseProfileDialogInteractor$showErrorDialog$1.label = 3;
        if (wlsVar.invoke(ugg.a, chooseProfileDialogInteractor$showErrorDialog$1) != coroutineSingletons) {
        }
    }
}
