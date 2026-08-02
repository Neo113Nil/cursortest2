package ru.yandex.taxi.view;

import com.yandex.go.address.models.Address;
import defpackage.bvv;
import defpackage.cvv;
import defpackage.d6z;
import defpackage.ge0;
import defpackage.l91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qd0;
import defpackage.tse;
import defpackage.ud0;
import defpackage.uw4;
import defpackage.wls;
import defpackage.ze0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.view.AddFavoritesModalViewPresenter$setAddress$1", f = "AddFavoritesModalViewPresenter.kt", l = {217, 224}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddFavoritesModalViewPresenter$setAddress$1 extends SuspendLambda implements wls {
    final /* synthetic */ l91 $addressWithFlagIsInitAddress;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesModalViewPresenter$setAddress$1(c cVar, l91 l91Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$addressWithFlagIsInitAddress = l91Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesModalViewPresenter$setAddress$1(this.this$0, this.$addressWithFlagIsInitAddress, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFavoritesModalViewPresenter$setAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0030, code lost:
    
        if (r2 == r1) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0043  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object u0;
        Address address;
        Address address2;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            pzt0 pzt0Var = this.this$0.M;
            if (pzt0Var != null) {
                this.label = 1;
                u0 = pzt0Var.u0(this);
            }
            c cVar = this.this$0;
            l91 l91Var = this.$addressWithFlagIsInitAddress;
            boolean z2 = l91Var.b;
            address = l91Var.a;
            address2 = !z2 ? cVar.K : address;
            cVar.L = address2;
            r0 r0Var = cVar.J;
            ru.yandex.taxi.mappers.a aVar = cVar.x;
            if (address2 != null) {
                address = address2;
            }
            ge0 ge0Var = (ge0) r0Var.getValue();
            z = this.$addressWithFlagIsInitAddress.b;
            ze0 ze0Var = aVar.b;
            bvv bvvVar = aVar.a;
            uw4 uw4Var = (uw4) ze0Var;
            cvv d = uw4Var.d(bvvVar);
            str = !z ? d.a : d.b;
            if (z || !bvvVar.f) {
                str2 = address.getAddress().f;
                if (str2 == null) {
                    str2 = "";
                }
                String str6 = address.getAddress().g;
                str3 = str6 != null ? str6 : "";
                str4 = str;
                str5 = str2;
            } else {
                ud0 ud0Var = uw4Var.a;
                String b = uw4Var.b();
                qd0 a = ud0Var.a();
                qd0.a c = a.c(b);
                String Y = c != null ? d6z.Y(a, c.getH()) : null;
                str4 = str;
                str5 = Y != null ? Y : "";
                str3 = address.getAddress().e;
            }
            ge0 a2 = ge0.a(ge0Var, str4, str5, str3, null, false, false, null, 4081);
            this.label = 2;
            r0Var.emit(a2, this);
            return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        u0 = obj;
        c cVar2 = this.this$0;
        l91 l91Var2 = this.$addressWithFlagIsInitAddress;
        boolean z22 = l91Var2.b;
        address = l91Var2.a;
        if (!z22) {
        }
        cVar2.L = address2;
        r0 r0Var2 = cVar2.J;
        ru.yandex.taxi.mappers.a aVar2 = cVar2.x;
        if (address2 != null) {
        }
        ge0 ge0Var2 = (ge0) r0Var2.getValue();
        z = this.$addressWithFlagIsInitAddress.b;
        ze0 ze0Var2 = aVar2.b;
        bvv bvvVar2 = aVar2.a;
        uw4 uw4Var2 = (uw4) ze0Var2;
        cvv d2 = uw4Var2.d(bvvVar2);
        if (!z) {
        }
        if (z) {
        }
        str2 = address.getAddress().f;
        if (str2 == null) {
        }
        String str62 = address.getAddress().g;
        if (str62 != null) {
        }
        str4 = str;
        str5 = str2;
        ge0 a22 = ge0.a(ge0Var2, str4, str5, str3, null, false, false, null, 4081);
        this.label = 2;
        r0Var2.emit(a22, this);
        if (zy11Var != coroutineSingletons) {
        }
    }
}
