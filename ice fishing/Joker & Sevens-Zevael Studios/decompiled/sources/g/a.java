package g;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new e7.c(3);

    /* renamed from: g, reason: collision with root package name */
    public final int f2400g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f2401h;

    public a(int i10, Intent intent) {
        this.f2400g = i10;
        this.f2401h = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i10 = this.f2400g;
        sb.append(i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2401h);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j.e(parcel, "dest");
        parcel.writeInt(this.f2400g);
        Intent intent = this.f2401h;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
