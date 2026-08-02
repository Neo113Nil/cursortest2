package ru.yandex.taxi.badge;

import defpackage.dms;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tj4;
import defpackage.w511;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.appdelegates.BadgeType;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lru/yandex/taxi/appdelegates/BadgeType;", "isPlusAvailable", "", "isYangoPayAvailable", "isBankQrAvailable", "isMiniWidgetsVisible"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.badge.BadgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1", f = "BadgeAvailabilityInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BadgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    /* synthetic */ boolean Z$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1(Continuation continuation, a aVar) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        boolean booleanValue4 = ((Boolean) obj4).booleanValue();
        BadgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1 badgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1 = new BadgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1((Continuation) obj5, this.this$0);
        badgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1.Z$0 = booleanValue;
        badgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1.Z$1 = booleanValue2;
        badgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1.Z$2 = booleanValue3;
        badgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1.Z$3 = booleanValue4;
        return badgeAvailabilityInteractorImpl$highestPriorityBadgeTypeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2 = this.Z$0;
        boolean z3 = this.Z$1;
        boolean z4 = this.Z$2;
        boolean z5 = this.Z$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        for (BadgeType badgeType : this.this$0.b.a()) {
            int i = tj4.a[badgeType.ordinal()];
            if (i == 1) {
                z = z2;
            } else if (i == 2) {
                z = z3;
            } else if (i == 3) {
                z = z4;
            } else {
                if (i != 4) {
                    w511.b();
                    return null;
                }
                z = z5;
            }
            if (!z) {
                badgeType = null;
            }
            if (badgeType != null) {
                return badgeType;
            }
        }
        return null;
    }
}
