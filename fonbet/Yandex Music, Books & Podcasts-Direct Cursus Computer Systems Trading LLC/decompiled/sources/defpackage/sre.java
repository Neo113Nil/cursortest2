package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class sre implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<sre> CREATOR = new a5c(27);
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    public sre(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.a = intentSender;
        this.b = intent;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
