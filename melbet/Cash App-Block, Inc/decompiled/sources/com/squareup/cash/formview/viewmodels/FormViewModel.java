package com.squareup.cash.formview.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.FormBlocker;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class FormViewModel {
    public final ColorModel accentColor;
    public final BlockerIdentifiers blockerIdentifiers;
    public final ClientScenarioAndFlowToken clientScenarioAndFlowToken;
    public final String disclaimerText;
    public final List elements;
    public final ColorModel fullBleedHeaderImageBackgroundColor;
    public final boolean helpEnabled;
    public final CameraPropertiesKt onDisplayEffect;
    public final ButtonIcon primaryActionIcon;
    public final FormBlocker.Element.ButtonElement.Style primaryActionStyle;
    public final String primaryActionText;
    public final FormBlocker.Element.ButtonElement.Type primaryActionType;
    public final boolean requiresFullScroll;
    public final boolean retreatEnabled;
    public final FormBlocker.Element.ButtonElement.Style secondaryActionStyle;
    public final String secondaryActionText;
    public final SubmissionState submissionState;
    public final String submitActionId;
    public final String titleBarAccessoryText;
    public final boolean toolbarNavigationEnabled;

    public /* synthetic */ FormViewModel(List list, boolean z, String str, ButtonIcon buttonIcon, String str2, String str3, boolean z2, String str4, ColorModel colorModel, boolean z3, CameraPropertiesKt cameraPropertiesKt, FormBlocker.Element.ButtonElement.Type type2, FormBlocker.Element.ButtonElement.Style style, FormBlocker.Element.ButtonElement.Style style2, ColorModel.Accented accented, SubmissionState submissionState, ClientScenarioAndFlowToken clientScenarioAndFlowToken, BlockerIdentifiers blockerIdentifiers, boolean z4, String str5, int i) {
        this(list, z, str, (i & 8) != 0 ? null : buttonIcon, str2, (i & 32) != 0 ? null : str3, z2, str4, colorModel, z3, cameraPropertiesKt, (i & 2048) != 0 ? FormBlocker.Element.ButtonElement.Type.NORMAL : type2, (i & 4096) != 0 ? FormBlocker.Element.ButtonElement.Style.PRIMARY : style, (i & PKIFailureInfo.certRevoked) != 0 ? FormBlocker.Element.ButtonElement.Style.SECONDARY : style2, (i & 16384) != 0 ? null : accented, (32768 & i) != 0 ? SubmissionState.None.INSTANCE : submissionState, (65536 & i) != 0 ? null : clientScenarioAndFlowToken, (131072 & i) != 0 ? null : blockerIdentifiers, (262144 & i) != 0 ? false : z4, (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormViewModel)) {
            return false;
        }
        FormViewModel formViewModel = (FormViewModel) obj;
        return Intrinsics.areEqual(this.elements, formViewModel.elements) && this.toolbarNavigationEnabled == formViewModel.toolbarNavigationEnabled && Intrinsics.areEqual(this.primaryActionText, formViewModel.primaryActionText) && Intrinsics.areEqual(this.primaryActionIcon, formViewModel.primaryActionIcon) && Intrinsics.areEqual(this.secondaryActionText, formViewModel.secondaryActionText) && Intrinsics.areEqual(this.disclaimerText, formViewModel.disclaimerText) && this.helpEnabled == formViewModel.helpEnabled && Intrinsics.areEqual(this.submitActionId, formViewModel.submitActionId) && Intrinsics.areEqual(this.accentColor, formViewModel.accentColor) && this.requiresFullScroll == formViewModel.requiresFullScroll && Intrinsics.areEqual(this.onDisplayEffect, formViewModel.onDisplayEffect) && this.primaryActionType == formViewModel.primaryActionType && this.primaryActionStyle == formViewModel.primaryActionStyle && this.secondaryActionStyle == formViewModel.secondaryActionStyle && Intrinsics.areEqual(this.fullBleedHeaderImageBackgroundColor, formViewModel.fullBleedHeaderImageBackgroundColor) && Intrinsics.areEqual(this.submissionState, formViewModel.submissionState) && Intrinsics.areEqual(this.clientScenarioAndFlowToken, formViewModel.clientScenarioAndFlowToken) && Intrinsics.areEqual(this.blockerIdentifiers, formViewModel.blockerIdentifiers) && this.retreatEnabled == formViewModel.retreatEnabled && Intrinsics.areEqual(this.titleBarAccessoryText, formViewModel.titleBarAccessoryText);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.elements.hashCode() * 31, 31, this.toolbarNavigationEnabled);
        String str = this.primaryActionText;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        ButtonIcon buttonIcon = this.primaryActionIcon;
        int hashCode2 = (hashCode + (buttonIcon == null ? 0 : buttonIcon.hashCode())) * 31;
        String str2 = this.secondaryActionText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.disclaimerText;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.helpEnabled);
        String str4 = this.submitActionId;
        int hashCode4 = (m2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ColorModel colorModel = this.accentColor;
        int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode4 + (colorModel == null ? 0 : colorModel.hashCode())) * 31, 31, this.requiresFullScroll);
        CameraPropertiesKt cameraPropertiesKt = this.onDisplayEffect;
        int hashCode5 = (this.secondaryActionStyle.hashCode() + ((this.primaryActionStyle.hashCode() + ((this.primaryActionType.hashCode() + ((m3 + (cameraPropertiesKt == null ? 0 : cameraPropertiesKt.hashCode())) * 31)) * 31)) * 31)) * 31;
        ColorModel colorModel2 = this.fullBleedHeaderImageBackgroundColor;
        int hashCode6 = (this.submissionState.hashCode() + ((hashCode5 + (colorModel2 == null ? 0 : colorModel2.hashCode())) * 31)) * 31;
        ClientScenarioAndFlowToken clientScenarioAndFlowToken = this.clientScenarioAndFlowToken;
        int hashCode7 = (hashCode6 + (clientScenarioAndFlowToken == null ? 0 : clientScenarioAndFlowToken.hashCode())) * 31;
        BlockerIdentifiers blockerIdentifiers = this.blockerIdentifiers;
        int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode7 + (blockerIdentifiers == null ? 0 : blockerIdentifiers.hashCode())) * 31, 31, this.retreatEnabled);
        String str5 = this.titleBarAccessoryText;
        return m4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormViewModel(elements=");
        sb.append(this.elements);
        sb.append(", toolbarNavigationEnabled=");
        sb.append(this.toolbarNavigationEnabled);
        sb.append(", primaryActionText=");
        sb.append(this.primaryActionText);
        sb.append(", primaryActionIcon=");
        sb.append(this.primaryActionIcon);
        sb.append(", secondaryActionText=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.secondaryActionText, ", disclaimerText=", this.disclaimerText, ", helpEnabled=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.helpEnabled, ", submitActionId=", this.submitActionId, ", accentColor=");
        sb.append(this.accentColor);
        sb.append(", requiresFullScroll=");
        sb.append(this.requiresFullScroll);
        sb.append(", onDisplayEffect=");
        sb.append(this.onDisplayEffect);
        sb.append(", primaryActionType=");
        sb.append(this.primaryActionType);
        sb.append(", primaryActionStyle=");
        sb.append(this.primaryActionStyle);
        sb.append(", secondaryActionStyle=");
        sb.append(this.secondaryActionStyle);
        sb.append(", fullBleedHeaderImageBackgroundColor=");
        sb.append(this.fullBleedHeaderImageBackgroundColor);
        sb.append(", submissionState=");
        sb.append(this.submissionState);
        sb.append(", clientScenarioAndFlowToken=");
        sb.append(this.clientScenarioAndFlowToken);
        sb.append(", blockerIdentifiers=");
        sb.append(this.blockerIdentifiers);
        sb.append(", retreatEnabled=");
        sb.append(this.retreatEnabled);
        sb.append(", titleBarAccessoryText=");
        sb.append(this.titleBarAccessoryText);
        sb.append(")");
        return sb.toString();
    }

    public abstract class SubmissionState {

        public final class None extends SubmissionState {
            public static final None INSTANCE = new None();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof None);
            }

            public final int hashCode() {
                return 1759039355;
            }

            public final String toString() {
                return "None";
            }
        }

        /* loaded from: classes4.dex */
        public final class SubmissionFailed extends SubmissionState {
            public static final SubmissionFailed INSTANCE = new SubmissionFailed();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SubmissionFailed);
            }

            public final int hashCode() {
                return -1426921876;
            }

            public final String toString() {
                return "SubmissionFailed";
            }
        }

        public final class SubmissionInFlight extends SubmissionState {
            public final BlockerAction.SubmitAction.AnimationDirection direction;
            public final String label;

            public SubmissionInFlight(String str, BlockerAction.SubmitAction.AnimationDirection animationDirection) {
                animationDirection.getClass();
                this.label = str;
                this.direction = animationDirection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SubmissionInFlight)) {
                    return false;
                }
                SubmissionInFlight submissionInFlight = (SubmissionInFlight) obj;
                return Intrinsics.areEqual(this.label, submissionInFlight.label) && this.direction == submissionInFlight.direction;
            }

            public final int hashCode() {
                String str = this.label;
                return this.direction.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "SubmissionInFlight(label=" + this.label + ", direction=" + this.direction + ")";
            }

            public /* synthetic */ SubmissionInFlight(BlockerAction.SubmitAction.AnimationDirection animationDirection, int i) {
                this((String) null, (i & 2) != 0 ? BlockerAction.SubmitAction.AnimationDirection.FORWARD : animationDirection);
            }
        }
    }

    public FormViewModel(List list, boolean z, String str, ButtonIcon buttonIcon, String str2, String str3, boolean z2, String str4, ColorModel colorModel, boolean z3, CameraPropertiesKt cameraPropertiesKt, FormBlocker.Element.ButtonElement.Type type2, FormBlocker.Element.ButtonElement.Style style, FormBlocker.Element.ButtonElement.Style style2, ColorModel colorModel2, SubmissionState submissionState, ClientScenarioAndFlowToken clientScenarioAndFlowToken, BlockerIdentifiers blockerIdentifiers, boolean z4, String str5) {
        list.getClass();
        type2.getClass();
        style.getClass();
        style2.getClass();
        submissionState.getClass();
        this.elements = list;
        this.toolbarNavigationEnabled = z;
        this.primaryActionText = str;
        this.primaryActionIcon = buttonIcon;
        this.secondaryActionText = str2;
        this.disclaimerText = str3;
        this.helpEnabled = z2;
        this.submitActionId = str4;
        this.accentColor = colorModel;
        this.requiresFullScroll = z3;
        this.onDisplayEffect = cameraPropertiesKt;
        this.primaryActionType = type2;
        this.primaryActionStyle = style;
        this.secondaryActionStyle = style2;
        this.fullBleedHeaderImageBackgroundColor = colorModel2;
        this.submissionState = submissionState;
        this.clientScenarioAndFlowToken = clientScenarioAndFlowToken;
        this.blockerIdentifiers = blockerIdentifiers;
        this.retreatEnabled = z4;
        this.titleBarAccessoryText = str5;
    }
}
