package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.connectsdk.etc.helper.HttpMessage;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ozd extends dih {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public yk3 C;
    public t0e D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public yde I;
    public boolean J;
    public boolean K;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final db7 p;
    public final nb7 q;
    public final yk3 r;
    public final boolean s;
    public final boolean t;
    public final ojs u;
    public final vm7 v;
    public final List w;
    public final pqa x;
    public final pae y;
    public final d7k z;

    public ozd(vm7 vm7Var, db7 db7Var, nb7 nb7Var, dsc dscVar, boolean z, db7 db7Var2, nb7 nb7Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, ojs ojsVar, pqa pqaVar, yk3 yk3Var, pae paeVar, d7k d7kVar, boolean z6, ndl ndlVar) {
        super(db7Var, nb7Var, dscVar, i, obj, j, j2, j3);
        this.A = z;
        this.o = i2;
        this.K = z3;
        this.l = i3;
        this.q = nb7Var2;
        this.p = db7Var2;
        this.F = nb7Var2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = ojsVar;
        this.t = z4;
        this.v = vm7Var;
        this.w = list;
        this.x = pqaVar;
        this.r = yk3Var;
        this.y = paeVar;
        this.z = d7kVar;
        this.n = z6;
        ude udeVar = yde.b;
        this.I = qsn.e;
        this.k = L.getAndIncrement();
    }

    public static byte[] e(String str) {
        if (ltg.M(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // defpackage.jgg
    public final void a() {
        yk3 yk3Var;
        this.D.getClass();
        if (this.C == null && (yk3Var = this.r) != null) {
            r2c r2cVar = (r2c) yk3Var.b;
            if ((r2cVar instanceof ebt) || (r2cVar instanceof jvc)) {
                this.C = yk3Var;
                this.F = false;
            }
        }
        nb7 nb7Var = this.q;
        db7 db7Var = this.p;
        if (this.F) {
            db7Var.getClass();
            nb7Var.getClass();
            d(db7Var, nb7Var, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (this.G) {
            return;
        }
        if (!this.t) {
            d(this.i, this.b, this.A, true);
        }
        this.H = !this.G;
    }

    @Override // defpackage.dih
    public final boolean c() {
        throw null;
    }

    public final void d(db7 db7Var, nb7 nb7Var, boolean z, boolean z2) {
        nb7 d;
        long j;
        int i = this.E;
        if (z) {
            r1 = i != 0;
            d = nb7Var;
        } else {
            d = nb7Var.d(i);
        }
        try {
            gm7 h = h(db7Var, d, z2);
            if (r1) {
                h.y(this.E);
            }
            do {
                try {
                    try {
                        if (this.G) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.d.f & 16384) == 0) {
                            throw e;
                        }
                        ((r2c) this.C.b).b(0L, 0L);
                        j = h.d;
                    }
                } catch (Throwable th) {
                    this.E = (int) (h.d - nb7Var.f);
                    throw th;
                }
            } while (((r2c) this.C.b).h(h, yk3.f) == 0);
            j = h.d;
            this.E = (int) (j - nb7Var.f);
        } finally {
            hld.x(db7Var);
        }
    }

    @Override // defpackage.jgg
    public final void f() {
        this.G = true;
    }

    public final int g(int i) {
        vq1.A(!this.n);
        if (i >= this.I.size()) {
            return 0;
        }
        return ((Integer) this.I.get(i)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gm7 h(db7 db7Var, nb7 nb7Var, boolean z) {
        int i;
        long j;
        long j2;
        long j3;
        yk3 yk3Var;
        ojs ojsVar;
        ArrayList arrayList;
        r2c v9Var;
        boolean z2;
        spr sprVar;
        boolean z3;
        spr sprVar2;
        r2c jvcVar;
        List list;
        List list2;
        int i2;
        int i3;
        r2c sfiVar;
        long a = db7Var.a(nb7Var);
        long j4 = this.g;
        ojs ojsVar2 = this.u;
        if (z) {
            try {
                ojsVar2.g(j4, this.s);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        gm7 gm7Var = new gm7(db7Var, nb7Var.f, a);
        if (this.C == null) {
            d7k d7kVar = this.z;
            gm7Var.f = 0;
            try {
                d7kVar.E(10);
                gm7Var.l(d7kVar.a, 0, 10, false);
            } catch (EOFException unused2) {
                j = -9223372036854775807L;
            }
            if (d7kVar.y() != 4801587) {
                j2 = -9223372036854775807L;
                j = -9223372036854775807L;
            } else {
                d7kVar.I(3);
                int u = d7kVar.u();
                int i4 = u + 10;
                byte[] bArr = d7kVar.a;
                j = -9223372036854775807L;
                if (i4 > bArr.length) {
                    d7kVar.E(i4);
                    System.arraycopy(bArr, 0, d7kVar.a, 0, 10);
                }
                gm7Var.l(d7kVar.a, 10, u, false);
                u2i g0 = this.y.g0(u, d7kVar.a);
                if (g0 != null) {
                    for (n2i n2iVar : g0.a) {
                        if (n2iVar instanceof tsm) {
                            tsm tsmVar = (tsm) n2iVar;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(tsmVar.b)) {
                                System.arraycopy(tsmVar.c, 0, d7kVar.a, 0, 8);
                                d7kVar.H(0);
                                d7kVar.G(8);
                                j2 = d7kVar.p() & 8589934591L;
                                break;
                            }
                        }
                    }
                }
                j2 = j;
            }
            gm7Var.f = 0;
            yk3 yk3Var2 = this.r;
            if (yk3Var2 == null) {
                Uri uri = nb7Var.a;
                Map b = db7Var.b();
                vm7 vm7Var = this.v;
                vm7Var.getClass();
                dsc dscVar = this.d;
                int x = h4a.x(dscVar.n);
                List list3 = (List) b.get(HttpMessage.CONTENT_TYPE_HEADER);
                int x2 = h4a.x((list3 == null || list3.isEmpty()) ? null : (String) list3.get(0));
                int y = h4a.y(uri);
                ArrayList arrayList2 = new ArrayList(7);
                vm7.a(arrayList2, x);
                vm7.a(arrayList2, x2);
                vm7.a(arrayList2, y);
                int i5 = 0;
                for (int i6 = 7; i5 < i6; i6 = 7) {
                    vm7.a(arrayList2, vm7.d[i5]);
                    i5++;
                }
                gm7Var.f = 0;
                int i7 = 0;
                r2c r2cVar = null;
                while (true) {
                    int size = arrayList2.size();
                    ojs ojsVar3 = this.u;
                    if (i7 >= size) {
                        j3 = j4;
                        i = 0;
                        r2cVar.getClass();
                        yk3Var = new yk3(r2cVar, dscVar, ojsVar3, (mvt) vm7Var.c, vm7Var.a);
                        break;
                    }
                    int intValue = ((Integer) arrayList2.get(i7)).intValue();
                    int i8 = i7;
                    if (intValue == 0) {
                        ojsVar = ojsVar3;
                        j3 = j4;
                        arrayList = arrayList2;
                        v9Var = new v9();
                    } else if (intValue == 1) {
                        ojsVar = ojsVar3;
                        j3 = j4;
                        arrayList = arrayList2;
                        v9Var = new y9();
                    } else if (intValue == 2) {
                        ojsVar = ojsVar3;
                        j3 = j4;
                        arrayList = arrayList2;
                        v9Var = new on(0);
                    } else if (intValue != 7) {
                        List list4 = this.w;
                        spr sprVar3 = spr.p0;
                        if (intValue == 8) {
                            j3 = j4;
                            arrayList = arrayList2;
                            spr sprVar4 = (mvt) vm7Var.c;
                            boolean z4 = vm7Var.a;
                            u2i u2iVar = dscVar.l;
                            if (u2iVar == null) {
                                sprVar = sprVar4;
                            } else {
                                int i9 = 0;
                                spr sprVar5 = sprVar4;
                                while (true) {
                                    n2i[] n2iVarArr = u2iVar.a;
                                    sprVar = sprVar5;
                                    if (i9 >= n2iVarArr.length) {
                                        break;
                                    }
                                    n2i n2iVar2 = n2iVarArr[i9];
                                    if (n2iVar2 instanceof v0e) {
                                        z3 = !((v0e) n2iVar2).c.isEmpty();
                                        break;
                                    }
                                    i9++;
                                    sprVar5 = sprVar;
                                }
                                int i10 = !z3 ? 4 : 0;
                                if (z4) {
                                    i10 |= 32;
                                    sprVar2 = sprVar3;
                                } else {
                                    sprVar2 = sprVar;
                                }
                                jvcVar = new jvc(sprVar2, i10, ojsVar3, null, list4 == null ? list4 : qsn.e, null);
                                ojsVar = ojsVar3;
                            }
                            z3 = false;
                            if (!z3) {
                            }
                            if (z4) {
                            }
                            jvcVar = new jvc(sprVar2, i10, ojsVar3, null, list4 == null ? list4 : qsn.e, null);
                            ojsVar = ojsVar3;
                        } else if (intValue == 11) {
                            j3 = j4;
                            arrayList = arrayList2;
                            boolean z5 = vm7Var.b;
                            spr sprVar6 = (mvt) vm7Var.c;
                            boolean z6 = vm7Var.a;
                            if (list4 != null) {
                                list2 = list4;
                                i2 = 48;
                            } else {
                                if (z5) {
                                    bsc bscVar = new bsc();
                                    bscVar.m = l5i.p("application/cea-608");
                                    list = Collections.singletonList(new dsc(bscVar));
                                } else {
                                    list = Collections.EMPTY_LIST;
                                }
                                list2 = list;
                                i2 = 16;
                            }
                            String str = dscVar.k;
                            ojsVar = ojsVar3;
                            if (!TextUtils.isEmpty(str)) {
                                if (l5i.c(str, "audio/mp4a-latm") == null) {
                                    i2 |= 2;
                                }
                                if (l5i.c(str, "video/avc") == null) {
                                    i3 = i2 | 4;
                                    jvcVar = new ebt(2, !z6 ? 1 : 0, z6 ? sprVar3 : sprVar6, ojsVar, new et7(list2, i3));
                                }
                            }
                            i3 = i2;
                            jvcVar = new ebt(2, !z6 ? 1 : 0, z6 ? sprVar3 : sprVar6, ojsVar, new et7(list2, i3));
                        } else if (intValue != 13) {
                            ojsVar = ojsVar3;
                            j3 = j4;
                            arrayList = arrayList2;
                            v9Var = null;
                        } else {
                            j3 = j4;
                            arrayList = arrayList2;
                            v9Var = new ahv(dscVar.d, ojsVar3, (mvt) vm7Var.c, vm7Var.a);
                            ojsVar = ojsVar3;
                        }
                        v9Var = jvcVar;
                    } else {
                        ojsVar = ojsVar3;
                        j3 = j4;
                        arrayList = arrayList2;
                        v9Var = new sfi(0L);
                    }
                    v9Var.getClass();
                    try {
                        z2 = v9Var.d(gm7Var);
                        i = 0;
                        gm7Var.f = 0;
                    } catch (EOFException unused3) {
                        i = 0;
                        gm7Var.f = 0;
                        z2 = false;
                    } catch (Throwable th) {
                        gm7Var.f = 0;
                        throw th;
                    }
                    if (z2) {
                        yk3Var = new yk3(v9Var, dscVar, ojsVar, (mvt) vm7Var.c, vm7Var.a);
                        break;
                    }
                    dsc dscVar2 = dscVar;
                    if (r2cVar == null && (intValue == x || intValue == x2 || intValue == y || intValue == 11)) {
                        r2cVar = v9Var;
                    }
                    i7 = i8 + 1;
                    dscVar = dscVar2;
                    arrayList2 = arrayList;
                    j4 = j3;
                }
            } else {
                r2c r2cVar2 = (r2c) yk3Var2.b;
                vq1.A(!((r2cVar2 instanceof ebt) || (r2cVar2 instanceof jvc)));
                r2cVar2.getClass().toString();
                if (r2cVar2 instanceof ahv) {
                    sfiVar = new ahv(((dsc) yk3Var2.c).d, (ojs) yk3Var2.d, (spr) yk3Var2.e, yk3Var2.a);
                } else if (r2cVar2 instanceof on) {
                    sfiVar = new on(0);
                } else if (r2cVar2 instanceof v9) {
                    sfiVar = new v9();
                } else if (r2cVar2 instanceof y9) {
                    sfiVar = new y9();
                } else {
                    if (!(r2cVar2 instanceof sfi)) {
                        xq0.q("Unexpected extractor type for recreation: ".concat(r2cVar2.getClass().getSimpleName()));
                        return null;
                    }
                    sfiVar = new sfi(0);
                }
                yk3Var = new yk3(sfiVar, (dsc) yk3Var2.c, (ojs) yk3Var2.d, (spr) yk3Var2.e, yk3Var2.a);
                j3 = j4;
                i = 0;
            }
            yk3 yk3Var3 = yk3Var;
            this.C = yk3Var3;
            r2c r2cVar3 = (r2c) yk3Var3.b;
            int i11 = ((r2cVar3 instanceof on) || (r2cVar3 instanceof v9) || (r2cVar3 instanceof y9) || (r2cVar3 instanceof sfi)) ? 1 : i;
            t0e t0eVar = this.D;
            if (i11 != 0) {
                long b2 = j2 != j ? ojsVar2.b(j2) : j3;
                if (t0eVar.B0 != b2) {
                    t0eVar.B0 = b2;
                    s0e[] s0eVarArr = t0eVar.v;
                    int length = s0eVarArr.length;
                    for (int i12 = i; i12 < length; i12++) {
                        s0e s0eVar = s0eVarArr[i12];
                        if (s0eVar.F != b2) {
                            s0eVar.F = b2;
                            s0eVar.z = true;
                        }
                    }
                }
            } else if (t0eVar.B0 != 0) {
                t0eVar.B0 = 0L;
                s0e[] s0eVarArr2 = t0eVar.v;
                int length2 = s0eVarArr2.length;
                for (int i13 = i; i13 < length2; i13++) {
                    s0e s0eVar2 = s0eVarArr2[i13];
                    if (s0eVar2.F != 0) {
                        s0eVar2.F = 0L;
                        s0eVar2.z = true;
                    }
                }
            }
            this.D.x.clear();
            ((r2c) this.C.b).l(this.D);
        } else {
            i = 0;
        }
        t0e t0eVar2 = this.D;
        pqa pqaVar = t0eVar2.C0;
        pqa pqaVar2 = this.x;
        if (!Objects.equals(pqaVar, pqaVar2)) {
            t0eVar2.C0 = pqaVar2;
            int i14 = i;
            while (true) {
                s0e[] s0eVarArr3 = t0eVar2.v;
                if (i14 >= s0eVarArr3.length) {
                    break;
                }
                if (t0eVar2.Z[i14]) {
                    s0e s0eVar3 = s0eVarArr3[i14];
                    s0eVar3.I = pqaVar2;
                    s0eVar3.z = true;
                }
                i14++;
            }
        }
        return gm7Var;
    }
}
