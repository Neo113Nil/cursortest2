package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4455a implements Parcelable {
    public static final Parcelable.Creator<C4455a> CREATOR = new B8.d(28);

    /* renamed from: n, reason: collision with root package name */
    public final int f37078n;

    /* renamed from: u, reason: collision with root package name */
    public final Intent f37079u;

    public C4455a(int i, Intent intent) {
        this.f37078n = i;
        this.f37079u = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f37078n;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f37079u);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeInt(this.f37078n);
        Intent intent = this.f37079u;
        dest.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(dest, i);
        }
    }
}
