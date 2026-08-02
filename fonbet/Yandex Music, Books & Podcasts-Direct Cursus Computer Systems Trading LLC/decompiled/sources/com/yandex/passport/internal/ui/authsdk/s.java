package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class s extends p {
    public static final Parcelable.Creator<s> CREATOR = new r(0);
    public final com.yandex.passport.common.core.f a;

    public s(Parcel parcel) {
        super(parcel);
        this.a = (com.yandex.passport.common.core.f) parcel.readParcelable(com.yandex.passport.common.core.f.class.getClassLoader());
    }

    @Override // com.yandex.passport.internal.ui.authsdk.p
    public final p a(k kVar) {
        com.yandex.passport.internal.core.accounts.e eVar = kVar.s;
        com.yandex.passport.common.core.f fVar = this.a;
        if (fVar == null) {
            ArrayList g = eVar.a().g();
            if (g.size() == 1) {
                return new t((com.yandex.passport.internal.l) g.get(0));
            }
            kVar.P();
            return new b0(fVar, false);
        }
        kVar.q.m(new j(0, null));
        com.yandex.passport.internal.l e = eVar.a().e(fVar);
        if (e != null) {
            return new t(e);
        }
        kVar.P();
        return new b0(null, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public s(com.yandex.passport.common.core.f fVar) {
        this.a = fVar;
    }
}
