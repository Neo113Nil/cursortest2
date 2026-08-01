package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new B8.d(29);

    /* renamed from: n, reason: collision with root package name */
    public final IntentSender f37098n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f37099u;

    /* renamed from: v, reason: collision with root package name */
    public final int f37100v;

    /* renamed from: w, reason: collision with root package name */
    public final int f37101w;

    public j(IntentSender intentSender, Intent intent, int i, int i6) {
        this.f37098n = intentSender;
        this.f37099u = intent;
        this.f37100v = i;
        this.f37101w = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeParcelable(this.f37098n, i);
        dest.writeParcelable(this.f37099u, i);
        dest.writeInt(this.f37100v);
        dest.writeInt(this.f37101w);
    }
}
