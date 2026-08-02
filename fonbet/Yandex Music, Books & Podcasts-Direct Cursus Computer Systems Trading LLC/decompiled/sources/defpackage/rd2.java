package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final class rd2 implements iob {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public rd2(rpd rpdVar) {
        this.a = 2;
        this.h = rpdVar;
        this.b = 1;
        this.c = new j6e(new ppd(this, 0));
        this.d = new j6e(new ppd(this, 1));
        this.e = new j6e(new ppd(this, 2));
        this.f = new c9n();
        this.g = new c9n();
    }

    public static int j(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        qpd qpdVar = (qpd) CollectionsKt.Y(list);
        return qpdVar.a + qpdVar.c;
    }

    @Override // defpackage.iob
    public n3r a(l3o l3oVar) {
        if (!u6e.a(l3oVar)) {
            return n(0L);
        }
        String a = l3oVar.f.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            u7e u7eVar = l3oVar.a.a;
            if (this.b == 4) {
                this.b = 5;
                return new z4e(this, u7eVar);
            }
            l1j.i(this.b, "state: ");
            return null;
        }
        long k = cvt.k(l3oVar);
        if (k != -1) {
            return n(k);
        }
        if (this.b != 4) {
            l1j.i(this.b, "state: ");
            return null;
        }
        this.b = 5;
        ((okn) this.d).k();
        return new b5e(this);
    }

    @Override // defpackage.iob
    public void b() {
        ((gj3) this.f).flush();
    }

    @Override // defpackage.iob
    public long c(l3o l3oVar) {
        if (!u6e.a(l3oVar)) {
            return 0L;
        }
        String a = l3oVar.f.a("Transfer-Encoding");
        if (a == null) {
            a = null;
        }
        if ("chunked".equalsIgnoreCase(a)) {
            return -1L;
        }
        return cvt.k(l3oVar);
    }

    @Override // defpackage.iob
    public void cancel() {
        Socket socket = ((okn) this.d).c;
        if (socket != null) {
            cvt.e(socket);
        }
    }

    @Override // defpackage.iob
    public okn d() {
        return (okn) this.d;
    }

    @Override // defpackage.iob
    public void e(d0o d0oVar) {
        d0oVar.getClass();
        Proxy.Type type = ((okn) this.d).b.b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(d0oVar.b);
        sb.append(' ');
        u7e u7eVar = d0oVar.a;
        if (u7eVar.j || type != Proxy.Type.HTTP) {
            String b = u7eVar.b();
            String d = u7eVar.d();
            if (d != null) {
                b = hrg.l('?', b, d);
            }
            sb.append(b);
        } else {
            sb.append(u7eVar);
        }
        sb.append(" HTTP/1.1");
        o(d0oVar.c, sb.toString());
    }

    @Override // defpackage.iob
    public jmq f(d0o d0oVar, long j) {
        d0oVar.getClass();
        if ("chunked".equalsIgnoreCase(d0oVar.c.a("Transfer-Encoding"))) {
            if (this.b == 1) {
                this.b = 2;
                return new y4e(this);
            }
            l1j.i(this.b, "state: ");
            return null;
        }
        if (j == -1) {
            xq0.q("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.b == 1) {
            this.b = 2;
            return new vu7(this);
        }
        l1j.i(this.b, "state: ");
        return null;
    }

    @Override // defpackage.iob
    public k3o g(boolean z) {
        au1 au1Var = (au1) this.g;
        int i = this.b;
        if (i != 1 && i != 2 && i != 3) {
            l1j.i(this.b, "state: ");
            return null;
        }
        try {
            String G = ((ij3) au1Var.c).G(au1Var.b);
            au1Var.b -= G.length();
            w2r D = lsq.D(G);
            int i2 = D.b;
            k3o k3oVar = new k3o();
            k3oVar.b = (izm) D.c;
            k3oVar.c = i2;
            k3oVar.d = (String) D.d;
            pv9 pv9Var = new pv9(9);
            while (true) {
                String G2 = ((ij3) au1Var.c).G(au1Var.b);
                au1Var.b -= G2.length();
                if (G2.length() == 0) {
                    break;
                }
                pv9Var.f(G2);
            }
            k3oVar.f = pv9Var.r().m();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.b = 3;
                return k3oVar;
            }
            if (102 > i2 || i2 >= 200) {
                this.b = 4;
                return k3oVar;
            }
            this.b = 3;
            return k3oVar;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((okn) this.d).b.a.h.i()), e);
        }
    }

    @Override // defpackage.iob
    public void h() {
        ((gj3) this.f).flush();
    }

    public sd2 i() {
        String str = this.b == 0 ? " registrationStatus" : "";
        if (((Long) this.g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = str.concat(" tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new sd2((String) this.c, this.b, (String) this.d, (String) this.e, ((Long) this.g).longValue(), ((Long) this.h).longValue(), (String) this.f);
        }
        xq0.q("Missing required properties:".concat(str));
        return null;
    }

    public ej3[] k(String str) {
        lvd lvdVar = (lvd) this.d;
        ArrayList arrayList = lvdVar.b;
        ArrayList arrayList2 = null;
        for (int i = 0; i < arrayList.size(); i++) {
            ej3 ej3Var = (ej3) arrayList.get(i);
            if (ej3Var.a.equalsIgnoreCase(str)) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(ej3Var);
            }
        }
        return arrayList2 != null ? (ej3[]) arrayList2.toArray(new ej3[arrayList2.size()]) : lvdVar.a;
    }

    public lv2 l() {
        if (((lv2) this.e) == null) {
            mzm mzmVar = (mzm) this.f;
            if (mzmVar == null) {
                mzmVar = a8e.f;
            }
            int i = this.b;
            String str = (String) this.c;
            if (str == null) {
                if (((l8b) this.g) != null) {
                    if (((Locale) this.h) == null) {
                        Locale.getDefault();
                    }
                    boolean z = i >= 100 && i < 600;
                    String i2 = k5r.i(i, "Unknown category for status code ");
                    if (!z) {
                        xq0.x(i2);
                        return null;
                    }
                    int i3 = i / 100;
                    int i4 = i - (i3 * 100);
                    String[] strArr = l8b.b[i3];
                    if (strArr.length > i4) {
                        str = strArr[i4];
                    }
                }
                str = null;
            }
            this.e = new lv2(mzmVar, i, str);
        }
        return (lv2) this.e;
    }

    public ArrayList m(int i, c9n c9nVar, Function2 function2) {
        int i2;
        int i3;
        int i4;
        int i5;
        rpd rpdVar = (rpd) this.h;
        npd npdVar = (npd) ((j6e) this.c).a();
        List list = npdVar.a;
        ArrayList arrayList = new ArrayList(i);
        int i6 = 0;
        for (int i7 = 0; i7 < i; i7++) {
            arrayList.add(new qpd());
        }
        int size = list.size();
        int i8 = 0;
        while (true) {
            i2 = 1;
            if (i8 >= size) {
                break;
            }
            mpd mpdVar = (mpd) npdVar.get(i8);
            opd opdVar = (opd) function2.invoke(mpdVar, rpdVar.getChildAt(mpdVar.a));
            int i9 = opdVar.e;
            float f = opdVar.f;
            int i10 = opdVar.a;
            if (i9 == 1) {
                qpd qpdVar = (qpd) arrayList.get(i10);
                int i11 = opdVar.b;
                int i12 = opdVar.c + i11 + opdVar.d;
                qpdVar.b = Math.max(qpdVar.b, i11);
                qpdVar.c = Math.max(qpdVar.c, i12);
                qpdVar.d = Math.max(qpdVar.d, f);
            } else {
                int i13 = i9 - 1;
                float f2 = f / i9;
                if (i13 >= 0) {
                    while (true) {
                        qpd.a((qpd) arrayList.get(i10 + i5), 0, 0, f2, 3);
                        i5 = i5 != i13 ? i5 + 1 : 0;
                    }
                }
            }
            i8++;
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            mpd mpdVar2 = (mpd) npdVar.get(i14);
            opd opdVar2 = (opd) function2.invoke(mpdVar2, rpdVar.getChildAt(mpdVar2.a));
            if (opdVar2.e > 1) {
                arrayList2.add(opdVar2);
            }
        }
        y75.s(arrayList2, C1318t.g);
        int size3 = arrayList2.size();
        int i15 = 0;
        while (i15 < size3) {
            opd opdVar3 = (opd) arrayList2.get(i15);
            int i16 = opdVar3.a;
            int i17 = opdVar3.e;
            int i18 = (i16 + i17) - i2;
            int i19 = opdVar3.b + opdVar3.c + opdVar3.d;
            float f3 = 0.0f;
            if (i16 <= i18) {
                i4 = i6;
                int i20 = i16;
                i3 = i19;
                while (true) {
                    qpd qpdVar2 = (qpd) arrayList.get(i20);
                    i19 -= qpdVar2.c;
                    if (qpdVar2.b()) {
                        f3 += qpdVar2.d;
                    } else {
                        if (qpdVar2.b == 0) {
                            i4++;
                        }
                        i3 -= qpdVar2.c;
                    }
                    if (i20 == i18) {
                        break;
                    }
                    i20++;
                }
            } else {
                i3 = i19;
                i4 = 0;
            }
            if (f3 > 0.0f) {
                if (i16 <= i18) {
                    while (true) {
                        qpd qpdVar3 = (qpd) arrayList.get(i16);
                        if (qpdVar3.b()) {
                            int ceil = (int) Math.ceil((qpdVar3.d / f3) * i3);
                            qpd.a(qpdVar3, ceil - (qpdVar3.c - qpdVar3.b), ceil, 0.0f, 4);
                        }
                        if (i16 != i18) {
                            i16++;
                        }
                    }
                }
            } else if (i19 > 0 && i16 <= i18) {
                while (true) {
                    qpd qpdVar4 = (qpd) arrayList.get(i16);
                    if (i4 <= 0) {
                        int i21 = i19 / i17;
                        qpd.a(qpdVar4, qpdVar4.b + i21, qpdVar4.c + i21, 0.0f, 4);
                    } else if (qpdVar4.b == 0 && !qpdVar4.b()) {
                        int i22 = i19 / i4;
                        qpd.a(qpdVar4, qpdVar4.b + i22, qpdVar4.c + i22, 0.0f, 4);
                    }
                    if (i16 != i18) {
                        i16++;
                    }
                }
            }
            i15++;
            i6 = 0;
            i2 = 1;
        }
        int size4 = arrayList.size();
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i23 = 0;
        for (int i24 = 0; i24 < size4; i24++) {
            qpd qpdVar5 = (qpd) arrayList.get(i24);
            if (qpdVar5.b()) {
                float f6 = qpdVar5.d;
                f4 += f6;
                f5 = Math.max(f5, qpdVar5.c / f6);
            } else {
                i23 += qpdVar5.c;
            }
        }
        int size5 = arrayList.size();
        int i25 = 0;
        for (int i26 = 0; i26 < size5; i26++) {
            qpd qpdVar6 = (qpd) arrayList.get(i26);
            i25 += qpdVar6.b() ? (int) Math.ceil(qpdVar6.d * f5) : qpdVar6.c;
        }
        int i27 = 0;
        float max = Math.max(0, Math.max(c9nVar.b, i25) - i23) / f4;
        int size6 = arrayList.size();
        for (int i28 = 0; i28 < size6; i28++) {
            qpd qpdVar7 = (qpd) arrayList.get(i28);
            if (qpdVar7.b()) {
                int ceil2 = (int) Math.ceil(qpdVar7.d * max);
                qpd.a(qpdVar7, ceil2 - (qpdVar7.c - qpdVar7.b), ceil2, 0.0f, 4);
            }
        }
        int size7 = arrayList.size();
        for (int i29 = 0; i29 < size7; i29++) {
            qpd qpdVar8 = (qpd) arrayList.get(i29);
            qpdVar8.a = i27;
            i27 += qpdVar8.c;
        }
        return arrayList;
    }

    public a5e n(long j) {
        if (this.b == 4) {
            this.b = 5;
            return new a5e(this, j);
        }
        l1j.i(this.b, "state: ");
        return null;
    }

    public void o(zvd zvdVar, String str) {
        gj3 gj3Var = (gj3) this.f;
        if (this.b != 0) {
            l1j.i(this.b, "state: ");
            return;
        }
        gj3Var.M(str).M("\r\n");
        int size = zvdVar.size();
        for (int i = 0; i < size; i++) {
            gj3Var.M(zvdVar.g(i)).M(": ").M(zvdVar.q(i)).M("\r\n");
        }
        gj3Var.M("\r\n");
        this.b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                sb.append(l());
                sb.append(' ');
                sb.append((lvd) this.d);
                return sb.toString();
            case 4:
                z0j Y = ezf.Y(this);
                Y.m(this.b, "defaultPort");
                Y.q((xzm) this.c, "proxyDetector");
                Y.q((vq6) this.d, "syncContext");
                Y.q((krd) this.e, "serviceConfigParser");
                Y.q((h8h) this.f, "scheduledExecutorService");
                Y.q((ad4) this.g, "channelLogger");
                Y.q((z7h) this.h, "executor");
                Y.q(null, "overrideAuthority");
                return Y.toString();
            default:
                return super.toString();
        }
    }

    public rd2(lv2 lv2Var, l8b l8bVar, Locale locale) {
        this.a = 1;
        this.d = new lvd();
        this.e = lv2Var;
        this.f = lv2Var.a;
        this.b = lv2Var.b;
        this.c = lv2Var.c;
        this.g = l8bVar;
        this.h = locale;
    }

    public rd2(OkHttpClient okHttpClient, okn oknVar, ikn iknVar, hkn hknVar) {
        this.a = 3;
        iknVar.getClass();
        hknVar.getClass();
        this.c = okHttpClient;
        this.d = oknVar;
        this.e = iknVar;
        this.f = hknVar;
        this.g = new au1(iknVar);
    }

    public rd2(Integer num, xzm xzmVar, vq6 vq6Var, krd krdVar, h8h h8hVar, ad4 ad4Var, z7h z7hVar) {
        this.a = 4;
        this.b = num.intValue();
        o2g.O(xzmVar, "proxyDetector not set");
        this.c = xzmVar;
        this.d = vq6Var;
        this.e = krdVar;
        this.f = h8hVar;
        this.g = ad4Var;
        this.h = z7hVar;
    }

    public /* synthetic */ rd2() {
        this.a = 0;
    }
}
