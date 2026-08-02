package com.yandex.plus.home.repository.api.model.panel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f1d;
import defpackage.k5r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new c(3);
    public final String a;
    public final com.yandex.plus.core.data.common.v b;
    public final com.yandex.plus.core.data.common.v c;
    public final List d;
    public final List e;
    public final com.yandex.plus.core.data.common.v f;
    public final double g;
    public final com.yandex.plus.core.data.common.v h;

    public h(String str, com.yandex.plus.core.data.common.v vVar, com.yandex.plus.core.data.common.v vVar2, List list, List list2, com.yandex.plus.core.data.common.v vVar3, double d, com.yandex.plus.core.data.common.v vVar4) {
        str.getClass();
        vVar.getClass();
        vVar2.getClass();
        list.getClass();
        list2.getClass();
        vVar3.getClass();
        vVar4.getClass();
        this.a = str;
        this.b = vVar;
        this.c = vVar2;
        this.d = list;
        this.e = list2;
        this.f = vVar3;
        this.g = d;
        this.h = vVar4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.a, hVar.a) && Intrinsics.d(this.b, hVar.b) && Intrinsics.d(this.c, hVar.c) && Intrinsics.d(this.d, hVar.d) && Intrinsics.d(this.e, hVar.e) && Intrinsics.d(this.f, hVar.f) && Double.compare(this.g, hVar.g) == 0 && Intrinsics.d(this.h, hVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + k5r.b(this.g, com.appsflyer.internal.k.f(this.f, k5r.d(k5r.d(com.appsflyer.internal.k.f(this.c, com.appsflyer.internal.k.f(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        return "GiftProgress(scoreText=" + this.a + ", scoreFilledTextColor=" + this.b + ", scoreUnfilledTextColor=" + this.c + ", scoreStyledTexts=" + this.d + ", scoreTextIcons=" + this.e + ", backgroundColor=" + this.f + ", progressPercent=" + this.g + ", progressColor=" + this.h + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        Iterator n = f1d.n(parcel, this.d);
        while (n.hasNext()) {
            ((e0) n.next()).writeToParcel(parcel, i);
        }
        Iterator n2 = f1d.n(parcel, this.e);
        while (n2.hasNext()) {
            ((f0) n2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.f, i);
        parcel.writeDouble(this.g);
        parcel.writeParcelable(this.h, i);
    }
}
