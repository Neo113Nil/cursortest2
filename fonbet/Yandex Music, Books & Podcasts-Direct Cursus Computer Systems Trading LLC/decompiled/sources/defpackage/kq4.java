package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class kq4 extends l9 {

    @NonNull
    public static final Parcelable.Creator<kq4> CREATOR = new vzw(3);
    public final Intent a;

    public kq4(Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int o0 = o8g.o0(parcel, 20293);
        o8g.i0(parcel, 1, this.a, i);
        o8g.p0(parcel, o0);
    }
}
