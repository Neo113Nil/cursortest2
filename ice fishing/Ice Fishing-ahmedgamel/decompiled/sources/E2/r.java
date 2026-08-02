package E2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.A9;
import com.google.android.gms.internal.ads.AbstractC2904Za;
import com.google.android.gms.internal.ads.AbstractC3218fc;
import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.AbstractC3436jg;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.B9;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.Bu;
import com.google.android.gms.internal.ads.C2576Fi;
import com.google.android.gms.internal.ads.C2590Gf;
import com.google.android.gms.internal.ads.C2712Ni;
import com.google.android.gms.internal.ads.C2720Nq;
import com.google.android.gms.internal.ads.C2730Oj;
import com.google.android.gms.internal.ads.C2759Qe;
import com.google.android.gms.internal.ads.C2967at;
import com.google.android.gms.internal.ads.C3021bt;
import com.google.android.gms.internal.ads.C3063ci;
import com.google.android.gms.internal.ads.C3075cu;
import com.google.android.gms.internal.ads.C3180es;
import com.google.android.gms.internal.ads.C3219fd;
import com.google.android.gms.internal.ads.C3266gN;
import com.google.android.gms.internal.ads.C3278gi;
import com.google.android.gms.internal.ads.C3324ha;
import com.google.android.gms.internal.ads.C3327hd;
import com.google.android.gms.internal.ads.C3332hi;
import com.google.android.gms.internal.ads.C3339hp;
import com.google.android.gms.internal.ads.C3383ig;
import com.google.android.gms.internal.ads.C3390in;
import com.google.android.gms.internal.ads.C3392ip;
import com.google.android.gms.internal.ads.C3490kg;
import com.google.android.gms.internal.ads.C3504ku;
import com.google.android.gms.internal.ads.C3609mr;
import com.google.android.gms.internal.ads.C3612mu;
import com.google.android.gms.internal.ads.C3661np;
import com.google.android.gms.internal.ads.C3680o7;
import com.google.android.gms.internal.ads.C3702oc;
import com.google.android.gms.internal.ads.C3715op;
import com.google.android.gms.internal.ads.C3717or;
import com.google.android.gms.internal.ads.C3772ps;
import com.google.android.gms.internal.ads.C3828qu;
import com.google.android.gms.internal.ads.C3887s;
import com.google.android.gms.internal.ads.C3934st;
import com.google.android.gms.internal.ads.C3989tu;
import com.google.android.gms.internal.ads.C4031ui;
import com.google.android.gms.internal.ads.C4036un;
import com.google.android.gms.internal.ads.C4038up;
import com.google.android.gms.internal.ads.C4043uu;
import com.google.android.gms.internal.ads.C4150wt;
import com.google.android.gms.internal.ads.C4206xv;
import com.google.android.gms.internal.ads.C4254yp;
import com.google.android.gms.internal.ads.C4297ze;
import com.google.android.gms.internal.ads.C9;
import com.google.android.gms.internal.ads.Cu;
import com.google.android.gms.internal.ads.D9;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.InterfaceC2689Mc;
import com.google.android.gms.internal.ads.InterfaceC2890Yc;
import com.google.android.gms.internal.ads.InterfaceC3272gc;
import com.google.android.gms.internal.ads.InterfaceC3534lN;
import com.google.android.gms.internal.ads.InterfaceC3656nk;
import com.google.android.gms.internal.ads.InterfaceC4084vh;
import com.google.android.gms.internal.ads.InterfaceC4097vu;
import com.google.android.gms.internal.ads.InterfaceC4200xp;
import com.google.android.gms.internal.ads.Iu;
import com.google.android.gms.internal.ads.Ju;
import com.google.android.gms.internal.ads.LD;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.Ly;
import com.google.android.gms.internal.ads.M4;
import com.google.android.gms.internal.ads.ND;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.Ps;
import com.google.android.gms.internal.ads.QC;
import com.google.android.gms.internal.ads.Qr;
import com.google.android.gms.internal.ads.Qx;
import com.google.android.gms.internal.ads.RD;
import com.google.android.gms.internal.ads.RunnableC2678Li;
import com.google.android.gms.internal.ads.St;
import com.google.android.gms.internal.ads.Ux;
import com.google.android.gms.internal.ads.Vu;
import com.google.android.gms.internal.ads.XB;
import com.google.android.gms.internal.ads.Yt;
import com.google.android.gms.internal.ads.Yx;
import com.google.android.gms.internal.ads.Z8;
import com.google.android.gms.internal.ads.Zq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
import r2.C4906k;
import s2.C4949p;

