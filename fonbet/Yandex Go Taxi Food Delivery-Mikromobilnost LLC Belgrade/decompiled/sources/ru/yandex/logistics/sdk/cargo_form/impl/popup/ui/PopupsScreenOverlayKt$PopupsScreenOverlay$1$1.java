package ru.yandex.logistics.sdk.cargo_form.impl.popup.ui;

import defpackage.kae0;
import defpackage.l3t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8e0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupsScreenOverlayKt$PopupsScreenOverlay$1$1", f = "PopupsScreenOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PopupsScreenOverlayKt$PopupsScreenOverlay$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ l3t0 $entries;
    final /* synthetic */ List<kae0> $popups;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupsScreenOverlayKt$PopupsScreenOverlay$1$1(List list, l3t0 l3t0Var, Continuation continuation) {
        super(2, continuation);
        this.$popups = list;
        this.$entries = l3t0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PopupsScreenOverlayKt$PopupsScreenOverlay$1$1(this.$popups, this.$entries, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PopupsScreenOverlayKt$PopupsScreenOverlay$1$1 popupsScreenOverlayKt$PopupsScreenOverlay$1$1 = (PopupsScreenOverlayKt$PopupsScreenOverlay$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        popupsScreenOverlayKt$PopupsScreenOverlay$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [l3t0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, r8e0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<kae0> list = this.$popups;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((kae0) it.next()).a);
        }
        Set N0 = kotlin.collections.a.N0(arrayList);
        List<kae0> list2 = this.$popups;
        ?? r1 = this.$entries;
        for (kae0 kae0Var : list2) {
            String str = kae0Var.a;
            ?? r4 = r1.get(str);
            if (r4 == 0) {
                r4 = new r8e0(kae0Var);
                r4.b.b(Boolean.TRUE);
                r1.put(str, r4);
            }
            r8e0 r8e0Var = (r8e0) r4;
            r8e0Var.a = kae0Var;
            r8e0Var.b.b(Boolean.TRUE);
        }
        Iterator it2 = this.$entries.b.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            String str2 = (String) entry.getKey();
            r8e0 r8e0Var2 = (r8e0) entry.getValue();
            if (!N0.contains(str2)) {
                r8e0Var2.b.b(Boolean.FALSE);
            }
        }
        return zy11.a;
    }
}
