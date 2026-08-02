package ru.yandex.taxi.location.lbs;

import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.o7y;
import defpackage.q7y;
import defpackage.rqo;
import defpackage.s66;
import defpackage.yvi0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class b {
    public final s66 a;
    public final q7y b;
    public final yvi0 c;

    public b(s66 s66Var, q7y q7yVar, yvi0 yvi0Var) {
        this.a = s66Var;
        this.b = q7yVar;
        this.c = yvi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LbsInteractor$getGsmPollingIntervalSec$1 lbsInteractor$getGsmPollingIntervalSec$1;
        int i;
        if (continuationImpl instanceof LbsInteractor$getGsmPollingIntervalSec$1) {
            lbsInteractor$getGsmPollingIntervalSec$1 = (LbsInteractor$getGsmPollingIntervalSec$1) continuationImpl;
            int i2 = lbsInteractor$getGsmPollingIntervalSec$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsInteractor$getGsmPollingIntervalSec$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsInteractor$getGsmPollingIntervalSec$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsInteractor$getGsmPollingIntervalSec$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lbsInteractor$getGsmPollingIntervalSec$1.label = 1;
                    obj = this.a.b.b(lbsInteractor$getGsmPollingIntervalSec$1);
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
                Long l = ((o7y) obj).f;
                return new Long(l == null ? l.longValue() : 15L);
            }
        }
        lbsInteractor$getGsmPollingIntervalSec$1 = new LbsInteractor$getGsmPollingIntervalSec$1(this, continuationImpl);
        Object obj2 = lbsInteractor$getGsmPollingIntervalSec$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsInteractor$getGsmPollingIntervalSec$1.label;
        if (i != 0) {
        }
        Long l2 = ((o7y) obj2).f;
        return new Long(l2 == null ? l2.longValue() : 15L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LbsInteractor$getLbsRequestIntervalSec$1 lbsInteractor$getLbsRequestIntervalSec$1;
        int i;
        if (continuationImpl instanceof LbsInteractor$getLbsRequestIntervalSec$1) {
            lbsInteractor$getLbsRequestIntervalSec$1 = (LbsInteractor$getLbsRequestIntervalSec$1) continuationImpl;
            int i2 = lbsInteractor$getLbsRequestIntervalSec$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsInteractor$getLbsRequestIntervalSec$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsInteractor$getLbsRequestIntervalSec$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsInteractor$getLbsRequestIntervalSec$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lbsInteractor$getLbsRequestIntervalSec$1.label = 1;
                    obj = this.a.b.b(lbsInteractor$getLbsRequestIntervalSec$1);
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
                Long l = ((o7y) obj).d;
                return new Long(l == null ? l.longValue() : 15L);
            }
        }
        lbsInteractor$getLbsRequestIntervalSec$1 = new LbsInteractor$getLbsRequestIntervalSec$1(this, continuationImpl);
        Object obj2 = lbsInteractor$getLbsRequestIntervalSec$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsInteractor$getLbsRequestIntervalSec$1.label;
        if (i != 0) {
        }
        Long l2 = ((o7y) obj2).d;
        return new Long(l2 == null ? l2.longValue() : 15L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        LbsInteractor$getUseNewVersionGsmListener$1 lbsInteractor$getUseNewVersionGsmListener$1;
        int i;
        if (continuationImpl instanceof LbsInteractor$getUseNewVersionGsmListener$1) {
            lbsInteractor$getUseNewVersionGsmListener$1 = (LbsInteractor$getUseNewVersionGsmListener$1) continuationImpl;
            int i2 = lbsInteractor$getUseNewVersionGsmListener$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsInteractor$getUseNewVersionGsmListener$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsInteractor$getUseNewVersionGsmListener$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsInteractor$getUseNewVersionGsmListener$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lbsInteractor$getUseNewVersionGsmListener$1.label = 1;
                    obj = this.a.b.b(lbsInteractor$getUseNewVersionGsmListener$1);
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
                Boolean bool = ((o7y) obj).e;
                return Boolean.valueOf(bool == null ? bool.booleanValue() : false);
            }
        }
        lbsInteractor$getUseNewVersionGsmListener$1 = new LbsInteractor$getUseNewVersionGsmListener$1(this, continuationImpl);
        Object obj2 = lbsInteractor$getUseNewVersionGsmListener$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsInteractor$getUseNewVersionGsmListener$1.label;
        if (i != 0) {
        }
        Boolean bool2 = ((o7y) obj2).e;
        return Boolean.valueOf(bool2 == null ? bool2.booleanValue() : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        LbsInteractor$getWifiMaxScanResultAgeSec$1 lbsInteractor$getWifiMaxScanResultAgeSec$1;
        int i;
        if (continuationImpl instanceof LbsInteractor$getWifiMaxScanResultAgeSec$1) {
            lbsInteractor$getWifiMaxScanResultAgeSec$1 = (LbsInteractor$getWifiMaxScanResultAgeSec$1) continuationImpl;
            int i2 = lbsInteractor$getWifiMaxScanResultAgeSec$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsInteractor$getWifiMaxScanResultAgeSec$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lbsInteractor$getWifiMaxScanResultAgeSec$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsInteractor$getWifiMaxScanResultAgeSec$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lbsInteractor$getWifiMaxScanResultAgeSec$1.label = 1;
                    obj = this.a.b.b(lbsInteractor$getWifiMaxScanResultAgeSec$1);
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
                Long l = ((o7y) obj).c;
                return new Long(l == null ? l.longValue() : OperationProgressView.ROTATION_ANIMATION_DURATION);
            }
        }
        lbsInteractor$getWifiMaxScanResultAgeSec$1 = new LbsInteractor$getWifiMaxScanResultAgeSec$1(this, continuationImpl);
        Object obj2 = lbsInteractor$getWifiMaxScanResultAgeSec$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsInteractor$getWifiMaxScanResultAgeSec$1.label;
        if (i != 0) {
        }
        Long l2 = ((o7y) obj2).c;
        return new Long(l2 == null ? l2.longValue() : OperationProgressView.ROTATION_ANIMATION_DURATION);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        LbsInteractor$isLbsDisabled$1 lbsInteractor$isLbsDisabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof LbsInteractor$isLbsDisabled$1) {
            lbsInteractor$isLbsDisabled$1 = (LbsInteractor$isLbsDisabled$1) continuationImpl;
            int i2 = lbsInteractor$isLbsDisabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbsInteractor$isLbsDisabled$1.label = i2 - Integer.MIN_VALUE;
                obj = lbsInteractor$isLbsDisabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lbsInteractor$isLbsDisabled$1.label;
                q7y q7yVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    q7yVar.getClass();
                    lbsInteractor$isLbsDisabled$1.label = 1;
                    obj = this.a.b.b(lbsInteractor$isLbsDisabled$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            q7yVar.getClass();
                        }
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                if (!((o7y) obj).b) {
                    q7yVar.getClass();
                    return Boolean.FALSE;
                }
                lbsInteractor$isLbsDisabled$1.label = 2;
                obj = ((jbh) ((rqo) this.c.a)).f(SimplePersistentBooleanExperiment.DISABLE_LBS_PROVIDER).b(lbsInteractor$isLbsDisabled$1);
            }
        }
        lbsInteractor$isLbsDisabled$1 = new LbsInteractor$isLbsDisabled$1(this, continuationImpl);
        obj = lbsInteractor$isLbsDisabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lbsInteractor$isLbsDisabled$1.label;
        q7y q7yVar2 = this.b;
        if (i != 0) {
        }
        if (!((o7y) obj).b) {
        }
    }
}
