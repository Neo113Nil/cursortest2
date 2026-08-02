package app.cash.local.viewmodels;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.LocalBrandBanner;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandBannerModel {
    public final String body;
    public final LocalImage image;
    public final String label;
    public final Mode mode;

    /* renamed from: type, reason: collision with root package name */
    public final Type f917type;
    public final boolean useSuccessTextColor;

    public interface Mode {

        public final class Clickable implements Mode {
            public final LocalBrandBanner.Action action;

            public Clickable(LocalBrandBanner.Action action) {
                action.getClass();
                this.action = action;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Clickable) && Intrinsics.areEqual(this.action, ((Clickable) obj).action);
            }

            public final int hashCode() {
                return this.action.hashCode();
            }

            public final String toString() {
                return "Clickable(action=" + this.action + ")";
            }
        }

        public final class Dismissible implements Mode {
            public static final Dismissible INSTANCE = new Dismissible();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dismissible);
            }

            public final int hashCode() {
                return 1536130636;
            }

            public final String toString() {
                return "Dismissible";
            }
        }

        public final class Fixed implements Mode {
            public static final Fixed INSTANCE = new Fixed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Fixed);
            }

            public final int hashCode() {
                return -1647516700;
            }

            public final String toString() {
                return "Fixed";
            }
        }

        public final class Toggleable implements Mode {
            public final boolean applied;

            public Toggleable(boolean z) {
                this.applied = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Toggleable) && this.applied == ((Toggleable) obj).applied;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.applied);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("Toggleable(applied=", ")", this.applied);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type LOCAL_CASH;
        public static final Type LOYALTY;
        public static final Type OFFER;

        static {
            Type type2 = new Type("LOCAL_CASH", 0);
            LOCAL_CASH = type2;
            Type type3 = new Type("OFFER", 1);
            OFFER = type3;
            Type type4 = new Type("LOYALTY", 2);
            LOYALTY = type4;
            $VALUES = new Type[]{type2, type3, type4};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public LocalBrandBannerModel(LocalImage localImage, boolean z, String str, String str2, Mode mode, Type type2) {
        str.getClass();
        str2.getClass();
        this.image = localImage;
        this.useSuccessTextColor = z;
        this.label = str;
        this.body = str2;
        this.mode = mode;
        this.f917type = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandBannerModel)) {
            return false;
        }
        LocalBrandBannerModel localBrandBannerModel = (LocalBrandBannerModel) obj;
        return Intrinsics.areEqual(this.image, localBrandBannerModel.image) && this.useSuccessTextColor == localBrandBannerModel.useSuccessTextColor && Intrinsics.areEqual(this.label, localBrandBannerModel.label) && Intrinsics.areEqual(this.body, localBrandBannerModel.body) && Intrinsics.areEqual(this.mode, localBrandBannerModel.mode) && this.f917type == localBrandBannerModel.f917type;
    }

    public final int hashCode() {
        LocalImage localImage = this.image;
        return this.f917type.hashCode() + ((this.mode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((localImage == null ? 0 : localImage.hashCode()) * 31, 31, this.useSuccessTextColor), 31, this.label), 31, this.body)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalBrandBannerModel(image=");
        sb.append(this.image);
        sb.append(", useSuccessTextColor=");
        sb.append(this.useSuccessTextColor);
        sb.append(", label=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.label, ", body=", this.body, ", mode=");
        sb.append(this.mode);
        sb.append(", type=");
        sb.append(this.f917type);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ LocalBrandBannerModel(LocalImage localImage, boolean z, String str, String str2, Mode mode, Type type2, int i) {
        this((i & 1) != 0 ? null : localImage, (i & 2) != 0 ? false : z, str, str2, mode, type2);
    }
}
