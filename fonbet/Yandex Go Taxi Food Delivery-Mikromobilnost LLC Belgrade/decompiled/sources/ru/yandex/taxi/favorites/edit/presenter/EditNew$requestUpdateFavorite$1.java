package ru.yandex.taxi.favorites.edit.presenter;

import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.FavoriteAddressRequest;
import defpackage.cgp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rmn;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.edit.presenter.EditNew$requestUpdateFavorite$1", f = "EditNew.kt", l = {187, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EditNew$requestUpdateFavorite$1 extends SuspendLambda implements wls {
    final /* synthetic */ FavoriteAddressRequest $favoriteAddress;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ rmn this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditNew$requestUpdateFavorite$1(rmn rmnVar, FavoriteAddressRequest favoriteAddressRequest, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rmnVar;
        this.$favoriteAddress = favoriteAddressRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditNew$requestUpdateFavorite$1(this.this$0, this.$favoriteAddress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EditNew$requestUpdateFavorite$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2, types: [rmn] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rmn rmnVar;
        rmn rmnVar2;
        FavoriteAddress favoriteAddress;
        rmn rmnVar3;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    rmn rmnVar4 = this.this$0;
                    FavoriteAddressRequest favoriteAddressRequest = this.$favoriteAddress;
                    try {
                        boolean n = rmnVar4.b.n();
                        ru.yandex.taxi.favorites.data.repo.a aVar = rmnVar4.e;
                        if (n) {
                            String id = rmnVar4.b.getId();
                            int version = rmnVar4.b.getVersion();
                            this.L$0 = rmnVar4;
                            this.L$1 = rmnVar4;
                            this.label = 1;
                            Serializable h = aVar.h(favoriteAddressRequest, id, version, this);
                            if (h != r0) {
                                rmn rmnVar5 = rmnVar4;
                                obj = h;
                                rmnVar = rmnVar5;
                                rmnVar2 = rmnVar5;
                                favoriteAddress = (FavoriteAddress) obj;
                                r0 = rmnVar2;
                            }
                        } else {
                            this.L$0 = rmnVar4;
                            this.L$1 = rmnVar4;
                            this.label = 2;
                            Serializable b = aVar.b(favoriteAddressRequest, this);
                            if (b != r0) {
                                rmn rmnVar6 = rmnVar4;
                                obj = b;
                                rmnVar = rmnVar6;
                                rmnVar3 = rmnVar6;
                                favoriteAddress = (FavoriteAddress) obj;
                                r0 = rmnVar3;
                            }
                        }
                        return r0;
                    } catch (Throwable th) {
                        th = th;
                        r0 = rmnVar4;
                        cgp cgpVar = (cgp) r0.a.Dg();
                        cgpVar.stopLoading();
                        cgpVar.handleSaveError(th);
                        return zy11.a;
                    }
                }
                if (i == 1) {
                    rmn rmnVar7 = (rmn) this.L$1;
                    rmnVar = (rmn) this.L$0;
                    kotlin.b.b(obj);
                    rmnVar2 = rmnVar7;
                    favoriteAddress = (FavoriteAddress) obj;
                    r0 = rmnVar2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rmn rmnVar8 = (rmn) this.L$1;
                    rmnVar = (rmn) this.L$0;
                    kotlin.b.b(obj);
                    rmnVar3 = rmnVar8;
                    favoriteAddress = (FavoriteAddress) obj;
                    r0 = rmnVar3;
                }
                cgp cgpVar2 = (cgp) rmnVar.a.Dg();
                if (cgpVar2 != null) {
                    cgpVar2.stopLoading();
                    if (rmnVar.b.n()) {
                        cgpVar2.onAddressUpdated(rmnVar.b.getId(), favoriteAddress);
                    } else {
                        cgpVar2.onAddressAdded(favoriteAddress);
                    }
                    cgpVar2.showSetAsDestinationButton();
                    cgpVar2.showDeleteButton();
                    cgpVar2.requestFocusOnSelectAsDestinationButton();
                    if (rmnVar.j.a().i) {
                        cgpVar2.onBack();
                    } else {
                        rmnVar.b = favoriteAddress;
                    }
                }
                rmnVar.a.Ng(rmnVar.b);
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return zy11.a;
    }
}
