package ru.yandex.taxi.themes;

import android.content.Context;
import defpackage.clb1;
import defpackage.h3y;
import defpackage.kgx;
import defpackage.mo21;
import defpackage.nay0;
import defpackage.ny61;
import defpackage.pay0;
import defpackage.po21;
import defpackage.pz40;
import defpackage.rme0;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.w65;
import defpackage.zzs;
import java.util.Calendar;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.themes.experiments.DarkThemeSwitchExperiment;

/* loaded from: classes10.dex */
public final class g {
    public final Context a;
    public final ru.yandex.taxi.themes.experiments.e b;
    public final pay0 c;
    public final tt2 d;
    public final h3y e;
    public final h3y f;

    public g(Context context, ru.yandex.taxi.themes.experiments.e eVar, pay0 pay0Var, tt2 tt2Var, h3y h3yVar, h3y h3yVar2) {
        this.a = context;
        this.b = eVar;
        this.c = pay0Var;
        this.d = tt2Var;
        this.e = h3yVar;
        this.f = h3yVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, ContinuationImpl continuationImpl) {
        TaxiThemeChangeInteractor$calculateAutoTheme$1 taxiThemeChangeInteractor$calculateAutoTheme$1;
        int i;
        zzs zzsVar;
        pay0 pay0Var = gVar.c;
        if (continuationImpl instanceof TaxiThemeChangeInteractor$calculateAutoTheme$1) {
            taxiThemeChangeInteractor$calculateAutoTheme$1 = (TaxiThemeChangeInteractor$calculateAutoTheme$1) continuationImpl;
            int i2 = taxiThemeChangeInteractor$calculateAutoTheme$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiThemeChangeInteractor$calculateAutoTheme$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiThemeChangeInteractor$calculateAutoTheme$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiThemeChangeInteractor$calculateAutoTheme$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rme0 rme0Var = pay0Var.b;
                    kgx[] kgxVarArr = pay0.e;
                    float floatValue = ((Number) rme0Var.getValue(pay0Var, kgxVarArr[1])).floatValue();
                    float floatValue2 = ((Number) pay0Var.c.getValue(pay0Var, kgxVarArr[2])).floatValue();
                    if (floatValue != 0.0f && floatValue2 != 0.0f) {
                        zzsVar = new zzs(floatValue, floatValue2, 0, null, null, 28);
                        return clb1.b(Calendar.getInstance(), zzsVar);
                    }
                    po21 po21Var = (po21) gVar.e.get();
                    taxiThemeChangeInteractor$calculateAutoTheme$1.F$0 = floatValue;
                    taxiThemeChangeInteractor$calculateAutoTheme$1.F$1 = floatValue2;
                    taxiThemeChangeInteractor$calculateAutoTheme$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(taxiThemeChangeInteractor$calculateAutoTheme$1);
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
                zzsVar = ((mo21) obj).a();
                return clb1.b(Calendar.getInstance(), zzsVar);
            }
        }
        taxiThemeChangeInteractor$calculateAutoTheme$1 = new TaxiThemeChangeInteractor$calculateAutoTheme$1(gVar, continuationImpl);
        Object obj2 = taxiThemeChangeInteractor$calculateAutoTheme$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiThemeChangeInteractor$calculateAutoTheme$1.label;
        if (i != 0) {
        }
        zzsVar = ((mo21) obj2).a();
        return clb1.b(Calendar.getInstance(), zzsVar);
    }

    public static ThemeChangeMode b(DarkThemeSwitchExperiment darkThemeSwitchExperiment, ThemeChangeMode themeChangeMode) {
        if (!darkThemeSwitchExperiment.b) {
            return ThemeChangeMode.LIGHT;
        }
        if (themeChangeMode == null) {
            int i = nay0.b[darkThemeSwitchExperiment.e.ordinal()];
            if (i == 1) {
                return ThemeChangeMode.DARK;
            }
            if (i == 2) {
                return ThemeChangeMode.LIGHT;
            }
            if (i == 3) {
                return ThemeChangeMode.SYSTEM;
            }
            w511.b();
            return null;
        }
        int i2 = nay0.a[themeChangeMode.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
                if (!darkThemeSwitchExperiment.f) {
                    return ThemeChangeMode.LIGHT;
                }
            } else if (!darkThemeSwitchExperiment.d) {
                return ThemeChangeMode.LIGHT;
            }
        }
        return themeChangeMode;
    }

    public final Object c(tls tlsVar, Continuation continuation) {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new m0(ru.yandex.taxi.experiments.d.b(this.b.a), (pz40) this.c.d.getValue(), new TaxiThemeChangeInteractor$targetThemeFlow$1(3, null))), new TaxiThemeChangeInteractor$targetThemeFlow$$inlined$flatMapLatest$1(null, this)));
        this.d.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a).collect(new w65(1, tlsVar), continuation);
    }
}
