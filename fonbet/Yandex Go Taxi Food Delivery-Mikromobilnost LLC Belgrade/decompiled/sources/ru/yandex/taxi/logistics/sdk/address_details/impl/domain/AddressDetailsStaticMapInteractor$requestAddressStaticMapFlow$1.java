package ru.yandex.taxi.logistics.sdk.address_details.impl.domain;

import android.graphics.Bitmap;
import defpackage.cj00;
import defpackage.fj00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p71;
import defpackage.vpr;
import defpackage.wls;
import defpackage.yi00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lq71;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.domain.AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1", f = "AddressDetailsStaticMapInteractor.kt", l = {25, 29, 36, 41, 43}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ fj00 $mapImageConfig;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1(fj00 fj00Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$mapImageConfig = fj00Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1 addressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1 = new AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1(this.$mapImageConfig, this.this$0, continuation);
        addressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1.L$0 = obj;
        return addressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        if (r0.emit(r3, r10) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bd, code lost:
    
        if (r0.emit(defpackage.m71.a, r10) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r0.emit(defpackage.o71.a, r10) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        if (r0.emit(defpackage.n71.a, r10) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cj00 cj00Var;
        Bitmap bitmap;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            if (this.$mapImageConfig == null) {
                this.L$0 = null;
                this.label = 1;
            } else {
                this.L$0 = vprVar;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                b.b(obj);
                fj00 fj00Var = this.$mapImageConfig;
                yi00 yi00Var = fj00Var.a;
                cj00 cj00Var2 = fj00Var.b;
                AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1 addressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1 = new AddressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1(this.this$0, yi00Var.b, null);
                this.L$0 = vprVar;
                this.L$1 = null;
                this.L$2 = cj00Var2;
                this.L$3 = null;
                this.label = 3;
                Object a = ru.yandex.taxi.logistics.sdk.utils.a.a(addressDetailsStaticMapInteractor$requestAddressStaticMapFlow$1$result$1, this);
                if (a != coroutineSingletons) {
                    cj00Var = cj00Var2;
                    obj = a;
                    bitmap = (Bitmap) obj;
                    if (bitmap == null) {
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                cj00Var = (cj00) this.L$2;
                b.b(obj);
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    p71 p71Var = new p71(bitmap, cj00Var);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 4;
                } else {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 5;
                }
            } else {
                if (i != 4 && i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        b.b(obj);
        return zy11.a;
    }
}
