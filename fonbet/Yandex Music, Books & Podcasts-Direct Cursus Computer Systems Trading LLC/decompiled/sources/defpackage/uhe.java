package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class uhe implements ljr {
    public final x13 a;
    public final xu1 b;
    public final int c;
    public oxj d;
    public qgr e;
    public mjr f;
    public b53 g;
    public int h;
    public int i;
    public ArrayList j;
    public boolean k;
    public int l;
    public int m;
    public vhe n = vhe.a;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public final x13 s;

    public uhe(x13 x13Var, xu1 xu1Var, int i) {
        this.a = x13Var;
        this.b = xu1Var;
        this.c = i;
        this.s = x13Var;
    }

    public final b53 a() {
        b53 b53Var;
        int i = this.i;
        this.i = 0;
        if (i == 1) {
            whe wheVar = (whe) this.j.remove(0);
            int i2 = wheVar.b;
            b53Var = new b53(wheVar.a);
        } else {
            byte[][] bArr = new byte[i][];
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                byte[] bArr2 = ((whe) this.j.remove(0)).a;
                bArr[i4] = bArr2;
                i3 += bArr2.length;
            }
            b53 b53Var2 = new b53();
            b53Var2.a = bArr;
            b53Var2.e = i3;
            if (i > 0) {
                b53Var2.b = bArr[0];
            }
            b53Var = b53Var2;
        }
        this.h += i;
        f();
        return b53Var;
    }

    public final void b(sgr sgrVar, sgr sgrVar2, boolean z) {
        vhe vheVar = this.n;
        vhe vheVar2 = vhe.f;
        if (vheVar == vheVar2) {
            return;
        }
        boolean z2 = vheVar != vhe.a;
        g(vheVar2);
        if (z2) {
            this.e.g(sgrVar2);
        }
        int i = this.c;
        x13 x13Var = this.a;
        if (!z) {
            x13Var.getClass();
            try {
                fo7 o = fo7.o();
                try {
                    o.b().writeInt(0);
                    int S = a4g.S(o.b(), sgrVar);
                    Parcel b = o.b();
                    int dataPosition = b.dataPosition();
                    b.setDataPosition(0);
                    b.writeInt(S | 8);
                    b.setDataPosition(dataPosition);
                    x13Var.m(i, o);
                    o.close();
                } finally {
                }
            } catch (tgr e) {
                y13.n.log(Level.WARNING, "Failed sending oob close transaction", (Throwable) e);
            }
        }
        if (z2) {
            ((ujp) this.f).s(sgrVar2);
        }
        x13Var.getClass();
        ConcurrentHashMap concurrentHashMap = x13Var.e;
        if (concurrentHashMap.remove(Integer.valueOf(i)) == null || !concurrentHashMap.isEmpty()) {
            return;
        }
        x13Var.b.execute(new he0(11, x13Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        r5.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0048 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        int ordinal;
        if (!this.q) {
            this.q = true;
            while (true) {
                int ordinal2 = this.n.ordinal();
                if (ordinal2 == 2) {
                    if (this.f == null || this.r) {
                        break;
                    }
                    if (this.g != null || this.i > 0) {
                        if (this.p == 0) {
                            break;
                        }
                        ordinal = this.n.ordinal();
                        if (ordinal != 2) {
                        }
                        if (this.k) {
                        }
                    } else {
                        if (!this.k) {
                            break;
                        }
                        if (this.h < this.l) {
                            break;
                        }
                        ordinal = this.n.ordinal();
                        if (ordinal != 2) {
                        }
                        if (this.k) {
                        }
                    }
                } else {
                    if (ordinal2 != 3) {
                        break;
                    }
                    if (this.f == null) {
                        break;
                    }
                    if (!this.k) {
                        break;
                    }
                    ordinal = this.n.ordinal();
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            wvs.b();
                            return;
                        }
                    } else if (!this.r) {
                        if (this.g != null || this.i > 0) {
                            this.r = true;
                            this.f.t(this);
                        } else if (this.k) {
                            g(vhe.d);
                        }
                    }
                    if (this.k) {
                        g(vhe.e);
                        ((ujp) this.f).q();
                    }
                }
            }
        }
    }

    public final void d(int i, int i2, Parcel parcel) {
        if ((i & 64) != 0) {
            throw sgr.j.i("Parcelable messages not allowed").a();
        }
        int readInt = parcel.readInt();
        byte[] a = y63.a(readInt);
        if (readInt > 0) {
            parcel.readByteArray(a);
        }
        boolean z = (i & 128) == 0;
        if (this.j == null) {
            if (this.o == 0 && z && i2 == this.h) {
                o2g.V(this.g == null);
                this.g = new b53(a);
                this.e.getClass();
                qgr qgrVar = this.e;
                int i3 = this.o;
                for (qo4 qo4Var : qgrVar.a) {
                    qo4Var.c(i3);
                }
                qgr qgrVar2 = this.e;
                int i4 = this.o;
                long j = readInt;
                for (qo4 qo4Var2 : qgrVar2.a) {
                    qo4Var2.d(i4, j, j);
                }
                this.o++;
                return;
            }
            this.j = new ArrayList(16);
        }
        whe wheVar = new whe(readInt, z, a);
        int i5 = i2 - this.h;
        int size = this.j.size();
        ArrayList arrayList = this.j;
        if (i5 < size) {
            arrayList.set(i5, wheVar);
            f();
        } else if (i5 <= arrayList.size()) {
            this.j.add(wheVar);
            f();
        } else {
            do {
                this.j.add(null);
            } while (i5 > this.j.size());
            this.j.add(wheVar);
        }
    }

    public final void e(Parcel parcel, int i) {
        s2i s2iVar;
        qgr qgrVar;
        sgr sgrVar;
        String readString = parcel.readString();
        xu1 xu1Var = this.b;
        int readInt = parcel.readInt();
        if (readInt == 0) {
            s2iVar = new s2i();
        } else {
            Object[] objArr = new Object[readInt * 2];
            int i2 = 0;
            for (int i3 = 0; i3 < readInt; i3++) {
                int readInt2 = parcel.readInt();
                int i4 = i2 + 4 + readInt2;
                if (i4 > 8192) {
                    throw sgr.l.i("Metadata too large").a();
                }
                byte[] bArr = new byte[readInt2];
                if (readInt2 > 0) {
                    parcel.readByteArray(bArr);
                }
                int i5 = i3 * 2;
                objArr[i5] = bArr;
                int readInt3 = parcel.readInt();
                int i6 = i4 + 4;
                if (readInt3 == -1) {
                    ((xhe) xu1Var.a.get(y13.q)).getClass();
                    throw sgr.j.i("Parcelable metadata values not allowed").a();
                }
                if (readInt3 < 0) {
                    throw sgr.n.i("Unrecognized metadata sentinel").a();
                }
                i2 = i6 + readInt3;
                if (i2 > 8192) {
                    throw sgr.l.i("Metadata too large").a();
                }
                byte[] bArr2 = new byte[readInt3];
                if (readInt3 > 0) {
                    parcel.readByteArray(bArr2);
                }
                objArr[i5 + 1] = bArr2;
            }
            Charset charset = wue.a;
            s2iVar = new s2i(readInt, objArr);
        }
        List list = this.s.r;
        qgr qgrVar2 = qgr.c;
        if (list.isEmpty()) {
            qgrVar = qgr.c;
        } else {
            int size = list.size();
            qo4[] qo4VarArr = new qo4[size];
            if (size > 0) {
                list.get(0).getClass();
                l1j.f();
                return;
            }
            qgrVar = new qgr(qo4VarArr);
        }
        x13 x13Var = this.s;
        oxj oxjVar = new oxj(x13Var, this.c, qgrVar);
        int i7 = i & 16;
        xu1 xu1Var2 = this.b;
        tjp n3mVar = i7 != 0 ? new n3m(this, oxjVar, xu1Var2) : new t1f(10, this, oxjVar, xu1Var2);
        synchronized (x13Var) {
            if (x13Var.j()) {
                sgrVar = sgr.o.i("transport is shutdown");
            } else {
                sfm sfmVar = x13Var.s;
                sfmVar.getClass();
                jee jeeVar = jkk.a;
                jeeVar.getClass();
                jkk.c();
                try {
                    jkk.a();
                    sfmVar.L(n3mVar, readString, s2iVar);
                    jeeVar.getClass();
                    sgrVar = sgr.e;
                } finally {
                }
            }
        }
        if (!sgrVar.g()) {
            b(sgrVar, sgrVar, false);
            return;
        }
        ((ujp) this.f).getClass();
        if (this.a.i()) {
            ((ujp) this.f).onReady();
        }
    }

    public final void f() {
        whe wheVar;
        if (this.i == 0) {
            int i = 0;
            for (int i2 = 0; i2 < this.j.size() && (wheVar = (whe) this.j.get(i2)) != null; i2++) {
                i += wheVar.b;
                if (wheVar.c) {
                    this.i = i2 + 1;
                    this.e.getClass();
                    qgr qgrVar = this.e;
                    int i3 = this.o;
                    for (qo4 qo4Var : qgrVar.a) {
                        qo4Var.c(i3);
                    }
                    qgr qgrVar2 = this.e;
                    int i4 = this.o;
                    long j = i;
                    for (qo4 qo4Var2 : qgrVar2.a) {
                        qo4Var2.d(i4, j, j);
                    }
                    this.o++;
                    return;
                }
            }
        }
    }

    public final void g(vhe vheVar) {
        vhe vheVar2 = this.n;
        int ordinal = vheVar.ordinal();
        vhe vheVar3 = vhe.a;
        if (ordinal == 1) {
            o2g.W(vheVar2 == vheVar3, vheVar2, vheVar);
        } else if (ordinal == 2) {
            o2g.W(vheVar2 == vhe.b || vheVar2 == vheVar3, vheVar2, vheVar);
        } else if (ordinal == 3) {
            o2g.W(vheVar2 == vhe.c, vheVar2, vheVar);
        } else if (ordinal == 4) {
            o2g.W(vheVar2 == vhe.d, vheVar2, vheVar);
        } else if (ordinal != 5) {
            wvs.b();
            return;
        }
        this.n = vheVar;
    }

    public final void h(int i) {
        int i2 = this.m + i;
        this.m = i2;
        qgr qgrVar = this.e;
        if (qgrVar == null || i2 == 0) {
            return;
        }
        qgrVar.b(i2);
        this.e.a(this.m);
        this.m = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x001d A[Catch: all -> 0x000b, TryCatch #0 {all -> 0x000b, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0025, B:11:0x002b, B:13:0x0031, B:17:0x003c, B:21:0x0046, B:24:0x000d, B:27:0x0013, B:32:0x001d), top: B:2:0x0001 }] */
    @Override // defpackage.ljr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized InputStream next() {
        b53 b53Var;
        boolean z;
        try {
            b53Var = this.g;
            boolean z2 = true;
            if (b53Var != null) {
                this.g = null;
            } else {
                if (this.p > 0) {
                    if (b53Var == null && this.i <= 0) {
                        z = false;
                        if (z) {
                            b53Var = a();
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
                b53Var = null;
            }
            if (b53Var != null) {
                this.p--;
            } else {
                this.r = false;
                if (this.k && this.h >= this.l) {
                    if (this.n != vhe.f) {
                        z2 = false;
                    }
                    if (!z2) {
                        g(vhe.d);
                        c();
                    }
                }
            }
        } finally {
        }
        return b53Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized String toString() {
        StringBuilder sb;
        boolean z;
        sb = new StringBuilder();
        sb.append(uhe.class.getSimpleName());
        sb.append("[SfxA=");
        sb.append(this.k);
        sb.append("/De=");
        sb.append(this.n);
        sb.append("/Msg=");
        boolean z2 = true;
        if (this.g == null && this.i <= 0) {
            z = false;
            sb.append(z);
            sb.append("/Lis=");
            if (this.f != null) {
                z2 = false;
            }
            sb.append(z2);
            sb.append("]");
        }
        z = true;
        sb.append(z);
        sb.append("/Lis=");
        if (this.f != null) {
        }
        sb.append(z2);
        sb.append("]");
        return sb.toString();
    }
}
