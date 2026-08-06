package defpackage;

/* loaded from: classes.dex */
public final class Q1EpAU06IV implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.Q1EpAU06IV> CREATOR = new defpackage.nMM9nLv63p(0);
    public final int adDC3e2L;
    public final android.content.Intent xiZrDbcSW0;

    public Q1EpAU06IV(android.content.Intent intent, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityResult{resultCode=");
        int i = this.adDC3e2L;
        sb.append(i != -1 ? i != 0 ? java.lang.String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.xiZrDbcSW0);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.adDC3e2L);
        android.content.Intent intent = this.xiZrDbcSW0;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
