package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.f0j0;
import defpackage.k6w;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderableCollectionItemScopeImpl$draggableHandle$1$2$1$1", f = "ReorderableLazyCollection.kt", l = {602}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ReorderableCollectionItemScopeImpl$draggableHandle$1$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ oz40 $handleOffset$delegate;
    final /* synthetic */ oz40 $handleSize$delegate;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ f0j0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableCollectionItemScopeImpl$draggableHandle$1$2$1$1(f0j0 f0j0Var, oz40 oz40Var, oz40 oz40Var2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = f0j0Var;
        this.$handleOffset$delegate = oz40Var;
        this.$handleSize$delegate = oz40Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReorderableCollectionItemScopeImpl$draggableHandle$1$2$1$1(this.this$0, this.$handleOffset$delegate, this.$handleSize$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReorderableCollectionItemScopeImpl$draggableHandle$1$2$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long e = wu60.e(((wu60) this.$handleOffset$delegate.getValue()).a, ((wu60) this.this$0.c.invoke()).a);
            float intBitsToFloat = (((int) (((k6w) this.$handleSize$delegate.getValue()).a >> 32)) / 2.0f) + Float.intBitsToFloat((int) (e >> 32));
            float intBitsToFloat2 = (((int) (((k6w) this.$handleSize$delegate.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / 2.0f) + Float.intBitsToFloat((int) (e & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(intBitsToFloat2));
            f0j0 f0j0Var = this.this$0;
            e eVar = f0j0Var.a;
            Integer num = f0j0Var.b;
            this.J$0 = e;
            this.J$1 = floatToRawIntBits;
            this.label = 1;
            if (eVar.g(num, floatToRawIntBits, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
