package ru.yandex.taxi.share_favorites.presenter;

import com.yandex.go.address.models.FavoriteAddress;
import defpackage.d6z;
import defpackage.ffp;
import defpackage.ljr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjr0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.share_favorites.presenter.ShareFavoritesPresenter$loadAddresses$1", f = "ShareFavoritesPresenter.kt", l = {56}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShareFavoritesPresenter$loadAddresses$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFavoritesPresenter$loadAddresses$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShareFavoritesPresenter$loadAddresses$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShareFavoritesPresenter$loadAddresses$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        a aVar;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        EmptyList emptyList = EmptyList.a;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar2 = this.this$0;
                ru.yandex.taxi.favorites.data.repo.a aVar3 = aVar2.D;
                this.L$0 = aVar2;
                this.label = 1;
                c = aVar3.c(false, this);
                if (c == coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar = aVar2;
                obj = c;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$0;
                b.b(obj);
            }
            ffp ffpVar = (ffp) obj;
            if (ffpVar == null || (list = ffpVar.a) == null) {
                list = emptyList;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(a.Kg(aVar, (FavoriteAddress) it.next()));
            }
            emptyList = arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        sjr0 sjr0Var = (sjr0) this.this$0.Dg();
        ljr0 ljr0Var = this.this$0.x;
        sjr0Var.showFavorites(emptyList, d6z.Y(ljr0Var, ljr0Var.l));
        return zy11.a;
    }
}
