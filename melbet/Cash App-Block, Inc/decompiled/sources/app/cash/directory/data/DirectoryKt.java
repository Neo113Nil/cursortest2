package app.cash.directory.data;

import app.cash.directory.data.Directory$Section;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.cash.wallet.presenters.PaymentDevicePresentationMapperKt$WhenMappings;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.p2p.profile_directory.ui.Range;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.protos.cash.whimsicard.syncentity.Action$Type$ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public abstract class DirectoryKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBorrowDeprecated.deepLinkSpecs;
    }

    public static final CardSchemeViewModel.Module.HeroTag toHeroTag(CashAppTag cashAppTag, boolean z, int i, String str, boolean z2) {
        String str2 = cashAppTag.deviceId;
        String str3 = cashAppTag.tagThemeToken;
        TagFormFactor tagFormFactor = cashAppTag.formFactor;
        Image image = cashAppTag.background;
        boolean isActive = CashAppTagKt.isActive(cashAppTag);
        boolean areEqual = Intrinsics.areEqual(cashAppTag.isLocked, Boolean.TRUE);
        boolean z3 = cashAppTag.lifecycleState == CashAppTag.TagLifecycleState.PENDING_FIRST_ACTIVATION;
        CashAppTag.PhysicalTagOrderState physicalTagOrderState = cashAppTag.tagOrderState;
        int i2 = physicalTagOrderState == null ? -1 : PaymentDevicePresentationMapperKt$WhenMappings.$EnumSwitchMapping$0[physicalTagOrderState.ordinal()];
        CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState physicalTagOrderState2 = null;
        if (i2 != -1) {
            if (i2 == 1) {
                physicalTagOrderState2 = CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.PREPARING;
            } else if (i2 == 2) {
                physicalTagOrderState2 = CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.SHIPPED;
            } else if (i2 == 3) {
                physicalTagOrderState2 = CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.PENDING_ACTIVATION;
            } else {
                if (i2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                physicalTagOrderState2 = CardSchemeViewModel.Module.HeroTag.PhysicalTagOrderState.COMPLETE;
            }
        }
        return new CardSchemeViewModel.Module.HeroTag(str2, str3, tagFormFactor, image, isActive, areEqual, z3, physicalTagOrderState2, z2, z, i, str);
    }

    public static final Directory$Section.Item.SimpleItem.ItemText toItemText(HighlightText highlightText) {
        TextStyle textStyle;
        highlightText.getClass();
        String str = highlightText.text;
        Range range = highlightText.range;
        IntRange intRange = new IntRange(range != null ? range.start : 0, range != null ? range.end : 0, 1);
        Color color = highlightText.text_color;
        com.squareup.protos.cash.p2p.profile_directory.ui.TextStyle textStyle2 = highlightText.text_style;
        if (textStyle2 != null) {
            ImageLayout.Companion companion = TextStyle.Companion;
            int i = textStyle2.value;
            companion.getClass();
            textStyle = ImageLayout.Companion.m3846fromValue(i);
        } else {
            textStyle = null;
        }
        return new Directory$Section.Item.SimpleItem.ItemText(str, color, textStyle, null, intRange, highlightText.icon, 8);
    }

    public static final PresentationAction toPresentationAction(Action action) {
        Action.ClientRouteAction clientRouteAction;
        String str;
        action.getClass();
        Action$Type$ClientRoute action$Type$ClientRoute = action.f1343type;
        if (action$Type$ClientRoute == null || (clientRouteAction = action$Type$ClientRoute.value) == null || (str = clientRouteAction.client_route_url) == null) {
            return null;
        }
        LocalizedString localizedString = action.label;
        localizedString.getClass();
        String str2 = localizedString.translated_value;
        str2.getClass();
        return new PresentationAction(str2, str);
    }

    public static final Text toText(Directory$Section.Item.SimpleItem.ItemText itemText) {
        itemText.getClass();
        return new Text(itemText.text, itemText.style, itemText.decoration, itemText.textColor, itemText.icon, 32);
    }

    public static final Directory$Section.Item.SimpleItem.ItemText toItemText(Text text) {
        text.getClass();
        return new Directory$Section.Item.SimpleItem.ItemText(text.text, text.text_color, text.text_style, text.text_decoration, null, text.icon, 16);
    }
}
