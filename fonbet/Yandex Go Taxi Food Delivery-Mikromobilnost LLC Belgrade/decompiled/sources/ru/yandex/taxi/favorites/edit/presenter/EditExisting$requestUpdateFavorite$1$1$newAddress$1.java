package ru.yandex.taxi.favorites.edit.presenter;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oln;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/address/models/FavoriteAddress;", "<anonymous>", "(Ltse;)Lcom/yandex/go/address/models/FavoriteAddress;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.edit.presenter.EditExisting$requestUpdateFavorite$1$1$newAddress$1", f = "EditExisting.kt", l = {211, 217}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EditExisting$requestUpdateFavorite$1$1$newAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ FavoriteAddressRequest $favoriteAddress;
    int label;
    final /* synthetic */ oln this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditExisting$requestUpdateFavorite$1$1$newAddress$1(oln olnVar, FavoriteAddressRequest favoriteAddressRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = olnVar;
        this.$favoriteAddress = favoriteAddressRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditExisting$requestUpdateFavorite$1$1$newAddress$1(this.this$0, this.$favoriteAddress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EditExisting$requestUpdateFavorite$1$1$newAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r6 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r6 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (FavoriteAddress) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (FavoriteAddress) obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean n = this.this$0.b.n();
        oln olnVar = this.this$0;
        if (n) {
            ru.yandex.taxi.favorites.data.repo.a aVar = olnVar.c;
            String id = olnVar.b.getId();
            int version = this.this$0.b.getVersion();
            FavoriteAddressRequest favoriteAddressRequest = this.$favoriteAddress;
            this.label = 1;
            obj = aVar.h(favoriteAddressRequest, id, version, this);
        } else {
            ru.yandex.taxi.favorites.data.repo.a aVar2 = olnVar.c;
            FavoriteAddressRequest favoriteAddressRequest2 = this.$favoriteAddress;
            this.label = 2;
            obj = aVar2.b(favoriteAddressRequest2, this);
        }
        return coroutineSingletons;
    }
}
