package defpackage;

import android.content.Context;
import java.io.IOException;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j2j implements s4n {
    public static j2j f;
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public j2j(Context context) {
        Executor u = sj2.u();
        this.c = u;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.a = 0;
        u.execute(new zvh(2, this, context));
    }

    public static synchronized j2j a(Context context) {
        j2j j2jVar;
        synchronized (j2j.class) {
            try {
                if (f == null) {
                    f = new j2j(context);
                }
                j2jVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j2jVar;
    }

    public int b() {
        int i;
        synchronized (this.e) {
            i = this.a;
        }
        return i;
    }

    public void c() {
        aa7 aa7Var = (aa7) this.c;
        t4n t4nVar = new t4n(aa7Var);
        qzc qzcVar = new qzc(0, this);
        int i = this.a;
        if ((i & 8) != 0) {
            r4n r4nVar = new r4n(1, 1);
            r4nVar.c = qzcVar;
            t4nVar.a.add(r4nVar);
        } else if ((i & 16) != 0) {
            r4n r4nVar2 = new r4n(1, 1);
            r4nVar2.c = qzcVar;
            t4nVar.a.add(r4nVar2);
        } else {
            if (this.b) {
                ((t4n) this.d).a(2, new oxa(5, this));
                return;
            }
            rzc rzcVar = (rzc) this.e;
            rzcVar.h = false;
            rzcVar.f(aa7Var);
        }
    }

    @Override // defpackage.s4n
    public void d(Object obj) {
        byte[] bArr = (byte[]) obj;
        rzc rzcVar = (rzc) this.e;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        short i = rzc.i(bArr);
        if (i != -29921) {
            rzcVar.b(new IOException(String.format(Locale.ENGLISH, "unknown format (magic number %x)", Short.valueOf(i))));
            ((aa7) this.c).c(new imp());
            return;
        }
        byte b = bArr[3];
        this.a = b;
        boolean z = (b & 2) != 0;
        this.b = z;
        if (z) {
            rzcVar.i.update(bArr, 0, bArr.length);
        }
        if ((this.a & 4) != 0) {
            ((t4n) this.d).a(2, new g8c(this));
        } else {
            c();
        }
    }

    public void e(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i2j i2jVar = (i2j) it.next();
            if (i2jVar.a.get() == null) {
                copyOnWriteArrayList.remove(i2jVar);
            }
        }
        synchronized (this.e) {
            try {
                if (this.b && this.a == i) {
                    return;
                }
                this.b = true;
                this.a = i;
                Iterator it2 = ((CopyOnWriteArrayList) this.d).iterator();
                while (it2.hasNext()) {
                    i2j i2jVar2 = (i2j) it2.next();
                    i2jVar2.b.execute(new dyg(13, i2jVar2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public j2j(rzc rzcVar, aa7 aa7Var, t4n t4nVar) {
        this.e = rzcVar;
        this.c = aa7Var;
        this.d = t4nVar;
    }
}
