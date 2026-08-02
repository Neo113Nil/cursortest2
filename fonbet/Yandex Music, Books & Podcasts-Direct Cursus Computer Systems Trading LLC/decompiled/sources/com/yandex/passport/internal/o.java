package com.yandex.passport.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.k6;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class o extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ PassportProcessGlobalComponent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = passportProcessGlobalComponent;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new o(this.k, continuation, 0);
            case 1:
                return new o(this.k, continuation, 1);
            default:
                return new o(this.k, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((o) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                passportProcessGlobalComponent.getNotificationHelper().e();
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.core.accounts.n delayedAccountRepairer = passportProcessGlobalComponent.getDelayedAccountRepairer();
                delayedAccountRepairer.getClass();
                try {
                    ArrayList b = delayedAccountRepairer.a.b(delayedAccountRepairer.c.b());
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "tryInsertDelayedAccounts delayedAccounts: " + b, 8);
                    }
                    Iterator it = b.iterator();
                    while (it.hasNext()) {
                        delayedAccountRepairer.b.b((l) it.next(), com.yandex.passport.internal.analytics.j.r, true);
                    }
                } catch (Throwable th) {
                    com.yandex.passport.internal.report.reporters.r rVar = delayedAccountRepairer.d;
                    rVar.getClass();
                    rVar.n(k6.d, new ff(th));
                }
                break;
            default:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                List list = (List) passportProcessGlobalComponent.getFlagRepository().b(com.yandex.passport.internal.flags.o.w);
                Context applicationContext = passportProcessGlobalComponent.getApplicationContext();
                String packageName = applicationContext.getPackageName();
                int i2 = list.contains(packageName) ? 1 : 2;
                ComponentName componentName = new ComponentName(packageName, "com.yandex.passport.AuthSdk");
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager.getComponentEnabledSetting(componentName) != i2) {
                    packageManager.setComponentEnabledSetting(componentName, i2, 1);
                }
                break;
        }
        return Unit.a;
    }
}
