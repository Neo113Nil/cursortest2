package com.squareup.cash.family.familyhub.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface FamilyPendingRequestRowModel {

    public final class Activity implements FamilyPendingRequestRowModel {
        public final UiCallbackModel activityItemUiCallbackModel;

        public Activity(UiCallbackModel uiCallbackModel) {
            this.activityItemUiCallbackModel = uiCallbackModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && this.activityItemUiCallbackModel.equals(((Activity) obj).activityItemUiCallbackModel);
        }

        public final int hashCode() {
            return this.activityItemUiCallbackModel.hashCode();
        }

        public final String toString() {
            return "Activity(activityItemUiCallbackModel=" + this.activityItemUiCallbackModel + ")";
        }
    }

    public final class Loaded implements FamilyPendingRequestRowModel {
        public final StackedAvatarViewModel.Avatar avatar;
        public final String buttonText;
        public final String buttonUrl;
        public final String requesterCustomerToken;
        public final String subtitle;
        public final String title;

        public Loaded(StackedAvatarViewModel.Avatar avatar, String str, String str2, String str3, String str4, String str5) {
            avatar.getClass();
            this.avatar = avatar;
            this.title = str;
            this.subtitle = str2;
            this.buttonText = str3;
            this.buttonUrl = str4;
            this.requesterCustomerToken = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.avatar, loaded.avatar) && Intrinsics.areEqual(this.title, loaded.title) && this.subtitle.equals(loaded.subtitle) && this.buttonText.equals(loaded.buttonText) && this.buttonUrl.equals(loaded.buttonUrl) && Intrinsics.areEqual(this.requesterCustomerToken, loaded.requesterCustomerToken);
        }

        public final int hashCode() {
            int hashCode = this.avatar.hashCode() * 31;
            String str = this.title;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.subtitle), 31, this.buttonText), 31, this.buttonUrl);
            String str2 = this.requesterCustomerToken;
            return m + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(avatar=");
            sb.append(this.avatar);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", buttonText=", this.buttonText, ", buttonUrl=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.buttonUrl, ", requesterCustomerToken=", this.requesterCustomerToken, ")");
        }
    }

    public final class Loading implements FamilyPendingRequestRowModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1457879587;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
