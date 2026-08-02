package defpackage;

import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.PlusPayPaymentLoadingView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.b;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.e;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.g;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.i;
import com.yandex.plus.webview.internal.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a37 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a37(e eVar, b bVar, f fVar, Continuation continuation) {
        super(3, continuation);
        this.j = 5;
        this.k = eVar;
        this.n = bVar;
        this.l = fVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                a37 a37Var = new a37((h37) this.n, (mm6) this.l, (Continuation) obj3, 0);
                a37Var.m = (List) obj;
                a37Var.k = (hm2) obj2;
                return a37Var.invokeSuspend(Unit.a);
            case 1:
                a37 a37Var2 = new a37((e57) this.n, (mm6) this.l, (Continuation) obj3, 1);
                a37Var2.m = (m47) obj;
                a37Var2.k = (hm2) obj2;
                return a37Var2.invokeSuspend(Unit.a);
            case 2:
                a37 a37Var3 = new a37((n7q) this.n, (e6l) this.l, (Continuation) obj3, 2);
                a37Var3.m = (rnh) obj;
                a37Var3.k = (cgh) obj2;
                return a37Var3.invokeSuspend(Unit.a);
            case 3:
                a37 a37Var4 = new a37((Integer) this.n, (Integer) this.l, (Continuation) obj3, 3);
                a37Var4.m = (y7p) obj;
                a37Var4.k = (y7p) obj2;
                return a37Var4.invokeSuspend(Unit.a);
            case 4:
                a37 a37Var5 = new a37((rjj) this.n, (xgd) this.l, (Continuation) obj3, 4);
                a37Var5.m = (g57) obj;
                a37Var5.k = (hm2) obj2;
                return a37Var5.invokeSuspend(Unit.a);
            default:
                a37 a37Var6 = new a37((e) this.k, (b) this.n, (f) this.l, (Continuation) obj3);
                a37Var6.m = (i) obj2;
                return a37Var6.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Integer num;
        Object obj4;
        int i = this.j;
        fm2 fm2Var = fm2.a;
        boolean z = true;
        Object obj5 = this.l;
        Object obj6 = this.n;
        Unit unit = null;
        r6 = null;
        rfk rfkVar = null;
        Unit unit2 = null;
        switch (i) {
            case 0:
                g0c g0cVar = ((h37) obj6).l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                List list = (List) this.m;
                hm2 hm2Var = (hm2) this.k;
                ArrayList y0 = CollectionsKt.y0(list);
                tqn tqnVar = new tqn();
                tqn tqnVar2 = new tqn();
                xqn xqnVar = new xqn();
                xqn xqnVar2 = new xqn();
                Iterator it = y0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (o8g.B((rfk) obj2)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                xqnVar2.a = obj2;
                xqn xqnVar3 = new xqn();
                xqnVar3.a = c5b.a;
                if (xqnVar2.a == null) {
                    if (Intrinsics.d(hm2Var, fm2Var)) {
                        qne s0 = gut.s0();
                        x60 x60Var = (x60) g0cVar;
                        x60Var.getClass();
                        x60Var.a(s0);
                    } else {
                        if (!(hm2Var instanceof gm2)) {
                            b6e.s();
                            return null;
                        }
                        qne B0 = gut.B0();
                        x60 x60Var2 = (x60) g0cVar;
                        x60Var2.getClass();
                        x60Var2.a(B0);
                        z = false;
                    }
                    tqnVar.a = z;
                    xqnVar3.a = y0;
                } else {
                    if (Intrinsics.d(hm2Var, fm2Var)) {
                        z75.z(y0, e27.w);
                        qne s02 = gut.s0();
                        x60 x60Var3 = (x60) g0cVar;
                        x60Var3.getClass();
                        x60Var3.a(s02);
                        xqnVar2.a = null;
                        tqnVar.a = true;
                    } else if (hm2Var instanceof gm2) {
                        qne C0 = gut.C0();
                        x60 x60Var4 = (x60) g0cVar;
                        x60Var4.getClass();
                        x60Var4.a(C0);
                        xqnVar2.a = null;
                        tqnVar.a = false;
                    }
                    Object obj7 = xqnVar2.a;
                    if (((rfk) obj7) != null) {
                        xqnVar3.a = CollectionsKt.g0(u75.j(obj7), y0);
                        unit = Unit.a;
                    }
                    if (unit == null) {
                        xqnVar3.a = y0;
                    }
                }
                return new z27(xqnVar3, tqnVar, xqnVar, tqnVar2);
            case 1:
                g0c g0cVar2 = ((e57) obj6).l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                m47 m47Var = (m47) this.m;
                hm2 hm2Var2 = (hm2) this.k;
                ArrayList y02 = CollectionsKt.y0(m47Var.a);
                tqn tqnVar3 = new tqn();
                tqn tqnVar4 = new tqn();
                xqn xqnVar4 = new xqn();
                xqn xqnVar5 = new xqn();
                Iterator it2 = y02.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        if (o8g.B((rfk) obj3)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                xqnVar5.a = obj3;
                xqn xqnVar6 = new xqn();
                xqnVar6.a = c5b.a;
                if (xqnVar5.a == null) {
                    if (Intrinsics.d(hm2Var2, fm2Var)) {
                        qne s03 = gut.s0();
                        x60 x60Var5 = (x60) g0cVar2;
                        x60Var5.getClass();
                        x60Var5.a(s03);
                    } else {
                        if (!(hm2Var2 instanceof gm2)) {
                            b6e.s();
                            return null;
                        }
                        qne B02 = gut.B0();
                        x60 x60Var6 = (x60) g0cVar2;
                        x60Var6.getClass();
                        x60Var6.a(B02);
                        z = false;
                    }
                    tqnVar3.a = z;
                    xqnVar6.a = y02;
                } else {
                    if (Intrinsics.d(hm2Var2, fm2Var)) {
                        z75.z(y02, e27.x);
                        qne s04 = gut.s0();
                        x60 x60Var7 = (x60) g0cVar2;
                        x60Var7.getClass();
                        x60Var7.a(s04);
                        xqnVar5.a = null;
                        tqnVar3.a = true;
                    } else if (hm2Var2 instanceof gm2) {
                        qne C02 = gut.C0();
                        x60 x60Var8 = (x60) g0cVar2;
                        x60Var8.getClass();
                        x60Var8.a(C02);
                        xqnVar5.a = null;
                        tqnVar3.a = false;
                    }
                    Object obj8 = xqnVar5.a;
                    if (((rfk) obj8) != null) {
                        xqnVar6.a = CollectionsKt.g0(u75.j(obj8), y02);
                        unit2 = Unit.a;
                    }
                    if (unit2 == null) {
                        xqnVar6.a = y02;
                    }
                }
                return new s47(xqnVar6, tqnVar3, xqnVar4, m47Var, tqnVar4);
            case 2:
                rnh rnhVar = (rnh) this.m;
                cgh cghVar = (cgh) this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                d6l d6lVar = (d6l) ((e6l) obj5);
                return new pgh((n7q) obj6, d6lVar.b, d6lVar.c, rnhVar, cghVar);
            case 3:
                y7p y7pVar = (y7p) this.m;
                y7p y7pVar2 = (y7p) this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (y7pVar == null && y7pVar2 != null) {
                    return new m7p(((Integer) obj6).intValue(), y7pVar2.b());
                }
                if (y7pVar == null || y7pVar2 == null || y7pVar.b() == y7pVar2.b() || (num = (Integer) obj5) == null) {
                    return null;
                }
                return new m7p(num.intValue(), y7pVar2.b());
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                g57 g57Var = (g57) this.m;
                hm2 hm2Var3 = (hm2) this.k;
                rjj rjjVar = (rjj) obj6;
                Object obj9 = ((xgd) obj5).f;
                rjjVar.getClass();
                List list2 = g57Var.a;
                wgk wgkVar = g57Var.b;
                ArrayList y03 = CollectionsKt.y0(list2);
                Iterator it3 = y03.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj4 = it3.next();
                        if (o8g.B((rfk) obj4)) {
                        }
                    } else {
                        obj4 = null;
                    }
                }
                rfk rfkVar2 = (rfk) obj4;
                g0c g0cVar3 = rjjVar.c;
                if (rfkVar2 == null) {
                    if (Intrinsics.d(hm2Var3, fm2Var)) {
                        ((x60) g0cVar3).a(gut.s0());
                    } else {
                        if (!(hm2Var3 instanceof gm2)) {
                            b6e.s();
                            return null;
                        }
                        ((x60) g0cVar3).a(gut.B0());
                        z = false;
                    }
                    return new njj(y03, z, wgkVar);
                }
                ArrayList arrayList = new ArrayList(y03);
                if (Intrinsics.d(hm2Var3, fm2Var)) {
                    z75.z(arrayList, k9i.A0);
                    ((x60) g0cVar3).a(gut.s0());
                } else if (hm2Var3 instanceof gm2) {
                    ((x60) g0cVar3).a(gut.C0());
                    z = false;
                } else {
                    z = false;
                    rfkVar = rfkVar2;
                }
                if (rfkVar != null) {
                    arrayList = CollectionsKt.g0(u75.j(rfkVar), arrayList);
                }
                return new njj(arrayList, z, wgkVar);
            default:
                i iVar = (i) this.m;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                e eVar = (e) this.k;
                b bVar = (b) obj6;
                PlusPayPaymentLoadingView plusPayPaymentLoadingView = bVar.a;
                f fVar = (f) obj5;
                s9f[] s9fVarArr = e.m;
                if (iVar instanceof g) {
                    eVar.x().setVisibility(8);
                    bVar.h();
                    plusPayPaymentLoadingView.setVisibility(0);
                    bVar.i(false);
                } else if (iVar instanceof h) {
                    eVar.x().setVisibility(8);
                    bVar.j(((h) iVar).a);
                } else {
                    if (!(iVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f)) {
                        b6e.s();
                        return null;
                    }
                    String str = eVar.k;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f fVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f) iVar;
                    String str2 = fVar2.a;
                    if (!Intrinsics.d(str, str2)) {
                        eVar.k = str2;
                        fVar.n(str2, null);
                    }
                    if (fVar2.b) {
                        eVar.x().setVisibility(0);
                        bVar.h();
                        plusPayPaymentLoadingView.setVisibility(8);
                        bVar.i(false);
                    } else {
                        eVar.x().setVisibility(8);
                        bVar.j(fVar2.c);
                    }
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a37(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
        this.l = obj2;
    }
}
