package com.squareup.cash.common.moneyformatter;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.datadog.android.rum.model.ErrorEvent$Status$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent;
import com.google.android.gms.internal.mlkit_vision_face.zzjo;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.clientroutes.UriValidator;
import com.squareup.cash.clientsync.UtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.stafftasks.resources.Task;
import com.squareup.util.android.SecurePixelCopy;
import com.squareup.util.android.Uris;
import com.squareup.util.android.ViewGroups;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.android.drawable.DrawablesKt;
import com.squareup.util.cash.Regions;
import com.squareup.util.compose.ListsKt;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class MoneyKt {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: FakeBottomSheet-3IgeMak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3505FakeBottomSheet3IgeMak(Modifier modifier, long j, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        long j2;
        int i3;
        int i4;
        ComposableLambdaImpl composableLambdaImpl2;
        Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        Modifier wrapContentHeight;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2085124577);
        Applier applier = gapComposer.applier;
        int i5 = i | 6;
        if ((i2 & 2) == 0) {
            j2 = j;
            if (gapComposer.changed(j2)) {
                i3 = 32;
                i4 = i5 | i3;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
                    composableLambdaImpl2 = composableLambdaImpl;
                    gapComposer.skipToGroupEnd();
                    modifier2 = modifier;
                } else {
                    gapComposer.startDefaults();
                    int i6 = i & 1;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i6 == 0 || gapComposer.getDefaultsInvalid()) {
                        if ((i2 & 2) != 0) {
                            j2 = MooncakeTheme.getColors(gapComposer).elevatedBackground;
                        }
                        modifier3 = companion;
                    } else {
                        gapComposer.skipToGroupEnd();
                        modifier3 = modifier;
                    }
                    gapComposer.endDefaults();
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    wrapContentHeight = SizeKt.wrapContentHeight(companion, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(wrapContentHeight, j2, RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(24.0f, 24.0f, 12));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(SpacerKt.m300paddingVpY3zN4$default(SizeKt.m287sizeVpY3zN4(companion, 28.0f, 28.0f), RecyclerView.DECELERATION_RATE, 11.0f, 1), Color.Gray, RoundedCornerShapeKt.RoundedCornerShape(100)), gapComposer, 0);
                    composableLambdaImpl2 = composableLambdaImpl;
                    composableLambdaImpl2.invoke((Object) gapComposer, (Object) 6);
                    gapComposer.end(true);
                    gapComposer.end(true);
                    modifier2 = modifier3;
                }
                long j3 = j2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new BasicShieetScope$$ExternalSyntheticLambda13(modifier2, j3, composableLambdaImpl2, i, i2);
                    return;
                }
                return;
            }
        } else {
            j2 = j;
        }
        i3 = 16;
        i4 = i5 | i3;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
        }
        long j32 = j2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean belowOneDollar(Money money) {
        return dollarAmount(money).absoluteValue().compareTo(Amount.ONE) < 0;
    }

    public static final Amount dollarAmount(Money money) {
        return money.centsAmount.shiftDecimalPoint(-money.currency.centDigits);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1, types: [com.datadog.android.rum.model.ViewEvent$Frustration] */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r43v0 */
    /* JADX WARN: Type inference failed for: r43v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r52v0 */
    /* JADX WARN: Type inference failed for: r52v1, types: [com.datadog.android.rum.model.ViewEvent$FlutterBuildTime] */
    /* JADX WARN: Type inference failed for: r52v2 */
    /* JADX WARN: Type inference failed for: r53v0 */
    /* JADX WARN: Type inference failed for: r53v1, types: [com.datadog.android.rum.model.ViewEvent$FlutterBuildTime] */
    /* JADX WARN: Type inference failed for: r53v2 */
    /* JADX WARN: Type inference failed for: r54v0 */
    /* JADX WARN: Type inference failed for: r54v1, types: [com.datadog.android.rum.model.ViewEvent$FlutterBuildTime] */
    /* JADX WARN: Type inference failed for: r54v2 */
    /* JADX WARN: Type inference failed for: r55v0 */
    /* JADX WARN: Type inference failed for: r55v1, types: [com.datadog.android.rum.model.ViewEvent$Performance] */
    /* JADX WARN: Type inference failed for: r55v2 */
    /* JADX WARN: Type inference failed for: r56v0 */
    /* JADX WARN: Type inference failed for: r56v1, types: [com.datadog.android.rum.model.ViewEvent$Accessibility] */
    /* JADX WARN: Type inference failed for: r56v2 */
    /* JADX WARN: Type inference failed for: r57v0 */
    /* JADX WARN: Type inference failed for: r57v1 */
    /* JADX WARN: Type inference failed for: r57v15 */
    /* JADX WARN: Type inference failed for: r57v16 */
    /* JADX WARN: Type inference failed for: r57v17 */
    /* JADX WARN: Type inference failed for: r57v2 */
    /* JADX WARN: Type inference failed for: r57v3, types: [com.datadog.android.rum.model.ViewEvent$ViewEventView] */
    /* JADX WARN: Type inference failed for: r57v4, types: [com.datadog.android.rum.model.ViewEvent$ViewEventView] */
    /* JADX WARN: Type inference failed for: r57v5, types: [com.datadog.android.rum.model.ViewEvent$ViewEventView] */
    public static ViewEvent.ViewEventView fromJsonObject(JsonObject jsonObject) {
        ?? r57;
        ?? r572;
        ?? r573;
        int i;
        Number number;
        ArrayList arrayList;
        ?? r43;
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        JsonObject asJsonObject3;
        JsonObject asJsonObject4;
        JsonObject asJsonObject5;
        JsonArray asJsonArray;
        JsonObject asJsonObject6;
        JsonArray asJsonArray2;
        JsonObject asJsonObject7;
        JsonObject asJsonObject8;
        JsonObject asJsonObject9;
        JsonObject asJsonObject10;
        String asString;
        jsonObject.getClass();
        try {
            String asString2 = jsonObject.get("id").getAsString();
            JsonElement jsonElement = jsonObject.get("referrer");
            String asString3 = jsonElement != null ? jsonElement.getAsString() : null;
            String asString4 = jsonObject.get("url").getAsString();
            JsonElement jsonElement2 = jsonObject.get("name");
            String asString5 = jsonElement2 != null ? jsonElement2.getAsString() : null;
            JsonElement jsonElement3 = jsonObject.get("loading_time");
            Long valueOf = jsonElement3 != null ? Long.valueOf(jsonElement3.getAsLong()) : null;
            JsonElement jsonElement4 = jsonObject.get("network_settled_time");
            Long valueOf2 = jsonElement4 != null ? Long.valueOf(jsonElement4.getAsLong()) : null;
            JsonElement jsonElement5 = jsonObject.get("interaction_to_next_view_time");
            Long valueOf3 = jsonElement5 != null ? Long.valueOf(jsonElement5.getAsLong()) : null;
            JsonElement jsonElement6 = jsonObject.get("loading_type");
            if (jsonElement6 != null && (asString = jsonElement6.getAsString()) != null) {
                for (int i2 : ErrorEvent$Status$EnumUnboxingLocalUtility._values()) {
                    if (Intrinsics.areEqual(ErrorEvent$Status$EnumUnboxingLocalUtility.getJsonValue$28(i2), asString)) {
                        i = i2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            long asLong = jsonObject.get("time_spent").getAsLong();
            JsonElement jsonElement7 = jsonObject.get("first_contentful_paint");
            Long valueOf4 = jsonElement7 != null ? Long.valueOf(jsonElement7.getAsLong()) : null;
            JsonElement jsonElement8 = jsonObject.get("largest_contentful_paint");
            Long valueOf5 = jsonElement8 != null ? Long.valueOf(jsonElement8.getAsLong()) : null;
            JsonElement jsonElement9 = jsonObject.get("largest_contentful_paint_target_selector");
            String asString6 = jsonElement9 != null ? jsonElement9.getAsString() : null;
            JsonElement jsonElement10 = jsonObject.get("first_input_delay");
            Long valueOf6 = jsonElement10 != null ? Long.valueOf(jsonElement10.getAsLong()) : null;
            JsonElement jsonElement11 = jsonObject.get("first_input_time");
            Long valueOf7 = jsonElement11 != null ? Long.valueOf(jsonElement11.getAsLong()) : null;
            JsonElement jsonElement12 = jsonObject.get("first_input_target_selector");
            String asString7 = jsonElement12 != null ? jsonElement12.getAsString() : null;
            JsonElement jsonElement13 = jsonObject.get("interaction_to_next_paint");
            Long valueOf8 = jsonElement13 != null ? Long.valueOf(jsonElement13.getAsLong()) : null;
            JsonElement jsonElement14 = jsonObject.get("interaction_to_next_paint_time");
            Long valueOf9 = jsonElement14 != null ? Long.valueOf(jsonElement14.getAsLong()) : null;
            JsonElement jsonElement15 = jsonObject.get("interaction_to_next_paint_target_selector");
            String asString8 = jsonElement15 != null ? jsonElement15.getAsString() : null;
            JsonElement jsonElement16 = jsonObject.get("cumulative_layout_shift");
            Number asNumber = jsonElement16 != null ? jsonElement16.getAsNumber() : null;
            JsonElement jsonElement17 = jsonObject.get("cumulative_layout_shift_time");
            Long valueOf10 = jsonElement17 != null ? Long.valueOf(jsonElement17.getAsLong()) : null;
            JsonElement jsonElement18 = jsonObject.get("cumulative_layout_shift_target_selector");
            String asString9 = jsonElement18 != null ? jsonElement18.getAsString() : null;
            JsonElement jsonElement19 = jsonObject.get("dom_complete");
            Long valueOf11 = jsonElement19 != null ? Long.valueOf(jsonElement19.getAsLong()) : null;
            JsonElement jsonElement20 = jsonObject.get("dom_content_loaded");
            Long valueOf12 = jsonElement20 != null ? Long.valueOf(jsonElement20.getAsLong()) : null;
            JsonElement jsonElement21 = jsonObject.get("dom_interactive");
            Long valueOf13 = jsonElement21 != null ? Long.valueOf(jsonElement21.getAsLong()) : null;
            JsonElement jsonElement22 = jsonObject.get("load_event");
            Long valueOf14 = jsonElement22 != null ? Long.valueOf(jsonElement22.getAsLong()) : null;
            JsonElement jsonElement23 = jsonObject.get("first_byte");
            Long valueOf15 = jsonElement23 != null ? Long.valueOf(jsonElement23.getAsLong()) : null;
            JsonElement jsonElement24 = jsonObject.get("custom_timings");
            ViewEvent.CustomTimings fromJsonObject = (jsonElement24 == null || (asJsonObject10 = jsonElement24.getAsJsonObject()) == null) ? null : Task.Metadata.fromJsonObject(asJsonObject10);
            JsonElement jsonElement25 = jsonObject.get("is_active");
            Boolean valueOf16 = jsonElement25 != null ? Boolean.valueOf(jsonElement25.getAsBoolean()) : null;
            JsonElement jsonElement26 = jsonObject.get("is_slow_rendered");
            Boolean valueOf17 = jsonElement26 != null ? Boolean.valueOf(jsonElement26.getAsBoolean()) : null;
            JsonObject asJsonObject11 = jsonObject.get("action").getAsJsonObject();
            asJsonObject11.getClass();
            ViewEvent.Action fromJsonObject2 = UriValidator.fromJsonObject(asJsonObject11);
            JsonObject asJsonObject12 = jsonObject.get(BreadcrumbHelper.Category.ERROR).getAsJsonObject();
            asJsonObject12.getClass();
            ViewEvent.Error fromJsonObject3 = SecurePixelCopy.fromJsonObject(asJsonObject12);
            JsonElement jsonElement27 = jsonObject.get("crash");
            ViewEvent.Crash fromJsonObject4 = (jsonElement27 == null || (asJsonObject9 = jsonElement27.getAsJsonObject()) == null) ? null : UtilsKt.fromJsonObject(asJsonObject9);
            JsonElement jsonElement28 = jsonObject.get("long_task");
            ViewEvent.LongTask fromJsonObject5 = (jsonElement28 == null || (asJsonObject8 = jsonElement28.getAsJsonObject()) == null) ? null : Regions.fromJsonObject(asJsonObject8);
            JsonElement jsonElement29 = jsonObject.get("frozen_frame");
            ViewEvent.FrozenFrame fromJsonObject6 = (jsonElement29 == null || (asJsonObject7 = jsonElement29.getAsJsonObject()) == null) ? null : ViewGroups.fromJsonObject(asJsonObject7);
            JsonElement jsonElement30 = jsonObject.get("slow_frames");
            if (jsonElement30 == null || (asJsonArray2 = jsonElement30.getAsJsonArray()) == null) {
                number = null;
                arrayList = null;
            } else {
                number = null;
                number = null;
                number = null;
                number = null;
                try {
                    ArrayList arrayList2 = new ArrayList(asJsonArray2.size());
                    Iterator<JsonElement> it = asJsonArray2.iterator();
                    while (it.hasNext()) {
                        JsonObject asJsonObject13 = it.next().getAsJsonObject();
                        asJsonObject13.getClass();
                        arrayList2.add(FirstOrNullOnTimeoutKt.fromJsonObject(asJsonObject13));
                    }
                    arrayList = arrayList2;
                } catch (IllegalStateException e) {
                    e = e;
                    r573 = number;
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEventView", e);
                    return r573;
                } catch (NullPointerException e2) {
                    e = e2;
                    r572 = number;
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEventView", e);
                    return r572;
                } catch (NumberFormatException e3) {
                    e = e3;
                    r57 = number;
                    AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type ViewEventView", e);
                    return r57;
                }
            }
            JsonObject asJsonObject14 = jsonObject.get("resource").getAsJsonObject();
            asJsonObject14.getClass();
            ViewEvent.Resource fromJsonObject7 = SharedViewEventsKt.fromJsonObject(asJsonObject14);
            JsonElement jsonElement31 = jsonObject.get("frustration");
            ?? fromJsonObject8 = (jsonElement31 == null || (asJsonObject6 = jsonElement31.getAsJsonObject()) == null) ? number : ViewKt.fromJsonObject(asJsonObject6);
            JsonElement jsonElement32 = jsonObject.get("in_foreground_periods");
            if (jsonElement32 == null || (asJsonArray = jsonElement32.getAsJsonArray()) == null) {
                r43 = number;
            } else {
                ArrayList arrayList3 = new ArrayList(asJsonArray.size());
                Iterator<JsonElement> it2 = asJsonArray.iterator();
                while (it2.hasNext()) {
                    JsonObject asJsonObject15 = it2.next().getAsJsonObject();
                    asJsonObject15.getClass();
                    arrayList3.add(DrawablesKt.fromJsonObject(asJsonObject15));
                }
                r43 = arrayList3;
            }
            JsonElement jsonElement33 = jsonObject.get("memory_average");
            Number asNumber2 = jsonElement33 != null ? jsonElement33.getAsNumber() : number;
            JsonElement jsonElement34 = jsonObject.get("memory_max");
            Number asNumber3 = jsonElement34 != null ? jsonElement34.getAsNumber() : number;
            JsonElement jsonElement35 = jsonObject.get("cpu_ticks_count");
            Number asNumber4 = jsonElement35 != null ? jsonElement35.getAsNumber() : number;
            JsonElement jsonElement36 = jsonObject.get("cpu_ticks_per_second");
            Number asNumber5 = jsonElement36 != null ? jsonElement36.getAsNumber() : number;
            JsonElement jsonElement37 = jsonObject.get("refresh_rate_average");
            Number asNumber6 = jsonElement37 != null ? jsonElement37.getAsNumber() : number;
            JsonElement jsonElement38 = jsonObject.get("refresh_rate_min");
            Number asNumber7 = jsonElement38 != null ? jsonElement38.getAsNumber() : number;
            JsonElement jsonElement39 = jsonObject.get("slow_frames_rate");
            Number asNumber8 = jsonElement39 != null ? jsonElement39.getAsNumber() : number;
            JsonElement jsonElement40 = jsonObject.get("freeze_rate");
            Number asNumber9 = jsonElement40 != null ? jsonElement40.getAsNumber() : number;
            JsonElement jsonElement41 = jsonObject.get("flutter_build_time");
            ?? fromJsonObject9 = (jsonElement41 == null || (asJsonObject5 = jsonElement41.getAsJsonObject()) == null) ? number : Uris.fromJsonObject(asJsonObject5);
            JsonElement jsonElement42 = jsonObject.get("flutter_raster_time");
            ?? fromJsonObject10 = (jsonElement42 == null || (asJsonObject4 = jsonElement42.getAsJsonObject()) == null) ? number : Uris.fromJsonObject(asJsonObject4);
            JsonElement jsonElement43 = jsonObject.get("js_refresh_rate");
            ?? fromJsonObject11 = (jsonElement43 == null || (asJsonObject3 = jsonElement43.getAsJsonObject()) == null) ? number : Uris.fromJsonObject(asJsonObject3);
            JsonElement jsonElement44 = jsonObject.get(BreadcrumbHelper.Category.PERFORMANCE);
            ?? fromJsonObject12 = (jsonElement44 == null || (asJsonObject2 = jsonElement44.getAsJsonObject()) == null) ? number : ListsKt.fromJsonObject(asJsonObject2);
            JsonElement jsonElement45 = jsonObject.get("accessibility");
            ?? fromJsonObject13 = (jsonElement45 == null || (asJsonObject = jsonElement45.getAsJsonObject()) == null) ? number : zzjo.fromJsonObject(asJsonObject);
            asString2.getClass();
            asString4.getClass();
            return new ViewEvent.ViewEventView(asString2, asString3, asString4, asString5, valueOf, valueOf2, valueOf3, i, asLong, valueOf4, valueOf5, asString6, valueOf6, valueOf7, asString7, valueOf8, valueOf9, asString8, asNumber, valueOf10, asString9, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, fromJsonObject, valueOf16, valueOf17, fromJsonObject2, fromJsonObject3, fromJsonObject4, fromJsonObject5, fromJsonObject6, arrayList, fromJsonObject7, fromJsonObject8, r43, asNumber2, asNumber3, asNumber4, asNumber5, asNumber6, asNumber7, asNumber8, asNumber9, fromJsonObject9, fromJsonObject10, fromJsonObject11, fromJsonObject12, fromJsonObject13);
        } catch (IllegalStateException e4) {
            e = e4;
            r573 = 0;
        } catch (NullPointerException e5) {
            e = e5;
            r572 = 0;
        } catch (NumberFormatException e6) {
            e = e6;
            r57 = 0;
        }
    }
}
