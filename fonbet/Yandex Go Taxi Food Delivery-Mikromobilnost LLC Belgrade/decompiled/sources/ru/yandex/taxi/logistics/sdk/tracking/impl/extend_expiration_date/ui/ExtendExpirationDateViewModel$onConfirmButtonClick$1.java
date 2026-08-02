package ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui;

import com.yandex.delivery.utils.dialogmanager.ErrorDialogInteractor$requestUnknownErrorDialog$2;
import defpackage.fwo;
import defpackage.lwo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pd5;
import defpackage.qej;
import defpackage.tse;
import defpackage.wls;
import defpackage.zvo;
import defpackage.zy11;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui.ExtendExpirationDateViewModel$onConfirmButtonClick$1", f = "ExtendExpirationDateViewModel.kt", l = {MSException.ERROR_INVALID_PARAMETER, 103, 106}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ExtendExpirationDateViewModel$onConfirmButtonClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $selectedOption;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendExpirationDateViewModel$onConfirmButtonClick$1(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$selectedOption = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExtendExpirationDateViewModel$onConfirmButtonClick$1(this.this$0, this.$selectedOption, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExtendExpirationDateViewModel$onConfirmButtonClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0049, code lost:
    
        if (r2 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object c2;
        pd5 pd5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            fwo fwoVar = cVar.x;
            String str = cVar.b.a;
            String uuid = UUID.randomUUID().toString();
            String str2 = this.$selectedOption;
            this.label = 1;
            c = ((ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.a) fwoVar).c(str, uuid, str2, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = obj;
        }
        boolean booleanValue = ((Boolean) c).booleanValue();
        c cVar2 = this.this$0;
        if (booleanValue) {
            lwo lwoVar = (lwo) cVar2.D.a.getValue();
            zvo zvoVar = lwoVar != null ? lwoVar.a : null;
            qej qejVar = (!(zvoVar instanceof zvo) || (pd5Var = zvoVar.b) == null) ? null : new qej(pd5Var.a, pd5Var.b, pd5Var.c, null, pd5Var.d, false, null, null, 232);
            if (qejVar != null) {
                r0 r0Var = this.this$0.E;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                com.yandex.delivery.utils.dialogmanager.impl.b bVar = this.this$0.w;
                this.L$0 = null;
                this.label = 2;
                if (bVar.a(qejVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        r0 r0Var2 = cVar2.E;
        Boolean bool2 = Boolean.FALSE;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
        com.yandex.delivery.utils.dialogmanager.a aVar = this.this$0.A;
        this.label = 3;
        c2 = aVar.c(new ErrorDialogInteractor$requestUnknownErrorDialog$2(), this);
        if (c2 != coroutineSingletons) {
            return zy11Var;
        }
    }
}
