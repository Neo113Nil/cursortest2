package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class qgj extends CoverPath {
    private static final long serialVersionUID = -3475940521092584748L;
    public static final qgj a = new qgj(null);
    public static final Parcelable.Creator<qgj> CREATOR = new pgj(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ru.yandex.music.data.stores.CoverPath
    public final String getPathForSize(int i) {
        return "";
    }

    @Override // ru.yandex.music.data.stores.CoverPath
    public final do6 getType() {
        return do6.a;
    }

    @Override // ru.yandex.music.data.stores.CoverPath
    public final boolean hasCover() {
        return false;
    }

    @Override // ru.yandex.music.data.stores.CoverPath, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
