package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class kpo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<kpo> CREATOR = new z8o(21);
    public final jpo a;
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;

    public kpo(jpo jpoVar, String str, String str2, long j, String str3, String str4, String str5) {
        jpoVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = jpoVar;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final boolean d() {
        return this.a == jpo.SmsChallenge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpo)) {
            return false;
        }
        kpo kpoVar = (kpo) obj;
        return this.a == kpoVar.a && Intrinsics.d(this.b, kpoVar.b) && Intrinsics.d(this.c, kpoVar.c) && this.d == kpoVar.d && Intrinsics.d(this.e, kpoVar.e) && Intrinsics.d(this.f, kpoVar.f) && Intrinsics.d(this.g, kpoVar.g);
    }

    public final int hashCode() {
        int c = k5r.c(tlm.c(this.d, k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        String str = this.f;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SbpChallengeInfo(method=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", verificationId=");
        sb.append(this.c);
        sb.append(", denyResendUntil=");
        sb.append(this.d);
        su4.v(sb, ", currency=", this.e, ", format=", this.f);
        return vz1.s(sb, ", maskedPhone=", this.g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }
}
