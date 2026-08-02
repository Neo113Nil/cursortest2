package ru.yandex.taxi.masstransit.domain;

import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.experiments.ExternalExperimentsManager;
import com.yandex.runtime.config.ExternalExperimentalParameter;
import defpackage.el00;
import defpackage.g211;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class j0 implements vpr {
    public final /* synthetic */ g211 a;

    public j0(g211 g211Var) {
        this.a = g211Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Continuation continuation, ru.yandex.taxi.masstransit.experiment.f fVar) {
        TransportExperimentsInteractor$collectExperiments$2$1$1$emit$1 transportExperimentsInteractor$collectExperiments$2$1$1$emit$1;
        int i;
        ExternalExperimentsManager externalExperimentsManager;
        if (continuation instanceof TransportExperimentsInteractor$collectExperiments$2$1$1$emit$1) {
            transportExperimentsInteractor$collectExperiments$2$1$1$emit$1 = (TransportExperimentsInteractor$collectExperiments$2$1$1$emit$1) continuation;
            int i2 = transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.label;
                g211 g211Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    el00 el00Var = g211Var.c;
                    transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.L$0 = fVar;
                    transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.label = 1;
                    obj = el00Var.b(true, transportExperimentsInteractor$collectExperiments$2$1$1$emit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = (ru.yandex.taxi.masstransit.experiment.f) transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                ExternalExperimentsManager externalExperimentsManager2 = ((MapKit) obj).getExternalExperimentsManager();
                externalExperimentsManager = externalExperimentsManager2.isValid() ? externalExperimentsManager2 : null;
                if (externalExperimentsManager != null) {
                    boolean z = fVar.a;
                    g211Var.getClass();
                    externalExperimentsManager.setValues(Collections.singletonList(new ExternalExperimentalParameter("MAPS_MT_ROUTER", "experimental_pass_through", z ? "1" : "0")));
                }
                return zy11.a;
            }
        }
        transportExperimentsInteractor$collectExperiments$2$1$1$emit$1 = new TransportExperimentsInteractor$collectExperiments$2$1$1$emit$1(this, continuation);
        Object obj2 = transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transportExperimentsInteractor$collectExperiments$2$1$1$emit$1.label;
        g211 g211Var2 = this.a;
        if (i != 0) {
        }
        ExternalExperimentsManager externalExperimentsManager22 = ((MapKit) obj2).getExternalExperimentsManager();
        if (externalExperimentsManager22.isValid()) {
        }
        if (externalExperimentsManager != null) {
        }
        return zy11.a;
    }
}
