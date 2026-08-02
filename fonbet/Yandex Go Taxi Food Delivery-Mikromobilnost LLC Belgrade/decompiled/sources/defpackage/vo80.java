package defpackage;

import com.yandex.go.places.api.navigation.CardRevealing;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.common_models.net.map_object.u;

/* loaded from: classes8.dex */
public final class vo80 implements xsd0 {
    public final nmx a;
    public final gcc0 b;
    public final cyx c;
    public final qc20 d;
    public final avi e;

    public vo80(nmx nmxVar, gcc0 gcc0Var, cyx cyxVar, qc20 qc20Var, avi aviVar) {
        this.a = nmxVar;
        this.b = gcc0Var;
        this.c = cyxVar;
        this.d = qc20Var;
        this.e = aviVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [lg80] */
    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        ti80 i;
        boolean z;
        boolean z2;
        svj svjVar;
        je80 a;
        je80 je80Var;
        qui quiVar;
        boolean z3;
        pi80 pi80Var = ((u) wsd0Var.getAction()).a;
        String str = ((u) wsd0Var.getAction()).b;
        Object obj = ag80.b;
        ag80 k = str != null ? j76.k(str.toLowerCase(Locale.ROOT)) : obj;
        String r = wsd0Var.r();
        String p = wsd0Var.p();
        Boolean bool = ((u) wsd0Var.getAction()).c;
        CardRevealing cardRevealing = jl40.l(bool, Boolean.TRUE) ? CardRevealing.EXPANDED : jl40.l(bool, Boolean.FALSE) ? CardRevealing.COMPACT : null;
        Float f = ((u) wsd0Var.getAction()).e;
        String s = wsd0Var.s();
        Boolean q = wsd0Var.q();
        i = bei.i(null, pi80Var.getB(), null);
        if (i != null) {
            hcc0 hcc0Var = (hcc0) this.b;
            hcc0Var.a();
            nmx nmxVar = this.a;
            ArrayList b = nmxVar.b();
            if (b != null && !b.isEmpty()) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    if (((jmx) it.next()) instanceof shz) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            final boolean u = this.d.u();
            final byx a2 = this.c.b.a();
            final byx m = bei.m();
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            if (z) {
                avi aviVar = this.e;
                z2 = z;
                aviVar.d = true;
                aviVar.c = true;
                WeakReference weakReference = aviVar.a;
                if (weakReference == null || (quiVar = (qui) weakReference.get()) == null) {
                    WeakReference weakReference2 = aviVar.b;
                    quiVar = weakReference2 != null ? (qui) weakReference2.get() : null;
                }
                if (quiVar != null) {
                    z3 = true;
                    quiVar.setHidden(true, false);
                } else {
                    z3 = true;
                }
                ref$BooleanRef.element = z3;
            } else {
                z2 = z;
            }
            bm50 bm50Var = new bm50(21, ref$BooleanRef, this);
            if (z2) {
                svjVar = guj.b;
            } else {
                ArrayList b2 = nmxVar.b();
                if (b2 != null && !b2.isEmpty()) {
                    Iterator it2 = b2.iterator();
                    while (it2.hasNext()) {
                        jmx jmxVar = (jmx) it2.next();
                        Iterator it3 = it2;
                        if ((jmxVar instanceof uvx0) && jl40.l(((uvx0) jmxVar).b(), "intercity")) {
                            svjVar = luj.b;
                            break;
                        }
                        it2 = it3;
                    }
                }
                svjVar = k.equals(obj) ? cuj.b : qvj.b;
            }
            svj svjVar2 = svjVar;
            if (cardRevealing != null || f != null) {
                je80 je80Var2 = je80.u;
                he80 b3 = fh4.b();
                if (cardRevealing != null) {
                    b3.m(cardRevealing);
                }
                if (f != null) {
                    b3.n(f.floatValue());
                }
                b3.e();
                b3.j();
                b3.b();
                if (u) {
                    b3.l();
                }
                a = b3.a();
            } else if (u) {
                je80 je80Var3 = je80.u;
                he80 b4 = fh4.b();
                b4.l();
                b4.j();
                a = b4.a();
            } else {
                je80Var = null;
                final int i2 = 0;
                final int i3 = 1;
                hcc0Var.b(new xl80(svjVar2, i, k, r, p, false, s, q, je80Var, null, new sls() { // from class: uo80
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i2;
                        zy11 zy11Var = zy11.a;
                        byx byxVar = m;
                        vo80 vo80Var = this;
                        boolean z4 = u;
                        switch (i4) {
                            case 0:
                                if (!z4) {
                                    vo80Var.c.b(byxVar);
                                    break;
                                }
                                break;
                            default:
                                if (!z4) {
                                    vo80Var.c.b(byxVar);
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, new sls() { // from class: uo80
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        byx byxVar = a2;
                        vo80 vo80Var = this;
                        boolean z4 = u;
                        switch (i4) {
                            case 0:
                                if (!z4) {
                                    vo80Var.c.b(byxVar);
                                    break;
                                }
                                break;
                            default:
                                if (!z4) {
                                    vo80Var.c.b(byxVar);
                                    break;
                                }
                                break;
                        }
                        return zy11Var;
                    }
                }, new xw8(u, this, a2, bm50Var, 5), 512), new r75(4, bm50Var));
            }
            je80Var = a;
            final int i22 = 0;
            final int i32 = 1;
            hcc0Var.b(new xl80(svjVar2, i, k, r, p, false, s, q, je80Var, null, new sls() { // from class: uo80
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i22;
                    zy11 zy11Var = zy11.a;
                    byx byxVar = m;
                    vo80 vo80Var = this;
                    boolean z4 = u;
                    switch (i4) {
                        case 0:
                            if (!z4) {
                                vo80Var.c.b(byxVar);
                                break;
                            }
                            break;
                        default:
                            if (!z4) {
                                vo80Var.c.b(byxVar);
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, new sls() { // from class: uo80
                @Override // defpackage.sls
                public final Object invoke() {
                    int i4 = i32;
                    zy11 zy11Var = zy11.a;
                    byx byxVar = a2;
                    vo80 vo80Var = this;
                    boolean z4 = u;
                    switch (i4) {
                        case 0:
                            if (!z4) {
                                vo80Var.c.b(byxVar);
                                break;
                            }
                            break;
                        default:
                            if (!z4) {
                                vo80Var.c.b(byxVar);
                                break;
                            }
                            break;
                    }
                    return zy11Var;
                }
            }, new xw8(u, this, a2, bm50Var, 5), 512), new r75(4, bm50Var));
        }
        return zy11.a;
    }
}
