package C2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.A9;
import com.google.android.gms.internal.ads.AbstractC2881Za;
import com.google.android.gms.internal.ads.AbstractC3195fc;
import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.B9;
import com.google.android.gms.internal.ads.BD;
import com.google.android.gms.internal.ads.Bu;
import com.google.android.gms.internal.ads.C2556Fi;
import com.google.android.gms.internal.ads.C2570Gf;
import com.google.android.gms.internal.ads.C2692Ni;
import com.google.android.gms.internal.ads.C2700Nq;
import com.google.android.gms.internal.ads.C2710Oj;
import com.google.android.gms.internal.ads.C2739Qe;
import com.google.android.gms.internal.ads.C2944at;
import com.google.android.gms.internal.ads.C2998bt;
import com.google.android.gms.internal.ads.C3040ci;
import com.google.android.gms.internal.ads.C3052cu;
import com.google.android.gms.internal.ads.C3157es;
import com.google.android.gms.internal.ads.C3196fd;
import com.google.android.gms.internal.ads.C3243gN;
import com.google.android.gms.internal.ads.C3255gi;
import com.google.android.gms.internal.ads.C3301ha;
import com.google.android.gms.internal.ads.C3304hd;
import com.google.android.gms.internal.ads.C3309hi;
import com.google.android.gms.internal.ads.C3314hn;
import com.google.android.gms.internal.ads.C3316hp;
import com.google.android.gms.internal.ads.C3360ig;
import com.google.android.gms.internal.ads.C3369ip;
import com.google.android.gms.internal.ads.C3467kg;
import com.google.android.gms.internal.ads.C3481ku;
import com.google.android.gms.internal.ads.C3586mr;
import com.google.android.gms.internal.ads.C3589mu;
import com.google.android.gms.internal.ads.C3638np;
import com.google.android.gms.internal.ads.C3657o7;
import com.google.android.gms.internal.ads.C3679oc;
import com.google.android.gms.internal.ads.C3692op;
import com.google.android.gms.internal.ads.C3694or;
import com.google.android.gms.internal.ads.C3749ps;
import com.google.android.gms.internal.ads.C3805qu;
import com.google.android.gms.internal.ads.C3864s;
import com.google.android.gms.internal.ads.C3911st;
import com.google.android.gms.internal.ads.C3959tn;
import com.google.android.gms.internal.ads.C3966tu;
import com.google.android.gms.internal.ads.C4008ui;
import com.google.android.gms.internal.ads.C4015up;
import com.google.android.gms.internal.ads.C4020uu;
import com.google.android.gms.internal.ads.C4127wt;
import com.google.android.gms.internal.ads.C4183xv;
import com.google.android.gms.internal.ads.C4231yp;
import com.google.android.gms.internal.ads.C4274ze;
import com.google.android.gms.internal.ads.C9;
import com.google.android.gms.internal.ads.Cu;
import com.google.android.gms.internal.ads.D9;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.ID;
import com.google.android.gms.internal.ads.InterfaceC2669Mc;
import com.google.android.gms.internal.ads.InterfaceC2867Yc;
import com.google.android.gms.internal.ads.InterfaceC3249gc;
import com.google.android.gms.internal.ads.InterfaceC3511lN;
import com.google.android.gms.internal.ads.InterfaceC3633nk;
import com.google.android.gms.internal.ads.InterfaceC4061vh;
import com.google.android.gms.internal.ads.InterfaceC4074vu;
import com.google.android.gms.internal.ads.InterfaceC4177xp;
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
import com.google.android.gms.internal.ads.RunnableC2658Li;
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
import p2.C4835j;
import q2.C4900p;

/* loaded from: classes.dex */
public final class s implements BD {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f404a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f405b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f406c;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f404a = i;
        this.f405b = obj;
        this.f406c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007f, code lost:
    
