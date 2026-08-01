package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowParserJSON implements Parcelable.ClassLoaderCreator {
    public static WinterFlowResolverSubsystem WinterFlowRouterStructure(Parcel parcel, ClassLoader classLoader) {
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess;
        if (classLoader == null) {
            classLoader = WinterFlowParserJSON.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowRouterAdapter;
        } else if (readInt == 1) {
            winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowResolverController;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            winterFlowSessionManagerProcess = WinterFlowSessionManagerProcess.WinterFlowMapperProtocol;
        }
        return new WinterFlowResolverSubsystem(readValue, winterFlowSessionManagerProcess);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return WinterFlowRouterStructure(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new WinterFlowResolverSubsystem[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return WinterFlowRouterStructure(parcel, classLoader);
    }
}
