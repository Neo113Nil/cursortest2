package ru.yandex.taxi.search;

import android.graphics.drawable.PaintDrawable;
import defpackage.irg0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/PaintDrawable;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.search.AddressInputHolder$minorStyleBackground$1", f = "AddressInputHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class AddressInputHolder$minorStyleBackground$1 extends SuspendLambda implements tls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressInputHolder$minorStyleBackground$1(b bVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AddressInputHolder$minorStyleBackground$1(this.this$0, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AddressInputHolder$minorStyleBackground$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        PaintDrawable paintDrawable = new PaintDrawable(qje.t(xng0.bgMinor, this.this$0.b.a));
        paintDrawable.setCornerRadius(r1.getResources().getDimensionPixelSize(irg0.block_v2_corner_radius));
        return paintDrawable;
    }
}
