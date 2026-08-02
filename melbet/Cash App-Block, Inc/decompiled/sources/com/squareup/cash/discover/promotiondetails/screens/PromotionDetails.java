package com.squareup.cash.discover.promotiondetails.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PromotionDetails implements Screen {
    public static final Parcelable.Creator<PromotionDetails> CREATOR = new Limit.Creator(26);
    public final PromotionDetailsTransitionFactory$AnimationData animationData;
    public final Screen exitScreen;
    public final Identifier identifier;
    public final boolean persisted;
    public final String referrerFlowToken;

    /* loaded from: classes6.dex */
    public interface Identifier extends Parcelable {

        public final class DetailsToken implements Identifier {
            public static final Parcelable.Creator<DetailsToken> CREATOR = new Limit.Creator(27);
            public final String token;

            public DetailsToken(String str) {
                str.getClass();
                this.token = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DetailsToken) && Intrinsics.areEqual(this.token, ((DetailsToken) obj).token);
            }

            @Override // com.squareup.cash.discover.promotiondetails.screens.PromotionDetails.Identifier
            public final String getToken() {
                return this.token;
            }

            public final int hashCode() {
                return this.token.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DetailsToken(token=", this.token, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.token);
            }
        }

        public final class TemplateToken implements Identifier {
            public static final Parcelable.Creator<TemplateToken> CREATOR = new Limit.Creator(28);
            public final String templateToken;
            public final String templateVersion;

            public TemplateToken(String str, String str2) {
                str.getClass();
                this.templateToken = str;
                this.templateVersion = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TemplateToken)) {
                    return false;
                }
                TemplateToken templateToken = (TemplateToken) obj;
                return Intrinsics.areEqual(this.templateToken, templateToken.templateToken) && Intrinsics.areEqual(this.templateVersion, templateToken.templateVersion);
            }

            @Override // com.squareup.cash.discover.promotiondetails.screens.PromotionDetails.Identifier
            public final String getToken() {
                return null;
            }

            public final int hashCode() {
                int hashCode = this.templateToken.hashCode() * 31;
                String str = this.templateVersion;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("TemplateToken(templateToken=", this.templateToken, ", templateVersion=", this.templateVersion, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.templateToken);
                parcel.writeString(this.templateVersion);
            }
        }

        public final class TreehousePath implements Identifier {
            public static final Parcelable.Creator<TreehousePath> CREATOR = new Limit.Creator(29);
            public final String path;
            public final String token;

            public TreehousePath(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.path = str;
                this.token = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TreehousePath)) {
                    return false;
                }
                TreehousePath treehousePath = (TreehousePath) obj;
                return Intrinsics.areEqual(this.path, treehousePath.path) && Intrinsics.areEqual(this.token, treehousePath.token);
            }

            @Override // com.squareup.cash.discover.promotiondetails.screens.PromotionDetails.Identifier
            public final String getToken() {
                return this.token;
            }

            public final int hashCode() {
                return this.token.hashCode() + (this.path.hashCode() * 31);
            }

            public final String toString() {
                return Boxes$$ExternalSyntheticOutline1.m("TreehousePath(path=", this.path, ", token=", this.token, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.path);
                parcel.writeString(this.token);
            }
        }

        String getToken();
    }

    public PromotionDetails(Identifier identifier, String str, boolean z, PromotionDetailsTransitionFactory$AnimationData promotionDetailsTransitionFactory$AnimationData, Screen screen) {
        identifier.getClass();
        this.identifier = identifier;
        this.referrerFlowToken = str;
        this.persisted = z;
        this.animationData = promotionDetailsTransitionFactory$AnimationData;
        this.exitScreen = screen;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionDetails)) {
            return false;
        }
        PromotionDetails promotionDetails = (PromotionDetails) obj;
        return Intrinsics.areEqual(this.identifier, promotionDetails.identifier) && Intrinsics.areEqual(this.referrerFlowToken, promotionDetails.referrerFlowToken) && this.persisted == promotionDetails.persisted && Intrinsics.areEqual(this.animationData, promotionDetails.animationData) && Intrinsics.areEqual(this.exitScreen, promotionDetails.exitScreen);
    }

    public final int hashCode() {
        int hashCode = this.identifier.hashCode() * 31;
        String str = this.referrerFlowToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.persisted);
        PromotionDetailsTransitionFactory$AnimationData promotionDetailsTransitionFactory$AnimationData = this.animationData;
        int hashCode2 = (m + (promotionDetailsTransitionFactory$AnimationData == null ? 0 : promotionDetailsTransitionFactory$AnimationData.hashCode())) * 31;
        Screen screen = this.exitScreen;
        return hashCode2 + (screen != null ? screen.hashCode() : 0);
    }

    public final String toString() {
        return "PromotionDetails(identifier=" + this.identifier + ", referrerFlowToken=" + this.referrerFlowToken + ", persisted=" + this.persisted + ", animationData=" + this.animationData + ", exitScreen=" + this.exitScreen + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.identifier, i);
        parcel.writeString(this.referrerFlowToken);
        parcel.writeInt(this.persisted ? 1 : 0);
        PromotionDetailsTransitionFactory$AnimationData promotionDetailsTransitionFactory$AnimationData = this.animationData;
        if (promotionDetailsTransitionFactory$AnimationData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promotionDetailsTransitionFactory$AnimationData.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.exitScreen, i);
    }

    public /* synthetic */ PromotionDetails(Identifier identifier, Screen screen, int i) {
        this(identifier, null, false, null, (i & 16) != 0 ? null : screen);
    }
}
