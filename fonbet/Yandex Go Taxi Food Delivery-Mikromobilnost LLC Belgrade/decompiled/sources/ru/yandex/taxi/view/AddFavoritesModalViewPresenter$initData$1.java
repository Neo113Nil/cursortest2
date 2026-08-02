package ru.yandex.taxi.view;

import com.yandex.go.address.models.Address;
import defpackage.atd0;
import defpackage.bvv;
import defpackage.g6u;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.view.AddFavoritesModalViewPresenter$initData$1", f = "AddFavoritesModalViewPresenter.kt", l = {185, 187, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddFavoritesModalViewPresenter$initData$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesModalViewPresenter$initData$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesModalViewPresenter$initData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFavoritesModalViewPresenter$initData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        if (defpackage.tje.k0(r3, r4, r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (ru.yandex.taxi.view.c.Kg(r8, (com.yandex.go.address.models.Address) r1, r7) == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Address address;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            bvv bvvVar = cVar.A;
            address = bvvVar.b;
            if (address == null) {
                tpr a = atd0.a(cVar.B, bvvVar.a, RoutePointType.POINT_B);
                this.label = 1;
                obj = e.y(a, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            failure = address;
            c cVar2 = this.this$0;
            if (!(failure instanceof Result.Failure)) {
                this.L$0 = failure;
                this.L$1 = null;
                this.label = 2;
            }
            c cVar3 = this.this$0;
            if (Result.a(failure) != null) {
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            failure = this.L$0;
            kotlin.b.b(obj);
            c cVar32 = this.this$0;
            if (Result.a(failure) != null) {
                cVar32.I.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                AddFavoritesModalViewPresenter$initData$1$3$1 addFavoritesModalViewPresenter$initData$1$3$1 = new AddFavoritesModalViewPresenter$initData$1$3$1(cVar32, null);
                this.L$0 = failure;
                this.L$1 = null;
                this.label = 3;
            }
            return zy11.a;
        }
        kotlin.b.b(obj);
        address = ((pv0) obj).a;
        failure = address;
        c cVar22 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
        }
        c cVar322 = this.this$0;
        if (Result.a(failure) != null) {
        }
        return zy11.a;
    }
}
