package com.yandex.passport.internal.ui.domik;

import android.os.Parcel;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.hrg;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class d extends e {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new c(0);
    public static final Pattern t = Pattern.compile("@(?:mail\\.)?yandex-team\\.(?:ru|com|com\\.tr|com\\.ua)$", 2);
    public final com.yandex.passport.internal.properties.l a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final com.yandex.passport.internal.l g;
    public final com.yandex.passport.internal.network.response.a h;
    public final List i;
    public final String j;
    public final com.yandex.passport.internal.analytics.a k;
    public final String l;
    public final boolean m;
    public final String n;
    public final String o;
    public final d p;
    public final String q;
    public final b0 r;
    public final boolean s;

    public d(com.yandex.passport.internal.properties.l lVar, String str, String str2, boolean z, String str3, String str4, com.yandex.passport.internal.l lVar2, com.yandex.passport.internal.network.response.a aVar, List list, String str5, com.yandex.passport.internal.analytics.a aVar2, String str6, boolean z2, String str7, String str8, d dVar, String str9, b0 b0Var, boolean z3) {
        lVar.getClass();
        aVar2.getClass();
        b0Var.getClass();
        this.a = lVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = lVar2;
        this.h = aVar;
        this.i = list;
        this.j = str5;
        this.k = aVar2;
        this.l = str6;
        this.m = z2;
        this.n = str7;
        this.o = str8;
        this.p = dVar;
        this.q = str9;
        this.r = b0Var;
        this.s = z3;
    }

    public static d i(d dVar, String str, String str2, String str3, String str4, com.yandex.passport.internal.l lVar, com.yandex.passport.internal.network.response.a aVar, List list, String str5, String str6, String str7, String str8, int i) {
        com.yandex.passport.internal.properties.l lVar2 = dVar.a;
        String str9 = (i & 2) != 0 ? dVar.b : str;
        String str10 = (i & 4) != 0 ? dVar.c : str2;
        boolean z = (i & 8) != 0 ? dVar.d : false;
        String str11 = (i & 16) != 0 ? dVar.e : str3;
        String str12 = (i & 32) != 0 ? dVar.f : str4;
        com.yandex.passport.internal.l lVar3 = (i & 64) != 0 ? dVar.g : lVar;
        com.yandex.passport.internal.network.response.a aVar2 = (i & 128) != 0 ? dVar.h : aVar;
        List list2 = (i & 256) != 0 ? dVar.i : list;
        String str13 = (i & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? dVar.j : str5;
        com.yandex.passport.internal.analytics.a aVar3 = dVar.k;
        String str14 = (i & 2048) != 0 ? dVar.l : str6;
        boolean z2 = (i & 4096) != 0 ? dVar.m : true;
        String str15 = (i & RemoteCameraConfig.Notification.ID) != 0 ? dVar.n : str7;
        String str16 = (i & 16384) != 0 ? dVar.o : str8;
        d dVar2 = dVar.p;
        String str17 = dVar.q;
        b0 b0Var = dVar.r;
        boolean z3 = dVar.s;
        dVar.getClass();
        lVar2.getClass();
        aVar3.getClass();
        b0Var.getClass();
        return new d(lVar2, str9, str10, z, str11, str12, lVar3, aVar2, list2, str13, aVar3, str14, z2, str15, str16, dVar2, str17, b0Var, z3);
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final String d() {
        return this.l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final com.yandex.passport.internal.properties.l e() {
        return this.a;
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final com.yandex.passport.common.core.b f() {
        String str = this.c;
        com.yandex.passport.internal.properties.l lVar = this.a;
        if (str == null) {
            return com.yandex.plus.core.network.api.utils.a.L(lVar.d.a);
        }
        com.yandex.passport.internal.entities.k kVar = lVar.d;
        com.yandex.passport.api.impl.b bVar = kVar.a;
        if (!bVar.e()) {
            bVar = kVar.b;
        }
        com.yandex.passport.common.core.b K = bVar != null ? com.yandex.plus.core.network.api.utils.a.K(bVar) : null;
        return (K == null || !t.matcher(str).find()) ? com.yandex.plus.core.network.api.utils.a.L(lVar.d.a) : K;
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final d h() {
        return this;
    }

    public final d j(String str) {
        return i(this, str, null, null, null, null, null, null, null, null, null, null, 524285);
    }

    @Override // com.yandex.passport.internal.ui.domik.e
    public final String u() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        com.yandex.passport.internal.l lVar = this.g;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i);
        }
        com.yandex.passport.internal.network.response.a aVar = this.h;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        List list = this.i;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator v = hrg.v(parcel, 1, list);
            while (v.hasNext()) {
                parcel.writeString(((com.yandex.passport.internal.network.response.b) v.next()).name());
            }
        }
        parcel.writeString(this.j);
        this.k.writeToParcel(parcel, i);
        parcel.writeString(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        d dVar = this.p;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dVar.writeToParcel(parcel, i);
        }
        parcel.writeString(this.q);
        parcel.writeString(this.r.name());
        parcel.writeInt(this.s ? 1 : 0);
    }
}
