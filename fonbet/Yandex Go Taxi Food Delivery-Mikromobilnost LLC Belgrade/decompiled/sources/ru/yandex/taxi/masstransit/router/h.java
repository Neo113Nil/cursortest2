package ru.yandex.taxi.masstransit.router;

import android.content.Context;
import defpackage.b611;
import defpackage.mu5;
import defpackage.ny61;
import defpackage.oe61;
import defpackage.pgd;
import defpackage.t130;
import defpackage.uj30;
import defpackage.w030;
import defpackage.wfd;
import defpackage.zj30;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.masstransit.domain.f0;

/* loaded from: classes6.dex */
public final class h extends pgd {
    public final Context F;
    public final uj30 G;
    public final w030 H;
    public final zj30 I;
    public final ru.yandex.taxi.masstransit.userlocation.a J;
    public final oe61 K;
    public final b611 L;
    public final mu5 M;

    public h(Context context, uj30 uj30Var, w030 w030Var, zj30 zj30Var, ru.yandex.taxi.masstransit.userlocation.a aVar, oe61 oe61Var, b611 b611Var, f0 f0Var) {
        super(0);
        this.F = context;
        this.G = uj30Var;
        this.H = w030Var;
        this.I = zj30Var;
        this.J = aVar;
        this.K = oe61Var;
        this.L = b611Var;
        this.M = new mu5(new t130(6, f0Var, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(h hVar, ContinuationImpl continuationImpl) {
        MtRouteInfoRouter$handleFocusUserLocation$1 mtRouteInfoRouter$handleFocusUserLocation$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof MtRouteInfoRouter$handleFocusUserLocation$1) {
            mtRouteInfoRouter$handleFocusUserLocation$1 = (MtRouteInfoRouter$handleFocusUserLocation$1) continuationImpl;
            int i2 = mtRouteInfoRouter$handleFocusUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtRouteInfoRouter$handleFocusUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtRouteInfoRouter$handleFocusUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtRouteInfoRouter$handleFocusUserLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.masstransit.userlocation.a aVar = hVar.J;
                    mtRouteInfoRouter$handleFocusUserLocation$1.label = 1;
                    if (aVar.a(mtRouteInfoRouter$handleFocusUserLocation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                hVar.G.c();
                return zy11.a;
            }
        }
        mtRouteInfoRouter$handleFocusUserLocation$1 = new MtRouteInfoRouter$handleFocusUserLocation$1(hVar, continuationImpl);
        Object obj2 = mtRouteInfoRouter$handleFocusUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtRouteInfoRouter$handleFocusUserLocation$1.label;
        if (i != 0) {
        }
        hVar.G.c();
        return zy11.a;
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.M;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.H;
    }

    @Override // defpackage.pgd
    public final boolean T() {
        return false;
    }
}
