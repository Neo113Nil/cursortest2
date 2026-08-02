package androidx.compose.ui.platform;

import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Outline$Generic;
import androidx.compose.ui.graphics.Outline$Rectangle;
import androidx.compose.ui.graphics.Outline$Rounded;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.banking.observability.ProtoParsingError;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerQuickAmount;
import com.squareup.cash.borrow.viewmodels.BorrowAmountPickerViewModel;
import com.squareup.cash.money.loadable.LoadableStateKt;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paychecks.backend.api.PaychecksParsingErrorFactory;
import com.squareup.cash.paychecks.backend.api.mapper.CommonMappersKt;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.DistributionSummaryUi;
import squareup.cash.paychecks.PaychecksHomeUi;
import squareup.cash.paychecks.PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute;
import squareup.cash.paychecks.PaychecksHomeUi$Section$Section$ActiveDistribution;
import squareup.cash.paychecks.PaychecksHomeUi$Section$Section$Activity;
import squareup.cash.paychecks.PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit;
import squareup.cash.paychecks.PaychecksHomeUi$Section$Section$KybEligibilityWarning;
import squareup.cash.paychecks.PaychecksHomeUi$Section$Section$Nux;
import squareup.cash.paychecks.UiConfiguration;

/* loaded from: classes3.dex */
public abstract class ShapeContainingUtilKt {
    public static boolean isInOutline$default(ColorKt colorKt, float f, float f2) {
        if (colorKt instanceof Outline$Rectangle) {
            Rect rect = ((Outline$Rectangle) colorKt).rect;
            if (rect.left <= f && f < rect.right && rect.top <= f2 && f2 < rect.bottom) {
                return true;
            }
        } else {
            if (!(colorKt instanceof Outline$Rounded)) {
                if (colorKt instanceof Outline$Generic) {
                    return isInPath(f, f2, ((Outline$Generic) colorKt).path);
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return false;
            }
            RoundRect roundRect = ((Outline$Rounded) colorKt).roundRect;
            float f3 = roundRect.left;
            long j = roundRect.topRightCornerRadius;
            long j2 = roundRect.bottomLeftCornerRadius;
            long j3 = roundRect.bottomRightCornerRadius;
            float f4 = roundRect.bottom;
            float f5 = roundRect.top;
            float f6 = roundRect.right;
            long j4 = roundRect.topLeftCornerRadius;
            if (f >= f3 && f < f6 && f2 >= f5 && f2 < f4) {
                int i = (int) (j4 >> 32);
                int i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) + Float.intBitsToFloat(i) <= roundRect.getWidth()) {
                    int i3 = (int) (j2 >> 32);
                    int i4 = (int) (j3 >> 32);
                    if (Float.intBitsToFloat(i4) + Float.intBitsToFloat(i3) <= roundRect.getWidth()) {
                        int i5 = (int) (j4 & BodyPartID.bodyIdMax);
                        float intBitsToFloat = Float.intBitsToFloat(i5);
                        int i6 = (int) (j2 & BodyPartID.bodyIdMax);
                        if (Float.intBitsToFloat(i6) + intBitsToFloat <= roundRect.getHeight()) {
                            int i7 = (int) (j & BodyPartID.bodyIdMax);
                            float intBitsToFloat2 = Float.intBitsToFloat(i7);
                            int i8 = (int) (j3 & BodyPartID.bodyIdMax);
                            if (Float.intBitsToFloat(i8) + intBitsToFloat2 <= roundRect.getHeight()) {
                                float intBitsToFloat3 = Float.intBitsToFloat(i) + f3;
                                float intBitsToFloat4 = Float.intBitsToFloat(i5) + f5;
                                float intBitsToFloat5 = f6 - Float.intBitsToFloat(i2);
                                float intBitsToFloat6 = Float.intBitsToFloat(i7) + f5;
                                float intBitsToFloat7 = f6 - Float.intBitsToFloat(i4);
                                float intBitsToFloat8 = f4 - Float.intBitsToFloat(i8);
                                float intBitsToFloat9 = f4 - Float.intBitsToFloat(i6);
                                float intBitsToFloat10 = Float.intBitsToFloat(i3) + f3;
                                if (f < intBitsToFloat3 && f2 < intBitsToFloat4) {
                                    return m940isWithinEllipseVE1yxkc(f, f2, roundRect.topLeftCornerRadius, intBitsToFloat3, intBitsToFloat4);
                                }
                                if (f < intBitsToFloat10 && f2 > intBitsToFloat9) {
                                    return m940isWithinEllipseVE1yxkc(f, f2, roundRect.bottomLeftCornerRadius, intBitsToFloat10, intBitsToFloat9);
                                }
                                if (f > intBitsToFloat5 && f2 < intBitsToFloat6) {
                                    return m940isWithinEllipseVE1yxkc(f, f2, roundRect.topRightCornerRadius, intBitsToFloat5, intBitsToFloat6);
                                }
                                if (f <= intBitsToFloat7 || f2 <= intBitsToFloat8) {
                                    return true;
                                }
                                return m940isWithinEllipseVE1yxkc(f, f2, roundRect.bottomRightCornerRadius, intBitsToFloat7, intBitsToFloat8);
                            }
                        }
                    }
                }
                AndroidPath Path = AndroidPath_androidKt.Path();
                AndroidPath.addRoundRect$default(Path, roundRect);
                return isInPath(f, f2, Path);
            }
        }
        return false;
    }

    public static final boolean isInPath(float f, float f2, AndroidPath androidPath) {
        Rect rect = new Rect(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        AndroidPath Path = AndroidPath_androidKt.Path();
        AndroidPath.addRect$default(Path, rect);
        AndroidPath Path2 = AndroidPath_androidKt.Path();
        Path2.m665opN5in7k0(androidPath, Path, 1);
        boolean isEmpty = Path2.internalPath.isEmpty();
        Path2.reset();
        Path.reset();
        return !isEmpty;
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    public static final boolean m940isWithinEllipseVE1yxkc(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final AmountPickerViewModel toAmountPickerViewModel(BorrowAmountPickerViewModel borrowAmountPickerViewModel) {
        borrowAmountPickerViewModel.getClass();
        if (!(borrowAmountPickerViewModel instanceof BorrowAmountPickerViewModel.Condensed)) {
            if (!(borrowAmountPickerViewModel instanceof BorrowAmountPickerViewModel.Full)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            BorrowAmountPickerViewModel.Full full = (BorrowAmountPickerViewModel.Full) borrowAmountPickerViewModel;
            if (full.isLoading) {
                return new AmountPickerViewModel.Loading();
            }
            String str = full.title;
            String str2 = full.subtitle;
            String str3 = full.buttonLabel;
            Money money = full.minAmount;
            AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = money != null ? new AmountPickerViewModel.Ready.Amount.MoneyAmount(money) : null;
            Money money2 = full.maxAmount;
            return new AmountPickerViewModel.Ready(str, str2, str3, moneyAmount, money2 != null ? new AmountPickerViewModel.Ready.Amount.MoneyAmount(money2) : null, false, null, new AmountSelectorWidgetModel(EmptyList.INSTANCE), null, null, false, false, null, null, 16224);
        }
        BorrowAmountPickerViewModel.Condensed condensed = (BorrowAmountPickerViewModel.Condensed) borrowAmountPickerViewModel;
        if (condensed.isLoading) {
            return new AmountPickerViewModel.Loading();
        }
        String str4 = condensed.title;
        String str5 = condensed.subtitle;
        String str6 = condensed.buttonLabel;
        ArrayList arrayList = condensed.quickAmountLabels;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            arrayList2.add(new BorrowAmountPickerQuickAmount((String) obj, i));
            i = i2;
        }
        return new AmountPickerViewModel.Ready(str4, str5, str6, null, null, false, null, new AmountSelectorWidgetModel(arrayList2), null, null, false, false, null, null, 16224);
    }

    public static final ArrayList toPaychecksDestinationUi(ProtoValidationScope protoValidationScope, List list) {
        List<UiConfiguration.DestinationUiConfiguration> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (UiConfiguration.DestinationUiConfiguration destinationUiConfiguration : list2) {
            AllocationDestination allocationDestination = destinationUiConfiguration.destination;
            ProtoValidationScope.required(allocationDestination, "destination (ui configuration)");
            com.squareup.cash.paychecks.backend.api.model.AllocationDestination allocationDestination2 = CommonMappersKt.toAllocationDestination(protoValidationScope, allocationDestination);
            UiConfiguration.DestinationUiConfiguration.DestinationUiConfigurationValues destinationUiConfigurationValues = destinationUiConfiguration.ui_config_values;
            ProtoValidationScope.required(destinationUiConfigurationValues, "ui_config_values (ui configuration)");
            Color color = destinationUiConfigurationValues.tint_color;
            ProtoValidationScope.required(color, "tint_color");
            arrayList.add(new PaychecksUiConfiguration.PaychecksDestinationUi(allocationDestination2, new PaychecksUiConfiguration.PaychecksDestinationUi.DestinationUiConfiguration(color, ProtoValidationScope.required(destinationUiConfigurationValues.name, "name"))));
        }
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration.PaychecksDistributionSummaryUi toPaychecksDistributionSummaryUi(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration$PaychecksHomeUi$PaychecksHomeSection$AddOrUpdateDirectDepositSection$PendingDirectDepositInfo] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration$PaychecksHomeUi$PaychecksHomeSection$AddOrUpdateDirectDepositSection$PendingDirectDepositHalfSheet] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PaychecksUiConfiguration.PaychecksHomeUi toPaychecksHomeUi(ProtoValidationScope protoValidationScope, PaychecksHomeUi paychecksHomeUi) {
        PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHeader paychecksHeader;
        ?? r5;
        Iterator it;
        PaychecksUiConfiguration.PaychecksHomeUi paychecksHomeUi2;
        Object obj;
        ?? r15;
        ?? r152;
        String required;
        PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate sectionVisibilityPredicate;
        ProtoValidationScope protoValidationScope2 = protoValidationScope;
        PaychecksHomeUi.Header header = paychecksHomeUi.header;
        int i = 10;
        PaychecksUiConfiguration.PaychecksHomeUi paychecksHomeUi3 = null;
        if (header != null) {
            PaychecksHomeUi.Header.NullStateUpsell nullStateUpsell = header.null_state_upsell;
            ProtoValidationScope.required(nullStateUpsell, "null_state_upsell");
            List<PaychecksHomeUi.Header.NullStateUpsell.DetailRow> list = nullStateUpsell.detail_rows;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (PaychecksHomeUi.Header.NullStateUpsell.DetailRow detailRow : list) {
                String required2 = ProtoValidationScope.required(detailRow.title, "title");
                LocalizedString localizedString = detailRow.subtitle;
                String str = localizedString != null ? localizedString.translated_value : null;
                Boolean bool = detailRow.step_completed;
                ProtoValidationScope.required(bool, "step_completed");
                boolean booleanValue = bool.booleanValue();
                LocalizedString localizedString2 = detailRow.button_text;
                String str2 = localizedString2 != null ? localizedString2.translated_value : null;
                PaychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = detailRow.Action;
                if (paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute == null) {
                    paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute = null;
                }
                arrayList.add(new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHeader.PaychecksNullStateUpsell.PaychecksDetailsRow(required2, str, str2, paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute != null ? paychecksHomeUi$Header$NullStateUpsell$DetailRow$Action_$ClientRoute.value : null, booleanValue));
            }
            paychecksHeader = new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHeader(new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHeader.PaychecksNullStateUpsell(arrayList));
        } else {
            paychecksHeader = null;
        }
        List list2 = paychecksHomeUi.sections;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            PaychecksHomeUi.Section section = (PaychecksHomeUi.Section) it2.next();
            List list3 = section.visibility_predicates;
            list3.getClass();
            List list4 = list3;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, i));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                switch (((PaychecksHomeUi.SectionVisibilityPredicate) it3.next()).ordinal()) {
                    case 0:
                        sectionVisibilityPredicate = PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate.UNKNOWN;
                        break;
                    case 1:
                        sectionVisibilityPredicate = PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate.ALWAYS_VISIBLE;
                        break;
                    case 2:
                        sectionVisibilityPredicate = PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate.CURRENT_DISTRIBUTION_SET;
                        break;
                    case 3:
                        sectionVisibilityPredicate = PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate.NO_CURRENT_DISTRIBUTION_SET;
                        break;
                    case 4:
                        sectionVisibilityPredicate = PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate.CUSTOMER_DDA_IS_NOT_LOCKED;
                        break;
                    case 5:
                        sectionVisibilityPredicate = PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate.CUSTOMER_IS_NOT_DENYLISTED;
                        break;
                    case 6:
                        sectionVisibilityPredicate = PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate.CUSTOMER_HAS_KYB_ELIGIBILITY_WARNING;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return paychecksHomeUi3;
                }
                arrayList3.add(sectionVisibilityPredicate);
            }
            LoadableStateKt loadableStateKt = section.section;
            if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Activity) {
                PaychecksHomeUi.ActivitySection activitySection = ((PaychecksHomeUi$Section$Section$Activity) loadableStateKt).value;
                String required3 = ProtoValidationScope.required(activitySection.title, "activity title");
                LocalizedString localizedString3 = activitySection.stale_activity_title;
                if (localizedString3 == null || (required = localizedString3.translated_value) == null) {
                    required = ProtoValidationScope.required(activitySection.title, "activity title");
                }
                obj = new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection(required3, required, protoValidationScope2.reportIfNullAndContinue(activitySection.no_activity_subtitle, "activity no_activity_subtitle", "Section"), protoValidationScope2.reportIfNullAndContinue(activitySection.load_failure_subtitle, "activity load_failure_subtitle", "Section"), ProtoValidationScope.required(activitySection.view_all_button_title, "activity view_all_button_title"), arrayList3);
            } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$Nux) {
                PaychecksHomeUi.DistributionNUXSection distributionNUXSection = ((PaychecksHomeUi$Section$Section$Nux) loadableStateKt).value;
                Image image = distributionNUXSection.header_image;
                String required4 = ProtoValidationScope.required(distributionNUXSection.title, "nux title");
                String required5 = ProtoValidationScope.required(distributionNUXSection.subtitle, "nux subtitle");
                String required6 = ProtoValidationScope.required(distributionNUXSection.call_to_action_text, "nux call_to_action_text");
                String str3 = distributionNUXSection.edit_multi_allocation_client_route;
                ProtoValidationScope.required(str3, "nux edit_multi_allocation_client_route");
                obj = new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.DistributionNuxSection(arrayList3, image, str3, required4, required5, required6);
            } else if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$ActiveDistribution) {
                PaychecksHomeUi.ActiveDistributionSection activeDistributionSection = ((PaychecksHomeUi$Section$Section$ActiveDistribution) loadableStateKt).value;
                String required7 = ProtoValidationScope.required(activeDistributionSection.title_text, "active_distribution title_text");
                String required8 = ProtoValidationScope.required(activeDistributionSection.edit_button_text, "active_distribution edit_button_text");
                String str4 = activeDistributionSection.edit_button_client_route;
                ProtoValidationScope.required(str4, "active_distribution edit_button_client_route");
                obj = new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActiveDistributionSection(required7, required8, str4, arrayList3);
            } else {
                if (loadableStateKt instanceof PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) {
                    PaychecksHomeUi.AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = ((PaychecksHomeUi$Section$Section$AddOrUpdateDirectDeposit) loadableStateKt).value;
                    String required9 = ProtoValidationScope.required(addOrUpdateDirectDepositSection.button_text, "add_or_update_direct_deposit button_text");
                    String str5 = addOrUpdateDirectDepositSection.button_client_route;
                    ProtoValidationScope.required(str5, "add_or_update_direct_deposit button_client_route");
                    String str6 = addOrUpdateDirectDepositSection.denylisted_customer_client_route;
                    ProtoValidationScope.required(str6, "add_or_update_direct_deposit denylisted_customer_client_route");
                    PaychecksHomeUi.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo = addOrUpdateDirectDepositSection.pending_direct_deposit_info;
                    if (pendingDirectDepositInfo != null) {
                        String required10 = ProtoValidationScope.required(pendingDirectDepositInfo.button_text, "add_or_update_direct_deposit pending_direct_deposit_info button_text");
                        String required11 = ProtoValidationScope.required(pendingDirectDepositInfo.secondary_button_text, "add_or_update_direct_deposit pending_direct_deposit_info secondary_button_text");
                        PaychecksHomeUi.AddOrUpdateDirectDepositSection.HalfSheet halfSheet = pendingDirectDepositInfo.half_sheet;
                        if (halfSheet != null) {
                            paychecksHomeUi2 = paychecksHomeUi3;
                            Icon icon = halfSheet.icon;
                            ProtoValidationScope.required(icon, "add_or_update_direct_deposit pending_direct_deposit_info half_sheet icon");
                            it = it2;
                            r152 = new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection.PendingDirectDepositHalfSheet(icon, ProtoValidationScope.required(halfSheet.title, "add_or_update_direct_deposit pending_direct_deposit_info half_sheet title"), ProtoValidationScope.required(halfSheet.body, "add_or_update_direct_deposit pending_direct_deposit_info half_sheet body"), ProtoValidationScope.required(halfSheet.button_text, "add_or_update_direct_deposit pending_direct_deposit_info half_sheet button_text"));
                        } else {
                            it = it2;
                            paychecksHomeUi2 = paychecksHomeUi3;
                            r152 = paychecksHomeUi2;
                        }
                        r15 = new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo(required10, required11, r152);
                    } else {
                        it = it2;
                        paychecksHomeUi2 = paychecksHomeUi3;
                        r15 = paychecksHomeUi2;
                    }
                    obj = new PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection(arrayList3, required9, str5, str6, r15);
                } else {
                    it = it2;
                    paychecksHomeUi2 = paychecksHomeUi3;
                    if (!(loadableStateKt instanceof PaychecksHomeUi$Section$Section$KybEligibilityWarning)) {
                        if (loadableStateKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return paychecksHomeUi2;
                        }
                        ProtoParsingError protoParsingError = new ProtoParsingError("PaychecksHomeUi Section", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, null, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                        if (errorReporter == null) {
                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                            return paychecksHomeUi2;
                        }
                        errorReporter.report(protoParsingError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                    }
                    obj = paychecksHomeUi2;
                }
                if (obj == null) {
                    arrayList2.add(obj);
                }
                protoValidationScope2 = protoValidationScope;
                paychecksHomeUi3 = paychecksHomeUi2;
                it2 = it;
                i = 10;
            }
            it = it2;
            paychecksHomeUi2 = paychecksHomeUi3;
            if (obj == null) {
            }
            protoValidationScope2 = protoValidationScope;
            paychecksHomeUi3 = paychecksHomeUi2;
            it2 = it;
            i = 10;
        }
        PaychecksUiConfiguration.PaychecksHomeUi paychecksHomeUi4 = paychecksHomeUi3;
        PaychecksHomeUi.TermsOfService termsOfService = paychecksHomeUi.terms_of_service;
        if (termsOfService != null) {
            List list5 = termsOfService.text;
            r5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                String str7 = ((LocalizedString) it4.next()).translated_value;
                str7.getClass();
                r5.add(str7);
            }
        } else {
            r5 = paychecksHomeUi4;
        }
        if (r5 == 0) {
            r5 = EmptyList.INSTANCE;
        }
        return new PaychecksUiConfiguration.PaychecksHomeUi(paychecksHeader, arrayList2, r5, paychecksHomeUi.banking_benefits_booklet_client_route);
    }

    public static final PaychecksUiConfiguration toPaychecksUiConfiguration(HasObservability hasObservability, UiConfiguration uiConfiguration) {
        hasObservability.getClass();
        uiConfiguration.getClass();
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(uiConfiguration, paychecksParsingErrorFactory, hasObservability);
            PaychecksHomeUi paychecksHomeUi = uiConfiguration.paychecks_home_ui;
            ProtoValidationScope.required(paychecksHomeUi, "paychecks_home_ui");
            PaychecksUiConfiguration.PaychecksHomeUi paychecksHomeUi2 = toPaychecksHomeUi(protoValidationScope, paychecksHomeUi);
            DistributionSummaryUi distributionSummaryUi = uiConfiguration.distribution_summary_ui;
            ProtoValidationScope.required(distributionSummaryUi, "distribution_summary_ui");
            PaychecksUiConfiguration.PaychecksDistributionSummaryUi paychecksDistributionSummaryUi = toPaychecksDistributionSummaryUi(protoValidationScope, distributionSummaryUi);
            ArrayList paychecksDestinationUi = toPaychecksDestinationUi(protoValidationScope, uiConfiguration.destination_ui_configs);
            List list = uiConfiguration.product_tint_wheel_color_lists;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List list2 = ((UiConfiguration.WheelColorList) it.next()).product_tint_wheel_color_list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((Color) it2.next());
                }
                arrayList.add(arrayList2);
            }
            return new PaychecksUiConfiguration(paychecksHomeUi2, paychecksDistributionSummaryUi, paychecksDestinationUi, arrayList);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(UiConfiguration.class), paychecksParsingErrorFactory, null);
        }
    }
}
