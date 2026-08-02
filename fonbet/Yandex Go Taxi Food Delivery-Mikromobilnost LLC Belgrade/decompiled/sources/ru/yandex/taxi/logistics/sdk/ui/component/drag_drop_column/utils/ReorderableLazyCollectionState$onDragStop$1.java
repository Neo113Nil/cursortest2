package ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sb2;
import defpackage.tse;
import defpackage.twt0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderableLazyCollectionState$onDragStop$1", f = "ReorderableLazyCollection.kt", l = {307, 308}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ReorderableLazyCollectionState$onDragStop$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $startOffset;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderableLazyCollectionState$onDragStop$1(e eVar, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$startOffset = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReorderableLazyCollectionState$onDragStop$1(this.this$0, this.$startOffset, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReorderableLazyCollectionState$onDragStop$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006b, code lost:
    
        if (androidx.compose.animation.core.a.d(r5, r6, r7, null, null, r10, 12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r14.f(r1, r13) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReorderableLazyCollectionState$onDragStop$1 reorderableLazyCollectionState$onDragStop$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.animation.core.a aVar = this.this$0.s;
            wu60 wu60Var = new wu60(this.$startOffset);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                reorderableLazyCollectionState$onDragStop$1 = this;
                reorderableLazyCollectionState$onDragStop$1.this$0.r.setValue(null);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        androidx.compose.animation.core.a aVar2 = this.this$0.s;
        wu60 wu60Var2 = new wu60(0L);
        twt0 G = sb2.G(0.0f, 400.0f, 1, new wu60((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        this.label = 2;
        reorderableLazyCollectionState$onDragStop$1 = this;
    }
}
