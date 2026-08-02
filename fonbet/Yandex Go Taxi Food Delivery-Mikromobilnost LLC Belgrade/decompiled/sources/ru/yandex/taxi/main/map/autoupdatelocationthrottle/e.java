package ru.yandex.taxi.main.map.autoupdatelocationthrottle;

import defpackage.at3;
import defpackage.b34;
import defpackage.c34;
import defpackage.h3y;
import defpackage.hgx;
import defpackage.j73;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.scc;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;

/* loaded from: classes9.dex */
public final class e {
    public final b34 a;
    public final h3y b;

    public e(b34 b34Var, h3y h3yVar) {
        this.a = b34Var;
        this.b = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AutoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1 autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1;
        int i;
        if (continuationImpl instanceof AutoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1) {
            autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1 = (AutoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1) continuationImpl;
            int i2 = autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.L$0 = this;
                    autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.label = 1;
                    obj = this.a.a.b(autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (e) autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.L$0;
                    kotlin.b.b(obj);
                }
                return this.d((AutoUpdateUserLocationStrategyExperiment) obj);
            }
        }
        autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1 = new AutoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1(this, continuationImpl);
        Object obj2 = autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoUpdateUserLocationStrategyExperimentInteractor$getAndCheckExperiment$1.label;
        if (i != 0) {
        }
        return this.d((AutoUpdateUserLocationStrategyExperiment) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        AutoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1 autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1;
        int i;
        if (continuationImpl instanceof AutoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1) {
            autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1 = (AutoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1) continuationImpl;
            int i2 = autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1.label = 1;
                    obj = this.a.a.b(autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1);
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
                return new Long(((AutoUpdateUserLocationStrategyExperiment) obj).c);
            }
        }
        autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1 = new AutoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1(this, continuationImpl);
        Object obj2 = autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoUpdateUserLocationStrategyExperimentInteractor$getLocationUpdateDebounceMillis$1.label;
        if (i != 0) {
        }
        return new Long(((AutoUpdateUserLocationStrategyExperiment) obj2).c);
    }

    public final boolean c(hgx hgxVar, AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType) {
        String str;
        Number number = (Number) hgxVar.get();
        if (number != null && number.doubleValue() > 0.0d) {
            return true;
        }
        if (autoUpdateUserLocationStrategyType != null) {
            str = " for " + autoUpdateUserLocationStrategyType;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        String str2 = number == null ? "missing" : "<= 0";
        c34 c34Var = (c34) this.b.get();
        String p = unr0.p("experiment is off: ", hgxVar.getName(), " ", str2, str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        c34Var.getClass();
        c34.a(illegalArgumentException, p);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0170, code lost:
    
        if (c(new ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperimentInteractor$isThrottleParamsValid$5(r2, ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment.class, "highSpeedTimeThresholdMillis", "getHighSpeedTimeThresholdMillis()J", 0), null) != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AutoUpdateUserLocationStrategyExperiment d(AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment) {
        final AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment2 = autoUpdateUserLocationStrategyExperiment;
        boolean z = autoUpdateUserLocationStrategyExperiment2.b;
        AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType = autoUpdateUserLocationStrategyExperiment2.o;
        h3y h3yVar = this.b;
        if (!z) {
            ((c34) h3yVar.get()).getClass();
            return null;
        }
        Set f0 = j73.f0(new AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType[]{autoUpdateUserLocationStrategyExperiment2.n, autoUpdateUserLocationStrategyType});
        AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType2 = AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.WARMUP_COOLDOWN_STRATEGY;
        if (f0.contains(autoUpdateUserLocationStrategyType2)) {
            if (c(new PropertyReference0Impl(autoUpdateUserLocationStrategyExperiment2) { // from class: ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperimentInteractor$isWarmupCooldownParamsValid$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                public final Object get() {
                    return ((AutoUpdateUserLocationStrategyExperiment) this.receiver).p;
                }
            }, autoUpdateUserLocationStrategyType2) && c(new PropertyReference0Impl(autoUpdateUserLocationStrategyExperiment2) { // from class: ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperimentInteractor$isWarmupCooldownParamsValid$2
                @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                public final Object get() {
                    return ((AutoUpdateUserLocationStrategyExperiment) this.receiver).q;
                }
            }, autoUpdateUserLocationStrategyType2)) {
                int i = 0;
                List g = scc.g(new PropertyReference0Impl(autoUpdateUserLocationStrategyExperiment2) { // from class: ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperimentInteractor$isDiscoParamsValid$props$1
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                    public final Object get() {
                        return ((AutoUpdateUserLocationStrategyExperiment) this.receiver).r;
                    }
                }, new PropertyReference0Impl(autoUpdateUserLocationStrategyExperiment2) { // from class: ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperimentInteractor$isDiscoParamsValid$props$2
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                    public final Object get() {
                        return ((AutoUpdateUserLocationStrategyExperiment) this.receiver).s;
                    }
                }, new PropertyReference0Impl(autoUpdateUserLocationStrategyExperiment2) { // from class: ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperimentInteractor$isDiscoParamsValid$props$3
                    @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
                    public final Object get() {
                        return ((AutoUpdateUserLocationStrategyExperiment) this.receiver).t;
                    }
                });
                List list = g;
                boolean z2 = list instanceof Collection;
                if (!z2 || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((hgx) it.next()).get() != null && (i = i + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                if (i != 0) {
                    if (i != g.size()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((hgx) obj).get() == null) {
                                arrayList.add(obj);
                            }
                        }
                        String X = kotlin.collections.a.X(arrayList, null, null, null, new at3(11), 31);
                        c34 c34Var = (c34) h3yVar.get();
                        String p = oyr.p("experiment is off: disco params must be all present or all missing (missing: ", X, Extension.C_BRAKE);
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                        c34Var.getClass();
                        c34.a(illegalArgumentException, p);
                        return null;
                    }
                    if (!z2 || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (!c((hgx) it2.next(), AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.WARMUP_COOLDOWN_STRATEGY)) {
                                break;
                            }
                        }
                    }
                }
            }
            return null;
        }
        if (f0.contains(AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.THROTTLE_STRATEGY)) {
            if (c(new AutoUpdateUserLocationStrategyExperimentInteractor$isThrottleParamsValid$1(autoUpdateUserLocationStrategyExperiment2, AutoUpdateUserLocationStrategyExperiment.class, "lowSpeedCountThreshold", "getLowSpeedCountThreshold()J", 0), null) && c(new AutoUpdateUserLocationStrategyExperimentInteractor$isThrottleParamsValid$2(autoUpdateUserLocationStrategyExperiment, AutoUpdateUserLocationStrategyExperiment.class, "highSpeedCountThreshold", "getHighSpeedCountThreshold()J", 0), null) && c(new AutoUpdateUserLocationStrategyExperimentInteractor$isThrottleParamsValid$3(autoUpdateUserLocationStrategyExperiment, AutoUpdateUserLocationStrategyExperiment.class, "highSpeedLimitMetersPerSecond", "getHighSpeedLimitMetersPerSecond()D", 0), null) && c(new AutoUpdateUserLocationStrategyExperimentInteractor$isThrottleParamsValid$4(autoUpdateUserLocationStrategyExperiment, AutoUpdateUserLocationStrategyExperiment.class, "lowSpeedTimeThresholdMillis", "getLowSpeedTimeThresholdMillis()J", 0), null)) {
                autoUpdateUserLocationStrategyExperiment2 = autoUpdateUserLocationStrategyExperiment;
            }
            return null;
        }
        if (autoUpdateUserLocationStrategyType != AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.TIME_INTERVAL_STRATEGY || c(new PropertyReference0Impl(autoUpdateUserLocationStrategyExperiment2) { // from class: ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperimentInteractor$isTimeIntervalParamsValid$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, defpackage.hgx
            public final Object get() {
                return Long.valueOf(((AutoUpdateUserLocationStrategyExperiment) this.receiver).j);
            }
        }, null)) {
            return autoUpdateUserLocationStrategyExperiment2;
        }
        return null;
    }
}
