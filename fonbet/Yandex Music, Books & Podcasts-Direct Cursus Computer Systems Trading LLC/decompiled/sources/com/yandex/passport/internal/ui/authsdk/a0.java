package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.analytics.o0;
import defpackage.xy0;

/* loaded from: classes4.dex */
public final class a0 extends p {
    public static final Parcelable.Creator<a0> CREATOR = new r(4);
    public final com.yandex.passport.internal.network.response.g a;
    public final com.yandex.passport.internal.l b;

    public a0(Parcel parcel) {
        super(parcel);
        this.a = (com.yandex.passport.internal.network.response.g) parcel.readParcelable(com.yandex.passport.internal.network.response.g.class.getClassLoader());
        com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) parcel.readParcelable(com.yandex.passport.internal.b.class.getClassLoader());
        lVar.getClass();
        this.b = lVar;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.p
    public final com.yandex.passport.internal.l D() {
        return this.b;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.p
    public final p a(k kVar) {
        l lVar = kVar.y;
        com.yandex.passport.internal.network.response.g gVar = this.a;
        boolean z = gVar.e;
        com.yandex.passport.internal.l lVar2 = this.b;
        if (!z && !lVar.e) {
            return new u(gVar, lVar2);
        }
        kVar.q.m(new i(gVar, lVar2, 0));
        o0 o0Var = kVar.w;
        String str = lVar.a;
        o0Var.getClass();
        str.getClass();
        xy0 xy0Var = new xy0(0);
        xy0Var.put("reporter", str);
        o0Var.a.b(com.yandex.passport.internal.analytics.q.e, xy0Var);
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public a0(com.yandex.passport.internal.network.response.g gVar, com.yandex.passport.internal.l lVar) {
        this.a = gVar;
        this.b = lVar;
    }
}
