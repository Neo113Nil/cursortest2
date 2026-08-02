package defpackage;

import com.yandex.passport.internal.ui.bouncer.chooser.v;
import com.yandex.passport.internal.ui.bouncer.chooser.x;
import com.yandex.plus.bdui.plus.action.w;
import com.yandex.plus.core.kotlin.extensions.a;
import com.yandex.plus.core.kotlin.extensions.b;
import com.yandex.plus.core.templating.render.a0;
import com.yandex.plus.core.templating.render.z;
import com.yandex.plus.pay.adapter.api.j;
import com.yandex.plus.pay.adapter.internal.i;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.mobile.view.payment.methods.c;
import com.yandex.plus.pay.ui.core.mobile.view.payment.promos.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k32 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ k32(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Set set;
        Object vVar;
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                if (str.length() <= 1000) {
                    function1.invoke(str);
                }
                return Unit.a;
            case 2:
                ubi ubiVar = (ubi) obj;
                ubiVar.getClass();
                ubiVar.b(quj.b);
                function1.invoke(new n9b(ubiVar));
                lg3.D(ubiVar, 40);
                return Unit.a;
            case 3:
                Throwable th = (Throwable) obj;
                try {
                    r7o r7oVar = z7o.b;
                    Throwable th2 = (Throwable) function1.invoke(th);
                    boolean d = Intrinsics.d(th.getMessage(), th2.getMessage());
                    obj2 = th2;
                    if (!d) {
                        boolean d2 = Intrinsics.d(th2.getMessage(), th.toString());
                        obj2 = th2;
                        if (!d2) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th3) {
                    r7o r7oVar2 = z7o.b;
                    obj2 = new t7o(th3);
                }
                return (Throwable) (obj2 instanceof t7o ? null : obj2);
            case 4:
                return Long.valueOf(y2x.c0(((nsa) function1.invoke(obj)).a));
            case 5:
                function1.invoke((nsa) obj);
                return Unit.a;
            case 6:
                wof wofVar = (wof) obj;
                wofVar.getClass();
                wof Q = wofVar.Q();
                function1.invoke(Float.valueOf(Float.intBitsToFloat((int) (4294967295L & (Q != null ? Q.v(wofVar, 0L) : 0L)))));
                return Unit.a;
            case 7:
                glu gluVar = (glu) obj;
                gluVar.getClass();
                function1.invoke(gluVar);
                return Unit.a;
            case 8:
                oav oavVar = (oav) obj;
                oavVar.getClass();
                function1.invoke(oavVar);
                return Unit.a;
            case 9:
                v vVar2 = (v) obj;
                vVar2.getClass();
                function1.invoke(new x(vVar2));
                return Unit.a;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(str2);
                return Unit.a;
            case 11:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(str3);
                return Unit.a;
            case 12:
                obj.getClass();
                ThreadLocal threadLocal = a.a;
                b bVar = (b) threadLocal.get();
                if (bVar == null || (set = bVar.c) == null) {
                    set = q5b.a;
                }
                try {
                    threadLocal.set(new b(wop.j(set, a0.class)));
                    vVar = new w(function1.invoke(obj));
                    threadLocal.set(bVar);
                } catch (Throwable th4) {
                    try {
                        if (!(th4 instanceof a0)) {
                            throw th4;
                        }
                        z zVar = th4.a;
                        zVar.getClass();
                        vVar = new com.yandex.plus.bdui.plus.action.v(zVar);
                    } finally {
                        a.a.set(bVar);
                    }
                }
                return vVar;
            case 13:
                List list = (List) obj;
                list.getClass();
                if (function1 == null) {
                    return list;
                }
                List<PlusPayCompositeOffers.Offer> list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                for (PlusPayCompositeOffers.Offer offer : list2) {
                    offer.getClass();
                    arrayList.add(new i(offer));
                }
                List<j> list3 = (List) function1.invoke(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (j jVar : list3) {
                    i iVar = jVar instanceof i ? (i) jVar : null;
                    PlusPayCompositeOffers.Offer offer2 = iVar != null ? iVar.a : null;
                    if (offer2 != null) {
                        arrayList2.add(offer2);
                    }
                }
                return arrayList2;
            case 14:
                c cVar = (c) obj;
                cVar.getClass();
                function1.invoke(cVar.a);
                return Unit.a;
            default:
                f fVar = (f) obj;
                fVar.getClass();
                function1.invoke(fVar.a);
                return Unit.a;
        }
    }
}
