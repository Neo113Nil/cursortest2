package com.squareup.cash.investing.viewmodels.categories;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.investing.viewmodels.search.FilterGroupCarousel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$ImageWithBackground;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class InvestingCategoryDetailViewModel {

    public final class Content extends InvestingCategoryDetailViewModel {
        public final String categoryDescription;
        public final InvestingCryptoAvatarContentModel$ImageWithBackground categoryImage;
        public final String categoryName;
        public final FilterGroupCarousel filterGroupCarousel;
        public final List searchResult;

        public Content(InvestingCryptoAvatarContentModel$ImageWithBackground investingCryptoAvatarContentModel$ImageWithBackground, String str, String str2, FilterGroupCarousel filterGroupCarousel, List list) {
            str.getClass();
            str2.getClass();
            filterGroupCarousel.getClass();
            list.getClass();
            this.categoryImage = investingCryptoAvatarContentModel$ImageWithBackground;
            this.categoryName = str;
            this.categoryDescription = str2;
            this.filterGroupCarousel = filterGroupCarousel;
            this.searchResult = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.categoryImage.equals(content.categoryImage) && Intrinsics.areEqual(this.categoryName, content.categoryName) && Intrinsics.areEqual(this.categoryDescription, content.categoryDescription) && Intrinsics.areEqual(this.filterGroupCarousel, content.filterGroupCarousel) && Intrinsics.areEqual(this.searchResult, content.searchResult);
        }

        public final int hashCode() {
            return this.searchResult.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.categoryImage.hashCode() * 31, 31, this.categoryName), 31, this.categoryDescription), 31, this.filterGroupCarousel.filterGroups);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(categoryImage=");
            sb.append(this.categoryImage);
            sb.append(", categoryName=");
            sb.append(this.categoryName);
            sb.append(", categoryDescription=");
            sb.append(this.categoryDescription);
            sb.append(", filterGroupCarousel=");
            sb.append(this.filterGroupCarousel);
            sb.append(", searchResult=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.searchResult, ")");
        }
    }

    public final class Loading extends InvestingCategoryDetailViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -228366532;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
