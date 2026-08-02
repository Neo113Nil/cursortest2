package com.google.android.gms.internal.mlkit_genai_prompt;

import android.R;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableScatterMap;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.viewmodels.LayoutUpdate;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapAvatarEvent;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.blockly.api.AllowlistCustomer;
import com.squareup.protos.cash.blockly.api.BlocklyCustomerMetadata;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import com.squareup.wire.GrpcStatus;
import kotlin.Pair;

/* loaded from: classes6.dex */
public abstract class zzage {
    public static final void addPageActions(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        SemanticsConfiguration semanticsConfiguration = semanticsNode.unmergedConfig;
        MutableScatterMap mutableScatterMap = semanticsConfiguration.props;
        Object obj = semanticsConfiguration.props.get(SemanticsProperties.Role);
        if (obj == null) {
            obj = null;
        }
        Role role = (Role) obj;
        if (LayoutUpdate.access$enabled(semanticsNode)) {
            if (role != null && role.value == 8) {
                return;
            }
            Object obj2 = mutableScatterMap.get(SemanticsActions.PageUp);
            if (obj2 == null) {
                obj2 = null;
            }
            AccessibilityAction accessibilityAction = (AccessibilityAction) obj2;
            if (accessibilityAction != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, accessibilityAction.label));
            }
            Object obj3 = mutableScatterMap.get(SemanticsActions.PageDown);
            if (obj3 == null) {
                obj3 = null;
            }
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj3;
            if (accessibilityAction2 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, accessibilityAction2.label));
            }
            Object obj4 = mutableScatterMap.get(SemanticsActions.PageLeft);
            if (obj4 == null) {
                obj4 = null;
            }
            AccessibilityAction accessibilityAction3 = (AccessibilityAction) obj4;
            if (accessibilityAction3 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageLeft, accessibilityAction3.label));
            }
            Object obj5 = mutableScatterMap.get(SemanticsActions.PageRight);
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) (obj5 != null ? obj5 : null);
            if (accessibilityAction4 != null) {
                accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageRight, accessibilityAction4.label));
            }
        }
    }

    public static final StackedAvatarViewModel.Avatar toAvatar(AllowlistCustomer allowlistCustomer) {
        allowlistCustomer.getClass();
        BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
        blocklyCustomerMetadata.getClass();
        String str = blocklyCustomerMetadata.full_name;
        str.getClass();
        String str2 = blocklyCustomerMetadata.customer_token;
        str2.getClass();
        ColorModel.Accented accented = new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, str2, str, null, null)));
        Character monogram = GrpcStatus.Companion.monogram(str);
        String str3 = blocklyCustomerMetadata.profile_photo_url;
        return new StackedAvatarViewModel.Avatar(accented, monogram, str, str3 != null ? new Image(str3, str3, 4) : null, null, null, null, null, false, false, null, false, null, null, 131056);
    }

    public static final P2PListRowModel toRowModel(AllowlistCustomer allowlistCustomer, AndroidStringManager androidStringManager, boolean z, boolean z2, boolean z3) {
        allowlistCustomer.getClass();
        Boolean bool = allowlistCustomer.is_in_allowlist;
        BlocklyCustomerMetadata blocklyCustomerMetadata = allowlistCustomer.metadata;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Pair pair = booleanValue ? new Pair(Boolean.FALSE, androidStringManager.get(com.squareup.cash.R.string.remove_button_title)) : new Pair(Boolean.TRUE, androidStringManager.get(com.squareup.cash.R.string.add_button_title));
        boolean booleanValue2 = ((Boolean) pair.first).booleanValue();
        String str = (String) pair.second;
        boolean z4 = !z || z2;
        blocklyCustomerMetadata.getClass();
        String str2 = blocklyCustomerMetadata.full_name;
        String str3 = blocklyCustomerMetadata.customer_token;
        str3.getClass();
        StackedAvatarViewModel.Avatar avatar = toAvatar(allowlistCustomer);
        str2.getClass();
        boolean z5 = booleanValue && z3;
        Icons icons = booleanValue ? Icons.SecurityCheckFill16 : null;
        Cashtag cashtag = blocklyCustomerMetadata.cashtag;
        String m$1 = cashtag != null ? Recorder$$ExternalSyntheticOutline2.m$1(cashtag.prefix, cashtag.name) : "";
        str3.getClass();
        str2.getClass();
        P2PListRowTapButtonEvent.TapAddOrRemove tapAddOrRemove = z4 ? new P2PListRowTapButtonEvent.TapAddOrRemove(LayoutUpdate.firstName(str2), !booleanValue, str3, z3, allowlistCustomer) : null;
        str3.getClass();
        return new P2PListRowModel(str3, avatar, str2, str, booleanValue2, z5, m$1, icons, tapAddOrRemove, new P2PListRowTapAvatarEvent(str3));
    }
}
