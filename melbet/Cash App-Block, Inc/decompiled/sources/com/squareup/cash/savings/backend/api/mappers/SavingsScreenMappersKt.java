package com.squareup.cash.savings.backend.api.mappers;

import androidx.compose.ui.draw.RotateKt;
import androidx.core.view.HapticFeedbackConstantsCompat;
import app.cash.arcade.values.ButtonProminence;
import app.cash.arcade.values.button.ArcadeButtonProminences;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.savings.backend.api.SavingsFeatureError;
import com.squareup.cash.savings.backend.api.SavingsParsingErrorFactory;
import com.squareup.cash.savings.backend.api.SavingsProtoParsingError;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.api.model.SavingsCard;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.backend.api.model.TransferConfig;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.oneformapp.helper.matching.POPMatchingFactory;
import squareup.cash.analytics.CdfEvent;
import squareup.cash.savings.ArcadeElement;
import squareup.cash.savings.SavingsElement;
import squareup.cash.savings.SavingsExternalElements;
import squareup.cash.savings.SavingsExternalElementsReference;
import squareup.cash.savings.SavingsExternalReference;
import squareup.cash.savings.SavingsExternalReferenceIdentifier;
import squareup.cash.savings.SavingsExternalReferenceIdentifier$Screen$GeneralSavings;
import squareup.cash.savings.SavingsExternalReferenceIdentifier$Screen$GoalFolderToken;
import squareup.cash.savings.SavingsExternalReferenceIdentifier$Screen$SavingsHome;
import squareup.cash.savings.SavingsScreen;
import squareup.cash.savings.SavingsScreen$Element$ElementType$ArcadeElement;
import squareup.cash.savings.SavingsScreen$Element$ElementType$SavingsElement;
import squareup.cash.savings.SavingsScreen$Element$ElementType$SavingsExternalElementsReference;
import squareup.cash.savings.SavingsScreens;
import squareup.cash.savings.VersionedSavingsScreens;
import squareup.cash.savings.action.ClientRouteTemplate;
import squareup.cash.savings.bespoke_elements.ActivitySection;
import squareup.cash.savings.bespoke_elements.Card;
import squareup.cash.savings.bespoke_elements.CompactCard;
import squareup.cash.savings.bespoke_elements.FolderList;
import squareup.cash.savings.bespoke_elements.GoalHeader;
import squareup.cash.savings.bespoke_elements.NoGoalHeader;
import squareup.cash.savings.bespoke_elements.TransferButtons;
import squareup.cash.ui.arcade.elements.BetweenSection;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import squareup.cash.ui.arcade.elements.ButtonDefault;
import squareup.cash.ui.arcade.elements.ButtonDefaultGroup;
import squareup.cash.ui.arcade.elements.CellDefault;
import squareup.cash.ui.arcade.elements.HeroNumericsHeader;
import squareup.cash.ui.arcade.elements.SectionHeader;
import squareup.cash.ui.arcade.elements.WithinSection;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public abstract class SavingsScreenMappersKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SavingsExternalReference.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                POPMatchingFactory pOPMatchingFactory = SavingsExternalReference.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                POPMatchingFactory pOPMatchingFactory2 = SavingsExternalReference.Companion;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                POPMatchingFactory pOPMatchingFactory3 = SavingsExternalReference.Companion;
                iArr[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TransferButtons.AlternativeButtonBehavior.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[WithinSection.Variant.values().length];
            try {
                iArr3[WithinSection.Variant.CLIENT_COULD_NOT_PARSE_WITHIN_SECTION_VARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BetweenSection.Variant.values().length];
            try {
                iArr4[BetweenSection.Variant.CLIENT_COULD_NOT_PARSE_SECTION_HEADER_VARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ButtonDefaultGroup.Direction.values().length];
            try {
                iArr5[1] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Navigate.MatchStrategy.Companion companion = ButtonDefaultGroup.Direction.Companion;
                iArr5[2] = 2;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static final SavingsScreen.Element.TransferButtons.TransferButton getButton(ProtoValidationScope protoValidationScope, ButtonDefaultGroup buttonDefaultGroup, long j, TransferConfig transferConfig) {
        HasObservability hasObservability = protoValidationScope.observability;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(buttonDefaultGroup, savingsParsingErrorFactory, protoValidationScope);
            int i = (int) j;
            if (i == 0) {
                ButtonDefault buttonDefault = (ButtonDefault) protoValidationScope2.reportIfNullAndContinue("primary_button", (String) null, buttonDefaultGroup.primary_button);
                if (buttonDefault != null) {
                    return toTransferButton(protoValidationScope2, buttonDefault, transferConfig);
                }
            } else {
                if (i != 1) {
                    hasObservability.getErrorReporter().report(new SavingsProtoParsingError("ButtonDefaultGroup", "index", "Invalid index requested for button group: " + i, SavingsFeatureError.features, "Savings"), hasObservability.getOneErrorPerAppSessionStrategy());
                    return null;
                }
                ButtonDefault buttonDefault2 = (ButtonDefault) protoValidationScope2.reportIfNullAndContinue("secondary_button", (String) null, buttonDefaultGroup.secondary_button);
                if (buttonDefault2 != null) {
                    return toTransferButton(protoValidationScope2, buttonDefault2, transferConfig);
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ButtonDefaultGroup.class), savingsParsingErrorFactory, null);
        }
    }

    public static final ButtonProminence.Id getProminenceId(squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence, boolean z) {
        buttonProminence.getClass();
        squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence2 = squareup.cash.ui.arcade.elements.ButtonProminence.PROMINENT;
        if (buttonProminence == buttonProminence2 && z) {
            ButtonProminence.Id id = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.destructiveProminent;
        }
        if (buttonProminence == buttonProminence2) {
            ButtonProminence.Id id2 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.prominent;
        }
        squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence3 = squareup.cash.ui.arcade.elements.ButtonProminence.SUBTLE;
        if (buttonProminence == buttonProminence3 && z) {
            ButtonProminence.Id id3 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.destructiveSubtle;
        }
        if (buttonProminence == buttonProminence3) {
            ButtonProminence.Id id4 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.subtle;
        }
        if (z) {
            ButtonProminence.Id id5 = ArcadeButtonProminences.standard;
            return ArcadeButtonProminences.destructiveStandard;
        }
        ButtonProminence.Id id6 = ArcadeButtonProminences.standard;
        return ArcadeButtonProminences.standard;
    }

    public static final SavingsExternalReferenceId getSavingsExternalReferenceIdWithFallback(ProtoValidationScope protoValidationScope, SavingsExternalElementsReference savingsExternalElementsReference) {
        try {
            SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = savingsExternalElementsReference.savings_external_reference_id;
            if (savingsExternalReferenceIdentifier != null) {
                SavingsExternalReference savingsExternalReference = savingsExternalReferenceIdentifier.f1642type;
                if (savingsExternalReference != null) {
                    return new SavingsExternalReferenceId(savingsExternalReference, getScreenType(savingsExternalReferenceIdentifier));
                }
                throw new IllegalArgumentException("type");
            }
            SavingsExternalReference savingsExternalReference2 = savingsExternalElementsReference.savings_external_reference;
            if (savingsExternalReference2 != null) {
                return new SavingsExternalReferenceId(savingsExternalReference2, SavingsScreen.ScreenType.Home.INSTANCE);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, savingsExternalElementsReference != null ? Reflection.factory.getOrCreateKotlinClass(SavingsExternalElementsReference.class) : null, SavingsParsingErrorFactory.INSTANCE, null);
        }
    }

    public static final SavingsScreen.ScreenType getScreenType(SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier) {
        Section.Header header = savingsExternalReferenceIdentifier.screen;
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$SavingsHome) {
            return SavingsScreen.ScreenType.Home.INSTANCE;
        }
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$GeneralSavings) {
            return SavingsScreen.ScreenType.GeneralSavings.INSTANCE;
        }
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) {
            return new SavingsScreen.ScreenType.GoalDetail(((SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) header).value);
        }
        if (header == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(savingsExternalReferenceIdentifier, "An unexpected state of SavingsExternalReferenceIdentifier occurred when parsing screen type: ");
            return null;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final SavingsScreen.Element.CellDefault.Accessory toAccessory(ProtoValidationScope protoValidationScope, CellDefault.CellDefaultAccessory cellDefaultAccessory) {
        HasObservability hasObservability = protoValidationScope.observability;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(cellDefaultAccessory, savingsParsingErrorFactory, protoValidationScope);
            CellDefault.CellDefaultAccessory.Type type2 = cellDefaultAccessory.type;
            if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Push) {
                return SavingsScreen.Element.CellDefault.Accessory.Push.INSTANCE;
            }
            String str = "";
            if (type2 instanceof CellDefault.CellDefaultAccessory.Type.LabeledPush) {
                String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(((CellDefault.CellDefaultAccessory.Type.LabeledPush) type2).getValue().text, "labeled_push text", (String) null);
                if (reportIfNullAndContinue != null) {
                    str = reportIfNullAndContinue;
                }
                return new SavingsScreen.Element.CellDefault.Accessory.LabeledPush(((CellDefault.CellDefaultAccessory.Type.LabeledPush) type2).getValue().text_color, str);
            }
            if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Checkbox) {
                return SavingsScreen.Element.CellDefault.Accessory.Checkbox.INSTANCE;
            }
            if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Radio) {
                return SavingsScreen.Element.CellDefault.Accessory.Radio.INSTANCE;
            }
            if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Toggle) {
                return SavingsScreen.Element.CellDefault.Accessory.Toggle.INSTANCE;
            }
            if (type2 instanceof CellDefault.CellDefaultAccessory.Type.CompactButton) {
                CellDefault.CellDefaultAccessory.CellDefaultAccessoryCompactButton value = ((CellDefault.CellDefaultAccessory.Type.CompactButton) type2).getValue();
                String reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(value.text, "compact_button text", (String) null);
                if (reportIfNullAndContinue2 != null) {
                    str = reportIfNullAndContinue2;
                }
                squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence = (squareup.cash.ui.arcade.elements.ButtonProminence) protoValidationScope2.reportIfNullAndContinue("compact_button prominence", (String) null, value.prominence);
                if (buttonProminence == null) {
                    buttonProminence = squareup.cash.ui.arcade.elements.ButtonProminence.STANDARD;
                }
                return new SavingsScreen.Element.CellDefault.Accessory.CompactButton(str, getProminenceId(buttonProminence, false));
            }
            if (type2 instanceof CellDefault.CellDefaultAccessory.Type.Label) {
                String str2 = (String) protoValidationScope2.reportIfNullAndContinue("label translated_value", (String) null, ((CellDefault.CellDefaultAccessory.Type.Label) type2).getValue().translated_value);
                if (str2 != null) {
                    str = str2;
                }
                return new SavingsScreen.Element.CellDefault.Accessory.Label(str);
            }
            if (type2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            hasObservability.getErrorReporter().report(new SavingsProtoParsingError("CellDefaultAccessory", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "type", 8), hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CellDefault.CellDefaultAccessory.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.ActivitySection toActivitySection(ProtoValidationScope protoValidationScope, ActivitySection activitySection) {
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(activitySection, savingsParsingErrorFactory, protoValidationScope);
            SectionHeader sectionHeader = (SectionHeader) protoValidationScope2.reportIfNullAndContinue("activity_section_header", (String) null, activitySection.activity_section_header);
            if (sectionHeader != null) {
                return new SavingsScreen.Element.ActivitySection(toSectionHeader(protoValidationScope2, sectionHeader), protoValidationScope2.reportIfNullAndContinue(activitySection.no_activity_subtitle, "no_activity_subtitle", (String) null), protoValidationScope2.reportIfNullAndContinue(activitySection.load_failure_subtitle, "load_failure_subtitle", (String) null));
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, activitySection != null ? Reflection.factory.getOrCreateKotlinClass(ActivitySection.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.BetweenSection toBetweenSection(ProtoValidationScope protoValidationScope, BetweenSection betweenSection) {
        HasObservability hasObservability = protoValidationScope.observability;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            BetweenSection.Variant variant = betweenSection.variant;
            if (variant == null) {
                try {
                    throw new IllegalArgumentException("variant");
                } catch (Exception e) {
                    hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(BetweenSection.class), savingsParsingErrorFactory, null), hasObservability.getOneErrorPerAppSessionStrategy());
                    variant = null;
                }
            }
            int i = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$3[variant.ordinal()];
            if (i == -1) {
                variant = BetweenSection.Variant.LARGE;
            } else if (i == 1) {
                hasObservability.getErrorReporter().report(new SavingsProtoParsingError("BetweenSection", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, "variant", 8), hasObservability.getOneErrorPerAppSessionStrategy());
                variant = BetweenSection.Variant.LARGE;
            }
            return new SavingsScreen.Element.BetweenSection(variant);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, betweenSection != null ? Reflection.factory.getOrCreateKotlinClass(BetweenSection.class) : null, savingsParsingErrorFactory, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0012, B:11:0x0016, B:12:0x001b, B:14:0x0023, B:15:0x0028), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023 A[Catch: Exception -> 0x000c, TryCatch #0 {Exception -> 0x000c, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0012, B:11:0x0016, B:12:0x001b, B:14:0x0023, B:15:0x0028), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SavingsScreen.Element.BodyText toBodyText(ProtoValidationScope protoValidationScope, HeroNumericsHeader.BodyText bodyText, SavingsAction savingsAction) {
        String str;
        try {
            LocalizedString localizedString = bodyText.text;
            if (localizedString != null) {
                str = localizedString.translated_value;
                if (str == null) {
                }
                String str2 = str;
                LocalizedString localizedString2 = bodyText.markdown_text;
                String str3 = localizedString2 == null ? localizedString2.translated_value : null;
                Icon icon = bodyText.icon;
                Color color = bodyText.tint_color;
                LocalizedString localizedString3 = bodyText.sq_accessibility_hint;
                return new SavingsScreen.Element.BodyText(str2, str3, icon, color, savingsAction, localizedString3 == null ? localizedString3.translated_value : null);
            }
            str = "";
            String str22 = str;
            LocalizedString localizedString22 = bodyText.markdown_text;
            if (localizedString22 == null) {
            }
            Icon icon2 = bodyText.icon;
            Color color2 = bodyText.tint_color;
            LocalizedString localizedString32 = bodyText.sq_accessibility_hint;
            return new SavingsScreen.Element.BodyText(str22, str3, icon2, color2, savingsAction, localizedString32 == null ? localizedString32.translated_value : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, bodyText != null ? Reflection.factory.getOrCreateKotlinClass(HeroNumericsHeader.BodyText.class) : null, SavingsParsingErrorFactory.INSTANCE, null);
        }
    }

    public static final SavingsScreen.Element.ButtonGroup.Button toButton(ProtoValidationScope protoValidationScope, ButtonDefault buttonDefault) {
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(buttonDefault, savingsParsingErrorFactory, protoValidationScope);
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(buttonDefault.text, "text", (String) null);
            if (reportIfNullAndContinue == null) {
                reportIfNullAndContinue = "";
            }
            String str = reportIfNullAndContinue;
            Icon icon = buttonDefault.icon;
            squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence = (squareup.cash.ui.arcade.elements.ButtonProminence) protoValidationScope2.reportIfNullAndContinue("button_prominence", (String) null, buttonDefault.button_prominence);
            if (buttonProminence == null) {
                buttonProminence = squareup.cash.ui.arcade.elements.ButtonProminence.STANDARD;
            }
            return new SavingsScreen.Element.ButtonGroup.Button(str, icon, getProminenceId(buttonProminence, Intrinsics.areEqual(protoValidationScope2.reportIfNullAndContinue("is_destructive", (String) null, buttonDefault.is_destructive), Boolean.TRUE)), buttonDefault.tap_client_route, buttonDefault.tap_client_route_template_cdf_event);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, buttonDefault != null ? Reflection.factory.getOrCreateKotlinClass(ButtonDefault.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.ButtonGroup toButtonGroup(ProtoValidationScope protoValidationScope, ButtonDefaultGroup buttonDefaultGroup) {
        SavingsScreen.Element.ButtonGroup.Button button;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(buttonDefaultGroup, savingsParsingErrorFactory, protoValidationScope);
            ButtonDefault buttonDefault = buttonDefaultGroup.primary_button;
            ButtonDefault buttonDefault2 = buttonDefaultGroup.tertiary_button;
            ButtonDefault buttonDefault3 = (ButtonDefault) protoValidationScope2.reportIfNullAndContinue("primary_button", (String) null, buttonDefault);
            if (buttonDefault3 != null) {
                SavingsScreen.Element.ButtonGroup.Button button2 = toButton(protoValidationScope2, buttonDefault3);
                ButtonDefault buttonDefault4 = buttonDefaultGroup.secondary_button;
                if (buttonDefault2 != null) {
                    ButtonDefault buttonDefault5 = (ButtonDefault) protoValidationScope2.reportIfNullAndContinue("secondary_button", (String) null, buttonDefault4);
                    if (buttonDefault5 != null) {
                        button = toButton(protoValidationScope2, buttonDefault5);
                    }
                } else {
                    button = buttonDefault4 != null ? toButton(protoValidationScope2, buttonDefault4) : null;
                }
                SavingsScreen.Element.ButtonGroup.Button button3 = buttonDefault2 != null ? toButton(protoValidationScope2, buttonDefault2) : null;
                ButtonDefaultGroup.Direction direction = (ButtonDefaultGroup.Direction) protoValidationScope2.reportIfNullAndContinue("direction", (String) null, buttonDefaultGroup.direction);
                return new SavingsScreen.Element.ButtonGroup(button2, button, button3, direction != null ? toButtonGroupDirection(protoValidationScope2, direction) : SavingsScreen.Element.ButtonGroupDirection.HORIZONTAL);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, buttonDefaultGroup != null ? Reflection.factory.getOrCreateKotlinClass(ButtonDefaultGroup.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.ButtonGroupDirection toButtonGroupDirection(ProtoValidationScope protoValidationScope, ButtonDefaultGroup.Direction direction) {
        HasObservability hasObservability = protoValidationScope.observability;
        int ordinal = direction.ordinal();
        if (ordinal == 1) {
            return SavingsScreen.Element.ButtonGroupDirection.HORIZONTAL;
        }
        if (ordinal == 2) {
            return SavingsScreen.Element.ButtonGroupDirection.VERTICAL;
        }
        hasObservability.getErrorReporter().report(new SavingsProtoParsingError("ButtonDefaultGroup", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, (String) null, 12), hasObservability.getOneErrorPerAppSessionStrategy());
        return SavingsScreen.Element.ButtonGroupDirection.HORIZONTAL;
    }

    public static final SavingsScreen.Element.CellDefault toCellDefault(ProtoValidationScope protoValidationScope, ArcadeElement.TappableCellDefault tappableCellDefault) {
        String reportIfNullAndContinue;
        SavingsScreen.Element.CellDefault.Icon icon;
        SavingsScreen.Element.CellDefault.Accessory accessory;
        tappableCellDefault.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(tappableCellDefault, savingsParsingErrorFactory, protoValidationScope);
            CellDefault cellDefault = (CellDefault) protoValidationScope2.reportIfNullAndContinue("cell_default", (String) null, tappableCellDefault.cell_default);
            if (cellDefault != null && (reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(cellDefault.label_text, "label_text", (String) null)) != null) {
                LocalizedString localizedString = cellDefault.body_text;
                String str = localizedString != null ? localizedString.translated_value : null;
                CellDefault.CellDefaultIcon cellDefaultIcon = cellDefault.icon;
                if (cellDefaultIcon != null) {
                    SavingsScreen.Element.CellDefault.Icon icon2 = toIcon(protoValidationScope2, cellDefaultIcon);
                    if (icon2 != null) {
                        icon = icon2;
                    }
                } else {
                    icon = null;
                }
                CellDefault.CellDefaultAccessory cellDefaultAccessory = cellDefault.accessory;
                if (cellDefaultAccessory != null) {
                    SavingsScreen.Element.CellDefault.Accessory accessory2 = toAccessory(protoValidationScope2, cellDefaultAccessory);
                    if (accessory2 != null) {
                        accessory = accessory2;
                    }
                } else {
                    accessory = null;
                }
                squareup.cash.savings.action.SavingsAction savingsAction = tappableCellDefault.tap_action;
                SavingsAction.ClientRoute savingsAction2 = savingsAction != null ? HapticFeedbackConstantsCompat.toSavingsAction(protoValidationScope2, savingsAction) : null;
                ClientRouteTemplate clientRouteTemplate = tappableCellDefault.tap_client_route_template;
                return new SavingsScreen.Element.CellDefault(reportIfNullAndContinue, str, icon, accessory, savingsAction2, clientRouteTemplate != null ? toTemplateClientRoute(protoValidationScope2, clientRouteTemplate, tappableCellDefault.tap_client_route_template_cdf_event) : null);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ArcadeElement.TappableCellDefault.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.CompactCard toCompactCard(ProtoValidationScope protoValidationScope, CompactCard compactCard) {
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(compactCard, savingsParsingErrorFactory, protoValidationScope);
            ButtonCompact buttonCompact = (ButtonCompact) protoValidationScope2.reportIfNullAndContinue("button", (String) null, compactCard.button);
            if (buttonCompact == null) {
                return null;
            }
            String str = (String) protoValidationScope2.reportIfNullAndContinue("button_client_route", (String) null, compactCard.button_client_route);
            String str2 = "";
            if (str == null) {
                str = "";
            }
            SavingsScreen.Element.CompactCard.Button button = toButton(protoValidationScope2, buttonCompact, str, compactCard.cdfEvent);
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(compactCard.body_text, "body_text", (String) null);
            if (reportIfNullAndContinue != null) {
                str2 = reportIfNullAndContinue;
            }
            return new SavingsScreen.Element.CompactCard(str2, compactCard.image, button);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, compactCard != null ? Reflection.factory.getOrCreateKotlinClass(CompactCard.class) : null, savingsParsingErrorFactory, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:9|(9:11|(1:13)(1:35)|(1:15)(1:(1:34))|16|17|18|(2:20|(1:22)(1:26))(1:27)|23|24)|36|16|17|18|(0)(0)|23|24) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        r10.getErrorReporter().report(androidx.compose.ui.draw.RotateKt.toProtoParsingExceptionFor(r4, kotlin.jvm.internal.Reflection.factory.getOrCreateKotlinClass(r11.getClass()), r0, null), r10.getOneErrorPerAppSessionStrategy());
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: Exception -> 0x003c, TryCatch #1 {Exception -> 0x003c, blocks: (B:3:0x0003, B:9:0x0029, B:11:0x002d, B:13:0x0037, B:15:0x0042, B:16:0x0057, B:20:0x007c, B:22:0x0087, B:23:0x00a5, B:26:0x008a, B:27:0x00a3, B:30:0x0060, B:34:0x004e, B:39:0x000c, B:18:0x005b, B:5:0x0007), top: B:2:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[Catch: Exception -> 0x003c, TryCatch #1 {Exception -> 0x003c, blocks: (B:3:0x0003, B:9:0x0029, B:11:0x002d, B:13:0x0037, B:15:0x0042, B:16:0x0057, B:20:0x007c, B:22:0x0087, B:23:0x00a5, B:26:0x008a, B:27:0x00a3, B:30:0x0060, B:34:0x004e, B:39:0x000c, B:18:0x005b, B:5:0x0007), top: B:2:0x0003, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TransferConfig.TransferOutConfig toConfig(ProtoValidationScope protoValidationScope, TransferButtons.TransferOutConfig transferOutConfig, ClientRouteTemplate clientRouteTemplate) {
        TransferConfig.ClientRouteTemplate clientRouteTemplate2;
        TransferButtons.AlternativeButtonBehavior alternativeButtonBehavior;
        TransferConfig.AlternativeButtonBehavior alternativeButtonBehavior2;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            Money money = transferOutConfig.minimum_amount;
            try {
                ProtoValidationScope.required(money, "minimum_amount");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(transferOutConfig.getClass()), savingsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                money = null;
            }
            if (money == null) {
                return null;
            }
            CdfEvent cdfEvent = transferOutConfig.cdfEvent;
            if (clientRouteTemplate != null) {
                String str = clientRouteTemplate.f1643android;
                String str2 = clientRouteTemplate.zero_arg_verbatim_string;
                Long l = clientRouteTemplate.argument_count;
                long longValue = l != null ? l.longValue() : 0L;
                if (str != null) {
                    clientRouteTemplate2 = new TransferConfig.ClientRouteTemplate(longValue, str, str2);
                } else if (str2 != null && longValue == 0) {
                    clientRouteTemplate2 = new TransferConfig.ClientRouteTemplate(longValue, "", str2);
                }
                alternativeButtonBehavior = transferOutConfig.zero_balance_behavior;
                ProtoValidationScope.required(alternativeButtonBehavior, "zero_balance_behavior");
                if (alternativeButtonBehavior != null) {
                    alternativeButtonBehavior2 = TransferConfig.AlternativeButtonBehavior.NONE;
                } else if (WhenMappings.$EnumSwitchMapping$1[alternativeButtonBehavior.ordinal()] == 1) {
                    alternativeButtonBehavior2 = TransferConfig.AlternativeButtonBehavior.SHAKE;
                } else {
                    protoValidationScope.getErrorReporter().report(new SavingsProtoParsingError("TransferButtons", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, (String) null, 12), protoValidationScope.getOneErrorPerAppSessionStrategy());
                    alternativeButtonBehavior2 = TransferConfig.AlternativeButtonBehavior.NONE;
                }
                return new TransferConfig.TransferOutConfig(money, cdfEvent, clientRouteTemplate2, alternativeButtonBehavior2);
            }
            clientRouteTemplate2 = null;
            alternativeButtonBehavior = transferOutConfig.zero_balance_behavior;
            ProtoValidationScope.required(alternativeButtonBehavior, "zero_balance_behavior");
            if (alternativeButtonBehavior != null) {
            }
            return new TransferConfig.TransferOutConfig(money, cdfEvent, clientRouteTemplate2, alternativeButtonBehavior2);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(TransferButtons.TransferOutConfig.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element toElement(ProtoValidationScope protoValidationScope, SavingsElement savingsElement) {
        HasObservability hasObservability = protoValidationScope.observability;
        savingsElement.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(savingsElement, savingsParsingErrorFactory, protoValidationScope);
            SavingsElement.Element element = savingsElement.element;
            if (element instanceof SavingsElement.Element.NoGoalHeader) {
                return toNoGoalHeader(protoValidationScope2, ((SavingsElement.Element.NoGoalHeader) element).value);
            }
            if (element instanceof SavingsElement.Element.GoalHeader) {
                return toGoalHeader(protoValidationScope2, ((SavingsElement.Element.GoalHeader) element).value);
            }
            if (element instanceof SavingsElement.Element.TransferButtons) {
                return toTransferButtons(protoValidationScope2, ((SavingsElement.Element.TransferButtons) element).value);
            }
            if (element instanceof SavingsElement.Element.FolderList) {
                return toFolderList(protoValidationScope2, ((SavingsElement.Element.FolderList) element).value);
            }
            if (element instanceof SavingsElement.Element.ActivitySection) {
                return toActivitySection(protoValidationScope2, ((SavingsElement.Element.ActivitySection) element).value);
            }
            if (element instanceof SavingsElement.Element.CompactCard) {
                return toCompactCard(protoValidationScope2, ((SavingsElement.Element.CompactCard) element).value);
            }
            if (element instanceof SavingsElement.Element.Card) {
                SavingsCard card = HapticFeedbackConstantsCompat.toCard(protoValidationScope2, ((SavingsElement.Element.Card) element).value);
                if (card != null) {
                    return new SavingsScreen.Element.CardElement(card);
                }
                return null;
            }
            if (element instanceof SavingsElement.Element.Disclosure) {
                return SavingsScreen.Element.Disclosure.INSTANCE;
            }
            if (element != null) {
                throw new NoWhenBranchMatchedException();
            }
            hasObservability.getErrorReporter().report(new SavingsProtoParsingError("SavingsElement", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "element", 8), hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SavingsElement.class), savingsParsingErrorFactory, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x000c, B:5:0x0017, B:6:0x001e, B:8:0x0022, B:10:0x0026, B:11:0x0031, B:12:0x0037, B:14:0x003d, B:18:0x0050, B:20:0x0054, B:22:0x0058, B:28:0x006a, B:42:0x008a, B:43:0x008f, B:45:0x0090, B:46:0x009b, B:48:0x00a1, B:51:0x00ad, B:56:0x00b1, B:58:0x00b7, B:60:0x0073, B:63:0x0066), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0073 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:3:0x000c, B:5:0x0017, B:6:0x001e, B:8:0x0022, B:10:0x0026, B:11:0x0031, B:12:0x0037, B:14:0x003d, B:18:0x0050, B:20:0x0054, B:22:0x0058, B:28:0x006a, B:42:0x008a, B:43:0x008f, B:45:0x0090, B:46:0x009b, B:48:0x00a1, B:51:0x00ad, B:56:0x00b1, B:58:0x00b7, B:60:0x0073, B:63:0x0066), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SavingsScreen.ElementList toElements(ProtoValidationScope protoValidationScope, SavingsExternalElementsReference savingsExternalElementsReference, List list, SavingsScreen.ScreenType screenType) {
        Object obj;
        List list2;
        int i;
        savingsExternalElementsReference.getClass();
        list.getClass();
        screenType.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(savingsExternalElementsReference, savingsParsingErrorFactory, protoValidationScope);
            SavingsExternalReferenceId savingsExternalReferenceIdWithFallback = getSavingsExternalReferenceIdWithFallback(protoValidationScope2, savingsExternalElementsReference);
            if (((savingsExternalReferenceIdWithFallback != null ? savingsExternalReferenceIdWithFallback.screenType : null) instanceof SavingsScreen.ScreenType.GoalDetail) && (screenType instanceof SavingsScreen.ScreenType.GoalDetail)) {
                SavingsExternalReference savingsExternalReference = savingsExternalReferenceIdWithFallback.savingsExternalReference;
                savingsExternalReference.getClass();
                savingsExternalReferenceIdWithFallback = new SavingsExternalReferenceId(savingsExternalReference, screenType);
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(getSavingsExternalReferenceIdWithFallback(protoValidationScope2, (SavingsExternalElements) obj), savingsExternalReferenceIdWithFallback)) {
                    break;
                }
            }
            SavingsExternalElements savingsExternalElements = (SavingsExternalElements) obj;
            if (savingsExternalElements != null && (list2 = savingsExternalElements.elements) != null) {
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    SavingsExternalReference savingsExternalReference2 = savingsExternalReferenceIdWithFallback == null ? savingsExternalReferenceIdWithFallback.savingsExternalReference : null;
                    i = savingsExternalReference2 != null ? -1 : WhenMappings.$EnumSwitchMapping$0[savingsExternalReference2.ordinal()];
                    if (i != -1) {
                        if (i == 1 || i == 2 || i == 3) {
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                SavingsScreen.Element element = toElement(protoValidationScope2, (ArcadeElement) it2.next());
                                if (element != null) {
                                    arrayList.add(element);
                                }
                            }
                            return new SavingsScreen.ElementList(arrayList);
                        }
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    protoValidationScope.getErrorReporter().report(new SavingsProtoParsingError("SavingsExternalElementsReference", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "element", 8), protoValidationScope.getOneErrorPerAppSessionStrategy());
                    return new SavingsScreen.ElementList(EmptyList.INSTANCE);
                }
            }
            list2 = savingsExternalElementsReference.fallback_elements;
            if (savingsExternalReferenceIdWithFallback == null) {
            }
            if (savingsExternalReference2 != null) {
            }
            if (i != -1) {
            }
            protoValidationScope.getErrorReporter().report(new SavingsProtoParsingError("SavingsExternalElementsReference", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "element", 8), protoValidationScope.getOneErrorPerAppSessionStrategy());
            return new SavingsScreen.ElementList(EmptyList.INSTANCE);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SavingsExternalElementsReference.class), savingsParsingErrorFactory, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SavingsScreen.Element.FolderList toFolderList(ProtoValidationScope protoValidationScope, FolderList folderList) {
        String str;
        String str2;
        String reportIfNullAndContinue;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(folderList, savingsParsingErrorFactory, protoValidationScope);
            String reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(folderList.general_savings_label, "general_savings_label", (String) null);
            LocalizedString localizedString = folderList.general_savings_body;
            String str3 = localizedString != null ? localizedString.translated_value : null;
            String str4 = (String) protoValidationScope2.reportIfNullAndContinue("general_folder_tap_client_route", (String) null, folderList.general_folder_tap_client_route);
            String str5 = str4 == null ? "" : str4;
            FolderList.LocalizedTemplateString localizedTemplateString = (FolderList.LocalizedTemplateString) protoValidationScope2.reportIfNullAndContinue("goal_folder_body_template", (String) null, folderList.goal_folder_body_template);
            if (localizedTemplateString != null && (reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(localizedTemplateString.f1645android, "goal_folder_body_template android", (String) null)) != null) {
                str = reportIfNullAndContinue;
                String reportIfNullAndContinue3 = protoValidationScope2.reportIfNullAndContinue(folderList.goal_folder_completed_body, "goal_folder_completed_body", (String) null);
                String str6 = reportIfNullAndContinue3 != null ? "" : reportIfNullAndContinue3;
                ClientRouteTemplate clientRouteTemplate = (ClientRouteTemplate) protoValidationScope2.reportIfNullAndContinue("goal_folder_tap_client_route_template", (String) null, folderList.goal_folder_tap_client_route_template);
                return new SavingsScreen.Element.FolderList(reportIfNullAndContinue2, str3, str5, str, str6, (clientRouteTemplate != null || (str2 = (String) protoValidationScope2.reportIfNullAndContinue("goal_folder_tap_client_route_template android", (String) null, clientRouteTemplate.f1643android)) == null) ? "" : str2, folderList.tap_cdf_event);
            }
            str = "";
            String reportIfNullAndContinue32 = protoValidationScope2.reportIfNullAndContinue(folderList.goal_folder_completed_body, "goal_folder_completed_body", (String) null);
            if (reportIfNullAndContinue32 != null) {
            }
            ClientRouteTemplate clientRouteTemplate2 = (ClientRouteTemplate) protoValidationScope2.reportIfNullAndContinue("goal_folder_tap_client_route_template", (String) null, folderList.goal_folder_tap_client_route_template);
            return new SavingsScreen.Element.FolderList(reportIfNullAndContinue2, str3, str5, str, str6, (clientRouteTemplate2 != null || (str2 = (String) protoValidationScope2.reportIfNullAndContinue("goal_folder_tap_client_route_template android", (String) null, clientRouteTemplate2.f1643android)) == null) ? "" : str2, folderList.tap_cdf_event);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, folderList != null ? Reflection.factory.getOrCreateKotlinClass(FolderList.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.GoalHeader toGoalHeader(ProtoValidationScope protoValidationScope, GoalHeader goalHeader) {
        SavingsScreen.Element.BodyText bodyText;
        SavingsAction savingsAction;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(goalHeader, savingsParsingErrorFactory, protoValidationScope);
            boolean z = goalHeader.page_header != null;
            BetweenSection betweenSection = goalHeader.page_header_bottom_spacing;
            SavingsScreen.Element.BetweenSection betweenSection2 = betweenSection != null ? toBetweenSection(protoValidationScope2, betweenSection) : null;
            HeroNumericsHeader.BodyText bodyText2 = goalHeader.goal_folder_balance_subtitle;
            if (bodyText2 != null) {
                Card card = goalHeader.goal_balance_present_card;
                if (card != null) {
                    CdfEvent cdfEvent = goalHeader.goal_balance_present_card_cdf_event;
                    SavingsCard card2 = HapticFeedbackConstantsCompat.toCard(protoValidationScope2, card);
                    savingsAction = card2 == null ? null : new SavingsAction.PresentCard(card2, cdfEvent);
                    if (savingsAction != null) {
                        bodyText = toBodyText(protoValidationScope2, bodyText2, savingsAction);
                    }
                }
                squareup.cash.savings.action.SavingsAction savingsAction2 = goalHeader.goal_balance_action;
                savingsAction = savingsAction2 != null ? HapticFeedbackConstantsCompat.toSavingsAction(protoValidationScope2, savingsAction2) : null;
                bodyText = toBodyText(protoValidationScope2, bodyText2, savingsAction);
            } else {
                bodyText = null;
            }
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(goalHeader.remaining_goal_amount_subtitle, "remaining_goal_amount_subtitle", (String) null);
            String str = reportIfNullAndContinue == null ? "" : reportIfNullAndContinue;
            String reportIfNullAndContinue2 = protoValidationScope2.reportIfNullAndContinue(goalHeader.remove_goal_button_text, "remove_goal_button_text", (String) null);
            String str2 = reportIfNullAndContinue2 == null ? "" : reportIfNullAndContinue2;
            String reportIfNullAndContinue3 = protoValidationScope2.reportIfNullAndContinue(goalHeader.goal_met_text, "goal_met_text", (String) null);
            String str3 = reportIfNullAndContinue3 == null ? "" : reportIfNullAndContinue3;
            ClientRouteTemplate clientRouteTemplate = goalHeader.remove_goal_client_route_template;
            return new SavingsScreen.Element.GoalHeader(z, betweenSection2, bodyText, str, str2, str3, clientRouteTemplate != null ? (String) protoValidationScope2.reportIfNullAndContinue("remove_goal_client_route_template android", (String) null, clientRouteTemplate.f1643android) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, goalHeader != null ? Reflection.factory.getOrCreateKotlinClass(GoalHeader.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.CellDefault.Icon toIcon(ProtoValidationScope protoValidationScope, CellDefault.CellDefaultIcon cellDefaultIcon) {
        HasObservability hasObservability = protoValidationScope.observability;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            CellDefault.CellDefaultIcon.IconStyle iconStyle = cellDefaultIcon.icon_style;
            if (iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.Icon) {
                return new SavingsScreen.Element.CellDefault.Icon.DefaultIcon(((CellDefault.CellDefaultIcon.IconStyle.Icon) iconStyle).getValue());
            }
            if (!(iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon)) {
                hasObservability.getErrorReporter().report(new SavingsProtoParsingError("CellDefaultIcon", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "icon_style", 8), hasObservability.getOneErrorPerAppSessionStrategy());
                return null;
            }
            CellDefault.CellDefaultIcon.TintedIcon value = ((CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle).getValue();
            Icon icon = value.icon;
            try {
                ProtoValidationScope.required(icon, "tinted_icon icon");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(cellDefaultIcon.getClass()), savingsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                icon = null;
            }
            if (icon != null) {
                Color color = value.background_color;
                try {
                    ProtoValidationScope.required(color, "tinted_icon background_color");
                } catch (Exception e2) {
                    protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(cellDefaultIcon.getClass()), savingsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                    color = null;
                }
                if (color != null) {
                    return new SavingsScreen.Element.CellDefault.Icon.TintedIcon(icon, color, value.icon_tint_color);
                }
            }
            return null;
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(CellDefault.CellDefaultIcon.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.NoGoalHeader toNoGoalHeader(ProtoValidationScope protoValidationScope, NoGoalHeader noGoalHeader) {
        SavingsScreen.Element.BodyText bodyText;
        SavingsAction savingsAction;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(noGoalHeader, savingsParsingErrorFactory, protoValidationScope);
            HeroNumericsHeader heroNumericsHeader = (HeroNumericsHeader) protoValidationScope2.reportIfNullAndContinue("hero_numerics_header", (String) null, noGoalHeader.hero_numerics_header);
            if (heroNumericsHeader == null) {
                return null;
            }
            LocalizedString localizedString = heroNumericsHeader.section_title_text;
            String str = localizedString != null ? localizedString.translated_value : null;
            HeroNumericsHeader.BodyText bodyText2 = heroNumericsHeader.body_text;
            if (bodyText2 != null) {
                Card card = noGoalHeader.body_tap_present_card;
                if (card != null) {
                    CdfEvent cdfEvent = noGoalHeader.body_tap_present_card_cdf_event;
                    SavingsCard card2 = HapticFeedbackConstantsCompat.toCard(protoValidationScope2, card);
                    savingsAction = card2 == null ? null : new SavingsAction.PresentCard(card2, cdfEvent);
                    if (savingsAction != null) {
                        bodyText = toBodyText(protoValidationScope2, bodyText2, savingsAction);
                    }
                }
                squareup.cash.savings.action.SavingsAction savingsAction2 = noGoalHeader.body_tap_action;
                savingsAction = savingsAction2 != null ? HapticFeedbackConstantsCompat.toSavingsAction(protoValidationScope2, savingsAction2) : null;
                bodyText = toBodyText(protoValidationScope2, bodyText2, savingsAction);
            } else {
                bodyText = null;
            }
            LocalizedString localizedString2 = heroNumericsHeader.additional_body_text;
            return new SavingsScreen.Element.NoGoalHeader(str, bodyText, localizedString2 != null ? localizedString2.translated_value : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, noGoalHeader != null ? Reflection.factory.getOrCreateKotlinClass(NoGoalHeader.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen toSavingsScreen(HasObservability hasObservability, VersionedSavingsScreens versionedSavingsScreens, SavingsScreen.ScreenType screenType, List list) {
        versionedSavingsScreens.getClass();
        screenType.getClass();
        list.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(versionedSavingsScreens, savingsParsingErrorFactory, hasObservability);
            SavingsScreens savingsScreens = versionedSavingsScreens.v2_screens;
            ProtoValidationScope.required(savingsScreens, "v2_screens");
            if (screenType.equals(SavingsScreen.ScreenType.Home.INSTANCE)) {
                squareup.cash.savings.SavingsScreen savingsScreen = savingsScreens.home;
                ProtoValidationScope.required(savingsScreen, "home");
                String reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(savingsScreens.home_title, "home_title", (String) null);
                Boolean bool = savingsScreens.home_binds_to_inferred_folder_from_single_goal_rules;
                return toScreen(protoValidationScope, savingsScreen, screenType, reportIfNullAndContinue, bool != null ? bool.booleanValue() : false, list);
            }
            if (screenType.equals(SavingsScreen.ScreenType.GeneralSavings.INSTANCE)) {
                squareup.cash.savings.SavingsScreen savingsScreen2 = savingsScreens.general_savings_details;
                ProtoValidationScope.required(savingsScreen2, "general_savings_details");
                return toScreen$default(protoValidationScope, savingsScreen2, screenType, protoValidationScope.reportIfNullAndContinue(savingsScreens.general_savings_details_title, "general_savings_details_title", (String) null), null, 24);
            }
            if (!(screenType instanceof SavingsScreen.ScreenType.GoalDetail)) {
                throw new NoWhenBranchMatchedException();
            }
            squareup.cash.savings.SavingsScreen savingsScreen3 = savingsScreens.goal_details;
            ProtoValidationScope.required(savingsScreen3, "goal_details");
            return toScreen$default(protoValidationScope, savingsScreen3, screenType, null, list, 12);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(VersionedSavingsScreens.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen toScreen(ProtoValidationScope protoValidationScope, squareup.cash.savings.SavingsScreen savingsScreen, SavingsScreen.ScreenType screenType, String str, boolean z, List list) {
        savingsScreen.getClass();
        screenType.getClass();
        list.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(savingsScreen, savingsParsingErrorFactory, protoValidationScope);
            List list2 = savingsScreen.elements;
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(toElements(protoValidationScope2, (SavingsScreen.Element) it.next(), list, screenType), arrayList);
            }
            return new com.squareup.cash.savings.backend.api.model.SavingsScreen(str, arrayList, screenType, z);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(squareup.cash.savings.SavingsScreen.class), savingsParsingErrorFactory, null);
        }
    }

    public static com.squareup.cash.savings.backend.api.model.SavingsScreen toScreen$default(ProtoValidationScope protoValidationScope, squareup.cash.savings.SavingsScreen savingsScreen, SavingsScreen.ScreenType screenType, String str, List list, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            list = EmptyList.INSTANCE;
        }
        return toScreen(protoValidationScope, savingsScreen, screenType, str2, false, list);
    }

    public static final SavingsScreen.Element.SectionHeader toSectionHeader(ProtoValidationScope protoValidationScope, SectionHeader sectionHeader) {
        String str;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            try {
                str = ProtoValidationScope.required(sectionHeader.title_text, "title");
                "title".concat(" translated_value");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, sectionHeader != null ? Reflection.factory.getOrCreateKotlinClass(sectionHeader.getClass()) : null, savingsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                str = null;
            }
            if (str == null) {
                str = "";
            }
            LocalizedString localizedString = sectionHeader.show_more_text;
            return new SavingsScreen.Element.SectionHeader(str, localizedString != null ? localizedString.translated_value : null);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, sectionHeader != null ? Reflection.factory.getOrCreateKotlinClass(SectionHeader.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.CellDefault.TemplateClientRoute toTemplateClientRoute(ProtoValidationScope protoValidationScope, ClientRouteTemplate clientRouteTemplate, CdfEvent cdfEvent) {
        HasObservability hasObservability = protoValidationScope.observability;
        clientRouteTemplate.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            String str = clientRouteTemplate.f1643android;
            if (str == null) {
                try {
                    throw new IllegalArgumentException("tap_client_route_template android".toString());
                } catch (Exception e) {
                    hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ClientRouteTemplate.class), savingsParsingErrorFactory, null), hasObservability.getOneErrorPerAppSessionStrategy());
                    str = null;
                }
            }
            if (str == null) {
                return null;
            }
            return new SavingsScreen.Element.CellDefault.TemplateClientRoute(str, cdfEvent);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(ClientRouteTemplate.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.TransferButtons.TransferButton toTransferButton(ProtoValidationScope protoValidationScope, ButtonDefault buttonDefault, TransferConfig transferConfig) {
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(buttonDefault, savingsParsingErrorFactory, protoValidationScope);
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(buttonDefault.text, "text", (String) null);
            if (reportIfNullAndContinue == null) {
                reportIfNullAndContinue = "";
            }
            squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence = (squareup.cash.ui.arcade.elements.ButtonProminence) protoValidationScope2.reportIfNullAndContinue("button_prominence", (String) null, buttonDefault.button_prominence);
            if (buttonProminence == null) {
                buttonProminence = squareup.cash.ui.arcade.elements.ButtonProminence.STANDARD;
            }
            Boolean bool = (Boolean) protoValidationScope2.reportIfNullAndContinue("is_destructive", (String) null, buttonDefault.is_destructive);
            return new SavingsScreen.Element.TransferButtons.TransferButton(reportIfNullAndContinue, getProminenceId(buttonProminence, bool != null ? bool.booleanValue() : false), transferConfig);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ButtonDefault.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.TransferButtons toTransferButtons(ProtoValidationScope protoValidationScope, TransferButtons transferButtons) {
        SavingsScreen.Element.TransferButtons.TransferButton button;
        SavingsScreen.Element.TransferButtons.TransferButton button2;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(transferButtons, savingsParsingErrorFactory, protoValidationScope);
            ButtonDefaultGroup buttonDefaultGroup = (ButtonDefaultGroup) protoValidationScope2.reportIfNullAndContinue("button_group", (String) null, transferButtons.button_group);
            if (buttonDefaultGroup != null) {
                Long l = (Long) protoValidationScope2.reportIfNullAndContinue("transfer_in_button_index", (String) null, transferButtons.transfer_in_button_index);
                TransferButtons.TransferInConfig transferInConfig = (TransferButtons.TransferInConfig) protoValidationScope2.reportIfNullAndContinue("transfer_in_config", (String) null, transferButtons.transfer_in_config);
                TransferConfig.TransferInConfig config = transferInConfig != null ? toConfig(protoValidationScope2, transferInConfig, transferButtons.transfer_in_button_client_route_template) : null;
                Long l2 = (Long) protoValidationScope2.reportIfNullAndContinue("transfer_out_button_index", (String) null, transferButtons.transfer_out_button_index);
                TransferButtons.TransferOutConfig transferOutConfig = (TransferButtons.TransferOutConfig) protoValidationScope2.reportIfNullAndContinue("transfer_out_config", (String) null, transferButtons.transfer_out_config);
                TransferConfig.TransferOutConfig config2 = transferOutConfig != null ? toConfig(protoValidationScope2, transferOutConfig, transferButtons.transfer_out_button_client_route_template) : null;
                if (l != null && config != null && l2 != null && config2 != null && (button = getButton(protoValidationScope2, buttonDefaultGroup, l.longValue(), config)) != null && (button2 = getButton(protoValidationScope2, buttonDefaultGroup, l2.longValue(), config2)) != null) {
                    ButtonDefaultGroup.Direction direction = (ButtonDefaultGroup.Direction) protoValidationScope2.reportIfNullAndContinue("direction", (String) null, buttonDefaultGroup.direction);
                    return new SavingsScreen.Element.TransferButtons(button, button2, direction != null ? toButtonGroupDirection(protoValidationScope2, direction) : SavingsScreen.Element.ButtonGroupDirection.HORIZONTAL);
                }
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, transferButtons != null ? Reflection.factory.getOrCreateKotlinClass(TransferButtons.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element.WithinSection toWithinSection(ProtoValidationScope protoValidationScope, WithinSection withinSection) {
        HasObservability hasObservability = protoValidationScope.observability;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            WithinSection.Variant variant = withinSection.variant;
            if (variant == null) {
                try {
                    throw new IllegalArgumentException("variant");
                } catch (Exception e) {
                    hasObservability.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(WithinSection.class), savingsParsingErrorFactory, null), hasObservability.getOneErrorPerAppSessionStrategy());
                    variant = null;
                }
            }
            int i = variant == null ? -1 : WhenMappings.$EnumSwitchMapping$2[variant.ordinal()];
            if (i == -1) {
                variant = WithinSection.Variant.SMALL;
            } else if (i == 1) {
                hasObservability.getErrorReporter().report(new SavingsProtoParsingError("WithinSection", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, "variant", 8), hasObservability.getOneErrorPerAppSessionStrategy());
                variant = WithinSection.Variant.SMALL;
            }
            return new SavingsScreen.Element.WithinSection(variant);
        } catch (Exception e2) {
            throw RotateKt.toProtoParsingExceptionFor(e2, withinSection != null ? Reflection.factory.getOrCreateKotlinClass(WithinSection.class) : null, savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsExternalReferenceId getSavingsExternalReferenceIdWithFallback(ProtoValidationScope protoValidationScope, SavingsExternalElements savingsExternalElements) {
        try {
            SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = savingsExternalElements.savings_external_reference_id;
            if (savingsExternalReferenceIdentifier != null) {
                SavingsExternalReference savingsExternalReference = savingsExternalReferenceIdentifier.f1642type;
                if (savingsExternalReference != null) {
                    return new SavingsExternalReferenceId(savingsExternalReference, getScreenType(savingsExternalReferenceIdentifier));
                }
                throw new IllegalArgumentException("type");
            }
            SavingsExternalReference savingsExternalReference2 = savingsExternalElements.savings_external_reference;
            if (savingsExternalReference2 != null) {
                return new SavingsExternalReferenceId(savingsExternalReference2, SavingsScreen.ScreenType.Home.INSTANCE);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, savingsExternalElements != null ? Reflection.factory.getOrCreateKotlinClass(SavingsExternalElements.class) : null, SavingsParsingErrorFactory.INSTANCE, null);
        }
    }

    public static final SavingsScreen.Element.CompactCard.Button toButton(ProtoValidationScope protoValidationScope, ButtonCompact buttonCompact, String str, CdfEvent cdfEvent) {
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(buttonCompact, savingsParsingErrorFactory, protoValidationScope);
            String reportIfNullAndContinue = protoValidationScope2.reportIfNullAndContinue(buttonCompact.text, "text", (String) null);
            if (reportIfNullAndContinue == null) {
                reportIfNullAndContinue = "";
            }
            String str2 = reportIfNullAndContinue;
            Icon icon = buttonCompact.icon;
            squareup.cash.ui.arcade.elements.ButtonProminence buttonProminence = (squareup.cash.ui.arcade.elements.ButtonProminence) protoValidationScope2.reportIfNullAndContinue("button_prominence", (String) null, buttonCompact.button_prominence);
            if (buttonProminence == null) {
                buttonProminence = squareup.cash.ui.arcade.elements.ButtonProminence.STANDARD;
            }
            Boolean bool = (Boolean) protoValidationScope2.reportIfNullAndContinue("is_destructive", (String) null, buttonCompact.is_destructive);
            return new SavingsScreen.Element.CompactCard.Button(str2, icon, getProminenceId(buttonProminence, bool != null ? bool.booleanValue() : false), str, cdfEvent);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ButtonCompact.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.Element toElement(ProtoValidationScope protoValidationScope, ArcadeElement arcadeElement) {
        HasObservability hasObservability = protoValidationScope.observability;
        arcadeElement.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(arcadeElement, savingsParsingErrorFactory, protoValidationScope);
            ArcadeElement.Element element = arcadeElement.element;
            if (element instanceof ArcadeElement.Element.SectionHeader) {
                return toSectionHeader(protoValidationScope2, ((ArcadeElement.Element.SectionHeader) element).value);
            }
            if (element instanceof ArcadeElement.Element.CellDefault) {
                return toCellDefault(protoValidationScope2, ((ArcadeElement.Element.CellDefault) element).value);
            }
            if (element instanceof ArcadeElement.Element.WithinSection) {
                return toWithinSection(protoValidationScope2, ((ArcadeElement.Element.WithinSection) element).value);
            }
            if (element instanceof ArcadeElement.Element.BetweenSection) {
                return toBetweenSection(protoValidationScope2, ((ArcadeElement.Element.BetweenSection) element).value);
            }
            if (element instanceof ArcadeElement.Element.ButtonDefaultGroup) {
                return toButtonGroup(protoValidationScope2, ((ArcadeElement.Element.ButtonDefaultGroup) element).value);
            }
            hasObservability.getErrorReporter().report(new SavingsProtoParsingError("ArcadeElement", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "element", 8), hasObservability.getOneErrorPerAppSessionStrategy());
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(ArcadeElement.class), savingsParsingErrorFactory, null);
        }
    }

    public static final TransferConfig.TransferInConfig toConfig(ProtoValidationScope protoValidationScope, TransferButtons.TransferInConfig transferInConfig, ClientRouteTemplate clientRouteTemplate) {
        Money money;
        Money money2;
        TransferConfig.ClientRouteTemplate clientRouteTemplate2;
        TransferConfig.ClientRouteTemplate clientRouteTemplate3;
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(transferInConfig, savingsParsingErrorFactory, protoValidationScope);
            List list = transferInConfig.quick_amounts;
            Money money3 = (Money) protoValidationScope2.reportIfNullAndContinue("initially_selected_amount", (String) null, transferInConfig.initially_selected_amount);
            if (money3 != null && (money = (Money) protoValidationScope2.reportIfNullAndContinue("minimum_amount", (String) null, transferInConfig.minimum_amount)) != null && (money2 = (Money) protoValidationScope2.reportIfNullAndContinue("maximum_amount", (String) null, transferInConfig.maximum_amount)) != null) {
                if (clientRouteTemplate != null) {
                    String str = clientRouteTemplate.f1643android;
                    String str2 = clientRouteTemplate.zero_arg_verbatim_string;
                    Long l = clientRouteTemplate.argument_count;
                    long longValue = l != null ? l.longValue() : 0L;
                    if (str != null) {
                        clientRouteTemplate3 = new TransferConfig.ClientRouteTemplate(longValue, str, str2);
                    } else {
                        clientRouteTemplate3 = (str2 == null || longValue != 0) ? null : new TransferConfig.ClientRouteTemplate(longValue, "", str2);
                    }
                    clientRouteTemplate2 = clientRouteTemplate3;
                } else {
                    clientRouteTemplate2 = null;
                }
                return new TransferConfig.TransferInConfig(list, money3, money, money2, transferInConfig.cdfEvent, clientRouteTemplate2);
            }
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(TransferButtons.TransferInConfig.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsScreen.ElementList toElements(ProtoValidationScope protoValidationScope, SavingsScreen.Element element, List list, SavingsScreen.ScreenType screenType) {
        HasObservability hasObservability = protoValidationScope.observability;
        element.getClass();
        list.getClass();
        screenType.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(element, savingsParsingErrorFactory, protoValidationScope);
            AnalyticsMappersKt analyticsMappersKt = element.element_type;
            if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$ArcadeElement) {
                return new SavingsScreen.ElementList(CollectionsKt__CollectionsKt.listOfNotNull(toElement(protoValidationScope2, ((SavingsScreen$Element$ElementType$ArcadeElement) analyticsMappersKt).value)));
            }
            if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsElement) {
                return new SavingsScreen.ElementList(CollectionsKt__CollectionsKt.listOfNotNull(toElement(protoValidationScope2, ((SavingsScreen$Element$ElementType$SavingsElement) analyticsMappersKt).value)));
            }
            if (analyticsMappersKt instanceof SavingsScreen$Element$ElementType$SavingsExternalElementsReference) {
                return toElements(protoValidationScope2, ((SavingsScreen$Element$ElementType$SavingsExternalElementsReference) analyticsMappersKt).value, list, screenType);
            }
            if (analyticsMappersKt == null) {
                hasObservability.getErrorReporter().report(new SavingsProtoParsingError("Element", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, "element_type", 8), hasObservability.getOneErrorPerAppSessionStrategy());
                return new SavingsScreen.ElementList(EmptyList.INSTANCE);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SavingsScreen.Element.class), savingsParsingErrorFactory, null);
        }
    }
}
