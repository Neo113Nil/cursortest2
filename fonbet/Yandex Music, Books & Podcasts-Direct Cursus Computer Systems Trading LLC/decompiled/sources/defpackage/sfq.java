package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class sfq extends l9 {

    @NonNull
    public static final Parcelable.Creator<sfq> CREATOR = new onv(26);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String g;
    public final String h;
    public final g0n i;

    public sfq(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, g0n g0nVar) {
        y1g.G(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = g0nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sfq)) {
            return false;
        }
        sfq sfqVar = (sfq) obj;
        return ldg.s(this.a, sfqVar.a) && ldg.s(this.b, sfqVar.b) && ldg.s(this.c, sfqVar.c) && ldg.s(this.d, sfqVar.d) && ldg.s(this.e, sfqVar.e) && ldg.s(this.f, sfqVar.f) && ldg.s(this.g, sfqVar.g) && ldg.s(this.h, sfqVar.h) && ldg.s(this.i, sfqVar.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.j0(parcel, 1, this.a);
        o8g.j0(parcel, 2, this.b);
        o8g.j0(parcel, 3, this.c);
        o8g.j0(parcel, 4, this.d);
        o8g.i0(parcel, 5, this.e, i);
        o8g.j0(parcel, 6, this.f);
        o8g.j0(parcel, 7, this.g);
        o8g.j0(parcel, 8, this.h);
        o8g.i0(parcel, 9, this.i, i);
        o8g.p0(parcel, o0);
    }
}
