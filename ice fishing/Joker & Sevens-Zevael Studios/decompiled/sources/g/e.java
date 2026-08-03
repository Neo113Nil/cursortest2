package g;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new e7.c(4);

    /* renamed from: g, reason: collision with root package name */
    public final IntentSender f2407g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f2408h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2409i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2410j;

    public e(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f2407g = intentSender;
        this.f2408h = intent;
        this.f2409i = i10;
        this.f2410j = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        j.e(parcel, "dest");
        parcel.writeParcelable(this.f2407g, i10);
        parcel.writeParcelable(this.f2408h, i10);
        parcel.writeInt(this.f2409i);
        parcel.writeInt(this.f2410j);
    }
}
