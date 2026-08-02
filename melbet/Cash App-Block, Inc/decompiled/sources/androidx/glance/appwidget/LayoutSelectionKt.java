package androidx.glance.appwidget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.glance.GlanceModifier;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.unit.Dimension;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class LayoutSelectionKt {
    public static final Map LayoutMap = MapsKt__MapsKt.mapOf(new Pair(LayoutType.Text, Integer.valueOf(R.layout.glance_text)), new Pair(LayoutType.List, Integer.valueOf(R.layout.glance_list)), new Pair(LayoutType.CheckBox, Integer.valueOf(R.layout.glance_check_box)), new Pair(LayoutType.CheckBoxBackport, Integer.valueOf(R.layout.glance_check_box_backport)), new Pair(LayoutType.Button, Integer.valueOf(R.layout.glance_button)), new Pair(LayoutType.Swtch, Integer.valueOf(R.layout.glance_swtch)), new Pair(LayoutType.SwtchBackport, Integer.valueOf(R.layout.glance_swtch_backport)), new Pair(LayoutType.Frame, Integer.valueOf(R.layout.glance_frame)), new Pair(LayoutType.ImageCrop, Integer.valueOf(R.layout.glance_image_crop)), new Pair(LayoutType.ImageCropDecorative, Integer.valueOf(R.layout.glance_image_crop_decorative)), new Pair(LayoutType.ImageFit, Integer.valueOf(R.layout.glance_image_fit)), new Pair(LayoutType.ImageFitDecorative, Integer.valueOf(R.layout.glance_image_fit_decorative)), new Pair(LayoutType.ImageFillBounds, Integer.valueOf(R.layout.glance_image_fill_bounds)), new Pair(LayoutType.ImageFillBoundsDecorative, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new Pair(LayoutType.LinearProgressIndicator, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new Pair(LayoutType.CircularProgressIndicator, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new Pair(LayoutType.VerticalGridOneColumn, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new Pair(LayoutType.VerticalGridTwoColumns, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new Pair(LayoutType.VerticalGridThreeColumns, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new Pair(LayoutType.VerticalGridFourColumns, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new Pair(LayoutType.VerticalGridFiveColumns, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new Pair(LayoutType.VerticalGridAutoFit, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new Pair(LayoutType.RadioButton, Integer.valueOf(R.layout.glance_radio_button)), new Pair(LayoutType.RadioButtonBackport, Integer.valueOf(R.layout.glance_radio_button_backport)));
    public static final int RootAliasTypeCount;
    public static final int TopLevelLayoutsCount;

    static {
        int size = GeneratedLayoutsKt.generatedRootLayoutShifts.size();
        RootAliasTypeCount = size;
        TopLevelLayoutsCount = Build.VERSION.SDK_INT >= 31 ? GeneratedLayoutsKt.RootAliasCount : GeneratedLayoutsKt.RootAliasCount / size;
    }

    public static final RemoteViewsInfo createRootView(TranslationContext translationContext, GlanceModifier glanceModifier, int i) {
        Map mapOf;
        Context context = translationContext.context;
        Integer valueOf = Integer.valueOf(R.id.rootStubId);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            int i3 = GeneratedLayoutsKt.RootAliasCount;
            if (i >= i3) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Index of the root view cannot be more than ", i3, i, ", currently "));
                return null;
            }
            SizeSelector sizeSelector = new SizeSelector(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), GeneratedLayoutsKt.FirstRootAlias + i);
            WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$3);
            if (widthModifier != null) {
                ApplyModifiersKt.applySimpleWidthModifier(remoteViews, widthModifier, R.id.rootView);
            }
            HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$4);
            if (heightModifier != null) {
                ApplyModifiersKt.applySimpleHeightModifier(remoteViews, heightModifier, R.id.rootView);
            }
            if (i2 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            if (i2 >= 33) {
                mapOf = EmptyMap.INSTANCE;
                mapOf.getClass();
            } else {
                mapOf = MapsKt__MapsJVMKt.mapOf(new Pair(0, MapsKt__MapsJVMKt.mapOf(new Pair(sizeSelector, valueOf))));
            }
            return new RemoteViewsInfo(remoteViews, new InsertedViewInfo(R.id.rootView, 0, mapOf, 2));
        }
        int i4 = RootAliasTypeCount * i;
        int i5 = GeneratedLayoutsKt.RootAliasCount;
        if (i4 >= i5) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i5 / 4) + ", currently " + i).toString());
        }
        WidthModifier widthModifier2 = (WidthModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$1);
        Dimension dimension = Dimension.Wrap.INSTANCE;
        Dimension dimension2 = Dimension.Fill.INSTANCE;
        Dimension dimension3 = widthModifier2 != null ? dimension2 : dimension;
        HeightModifier heightModifier2 = (HeightModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$2);
        if (heightModifier2 != null) {
            dimension = heightModifier2.height;
        }
        int i6 = dimension3.equals(dimension2) ? 4 : 1;
        int i7 = dimension.equals(dimension2) ? 4 : 1;
        SizeSelector sizeSelector2 = new SizeSelector(i6 == 2 ? 1 : i6, i7 != 2 ? i7 : 1);
        Integer num = (Integer) GeneratedLayoutsKt.generatedRootLayoutShifts.get(sizeSelector2);
        if (num != null) {
            return new RemoteViewsInfo(new RemoteViews(context.getPackageName(), i4 + GeneratedLayoutsKt.FirstRootAlias + num.intValue()), new InsertedViewInfo(0, 0, MapsKt__MapsJVMKt.mapOf(new Pair(0, MapsKt__MapsJVMKt.mapOf(new Pair(sizeSelector2, valueOf)))), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(i6) + ", " + Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(i7) + ']');
    }

    /* renamed from: insertContainerView-nVsUan0, reason: not valid java name */
    public static final InsertedViewInfo m1116insertContainerViewnVsUan0(RemoteViews remoteViews, TranslationContext translationContext, LayoutType layoutType, int i, GlanceModifier glanceModifier, Alignment.Horizontal horizontal, Alignment.Vertical vertical) {
        int intValue;
        if (i > 10) {
            Log.e("GlanceAppWidget", "Truncated " + layoutType + " container from " + i + " to 10 elements", new IllegalArgumentException(layoutType + " container cannot have more than 10 elements"));
        }
        int i2 = i <= 10 ? i : 10;
        Integer selectLayout33 = selectLayout33(layoutType, glanceModifier);
        if (selectLayout33 != null) {
            intValue = selectLayout33.intValue();
        } else {
            ContainerInfo containerInfo = (ContainerInfo) GeneratedLayoutsKt.generatedContainers.get(new ContainerSelector(layoutType, i2, horizontal, vertical));
            Integer valueOf = containerInfo != null ? Integer.valueOf(containerInfo.layoutId) : null;
            if (valueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + layoutType + " with " + i + " children");
            }
            intValue = valueOf.intValue();
        }
        Map map = (Map) GeneratedLayoutsKt.generatedChildren.get(layoutType);
        if (map == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) layoutType, "Cannot find generated children for ");
            return null;
        }
        InsertedViewInfo insertViewInternal = insertViewInternal(remoteViews, translationContext, intValue, glanceModifier);
        int i3 = insertViewInternal.mainViewId;
        InsertedViewInfo insertedViewInfo = new InsertedViewInfo(i3, map, insertViewInternal.complexViewId);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i3);
        }
        return insertedViewInfo;
    }

    public static final InsertedViewInfo insertView(RemoteViews remoteViews, TranslationContext translationContext, LayoutType layoutType, GlanceModifier glanceModifier) {
        Integer selectLayout33 = selectLayout33(layoutType, glanceModifier);
        if (selectLayout33 != null || (selectLayout33 = (Integer) LayoutMap.get(layoutType)) != null) {
            return insertViewInternal(remoteViews, translationContext, selectLayout33.intValue(), glanceModifier);
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) layoutType, "Cannot use `insertView` with a container like ");
        return null;
    }

    public static final InsertedViewInfo insertViewInternal(RemoteViews remoteViews, TranslationContext translationContext, int i, GlanceModifier glanceModifier) {
        Integer valueOf;
        int i2 = translationContext.itemPosition;
        WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$5);
        Dimension dimension = Dimension.Wrap.INSTANCE;
        Dimension dimension2 = widthModifier != null ? Dimension.Fill.INSTANCE : dimension;
        HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$6);
        if (heightModifier != null) {
            dimension = heightModifier.height;
        }
        if (glanceModifier.all()) {
            valueOf = null;
        } else {
            if (translationContext.isBackgroundSpecified.getAndSet(true)) {
                a$$ExternalSyntheticBUOutline0.m$1("At most one view can be set as AppWidgetBackground.");
                return null;
            }
            valueOf = Integer.valueOf(android.R.id.background);
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            int intValue = valueOf != null ? valueOf.intValue() : translationContext.lastViewId.incrementAndGet();
            RemoteViews remoteViews2 = LayoutSelectionApi31Impl.INSTANCE.remoteViews(translationContext.context.getPackageName(), i, intValue);
            int i4 = translationContext.parentContext.mainViewId;
            if (i3 >= 31) {
                RemoteViewsTranslatorApi31Impl.INSTANCE.addChildView(remoteViews, i4, remoteViews2, i2);
            } else {
                remoteViews.addView(i4, remoteViews2);
            }
            return new InsertedViewInfo(intValue, 0, null, 6);
        }
        if (i3 >= 31) {
            Object obj = Dimension.Expand.INSTANCE;
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, selectChild(remoteViews, translationContext, i2, dimension2.equals(obj) ? 3 : 1, dimension.equals(obj) ? 3 : 1), i, valueOf), 0, null, 6);
        }
        int specSize = toSpecSize(dimension2);
        int specSize2 = toSpecSize(dimension);
        int selectChild = selectChild(remoteViews, translationContext, i2, specSize, specSize2);
        if (specSize != 2 && specSize2 != 2) {
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, selectChild, i, valueOf), 0, null, 6);
        }
        LayoutInfo layoutInfo = (LayoutInfo) GeneratedLayoutsKt.generatedComplexLayouts.get(new SizeSelector(specSize, specSize2));
        if (layoutInfo != null) {
            return new InsertedViewInfo(UtilsKt.inflateViewStub(remoteViews, translationContext, R.id.glanceViewStub, i, valueOf), UtilsKt.inflateViewStub(remoteViews, translationContext, selectChild, layoutInfo.layoutId, null), null, 4);
        }
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Could not find complex layout for width=", Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(specSize), ", height=", Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(specSize2));
        return null;
    }

    public static final int selectChild(RemoteViews remoteViews, TranslationContext translationContext, int i, int i2, int i3) {
        SizeSelector sizeSelector = new SizeSelector(i2 == 2 ? 1 : i2, i3 != 2 ? i3 : 1);
        Map map = (Map) translationContext.parentContext.children.get(Integer.valueOf(i));
        if (map == null) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Parent doesn't have child position "));
            return 0;
        }
        Integer num = (Integer) map.get(sizeSelector);
        if (num == null) {
            StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "No child for position ", " and size ");
            m2m.append(Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(i2));
            m2m.append(" x ");
            a$$ExternalSyntheticBUOutline0.m(m2m, (Object) Fragment$5$$ExternalSyntheticOutline0.stringValueOf$3(i3));
            return 0;
        }
        int intValue = num.intValue();
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (((Number) obj).intValue() != intValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UtilsKt.inflateViewStub(remoteViews, translationContext, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return intValue;
    }

    public static final Integer selectLayout33(LayoutType layoutType, GlanceModifier glanceModifier) {
        if (Build.VERSION.SDK_INT >= 33) {
            AlignmentModifier alignmentModifier = (AlignmentModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$7);
            WidthModifier widthModifier = (WidthModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$8);
            Dimension.Expand expand = Dimension.Expand.INSTANCE;
            boolean z = widthModifier != null && Dimension.Fill.INSTANCE == expand;
            HeightModifier heightModifier = (HeightModifier) glanceModifier.foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$9);
            boolean equals = heightModifier != null ? heightModifier.height.equals(expand) : false;
            if (alignmentModifier != null) {
                Alignment alignment = alignmentModifier.alignment;
                LayoutInfo layoutInfo = (LayoutInfo) GeneratedLayoutsKt.generatedBoxChildren.get(new BoxChildSelector(layoutType, alignment.horizontal, alignment.vertical));
                if (layoutInfo != null) {
                    return Integer.valueOf(layoutInfo.layoutId);
                }
                Handlers$$ExternalSyntheticBUOutline0.m$1("Cannot find ", layoutType, " with alignment ", alignment);
                return null;
            }
            if (z || equals) {
                LayoutInfo layoutInfo2 = (LayoutInfo) GeneratedLayoutsKt.generatedRowColumnChildren.get(new RowColumnChildSelector(layoutType, z, equals));
                if (layoutInfo2 != null) {
                    return Integer.valueOf(layoutInfo2.layoutId);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$2("Cannot find ", layoutType, " with defaultWeight set");
                return null;
            }
        }
        return null;
    }

    public static final int toSpecSize(Dimension dimension) {
        if (dimension instanceof Dimension.Wrap) {
            return 1;
        }
        if (dimension instanceof Dimension.Expand) {
            return 3;
        }
        if (dimension instanceof Dimension.Fill) {
            return 4;
        }
        if (dimension instanceof Dimension.Dp) {
            return 2;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }
}
