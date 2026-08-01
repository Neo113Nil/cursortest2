package com.google.android.datatransport;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionMechanism implements Parcelable.ClassLoaderCreator {
    public static WinterFlowPackageResolver WinterFlowRouterStructure(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = WinterFlowSessionMechanism.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new WinterFlowPackageResolver();
        }
        WinterFlowDataSourceController WinterFlowTransactionManagerStrategy = WinterFlowExceptionComponent.WinterFlowTransactionManagerStrategy.WinterFlowTransactionManagerStrategy();
        for (int i = 0; i < readInt; i++) {
            WinterFlowTransactionManagerStrategy.add(parcel.readValue(classLoader));
        }
        return new WinterFlowPackageResolver(WinterFlowTransactionManagerStrategy.WinterFlowArrayNetwork());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return WinterFlowRouterStructure(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new WinterFlowPackageResolver[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return WinterFlowRouterStructure(parcel, classLoader);
    }
}
