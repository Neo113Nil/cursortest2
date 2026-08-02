package app.cash.local.viewmodels.wallet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalHomeViewModel$TabContent$Widget$Portfolio$Followed implements LocalHomeViewModel.TabContent.Widget {
    public final List brands;

    public LocalHomeViewModel$TabContent$Widget$Portfolio$Followed(List list) {
        list.getClass();
        this.brands = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalHomeViewModel$TabContent$Widget$Portfolio$Followed) && Intrinsics.areEqual(this.brands, ((LocalHomeViewModel$TabContent$Widget$Portfolio$Followed) obj).brands);
    }

    public final int hashCode() {
        return this.brands.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("Followed(brands=", ")", this.brands);
    }
}
