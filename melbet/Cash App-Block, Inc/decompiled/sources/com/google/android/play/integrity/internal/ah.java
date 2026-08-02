package com.google.android.play.integrity.internal;

import android.util.Base64;
import android.view.View;
import coil3.request.ViewTargetRequestManagerKt;
import coil3.size.ViewSizeResolverKt;
import coil3.svg.internal.Utils_androidKt;
import coil3.transform.TransformationsKt;
import com.google.android.gms.internal.mlkit_vision_common.zzbc;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.google.android.play.core.splitinstall.internal.zzj;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.genericelements.presenters.mappers.GenericBaseType;
import com.squareup.cash.genericelements.presenters.mappers.GenericComponentType;
import com.squareup.cash.genericelements.presenters.mappers.GenericTreeElementsMapperKt$WhenMappings;
import com.squareup.cash.genericelements.viewmodels.DividerComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellActivityViewModel$Accessory$Amount;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellActivityViewModel$Accessory$Push;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellDefaultViewModel$Accessory$Push;
import com.squareup.cash.genericelements.viewmodels.GenericContainerViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.genericelements.viewmodels.IconTextDetailViewModel;
import com.squareup.cash.genericelements.viewmodels.IconViewModel;
import com.squareup.cash.genericelements.viewmodels.PillTextViewModel;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon;
import com.squareup.protos.cash.genericelements.ui.ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage;
import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.genericelements.ui.AvatarElement;
import com.squareup.protos.cash.genericelements.ui.BaseCardComponent;
import com.squareup.protos.cash.genericelements.ui.BaseElement;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$ArcadeBadgedAvatar;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$ArcadeButton;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$ArcadeText;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$Avatar;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$BetweenSectionSpacer;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$BlankDivider;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$CopyCode;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$IconButton;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$IconTextElement;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$Image;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$PillTextElement;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$Progress;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$Text;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$TextButton;
import com.squareup.protos.cash.genericelements.ui.BaseElement$Element$WithinSectionSpacer;
import com.squareup.protos.cash.genericelements.ui.BetweenSectionSpacer;
import com.squareup.protos.cash.genericelements.ui.BlankDividerComponent;
import com.squareup.protos.cash.genericelements.ui.BlankDividerElement;
import com.squareup.protos.cash.genericelements.ui.Button$IconButtonElement;
import com.squareup.protos.cash.genericelements.ui.Button$TextButtonElement;
import com.squareup.protos.cash.genericelements.ui.Button$Type;
import com.squareup.protos.cash.genericelements.ui.ButtonCtaGroupComponent;
import com.squareup.protos.cash.genericelements.ui.CellActivityComponent;
import com.squareup.protos.cash.genericelements.ui.CellActivityComponent$AccessoryType$Amount;
import com.squareup.protos.cash.genericelements.ui.CellActivityComponent$AccessoryType$Push;
import com.squareup.protos.cash.genericelements.ui.CellDefaultComponent;
import com.squareup.protos.cash.genericelements.ui.CellDefaultComponent$AccessoryType$Push;
import com.squareup.protos.cash.genericelements.ui.CellDefaultComponent$AccessoryType$PushLabel;
import com.squareup.protos.cash.genericelements.ui.ColumnWidth;
import com.squareup.protos.cash.genericelements.ui.CompactCardComponent;
import com.squareup.protos.cash.genericelements.ui.CompactInfoComponent;
import com.squareup.protos.cash.genericelements.ui.ComponentElement;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$BaseCard;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$BlankDivider;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$ButtonCtaGroup;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$CellActivity;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$CellDefault;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$ColumnedRow;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$CompactCard;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$CompactInfo;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$DetailedCard;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$FullWidth;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$LineDivider;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$ListUnordered;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$SectionHeader;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$TwoColumnCard;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$TwoColumnRow;
import com.squareup.protos.cash.genericelements.ui.ComponentElement$Element$ValueUnit;
import com.squareup.protos.cash.genericelements.ui.ContainerElement;
import com.squareup.protos.cash.genericelements.ui.CopyCodeElement;
import com.squareup.protos.cash.genericelements.ui.DetailedCardComponent;
import com.squareup.protos.cash.genericelements.ui.FullWidthComponent;
import com.squareup.protos.cash.genericelements.ui.IconTextDetailElement;
import com.squareup.protos.cash.genericelements.ui.ImageElement;
import com.squareup.protos.cash.genericelements.ui.LineDividerComponent;
import com.squareup.protos.cash.genericelements.ui.ListUnorderedComponent;
import com.squareup.protos.cash.genericelements.ui.PillTextElement;
import com.squareup.protos.cash.genericelements.ui.ProgressMeterElement;
import com.squareup.protos.cash.genericelements.ui.SectionHeaderComponent;
import com.squareup.protos.cash.genericelements.ui.SemanticBackgroundColor;
import com.squareup.protos.cash.genericelements.ui.Size;
import com.squareup.protos.cash.genericelements.ui.StyleAttributes;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.squareup.protos.cash.genericelements.ui.TwoColumnCardComponent;
import com.squareup.protos.cash.genericelements.ui.TwoColumnComponent;
import com.squareup.protos.cash.genericelements.ui.TwoColumnRowComponent;
import com.squareup.protos.cash.genericelements.ui.ValueUnitComponent;
import com.squareup.protos.cash.genericelements.ui.VerticalAlignment;
import com.squareup.protos.cash.genericelements.ui.WithinSectionSpacer;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.withpersona.sdk2.inquiry.shared.ui.OneShotPreDrawListenerWithDiscardedFrame;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class ah {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final void addOneShotPreDrawListenerAndDiscardFrame(View view, Function0 function0) {
        view.getClass();
        OneShotPreDrawListenerWithDiscardedFrame oneShotPreDrawListenerWithDiscardedFrame = new OneShotPreDrawListenerWithDiscardedFrame(view, new P5$$ExternalSyntheticLambda0(10, function0));
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListenerWithDiscardedFrame);
        view.addOnAttachStateChangeListener(oneShotPreDrawListenerWithDiscardedFrame);
    }

    public static final Pair toContainerMargins(ContainerElement.Margin margin) {
        if (margin == null) {
            GenericContainerViewModel.ContainerMargin containerMargin = GenericContainerViewModel.ContainerMargin.NONE;
            return new Pair(containerMargin, containerMargin);
        }
        ContainerElement.Margin.MarginSize marginSize = margin.left;
        GenericContainerViewModel.ContainerMargin containerMargins$toContainerMargin = marginSize != null ? toContainerMargins$toContainerMargin(marginSize) : GenericContainerViewModel.ContainerMargin.NONE;
        ContainerElement.Margin.MarginSize marginSize2 = margin.right;
        return new Pair(containerMargins$toContainerMargin, marginSize2 != null ? toContainerMargins$toContainerMargin(marginSize2) : GenericContainerViewModel.ContainerMargin.NONE);
    }

    public static final GenericContainerViewModel.ContainerMargin toContainerMargins$toContainerMargin(ContainerElement.Margin.MarginSize marginSize) {
        int ordinal = marginSize.ordinal();
        if (ordinal == 0) {
            return GenericContainerViewModel.ContainerMargin.SMALL;
        }
        if (ordinal == 1) {
            return GenericContainerViewModel.ContainerMargin.MEDIUM;
        }
        if (ordinal == 2) {
            return GenericContainerViewModel.ContainerMargin.LARGE;
        }
        if (ordinal == 3) {
            return GenericContainerViewModel.ContainerMargin.MEDIUM;
        }
        if (ordinal == 4) {
            return GenericContainerViewModel.ContainerMargin.XLARGE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ad  */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellDefaultViewModel$Accessory$Push] */
    /* JADX WARN: Type inference failed for: r1v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GenericComponentViewModel toViewModel(ComponentElement componentElement) {
        TwoColumnComponent twoColumnComponent;
        FullWidthComponent fullWidthComponent;
        BaseCardComponent baseCardComponent;
        DetailedCardComponent detailedCardComponent;
        ValueUnitComponent valueUnitComponent;
        CompactCardComponent compactCardComponent;
        LineDividerComponent lineDividerComponent;
        BlankDividerComponent blankDividerComponent;
        CompactInfoComponent compactInfoComponent;
        TwoColumnCardComponent twoColumnCardComponent;
        TwoColumnRowComponent twoColumnRowComponent;
        SectionHeaderComponent sectionHeaderComponent;
        CellActivityComponent cellActivityComponent;
        CellDefaultComponent cellDefaultComponent;
        ListUnorderedComponent listUnorderedComponent;
        ButtonCtaGroupComponent buttonCtaGroupComponent;
        GenericComponentType genericComponentType;
        DividerComponentViewModel.BlankDividerViewModel.Size size;
        GenericComponentViewModel.TwoColumnCardViewModel.Spacing spacing;
        Boolean bool;
        Color color;
        GenericComponentViewModel.TwoColumnRowViewModel.Spacing spacing2;
        GenericComponentViewModel.TwoColumnRowViewModel.Spacing spacing3;
        boolean z;
        String str;
        aj ajVar;
        Boolean bool2;
        String str2;
        GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush genericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush;
        CellDefaultComponent.Type type2;
        AnalyticsEvent analyticsEvent = componentElement.view_event;
        TransformationsKt transformationsKt = componentElement.element;
        ?? r1 = 0;
        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent = analyticsEvent != null ? new GenericTreeElementsViewEvent.ViewAnalyticsEvent(zzi.toAnalyticsData(analyticsEvent)) : null;
        if (transformationsKt != null) {
            ComponentElement$Element$ColumnedRow componentElement$Element$ColumnedRow = transformationsKt instanceof ComponentElement$Element$ColumnedRow ? (ComponentElement$Element$ColumnedRow) transformationsKt : null;
            if (componentElement$Element$ColumnedRow != null) {
                twoColumnComponent = componentElement$Element$ColumnedRow.value;
                if (twoColumnComponent == null) {
                    genericComponentType = GenericComponentType.TWO_COLUMN;
                } else {
                    if (transformationsKt != null) {
                        ComponentElement$Element$FullWidth componentElement$Element$FullWidth = transformationsKt instanceof ComponentElement$Element$FullWidth ? (ComponentElement$Element$FullWidth) transformationsKt : null;
                        if (componentElement$Element$FullWidth != null) {
                            fullWidthComponent = componentElement$Element$FullWidth.value;
                            if (fullWidthComponent == null) {
                                genericComponentType = GenericComponentType.FULL_WIDTH;
                            } else {
                                if (transformationsKt != null) {
                                    ComponentElement$Element$BaseCard componentElement$Element$BaseCard = transformationsKt instanceof ComponentElement$Element$BaseCard ? (ComponentElement$Element$BaseCard) transformationsKt : null;
                                    if (componentElement$Element$BaseCard != null) {
                                        baseCardComponent = componentElement$Element$BaseCard.value;
                                        if (baseCardComponent == null) {
                                            genericComponentType = GenericComponentType.BASE_CARD;
                                        } else {
                                            if (transformationsKt != null) {
                                                ComponentElement$Element$DetailedCard componentElement$Element$DetailedCard = transformationsKt instanceof ComponentElement$Element$DetailedCard ? (ComponentElement$Element$DetailedCard) transformationsKt : null;
                                                if (componentElement$Element$DetailedCard != null) {
                                                    detailedCardComponent = componentElement$Element$DetailedCard.value;
                                                    if (detailedCardComponent == null) {
                                                        genericComponentType = GenericComponentType.DETAILED_CARD;
                                                    } else {
                                                        if (transformationsKt != null) {
                                                            ComponentElement$Element$ValueUnit componentElement$Element$ValueUnit = transformationsKt instanceof ComponentElement$Element$ValueUnit ? (ComponentElement$Element$ValueUnit) transformationsKt : null;
                                                            if (componentElement$Element$ValueUnit != null) {
                                                                valueUnitComponent = componentElement$Element$ValueUnit.value;
                                                                if (valueUnitComponent == null) {
                                                                    genericComponentType = GenericComponentType.VALUE_UNIT;
                                                                } else {
                                                                    if (transformationsKt != null) {
                                                                        ComponentElement$Element$CompactCard componentElement$Element$CompactCard = transformationsKt instanceof ComponentElement$Element$CompactCard ? (ComponentElement$Element$CompactCard) transformationsKt : null;
                                                                        if (componentElement$Element$CompactCard != null) {
                                                                            compactCardComponent = componentElement$Element$CompactCard.value;
                                                                            if (compactCardComponent == null) {
                                                                                genericComponentType = GenericComponentType.COMPACT_CARD;
                                                                            } else {
                                                                                if (transformationsKt != null) {
                                                                                    ComponentElement$Element$LineDivider componentElement$Element$LineDivider = transformationsKt instanceof ComponentElement$Element$LineDivider ? (ComponentElement$Element$LineDivider) transformationsKt : null;
                                                                                    if (componentElement$Element$LineDivider != null) {
                                                                                        lineDividerComponent = componentElement$Element$LineDivider.value;
                                                                                        if (lineDividerComponent == null) {
                                                                                            genericComponentType = GenericComponentType.LINE_DIVIDER;
                                                                                        } else {
                                                                                            if (transformationsKt != null) {
                                                                                                ComponentElement$Element$BlankDivider componentElement$Element$BlankDivider = transformationsKt instanceof ComponentElement$Element$BlankDivider ? (ComponentElement$Element$BlankDivider) transformationsKt : null;
                                                                                                if (componentElement$Element$BlankDivider != null) {
                                                                                                    blankDividerComponent = componentElement$Element$BlankDivider.value;
                                                                                                    if (blankDividerComponent == null) {
                                                                                                        genericComponentType = GenericComponentType.BLANK_DIVIDER;
                                                                                                    } else {
                                                                                                        if (transformationsKt != null) {
                                                                                                            ComponentElement$Element$CompactInfo componentElement$Element$CompactInfo = transformationsKt instanceof ComponentElement$Element$CompactInfo ? (ComponentElement$Element$CompactInfo) transformationsKt : null;
                                                                                                            if (componentElement$Element$CompactInfo != null) {
                                                                                                                compactInfoComponent = componentElement$Element$CompactInfo.value;
                                                                                                                if (compactInfoComponent == null) {
                                                                                                                    genericComponentType = GenericComponentType.COMPACT_INFO;
                                                                                                                } else {
                                                                                                                    if (transformationsKt != null) {
                                                                                                                        ComponentElement$Element$TwoColumnCard componentElement$Element$TwoColumnCard = transformationsKt instanceof ComponentElement$Element$TwoColumnCard ? (ComponentElement$Element$TwoColumnCard) transformationsKt : null;
                                                                                                                        if (componentElement$Element$TwoColumnCard != null) {
                                                                                                                            twoColumnCardComponent = componentElement$Element$TwoColumnCard.value;
                                                                                                                            if (twoColumnCardComponent == null) {
                                                                                                                                genericComponentType = GenericComponentType.TWO_COLUMN_CARD;
                                                                                                                            } else {
                                                                                                                                if (transformationsKt != null) {
                                                                                                                                    ComponentElement$Element$TwoColumnRow componentElement$Element$TwoColumnRow = transformationsKt instanceof ComponentElement$Element$TwoColumnRow ? (ComponentElement$Element$TwoColumnRow) transformationsKt : null;
                                                                                                                                    if (componentElement$Element$TwoColumnRow != null) {
                                                                                                                                        twoColumnRowComponent = componentElement$Element$TwoColumnRow.value;
                                                                                                                                        if (twoColumnRowComponent == null) {
                                                                                                                                            genericComponentType = GenericComponentType.TWO_COLUMN_ROW;
                                                                                                                                        } else {
                                                                                                                                            if (transformationsKt != null) {
                                                                                                                                                ComponentElement$Element$SectionHeader componentElement$Element$SectionHeader = transformationsKt instanceof ComponentElement$Element$SectionHeader ? (ComponentElement$Element$SectionHeader) transformationsKt : null;
                                                                                                                                                if (componentElement$Element$SectionHeader != null) {
                                                                                                                                                    sectionHeaderComponent = componentElement$Element$SectionHeader.value;
                                                                                                                                                    if (sectionHeaderComponent == null) {
                                                                                                                                                        genericComponentType = GenericComponentType.SECTION_HEADER;
                                                                                                                                                    } else {
                                                                                                                                                        if (transformationsKt != null) {
                                                                                                                                                            ComponentElement$Element$CellActivity componentElement$Element$CellActivity = transformationsKt instanceof ComponentElement$Element$CellActivity ? (ComponentElement$Element$CellActivity) transformationsKt : null;
                                                                                                                                                            if (componentElement$Element$CellActivity != null) {
                                                                                                                                                                cellActivityComponent = componentElement$Element$CellActivity.value;
                                                                                                                                                                if (cellActivityComponent == null) {
                                                                                                                                                                    genericComponentType = GenericComponentType.CELL_ACTIVITY;
                                                                                                                                                                } else {
                                                                                                                                                                    if (transformationsKt != null) {
                                                                                                                                                                        ComponentElement$Element$CellDefault componentElement$Element$CellDefault = transformationsKt instanceof ComponentElement$Element$CellDefault ? (ComponentElement$Element$CellDefault) transformationsKt : null;
                                                                                                                                                                        if (componentElement$Element$CellDefault != null) {
                                                                                                                                                                            cellDefaultComponent = componentElement$Element$CellDefault.value;
                                                                                                                                                                            if (cellDefaultComponent == null) {
                                                                                                                                                                                genericComponentType = GenericComponentType.CELL_DEFAULT;
                                                                                                                                                                            } else {
                                                                                                                                                                                if (transformationsKt != null) {
                                                                                                                                                                                    ComponentElement$Element$ListUnordered componentElement$Element$ListUnordered = transformationsKt instanceof ComponentElement$Element$ListUnordered ? (ComponentElement$Element$ListUnordered) transformationsKt : null;
                                                                                                                                                                                    if (componentElement$Element$ListUnordered != null) {
                                                                                                                                                                                        listUnorderedComponent = componentElement$Element$ListUnordered.value;
                                                                                                                                                                                        if (listUnorderedComponent == null) {
                                                                                                                                                                                            genericComponentType = GenericComponentType.LIST_UNORDERED;
                                                                                                                                                                                        } else {
                                                                                                                                                                                            if (transformationsKt != null) {
                                                                                                                                                                                                ComponentElement$Element$ButtonCtaGroup componentElement$Element$ButtonCtaGroup = transformationsKt instanceof ComponentElement$Element$ButtonCtaGroup ? (ComponentElement$Element$ButtonCtaGroup) transformationsKt : null;
                                                                                                                                                                                                if (componentElement$Element$ButtonCtaGroup != null) {
                                                                                                                                                                                                    buttonCtaGroupComponent = componentElement$Element$ButtonCtaGroup.value;
                                                                                                                                                                                                    genericComponentType = buttonCtaGroupComponent == null ? GenericComponentType.BUTTON_CTA_GROUP : null;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            buttonCtaGroupComponent = null;
                                                                                                                                                                                            if (buttonCtaGroupComponent == null) {
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                listUnorderedComponent = null;
                                                                                                                                                                                if (listUnorderedComponent == null) {
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    cellDefaultComponent = null;
                                                                                                                                                                    if (cellDefaultComponent == null) {
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        cellActivityComponent = null;
                                                                                                                                                        if (cellActivityComponent == null) {
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            sectionHeaderComponent = null;
                                                                                                                                            if (sectionHeaderComponent == null) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                twoColumnRowComponent = null;
                                                                                                                                if (twoColumnRowComponent == null) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    twoColumnCardComponent = null;
                                                                                                                    if (twoColumnCardComponent == null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        compactInfoComponent = null;
                                                                                                        if (compactInfoComponent == null) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            blankDividerComponent = null;
                                                                                            if (blankDividerComponent == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                lineDividerComponent = null;
                                                                                if (lineDividerComponent == null) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    compactCardComponent = null;
                                                                    if (compactCardComponent == null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        valueUnitComponent = null;
                                                        if (valueUnitComponent == null) {
                                                        }
                                                    }
                                                }
                                            }
                                            detailedCardComponent = null;
                                            if (detailedCardComponent == null) {
                                            }
                                        }
                                    }
                                }
                                baseCardComponent = null;
                                if (baseCardComponent == null) {
                                }
                            }
                        }
                    }
                    fullWidthComponent = null;
                    if (fullWidthComponent == null) {
                    }
                }
                switch (genericComponentType != null ? -1 : GenericTreeElementsMapperKt$WhenMappings.$EnumSwitchMapping$2[genericComponentType.ordinal()]) {
                    case -1:
                        return null;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent2 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$ColumnedRow componentElement$Element$ColumnedRow2 = transformationsKt instanceof ComponentElement$Element$ColumnedRow ? (ComponentElement$Element$ColumnedRow) transformationsKt : null;
                        TwoColumnComponent twoColumnComponent2 = componentElement$Element$ColumnedRow2 != null ? componentElement$Element$ColumnedRow2.value : null;
                        twoColumnComponent2.getClass();
                        return toViewModel(twoColumnComponent2, viewAnalyticsEvent2);
                    case 2:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent3 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$FullWidth componentElement$Element$FullWidth2 = transformationsKt instanceof ComponentElement$Element$FullWidth ? (ComponentElement$Element$FullWidth) transformationsKt : null;
                        FullWidthComponent fullWidthComponent2 = componentElement$Element$FullWidth2 != null ? componentElement$Element$FullWidth2.value : null;
                        fullWidthComponent2.getClass();
                        BaseElement baseElement = fullWidthComponent2.element;
                        baseElement.getClass();
                        GenericBaseViewModel viewModel = toViewModel(baseElement);
                        viewModel.getClass();
                        return new GenericComponentViewModel.FullWidthViewModel(viewModel, viewAnalyticsEvent3);
                    case 3:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent4 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$DetailedCard componentElement$Element$DetailedCard2 = transformationsKt instanceof ComponentElement$Element$DetailedCard ? (ComponentElement$Element$DetailedCard) transformationsKt : null;
                        DetailedCardComponent detailedCardComponent2 = componentElement$Element$DetailedCard2 != null ? componentElement$Element$DetailedCard2.value : null;
                        detailedCardComponent2.getClass();
                        TwoColumnComponent twoColumnComponent3 = detailedCardComponent2.header;
                        StyleAttributes styleAttributes = detailedCardComponent2.style_attributes;
                        GenericComponentViewModel.TwoColumnViewModel viewModel2 = twoColumnComponent3 != null ? toViewModel(twoColumnComponent3, null) : null;
                        BaseElement baseElement2 = detailedCardComponent2.title;
                        GenericBaseViewModel viewModel3 = baseElement2 != null ? toViewModel(baseElement2) : null;
                        BaseElement baseElement3 = detailedCardComponent2.body;
                        GenericBaseViewModel viewModel4 = baseElement3 != null ? toViewModel(baseElement3) : null;
                        styleAttributes.getClass();
                        Color color2 = styleAttributes.background_color;
                        color2.getClass();
                        ColorModel.Accented accented = new ColorModel.Accented(color2);
                        Boolean bool3 = styleAttributes.show_drop_shadow;
                        boolean booleanValue = bool3 != null ? bool3.booleanValue() : false;
                        Action action = detailedCardComponent2.tap;
                        return new GenericComponentViewModel.DetailedCardViewModel(viewModel2, viewModel3, viewModel4, accented, booleanValue, action != null ? zzj.toViewEvent(action) : null, viewAnalyticsEvent4);
                    case 4:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent5 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$ValueUnit componentElement$Element$ValueUnit2 = transformationsKt instanceof ComponentElement$Element$ValueUnit ? (ComponentElement$Element$ValueUnit) transformationsKt : null;
                        ValueUnitComponent valueUnitComponent2 = componentElement$Element$ValueUnit2 != null ? componentElement$Element$ValueUnit2.value : null;
                        valueUnitComponent2.getClass();
                        TextElement textElement = valueUnitComponent2.numerical_value;
                        textElement.getClass();
                        GenericBaseViewModel.TextViewModel viewModel5 = toViewModel(textElement);
                        TextElement textElement2 = valueUnitComponent2.unit_description;
                        textElement2.getClass();
                        return new GenericComponentViewModel.ValueUnitViewModel(viewModel5, toViewModel(textElement2), viewAnalyticsEvent5);
                    case 5:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent6 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$CompactCard componentElement$Element$CompactCard2 = transformationsKt instanceof ComponentElement$Element$CompactCard ? (ComponentElement$Element$CompactCard) transformationsKt : null;
                        CompactCardComponent compactCardComponent2 = componentElement$Element$CompactCard2 != null ? componentElement$Element$CompactCard2.value : null;
                        compactCardComponent2.getClass();
                        TwoColumnComponent twoColumnComponent4 = compactCardComponent2.header;
                        StyleAttributes styleAttributes2 = compactCardComponent2.attributes;
                        GenericComponentViewModel.TwoColumnViewModel viewModel6 = twoColumnComponent4 != null ? toViewModel(twoColumnComponent4, null) : null;
                        TextElement textElement3 = compactCardComponent2.description;
                        GenericBaseViewModel.TextViewModel viewModel7 = textElement3 != null ? toViewModel(textElement3) : null;
                        styleAttributes2.getClass();
                        Color color3 = styleAttributes2.background_color;
                        color3.getClass();
                        ColorModel.Accented accented2 = new ColorModel.Accented(color3);
                        Boolean bool4 = styleAttributes2.show_drop_shadow;
                        boolean booleanValue2 = bool4 != null ? bool4.booleanValue() : false;
                        Action action2 = compactCardComponent2.tap;
                        return new GenericComponentViewModel.CompactCardViewModel(viewModel6, viewModel7, accented2, booleanValue2, action2 != null ? zzj.toViewEvent(action2) : null, viewAnalyticsEvent6);
                    case 6:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent7 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$BaseCard componentElement$Element$BaseCard2 = transformationsKt instanceof ComponentElement$Element$BaseCard ? (ComponentElement$Element$BaseCard) transformationsKt : null;
                        BaseCardComponent baseCardComponent2 = componentElement$Element$BaseCard2 != null ? componentElement$Element$BaseCard2.value : null;
                        baseCardComponent2.getClass();
                        List list = baseCardComponent2.elements;
                        StyleAttributes styleAttributes3 = baseCardComponent2.style_attributes;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            GenericBaseViewModel viewModel8 = toViewModel((BaseElement) it.next());
                            if (viewModel8 != null) {
                                arrayList.add(viewModel8);
                            }
                        }
                        styleAttributes3.getClass();
                        Color color4 = styleAttributes3.background_color;
                        color4.getClass();
                        ColorModel.Accented accented3 = new ColorModel.Accented(color4);
                        Boolean bool5 = styleAttributes3.show_drop_shadow;
                        boolean booleanValue3 = bool5 != null ? bool5.booleanValue() : false;
                        Action action3 = baseCardComponent2.tap;
                        return new GenericComponentViewModel.BaseCardViewModel(arrayList, accented3, booleanValue3, action3 != null ? zzj.toViewEvent(action3) : null, viewAnalyticsEvent7);
                    case 7:
                        transformationsKt.getClass();
                        ComponentElement$Element$LineDivider componentElement$Element$LineDivider2 = transformationsKt instanceof ComponentElement$Element$LineDivider ? (ComponentElement$Element$LineDivider) transformationsKt : null;
                        LineDividerComponent lineDividerComponent2 = componentElement$Element$LineDivider2 != null ? componentElement$Element$LineDivider2.value : null;
                        lineDividerComponent2.getClass();
                        Boolean bool6 = lineDividerComponent2.use_padding;
                        return new DividerComponentViewModel.LineDividerViewModel(bool6 != null ? bool6.booleanValue() : false);
                    case 8:
                        transformationsKt.getClass();
                        ComponentElement$Element$BlankDivider componentElement$Element$BlankDivider2 = transformationsKt instanceof ComponentElement$Element$BlankDivider ? (ComponentElement$Element$BlankDivider) transformationsKt : null;
                        BlankDividerComponent blankDividerComponent2 = componentElement$Element$BlankDivider2 != null ? componentElement$Element$BlankDivider2.value : null;
                        blankDividerComponent2.getClass();
                        BlankDividerComponent.Size size2 = blankDividerComponent2.size;
                        size2.getClass();
                        int ordinal = size2.ordinal();
                        if (ordinal == 0) {
                            size = DividerComponentViewModel.BlankDividerViewModel.Size.SMALL;
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            size = DividerComponentViewModel.BlankDividerViewModel.Size.LARGE;
                        }
                        return new DividerComponentViewModel.BlankDividerViewModel(size);
                    case 9:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent8 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$CompactInfo componentElement$Element$CompactInfo2 = transformationsKt instanceof ComponentElement$Element$CompactInfo ? (ComponentElement$Element$CompactInfo) transformationsKt : null;
                        CompactInfoComponent compactInfoComponent2 = componentElement$Element$CompactInfo2 != null ? componentElement$Element$CompactInfo2.value : null;
                        compactInfoComponent2.getClass();
                        TwoColumnComponent twoColumnComponent5 = compactInfoComponent2.header;
                        GenericComponentViewModel.TwoColumnViewModel viewModel9 = twoColumnComponent5 != null ? toViewModel(twoColumnComponent5, null) : null;
                        TextElement textElement4 = compactInfoComponent2.description;
                        return new GenericComponentViewModel.CompactInfoViewModel(viewModel9, textElement4 != null ? toViewModel(textElement4) : null, viewAnalyticsEvent8);
                    case 10:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent9 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$TwoColumnCard componentElement$Element$TwoColumnCard2 = transformationsKt instanceof ComponentElement$Element$TwoColumnCard ? (ComponentElement$Element$TwoColumnCard) transformationsKt : null;
                        TwoColumnCardComponent twoColumnCardComponent2 = componentElement$Element$TwoColumnCard2 != null ? componentElement$Element$TwoColumnCard2.value : null;
                        twoColumnCardComponent2.getClass();
                        TwoColumnComponent twoColumnComponent6 = twoColumnCardComponent2.header;
                        StyleAttributes styleAttributes4 = twoColumnCardComponent2.style_attributes;
                        GenericComponentViewModel.TwoColumnViewModel viewModel10 = twoColumnComponent6 != null ? toViewModel(twoColumnComponent6, null) : null;
                        List list2 = twoColumnCardComponent2.left;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(toViewModel((BaseElement) it2.next()));
                        }
                        List list3 = twoColumnCardComponent2.right;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(toViewModel((BaseElement) it3.next()));
                        }
                        ColumnWidth columnWidth = twoColumnCardComponent2.column_width;
                        if (columnWidth == null) {
                            columnWidth = ColumnWidth.FIT_RIGHT;
                        }
                        ColorModel.Accented accented4 = (styleAttributes4 == null || (color = styleAttributes4.background_color) == null) ? null : new ColorModel.Accented(color);
                        if (styleAttributes4 != null && (bool = styleAttributes4.show_drop_shadow) != null) {
                            r4 = bool.booleanValue();
                        }
                        boolean z2 = r4;
                        TwoColumnCardComponent.Spacing spacing4 = twoColumnCardComponent2.spacing_between;
                        if (spacing4 != null) {
                            int ordinal2 = spacing4.ordinal();
                            if (ordinal2 == 0) {
                                spacing = GenericComponentViewModel.TwoColumnCardViewModel.Spacing.SMALL;
                            } else {
                                if (ordinal2 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                spacing = GenericComponentViewModel.TwoColumnCardViewModel.Spacing.LARGE;
                            }
                        } else {
                            spacing = null;
                        }
                        VerticalAlignment verticalAlignment = twoColumnCardComponent2.vertical_alignment;
                        if (verticalAlignment == null) {
                            verticalAlignment = VerticalAlignment.TOP;
                        }
                        VerticalAlignment verticalAlignment2 = verticalAlignment;
                        Action action4 = twoColumnCardComponent2.action;
                        return new GenericComponentViewModel.TwoColumnCardViewModel(viewModel10, arrayList2, arrayList3, columnWidth, accented4, z2, spacing, verticalAlignment2, action4 != null ? zzj.toViewEvent(action4) : null, viewAnalyticsEvent9);
                    case 11:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent10 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$TwoColumnRow componentElement$Element$TwoColumnRow2 = transformationsKt instanceof ComponentElement$Element$TwoColumnRow ? (ComponentElement$Element$TwoColumnRow) transformationsKt : null;
                        TwoColumnRowComponent twoColumnRowComponent2 = componentElement$Element$TwoColumnRow2 != null ? componentElement$Element$TwoColumnRow2.value : null;
                        twoColumnRowComponent2.getClass();
                        List list4 = twoColumnRowComponent2.left;
                        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList4.add(toViewModel((BaseElement) it4.next()));
                        }
                        List list5 = twoColumnRowComponent2.right;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                        Iterator it5 = list5.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(toViewModel((BaseElement) it5.next()));
                        }
                        ColumnWidth columnWidth2 = twoColumnRowComponent2.column_width;
                        if (columnWidth2 == null) {
                            columnWidth2 = ColumnWidth.FIT_RIGHT;
                        }
                        ColumnWidth columnWidth3 = columnWidth2;
                        TwoColumnRowComponent.Spacing spacing5 = twoColumnRowComponent2.spacing_between;
                        if (spacing5 != null) {
                            int ordinal3 = spacing5.ordinal();
                            if (ordinal3 == 0) {
                                spacing3 = GenericComponentViewModel.TwoColumnRowViewModel.Spacing.SMALL;
                            } else {
                                if (ordinal3 != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                spacing3 = GenericComponentViewModel.TwoColumnRowViewModel.Spacing.LARGE;
                            }
                            spacing2 = spacing3;
                        } else {
                            spacing2 = null;
                        }
                        VerticalAlignment verticalAlignment3 = twoColumnRowComponent2.vertical_alignment;
                        if (verticalAlignment3 == null) {
                            verticalAlignment3 = VerticalAlignment.TOP;
                        }
                        VerticalAlignment verticalAlignment4 = verticalAlignment3;
                        Action action5 = twoColumnRowComponent2.action;
                        return new GenericComponentViewModel.TwoColumnRowViewModel(arrayList4, arrayList5, columnWidth3, spacing2, verticalAlignment4, action5 != null ? zzj.toViewEvent(action5) : null, viewAnalyticsEvent10);
                    case 12:
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent11 = viewAnalyticsEvent;
                        transformationsKt.getClass();
                        ComponentElement$Element$SectionHeader componentElement$Element$SectionHeader2 = transformationsKt instanceof ComponentElement$Element$SectionHeader ? (ComponentElement$Element$SectionHeader) transformationsKt : null;
                        SectionHeaderComponent sectionHeaderComponent2 = componentElement$Element$SectionHeader2 != null ? componentElement$Element$SectionHeader2.value : null;
                        sectionHeaderComponent2.getClass();
                        String str3 = sectionHeaderComponent2.title;
                        str3.getClass();
                        String str4 = sectionHeaderComponent2.actionText;
                        String str5 = sectionHeaderComponent2.body;
                        Action action6 = sectionHeaderComponent2.onActionClick;
                        return new GenericComponentViewModel.SectionHeaderViewModel(str3, str4, action6 != null ? zzj.toViewEvent(action6) : null, str5, viewAnalyticsEvent11);
                    case 13:
                        transformationsKt.getClass();
                        ComponentElement$Element$CellActivity componentElement$Element$CellActivity2 = transformationsKt instanceof ComponentElement$Element$CellActivity ? (ComponentElement$Element$CellActivity) transformationsKt : null;
                        CellActivityComponent cellActivityComponent2 = componentElement$Element$CellActivity2 != null ? componentElement$Element$CellActivity2.value : null;
                        cellActivityComponent2.getClass();
                        BaseElement baseElement4 = cellActivityComponent2.avatar;
                        ViewSizeResolverKt viewSizeResolverKt = cellActivityComponent2.accessoryType;
                        GenericBaseViewModel viewModel11 = baseElement4 != null ? toViewModel(baseElement4) : null;
                        if (viewSizeResolverKt != null) {
                            CellActivityComponent$AccessoryType$Push cellActivityComponent$AccessoryType$Push = viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Push ? (CellActivityComponent$AccessoryType$Push) viewSizeResolverKt : null;
                            z = Intrinsics.areEqual(cellActivityComponent$AccessoryType$Push != null ? Boolean.valueOf(cellActivityComponent$AccessoryType$Push.value) : null, Boolean.TRUE);
                        } else {
                            z = false;
                        }
                        if (z) {
                            ajVar = GenericComponentViewModel$CellActivityViewModel$Accessory$Push.INSTANCE;
                        } else {
                            if (viewSizeResolverKt != null) {
                                CellActivityComponent$AccessoryType$Amount cellActivityComponent$AccessoryType$Amount = viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Amount ? (CellActivityComponent$AccessoryType$Amount) viewSizeResolverKt : null;
                                if (cellActivityComponent$AccessoryType$Amount != null) {
                                    str = cellActivityComponent$AccessoryType$Amount.value;
                                    if (str == null) {
                                        viewSizeResolverKt.getClass();
                                        CellActivityComponent$AccessoryType$Amount cellActivityComponent$AccessoryType$Amount2 = viewSizeResolverKt instanceof CellActivityComponent$AccessoryType$Amount ? (CellActivityComponent$AccessoryType$Amount) viewSizeResolverKt : null;
                                        String str6 = cellActivityComponent$AccessoryType$Amount2 != null ? cellActivityComponent$AccessoryType$Amount2.value : null;
                                        str6.getClass();
                                        ajVar = new GenericComponentViewModel$CellActivityViewModel$Accessory$Amount(str6);
                                    } else {
                                        ajVar = null;
                                    }
                                }
                            }
                            str = null;
                            if (str == null) {
                            }
                        }
                        String str7 = cellActivityComponent2.label;
                        str7.getClass();
                        GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent12 = viewAnalyticsEvent;
                        String str8 = cellActivityComponent2.body;
                        String str9 = cellActivityComponent2.status;
                        Action action7 = cellActivityComponent2.onClick;
                        GenericTreeElementsViewEvent viewEvent = action7 != null ? zzj.toViewEvent(action7) : null;
                        Boolean bool7 = cellActivityComponent2.forceCenterAlignment;
                        return new GenericComponentViewModel.CellActivityViewModel(viewModel11, str7, ajVar, viewEvent, str8, str9, bool7 != null ? bool7.booleanValue() : false, viewAnalyticsEvent12);
                    case 14:
                        transformationsKt.getClass();
                        ComponentElement$Element$CellDefault componentElement$Element$CellDefault2 = transformationsKt instanceof ComponentElement$Element$CellDefault ? (ComponentElement$Element$CellDefault) transformationsKt : null;
                        CellDefaultComponent cellDefaultComponent2 = componentElement$Element$CellDefault2 != null ? componentElement$Element$CellDefault2.value : null;
                        cellDefaultComponent2.getClass();
                        Action action8 = cellDefaultComponent2.action;
                        Utils_androidKt utils_androidKt = cellDefaultComponent2.accessoryType;
                        GenericTreeElementsViewEvent viewEvent2 = action8 != null ? zzj.toViewEvent(action8) : null;
                        BaseElement baseElement5 = cellDefaultComponent2.icon;
                        GenericBaseViewModel viewModel12 = baseElement5 != null ? toViewModel(baseElement5) : null;
                        String str10 = cellDefaultComponent2.icon_id;
                        Color color5 = cellDefaultComponent2.icon_tint;
                        ColorModel.Accented accented5 = color5 != null ? new ColorModel.Accented(color5) : null;
                        Color color6 = cellDefaultComponent2.icon_background;
                        ColorModel.Accented accented6 = color6 != null ? new ColorModel.Accented(color6) : null;
                        String str11 = cellDefaultComponent2.icon_description;
                        String str12 = cellDefaultComponent2.label_text;
                        String str13 = cellDefaultComponent2.body_text;
                        ArcadeTextElement.SemanticTextColor semanticTextColor = cellDefaultComponent2.body_text_color;
                        if (utils_androidKt != null) {
                            CellDefaultComponent$AccessoryType$Push cellDefaultComponent$AccessoryType$Push = utils_androidKt instanceof CellDefaultComponent$AccessoryType$Push ? (CellDefaultComponent$AccessoryType$Push) utils_androidKt : null;
                            if (cellDefaultComponent$AccessoryType$Push != null) {
                                bool2 = Boolean.valueOf(cellDefaultComponent$AccessoryType$Push.value);
                                if (bool2 == null) {
                                    r1 = GenericComponentViewModel$CellDefaultViewModel$Accessory$Push.INSTANCE;
                                } else {
                                    if (utils_androidKt != null) {
                                        CellDefaultComponent$AccessoryType$PushLabel cellDefaultComponent$AccessoryType$PushLabel = utils_androidKt instanceof CellDefaultComponent$AccessoryType$PushLabel ? (CellDefaultComponent$AccessoryType$PushLabel) utils_androidKt : null;
                                        if (cellDefaultComponent$AccessoryType$PushLabel != null) {
                                            str2 = cellDefaultComponent$AccessoryType$PushLabel.value;
                                            if (str2 != null) {
                                                utils_androidKt.getClass();
                                                CellDefaultComponent$AccessoryType$PushLabel cellDefaultComponent$AccessoryType$PushLabel2 = utils_androidKt instanceof CellDefaultComponent$AccessoryType$PushLabel ? (CellDefaultComponent$AccessoryType$PushLabel) utils_androidKt : null;
                                                String str14 = cellDefaultComponent$AccessoryType$PushLabel2 != null ? cellDefaultComponent$AccessoryType$PushLabel2.value : null;
                                                str14.getClass();
                                                genericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush = new GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush(str14);
                                                type2 = cellDefaultComponent2.f1266type;
                                                if (type2 == null) {
                                                    type2 = CellDefaultComponent.Type.LARGE_ICON;
                                                }
                                                return new GenericComponentViewModel.CellDefaultViewModel(viewEvent2, viewModel12, str10, str11, accented5, accented6, str12, str13, semanticTextColor, genericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush, type2);
                                            }
                                        }
                                    }
                                    str2 = null;
                                    if (str2 != null) {
                                    }
                                }
                                genericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush = r1;
                                type2 = cellDefaultComponent2.f1266type;
                                if (type2 == null) {
                                }
                                return new GenericComponentViewModel.CellDefaultViewModel(viewEvent2, viewModel12, str10, str11, accented5, accented6, str12, str13, semanticTextColor, genericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush, type2);
                            }
                        }
                        bool2 = null;
                        if (bool2 == null) {
                        }
                        genericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush = r1;
                        type2 = cellDefaultComponent2.f1266type;
                        if (type2 == null) {
                        }
                        return new GenericComponentViewModel.CellDefaultViewModel(viewEvent2, viewModel12, str10, str11, accented5, accented6, str12, str13, semanticTextColor, genericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush, type2);
                    case 15:
                        transformationsKt.getClass();
                        ComponentElement$Element$ListUnordered componentElement$Element$ListUnordered2 = transformationsKt instanceof ComponentElement$Element$ListUnordered ? (ComponentElement$Element$ListUnordered) transformationsKt : null;
                        ListUnorderedComponent listUnorderedComponent2 = componentElement$Element$ListUnordered2 != null ? componentElement$Element$ListUnordered2.value : null;
                        listUnorderedComponent2.getClass();
                        ListUnorderedComponent.Style style = listUnorderedComponent2.style;
                        if (style == null) {
                            style = ListUnorderedComponent.Style.STANDARD;
                        }
                        List<ListUnorderedComponent.Item> list6 = listUnorderedComponent2.items;
                        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                        for (ListUnorderedComponent.Item item : list6) {
                            String str15 = item.label;
                            str15.getClass();
                            arrayList6.add(new GenericComponentViewModel.ListUnorderedViewModel.ListUnorderedItem(str15, item.value, item.icon_id));
                        }
                        return new GenericComponentViewModel.ListUnorderedViewModel(style, arrayList6);
                    case 16:
                        transformationsKt.getClass();
                        ComponentElement$Element$ButtonCtaGroup componentElement$Element$ButtonCtaGroup2 = transformationsKt instanceof ComponentElement$Element$ButtonCtaGroup ? (ComponentElement$Element$ButtonCtaGroup) transformationsKt : null;
                        ButtonCtaGroupComponent buttonCtaGroupComponent2 = componentElement$Element$ButtonCtaGroup2 != null ? componentElement$Element$ButtonCtaGroup2.value : null;
                        buttonCtaGroupComponent2.getClass();
                        ButtonCtaGroupComponent.Direction direction = buttonCtaGroupComponent2.direction;
                        if (direction == null) {
                            direction = ButtonCtaGroupComponent.Direction.Vertical;
                        }
                        String str16 = buttonCtaGroupComponent2.text;
                        Boolean bool8 = buttonCtaGroupComponent2.show_horizontal_divider;
                        r4 = bool8 != null ? bool8.booleanValue() : false;
                        List list7 = buttonCtaGroupComponent2.buttons;
                        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                        Iterator it6 = list7.iterator();
                        while (it6.hasNext()) {
                            arrayList7.add(toViewModel((ArcadeButtonElement) it6.next()));
                        }
                        return new GenericComponentViewModel.ButtonCtaGroupViewModel(direction, str16, arrayList7, r4);
                }
            }
        }
        twoColumnComponent = null;
        if (twoColumnComponent == null) {
        }
        switch (genericComponentType != null ? -1 : GenericTreeElementsMapperKt$WhenMappings.$EnumSwitchMapping$2[genericComponentType.ordinal()]) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0617 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final GenericBaseViewModel toViewModel(BaseElement baseElement) {
        TextElement textElement;
        Button$TextButtonElement button$TextButtonElement;
        Button$IconButtonElement button$IconButtonElement;
        ImageElement imageElement;
        ProgressMeterElement progressMeterElement;
        AvatarElement avatarElement;
        ArcadeBadgedAvatarElement arcadeBadgedAvatarElement;
        BlankDividerElement blankDividerElement;
        IconTextDetailElement iconTextDetailElement;
        PillTextElement pillTextElement;
        WithinSectionSpacer withinSectionSpacer;
        BetweenSectionSpacer betweenSectionSpacer;
        ArcadeTextElement arcadeTextElement;
        ArcadeButtonElement arcadeButtonElement;
        CopyCodeElement copyCodeElement;
        GenericBaseType genericBaseType;
        ColorModel.Accented accented;
        ColorModel.Accented accented2;
        Button$TextButtonElement.State state;
        Alignment alignment;
        IconViewModel.ProgressMeterViewModel.Size size;
        GenericBaseViewModel.AvatarViewModel.Size size2;
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size size3;
        ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon;
        ArcadeBadgedAvatarElement.AvatarImageRemoteIcon avatarImageRemoteIcon;
        ArcadeBadgedAvatarElement.AvatarImageRemoteImage avatarImageRemoteImage;
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image image;
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image remoteImage;
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon localIcon;
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon localIcon2;
        coil3.network.internal.Utils_androidKt utils_androidKt;
        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon;
        ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage avatarBadgeRemoteImage;
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge badge;
        Alignment alignment2;
        GenericBaseViewModel.BlankDividerBaseViewModel.Size size4;
        GenericBaseViewModel.WithinSectionSpacerViewModel.Size size5;
        GenericBaseViewModel.BetweenSectionSpacerViewModel.Size size6;
        baseElement.getClass();
        ViewTargetRequestManagerKt viewTargetRequestManagerKt = baseElement.element;
        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.LocalIcon localIcon3 = null;
        if (viewTargetRequestManagerKt != null) {
            BaseElement$Element$Text baseElement$Element$Text = viewTargetRequestManagerKt instanceof BaseElement$Element$Text ? (BaseElement$Element$Text) viewTargetRequestManagerKt : null;
            if (baseElement$Element$Text != null) {
                textElement = baseElement$Element$Text.value;
                if (textElement == null) {
                    genericBaseType = GenericBaseType.TEXT;
                } else {
                    if (viewTargetRequestManagerKt != null) {
                        BaseElement$Element$TextButton baseElement$Element$TextButton = viewTargetRequestManagerKt instanceof BaseElement$Element$TextButton ? (BaseElement$Element$TextButton) viewTargetRequestManagerKt : null;
                        if (baseElement$Element$TextButton != null) {
                            button$TextButtonElement = baseElement$Element$TextButton.value;
                            if (button$TextButtonElement == null) {
                                genericBaseType = GenericBaseType.BUTTON;
                            } else {
                                if (viewTargetRequestManagerKt != null) {
                                    BaseElement$Element$IconButton baseElement$Element$IconButton = viewTargetRequestManagerKt instanceof BaseElement$Element$IconButton ? (BaseElement$Element$IconButton) viewTargetRequestManagerKt : null;
                                    if (baseElement$Element$IconButton != null) {
                                        button$IconButtonElement = baseElement$Element$IconButton.value;
                                        if (button$IconButtonElement == null) {
                                            genericBaseType = GenericBaseType.ICON_BUTTON;
                                        } else {
                                            if (viewTargetRequestManagerKt != null) {
                                                BaseElement$Element$Image baseElement$Element$Image = viewTargetRequestManagerKt instanceof BaseElement$Element$Image ? (BaseElement$Element$Image) viewTargetRequestManagerKt : null;
                                                if (baseElement$Element$Image != null) {
                                                    imageElement = baseElement$Element$Image.value;
                                                    if (imageElement == null) {
                                                        genericBaseType = GenericBaseType.IMAGE;
                                                    } else {
                                                        if (viewTargetRequestManagerKt != null) {
                                                            BaseElement$Element$Progress baseElement$Element$Progress = viewTargetRequestManagerKt instanceof BaseElement$Element$Progress ? (BaseElement$Element$Progress) viewTargetRequestManagerKt : null;
                                                            if (baseElement$Element$Progress != null) {
                                                                progressMeterElement = baseElement$Element$Progress.value;
                                                                if (progressMeterElement == null) {
                                                                    genericBaseType = GenericBaseType.PROGRESS_METER;
                                                                } else {
                                                                    if (viewTargetRequestManagerKt != null) {
                                                                        BaseElement$Element$Avatar baseElement$Element$Avatar = viewTargetRequestManagerKt instanceof BaseElement$Element$Avatar ? (BaseElement$Element$Avatar) viewTargetRequestManagerKt : null;
                                                                        if (baseElement$Element$Avatar != null) {
                                                                            avatarElement = baseElement$Element$Avatar.value;
                                                                            if (avatarElement == null) {
                                                                                genericBaseType = GenericBaseType.AVATAR;
                                                                            } else {
                                                                                if (viewTargetRequestManagerKt != null) {
                                                                                    BaseElement$Element$ArcadeBadgedAvatar baseElement$Element$ArcadeBadgedAvatar = viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeBadgedAvatar ? (BaseElement$Element$ArcadeBadgedAvatar) viewTargetRequestManagerKt : null;
                                                                                    if (baseElement$Element$ArcadeBadgedAvatar != null) {
                                                                                        arcadeBadgedAvatarElement = baseElement$Element$ArcadeBadgedAvatar.value;
                                                                                        if (arcadeBadgedAvatarElement == null) {
                                                                                            genericBaseType = GenericBaseType.ARCADE_BADGED_AVATAR;
                                                                                        } else {
                                                                                            if (viewTargetRequestManagerKt != null) {
                                                                                                BaseElement$Element$BlankDivider baseElement$Element$BlankDivider = viewTargetRequestManagerKt instanceof BaseElement$Element$BlankDivider ? (BaseElement$Element$BlankDivider) viewTargetRequestManagerKt : null;
                                                                                                if (baseElement$Element$BlankDivider != null) {
                                                                                                    blankDividerElement = baseElement$Element$BlankDivider.value;
                                                                                                    if (blankDividerElement == null) {
                                                                                                        genericBaseType = GenericBaseType.BLANK_DIVIDER;
                                                                                                    } else {
                                                                                                        if (viewTargetRequestManagerKt != null) {
                                                                                                            BaseElement$Element$IconTextElement baseElement$Element$IconTextElement = viewTargetRequestManagerKt instanceof BaseElement$Element$IconTextElement ? (BaseElement$Element$IconTextElement) viewTargetRequestManagerKt : null;
                                                                                                            if (baseElement$Element$IconTextElement != null) {
                                                                                                                iconTextDetailElement = baseElement$Element$IconTextElement.value;
                                                                                                                if (iconTextDetailElement == null) {
                                                                                                                    genericBaseType = GenericBaseType.ICON_TEXT_DETAIL;
                                                                                                                } else {
                                                                                                                    if (viewTargetRequestManagerKt != null) {
                                                                                                                        BaseElement$Element$PillTextElement baseElement$Element$PillTextElement = viewTargetRequestManagerKt instanceof BaseElement$Element$PillTextElement ? (BaseElement$Element$PillTextElement) viewTargetRequestManagerKt : null;
                                                                                                                        if (baseElement$Element$PillTextElement != null) {
                                                                                                                            pillTextElement = baseElement$Element$PillTextElement.value;
                                                                                                                            if (pillTextElement == null) {
                                                                                                                                genericBaseType = GenericBaseType.PILL_TEXT;
                                                                                                                            } else {
                                                                                                                                if (viewTargetRequestManagerKt != null) {
                                                                                                                                    BaseElement$Element$WithinSectionSpacer baseElement$Element$WithinSectionSpacer = viewTargetRequestManagerKt instanceof BaseElement$Element$WithinSectionSpacer ? (BaseElement$Element$WithinSectionSpacer) viewTargetRequestManagerKt : null;
                                                                                                                                    if (baseElement$Element$WithinSectionSpacer != null) {
                                                                                                                                        withinSectionSpacer = baseElement$Element$WithinSectionSpacer.value;
                                                                                                                                        if (withinSectionSpacer == null) {
                                                                                                                                            genericBaseType = GenericBaseType.WITHIN_SECTION_SPACER;
                                                                                                                                        } else {
                                                                                                                                            if (viewTargetRequestManagerKt != null) {
                                                                                                                                                BaseElement$Element$BetweenSectionSpacer baseElement$Element$BetweenSectionSpacer = viewTargetRequestManagerKt instanceof BaseElement$Element$BetweenSectionSpacer ? (BaseElement$Element$BetweenSectionSpacer) viewTargetRequestManagerKt : null;
                                                                                                                                                if (baseElement$Element$BetweenSectionSpacer != null) {
                                                                                                                                                    betweenSectionSpacer = baseElement$Element$BetweenSectionSpacer.value;
                                                                                                                                                    if (betweenSectionSpacer == null) {
                                                                                                                                                        genericBaseType = GenericBaseType.BETWEEN_SECTION_SPACER;
                                                                                                                                                    } else {
                                                                                                                                                        if (viewTargetRequestManagerKt != null) {
                                                                                                                                                            BaseElement$Element$ArcadeText baseElement$Element$ArcadeText = viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeText ? (BaseElement$Element$ArcadeText) viewTargetRequestManagerKt : null;
                                                                                                                                                            if (baseElement$Element$ArcadeText != null) {
                                                                                                                                                                arcadeTextElement = baseElement$Element$ArcadeText.value;
                                                                                                                                                                if (arcadeTextElement == null) {
                                                                                                                                                                    genericBaseType = GenericBaseType.ARCADE_TEXT;
                                                                                                                                                                } else {
                                                                                                                                                                    if (viewTargetRequestManagerKt != null) {
                                                                                                                                                                        BaseElement$Element$ArcadeButton baseElement$Element$ArcadeButton = viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeButton ? (BaseElement$Element$ArcadeButton) viewTargetRequestManagerKt : null;
                                                                                                                                                                        if (baseElement$Element$ArcadeButton != null) {
                                                                                                                                                                            arcadeButtonElement = baseElement$Element$ArcadeButton.value;
                                                                                                                                                                            if (arcadeButtonElement == null) {
                                                                                                                                                                                genericBaseType = GenericBaseType.ARCADE_BUTTON;
                                                                                                                                                                            } else {
                                                                                                                                                                                if (viewTargetRequestManagerKt != null) {
                                                                                                                                                                                    BaseElement$Element$CopyCode baseElement$Element$CopyCode = viewTargetRequestManagerKt instanceof BaseElement$Element$CopyCode ? (BaseElement$Element$CopyCode) viewTargetRequestManagerKt : null;
                                                                                                                                                                                    if (baseElement$Element$CopyCode != null) {
                                                                                                                                                                                        copyCodeElement = baseElement$Element$CopyCode.value;
                                                                                                                                                                                        genericBaseType = copyCodeElement == null ? GenericBaseType.COPY_CODE : null;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                copyCodeElement = null;
                                                                                                                                                                                if (copyCodeElement == null) {
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    arcadeButtonElement = null;
                                                                                                                                                                    if (arcadeButtonElement == null) {
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        arcadeTextElement = null;
                                                                                                                                                        if (arcadeTextElement == null) {
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            betweenSectionSpacer = null;
                                                                                                                                            if (betweenSectionSpacer == null) {
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                withinSectionSpacer = null;
                                                                                                                                if (withinSectionSpacer == null) {
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    pillTextElement = null;
                                                                                                                    if (pillTextElement == null) {
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        iconTextDetailElement = null;
                                                                                                        if (iconTextDetailElement == null) {
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            blankDividerElement = null;
                                                                                            if (blankDividerElement == null) {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                arcadeBadgedAvatarElement = null;
                                                                                if (arcadeBadgedAvatarElement == null) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    avatarElement = null;
                                                                    if (avatarElement == null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        progressMeterElement = null;
                                                        if (progressMeterElement == null) {
                                                        }
                                                    }
                                                }
                                            }
                                            imageElement = null;
                                            if (imageElement == null) {
                                            }
                                        }
                                    }
                                }
                                button$IconButtonElement = null;
                                if (button$IconButtonElement == null) {
                                }
                            }
                        }
                    }
                    button$TextButtonElement = null;
                    if (button$TextButtonElement == null) {
                    }
                }
                switch (genericBaseType != null ? -1 : GenericTreeElementsMapperKt$WhenMappings.$EnumSwitchMapping$7[genericBaseType.ordinal()]) {
                    case -1:
                        return null;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$Text baseElement$Element$Text2 = viewTargetRequestManagerKt instanceof BaseElement$Element$Text ? (BaseElement$Element$Text) viewTargetRequestManagerKt : null;
                        TextElement textElement2 = baseElement$Element$Text2 != null ? baseElement$Element$Text2.value : null;
                        textElement2.getClass();
                        return toViewModel(textElement2);
                    case 2:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$TextButton baseElement$Element$TextButton2 = viewTargetRequestManagerKt instanceof BaseElement$Element$TextButton ? (BaseElement$Element$TextButton) viewTargetRequestManagerKt : null;
                        Button$TextButtonElement button$TextButtonElement2 = baseElement$Element$TextButton2 != null ? baseElement$Element$TextButton2.value : null;
                        button$TextButtonElement2.getClass();
                        String str = button$TextButtonElement2.text;
                        str.getClass();
                        Color color = button$TextButtonElement2.text_color;
                        if (color != null) {
                            accented2 = new ColorModel.Accented(color);
                        } else {
                            Color color2 = button$TextButtonElement2.color;
                            if (color2 != null) {
                                accented2 = new ColorModel.Accented(color2);
                            } else {
                                accented = null;
                                Color color3 = button$TextButtonElement2.background_color;
                                ColorModel.Accented accented3 = color3 != null ? new ColorModel.Accented(color3) : null;
                                Button$Type button$Type = button$TextButtonElement2.f1265type;
                                button$Type.getClass();
                                state = button$TextButtonElement2.state;
                                if (state == null) {
                                    state = Button$TextButtonElement.State.DEFAULT;
                                }
                                Button$TextButtonElement.State state2 = state;
                                Button$TextButtonElement.Size size7 = button$TextButtonElement2.size;
                                size7.getClass();
                                Action action = button$TextButtonElement2.action;
                                action.getClass();
                                GenericTreeElementsViewEvent viewEvent = zzj.toViewEvent(action);
                                viewEvent.getClass();
                                alignment = button$TextButtonElement2.alignment;
                                if (alignment == null) {
                                    alignment = Alignment.LEFT;
                                }
                                return new GenericBaseViewModel.ButtonViewModel(str, accented, accented3, button$Type, state2, size7, viewEvent, alignment);
                            }
                        }
                        accented = accented2;
                        Color color32 = button$TextButtonElement2.background_color;
                        ColorModel.Accented accented32 = color32 != null ? new ColorModel.Accented(color32) : null;
                        Button$Type button$Type2 = button$TextButtonElement2.f1265type;
                        button$Type2.getClass();
                        state = button$TextButtonElement2.state;
                        if (state == null) {
                        }
                        Button$TextButtonElement.State state22 = state;
                        Button$TextButtonElement.Size size72 = button$TextButtonElement2.size;
                        size72.getClass();
                        Action action2 = button$TextButtonElement2.action;
                        action2.getClass();
                        GenericTreeElementsViewEvent viewEvent2 = zzj.toViewEvent(action2);
                        viewEvent2.getClass();
                        alignment = button$TextButtonElement2.alignment;
                        if (alignment == null) {
                        }
                        return new GenericBaseViewModel.ButtonViewModel(str, accented, accented32, button$Type2, state22, size72, viewEvent2, alignment);
                    case 3:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$IconButton baseElement$Element$IconButton2 = viewTargetRequestManagerKt instanceof BaseElement$Element$IconButton ? (BaseElement$Element$IconButton) viewTargetRequestManagerKt : null;
                        Button$IconButtonElement button$IconButtonElement2 = baseElement$Element$IconButton2 != null ? baseElement$Element$IconButton2.value : null;
                        button$IconButtonElement2.getClass();
                        Image image2 = button$IconButtonElement2.icon;
                        image2.getClass();
                        Button$Type button$Type3 = button$IconButtonElement2.f1264type;
                        if (button$Type3 == null) {
                            button$Type3 = Button$Type.PRIMARY;
                        }
                        Button$Type button$Type4 = button$Type3;
                        Button$IconButtonElement.State state3 = button$IconButtonElement2.state;
                        if (state3 == null) {
                            state3 = Button$IconButtonElement.State.DEFAULT;
                        }
                        Button$IconButtonElement.State state4 = state3;
                        Button$IconButtonElement.Size size8 = button$IconButtonElement2.size;
                        size8.getClass();
                        Action action3 = button$IconButtonElement2.action;
                        action3.getClass();
                        GenericTreeElementsViewEvent viewEvent3 = zzj.toViewEvent(action3);
                        Alignment alignment3 = button$IconButtonElement2.alignment;
                        if (alignment3 == null) {
                            alignment3 = Alignment.LEFT;
                        }
                        return new GenericBaseViewModel.IconButtonViewModel(image2, button$Type4, state4, size8, viewEvent3, alignment3);
                    case 4:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$Image baseElement$Element$Image2 = viewTargetRequestManagerKt instanceof BaseElement$Element$Image ? (BaseElement$Element$Image) viewTargetRequestManagerKt : null;
                        ImageElement imageElement2 = baseElement$Element$Image2 != null ? baseElement$Element$Image2.value : null;
                        imageElement2.getClass();
                        return toViewModel(imageElement2);
                    case 5:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$Progress baseElement$Element$Progress2 = viewTargetRequestManagerKt instanceof BaseElement$Element$Progress ? (BaseElement$Element$Progress) viewTargetRequestManagerKt : null;
                        ProgressMeterElement progressMeterElement2 = baseElement$Element$Progress2 != null ? baseElement$Element$Progress2.value : null;
                        progressMeterElement2.getClass();
                        Image image3 = progressMeterElement2.icon;
                        image3.getClass();
                        Color color4 = progressMeterElement2.color;
                        color4.getClass();
                        Long l = progressMeterElement2.progress;
                        l.getClass();
                        float longValue = l.longValue();
                        progressMeterElement2.total.getClass();
                        float longValue2 = longValue / r2.longValue();
                        Size size9 = progressMeterElement2.size;
                        size9.getClass();
                        int ordinal = size9.ordinal();
                        if (ordinal == 0) {
                            size = IconViewModel.ProgressMeterViewModel.Size.SMALL;
                        } else if (ordinal == 1) {
                            size = IconViewModel.ProgressMeterViewModel.Size.MEDIUM;
                        } else if (ordinal == 2) {
                            size = IconViewModel.ProgressMeterViewModel.Size.LARGE;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        IconViewModel.ProgressMeterViewModel.Size size10 = size;
                        Alignment alignment4 = progressMeterElement2.alignment;
                        if (alignment4 == null) {
                            alignment4 = Alignment.LEFT;
                        }
                        return new IconViewModel.ProgressMeterViewModel(image3, color4, longValue2, size10, alignment4);
                    case 6:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$Avatar baseElement$Element$Avatar2 = viewTargetRequestManagerKt instanceof BaseElement$Element$Avatar ? (BaseElement$Element$Avatar) viewTargetRequestManagerKt : null;
                        AvatarElement avatarElement2 = baseElement$Element$Avatar2 != null ? baseElement$Element$Avatar2.value : null;
                        avatarElement2.getClass();
                        Image image4 = avatarElement2.image;
                        image4.getClass();
                        AvatarElement.Size size11 = avatarElement2.size;
                        size11.getClass();
                        int ordinal2 = size11.ordinal();
                        if (ordinal2 == 0) {
                            size2 = GenericBaseViewModel.AvatarViewModel.Size.SMALL;
                        } else if (ordinal2 == 1) {
                            size2 = GenericBaseViewModel.AvatarViewModel.Size.MEDIUM;
                        } else if (ordinal2 == 2) {
                            size2 = GenericBaseViewModel.AvatarViewModel.Size.LARGE;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        GenericBaseViewModel.AvatarViewModel.Size size12 = size2;
                        Boolean bool = avatarElement2.colorizeAvatar;
                        boolean booleanValue = bool != null ? bool.booleanValue() : false;
                        AvatarElement.Badge badge2 = avatarElement2.badge;
                        Image image5 = avatarElement2.badge_image;
                        Color color5 = avatarElement2.backgroundColor;
                        ColorModel.Accented accented4 = color5 != null ? new ColorModel.Accented(color5) : null;
                        String str2 = avatarElement2.accessibility_label;
                        Alignment alignment5 = avatarElement2.alignment;
                        if (alignment5 == null) {
                            alignment5 = Alignment.LEFT;
                        }
                        return new GenericBaseViewModel.AvatarViewModel(image4, size12, booleanValue, badge2, image5, accented4, str2, alignment5);
                    case 7:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$ArcadeBadgedAvatar baseElement$Element$ArcadeBadgedAvatar2 = viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeBadgedAvatar ? (BaseElement$Element$ArcadeBadgedAvatar) viewTargetRequestManagerKt : null;
                        ArcadeBadgedAvatarElement arcadeBadgedAvatarElement2 = baseElement$Element$ArcadeBadgedAvatar2 != null ? baseElement$Element$ArcadeBadgedAvatar2.value : null;
                        arcadeBadgedAvatarElement2.getClass();
                        ArcadeBadgedAvatarElement.Size size13 = arcadeBadgedAvatarElement2.size;
                        if (size13 != null) {
                            int ordinal3 = size13.ordinal();
                            if (ordinal3 == 0) {
                                size3 = GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size.Size32;
                            } else if (ordinal3 == 1) {
                                size3 = GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size.Size48;
                            } else if (ordinal3 == 2) {
                                size3 = GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size.Size64;
                            } else if (ordinal3 == 3) {
                                size3 = GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size.Size96;
                            } else {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                        } else {
                            size3 = GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size.Size48;
                        }
                        GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Size size14 = size3;
                        String str3 = arcadeBadgedAvatarElement2.monogram;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String str4 = str3;
                        SemanticBackgroundColor semanticBackgroundColor = arcadeBadgedAvatarElement2.background_color;
                        Color color6 = arcadeBadgedAvatarElement2.custom_background_color;
                        String str5 = arcadeBadgedAvatarElement2.content_description;
                        zzbc zzbcVar = arcadeBadgedAvatarElement2.avatar_image;
                        if (zzbcVar != null) {
                            ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon = zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon ? (ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) zzbcVar : null;
                            if (arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon != null) {
                                avatarImageLocalIcon = arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon.value;
                                if (avatarImageLocalIcon == null) {
                                    zzbcVar.getClass();
                                    ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon2 = zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon ? (ArcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon) zzbcVar : null;
                                    ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon2 = arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon2 != null ? arcadeBadgedAvatarElement$AvatarImage$AvatarLocalIcon2.value : null;
                                    avatarImageLocalIcon2.getClass();
                                    String str6 = avatarImageLocalIcon2.icon_id;
                                    str6.getClass();
                                    remoteImage = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon(str6, avatarImageLocalIcon2.tint_color);
                                } else {
                                    if (zzbcVar != null) {
                                        ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon = zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon ? (ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) zzbcVar : null;
                                        if (arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon != null) {
                                            avatarImageRemoteIcon = arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon.value;
                                            if (avatarImageRemoteIcon == null) {
                                                zzbcVar.getClass();
                                                ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon2 = zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon ? (ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon) zzbcVar : null;
                                                ArcadeBadgedAvatarElement.AvatarImageRemoteIcon avatarImageRemoteIcon2 = arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon2 != null ? arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteIcon2.value : null;
                                                avatarImageRemoteIcon2.getClass();
                                                Image image6 = avatarImageRemoteIcon2.image;
                                                image6.getClass();
                                                Boolean bool2 = avatarImageRemoteIcon2.colorize_image;
                                                boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                                ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon3 = avatarImageRemoteIcon2.placeholder;
                                                if (avatarImageLocalIcon3 != null) {
                                                    String str7 = avatarImageLocalIcon3.icon_id;
                                                    str7.getClass();
                                                    localIcon2 = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon(str7, avatarImageLocalIcon3.tint_color);
                                                } else {
                                                    localIcon2 = null;
                                                }
                                                remoteImage = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteIcon(image6, booleanValue2, localIcon2);
                                            } else {
                                                if (zzbcVar != null) {
                                                    ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage = zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage ? (ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) zzbcVar : null;
                                                    if (arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage != null) {
                                                        avatarImageRemoteImage = arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage.value;
                                                        if (avatarImageRemoteImage == null) {
                                                            zzbcVar.getClass();
                                                            ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage2 = zzbcVar instanceof ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage ? (ArcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage) zzbcVar : null;
                                                            ArcadeBadgedAvatarElement.AvatarImageRemoteImage avatarImageRemoteImage2 = arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage2 != null ? arcadeBadgedAvatarElement$AvatarImage$AvatarRemoteImage2.value : null;
                                                            avatarImageRemoteImage2.getClass();
                                                            Image image7 = avatarImageRemoteImage2.image;
                                                            image7.getClass();
                                                            Boolean bool3 = avatarImageRemoteImage2.colorize_image;
                                                            boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                                                            ArcadeBadgedAvatarElement.AvatarImageLocalIcon avatarImageLocalIcon4 = avatarImageRemoteImage2.placeholder;
                                                            if (avatarImageLocalIcon4 != null) {
                                                                String str8 = avatarImageLocalIcon4.icon_id;
                                                                str8.getClass();
                                                                localIcon = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.LocalIcon(str8, avatarImageLocalIcon4.tint_color);
                                                            } else {
                                                                localIcon = null;
                                                            }
                                                            remoteImage = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Image.RemoteImage(image7, booleanValue3, localIcon, avatarImageRemoteImage2.tint_color);
                                                        } else {
                                                            image = null;
                                                            image.getClass();
                                                            utils_androidKt = arcadeBadgedAvatarElement2.avatar_badge;
                                                            if (utils_androidKt != null) {
                                                                ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon = utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon ? (ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) utils_androidKt : null;
                                                                if (arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon != null) {
                                                                    avatarBadgeLocalIcon = arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon.value;
                                                                    if (avatarBadgeLocalIcon == null) {
                                                                        utils_androidKt.getClass();
                                                                        ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon2 = utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon ? (ArcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon) utils_androidKt : null;
                                                                        ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon2 = arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon2 != null ? arcadeBadgedAvatarElement$AvatarBadge$BadgeLocalIcon2.value : null;
                                                                        avatarBadgeLocalIcon2.getClass();
                                                                        String str9 = avatarBadgeLocalIcon2.icon_id;
                                                                        str9.getClass();
                                                                        badge = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.LocalIcon(str9, avatarBadgeLocalIcon2.tint_color);
                                                                    } else {
                                                                        if (utils_androidKt != null) {
                                                                            ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage arcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage = utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage ? (ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) utils_androidKt : null;
                                                                            if (arcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage != null) {
                                                                                avatarBadgeRemoteImage = arcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage.value;
                                                                                if (avatarBadgeRemoteImage == null) {
                                                                                    utils_androidKt.getClass();
                                                                                    ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage arcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage2 = utils_androidKt instanceof ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage ? (ArcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage) utils_androidKt : null;
                                                                                    ArcadeBadgedAvatarElement.AvatarBadgeRemoteImage avatarBadgeRemoteImage2 = arcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage2 != null ? arcadeBadgedAvatarElement$AvatarBadge$BadgeRemoteImage2.value : null;
                                                                                    avatarBadgeRemoteImage2.getClass();
                                                                                    Image image8 = avatarBadgeRemoteImage2.image;
                                                                                    image8.getClass();
                                                                                    Boolean bool4 = avatarBadgeRemoteImage2.colorize_image;
                                                                                    boolean booleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                                                                                    ArcadeBadgedAvatarElement.AvatarBadgeLocalIcon avatarBadgeLocalIcon3 = avatarBadgeRemoteImage2.placeholder;
                                                                                    if (avatarBadgeLocalIcon3 != null) {
                                                                                        String str10 = avatarBadgeLocalIcon3.icon_id;
                                                                                        str10.getClass();
                                                                                        localIcon3 = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.LocalIcon(str10, avatarBadgeLocalIcon3.tint_color);
                                                                                    }
                                                                                    badge = new GenericBaseViewModel.ArcadeBadgedAvatarViewModel.Badge.RemoteImage(image8, booleanValue4, localIcon3, avatarBadgeRemoteImage2.tint_color);
                                                                                } else {
                                                                                    badge = null;
                                                                                }
                                                                            }
                                                                        }
                                                                        avatarBadgeRemoteImage = null;
                                                                        if (avatarBadgeRemoteImage == null) {
                                                                        }
                                                                    }
                                                                    alignment2 = arcadeBadgedAvatarElement2.alignment;
                                                                    if (alignment2 == null) {
                                                                        alignment2 = Alignment.LEFT;
                                                                    }
                                                                    return new GenericBaseViewModel.ArcadeBadgedAvatarViewModel(size14, str4, semanticBackgroundColor, color6, str5, image, badge, alignment2);
                                                                }
                                                            }
                                                            avatarBadgeLocalIcon = null;
                                                            if (avatarBadgeLocalIcon == null) {
                                                            }
                                                            alignment2 = arcadeBadgedAvatarElement2.alignment;
                                                            if (alignment2 == null) {
                                                            }
                                                            return new GenericBaseViewModel.ArcadeBadgedAvatarViewModel(size14, str4, semanticBackgroundColor, color6, str5, image, badge, alignment2);
                                                        }
                                                    }
                                                }
                                                avatarImageRemoteImage = null;
                                                if (avatarImageRemoteImage == null) {
                                                }
                                            }
                                        }
                                    }
                                    avatarImageRemoteIcon = null;
                                    if (avatarImageRemoteIcon == null) {
                                    }
                                }
                                image = remoteImage;
                                image.getClass();
                                utils_androidKt = arcadeBadgedAvatarElement2.avatar_badge;
                                if (utils_androidKt != null) {
                                }
                                avatarBadgeLocalIcon = null;
                                if (avatarBadgeLocalIcon == null) {
                                }
                                alignment2 = arcadeBadgedAvatarElement2.alignment;
                                if (alignment2 == null) {
                                }
                                return new GenericBaseViewModel.ArcadeBadgedAvatarViewModel(size14, str4, semanticBackgroundColor, color6, str5, image, badge, alignment2);
                            }
                        }
                        avatarImageLocalIcon = null;
                        if (avatarImageLocalIcon == null) {
                        }
                        image = remoteImage;
                        image.getClass();
                        utils_androidKt = arcadeBadgedAvatarElement2.avatar_badge;
                        if (utils_androidKt != null) {
                        }
                        avatarBadgeLocalIcon = null;
                        if (avatarBadgeLocalIcon == null) {
                        }
                        alignment2 = arcadeBadgedAvatarElement2.alignment;
                        if (alignment2 == null) {
                        }
                        return new GenericBaseViewModel.ArcadeBadgedAvatarViewModel(size14, str4, semanticBackgroundColor, color6, str5, image, badge, alignment2);
                    case 8:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$BlankDivider baseElement$Element$BlankDivider2 = viewTargetRequestManagerKt instanceof BaseElement$Element$BlankDivider ? (BaseElement$Element$BlankDivider) viewTargetRequestManagerKt : null;
                        BlankDividerElement blankDividerElement2 = baseElement$Element$BlankDivider2 != null ? baseElement$Element$BlankDivider2.value : null;
                        blankDividerElement2.getClass();
                        BlankDividerElement.Size size15 = blankDividerElement2.size;
                        size15.getClass();
                        int ordinal4 = size15.ordinal();
                        if (ordinal4 == 0) {
                            size4 = GenericBaseViewModel.BlankDividerBaseViewModel.Size.SMALL;
                        } else if (ordinal4 == 1) {
                            size4 = GenericBaseViewModel.BlankDividerBaseViewModel.Size.LARGE;
                        } else if (ordinal4 == 2) {
                            size4 = GenericBaseViewModel.BlankDividerBaseViewModel.Size.X_LARGE;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return new GenericBaseViewModel.BlankDividerBaseViewModel(size4);
                    case 9:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$IconTextElement baseElement$Element$IconTextElement2 = viewTargetRequestManagerKt instanceof BaseElement$Element$IconTextElement ? (BaseElement$Element$IconTextElement) viewTargetRequestManagerKt : null;
                        IconTextDetailElement iconTextDetailElement2 = baseElement$Element$IconTextElement2 != null ? baseElement$Element$IconTextElement2.value : null;
                        iconTextDetailElement2.getClass();
                        ImageElement imageElement3 = iconTextDetailElement2.icon;
                        imageElement3.getClass();
                        IconViewModel.ImageViewModel viewModel = toViewModel(imageElement3);
                        TextElement textElement3 = iconTextDetailElement2.text;
                        textElement3.getClass();
                        return new IconTextDetailViewModel(viewModel, toViewModel(textElement3));
                    case 10:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$PillTextElement baseElement$Element$PillTextElement2 = viewTargetRequestManagerKt instanceof BaseElement$Element$PillTextElement ? (BaseElement$Element$PillTextElement) viewTargetRequestManagerKt : null;
                        PillTextElement pillTextElement2 = baseElement$Element$PillTextElement2 != null ? baseElement$Element$PillTextElement2.value : null;
                        pillTextElement2.getClass();
                        String str11 = pillTextElement2.text;
                        str11.getClass();
                        Color color7 = pillTextElement2.background_color;
                        Color color8 = pillTextElement2.text_color;
                        Alignment alignment6 = pillTextElement2.alignment;
                        if (alignment6 == null) {
                            alignment6 = Alignment.LEFT;
                        }
                        return new PillTextViewModel(color7, color8, str11, alignment6);
                    case 11:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$WithinSectionSpacer baseElement$Element$WithinSectionSpacer2 = viewTargetRequestManagerKt instanceof BaseElement$Element$WithinSectionSpacer ? (BaseElement$Element$WithinSectionSpacer) viewTargetRequestManagerKt : null;
                        WithinSectionSpacer withinSectionSpacer2 = baseElement$Element$WithinSectionSpacer2 != null ? baseElement$Element$WithinSectionSpacer2.value : null;
                        withinSectionSpacer2.getClass();
                        WithinSectionSpacer.Size size16 = withinSectionSpacer2.size;
                        size16.getClass();
                        int ordinal5 = size16.ordinal();
                        if (ordinal5 == 0) {
                            size5 = GenericBaseViewModel.WithinSectionSpacerViewModel.Size.SMALL;
                        } else if (ordinal5 == 1) {
                            size5 = GenericBaseViewModel.WithinSectionSpacerViewModel.Size.MEDIUM;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return new GenericBaseViewModel.WithinSectionSpacerViewModel(size5);
                    case 12:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$BetweenSectionSpacer baseElement$Element$BetweenSectionSpacer2 = viewTargetRequestManagerKt instanceof BaseElement$Element$BetweenSectionSpacer ? (BaseElement$Element$BetweenSectionSpacer) viewTargetRequestManagerKt : null;
                        BetweenSectionSpacer betweenSectionSpacer2 = baseElement$Element$BetweenSectionSpacer2 != null ? baseElement$Element$BetweenSectionSpacer2.value : null;
                        betweenSectionSpacer2.getClass();
                        BetweenSectionSpacer.Size size17 = betweenSectionSpacer2.size;
                        size17.getClass();
                        int ordinal6 = size17.ordinal();
                        if (ordinal6 == 0) {
                            size6 = GenericBaseViewModel.BetweenSectionSpacerViewModel.Size.LARGE;
                        } else if (ordinal6 == 1) {
                            size6 = GenericBaseViewModel.BetweenSectionSpacerViewModel.Size.XLARGE;
                        } else if (ordinal6 == 2) {
                            size6 = GenericBaseViewModel.BetweenSectionSpacerViewModel.Size.XLARGE_BELLOW_CELL;
                        } else {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        return new GenericBaseViewModel.BetweenSectionSpacerViewModel(size6);
                    case 13:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$ArcadeText baseElement$Element$ArcadeText2 = viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeText ? (BaseElement$Element$ArcadeText) viewTargetRequestManagerKt : null;
                        ArcadeTextElement arcadeTextElement2 = baseElement$Element$ArcadeText2 != null ? baseElement$Element$ArcadeText2.value : null;
                        arcadeTextElement2.getClass();
                        String str12 = arcadeTextElement2.text;
                        str12.getClass();
                        ArcadeTextElement.Style style = arcadeTextElement2.style;
                        Color color9 = arcadeTextElement2.text_color;
                        ColorModel.Accented accented5 = color9 != null ? new ColorModel.Accented(color9) : null;
                        ArcadeTextElement.SemanticTextColor semanticTextColor = arcadeTextElement2.semantic_text_color;
                        Integer num = arcadeTextElement2.max_lines;
                        VerticalAlignment verticalAlignment = arcadeTextElement2.vertical_alignment;
                        if (verticalAlignment == null) {
                            verticalAlignment = VerticalAlignment.TOP;
                        }
                        VerticalAlignment verticalAlignment2 = verticalAlignment;
                        Alignment alignment7 = arcadeTextElement2.alignment;
                        if (alignment7 == null) {
                            alignment7 = Alignment.LEFT;
                        }
                        Alignment alignment8 = alignment7;
                        Boolean bool5 = arcadeTextElement2.selectable;
                        return new GenericBaseViewModel.ArcadeTextViewModel(str12, style, accented5, semanticTextColor, num, verticalAlignment2, bool5 != null ? bool5.booleanValue() : false, alignment8);
                    case 14:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$ArcadeButton baseElement$Element$ArcadeButton2 = viewTargetRequestManagerKt instanceof BaseElement$Element$ArcadeButton ? (BaseElement$Element$ArcadeButton) viewTargetRequestManagerKt : null;
                        ArcadeButtonElement arcadeButtonElement2 = baseElement$Element$ArcadeButton2 != null ? baseElement$Element$ArcadeButton2.value : null;
                        arcadeButtonElement2.getClass();
                        return toViewModel(arcadeButtonElement2);
                    case 15:
                        viewTargetRequestManagerKt.getClass();
                        BaseElement$Element$CopyCode baseElement$Element$CopyCode2 = viewTargetRequestManagerKt instanceof BaseElement$Element$CopyCode ? (BaseElement$Element$CopyCode) viewTargetRequestManagerKt : null;
                        CopyCodeElement copyCodeElement2 = baseElement$Element$CopyCode2 != null ? baseElement$Element$CopyCode2.value : null;
                        copyCodeElement2.getClass();
                        String str13 = copyCodeElement2.label;
                        str13.getClass();
                        return new GenericBaseViewModel.CopyCodeViewModel(str13, copyCodeElement2.body, copyCodeElement2.content_description);
                }
            }
        }
        textElement = null;
        if (textElement == null) {
        }
        switch (genericBaseType != null ? -1 : GenericTreeElementsMapperKt$WhenMappings.$EnumSwitchMapping$7[genericBaseType.ordinal()]) {
        }
    }

    public static final GenericComponentViewModel.TwoColumnViewModel toViewModel(TwoColumnComponent twoColumnComponent, GenericTreeElementsViewEvent.ViewAnalyticsEvent viewAnalyticsEvent) {
        GenericComponentViewModel.TwoColumnViewModel.Spacing spacing;
        BaseElement baseElement = twoColumnComponent.left;
        GenericComponentViewModel.TwoColumnViewModel.Spacing spacing2 = null;
        GenericBaseViewModel viewModel = baseElement != null ? toViewModel(baseElement) : null;
        BaseElement baseElement2 = twoColumnComponent.right;
        GenericBaseViewModel viewModel2 = baseElement2 != null ? toViewModel(baseElement2) : null;
        ColumnWidth columnWidth = twoColumnComponent.column_width;
        if (columnWidth == null) {
            columnWidth = ColumnWidth.FIT_RIGHT;
        }
        TwoColumnComponent.Spacing spacing3 = twoColumnComponent.spacing_between;
        if (spacing3 != null) {
            int ordinal = spacing3.ordinal();
            if (ordinal == 0) {
                spacing = GenericComponentViewModel.TwoColumnViewModel.Spacing.SMALL;
            } else if (ordinal == 1) {
                spacing = GenericComponentViewModel.TwoColumnViewModel.Spacing.LARGE;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            spacing2 = spacing;
        }
        return new GenericComponentViewModel.TwoColumnViewModel(viewModel, viewModel2, columnWidth, spacing2, viewAnalyticsEvent);
    }

    public static final GenericBaseViewModel.TextViewModel toViewModel(TextElement textElement) {
        String str = textElement.text;
        str.getClass();
        TextElement.Style style = textElement.style;
        style.getClass();
        Color color = textElement.text_color;
        ColorModel.Accented accented = color != null ? new ColorModel.Accented(color) : null;
        Integer num = textElement.max_line_number;
        VerticalAlignment verticalAlignment = textElement.vertical_alignment;
        if (verticalAlignment == null) {
            verticalAlignment = VerticalAlignment.TOP;
        }
        VerticalAlignment verticalAlignment2 = verticalAlignment;
        Alignment alignment = textElement.alignment;
        if (alignment == null) {
            alignment = Alignment.LEFT;
        }
        Alignment alignment2 = alignment;
        Boolean bool = textElement.selectable;
        return new GenericBaseViewModel.TextViewModel(str, style, accented, num, verticalAlignment2, bool != null ? bool.booleanValue() : false, alignment2);
    }

    public static final GenericBaseViewModel.ArcadeButtonViewModel toViewModel(ArcadeButtonElement arcadeButtonElement) {
        String str = arcadeButtonElement.text;
        str.getClass();
        Action action = arcadeButtonElement.action;
        GenericTreeElementsViewEvent viewEvent = action != null ? zzj.toViewEvent(action) : null;
        ArcadeButtonElement.State state = arcadeButtonElement.state;
        if (state == null) {
            state = ArcadeButtonElement.State.DEFAULT;
        }
        ArcadeButtonElement.Size size = arcadeButtonElement.size;
        size.getClass();
        ArcadeButtonElement.Prominence prominence = arcadeButtonElement.prominence;
        prominence.getClass();
        Boolean bool = arcadeButtonElement.destructive;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Alignment alignment = arcadeButtonElement.alignment;
        if (alignment == null) {
            alignment = Alignment.LEFT;
        }
        return new GenericBaseViewModel.ArcadeButtonViewModel(str, viewEvent, state, size, prominence, booleanValue, alignment);
    }

    public static final IconViewModel.ImageViewModel toViewModel(ImageElement imageElement) {
        IconViewModel.ImageViewModel.Size size;
        Image image = imageElement.icon;
        image.getClass();
        ImageElement.Size size2 = imageElement.size;
        if (size2 != null) {
            int ordinal = size2.ordinal();
            if (ordinal == 0) {
                size = IconViewModel.ImageViewModel.Size.SMALL;
            } else if (ordinal == 1) {
                size = IconViewModel.ImageViewModel.Size.MEDIUM;
            } else if (ordinal == 2) {
                size = IconViewModel.ImageViewModel.Size.LARGE;
            } else if (ordinal == 3) {
                size = IconViewModel.ImageViewModel.Size.STATIC;
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else {
            size = IconViewModel.ImageViewModel.Size.MEDIUM;
        }
        Color color = imageElement.color;
        String str = imageElement.accessibility_label;
        Alignment alignment = imageElement.alignment;
        if (alignment == null) {
            alignment = Alignment.LEFT;
        }
        return new IconViewModel.ImageViewModel(image, size, color, str, alignment);
    }
}
