package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595 {
    public static final /* synthetic */ int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = 0;

    static {
        XenoGridSerializationReducerNNoFRPVnNfCuNGxKvH74187146202595.class.getClassLoader();
    }

    public static void AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(MysticCacheBitwiseClassXy5v8026BQuXVZ72LW55346204310625.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339("Parcel data not fully consumed, unread size: ", dataAvail));
        }
    }

    public static Parcelable ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
