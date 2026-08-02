package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class fh1 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ hh1 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh1(Continuation continuation, hh1 hh1Var, String str, int i) {
        super(2, continuation);
        this.j = i;
        this.k = hh1Var;
        this.l = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new fh1(continuation, this.k, this.l, 0);
            default:
                return new fh1(continuation, this.k, this.l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((fh1) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        boolean containsKey;
        boolean contains;
        String str4;
        String str5;
        String str6;
        int i = 24;
        String str7 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i2 = 0;
        switch (this.j) {
            case 0:
                l18 l18Var = l18.b;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                hh1 hh1Var = this.k;
                g51 g51Var = hh1Var.b;
                String str8 = this.l;
                g51Var.getClass();
                str8.getClass();
                c01 c01Var = (c01) x97.D(g.a, new l5(g51Var, str8, objArr == true ? 1 : 0, i));
                if (c01Var == null) {
                    return null;
                }
                ArrayList b = hh1Var.a.b(str8);
                ArrayList arrayList = new ArrayList();
                Iterator it = b.iterator();
                while (true) {
                    int i3 = 2;
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = b.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            oq oqVar = (oq) next;
                            if (oqVar == null) {
                                su4.s(2, null, "DownloadedAlbumPredicate: album is null", null);
                                containsKey = false;
                            } else {
                                bdt I = hag.I(aaa.class);
                                qdc qdcVar = l18Var.a;
                                qdcVar.getClass();
                                containsKey = ((yca) ((aaa) qdcVar.C(I)).e.getValue()).a.containsKey(oqVar.a);
                            }
                            if (containsKey) {
                                arrayList2.add(next);
                            }
                        }
                        bdt I2 = hag.I(byb.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        if (((i4j) ((byb) qdcVar2.C(I2)).b(i4j.class)).h()) {
                            hs5 n = lxe.n((List) c01Var.t.getValue());
                            if (n != null) {
                                k68 k68Var = (k68) hh1Var.e.getValue();
                                a58 w = k68Var.a.w(n.b, n.a.a);
                                if (w == null) {
                                    x97.y(k68Var.c, null, null, new g68(k68Var, null, 0), 3);
                                }
                                if (w != null && (str3 = w.d) != null) {
                                    str2 = (String) avf.Q(str3);
                                }
                            }
                            str2 = null;
                        } else {
                            k68 k68Var2 = (k68) hh1Var.e.getValue();
                            k68Var2.getClass();
                            String u = k68Var2.a.u(str8);
                            vrc vrcVar = u != null ? new vrc(u) : null;
                            if (vrcVar != null && (str = vrcVar.a) != null) {
                                str2 = (String) avf.Q(str);
                            }
                            str2 = null;
                        }
                        return new na1(c01Var, null, new dnk(c01Var, arrayList2, arrayList), str2);
                    }
                    LinkedList linkedList = ((oq) it.next()).F;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : linkedList) {
                        mqs mqsVar = (mqs) obj2;
                        if (mqsVar == null) {
                            su4.s(i3, str7, "PermanentCachedTrackPredicate: track is null", str7);
                            contains = false;
                        } else {
                            bdt I3 = hag.I(uaa.class);
                            qdc qdcVar3 = l18Var.a;
                            qdcVar3.getClass();
                            contains = ((lja) ((e6q) ((uaa) qdcVar3.C(I3))).e.getValue()).a.contains(mqsVar.a);
                        }
                        if (contains) {
                            arrayList3.add(obj2);
                        }
                        str7 = null;
                        i3 = 2;
                    }
                    z75.t(arrayList, arrayList3);
                    str7 = null;
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                hh1 hh1Var2 = this.k;
                g51 g51Var2 = hh1Var2.b;
                String str9 = this.l;
                g51Var2.getClass();
                str9.getClass();
                c01 c01Var2 = (c01) x97.D(g.a, new l5(g51Var2, str9, objArr3 == true ? 1 : 0, i));
                if (c01Var2 == null) {
                    return null;
                }
                ArrayList b2 = hh1Var2.a.b(str9);
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = b2.iterator();
                while (it3.hasNext()) {
                    z75.t(arrayList4, ((oq) it3.next()).F);
                }
                l18 l18Var2 = l18.b;
                bdt I4 = hag.I(byb.class);
                qdc qdcVar4 = l18Var2.a;
                qdcVar4.getClass();
                if (((i4j) ((byb) qdcVar4.C(I4)).b(i4j.class)).h()) {
                    hs5 n2 = lxe.n((List) c01Var2.t.getValue());
                    if (n2 != null) {
                        k68 k68Var3 = (k68) hh1Var2.e.getValue();
                        a58 w2 = k68Var3.a.w(n2.b, n2.a.a);
                        if (w2 == null) {
                            x97.y(k68Var3.c, null, null, new g68(k68Var3, objArr2 == true ? 1 : 0, i2), 3);
                        }
                        if (w2 != null && (str6 = w2.d) != null) {
                            str5 = (String) avf.Q(str6);
                        }
                    }
                    str5 = null;
                } else {
                    k68 k68Var4 = (k68) hh1Var2.e.getValue();
                    k68Var4.getClass();
                    String u2 = k68Var4.a.u(str9);
                    vrc vrcVar2 = u2 != null ? new vrc(u2) : null;
                    if (vrcVar2 != null && (str4 = vrcVar2.a) != null) {
                        str5 = (String) avf.Q(str4);
                    }
                    str5 = null;
                }
                return new na1(c01Var2, null, new dnk(c01Var2, b2, arrayList4), str5);
        }
    }
}
