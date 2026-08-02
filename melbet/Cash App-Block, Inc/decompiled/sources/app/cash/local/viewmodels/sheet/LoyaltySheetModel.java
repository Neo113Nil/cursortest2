package app.cash.local.viewmodels.sheet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.RewardToken;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LoyaltySheetModel {
    public final int balance;
    public final String body;
    public final boolean ctaEnabled;
    public final String ctaText;
    public final String pointsLabel;
    public final ArrayList tiers;
    public final String title;

    public final class Tier {
        public final boolean isEnabled;
        public final boolean isSelected;
        public final String name;
        public final String points;
        public final String token;

        public Tier(String str, String str2, String str3, boolean z, boolean z2) {
            this.token = str;
            this.name = str2;
            this.points = str3;
            this.isSelected = z;
            this.isEnabled = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tier)) {
                return false;
            }
            Tier tier = (Tier) obj;
            return this.token.equals(tier.token) && this.name.equals(tier.name) && this.points.equals(tier.points) && this.isSelected == tier.isSelected && this.isEnabled == tier.isEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name), 31, this.points), 31, this.isSelected);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Tier(token=", RewardToken.m1283toStringimpl(this.token), ", name=", this.name, ", points=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.points, ", isSelected=", this.isSelected, ", isEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isEnabled, ")");
        }
    }

    public LoyaltySheetModel(String str, int i, String str2, String str3, ArrayList arrayList, String str4, boolean z) {
        str.getClass();
        str4.getClass();
        this.title = str;
        this.balance = i;
        this.pointsLabel = str2;
        this.body = str3;
        this.tiers = arrayList;
        this.ctaText = str4;
        this.ctaEnabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoyaltySheetModel)) {
            return false;
        }
        LoyaltySheetModel loyaltySheetModel = (LoyaltySheetModel) obj;
        return Intrinsics.areEqual(this.title, loyaltySheetModel.title) && this.balance == loyaltySheetModel.balance && this.pointsLabel.equals(loyaltySheetModel.pointsLabel) && this.body.equals(loyaltySheetModel.body) && this.tiers.equals(loyaltySheetModel.tiers) && Intrinsics.areEqual(this.ctaText, loyaltySheetModel.ctaText) && this.ctaEnabled == loyaltySheetModel.ctaEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.ctaEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(CameraState$Type$EnumUnboxingLocalUtility.m(this.tiers, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.balance, this.title.hashCode() * 31, 31), 31, this.pointsLabel), 31, this.body), 31), 31, this.ctaText);
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("LoyaltySheetModel(title=", this.balance, this.title, ", balance=", ", pointsLabel=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.pointsLabel, ", body=", this.body, ", tiers=");
        m.append(this.tiers);
        m.append(", ctaText=");
        m.append(this.ctaText);
        m.append(", ctaEnabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.ctaEnabled, ")");
    }
}
