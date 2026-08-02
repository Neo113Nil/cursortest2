package ru.yandex.taxi.preorder.summary.tariffpage.experiment;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.ziu;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a {
    public final t1b0 a;

    public a(rqo rqoVar) {
        this.a = ((jbh) rqoVar).e(new ziu(2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        HideTariffSelectorExperimentRepository$isEnabled$1 hideTariffSelectorExperimentRepository$isEnabled$1;
        int i;
        if (continuationImpl instanceof HideTariffSelectorExperimentRepository$isEnabled$1) {
            hideTariffSelectorExperimentRepository$isEnabled$1 = (HideTariffSelectorExperimentRepository$isEnabled$1) continuationImpl;
            int i2 = hideTariffSelectorExperimentRepository$isEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hideTariffSelectorExperimentRepository$isEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hideTariffSelectorExperimentRepository$isEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hideTariffSelectorExperimentRepository$isEnabled$1.label;
                if (i != 0) {
                    b.b(obj);
                    hideTariffSelectorExperimentRepository$isEnabled$1.label = 1;
                    obj = this.a.b(hideTariffSelectorExperimentRepository$isEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(((ziu) obj).b);
            }
        }
        hideTariffSelectorExperimentRepository$isEnabled$1 = new HideTariffSelectorExperimentRepository$isEnabled$1(this, continuationImpl);
        Object obj2 = hideTariffSelectorExperimentRepository$isEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hideTariffSelectorExperimentRepository$isEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((ziu) obj2).b);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        HideTariffSelectorExperimentRepository$needHideTariffSelector$1 hideTariffSelectorExperimentRepository$needHideTariffSelector$1;
        int i;
        if (continuationImpl instanceof HideTariffSelectorExperimentRepository$needHideTariffSelector$1) {
            hideTariffSelectorExperimentRepository$needHideTariffSelector$1 = (HideTariffSelectorExperimentRepository$needHideTariffSelector$1) continuationImpl;
            int i2 = hideTariffSelectorExperimentRepository$needHideTariffSelector$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hideTariffSelectorExperimentRepository$needHideTariffSelector$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hideTariffSelectorExperimentRepository$needHideTariffSelector$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hideTariffSelectorExperimentRepository$needHideTariffSelector$1.label;
                if (i != 0) {
                    b.b(obj);
                    hideTariffSelectorExperimentRepository$needHideTariffSelector$1.L$0 = str;
                    hideTariffSelectorExperimentRepository$needHideTariffSelector$1.label = 1;
                    obj = this.a.b(hideTariffSelectorExperimentRepository$needHideTariffSelector$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) hideTariffSelectorExperimentRepository$needHideTariffSelector$1.L$0;
                    b.b(obj);
                }
                ziu ziuVar = (ziu) obj;
                return Boolean.valueOf(!ziuVar.b && ziuVar.c.contains(str));
            }
        }
        hideTariffSelectorExperimentRepository$needHideTariffSelector$1 = new HideTariffSelectorExperimentRepository$needHideTariffSelector$1(this, continuationImpl);
        Object obj2 = hideTariffSelectorExperimentRepository$needHideTariffSelector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hideTariffSelectorExperimentRepository$needHideTariffSelector$1.label;
        if (i != 0) {
        }
        ziu ziuVar2 = (ziu) obj2;
        return Boolean.valueOf(!ziuVar2.b && ziuVar2.c.contains(str));
    }
}
