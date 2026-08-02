package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.d94;
import defpackage.e0x;
import defpackage.f1d;
import defpackage.jsg;
import defpackage.l9;
import defpackage.o8g;
import defpackage.oex;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class CastDevice extends l9 implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CastDevice> CREATOR = new oex(25);
    public final String a;
    public final String b;
    public final InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    public final jsg i;
    public final int j;
    public final String k;
    public final String l;
    public final int m;
    public final String n;
    public final byte[] o;
    public final String p;
    public final boolean q;
    public final e0x r;
    public final Integer s;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, ArrayList arrayList, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, e0x e0xVar, Integer num) {
        this.a = str == null ? "" : str;
        str2 = str2 == null ? "" : str2;
        this.b = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.c = InetAddress.getByName(str2);
            } catch (UnknownHostException e) {
                Log.i("CastDevice", "Unable to convert host address (" + this.b + ") to ipaddress: " + e.getMessage());
            }
        }
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = str5 == null ? "" : str5;
        this.g = i;
        this.h = arrayList == null ? new ArrayList() : arrayList;
        this.j = i3;
        this.k = str6 == null ? "" : str6;
        this.l = str7;
        this.m = i4;
        this.n = str8;
        this.o = bArr;
        this.p = str9;
        this.q = z;
        this.r = e0xVar;
        this.s = num;
        this.i = new jsg(i2, 20);
    }

    public static CastDevice e(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    public final String d() {
        String str = this.a;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    public final boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        byte[] bArr = castDevice.o;
        int i2 = castDevice.g;
        String str = castDevice.f;
        if (!d94.d(this.a, castDevice.a) || !d94.d(this.c, castDevice.c) || !d94.d(this.e, castDevice.e) || !d94.d(this.d, castDevice.d)) {
            return false;
        }
        String str2 = this.f;
        if (!d94.d(str2, str) || (i = this.g) != i2 || !d94.d(this.h, castDevice.h) || this.i.b != castDevice.i.b || this.j != castDevice.j || !d94.d(this.k, castDevice.k) || !d94.d(Integer.valueOf(this.m), Integer.valueOf(castDevice.m)) || !d94.d(this.n, castDevice.n) || !d94.d(this.l, castDevice.l) || !d94.d(str2, str) || i != i2) {
            return false;
        }
        byte[] bArr2 = this.o;
        return ((bArr2 == null && bArr == null) || Arrays.equals(bArr2, bArr)) && d94.d(this.p, castDevice.p) && this.q == castDevice.q && d94.d(f(), castDevice.f());
    }

    public final e0x f() {
        e0x e0xVar = this.r;
        if (e0xVar != null) {
            return e0xVar;
        }
        jsg jsgVar = this.i;
        return (jsgVar.q() || jsgVar.p(128)) ? new e0x(1, false, false, null, null, null, null, null, false) : e0xVar;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        jsg jsgVar = this.i;
        String str = jsgVar.p(64) ? "[dynamic group]" : jsgVar.q() ? "[static group]" : (jsgVar.q() || jsgVar.p(128)) ? "[speaker pair]" : "";
        if (jsgVar.p(SQLiteDatabase.OPEN_PRIVATECACHE)) {
            str = str.concat("[cast connect]");
        }
        Locale locale = Locale.ROOT;
        String str2 = this.d;
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            str2 = length <= 2 ? length == 2 ? "xx" : "x" : String.format(locale, "%c%d%c", Character.valueOf(str2.charAt(0)), Integer.valueOf(length - 2), Character.valueOf(str2.charAt(length - 1)));
        }
        StringBuilder m = f1d.m("\"", str2, "\" (", this.a, ") ");
        m.append(str);
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.j0(parcel, 4, this.d);
        o8g.j0(parcel, 5, this.e);
        o8g.j0(parcel, 6, this.f);
        o8g.q0(7, 4, parcel);
        parcel.writeInt(this.g);
        o8g.n0(parcel, 8, Collections.unmodifiableList(this.h));
        int i2 = this.i.b;
        o8g.q0(9, 4, parcel);
        parcel.writeInt(i2);
        o8g.q0(10, 4, parcel);
        parcel.writeInt(this.j);
        o8g.j0(parcel, 11, this.k);
        o8g.j0(parcel, 12, this.l);
        o8g.q0(13, 4, parcel);
        parcel.writeInt(this.m);
        o8g.j0(parcel, 14, this.n);
        o8g.c0(parcel, 15, this.o);
        o8g.j0(parcel, 16, this.p);
        o8g.q0(17, 4, parcel);
        parcel.writeInt(this.q ? 1 : 0);
        o8g.i0(parcel, 18, f(), i);
        o8g.g0(parcel, 19, this.s);
        o8g.p0(parcel, o0);
    }
}
