package androidx.glance.appwidget;

import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.unit.DpSize;
import androidx.core.os.BundleKt;
import androidx.glance.appwidget.SizeMode;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public abstract class SizeBoxKt {
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList] */
    /* renamed from: ForEachSize-eVKgIn8, reason: not valid java name */
    public static final void m1118ForEachSizeeVKgIn8(int i, long j, Composer composer, SizeMode sizeMode, Function2 function2) {
        List list;
        List list2;
        ?? listOf;
        SizeMode sizeMode2 = sizeMode;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1526030150);
        Function2 function22 = function2;
        int i2 = i | (gapComposer.changed(sizeMode2) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(function22) ? 256 : 128);
        if ((i2 & 147) == 146 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            if (sizeMode2 instanceof SizeMode.Single) {
                gapComposer.startReplaceableGroup(-1173540356);
                gapComposer.end(false);
                list2 = CollectionsKt__CollectionsJVMKt.listOf(new DpSize(j));
            } else {
                if (!(sizeMode2 instanceof SizeMode.Exact)) {
                    gapComposer.startReplaceableGroup(-1173645715);
                    gapComposer.end(false);
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                gapComposer.startReplaceableGroup(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    gapComposer.startReplaceableGroup(-2019914396);
                    Bundle bundle = (Bundle) gapComposer.consume(CompositionLocalsKt.LocalAppWidgetOptions);
                    gapComposer.startReplaceableGroup(-1173535336);
                    boolean changed = gapComposer.changed(j);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new SizeBoxKt$ForEachSize$sizes$1$1(j, 0);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    gapComposer.end(false);
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i3 = bundle.getInt("appWidgetMinHeight", 0);
                        int i4 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i5 = bundle.getInt("appWidgetMinWidth", 0);
                        int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                        listOf = (i3 == 0 || i4 == 0 || i5 == 0 || i6 == 0) ? CollectionsKt__CollectionsJVMKt.listOf(function0.invoke()) : CollectionsKt__CollectionsKt.listOf((Object[]) new DpSize[]{new DpSize(BundleKt.m1091DpSizeYgX7TsA(i5, i4)), new DpSize(BundleKt.m1091DpSizeYgX7TsA(i6, i3))});
                    } else {
                        listOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            listOf.add(new DpSize(BundleKt.m1091DpSizeYgX7TsA(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    gapComposer.end(false);
                    list = listOf;
                } else {
                    gapComposer.startReplaceableGroup(-2019826759);
                    Bundle bundle2 = (Bundle) gapComposer.consume(CompositionLocalsKt.LocalAppWidgetOptions);
                    int i7 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i8 = bundle2.getInt("appWidgetMaxWidth", 0);
                    DpSize dpSize = null;
                    DpSize dpSize2 = (i7 == 0 || i8 == 0) ? null : new DpSize(BundleKt.m1091DpSizeYgX7TsA(i8, i7));
                    int i9 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i10 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i9 != 0 && i10 != 0) {
                        dpSize = new DpSize(BundleKt.m1091DpSizeYgX7TsA(i10, i9));
                    }
                    List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new DpSize[]{dpSize2, dpSize});
                    if (filterNotNull.isEmpty()) {
                        filterNotNull = CollectionsKt__CollectionsJVMKt.listOf(new DpSize(j));
                    }
                    gapComposer.end(false);
                    list = filterNotNull;
                }
                gapComposer.end(false);
                list2 = list;
            }
            List distinct = CollectionsKt.distinct(list2);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(distinct, 10));
            Iterator it = distinct.iterator();
            while (it.hasNext()) {
                m1119SizeBoxIbIYxLY(((i2 << 3) & 112) | (i2 & 896), ((DpSize) it.next()).packedValue, gapComposer, sizeMode2, function22);
                arrayList.add(Unit.INSTANCE);
                sizeMode2 = sizeMode;
                function22 = function2;
            }
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SizeBoxKt$SizeBox$1(i, j, sizeMode, function2);
        }
    }

    /* renamed from: SizeBox-IbIYxLY, reason: not valid java name */
    public static final void m1119SizeBoxIbIYxLY(final int i, final long j, Composer composer, final SizeMode sizeMode, final Function2 function2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-53921383);
        int i2 = (gapComposer.changed(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            int i3 = i & 64;
            i2 |= gapComposer.changed(sizeMode) ? 32 : 16;
        }
        if (((i2 | (gapComposer.changed(function2) ? 256 : 128)) & 147) == 146 && gapComposer.getSkipping()) {
            gapComposer.skipToGroupEnd();
        } else {
            Updater.CompositionLocalProvider(new ProvidedValue[]{androidx.glance.CompositionLocalsKt.LocalSize.defaultProvidedValue$runtime(new DpSize(j))}, Expect_jvmKt.composableLambda(gapComposer, -1209815847, new SizeBoxKt$SizeBox$1(function2, j, sizeMode)), gapComposer, 48);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.glance.appwidget.SizeBoxKt$SizeBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SizeBoxKt.m1119SizeBoxIbIYxLY(i | 1, j, (Composer) obj, sizeMode, function2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SwitchAccount.deepLinkSpecs;
    }
}
