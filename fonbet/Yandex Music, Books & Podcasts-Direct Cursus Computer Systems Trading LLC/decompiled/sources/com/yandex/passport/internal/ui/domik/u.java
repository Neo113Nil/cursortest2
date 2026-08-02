package com.yandex.passport.internal.ui.domik;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.w0;
import defpackage.cxb;
import java.util.EnumSet;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class u implements Parcelable, t {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new c(4);
    public final com.yandex.passport.internal.l a;
    public final com.yandex.passport.internal.entities.e b;
    public final w0 c;
    public final String d;
    public final EnumSet e;

    public u(com.yandex.passport.internal.l lVar, com.yandex.passport.internal.entities.e eVar, w0 w0Var, String str, EnumSet enumSet) {
        lVar.getClass();
        w0Var.getClass();
        enumSet.getClass();
        this.a = lVar;
        this.b = eVar;
        this.c = w0Var;
        this.d = str;
        this.e = enumSet;
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final com.yandex.passport.internal.l D() {
        return this.a;
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final EnumSet E() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final String H() {
        return this.d;
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final com.yandex.passport.internal.entities.e Y() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final Bundle t() {
        return cxb.K(new Pair("domik-result", this));
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final w0 w() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        com.yandex.passport.internal.l lVar = this.a;
        lVar.getClass();
        parcel.getClass();
        parcel.writeBundle(cxb.K(new Pair("master-account", lVar)));
        com.yandex.passport.internal.entities.e eVar = this.b;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c.name());
        String str = this.d;
        if (str == null) {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.e);
    }
}
