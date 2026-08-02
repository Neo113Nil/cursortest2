package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class mqs implements l9b, Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<mqs> CREATOR = new b3s(6);
    private static final long serialVersionUID = 3;
    public final boolean A;
    public final jyr A0;
    public final nxs B;
    public final jyr B0;
    public final List C;
    public final jyr C0;
    public final qvs D;
    public final qvs E;
    public final List F;
    public final boolean G;
    public final Map H;
    public final List I;
    public final List J;
    public final String K;
    public final boolean L;
    public final long X;
    public final String Y;
    public final boolean Z;
    public final String a;
    public final String b;
    public final String c;
    public final k10 d;
    public final long e;
    public final List f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final dg2 k;
    public final boolean l;
    public final WarningContent m;
    public final boolean n;
    public final hqs o;
    public final CoverPath p;
    public final String q;
    public final String r;
    public final String s;
    public final oq t;
    public final List u;
    public final i1m v;
    public final boolean v0;
    public final CoverPath w;
    public Date w0;
    public final Date x;
    public final co6 x0;
    public final String y;
    public final String y0;
    public final String z;
    public final jyr z0;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0193, code lost:
    
        if (r7 != null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mqs(String str, String str2, String str3, k10 k10Var, long j, List list, String str4, String str5, String str6, boolean z, dg2 dg2Var, boolean z2, WarningContent warningContent, boolean z3, hqs hqsVar, CoverPath coverPath, String str7, String str8, String str9, oq oqVar, List list2, i1m i1mVar, CoverPath coverPath2, Date date, String str10, String str11, boolean z4, nxs nxsVar, List list3, qvs qvsVar, qvs qvsVar2, List list4, boolean z5, Map map, List list5, List list6, String str12, boolean z6, long j2, String str13, boolean z7) {
        Object obj;
        str.getClass();
        str3.getClass();
        k10Var.getClass();
        list.getClass();
        dg2Var.getClass();
        warningContent.getClass();
        coverPath.getClass();
        list3.getClass();
        list4.getClass();
        map.getClass();
        list5.getClass();
        list6.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k10Var;
        this.e = j;
        this.f = list;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = z;
        this.k = dg2Var;
        this.l = z2;
        this.m = warningContent;
        this.n = z3;
        this.o = hqsVar;
        this.p = coverPath;
        this.q = str7;
        this.r = str8;
        this.s = str9;
        this.t = oqVar;
        this.u = list2;
        this.v = i1mVar;
        this.w = coverPath2;
        this.x = date;
        this.y = str10;
        this.z = str11;
        this.A = z4;
        this.B = nxsVar;
        this.C = list3;
        this.D = qvsVar;
        this.E = qvsVar2;
        this.F = list4;
        this.G = z5;
        this.H = map;
        this.I = list5;
        this.J = list6;
        this.K = str12;
        this.L = z6;
        this.X = j2;
        this.Y = str13;
        this.Z = z7;
        if (!k10Var.equals(k10.i) && !str.equals(k10Var.c)) {
            su4.s(2, null, "Track id " + str + " does not equal trackId from album " + k10Var, null);
        }
        if (i1mVar != null && !str.equals(i1mVar.c)) {
            su4.s(2, null, "Track id " + str + " does not equal trackId from playlist " + i1mVar, null);
        }
        do6 do6Var = do6.a;
        if (coverPath2 != null && coverPath2.getType() == do6Var) {
            dfi.r("You can't set CoverPath.NULL as Track cover. Track id=".concat(str), "Track");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            String str14 = (String) it.next();
            jqs.a.getClass();
            str14.getClass();
            Iterator it2 = jqs.d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                ((jqs) obj).getClass();
                if ("smart_preview".equals(str14)) {
                    break;
                }
            }
            jqs jqsVar = (jqs) obj;
            if (jqsVar != null) {
                arrayList.add(jqsVar);
            }
        }
        this.v0 = arrayList.contains(jqs.b);
        this.w0 = new Date(0L);
        CoverPath coverPath3 = this.w;
        if (coverPath3 != null) {
            String uri = coverPath3.getUri();
            coverPath3 = (uri == null || !(StringsKt.U(uri) ^ true)) ? null : coverPath3;
            if (coverPath3 != null) {
                coverPath3 = coverPath3.getType() == do6Var ? null : coverPath3;
            }
        }
        coverPath3 = this.p;
        this.x0 = new co6(coverPath3, qo6.a, null);
        String str15 = l() ? this.d.a : null;
        this.y0 = str15 != null ? ouj.o(this.a, StringUtils.PROCESS_POSTFIX_DELIMITER, str15) : null;
        final int i = 0;
        this.z0 = btf.b(new Function0(this) { // from class: gqs
            public final /* synthetic */ mqs b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        List<String> list7 = this.b.C;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str16 : list7) {
                            h94.b.getClass();
                            h94 z8 = hs4.z(str16);
                            if (z8 != null) {
                                arrayList2.add(z8);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List list8 = this.b.C;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            hs5 g0 = wdp.g0((String) it3.next());
                            if (g0 != null) {
                                arrayList3.add(g0);
                            }
                        }
                        return arrayList3;
                    case 2:
                        h1b h1bVar = jzb.b;
                        mqs mqsVar = this.b;
                        List g = mqsVar.g();
                        List h = mqsVar.h();
                        h1bVar.getClass();
                        return h1b.K(g, h);
                    default:
                        Map map2 = this.b.H;
                        map2.getClass();
                        String str17 = (String) map2.get("main_h_s_l");
                        if (str17 == null) {
                            str17 = (String) map2.get("average");
                        }
                        String str18 = (String) map2.get("text_h_s_l");
                        if (str18 == null) {
                            str18 = (String) map2.get("waveText");
                        }
                        return new x85(str17, str18);
                }
            }
        });
        final int i2 = 1;
        this.A0 = btf.b(new Function0(this) { // from class: gqs
            public final /* synthetic */ mqs b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List<String> list7 = this.b.C;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str16 : list7) {
                            h94.b.getClass();
                            h94 z8 = hs4.z(str16);
                            if (z8 != null) {
                                arrayList2.add(z8);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List list8 = this.b.C;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            hs5 g0 = wdp.g0((String) it3.next());
                            if (g0 != null) {
                                arrayList3.add(g0);
                            }
                        }
                        return arrayList3;
                    case 2:
                        h1b h1bVar = jzb.b;
                        mqs mqsVar = this.b;
                        List g = mqsVar.g();
                        List h = mqsVar.h();
                        h1bVar.getClass();
                        return h1b.K(g, h);
                    default:
                        Map map2 = this.b.H;
                        map2.getClass();
                        String str17 = (String) map2.get("main_h_s_l");
                        if (str17 == null) {
                            str17 = (String) map2.get("average");
                        }
                        String str18 = (String) map2.get("text_h_s_l");
                        if (str18 == null) {
                            str18 = (String) map2.get("waveText");
                        }
                        return new x85(str17, str18);
                }
            }
        });
        final int i3 = 2;
        this.B0 = btf.b(new Function0(this) { // from class: gqs
            public final /* synthetic */ mqs b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        List<String> list7 = this.b.C;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str16 : list7) {
                            h94.b.getClass();
                            h94 z8 = hs4.z(str16);
                            if (z8 != null) {
                                arrayList2.add(z8);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List list8 = this.b.C;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            hs5 g0 = wdp.g0((String) it3.next());
                            if (g0 != null) {
                                arrayList3.add(g0);
                            }
                        }
                        return arrayList3;
                    case 2:
                        h1b h1bVar = jzb.b;
                        mqs mqsVar = this.b;
                        List g = mqsVar.g();
                        List h = mqsVar.h();
                        h1bVar.getClass();
                        return h1b.K(g, h);
                    default:
                        Map map2 = this.b.H;
                        map2.getClass();
                        String str17 = (String) map2.get("main_h_s_l");
                        if (str17 == null) {
                            str17 = (String) map2.get("average");
                        }
                        String str18 = (String) map2.get("text_h_s_l");
                        if (str18 == null) {
                            str18 = (String) map2.get("waveText");
                        }
                        return new x85(str17, str18);
                }
            }
        });
        final int i4 = 3;
        this.C0 = btf.b(new Function0(this) { // from class: gqs
            public final /* synthetic */ mqs b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        List<String> list7 = this.b.C;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str16 : list7) {
                            h94.b.getClass();
                            h94 z8 = hs4.z(str16);
                            if (z8 != null) {
                                arrayList2.add(z8);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List list8 = this.b.C;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = list8.iterator();
                        while (it3.hasNext()) {
                            hs5 g0 = wdp.g0((String) it3.next());
                            if (g0 != null) {
                                arrayList3.add(g0);
                            }
                        }
                        return arrayList3;
                    case 2:
                        h1b h1bVar = jzb.b;
                        mqs mqsVar = this.b;
                        List g = mqsVar.g();
                        List h = mqsVar.h();
                        h1bVar.getClass();
                        return h1b.K(g, h);
                    default:
                        Map map2 = this.b.H;
                        map2.getClass();
                        String str17 = (String) map2.get("main_h_s_l");
                        if (str17 == null) {
                            str17 = (String) map2.get("average");
                        }
                        String str18 = (String) map2.get("text_h_s_l");
                        if (str18 == null) {
                            str18 = (String) map2.get("waveText");
                        }
                        return new x85(str17, str18);
                }
            }
        });
    }

    public static mqs e(mqs mqsVar, long j, List list, oq oqVar, List list2, qvs qvsVar, int i) {
        String str;
        oq oqVar2;
        List list3;
        qvs qvsVar2;
        String str2 = mqsVar.a;
        String str3 = mqsVar.b;
        String str4 = mqsVar.c;
        k10 k10Var = mqsVar.d;
        long j2 = (i & 16) != 0 ? mqsVar.e : j;
        List list4 = (i & 32) != 0 ? mqsVar.f : list;
        String str5 = mqsVar.g;
        String str6 = mqsVar.h;
        String str7 = mqsVar.i;
        boolean z = mqsVar.j;
        dg2 dg2Var = mqsVar.k;
        boolean z2 = mqsVar.l;
        WarningContent warningContent = mqsVar.m;
        boolean z3 = mqsVar.n;
        hqs hqsVar = mqsVar.o;
        CoverPath coverPath = mqsVar.p;
        String str8 = mqsVar.q;
        String str9 = mqsVar.r;
        String str10 = mqsVar.s;
        if ((i & 524288) != 0) {
            str = str10;
            oqVar2 = mqsVar.t;
        } else {
            str = str10;
            oqVar2 = oqVar;
        }
        oq oqVar3 = oqVar2;
        List list5 = (i & 1048576) != 0 ? mqsVar.u : list2;
        i1m i1mVar = mqsVar.v;
        CoverPath coverPath2 = mqsVar.w;
        Date date = mqsVar.x;
        String str11 = mqsVar.y;
        String str12 = mqsVar.z;
        boolean z4 = mqsVar.A;
        nxs nxsVar = mqsVar.B;
        List list6 = mqsVar.C;
        if ((i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
            list3 = list6;
            qvsVar2 = mqsVar.D;
        } else {
            list3 = list6;
            qvsVar2 = qvsVar;
        }
        qvs qvsVar3 = mqsVar.E;
        List list7 = mqsVar.F;
        boolean z5 = mqsVar.G;
        Map map = mqsVar.H;
        List list8 = mqsVar.I;
        List list9 = mqsVar.J;
        String str13 = mqsVar.K;
        boolean z6 = mqsVar.L;
        long j3 = mqsVar.X;
        String str14 = mqsVar.Y;
        boolean z7 = mqsVar.Z;
        str2.getClass();
        str4.getClass();
        k10Var.getClass();
        list4.getClass();
        dg2Var.getClass();
        warningContent.getClass();
        coverPath.getClass();
        list3.getClass();
        list7.getClass();
        map.getClass();
        list8.getClass();
        list9.getClass();
        return new mqs(str2, str3, str4, k10Var, j2, list4, str5, str6, str7, z, dg2Var, z2, warningContent, z3, hqsVar, coverPath, str8, str9, str, oqVar3, list5, i1mVar, coverPath2, date, str11, str12, z4, nxsVar, list3, qvsVar2, qvsVar3, list7, z5, map, list8, list9, str13, z6, j3, str14, z7);
    }

    public final boolean C() {
        Object obj;
        kqs kqsVar;
        kqs.b.getClass();
        String str = this.g;
        if (str == null) {
            kqsVar = kqs.c;
        } else {
            Iterator it = kqs.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((kqs) obj).a.equalsIgnoreCase(str)) {
                    break;
                }
            }
            kqsVar = (kqs) obj;
            if (kqsVar == null) {
                kqsVar = kqs.c;
            }
        }
        return kqsVar == kqs.d || kqsVar == kqs.e;
    }

    public final lqs I() {
        Object obj;
        lqs.b.getClass();
        String str = this.q;
        if (str == null) {
            return lqs.c;
        }
        Iterator it = lqs.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((lqs) obj).a.equals(str)) {
                break;
            }
        }
        lqs lqsVar = (lqs) obj;
        return lqsVar == null ? lqs.c : lqsVar;
    }

    public final rr5 d() {
        return q6k.A(this.a, this.d.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !mqs.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.a, ((mqs) obj).a);
    }

    public final x85 f() {
        return (x85) this.C0.getValue();
    }

    public final List g() {
        return (List) this.z0.getValue();
    }

    public final List h() {
        return (List) this.A0.getValue();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final jzb i() {
        return (jzb) this.B0.getValue();
    }

    public final String j() {
        String str = this.s;
        boolean equalsIgnoreCase = "album version".equalsIgnoreCase(str);
        String str2 = this.c;
        if (equalsIgnoreCase) {
            return str2;
        }
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return k5r.m(StringsKt.t0(str2).toString(), " (", str, ")");
            }
        }
        return str2;
    }

    public final boolean k() {
        zp2 zp2Var = (zp2) CollectionsKt.firstOrNull(this.f);
        if (zp2Var == null) {
            zp2Var = zp2.k;
        }
        return !zp2Var.equals(zp2.k);
    }

    public final boolean l() {
        Parcelable.Creator<k10> creator = k10.CREATOR;
        return !Intrinsics.d(k10.i.a, this.d.a);
    }

    public final boolean n() {
        return k() && !C();
    }

    public final boolean o() {
        return this.y != null;
    }

    public final boolean p() {
        String str = this.a;
        str.getClass();
        return new Regex("\\d+").e(str);
    }

    public final String toString() {
        return su4.o(f1d.m("Track{id='", this.a, "', album.id='", this.d.a, "', title='"), this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeLong(this.e);
        Iterator n = f1d.n(parcel, this.f);
        while (n.hasNext()) {
            ((zp2) n.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        this.k.writeToParcel(parcel, i);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m.name());
        parcel.writeInt(this.n ? 1 : 0);
        hqs hqsVar = this.o;
        if (hqsVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hqsVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.p, i);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        oq oqVar = this.t;
        if (oqVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oqVar.writeToParcel(parcel, i);
        }
        List list = this.u;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                ((c01) v.next()).writeToParcel(parcel, i);
            }
        }
        i1m i1mVar = this.v;
        if (i1mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i1mVar.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.w, i);
        parcel.writeSerializable(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A ? 1 : 0);
        nxs nxsVar = this.B;
        if (nxsVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nxsVar.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.C);
        qvs qvsVar = this.D;
        if (qvsVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qvsVar.writeToParcel(parcel, i);
        }
        qvs qvsVar2 = this.E;
        if (qvsVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            qvsVar2.writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.F);
        parcel.writeInt(this.G ? 1 : 0);
        Iterator s = k.s(this.H, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeStringList(this.I);
        parcel.writeStringList(this.J);
        parcel.writeString(this.K);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeLong(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mqs(String str, String str2, String str3, k10 k10Var, long j, List list, String str4, String str5, String str6, boolean z, dg2 dg2Var, boolean z2, WarningContent warningContent, boolean z3, hqs hqsVar, CoverPath coverPath, String str7, String str8, String str9, oq oqVar, List list2, i1m i1mVar, CoverPath coverPath2, Date date, String str10, String str11, boolean z4, nxs nxsVar, List list3, qvs qvsVar, qvs qvsVar2, List list4, boolean z5, Map map, List list5, List list6, String str12, boolean z6, long j2, String str13, int i, int i2) {
        this(str, str2, str3, k10Var, j, list, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, (262144 & i) != 0 ? null : str9, (524288 & i) != 0 ? null : oqVar, (1048576 & i) != 0 ? null : list2, (2097152 & i) != 0 ? null : i1mVar, (4194304 & i) != 0 ? null : coverPath2, (8388608 & i) != 0 ? null : date, (16777216 & i) != 0 ? null : str10, (33554432 & i) != 0 ? null : str11, (67108864 & i) != 0 ? false : z4, (134217728 & i) != 0 ? null : nxsVar, (268435456 & i) != 0 ? c5b.a : list3, (536870912 & i) != 0 ? null : qvsVar, (1073741824 & i) != 0 ? null : qvsVar2, (i & Integer.MIN_VALUE) != 0 ? c5b.a : list4, (i2 & 1) != 0 ? false : z5, (i2 & 2) != 0 ? new LinkedHashMap() : map, (i2 & 4) != 0 ? c5b.a : list5, (i2 & 8) != 0 ? c5b.a : list6, (i2 & 16) != 0 ? null : str12, (i2 & 32) != 0 ? false : z6, (i2 & 64) != 0 ? 0L : j2, (i2 & 128) != 0 ? null : str13, (i2 & 256) != 0);
        String str14;
        CoverPath coverPath3;
        String str15;
        String str16;
        if ((i & 64) != 0) {
            euk eukVar = kqs.b;
            str14 = "OWN";
        } else {
            str14 = str4;
        }
        String str17 = (i & 128) != 0 ? null : str5;
        String str18 = (i & 256) != 0 ? null : str6;
        boolean z7 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? false : z;
        dg2 dg2Var2 = (i & 1024) != 0 ? dg2.b : dg2Var;
        boolean z8 = (i & 2048) != 0 ? false : z2;
        WarningContent warningContent2 = (i & 4096) != 0 ? WarningContent.NONE : warningContent;
        boolean z9 = (i & RemoteCameraConfig.Notification.ID) != 0 ? false : z3;
        hqs hqsVar2 = (i & 16384) != 0 ? null : hqsVar;
        if ((32768 & i) != 0) {
            CoverPath none = CoverPath.none();
            none.getClass();
            coverPath3 = none;
        } else {
            coverPath3 = coverPath;
        }
        if ((65536 & i) != 0) {
            quk qukVar = lqs.b;
            str15 = "music";
        } else {
            str15 = str7;
        }
        if ((131072 & i) != 0) {
            itk itkVar = iqs.b;
            str16 = "full";
        } else {
            str16 = str8;
        }
    }
}
