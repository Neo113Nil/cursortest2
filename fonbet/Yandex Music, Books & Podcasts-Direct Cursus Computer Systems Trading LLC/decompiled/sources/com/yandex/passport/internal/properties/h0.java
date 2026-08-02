package com.yandex.passport.internal.properties;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import java.util.List;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class h0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h0> CREATOR = new f(16);
    public final y1 a;
    public final com.yandex.passport.api.impl.b b;
    public final z1 c;
    public final String d;
    public final String e;
    public final List f;

    public h0(y1 y1Var, com.yandex.passport.api.impl.b bVar, z1 z1Var, String str, String str2, List list) {
        y1Var.getClass();
        bVar.getClass();
        z1Var.getClass();
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = y1Var;
        this.b = bVar;
        this.c = z1Var;
        this.d = str;
        this.e = str2;
        this.f = list;
    }

    public final String d() {
        String str = this.e;
        str.getClass();
        return new Regex("^https://").replace(str, "yandexta://");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeParcelable(this.b, i);
        this.c.writeToParcel(parcel, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
    }
}
