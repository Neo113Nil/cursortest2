package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.a;
import org.bouncycastle.operator.OperatorCreationException;
import ru.CryptoPro.CAdES.tools.verifier.GostDigestCalculatorProvider;

/* loaded from: classes4.dex */
public final class v87 extends x3 {
    public static final y87 D = y87.a;
    public static final fah E = new fah();
    public m3 A;
    public m3 B;
    public boolean C;
    public final h0j c;
    public final u2 w;
    public final c06 x;
    public final HashMap y;
    public bcs0 z;

    public v87(GostDigestCalculatorProvider gostDigestCalculatorProvider, c06 c06Var, InputStream inputStream) {
        super(inputStream);
        a2 a2Var;
        try {
            this.x = c06Var;
            h0j d = h0j.d(((yfa) this.b).d());
            this.c = d;
            this.y = new HashMap();
            n3 c = d.c();
            HashSet hashSet = new HashSet();
            while (true) {
                a2 readObject = c.readObject();
                if (readObject == null) {
                    break;
                }
                xr1 m = xr1.m(readObject);
                hashSet.add(m);
                try {
                    ljj ljjVar = gostDigestCalculatorProvider.get(m);
                    if (ljjVar != null) {
                        this.y.put(m.a, ljjVar);
                    }
                } catch (OperatorCreationException unused) {
                }
            }
            Collections.unmodifiableSet(hashSet);
            j3 j3Var = (j3) ((j3) this.c.c).readObject();
            u2 u2Var = (u2) j3Var.readObject();
            t3 t3Var = (t3) j3Var.readObject();
            if (t3Var != null) {
                z3.a(t3Var, 0);
                a2Var = t3Var.g();
            } else {
                a2Var = null;
            }
            if (a2Var instanceof y2) {
                c06 c06Var2 = new c06(u2Var, ((y2) a2Var).d(), 0);
                if (this.x == null) {
                    this.x = c06Var2;
                } else {
                    a97 a97Var = (a97) c06Var2.b;
                    while (a97Var.read(new byte[4096], 0, 4096) >= 0) {
                    }
                    a97Var.close();
                }
            } else if (a2Var != null) {
                a aVar = new a(u2Var, a2Var);
                if (this.x == null) {
                    this.x = aVar;
                } else {
                    aVar.c.toASN1Primitive();
                }
            }
            if (c06Var == null) {
                this.w = u2Var;
            } else {
                this.w = (u2) this.x.a;
            }
        } catch (IOException e) {
            throw new CMSException(x4e.d(e, new StringBuilder("io exception: ")), e);
        }
    }

