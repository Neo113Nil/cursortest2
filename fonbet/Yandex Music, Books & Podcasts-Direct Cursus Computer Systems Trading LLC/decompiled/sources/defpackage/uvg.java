package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.Surface;
import android.view.View;
import androidx.media3.session.i;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.music.shared.media.session.session.Media3SessionService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import ru.kinopoisk.sdk.easylogin.internal.O0;
import ru.kinopoisk.sdk.easylogin.internal.P0;
import ru.kinopoisk.sdk.easylogin.internal.R0;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;
import ru.yandex.music.payment.pay.PromoCodeWebViewActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class uvg implements kd, oah, jo7, yjh, fmh, kth, ua6, fvh, dvh, fuc, va6, kc9, jpj, oq3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uvg(alp alpVar) {
        this.a = 10;
        Bundle bundle = Bundle.EMPTY;
        this.b = alpVar;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        jdl jdlVar = (jdl) this.b;
        ddl ddlVar = jdl.G;
        zne g = kqvVar.a.g(519);
        g.getClass();
        jdlVar.z = g.d;
        jdlVar.D();
        return kqvVar;
    }

    @Override // defpackage.kth
    public void a(vrh vrhVar, int i) {
        alp alpVar = (alp) this.b;
        Bundle bundle = Bundle.EMPTY;
        vrhVar.e(i, alpVar);
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        switch (this.a) {
            case 11:
                ((lrl) obj).h((Surface) this.b);
                break;
            case 18:
                P0.b((P0.b) this.b, obj);
                break;
            case 19:
                P0.d((R0) this.b, obj);
                break;
            default:
                P0.a((O0) this.b, obj);
                break;
        }
    }

    @Override // defpackage.kd
    /* renamed from: b */
    public void mo33b(Object obj) {
        switch (this.a) {
            case 0:
                ((bwg) this.b).h((Throwable) obj);
                break;
            case 4:
                zi3 zi3Var = (zi3) this.b;
                Throwable th = (Throwable) obj;
                th.getClass();
                zi3Var.c(th);
                break;
            case 17:
                dn9 dn9Var = (dn9) this.b;
                x97.y((mm6) dn9Var.b, null, null, new h1j(dn9Var, (Throwable) obj, (Continuation) null, 5), 3);
                break;
            case 23:
                ((b8l) ((qvk) this.b).c).b((Throwable) obj);
                break;
            default:
                ((e3q) ((z5l) this.b).a()).a();
                break;
        }
    }

    @Override // defpackage.jo7
    public int c(mzb mzbVar) {
        xsh xshVar = (xsh) this.b;
        psh pshVar = Media3SessionService.i;
        mzbVar.getClass();
        xshVar.getClass();
        return 10501;
    }

    @Override // defpackage.oq3
    public void d(long j, long j2, long j3) {
        hka hkaVar = ((ovm) this.b).f;
        if (hkaVar == null) {
            return;
        }
        hkaVar.c((j == -1 || j == 0) ? -1.0f : (j2 * 100.0f) / j, j2);
    }

    @Override // defpackage.dvh
    public void e(lrl lrlVar, wrh wrhVar) {
        ((ua6) this.b).accept(lrlVar);
    }

    @Override // defpackage.fmh
    public void f(ulh ulhVar) {
        switch (this.a) {
            case 7:
                tmp tmpVar = (tmp) this.b;
                if (ulhVar.isConnected() && ulhVar.k.isEmpty()) {
                    tmp tmpVar2 = ulhVar.o.c;
                    if (tmpVar2.c < tmpVar.c && vwh.a(tmpVar, tmpVar2)) {
                        ulhVar.o = ulhVar.o.j(tmpVar);
                        break;
                    }
                }
                break;
            case 8:
                PendingIntent pendingIntent = (PendingIntent) this.b;
                if (ulhVar.isConnected() && !Objects.equals(ulhVar.p, pendingIntent)) {
                    ulhVar.p = pendingIntent;
                    kkh kkhVar = ulhVar.a;
                    kkhVar.getClass();
                    vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                    kkhVar.d.getClass();
                    break;
                }
                break;
            default:
                p66 p66Var = (p66) this.b;
                bnp bnpVar = ulhVar.e;
                kkh kkhVar2 = ulhVar.a;
                if (ulhVar.C != null) {
                    vq1.K("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    kkhVar2.a();
                    break;
                } else {
                    c9e c9eVar = p66Var.c;
                    yde ydeVar = p66Var.n;
                    Bundle bundle = p66Var.i;
                    ulhVar.C = c9eVar;
                    ulhVar.p = p66Var.d;
                    ulhVar.u = p66Var.e;
                    d8l d8lVar = p66Var.f;
                    ulhVar.v = d8lVar;
                    d8l d8lVar2 = p66Var.g;
                    ulhVar.w = d8lVar2;
                    d8l R0 = ulh.R0(d8lVar, d8lVar2);
                    ulhVar.x = R0;
                    yde ydeVar2 = p66Var.k;
                    ulhVar.q = ydeVar2;
                    yde ydeVar3 = p66Var.l;
                    ulhVar.r = ydeVar3;
                    qsn m1 = ulh.m1(ydeVar3, ydeVar2, ulhVar.u, R0, bundle);
                    ulhVar.s = m1;
                    ulhVar.t = ulh.l1(m1, ulhVar.q, bundle, ulhVar.u, ulhVar.x);
                    x0 x0Var = new x0(4);
                    for (int i = 0; i < ydeVar.size(); i++) {
                        tb5 tb5Var = (tb5) ydeVar.get(i);
                        alp alpVar = tb5Var.a;
                        if (alpVar != null && alpVar.a == 0) {
                            x0Var.V(alpVar.b, tb5Var);
                        }
                    }
                    x0Var.r();
                    ulhVar.o = p66Var.j;
                    MediaSession.Token token = p66Var.m;
                    if (token == null) {
                        token = bnpVar.a.z();
                    }
                    if (token != null) {
                        ulhVar.D = new MediaController(ulhVar.d, token);
                    }
                    try {
                        p66Var.c.asBinder().linkToDeath(ulhVar.g, 0);
                        ulhVar.l = new bnp(bnpVar.a.getUid(), p66Var.a, p66Var.b, bnpVar.a.w(), p66Var.c, p66Var.h, token);
                        ulhVar.I = bundle;
                        kkhVar2.i1();
                        break;
                    } catch (RemoteException unused) {
                        kkhVar2.a();
                    }
                }
                break;
        }
    }

    @Override // defpackage.yjh
    public int g(Object obj) {
        dsc dscVar = (dsc) this.b;
        mih mihVar = (mih) obj;
        String str = mihVar.b;
        return ((str.equals(dscVar.n) || str.equals(zjh.b(dscVar))) && mihVar.c(dscVar, false) && mihVar.d(dscVar)) ? 1 : 0;
    }

    @Override // defpackage.fvh
    public Object h(i iVar, wrh wrhVar, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 12:
                dvh dvhVar = (dvh) obj;
                kde kdeVar = kde.b;
                if (!iVar.k()) {
                    dvhVar.e(iVar.t, wrhVar);
                    gvh.P0(wrhVar, i, new ump(0));
                }
                return kde.b;
            default:
                cr crVar = iVar.e;
                mzb mzbVar = iVar.k;
                wrh u = iVar.u(wrhVar);
                crVar.getClass();
                mzbVar.getClass();
                u.getClass();
                Bundle bundle = Bundle.EMPTY;
                bundle.getClass();
                alp u0 = cr.u0((gin) obj, bundle);
                if (u0 == null) {
                    return leu.S(new ump(-6));
                }
                lcg V = crVar.V(mzbVar, u, u0, bundle);
                y60 e = ((zgh) crVar.c).e();
                String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
                bwf bwfVar = bwf.c;
                arf g = tlm.g(bwfVar);
                Map map = (Map) g.getValue();
                arf g2 = tlm.g(bwfVar);
                ((Map) g2.getValue()).put(Constants.KEY_ACTION, "set_rating");
                map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
                tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
                return V;
        }
    }

    @Override // defpackage.fuc
    public void k(Bundle bundle, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                afg afgVar = (afg) obj;
                try {
                    r7o r7oVar = z7o.b;
                    e6j e6jVar = (e6j) bundle.getParcelable("nfc_fragment_bundle_key");
                    if (e6jVar != null) {
                        afgVar.invoke(e6jVar);
                        break;
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                    return;
                }
                break;
            default:
                int i2 = PromoCodeWebViewActivity.w;
                ((PromoCodeWebViewActivity) obj).finish();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0117, code lost:
    
        r2 = kotlin.text.StringsKt__StringsKt.split$default(r2, new java.lang.String[]{"|"}, false, 0, 6, null);
     */
    @Override // defpackage.oah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Map map, InputStream inputStream) {
        Set set;
        dp3 dp3Var;
        List<String> split$default;
        Double d;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ix6 ix6Var = (ix6) obj;
                xvd xvdVar = new xvd(map);
                String a = xvdVar.a("document-cache-control");
                if (a == null) {
                    dp3Var = null;
                } else {
                    String a2 = xvdVar.a("document-cache-label");
                    String lowerCase = a.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    List e0 = StringsKt.e0(lowerCase, new char[]{','}, 6);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = e0.iterator();
                    while (it.hasNext()) {
                        List e02 = StringsKt.e0((String) it.next(), new char[]{'='}, 6);
                        Pair pair = e02.size() != 2 ? null : new Pair(StringsKt.t0((String) e02.get(0)).toString(), StringsKt.t0((String) e02.get(1)).toString());
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    Map n = uah.n(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : e0) {
                        if (!StringsKt.N((String) obj2, '=')) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(StringsKt.t0((String) it2.next()).toString());
                    }
                    boolean contains = arrayList3.contains("allow-cache");
                    String str = (String) n.get("stale-time");
                    Double h = str != null ? b.h(str) : null;
                    String str2 = (String) n.get("fresh-time");
                    Double h2 = str2 != null ? b.h(str2) : null;
                    String str3 = (String) n.get("cache-mode");
                    if (str3 == null || split$default == null) {
                        set = null;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        for (String str4 : split$default) {
                            aq3 aq3Var = Intrinsics.d(str4, "disk") ? aq3.a : Intrinsics.d(str4, "in-memory") ? aq3.b : null;
                            if (aq3Var != null) {
                                arrayList4.add(aq3Var);
                            }
                        }
                        set = CollectionsKt.A0(arrayList4);
                    }
                    if (set == null) {
                        set = q5b.a;
                    }
                    dp3Var = new dp3(contains, h2, h, set, a2);
                }
                Long valueOf = (dp3Var == null || (d = dp3Var.b) == null) ? null : Long.valueOf((long) (d.doubleValue() * 1000));
                Long valueOf2 = valueOf != null ? Long.valueOf(System.currentTimeMillis() + valueOf.longValue()) : null;
                String a3 = new xvd(map).a("Document-Stale-If-Error");
                boolean d2 = Intrinsics.d(a3 != null ? StringsKt.t0(a3).toString() : null, PListParser.TAG_TRUE);
                String a4 = new xvd(map).a("X-Screen-Is-Broken");
                boolean d3 = Intrinsics.d(a4 != null ? StringsKt.t0(a4).toString() : null, PListParser.TAG_TRUE);
                g8k g8kVar = (g8k) ix6Var.n(map, inputStream);
                q4a q4aVar = new q4a(valueOf2);
                if (g8kVar instanceof f8k) {
                    b6a b6aVar = (b6a) ((f8k) g8kVar).a;
                    return new m4a(b6aVar.a, b6aVar.b, q4aVar, d2, d3);
                }
                if (g8kVar instanceof e8k) {
                    return new k4a(((e8k) g8kVar).a);
                }
                b6e.s();
                return null;
            default:
                UUID.randomUUID().toString();
                return ((oah) obj).n(map, new d6a(inputStream));
        }
    }

    public /* synthetic */ uvg(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ uvg(lah lahVar, oah oahVar, r0o r0oVar, boolean z) {
        this.a = 2;
        this.b = oahVar;
    }

    public /* synthetic */ uvg(int i, PendingIntent pendingIntent) {
        this.a = 8;
        this.b = pendingIntent;
    }
}
