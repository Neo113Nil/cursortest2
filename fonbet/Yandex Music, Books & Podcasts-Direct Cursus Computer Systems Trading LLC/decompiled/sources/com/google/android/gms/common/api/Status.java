package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a8o;
import defpackage.h66;
import defpackage.k2x;
import defpackage.l9;
import defpackage.ldg;
import defpackage.md7;
import defpackage.o8g;
import defpackage.qld;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status extends l9 implements a8o, ReflectedParcelable {
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final h66 d;
    public static final Status e = new Status(0, null, null, null);
    public static final Status f = new Status(14, null, null, null);
    public static final Status g = new Status(8, null, null, null);
    public static final Status h = new Status(15, null, null, null);
    public static final Status i = new Status(16, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new k2x(12);

    public Status(int i2, String str, PendingIntent pendingIntent, h66 h66Var) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = h66Var;
    }

    public final boolean d() {
        return this.a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && ldg.s(this.b, status.b) && ldg.s(this.c, status.c) && ldg.s(this.d, status.d);
    }

    @Override // defpackage.a8o
    public final Status getStatus() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        md7 md7Var = new md7(this);
        String str = this.b;
        if (str == null) {
            str = qld.G(this.a);
        }
        md7Var.a(str, "statusCode");
        md7Var.a(this.c, "resolution");
        return md7Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.q0(1, 4, parcel);
        parcel.writeInt(this.a);
        o8g.j0(parcel, 2, this.b);
        o8g.i0(parcel, 3, this.c, i2);
        o8g.i0(parcel, 4, this.d, i2);
        o8g.p0(parcel, o0);
    }
}