    public static void Wg(InputStream inputStream, nju0 nju0Var, nju0 nju0Var2, nju0 nju0Var3, OutputStream outputStream) {
        a2 a2Var;
        j3 j3Var = (j3) new o3(inputStream).G();
        t3 t3Var = (t3) j3Var.readObject();
        a2 a2Var2 = null;
        if (t3Var != null) {
            z3.a(t3Var, 0);
            a2Var = t3Var.g();
        } else {
            a2Var = null;
        }
        h0j d = h0j.d(a2Var);
        jd4 jd4Var = new jd4(outputStream);
        jd4Var.a(p87.a1);
        jd4 jd4Var2 = new jd4(outputStream, 0);
        jd4Var2.a((l2) d.d);
        outputStream.write(d.c().toASN1Primitive().getEncoded());
        j3 j3Var2 = (j3) ((j3) d.c).readObject();
        u2 u2Var = (u2) j3Var2.readObject();
        t3 t3Var2 = (t3) j3Var2.readObject();
        jd4 jd4Var3 = new jd4(outputStream);
        jd4Var3.a(u2Var);
        if (t3Var2 != null) {
            z3.a(t3Var2, 0);
            a2Var2 = t3Var2.g();
        }
        y2 y2Var = (y2) a2Var2;
        if (y2Var != null) {
            id4 b = b97.b(outputStream, true);
            InputStream d2 = y2Var.d();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = d2.read(bArr, 0, 4096);
                if (read < 0) {
                    break;
                } else {
                    b.write(bArr, 0, read);
                }
            }
            b.close();
        }
        jd4Var3.b();
        n3 a = d.a();
        if (a != null) {
            m3.x(a.toASN1Primitive());
        }
        n3 b2 = d.b();
        if (b2 != null) {
            m3.x(b2.toASN1Primitive());
        }
        if (nju0Var != null || nju0Var3 != null) {
            ArrayList arrayList = new ArrayList();
            if (nju0Var != null) {
                arrayList.addAll(b97.f(nju0Var));
            }
            if (nju0Var3 != null) {
                arrayList.addAll(b97.d(nju0Var3));
            }
            rd4 c = b97.c(arrayList);
            if (c.a.length > 0) {
                outputStream.write(new oqf(2, 128, 0, c, 0).getEncoded());
            }
        }
        if (nju0Var2 != null) {
            rd4 c2 = b97.c(b97.e(nju0Var2));
            if (c2.a.length > 0) {
                outputStream.write(new oqf(2, 128, 1, c2, 0).getEncoded());
            }
        }
        outputStream.write(d.e().toASN1Primitive().getEncoded());
        jd4Var2.b();
        jd4Var.b();
    }

    public static void Xg(InputStream inputStream, bcs0 bcs0Var, OutputStream outputStream) {
        a2 a2Var;
        j3 j3Var = (j3) new o3(inputStream).G();
        t3 t3Var = (t3) j3Var.readObject();
        a2 a2Var2 = null;
        if (t3Var != null) {
            z3.a(t3Var, 0);
            a2Var = t3Var.g();
        } else {
            a2Var = null;
        }
        h0j d = h0j.d(a2Var);
        jd4 jd4Var = new jd4(outputStream);
        jd4Var.a(p87.a1);
        jd4 jd4Var2 = new jd4(outputStream, 0);
        jd4Var2.a((l2) d.d);
        d.c().toASN1Primitive();
        c2 c2Var = new c2();
        Iterator it = bcs0Var.a().iterator();
        while (it.hasNext()) {
            xr1 digestAlgorithmID = ((acs0) it.next()).getDigestAlgorithmID();
            D.getClass();
            c2Var.a(y87.b(digestAlgorithmID, E));
        }
        byte[] encoded = new lqf(c2Var).getEncoded();
        OutputStream outputStream2 = jd4Var2.a;
        outputStream2.write(encoded);
        j3 j3Var2 = (j3) ((j3) d.c).readObject();
        u2 u2Var = (u2) j3Var2.readObject();
        t3 t3Var2 = (t3) j3Var2.readObject();
        jd4 jd4Var3 = new jd4(outputStream2);
        jd4Var3.a(u2Var);
        if (t3Var2 != null) {
            z3.a(t3Var2, 0);
            a2Var2 = t3Var2.g();
        }
        y2 y2Var = (y2) a2Var2;
        if (y2Var != null) {
            id4 b = b97.b(outputStream2, true);
            InputStream d2 = y2Var.d();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = d2.read(bArr, 0, 4096);
                if (read < 0) {
                    break;
                } else {
                    b.write(bArr, 0, read);
                }
            }
            b.close();
        }
        jd4Var3.b();
        Yg(jd4Var2, d.a(), 0);
        Yg(jd4Var2, d.b(), 1);
        c2 c2Var2 = new c2();
        Iterator it2 = bcs0Var.a().iterator();
        while (it2.hasNext()) {
            c2Var2.a(((acs0) it2.next()).toASN1Structure());
        }
        outputStream2.write(new lqf(c2Var2).getEncoded());
        jd4Var2.b();
        jd4Var.b();
    }

    public static void Yg(jd4 jd4Var, n3 n3Var, int i) {
        m3 x = n3Var == null ? null : m3.x(n3Var.toASN1Primitive());
        if (x != null) {
            boolean z = n3Var instanceof sd4;
            OutputStream outputStream = jd4Var.a;
            if (z) {
                outputStream.write(new ud4(2, 128, i, x).getEncoded());
            } else {
                outputStream.write(new oqf(2, 128, i, x, 0).getEncoded());
            }
        }
    }

    public final c06 Ug() {
        c06 c06Var = this.x;
        if (c06Var == null) {
            return null;
        }
        Collection values = this.y.values();
        InputStream n = c06Var.n();
        int i = b97.a;
        Iterator it = values.iterator();
        while (it.hasNext()) {
            n = new pcy0(n, ((ljj) it.next()).getOutputStream());
        }
        return new c06((u2) c06Var.a, n, 0);
    }

    public final void Vg() {
        h0j h0jVar = this.c;
        if (this.C) {
            return;
        }
        this.C = true;
        try {
            n3 a = h0jVar.a();
            m3 m3Var = null;
            this.A = a == null ? null : m3.x(a.toASN1Primitive());
            n3 b = h0jVar.b();
            if (b != null) {
                m3Var = m3.x(b.toASN1Primitive());
            }
            this.B = m3Var;
        } catch (IOException e) {
            throw new CMSException("problem parsing cert/crl sets", e);
        }
    }
}
