package com.gamericefishpro.space.n9;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.i9.f5;
import com.gamericefishpro.space.i9.f6;
import com.gamericefishpro.space.i9.l5;
import com.gamericefishpro.space.i9.m5;
import com.gamericefishpro.space.i9.r8;
import com.gamericefishpro.space.i9.u5;
import com.gamericefishpro.space.i9.z4;
import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends g4 {
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(m4 m4Var, int i) {
        super(m4Var);
        this.v = i;
    }

    public static final Serializable A(com.gamericefishpro.space.i9.a3 a3Var, String str) {
        com.gamericefishpro.space.i9.d3 d3VarZ = z(a3Var, str);
        if (d3VarZ == null) {
            return null;
        }
        return G(d3VarZ);
    }

    public static final void D(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void E(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String F(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable G(com.gamericefishpro.space.i9.d3 d3Var) {
        if (d3Var.r()) {
            return d3Var.s();
        }
        if (d3Var.t()) {
            return Long.valueOf(d3Var.u());
        }
        if (d3Var.x()) {
            return Double.valueOf(d3Var.y());
        }
        if (d3Var.A() > 0) {
            return g0((m5) d3Var.z());
        }
        return null;
    }

    public static final void H(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                E(builder, str3, string, set);
            }
        }
    }

    public static final void I(StringBuilder sb, String str, com.gamericefishpro.space.i9.l3 l3Var) {
        if (l3Var == null) {
            return;
        }
        D(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (l3Var.s() != 0) {
            D(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : l3Var.r()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (l3Var.q() != 0) {
            D(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : l3Var.p()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (l3Var.u() != 0) {
            D(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (com.gamericefishpro.space.i9.y2 y2Var : l3Var.t()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(y2Var.p() ? Integer.valueOf(y2Var.q()) : null);
                sb.append(":");
                sb.append(y2Var.r() ? Long.valueOf(y2Var.s()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (l3Var.w() != 0) {
            D(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (com.gamericefishpro.space.i9.n3 n3Var : l3Var.v()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(n3Var.p() ? Integer.valueOf(n3Var.q()) : null);
                sb.append(": [");
                Iterator it = n3Var.r().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        D(3, sb);
        sb.append("}\n");
    }

    public static final void J(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        D(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void K(StringBuilder sb, int i, String str, com.gamericefishpro.space.i9.s1 s1Var) {
        String str2;
        if (s1Var == null) {
            return;
        }
        D(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (s1Var.p()) {
            int iZ = s1Var.z();
            if (iZ == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZ == 2) {
                str2 = "LESS_THAN";
            } else if (iZ != 3) {
                str2 = iZ != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            J(sb, i, "comparison_type", str2);
        }
        if (s1Var.q()) {
            J(sb, i, "match_as_float", Boolean.valueOf(s1Var.r()));
        }
        if (s1Var.s()) {
            J(sb, i, "comparison_value", s1Var.t());
        }
        if (s1Var.u()) {
            J(sb, i, "min_comparison_value", s1Var.v());
        }
        if (s1Var.w()) {
            J(sb, i, "max_comparison_value", s1Var.x());
        }
        D(i, sb);
        sb.append("}\n");
    }

    public static boolean X(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean Y(l5 l5Var, int i) {
        if (i < ((u5) l5Var).i * 64) {
            return ((1 << (i % 64)) & ((Long) ((u5) l5Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList Z(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static f5 e0(f5 f5Var, byte[] bArr) {
        z4 z4VarF0;
        z4 z4Var = z4.a;
        if (z4Var == null) {
            synchronized (z4.class) {
                try {
                    z4VarF0 = z4.a;
                    if (z4VarF0 == null) {
                        f6 f6Var = f6.c;
                        z4VarF0 = d5.f0();
                        z4.a = z4VarF0;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z4Var = z4VarF0;
        }
        if (z4Var != null) {
            f5Var.getClass();
            f5Var.g(bArr, bArr.length, z4Var);
            return f5Var;
        }
        f5Var.getClass();
        int length = bArr.length;
        z4 z4Var2 = z4.a;
        f6 f6Var2 = f6.c;
        f5Var.g(bArr, length, z4.b);
        return f5Var;
    }

    public static int f0(com.gamericefishpro.space.i9.h3 h3Var, String str) {
        for (int i = 0; i < ((com.gamericefishpro.space.i9.i3) h3Var.e).V1(); i++) {
            if (str.equals(((com.gamericefishpro.space.i9.i3) h3Var.e).W1(i).r())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] g0(m5 m5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.gamericefishpro.space.i9.d3 d3Var = (com.gamericefishpro.space.i9.d3) it.next();
            if (d3Var != null) {
                Bundle bundle = new Bundle();
                for (com.gamericefishpro.space.i9.d3 d3Var2 : d3Var.z()) {
                    if (d3Var2.r()) {
                        bundle.putString(d3Var2.q(), d3Var2.s());
                    } else if (d3Var2.t()) {
                        bundle.putLong(d3Var2.q(), d3Var2.u());
                    } else if (d3Var2.x()) {
                        bundle.putDouble(d3Var2.q(), d3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap h0(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z2 = obj instanceof Parcelable[];
            if (z2 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    if (z2) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(h0((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            Object obj2 = arrayList2.get(i);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(h0((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(h0((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static u v(com.gamericefishpro.space.i9.b bVar) {
        Object obj;
        Bundle bundleW = w(bVar.c, true);
        String string = (!bundleW.containsKey("_o") || (obj = bundleW.get("_o")) == null) ? "app" : obj.toString();
        String strG = f2.g(bVar.a, f2.a, f2.c);
        if (strG == null) {
            strG = bVar.a;
        }
        return new u(strG, new t(bundleW), string, bVar.b);
    }

    public static Bundle w(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(w((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void x(com.gamericefishpro.space.i9.z2 z2Var, String str, Long l) {
        List listH = z2Var.h();
        int i = 0;
        while (true) {
            if (i >= listH.size()) {
                i = -1;
                break;
            } else if (str.equals(((com.gamericefishpro.space.i9.d3) listH.get(i)).q())) {
                break;
            } else {
                i++;
            }
        }
        com.gamericefishpro.space.i9.c3 c3VarB = com.gamericefishpro.space.i9.d3.B();
        c3VarB.h(str);
        c3VarB.j(l.longValue());
        if (i < 0) {
            z2Var.l(c3VarB);
        } else {
            z2Var.b();
            ((com.gamericefishpro.space.i9.a3) z2Var.e).A(i, (com.gamericefishpro.space.i9.d3) c3VarB.e());
        }
    }

    public static final Bundle y(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.gamericefishpro.space.i9.d3 d3Var = (com.gamericefishpro.space.i9.d3) it.next();
            String strQ = d3Var.q();
            if (d3Var.x()) {
                bundle.putDouble(strQ, d3Var.y());
            } else if (d3Var.v()) {
                bundle.putFloat(strQ, d3Var.w());
            } else if (d3Var.r()) {
                bundle.putString(strQ, d3Var.s());
            } else if (d3Var.t()) {
                bundle.putLong(strQ, d3Var.u());
            }
        }
        return bundle;
    }

    public static final com.gamericefishpro.space.i9.d3 z(com.gamericefishpro.space.i9.a3 a3Var, String str) {
        for (com.gamericefishpro.space.i9.d3 d3Var : a3Var.p()) {
            if (d3Var.q().equals(str)) {
                return d3Var;
            }
        }
        return null;
    }

    public void B(StringBuilder sb, int i, m5 m5Var) {
        if (m5Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.gamericefishpro.space.i9.d3 d3Var = (com.gamericefishpro.space.i9.d3) it.next();
            if (d3Var != null) {
                D(i2, sb);
                sb.append("param {\n");
                J(sb, i2, "name", d3Var.p() ? ((r1) this.d).C.b(d3Var.q()) : null);
                J(sb, i2, "string_value", d3Var.r() ? d3Var.s() : null);
                J(sb, i2, "int_value", d3Var.t() ? Long.valueOf(d3Var.u()) : null);
                J(sb, i2, "double_value", d3Var.x() ? Double.valueOf(d3Var.y()) : null);
                if (d3Var.A() > 0) {
                    B(sb, i2, (m5) d3Var.z());
                }
                D(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public void C(StringBuilder sb, int i, com.gamericefishpro.space.i9.p1 p1Var) {
        String str;
        if (p1Var == null) {
            return;
        }
        D(i, sb);
        sb.append("filter {\n");
        if (p1Var.t()) {
            J(sb, i, "complement", Boolean.valueOf(p1Var.u()));
        }
        if (p1Var.v()) {
            J(sb, i, "param_name", ((r1) this.d).C.b(p1Var.w()));
        }
        if (p1Var.p()) {
            int i2 = i + 1;
            com.gamericefishpro.space.i9.v1 v1VarQ = p1Var.q();
            if (v1VarQ != null) {
                D(i2, sb);
                sb.append("string_filter {\n");
                if (v1VarQ.p()) {
                    switch (v1VarQ.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                            str = "PARTIAL";
                            break;
                        case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    J(sb, i2, "match_type", str);
                }
                if (v1VarQ.q()) {
                    J(sb, i2, "expression", v1VarQ.r());
                }
                if (v1VarQ.s()) {
                    J(sb, i2, "case_sensitive", Boolean.valueOf(v1VarQ.t()));
                }
                if (v1VarQ.v() > 0) {
                    D(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : v1VarQ.u()) {
                        D(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                D(i2, sb);
                sb.append("}\n");
            }
        }
        if (p1Var.r()) {
            K(sb, i + 1, "number_filter", p1Var.s());
        }
        D(i, sb);
        sb.append("}\n");
    }

    public boolean L() {
        s();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((r1) this.d).d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void P(com.gamericefishpro.space.i9.q3 q3Var, Object obj) {
        com.gamericefishpro.space.v8.c0.g(obj);
        q3Var.b();
        ((com.gamericefishpro.space.i9.r3) q3Var.e).E();
        q3Var.b();
        ((com.gamericefishpro.space.i9.r3) q3Var.e).G();
        q3Var.b();
        ((com.gamericefishpro.space.i9.r3) q3Var.e).I();
        if (obj instanceof String) {
            q3Var.b();
            ((com.gamericefishpro.space.i9.r3) q3Var.e).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            q3Var.b();
            ((com.gamericefishpro.space.i9.r3) q3Var.e).F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            q3Var.b();
            ((com.gamericefishpro.space.i9.r3) q3Var.e).H(dDoubleValue);
        } else {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.y.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void Q(String str, h4 h4Var, com.gamericefishpro.space.i9.g3 g3Var, x0 x0Var) {
        String str2;
        String str3 = h4Var.a;
        r1 r1Var = (r1) this.d;
        r();
        s();
        try {
            URL url = new URI(str3).toURL();
            this.e.i0();
            byte[] bArrA = g3Var.a();
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            Map map = h4Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                p1Var.D(new y0(this, str2, url, bArrA, map, x0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.y.c("Failed to parse URL. Not uploading MeasurementBatch. appId", v0.z(str2), str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void R(com.gamericefishpro.space.i9.c3 c3Var, Object obj) {
        c3Var.b();
        ((com.gamericefishpro.space.i9.d3) c3Var.e).E();
        c3Var.b();
        ((com.gamericefishpro.space.i9.d3) c3Var.e).G();
        c3Var.b();
        ((com.gamericefishpro.space.i9.d3) c3Var.e).I();
        c3Var.b();
        ((com.gamericefishpro.space.i9.d3) c3Var.e).L();
        if (obj instanceof String) {
            c3Var.i((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c3Var.j(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c3Var.b();
            ((com.gamericefishpro.space.i9.d3) c3Var.e).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.y.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.gamericefishpro.space.i9.c3 c3VarB = com.gamericefishpro.space.i9.d3.B();
                for (String str : bundle.keySet()) {
                    com.gamericefishpro.space.i9.c3 c3VarB2 = com.gamericefishpro.space.i9.d3.B();
                    c3VarB2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c3VarB2.j(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c3VarB2.i((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c3VarB2.b();
                        ((com.gamericefishpro.space.i9.d3) c3VarB2.e).H(dDoubleValue2);
                    }
                    c3VarB.b();
                    ((com.gamericefishpro.space.i9.d3) c3VarB.e).J((com.gamericefishpro.space.i9.d3) c3VarB2.e());
                }
                if (((com.gamericefishpro.space.i9.d3) c3VarB.e).A() > 0) {
                    arrayList.add((com.gamericefishpro.space.i9.d3) c3VarB.e());
                }
            }
        }
        c3Var.b();
        ((com.gamericefishpro.space.i9.d3) c3Var.e).K(arrayList);
    }

    public a4 S(String str, com.gamericefishpro.space.i9.h3 h3Var, com.gamericefishpro.space.i9.z2 z2Var, String str2) {
        int iIndexOf;
        r8.a();
        r1 r1Var = (r1) this.d;
        g gVar = r1Var.v;
        if (!gVar.B(str, e0.P0)) {
            return null;
        }
        r1Var.D.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String[] strArrSplit = gVar.x(str, e0.u0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        m4 m4Var = this.e;
        i4 i4Var = m4Var.C;
        l1 l1Var = m4Var.d;
        l1 l1Var2 = i4Var.e.d;
        m4.T(l1Var2);
        String strE = l1Var2.E(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((r1) i4Var.d).v;
        builder.scheme(gVar2.x(str, e0.n0));
        if (TextUtils.isEmpty(strE)) {
            builder.authority(gVar2.x(str, e0.o0));
        } else {
            String strX = gVar2.x(str, e0.o0);
            StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 1 + String.valueOf(strX).length());
            sb.append(strE);
            sb.append(".");
            sb.append(strX);
            builder.authority(sb.toString());
        }
        builder.path(gVar2.x(str, e0.p0));
        E(builder, "gmp_app_id", ((com.gamericefishpro.space.i9.i3) h3Var.e).E(), setUnmodifiableSet);
        gVar.w();
        E(builder, "gmp_version", String.valueOf(133005L), setUnmodifiableSet);
        String strY = ((com.gamericefishpro.space.i9.i3) h3Var.e).y();
        d0 d0Var = e0.S0;
        if (gVar.B(str, d0Var)) {
            m4.T(l1Var);
            if (l1Var.K(str)) {
                strY = "";
            }
        }
        E(builder, "app_instance_id", strY, setUnmodifiableSet);
        E(builder, "rdid", ((com.gamericefishpro.space.i9.i3) h3Var.e).v(), setUnmodifiableSet);
        E(builder, "bundle_id", h3Var.o(), setUnmodifiableSet);
        String strN = z2Var.n();
        String strG = f2.g(strN, f2.c, f2.a);
        if (true != TextUtils.isEmpty(strG)) {
            strN = strG;
        }
        E(builder, "app_event_name", strN, setUnmodifiableSet);
        E(builder, "app_version", String.valueOf(((com.gamericefishpro.space.i9.i3) h3Var.e).K()), setUnmodifiableSet);
        String strI2 = ((com.gamericefishpro.space.i9.i3) h3Var.e).i2();
        if (gVar.B(str, d0Var)) {
            m4.T(l1Var);
            if (l1Var.J(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        E(builder, "os_version", strI2, setUnmodifiableSet);
        E(builder, "timestamp", String.valueOf(z2Var.o()), setUnmodifiableSet);
        if (((com.gamericefishpro.space.i9.i3) h3Var.e).x()) {
            E(builder, "lat", "1", setUnmodifiableSet);
        }
        E(builder, "privacy_sandbox_version", String.valueOf(((com.gamericefishpro.space.i9.i3) h3Var.e).G0()), setUnmodifiableSet);
        E(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        E(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setUnmodifiableSet);
        E(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.gamericefishpro.space.i9.d3> listH = z2Var.h();
        Bundle bundle = new Bundle();
        for (com.gamericefishpro.space.i9.d3 d3Var : listH) {
            String strQ = d3Var.q();
            if (d3Var.x()) {
                bundle.putString(strQ, String.valueOf(d3Var.y()));
            } else if (d3Var.v()) {
                bundle.putString(strQ, String.valueOf(d3Var.w()));
            } else if (d3Var.r()) {
                bundle.putString(strQ, d3Var.s());
            } else if (d3Var.t()) {
                bundle.putString(strQ, String.valueOf(d3Var.u()));
            }
        }
        H(builder, gVar.x(str, e0.t0).split("\\|"), bundle, setUnmodifiableSet);
        List<com.gamericefishpro.space.i9.r3> listUnmodifiableList = Collections.unmodifiableList(((com.gamericefishpro.space.i9.i3) h3Var.e).U1());
        Bundle bundle2 = new Bundle();
        for (com.gamericefishpro.space.i9.r3 r3Var : listUnmodifiableList) {
            String strR = r3Var.r();
            if (r3Var.y()) {
                bundle2.putString(strR, String.valueOf(r3Var.z()));
            } else if (r3Var.w()) {
                bundle2.putString(strR, String.valueOf(r3Var.x()));
            } else if (r3Var.s()) {
                bundle2.putString(strR, r3Var.t());
            } else if (r3Var.u()) {
                bundle2.putString(strR, String.valueOf(r3Var.v()));
            }
        }
        H(builder, gVar.x(str, e0.s0).split("\\|"), bundle2, setUnmodifiableSet);
        E(builder, "dma", true != ((com.gamericefishpro.space.i9.i3) h3Var.e).D0() ? "0" : "1", setUnmodifiableSet);
        if (!((com.gamericefishpro.space.i9.i3) h3Var.e).F0().isEmpty()) {
            E(builder, "dma_cps", ((com.gamericefishpro.space.i9.i3) h3Var.e).F0(), setUnmodifiableSet);
        }
        if (((com.gamericefishpro.space.i9.i3) h3Var.e).L0()) {
            com.gamericefishpro.space.i9.n2 n2VarM0 = ((com.gamericefishpro.space.i9.i3) h3Var.e).M0();
            if (!n2VarM0.z().isEmpty()) {
                E(builder, "dl_gclid", n2VarM0.z(), setUnmodifiableSet);
            }
            if (!n2VarM0.B().isEmpty()) {
                E(builder, "dl_gbraid", n2VarM0.B(), setUnmodifiableSet);
            }
            if (!n2VarM0.D().isEmpty()) {
                E(builder, "dl_gs", n2VarM0.D(), setUnmodifiableSet);
            }
            if (n2VarM0.F() > 0) {
                E(builder, "dl_ss_ts", String.valueOf(n2VarM0.F()), setUnmodifiableSet);
            }
            if (!n2VarM0.H().isEmpty()) {
                E(builder, "mr_gclid", n2VarM0.H(), setUnmodifiableSet);
            }
            if (!n2VarM0.J().isEmpty()) {
                E(builder, "mr_gbraid", n2VarM0.J(), setUnmodifiableSet);
            }
            if (!n2VarM0.L().isEmpty()) {
                E(builder, "mr_gs", n2VarM0.L(), setUnmodifiableSet);
            }
            if (n2VarM0.N() > 0) {
                E(builder, "mr_click_ts", String.valueOf(n2VarM0.N()), setUnmodifiableSet);
            }
        }
        return new a4(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public com.gamericefishpro.space.i9.a3 T(q qVar) {
        com.gamericefishpro.space.i9.z2 z2VarZ = com.gamericefishpro.space.i9.a3.z();
        long j = qVar.e;
        z2VarZ.b();
        ((com.gamericefishpro.space.i9.a3) z2VarZ.e).H(j);
        t tVar = qVar.f;
        Objects.requireNonNull(tVar);
        Bundle bundle = tVar.d;
        for (String str : bundle.keySet()) {
            com.gamericefishpro.space.i9.c3 c3VarB = com.gamericefishpro.space.i9.d3.B();
            c3VarB.h(str);
            Object obj = bundle.get(str);
            com.gamericefishpro.space.v8.c0.g(obj);
            R(c3VarB, obj);
            z2VarZ.l(c3VarB);
        }
        String str2 = qVar.c;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.gamericefishpro.space.i9.c3 c3VarB2 = com.gamericefishpro.space.i9.d3.B();
            c3VarB2.h("_o");
            c3VarB2.i(str2);
            z2VarZ.k((com.gamericefishpro.space.i9.d3) c3VarB2.e());
        }
        return (com.gamericefishpro.space.i9.a3) z2VarZ.e();
    }

    public String U(com.gamericefishpro.space.i9.g3 g3Var) {
        String str;
        String str2;
        String str3;
        com.gamericefishpro.space.i9.q2 q2VarI0;
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (g3Var.u()) {
            J(sb, 0, "upload_subdomain", g3Var.v());
        }
        if (g3Var.s()) {
            J(sb, 0, "sgtm_join_id", g3Var.t());
        }
        for (com.gamericefishpro.space.i9.i3 i3Var : g3Var.p()) {
            if (i3Var != null) {
                D(1, sb);
                sb.append("bundle {\n");
                if (i3Var.P()) {
                    J(sb, 1, "protocol_version", Integer.valueOf(i3Var.P0()));
                }
                r1 r1Var = (r1) this.d;
                g gVar = r1Var.v;
                p0 p0Var = r1Var.C;
                if (gVar.B(i3Var.p(), e0.M0) && i3Var.v0()) {
                    J(sb, 1, "session_stitching_token", i3Var.w0());
                }
                J(sb, 1, "platform", i3Var.h2());
                if (i3Var.r()) {
                    J(sb, 1, "gmp_version", Long.valueOf(i3Var.s()));
                }
                if (i3Var.t()) {
                    J(sb, 1, "uploading_gmp_version", Long.valueOf(i3Var.u()));
                }
                if (i3Var.r0()) {
                    J(sb, 1, "dynamite_version", Long.valueOf(i3Var.s0()));
                }
                if (i3Var.L()) {
                    J(sb, 1, "config_version", Long.valueOf(i3Var.M()));
                }
                J(sb, 1, "gmp_app_id", i3Var.E());
                J(sb, 1, "app_id", i3Var.p());
                J(sb, 1, "app_version", i3Var.q());
                if (i3Var.J()) {
                    J(sb, 1, "app_version_major", Integer.valueOf(i3Var.K()));
                }
                J(sb, 1, "firebase_instance_id", i3Var.I());
                if (i3Var.z()) {
                    J(sb, 1, "dev_cert_hash", Long.valueOf(i3Var.A()));
                }
                J(sb, 1, "app_store", i3Var.n2());
                if (i3Var.X1()) {
                    J(sb, 1, "upload_timestamp_millis", Long.valueOf(i3Var.Y1()));
                }
                if (i3Var.Z1()) {
                    J(sb, 1, "start_timestamp_millis", Long.valueOf(i3Var.a2()));
                }
                if (i3Var.b2()) {
                    J(sb, 1, "end_timestamp_millis", Long.valueOf(i3Var.c2()));
                }
                if (i3Var.d2()) {
                    J(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(i3Var.e2()));
                }
                if (i3Var.f2()) {
                    J(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(i3Var.g2()));
                }
                J(sb, 1, "app_instance_id", i3Var.y());
                J(sb, 1, "resettable_device_id", i3Var.v());
                J(sb, 1, "ds_id", i3Var.O());
                if (i3Var.w()) {
                    J(sb, 1, "limited_ad_tracking", Boolean.valueOf(i3Var.x()));
                }
                J(sb, 1, "os_version", i3Var.i2());
                J(sb, 1, "device_model", i3Var.j2());
                J(sb, 1, "user_default_language", i3Var.k2());
                if (i3Var.l2()) {
                    J(sb, 1, "time_zone_offset_minutes", Integer.valueOf(i3Var.m2()));
                }
                if (i3Var.B()) {
                    J(sb, 1, "bundle_sequential_index", Integer.valueOf(i3Var.C()));
                }
                if (i3Var.J0()) {
                    J(sb, 1, "delivery_index", Integer.valueOf(i3Var.K0()));
                }
                if (i3Var.F()) {
                    J(sb, 1, "service_upload", Boolean.valueOf(i3Var.G()));
                }
                J(sb, 1, "health_monitor", i3Var.D());
                if (i3Var.p0()) {
                    J(sb, 1, "retry_counter", Integer.valueOf(i3Var.q0()));
                }
                if (i3Var.t0()) {
                    J(sb, 1, "consent_signals", i3Var.u0());
                }
                if (i3Var.C0()) {
                    J(sb, 1, "is_dma_region", Boolean.valueOf(i3Var.D0()));
                }
                if (i3Var.E0()) {
                    J(sb, 1, "core_platform_services", i3Var.F0());
                }
                if (i3Var.A0()) {
                    J(sb, 1, "consent_diagnostics", i3Var.B0());
                }
                if (i3Var.x0()) {
                    J(sb, 1, "target_os_version", Long.valueOf(i3Var.y0()));
                }
                r8.a();
                if (r1Var.v.B(i3Var.p(), e0.P0)) {
                    J(sb, 1, "ad_services_version", Integer.valueOf(i3Var.G0()));
                    if (i3Var.H0() && (q2VarI0 = i3Var.I0()) != null) {
                        D(2, sb);
                        sb.append("attribution_eligibility_status {\n");
                        J(sb, 2, "eligible", Boolean.valueOf(q2VarI0.p()));
                        J(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(q2VarI0.q()));
                        J(sb, 2, "pre_r", Boolean.valueOf(q2VarI0.r()));
                        J(sb, 2, "r_extensions_too_old", Boolean.valueOf(q2VarI0.s()));
                        J(sb, 2, "adservices_extension_too_old", Boolean.valueOf(q2VarI0.t()));
                        J(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(q2VarI0.u()));
                        J(sb, 2, "measurement_manager_disabled", Boolean.valueOf(q2VarI0.v()));
                        D(2, sb);
                        sb.append("}\n");
                    }
                }
                if (i3Var.L0()) {
                    com.gamericefishpro.space.i9.n2 n2VarM0 = i3Var.M0();
                    D(2, sb);
                    sb.append("ad_campaign_info {\n");
                    if (n2VarM0.y()) {
                        J(sb, 2, "deep_link_gclid", n2VarM0.z());
                    }
                    if (n2VarM0.A()) {
                        J(sb, 2, "deep_link_gbraid", n2VarM0.B());
                    }
                    if (n2VarM0.C()) {
                        J(sb, 2, "deep_link_gad_source", n2VarM0.D());
                    }
                    if (n2VarM0.E()) {
                        J(sb, 2, "deep_link_session_millis", Long.valueOf(n2VarM0.F()));
                    }
                    if (n2VarM0.G()) {
                        J(sb, 2, "market_referrer_gclid", n2VarM0.H());
                    }
                    if (n2VarM0.I()) {
                        J(sb, 2, "market_referrer_gbraid", n2VarM0.J());
                    }
                    if (n2VarM0.K()) {
                        J(sb, 2, "market_referrer_gad_source", n2VarM0.L());
                    }
                    if (n2VarM0.M()) {
                        J(sb, 2, "market_referrer_click_millis", Long.valueOf(n2VarM0.N()));
                    }
                    D(2, sb);
                    sb.append("}\n");
                }
                if (i3Var.Q()) {
                    J(sb, 1, "batching_timestamp_millis", Long.valueOf(i3Var.R()));
                }
                if (i3Var.N0()) {
                    com.gamericefishpro.space.i9.p3 p3VarO0 = i3Var.O0();
                    D(2, sb);
                    sb.append("sgtm_diagnostics {\n");
                    int iT = p3VarO0.t();
                    if (iT == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iT == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iT != 3) {
                        str2 = iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    J(sb, 2, "upload_type", str2);
                    J(sb, 2, "client_upload_eligibility", com.gamericefishpro.space.m5.a.v(p3VarO0.p()));
                    int iU = p3VarO0.u();
                    if (iU == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iU == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iU == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iU != 4) {
                        str3 = iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    J(sb, 2, "service_upload_eligibility", str3);
                    D(2, sb);
                    sb.append("}\n");
                }
                if (i3Var.S()) {
                    com.gamericefishpro.space.i9.w2 w2VarT = i3Var.T();
                    D(2, sb);
                    sb.append("consent_info_extra {\n");
                    for (com.gamericefishpro.space.i9.v2 v2Var : w2VarT.p()) {
                        D(3, sb);
                        sb.append("limited_data_modes {\n");
                        int iQ = v2Var.q();
                        if (iQ == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iQ == 2) {
                            str = "AD_STORAGE";
                        } else if (iQ != 3) {
                            str = iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        J(sb, 3, com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY, str);
                        int iR = v2Var.r();
                        J(sb, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        D(3, sb);
                        sb.append("}\n");
                    }
                    D(2, sb);
                    sb.append("}\n");
                }
                m5<com.gamericefishpro.space.i9.r3> m5VarU1 = i3Var.U1();
                if (m5VarU1 != null) {
                    for (com.gamericefishpro.space.i9.r3 r3Var : m5VarU1) {
                        if (r3Var != null) {
                            D(2, sb);
                            sb.append("user_property {\n");
                            J(sb, 2, "set_timestamp_millis", r3Var.p() ? Long.valueOf(r3Var.q()) : null);
                            J(sb, 2, "name", p0Var.c(r3Var.r()));
                            J(sb, 2, "string_value", r3Var.t());
                            J(sb, 2, "int_value", r3Var.u() ? Long.valueOf(r3Var.v()) : null);
                            J(sb, 2, "double_value", r3Var.y() ? Double.valueOf(r3Var.z()) : null);
                            D(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                m5<com.gamericefishpro.space.i9.s2> m5VarH = i3Var.H();
                if (m5VarH != null) {
                    for (com.gamericefishpro.space.i9.s2 s2Var : m5VarH) {
                        if (s2Var != null) {
                            D(2, sb);
                            sb.append("audience_membership {\n");
                            if (s2Var.p()) {
                                J(sb, 2, "audience_id", Integer.valueOf(s2Var.q()));
                            }
                            if (s2Var.u()) {
                                J(sb, 2, "new_audience", Boolean.valueOf(s2Var.v()));
                            }
                            I(sb, "current_data", s2Var.r());
                            if (s2Var.s()) {
                                I(sb, "previous_data", s2Var.t());
                            }
                            D(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.gamericefishpro.space.i9.a3> listP1 = i3Var.P1();
                if (listP1 != null) {
                    for (com.gamericefishpro.space.i9.a3 a3Var : listP1) {
                        if (a3Var != null) {
                            D(2, sb);
                            sb.append("event {\n");
                            J(sb, 2, "name", p0Var.a(a3Var.s()));
                            if (a3Var.t()) {
                                J(sb, 2, "timestamp_millis", Long.valueOf(a3Var.u()));
                            }
                            if (a3Var.v()) {
                                J(sb, 2, "previous_timestamp_millis", Long.valueOf(a3Var.w()));
                            }
                            if (a3Var.x()) {
                                J(sb, 2, NewHtcHomeBadger.COUNT, Integer.valueOf(a3Var.y()));
                            }
                            if (a3Var.q() != 0) {
                                B(sb, 2, (m5) a3Var.p());
                            }
                            D(2, sb);
                            sb.append("}\n");
                        }
                    }
                }
                D(1, sb);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public String V(com.gamericefishpro.space.i9.u1 u1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (u1Var.p()) {
            J(sb, 0, "filter_id", Integer.valueOf(u1Var.q()));
        }
        J(sb, 0, "property_name", ((r1) this.d).C.c(u1Var.r()));
        String strF = F(u1Var.t(), u1Var.u(), u1Var.w());
        if (!strF.isEmpty()) {
            J(sb, 0, "filter_type", strF);
        }
        C(sb, 1, u1Var.s());
        sb.append("}\n");
        return sb.toString();
    }

    public Parcelable W(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (com.gamericefishpro.space.w8.b unused) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.y.a("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public List a0(l5 l5Var, List list) {
        int i;
        r1 r1Var = (r1) this.d;
        ArrayList arrayList = new ArrayList(l5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                v0 v0Var = r1Var.y;
                r1.l(v0Var);
                v0Var.B.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.B.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public boolean b0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((r1) this.d).D.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public long c0(byte[] bArr) {
        com.gamericefishpro.space.v8.c0.g(bArr);
        r1 r1Var = (r1) this.d;
        r4 r4Var = r1Var.B;
        r1.j(r4Var);
        r4Var.r();
        MessageDigest messageDigestI = r4.I();
        if (messageDigestI != null) {
            return r4.J(messageDigestI.digest(bArr));
        }
        v0 v0Var = r1Var.y;
        r1.l(v0Var);
        v0Var.y.a("Failed to get MD5");
        return 0L;
    }

    public byte[] d0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.y.b(e, "Failed to gzip content");
            throw e;
        }
    }

    @Override // com.gamericefishpro.space.n9.g4
    public final void u() {
        int i = this.v;
    }

    private final void M() {
    }

    private final void N() {
    }

    private final void O() {
    }
}
