package ru.yandex.taxi.search;

import android.graphics.drawable.Drawable;
import com.yandex.go.coroutines.h;
import defpackage.cvw;
import defpackage.grg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.AddressInputHolder$setShadow$1", f = "AddressInputHolder.kt", l = {64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddressInputHolder$setShadow$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressInputHolder$setShadow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressInputHolder$setShadow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressInputHolder$setShadow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            bVar2.getClass();
            h hVar = bVar2.f;
            this.L$0 = bVar2;
            this.label = 2;
            Object a = hVar.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            bVar = bVar2;
        } else {
            if (i == 1) {
                b bVar3 = (b) this.L$0;
                kotlin.b.b(obj);
                cvw.b0(bVar3.a, (Drawable) obj, Integer.valueOf(grg0.address_input_holder_shadow_padding), Integer.valueOf(grg0.address_input_holder_shadow_padding));
                return zy11.a;
            }
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$0;
            kotlin.b.b(obj);
        }
        cvw.b0(bVar.a, (Drawable) obj, Integer.valueOf(grg0.address_input_holder_shadow_padding), Integer.valueOf(grg0.address_input_holder_shadow_padding));
        return zy11.a;
    }
}
