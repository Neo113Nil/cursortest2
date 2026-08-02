package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSStreamException;

/* loaded from: classes4.dex */
public final class w87 extends OutputStream {
    public final OutputStream a;
    public final u2 b;
    public final jd4 c;
    public final jd4 w;
    public final jd4 x;
    public final /* synthetic */ x87 y;

    public w87(x87 x87Var, OutputStream outputStream, u2 u2Var, jd4 jd4Var, jd4 jd4Var2, jd4 jd4Var3) {
        this.y = x87Var;
        this.a = outputStream;
        this.b = u2Var;
        this.c = jd4Var;
        this.w = jd4Var2;
        this.x = jd4Var3;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        this.x.b();
        x87 x87Var = this.y;
        ArrayList arrayList = x87Var.b;
        HashMap hashMap = x87Var.e;
        hashMap.clear();
        ArrayList arrayList2 = x87Var.a;
        int size = arrayList2.size();
        jd4 jd4Var = this.w;
        if (size != 0) {
            jd4Var.a.write(new ud4(2, 128, 0, b97.c(arrayList2)).getEncoded());
        }
        if (arrayList.size() != 0) {
            jd4Var.a.write(new ud4(2, 128, 1, b97.c(arrayList)).getEncoded());
        }
        c2 c2Var = new c2();
        Iterator it = x87Var.d.iterator();
        while (it.hasNext()) {
            zbs0 zbs0Var = (zbs0) it.next();
            try {
                c2Var.a(zbs0Var.a(this.b));
                byte[] bArr = zbs0Var.h;
                hashMap.put(zbs0Var.f.a.a, bArr != null ? rza1.b(bArr) : null);
            } catch (CMSException e) {
                throw new CMSStreamException("exception generating signers: " + e.getMessage(), e);
            }
        }
        Iterator it2 = x87Var.c.iterator();
        while (it2.hasNext()) {
            c2Var.a(((acs0) it2.next()).toASN1Structure());
        }
        jd4Var.a.write(new lqf(c2Var).getEncoded());
        jd4Var.b();
        this.c.b();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
