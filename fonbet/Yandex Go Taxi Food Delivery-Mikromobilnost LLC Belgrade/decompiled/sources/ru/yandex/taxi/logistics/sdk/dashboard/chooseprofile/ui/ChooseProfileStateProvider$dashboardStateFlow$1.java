package ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui;

import defpackage.bpc;
import defpackage.dms;
import defpackage.hhg;
import defpackage.ikg;
import defpackage.jkg;
import defpackage.kkg;
import defpackage.lkg;
import defpackage.lw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oig;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Llkg;", "loadingState", "", "isDarkTheme", "", "selectedId", "", "<unused var>", "Lqkg;", "<anonymous>", "(Llkg;ZLjava/lang/String;Ljava/util/Map;)Lqkg;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.ChooseProfileStateProvider$dashboardStateFlow$1", f = "ChooseProfileStateProvider.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ChooseProfileStateProvider$dashboardStateFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.ui.ChooseProfileStateProvider$dashboardStateFlow$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((lw) this.receiver).a((hhg) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseProfileStateProvider$dashboardStateFlow$1(d dVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ChooseProfileStateProvider$dashboardStateFlow$1 chooseProfileStateProvider$dashboardStateFlow$1 = new ChooseProfileStateProvider$dashboardStateFlow$1(this.this$0, (Continuation) obj5);
        chooseProfileStateProvider$dashboardStateFlow$1.L$0 = (lkg) obj;
        chooseProfileStateProvider$dashboardStateFlow$1.Z$0 = booleanValue;
        chooseProfileStateProvider$dashboardStateFlow$1.L$1 = (String) obj3;
        return chooseProfileStateProvider$dashboardStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lkg lkgVar = (lkg) this.L$0;
        boolean z = this.Z$0;
        String str = (String) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (lkgVar instanceof kkg) {
                return this.this$0.e;
            }
            if (lkgVar instanceof jkg) {
                return this.this$0.b.g(((jkg) lkgVar).a, str, z);
            }
            if (!(lkgVar instanceof ikg)) {
                w511.b();
                return null;
            }
            d dVar = this.this$0;
            ru.yandex.taxi.logistics.sdk.dashboard.chooseprofile.interactors.a aVar = dVar.c;
            bpc bpcVar = ((ikg) lkgVar).a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, dVar.d, lw.class, "onAction", "onAction(Lcom/yandex/delivery/mapper/model/DashboardAction;)V", 4);
            this.L$0 = null;
            this.L$1 = str;
            this.Z$0 = z;
            this.label = 1;
            if (aVar.a(bpcVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        d dVar2 = this.this$0;
        oig oigVar = dVar2.a.a;
        return oigVar != null ? dVar2.b.g(oigVar, str, z) : dVar2.e;
    }
}
