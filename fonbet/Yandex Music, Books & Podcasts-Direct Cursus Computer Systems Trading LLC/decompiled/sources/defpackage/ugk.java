package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public enum ugk implements Parcelable {
    PRODUCTION(false),
    TESTING(true),
    /* JADX INFO: Fake field, exist only in values array */
    CROWDTESTING(true),
    /* JADX INFO: Fake field, exist only in values array */
    MIMINOTESTING(false),
    /* JADX INFO: Fake field, exist only in values array */
    LOCALTESTING(true);


    @NotNull
    public static final Parcelable.Creator<ugk> CREATOR = new tgk(0);
    public final boolean a;

    ugk(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
