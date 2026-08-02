package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.k5r;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class r implements com.yandex.passport.api.g0, Parcelable {
    public final z1 a;
    public final v b;
    public final y1 c;
    public final Map d;
    public static final q e = new q();

    @NotNull
    public static final Parcelable.Creator<r> CREATOR = new f(6);

    public r(z1 z1Var, v vVar, y1 y1Var, Map map) {
        z1Var.getClass();
        vVar.getClass();
        y1Var.getClass();
        map.getClass();
        this.a = z1Var;
        this.b = vVar;
        this.c = y1Var;
        this.d = map;
    }

    @Override // com.yandex.passport.api.g0
    public final Map d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.a, rVar.a) && Intrinsics.d(this.b, rVar.b) && this.c == rVar.c && Intrinsics.d(this.d, rVar.d);
    }

    @Override // com.yandex.passport.api.g0
    public final v getProgressProperties() {
        return this.b;
    }

    @Override // com.yandex.passport.api.g0
    public final y1 getTheme() {
        return this.c;
    }

    @Override // com.yandex.passport.api.g0
    public final z1 getUid() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassportDeleteAccountPropertiesImpl(uid=");
        sb.append(this.a);
        sb.append(", progressProperties=");
        sb.append(this.b);
        sb.append(", theme=");
        sb.append(this.c);
        sb.append(", headers=");
        return k5r.p(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
        parcel.writeString(this.c.name());
        Iterator s = com.appsflyer.internal.k.s(this.d, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
