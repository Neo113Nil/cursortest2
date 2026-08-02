package ru.yandex.taxi.scooters.data;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.wls;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;

/* loaded from: classes6.dex */
public final class q implements t1b0 {
    public final /* synthetic */ t1b0 a;
    public final ru.yandex.taxi.widget.c b;

    public q(rqo rqoVar, ru.yandex.taxi.widget.c cVar) {
        ScootersMultiOrderExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(ScootersMultiOrderExperiment.g);
        this.b = cVar;
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
        return (ScootersMultiOrderExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersMultiOrderExperimentRepository$getCameraPreview$1 scootersMultiOrderExperimentRepository$getCameraPreview$1;
        int i;
        if (continuationImpl instanceof ScootersMultiOrderExperimentRepository$getCameraPreview$1) {
            scootersMultiOrderExperimentRepository$getCameraPreview$1 = (ScootersMultiOrderExperimentRepository$getCameraPreview$1) continuationImpl;
            int i2 = scootersMultiOrderExperimentRepository$getCameraPreview$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiOrderExperimentRepository$getCameraPreview$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMultiOrderExperimentRepository$getCameraPreview$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiOrderExperimentRepository$getCameraPreview$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMultiOrderExperimentRepository$getCameraPreview$1.label = 1;
                    obj = this.a.b(scootersMultiOrderExperimentRepository$getCameraPreview$1);
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
                return ((ScootersMultiOrderExperiment) obj).e.c;
            }
        }
        scootersMultiOrderExperimentRepository$getCameraPreview$1 = new ScootersMultiOrderExperimentRepository$getCameraPreview$1(this, continuationImpl);
        Object obj2 = scootersMultiOrderExperimentRepository$getCameraPreview$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiOrderExperimentRepository$getCameraPreview$1.label;
        if (i != 0) {
        }
        return ((ScootersMultiOrderExperiment) obj2).e.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ScootersMultiOrderExperimentRepository$getMaxSessions$1 scootersMultiOrderExperimentRepository$getMaxSessions$1;
        int i;
        if (continuationImpl instanceof ScootersMultiOrderExperimentRepository$getMaxSessions$1) {
            scootersMultiOrderExperimentRepository$getMaxSessions$1 = (ScootersMultiOrderExperimentRepository$getMaxSessions$1) continuationImpl;
            int i2 = scootersMultiOrderExperimentRepository$getMaxSessions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiOrderExperimentRepository$getMaxSessions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMultiOrderExperimentRepository$getMaxSessions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiOrderExperimentRepository$getMaxSessions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMultiOrderExperimentRepository$getMaxSessions$1.label = 1;
                    obj = this.a.b(scootersMultiOrderExperimentRepository$getMaxSessions$1);
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
                return new Integer(((ScootersMultiOrderExperiment) obj).d);
            }
        }
        scootersMultiOrderExperimentRepository$getMaxSessions$1 = new ScootersMultiOrderExperimentRepository$getMaxSessions$1(this, continuationImpl);
        Object obj2 = scootersMultiOrderExperimentRepository$getMaxSessions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiOrderExperimentRepository$getMaxSessions$1.label;
        if (i != 0) {
        }
        return new Integer(((ScootersMultiOrderExperiment) obj2).d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        ScootersMultiOrderExperimentRepository$getQrCameraSubtitle$1 scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersMultiOrderExperimentRepository$getQrCameraSubtitle$1) {
            scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1 = (ScootersMultiOrderExperimentRepository$getQrCameraSubtitle$1) continuationImpl;
            int i2 = scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.label = 1;
                    obj = j(scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj);
                                return obj;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        int intValue = ((Number) obj).intValue();
                        wls scootersMultiOrderExperimentRepository$getQrCameraSubtitle$2 = new ScootersMultiOrderExperimentRepository$getQrCameraSubtitle$2(intValue, null);
                        scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.I$0 = intValue;
                        scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.label = 3;
                        Object l = l(scootersMultiOrderExperimentRepository$getQrCameraSubtitle$2, scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1);
                        return l == obj2 ? obj2 : l;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.label = 2;
                obj = g(scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1);
            }
        }
        scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1 = new ScootersMultiOrderExperimentRepository$getQrCameraSubtitle$1(this, continuationImpl);
        obj = scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiOrderExperimentRepository$getQrCameraSubtitle$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        ScootersMultiOrderExperimentRepository$getQrCameraTitle$1 scootersMultiOrderExperimentRepository$getQrCameraTitle$1;
        Object obj;
        int i;
        if (continuationImpl instanceof ScootersMultiOrderExperimentRepository$getQrCameraTitle$1) {
            scootersMultiOrderExperimentRepository$getQrCameraTitle$1 = (ScootersMultiOrderExperimentRepository$getQrCameraTitle$1) continuationImpl;
            int i2 = scootersMultiOrderExperimentRepository$getQrCameraTitle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiOrderExperimentRepository$getQrCameraTitle$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersMultiOrderExperimentRepository$getQrCameraTitle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiOrderExperimentRepository$getQrCameraTitle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMultiOrderExperimentRepository$getQrCameraTitle$1.label = 1;
                    obj = j(scootersMultiOrderExperimentRepository$getQrCameraTitle$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                wls scootersMultiOrderExperimentRepository$getQrCameraTitle$2 = new ScootersMultiOrderExperimentRepository$getQrCameraTitle$2(2, null);
                scootersMultiOrderExperimentRepository$getQrCameraTitle$1.label = 2;
                Object l = l(scootersMultiOrderExperimentRepository$getQrCameraTitle$2, scootersMultiOrderExperimentRepository$getQrCameraTitle$1);
                return l == obj2 ? obj2 : l;
            }
        }
        scootersMultiOrderExperimentRepository$getQrCameraTitle$1 = new ScootersMultiOrderExperimentRepository$getQrCameraTitle$1(this, continuationImpl);
        obj = scootersMultiOrderExperimentRepository$getQrCameraTitle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiOrderExperimentRepository$getQrCameraTitle$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        ScootersMultiOrderExperimentRepository$isMultiorderEnabled$1 scootersMultiOrderExperimentRepository$isMultiorderEnabled$1;
        int i;
        if (continuationImpl instanceof ScootersMultiOrderExperimentRepository$isMultiorderEnabled$1) {
            scootersMultiOrderExperimentRepository$isMultiorderEnabled$1 = (ScootersMultiOrderExperimentRepository$isMultiorderEnabled$1) continuationImpl;
            int i2 = scootersMultiOrderExperimentRepository$isMultiorderEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiOrderExperimentRepository$isMultiorderEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMultiOrderExperimentRepository$isMultiorderEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiOrderExperimentRepository$isMultiorderEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMultiOrderExperimentRepository$isMultiorderEnabled$1.label = 1;
                    obj = this.a.b(scootersMultiOrderExperimentRepository$isMultiorderEnabled$1);
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
                ScootersMultiOrderExperiment scootersMultiOrderExperiment = (ScootersMultiOrderExperiment) obj;
                return Boolean.valueOf(!scootersMultiOrderExperiment.b && scootersMultiOrderExperiment.d > 1);
            }
        }
        scootersMultiOrderExperimentRepository$isMultiorderEnabled$1 = new ScootersMultiOrderExperimentRepository$isMultiorderEnabled$1(this, continuationImpl);
        Object obj2 = scootersMultiOrderExperimentRepository$isMultiorderEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiOrderExperimentRepository$isMultiorderEnabled$1.label;
        if (i != 0) {
        }
        ScootersMultiOrderExperiment scootersMultiOrderExperiment2 = (ScootersMultiOrderExperiment) obj2;
        return Boolean.valueOf(!scootersMultiOrderExperiment2.b && scootersMultiOrderExperiment2.d > 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ContinuationImpl continuationImpl) {
        ScootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1 scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1;
        int i;
        if (continuationImpl instanceof ScootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1) {
            scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1 = (ScootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1) continuationImpl;
            int i2 = scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1.label = 1;
                    obj = d(scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ScootersMultiOrderExperiment.Camera.ScooterPreview scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj;
                return Boolean.valueOf(scooterPreview == null ? scooterPreview.a : false);
            }
        }
        scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1 = new ScootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1(this, continuationImpl);
        Object obj3 = scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiOrderExperimentRepository$isPreviewFlowEnabled$1.label;
        if (i != 0) {
        }
        ScootersMultiOrderExperiment.Camera.ScooterPreview scooterPreview2 = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj3;
        return Boolean.valueOf(scooterPreview2 == null ? scooterPreview2.a : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r9 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r9 == r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(wls wlsVar, ContinuationImpl continuationImpl) {
        ScootersMultiOrderExperimentRepository$mapFormattedText$1 scootersMultiOrderExperimentRepository$mapFormattedText$1;
        int i;
        ru.yandex.taxi.widget.c cVar;
        if (continuationImpl instanceof ScootersMultiOrderExperimentRepository$mapFormattedText$1) {
            scootersMultiOrderExperimentRepository$mapFormattedText$1 = (ScootersMultiOrderExperimentRepository$mapFormattedText$1) continuationImpl;
            int i2 = scootersMultiOrderExperimentRepository$mapFormattedText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMultiOrderExperimentRepository$mapFormattedText$1.label = i2 - Integer.MIN_VALUE;
                ScootersMultiOrderExperimentRepository$mapFormattedText$1 scootersMultiOrderExperimentRepository$mapFormattedText$12 = scootersMultiOrderExperimentRepository$mapFormattedText$1;
                Object obj = scootersMultiOrderExperimentRepository$mapFormattedText$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMultiOrderExperimentRepository$mapFormattedText$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMultiOrderExperimentRepository$mapFormattedText$12.L$0 = wlsVar;
                    scootersMultiOrderExperimentRepository$mapFormattedText$12.label = 1;
                    obj = this.a.b(scootersMultiOrderExperimentRepository$mapFormattedText$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        cVar = (ru.yandex.taxi.widget.c) scootersMultiOrderExperimentRepository$mapFormattedText$12.L$2;
                        kotlin.b.b(obj);
                        ru.yandex.taxi.widget.c cVar2 = cVar;
                        scootersMultiOrderExperimentRepository$mapFormattedText$12.L$0 = null;
                        scootersMultiOrderExperimentRepository$mapFormattedText$12.L$1 = null;
                        scootersMultiOrderExperimentRepository$mapFormattedText$12.L$2 = null;
                        scootersMultiOrderExperimentRepository$mapFormattedText$12.label = 3;
                        Object e = ru.yandex.taxi.widget.c.e(cVar2, (FormattedText) obj, null, false, scootersMultiOrderExperimentRepository$mapFormattedText$12, 30);
                        return e == coroutineSingletons ? coroutineSingletons : e;
                    }
                    wlsVar = (wls) scootersMultiOrderExperimentRepository$mapFormattedText$12.L$0;
                    kotlin.b.b(obj);
                }
                scootersMultiOrderExperimentRepository$mapFormattedText$12.L$0 = null;
                scootersMultiOrderExperimentRepository$mapFormattedText$12.L$1 = null;
                cVar = this.b;
                scootersMultiOrderExperimentRepository$mapFormattedText$12.L$2 = cVar;
                scootersMultiOrderExperimentRepository$mapFormattedText$12.label = 2;
                obj = wlsVar.invoke((ScootersMultiOrderExperiment) obj, scootersMultiOrderExperimentRepository$mapFormattedText$12);
            }
        }
        scootersMultiOrderExperimentRepository$mapFormattedText$1 = new ScootersMultiOrderExperimentRepository$mapFormattedText$1(this, continuationImpl);
        ScootersMultiOrderExperimentRepository$mapFormattedText$1 scootersMultiOrderExperimentRepository$mapFormattedText$122 = scootersMultiOrderExperimentRepository$mapFormattedText$1;
        Object obj2 = scootersMultiOrderExperimentRepository$mapFormattedText$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMultiOrderExperimentRepository$mapFormattedText$122.label;
        if (i != 0) {
        }
        scootersMultiOrderExperimentRepository$mapFormattedText$122.L$0 = null;
        scootersMultiOrderExperimentRepository$mapFormattedText$122.L$1 = null;
        cVar = this.b;
        scootersMultiOrderExperimentRepository$mapFormattedText$122.L$2 = cVar;
        scootersMultiOrderExperimentRepository$mapFormattedText$122.label = 2;
        obj2 = wlsVar.invoke((ScootersMultiOrderExperiment) obj2, scootersMultiOrderExperimentRepository$mapFormattedText$122);
    }
}
