package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class zjm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<zjm> CREATOR = new s2m(4);
    public final List a;
    public final boolean b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public zjm(List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = z;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: yjm
            public final /* synthetic */ zjm b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        List<String> list2 = this.b.a;
                        ArrayList arrayList = new ArrayList();
                        for (String str : list2) {
                            h94.b.getClass();
                            h94 z2 = hs4.z(str);
                            if (z2 != null) {
                                arrayList.add(z2);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = this.b.a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        zjm zjmVar = this.b;
                        List list4 = (List) zjmVar.c.getValue();
                        List list5 = (List) zjmVar.d.getValue();
                        h1bVar.getClass();
                        return h1b.K(list4, list5);
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: yjm
            public final /* synthetic */ zjm b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        List<String> list2 = this.b.a;
                        ArrayList arrayList = new ArrayList();
                        for (String str : list2) {
                            h94.b.getClass();
                            h94 z2 = hs4.z(str);
                            if (z2 != null) {
                                arrayList.add(z2);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = this.b.a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        zjm zjmVar = this.b;
                        List list4 = (List) zjmVar.c.getValue();
                        List list5 = (List) zjmVar.d.getValue();
                        h1bVar.getClass();
                        return h1b.K(list4, list5);
                }
            }
        });
        final int i3 = 2;
        this.e = btf.b(new Function0(this) { // from class: yjm
            public final /* synthetic */ zjm b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        List<String> list2 = this.b.a;
                        ArrayList arrayList = new ArrayList();
                        for (String str : list2) {
                            h94.b.getClass();
                            h94 z2 = hs4.z(str);
                            if (z2 != null) {
                                arrayList.add(z2);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = this.b.a;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            hs5 g0 = wdp.g0((String) it.next());
                            if (g0 != null) {
                                arrayList2.add(g0);
                            }
                        }
                        return arrayList2;
                    default:
                        h1b h1bVar = jzb.b;
                        zjm zjmVar = this.b;
                        List list4 = (List) zjmVar.c.getValue();
                        List list5 = (List) zjmVar.d.getValue();
                        h1bVar.getClass();
                        return h1b.K(list4, list5);
                }
            }
        });
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjm)) {
            return false;
        }
        zjm zjmVar = (zjm) obj;
        return Intrinsics.d(this.a, zjmVar.a) && this.b == zjmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PreSaveContentRestrictions(disclaimersRaw=" + this.a + ", available=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeStringList(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
