package androidx.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes3.dex */
public class AudioAttributesCompat implements VersionedParcelable {
    public static final /* synthetic */ int $r8$clinit = 0;
    public AudioAttributesImpl mImpl;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.mImpl;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).mImpl;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public final int hashCode() {
        return this.mImpl.hashCode();
    }

    public final String toString() {
        return this.mImpl.toString();
    }
}
