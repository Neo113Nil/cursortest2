package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yandex.messenger.websdk.api.Notification;
import com.yandex.messenger.websdk.api.PushToken;
import com.yandex.messenger.websdk.api.PushTokenType;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class atn implements nwu, xsr, fsr, xxt, upr, kbp, cwh, OnCompleteListener, c2x, x5x {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public atn(Context context, sfx sfxVar) {
        this.a = 23;
        bz2 bz2Var = new bz2(23, false);
        try {
            t9t.b(context);
            bz2Var.c = t9t.a().c(vn3.e).a("PLAY_BILLING_LIBRARY", new p6b("proto"), new tjl());
        } catch (Throwable unused) {
            bz2Var.b = true;
        }
        this.c = bz2Var;
        this.b = sfxVar;
    }

    public void A(k3i k3iVar) {
        ((ArrayList) this.c).add(k3iVar);
    }

    public void B() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public boolean C(a4w a4wVar) {
        boolean containsKey;
        synchronized (this.c) {
            containsKey = ((LinkedHashMap) ((knn) this.b).b).containsKey(a4wVar);
        }
        return containsKey;
    }

    public void D(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public View E(int i, int i2, int i3, int i4) {
        v9r v9rVar = (v9r) this.c;
        gdu gduVar = (gdu) this.b;
        int f = gduVar.f();
        int m = gduVar.m();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View q = gduVar.q(i);
            int e = gduVar.e(q);
            int r = gduVar.r(q);
            v9rVar.b = f;
            v9rVar.c = m;
            v9rVar.d = e;
            v9rVar.e = r;
            if (i3 != 0) {
                v9rVar.a = i3;
                if (v9rVar.a()) {
                    return q;
                }
            }
            if (i4 != 0) {
                v9rVar.a = i4;
                if (v9rVar.a()) {
                    view = q;
                }
            }
            i += i5;
        }
        return view;
    }

    public String F(String str) {
        return hrg.r("enabled_", ((frt) this.c).c().a, StringUtils.PROCESS_POSTFIX_DELIMITER, str);
    }

    public rce G(String str) {
        pce pceVar = new pce((Context) this.b);
        pceVar.o = Boolean.FALSE;
        pceVar.c = str;
        return pceVar.a();
    }

    public String H(daf dafVar) {
        String str;
        synchronized (((ck7) this.b)) {
            str = (String) ((ck7) this.b).a(dafVar);
        }
        if (str == null) {
            kno knoVar = (kno) ((vx6) this.c).f();
            try {
                dafVar.b(knoVar.a);
                byte[] digest = knoVar.a.digest();
                char[] cArr = xut.b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i];
                        int i2 = i * 2;
                        char[] cArr2 = xut.a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((vx6) this.c).c(knoVar);
            }
        }
        synchronized (((ck7) this.b)) {
            ((ck7) this.b).d(dafVar, str);
        }
        return str;
    }

    public boolean I(View view) {
        v9r v9rVar = (v9r) this.c;
        gdu gduVar = (gdu) this.b;
        int f = gduVar.f();
        int m = gduVar.m();
        int e = gduVar.e(view);
        int r = gduVar.r(view);
        v9rVar.b = f;
        v9rVar.c = m;
        v9rVar.d = e;
        v9rVar.e = r;
        v9rVar.a = 24579;
        return v9rVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x02f6, code lost:
    
        if (r2 == r5) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x02f8, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02da, code lost:
    
        if (r2 == r5) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02bd, code lost:
    
        if (r2 == r5) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(xsq xsqVar, cg6 cg6Var) {
        wuq wuqVar;
        int i;
        Iterable iterable;
        ArrayList arrayList;
        List c;
        ArrayList arrayList2;
        Iterator it;
        int i2;
        String str;
        String a;
        String c2;
        xsq xsqVar2 = xsqVar;
        cce cceVar = (cce) this.c;
        if (cg6Var instanceof wuq) {
            wuqVar = (wuq) cg6Var;
            int i3 = wuqVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wuqVar.o = i3 - Integer.MIN_VALUE;
                Object obj = wuqVar.m;
                nm6 nm6Var = nm6.a;
                i = wuqVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (xsqVar2 instanceof psq) {
                        ckq ckqVar = ((psq) xsqVar2).g;
                        saf safVar = ckqVar.e;
                        String str2 = ckqVar.f;
                        if (safVar instanceof nn6) {
                            nn6 nn6Var = (nn6) safVar;
                            iterable = xz0.w(new String[]{nn6Var.n, str2, nn6Var.o, nn6Var.p});
                        } else {
                            if (!(safVar instanceof mn6)) {
                                b6e.s();
                                return null;
                            }
                            iterable = xz0.w(new String[]{((mn6) safVar).n, str2});
                        }
                    } else {
                        if (xsqVar2 instanceof gsq) {
                            ArrayList arrayList3 = ((gsq) xsqVar2).g.c;
                            arrayList2 = new ArrayList(v75.o(arrayList3, 10));
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((af4) it2.next()).c);
                            }
                        } else if (xsqVar2 instanceof osq) {
                            List list = ((osq) xsqVar2).g.b;
                            arrayList2 = new ArrayList(v75.o(list, 10));
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(((kdn) it3.next()).c);
                            }
                        } else if (xsqVar2 instanceof isq) {
                            List list2 = ((isq) xsqVar2).g.d;
                            arrayList2 = new ArrayList(v75.o(list2, 10));
                            Iterator it4 = list2.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(((cf4) it4.next()).c);
                            }
                        } else if (xsqVar2 instanceof csq) {
                            iterable = ((csq) xsqVar2).g.b;
                        } else if (xsqVar2 instanceof hsq) {
                            we4 we4Var = ((hsq) xsqVar2).g;
                            List list3 = we4Var.c;
                            ArrayList arrayList4 = new ArrayList(v75.o(list3, 10));
                            Iterator it5 = list3.iterator();
                            while (it5.hasNext()) {
                                arrayList4.add(((ve4) it5.next()).e);
                            }
                            iterable = CollectionsKt.h0(arrayList4, we4Var.a);
                        } else {
                            if (xsqVar2 instanceof fsq) {
                                List<g24> list4 = ((fsq) xsqVar2).g.b;
                                arrayList = new ArrayList();
                                for (g24 g24Var : list4) {
                                    if (g24Var == null) {
                                        b6e.s();
                                        return null;
                                    }
                                    saf safVar2 = g24Var.d;
                                    if (safVar2 instanceof nn6) {
                                        nn6 nn6Var2 = (nn6) safVar2;
                                        c = u75.h(nn6Var2.n, nn6Var2.o, nn6Var2.p);
                                    } else {
                                        if (!(safVar2 instanceof mn6)) {
                                            b6e.s();
                                            return null;
                                        }
                                        c = t75.c(((mn6) safVar2).n);
                                    }
                                    z75.t(arrayList, c);
                                }
                            } else if (xsqVar2 instanceof nsq) {
                                iterable = t75.c(((nsq) xsqVar2).g.a);
                            } else if (xsqVar2 instanceof jsq) {
                                List<rs4> list5 = ((jsq) xsqVar2).g.a;
                                arrayList = new ArrayList();
                                for (rs4 rs4Var : list5) {
                                    n8g b = t75.b();
                                    String str3 = rs4Var.a;
                                    gps gpsVar = rs4Var.b;
                                    b.add(str3);
                                    String str4 = gpsVar.a;
                                    if (str4 != null) {
                                        b.add(str4);
                                    }
                                    for (nps npsVar : gpsVar.b) {
                                        if (!(npsVar instanceof lps)) {
                                            if (!(npsVar instanceof mps)) {
                                                b6e.s();
                                                return null;
                                            }
                                            b.add(((mps) npsVar).a);
                                        }
                                    }
                                    z75.t(arrayList, t75.a(b));
                                }
                            } else if (xsqVar2 instanceof tsq) {
                                iterable = u75.i(((tsq) xsqVar2).g.g);
                            } else {
                                if (!(xsqVar2 instanceof rsq) && !(xsqVar2 instanceof dsq) && !(xsqVar2 instanceof ssq) && !(xsqVar2 instanceof msq) && !(xsqVar2 instanceof usq)) {
                                    b6e.s();
                                    return null;
                                }
                                iterable = null;
                            }
                            iterable = arrayList;
                        }
                        iterable = arrayList2;
                    }
                    if (iterable != null) {
                        it = iterable.iterator();
                        i2 = 0;
                    }
                    zd3 zd3Var = xsqVar2.d;
                    str = zd3Var instanceof sd3 ? ((sd3) zd3Var).b : zd3Var instanceof yd3 ? ((yd3) zd3Var).e : null;
                    if (str != null) {
                        rce G = G(str);
                        wuqVar.j = xsqVar2;
                        wuqVar.k = null;
                        wuqVar.l = 0;
                        wuqVar.o = 2;
                        obj = cceVar.a(G, wuqVar);
                    }
                    a = xsqVar2.c.a();
                    if (a != null) {
                    }
                    c2 = xsqVar2.c();
                    if (c2 != null) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    if (i == 2) {
                        xsqVar2 = wuqVar.j;
                        qgg.h0(obj);
                        a = xsqVar2.c.a();
                        if (a != null) {
                            rce G2 = G(a);
                            wuqVar.j = xsqVar2;
                            wuqVar.k = null;
                            wuqVar.l = 0;
                            wuqVar.o = 3;
                            obj = cceVar.a(G2, wuqVar);
                        }
                        c2 = xsqVar2.c();
                        if (c2 != null) {
                        }
                        return Unit.a;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xsqVar2 = wuqVar.j;
                    qgg.h0(obj);
                    c2 = xsqVar2.c();
                    if (c2 != null) {
                        rce G3 = G(c2);
                        wuqVar.j = null;
                        wuqVar.k = null;
                        wuqVar.l = 0;
                        wuqVar.o = 4;
                        obj = cceVar.a(G3, wuqVar);
                    }
                    return Unit.a;
                }
                int i4 = wuqVar.l;
                it = wuqVar.k;
                xsq xsqVar3 = wuqVar.j;
                qgg.h0(obj);
                i2 = i4;
                xsqVar2 = xsqVar3;
                while (it.hasNext()) {
                    rce G4 = G((String) it.next());
                    wuqVar.j = xsqVar2;
                    wuqVar.k = it;
                    wuqVar.l = i2;
                    wuqVar.o = 1;
                    if (cceVar.a(G4, wuqVar) == nm6Var) {
                        break;
                    }
                }
                zd3 zd3Var2 = xsqVar2.d;
                if (zd3Var2 instanceof sd3) {
                }
                if (str != null) {
                }
                a = xsqVar2.c.a();
                if (a != null) {
                }
                c2 = xsqVar2.c();
                if (c2 != null) {
                }
                return Unit.a;
            }
        }
        wuqVar = new wuq(this, cg6Var);
        Object obj2 = wuqVar.m;
        nm6 nm6Var2 = nm6.a;
        i = wuqVar.o;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        zd3 zd3Var22 = xsqVar2.d;
        if (zd3Var22 instanceof sd3) {
        }
        if (str != null) {
        }
        a = xsqVar2.c.a();
        if (a != null) {
        }
        c2 = xsqVar2.c();
        if (c2 != null) {
        }
        return Unit.a;
    }

    public void K(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        D(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jar jarVar = (jar) ((ArrayList) this.c).get(size);
            int i4 = jarVar.a;
            if (i4 >= i) {
                jarVar.a = i4 + i2;
            }
        }
    }

    public void L(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        D(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            jar jarVar = (jar) ((ArrayList) this.c).get(size);
            int i4 = jarVar.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.c).remove(size);
                } else {
                    jarVar.a = i4 - i2;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011b, code lost:
    
        if (r9.equals("L8") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void M(jtc jtcVar) {
        rio rioVar = (rio) this.c;
        ejo ejoVar = ejo.c;
        String str = (String) ((nlp) jtcVar.b).a.get("range");
        if (str != null) {
            try {
                ejoVar = ejo.a(str);
            } catch (r7k e) {
                rioVar.a.f(e, "SDP format error.");
                return;
            }
        }
        Uri uri = rioVar.h;
        hld.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (true) {
            qsn qsnVar = ((nlp) jtcVar.b).b;
            char c = 1;
            if (i >= qsnVar.d) {
                qsn t = yde.t(i2, objArr);
                boolean isEmpty = t.isEmpty();
                m97 m97Var = rioVar.a;
                if (isEmpty) {
                    m97Var.f(null, "No playable track.");
                    return;
                }
                m97Var.getClass();
                long j = ejoVar.b;
                wio wioVar = (wio) m97Var.b;
                for (int i3 = 0; i3 < t.d; i3++) {
                    vio vioVar = new vio(wioVar, (zio) t.get(i3), i3, wioVar.h);
                    wioVar.e.add(vioVar);
                    vioVar.b.X(vioVar.a.b, wioVar.c, 0);
                }
                yio yioVar = (yio) wioVar.g.b;
                yioVar.l = dvt.Y(j - ejoVar.a);
                yioVar.m = !(j == -9223372036854775807L);
                yioVar.n = j == -9223372036854775807L;
                yioVar.o = false;
                yioVar.B();
                rioVar.p = true;
                return;
            }
            lmh lmhVar = (lmh) qsnVar.get(i);
            String N = ltg.N(lmhVar.j.b);
            N.getClass();
            switch (N.hashCode()) {
                case -1922091719:
                    if (N.equals("MPEG4-GENERIC")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 2412:
                    break;
                case 64593:
                    if (N.equals("AC3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 64934:
                    if (N.equals("AMR")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 74609:
                    if (N.equals("L16")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 85182:
                    if (N.equals("VP8")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 85183:
                    if (N.equals("VP9")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 2194728:
                    if (N.equals(ScreenMirroringConfig.Video.CODEC)) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2194729:
                    if (N.equals("H265")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2433087:
                    if (N.equals("OPUS")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 2450119:
                    if (N.equals("PCMA")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2450139:
                    if (N.equals("PCMU")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1061166827:
                    if (N.equals("MP4A-LATM")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1934494802:
                    if (N.equals("AMR-WB")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1959269366:
                    if (N.equals("MP4V-ES")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 2137188397:
                    if (N.equals("H263-1998")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 2137209252:
                    if (N.equals("H263-2000")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 15:
                case 16:
                    zio zioVar = new zio((sio) jtcVar.a, lmhVar, uri);
                    int i4 = i2 + 1;
                    int e2 = pde.e(objArr.length, i4);
                    if (e2 > objArr.length) {
                        objArr = Arrays.copyOf(objArr, e2);
                    }
                    objArr[i2] = zioVar;
                    i2 = i4;
                    break;
            }
            i++;
        }
    }

    public void N() {
        rio rioVar = (rio) this.c;
        vq1.A(rioVar.o == 2);
        rioVar.o = 1;
        rioVar.r = false;
        long j = rioVar.s;
        if (j != -9223372036854775807L) {
            rioVar.z(dvt.m0(j));
        }
    }

    @Override // defpackage.nwu
    public void O(boolean z) {
        ((g6p) this.b).s((s9p) this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
    
        if (r7 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(ptq ptqVar, cg6 cg6Var) {
        xuq xuqVar;
        int i;
        List list;
        Iterator it;
        int i2;
        Object obj;
        String str;
        if (cg6Var instanceof xuq) {
            xuqVar = (xuq) cg6Var;
            int i3 = xuqVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xuqVar.o = i3 - Integer.MIN_VALUE;
                Object obj2 = xuqVar.m;
                Object obj3 = nm6.a;
                i = xuqVar.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (ptqVar != null && (list = ptqVar.b) != null) {
                        it = list.iterator();
                        i2 = 0;
                    }
                    xuqVar.j = null;
                    xuqVar.k = null;
                    xuqVar.o = 2;
                    if (ptqVar != null && (str = ptqVar.a) != null) {
                        obj = ((cce) this.c).a(G(str), xuqVar);
                        if (obj != nm6.a) {
                        }
                    }
                    obj = Unit.a;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj2);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = xuqVar.l;
                    Iterator it2 = xuqVar.k;
                    ptq ptqVar2 = xuqVar.j;
                    qgg.h0(obj2);
                    it = it2;
                    i2 = i4;
                    ptqVar = ptqVar2;
                }
                while (it.hasNext()) {
                    xsq xsqVar = (xsq) it.next();
                    xuqVar.j = ptqVar;
                    xuqVar.k = it;
                    xuqVar.l = i2;
                    xuqVar.o = 1;
                    if (J(xsqVar, xuqVar) == obj3) {
                        break;
                    }
                }
                xuqVar.j = null;
                xuqVar.k = null;
                xuqVar.o = 2;
                if (ptqVar != null) {
                    obj = ((cce) this.c).a(G(str), xuqVar);
                    if (obj != nm6.a) {
                    }
                }
                obj = Unit.a;
            }
        }
        xuqVar = new xuq(this, cg6Var);
        Object obj22 = xuqVar.m;
        Object obj32 = nm6.a;
        i = xuqVar.o;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        xuqVar.j = null;
        xuqVar.k = null;
        xuqVar.o = 2;
        if (ptqVar != null) {
        }
        obj = Unit.a;
    }

    public byte[] Q() {
        String str = (String) this.c;
        try {
            String string = ((SharedPreferences) this.b).getString(str, null);
            if (string != null) {
                return leu.K(string);
            }
            throw new FileNotFoundException("can't read keyset; the pref value " + str + " does not exist");
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(hrg.q("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public ucr R(a4w a4wVar) {
        ucr a;
        a4wVar.getClass();
        synchronized (this.c) {
            a = ((knn) this.b).a(a4wVar);
        }
        return a;
    }

    public tmb S(wjb wjbVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object obj = linkedHashMap.get(wjbVar);
        if (obj == null) {
            fnb fnbVar = (fnb) this.b;
            cvo cvoVar = cvo.i;
            obj = new tmb(12, fnbVar, o6m.b(wjbVar, null, 6));
            linkedHashMap.put(wjbVar, obj);
        }
        return (tmb) obj;
    }

    public boolean T(String str) {
        str.getClass();
        Context context = (Context) this.b;
        SharedPreferences sharedPreferences = context.getSharedPreferences("actions", 0);
        sharedPreferences.getClass();
        boolean z = sharedPreferences.getBoolean(F(str), true);
        if (z) {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("actions", 0);
            sharedPreferences2.getClass();
            sharedPreferences2.edit().putBoolean(F(str), false).apply();
        }
        return z;
    }

    public ucr U(a4w a4wVar) {
        ucr s;
        synchronized (this.c) {
            s = ((knn) this.b).s(a4wVar);
        }
        return s;
    }

    public void V(bfx bfxVar) {
        if (bfxVar == null) {
            return;
        }
        try {
            egx t = fgx.t();
            t.e((sfx) this.b);
            t.d();
            fgx.n((fgx) t.b, bfxVar);
            ((bz2) this.c).O((fgx) t.c());
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void W(bfx bfxVar, int i) {
        try {
            rfx rfxVar = (rfx) ((sfx) this.b).g();
            rfxVar.d();
            sfx.n((sfx) rfxVar.b, i);
            this.b = (sfx) rfxVar.c();
            V(bfxVar);
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void X(kfx kfxVar) {
        if (kfxVar == null) {
            return;
        }
        try {
            egx t = fgx.t();
            t.e((sfx) this.b);
            t.d();
            fgx.o((fgx) t.b, kfxVar);
            ((bz2) this.c).O((fgx) t.c());
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void Y(ofx ofxVar) {
        try {
            egx t = fgx.t();
            t.e((sfx) this.b);
            t.d();
            fgx.p((fgx) t.b, ofxVar);
            ((bz2) this.c).O((fgx) t.c());
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to log.", th);
        }
    }

    public void Z(igx igxVar) {
        try {
            bz2 bz2Var = (bz2) this.c;
            egx t = fgx.t();
            t.e((sfx) this.b);
            t.d();
            fgx.r((fgx) t.b, igxVar);
            bz2Var.O((fgx) t.c());
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.cwh
    public wvh a(hgp hgpVar) {
        return (wvh) ((Function1) this.c).invoke(((cwh) this.b).a(hgpVar));
    }

    public void a0(jgx jgxVar) {
        if (jgxVar == null) {
            return;
        }
        try {
            egx t = fgx.t();
            t.e((sfx) this.b);
            t.d();
            fgx.s((fgx) t.b, jgxVar);
            ((bz2) this.c).O((fgx) t.c());
        } catch (Throwable th) {
            l8x.h("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.xsr
    public int b() {
        Object[] objArr = (Object[]) this.c;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    @Override // defpackage.fsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(Map map) {
        JSONObject jSONObject;
        String F;
        String str;
        String F2;
        JSONObject B;
        String str2;
        JSONObject B2;
        String str3;
        String str4;
        String str5;
        String str6;
        efj efjVar;
        JSONObject B3;
        JSONObject B4;
        JSONObject B5;
        JSONObject B6;
        map.getClass();
        hfj hfjVar = (hfj) ((Notification) ((rrr) this.c).a.b.getValue());
        Context context = hfjVar.a;
        afj afjVar = hfjVar.k;
        qdc qdcVar = hfjVar.d;
        String str7 = (String) map.get("xiva");
        if (str7 != null) {
            try {
                jSONObject = new JSONObject(str7);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                F = vnj.F("transit_id", jSONObject);
                Map n = uah.n(u75.i(F == null ? new Pair("transit_id", F) : null));
                qdcVar.sendEvent("wm_push_received", n);
                hfjVar.g.invoke();
                if (hfjVar.j && afjVar != null && (str = (String) map.get("messenger")) != null) {
                    JSONObject jSONObject2 = new JSONObject(str);
                    Resources resources = context.getResources();
                    resources.getClass();
                    F2 = vnj.F("Chat", jSONObject2);
                    JSONObject B7 = vnj.B("Message", jSONObject2);
                    B = B7 == null ? vnj.B("ServerMessageInfo", B7) : null;
                    if (B != null || (B6 = vnj.B("From", B)) == null) {
                        str2 = null;
                    } else {
                        str2 = vnj.F("DisplayName", B6);
                        if (str2 == null) {
                            str2 = vnj.F("Nickname", B6);
                        }
                    }
                    Long C = B == null ? vnj.C("Timestamp", B) : null;
                    B2 = vnj.B("Message", jSONObject2);
                    if (B2 != null || (B4 = vnj.B("ClientMessage", B2)) == null || (B5 = vnj.B("Plain", B4)) == null) {
                        str3 = null;
                    } else {
                        JSONObject B8 = vnj.B("Text", B5);
                        if (B8 == null || (str3 = vnj.F("MessageText", B8)) == null) {
                            str3 = vnj.B("Image", B5) != null ? resources.getString(R.string.messenger_message_with_image) : null;
                            if (str3 == null) {
                                str3 = vnj.B("Gallery", B5) != null ? resources.getString(R.string.messenger_message_with_gallery) : null;
                                if (str3 == null) {
                                    str3 = vnj.B("Sticker", B5) != null ? resources.getString(R.string.messenger_message_with_sticker) : null;
                                    if (str3 == null) {
                                        str3 = vnj.B("MiscFile", B5) != null ? resources.getString(R.string.messenger_message_with_file) : null;
                                        if (str3 == null) {
                                            str3 = vnj.B("Voice", B5) != null ? resources.getString(R.string.voice_message_placeholder_text) : null;
                                            if (str3 == null) {
                                                JSONObject B9 = vnj.B("Poll", B5);
                                                if (B9 != null) {
                                                    String F3 = vnj.F("title", B9);
                                                    if (F3 == null) {
                                                        F3 = "";
                                                    }
                                                    str3 = "📊 ".concat(F3);
                                                } else {
                                                    str3 = null;
                                                }
                                                if (str3 == null) {
                                                    str3 = "Message";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (F2 != null || str2 == null || C == null || str3 == null) {
                        str4 = "Message";
                        str5 = "ServerMessageInfo";
                        str6 = "Timestamp";
                        efjVar = null;
                    } else {
                        String str8 = str3;
                        str5 = "ServerMessageInfo";
                        str4 = "Message";
                        str6 = "Timestamp";
                        efjVar = new efj(F2, str2, str8, C.longValue());
                    }
                    if (efjVar == null) {
                        qdcVar.sendEvent("wm_push_show", n);
                        afjVar.a(context, efjVar);
                    } else {
                        String F4 = vnj.F("Chat", jSONObject2);
                        JSONObject B10 = vnj.B(str4, jSONObject2);
                        Long C2 = (B10 == null || (B3 = vnj.B(str5, B10)) == null) ? null : vnj.C(str6, B3);
                        sfj sfjVar = (F4 == null || C2 == null) ? null : new sfj(F4, C2.longValue());
                        if (sfjVar != null) {
                            qdcVar.sendEvent("wm_push_seen", n);
                            String str9 = sfjVar.a;
                            HashMap hashMap = afjVar.c;
                            sfj sfjVar2 = (sfj) hashMap.get(str9);
                            if (sfjVar2 != null && sfjVar.b >= sfjVar2.b) {
                                afjVar.b.b.cancel(null, str9.hashCode());
                            }
                            hashMap.put(str9, sfjVar);
                        } else {
                            qdcVar.sendEvent("wm_push_parse_data_error", n);
                        }
                    }
                    return true;
                }
                return false;
            }
        }
        F = null;
        Map n2 = uah.n(u75.i(F == null ? new Pair("transit_id", F) : null));
        qdcVar.sendEvent("wm_push_received", n2);
        hfjVar.g.invoke();
        if (hfjVar.j) {
            JSONObject jSONObject22 = new JSONObject(str);
            Resources resources2 = context.getResources();
            resources2.getClass();
            F2 = vnj.F("Chat", jSONObject22);
            JSONObject B72 = vnj.B("Message", jSONObject22);
            if (B72 == null) {
            }
            if (B != null) {
            }
            str2 = null;
            if (B == null) {
            }
            B2 = vnj.B("Message", jSONObject22);
            if (B2 != null) {
            }
            str3 = null;
            if (F2 != null) {
            }
            str4 = "Message";
            str5 = "ServerMessageInfo";
            str6 = "Timestamp";
            efjVar = null;
            if (efjVar == null) {
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.kbp
    public int e(int i) {
        CharSequence charSequence = (CharSequence) this.b;
        do {
            i = ((ah3) this.c).z(i);
            if (i == -1 || i == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i)));
        return i;
    }

    @Override // defpackage.kbp
    public int g(int i) {
        do {
            i = ((ah3) this.c).I(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i)));
        return i;
    }

    @Override // defpackage.xxt
    public Object get(String str) {
        Object obj = ((LinkedHashMap) this.b).get(str);
        return obj == null ? ((xxt) this.c).get(str) : obj;
    }

    @Override // defpackage.kbp
    public int h(int i) {
        do {
            i = ((ah3) this.c).z(i);
            if (i == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x03a7, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0116, code lost:
    
        if (")".equals(defpackage.sgv.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // defpackage.upr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(byte[] bArr, int i, int i2, tpr tprVar, ua6 ua6Var) {
        ugv ugvVar;
        String str;
        ?? r1;
        String sb;
        int i3;
        char c;
        atn atnVar = this;
        d7k d7kVar = (d7k) atnVar.b;
        d7kVar.F(i + i2, bArr);
        d7kVar.H(i);
        ArrayList arrayList = new ArrayList();
        try {
            bhv.d(d7kVar);
            while (!TextUtils.isEmpty(d7kVar.i(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z = false;
                int i4 = -1;
                int i5 = 0;
                char c2 = 65535;
                while (true) {
                    ?? r9 = 1;
                    if (c2 == 65535) {
                        i5 = d7kVar.b;
                        String i6 = d7kVar.i(StandardCharsets.UTF_8);
                        c2 = i6 == null ? (char) 0 : "STYLE".equals(i6) ? (char) 2 : i6.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        d7kVar.H(i5);
                        if (c2 == 0) {
                            zwf.c0(new z6u(arrayList2), tprVar, ua6Var);
                            return;
                        }
                        if (c2 == 1) {
                            while (!TextUtils.isEmpty(d7kVar.i(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c2 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    xq0.x("A style block was found after the first cue.");
                                    return;
                                }
                                d7kVar.i(StandardCharsets.UTF_8);
                                sgv sgvVar = (sgv) atnVar.c;
                                d7k d7kVar2 = sgvVar.a;
                                StringBuilder sb2 = sgvVar.b;
                                sb2.setLength(0);
                                int i7 = d7kVar.b;
                                while (!TextUtils.isEmpty(d7kVar.i(StandardCharsets.UTF_8))) {
                                }
                                d7kVar2.F(d7kVar.b, d7kVar.a);
                                d7kVar2.H(i7);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    sgv.c(d7kVar2);
                                    if (d7kVar2.a() >= 5 && "::cue".equals(d7kVar2.t(5, StandardCharsets.UTF_8))) {
                                        int i8 = d7kVar2.b;
                                        String b = sgv.b(d7kVar2, sb2);
                                        if (b != null) {
                                            if ("{".equals(b)) {
                                                d7kVar2.H(i8);
                                                str = "";
                                            } else if ("(".equals(b)) {
                                                int i9 = d7kVar2.b;
                                                int i10 = d7kVar2.c;
                                                boolean z2 = z ? 1 : 0;
                                                while (i9 < i10 && z2 == 0) {
                                                    int i11 = i9 + 1;
                                                    z2 = ((char) d7kVar2.a[i9]) == ')' ? r9 : z ? 1 : 0;
                                                    i9 = i11;
                                                }
                                                str = d7kVar2.t((i9 - 1) - d7kVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(sgv.b(d7kVar2, sb2))) {
                                                tgv tgvVar = new tgv();
                                                tgvVar.a = "";
                                                tgvVar.b = "";
                                                tgvVar.c = Collections.EMPTY_SET;
                                                tgvVar.d = "";
                                                tgvVar.e = str2;
                                                tgvVar.g = z;
                                                tgvVar.i = z;
                                                tgvVar.j = i4;
                                                tgvVar.k = i4;
                                                tgvVar.l = i4;
                                                tgvVar.m = i4;
                                                tgvVar.n = i4;
                                                tgvVar.p = i4;
                                                tgvVar.q = z;
                                                if (!"".equals(str)) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i4) {
                                                        ?? matcher = sgv.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r9);
                                                            group.getClass();
                                                            tgvVar.d = group;
                                                        }
                                                        str = str.substring(z ? 1 : 0, indexOf);
                                                    }
                                                    int i12 = dvt.a;
                                                    String[] split = str.split("\\.", i4);
                                                    String str3 = split[z ? 1 : 0];
                                                    int indexOf2 = str3.indexOf(35);
                                                    if (indexOf2 != i4) {
                                                        tgvVar.b = str3.substring(z ? 1 : 0, indexOf2);
                                                        tgvVar.a = str3.substring(indexOf2 + 1);
                                                    } else {
                                                        tgvVar.b = str3;
                                                    }
                                                    if (split.length > r9) {
                                                        int length = split.length;
                                                        vq1.v(length <= split.length ? r9 : z ? 1 : 0);
                                                        tgvVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r9, length)));
                                                    }
                                                }
                                                boolean z3 = z ? 1 : 0;
                                                String str4 = null;
                                                boolean z4 = r9;
                                                while (z3 == 0) {
                                                    int i13 = d7kVar2.b;
                                                    str4 = sgv.b(d7kVar2, sb2);
                                                    boolean z5 = (str4 == null || "}".equals(str4)) ? z4 : z;
                                                    if (z5 == 0) {
                                                        d7kVar2.H(i13);
                                                        sgv.c(d7kVar2);
                                                        String a = sgv.a(d7kVar2, sb2);
                                                        if (!"".equals(a) && StringUtils.PROCESS_POSTFIX_DELIMITER.equals(sgv.b(d7kVar2, sb2))) {
                                                            sgv.c(d7kVar2);
                                                            StringBuilder sb3 = new StringBuilder();
                                                            boolean z6 = false;
                                                            while (true) {
                                                                if (z6) {
                                                                    sb = sb3.toString();
                                                                } else {
                                                                    int i14 = d7kVar2.b;
                                                                    boolean z7 = z6;
                                                                    String b2 = sgv.b(d7kVar2, sb2);
                                                                    if (b2 == null) {
                                                                        sb = null;
                                                                    } else if ("}".equals(b2) || ";".equals(b2)) {
                                                                        d7kVar2.H(i14);
                                                                        z6 = true;
                                                                    } else {
                                                                        sb3.append(b2);
                                                                        z6 = z7;
                                                                    }
                                                                }
                                                            }
                                                            if (sb != null && !"".equals(sb)) {
                                                                int i15 = d7kVar2.b;
                                                                String b3 = sgv.b(d7kVar2, sb2);
                                                                if (!";".equals(b3)) {
                                                                    if ("}".equals(b3)) {
                                                                        d7kVar2.H(i15);
                                                                    }
                                                                }
                                                                if ("color".equals(a)) {
                                                                    i3 = 1;
                                                                    tgvVar.f = z85.a(sb, true);
                                                                    tgvVar.g = true;
                                                                } else {
                                                                    i3 = 1;
                                                                    if ("background-color".equals(a)) {
                                                                        tgvVar.h = z85.a(sb, true);
                                                                        tgvVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a)) {
                                                                            if ("over".equals(sb)) {
                                                                                tgvVar.p = 1;
                                                                            } else if ("under".equals(sb)) {
                                                                                tgvVar.p = 2;
                                                                                r1 = 1;
                                                                                z4 = r1;
                                                                                z3 = z5;
                                                                                z = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a)) {
                                                                            tgvVar.q = "all".equals(sb) || sb.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a)) {
                                                                            if ("underline".equals(sb)) {
                                                                                i3 = 1;
                                                                                tgvVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a)) {
                                                                            tgvVar.e = ltg.M(sb);
                                                                        } else if (!"font-weight".equals(a)) {
                                                                            i3 = 1;
                                                                            if ("font-style".equals(a)) {
                                                                                if ("italic".equals(sb)) {
                                                                                    tgvVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a)) {
                                                                                ?? matcher2 = sgv.d.matcher(ltg.M(sb));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c = 65535;
                                                                                    switch (c) {
                                                                                        case 0:
                                                                                            r1 = 1;
                                                                                            tgvVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r1 = 1;
                                                                                            tgvVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r1 = 1;
                                                                                            tgvVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            e7o.n();
                                                                                            return;
                                                                                    }
                                                                                    String group3 = matcher2.group(r1);
                                                                                    group3.getClass();
                                                                                    tgvVar.o = Float.parseFloat(group3);
                                                                                    z4 = r1;
                                                                                    z3 = z5;
                                                                                    z = false;
                                                                                } else {
                                                                                    vq1.n0("WebvttCssParser", "Invalid font-size: '" + sb + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb)) {
                                                                            i3 = 1;
                                                                            tgvVar.l = 1;
                                                                        }
                                                                        z4 = r1;
                                                                        z3 = z5;
                                                                        z = false;
                                                                    }
                                                                }
                                                                r1 = i3;
                                                                z4 = r1;
                                                                z3 = z5;
                                                                z = false;
                                                            }
                                                            r1 = 1;
                                                            z4 = r1;
                                                            z3 = z5;
                                                            z = false;
                                                        }
                                                    }
                                                    r1 = z4;
                                                    z4 = r1;
                                                    z3 = z5;
                                                    z = false;
                                                }
                                                boolean z8 = z4;
                                                if ("}".equals(str4)) {
                                                    arrayList3.add(tgvVar);
                                                }
                                                r9 = z8;
                                                z = false;
                                                i4 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c2 == 3) {
                                Pattern pattern = zgv.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String i16 = d7kVar.i(charset);
                                if (i16 == null) {
                                    ugvVar = null;
                                } else {
                                    Pattern pattern2 = zgv.a;
                                    Matcher matcher3 = pattern2.matcher(i16);
                                    if (matcher3.matches()) {
                                        ugvVar = zgv.d(null, matcher3, d7kVar, arrayList);
                                    } else {
                                        ugvVar = null;
                                        String i17 = d7kVar.i(charset);
                                        if (i17 != null) {
                                            Matcher matcher4 = pattern2.matcher(i17);
                                            if (matcher4.matches()) {
                                                ugvVar = zgv.d(i16.trim(), matcher4, d7kVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (ugvVar != null) {
                                    arrayList2.add(ugvVar);
                                }
                            }
                            atnVar = this;
                        }
                    }
                }
            }
        } catch (r7k e) {
            xq0.t(e);
        }
    }

    @Override // defpackage.c2x
    public void n(String str, long j, long j2, long j3) {
        c2x c2xVar = (c2x) this.b;
        if (c2xVar != null) {
            c2xVar.n(str, j, j2, j3);
        }
    }

    @Override // defpackage.xsr
    public String o() {
        return (String) this.b;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.a) {
            case 21:
                ((Map) ((apo) this.c).c).remove((i8s) this.b);
                return;
            default:
                hox hoxVar = (hox) this.b;
                i8s i8sVar = (i8s) this.c;
                synchronized (hoxVar.f) {
                    hoxVar.e.remove(i8sVar);
                }
                return;
        }
    }

    @Override // defpackage.fsr
    public void q(String str) {
        str.getClass();
        Notification notification = (Notification) ((rrr) this.c).a.b.getValue();
        PushTokenType pushTokenType = PushTokenType.a;
        PushToken pushToken = new PushToken(str);
        hfj hfjVar = (hfj) notification;
        hfjVar.getClass();
        qdc qdcVar = hfjVar.d;
        qdcVar.sendEvent("wm_push_set_token_local", tah.b(new Pair("notificationsEnabled", Boolean.valueOf(hfjVar.j))));
        Handler handler = hfjVar.i;
        handler.post(new zvh(5, hfjVar, pushToken));
        if (hfjVar.j) {
            String str2 = hfjVar.c.c;
            if (str2 == null || StringsKt.U(str2)) {
                qdcVar.sendEvent("wm_push_set_token_to_backend_error", tah.b(new Pair("reason", "empty deviceId")));
            } else {
                handler.post(new zvh(4, hfjVar, (Object) null));
            }
        }
    }

    @Override // defpackage.kbp
    public int r(int i) {
        do {
            i = ((ah3) this.c).I(i);
            if (i == -1 || i == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.b).charAt(i - 1)));
        return i;
    }

    @Override // defpackage.fsr
    public pjc t() {
        return (ss3) this.b;
    }

    @Override // defpackage.c2x
    public void v(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        w1x w1xVar = (w1x) this.c;
        if (((c2x) this.b) != null) {
            if (i == 2001) {
                Object[] objArr = {Integer.valueOf(w1xVar.i)};
                msg msgVar = w1xVar.a;
                Log.w(msgVar.a, msgVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((xun) w1xVar.h.a).i.iterator();
                while (it.hasNext()) {
                    ((wun) it.next()).n();
                }
                i2 = 2001;
            } else {
                i2 = i;
            }
            ((c2x) this.b).v(str, j, i2, obj, j2, j3);
        }
    }

    @Override // defpackage.upr
    public int y() {
        return 1;
    }

    @Override // defpackage.xsr
    public void z(wsr wsrVar) {
        wsrVar.getClass();
        ezf.t(wsrVar, (Object[]) this.c);
    }

    @Override // defpackage.nwu
    public void d() {
    }

    public /* synthetic */ atn(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ atn(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ atn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public atn(pv9 pv9Var) {
        this.a = 17;
        pv9Var.getClass();
        this.b = pv9Var;
        this.c = new LinkedHashSet();
    }

    public atn(Context context, cce cceVar) {
        this.a = 8;
        context.getClass();
        this.b = context;
        this.c = cceVar;
    }

    public atn(fnb fnbVar) {
        this.a = 16;
        this.b = fnbVar;
        this.c = new LinkedHashMap();
    }

    public atn(int i) {
        this.a = i;
        switch (i) {
            case 18:
                this.b = new d7k();
                this.c = new sgv();
                break;
            default:
                this.b = new ck7(1000L);
                this.c = irf.U(10, new jml());
                break;
        }
    }

    public atn(Context context, mqs mqsVar) {
        this.a = 12;
        weo.M(context, R.attr.iconSecondary);
        context.getString(R.string.menu_element_delete_from_phonoteka);
        this.b = mqsVar;
        this.c = context;
    }

    public atn(String str, Object[] objArr) {
        this.a = 7;
        str.getClass();
        this.b = str;
        this.c = objArr;
    }

    public atn(rrr rrrVar) {
        this.a = 10;
        this.c = rrrVar;
        this.b = zsd.I(new v0r(rrrVar, null, 12));
    }

    public atn(Context context, String str) {
        this.a = 6;
        this.c = str;
        this.b = context.getApplicationContext().getSharedPreferences("quarantine_master_token_shared_pref", 0);
    }

    public atn(knn knnVar) {
        this.a = 11;
        this.b = knnVar;
        this.c = new Object();
    }

    public atn(gdu gduVar) {
        this.a = 15;
        this.b = gduVar;
        v9r v9rVar = new v9r();
        v9rVar.a = 0;
        this.c = v9rVar;
    }

    public atn(so7 so7Var, Function1 function1) {
        this.a = 20;
        so7Var.getClass();
        this.b = so7Var;
        this.c = function1;
    }

    public atn(rio rioVar) {
        this.a = 1;
        this.c = rioVar;
        this.b = dvt.p(null);
    }
}
