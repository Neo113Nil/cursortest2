package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class AxiomCoreObserverLoaderSBvIWbAQNPPNTMCcQ263522782433922 implements Parcelable.ClassLoaderCreator {
    public static PhotonFrameBitfieldOverloadingN7SEWrgaBSS6L66a2295407405128657 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = AxiomCoreObserverLoaderSBvIWbAQNPPNTMCcQ263522782433922.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new PhotonFrameBitfieldOverloadingN7SEWrgaBSS6L66a2295407405128657();
        }
        CrimsonRouteChannelValidationQuDzYRQJqthfRn0iSd45744956352241 LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = CrimsonRouteConstructorFloatingPointIaeTsvFlc47iCQvpFo33200709345234.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119();
        for (int i = 0; i < readInt; i++) {
            LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.add(parcel.readValue(classLoader));
        }
        return new PhotonFrameBitfieldOverloadingN7SEWrgaBSS6L66a2295407405128657(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PhotonFrameBitfieldOverloadingN7SEWrgaBSS6L66a2295407405128657[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(parcel, classLoader);
    }
}
