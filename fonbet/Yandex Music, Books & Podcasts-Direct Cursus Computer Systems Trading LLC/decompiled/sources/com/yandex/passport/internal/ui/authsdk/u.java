package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class u extends p {
    public static final Parcelable.Creator<u> CREATOR = new r(2);
    public final com.yandex.passport.internal.network.response.g a;
    public final com.yandex.passport.internal.l b;

    public u(Parcel parcel) {
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
        com.yandex.passport.internal.network.response.g gVar = this.a;
        com.yandex.passport.internal.l lVar = this.b;
        try {
            com.yandex.passport.internal.network.client.g L = kVar.L();
            l lVar2 = kVar.y;
            com.yandex.passport.internal.network.response.h a = L.a(lVar.d, gVar.a);
            String str = a.a;
            com.yandex.passport.internal.entities.l f = (lVar2.i == null || str == null) ? null : kVar.L().f(str);
            com.yandex.passport.common.core.f fVar = lVar.b;
            String str2 = lVar2.a;
            ArrayList arrayList = gVar.f;
            ArrayList arrayList2 = gVar.g;
            fVar.getClass();
            str2.getClass();
            return new v(new m(a, fVar, str2, f, new ArrayList(CollectionsKt.w0(CollectionsKt.z0(CollectionsKt.g0(com.yandex.plus.core.network.api.utils.a.k(arrayList), com.yandex.plus.core.network.api.utils.a.k(arrayList2)))))));
        } catch (Exception e) {
            kVar.N(e, lVar);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public u(com.yandex.passport.internal.network.response.g gVar, com.yandex.passport.internal.l lVar) {
        this.a = gVar;
        this.b = lVar;
    }
}
