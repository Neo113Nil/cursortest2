package ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pip0;
import defpackage.qip0;
import defpackage.vpr;
import defpackage.xhp0;
import defpackage.zii0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.scroll.ScrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3", f = "ScrollTagStateHolder.kt", l = {288}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class ScrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3 extends SuspendLambda implements zls {
    final /* synthetic */ zii0 $scrollBounds$inlined;
    final /* synthetic */ List $tags$inlined;
    final /* synthetic */ Anchor $targetAnchor$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3(Continuation continuation, e eVar, List list, zii0 zii0Var, Anchor anchor) {
        super(3, continuation);
        this.this$0 = eVar;
        this.$tags$inlined = list;
        this.$scrollBounds$inlined = zii0Var;
        this.$targetAnchor$inlined = anchor;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ScrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3 scrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3 = new ScrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3((Continuation) obj3, this.this$0, this.$tags$inlined, this.$scrollBounds$inlined, this.$targetAnchor$inlined);
        scrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3.L$0 = (vpr) obj;
        scrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return scrollTagStateHolder$tagFlow$lambda$1$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Anchor anchor = null;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            Float[] fArr = (Float[]) ((Object[]) this.L$1);
            e eVar = this.this$0;
            List list = this.$tags$inlined;
            zii0 zii0Var = this.$scrollBounds$inlined;
            Anchor anchor2 = this.$targetAnchor$inlined;
            eVar.getClass();
            ArrayList arrayList = new ArrayList();
            int length = fArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                Float f = fArr[i2];
                int i4 = i3 + 1;
                if (f != null) {
                    pip0 pip0Var = (pip0) kotlin.collections.a.S(i3, list);
                    if (pip0Var != null) {
                        if ((f.floatValue() < zii0Var.b ? Anchor.TOP : f.floatValue() > zii0Var.d ? Anchor.BOTTOM : anchor) == anchor2) {
                            obj2 = new qip0(pip0Var.b, pip0Var.a, new ScrollTagStateHolder$getAllAppropriateTags$1$1(1, eVar.a, xhp0.class, "scrollTo", "scrollTo(Ljava/lang/String;)V", 0));
                        }
                    }
                    obj2 = anchor;
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
                i2++;
                i3 = i4;
                anchor = null;
            }
            this.L$0 = anchor;
            this.L$1 = anchor;
            this.label = 1;
            if (vprVar.emit(arrayList, this) == coroutineSingletons) {
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
