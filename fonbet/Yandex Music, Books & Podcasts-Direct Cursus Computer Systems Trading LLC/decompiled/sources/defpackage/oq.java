package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class oq implements Parcelable, Serializable, nu1 {

    @NotNull
    public static final Parcelable.Creator<oq> CREATOR = new l(8);
    public static final oq J;
    private static final long serialVersionUID = 0;
    public final boolean A;
    public final boolean B;
    public final String C;
    public final co6 D;
    public Date E;
    public final LinkedList F;
    public final jyr G;
    public final jyr H;
    public final jyr I;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final WarningContent g;
    public final List h;
    public final String i;
    public final String j;
    public final String k;
    public final int l;
    public final String m;
    public final List n;
    public final CoverPath o;
    public final Date p;
    public final int q;
    public final boolean r;
    public final CoverPath s;
    public final String t;
    public final List u;
    public final List v;
    public final Integer w;
    public final Integer x;
    public final List y;
    public final boolean z;

    static {
        qee qeeVar = mq.b;
        J = new oq(CommonUrlParts.Values.FALSE_INTEGER, "unknown", "asc", false, null, null, null, null, null, null, 0, null, t75.c(zp2.k), null, 0, false, null, null, null, null, null, null, false, null, 536862712);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oq(String str, String str2, String str3, boolean z, String str4, String str5, WarningContent warningContent, String str6, String str7, String str8, int i, String str9, List list, CoverPath coverPath, int i2, boolean z2, CoverPath coverPath2, String str10, List list2, Integer num, Integer num2, List list3, boolean z3, String str11, int i3) {
        this(str, str2, r6, r7, r8, r9, r10, null, r12, r13, r14, r15, r16, list, r18, null, r20, r21, r22, r23, r24, r25, (4194304 & i3) != 0 ? null : num, (8388608 & i3) != 0 ? null : num2, (16777216 & i3) != 0 ? r25 : list3, (33554432 & i3) != 0 ? false : z3, false, false, (i3 & 268435456) != 0 ? null : str11);
        CoverPath coverPath3;
        CoverPath coverPath4;
        String str12 = (i3 & 4) != 0 ? null : str3;
        boolean z4 = (i3 & 8) != 0 ? true : z;
        String str13 = (i3 & 16) != 0 ? null : str4;
        String str14 = (i3 & 32) != 0 ? null : str5;
        WarningContent warningContent2 = (i3 & 64) != 0 ? WarningContent.NONE : warningContent;
        String str15 = (i3 & 256) != 0 ? null : str6;
        String str16 = (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? Album$AlbumType.COMMON.a : str7;
        String str17 = (i3 & 1024) != 0 ? null : str8;
        int i4 = (i3 & 2048) != 0 ? -1 : i;
        String str18 = (i3 & 4096) != 0 ? null : str9;
        if ((i3 & 16384) != 0) {
            CoverPath none = CoverPath.none();
            none.getClass();
            coverPath3 = none;
        } else {
            coverPath3 = coverPath;
        }
        int i5 = (65536 & i3) != 0 ? -1 : i2;
        boolean z5 = (131072 & i3) != 0 ? false : z2;
        if ((262144 & i3) != 0) {
            CoverPath none2 = CoverPath.none();
            none2.getClass();
            coverPath4 = none2;
        } else {
            coverPath4 = coverPath2;
        }
        String str19 = (524288 & i3) != 0 ? null : str10;
        List list4 = (1048576 & i3) != 0 ? c5b.a : list2;
        c5b c5bVar = c5b.a;
    }

    public static oq e(oq oqVar, List list, int i) {
        String str = oqVar.a;
        String str2 = oqVar.b;
        String str3 = oqVar.c;
        boolean z = oqVar.d;
        String str4 = oqVar.e;
        String str5 = oqVar.f;
        WarningContent warningContent = oqVar.g;
        List list2 = (i & 128) != 0 ? oqVar.h : null;
        String str6 = oqVar.i;
        List list3 = list2;
        String str7 = oqVar.j;
        String str8 = oqVar.k;
        int i2 = oqVar.l;
        String str9 = oqVar.m;
        List list4 = (i & RemoteCameraConfig.Notification.ID) != 0 ? oqVar.n : list;
        CoverPath coverPath = oqVar.o;
        List list5 = list4;
        Date date = oqVar.p;
        int i3 = oqVar.q;
        boolean z2 = oqVar.r;
        CoverPath coverPath2 = oqVar.s;
        String str10 = oqVar.t;
        List list6 = oqVar.u;
        List list7 = oqVar.v;
        Integer num = oqVar.w;
        Integer num2 = oqVar.x;
        List list8 = oqVar.y;
        boolean z3 = oqVar.z;
        boolean z4 = oqVar.A;
        boolean z5 = oqVar.B;
        String str11 = oqVar.C;
        oqVar.getClass();
        str.getClass();
        str2.getClass();
        warningContent.getClass();
        list5.getClass();
        coverPath.getClass();
        coverPath2.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        return new oq(str, str2, str3, z, str4, str5, warningContent, list3, str6, str7, str8, i2, str9, list5, coverPath, date, i3, z2, coverPath2, str10, list6, list7, num, num2, list8, z3, z4, z5, str11);
    }

    @Override // defpackage.nu1
    public final ou1 W() {
        return ou1.a;
    }

    public final Album$AlbumType d() {
        Album$AlbumType.b.getClass();
        return o6c.e(this.j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !oq.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.a, ((oq) obj).a);
    }

    public final mq f() {
        String obj;
        mq.b.getClass();
        String str = this.c;
        mq mqVar = null;
        if (str != null && (obj = StringsKt.t0(str).toString()) != null) {
            String lowerCase = obj.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            mq[] values = mq.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                mq mqVar2 = values[i];
                if (mqVar2.a.equals(lowerCase)) {
                    mqVar = mqVar2;
                    break;
                }
                i++;
            }
        }
        return mqVar == null ? d() == Album$AlbumType.PODCAST ? mq.Desc : mq.Asc : mqVar;
    }

    public final List g() {
        return (List) this.G.getValue();
    }

    public final List h() {
        return (List) this.H.getValue();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final jzb i() {
        return (jzb) this.I.getValue();
    }

    public final lq j() {
        String str = this.k;
        if (str != null) {
            lq.a.getClass();
            for (lq lqVar : lq.values()) {
                lqVar.getClass();
                if ("podcast".equals(str)) {
                    return lqVar;
                }
            }
        }
        return null;
    }

    public final void k(Collection collection) {
        collection.getClass();
        LinkedList linkedList = this.F;
        if (Intrinsics.d(linkedList, collection)) {
            return;
        }
        linkedList.clear();
        linkedList.addAll(collection);
    }

    public final String toString() {
        StringBuilder m = f1d.m("Album(id=", this.a, ", title=", this.b, ", defaultSortOrderRaw=");
        m.append(this.c);
        m.append(", available=");
        m.append(this.d);
        m.append(", shortDescription=");
        su4.v(m, this.e, ", description=", this.f, ", warningContent=");
        m.append(this.g);
        m.append(", duplicates=");
        m.append(this.h);
        m.append(", releaseYear=");
        su4.v(m, this.i, ", albumTypeRaw=", this.j, ", metaTypeStr=");
        m.append(this.k);
        m.append(", tracksCount=");
        m.append(this.l);
        m.append(", genre=");
        m.append(this.m);
        m.append(", artists=");
        m.append(this.n);
        m.append(", coverPath=");
        m.append(this.o);
        m.append(", releaseDate=");
        m.append(this.p);
        m.append(", likesCount=");
        m.append(this.q);
        m.append(", childContent=");
        m.append(this.r);
        m.append(", bgImagePath=");
        m.append(this.s);
        m.append(", bgVideoUrl=");
        m.append(this.t);
        m.append(", disclaimerRaw=");
        m.append(this.u);
        m.append(", labels=");
        m.append(this.v);
        m.append(", durationSec=");
        m.append(this.w);
        m.append(", durationLeft=");
        m.append(this.x);
        m.append(", availableForOptions=");
        m.append(this.y);
        m.append(", availableForPremiumUsers=");
        m.append(this.z);
        m.append(", availablePartially=");
        dfi.t(m, this.A, ", hasTrailer=", this.B, ", version=");
        return su4.o(m, this.C, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g.name());
        List list = this.h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                ((oq) v.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        Iterator n = f1d.n(parcel, this.n);
        while (n.hasNext()) {
            ((zp2) n.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.o, i);
        parcel.writeSerializable(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeParcelable(this.s, i);
        parcel.writeString(this.t);
        parcel.writeStringList(this.u);
        Iterator n2 = f1d.n(parcel, this.v);
        while (n2.hasNext()) {
            ((zt) n2.next()).writeToParcel(parcel, i);
        }
        Integer num = this.w;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num);
        }
        Integer num2 = this.x;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num2);
        }
        parcel.writeStringList(this.y);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeString(this.C);
    }

    public oq(String str, String str2, String str3, boolean z, String str4, String str5, WarningContent warningContent, List list, String str6, String str7, String str8, int i, String str9, List list2, CoverPath coverPath, Date date, int i2, boolean z2, CoverPath coverPath2, String str10, List list3, List list4, Integer num, Integer num2, List list5, boolean z3, boolean z4, boolean z5, String str11) {
        qo6 qo6Var;
        str.getClass();
        str2.getClass();
        warningContent.getClass();
        list2.getClass();
        coverPath.getClass();
        coverPath2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = str4;
        this.f = str5;
        this.g = warningContent;
        this.h = list;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = i;
        this.m = str9;
        this.n = list2;
        this.o = coverPath;
        this.p = date;
        this.q = i2;
        this.r = z2;
        this.s = coverPath2;
        this.t = str10;
        this.u = list3;
        this.v = list4;
        this.w = num;
        this.x = num2;
        this.y = list5;
        this.z = z3;
        this.A = z4;
        this.B = z5;
        this.C = str11;
        if (nq.a[d().ordinal()] == 1) {
            qo6Var = qo6.g;
        } else {
            qo6Var = qo6.b;
        }
        this.D = new co6(coverPath, qo6Var, null);
        this.E = new Date(0L);
        this.F = new LinkedList();
        final int i3 = 0;
        this.G = btf.b(new Function0(this) { // from class: kq
            public final /* synthetic */ oq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        List<String> list6 = this.b.u;
                        ArrayList arrayList = new ArrayList();
                        for (String str12 : list6) {
                            h94.b.getClass();
                            h94 z6 = hs4.z(str12);
                            if (z6 != null) {
                                arrayList.add(z6);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list7 = this.b.u;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list7.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        oq oqVar = this.b;
                        List g = oqVar.g();
                        List h = oqVar.h();
                        h1bVar.getClass();
                        return h1b.K(g, h);
                }
            }
        });
        final int i4 = 1;
        this.H = btf.b(new Function0(this) { // from class: kq
            public final /* synthetic */ oq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        List<String> list6 = this.b.u;
                        ArrayList arrayList = new ArrayList();
                        for (String str12 : list6) {
                            h94.b.getClass();
                            h94 z6 = hs4.z(str12);
                            if (z6 != null) {
                                arrayList.add(z6);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list7 = this.b.u;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list7.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        oq oqVar = this.b;
                        List g = oqVar.g();
                        List h = oqVar.h();
                        h1bVar.getClass();
                        return h1b.K(g, h);
                }
            }
        });
        final int i5 = 2;
        this.I = btf.b(new Function0(this) { // from class: kq
            public final /* synthetic */ oq b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        List<String> list6 = this.b.u;
                        ArrayList arrayList = new ArrayList();
                        for (String str12 : list6) {
                            h94.b.getClass();
                            h94 z6 = hs4.z(str12);
                            if (z6 != null) {
                                arrayList.add(z6);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list7 = this.b.u;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list7.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        oq oqVar = this.b;
                        List g = oqVar.g();
                        List h = oqVar.h();
                        h1bVar.getClass();
                        return h1b.K(g, h);
                }
            }
        });
    }
}
