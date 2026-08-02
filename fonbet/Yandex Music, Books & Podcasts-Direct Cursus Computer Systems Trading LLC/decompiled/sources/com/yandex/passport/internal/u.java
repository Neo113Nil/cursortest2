package com.yandex.passport.internal;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.os.Build;
import com.yandex.passport.R;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.YMApplication;

/* loaded from: classes4.dex */
public final class u extends aur implements Function2 {
    public final /* synthetic */ YMApplication j;
    public final /* synthetic */ PassportProcessGlobalComponent k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(YMApplication yMApplication, PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation) {
        super(2, continuation);
        this.j = yMApplication;
        this.k = passportProcessGlobalComponent;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        YMApplication yMApplication = this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) yMApplication.getSystemService(ActivityManager.class)).getHistoricalProcessExitReasons(null, 0, 10);
                com.yandex.passport.internal.report.reporters.a0 exitReasonReporter = this.k.getExitReasonReporter();
                historicalProcessExitReasons.getClass();
                String string = yMApplication.getString(R.string.passport_process_name);
                string.getClass();
                exitReasonReporter.u(string, historicalProcessExitReasons);
            } catch (Throwable th) {
                com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can't get historical process exit reasons.", th);
                }
            }
        }
        return Unit.a;
    }
}
