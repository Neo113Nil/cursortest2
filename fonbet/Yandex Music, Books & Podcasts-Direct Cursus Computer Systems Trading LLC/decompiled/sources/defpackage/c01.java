package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class c01 implements Parcelable, Serializable, nu1 {
    private static final long serialVersionUID = 2;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final b01 f;
    public final int g;
    public final List h;
    public final String i;
    public final a01 j;
    public final CoverPath k;
    public final CoverPath l;
    public final boolean m;
    public final List n;
    public final x41 o;
    public final boolean p;
    public final co6 q;
    public Date r;
    public final jyr s;
    public final jyr t;
    public final jyr u;

    @NotNull
    public static final Parcelable.Creator<c01> CREATOR = new l(23);
    public static final c01 v = new c01(CommonUrlParts.Values.FALSE_INTEGER, "unknown", false, false, null, 0, null, null, null, null, null, false, 65468);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c01(String str, String str2, boolean z, boolean z2, b01 b01Var, int i, a01 a01Var, CoverPath coverPath, CoverPath coverPath2, List list, x41 x41Var, boolean z3, int i2) {
        this(str, str2, r6, false, r8, r9, r10, null, null, r13, r14, r15, false, (i2 & RemoteCameraConfig.Notification.ID) != 0 ? c5b.a : list, (i2 & 16384) != 0 ? null : x41Var, (i2 & SQLiteDatabase.OPEN_NOMUTEX) != 0 ? false : z3);
        CoverPath coverPath3;
        CoverPath coverPath4;
        boolean z4 = (i2 & 4) != 0 ? false : z;
        boolean z5 = (i2 & 16) != 0 ? true : z2;
        b01 b01Var2 = (i2 & 32) != 0 ? null : b01Var;
        int i3 = (i2 & 64) != 0 ? 0 : i;
        a01 a01Var2 = (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? a01.h : a01Var;
        if ((i2 & 1024) != 0) {
            CoverPath none = CoverPath.none();
            none.getClass();
            coverPath3 = none;
        } else {
            coverPath3 = coverPath;
        }
        if ((i2 & 2048) != 0) {
            CoverPath none2 = CoverPath.none();
            none2.getClass();
            coverPath4 = none2;
        } else {
            coverPath4 = coverPath2;
        }
    }

    @Override // defpackage.nu1
    public final ou1 W() {
        return ou1.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c01.class.equals(obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.a, ((c01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.s("Artist{id=", this.a, ", name=", this.b, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        b01 b01Var = this.f;
        if (b01Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(b01Var.a);
        }
        parcel.writeInt(this.g);
        List list = this.h;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v2 = hrg.v(parcel, 1, list);
            while (v2.hasNext()) {
                ((c01) v2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.i);
        this.j.writeToParcel(parcel, i);
        parcel.writeParcelable(this.k, i);
        parcel.writeParcelable(this.l, i);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeStringList(this.n);
        x41 x41Var = this.o;
        if (x41Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(x41Var.name());
        }
        parcel.writeInt(this.p ? 1 : 0);
    }

    public c01(String str, String str2, boolean z, boolean z2, boolean z3, b01 b01Var, int i, ArrayList arrayList, String str3, a01 a01Var, CoverPath coverPath, CoverPath coverPath2, boolean z4, List list, x41 x41Var, boolean z5) {
        str.getClass();
        str2.getClass();
        a01Var.getClass();
        coverPath.getClass();
        coverPath2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = b01Var;
        this.g = i;
        this.h = arrayList;
        this.i = str3;
        this.j = a01Var;
        this.k = coverPath;
        this.l = coverPath2;
        this.m = z4;
        this.n = list;
        this.o = x41Var;
        this.p = z5;
        this.q = new co6(coverPath, qo6.d, null);
        this.r = new Date(0L);
        final int i2 = 0;
        this.s = btf.b(new Function0(this) { // from class: zz0
            public final /* synthetic */ c01 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List<String> list2 = this.b.n;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str4 : list2) {
                            h94.b.getClass();
                            h94 z6 = hs4.z(str4);
                            if (z6 != null) {
                                arrayList2.add(z6);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List list3 = this.b.n;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList3.add(g0);
                            }
                        }
                        return arrayList3;
                    default:
                        h1b h1bVar = jzb.b;
                        c01 c01Var = this.b;
                        List list4 = (List) c01Var.s.getValue();
                        List list5 = (List) c01Var.t.getValue();
                        h1bVar.getClass();
                        return h1b.K(list4, list5);
                }
            }
        });
        final int i3 = 1;
        this.t = btf.b(new Function0(this) { // from class: zz0
            public final /* synthetic */ c01 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        List<String> list2 = this.b.n;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str4 : list2) {
                            h94.b.getClass();
                            h94 z6 = hs4.z(str4);
                            if (z6 != null) {
                                arrayList2.add(z6);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List list3 = this.b.n;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList3.add(g0);
                            }
                        }
                        return arrayList3;
                    default:
                        h1b h1bVar = jzb.b;
                        c01 c01Var = this.b;
                        List list4 = (List) c01Var.s.getValue();
                        List list5 = (List) c01Var.t.getValue();
                        h1bVar.getClass();
                        return h1b.K(list4, list5);
                }
            }
        });
        final int i4 = 2;
        this.u = btf.b(new Function0(this) { // from class: zz0
            public final /* synthetic */ c01 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        List<String> list2 = this.b.n;
                        ArrayList arrayList2 = new ArrayList();
                        for (String str4 : list2) {
                            h94.b.getClass();
                            h94 z6 = hs4.z(str4);
                            if (z6 != null) {
                                arrayList2.add(z6);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List list3 = this.b.n;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList3.add(g0);
                            }
                        }
                        return arrayList3;
                    default:
                        h1b h1bVar = jzb.b;
                        c01 c01Var = this.b;
                        List list4 = (List) c01Var.s.getValue();
                        List list5 = (List) c01Var.t.getValue();
                        h1bVar.getClass();
                        return h1b.K(list4, list5);
                }
            }
        });
    }
}
