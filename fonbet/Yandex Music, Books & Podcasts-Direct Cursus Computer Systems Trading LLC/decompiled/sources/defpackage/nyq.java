package defpackage;

import android.content.Context;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.music.shared.smart.downloading.domain.SmartDownloadWorker;
import io.appmetrica.analytics.impl.C0479n3;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.a;

/* loaded from: classes4.dex */
public final class nyq {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final tf6 f;

    public nyq(bzq bzqVar) {
        bzqVar.getClass();
        this.a = bzqVar.b(hag.I(Context.class), true);
        this.b = bzqVar.b(hag.I(frt.class), true);
        this.c = bzqVar.b(hag.I(hzq.class), true);
        this.d = bzqVar.b(hag.I(vyq.class), true);
        this.e = bzqVar.b(hag.I(yyq.class), true);
        this.f = gld.e(dm6.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        lyq lyqVar;
        int i;
        Long l;
        int i2;
        if (cg6Var instanceof lyq) {
            lyqVar = (lyq) cg6Var;
            int i3 = lyqVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lyqVar.l = i3 - Integer.MIN_VALUE;
                Object obj = lyqVar.j;
                nm6 nm6Var = nm6.a;
                i = lyqVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    hzq hzqVar = (hzq) this.c.getValue();
                    lyqVar.l = 1;
                    obj = ((nzq) hzqVar).a(lyqVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                l = (Long) obj;
                if (l == null) {
                    long longValue = l.longValue();
                    msa msaVar = nsa.b;
                    i2 = (int) nsa.s(yd5.N(System.currentTimeMillis() - longValue, ssa.MILLISECONDS), ssa.DAYS);
                } else {
                    i2 = 0;
                }
                return new Integer(i2);
            }
        }
        lyqVar = new lyq(this, cg6Var);
        Object obj2 = lyqVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lyqVar.l;
        if (i != 0) {
        }
        l = (Long) obj2;
        if (l == null) {
        }
        return new Integer(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x007f, code lost:
    
        if (((defpackage.nzq) r1).c(false, r2) == r3) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r0v13, types: [arf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(cg6 cg6Var) {
        myq myqVar;
        nm6 nm6Var;
        int i;
        Object g0;
        opb opbVar;
        urj urjVar;
        g4w g4wVar;
        Object b;
        d4w d4wVar;
        g4w g4wVar2;
        urj urjVar2;
        Object a;
        gzq gzqVar;
        TimeZone timeZone;
        opb opbVar2;
        urj urjVar3;
        List list;
        Long l;
        Integer num;
        Map b2;
        if (cg6Var instanceof myq) {
            myqVar = (myq) cg6Var;
            int i2 = myqVar.s;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myqVar.s = i2 - Integer.MIN_VALUE;
                Object obj = myqVar.q;
                nm6Var = nm6.a;
                i = myqVar.s;
                jyr jyrVar = this.c;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    hzq hzqVar = (hzq) jyrVar.getValue();
                    myqVar.s = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            g4wVar = myqVar.l;
                            urjVar = myqVar.k;
                            opbVar = myqVar.j;
                            qgg.h0(obj);
                            d4w d4wVar2 = (d4w) CollectionsKt.firstOrNull((List) obj);
                            hzq hzqVar2 = (hzq) jyrVar.getValue();
                            myqVar.j = opbVar;
                            myqVar.k = urjVar;
                            myqVar.l = g4wVar;
                            myqVar.m = d4wVar2;
                            myqVar.s = 3;
                            b = ((nzq) hzqVar2).b(myqVar);
                            if (b != nm6Var) {
                                d4wVar = d4wVar2;
                                obj = b;
                                urj urjVar4 = urjVar;
                                g4wVar2 = g4wVar;
                                urjVar2 = urjVar4;
                                gzq gzqVar2 = (gzq) obj;
                                if (gzqVar2 == null) {
                                }
                                e5w e5wVar = (e5w) CollectionsKt.firstOrNull(r8);
                                if (e5wVar == null) {
                                }
                                hzq hzqVar3 = (hzq) jyrVar.getValue();
                                myqVar.j = opbVar;
                                myqVar.k = urjVar2;
                                myqVar.l = g4wVar2;
                                myqVar.m = d4wVar;
                                myqVar.n = gzqVar2;
                                myqVar.o = r8;
                                myqVar.p = r9;
                                myqVar.s = 4;
                                a = ((nzq) hzqVar3).a(myqVar);
                                if (a != nm6Var) {
                                }
                            }
                            return nm6Var;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            timeZone = myqVar.p;
                            list = (List) myqVar.o;
                            gzqVar = myqVar.n;
                            d4wVar = myqVar.m;
                            g4wVar2 = myqVar.l;
                            urjVar3 = myqVar.k;
                            opbVar2 = myqVar.j;
                            qgg.h0(obj);
                            l = (Long) obj;
                            String b0 = l == null ? zwf.b0(l.longValue(), timeZone) : null;
                            String b02 = d4wVar == null ? zwf.b0(d4wVar.k, timeZone) : null;
                            if (l == null) {
                                long longValue = l.longValue();
                                msa msaVar = nsa.b;
                                num = new Integer((int) nsa.s(yd5.N(System.currentTimeMillis() - longValue, ssa.MILLISECONDS), ssa.DAYS));
                            } else {
                                num = null;
                            }
                            String b03 = gzqVar == null ? zwf.b0(gzqVar.f, timeZone) : null;
                            String name = d4wVar == null ? d4wVar.b.name() : null;
                            vyq vyqVar = (vyq) this.d.getValue();
                            Integer num2 = d4wVar == null ? new Integer(d4wVar.l) : null;
                            Context context = vyqVar.a;
                            list.getClass();
                            t70 t70Var = vyqVar.b;
                            ub ubVar = new ub();
                            e5w e5wVar2 = (e5w) CollectionsKt.firstOrNull(list);
                            TimeZone timeZone2 = timeZone;
                            ubVar.a(zwf.C(e5wVar2 == null ? e5wVar2.e : null), PListParser.TAG_DATE);
                            ubVar.a(rzf.y(list), "intervals");
                            ubVar.a(b0, "prevLaunchDate");
                            ubVar.a(b02, "nextLaunchDate");
                            ubVar.a(b03, "prevUpdateDate");
                            ubVar.a(num, "daysWithoutLaunch");
                            ubVar.a(name, "workerState");
                            ubVar.a(num2, "workerStopReason");
                            Map map = (Map) ubVar.a.getValue();
                            ub ubVar2 = new ub();
                            List list2 = list;
                            ubVar2.a(Boolean.valueOf(jo0.b(context)), "battery");
                            ubVar2.a(Boolean.valueOf(l1b.d(context).getRestrictBackgroundStatus() != 3), "network");
                            ubVar2.a(Boolean.valueOf(jo0.D(context)), C0479n3.g);
                            ubVar2.a(Boolean.valueOf(l1b.h(context).isPowerSaveMode()), "powerSave");
                            ubVar2.a(Boolean.valueOf(jo0.j(context) == null), "hasIntent");
                            map.put("backgroundRestrictions", ubVar2.b());
                            b2 = ubVar.b();
                            if (b2 == null) {
                                b2 = e5b.a;
                                b2.getClass();
                            }
                            ot0.A(t70Var.e(), "SMART_DOWNLOAD_SCHEDULED", b2);
                            String y = rzf.y(list2);
                            String id = timeZone2.getID();
                            Integer num3 = d4wVar == null ? new Integer(d4wVar.l) : null;
                            StringBuilder m = f1d.m("schedule worker: intervals=", y, " timeZone=", id, " noLaunchDays=");
                            m.append(num);
                            m.append(" prevLaunch=");
                            m.append(b0);
                            m.append(" nextLaunch=");
                            su4.v(m, b02, " lastUpdate=", b03, " state=");
                            m.append(name);
                            m.append(" stopReason=");
                            m.append(num3);
                            ssg.a(3, "SmartDownloadManager", m.toString(), null);
                            g4wVar2.c("SmartDownloadWorker", opbVar2, urjVar3);
                            return Unit.a;
                        }
                        d4w d4wVar3 = myqVar.m;
                        g4wVar2 = myqVar.l;
                        urj urjVar5 = myqVar.k;
                        opb opbVar3 = myqVar.j;
                        qgg.h0(obj);
                        d4wVar = d4wVar3;
                        urjVar2 = urjVar5;
                        opbVar = opbVar3;
                        gzq gzqVar22 = (gzq) obj;
                        List P = gzqVar22 == null ? wxf.P(gzqVar22.b) : c5b.a;
                        e5w e5wVar3 = (e5w) CollectionsKt.firstOrNull(P);
                        TimeZone timeZone3 = e5wVar3 == null ? e5wVar3.e : TimeZone.getDefault();
                        hzq hzqVar32 = (hzq) jyrVar.getValue();
                        myqVar.j = opbVar;
                        myqVar.k = urjVar2;
                        myqVar.l = g4wVar2;
                        myqVar.m = d4wVar;
                        myqVar.n = gzqVar22;
                        myqVar.o = P;
                        myqVar.p = timeZone3;
                        myqVar.s = 4;
                        a = ((nzq) hzqVar32).a(myqVar);
                        if (a != nm6Var) {
                            gzqVar = gzqVar22;
                            obj = a;
                            timeZone = timeZone3;
                            opbVar2 = opbVar;
                            urjVar3 = urjVar2;
                            list = P;
                            l = (Long) obj;
                            if (l == null) {
                            }
                            if (d4wVar == null) {
                            }
                            if (l == null) {
                            }
                            if (gzqVar == null) {
                            }
                            if (d4wVar == null) {
                            }
                            vyq vyqVar2 = (vyq) this.d.getValue();
                            if (d4wVar == null) {
                            }
                            Context context2 = vyqVar2.a;
                            list.getClass();
                            t70 t70Var2 = vyqVar2.b;
                            ub ubVar3 = new ub();
                            e5w e5wVar22 = (e5w) CollectionsKt.firstOrNull(list);
                            TimeZone timeZone22 = timeZone;
                            ubVar3.a(zwf.C(e5wVar22 == null ? e5wVar22.e : null), PListParser.TAG_DATE);
                            ubVar3.a(rzf.y(list), "intervals");
                            ubVar3.a(b0, "prevLaunchDate");
                            ubVar3.a(b02, "nextLaunchDate");
                            ubVar3.a(b03, "prevUpdateDate");
                            ubVar3.a(num, "daysWithoutLaunch");
                            ubVar3.a(name, "workerState");
                            ubVar3.a(num2, "workerStopReason");
                            Map map2 = (Map) ubVar3.a.getValue();
                            ub ubVar22 = new ub();
                            List list22 = list;
                            ubVar22.a(Boolean.valueOf(jo0.b(context2)), "battery");
                            ubVar22.a(Boolean.valueOf(l1b.d(context2).getRestrictBackgroundStatus() != 3), "network");
                            ubVar22.a(Boolean.valueOf(jo0.D(context2)), C0479n3.g);
                            ubVar22.a(Boolean.valueOf(l1b.h(context2).isPowerSaveMode()), "powerSave");
                            ubVar22.a(Boolean.valueOf(jo0.j(context2) == null), "hasIntent");
                            map2.put("backgroundRestrictions", ubVar22.b());
                            b2 = ubVar3.b();
                            if (b2 == null) {
                            }
                            ot0.A(t70Var2.e(), "SMART_DOWNLOAD_SCHEDULED", b2);
                            String y2 = rzf.y(list22);
                            String id2 = timeZone22.getID();
                            if (d4wVar == null) {
                            }
                            StringBuilder m2 = f1d.m("schedule worker: intervals=", y2, " timeZone=", id2, " noLaunchDays=");
                            m2.append(num);
                            m2.append(" prevLaunch=");
                            m2.append(b0);
                            m2.append(" nextLaunch=");
                            su4.v(m2, b02, " lastUpdate=", b03, " state=");
                            m2.append(name);
                            m2.append(" stopReason=");
                            m2.append(num3);
                            ssg.a(3, "SmartDownloadManager", m2.toString(), null);
                            g4wVar2.c("SmartDownloadWorker", opbVar2, urjVar3);
                            return Unit.a;
                        }
                        return nm6Var;
                    }
                    qgg.h0(obj);
                }
                q97 q97Var = new q97(new LinkedHashMap());
                cxb.l0(q97Var);
                g2j g2jVar = g2j.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                g2j g2jVar2 = g2j.c;
                f1j f1jVar = new f1j(null);
                jyr jyrVar2 = this.e;
                ((yyq) jyrVar2.getValue()).getClass();
                jyr jyrVar3 = dzq.h;
                boolean z = ((czq) jyrVar3.getValue()).b;
                ((yyq) jyrVar2.getValue()).getClass();
                fa6 fa6Var = new fa6(f1jVar, g2jVar2, z, ((czq) jyrVar3.getValue()).a, true, false, -1L, -1L, CollectionsKt.A0(linkedHashSet));
                opb opbVar4 = opb.b;
                trj trjVar = new trj(SmartDownloadWorker.class);
                t4w t4wVar = (t4w) trjVar.c;
                t4wVar.e = q97Var;
                t4wVar.j = fa6Var;
                ((Set) trjVar.d).add("SmartDownloadWorkerTag");
                urj urjVar6 = (urj) trjVar.a();
                Context context3 = (Context) this.a.getValue();
                context3.getClass();
                g4w d = g4w.d(context3);
                d.getClass();
                x4w A = d.c.A();
                a aVar = d.d.b;
                A.getClass();
                aVar.getClass();
                pjc k0 = zsd.k0(zsd.b0(new o2m(bg3.v(A.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new q0v(15, A)), i3)), aVar);
                myqVar.j = opbVar4;
                myqVar.k = urjVar6;
                myqVar.l = d;
                myqVar.s = 2;
                g0 = zsd.g0(k0, myqVar);
                if (g0 != nm6Var) {
                    opbVar = opbVar4;
                    urjVar = urjVar6;
                    obj = g0;
                    g4wVar = d;
                    d4w d4wVar22 = (d4w) CollectionsKt.firstOrNull((List) obj);
                    hzq hzqVar22 = (hzq) jyrVar.getValue();
                    myqVar.j = opbVar;
                    myqVar.k = urjVar;
                    myqVar.l = g4wVar;
                    myqVar.m = d4wVar22;
                    myqVar.s = 3;
                    b = ((nzq) hzqVar22).b(myqVar);
                    if (b != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        myqVar = new myq(this, cg6Var);
        Object obj2 = myqVar.q;
        nm6Var = nm6.a;
        i = myqVar.s;
        jyr jyrVar4 = this.c;
        int i32 = 1;
        if (i != 0) {
        }
        q97 q97Var2 = new q97(new LinkedHashMap());
        cxb.l0(q97Var2);
        g2j g2jVar3 = g2j.a;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        g2j g2jVar22 = g2j.c;
        f1j f1jVar2 = new f1j(null);
        jyr jyrVar22 = this.e;
        ((yyq) jyrVar22.getValue()).getClass();
        jyr jyrVar32 = dzq.h;
        boolean z2 = ((czq) jyrVar32.getValue()).b;
        ((yyq) jyrVar22.getValue()).getClass();
        fa6 fa6Var2 = new fa6(f1jVar2, g2jVar22, z2, ((czq) jyrVar32.getValue()).a, true, false, -1L, -1L, CollectionsKt.A0(linkedHashSet2));
        opb opbVar42 = opb.b;
        trj trjVar2 = new trj(SmartDownloadWorker.class);
        t4w t4wVar2 = (t4w) trjVar2.c;
        t4wVar2.e = q97Var2;
        t4wVar2.j = fa6Var2;
        ((Set) trjVar2.d).add("SmartDownloadWorkerTag");
        urj urjVar62 = (urj) trjVar2.a();
        Context context32 = (Context) this.a.getValue();
        context32.getClass();
        g4w d2 = g4w.d(context32);
        d2.getClass();
        x4w A2 = d2.c.A();
        a aVar2 = d2.d.b;
        A2.getClass();
        aVar2.getClass();
        pjc k02 = zsd.k0(zsd.b0(new o2m(bg3.v(A2.a, true, new String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, new q0v(15, A2)), i32)), aVar2);
        myqVar.j = opbVar42;
        myqVar.k = urjVar62;
        myqVar.l = d2;
        myqVar.s = 2;
        g0 = zsd.g0(k02, myqVar);
        if (g0 != nm6Var) {
        }
        return nm6Var;
    }
}
