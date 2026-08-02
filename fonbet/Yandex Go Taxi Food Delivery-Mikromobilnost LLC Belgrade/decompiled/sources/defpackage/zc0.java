package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ui.b;
import com.yandex.messaging.ui.settings.folder.addChat.g;
import java.util.List;
import java.util.Set;

/* loaded from: classes11.dex */
public final class zc0 implements bms {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public zc0(List list, bpl0 bpl0Var, yur yurVar, f530 f530Var, tls tlsVar) {
        this.b = list;
        this.w = bpl0Var;
        this.x = yurVar;
        this.y = f530Var;
        this.c = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        f530 f530Var;
        int i2;
        f530 f530Var2;
        int i3 = this.a;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        List list = this.b;
        switch (i3) {
            case 0:
                u4y u4yVar = (u4y) obj;
                int intValue = ((Number) obj2).intValue();
                fid fidVar = (fid) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((bts) fidVar).k(u4yVar) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= fidVar.c(intValue) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(i & 1, (i & 147) != 146)) {
                    m5f m5fVar = (m5f) list.get(intValue);
                    btsVar.e0(-1452187382);
                    boolean z = intValue == scc.f((List) obj7);
                    f530 f530Var3 = c530.a;
                    f530 c = ljs0.c(f530Var3, 1.0f);
                    if (z) {
                        qnm.e.getClass();
                        f530Var = ymb1.l(f530Var3, cyk0.e(0.0f, 0.0f, 24.0f, 24.0f, 3));
                    } else {
                        f530Var = f530Var3;
                    }
                    f530 k = c.k(f530Var);
                    qnm qnmVar = qnm.a;
                    f530 b = m4m0.b(k, qnm.c(btsVar).a(), qke.q);
                    if (z) {
                        qnm.d.getClass();
                        f530Var3 = an91.o(f530Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    }
                    g.f(m5fVar, ((Set) obj6).contains(m5fVar.a), this.c, (pa90) obj5, u3a1.d(b.k(f530Var3), "folder_add_chats_list_chat_filter"), btsVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                u4y u4yVar2 = (u4y) obj;
                int intValue3 = ((Number) obj2).intValue();
                fid fidVar2 = (fid) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = intValue4 | (((bts) fidVar2).k(u4yVar2) ? 4 : 2);
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= fidVar2.c(intValue3) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
                    g0v g0vVar = (g0v) list.get(intValue3);
                    btsVar2.e0(-1979710985);
                    ii8 ii8Var = new ii8(intValue3, 8);
                    f530 f530Var4 = c530.a;
                    f530 e = fi91.e(fnq0.b(f530Var4, false, ii8Var), new j0v(intValue3, ((bpl0) obj7).a.size(), (yur) obj6));
                    if (intValue3 == 0) {
                        f530Var2 = f530Var4;
                        f530Var4 = an91.o(f530Var2, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    } else {
                        f530Var2 = f530Var4;
                    }
                    if ((g0vVar instanceof rzu) || (g0vVar instanceof e0v)) {
                        btsVar2.e0(767430701);
                        btsVar2.t(false);
                    } else if (g0vVar instanceof tzu) {
                        btsVar2.e0(-1979411402);
                        j2b1.a(an91.o((f530) obj5, 0.0f, 12.0f, 0.0f, 0.0f, 13).k(e), (tzu) g0vVar, btsVar2, 0);
                        btsVar2.t(false);
                    } else if (g0vVar instanceof c0v) {
                        btsVar2.e0(767438362);
                        p2b1.a(an91.o(f530Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2).k(f530Var4), btsVar2, 0);
                        btsVar2.t(false);
                    } else {
                        boolean z2 = g0vVar instanceof wzu;
                        int i4 = 13;
                        sls slsVar = null;
                        Object obj8 = did.a;
                        Object obj9 = this.c;
                        if (z2) {
                            btsVar2.e0(-1979021391);
                            wzu wzuVar = (wzu) g0vVar;
                            Object c2 = b.c(g0vVar);
                            if (c2 == null) {
                                btsVar2.e0(-1978711485);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(-1978711484);
                                boolean k2 = btsVar2.k(obj9) | btsVar2.k(g0vVar) | btsVar2.k(c2);
                                Object Q = btsVar2.Q();
                                if (k2 || Q == obj8) {
                                    Q = new m0v(0, obj9, wzuVar, c2);
                                    btsVar2.o0(Q);
                                }
                                slsVar = (sls) Q;
                                btsVar2.t(false);
                            }
                            f530 k3 = an91.o(f530Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2).k(f530Var4).k(e);
                            boolean k4 = btsVar2.k(g0vVar) | btsVar2.k(obj9);
                            Object Q2 = btsVar2.Q();
                            if (k4 || Q2 == obj8) {
                                Q2 = new z5(i4, obj9, wzuVar);
                                btsVar2.o0(Q2);
                            }
                            k2b1.a(k3, wzuVar, (sls) Q2, slsVar, btsVar2, 0);
                            btsVar2.t(false);
                        } else if (g0vVar instanceof a0v) {
                            btsVar2.e0(-1978273113);
                            a0v a0vVar = (a0v) g0vVar;
                            Object c3 = b.c(g0vVar);
                            if (c3 == null) {
                                btsVar2.e0(-1977953597);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(-1977953596);
                                boolean k5 = btsVar2.k(obj9) | btsVar2.k(g0vVar) | btsVar2.k(c3);
                                Object Q3 = btsVar2.Q();
                                if (k5 || Q3 == obj8) {
                                    Q3 = new m0v(1, obj9, a0vVar, c3);
                                    btsVar2.o0(Q3);
                                }
                                slsVar = (sls) Q3;
                                btsVar2.t(false);
                            }
                            f530 k6 = an91.o(f530Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2).k(f530Var4).k(e);
                            boolean k7 = btsVar2.k(g0vVar) | btsVar2.k(obj9);
                            Object Q4 = btsVar2.Q();
                            if (k7 || Q4 == obj8) {
                                Q4 = new z5(14, obj9, a0vVar);
                                btsVar2.o0(Q4);
                            }
                            o2b1.b(k6, a0vVar, (sls) Q4, slsVar, btsVar2, 0);
                            btsVar2.t(false);
                        } else if (g0vVar instanceof yzu) {
                            btsVar2.e0(-1977521363);
                            yzu yzuVar = (yzu) g0vVar;
                            Object c4 = b.c(g0vVar);
                            if (c4 == null) {
                                btsVar2.e0(-1977207613);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(-1977207612);
                                boolean k8 = btsVar2.k(obj9) | btsVar2.k(g0vVar) | btsVar2.k(c4);
                                Object Q5 = btsVar2.Q();
                                if (k8 || Q5 == obj8) {
                                    Q5 = new m0v(2, obj9, yzuVar, c4);
                                    btsVar2.o0(Q5);
                                }
                                slsVar = (sls) Q5;
                                btsVar2.t(false);
                            }
                            f530 k9 = an91.o(f530Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2).k(f530Var4).k(e);
                            boolean k10 = btsVar2.k(g0vVar) | btsVar2.k(obj9);
                            Object Q6 = btsVar2.Q();
                            if (k10 || Q6 == obj8) {
                                Q6 = new z5(15, obj9, yzuVar);
                                btsVar2.o0(Q6);
                            }
                            n2b1.d(k9, yzuVar, (sls) Q6, slsVar, btsVar2, 0);
                            btsVar2.t(false);
                        } else {
                            if (!(g0vVar instanceof vzu)) {
                                throw unr0.y(767431710, btsVar2, false);
                            }
                            btsVar2.e0(-1976771597);
                            f530 k11 = an91.o(f530Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2).k(f530Var4).k(e);
                            vzu vzuVar = (vzu) g0vVar;
                            boolean k12 = btsVar2.k(g0vVar) | btsVar2.k(obj9);
                            Object Q7 = btsVar2.Q();
                            if (k12 || Q7 == obj8) {
                                Q7 = new tj(13, obj9, vzuVar);
                                btsVar2.o0(Q7);
                            }
                            a8a1.i(vzuVar, (tls) Q7, k11, btsVar2, 0);
                            btsVar2.t(false);
                        }
                    }
                    btsVar2.t(false);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public zc0(List list, List list2, Set set, tls tlsVar, pa90 pa90Var) {
        this.b = list;
        this.w = list2;
        this.x = set;
        this.c = tlsVar;
        this.y = pa90Var;
    }
}
