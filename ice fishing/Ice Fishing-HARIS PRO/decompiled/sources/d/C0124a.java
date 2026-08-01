package d;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124a implements Parcelable {
    public static final Parcelable.Creator<C0124a> CREATOR = new F0.b(12);

    /* renamed from: a, reason: collision with root package name */
    public final int f2827a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f2828b;

    public C0124a(int i, Intent intent) {
        this.f2827a = i;
        this.f2828b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2827a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2828b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2827a);
        Intent intent = this.f2828b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public C0124a(Parcel parcel) {
        this.f2827a = parcel.readInt();
        this.f2828b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
