package app.cash.local.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.local.primitives.BrandToken;
import app.cash.local.viewmodels.internal.CanWorkAsync;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalAddBrandsViewModel implements CanWorkAsync {
    public final ArrayList brandCards;
    public final boolean isWorkingAsync;
    public final String title;

    public final class BrandCard {
        public final LocalColor backgroundColor;
        public final String brandToken;
        public final String clientRoute;
        public final LocalColor foregroundColor;
        public final LocalImage image;
        public final boolean isSelected;
        public final String name;

        public BrandCard(String str, String str2, LocalImage localImage, LocalColor localColor, LocalColor localColor2, String str3, boolean z) {
            str.getClass();
            str2.getClass();
            this.brandToken = str;
            this.name = str2;
            this.image = localImage;
            this.foregroundColor = localColor;
            this.backgroundColor = localColor2;
            this.clientRoute = str3;
            this.isSelected = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandCard)) {
                return false;
            }
            BrandCard brandCard = (BrandCard) obj;
            return Intrinsics.areEqual(this.brandToken, brandCard.brandToken) && Intrinsics.areEqual(this.name, brandCard.name) && Intrinsics.areEqual(this.image, brandCard.image) && Intrinsics.areEqual(this.foregroundColor, brandCard.foregroundColor) && Intrinsics.areEqual(this.backgroundColor, brandCard.backgroundColor) && Intrinsics.areEqual(this.clientRoute, brandCard.clientRoute) && this.isSelected == brandCard.isSelected;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.brandToken.hashCode() * 31, 31, this.name);
            LocalImage localImage = this.image;
            int hashCode = (m + (localImage == null ? 0 : localImage.hashCode())) * 31;
            LocalColor localColor = this.foregroundColor;
            int hashCode2 = (hashCode + (localColor == null ? 0 : localColor.hashCode())) * 31;
            LocalColor localColor2 = this.backgroundColor;
            int hashCode3 = (hashCode2 + (localColor2 == null ? 0 : localColor2.hashCode())) * 31;
            String str = this.clientRoute;
            return Boolean.hashCode(this.isSelected) + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BrandCard(brandToken=", BrandToken.m1229toStringimpl(this.brandToken), ", name=", this.name, ", image=");
            m.append(this.image);
            m.append(", foregroundColor=");
            m.append(this.foregroundColor);
            m.append(", backgroundColor=");
            m.append(this.backgroundColor);
            m.append(", clientRoute=");
            m.append(this.clientRoute);
            m.append(", isSelected=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isSelected, ")");
        }
    }

    public LocalAddBrandsViewModel(String str, ArrayList arrayList, boolean z) {
        this.title = str;
        this.brandCards = arrayList;
        this.isWorkingAsync = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalAddBrandsViewModel)) {
            return false;
        }
        LocalAddBrandsViewModel localAddBrandsViewModel = (LocalAddBrandsViewModel) obj;
        return Intrinsics.areEqual(this.title, localAddBrandsViewModel.title) && this.brandCards.equals(localAddBrandsViewModel.brandCards) && this.isWorkingAsync == localAddBrandsViewModel.isWorkingAsync;
    }

    public final int hashCode() {
        String str = this.title;
        return Boolean.hashCode(this.isWorkingAsync) + CameraState$Type$EnumUnboxingLocalUtility.m(this.brandCards, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    @Override // app.cash.local.viewmodels.internal.CanWorkAsync
    public final boolean isWorkingAsync() {
        return this.isWorkingAsync;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.brandCards, "LocalAddBrandsViewModel(title=", this.title, ", brandCards=", ", isWorkingAsync="), this.isWorkingAsync, ")");
    }
}
