package com.squareup.cash.boost.backend;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.boost.AppPresentation;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public interface BoostEvent {

    public final class AddBoostEvent implements BoostEvent {
        public final AppPresentation appPresentation;
        public final Integer column;
        public final String flowToken;
        public final String rewardToken;
        public final Integer row;

        public AddBoostEvent(String str, String str2, AppPresentation appPresentation, Integer num, Integer num2) {
            str.getClass();
            appPresentation.getClass();
            this.flowToken = str;
            this.rewardToken = str2;
            this.appPresentation = appPresentation;
            this.row = num;
            this.column = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddBoostEvent)) {
                return false;
            }
            AddBoostEvent addBoostEvent = (AddBoostEvent) obj;
            return Intrinsics.areEqual(this.flowToken, addBoostEvent.flowToken) && this.rewardToken.equals(addBoostEvent.rewardToken) && this.appPresentation == addBoostEvent.appPresentation && Intrinsics.areEqual(this.row, addBoostEvent.row) && Intrinsics.areEqual(this.column, addBoostEvent.column);
        }

        public final AppPresentation getAppPresentation() {
            return this.appPresentation;
        }

        public final Integer getColumn() {
            return this.column;
        }

        public final String getFlowToken() {
            return this.flowToken;
        }

        public final String getRewardToken() {
            return this.rewardToken;
        }

        public final Integer getRow() {
            return this.row;
        }

        public final int hashCode() {
            int hashCode = (this.appPresentation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.rewardToken)) * 31;
            Integer num = this.row;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.column;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AddBoostEvent(flowToken=", this.flowToken, ", rewardToken=", this.rewardToken, ", appPresentation=");
            m.append(this.appPresentation);
            m.append(", row=");
            m.append(this.row);
            m.append(", column=");
            return NavAction$$ExternalSyntheticOutline0.m(m, this.column, ")");
        }
    }

    public final class RemoveBoostEvent implements BoostEvent {
        public final AppPresentation appPresentation;
        public final Integer column;
        public final String flowToken;
        public final String rewardToken;
        public final Integer row;

        public RemoveBoostEvent(String str, String str2, AppPresentation appPresentation, Integer num, Integer num2) {
            str.getClass();
            appPresentation.getClass();
            this.flowToken = str;
            this.rewardToken = str2;
            this.appPresentation = appPresentation;
            this.row = num;
            this.column = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveBoostEvent)) {
                return false;
            }
            RemoveBoostEvent removeBoostEvent = (RemoveBoostEvent) obj;
            return Intrinsics.areEqual(this.flowToken, removeBoostEvent.flowToken) && this.rewardToken.equals(removeBoostEvent.rewardToken) && this.appPresentation == removeBoostEvent.appPresentation && Intrinsics.areEqual(this.row, removeBoostEvent.row) && Intrinsics.areEqual(this.column, removeBoostEvent.column);
        }

        public final AppPresentation getAppPresentation() {
            return this.appPresentation;
        }

        public final Integer getColumn() {
            return this.column;
        }

        public final String getFlowToken() {
            return this.flowToken;
        }

        public final String getRewardToken() {
            return this.rewardToken;
        }

        public final Integer getRow() {
            return this.row;
        }

        public final int hashCode() {
            int hashCode = (this.appPresentation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.rewardToken)) * 31;
            Integer num = this.row;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.column;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoveBoostEvent(flowToken=", this.flowToken, ", rewardToken=", this.rewardToken, ", appPresentation=");
            m.append(this.appPresentation);
            m.append(", row=");
            m.append(this.row);
            m.append(", column=");
            return NavAction$$ExternalSyntheticOutline0.m(m, this.column, ")");
        }
    }

    public final class ReplaceBoostEvent implements BoostEvent {
        public final AppPresentation appPresentation;
        public final Integer column;
        public final String flowToken;
        public final String replacedRewardToken;
        public final String rewardToken;
        public final Integer row;

        public ReplaceBoostEvent(String str, String str2, String str3, AppPresentation appPresentation, Integer num, Integer num2) {
            str.getClass();
            appPresentation.getClass();
            this.flowToken = str;
            this.rewardToken = str2;
            this.replacedRewardToken = str3;
            this.appPresentation = appPresentation;
            this.row = num;
            this.column = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReplaceBoostEvent)) {
                return false;
            }
            ReplaceBoostEvent replaceBoostEvent = (ReplaceBoostEvent) obj;
            return Intrinsics.areEqual(this.flowToken, replaceBoostEvent.flowToken) && this.rewardToken.equals(replaceBoostEvent.rewardToken) && this.replacedRewardToken.equals(replaceBoostEvent.replacedRewardToken) && this.appPresentation == replaceBoostEvent.appPresentation && Intrinsics.areEqual(this.row, replaceBoostEvent.row) && Intrinsics.areEqual(this.column, replaceBoostEvent.column);
        }

        public final AppPresentation getAppPresentation() {
            return this.appPresentation;
        }

        public final Integer getColumn() {
            return this.column;
        }

        public final String getFlowToken() {
            return this.flowToken;
        }

        public final String getReplacedRewardToken() {
            return this.replacedRewardToken;
        }

        public final String getRewardToken() {
            return this.rewardToken;
        }

        public final Integer getRow() {
            return this.row;
        }

        public final int hashCode() {
            int hashCode = (this.appPresentation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flowToken.hashCode() * 31, 31, this.rewardToken), 31, this.replacedRewardToken)) * 31;
            Integer num = this.row;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.column;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ReplaceBoostEvent(flowToken=", this.flowToken, ", rewardToken=", this.rewardToken, ", replacedRewardToken=");
            m.append(this.replacedRewardToken);
            m.append(", appPresentation=");
            m.append(this.appPresentation);
            m.append(", row=");
            m.append(this.row);
            m.append(", column=");
            m.append(this.column);
            m.append(")");
            return m.toString();
        }
    }
}
