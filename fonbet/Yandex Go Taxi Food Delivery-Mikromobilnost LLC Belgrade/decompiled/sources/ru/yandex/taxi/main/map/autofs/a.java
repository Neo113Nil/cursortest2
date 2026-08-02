package ru.yandex.taxi.main.map.autofs;

import defpackage.ar3;
import defpackage.br3;
import defpackage.dr3;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar, dr3 dr3Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1 autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1;
        int i;
        br3 br3Var;
        Long l;
        ar3 ar3Var;
        if (continuation instanceof AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1) {
            autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1 = (AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment = (AutoUpdateUserLocationStrategyExperiment) obj;
                    if (autoUpdateUserLocationStrategyExperiment != null) {
                        AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType = autoUpdateUserLocationStrategyExperiment.n;
                        AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType2 = AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.WARMUP_COOLDOWN_STRATEGY;
                        if ((autoUpdateUserLocationStrategyType == autoUpdateUserLocationStrategyType2 || autoUpdateUserLocationStrategyExperiment.o == autoUpdateUserLocationStrategyType2) && (l = autoUpdateUserLocationStrategyExperiment.p) != null) {
                            long longValue = l.longValue();
                            Integer num = autoUpdateUserLocationStrategyExperiment.q;
                            if (num != null) {
                                long intValue = num.intValue();
                                Integer num2 = autoUpdateUserLocationStrategyExperiment.r;
                                if (num2 != null) {
                                    int intValue2 = num2.intValue();
                                    Integer num3 = autoUpdateUserLocationStrategyExperiment.s;
                                    if (num3 != null) {
                                        int intValue3 = num3.intValue();
                                        Integer num4 = autoUpdateUserLocationStrategyExperiment.t;
                                        if (num4 != null) {
                                            ar3Var = new ar3(intValue2, intValue3, num4.intValue());
                                            br3Var = new br3(longValue, intValue, ar3Var);
                                            autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$0 = null;
                                            autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$1 = null;
                                            autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$2 = null;
                                            autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$3 = null;
                                            autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.label = 1;
                                            if (this.a.emit(br3Var, autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        }
                                    }
                                }
                                ar3Var = null;
                                br3Var = new br3(longValue, intValue, ar3Var);
                                autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$0 = null;
                                autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$1 = null;
                                autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$2 = null;
                                autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$3 = null;
                                autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.label = 1;
                                if (this.a.emit(br3Var, autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    br3Var = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$0 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$1 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$2 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.L$3 = null;
                    autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(br3Var, autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1 = new AutoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoFsProtectionConfigProviderImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
