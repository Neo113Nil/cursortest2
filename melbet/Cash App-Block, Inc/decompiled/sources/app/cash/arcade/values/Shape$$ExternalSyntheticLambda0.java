package app.cash.arcade.values;

import app.cash.arcade.values.LegacyDialogAction;
import app.cash.arcade.values.LineChartModel;
import app.cash.arcade.values.Shape;
import app.cash.arcade.values.TextFieldLineLimits;
import app.cash.arcade.values.TimelineItemIcon;
import app.cash.arcade.values.benefitsTable.BenefitsComparisonTableCell;
import app.cash.arcade.values.timeline.ArcadeTimeline2Item;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel$CardUrl$$serializer;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel$IconRes$$serializer;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel$IconToken$$serializer;
import app.cash.arcade.viewmodels.AvatarBadgeViewModel$IconUrl$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.EnumSerializer;

/* loaded from: classes3.dex */
public final /* synthetic */ class Shape$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Shape$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.Shape", reflectionFactory.getOrCreateKotlinClass(Shape.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(Shape.Card.class), reflectionFactory.getOrCreateKotlinClass(Shape.Circle.class)}, new KSerializer[]{new EnumSerializer("Card", Shape.Card.INSTANCE, new Annotation[0]), new EnumSerializer("Circle", Shape.Circle.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 1:
                LegacyDialogAction.Style[] values = LegacyDialogAction.Style.values();
                values.getClass();
                return new EnumSerializer("app.cash.arcade.values.LegacyDialogAction.Style", (Enum[]) values);
            case 2:
                LineChartModel.DataSource[] values2 = LineChartModel.DataSource.values();
                values2.getClass();
                return new EnumSerializer("app.cash.arcade.values.LineChartModel.DataSource", (Enum[]) values2);
            case 3:
                LineChartModel.HistoricalRange[] values3 = LineChartModel.HistoricalRange.values();
                values3.getClass();
                return new EnumSerializer("app.cash.arcade.values.LineChartModel.HistoricalRange", (Enum[]) values3);
            case 4:
                NavigationIconType[] values4 = NavigationIconType.values();
                values4.getClass();
                return new EnumSerializer("app.cash.arcade.values.NavigationIconType", (Enum[]) values4);
            case 5:
                PasscodeInputStatus[] values5 = PasscodeInputStatus.values();
                values5.getClass();
                return new EnumSerializer("app.cash.arcade.values.PasscodeInputStatus", (Enum[]) values5);
            case 6:
                SegmentedToggleValue[] values6 = SegmentedToggleValue.values();
                values6.getClass();
                return new EnumSerializer("app.cash.arcade.values.SegmentedToggleValue", (Enum[]) values6);
            case 7:
                return new EnumSerializer("Card", Shape.Card.INSTANCE, new Annotation[0]);
            case 8:
                return new EnumSerializer("Circle", Shape.Circle.INSTANCE, new Annotation[0]);
            case 9:
                TextAlign[] values7 = TextAlign.values();
                values7.getClass();
                return new EnumSerializer("app.cash.arcade.values.TextAlign", (Enum[]) values7);
            case 10:
                return new EnumSerializer("SingleLine", TextFieldLineLimits.SingleLine.INSTANCE, new Annotation[0]);
            case 11:
                ReflectionFactory reflectionFactory2 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.values.TimelineItemIcon", reflectionFactory2.getOrCreateKotlinClass(TimelineItemIcon.class), new KClass[]{reflectionFactory2.getOrCreateKotlinClass(TimelineItemIcon.Id.class)}, new KSerializer[]{TimelineItemIcon$Id$$serializer.INSTANCE}, new Annotation[0]);
            case 12:
                TruncateAt[] values8 = TruncateAt.values();
                values8.getClass();
                return new EnumSerializer("app.cash.arcade.values.TruncateAt", (Enum[]) values8);
            case 13:
                return ImageResource.Companion.serializer();
            case 14:
                return TextAlign.Companion.serializer();
            case 15:
                return Color.Companion.serializer();
            case 16:
                return Color.Companion.serializer();
            case 17:
                return TextAlign.Companion.serializer();
            case 18:
                return Color.Companion.serializer();
            case 19:
                return Color.Companion.serializer();
            case 20:
                return BenefitsComparisonTableCell.Companion.serializer();
            case 21:
                return BenefitsComparisonTableCell.Companion.serializer();
            case 22:
                return BenefitsComparisonTableCell.Companion.serializer();
            case 23:
                return ArcadeTimeline2Item.State.Companion.serializer();
            case 24:
                return Color.Companion.serializer();
            case 25:
                return Color.Companion.serializer();
            case 26:
                ArcadeTimeline2Item.State[] values9 = ArcadeTimeline2Item.State.values();
                values9.getClass();
                return new EnumSerializer("app.cash.arcade.values.timeline.ArcadeTimeline2Item.State", (Enum[]) values9);
            case 27:
                ReflectionFactory reflectionFactory3 = Reflection.factory;
                return new SealedClassSerializer("app.cash.arcade.viewmodels.AvatarBadgeViewModel", reflectionFactory3.getOrCreateKotlinClass(AvatarBadgeViewModel.class), new KClass[]{reflectionFactory3.getOrCreateKotlinClass(AvatarBadgeViewModel.CardUrl.class), reflectionFactory3.getOrCreateKotlinClass(AvatarBadgeViewModel.IconRes.class), reflectionFactory3.getOrCreateKotlinClass(AvatarBadgeViewModel.IconToken.class), reflectionFactory3.getOrCreateKotlinClass(AvatarBadgeViewModel.IconUrl.class)}, new KSerializer[]{AvatarBadgeViewModel$CardUrl$$serializer.INSTANCE, AvatarBadgeViewModel$IconRes$$serializer.INSTANCE, AvatarBadgeViewModel$IconToken$$serializer.INSTANCE, AvatarBadgeViewModel$IconUrl$$serializer.INSTANCE}, new Annotation[0]);
            case 28:
                return Color.Companion.serializer();
            default:
                return ColorFilter.Companion.serializer();
        }
    }
}
