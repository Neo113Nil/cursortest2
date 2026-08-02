package com.squareup.cash.blockers.viewmodels;

import android.content.res.Resources;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.animation.BoundsAnimation$animate$1;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsSortKt;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.p2pblocking.presenters.BlocklyCustomerHelperKt$WhenMappings;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapAvatarEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.blockly.api.BlocklyCustomer;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.blockly.common.BlockType;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.appmessaging.AppMessageInAppPromoTemplate;
import com.squareup.protos.franklin.common.appmessaging.AppMessageToggleTemplate;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.GrpcStatus;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public abstract class LayoutUpdate {

    /* loaded from: classes5.dex */
    public final class PromoText extends LayoutUpdate {
        public final String promoText;

        public PromoText(String str) {
            str.getClass();
            this.promoText = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PromoText) && Intrinsics.areEqual(this.promoText, ((PromoText) obj).promoText);
        }

        public final int hashCode() {
            return this.promoText.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromoText(promoText=", this.promoText, ")");
        }
    }

    public final class Promotions extends LayoutUpdate {
        public final AppMessageInAppPromoTemplate template;
        public final String token;

        public Promotions(AppMessageInAppPromoTemplate appMessageInAppPromoTemplate, String str) {
            appMessageInAppPromoTemplate.getClass();
            str.getClass();
            this.template = appMessageInAppPromoTemplate;
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Promotions)) {
                return false;
            }
            Promotions promotions = (Promotions) obj;
            return Intrinsics.areEqual(this.template, promotions.template) && Intrinsics.areEqual(this.token, promotions.token);
        }

        public final int hashCode() {
            return this.token.hashCode() + (this.template.hashCode() * 31);
        }

        public final String toString() {
            return "Promotions(template=" + this.template + ", token=" + this.token + ")";
        }
    }

    /* loaded from: classes8.dex */
    public final class Upsell extends LayoutUpdate {
        public final AppMessageToggleTemplate template;
        public final String token;

        public Upsell(AppMessageToggleTemplate appMessageToggleTemplate, String str) {
            appMessageToggleTemplate.getClass();
            str.getClass();
            this.template = appMessageToggleTemplate;
            this.token = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Upsell)) {
                return false;
            }
            Upsell upsell = (Upsell) obj;
            return Intrinsics.areEqual(this.template, upsell.template) && Intrinsics.areEqual(this.token, upsell.token);
        }

        public final int hashCode() {
            return this.token.hashCode() + (this.template.hashCode() * 31);
        }

        public final String toString() {
            return "Upsell(template=" + this.template + ", token=" + this.token + ")";
        }
    }

    public static final boolean access$accessibilityEquals(AccessibilityAction accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        String str = accessibilityAction.label;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        Function function = accessibilityAction2.action;
        if (!Intrinsics.areEqual(str, accessibilityAction2.label)) {
            return false;
        }
        Function function2 = accessibilityAction.action;
        if (function2 != null || function == null) {
            return function2 == null || function != null;
        }
        return false;
    }

    public static final boolean access$enabled(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        return !config.props.containsKey(SemanticsProperties.Disabled);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, java.lang.Boolean.TRUE) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045 A[LOOP:0: B:11:0x0028->B:21:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[EDGE_INSN: B:22:0x004b->B:23:0x004b BREAK  A[LOOP:0: B:11:0x0028->B:21:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean access$excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        boolean z;
        boolean z2;
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        if (semanticsConfiguration.props.containsKey(SemanticsProperties.EditableText)) {
            Object obj = semanticsConfiguration.props.get(SemanticsProperties.Focused);
            if (obj == null) {
                obj = null;
            }
        }
        LayoutNode parent$ui = semanticsNode.layoutNode.getParent$ui();
        while (true) {
            if (parent$ui == null) {
                parent$ui = null;
                break;
            }
            SemanticsConfiguration semanticsConfiguration2 = parent$ui.getSemanticsConfiguration();
            if (semanticsConfiguration2 != null && semanticsConfiguration2.isMergingSemanticsOfDescendants) {
                if (semanticsConfiguration2.props.containsKey(SemanticsProperties.EditableText)) {
                    z2 = true;
                    if (!z2) {
                        break;
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
        if (parent$ui != null) {
            SemanticsConfiguration semanticsConfiguration3 = parent$ui.getSemanticsConfiguration();
            if (semanticsConfiguration3 != null) {
                Object obj2 = semanticsConfiguration3.props.get(SemanticsProperties.Focused);
                z = Intrinsics.areEqual(obj2 != null ? obj2 : null, Boolean.TRUE);
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public static final LayoutNode access$findClosestParentNode(LayoutNode layoutNode, Function1 function1) {
        for (LayoutNode parent$ui = layoutNode.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (((Boolean) function1.invoke(parent$ui)).booleanValue()) {
                return parent$ui;
            }
        }
        return null;
    }

    public static final boolean access$isRtl(SemanticsNode semanticsNode) {
        return semanticsNode.layoutNode.layoutDirection == LayoutDirection.Rtl;
    }

    public static final boolean access$isScreenReaderFocusable(SemanticsNode semanticsNode, Resources resources) {
        Object obj = semanticsNode.unmergedConfig.props.get(SemanticsProperties.ContentDescription);
        if (obj == null) {
            obj = null;
        }
        List list = (List) obj;
        return !SemanticsOwnerKt.isHidden(semanticsNode) && (semanticsNode.unmergedConfig.isMergingSemanticsOfDescendants || (semanticsNode.isUnmergedLeafNode$ui() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || getInfoText(semanticsNode) != null || getInfoStateDescriptionOrNull(semanticsNode, resources) != null || getInfoIsCheckable(semanticsNode))));
    }

    public static final boolean access$propertiesDeleted(SemanticsNode semanticsNode, SemanticsConfiguration semanticsConfiguration) {
        Iterator it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            SemanticsConfiguration config = semanticsNode.getConfig();
            if (!config.props.containsKey((SemanticsPropertyKey) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final void access$setTraversalValues(MutableIntObjectMap mutableIntObjectMap, MutableIntIntMap mutableIntIntMap, MutableIntIntMap mutableIntIntMap2, Resources resources) {
        mutableIntIntMap.clear();
        mutableIntIntMap2.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) mutableIntObjectMap.get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.semanticsNode : null;
        semanticsNode.getClass();
        ArrayList subtreeSortedByGeometryGrouping = SemanticsSortKt.subtreeSortedByGeometryGrouping(semanticsNode, new BoundsAnimation$animate$1(mutableIntObjectMap, 14), new BoundsAnimation$animate$1(resources, 15), CollectionsKt__CollectionsJVMKt.listOf(semanticsNode));
        int i = 1;
        int size = subtreeSortedByGeometryGrouping.size() - 1;
        if (1 > size) {
            return;
        }
        while (true) {
            int i2 = ((SemanticsNode) subtreeSortedByGeometryGrouping.get(i - 1)).id;
            int i3 = ((SemanticsNode) subtreeSortedByGeometryGrouping.get(i)).id;
            mutableIntIntMap.set(i2, i3);
            mutableIntIntMap2.set(i3, i2);
            if (i == size) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final String blockerNameInSubtitleEnd(BlocklyCustomer blocklyCustomer, String str, String str2, String str3, AndroidStringManager androidStringManager) {
        blocklyCustomer.getClass();
        str2.getClass();
        str3.getClass();
        BlockType blockType = blocklyCustomer.block_type;
        int i = blockType == null ? -1 : BlocklyCustomerHelperKt$WhenMappings.$EnumSwitchMapping$0[blockType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return str2.equals(str3) ? androidStringManager.get(R.string.block_list_row_subtitle_you) : str;
        }
        if (i != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str4 = blocklyCustomer.blocker_override_customer_token;
        if (Intrinsics.areEqual(str4, str3)) {
            return androidStringManager.get(R.string.block_list_row_subtitle_you);
        }
        if (str4 != null) {
            return androidStringManager.get(R.string.block_list_row_subtitle_sponsor);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Sponsor block without blocker_override_customer_token");
        return null;
    }

    public static final String firstName(String str) {
        List split$default;
        str.getClass();
        split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
        return (String) CollectionsKt.first(split$default);
    }

    public static final boolean getInfoIsCheckable(SemanticsNode semanticsNode) {
        Object obj = semanticsNode.unmergedConfig.props.get(SemanticsProperties.ToggleableState);
        if (obj == null) {
            obj = null;
        }
        ToggleableState toggleableState = (ToggleableState) obj;
        MutableScatterMap mutableScatterMap = semanticsNode.unmergedConfig.props;
        Object obj2 = mutableScatterMap.get(SemanticsProperties.Role);
        if (obj2 == null) {
            obj2 = null;
        }
        Role role = (Role) obj2;
        boolean z = toggleableState != null;
        Object obj3 = mutableScatterMap.get(SemanticsProperties.Selected);
        if (((Boolean) (obj3 != null ? obj3 : null)) == null || (role != null && role.value == 4)) {
            return z;
        }
        return true;
    }

    public static final String getInfoStateDescriptionOrNull(SemanticsNode semanticsNode, Resources resources) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        SemanticsConfiguration semanticsConfiguration2 = semanticsNode.unmergedConfig;
        Object obj = semanticsConfiguration.props.get(SemanticsProperties.StateDescription);
        String str = null;
        if (obj == null) {
            obj = null;
        }
        MutableScatterMap mutableScatterMap = semanticsConfiguration2.props;
        Object obj2 = mutableScatterMap.get(SemanticsProperties.ToggleableState);
        if (obj2 == null) {
            obj2 = null;
        }
        ToggleableState toggleableState = (ToggleableState) obj2;
        Object obj3 = mutableScatterMap.get(SemanticsProperties.Role);
        if (obj3 == null) {
            obj3 = null;
        }
        Role role = (Role) obj3;
        if (toggleableState != null) {
            int ordinal = toggleableState.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (obj == null) {
                        obj = resources.getString(R.string.indeterminate);
                    }
                } else if (role != null && role.value == 2 && obj == null) {
                    obj = resources.getString(R.string.state_off);
                }
            } else if (role != null && role.value == 2 && obj == null) {
                obj = resources.getString(R.string.state_on);
            }
        }
        Object obj4 = mutableScatterMap.get(SemanticsProperties.Selected);
        if (obj4 == null) {
            obj4 = null;
        }
        Boolean bool = (Boolean) obj4;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((role == null || role.value != 4) && obj == null) {
                obj = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object obj5 = mutableScatterMap.get(SemanticsProperties.ProgressBarRangeInfo);
        if (obj5 == null) {
            obj5 = null;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj5;
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.Indeterminate) {
                if (obj == null) {
                    ClosedFloatingPointRange closedFloatingPointRange = progressBarRangeInfo.range;
                    float f = ((ClosedFloatRange) closedFloatingPointRange)._endInclusive;
                    ClosedFloatRange closedFloatRange = (ClosedFloatRange) closedFloatingPointRange;
                    float f2 = closedFloatRange._start;
                    float f3 = f - f2 == RecyclerView.DECELERATION_RATE ? 0.0f : (progressBarRangeInfo.current - f2) / (closedFloatRange._endInclusive - f2);
                    if (f3 < RecyclerView.DECELERATION_RATE) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    obj = resources.getString(R.string.template_percent, Integer.valueOf(f3 == RecyclerView.DECELERATION_RATE ? 0 : f3 == 1.0f ? 100 : RangesKt___RangesKt.coerceIn(Math.round(f3 * 100.0f), 1, 99)));
                }
            } else if (obj == null) {
                obj = resources.getString(R.string.in_progress);
            }
        }
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.EditableText;
        if (mutableScatterMap.containsKey(semanticsPropertyKey)) {
            MutableScatterMap mutableScatterMap2 = new SemanticsNode(semanticsNode.outerSemanticsNode, true, semanticsNode.layoutNode, semanticsConfiguration2).getConfig().props;
            Object obj6 = mutableScatterMap2.get(SemanticsProperties.ContentDescription);
            if (obj6 == null) {
                obj6 = null;
            }
            Collection collection = (Collection) obj6;
            if (collection == null || collection.isEmpty()) {
                Object obj7 = mutableScatterMap2.get(SemanticsProperties.Text);
                if (obj7 == null) {
                    obj7 = null;
                }
                Collection collection2 = (Collection) obj7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object obj8 = mutableScatterMap2.get(semanticsPropertyKey);
                    if (obj8 == null) {
                        obj8 = null;
                    }
                    CharSequence charSequence = (CharSequence) obj8;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            obj = str;
        }
        return (String) obj;
    }

    public static final AnnotatedString getInfoText(SemanticsNode semanticsNode) {
        Object obj = semanticsNode.unmergedConfig.props.get(SemanticsProperties.EditableText);
        if (obj == null) {
            obj = null;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        Object obj2 = semanticsNode.unmergedConfig.props.get(SemanticsProperties.Text);
        if (obj2 == null) {
            obj2 = null;
        }
        List list = (List) obj2;
        return annotatedString == null ? list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null : annotatedString;
    }

    public static final P2PListRowModel toRowModel(BlocklyCustomer blocklyCustomer, String str, String str2, AndroidStringManager androidStringManager, String str3, boolean z, String str4) {
        String str5;
        P2PListRowTapButtonEvent tapBlockOrUnblock;
        blocklyCustomer.getClass();
        str.getClass();
        str2.getClass();
        Boolean bool = blocklyCustomer.is_blocked;
        String str6 = blocklyCustomer.blocker_override_customer_token;
        BlocklyCustomerMetadata blocklyCustomerMetadata = blocklyCustomer.metadata;
        boolean z2 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (!z && booleanValue) {
            if (!(str6 == null ? str : str6).equals(str2)) {
                z2 = true;
            }
        }
        BlockType blockType = blocklyCustomer.block_type;
        int i = blockType == null ? -1 : BlocklyCustomerHelperKt$WhenMappings.$EnumSwitchMapping$0[blockType.ordinal()];
        if (i == -1) {
            str5 = null;
        } else if (i == 1) {
            str5 = str.equals(str2) ? androidStringManager.get(R.string.block_list_unable_to_unblock_dialog_message_start_you) : str3;
        } else {
            if (i != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            if (Intrinsics.areEqual(str6, str2)) {
                str5 = androidStringManager.get(R.string.block_list_unable_to_unblock_dialog_message_start_you);
            } else {
                if (str6 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("Sponsor block without blocker_override_customer_token");
                    return null;
                }
                str5 = androidStringManager.get(R.string.block_list_unable_to_unblock_dialog_message_start_sponsor);
            }
        }
        blocklyCustomerMetadata.getClass();
        String str7 = blocklyCustomerMetadata.full_name;
        String str8 = blocklyCustomerMetadata.customer_token;
        str8.getClass();
        str7.getClass();
        str8.getClass();
        ColorModel.Accented accented = new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, str8, str7, null, null)));
        Character monogram = GrpcStatus.Companion.monogram(str7);
        String str9 = blocklyCustomerMetadata.profile_photo_url;
        StackedAvatarViewModel.Avatar avatar = new StackedAvatarViewModel.Avatar(accented, monogram, str7, str9 != null ? new Image(str9, str9, 4) : null, null, null, null, null, false, false, null, false, null, null, 131056);
        str7.getClass();
        String str10 = booleanValue ? androidStringManager.get(R.string.unblock_button_title) : androidStringManager.get(R.string.block_button_title);
        if (z2) {
            str7.getClass();
            tapBlockOrUnblock = new P2PListRowTapButtonEvent.TapDisabledUnblock(str7, str5);
        } else {
            String str11 = blocklyCustomer.flow_url;
            str11.getClass();
            str8.getClass();
            tapBlockOrUnblock = new P2PListRowTapButtonEvent.TapBlockOrUnblock(!booleanValue, str11, str8, str7);
        }
        str8.getClass();
        return new P2PListRowModel(str8, avatar, str7, str10, false, str4, (Icons) null, tapBlockOrUnblock, new P2PListRowTapAvatarEvent(str8), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
    }
}
