package com.yandex.plus.home.repository.api.model.webconfig;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.k5r;
import defpackage.su4;
import defpackage.u7g;
import defpackage.vhp;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class u implements Parcelable {
    public static final arf[] d;
    public final String a;
    public final Set b;
    public final Map c;

    @NotNull
    public static final t Companion = new t();

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new com.yandex.plus.home.repository.api.model.panel.c(23);

    static {
        bwf bwfVar = bwf.b;
        d = new arf[]{null, btf.a(bwfVar, new q(3)), btf.a(bwfVar, new q(4))};
    }

    public /* synthetic */ u(int i, String str, Set set, Map map) {
        if (7 != (i & 7)) {
            u7g.V(i, 7, s.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
        this.c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.a, uVar.a) && Intrinsics.d(this.b, uVar.b) && Intrinsics.d(this.c, uVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + su4.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AcquisitionParams(page=");
        sb.append(this.a);
        sb.append(", places=");
        sb.append(this.b);
        sb.append(", restrictions=");
        return k5r.p(sb, this.c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Set set = this.b;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString((String) it.next());
        }
        Iterator s = com.appsflyer.internal.k.s(this.c, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public u(String str, Set set, Map map) {
        str.getClass();
        set.getClass();
        this.a = str;
        this.b = set;
        this.c = map;
    }
}
