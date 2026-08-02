package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o0n implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    o0n EF5;
    public static final /* synthetic */ o0n[] a = {new o0n("PUBLIC_KEY", 0)};

    @NonNull
    public static final Parcelable.Creator<o0n> CREATOR = new vzw(27);

    public static o0n a(String str) {
        for (o0n o0nVar : values()) {
            o0nVar.getClass();
            if (str.equals("public-key")) {
                return o0nVar;
            }
        }
        throw new n0n(hrg.q("PublicKeyCredentialType ", str, " not supported"));
    }

    @NonNull
    public static o0n valueOf(@NonNull String str) {
        return (o0n) Enum.valueOf(o0n.class, str);
    }

    @NonNull
    public static o0n[] values() {
        return (o0n[]) a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString("public-key");
    }
}
