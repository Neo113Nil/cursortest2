package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class zp2 implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<zp2> CREATOR = new i02(9);
    public static final zp2 k;
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final CoverPath g;
    public final CoverPath h;
    public final jyr i;
    public final jyr j;

    static {
        c01 c01Var = c01.v;
        k = new zp2(c01Var.a, c01Var.b, null, null, null, null, null, null, 252);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zp2(String str, String str2, String str3, String str4, ArrayList arrayList, List list, CoverPath coverPath, CoverPath coverPath2, int i) {
        this(str, str2, r3, r4, r5, r6, r7, r8);
        CoverPath coverPath3;
        CoverPath coverPath4;
        if ((i & 4) != 0) {
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            str3 = str2.toUpperCase(locale);
            str3.getClass();
        }
        String str5 = str3;
        String str6 = (i & 8) != 0 ? null : str4;
        ArrayList arrayList2 = (i & 16) != 0 ? null : arrayList;
        List list2 = (i & 32) != 0 ? c5b.a : list;
        if ((i & 64) != 0) {
            CoverPath none = CoverPath.none();
            none.getClass();
            coverPath3 = none;
        } else {
            coverPath3 = coverPath;
        }
        if ((i & 128) != 0) {
            CoverPath none2 = CoverPath.none();
            none2.getClass();
            coverPath4 = none2;
        } else {
            coverPath4 = coverPath2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zp2.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.a, ((zp2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        List list = this.e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                ((zp2) v.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeStringList(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
    }

    public zp2(String str, String str2, String str3, String str4, List list, List list2, CoverPath coverPath, CoverPath coverPath2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list2.getClass();
        coverPath.getClass();
        coverPath2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        this.g = coverPath;
        this.h = coverPath2;
        final int i = 0;
        this.i = btf.b(new Function0(this) { // from class: yp2
            public final /* synthetic */ zp2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        List<String> list3 = this.b.f;
                        ArrayList arrayList = new ArrayList();
                        for (String str5 : list3) {
                            h94.b.getClass();
                            h94 z = hs4.z(str5);
                            if (z != null) {
                                arrayList.add(z);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list4 = this.b.f;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        zp2 zp2Var = this.b;
                        List list5 = (List) zp2Var.i.getValue();
                        List list6 = (List) zp2Var.j.getValue();
                        h1bVar.getClass();
                        return h1b.K(list5, list6);
                }
            }
        });
        final int i2 = 1;
        this.j = btf.b(new Function0(this) { // from class: yp2
            public final /* synthetic */ zp2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List<String> list3 = this.b.f;
                        ArrayList arrayList = new ArrayList();
                        for (String str5 : list3) {
                            h94.b.getClass();
                            h94 z = hs4.z(str5);
                            if (z != null) {
                                arrayList.add(z);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list4 = this.b.f;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        zp2 zp2Var = this.b;
                        List list5 = (List) zp2Var.i.getValue();
                        List list6 = (List) zp2Var.j.getValue();
                        h1bVar.getClass();
                        return h1b.K(list5, list6);
                }
            }
        });
        final int i3 = 2;
        btf.b(new Function0(this) { // from class: yp2
            public final /* synthetic */ zp2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        List<String> list3 = this.b.f;
                        ArrayList arrayList = new ArrayList();
                        for (String str5 : list3) {
                            h94.b.getClass();
                            h94 z = hs4.z(str5);
                            if (z != null) {
                                arrayList.add(z);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list4 = this.b.f;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        zp2 zp2Var = this.b;
                        List list5 = (List) zp2Var.i.getValue();
                        List list6 = (List) zp2Var.j.getValue();
                        h1bVar.getClass();
                        return h1b.K(list5, list6);
                }
            }
        });
    }
}
