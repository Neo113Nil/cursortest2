package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y0;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import defpackage.k5r;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class u implements y0, Parcelable {
    public final z1 a;
    public final y1 b;
    public final String c;
    public final boolean d;
    public final v e;
    public final Map f;
    public static final t g = new t();

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new f(7);

    public u(z1 z1Var, y1 y1Var, String str, boolean z, v vVar, Map map) {
        z1Var.getClass();
        y1Var.getClass();
        vVar.getClass();
        map.getClass();
        this.a = z1Var;
        this.b = y1Var;
        this.c = str;
        this.d = z;
        this.e = vVar;
        this.f = map;
    }

    @Override // com.yandex.passport.api.y0
    public final Map d() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.api.y0
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.a, uVar.a) && this.b == uVar.b && Intrinsics.d(this.c, uVar.c) && this.d == uVar.d && Intrinsics.d(this.e, uVar.e) && Intrinsics.d(this.f, uVar.f);
    }

    @Override // com.yandex.passport.api.y0
    public final boolean f() {
        return this.d;
    }

    @Override // com.yandex.passport.api.y0
    public final v g() {
        return this.e;
    }

    @Override // com.yandex.passport.api.y0
    public final y1 getTheme() {
        return this.b;
    }

    @Override // com.yandex.passport.api.y0
    public final z1 getUid() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + k5r.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PassportLogoutPropertiesImpl(uid=");
        sb.append(this.a);
        sb.append(", theme=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", canLogoutOnDevice=");
        sb.append(this.d);
        sb.append(", progressProperties=");
        sb.append(this.e);
        sb.append(", headers=");
        return k5r.p(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        this.e.writeToParcel(parcel, i);
        Iterator s = com.appsflyer.internal.k.s(this.f, parcel);
        while (s.hasNext()) {
            Map.Entry entry = (Map.Entry) s.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
