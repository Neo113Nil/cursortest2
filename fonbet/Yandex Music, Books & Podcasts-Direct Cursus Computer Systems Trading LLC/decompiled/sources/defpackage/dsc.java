package defpackage;

import android.text.TextUtils;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class dsc {
    public static final dsc O = new dsc(new bsc());
    public static final String P = Integer.toString(0, 36);
    public static final String Q = Integer.toString(1, 36);
    public static final String R = Integer.toString(2, 36);
    public static final String S = Integer.toString(3, 36);
    public static final String T = Integer.toString(4, 36);
    public static final String U = Integer.toString(5, 36);
    public static final String V = Integer.toString(6, 36);
    public static final String W = Integer.toString(7, 36);
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public final int A;
    public final q85 B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public int N;
    public final String a;
    public final String b;
    public final yde c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final u2i l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List q;
    public final pqa r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final float w;
    public final int x;
    public final float y;
    public final byte[] z;

    static {
        Integer.toString(8, 36);
        X = Integer.toString(9, 36);
        Y = Integer.toString(10, 36);
        Z = Integer.toString(11, 36);
        a0 = Integer.toString(12, 36);
        b0 = Integer.toString(13, 36);
        c0 = Integer.toString(14, 36);
        d0 = Integer.toString(15, 36);
        e0 = Integer.toString(16, 36);
        f0 = Integer.toString(17, 36);
        g0 = Integer.toString(18, 36);
        h0 = Integer.toString(19, 36);
        i0 = Integer.toString(20, 36);
        j0 = Integer.toString(21, 36);
        k0 = Integer.toString(22, 36);
        l0 = Integer.toString(23, 36);
        m0 = Integer.toString(24, 36);
        n0 = Integer.toString(25, 36);
        o0 = Integer.toString(26, 36);
        p0 = Integer.toString(27, 36);
        q0 = Integer.toString(28, 36);
        r0 = Integer.toString(29, 36);
        s0 = Integer.toString(30, 36);
        t0 = Integer.toString(31, 36);
        u0 = Integer.toString(32, 36);
        v0 = Integer.toString(33, 36);
        w0 = Integer.toString(34, 36);
    }

    public dsc(bsc bscVar) {
        boolean z;
        String str;
        this.a = bscVar.a;
        String Z2 = dvt.Z(bscVar.d);
        this.d = Z2;
        if (bscVar.c.isEmpty() && bscVar.b != null) {
            this.c = yde.y(new rif(Z2, bscVar.b));
            this.b = bscVar.b;
        } else if (bscVar.c.isEmpty() || bscVar.b != null) {
            if (!bscVar.c.isEmpty() || bscVar.b != null) {
                for (int i = 0; i < bscVar.c.size(); i++) {
                    if (!((rif) bscVar.c.get(i)).b.equals(bscVar.b)) {
                    }
                }
                z = false;
                vq1.A(z);
                this.c = bscVar.c;
                this.b = bscVar.b;
            }
            z = true;
            vq1.A(z);
            this.c = bscVar.c;
            this.b = bscVar.b;
        } else {
            yde ydeVar = bscVar.c;
            this.c = ydeVar;
            Iterator it = ydeVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((rif) ydeVar.get(0)).b;
                    break;
                }
                rif rifVar = (rif) it.next();
                if (TextUtils.equals(rifVar.a, Z2)) {
                    str = rifVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = bscVar.e;
        vq1.z("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", bscVar.g == 0 || (bscVar.f & SQLiteDatabase.OPEN_NOMUTEX) != 0);
        this.f = bscVar.f;
        this.g = bscVar.g;
        int i2 = bscVar.h;
        this.h = i2;
        int i3 = bscVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = bscVar.j;
        this.l = bscVar.k;
        this.m = bscVar.l;
        this.n = bscVar.m;
        this.o = bscVar.n;
        this.p = bscVar.o;
        List list = bscVar.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        pqa pqaVar = bscVar.q;
        this.r = pqaVar;
        this.s = bscVar.r;
        this.t = bscVar.s;
        this.u = bscVar.t;
        this.v = bscVar.u;
        this.w = bscVar.v;
        int i4 = bscVar.w;
        this.x = i4 == -1 ? 0 : i4;
        float f = bscVar.x;
        this.y = f == -1.0f ? 1.0f : f;
        this.z = bscVar.y;
        this.A = bscVar.z;
        this.B = bscVar.A;
        this.C = bscVar.B;
        this.D = bscVar.C;
        this.E = bscVar.D;
        this.F = bscVar.E;
        int i5 = bscVar.F;
        this.G = i5 == -1 ? 0 : i5;
        int i6 = bscVar.G;
        this.H = i6 != -1 ? i6 : 0;
        this.I = bscVar.H;
        this.J = bscVar.I;
        this.K = bscVar.J;
        this.L = bscVar.K;
        int i7 = bscVar.L;
        if (i7 != 0 || pqaVar == null) {
            this.M = i7;
        } else {
            this.M = 1;
        }
    }

    public static String c(dsc dscVar) {
        int i;
        String str;
        String str2;
        String str3;
        pqa pqaVar;
        if (dscVar == null) {
            return "null";
        }
        int i2 = dscVar.e;
        yde ydeVar = dscVar.c;
        String str4 = dscVar.d;
        int i3 = dscVar.E;
        int i4 = dscVar.D;
        int i5 = dscVar.C;
        float f = dscVar.w;
        q85 q85Var = dscVar.B;
        float f2 = dscVar.y;
        int i6 = dscVar.v;
        int i7 = dscVar.u;
        pqa pqaVar2 = dscVar.r;
        String str5 = dscVar.k;
        int i8 = dscVar.j;
        String str6 = dscVar.m;
        int i9 = dscVar.f;
        jpc jpcVar = new jpc(String.valueOf(','), 2);
        StringBuilder k = dfi.k("id=");
        k.append(dscVar.a);
        k.append(", mimeType=");
        k.append(dscVar.n);
        if (str6 != null) {
            k.append(", container=");
            k.append(str6);
        }
        int i10 = -1;
        if (i8 != -1) {
            k.append(", bitrate=");
            k.append(i8);
        }
        if (str5 != null) {
            k.append(", codecs=");
            k.append(str5);
        }
        if (pqaVar2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i11 = 0;
            while (i11 < pqaVar2.d) {
                UUID uuid = pqaVar2.a[i11].b;
                if (uuid.equals(un3.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(un3.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(un3.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(un3.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(un3.a)) {
                    linkedHashSet.add("universal");
                } else {
                    pqaVar = pqaVar2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i11++;
                    pqaVar2 = pqaVar;
                }
                pqaVar = pqaVar2;
                i11++;
                pqaVar2 = pqaVar;
            }
            k.append(", drm=[");
            jpcVar.a(k, linkedHashSet.iterator());
            k.append(']');
            i10 = -1;
        }
        if (i7 != i10 && i6 != i10) {
            k.append(", res=");
            k.append(i7);
            k.append("x");
            k.append(i6);
        }
        double d = f2;
        int i12 = f9a.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            k.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            int i13 = dvt.a;
            k.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (q85Var != null) {
            int i14 = q85Var.f;
            int i15 = q85Var.e;
            if ((i15 != -1 && i14 != -1) || q85Var.d()) {
                k.append(", color=");
                if (q85Var.d()) {
                    String b = q85.b(q85Var.a);
                    String a = q85.a(q85Var.b);
                    String c = q85.c(q85Var.c);
                    int i16 = dvt.a;
                    Locale locale = Locale.US;
                    str2 = b + "/" + a + "/" + c;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i15 == -1 || i14 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i15 + "/" + i14;
                }
                k.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            k.append(", fps=");
            k.append(f);
        }
        if (i5 != -1) {
            k.append(", maxSubLayers=");
            k.append(i5);
        }
        if (i4 != -1) {
            k.append(", channels=");
            k.append(i4);
        }
        if (i3 != -1) {
            k.append(", sample_rate=");
            k.append(i3);
        }
        if (str4 != null) {
            k.append(", language=");
            k.append(str4);
        }
        if (!ydeVar.isEmpty()) {
            k.append(", labels=[");
            jpcVar.a(k, ldg.O(new kac(12), ydeVar).iterator());
            k.append("]");
        }
        if (i2 != 0) {
            k.append(", selectionFlags=[");
            int i17 = dvt.a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            jpcVar.a(k, arrayList.iterator());
            k.append("]");
        }
        if (i9 != 0) {
            k.append(", roleFlags=[");
            int i18 = dvt.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i9 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i9 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i9 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i9 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i9 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i9 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i9 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i9;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & RemoteCameraConfig.Notification.ID) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
                arrayList2.add("auxiliary");
            }
            jpcVar.a(k, arrayList2.iterator());
            k.append("]");
        } else {
            i = i9;
        }
        if ((i & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
            k.append(", auxiliaryTrackType=");
            int i19 = dscVar.g;
            int i20 = dvt.a;
            if (i19 == 0) {
                str = StringUtils.UNDEFINED;
            } else if (i19 == 1) {
                str = "original";
            } else if (i19 == 2) {
                str = "depth-linear";
            } else if (i19 == 3) {
                str = "depth-inverse";
            } else {
                if (i19 != 4) {
                    xq0.q("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            k.append(str);
        }
        return k.toString();
    }

    public final bsc a() {
        bsc bscVar = new bsc();
        bscVar.a = this.a;
        bscVar.b = this.b;
        bscVar.c = this.c;
        bscVar.d = this.d;
        bscVar.e = this.e;
        bscVar.f = this.f;
        bscVar.h = this.h;
        bscVar.i = this.i;
        bscVar.j = this.k;
        bscVar.k = this.l;
        bscVar.l = this.m;
        bscVar.m = this.n;
        bscVar.n = this.o;
        bscVar.o = this.p;
        bscVar.p = this.q;
        bscVar.q = this.r;
        bscVar.r = this.s;
        bscVar.s = this.t;
        bscVar.t = this.u;
        bscVar.u = this.v;
        bscVar.v = this.w;
        bscVar.w = this.x;
        bscVar.x = this.y;
        bscVar.y = this.z;
        bscVar.z = this.A;
        bscVar.A = this.B;
        bscVar.B = this.C;
        bscVar.C = this.D;
        bscVar.D = this.E;
        bscVar.E = this.F;
        bscVar.F = this.G;
        bscVar.G = this.H;
        bscVar.H = this.I;
        bscVar.I = this.J;
        bscVar.J = this.K;
        bscVar.K = this.L;
        bscVar.L = this.M;
        return bscVar;
    }

    public final boolean b(dsc dscVar) {
        List list = this.q;
        if (list.size() != dscVar.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) dscVar.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final dsc d(dsc dscVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == dscVar) {
            return this;
        }
        int i3 = l5i.i(this.n);
        String str3 = dscVar.a;
        yde ydeVar = dscVar.c;
        int i4 = dscVar.K;
        int i5 = dscVar.L;
        String str4 = dscVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (ydeVar.isEmpty()) {
            ydeVar = this.c;
        }
        if ((i3 != 3 && i3 != 1) || (str = dscVar.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = dscVar.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = dscVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String y = dvt.y(i3, dscVar.k);
            if (dvt.j0(y).length == 1) {
                str5 = y;
            }
        }
        u2i u2iVar = dscVar.l;
        u2i u2iVar2 = this.l;
        if (u2iVar2 != null) {
            u2iVar = u2iVar2.b(u2iVar);
        }
        float f = this.w;
        if (f == -1.0f && i3 == 2) {
            f = dscVar.w;
        }
        int i8 = this.e | dscVar.e;
        int i9 = this.f | dscVar.f;
        pqa pqaVar = dscVar.r;
        ArrayList arrayList = new ArrayList();
        yde ydeVar2 = ydeVar;
        if (pqaVar != null) {
            String str6 = pqaVar.c;
            oqa[] oqaVarArr = pqaVar.a;
            int length = oqaVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                oqa oqaVar = oqaVarArr[i11];
                int i12 = length;
                if (oqaVar.e != null) {
                    arrayList.add(oqaVar);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        pqa pqaVar2 = this.r;
        if (pqaVar2 != null) {
            if (str2 == null) {
                str2 = pqaVar2.c;
            }
            int size = arrayList.size();
            oqa[] oqaVarArr2 = pqaVar2.a;
            String str7 = str2;
            int length2 = oqaVarArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                oqa oqaVar2 = oqaVarArr2[i14];
                int i15 = length2;
                if (oqaVar2.e != null) {
                    UUID uuid = oqaVar2.b;
                    i2 = i5;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i = size;
                            arrayList.add(oqaVar2);
                            break;
                        }
                        i = size;
                        if (((oqa) arrayList.get(i16)).b.equals(uuid)) {
                            break;
                        }
                        i16++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i5;
                }
                i13 = i14 + 1;
                length2 = i15;
                i5 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i17 = i5;
        pqa pqaVar3 = arrayList.isEmpty() ? null : new pqa(str2, arrayList);
        bsc a = a();
        a.a = str3;
        a.b = str4;
        a.c = yde.v(ydeVar2);
        a.d = str;
        a.e = i8;
        a.f = i9;
        a.h = i6;
        a.i = i7;
        a.j = str5;
        a.k = u2iVar;
        a.q = pqaVar3;
        a.v = f;
        a.J = i4;
        a.K = i17;
        return new dsc(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || dsc.class != obj.getClass()) {
            return false;
        }
        dsc dscVar = (dsc) obj;
        int i2 = this.N;
        return (i2 == 0 || (i = dscVar.N) == 0 || i2 == i) && this.e == dscVar.e && this.f == dscVar.f && this.g == dscVar.g && this.h == dscVar.h && this.i == dscVar.i && this.o == dscVar.o && this.s == dscVar.s && this.u == dscVar.u && this.v == dscVar.v && this.x == dscVar.x && this.A == dscVar.A && this.C == dscVar.C && this.D == dscVar.D && this.E == dscVar.E && this.F == dscVar.F && this.G == dscVar.G && this.H == dscVar.H && this.I == dscVar.I && this.K == dscVar.K && this.L == dscVar.L && this.M == dscVar.M && Float.compare(this.w, dscVar.w) == 0 && Float.compare(this.y, dscVar.y) == 0 && Objects.equals(this.a, dscVar.a) && Objects.equals(this.b, dscVar.b) && this.c.equals(dscVar.c) && Objects.equals(this.k, dscVar.k) && Objects.equals(this.m, dscVar.m) && Objects.equals(this.n, dscVar.n) && Objects.equals(this.d, dscVar.d) && Arrays.equals(this.z, dscVar.z) && Objects.equals(this.l, dscVar.l) && Objects.equals(this.B, dscVar.B) && Objects.equals(this.r, dscVar.r) && b(dscVar);
    }

    public final int hashCode() {
        if (this.N == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            u2i u2iVar = this.l;
            int hashCode5 = (hashCode4 + (u2iVar == null ? 0 : u2iVar.hashCode())) * 961;
            String str5 = this.m;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.N = ((((((((((((((((((((((Float.floatToIntBits(this.y) + ((((Float.floatToIntBits(this.w) + ((((((((((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31)) * 31) + this.x) * 31)) * 31) + this.A) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.K) * 31) + this.L) * 31) + this.M;
        }
        return this.N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.B);
        sb.append("], [");
        sb.append(this.D);
        sb.append(", ");
        return f1d.i(sb, this.E, "])");
    }
}
