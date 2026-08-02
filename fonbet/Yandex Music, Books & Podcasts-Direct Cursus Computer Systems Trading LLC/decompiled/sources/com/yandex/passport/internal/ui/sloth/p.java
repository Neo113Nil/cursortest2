package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.reporters.o1;
import defpackage.aur;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends aur implements Function2 {
    public /* synthetic */ Object j;
    public final /* synthetic */ StandaloneSlothActivity k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(StandaloneSlothActivity standaloneSlothActivity, Continuation continuation) {
        super(2, continuation);
        this.k = standaloneSlothActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        p pVar = new p(this.k, continuation);
        pVar.j = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        mm6 mm6Var = (mm6) this.j;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        StandaloneSlothActivity standaloneSlothActivity = this.k;
        x97.y(mm6Var, null, null, new l(standaloneSlothActivity, null, 0), 3);
        PassportProcessGlobalComponent passportProcessGlobalComponent = standaloneSlothActivity.a;
        if (passportProcessGlobalComponent == null) {
            Intrinsics.j("globalComponent");
            throw null;
        }
        o1 webAmReporter = passportProcessGlobalComponent.getWebAmReporter();
        x97.y(gld.e(getContext()), null, null, new n(standaloneSlothActivity.j().m, null, standaloneSlothActivity, webAmReporter, 0), 3);
        return x97.y(gld.e(getContext()), null, null, new n(standaloneSlothActivity.j().n, null, standaloneSlothActivity, webAmReporter, 1), 3);
    }
}