        ((com.google.android.gms.internal.ads.M4) r6.f35362w).f26242d++;
     */
    @Override // com.google.android.gms.internal.ads.BD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final N3.a a(Object obj) {
        Zq zq;
        int i = 7;
        int i6 = 25;
        C4020uu c4020uu = null;
        int i9 = 0;
        switch (this.f404a) {
            case 0:
                C2739Qe c2739Qe = (C2739Qe) obj;
                C3864s c3864s = (C3864s) this.f406c;
                String str = c2739Qe.f27044w;
                u2.D d2 = C4835j.f39733C.f39738c;
                return QC.t(QC.r((ID) QC.s(ID.s(u2.D.e(str) ? QC.k(new C4231yp(1)) : (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32386u8)).booleanValue() || ((Boolean) AbstractC2881Za.f28889a.r()).booleanValue()) ? ((C3360ig) c3864s.f33788w).b(new x(i, c3864s, c2739Qe)) : ((C3692op) c3864s.f33789x).c(c2739Qe)), ((Integer) q2.r.f40207e.f40210c.a(AbstractC3569ma.f31975A6)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) c3864s.f33786u), Throwable.class, new C3316hp(c3864s, c2739Qe, Binder.getCallingUid(), 1), (C3360ig) c3864s.f33787v), new C0273f(2, c2739Qe), (RD) this.f405b);
            case 1:
                InterfaceC2867Yc interfaceC2867Yc = (InterfaceC2867Yc) obj;
                interfaceC2867Yc.i((String) this.f405b, (InterfaceC3249gc) this.f406c);
                return QC.c(interfaceC2867Yc);
            case 2:
                C3304hd c3304hd = (C3304hd) this.f405b;
                c3304hd.getClass();
                C3467kg c3467kg = new C3467kg();
                u2.D d9 = C4835j.f39733C.f39738c;
                String uuid = UUID.randomUUID().toString();
                AbstractC3195fc.f30260j.a(uuid, new C3679oc(c3304hd, c3467kg));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", uuid);
                jSONObject.put("args", (JSONObject) this.f406c);
                InterfaceC2669Mc interfaceC2669Mc = (InterfaceC2669Mc) ((InterfaceC2867Yc) obj);
                interfaceC2669Mc.getClass();
                interfaceC2669Mc.c("google.afma.activeView.handleUpdate", jSONObject.toString());
                return c3467kg;
            case 3:
                C2692Ni c2692Ni = (C2692Ni) this.f405b;
                c2692Ni.getClass();
                c2692Ni.f26515e.a(new RunnableC2658Li(c2692Ni, (Throwable) obj, 0));
                String str2 = (String) q2.r.f40207e.f40210c.a(AbstractC3569ma.Eb);
                Uri.Builder builder = (Uri.Builder) this.f406c;
                builder.appendQueryParameter(str2, com.anythink.expressad.videocommon.e.b.f22396j);
                return QC.c(builder.toString());
            case 4:
                C2739Qe c2739Qe2 = (C2739Qe) obj;
                C2710Oj c2710Oj = (C2710Oj) this.f405b;
                c2739Qe2.f27036B = (C3966tu) this.f406c;
                C4274ze c4274ze = c2710Oj.f26646h;
                return c4274ze.E(c2739Qe2, new C3694or(24, (C4015up) c4274ze.f35361v), new Qx(27, c4274ze), new C3369ip(c2739Qe2, 2));
            case 5:
                InterfaceC4061vh interfaceC4061vh = (InterfaceC4061vh) obj;
                C3314hn c3314hn = (C3314hn) this.f405b;
                C3052cu c3052cu = c3314hn.f30930a;
                Z8 z82 = new Z8(interfaceC4061vh);
                if (c3052cu.f29621b != null) {
                    interfaceC4061vh.o0(new X2.b(5, 0, 0));
                } else {
                    interfaceC4061vh.o0(new X2.b(4, 0, 0));
                }
                interfaceC4061vh.g0().f26159z = new C3481ku(10, c3314hn, interfaceC4061vh, z82);
                interfaceC4061vh.a("google.afma.nativeAds.renderVideo", (JSONObject) this.f406c);
                return z82;
            case 6:
                JSONObject jSONObject2 = (JSONObject) obj;
                C3638np c3638np = (C3638np) this.f405b;
                c3638np.getClass();
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32065L2)).booleanValue()) {
                    C4835j.f39733C.f39745k.getClass();
                    c3638np.i.c("scar-preloader-processing-done", System.currentTimeMillis());
                }
                return ((C3196fd) this.f406c).b(jSONObject2);
            case 7:
                Exception exc = (Exception) obj;
                C3638np c3638np2 = (C3638np) this.f405b;
                c3638np2.getClass();
                C4835j.f39733C.f39743h.e("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    zq = new Zq(1, "Timed out waiting for ad response.");
                } else if (exc instanceof Zq) {
                    zq = (Zq) exc;
                } else {
                    zq = new Zq(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = zq.getMessage() == null ? "" : zq.getMessage();
                List list = (List) this.f406c;
                if (list != null && !list.isEmpty()) {
                    String str3 = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str3 = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List q8 = com.bumptech.glide.manager.p.d(new PA(':')).q(message);
                            if (q8.size() == 2) {
                                message = (String) q8.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C4183xv.c(C4183xv.c((String) it.next(), "@gw_adnetstatus@", str3), "@error_code@", message));
                    }
                    c3638np2.f32779j.a(arrayList, null);
                }
                return QC.k(zq);
            case 8:
                return ((InterfaceC4177xp) ((InterfaceC3511lN) this.f405b).f()).d((C2739Qe) this.f406c);
            case 9:
                Bundle bundle = (Bundle) obj;
                C3255gi c3255gi = (C3255gi) this.f405b;
                C4008ui c4008ui = c3255gi.f30599c;
                C3309hi c3309hi = c3255gi.f30598b;
                Context context = c3309hi.f30872a.f28707b;
                AbstractC3341iD.j(context);
                C3360ig c3360ig = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig);
                AbstractC3341iD.j(c3360ig);
                AbstractC3341iD.j(((C2739Qe) ((C2998bt) c4008ui.f34561b).f29342b.f1051v).f27044w);
                C2944at c2944at = new C2944at();
                C3243gN c3243gN = c3309hi.f30878d;
                Qr qr = new Qr(c2944at, 0L, (ScheduledExecutorService) c3243gN.f());
                G g4 = c3255gi.f30600d;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) g4.f276c.f();
                g4.f275b.a();
                Qr qr2 = new Qr(new Lr(i, scheduledExecutorService), ((Long) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32227d5)).longValue(), (ScheduledExecutorService) c3243gN.f());
                Qr qr3 = new Qr(c3255gi.f30601e.c(), 0L, (ScheduledExecutorService) c3243gN.f());
                AbstractC3341iD.j(c3360ig);
                Qr qr4 = new Qr(new C3749ps(c3360ig, 5), 0L, (ScheduledExecutorService) c3243gN.f());
                C3040ci c3040ci = c3255gi.f30602f;
                AbstractC3341iD.j(c3360ig);
                c3040ci.f29536b.a();
                C3749ps c3749ps = new C3749ps(c3360ig, 4);
                AbstractC3341iD.j(c3360ig);
                ArrayList arrayList2 = ((C2739Qe) c3255gi.f30597a.f1051v).f27045x;
                AbstractC3341iD.j(arrayList2);
                C3157es c3157es = new C3157es(6, c3360ig, arrayList2);
                c3255gi.getClass();
                C3360ig c3360ig2 = AbstractC3413jg.f31268a;
                AbstractC3341iD.j(c3360ig2);
                C2739Qe c2739Qe3 = (C2739Qe) c3255gi.f30597a.f1051v;
                String string = c2739Qe3.f27041n.getString("ms");
                if (string == null) {
                    string = "";
                }
                PackageInfo packageInfo = c2739Qe3.f27046y;
                return new C2570Gf(context, c3360ig, XB.i(qr, qr2, qr3, qr4, c3749ps, c3157es, new C3157es(5, c3360ig2, string), (Ps) c3309hi.f30866T0.f(), c3255gi.f30603g.c(), c3255gi.f30604h.d()), (Vu) c3255gi.i.f()).g(C4900p.f40199g.f40200a.n(bundle), ((C2739Qe) this.f406c).f27040F);
            case 10:
                return ((C2570Gf) this.f405b).g(C4900p.f40199g.f40200a.n((Bundle) obj), ((C2739Qe) this.f406c).f27040F);
            case 11:
                JSONObject jSONObject3 = (JSONObject) obj;
                C2700Nq c2700Nq = (C2700Nq) this.f405b;
                c2700Nq.getClass();
                ND c9 = QC.c((C3959tn) this.f406c);
                C3589mu c3589mu = c2700Nq.f26552d;
                synchronized (c3589mu) {
                    c3589mu.f32624a.addFirst(c9);
                }
                if (!jSONObject3.optBoolean("success")) {
                    throw new L2.m("process json failed");
                }
                if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32065L2)).booleanValue()) {
                    C4835j.f39733C.f39745k.getClass();
                    c2700Nq.f26554f.c("rendering-native-ads-preprocess-end", System.currentTimeMillis());
                }
                return QC.c(jSONObject3.getJSONObject("json").getJSONArray(com.anythink.expressad.foundation.d.e.f18662h));
            case 12:
                C3959tn c3959tn = (C3959tn) obj;
                C2700Nq c2700Nq2 = (C2700Nq) this.f405b;
                c2700Nq2.getClass();
                C3301ha c3301ha = AbstractC3569ma.f32065L2;
                q2.r rVar = q2.r.f40207e;
                if (((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
                    C4835j.f39733C.f39745k.getClass();
                    c2700Nq2.f26554f.c("rendering-native-ads-preprocess-start", System.currentTimeMillis());
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("isNonagon", true);
                if (((Boolean) rVar.f40210c.a(AbstractC3569ma.Q9)).booleanValue() && T2.b.g()) {
                    jSONObject4.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("response", ((St) this.f406c).f27640s.f28428c);
                jSONObject5.put("sdk_params", jSONObject4);
                return QC.t(c3959tn.a("google.afma.nativeAds.preProcessJson", jSONObject5), new s(11, c2700Nq2, c3959tn), c2700Nq2.f26550b);
            case 13:
                Yt yt = (Yt) obj;
                ((C4020uu) this.f405b).f34605b = yt;
                Iterator it2 = ((List) yt.f28754b.f25042u).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((St) it2.next()).f27606a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                i9 = 1;
                            }
                        }
                    } else if (i9 != 0) {
                        return ((C2710Oj) this.f406c).c(QC.c(yt));
                    }
                }
                return ND.f26473u;
            case 14:
                C4274ze c4274ze2 = (C4274ze) this.f405b;
                InterfaceC3633nk interfaceC3633nk = (InterfaceC3633nk) this.f406c;
                C4127wt c4127wt = (C4127wt) obj;
                C4274ze c4274ze3 = (C4274ze) c4274ze2.f35360u;
                InterfaceC4074vu interfaceC4074vu = c4127wt.f34901b;
                C2739Qe c2739Qe4 = c4127wt.f34900a;
                synchronized (c4274ze3) {
                    try {
                        C3805qu c3805qu = (C3805qu) ((ConcurrentHashMap) c4274ze3.f35360u).get(interfaceC4074vu);
                        if (c3805qu != null) {
                            Cu cu = c3805qu.f33440d;
                            cu.getClass();
                            C4835j.f39733C.f39745k.getClass();
                            cu.f24260c = System.currentTimeMillis();
                            cu.f24261d++;
                            c3805qu.a();
                            LinkedList linkedList = c3805qu.f33437a;
                            if (!linkedList.isEmpty() && (c4020uu = (C4020uu) linkedList.remove()) != null) {
                                cu.f24262e++;
                                cu.f24259b.f23982n = true;
                                break;
                            }
                            Bu bu = c3805qu.f33440d.f24259b;
                            Bu clone = bu.clone();
                            bu.f23982n = false;
                            bu.f23983u = 0;
                            if (c4020uu != null) {
                                C9 A9 = H9.A();
                                A9 B9 = B9.B();
                                B9.h();
                                ((B9) B9.f27721u).C();
                                D9 A10 = E9.A();
                                boolean z3 = clone.f23982n;
                                A10.h();
                                ((E9) A10.f27721u).C(z3);
                                int i10 = clone.f23983u;
                                A10.h();
                                ((E9) A10.f27721u).D(i10);
                                B9.h();
                                ((B9) B9.f27721u).D((E9) A10.j());
                                A9.h();
                                ((H9) A9.f27721u).B((B9) B9.j());
                                c4020uu.f34604a.c().f26644f.y((H9) A9.j());
                            }
                            c4274ze3.D();
                        } else {
                            ((M4) c4274ze3.f35362w).f26241c++;
                            c4274ze3.D();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (c4020uu != null && c2739Qe4 != null) {
                    C2710Oj c10 = interfaceC3633nk.c();
                    Ju ju = Ju.NOTIFY_CACHE_HIT;
                    C4274ze c4274ze4 = c10.f26646h;
                    Iu s9 = c10.f26641c.a(c4274ze4.E(c2739Qe4, new Ux(i6, c4274ze4), new C3657o7(i6, c4274ze4), C2556Fi.f24824f), ju).s();
                    s9.a(new LD(i9, s9, new C3694or(16, c10)), c10.f26647j);
                    s9.a(new LD(i9, s9, (C3586mr) c4274ze2.f35362w), (RD) c4274ze2.f35361v);
                }
                return QC.c(new C3911st(interfaceC4074vu, c2739Qe4, c4020uu));
            default:
                return ((Ly) ((Yx) this.f405b).f28766b.f26895f.get()).a((Context) this.f406c);
        }
    }
}
