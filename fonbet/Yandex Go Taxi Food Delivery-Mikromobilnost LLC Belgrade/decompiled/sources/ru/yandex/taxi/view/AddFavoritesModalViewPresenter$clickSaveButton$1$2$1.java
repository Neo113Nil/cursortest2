package ru.yandex.taxi.view;

import android.content.Context;
import com.yandex.go.address.models.FavoriteAddress;
import defpackage.ae0;
import defpackage.d4;
import defpackage.d6z;
import defpackage.iik0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.qd0;
import defpackage.s6k0;
import defpackage.tj60;
import defpackage.tse;
import defpackage.ud0;
import defpackage.uw4;
import defpackage.wls;
import defpackage.wz1;
import defpackage.xyg0;
import defpackage.ze0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.notification.SavedToFavoriteNotification;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.view.AddFavoritesModalViewPresenter$clickSaveButton$1$2$1", f = "AddFavoritesModalViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddFavoritesModalViewPresenter$clickSaveButton$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ FavoriteAddress $address;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesModalViewPresenter$clickSaveButton$1$2$1(c cVar, FavoriteAddress favoriteAddress, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$address = favoriteAddress;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesModalViewPresenter$clickSaveButton$1$2$1(this.this$0, this.$address, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AddFavoritesModalViewPresenter$clickSaveButton$1$2$1 addFavoritesModalViewPresenter$clickSaveButton$1$2$1 = (AddFavoritesModalViewPresenter$clickSaveButton$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        addFavoritesModalViewPresenter$clickSaveButton$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qd0.b bVar;
        String str;
        qd0.b bVar2;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        String str3 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        s6k0 s6k0Var = cVar.F;
        d4 d4Var = new d4(13, cVar);
        uw4 uw4Var = (uw4) ((ze0) s6k0Var.c);
        ud0 ud0Var = uw4Var.a;
        String b = uw4Var.b();
        qd0 a = ud0Var.a();
        qd0.a c = a.c(b);
        String Y = (c == null || (bVar2 = c.j) == null || (str2 = bVar2.a) == null) ? null : d6z.Y(a, str2);
        String str4 = Y == null ? "" : Y;
        String b2 = uw4Var.b();
        qd0 a2 = ud0Var.a();
        qd0.a c2 = a2.c(b2);
        if (c2 != null && (bVar = c2.j) != null && (str = bVar.b) != null) {
            str3 = d6z.Y(a2, str);
        }
        String str5 = str3 == null ? "" : str3;
        int i = xyg0.ic_favorite_suggest;
        if (str4.length() != 0 && str5.length() != 0) {
            SavedToFavoriteNotification savedToFavoriteNotification = new SavedToFavoriteNotification((Context) s6k0Var.a, str4, str5, i, "SavedToFavoriteNotification", new o8k0(18, d4Var, s6k0Var));
            ru.yandex.taxi.design.utils.c.z(new iik0(26, s6k0Var), savedToFavoriteNotification);
            ((tj60) s6k0Var.b).e(savedToFavoriteNotification);
            savedToFavoriteNotification.setExpiresListener(new wz1(13, s6k0Var));
            savedToFavoriteNotification.startExpiresTimer(5000L);
        }
        ((ae0) this.this$0.Dg()).dismissModalView(this.$address);
        return zy11.a;
    }
}
