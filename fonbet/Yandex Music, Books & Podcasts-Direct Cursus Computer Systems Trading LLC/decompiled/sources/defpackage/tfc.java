package defpackage;

import android.os.Parcelable;
import ru.yandex.music.data.stores.CoverPath;

/* loaded from: classes5.dex */
public final class tfc extends CoverPath {
    public static final Parcelable.Creator<tfc> CREATOR = new a5c(3);
    private static final long serialVersionUID = 7658715821414089919L;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ru.yandex.music.data.stores.CoverPath
    public final String getPathForSize(int i) {
        return this.mUri;
    }

    @Override // ru.yandex.music.data.stores.CoverPath
    public final do6 getType() {
        return do6.c;
    }
}
