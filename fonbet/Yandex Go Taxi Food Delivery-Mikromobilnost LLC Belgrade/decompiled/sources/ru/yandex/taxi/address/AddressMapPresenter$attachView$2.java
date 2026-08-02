package ru.yandex.taxi.address;

import android.graphics.Bitmap;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoEntryPointAnalytics$EntryPointScreen;
import defpackage.a41;
import defpackage.g16;
import defpackage.mob0;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tse;
import defpackage.umb0;
import defpackage.wls;
import defpackage.ymb0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.AddressMapPresenter$attachView$2", f = "AddressMapPresenter.kt", l = {80, 91}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressMapPresenter$attachView$2 extends SuspendLambda implements wls {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapPresenter$attachView$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapPresenter$attachView$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapPresenter$attachView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        if (r2 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00d1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00bf -> B:6:0x0045). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        c cVar;
        r0 r0Var;
        Bitmap bitmap;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g16 b2 = this.this$0.z.b().b(this.this$0.y.a.d());
            this.label = 1;
            b = ru.yandex.taxi.utils.a.b(b2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i2 = this.I$0;
                a41 a41Var = (a41) this.L$9;
                Bitmap bitmap2 = (Bitmap) this.L$8;
                String str = (String) this.L$7;
                Object obj2 = this.L$5;
                n4u0 n4u0Var = (pz40) this.L$4;
                Bitmap bitmap3 = (Bitmap) this.L$1;
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
                n4u0 n4u0Var2 = n4u0Var;
                Bitmap bitmap4 = bitmap3;
                Object obj3 = obj2;
                String str2 = str;
                Bitmap bitmap5 = bitmap2;
                a41 a41Var2 = a41Var;
                int i3 = i2;
                a = obj;
                c cVar2 = cVar;
                r0Var = (r0) n4u0Var2;
                if (!r0Var.k(obj3, a41.a(a41Var2, null, null, null, null, null, null, new ymb0(i3 == 0, bitmap5, str2, (String) a), 63))) {
                    bitmap = bitmap4;
                    cVar = cVar2;
                    Object value = r0Var.getValue();
                    a41 a41Var3 = (a41) value;
                    String e = cVar.y.a.e();
                    mob0 mob0Var = cVar.y;
                    this.L$0 = cVar;
                    this.L$1 = bitmap;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = r0Var;
                    this.L$5 = value;
                    this.L$6 = null;
                    this.L$7 = e;
                    this.L$8 = bitmap;
                    this.L$9 = a41Var3;
                    this.I$0 = 1;
                    this.label = 2;
                    a = mob0Var.a();
                    if (a != coroutineSingletons) {
                        bitmap4 = bitmap;
                        n4u0Var2 = r0Var;
                        a41Var2 = a41Var3;
                        obj3 = value;
                        i3 = 1;
                        str2 = e;
                        bitmap5 = bitmap4;
                        c cVar22 = cVar;
                        r0Var = (r0) n4u0Var2;
                        if (!r0Var.k(obj3, a41.a(a41Var2, null, null, null, null, null, null, new ymb0(i3 == 0, bitmap5, str2, (String) a), 63))) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        Bitmap bitmap6 = (Bitmap) b;
        if (bitmap6 != null) {
            c cVar3 = this.this$0;
            ((umb0) cVar3.A).a(PickupFromPhotoEntryPointAnalytics$EntryPointScreen.CLARIFY);
            r0 r0Var2 = cVar3.K;
            if (cVar3.H) {
                cVar = cVar3;
                r0Var = r0Var2;
                bitmap = bitmap6;
                Object value2 = r0Var.getValue();
                a41 a41Var32 = (a41) value2;
                String e2 = cVar.y.a.e();
                mob0 mob0Var2 = cVar.y;
                this.L$0 = cVar;
                this.L$1 = bitmap;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = r0Var;
                this.L$5 = value2;
                this.L$6 = null;
                this.L$7 = e2;
                this.L$8 = bitmap;
                this.L$9 = a41Var32;
                this.I$0 = 1;
                this.label = 2;
                a = mob0Var2.a();
                if (a != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        return zy11.a;
    }
}
