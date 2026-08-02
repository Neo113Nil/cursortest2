package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class jw0 extends l9 {

    @NonNull
    public static final Parcelable.Creator<jw0> CREATOR = new k5x(7);
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;

    public jw0(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = str3;
        this.e = uri;
        this.f = str4;
        this.g = str5;
        this.h = bool;
        this.i = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jw0)) {
            return false;
        }
        jw0 jw0Var = (jw0) obj;
        return d94.d(this.a, jw0Var.a) && d94.d(this.b, jw0Var.b) && d94.d(this.c, jw0Var.c) && d94.d(this.d, jw0Var.d) && d94.d(this.e, jw0Var.e) && d94.d(this.f, jw0Var.f) && d94.d(this.g, jw0Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    public final String toString() {
        List list = this.c;
        int size = list == null ? 0 : list.size();
        String valueOf = String.valueOf(this.e);
        StringBuilder m = f1d.m("applicationId: ", this.a, ", name: ", this.b, ", namespaces.count: ");
        m.append(size);
        m.append(", senderAppIdentifier: ");
        m.append(this.d);
        m.append(", senderAppLaunchUrl: ");
        su4.v(m, valueOf, ", iconUrl: ", this.f, ", type: ");
        m.append(this.g);
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 2, this.a);
        o8g.j0(parcel, 3, this.b);
        o8g.l0(parcel, 5, Collections.unmodifiableList(this.c));
        o8g.j0(parcel, 6, this.d);
        o8g.i0(parcel, 7, this.e, i);
        o8g.j0(parcel, 8, this.f);
        o8g.j0(parcel, 9, this.g);
        o8g.a0(parcel, 10, this.h);
        o8g.a0(parcel, 11, this.i);
        o8g.p0(parcel, o0);
    }
}
