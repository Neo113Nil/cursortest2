package com.yandex.passport.internal.ui.domik;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.api.w0;
import defpackage.cxb;
import java.util.ArrayList;
import java.util.EnumSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class x implements t {

    @NotNull
    public static final Parcelable.Creator<x> CREATOR = new c(5);
    public final t a;
    public final String b;

    public x(t tVar, String str) {
        tVar.getClass();
        str.getClass();
        this.a = tVar;
        this.b = str;
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final com.yandex.passport.internal.l D() {
        return this.a.D();
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final EnumSet E() {
        ArrayList h0 = CollectionsKt.h0(CollectionsKt.w0(this.a.E()), w.a);
        EnumSet noneOf = EnumSet.noneOf(w.class);
        noneOf.addAll(h0);
        return noneOf;
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final String H() {
        return this.a.H();
    }

    @Override // com.yandex.passport.internal.ui.domik.t
    public final com.yandex.passport.internal.entities.e Y() {
        return this.a.Y();
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
        return this.a.w();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
