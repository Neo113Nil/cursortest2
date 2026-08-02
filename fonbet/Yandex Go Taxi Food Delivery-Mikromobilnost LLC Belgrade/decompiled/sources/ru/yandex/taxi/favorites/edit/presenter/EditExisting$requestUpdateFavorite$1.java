package ru.yandex.taxi.favorites.edit.presenter;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressRequest;
import defpackage.cgp;
import defpackage.kip;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oln;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.edit.presenter.EditExisting$requestUpdateFavorite$1", f = "EditExisting.kt", l = {209}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EditExisting$requestUpdateFavorite$1 extends SuspendLambda implements wls {
    final /* synthetic */ FavoriteAddressRequest $favoriteAddress;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oln this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditExisting$requestUpdateFavorite$1(oln olnVar, FavoriteAddressRequest favoriteAddressRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = olnVar;
        this.$favoriteAddress = favoriteAddressRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditExisting$requestUpdateFavorite$1(this.this$0, this.$favoriteAddress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EditExisting$requestUpdateFavorite$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oln olnVar;
        oln olnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                oln olnVar3 = this.this$0;
                FavoriteAddressRequest favoriteAddressRequest = this.$favoriteAddress;
                try {
                    olnVar3.f.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    EditExisting$requestUpdateFavorite$1$1$newAddress$1 editExisting$requestUpdateFavorite$1$1$newAddress$1 = new EditExisting$requestUpdateFavorite$1$1$newAddress$1(olnVar3, favoriteAddressRequest, null);
                    this.L$0 = olnVar3;
                    this.L$1 = olnVar3;
                    this.label = 1;
                    Object k0 = tje.k0(mdhVar, editExisting$requestUpdateFavorite$1$1$newAddress$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    olnVar = olnVar3;
                    obj = k0;
                    olnVar2 = olnVar;
                } catch (Throwable th) {
                    th = th;
                    olnVar = olnVar3;
                    cgp cgpVar = (cgp) olnVar.a.Dg();
                    cgpVar.stopLoading();
                    cgpVar.handleSaveError(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                olnVar = (oln) this.L$1;
                olnVar2 = (oln) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    cgp cgpVar2 = (cgp) olnVar.a.Dg();
                    cgpVar2.stopLoading();
                    cgpVar2.handleSaveError(th);
                    return zy11.a;
                }
            }
            FavoriteAddress favoriteAddress = (FavoriteAddress) obj;
            d dVar = olnVar2.a;
            kip kipVar = olnVar2.i;
            cgp cgpVar3 = (cgp) dVar.Dg();
            cgpVar3.stopLoading();
            if (olnVar2.b.n()) {
                cgpVar3.onAddressUpdated(olnVar2.b.getId(), favoriteAddress);
            } else {
                cgpVar3.onAddressAdded(favoriteAddress);
            }
            cgpVar3.showSetAsDestinationButton();
            if (kipVar.a().i) {
                cgpVar3.onBack();
            } else {
                olnVar2.b = favoriteAddress;
            }
            FavoriteAddress favoriteAddress2 = olnVar2.b;
            kipVar.c();
            dVar.Ng(favoriteAddress2);
            ((cgp) dVar.Dg()).requestFocusOnSelectAsDestinationButton();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
