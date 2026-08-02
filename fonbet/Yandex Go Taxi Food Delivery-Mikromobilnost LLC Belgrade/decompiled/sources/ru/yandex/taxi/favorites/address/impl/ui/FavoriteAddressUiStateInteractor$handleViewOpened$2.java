package ru.yandex.taxi.favorites.address.impl.ui;

import defpackage.mvg;
import defpackage.ndl0;
import defpackage.ny61;
import defpackage.uep;
import defpackage.wls;
import defpackage.x770;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luep;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Luep;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.address.impl.ui.FavoriteAddressUiStateInteractor$handleViewOpened$2", f = "FavoriteAddressUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FavoriteAddressUiStateInteractor$handleViewOpened$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteAddressUiStateInteractor$handleViewOpened$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FavoriteAddressUiStateInteractor$handleViewOpened$2 favoriteAddressUiStateInteractor$handleViewOpened$2 = new FavoriteAddressUiStateInteractor$handleViewOpened$2(this.this$0, continuation);
        favoriteAddressUiStateInteractor$handleViewOpened$2.L$0 = obj;
        return favoriteAddressUiStateInteractor$handleViewOpened$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FavoriteAddressUiStateInteractor$handleViewOpened$2 favoriteAddressUiStateInteractor$handleViewOpened$2 = (FavoriteAddressUiStateInteractor$handleViewOpened$2) create((uep) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        favoriteAddressUiStateInteractor$handleViewOpened$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uep uepVar = (uep) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ndl0 ndl0Var = this.this$0.g;
        String q = uepVar.e.q();
        String str = this.this$0.j;
        x770 x770Var = (x770) ndl0Var.b;
        x770Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("address", q);
        hashMap.put("source", str);
        x770Var.a.a("SaveToFavoritesAddress.Loaded", hashMap, 1, new HashMap());
        return zy11.a;
    }
}
