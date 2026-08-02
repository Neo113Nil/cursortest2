package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class coh extends l9 {
    public final MediaInfo a;
    public final bph b;
    public final Boolean c;
    public final long d;
    public final double e;
    public final long[] f;
    public String g;
    public final JSONObject h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final long m;
    public static final msg n = new msg("MediaLoadRequestData", null);

    @NonNull
    public static final Parcelable.Creator<coh> CREATOR = new k5x(0);

    public coh(MediaInfo mediaInfo, bph bphVar, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.a = mediaInfo;
        this.b = bphVar;
        this.c = bool;
        this.d = j;
        this.e = d;
        this.f = jArr;
        this.h = jSONObject;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coh)) {
            return false;
        }
        coh cohVar = (coh) obj;
        return o7f.a(this.h, cohVar.h) && ldg.s(this.a, cohVar.a) && ldg.s(this.b, cohVar.b) && ldg.s(this.c, cohVar.c) && this.d == cohVar.d && this.e == cohVar.e && Arrays.equals(this.f, cohVar.f) && ldg.s(this.i, cohVar.i) && ldg.s(this.j, cohVar.j) && ldg.s(this.k, cohVar.k) && ldg.s(this.l, cohVar.l) && this.m == cohVar.m;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Double.valueOf(this.e), this.f, String.valueOf(this.h), this.i, this.j, this.k, this.l, Long.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.h;
        this.g = jSONObject == null ? null : jSONObject.toString();
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 2, this.a, i);
        o8g.i0(parcel, 3, this.b, i);
        o8g.a0(parcel, 4, this.c);
        o8g.q0(5, 8, parcel);
        parcel.writeLong(this.d);
        o8g.q0(6, 8, parcel);
        parcel.writeDouble(this.e);
        o8g.h0(parcel, 7, this.f);
        o8g.j0(parcel, 8, this.g);
        o8g.j0(parcel, 9, this.i);
        o8g.j0(parcel, 10, this.j);
        o8g.j0(parcel, 11, this.k);
        o8g.j0(parcel, 12, this.l);
        o8g.q0(13, 8, parcel);
        parcel.writeLong(this.m);
        o8g.p0(parcel, o0);
    }
}
