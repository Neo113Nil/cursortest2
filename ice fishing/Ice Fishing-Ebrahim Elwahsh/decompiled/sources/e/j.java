package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new F0.a(27);

    /* renamed from: n, reason: collision with root package name */
    public final IntentSender f37229n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f37230u;

    /* renamed from: v, reason: collision with root package name */
    public final int f37231v;

    /* renamed from: w, reason: collision with root package name */
    public final int f37232w;

    public j(IntentSender intentSender, Intent intent, int i, int i4) {
        this.f37229n = intentSender;
        this.f37230u = intent;
        this.f37231v = i;
        this.f37232w = i4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeParcelable(this.f37229n, i);
        dest.writeParcelable(this.f37230u, i);
        dest.writeInt(this.f37231v);
        dest.writeInt(this.f37232w);
    }
}
