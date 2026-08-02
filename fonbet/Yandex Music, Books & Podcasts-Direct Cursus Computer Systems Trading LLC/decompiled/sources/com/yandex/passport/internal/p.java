package com.yandex.passport.internal;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.diary.w0;
import com.yandex.passport.internal.usecase.g1;
import com.yandex.passport.internal.usecase.o1;
import com.yandex.passport.internal.usecase.s1;
import defpackage.aur;
import defpackage.dfi;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.uob;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ PassportProcessGlobalComponent l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = passportProcessGlobalComponent;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p(this.l, continuation, 0);
            case 1:
                return new p(this.l, continuation, 1);
            case 2:
                return new p(this.l, continuation, 2);
            case 3:
                return new p(this.l, continuation, 3);
            case 4:
                return new p(this.l, continuation, 4);
            case 5:
                return new p(this.l, continuation, 5);
            case 6:
                return new p(this.l, continuation, 6);
            default:
                return new p(this.l, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0197, code lost:
    
        if (r8.g(r1, r7) == r0) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0180, code lost:
    
        if (r8 == r0) goto L100;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        PassportProcessGlobalComponent passportProcessGlobalComponent = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.config.j getAppAccountVisibilityConfigUseCase = passportProcessGlobalComponent.getGetAppAccountVisibilityConfigUseCase();
                    com.yandex.passport.common.core.b bVar = com.yandex.passport.common.core.b.c;
                    this.k = 1;
                    obj = getAppAccountVisibilityConfigUseCase.g(bVar, this);
                    break;
                } else if (i2 == 1) {
                    qgg.h0(obj);
                } else if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                if (((Boolean) obj).booleanValue()) {
                    s1 manageAccountsVisibilityForBlacklistedAppsUseCase = passportProcessGlobalComponent.getManageAccountsVisibilityForBlacklistedAppsUseCase();
                    Unit unit = Unit.a;
                    this.k = 2;
                    break;
                }
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.badges.j updateBadgesConfigUseCase = passportProcessGlobalComponent.getUpdateBadgesConfigUseCase();
                    com.yandex.passport.common.core.b bVar2 = com.yandex.passport.common.core.b.c;
                    this.k = 1;
                    if (updateBadgesConfigUseCase.g(bVar2, this) == nm6Var2) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.config.l updateConfigUseCase = passportProcessGlobalComponent.getUpdateConfigUseCase();
                    com.yandex.passport.common.core.b bVar3 = com.yandex.passport.common.core.b.c;
                    this.k = 1;
                    if (updateConfigUseCase.g(bVar3, this) == nm6Var3) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.rotation.j revokeQuarantineMasterTokenUseCase = passportProcessGlobalComponent.getRevokeQuarantineMasterTokenUseCase();
                    this.k = 1;
                    Object obj2 = Unit.a;
                    Object g = revokeQuarantineMasterTokenUseCase.g(obj2, this);
                    if (g == nm6Var4) {
                        obj2 = g;
                    }
                    if (obj2 == nm6Var4) {
                        break;
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    g1 limitedDependenciesReportUseCase = passportProcessGlobalComponent.getLimitedDependenciesReportUseCase();
                    Unit unit2 = Unit.a;
                    this.k = 1;
                    if (limitedDependenciesReportUseCase.g(unit2, this) == nm6Var5) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    o1 makeAllTokenMasterRelatedUseCase = passportProcessGlobalComponent.getMakeAllTokenMasterRelatedUseCase();
                    this.k = 1;
                    if (makeAllTokenMasterRelatedUseCase.a(this) == nm6Var6) {
                        break;
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    w0 diaryUploadUseCase = passportProcessGlobalComponent.getDiaryUploadUseCase();
                    Unit unit3 = Unit.a;
                    this.k = 1;
                    obj = diaryUploadUseCase.g(unit3, this);
                    if (obj == nm6Var7) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                Object obj3 = ((z7o) obj).a;
                Throwable a = z7o.a(obj3);
                if (a != null) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "diary uploaded with error", a);
                    }
                }
                if (!(obj3 instanceof t7o)) {
                    int intValue = ((Number) obj3).intValue();
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, dfi.c(intValue, "diary uploaded with ", " records"), 8);
                    }
                }
                break;
            default:
                nm6 nm6Var8 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    uob uobVar = ((com.yandex.passport.common.coroutine.b) passportProcessGlobalComponent.getCoroutineDispatchers()).e;
                    p pVar = new p(passportProcessGlobalComponent, continuation, 6);
                    this.k = 1;
                    if (x97.V(uobVar, pVar, this) == nm6Var8) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
