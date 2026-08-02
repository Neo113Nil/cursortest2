package ru.yandex.taxi.layers.presentation.pickup;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import defpackage.aqb0;
import defpackage.bdc;
import defpackage.evu0;
import defpackage.g7h;
import defpackage.msb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.rol0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.common_models.net.map_object.BubbleStructure;
import ru.yandex.taxi.design.bubble.BubbleComponent;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Triple;", "", "Landroid/graphics/Bitmap;", "Laqb0;", "<destruct>", "<anonymous>", "(Lkotlin/Triple;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.pickup.PickupPointBubbleHandler$createRender$1$renderFlow$2", f = "PickupPointBubbleHandler.kt", l = {178}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PickupPointBubbleHandler$createRender$1$renderFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupPointBubbleHandler$createRender$1$renderFlow$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupPointBubbleHandler$createRender$1$renderFlow$2 pickupPointBubbleHandler$createRender$1$renderFlow$2 = new PickupPointBubbleHandler$createRender$1$renderFlow$2(this.this$0, continuation);
        pickupPointBubbleHandler$createRender$1$renderFlow$2.L$0 = obj;
        return pickupPointBubbleHandler$createRender$1$renderFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupPointBubbleHandler$createRender$1$renderFlow$2) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Object obj2 = null;
        if (i3 != 0) {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        String str = (String) triple.getFirst();
        Bitmap bitmap = (Bitmap) triple.getSecond();
        aqb0 aqb0Var = (aqb0) triple.getThird();
        b bVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 1;
        BubbleComponent bubbleComponent = bVar.g;
        Context context = bVar.d;
        pdc pdcVar = bVar.c;
        PickupPointBubbleView pickupPointBubbleView = bVar.f;
        if (!evu0.J(str) || bitmap != null) {
            String str2 = aqb0Var.b;
            Integer num = aqb0Var.d;
            BubbleStructure bubbleStructure = aqb0Var.c;
            ufu ufuVar = (ufu) pdcVar;
            int m = s8o.m(ufuVar.h(new bdc(xng0.textMain), str2), context);
            bubbleComponent.setBubbleColor(ufuVar.a(new bdc(xng0.bgMain), aqb0Var.a));
            pickupPointBubbleView.setImageBitmap(bitmap);
            pickupPointBubbleView.setTitle(str);
            pickupPointBubbleView.setTextColor(m);
            pickupPointBubbleView.setIconTint(m);
            BubbleStructure bubbleStructure2 = BubbleStructure.CAPSULE;
            if (bubbleStructure == bubbleStructure2) {
                i = 10;
                i2 = 4;
            } else {
                i = 8;
                i2 = 8;
            }
            pickupPointBubbleView.setPadding(tje.u(i, context), tje.u(i2, context), tje.u(i, context), tje.u(i2, context));
            g7h g7hVar = bVar.h;
            if (bubbleStructure != bubbleStructure2) {
                g7hVar.n(msb1.d(context, bubbleStructure, num, null));
            } else {
                g7hVar.n(msb1.d(context, BubbleStructure.UNKNOWN, null, null));
                xw31.r(bubbleComponent);
                Rect rect = g7hVar.y;
                g7hVar.n(msb1.d(context, bubbleStructure2, num, Integer.valueOf((((bubbleComponent.getMeasuredHeight() - bubbleComponent.getPaddingTop()) - bubbleComponent.getPaddingBottom()) - rect.top) - rect.bottom)));
            }
            obj2 = e.Q(new rol0(new PickupPointBubbleHandler$renderBubbleBitmap$2(bVar, null)), this);
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : obj2;
    }
}
