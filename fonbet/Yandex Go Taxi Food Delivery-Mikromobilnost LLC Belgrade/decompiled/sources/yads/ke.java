package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.qd81;
import defpackage.rf71;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ke extends g11 {
    public static final Parcelable.Creator<ke> CREATOR = new je();
    public final String c;
    public final String d;
    public final int e;
    public final byte[] f;

    public ke(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = rf71.a;
        this.c = readString;
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.createByteArray();
    }

    @Override // yads.g11, yads.bs1
    public final void a(a291 a291Var) {
        byte[] bArr = this.f;
        int i = this.e;
        if (a291Var.j != null) {
            Integer valueOf = Integer.valueOf(i);
            int i2 = rf71.a;
            if (!valueOf.equals(3) && rf71.o(a291Var.k, 3)) {
                return;
            }
        }
        a291Var.j = (byte[]) bArr.clone();
        a291Var.k = Integer.valueOf(i);
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ke.class == obj.getClass()) {
            ke keVar = (ke) obj;
            if (this.e == keVar.e && rf71.o(this.c, keVar.c) && rf71.o(this.d, keVar.d) && Arrays.equals(this.f, keVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.e + 527) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        return Arrays.hashCode(this.f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // yads.g11
    public final String toString() {
        return this.b + ": mimeType=" + this.c + ", description=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeByteArray(this.f);
    }

    public ke(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = bArr;
    }

    @Override // yads.g11, yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }
}
