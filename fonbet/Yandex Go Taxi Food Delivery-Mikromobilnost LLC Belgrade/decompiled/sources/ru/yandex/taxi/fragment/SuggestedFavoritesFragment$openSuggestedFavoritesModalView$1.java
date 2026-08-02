package ru.yandex.taxi.fragment;

import com.ybsdk.widgets.common.BlendingGradientView;
import defpackage.bvv;
import defpackage.dmn;
import defpackage.ee0;
import defpackage.he0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9t0;
import defpackage.tse;
import defpackage.w030;
import defpackage.wls;
import defpackage.ze0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.SuggestedFavoritesFragment$openSuggestedFavoritesModalView$1", f = "SuggestedFavoritesFragment.kt", l = {BlendingGradientView.BASE_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class SuggestedFavoritesFragment$openSuggestedFavoritesModalView$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuggestedFavoritesFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedFavoritesFragment$openSuggestedFavoritesModalView$1(SuggestedFavoritesFragment suggestedFavoritesFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = suggestedFavoritesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuggestedFavoritesFragment$openSuggestedFavoritesModalView$1 suggestedFavoritesFragment$openSuggestedFavoritesModalView$1 = new SuggestedFavoritesFragment$openSuggestedFavoritesModalView$1(this.this$0, continuation);
        suggestedFavoritesFragment$openSuggestedFavoritesModalView$1.L$0 = obj;
        return suggestedFavoritesFragment$openSuggestedFavoritesModalView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestedFavoritesFragment$openSuggestedFavoritesModalView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bvv bvvVar;
        he0 he0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        ee0 addFavoritesModalViewFactory = this.this$0.getAddFavoritesModalViewFactory();
        w030 modalViewCoordinator = this.this$0.modalViewCoordinator();
        bvvVar = this.this$0.initDataForAddFavoritesScreen;
        bvv bvvVar2 = bvvVar == null ? null : bvvVar;
        ze0 addFavoritesScreenConfigProvider = this.this$0.getAddFavoritesScreenConfigProvider();
        SuggestedFavoritesFragment suggestedFavoritesFragment = this.this$0;
        dmn dmnVar = new dmn(5, suggestedFavoritesFragment, tseVar);
        p9t0 p9t0Var = new p9t0(21, suggestedFavoritesFragment);
        he0Var = suggestedFavoritesFragment.navigator;
        if (he0Var != null) {
            this.L$0 = null;
            this.label = 1;
            if (((ru.yandex.taxi.factories.a) addFavoritesModalViewFactory).a(modalViewCoordinator, bvvVar2, addFavoritesScreenConfigProvider, dmnVar, p9t0Var, he0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return zy11Var;
    }
}
