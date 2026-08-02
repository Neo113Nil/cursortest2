package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public final class jcv extends CoverPath {
    public static final Parcelable.Creator<jcv> CREATOR = new b3s(24);
    private static final long serialVersionUID = 4368484103839935344L;
    public final WebPath$Storage a;

    public jcv(Parcel parcel) {
        super(parcel);
        this.a = WebPath$Storage.values()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ru.yandex.music.data.stores.CoverPath
    public final String getPathForSize(int i) {
        float f = i;
        String pathForSize = this.a.pathForSize(this.mUri, (int) (hyf.x((1900.0f - f) / 1800.0f, 0.5f, 1.0f) * f));
        return (pathForSize.startsWith("https://") || pathForSize.startsWith("http://")) ? pathForSize : "https://".concat(pathForSize);
    }

    @Override // ru.yandex.music.data.stores.CoverPath
    public final do6 getType() {
        return do6.b;
    }

    @Override // ru.yandex.music.data.stores.CoverPath, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a.ordinal());
    }

    public jcv(String str, WebPath$Storage webPath$Storage) {
        super(str);
        this.a = webPath$Storage;
    }
}
