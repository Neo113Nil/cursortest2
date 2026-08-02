package com.squareup.cash.graphics.swampgl.components.ibl;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class IblAssetData {
    public final ArrayList mipLevels;
    public final String name;

    public IblAssetData(String str, ArrayList arrayList) {
        this.name = str;
        this.mipLevels = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IblAssetData)) {
            return false;
        }
        IblAssetData iblAssetData = (IblAssetData) obj;
        return this.name.equals(iblAssetData.name) && this.mipLevels.equals(iblAssetData.mipLevels);
    }

    public final int hashCode() {
        return this.mipLevels.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.mipLevels, "IblAssetData(name=", this.name, ", mipLevels=", ")");
    }
}
