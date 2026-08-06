package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class Ux2tdpxXtKdg implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<defpackage.Ux2tdpxXtKdg> CREATOR = new defpackage.K0gkXZrJwRZi(0);
    public final int WDYagTQQm9ns;
    public final android.content.Intent oh71FJcDz6S2;

    public Ux2tdpxXtKdg(android.content.Intent intent, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityResult{resultCode=");
        int i = this.WDYagTQQm9ns;
        sb.append(i != -1 ? i != 0 ? java.lang.String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.oh71FJcDz6S2);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.WDYagTQQm9ns);
        android.content.Intent intent = this.oh71FJcDz6S2;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
