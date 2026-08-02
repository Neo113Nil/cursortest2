package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class onh {
    public static final onh g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final gnh b;
    public final fnh c;
    public final hoh d;
    public final anh e;
    public final jnh f;

    static {
        xmh xmhVar = new xmh();
        ude udeVar = yde.b;
        qsn qsnVar = qsn.e;
        List list = Collections.EMPTY_LIST;
        qsn qsnVar2 = qsn.e;
        dnh dnhVar = new dnh();
        g = new onh("", new anh(xmhVar), null, new fnh(dnhVar), hoh.K, jnh.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public onh(String str, anh anhVar, gnh gnhVar, fnh fnhVar, hoh hohVar, jnh jnhVar) {
        this.a = str;
        this.b = gnhVar;
        this.c = fnhVar;
        this.d = hohVar;
        this.e = anhVar;
        this.f = jnhVar;
    }

    public static onh b(Bundle bundle) {
        anh anhVar;
        jnh jnhVar;
        Map a;
        cnh cnhVar;
        vmh vmhVar;
        qsn f;
        qsn G;
        gnh gnhVar;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        fnh b = bundle2 == null ? fnh.f : fnh.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        hoh b2 = bundle3 == null ? hoh.K : hoh.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        boolean z = false;
        if (bundle4 == null) {
            anhVar = anh.p;
        } else {
            xmh xmhVar = new xmh();
            String str = ymh.i;
            ymh ymhVar = ymh.h;
            long j2 = ymhVar.a;
            long j3 = ymhVar.d;
            long j4 = ymhVar.b;
            long Y = dvt.Y(bundle4.getLong(str, j2));
            boolean z2 = true;
            vq1.v(Y >= 0);
            xmhVar.a = Y;
            long Y2 = dvt.Y(bundle4.getLong(ymh.j, ymhVar.c));
            vq1.v(Y2 == Long.MIN_VALUE || Y2 >= 0);
            xmhVar.b = Y2;
            xmhVar.c = bundle4.getBoolean(ymh.k, ymhVar.e);
            xmhVar.d = bundle4.getBoolean(ymh.l, ymhVar.f);
            xmhVar.e = bundle4.getBoolean(ymh.m, ymhVar.g);
            long j5 = bundle4.getLong(ymh.n, j4);
            if (j5 != j4) {
                vq1.v(j5 >= 0);
                xmhVar.a = j5;
            }
            long j6 = bundle4.getLong(ymh.o, j3);
            if (j6 != j3) {
                if (j6 != Long.MIN_VALUE && j6 < 0) {
                    z2 = false;
                }
                vq1.v(z2);
                xmhVar.b = j6;
            }
            anhVar = new anh(xmhVar);
        }
        anh anhVar2 = anhVar;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            jnhVar = jnh.d;
        } else {
            t1f t1fVar = new t1f(8, z);
            t1fVar.b = (Uri) bundle5.getParcelable(jnh.e);
            t1fVar.c = bundle5.getString(jnh.f);
            t1fVar.d = bundle5.getBundle(jnh.g);
            jnhVar = new jnh(t1fVar);
        }
        jnh jnhVar2 = jnhVar;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            gnhVar = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(gnh.k);
            if (bundle7 == null) {
                cnhVar = null;
            } else {
                String string2 = bundle7.getString(cnh.i);
                string2.getClass();
                UUID fromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(cnh.j);
                String str2 = cnh.k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    a = vsn.g;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                hashMap.put(str3, string3);
                            }
                        }
                    }
                    a = cee.a(hashMap);
                }
                boolean z3 = bundle7.getBoolean(cnh.l, false);
                boolean z4 = bundle7.getBoolean(cnh.m, false);
                boolean z5 = bundle7.getBoolean(cnh.n, false);
                String str4 = cnh.o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                yde v = yde.v(arrayList);
                byte[] byteArray = bundle7.getByteArray(cnh.p);
                bnh bnhVar = new bnh();
                bnhVar.d = fromString;
                bnhVar.e = uri;
                bnhVar.f = cee.a(a);
                bnhVar.a = z3;
                bnhVar.c = z5;
                bnhVar.b = z4;
                bnhVar.g = yde.v(v);
                bnhVar.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
                cnhVar = new cnh(bnhVar);
            }
            Bundle bundle10 = bundle6.getBundle(gnh.l);
            if (bundle10 == null) {
                vmhVar = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(vmh.b);
                uri2.getClass();
                pv9 pv9Var = new pv9(19, z);
                pv9Var.b = uri2;
                vmhVar = new vmh(pv9Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(gnh.m);
            if (parcelableArrayList == null) {
                ude udeVar = yde.b;
                f = qsn.e;
            } else {
                tde u = yde.u();
                int i2 = 0;
                while (i2 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i2);
                    bundle11.getClass();
                    u.a(new kjr(bundle11.getInt(kjr.d, 0), bundle11.getInt(kjr.e, 0), bundle11.getInt(kjr.f, 0)));
                    i2++;
                    parcelableArrayList = parcelableArrayList;
                }
                f = u.f();
            }
            qsn qsnVar = f;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(gnh.o);
            if (parcelableArrayList2 == null) {
                ude udeVar2 = yde.b;
                G = qsn.e;
            } else {
                G = sk3.G(new dlh(7), parcelableArrayList2);
            }
            qsn qsnVar2 = G;
            long j7 = bundle6.getLong(gnh.p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(gnh.i);
            uri3.getClass();
            gnhVar = new gnh(uri3, bundle6.getString(gnh.j), cnhVar, vmhVar, qsnVar, bundle6.getString(gnh.n), qsnVar2, j7);
        }
        return new onh(string, anhVar2, gnhVar, b, b2, jnhVar2);
    }

    public static onh c(Uri uri) {
        gnh gnhVar;
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        cnh cnhVar = null;
        if (uri != null) {
            if (((UUID) bnhVar.d) != null) {
                cnhVar = new cnh(bnhVar);
            }
            gnhVar = new gnh(uri, null, cnhVar, null, list, null, qsnVar, -9223372036854775807L);
        } else {
            gnhVar = null;
        }
        return new onh("", new anh(xmhVar), gnhVar, new fnh(dnhVar), hoh.K, jnhVar);
    }

    public static onh d(String str) {
        gnh gnhVar;
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        Uri parse = str == null ? null : Uri.parse(str);
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        cnh cnhVar = null;
        if (parse != null) {
            if (((UUID) bnhVar.d) != null) {
                cnhVar = new cnh(bnhVar);
            }
            gnhVar = new gnh(parse, null, cnhVar, null, list, null, qsnVar, -9223372036854775807L);
        } else {
            gnhVar = null;
        }
        return new onh("", new anh(xmhVar), gnhVar, new fnh(dnhVar), hoh.K, jnhVar);
    }

    public final wmh a() {
        bnh bnhVar;
        wmh wmhVar = new wmh();
        xmh xmhVar = new xmh();
        anh anhVar = this.e;
        xmhVar.a = anhVar.b;
        xmhVar.b = anhVar.d;
        xmhVar.c = anhVar.e;
        xmhVar.d = anhVar.f;
        xmhVar.e = anhVar.g;
        wmhVar.f = xmhVar;
        wmhVar.b = this.a;
        wmhVar.k = this.d;
        wmhVar.l = this.c.a();
        wmhVar.m = this.f;
        gnh gnhVar = this.b;
        if (gnhVar != null) {
            wmhVar.d = gnhVar.f;
            wmhVar.c = gnhVar.b;
            wmhVar.e = gnhVar.a;
            wmhVar.h = gnhVar.e;
            wmhVar.i = gnhVar.g;
            cnh cnhVar = gnhVar.c;
            if (cnhVar != null) {
                bnhVar = new bnh();
                bnhVar.d = cnhVar.a;
                bnhVar.e = cnhVar.b;
                bnhVar.f = cnhVar.c;
                bnhVar.a = cnhVar.d;
                bnhVar.b = cnhVar.e;
                bnhVar.c = cnhVar.f;
                bnhVar.g = cnhVar.g;
                bnhVar.h = cnhVar.h;
            } else {
                bnhVar = new bnh();
            }
            wmhVar.g = bnhVar;
            wmhVar.j = gnhVar.d;
            wmhVar.a = gnhVar.h;
        }
        return wmhVar;
    }

    public final Bundle e(boolean z) {
        gnh gnhVar;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        fnh fnhVar = fnh.f;
        fnh fnhVar2 = this.c;
        if (!fnhVar2.equals(fnhVar)) {
            bundle.putBundle(i, fnhVar2.c());
        }
        hoh hohVar = hoh.K;
        hoh hohVar2 = this.d;
        if (!hohVar2.equals(hohVar)) {
            bundle.putBundle(j, hohVar2.c());
        }
        ymh ymhVar = ymh.h;
        anh anhVar = this.e;
        if (!anhVar.equals(ymhVar)) {
            Bundle bundle2 = new Bundle();
            long j2 = anhVar.a;
            if (j2 != ymhVar.a) {
                bundle2.putLong(ymh.i, j2);
            }
            long j3 = anhVar.c;
            if (j3 != ymhVar.c) {
                bundle2.putLong(ymh.j, j3);
            }
            long j4 = anhVar.b;
            if (j4 != ymhVar.b) {
                bundle2.putLong(ymh.n, j4);
            }
            long j5 = anhVar.d;
            if (j5 != ymhVar.d) {
                bundle2.putLong(ymh.o, j5);
            }
            boolean z2 = anhVar.e;
            if (z2 != ymhVar.e) {
                bundle2.putBoolean(ymh.k, z2);
            }
            boolean z3 = anhVar.f;
            if (z3 != ymhVar.f) {
                bundle2.putBoolean(ymh.l, z3);
            }
            boolean z4 = anhVar.g;
            if (z4 != ymhVar.g) {
                bundle2.putBoolean(ymh.m, z4);
            }
            bundle.putBundle(k, bundle2);
        }
        jnh jnhVar = jnh.d;
        jnh jnhVar2 = this.f;
        if (!jnhVar2.equals(jnhVar)) {
            Bundle bundle3 = new Bundle();
            Uri uri = jnhVar2.a;
            if (uri != null) {
                bundle3.putParcelable(jnh.e, uri);
            }
            String str2 = jnhVar2.b;
            if (str2 != null) {
                bundle3.putString(jnh.f, str2);
            }
            Bundle bundle4 = jnhVar2.c;
            if (bundle4 != null) {
                bundle3.putBundle(jnh.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (gnhVar = this.b) != null) {
            yde ydeVar = gnhVar.g;
            List list = gnhVar.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(gnh.i, gnhVar.a);
            String str3 = gnhVar.b;
            if (str3 != null) {
                bundle5.putString(gnh.j, str3);
            }
            cnh cnhVar = gnhVar.c;
            if (cnhVar != null) {
                String str4 = gnh.k;
                yde ydeVar2 = cnhVar.g;
                cee ceeVar = cnhVar.c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(cnh.i, cnhVar.a.toString());
                Uri uri2 = cnhVar.b;
                if (uri2 != null) {
                    bundle6.putParcelable(cnh.j, uri2);
                }
                if (!ceeVar.isEmpty()) {
                    String str5 = cnh.k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : ceeVar.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z5 = cnhVar.d;
                if (z5) {
                    bundle6.putBoolean(cnh.l, z5);
                }
                boolean z6 = cnhVar.e;
                if (z6) {
                    bundle6.putBoolean(cnh.m, z6);
                }
                boolean z7 = cnhVar.f;
                if (z7) {
                    bundle6.putBoolean(cnh.n, z7);
                }
                if (!ydeVar2.isEmpty()) {
                    bundle6.putIntegerArrayList(cnh.o, new ArrayList<>(ydeVar2));
                }
                byte[] bArr = cnhVar.h;
                if (bArr != null) {
                    bundle6.putByteArray(cnh.p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            vmh vmhVar = gnhVar.d;
            if (vmhVar != null) {
                String str6 = gnh.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(vmh.b, vmhVar.a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(gnh.m, sk3.X(list, new dlh(5)));
            }
            String str7 = gnhVar.f;
            if (str7 != null) {
                bundle5.putString(gnh.n, str7);
            }
            if (!ydeVar.isEmpty()) {
                bundle5.putParcelableArrayList(gnh.o, sk3.X(ydeVar, new dlh(6)));
            }
            long j6 = gnhVar.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(gnh.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onh)) {
            return false;
        }
        onh onhVar = (onh) obj;
        return Objects.equals(this.a, onhVar.a) && this.e.equals(onhVar.e) && Objects.equals(this.b, onhVar.b) && Objects.equals(this.c, onhVar.c) && Objects.equals(this.d, onhVar.d) && Objects.equals(this.f, onhVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        gnh gnhVar = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((hashCode + (gnhVar != null ? gnhVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
