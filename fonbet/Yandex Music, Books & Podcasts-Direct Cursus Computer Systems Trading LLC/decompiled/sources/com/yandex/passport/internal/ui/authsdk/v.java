package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.xq0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class v extends p {

    @NotNull
    public static final Parcelable.Creator<v> CREATOR = new r(3);
    public final m a;

    public v(m mVar) {
        mVar.getClass();
        this.a = mVar;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.p
    public final p a(k kVar) {
        com.yandex.passport.internal.d a = kVar.s.a();
        m mVar = this.a;
        com.yandex.passport.internal.l e = a.e(mVar.b);
        if (e == null) {
            xq0.q("Token result received, but no account for given uid!");
            return null;
        }
        kVar.w.c(e, true);
        kVar.q.m(new j(1, mVar));
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
    }
}
