package com.yandex.passport.internal.usecase;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.os.Build;
import defpackage.cg6;
import defpackage.g84;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.x97;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class g1 extends androidx.core.app.n0 {
    public final Context b;
    public final com.yandex.passport.common.coroutine.a c;
    public final com.yandex.passport.internal.report.reporters.s d;
    public final SharedPreferences e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.report.reporters.s sVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        context.getClass();
        aVar.getClass();
        sVar.getClass();
        this.b = context;
        this.c = aVar;
        this.d = sVar;
        this.e = context.getSharedPreferences("passport_dependencies", 0);
    }

    @Override // androidx.core.app.n0
    public final /* bridge */ /* synthetic */ Object s(Object obj, rhw rhwVar) {
        return u(rhwVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|8|(1:(1:11)(2:15|16))(6:17|18|(1:20)(1:48)|21|22|(5:24|(5:26|(1:28)(1:38)|29|30|31)(1:39)|32|(1:34)(1:37)|(1:36))(2:40|(1:42)))|12|13))|51|6|7|8|(0)(0)|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0036, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0037, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Continuation continuation) {
        f1 f1Var;
        int i;
        Continuation continuation2;
        Context context = this.b;
        if (continuation instanceof f1) {
            f1Var = (f1) continuation;
            int i2 = f1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f1Var.l = i2 - Integer.MIN_VALUE;
                f1 f1Var2 = f1Var;
                Object obj = f1Var2.j;
                Object obj2 = nm6.a;
                i = f1Var2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    int i3 = Build.VERSION.SDK_INT;
                    long longVersionCode = i3 >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
                    try {
                        if (this.e.getLong("last_version", -1L) < longVersionCode) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
                                StringBuilder sb = new StringBuilder("Starting DependenciesReport ");
                                sb.append(i3 >= 28 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode() : r2.versionCode);
                                continuation2 = null;
                                com.yandex.passport.common.logger.a.c(bVar, null, sb.toString(), 8);
                            } else {
                                continuation2 = null;
                            }
                            this.d.v(longVersionCode);
                            f1Var2.l = 1;
                            Object V = x97.V(((com.yandex.passport.common.coroutine.b) this.c).d, new g84(this, longVersionCode, continuation2, 6), f1Var2);
                            if (V != obj2) {
                                V = Unit.a;
                            }
                            if (V == obj2) {
                                return obj2;
                            }
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Library versions in the current version have already been sent", 8);
                        }
                    } catch (Exception e) {
                        e = e;
                        String str = i3;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, str, "Error DependenciesReport: " + e, 8);
                        }
                        return Unit.a;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        f1Var = new f1(this, (cg6) continuation);
        f1 f1Var22 = f1Var;
        Object obj3 = f1Var22.j;
        Object obj22 = nm6.a;
        i = f1Var22.l;
        if (i != 0) {
        }
        return Unit.a;
    }
}
