package ru.yandex.taxi.view;

import defpackage.eip;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.model.FavoritesCategoryModel$Category;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.view.AddFavoritesModalViewPresenter$updateCategory$1", f = "AddFavoritesModalViewPresenter.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddFavoritesModalViewPresenter$updateCategory$1 extends SuspendLambda implements wls {
    final /* synthetic */ eip $favoriteCategoriesModel;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesModalViewPresenter$updateCategory$1(c cVar, eip eipVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$favoriteCategoriesModel = eipVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesModalViewPresenter$updateCategory$1(this.this$0, this.$favoriteCategoriesModel, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFavoritesModalViewPresenter$updateCategory$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        fe0 fe0Var = cVar.y;
        ge0 ge0Var = (ge0) cVar.J.getValue();
        eip eipVar = this.$favoriteCategoriesModel;
        fe0Var.getClass();
        boolean z = FavoritesCategoryModel$Category.NEW == (eipVar != null ? eipVar.a : null);
        List<eip> list = ge0Var.h;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (eip eipVar2 : list) {
            FavoritesCategoryModel$Category favoritesCategoryModel$Category = eipVar2.a;
            arrayList.add(new eip(favoritesCategoryModel$Category, eipVar2.b, eipVar2.c, favoritesCategoryModel$Category == (eipVar != null ? eipVar.a : null)));
        }
        ge0 a = ge0.a(ge0Var, null, null, null, arrayList, z, z, null, 3199);
        r0 r0Var = this.this$0.J;
        this.L$0 = null;
        this.label = 1;
        r0Var.emit(a, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
