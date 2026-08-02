package ru.yandex.taxi.plus.sdk.modal;

import android.content.Context;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.lifecycle.Lifecycle;
import com.yandex.plus.home.api.config.PlusHomeBundle;
import defpackage.a4d0;
import defpackage.b7p0;
import defpackage.bkd0;
import defpackage.d3d0;
import defpackage.d59;
import defpackage.fva0;
import defpackage.i3y;
import defpackage.jrd0;
import defpackage.kgz;
import defpackage.m9y0;
import defpackage.ny61;
import defpackage.rs5;
import defpackage.tse;
import defpackage.u2d0;
import defpackage.u3d0;
import defpackage.uyi;
import defpackage.x1d0;
import defpackage.x1i0;
import defpackage.x2d0;
import defpackage.yvf0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.cashback.sdk.c0;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.plus.repository.c;

/* loaded from: classes6.dex */
public final class a {
    public final u2d0 a;
    public final String b;
    public final yvf0 c;
    public final m9y0 d;
    public final i3y e = kotlin.a.b(LazyThreadSafetyMode.NONE, new b7p0(4, this));

    public a(u2d0 u2d0Var, String str, yvf0 yvf0Var, m9y0 m9y0Var) {
        this.a = u2d0Var;
        this.b = str;
        this.c = yvf0Var;
        this.d = m9y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, Lifecycle lifecycle, String str, String str2, String str3, PlusHomeBundle plusHomeBundle, jrd0 jrd0Var, d59 d59Var, ContinuationImpl continuationImpl) {
        SdkPlusHomeScreenFactory$createPlusWebHomeScreen$1 sdkPlusHomeScreenFactory$createPlusWebHomeScreen$1;
        int i;
        com.yandex.plus.home.feature.webviews.internal.container.a a;
        d3d0 d3d0Var;
        Runnable runnable;
        a4d0 a4d0Var;
        String str4;
        String str5;
        if (continuationImpl instanceof SdkPlusHomeScreenFactory$createPlusWebHomeScreen$1) {
            sdkPlusHomeScreenFactory$createPlusWebHomeScreen$1 = (SdkPlusHomeScreenFactory$createPlusWebHomeScreen$1) continuationImpl;
            int i2 = sdkPlusHomeScreenFactory$createPlusWebHomeScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sdkPlusHomeScreenFactory$createPlusWebHomeScreen$1.label = i2 - Integer.MIN_VALUE;
                SdkPlusHomeScreenFactory$createPlusWebHomeScreen$1 sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12 = sdkPlusHomeScreenFactory$createPlusWebHomeScreen$1;
                Object obj = sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.label;
                u2d0 u2d0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fva0.f(this.d.a, "PlusWebHome", PerformanceAnalytics$Type.Creating, 0L, 4);
                    uyi uyiVar = u2d0Var.n;
                    x2d0 x2d0Var = u2d0Var.c;
                    boolean booleanValue = ((Boolean) uyiVar.get()).booleanValue();
                    int i3 = booleanValue ? x1i0.Component_Dark : x1i0.Component_Light;
                    ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i3);
                    a4d0 a4d0Var2 = new a4d0(new bkd0(this.b, str), x2d0Var.d);
                    int i4 = i3;
                    a = ((com.yandex.plus.home.feature.webviews.internalapi.factory.a) this.e.getValue()).a(context, new rs5(plusHomeBundle, this, contextThemeWrapper, lifecycle, str, str2, d59Var));
                    d3d0Var = u2d0Var.f;
                    c0 c0Var = x2d0Var.e;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$0 = null;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$1 = null;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$2 = str;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$3 = null;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$4 = null;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$5 = null;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$6 = null;
                    runnable = jrd0Var;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$7 = runnable;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$8 = null;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$9 = null;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$10 = a4d0Var2;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$11 = a;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$12 = d3d0Var;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$13 = str3;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.Z$0 = booleanValue;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.I$0 = i4;
                    sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.label = 1;
                    obj = c0Var.c.a(sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    a4d0Var = a4d0Var2;
                    str4 = str;
                    str5 = str3;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str6 = (String) sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$13;
                    d3d0Var = (d3d0) sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$12;
                    a = (com.yandex.plus.home.feature.webviews.internal.container.a) sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$11;
                    a4d0 a4d0Var3 = (a4d0) sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$10;
                    runnable = (Runnable) sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$7;
                    String str7 = (String) sdkPlusHomeScreenFactory$createPlusWebHomeScreen$12.L$2;
                    kotlin.b.b(obj);
                    str5 = str6;
                    a4d0Var = a4d0Var3;
                    str4 = str7;
                }
                d3d0 d3d0Var2 = d3d0Var;
                com.yandex.plus.home.feature.webviews.internal.container.a aVar = a;
                Runnable runnable2 = runnable;
                Map map = (Map) obj;
                kgz kgzVar = u2d0Var.m;
                c cVar = u2d0Var.h;
                com.yandex.go.payments.plus.domain.c cVar2 = u2d0Var.c.c;
                x1d0 x1d0Var = u2d0Var.b;
                u3d0 u3d0Var = u2d0Var.j;
                ru.yandex.taxi.plus.sdk.prefetch.a aVar2 = u2d0Var.g;
                tse tseVar = u2d0Var.e;
                m9y0 m9y0Var = this.d;
                b bVar = new b(aVar, d3d0Var2, str5, map, kgzVar, a4d0Var, cVar, cVar2, str4, runnable2, m9y0Var, x1d0Var, u3d0Var, aVar2, tseVar);
                fva0.b(m9y0Var.a, "PlusWebHome", PerformanceAnalytics$Type.Creating, null, 4);
                return bVar;
            }
        }
        sdkPlusHomeScreenFactory$createPlusWebHomeScreen$1 = new SdkPlusHomeScreenFactory$createPlusWebHomeScreen$1(this, continuationImpl);
        SdkPlusHomeScreenFactory$createPlusWebHomeScreen$1 sdkPlusHomeScreenFactory$createPlusWebHomeScreen$122 = sdkPlusHomeScreenFactory$createPlusWebHomeScreen$1;
        Object obj2 = sdkPlusHomeScreenFactory$createPlusWebHomeScreen$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sdkPlusHomeScreenFactory$createPlusWebHomeScreen$122.label;
        u2d0 u2d0Var2 = this.a;
        if (i != 0) {
        }
        d3d0 d3d0Var22 = d3d0Var;
        com.yandex.plus.home.feature.webviews.internal.container.a aVar3 = a;
        Runnable runnable22 = runnable;
        Map map2 = (Map) obj2;
        kgz kgzVar2 = u2d0Var2.m;
        c cVar3 = u2d0Var2.h;
        com.yandex.go.payments.plus.domain.c cVar22 = u2d0Var2.c.c;
        x1d0 x1d0Var2 = u2d0Var2.b;
        u3d0 u3d0Var2 = u2d0Var2.j;
        ru.yandex.taxi.plus.sdk.prefetch.a aVar22 = u2d0Var2.g;
        tse tseVar2 = u2d0Var2.e;
        m9y0 m9y0Var2 = this.d;
        b bVar2 = new b(aVar3, d3d0Var22, str5, map2, kgzVar2, a4d0Var, cVar3, cVar22, str4, runnable22, m9y0Var2, x1d0Var2, u3d0Var2, aVar22, tseVar2);
        fva0.b(m9y0Var2.a, "PlusWebHome", PerformanceAnalytics$Type.Creating, null, 4);
        return bVar2;
    }
}