/* loaded from: classes.dex */
public final class r implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f863a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f864b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f865c;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.f863a = i;
        this.f864b = obj;
        this.f865c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        ((com.google.android.gms.internal.ads.M4) r6.f36135w).f27033d++;
     */
    @Override // com.google.android.gms.internal.ads.BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final P3.a a(Object obj) {
        Zq zq;
        int i = 7;
        int i4 = 25;
        C4043uu c4043uu = null;
        int i6 = 0;
        switch (this.f863a) {
            case 0:
                C2759Qe c2759Qe = (C2759Qe) obj;
                C3887s c3887s = (C3887s) this.f865c;
                String str = c2759Qe.f27829w;
                w2.D d9 = C4906k.f40186C.f40191c;
                return QC.t(QC.r((ID) QC.s(ID.s(w2.D.e(str) ? QC.k(new C4254yp(1)) : (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33166u8)).booleanValue() || ((Boolean) AbstractC2904Za.f29666a.r()).booleanValue()) ? ((C3383ig) c3887s.f34556w).b(new w(i, c3887s, c2759Qe)) : ((C3715op) c3887s.f34557x).c(c2759Qe)), ((Integer) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32756A6)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) c3887s.f34554u), Throwable.class, new C3339hp(c3887s, c2759Qe, Binder.getCallingUid(), 1), (C3383ig) c3887s.f34555v), new C0309f(2, c2759Qe), (RD) this.f864b);
            case 1:
                InterfaceC2890Yc interfaceC2890Yc = (InterfaceC2890Yc) obj;
                interfaceC2890Yc.i((String) this.f864b, (InterfaceC3272gc) this.f865c);
                return QC.c(interfaceC2890Yc);
            case 2:
                C3327hd c3327hd = (C3327hd) this.f864b;
                c3327hd.getClass();
                C3490kg c3490kg = new C3490kg();
                w2.D d10 = C4906k.f40186C.f40191c;
                String uuid = UUID.randomUUID().toString();
                AbstractC3218fc.f31048j.a(uuid, new C3702oc(c3327hd, c3490kg));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", uuid);
                jSONObject.put("args", (JSONObject) this.f865c);
                InterfaceC2689Mc interfaceC2689Mc = (InterfaceC2689Mc) ((InterfaceC2890Yc) obj);
                interfaceC2689Mc.getClass();
                interfaceC2689Mc.c("google.afma.activeView.handleUpdate", jSONObject.toString());
                return c3490kg;
            case 3:
                C2712Ni c2712Ni = (C2712Ni) this.f864b;
                c2712Ni.getClass();
                c2712Ni.f27298e.a(new RunnableC2678Li(c2712Ni, (Throwable) obj, 0));
                String str2 = (String) s2.r.f40506e.f40509c.a(AbstractC3592ma.Eb);
                Uri.Builder builder = (Uri.Builder) this.f865c;
                builder.appendQueryParameter(str2, com.anythink.expressad.videocommon.e.b.f23183j);
                return QC.c(builder.toString());
            case 4:
                C2759Qe c2759Qe2 = (C2759Qe) obj;
                C2730Oj c2730Oj = (C2730Oj) this.f864b;
                c2759Qe2.f27821B = (C3989tu) this.f865c;
                C4297ze c4297ze = c2730Oj.f27422h;
                return c4297ze.E(c2759Qe2, new C3717or(24, (C4038up) c4297ze.f36134v), new Qx(27, c4297ze), new C3392ip(c2759Qe2, 2));
            case 5:
                InterfaceC4084vh interfaceC4084vh = (InterfaceC4084vh) obj;
                C3390in c3390in = (C3390in) this.f864b;
                C3075cu c3075cu = c3390in.f31887a;
                Z8 z82 = new Z8(interfaceC4084vh);
                if (c3075cu.f30391b != null) {
                    interfaceC4084vh.f1(new A3.r(5, 0, 0));
                } else {
                    interfaceC4084vh.f1(new A3.r(4, 0, 0));
                }
                interfaceC4084vh.h0().f26956z = new C3504ku(10, c3390in, interfaceC4084vh, z82);
                interfaceC4084vh.a("google.afma.nativeAds.renderVideo", (JSONObject) this.f865c);
                return z82;
            case 6:
                JSONObject jSONObject2 = (JSONObject) obj;
                C3661np c3661np = (C3661np) this.f864b;
                c3661np.getClass();
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L2)).booleanValue()) {
                    C4906k.f40186C.f40198k.getClass();
                    c3661np.i.c("scar-preloader-processing-done", System.currentTimeMillis());
                }
                return ((C3219fd) this.f865c).b(jSONObject2);
            case 7:
                Exception exc = (Exception) obj;
                C3661np c3661np2 = (C3661np) this.f864b;
                c3661np2.getClass();
                C4906k.f40186C.f40196h.e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    zq = new Zq(1, "Timed out waiting for ad response.");
                } else if (exc instanceof Zq) {
                    zq = (Zq) exc;
                } else {
                    zq = new Zq(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = zq.getMessage() == null ? "" : zq.getMessage();
                List list = (List) this.f865c;
                if (list != null && !list.isEmpty()) {
                    String str3 = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str3 = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List q8 = com.bumptech.glide.manager.o.d(new PA(':')).q(message);
                            if (q8.size() == 2) {
                                message = (String) q8.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C4206xv.c(C4206xv.c((String) it.next(), "@gw_adnetstatus@", str3), "@error_code@", message));
                    }
                    c3661np2.f33566j.a(arrayList, null);
                }
                return QC.k(zq);
            case 8:
                return ((InterfaceC4200xp) ((InterfaceC3534lN) this.f864b).f()).d((C2759Qe) this.f865c);
            case 9:
                Bundle bundle = (Bundle) obj;
                C3278gi c3278gi = (C3278gi) this.f864b;
                C4031ui c4031ui = c3278gi.f31366c;
                C3332hi c3332hi = c3278gi.f31365b;
                Context context = c3332hi.f31633a.f29482b;
                AbstractC3364iD.j(context);
                C3383ig c3383ig = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig);
                AbstractC3364iD.j(c3383ig);
                AbstractC3364iD.j(((C2759Qe) ((C3021bt) c4031ui.f35333b).f30130b.f1304v).f27829w);
                C2967at c2967at = new C2967at();
                C3266gN c3266gN = c3332hi.f31639d;
                Qr qr = new Qr(c2967at, 0L, (ScheduledExecutorService) c3266gN.f());
                F f2 = c3278gi.f31367d;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f2.f736c.f();
                f2.f735b.a();
                Qr qr2 = new Qr(new Lr(i, scheduledExecutorService), ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33007d5)).longValue(), (ScheduledExecutorService) c3266gN.f());
                Qr qr3 = new Qr(c3278gi.f31368e.c(), 0L, (ScheduledExecutorService) c3266gN.f());
                AbstractC3364iD.j(c3383ig);
                Qr qr4 = new Qr(new C3772ps(c3383ig, 5), 0L, (ScheduledExecutorService) c3266gN.f());
                C3063ci c3063ci = c3278gi.f31369f;
                AbstractC3364iD.j(c3383ig);
                c3063ci.f30321b.a();
                C3772ps c3772ps = new C3772ps(c3383ig, 4);
                AbstractC3364iD.j(c3383ig);
                ArrayList arrayList2 = ((C2759Qe) c3278gi.f31364a.f1304v).f27830x;
                AbstractC3364iD.j(arrayList2);
                C3180es c3180es = new C3180es(6, c3383ig, arrayList2);
                c3278gi.getClass();
                C3383ig c3383ig2 = AbstractC3436jg.f32055a;
                AbstractC3364iD.j(c3383ig2);
                C2759Qe c2759Qe3 = (C2759Qe) c3278gi.f31364a.f1304v;
                String string = c2759Qe3.f27826n.getString("ms");
                if (string == null) {
                    string = "";
                }
                PackageInfo packageInfo = c2759Qe3.f27831y;
                return new C2590Gf(context, c3383ig, XB.i(qr, qr2, qr3, qr4, c3772ps, c3180es, new C3180es(5, c3383ig2, string), (Ps) c3332hi.f31627T0.f(), c3278gi.f31370g.c(), c3278gi.f31371h.d()), (Vu) c3278gi.i.f()).g(C4949p.f40498g.f40499a.n(bundle), ((C2759Qe) this.f865c).f27825F);
            case 10:
                return ((C2590Gf) this.f864b).g(C4949p.f40498g.f40499a.n((Bundle) obj), ((C2759Qe) this.f865c).f27825F);
            case 11:
                JSONObject jSONObject3 = (JSONObject) obj;
                C2720Nq c2720Nq = (C2720Nq) this.f864b;
                c2720Nq.getClass();
                ND c9 = QC.c((C4036un) this.f865c);
                C3612mu c3612mu = c2720Nq.f27334d;
                synchronized (c3612mu) {
                    c3612mu.f33402a.addFirst(c9);
                }
                if (!jSONObject3.optBoolean("success")) {
                    throw new N2.n("process json failed");
                }
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.L2)).booleanValue()) {
                    C4906k.f40186C.f40198k.getClass();
                    c2720Nq.f27336f.c("rendering-native-ads-preprocess-end", System.currentTimeMillis());
                }
                return QC.c(jSONObject3.getJSONObject("json").getJSONArray(com.anythink.expressad.foundation.d.e.f19449h));
            case 12:
                C4036un c4036un = (C4036un) obj;
                C2720Nq c2720Nq2 = (C2720Nq) this.f864b;
                c2720Nq2.getClass();
                C3324ha c3324ha = AbstractC3592ma.L2;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    C4906k.f40186C.f40198k.getClass();
                    c2720Nq2.f27336f.c("rendering-native-ads-preprocess-start", System.currentTimeMillis());
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("isNonagon", true);
                if (((Boolean) rVar.f40509c.a(AbstractC3592ma.Q9)).booleanValue() && V2.b.g()) {
                    jSONObject4.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("response", ((St) this.f865c).f28423s.f29210c);
                jSONObject5.put("sdk_params", jSONObject4);
                return QC.t(c4036un.a("google.afma.nativeAds.preProcessJson", jSONObject5), new r(11, c2720Nq2, c4036un), c2720Nq2.f27332b);
            case 13:
                Yt yt = (Yt) obj;
                ((C4043uu) this.f864b).f35368b = yt;
                Iterator it2 = ((List) yt.f29533b.f25830u).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((St) it2.next()).f28389a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                i6 = 1;
                            }
                        }
                    } else if (i6 != 0) {
                        return ((C2730Oj) this.f865c).c(QC.c(yt));
                    }
                }
                return ND.f27257u;
            case 14:
                C4297ze c4297ze2 = (C4297ze) this.f864b;
                InterfaceC3656nk interfaceC3656nk = (InterfaceC3656nk) this.f865c;
                C4150wt c4150wt = (C4150wt) obj;
                C4297ze c4297ze3 = (C4297ze) c4297ze2.f36133u;
                InterfaceC4097vu interfaceC4097vu = c4150wt.f35682b;
                C2759Qe c2759Qe4 = c4150wt.f35681a;
                synchronized (c4297ze3) {
                    try {
                        C3828qu c3828qu = (C3828qu) ((ConcurrentHashMap) c4297ze3.f36133u).get(interfaceC4097vu);
                        if (c3828qu != null) {
                            Cu cu = c3828qu.f34207d;
                            cu.getClass();
                            C4906k.f40186C.f40198k.getClass();
                            cu.f25005c = System.currentTimeMillis();
                            cu.f25006d++;
                            c3828qu.a();
                            LinkedList linkedList = c3828qu.f34204a;
                            if (!linkedList.isEmpty() && (c4043uu = (C4043uu) linkedList.remove()) != null) {
                                cu.f25007e++;
                                cu.f25004b.f24745n = true;
                                break;
                            }
                            Bu bu = c3828qu.f34207d.f25004b;
                            Bu clone = bu.clone();
                            bu.f24745n = false;
                            bu.f24746u = 0;
                            if (c4043uu != null) {
                                C9 A9 = H9.A();
                                A9 B3 = B9.B();
                                B3.h();
                                ((B9) B3.f28504u).C();
                                D9 A10 = E9.A();
                                boolean z6 = clone.f24745n;
                                A10.h();
                                ((E9) A10.f28504u).C(z6);
                                int i9 = clone.f24746u;
                                A10.h();
                                ((E9) A10.f28504u).D(i9);
                                B3.h();
                                ((B9) B3.f28504u).D((E9) A10.j());
                                A9.h();
                                ((H9) A9.f28504u).B((B9) B3.j());
                                c4043uu.f35367a.c().f27420f.x((H9) A9.j());
                            }
                            c4297ze3.D();
                        } else {
                            ((M4) c4297ze3.f36135w).f27032c++;
                            c4297ze3.D();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c4043uu != null && c2759Qe4 != null) {
                    C2730Oj c10 = interfaceC3656nk.c();
                    Ju ju = Ju.NOTIFY_CACHE_HIT;
                    C4297ze c4297ze4 = c10.f27422h;
                    Iu s9 = c10.f27417c.a(c4297ze4.E(c2759Qe4, new Ux(i4, c4297ze4), new C3680o7(i4, c4297ze4), C2576Fi.f25613f), ju).s();
                    s9.a(new LD(i6, s9, new C3717or(16, c10)), c10.f27423j);
                    s9.a(new LD(i6, s9, (C3609mr) c4297ze2.f36135w), (RD) c4297ze2.f36134v);
                }
                return QC.c(new C3934st(interfaceC4097vu, c2759Qe4, c4043uu));
            default:
                return ((Ly) ((Yx) this.f864b).f29546b.f27682f.get()).a((Context) this.f865c);
        }
    }
}
