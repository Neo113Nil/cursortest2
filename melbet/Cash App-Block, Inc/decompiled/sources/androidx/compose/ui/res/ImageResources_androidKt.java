package androidx.compose.ui.res;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.icu.text.MessageFormat;
import android.util.TypedValue;
import androidx.collection.ArrayMap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.checks.ConfirmBackOfCheckKt$$ExternalSyntheticLambda6;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$toViewModelSection$$inlined$sortedBy$1;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ImageResources_androidKt {
    public static final void SingleUsePaymentInfoBox(String str, Composer composer, int i) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1878032755);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.prominent;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxWidth, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4088, 0L, (Composer) gapComposer, SpacerKt.m298padding3ABfNKs(m177backgroundbw27NRU, 16.0f), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ConfirmBackOfCheckKt$$ExternalSyntheticLambda6(str, i, 17);
        }
    }

    public static final List access$allocationsSortedForWheel(EditDistributionConfiguration editDistributionConfiguration) {
        ArrayList arrayList = editDistributionConfiguration.initialDestinationStates;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) obj;
            if (destinationUiConfiguration.shareInBasisPoints <= 0 && !destinationUiConfiguration.equals((EditDistributionConfiguration.DestinationUiConfiguration) editDistributionConfiguration.initialDestinationStates.get(editDistributionConfiguration.initiallySelectedDestinationIndex))) {
                AllocationDestination allocationDestination = destinationUiConfiguration.destination;
                allocationDestination.getClass();
                if (allocationDestination instanceof AllocationDestination.CashBalanceDestination) {
                }
            }
            arrayList2.add(obj);
        }
        return CollectionsKt.sortedWith(arrayList2, new PaychecksHomePresenter$toViewModelSection$$inlined$sortedBy$1(1));
    }

    public static final DistributionWheelViewModel access$toDistributionWheelViewModel(List list, EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration, float f, boolean z, Money money, AndroidStringManager androidStringManager, NumberFormat numberFormat, MoneyFormatter moneyFormatter) {
        AllocationDestination.InvestingDestination.UiSpecification uiSpecification;
        Image image;
        DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon image2;
        String str;
        String format2 = numberFormat.format(Float.valueOf(f));
        format2.getClass();
        String str2 = null;
        String format3 = money != null ? moneyFormatter.format(Moneys.percent(money, f)) : null;
        EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements selectedStateUiElements = destinationUiConfiguration.selectedStateUiElements;
        boolean z2 = (selectedStateUiElements != null ? selectedStateUiElements.explanation : null) != null;
        AllocationDestination allocationDestination = destinationUiConfiguration.destination;
        if (allocationDestination instanceof AllocationDestination.SavingsDestination) {
            AllocationDestination.SavingsDestination.UiSpecification uiSpecification2 = ((AllocationDestination.SavingsDestination) allocationDestination).uiSpecification;
            if (uiSpecification2 != null && (str = uiSpecification2.iconId) != null) {
                image2 = new DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon.Emoji(str);
            }
            image2 = null;
        } else {
            if ((allocationDestination instanceof AllocationDestination.InvestingDestination) && (uiSpecification = ((AllocationDestination.InvestingDestination) allocationDestination).uiSpecification) != null && (image = uiSpecification.icon) != null) {
                image2 = new DistributionWheelViewModel.Content.EditSingleDistributionScreen.WheelIcon.Image(image);
            }
            image2 = null;
        }
        DistributionWheelViewModel.Content.EditSingleDistributionScreen editSingleDistributionScreen = new DistributionWheelViewModel.Content.EditSingleDistributionScreen(format2, format3, z2, image2);
        ArrayList calculateAllocations = calculateAllocations(list, destinationUiConfiguration, f, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(14, destinationUiConfiguration, androidStringManager, numberFormat));
        String str3 = destinationUiConfiguration.accessibilityLabel;
        if (str3 != null) {
            ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "destination", str3);
            Resources resources = androidStringManager.resources;
            resources.getClass();
            str2 = new MessageFormat(resources.getString(R.string.edit_distribution_wheel_content_description_template)).format(m);
            str2.getClass();
        }
        return new DistributionWheelViewModel(calculateAllocations, z, true, false, true, editSingleDistributionScreen, str2);
    }

    public static final ArrayList calculateAllocations(List list, EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration, float f, Function4 function4) {
        Object obj;
        float f2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((EditDistributionConfiguration.DestinationUiConfiguration) obj, destinationUiConfiguration)) {
                break;
            }
        }
        obj.getClass();
        float f3 = ((EditDistributionConfiguration.DestinationUiConfiguration) obj).shareInBasisPoints / 10000.0f;
        float maxAllocationFor = maxAllocationFor(destinationUiConfiguration, list);
        float min = Math.min(f, maxAllocationFor);
        List<EditDistributionConfiguration.DestinationUiConfiguration> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration2 : list2) {
            boolean areEqual = Intrinsics.areEqual(destinationUiConfiguration2, destinationUiConfiguration);
            if (areEqual) {
                f2 = min;
            } else {
                boolean z = destinationUiConfiguration2.destination instanceof AllocationDestination.CashBalanceDestination;
                long j = destinationUiConfiguration2.shareInBasisPoints;
                f2 = z ? (f3 - min) + (j / 10000.0f) : j / 10000.0f;
            }
            arrayList.add(function4.invoke(destinationUiConfiguration2, Float.valueOf(UtilsKt.forceToWholePercentage(f2)), Float.valueOf(UtilsKt.forceToWholePercentage(maxAllocationFor)), Boolean.valueOf(areEqual)));
        }
        return arrayList;
    }

    public static final AndroidImageBitmap imageResource(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Resources resources = (Resources) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalResources);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new TypedValue();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        TypedValue typedValue = (TypedValue) rememberedValue;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean changed = gapComposer.changed(charSequence.toString());
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = imageResource(resources, i);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        return (AndroidImageBitmap) rememberedValue2;
    }

    public static final float maxAllocationFor(EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration, List list) {
        return UtilsKt.maxAllocationFor(destinationUiConfiguration, list, new HelpSheetViewKt$$ExternalSyntheticLambda4(7), new HelpSheetViewKt$$ExternalSyntheticLambda4(8));
    }

    public static final AndroidImageBitmap imageResource(Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return new AndroidImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }
}
