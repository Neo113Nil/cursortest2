package androidx.glance.appwidget;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.glance.GlanceModifier;
import androidx.glance.Visibility;
import androidx.glance.action.Action;
import androidx.glance.action.ActionModifier;
import androidx.glance.appwidget.action.ApplyActionKt$getFillInIntentForAction$1;
import androidx.glance.appwidget.action.ToggleableKt;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.PaddingDimension;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.PaddingModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.semantics.SemanticsModifier;
import androidx.glance.semantics.SemanticsProperties;
import androidx.glance.unit.Dimension;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.banking.views.OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ApplyModifiersKt {
    public static final void ContextualExplainerSheet(String str, String str2, Function1 function1, Composer composer, int i) {
        int i2;
        str.getClass();
        str2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1312465142);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-826310479, new BasicShieetScope$$ExternalSyntheticLambda1(18, str, str2, function1), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverdraftCoverageSheetViewKt$$ExternalSyntheticLambda6(str, str2, function1, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0144 -> B:17:0x0155). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void applyModifiers(TranslationContext translationContext, RemoteViews remoteViews, GlanceModifier glanceModifier, InsertedViewInfo insertedViewInfo) {
        Context context;
        Ref$ObjectRef ref$ObjectRef;
        ActionModifier actionModifier;
        Dimension dimension;
        PaddingModifier paddingModifier;
        Context context2 = translationContext.context;
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef6 = new Ref$ObjectRef();
        ref$ObjectRef6.element = Visibility.Visible;
        Ref$ObjectRef ref$ObjectRef7 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef8 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef9 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
        glanceModifier.foldIn(Unit.INSTANCE, new ApplyModifiersKt$applyModifiers$1(ref$ObjectRef7, ref$ObjectRef2, ref$ObjectRef3, context2, remoteViews, insertedViewInfo, ref$ObjectRef4, ref$ObjectRef6, ref$ObjectRef5, translationContext, ref$ObjectRef9, ref$ObjectRef8, ref$ObjectRef10));
        WidthModifier widthModifier = (WidthModifier) ref$ObjectRef2.element;
        HeightModifier heightModifier = (HeightModifier) ref$ObjectRef3.element;
        Map map = LayoutSelectionKt.LayoutMap;
        int i = insertedViewInfo.complexViewId;
        int i2 = insertedViewInfo.mainViewId;
        int i3 = 0;
        if (i == -1) {
            if (widthModifier != null) {
                applySimpleWidthModifier(remoteViews, widthModifier, i2);
            }
            if (heightModifier != null) {
                applySimpleHeightModifier(remoteViews, heightModifier, i2);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                a$$ExternalSyntheticBUOutline0.m$1("There is currently no valid use case where a complex view is used on Android S");
                return;
            }
            Dimension.Fill fill = Dimension.Fill.INSTANCE;
            Dimension.Fill fill2 = widthModifier != null ? fill : null;
            Dimension dimension2 = heightModifier != null ? heightModifier.height : null;
            if (isFixed(fill2) || isFixed(dimension2)) {
                boolean z = fill2 != null;
                context = context2;
                boolean z2 = (dimension2 instanceof Dimension.Fill) || (dimension2 instanceof Dimension.Expand);
                ref$ObjectRef = ref$ObjectRef6;
                int inflateViewStub = UtilsKt.inflateViewStub(remoteViews, translationContext, R.id.sizeViewStub, (z && z2) ? R.layout.size_match_match : z ? R.layout.size_match_wrap : z2 ? R.layout.size_wrap_match : R.layout.size_wrap_wrap, null);
                Dimension.Wrap wrap = Dimension.Wrap.INSTANCE;
                Dimension.Expand expand = Dimension.Expand.INSTANCE;
                if (!(Intrinsics.areEqual(fill2, expand) ? true : Intrinsics.areEqual(fill2, fill) ? true : Intrinsics.areEqual(fill2, wrap)) && fill2 != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                if (dimension2 instanceof Dimension.Dp) {
                    remoteViews.setInt(inflateViewStub, "setHeight", (int) TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics()));
                } else {
                    if (!(Intrinsics.areEqual(dimension2, expand) ? true : Intrinsics.areEqual(dimension2, fill) ? true : Intrinsics.areEqual(dimension2, wrap)) && dimension2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                }
                actionModifier = (ActionModifier) ref$ObjectRef7.element;
                if (actionModifier != null) {
                    Action action = actionModifier.action;
                    Integer num = translationContext.actionTargetId;
                    int intValue = num != null ? num.intValue() : i2;
                    try {
                        if (translationContext.isLazyCollectionDescendant) {
                            remoteViews.setOnClickFillInIntent(intValue, ToggleableKt.getFillInIntentForAction(action, translationContext, intValue, ApplyActionKt$getFillInIntentForAction$1.INSTANCE));
                            action = action;
                        } else {
                            remoteViews.setOnClickPendingIntent(intValue, ToggleableKt.getPendingIntentForAction(action, translationContext, intValue, ApplyActionKt$getFillInIntentForAction$1.INSTANCE$1));
                            action = action;
                        }
                    } catch (Throwable th) {
                        String str = "Unrecognized Action: " + action;
                        Log.e("GlanceAppWidget", str, th);
                        action = str;
                    }
                }
                dimension = (Dimension) ref$ObjectRef5.element;
                if (dimension != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        ApplyModifiersApi31Impl.INSTANCE.applyRoundedCorners(remoteViews, i2, dimension);
                    } else {
                        Log.w("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
                    }
                }
                paddingModifier = (PaddingModifier) ref$ObjectRef4.element;
                if (paddingModifier != null) {
                    Resources resources = context.getResources();
                    PaddingDimension paddingDimension = paddingModifier.left;
                    float access$toDp = PaddingKt.access$toDp(paddingDimension.resourceIds, resources) + paddingDimension.dp;
                    PaddingDimension paddingDimension2 = paddingModifier.start;
                    float access$toDp2 = PaddingKt.access$toDp(paddingDimension2.resourceIds, resources) + paddingDimension2.dp;
                    PaddingDimension paddingDimension3 = paddingModifier.top;
                    float access$toDp3 = PaddingKt.access$toDp(paddingDimension3.resourceIds, resources) + paddingDimension3.dp;
                    PaddingDimension paddingDimension4 = paddingModifier.right;
                    float access$toDp4 = PaddingKt.access$toDp(paddingDimension4.resourceIds, resources) + paddingDimension4.dp;
                    PaddingDimension paddingDimension5 = paddingModifier.end;
                    float access$toDp5 = PaddingKt.access$toDp(paddingDimension5.resourceIds, resources) + paddingDimension5.dp;
                    PaddingDimension paddingDimension6 = paddingModifier.bottom;
                    float access$toDp6 = PaddingKt.access$toDp(paddingDimension6.resourceIds, resources) + paddingDimension6.dp;
                    boolean z3 = translationContext.isRtl;
                    float f = access$toDp + (z3 ? access$toDp5 : access$toDp2);
                    if (!z3) {
                        access$toDp2 = access$toDp5;
                    }
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    remoteViews.setViewPadding(insertedViewInfo.mainViewId, (int) TypedValue.applyDimension(1, f, displayMetrics), (int) TypedValue.applyDimension(1, access$toDp3, displayMetrics), (int) TypedValue.applyDimension(1, access$toDp4 + access$toDp2, displayMetrics), (int) TypedValue.applyDimension(1, access$toDp6, displayMetrics));
                }
                if (ref$ObjectRef9.element == null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
                SemanticsModifier semanticsModifier = (SemanticsModifier) ref$ObjectRef10.element;
                if (semanticsModifier != null) {
                    Object obj = semanticsModifier.configuration.props.get(SemanticsProperties.ContentDescription);
                    List list = (List) (obj == null ? null : obj);
                    if (list != null) {
                        remoteViews.setContentDescription(i2, CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63));
                    }
                }
                int ordinal = ((Visibility) ref$ObjectRef.element).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        i3 = 4;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        i3 = 8;
                    }
                }
                remoteViews.setViewVisibility(i2, i3);
                return;
            }
        }
        context = context2;
        ref$ObjectRef = ref$ObjectRef6;
        actionModifier = (ActionModifier) ref$ObjectRef7.element;
        if (actionModifier != null) {
        }
        dimension = (Dimension) ref$ObjectRef5.element;
        if (dimension != null) {
        }
        paddingModifier = (PaddingModifier) ref$ObjectRef4.element;
        if (paddingModifier != null) {
        }
        if (ref$ObjectRef9.element == null) {
        }
    }

    public static final void applySimpleHeightModifier(RemoteViews remoteViews, HeightModifier heightModifier, int i) {
        Dimension dimension = heightModifier.height;
        int i2 = Build.VERSION.SDK_INT;
        Dimension.Expand expand = Dimension.Expand.INSTANCE;
        Dimension.Wrap wrap = Dimension.Wrap.INSTANCE;
        if (i2 >= 31) {
            if (i2 >= 33 || !CollectionsKt__CollectionsKt.listOf((Object[]) new Dimension[]{wrap, expand}).contains(dimension)) {
                ApplyModifiersApi31Impl.INSTANCE.setViewHeight(remoteViews, i, dimension);
                return;
            }
            return;
        }
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Dimension[]{wrap, Dimension.Fill.INSTANCE, expand});
        Map map = LayoutSelectionKt.LayoutMap;
        if (listOf.contains(dimension)) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$2("Using a height of ", dimension, " requires a complex layout before API 31");
    }

    public static final void applySimpleWidthModifier(RemoteViews remoteViews, WidthModifier widthModifier, int i) {
        widthModifier.getClass();
        int i2 = Build.VERSION.SDK_INT;
        Dimension.Expand expand = Dimension.Expand.INSTANCE;
        Dimension.Wrap wrap = Dimension.Wrap.INSTANCE;
        Dimension.Fill fill = Dimension.Fill.INSTANCE;
        if (i2 >= 31) {
            if (i2 >= 33 || !CollectionsKt__CollectionsKt.listOf((Object[]) new Dimension[]{wrap, expand}).contains(fill)) {
                ApplyModifiersApi31Impl.INSTANCE.setViewWidth(remoteViews, i, fill);
                return;
            }
            return;
        }
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Dimension[]{wrap, fill, expand});
        Map map = LayoutSelectionKt.LayoutMap;
        if (listOf.contains(fill)) {
            return;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$2("Using a width of ", fill, " requires a complex layout before API 31");
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SelectEquity.deepLinkSpecs;
    }

    public static final boolean isFixed(Dimension dimension) {
        if (dimension instanceof Dimension.Dp) {
            return true;
        }
        if ((Intrinsics.areEqual(dimension, Dimension.Expand.INSTANCE) ? true : Intrinsics.areEqual(dimension, Dimension.Fill.INSTANCE) ? true : Intrinsics.areEqual(dimension, Dimension.Wrap.INSTANCE)) || dimension == null) {
            return false;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }
}
