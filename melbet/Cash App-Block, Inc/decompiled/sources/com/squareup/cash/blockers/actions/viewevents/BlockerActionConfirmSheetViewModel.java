package com.squareup.cash.blockers.actions.viewevents;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class BlockerActionConfirmSheetViewModel {

    public final class LoadingSubmit extends BlockerActionConfirmSheetViewModel {
        public static final LoadingSubmit INSTANCE = new LoadingSubmit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LoadingSubmit);
        }

        public final int hashCode() {
            return -680887465;
        }

        public final String toString() {
            return "LoadingSubmit";
        }
    }

    public abstract class Main extends BlockerActionConfirmSheetViewModel {

        public final class Original extends Main {
            public final UiAvatar avatar;
            public final String confirmButtonText;
            public final boolean invertButtonTreatment;
            public final String message;
            public final String returnButtonText;
            public final String subtitle;
            public final String title;

            public Original(UiAvatar uiAvatar, String str, String str2, String str3, String str4, String str5, boolean z) {
                str.getClass();
                str3.getClass();
                this.avatar = uiAvatar;
                this.title = str;
                this.subtitle = str2;
                this.message = str3;
                this.confirmButtonText = str4;
                this.returnButtonText = str5;
                this.invertButtonTreatment = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Original)) {
                    return false;
                }
                Original original = (Original) obj;
                return Intrinsics.areEqual(this.avatar, original.avatar) && Intrinsics.areEqual(this.title, original.title) && Intrinsics.areEqual(this.subtitle, original.subtitle) && Intrinsics.areEqual(this.message, original.message) && Intrinsics.areEqual(this.confirmButtonText, original.confirmButtonText) && Intrinsics.areEqual(this.returnButtonText, original.returnButtonText) && this.invertButtonTreatment == original.invertButtonTreatment;
            }

            public final int hashCode() {
                UiAvatar uiAvatar = this.avatar;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((uiAvatar == null ? 0 : uiAvatar.hashCode()) * 31, 31, this.title);
                String str = this.subtitle;
                int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.message);
                String str2 = this.confirmButtonText;
                int hashCode = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.returnButtonText;
                return Boolean.hashCode(this.invertButtonTreatment) + ((hashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Original(avatar=");
                sb.append(this.avatar);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", subtitle=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitle, ", message=", this.message, ", confirmButtonText=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.confirmButtonText, ", returnButtonText=", this.returnButtonText, ", invertButtonTreatment=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.invertButtonTreatment, ")");
            }
        }

        public final class VariantA extends Main {
            public final UiAvatar avatar;
            public final String confirmButtonText;
            public final boolean invertButtonTreatment;
            public final String message;
            public final String returnButtonText;
            public final String title;

            public VariantA(UiAvatar uiAvatar, String str, String str2, String str3, String str4, boolean z) {
                str.getClass();
                str2.getClass();
                this.avatar = uiAvatar;
                this.title = str;
                this.message = str2;
                this.confirmButtonText = str3;
                this.returnButtonText = str4;
                this.invertButtonTreatment = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VariantA)) {
                    return false;
                }
                VariantA variantA = (VariantA) obj;
                return Intrinsics.areEqual(this.avatar, variantA.avatar) && Intrinsics.areEqual(this.title, variantA.title) && Intrinsics.areEqual(this.message, variantA.message) && Intrinsics.areEqual(this.confirmButtonText, variantA.confirmButtonText) && Intrinsics.areEqual(this.returnButtonText, variantA.returnButtonText) && this.invertButtonTreatment == variantA.invertButtonTreatment;
            }

            public final int hashCode() {
                UiAvatar uiAvatar = this.avatar;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((uiAvatar == null ? 0 : uiAvatar.hashCode()) * 31, 31, this.title), 31, this.message);
                String str = this.confirmButtonText;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.returnButtonText;
                return Boolean.hashCode(this.invertButtonTreatment) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VariantA(avatar=");
                sb.append(this.avatar);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", message=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.message, ", confirmButtonText=", this.confirmButtonText, ", returnButtonText=");
                return re$$ExternalSyntheticOutline0.m(sb, this.returnButtonText, ", invertButtonTreatment=", this.invertButtonTreatment, ")");
            }
        }

        public final class VariantC extends Main {
            public final UiAvatar avatar;
            public final String confirmButtonText;
            public final boolean invertButtonTreatment;
            public final String message;
            public final String returnButtonText;
            public final String title;

            public VariantC(UiAvatar uiAvatar, String str, String str2, String str3, String str4, boolean z) {
                str.getClass();
                str2.getClass();
                this.avatar = uiAvatar;
                this.title = str;
                this.message = str2;
                this.confirmButtonText = str3;
                this.returnButtonText = str4;
                this.invertButtonTreatment = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VariantC)) {
                    return false;
                }
                VariantC variantC = (VariantC) obj;
                return Intrinsics.areEqual(this.avatar, variantC.avatar) && Intrinsics.areEqual(this.title, variantC.title) && Intrinsics.areEqual(this.message, variantC.message) && Intrinsics.areEqual(this.confirmButtonText, variantC.confirmButtonText) && Intrinsics.areEqual(this.returnButtonText, variantC.returnButtonText) && this.invertButtonTreatment == variantC.invertButtonTreatment;
            }

            public final int hashCode() {
                UiAvatar uiAvatar = this.avatar;
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((uiAvatar == null ? 0 : uiAvatar.hashCode()) * 31, 31, this.title), 31, this.message);
                String str = this.confirmButtonText;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.returnButtonText;
                return Boolean.hashCode(this.invertButtonTreatment) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("VariantC(avatar=");
                sb.append(this.avatar);
                sb.append(", title=");
                sb.append(this.title);
                sb.append(", message=");
                Boxes$$ExternalSyntheticOutline1.m(sb, this.message, ", confirmButtonText=", this.confirmButtonText, ", returnButtonText=");
                return re$$ExternalSyntheticOutline0.m(sb, this.returnButtonText, ", invertButtonTreatment=", this.invertButtonTreatment, ")");
            }
        }
    }

    public final class SubmitSuccess extends BlockerActionConfirmSheetViewModel {
        public static final SubmitSuccess INSTANCE = new SubmitSuccess();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitSuccess);
        }

        public final int hashCode() {
            return 1022695342;
        }

        public final String toString() {
            return "SubmitSuccess";
        }
    }
}
