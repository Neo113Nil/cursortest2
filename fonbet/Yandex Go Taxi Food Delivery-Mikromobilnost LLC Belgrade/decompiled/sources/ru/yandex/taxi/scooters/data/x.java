package ru.yandex.taxi.scooters.data;

import defpackage.ato0;
import defpackage.f9s;
import defpackage.hwo0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tpr;
import defpackage.uso0;
import defpackage.zso0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class x implements ru.yandex.taxi.experiments.q {
    public final /* synthetic */ ru.yandex.taxi.experiments.q a;
    public final ato0 b;

    public x(rqo rqoVar, ato0 ato0Var) {
        zso0.Companion.getClass();
        this.a = ((jbh) rqoVar).d(zso0.h);
        this.b = ato0Var;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (zso0) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersRidingTogetherCommunicationExperimentRepository$getCommunication$1 scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1;
        int i;
        zso0 zso0Var;
        hwo0 hwo0Var;
        if (continuationImpl instanceof ScootersRidingTogetherCommunicationExperimentRepository$getCommunication$1) {
            scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1 = (ScootersRidingTogetherCommunicationExperimentRepository$getCommunication$1) continuationImpl;
            int i2 = scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1.label;
                hwo0 hwo0Var2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1.label = 1;
                    obj = this.a.b(scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                zso0Var = (zso0) obj;
                if ((!zso0Var.b ? this.b : null) != null) {
                    return null;
                }
                zso0.a aVar = zso0Var.d;
                if (aVar != null) {
                    String str = aVar.a;
                    FormattedText e = f9s.e(aVar.b, zso0Var);
                    FormattedText e2 = f9s.e(aVar.d, zso0Var);
                    FormattedText formattedText = aVar.c;
                    hwo0Var = new hwo0(str, e, formattedText != null ? f9s.e(formattedText, zso0Var) : null, e2, 0);
                } else {
                    hwo0Var = null;
                }
                zso0.a aVar2 = zso0Var.e;
                if (aVar2 != null) {
                    String str2 = aVar2.a;
                    FormattedText e3 = f9s.e(aVar2.b, zso0Var);
                    FormattedText e4 = f9s.e(aVar2.d, zso0Var);
                    FormattedText formattedText2 = aVar2.c;
                    hwo0Var2 = new hwo0(str2, e3, formattedText2 != null ? f9s.e(formattedText2, zso0Var) : null, e4, 0);
                }
                Long l = zso0Var.f;
                return new uso0(hwo0Var, hwo0Var2, l != null ? l.longValue() : 30000L);
            }
        }
        scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1 = new ScootersRidingTogetherCommunicationExperimentRepository$getCommunication$1(this, continuationImpl);
        Object obj2 = scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersRidingTogetherCommunicationExperimentRepository$getCommunication$1.label;
        hwo0 hwo0Var22 = null;
        if (i != 0) {
        }
        zso0Var = (zso0) obj2;
        if ((!zso0Var.b ? this.b : null) != null) {
        }
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
