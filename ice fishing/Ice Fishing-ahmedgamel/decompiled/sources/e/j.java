package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new B8.d(29);

    /* renamed from: n, reason: collision with root package name */
    public final IntentSender f37206n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f37207u;

    /* renamed from: v, reason: collision with root package name */
    public final int f37208v;

    /* renamed from: w, reason: collision with root package name */
    public final int f37209w;

    public j(IntentSender intentSender, Intent intent, int i, int i4) {
        this.f37206n = intentSender;
        this.f37207u = intent;
        this.f37208v = i;
        this.f37209w = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeParcelable(this.f37206n, i);
        dest.writeParcelable(this.f37207u, i);
        dest.writeInt(this.f37208v);
        dest.writeInt(this.f37209w);
    }
}
