package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class iim implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jim b;

    public /* synthetic */ iim(jim jimVar, int i) {
        this.a = i;
        this.b = jimVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [c5b] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        pxm pxmVar;
        String str;
        ?? r0;
        switch (this.a) {
            case 0:
                jim jimVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(thb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                thb thbVar = (thb) qdcVar.C(I);
                String string = jimVar.requireArguments().getString("postGridUniversal:eventId");
                string.getClass();
                qxm a = thbVar.a.a(string);
                if (a == null || (pxmVar = a.e) == null || (str = pxmVar.b) == null) {
                    return null;
                }
                return new uhb(a, str);
            case 1:
                jim jimVar2 = this.b;
                aim aimVar = (aim) jimVar2.k.getValue();
                String string2 = jimVar2.requireArguments().getString("postGridUniversal:eventId");
                string2.getClass();
                aimVar.getClass();
                qxm a2 = aimVar.a.a(string2);
                if (a2 != null) {
                    if (a2 instanceof co1) {
                        List list = ((do1) ((co1) a2).e).c;
                        ArrayList arrayList = new ArrayList(list.size());
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((p7w) it.next()).a);
                        }
                        r0 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            c01 c01Var = (c01) it2.next();
                            c01Var.getClass();
                            r0.add(new hm1(ghh.P(c01Var), false));
                        }
                    } else if (a2 instanceof f30) {
                        List unmodifiableList = Collections.unmodifiableList(((g30) ((f30) a2).e).c);
                        ArrayList arrayList2 = new ArrayList(unmodifiableList.size());
                        Iterator it3 = unmodifiableList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((p7w) it3.next()).a);
                        }
                        r0 = new ArrayList(v75.o(arrayList2, 10));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            oq oqVar = (oq) it4.next();
                            lt B = lxe.B(oqVar);
                            List list2 = oqVar.n;
                            ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                            Iterator it5 = list2.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(ghh.O((zp2) it5.next()));
                            }
                            r0.add(new o20(B, arrayList3, false));
                        }
                    } else if (a2 instanceof u4m) {
                        List unmodifiableList2 = Collections.unmodifiableList(((v4m) ((u4m) a2).e).c);
                        unmodifiableList2.getClass();
                        List<vul> list3 = unmodifiableList2;
                        ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                        for (vul vulVar : list3) {
                            cvl cvlVar = vulVar.a;
                            cvlVar.getClass();
                            arrayList4.add(new a2g(bfg.J(cvlVar), vulVar.a.h, false));
                        }
                        r0 = arrayList4;
                    } else {
                        Assertions.fail("Unsupported EventData: " + a2);
                        r0 = c5b.a;
                    }
                    if (r0 != 0) {
                        return r0;
                    }
                }
                return c5b.a;
            case 2:
                jim jimVar3 = this.b;
                aim aimVar2 = (aim) jimVar3.k.getValue();
                String string3 = jimVar3.requireArguments().getString("postGridUniversal:eventId");
                string3.getClass();
                aimVar2.getClass();
                qxm a3 = aimVar2.a.a(string3);
                String str2 = a3 != null ? a3.a : null;
                return str2 == null ? "" : str2;
            case 3:
                jim jimVar4 = this.b;
                aim aimVar3 = (aim) jimVar4.k.getValue();
                String string4 = jimVar4.requireArguments().getString("postGridUniversal:eventId");
                string4.getClass();
                aimVar3.getClass();
                qxm a4 = aimVar3.a.a(string4);
                if (a4 == null) {
                    return null;
                }
                String str3 = a4.e.a;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        return str3;
                    }
                }
                String str4 = a4.b;
                if (str4 == null || str4.length() <= 0) {
                    return null;
                }
                return str4;
            default:
                this.b.requireActivity().getOnBackPressedDispatcher().d();
                return Unit.a;
        }
    }
}
