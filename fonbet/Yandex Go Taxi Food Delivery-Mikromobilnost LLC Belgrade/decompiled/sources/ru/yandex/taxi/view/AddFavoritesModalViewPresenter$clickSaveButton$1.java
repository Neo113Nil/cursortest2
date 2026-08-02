package ru.yandex.taxi.view;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.FavoriteAddress;
import defpackage.eip;
import defpackage.g6u;
import defpackage.krl0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.sjh;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.view.AddFavoritesModalViewPresenter$clickSaveButton$1", f = "AddFavoritesModalViewPresenter.kt", l = {HProv.PP_CONTAINER_EXTENSION, HProv.PP_CONTAINER_EXTENSION_DEL, HProv.PP_LCD_QUERY, 145}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class AddFavoritesModalViewPresenter$clickSaveButton$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ eip $category;
    final /* synthetic */ String $name;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFavoritesModalViewPresenter$clickSaveButton$1(c cVar, String str, eip eipVar, Address address, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$name = str;
        this.$category = eipVar;
        this.$address = address;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFavoritesModalViewPresenter$clickSaveButton$1(this.this$0, this.$name, this.$category, this.$address, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFavoritesModalViewPresenter$clickSaveButton$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (defpackage.tje.k0(r3, r4, r8) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
    
        if (defpackage.tje.k0(r5, r7, r8) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0045, code lost:
    
        if (r9 == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
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
            pzt0 pzt0Var = this.this$0.N;
            if (pzt0Var != null) {
                this.label = 1;
                obj = pzt0Var.u0(this);
            }
            c cVar = this.this$0;
            String str = this.$name;
            eip eipVar = this.$category;
            Address address = this.$address;
            krl0 krl0Var = cVar.D;
            this.label = 2;
            obj = krl0Var.h(str, eipVar, address, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            failure = (FavoriteAddress) obj;
            c cVar2 = this.this$0;
            if (!(failure instanceof Result.Failure)) {
            }
            c cVar3 = this.this$0;
            if (Result.a(failure) != null) {
            }
            return zy11.a;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                failure = (FavoriteAddress) obj;
                c cVar22 = this.this$0;
                if (!(failure instanceof Result.Failure)) {
                    cVar22.I.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    AddFavoritesModalViewPresenter$clickSaveButton$1$2$1 addFavoritesModalViewPresenter$clickSaveButton$1$2$1 = new AddFavoritesModalViewPresenter$clickSaveButton$1$2$1(cVar22, (FavoriteAddress) failure, null);
                    this.L$0 = failure;
                    this.L$1 = null;
                    this.label = 3;
                }
                c cVar32 = this.this$0;
                if (Result.a(failure) != null) {
                }
                return zy11.a;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            failure = this.L$0;
            kotlin.b.b(obj);
            c cVar322 = this.this$0;
            if (Result.a(failure) != null) {
                cVar322.I.getClass();
                sjh sjhVar2 = uyj.a;
                g6u g6uVar2 = o400.a;
                AddFavoritesModalViewPresenter$clickSaveButton$1$3$1 addFavoritesModalViewPresenter$clickSaveButton$1$3$1 = new AddFavoritesModalViewPresenter$clickSaveButton$1$3$1(cVar322, null);
                this.L$0 = failure;
                this.L$1 = null;
                this.label = 4;
            }
            return zy11.a;
        }
        kotlin.b.b(obj);
        c cVar4 = this.this$0;
        String str2 = this.$name;
        eip eipVar2 = this.$category;
        Address address2 = this.$address;
        krl0 krl0Var2 = cVar4.D;
        this.label = 2;
        obj = krl0Var2.h(str2, eipVar2, address2, this);
        if (obj == coroutineSingletons) {
        }
        failure = (FavoriteAddress) obj;
        c cVar222 = this.this$0;
        if (!(failure instanceof Result.Failure)) {
        }
        c cVar3222 = this.this$0;
        if (Result.a(failure) != null) {
        }
        return zy11.a;
    }
}
