package com.squareup.cash.afterpayapplet.applets.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface AfterpayAppletTileViewModel {

    public interface Installed extends AfterpayAppletTileViewModel {

        public final class CreditBreakdown implements Installed, AfterpayAppletItemViewed {
            public final List analyticsTapEvents;
            public final String appletTitleText;
            public final List impressionEvent;
            public final List rows;

            /* loaded from: classes6.dex */
            public interface AllocationRow {

                /* loaded from: classes5.dex */
                public final class CreditRingAllocation implements AllocationRow {
                    public final List allocations;
                    public final String briefText;
                    public final String emphasisMoneyText;

                    public CreditRingAllocation(String str, String str2, List list) {
                        CreditRowType creditRowType = CreditRowType.AVAILABLE_ROW;
                        str.getClass();
                        list.getClass();
                        this.emphasisMoneyText = str;
                        this.briefText = str2;
                        this.allocations = list;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof CreditRingAllocation)) {
                            return false;
                        }
                        CreditRingAllocation creditRingAllocation = (CreditRingAllocation) obj;
                        if (!Intrinsics.areEqual(this.emphasisMoneyText, creditRingAllocation.emphasisMoneyText) || !this.briefText.equals(creditRingAllocation.briefText)) {
                            return false;
                        }
                        CreditRowType creditRowType = CreditRowType.AVAILABLE_ROW;
                        return Intrinsics.areEqual(this.allocations, creditRingAllocation.allocations);
                    }

                    @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow
                    public final String getBriefText() {
                        return this.briefText;
                    }

                    @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow
                    public final String getEmphasisMoneyText() {
                        return this.emphasisMoneyText;
                    }

                    public final int hashCode() {
                        return this.allocations.hashCode() + ((CreditRowType.AVAILABLE_ROW.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.emphasisMoneyText.hashCode() * 31, 31, this.briefText)) * 31);
                    }

                    public final String toString() {
                        CreditRowType creditRowType = CreditRowType.AVAILABLE_ROW;
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreditRingAllocation(emphasisMoneyText=", this.emphasisMoneyText, ", briefText=", this.briefText, ", rowType=");
                        m.append(creditRowType);
                        m.append(", allocations=");
                        m.append(this.allocations);
                        m.append(")");
                        return m.toString();
                    }
                }

                /* loaded from: classes5.dex */
                public final class OwedRingAllocation implements AllocationRow {
                    public final List allocations;
                    public final String briefText;
                    public final String emphasisMoneyText;

                    public OwedRingAllocation(String str, String str2, List list) {
                        CreditRowType creditRowType = CreditRowType.AVAILABLE_ROW;
                        str.getClass();
                        list.getClass();
                        this.emphasisMoneyText = str;
                        this.briefText = str2;
                        this.allocations = list;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof OwedRingAllocation)) {
                            return false;
                        }
                        OwedRingAllocation owedRingAllocation = (OwedRingAllocation) obj;
                        if (!Intrinsics.areEqual(this.emphasisMoneyText, owedRingAllocation.emphasisMoneyText) || !this.briefText.equals(owedRingAllocation.briefText)) {
                            return false;
                        }
                        CreditRowType creditRowType = CreditRowType.AVAILABLE_ROW;
                        return Intrinsics.areEqual(this.allocations, owedRingAllocation.allocations);
                    }

                    @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow
                    public final String getBriefText() {
                        return this.briefText;
                    }

                    @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed.CreditBreakdown.AllocationRow
                    public final String getEmphasisMoneyText() {
                        return this.emphasisMoneyText;
                    }

                    public final int hashCode() {
                        return this.allocations.hashCode() + ((CreditRowType.OWED_ROW.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.emphasisMoneyText.hashCode() * 31, 31, this.briefText)) * 31);
                    }

                    public final String toString() {
                        CreditRowType creditRowType = CreditRowType.OWED_ROW;
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OwedRingAllocation(emphasisMoneyText=", this.emphasisMoneyText, ", briefText=", this.briefText, ", rowType=");
                        m.append(creditRowType);
                        m.append(", allocations=");
                        m.append(this.allocations);
                        m.append(")");
                        return m.toString();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* loaded from: classes5.dex */
                public final class RingCreditLineType {
                    public static final /* synthetic */ RingCreditLineType[] $VALUES;
                    public static final RingCreditLineType CREDIT_ALL;
                    public static final RingCreditLineType CREDIT_INN;
                    public static final RingCreditLineType CREDIT_ONN;
                    public static final RingCreditLineType CREDIT_RETRO;
                    public static final RingCreditLineType OUTSTANDING_BALANCE;

                    static {
                        RingCreditLineType ringCreditLineType = new RingCreditLineType("CREDIT_INN", 0);
                        CREDIT_INN = ringCreditLineType;
                        RingCreditLineType ringCreditLineType2 = new RingCreditLineType("CREDIT_ONN", 1);
                        CREDIT_ONN = ringCreditLineType2;
                        RingCreditLineType ringCreditLineType3 = new RingCreditLineType("CREDIT_RETRO", 2);
                        CREDIT_RETRO = ringCreditLineType3;
                        RingCreditLineType ringCreditLineType4 = new RingCreditLineType("CREDIT_ALL", 3);
                        CREDIT_ALL = ringCreditLineType4;
                        RingCreditLineType ringCreditLineType5 = new RingCreditLineType("OUTSTANDING_BALANCE", 4);
                        OUTSTANDING_BALANCE = ringCreditLineType5;
                        $VALUES = new RingCreditLineType[]{ringCreditLineType, ringCreditLineType2, ringCreditLineType3, ringCreditLineType4, ringCreditLineType5};
                    }

                    public static RingCreditLineType valueOf(String str) {
                        return (RingCreditLineType) Enum.valueOf(RingCreditLineType.class, str);
                    }

                    public static RingCreditLineType[] values() {
                        return (RingCreditLineType[]) $VALUES.clone();
                    }
                }

                String getBriefText();

                String getEmphasisMoneyText();
            }

            public CreditBreakdown(String str, List list, List list2, List list3) {
                list.getClass();
                this.appletTitleText = str;
                this.rows = list;
                this.impressionEvent = list2;
                this.analyticsTapEvents = list3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CreditBreakdown)) {
                    return false;
                }
                CreditBreakdown creditBreakdown = (CreditBreakdown) obj;
                return this.appletTitleText.equals(creditBreakdown.appletTitleText) && Intrinsics.areEqual(this.rows, creditBreakdown.rows) && Intrinsics.areEqual(this.impressionEvent, creditBreakdown.impressionEvent) && Intrinsics.areEqual(this.analyticsTapEvents, creditBreakdown.analyticsTapEvents);
            }

            @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed
            public final List getAnalyticsTapEvents() {
                return this.analyticsTapEvents;
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
            public final List getImpressionEvent() {
                return this.impressionEvent;
            }

            public final int hashCode() {
                int m = Recorder$$ExternalSyntheticOutline2.m(this.appletTitleText.hashCode() * 31, 31, this.rows);
                List list = this.impressionEvent;
                int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
                List list2 = this.analyticsTapEvents;
                return hashCode + (list2 != null ? list2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("CreditBreakdown(appletTitleText=", this.appletTitleText, ", rows=", ", impressionEvent=", this.rows);
                m.append(this.impressionEvent);
                m.append(", analyticsTapEvents=");
                m.append(this.analyticsTapEvents);
                m.append(")");
                return m.toString();
            }
        }

        public final class CreditDetails implements Installed, AfterpayAppletItemViewed {
            public final List analyticsTapEvents;
            public final String appletTitleText;
            public final ArrayList details;
            public final List impressionEvent;

            public final class CreditDetail {
                public final String arcadeIcon;
                public final Color backgroundColor;
                public final String briefText;
                public final String emphasisMoneyText;
                public final Color iconTint;

                public CreditDetail(Color color, Color color2, String str, String str2, String str3) {
                    str2.getClass();
                    this.backgroundColor = color;
                    this.arcadeIcon = str;
                    this.iconTint = color2;
                    this.emphasisMoneyText = str2;
                    this.briefText = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof CreditDetail)) {
                        return false;
                    }
                    CreditDetail creditDetail = (CreditDetail) obj;
                    return Intrinsics.areEqual(this.backgroundColor, creditDetail.backgroundColor) && Intrinsics.areEqual(this.arcadeIcon, creditDetail.arcadeIcon) && Intrinsics.areEqual(this.iconTint, creditDetail.iconTint) && Intrinsics.areEqual(this.emphasisMoneyText, creditDetail.emphasisMoneyText) && this.briefText.equals(creditDetail.briefText);
                }

                public final int hashCode() {
                    Color color = this.backgroundColor;
                    int hashCode = (color == null ? 0 : color.hashCode()) * 31;
                    String str = this.arcadeIcon;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Color color2 = this.iconTint;
                    return this.briefText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 31, 31, this.emphasisMoneyText);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("CreditDetail(backgroundColor=");
                    sb.append(this.backgroundColor);
                    sb.append(", arcadeIcon=");
                    sb.append(this.arcadeIcon);
                    sb.append(", iconTint=");
                    sb.append(this.iconTint);
                    sb.append(", emphasisMoneyText=");
                    sb.append(this.emphasisMoneyText);
                    sb.append(", briefText=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.briefText, ")");
                }
            }

            public CreditDetails(String str, ArrayList arrayList, List list, List list2) {
                this.appletTitleText = str;
                this.details = arrayList;
                this.impressionEvent = list;
                this.analyticsTapEvents = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CreditDetails)) {
                    return false;
                }
                CreditDetails creditDetails = (CreditDetails) obj;
                return this.appletTitleText.equals(creditDetails.appletTitleText) && this.details.equals(creditDetails.details) && Intrinsics.areEqual(this.impressionEvent, creditDetails.impressionEvent) && Intrinsics.areEqual(this.analyticsTapEvents, creditDetails.analyticsTapEvents);
            }

            @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed
            public final List getAnalyticsTapEvents() {
                return this.analyticsTapEvents;
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
            public final List getImpressionEvent() {
                return this.impressionEvent;
            }

            public final int hashCode() {
                int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.details, this.appletTitleText.hashCode() * 31, 31);
                List list = this.impressionEvent;
                int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
                List list2 = this.analyticsTapEvents;
                return hashCode + (list2 != null ? list2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = CameraState$Type$EnumUnboxingLocalUtility.m(this.details, "CreditDetails(appletTitleText=", this.appletTitleText, ", details=", ", impressionEvent=");
                m.append(this.impressionEvent);
                m.append(", analyticsTapEvents=");
                m.append(this.analyticsTapEvents);
                m.append(")");
                return m.toString();
            }
        }

        public final class CreditState implements Installed, AfterpayAppletItemViewed {
            public final List analyticsTapEvents;
            public final String appletTitleText;
            public final String briefText;
            public final CreditStateType creditState;
            public final String emphasisMoneyText;
            public final List impressionEvent;

            public CreditState(String str, String str2, String str3, CreditStateType creditStateType, List list, List list2) {
                str2.getClass();
                this.appletTitleText = str;
                this.emphasisMoneyText = str2;
                this.briefText = str3;
                this.creditState = creditStateType;
                this.impressionEvent = list;
                this.analyticsTapEvents = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CreditState)) {
                    return false;
                }
                CreditState creditState = (CreditState) obj;
                return this.appletTitleText.equals(creditState.appletTitleText) && Intrinsics.areEqual(this.emphasisMoneyText, creditState.emphasisMoneyText) && this.briefText.equals(creditState.briefText) && this.creditState == creditState.creditState && Intrinsics.areEqual(this.impressionEvent, creditState.impressionEvent) && Intrinsics.areEqual(this.analyticsTapEvents, creditState.analyticsTapEvents);
            }

            @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed
            public final List getAnalyticsTapEvents() {
                return this.analyticsTapEvents;
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
            public final List getImpressionEvent() {
                return this.impressionEvent;
            }

            public final int hashCode() {
                int hashCode = (this.creditState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appletTitleText.hashCode() * 31, 31, this.emphasisMoneyText), 31, this.briefText)) * 31;
                List list = this.impressionEvent;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                List list2 = this.analyticsTapEvents;
                return hashCode2 + (list2 != null ? list2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreditState(appletTitleText=", this.appletTitleText, ", emphasisMoneyText=", this.emphasisMoneyText, ", briefText=");
                m.append(this.briefText);
                m.append(", creditState=");
                m.append(this.creditState);
                m.append(", impressionEvent=");
                m.append(this.impressionEvent);
                m.append(", analyticsTapEvents=");
                m.append(this.analyticsTapEvents);
                m.append(")");
                return m.toString();
            }
        }

        public final class DefaultState implements Installed, AfterpayAppletItemViewed {
            public final List analyticsTapEvents;
            public final String appletTitleText;
            public final String emphasisMoneyText;
            public final List impressionEvent;

            public DefaultState(String str, String str2, List list, List list2) {
                str2.getClass();
                this.appletTitleText = str;
                this.emphasisMoneyText = str2;
                this.impressionEvent = list;
                this.analyticsTapEvents = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DefaultState)) {
                    return false;
                }
                DefaultState defaultState = (DefaultState) obj;
                return this.appletTitleText.equals(defaultState.appletTitleText) && Intrinsics.areEqual(this.emphasisMoneyText, defaultState.emphasisMoneyText) && Intrinsics.areEqual(this.impressionEvent, defaultState.impressionEvent) && Intrinsics.areEqual(this.analyticsTapEvents, defaultState.analyticsTapEvents);
            }

            @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed
            public final List getAnalyticsTapEvents() {
                return this.analyticsTapEvents;
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
            public final List getImpressionEvent() {
                return this.impressionEvent;
            }

            public final int hashCode() {
                int hashCode = (((this.emphasisMoneyText.hashCode() + (this.appletTitleText.hashCode() * 31)) * 31) - 733902135) * 31;
                List list = this.impressionEvent;
                int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                List list2 = this.analyticsTapEvents;
                return hashCode2 + (list2 != null ? list2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DefaultState(appletTitleText=", this.appletTitleText, ", emphasisMoneyText=", this.emphasisMoneyText, ", briefText=available, impressionEvent=");
                m.append(this.impressionEvent);
                m.append(", analyticsTapEvents=");
                m.append(this.analyticsTapEvents);
                m.append(")");
                return m.toString();
            }
        }

        public final class InstalledFailure implements Installed {
            public final List analyticsTapEvents = EmptyList.INSTANCE;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InstalledFailure) && Intrinsics.areEqual(this.analyticsTapEvents, ((InstalledFailure) obj).analyticsTapEvents);
            }

            @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed
            public final List getAnalyticsTapEvents() {
                return this.analyticsTapEvents;
            }

            public final int hashCode() {
                List list = this.analyticsTapEvents;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("InstalledFailure(analyticsTapEvents=", ")", this.analyticsTapEvents);
            }
        }

        public final class V3Installed implements Installed, AfterpayAppletItemViewed {
            public final List analyticsTapEvents;
            public final String hint;
            public final StackedAvatarViewModel.Avatar iconAvatar;
            public final List impressionEvent;
            public final String prefixMainLabel;
            public final String suffixMainLabel;
            public final String title;

            public V3Installed(String str, String str2, String str3, String str4, StackedAvatarViewModel.Avatar avatar, List list, List list2) {
                str2.getClass();
                this.title = str;
                this.prefixMainLabel = str2;
                this.suffixMainLabel = str3;
                this.hint = str4;
                this.iconAvatar = avatar;
                this.analyticsTapEvents = list;
                this.impressionEvent = list2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof V3Installed)) {
                    return false;
                }
                V3Installed v3Installed = (V3Installed) obj;
                return this.title.equals(v3Installed.title) && Intrinsics.areEqual(this.prefixMainLabel, v3Installed.prefixMainLabel) && Intrinsics.areEqual(this.suffixMainLabel, v3Installed.suffixMainLabel) && Intrinsics.areEqual(this.hint, v3Installed.hint) && this.iconAvatar.equals(v3Installed.iconAvatar) && Intrinsics.areEqual(this.analyticsTapEvents, v3Installed.analyticsTapEvents) && Intrinsics.areEqual(this.impressionEvent, v3Installed.impressionEvent);
            }

            @Override // com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel.Installed
            public final List getAnalyticsTapEvents() {
                return this.analyticsTapEvents;
            }

            @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
            public final List getImpressionEvent() {
                return this.impressionEvent;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.prefixMainLabel);
                String str = this.suffixMainLabel;
                int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.hint;
                int hashCode2 = (this.iconAvatar.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                List list = this.analyticsTapEvents;
                int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                List list2 = this.impressionEvent;
                return hashCode3 + (list2 != null ? list2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("V3Installed(title=", this.title, ", prefixMainLabel=", this.prefixMainLabel, ", suffixMainLabel=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.suffixMainLabel, ", hint=", this.hint, ", iconAvatar=");
                m.append(this.iconAvatar);
                m.append(", analyticsTapEvents=");
                m.append(this.analyticsTapEvents);
                m.append(", impressionEvent=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.impressionEvent, ")");
            }
        }

        List getAnalyticsTapEvents();
    }

    public final class Loading implements AfterpayAppletTileViewModel {
        public final boolean isInstalled;

        public Loading(boolean z) {
            this.isInstalled = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.isInstalled == ((Loading) obj).isInstalled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isInstalled);
        }

        public final String toString() {
            return Fragment$5$$ExternalSyntheticOutline0.m("Loading(isInstalled=", ")", this.isInstalled);
        }
    }

    public final class Uninstalled implements AfterpayAppletItemViewed, AfterpayAppletTileViewModel {
        public final List analyticsTapEvents;
        public final StackedAvatarViewModel.Avatar avatar;
        public final List impressionEvent;
        public final PromotedAppletTileViewModel promotedModel;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, StackedAvatarViewModel.Avatar avatar, List list, List list2, PromotedAppletTileViewModel promotedAppletTileViewModel) {
            this.title = str;
            this.subtitle = str2;
            this.avatar = avatar;
            this.analyticsTapEvents = list;
            this.impressionEvent = list2;
            this.promotedModel = promotedAppletTileViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return this.title.equals(uninstalled.title) && this.subtitle.equals(uninstalled.subtitle) && Intrinsics.areEqual(this.avatar, uninstalled.avatar) && Intrinsics.areEqual(this.analyticsTapEvents, uninstalled.analyticsTapEvents) && Intrinsics.areEqual(this.impressionEvent, uninstalled.impressionEvent) && Intrinsics.areEqual(this.promotedModel, uninstalled.promotedModel);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
        public final List getImpressionEvent() {
            return this.impressionEvent;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            StackedAvatarViewModel.Avatar avatar = this.avatar;
            int hashCode = (m + (avatar == null ? 0 : avatar.hashCode())) * 31;
            List list = this.analyticsTapEvents;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.impressionEvent;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            PromotedAppletTileViewModel promotedAppletTileViewModel = this.promotedModel;
            return hashCode3 + (promotedAppletTileViewModel != null ? promotedAppletTileViewModel.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", avatar=");
            m.append(this.avatar);
            m.append(", analyticsTapEvents=");
            m.append(this.analyticsTapEvents);
            m.append(", impressionEvent=");
            m.append(this.impressionEvent);
            m.append(", promotedModel=");
            m.append(this.promotedModel);
            m.append(")");
            return m.toString();
        }
    }

    public final class V3Uninstalled implements AfterpayAppletItemViewed, AfterpayAppletTileViewModel {
        public final List analyticsTapEvents;
        public final List impressionEvent;
        public final String subtitle;
        public final String title;

        public V3Uninstalled(String str, String str2, List list, List list2) {
            this.title = str;
            this.subtitle = str2;
            this.analyticsTapEvents = list;
            this.impressionEvent = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof V3Uninstalled)) {
                return false;
            }
            V3Uninstalled v3Uninstalled = (V3Uninstalled) obj;
            return this.title.equals(v3Uninstalled.title) && this.subtitle.equals(v3Uninstalled.subtitle) && Intrinsics.areEqual(this.analyticsTapEvents, v3Uninstalled.analyticsTapEvents) && Intrinsics.areEqual(this.impressionEvent, v3Uninstalled.impressionEvent);
        }

        @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletItemViewed
        public final List getImpressionEvent() {
            return this.impressionEvent;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
            List list = this.analyticsTapEvents;
            int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.impressionEvent;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("V3Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", analyticsTapEvents=");
            m.append(this.analyticsTapEvents);
            m.append(", impressionEvent=");
            m.append(this.impressionEvent);
            m.append(")");
            return m.toString();
        }
    }
}
