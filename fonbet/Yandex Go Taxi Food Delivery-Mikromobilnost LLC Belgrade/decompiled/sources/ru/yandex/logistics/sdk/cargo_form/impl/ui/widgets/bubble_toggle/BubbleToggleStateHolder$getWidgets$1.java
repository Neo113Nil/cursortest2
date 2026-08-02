package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.bubble_toggle;

import defpackage.bms;
import defpackage.cl91;
import defpackage.co6;
import defpackage.do6;
import defpackage.dty0;
import defpackage.eo6;
import defpackage.fo6;
import defpackage.go6;
import defpackage.hty0;
import defpackage.io6;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.lvi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sbv;
import defpackage.tcc;
import defpackage.w511;
import defpackage.x2s;
import defpackage.zn6;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "<unused var>", "Lgo6;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(ZLgo6;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.bubble_toggle.BubbleToggleStateHolder$getWidgets$1", f = "BubbleToggleStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BubbleToggleStateHolder$getWidgets$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BubbleToggleStateHolder$getWidgets$1(a aVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Boolean) obj).booleanValue();
        BubbleToggleStateHolder$getWidgets$1 bubbleToggleStateHolder$getWidgets$1 = new BubbleToggleStateHolder$getWidgets$1(this.this$0, (Continuation) obj4);
        bubbleToggleStateHolder$getWidgets$1.L$0 = (go6) obj2;
        bubbleToggleStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        return bubbleToggleStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r10.contains(r8.a) == true) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long o;
        boolean z;
        go6 go6Var = (go6) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (go6Var == null || this.this$0.e.C(go6Var)) {
            return EmptyList.a;
        }
        do6 do6Var = this.this$0.c;
        do6Var.getClass();
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = do6Var.a;
        String str = go6Var.c;
        ArrayList arrayList = go6Var.b;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            fo6 fo6Var = (fo6) it.next();
            boolean z3 = go6Var.d;
            Map map = j6sVar.a;
            if (z3) {
                Object obj2 = map.get(str);
                Collection collection = obj2 instanceof Collection ? (Collection) obj2 : null;
                z = false;
                if (collection != null) {
                }
                float value = fo6Var.b.getValue();
                String str2 = fo6Var.c;
                hty0 hty0Var = fo6Var.d;
                dty0 v = hty0Var == null ? aVar.v(hty0Var) : null;
                sbv sbvVar = fo6Var.e;
                lvi0 g = sbvVar == null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, sbvVar, null, null, 14) : null;
                boolean z4 = z;
                String str3 = fo6Var.a;
                String str4 = go6Var.c;
                boolean z5 = go6Var.d;
                x2s x2sVar = fo6Var.f;
                arrayList2.add(new zn6(z4, value, str2, v, g, x2sVar, new io6(str3, str4, z4, z5, x2sVar)));
            } else {
                z2 = jl40.l(map.get(str), fo6Var.a);
            }
            z = z2;
            float value2 = fo6Var.b.getValue();
            String str22 = fo6Var.c;
            hty0 hty0Var2 = fo6Var.d;
            if (hty0Var2 == null) {
            }
            sbv sbvVar2 = fo6Var.e;
            if (sbvVar2 == null) {
            }
            boolean z42 = z;
            String str32 = fo6Var.a;
            String str42 = go6Var.c;
            boolean z52 = go6Var.d;
            x2s x2sVar2 = fo6Var.f;
            arrayList2.add(new zn6(z42, value2, str22, v, g, x2sVar2, new io6(str32, str42, z42, z52, x2sVar2)));
        }
        fo6 fo6Var2 = (fo6) kotlin.collections.a.R(arrayList);
        if (fo6Var2 != null) {
            int i = co6.a[fo6Var2.b.ordinal()];
            if (i == 1) {
                o = cl91.o(4.0f, 8.0f);
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    w511.b();
                    return null;
                }
                o = cl91.o(2.0f, 4.0f);
            }
        } else {
            o = cl91.o(4.0f, 8.0f);
        }
        return Collections.singletonList(new eo6(arrayList2, go6Var.e, o, go6Var.a));
    }
}
