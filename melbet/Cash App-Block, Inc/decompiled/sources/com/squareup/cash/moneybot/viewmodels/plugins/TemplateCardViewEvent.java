package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.cdf.moneybot.MoneybotTemplateCardTap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.analytics.CdfEvent;

/* loaded from: classes6.dex */
public interface TemplateCardViewEvent {

    public final class ExecuteServerToolCall implements TemplateCardViewEvent {
        public final MoneybotTemplateCardTap.ButtonRole analyticsButtonRole;
        public final String analyticsSource;
        public final String analyticsTarget;
        public final String argumentsJson;
        public final String extensionName;
        public final String requestId;
        public final CdfEvent tapCdfEvent;
        public final String toolName;

        public ExecuteServerToolCall(String str, String str2, String str3, String str4, MoneybotTemplateCardTap.ButtonRole buttonRole, String str5, String str6, CdfEvent cdfEvent) {
            this.requestId = str;
            this.extensionName = str2;
            this.toolName = str3;
            this.argumentsJson = str4;
            this.analyticsButtonRole = buttonRole;
            this.analyticsSource = str5;
            this.analyticsTarget = str6;
            this.tapCdfEvent = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExecuteServerToolCall)) {
                return false;
            }
            ExecuteServerToolCall executeServerToolCall = (ExecuteServerToolCall) obj;
            return Intrinsics.areEqual(this.requestId, executeServerToolCall.requestId) && this.extensionName.equals(executeServerToolCall.extensionName) && this.toolName.equals(executeServerToolCall.toolName) && this.argumentsJson.equals(executeServerToolCall.argumentsJson) && this.analyticsButtonRole == executeServerToolCall.analyticsButtonRole && Intrinsics.areEqual(this.analyticsSource, executeServerToolCall.analyticsSource) && Intrinsics.areEqual(this.analyticsTarget, executeServerToolCall.analyticsTarget) && Intrinsics.areEqual(this.tapCdfEvent, executeServerToolCall.tapCdfEvent);
        }

        public final int hashCode() {
            String str = this.requestId;
            int hashCode = (this.analyticsButtonRole.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.extensionName), 31, this.toolName), 31, this.argumentsJson)) * 31;
            String str2 = this.analyticsSource;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.analyticsTarget;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CdfEvent cdfEvent = this.tapCdfEvent;
            return hashCode3 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ExecuteServerToolCall(requestId=", this.requestId, ", extensionName=", this.extensionName, ", toolName=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.toolName, ", argumentsJson=", this.argumentsJson, ", analyticsButtonRole=");
            m.append(this.analyticsButtonRole);
            m.append(", analyticsSource=");
            m.append(this.analyticsSource);
            m.append(", analyticsTarget=");
            m.append(this.analyticsTarget);
            m.append(", tapCdfEvent=");
            m.append(this.tapCdfEvent);
            m.append(")");
            return m.toString();
        }
    }

    public final class LaunchClientRoute implements TemplateCardViewEvent {
        public final MoneybotTemplateCardTap.ButtonRole analyticsButtonRole;
        public final String analyticsSource;
        public final String analyticsTarget;
        public final String clientRoute;
        public final String requestId;
        public final CdfEvent tapCdfEvent;

        public LaunchClientRoute(String str, String str2, MoneybotTemplateCardTap.ButtonRole buttonRole, String str3, String str4, CdfEvent cdfEvent) {
            str2.getClass();
            this.requestId = str;
            this.clientRoute = str2;
            this.analyticsButtonRole = buttonRole;
            this.analyticsSource = str3;
            this.analyticsTarget = str4;
            this.tapCdfEvent = cdfEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LaunchClientRoute)) {
                return false;
            }
            LaunchClientRoute launchClientRoute = (LaunchClientRoute) obj;
            return Intrinsics.areEqual(this.requestId, launchClientRoute.requestId) && Intrinsics.areEqual(this.clientRoute, launchClientRoute.clientRoute) && this.analyticsButtonRole == launchClientRoute.analyticsButtonRole && Intrinsics.areEqual(this.analyticsSource, launchClientRoute.analyticsSource) && Intrinsics.areEqual(this.analyticsTarget, launchClientRoute.analyticsTarget) && Intrinsics.areEqual(this.tapCdfEvent, launchClientRoute.tapCdfEvent);
        }

        public final int hashCode() {
            String str = this.requestId;
            int hashCode = (this.analyticsButtonRole.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.clientRoute)) * 31;
            String str2 = this.analyticsSource;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.analyticsTarget;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            CdfEvent cdfEvent = this.tapCdfEvent;
            return hashCode3 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LaunchClientRoute(requestId=", this.requestId, ", clientRoute=", this.clientRoute, ", analyticsButtonRole=");
            m.append(this.analyticsButtonRole);
            m.append(", analyticsSource=");
            m.append(this.analyticsSource);
            m.append(", analyticsTarget=");
            m.append(this.analyticsTarget);
            m.append(", tapCdfEvent=");
            m.append(this.tapCdfEvent);
            m.append(")");
            return m.toString();
        }
    }

    public final class TokenTapped implements TemplateCardViewEvent {
        public final String placeholderKey;

        public TokenTapped(String str) {
            str.getClass();
            this.placeholderKey = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TokenTapped) && Intrinsics.areEqual(this.placeholderKey, ((TokenTapped) obj).placeholderKey);
        }

        public final int hashCode() {
            return this.placeholderKey.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TokenTapped(placeholderKey=", this.placeholderKey, ")");
        }
    }
}
