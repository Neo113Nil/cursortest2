package com.squareup.cash.card.spendinginsights.backend.api.mappers;

import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsParsingErrorFactory;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsProtoParsingError;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsight;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsightType;
import com.squareup.protos.cash.spendinginsights.SpendingAnalysisCategory;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import com.squareup.protos.franklin.ui.UiAvatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes6.dex */
public abstract class SpendingInsightMappersKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[TextSize.values().length];
            try {
                TextSize.Companion companion = TextSize.Companion;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextSize.Companion companion2 = TextSize.Companion;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardSpendingInsightType.values().length];
            try {
                TaxEnvironment.Companion companion3 = CardSpendingInsightType.Companion;
                iArr2[2] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ActionType.values().length];
            try {
                ActionType.Companion companion4 = ActionType.Companion;
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:15:0x003b, B:17:0x0046, B:20:0x004f, B:22:0x0053, B:23:0x0057, B:25:0x005d, B:26:0x0063), top: B:14:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:15:0x003b, B:17:0x0046, B:20:0x004f, B:22:0x0053, B:23:0x0057, B:25:0x005d, B:26:0x0063), top: B:14:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SpendingInsight.SpendingAnalysis toAnalysis(ProtoValidationScope protoValidationScope, List list, CardSpendingInsightType cardSpendingInsightType) {
        String str;
        if (list.isEmpty()) {
            return null;
        }
        SpendingInsight.SpendingAnalysis.DisplayType displayType = (cardSpendingInsightType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[cardSpendingInsightType.ordinal()]) == 1 ? SpendingInsight.SpendingAnalysis.DisplayType.INLINE : SpendingInsight.SpendingAnalysis.DisplayType.CARD;
        List<SpendingAnalysisCategory> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (SpendingAnalysisCategory spendingAnalysisCategory : list2) {
            SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(spendingAnalysisCategory, spendingInsightsParsingErrorFactory, protoValidationScope);
                LocalizedString localizedString = spendingAnalysisCategory.title;
                if (localizedString != null) {
                    str = localizedString.translated_value;
                    if (str == null) {
                    }
                    LocalizedString localizedString2 = spendingAnalysisCategory.text;
                    String str2 = localizedString2 == null ? localizedString2.translated_value : null;
                    Image image = spendingAnalysisCategory.icon;
                    ColoredButton coloredButton = spendingAnalysisCategory.button;
                    arrayList.add(new SpendingInsight.SpendingAnalysis.AnalysisCategory(str, str2, image, coloredButton == null ? toButton(protoValidationScope2, coloredButton) : null));
                }
                str = "";
                LocalizedString localizedString22 = spendingAnalysisCategory.text;
                if (localizedString22 == null) {
                }
                Image image2 = spendingAnalysisCategory.icon;
                ColoredButton coloredButton2 = spendingAnalysisCategory.button;
                arrayList.add(new SpendingInsight.SpendingAnalysis.AnalysisCategory(str, str2, image2, coloredButton2 == null ? toButton(protoValidationScope2, coloredButton2) : null));
            } catch (Exception e) {
                throw RotateKt.toProtoParsingExceptionFor(e, spendingAnalysisCategory != null ? Reflection.factory.getOrCreateKotlinClass(SpendingAnalysisCategory.class) : null, spendingInsightsParsingErrorFactory, null);
            }
        }
        return new SpendingInsight.SpendingAnalysis(displayType, arrayList);
    }

    public static final SpendingInsight.HorizontalBarGraph.Bar toBar(ProtoValidationScope protoValidationScope, HorizontalBarGraph.BarItem barItem) {
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(barItem, spendingInsightsParsingErrorFactory, protoValidationScope);
            UiAvatar uiAvatar = barItem.avatar;
            ProtoValidationScope.required(uiAvatar, "avatar");
            validate(protoValidationScope2, uiAvatar);
            String required = ProtoValidationScope.required(barItem.name, "name");
            String required2 = ProtoValidationScope.required(barItem.text, "text");
            Long l = barItem.value;
            ProtoValidationScope.required(l, "value");
            long longValue = l.longValue();
            String str = barItem.client_route;
            ProtoValidationScope.required(str, "client_route");
            return new SpendingInsight.HorizontalBarGraph.Bar(uiAvatar, required, required2, longValue, str);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, barItem != null ? Reflection.factory.getOrCreateKotlinClass(HorizontalBarGraph.BarItem.class) : null, spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final SpendingInsight.Button toButton(ProtoValidationScope protoValidationScope, ColoredButton coloredButton) {
        SpendingInsight.Button.Action action;
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            String required = ProtoValidationScope.required(coloredButton.text, "text");
            Color color = coloredButton.button_color;
            try {
                ProtoValidationScope.required(color, "button_color");
            } catch (Exception e) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, coloredButton != null ? Reflection.factory.getOrCreateKotlinClass(coloredButton.getClass()) : null, spendingInsightsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                color = null;
            }
            Color color2 = coloredButton.text_color;
            try {
                ProtoValidationScope.required(color2, "text_color");
            } catch (Exception e2) {
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, coloredButton != null ? Reflection.factory.getOrCreateKotlinClass(coloredButton.getClass()) : null, spendingInsightsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                color2 = null;
            }
            ColoredButton.Action action2 = coloredButton.action;
            if (action2 instanceof ColoredButton.Action.ClientRoute) {
                action = new SpendingInsight.Button.Action.ClientRoute(((ColoredButton.Action.ClientRoute) action2).value);
            } else {
                boolean z = action2 instanceof ColoredButton.Action.ActionType;
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                SpendingInsight.Button.Action.Exit exit = SpendingInsight.Button.Action.Exit.INSTANCE;
                if (z) {
                    ActionType actionType = ((ColoredButton.Action.ActionType) action2).value;
                    actionType.getClass();
                    if (WhenMappings.$EnumSwitchMapping$2[actionType.ordinal()] != 1) {
                        ProtoParsingError.ErrorType errorType = ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING;
                        SpendingInsightsProtoParsingError spendingInsightsProtoParsingError = new SpendingInsightsProtoParsingError("ActionType", 12);
                        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                        if (errorReporter == null) {
                            throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                        }
                        errorReporter.report(spendingInsightsProtoParsingError, defaultSamplingStrategy);
                    }
                } else {
                    if (action2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProtoParsingError.ErrorType errorType2 = ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING;
                    SpendingInsightsProtoParsingError spendingInsightsProtoParsingError2 = new SpendingInsightsProtoParsingError("ColoredButton", 8);
                    ErrorReporter errorReporter2 = ErrorReporter.Companion.INSTANCE;
                    if (errorReporter2 == null) {
                        throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                    }
                    errorReporter2.report(spendingInsightsProtoParsingError2, defaultSamplingStrategy);
                }
                action = exit;
            }
            return new SpendingInsight.Button(required, color, color2, action);
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, coloredButton != null ? Reflection.factory.getOrCreateKotlinClass(ColoredButton.class) : null, spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final SpendingInsight.HorizontalBarGraph toHorizontalBarGraph(ProtoValidationScope protoValidationScope, HorizontalBarGraph horizontalBarGraph) {
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(horizontalBarGraph, spendingInsightsParsingErrorFactory, protoValidationScope);
            List list = horizontalBarGraph.bar_items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toBar(protoValidationScope2, (HorizontalBarGraph.BarItem) it.next()));
            }
            Color color = horizontalBarGraph.bar_item_color;
            ProtoValidationScope.required(color, "bar_item_color");
            Color color2 = horizontalBarGraph.bar_item_text_color;
            ProtoValidationScope.required(color2, "bar_item_text_color");
            return new SpendingInsight.HorizontalBarGraph(arrayList, new SpendingInsight.HorizontalBarGraph.BarColors(color, color2));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, horizontalBarGraph != null ? Reflection.factory.getOrCreateKotlinClass(HorizontalBarGraph.class) : null, spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final void validate(ProtoValidationScope protoValidationScope, UiAvatar uiAvatar) {
        uiAvatar.getClass();
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(uiAvatar, spendingInsightsParsingErrorFactory, protoValidationScope);
            Image image = uiAvatar.image;
            if (image == null) {
                ProtoValidationScope.required(uiAvatar.monogram_text, "monogram_text");
                validateBackground(protoValidationScope2, uiAvatar);
            } else {
                ProtoValidationScope.required(image.light_url, "image.light_url");
                if (Intrinsics.areEqual(uiAvatar.is_template_avatar, Boolean.TRUE)) {
                    validateBackground(protoValidationScope2, uiAvatar);
                }
            }
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(UiAvatar.class), spendingInsightsParsingErrorFactory, null);
        }
    }

    public static final void validateBackground(ProtoValidationScope protoValidationScope, UiAvatar uiAvatar) {
        KClass kClass;
        KClass kClass2;
        SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
        try {
            Color color = uiAvatar.background_color;
            try {
                ProtoValidationScope.required(color, "background_color");
            } catch (Exception e) {
                if (uiAvatar != null) {
                    kClass = Reflection.factory.getOrCreateKotlinClass(uiAvatar.getClass());
                } else {
                    kClass = null;
                }
                protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e, kClass, spendingInsightsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                color = null;
            }
            if (color != null) {
                ProtoValidationScope.required(color.light, "background_color.light");
                try {
                    ProtoValidationScope.required(color.dark, "background_color.dark");
                } catch (Exception e2) {
                    if (uiAvatar != null) {
                        kClass2 = Reflection.factory.getOrCreateKotlinClass(uiAvatar.getClass());
                    } else {
                        kClass2 = null;
                    }
                    protoValidationScope.getErrorReporter().report(RotateKt.toProtoParsingExceptionFor(e2, kClass2, spendingInsightsParsingErrorFactory, null), protoValidationScope.getOneErrorPerAppSessionStrategy());
                }
            }
        } catch (Exception e3) {
            throw RotateKt.toProtoParsingExceptionFor(e3, Reflection.factory.getOrCreateKotlinClass(uiAvatar.getClass()), spendingInsightsParsingErrorFactory, null);
        }
    }
}
