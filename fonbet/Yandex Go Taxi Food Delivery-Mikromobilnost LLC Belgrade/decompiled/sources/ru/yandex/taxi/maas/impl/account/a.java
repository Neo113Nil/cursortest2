package ru.yandex.taxi.maas.impl.account;

import defpackage.a200;
import defpackage.d200;
import defpackage.evu0;
import defpackage.h55;
import defpackage.i000;
import defpackage.j000;
import defpackage.jj3;
import defpackage.k000;
import defpackage.m7w0;
import defpackage.ny61;
import defpackage.rs2;
import defpackage.tje;
import defpackage.w030;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes5.dex */
public final class a extends h55 implements k000 {
    public final d200 D;
    public final rs2 E;
    public final w030 F;
    public final jj3 G;
    public final a200 H;
    public final m7w0 I;

    public a(d200 d200Var, rs2 rs2Var, w030 w030Var, jj3 jj3Var, a200 a200Var, m7w0 m7w0Var) {
        super(null);
        this.D = d200Var;
        this.E = rs2Var;
        this.F = w030Var;
        this.G = jj3Var;
        this.H = a200Var;
        this.I = m7w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, d200 d200Var, ContinuationImpl continuationImpl) {
        MaasAccountRouterImpl$awaitUrlOrNull$1 maasAccountRouterImpl$awaitUrlOrNull$1;
        int i;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof MaasAccountRouterImpl$awaitUrlOrNull$1) {
            maasAccountRouterImpl$awaitUrlOrNull$1 = (MaasAccountRouterImpl$awaitUrlOrNull$1) continuationImpl;
            int i2 = maasAccountRouterImpl$awaitUrlOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                maasAccountRouterImpl$awaitUrlOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = maasAccountRouterImpl$awaitUrlOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = maasAccountRouterImpl$awaitUrlOrNull$1.label;
                if (i != 0) {
                    b.b(obj);
                    String str2 = ((i000) ((ru.yandex.taxi.maas.impl.a) d200Var).i.getValue()).a.d;
                    if (!evu0.J(str2)) {
                        return str2;
                    }
                    maasAccountRouterImpl$awaitUrlOrNull$1.L$0 = null;
                    maasAccountRouterImpl$awaitUrlOrNull$1.L$1 = null;
                    maasAccountRouterImpl$awaitUrlOrNull$1.label = 1;
                    obj = e.y(((ru.yandex.taxi.maas.impl.a) d200Var).a(), maasAccountRouterImpl$awaitUrlOrNull$1);
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
                str = ((i000) obj).a.d;
                if (evu0.J(str)) {
                    return str;
                }
                return null;
            }
        }
        maasAccountRouterImpl$awaitUrlOrNull$1 = new MaasAccountRouterImpl$awaitUrlOrNull$1(aVar, continuationImpl);
        Object obj2 = maasAccountRouterImpl$awaitUrlOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = maasAccountRouterImpl$awaitUrlOrNull$1.label;
        if (i != 0) {
        }
        str = ((i000) obj2).a.d;
        if (evu0.J(str)) {
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new MaasAccountRouterImpl$onLaunch$1(this, (j000) obj, null), 3);
    }
}
