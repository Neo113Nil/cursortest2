package com.squareup.cash.nearby.views;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadt;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.utils.ErrorReportingKt;
import com.squareup.cash.nearby.viewmodels.NearbyOrderedListsViewModel;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.offers.views.home.OffersHeroTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class DotGridKt {

    /* renamed from: lambda$-595004657, reason: not valid java name */
    public static final ComposableLambdaImpl f508lambda$595004657 = new ComposableLambdaImpl(new OffersHeroTileKt$$ExternalSyntheticLambda3(11), false, -595004657);

    public static final void DotGrid(final Modifier modifier, final DotGridPhase dotGridPhase, final boolean z, final DotGridPhase dotGridPhase2, int i, float f, float f2, List list, final Function1 function1, final Set set, final Function1 function12, final Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2) {
        final ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer;
        final int i3;
        final float f3;
        final float f4;
        final List list2;
        float f5;
        float f6;
        Object obj;
        RadialPulsingCache radialPulsingCache;
        float f7;
        Object obj2;
        Object dotGridKt$DotGrid$1$1;
        ArrayList arrayList;
        float f8;
        float f9;
        float f10;
        Object obj3;
        float f11;
        float f12;
        long j;
        EmptyList emptyList;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z2;
        float f19;
        long j2;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        long j3;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        RadialPulsingCache radialPulsingCache2;
        MutableFloatState mutableFloatState;
        MutableFloatState mutableFloatState2;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableFloatState mutableFloatState3;
        int i4;
        MutableFloatState mutableFloatState4;
        DotGridPhase dotGridPhase3;
        List list3;
        ChaserState chaserState;
        SearchCircle searchCircle;
        float f34;
        PulsingState pulsingState;
        MutableState mutableState4;
        GapComposer gapComposer2;
        Set set2;
        SearchCircle searchCircle2;
        float f35;
        MutableFloatState mutableFloatState5;
        List list4;
        DotGridPhase dotGridPhase4;
        MutableState mutableState5;
        float f36;
        PulsingState pulsingState2;
        List list5;
        SearchCircle searchCircle3;
        MutableState mutableState6;
        MutableFloatState mutableFloatState6;
        final MutableState mutableState7;
        float f37;
        Set set3 = set;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(586605082);
        int i5 = i2 | (gapComposer3.changed(dotGridPhase.ordinal()) ? 256 : 128) | (gapComposer3.changed(dotGridPhase2.ordinal()) ? 16384 : PKIFailureInfo.certRevoked) | 115015680;
        if (gapComposer3.shouldExecute(i5 & 1, ((306783379 & i5) == 306783378 && (((gapComposer3.changedInstance(set3) ? (char) 4 : (char) 2) | 3504) & 1171) == 1170) ? false : true)) {
            EmptyList emptyList2 = EmptyList.INSTANCE;
            long j4 = Strings.getColors(gapComposer3).semantic.icon.subtle;
            long j5 = Strings.getColors(gapComposer3).semantic.icon.standard;
            boolean z3 = !Strings.getColors(gapComposer3).isLight;
            long j6 = Strings.getColors(gapComposer3).semantic.icon.danger;
            Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
            float mo236toPx0680j_4 = density.mo236toPx0680j_4(1.25f);
            float mo236toPx0680j_42 = density.mo236toPx0680j_4(4.0f);
            EmptyList emptyList3 = emptyList2;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(emptyList3, 10));
            Iterator<E> it = emptyList3.iterator();
            if (it.hasNext()) {
                throw Recorder$$ExternalSyntheticOutline2.m((Iterator) it);
            }
            float mo236toPx0680j_43 = density.mo236toPx0680j_4(156.0f);
            float mo236toPx0680j_44 = density.mo236toPx0680j_4(72.0f);
            float mo236toPx0680j_45 = density.mo236toPx0680j_4(12.0f);
            float mo236toPx0680j_46 = density.mo236toPx0680j_4(1.05f);
            float mo236toPx0680j_47 = density.mo236toPx0680j_4(28.0f);
            float mo236toPx0680j_48 = density.mo236toPx0680j_4(48.0f);
            float mo236toPx0680j_49 = density.mo236toPx0680j_4(28.0f);
            float mo236toPx0680j_410 = density.mo236toPx0680j_4(165.0f);
            float mo236toPx0680j_411 = density.mo236toPx0680j_4(15.0f);
            float mo236toPx0680j_412 = density.mo236toPx0680j_4(1.0f);
            float mo236toPx0680j_413 = density.mo236toPx0680j_4(3.0f);
            float mo236toPx0680j_414 = density.mo236toPx0680j_4(1.0f);
            float mo236toPx0680j_415 = density.mo236toPx0680j_4(3.0f);
            float mo236toPx0680j_416 = density.mo236toPx0680j_4(1.5f);
            float mo236toPx0680j_417 = density.mo236toPx0680j_4(1.2f);
            float mo236toPx0680j_418 = density.mo236toPx0680j_4(100.0f);
            float mo236toPx0680j_419 = density.mo236toPx0680j_4(50.0f);
            float mo236toPx0680j_420 = density.mo236toPx0680j_4(34.0f);
            float mo236toPx0680j_421 = density.mo236toPx0680j_4(60.0f);
            float mo236toPx0680j_422 = density.mo236toPx0680j_4(16.0f);
            float mo236toPx0680j_423 = density.mo236toPx0680j_4(1000.0f);
            float mo236toPx0680j_424 = density.mo236toPx0680j_4(30.0f);
            float mo236toPx0680j_425 = density.mo236toPx0680j_4(20.0f);
            float mo236toPx0680j_426 = density.mo236toPx0680j_4(12.0f);
            float mo236toPx0680j_427 = density.mo236toPx0680j_4(30.0f);
            Object rememberedValue = gapComposer3.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (rememberedValue == obj4) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            final MutableFloatState mutableFloatState7 = (MutableFloatState) rememberedValue;
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (rememberedValue2 == obj4) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            final MutableFloatState mutableFloatState8 = (MutableFloatState) rememberedValue2;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (rememberedValue3 == obj4) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            MutableFloatState mutableFloatState9 = (MutableFloatState) rememberedValue3;
            Object rememberedValue4 = gapComposer3.rememberedValue();
            if (rememberedValue4 == obj4) {
                rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            MutableFloatState mutableFloatState10 = (MutableFloatState) rememberedValue4;
            Object rememberedValue5 = gapComposer3.rememberedValue();
            if (rememberedValue5 == obj4) {
                rememberedValue5 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            final MutableFloatState mutableFloatState11 = (MutableFloatState) rememberedValue5;
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (rememberedValue6 == obj4) {
                rememberedValue6 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            MutableFloatState mutableFloatState12 = (MutableFloatState) rememberedValue6;
            Object rememberedValue7 = gapComposer3.rememberedValue();
            if (rememberedValue7 == obj4) {
                rememberedValue7 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            final MutableFloatState mutableFloatState13 = (MutableFloatState) rememberedValue7;
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(dotGridPhase2, gapComposer3);
            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(function0, gapComposer3);
            Object rememberedValue8 = gapComposer3.rememberedValue();
            Object obj5 = rememberedValue8;
            if (rememberedValue8 == obj4) {
                SearchCircle searchCircle4 = new SearchCircle();
                searchCircle4.phase1 = 1.3f;
                searchCircle4.phase2 = 2.7f;
                searchCircle4.phase3 = 4.1f;
                gapComposer3.updateRememberedValue(searchCircle4);
                obj5 = searchCircle4;
            }
            SearchCircle searchCircle5 = (SearchCircle) obj5;
            Object rememberedValue9 = gapComposer3.rememberedValue();
            if (rememberedValue9 == obj4) {
                rememberedValue9 = new PulsingState();
                gapComposer3.updateRememberedValue(rememberedValue9);
            }
            PulsingState pulsingState3 = (PulsingState) rememberedValue9;
            Object rememberedValue10 = gapComposer3.rememberedValue();
            if (rememberedValue10 == obj4) {
                RadialPulsingCache radialPulsingCache3 = new RadialPulsingCache();
                f5 = mo236toPx0680j_413;
                f6 = mo236toPx0680j_425;
                radialPulsingCache3.slotX = new float[0];
                radialPulsingCache3.slotY = new float[0];
                radialPulsingCache3.slotOpacity = new float[0];
                radialPulsingCache3.slotDistFromCenter = new float[0];
                gapComposer3.updateRememberedValue(radialPulsingCache3);
                obj = radialPulsingCache3;
            } else {
                f5 = mo236toPx0680j_413;
                f6 = mo236toPx0680j_425;
                obj = rememberedValue10;
            }
            RadialPulsingCache radialPulsingCache4 = (RadialPulsingCache) obj;
            Object rememberedValue11 = gapComposer3.rememberedValue();
            if (rememberedValue11 == obj4) {
                rememberedValue11 = new ArrayList();
                gapComposer3.updateRememberedValue(rememberedValue11);
            }
            List list6 = (List) rememberedValue11;
            Object rememberedValue12 = gapComposer3.rememberedValue();
            if (rememberedValue12 == obj4) {
                ChaserState chaserState2 = new ChaserState();
                radialPulsingCache = radialPulsingCache4;
                f7 = mo236toPx0680j_42;
                chaserState2.intensities = new float[0];
                gapComposer3.updateRememberedValue(chaserState2);
                obj2 = chaserState2;
            } else {
                radialPulsingCache = radialPulsingCache4;
                f7 = mo236toPx0680j_42;
                obj2 = rememberedValue12;
            }
            ChaserState chaserState3 = (ChaserState) obj2;
            Object rememberedValue13 = gapComposer3.rememberedValue();
            if (rememberedValue13 == obj4) {
                rememberedValue13 = Recorder$$ExternalSyntheticOutline2.m(RecyclerView.DECELERATION_RATE, gapComposer3);
            }
            final MutableFloatState mutableFloatState14 = (MutableFloatState) rememberedValue13;
            Object rememberedValue14 = gapComposer3.rememberedValue();
            if (rememberedValue14 == obj4) {
                rememberedValue14 = Updater.mutableFloatStateOf();
                gapComposer3.updateRememberedValue(rememberedValue14);
            }
            MutableFloatState mutableFloatState15 = (MutableFloatState) rememberedValue14;
            Object rememberedValue15 = gapComposer3.rememberedValue();
            if (rememberedValue15 == obj4) {
                rememberedValue15 = Updater.mutableStateOf$default(null);
                gapComposer3.updateRememberedValue(rememberedValue15);
            }
            MutableState mutableState8 = (MutableState) rememberedValue15;
            Object rememberedValue16 = gapComposer3.rememberedValue();
            if (rememberedValue16 == obj4) {
                rememberedValue16 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer3.updateRememberedValue(rememberedValue16);
            }
            final MutableState mutableState9 = (MutableState) rememberedValue16;
            DotGridPhase dotGridPhase5 = z ? DotGridPhase.Formation : dotGridPhase;
            Object rememberedValue17 = gapComposer3.rememberedValue();
            if (rememberedValue17 == obj4) {
                rememberedValue17 = Updater.mutableStateOf$default(dotGridPhase5);
                gapComposer3.updateRememberedValue(rememberedValue17);
            }
            MutableState mutableState10 = (MutableState) rememberedValue17;
            Object rememberedValue18 = gapComposer3.rememberedValue();
            if (rememberedValue18 == obj4) {
                rememberedValue18 = Recorder$$ExternalSyntheticOutline1.m(!z, gapComposer3);
            }
            MutableState mutableState11 = (MutableState) rememberedValue18;
            MutableState rememberUpdatedState3 = Updater.rememberUpdatedState(dotGridPhase, gapComposer3);
            boolean changedInstance = ((i5 & 896) == 256) | gapComposer3.changedInstance(list6) | gapComposer3.changedInstance(chaserState3) | gapComposer3.changedInstance(set3) | gapComposer3.changedInstance(searchCircle5) | gapComposer3.changed(mo236toPx0680j_48) | gapComposer3.changedInstance(pulsingState3);
            Object rememberedValue19 = gapComposer3.rememberedValue();
            if (changedInstance || rememberedValue19 == obj4) {
                arrayList = arrayList2;
                f8 = mo236toPx0680j_43;
                f9 = mo236toPx0680j_426;
                f10 = mo236toPx0680j_46;
                obj3 = obj4;
                f11 = mo236toPx0680j_47;
                f12 = mo236toPx0680j_44;
                j = j5;
                emptyList = emptyList2;
                f13 = f7;
                f14 = mo236toPx0680j_45;
                f15 = mo236toPx0680j_4;
                f16 = mo236toPx0680j_49;
                f17 = mo236toPx0680j_410;
                f18 = mo236toPx0680j_411;
                z2 = z3;
                f19 = mo236toPx0680j_412;
                j2 = j4;
                f20 = mo236toPx0680j_420;
                f21 = mo236toPx0680j_421;
                f22 = mo236toPx0680j_422;
                f23 = mo236toPx0680j_423;
                f24 = mo236toPx0680j_418;
                f25 = mo236toPx0680j_419;
                f26 = mo236toPx0680j_424;
                f27 = mo236toPx0680j_427;
                f28 = mo236toPx0680j_414;
                j3 = j6;
                f29 = mo236toPx0680j_415;
                f30 = mo236toPx0680j_416;
                f31 = mo236toPx0680j_417;
                f32 = f5;
                f33 = f6;
                radialPulsingCache2 = radialPulsingCache;
                mutableFloatState = mutableFloatState9;
                mutableFloatState2 = mutableFloatState12;
                mutableState = rememberUpdatedState2;
                mutableState2 = rememberUpdatedState3;
                mutableState3 = rememberUpdatedState;
                mutableFloatState3 = mutableFloatState15;
                i4 = i5;
                dotGridKt$DotGrid$1$1 = new DotGridKt$DotGrid$1$1(dotGridPhase, list6, chaserState3, set3, searchCircle5, mo236toPx0680j_48, function12, pulsingState3, function1, mutableState11, mutableState9, mutableState10, mutableFloatState11, mutableFloatState8, mutableFloatState10, mutableFloatState14, mutableFloatState3, mutableFloatState, mutableFloatState2, mutableFloatState13, null);
                mutableFloatState4 = mutableFloatState10;
                dotGridPhase3 = dotGridPhase;
                list3 = list6;
                chaserState = chaserState3;
                set3 = set3;
                searchCircle = searchCircle5;
                f34 = mo236toPx0680j_48;
                pulsingState = pulsingState3;
                mutableState4 = mutableState10;
                gapComposer2 = gapComposer3;
                gapComposer2.updateRememberedValue(dotGridKt$DotGrid$1$1);
            } else {
                arrayList = arrayList2;
                f8 = mo236toPx0680j_43;
                f9 = mo236toPx0680j_426;
                f10 = mo236toPx0680j_46;
                obj3 = obj4;
                f12 = mo236toPx0680j_44;
                j = j5;
                emptyList = emptyList2;
                f13 = f7;
                f14 = mo236toPx0680j_45;
                f11 = mo236toPx0680j_47;
                f15 = mo236toPx0680j_4;
                f16 = mo236toPx0680j_49;
                f17 = mo236toPx0680j_410;
                f18 = mo236toPx0680j_411;
                z2 = z3;
                f19 = mo236toPx0680j_412;
                j2 = j4;
                f20 = mo236toPx0680j_420;
                f21 = mo236toPx0680j_421;
                f22 = mo236toPx0680j_422;
                f23 = mo236toPx0680j_423;
                f24 = mo236toPx0680j_418;
                f25 = mo236toPx0680j_419;
                f26 = mo236toPx0680j_424;
                f27 = mo236toPx0680j_427;
                f28 = mo236toPx0680j_414;
                j3 = j6;
                f29 = mo236toPx0680j_415;
                f30 = mo236toPx0680j_416;
                f31 = mo236toPx0680j_417;
                f32 = f5;
                f33 = f6;
                radialPulsingCache2 = radialPulsingCache;
                mutableFloatState = mutableFloatState9;
                mutableFloatState2 = mutableFloatState12;
                mutableState = rememberUpdatedState2;
                mutableState2 = rememberUpdatedState3;
                mutableState3 = rememberUpdatedState;
                mutableFloatState3 = mutableFloatState15;
                pulsingState = pulsingState3;
                gapComposer2 = gapComposer3;
                i4 = i5;
                searchCircle = searchCircle5;
                f34 = mo236toPx0680j_48;
                chaserState = chaserState3;
                dotGridKt$DotGrid$1$1 = rememberedValue19;
                mutableState4 = mutableState10;
                dotGridPhase3 = dotGridPhase;
                list3 = list6;
                mutableFloatState4 = mutableFloatState10;
            }
            Updater.LaunchedEffect(gapComposer2, dotGridPhase3, (Function2) dotGridKt$DotGrid$1$1);
            boolean changedInstance2 = gapComposer2.changedInstance(list3) | gapComposer2.changedInstance(set3) | gapComposer2.changedInstance(searchCircle) | gapComposer2.changed(f34);
            Object rememberedValue20 = gapComposer2.rememberedValue();
            Object obj6 = obj3;
            if (changedInstance2 || rememberedValue20 == obj6) {
                Object dotGridKt$DotGrid$2$1 = new DotGridKt$DotGrid$2$1(list3, set3, searchCircle, f34, function12, mutableState4, mutableFloatState14, mutableFloatState3, mutableFloatState4, null);
                set2 = set3;
                searchCircle2 = searchCircle;
                f35 = f34;
                gapComposer2.updateRememberedValue(dotGridKt$DotGrid$2$1);
                rememberedValue20 = dotGridKt$DotGrid$2$1;
            } else {
                set2 = set3;
                searchCircle2 = searchCircle;
                f35 = f34;
            }
            Updater.LaunchedEffect(gapComposer2, set2, (Function2) rememberedValue20);
            boolean z4 = (i4 & 57344) == 16384;
            Object rememberedValue21 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue21 == obj6) {
                MutableState mutableState12 = mutableState4;
                mutableFloatState5 = mutableFloatState4;
                list4 = list3;
                dotGridPhase4 = dotGridPhase2;
                Object dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Object) dotGridPhase4, (Object) mutableState12, (Object) mutableFloatState2, (Object) mutableFloatState13, (Continuation) null, 0);
                mutableState5 = mutableState12;
                gapComposer2.updateRememberedValue(dotGridKt$DotGrid$3$1);
                rememberedValue21 = dotGridKt$DotGrid$3$1;
            } else {
                mutableState5 = mutableState4;
                mutableFloatState5 = mutableFloatState4;
                list4 = list3;
                dotGridPhase4 = dotGridPhase2;
            }
            Updater.LaunchedEffect(gapComposer2, dotGridPhase4, (Function2) rememberedValue21);
            GapComposer gapComposer4 = gapComposer2;
            final State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(1.0f, AnimatableKt.spring$default(0.5f, 200.0f, null, 4), "dotGridProgress", null, gapComposer4, 3072, 20);
            gapComposer = gapComposer4;
            Object rememberedValue22 = gapComposer.rememberedValue();
            if (rememberedValue22 == obj6) {
                rememberedValue22 = Updater.mutableFloatStateOf();
                gapComposer.updateRememberedValue(rememberedValue22);
            }
            final MutableFloatState mutableFloatState16 = (MutableFloatState) rememberedValue22;
            Unit unit = Unit.INSTANCE;
            MutableState mutableState13 = mutableState;
            MutableState mutableState14 = mutableState2;
            MutableState mutableState15 = mutableState3;
            boolean changed = gapComposer.changed(mutableState13) | gapComposer.changed(mutableState14) | gapComposer.changed(mutableState15) | gapComposer.changedInstance(pulsingState) | gapComposer.changedInstance(list4) | gapComposer.changedInstance(searchCircle2) | gapComposer.changedInstance(chaserState);
            Object rememberedValue23 = gapComposer.rememberedValue();
            if (changed || rememberedValue23 == obj6) {
                PulsingState pulsingState4 = pulsingState;
                SearchCircle searchCircle6 = searchCircle2;
                List list7 = list4;
                rememberedValue23 = new DotGridKt$DotGrid$4$1(0.15f, pulsingState4, function1, list7, searchCircle6, chaserState, mutableFloatState16, mutableFloatState7, mutableState5, mutableFloatState8, mutableState11, mutableState13, mutableState14, mutableState15, mutableFloatState, mutableFloatState5, mutableState9, mutableFloatState11, mutableFloatState2, mutableFloatState13, mutableFloatState14, mutableFloatState3, null);
                f36 = 0.15f;
                pulsingState2 = pulsingState4;
                list5 = list7;
                searchCircle3 = searchCircle6;
                mutableFloatState7 = mutableFloatState7;
                mutableState6 = mutableState5;
                mutableFloatState8 = mutableFloatState8;
                mutableFloatState6 = mutableFloatState5;
                mutableFloatState11 = mutableFloatState11;
                gapComposer.updateRememberedValue(rememberedValue23);
            } else {
                searchCircle3 = searchCircle2;
                list5 = list4;
                pulsingState2 = pulsingState;
                f36 = 0.15f;
                mutableState6 = mutableState5;
                mutableFloatState6 = mutableFloatState5;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue23);
            final float f38 = f17;
            final float f39 = f18;
            boolean changed2 = gapComposer.changed(f16) | gapComposer.changed(f38) | gapComposer.changed(f39);
            Object rememberedValue24 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue24 == obj6) {
                final MutableFloatState mutableFloatState17 = mutableFloatState3;
                mutableState7 = mutableState8;
                final float f40 = f16;
                rememberedValue24 = new Function1() { // from class: com.squareup.cash.nearby.views.DotGridKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj7;
                        layoutCoordinates.getClass();
                        float mo838getSizeYbymL2g = (int) (layoutCoordinates.mo838getSizeYbymL2g() >> 32);
                        float mo838getSizeYbymL2g2 = (int) (layoutCoordinates.mo838getSizeYbymL2g() & BodyPartID.bodyIdMax);
                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState14;
                        float floatValue = parcelableSnapshotMutableFloatState.getFloatValue();
                        MutableFloatState mutableFloatState18 = mutableFloatState17;
                        if (mo838getSizeYbymL2g != floatValue || mo838getSizeYbymL2g2 != ((ParcelableSnapshotMutableFloatState) mutableFloatState18).getFloatValue()) {
                            parcelableSnapshotMutableFloatState.setFloatValue(mo838getSizeYbymL2g);
                            ((ParcelableSnapshotMutableFloatState) mutableFloatState18).setFloatValue(mo838getSizeYbymL2g2);
                            float f41 = mo838getSizeYbymL2g / 2.0f;
                            float f42 = mo838getSizeYbymL2g2 / 2.0f;
                            float min = Math.min(mo838getSizeYbymL2g, mo838getSizeYbymL2g2) / 19.0f;
                            int i6 = ((int) (f41 / min)) + 1;
                            int i7 = ((int) (f42 / min)) + 1;
                            ArrayList computeRadialPositions$default = DotGridKt.computeRadialPositions$default(f41, f42, f40, f38, f39, Fragment$5$$ExternalSyntheticOutline0.m$1(i6, 2, 1, (i7 * 2) + 1));
                            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                            int i8 = -i7;
                            if (i8 <= i7) {
                                int i9 = i8;
                                while (true) {
                                    int i10 = -i6;
                                    if (i10 <= i6) {
                                        while (true) {
                                            float f43 = (i10 * min) + f41;
                                            float f44 = (i9 * min) + f42;
                                            float f45 = f43 - f41;
                                            float f46 = f44 - f42;
                                            createListBuilder.add(new RadialGridDot(f43, f44, (float) Math.sqrt((f46 * f46) + (f45 * f45)), i9, i10));
                                            if (i10 == i6) {
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                    if (i9 == i7) {
                                        break;
                                    }
                                    i9++;
                                }
                            }
                            mutableState7.setValue(new RadialLayoutCache(computeRadialPositions$default, CollectionsKt.sortedWith(CollectionsKt__CollectionsJVMKt.build(createListBuilder), new b.C0008b(24))));
                        }
                        return Unit.INSTANCE;
                    }
                };
                f37 = f40;
                gapComposer.updateRememberedValue(rememberedValue24);
            } else {
                mutableState7 = mutableState8;
                f37 = f16;
            }
            final MutableState mutableState16 = mutableState6;
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue24);
            final float f41 = f15;
            boolean changedInstance3 = gapComposer.changedInstance(list5) | gapComposer.changedInstance(set2) | gapComposer.changedInstance(searchCircle3) | gapComposer.changed(f35) | gapComposer.changed(f41) | gapComposer.changed(f13);
            final SearchCircle searchCircle7 = searchCircle3;
            final long j7 = j2;
            boolean changed3 = changedInstance3 | gapComposer.changed(j7);
            final float f42 = f19;
            boolean changed4 = changed3 | gapComposer.changed(f42);
            final float f43 = f8;
            boolean changed5 = changed4 | gapComposer.changed(f43) | gapComposer.changed(j) | gapComposer.changed(animateFloatAsState) | gapComposer.changedInstance(emptyList) | gapComposer.changedInstance(arrayList) | gapComposer.changed(f12);
            final float f44 = f14;
            boolean changed6 = changed5 | gapComposer.changed(f44);
            final float f45 = f10;
            boolean changed7 = changed6 | gapComposer.changed(f45) | gapComposer.changedInstance(chaserState);
            final float f46 = f11;
            boolean changed8 = changed7 | gapComposer.changed(f46);
            final RadialPulsingCache radialPulsingCache5 = radialPulsingCache2;
            boolean changedInstance4 = changed8 | gapComposer.changedInstance(radialPulsingCache5) | gapComposer.changed(f37) | gapComposer.changed(f38) | gapComposer.changed(f39) | gapComposer.changed(z2) | gapComposer.changedInstance(pulsingState2);
            final float f47 = f24;
            boolean changed9 = changedInstance4 | gapComposer.changed(f47);
            final float f48 = f25;
            boolean changed10 = changed9 | gapComposer.changed(f48) | gapComposer.changed(f20) | gapComposer.changed(f21) | gapComposer.changed(f22) | gapComposer.changed(f23);
            final float f49 = f26;
            boolean changed11 = changed10 | gapComposer.changed(f49);
            final float f50 = f33;
            boolean changed12 = changed11 | gapComposer.changed(f50);
            final float f51 = f9;
            boolean changed13 = changed12 | gapComposer.changed(f51) | gapComposer.changed(f27);
            final float f52 = f32;
            final long j8 = j3;
            boolean changed14 = changed13 | gapComposer.changed(f52) | gapComposer.changed(f28) | gapComposer.changed(j8) | gapComposer.changed(f29) | gapComposer.changed(f30) | gapComposer.changed(f31);
            Object rememberedValue25 = gapComposer.rememberedValue();
            final float f53 = 0.05f;
            if (changed14 || rememberedValue25 == obj6) {
                final List list8 = list5;
                final float f54 = f37;
                final float f55 = f35;
                final Set set4 = set2;
                final MutableFloatState mutableFloatState18 = mutableFloatState2;
                final MutableState mutableState17 = mutableState7;
                final EmptyList emptyList4 = emptyList;
                final long j9 = j;
                final boolean z5 = z2;
                final ArrayList arrayList3 = arrayList;
                final float f56 = f12;
                final float f57 = f28;
                final float f58 = f29;
                final float f59 = f30;
                final float f60 = f31;
                final float f61 = f20;
                final float f62 = f21;
                final float f63 = f22;
                final float f64 = f23;
                final float f65 = f27;
                final MutableFloatState mutableFloatState19 = mutableFloatState;
                final ChaserState chaserState4 = chaserState;
                final PulsingState pulsingState5 = pulsingState2;
                final float f66 = f13;
                final MutableFloatState mutableFloatState20 = mutableFloatState6;
                rememberedValue25 = new Function1() { // from class: com.squareup.cash.nearby.views.DotGridKt$$ExternalSyntheticLambda1
                    /* JADX WARN: Removed duplicated region for block: B:101:0x05f3  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0467 A[LOOP:5: B:74:0x0363->B:80:0x0467, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:81:0x047f A[SYNTHETIC] */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj7) {
                        boolean booleanValue;
                        float f67;
                        long j10;
                        char c;
                        float f68;
                        int i6;
                        int i7;
                        int i8;
                        int i9;
                        int i10;
                        long j11;
                        float f69;
                        ChaserState chaserState5;
                        ArrayList arrayList4;
                        float f70;
                        float f71;
                        float f72;
                        SearchCircle searchCircle8;
                        int i11;
                        int i12;
                        int i13;
                        DrawScope drawScope;
                        float f73;
                        float f74;
                        float exp;
                        int i14;
                        int i15;
                        float f75;
                        List list9;
                        float f76;
                        float[] fArr;
                        float f77;
                        float f78;
                        float f79;
                        int i16;
                        float[] fArr2;
                        float f80;
                        int i17;
                        float f81;
                        float f82;
                        int i18;
                        DrawScope drawScope2;
                        long j12;
                        int i19;
                        float f83;
                        int i20;
                        float f84;
                        float cos;
                        int i21;
                        float f85;
                        int i22;
                        int i23;
                        float f86;
                        ArrayList arrayList5;
                        int i24;
                        float f87;
                        float f88;
                        float f89;
                        int i25;
                        float[] fArr3;
                        float f90;
                        long j13;
                        DrawScope drawScope3;
                        int i26;
                        float f91;
                        ArrayList arrayList6;
                        int i27;
                        int i28;
                        int i29;
                        float f92;
                        float f93;
                        float f94;
                        float f95;
                        float f96;
                        long j14;
                        long j15;
                        float f97;
                        long j16;
                        int i30;
                        int i31;
                        int i32;
                        int i33;
                        int i34;
                        long j17;
                        float f98;
                        float f99;
                        float f100;
                        float f101;
                        int i35;
                        float f102;
                        int i36;
                        long computeSpreadPosition;
                        DrawScope drawScope4 = (DrawScope) obj7;
                        drawScope4.getClass();
                        MutableState mutableState18 = mutableState16;
                        DotGridPhase dotGridPhase6 = (DotGridPhase) mutableState18.getValue();
                        DotGridPhase dotGridPhase7 = DotGridPhase.PersonFound;
                        List list10 = list8;
                        SearchCircle searchCircle9 = searchCircle7;
                        MutableFloatState mutableFloatState21 = mutableFloatState20;
                        if (dotGridPhase6 == dotGridPhase7 && list10.isEmpty()) {
                            Set<String> set5 = set4;
                            if (!set5.isEmpty()) {
                                int i37 = 0;
                                for (String str : set5) {
                                    int i38 = i37 + 1;
                                    if (i37 == 0) {
                                        float f103 = searchCircle9.x;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope4.mo753getSizeNHjbRc() >> 32));
                                        float f104 = f55;
                                        computeSpreadPosition = searchCircle9.m3668snapshotAtRc2DDho(DotGridKt.DotGrid$safeClamp(f103, f104, intBitsToFloat), DotGridKt.DotGrid$safeClamp(searchCircle9.y, f104, Float.intBitsToFloat((int) (drawScope4.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))), Float.intBitsToFloat((int) (drawScope4.mo753getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawScope4.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)));
                                    } else {
                                        computeSpreadPosition = DotGridKt.computeSpreadPosition(list10, Float.intBitsToFloat((int) (drawScope4.mo753getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawScope4.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)));
                                    }
                                    list10.add(new FrozenPerson(computeSpreadPosition, str, ((ParcelableSnapshotMutableFloatState) mutableFloatState21).getFloatValue()));
                                    i37 = i38;
                                }
                                Function1 function13 = function12;
                                if (function13 != null) {
                                    List<FrozenPerson> list11 = list10;
                                    int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
                                    if (mapCapacity < 16) {
                                        mapCapacity = 16;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                                    for (FrozenPerson frozenPerson : list11) {
                                        linkedHashMap.put(frozenPerson.id, new Offset(frozenPerson.position));
                                    }
                                    function13.invoke(linkedHashMap);
                                }
                            }
                        }
                        booleanValue = ((Boolean) mutableState9.getValue()).booleanValue();
                        float f105 = f53;
                        float f106 = f41;
                        float f107 = f66;
                        long j18 = j7;
                        float f108 = f42;
                        MutableState mutableState19 = mutableState17;
                        MutableFloatState mutableFloatState22 = mutableFloatState7;
                        MutableFloatState mutableFloatState23 = mutableFloatState11;
                        float f109 = 2.0f;
                        if (booleanValue) {
                            RadialLayoutCache radialLayoutCache = (RadialLayoutCache) mutableState19.getValue();
                            if (radialLayoutCache != null) {
                                zzadt.m2017drawDotGridRadialTransitionV9fs2A(drawScope4, f105, f106, f107, ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue(), j18, RangesKt___RangesKt.coerceIn(1.0f - (((ParcelableSnapshotMutableFloatState) mutableFloatState23).getFloatValue() / 2.0f), RecyclerView.DECELERATION_RATE, 1.0f), radialLayoutCache, f108);
                            }
                        } else {
                            DrawScope drawScope5 = drawScope4;
                            int ordinal = ((DotGridPhase) mutableState18.getValue()).ordinal();
                            long j19 = j9;
                            float f110 = f45;
                            MutableFloatState mutableFloatState24 = mutableFloatState16;
                            switch (ordinal) {
                                case 0:
                                    break;
                                case 1:
                                    long j20 = j18;
                                    float f111 = f107;
                                    float floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue();
                                    char c2 = 0;
                                    float coerceIn = RangesKt___RangesKt.coerceIn(((ParcelableSnapshotMutableFloatState) mutableFloatState8).getFloatValue() / 2.5f, RecyclerView.DECELERATION_RATE, 1.0f);
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() >> 32));
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                    float f112 = intBitsToFloat2 / 2.0f;
                                    float f113 = intBitsToFloat3 / 2.0f;
                                    float gridSpacing = DotGridKt.gridSpacing(intBitsToFloat2, intBitsToFloat3, 20);
                                    int i39 = ((int) (f112 / gridSpacing)) + 1;
                                    int i40 = ((int) (f113 / gridSpacing)) + 1;
                                    float f114 = i39 * gridSpacing;
                                    float f115 = i40 * gridSpacing;
                                    float sqrt = (float) Math.sqrt((f115 * f115) + (f114 * f114));
                                    float f116 = sqrt > RecyclerView.DECELERATION_RATE ? (f43 * gridSpacing) / sqrt : RecyclerView.DECELERATION_RATE;
                                    float f117 = coerceIn * 3.0f;
                                    int i41 = -i40;
                                    if (i41 <= i40) {
                                        while (true) {
                                            int i42 = -i39;
                                            if (i42 <= i39) {
                                                while (true) {
                                                    float f118 = i42;
                                                    float f119 = (f118 * gridSpacing) + f112;
                                                    float f120 = (i41 * gridSpacing) + f113;
                                                    float max = Math.max(RecyclerView.DECELERATION_RATE, f117 - DotGridKt.dotRandom(i41, i42));
                                                    DrawScope drawScope6 = drawScope5;
                                                    float smoothstep = DotGridKt.smoothstep(RecyclerView.DECELERATION_RATE, 1.0f, Math.min(1.0f, max / 0.5f)) * Color.m677getAlphaimpl(j20);
                                                    if (smoothstep > RecyclerView.DECELERATION_RATE) {
                                                        float smoothstep2 = DotGridKt.smoothstep(RecyclerView.DECELERATION_RATE, 1.0f, Math.min(1.0f, max / 1.3f));
                                                        long noiseDrift = DotGridKt.noiseDrift(f105, floatValue, f111, i42, i41);
                                                        float intBitsToFloat4 = (Float.intBitsToFloat((int) (noiseDrift >> 32)) * smoothstep2) + (f118 * (1.0f - smoothstep2) * f116) + f119;
                                                        float f121 = f106;
                                                        float intBitsToFloat5 = Float.intBitsToFloat((int) (noiseDrift & BodyPartID.bodyIdMax)) * smoothstep2;
                                                        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(smoothstep, j20, 14);
                                                        f68 = f111;
                                                        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat5 + (r8 * r21) + f120) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat4) << 32);
                                                        i7 = i39;
                                                        i8 = i40;
                                                        f67 = floatValue;
                                                        j10 = j20;
                                                        c = 0;
                                                        i6 = i41;
                                                        i9 = i42;
                                                        DrawScope.m738drawCircleVaOC9Bg$default(drawScope6, m675copywmQWz5c$default, f121, floatToRawIntBits, null, 0, 120);
                                                        drawScope5 = drawScope6;
                                                        f106 = f121;
                                                    } else {
                                                        i7 = i39;
                                                        c = 0;
                                                        f67 = floatValue;
                                                        j10 = j20;
                                                        f68 = f111;
                                                        drawScope5 = drawScope6;
                                                        i6 = i41;
                                                        i9 = i42;
                                                        i8 = i40;
                                                    }
                                                    if (i9 != i7) {
                                                        i42 = i9 + 1;
                                                        i41 = i6;
                                                        i39 = i7;
                                                        i40 = i8;
                                                        j20 = j10;
                                                        f111 = f68;
                                                        floatValue = f67;
                                                    }
                                                }
                                            } else {
                                                f67 = floatValue;
                                                j10 = j20;
                                                c = c2;
                                                f68 = f111;
                                                i6 = i41;
                                                i7 = i39;
                                                i8 = i40;
                                            }
                                            if (i6 == i8) {
                                                break;
                                            } else {
                                                i41 = i6 + 1;
                                                floatValue = f67;
                                                i39 = i7;
                                                i40 = i8;
                                                c2 = c;
                                                j20 = j10;
                                                f111 = f68;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ErrorReportingKt.m3413drawDotGridNuxPulseS3DtmDA(drawScope5, f105, f106, f107, ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue(), j18, j19, ((ParcelableSnapshotMutableFloatState) mutableFloatState19).getFloatValue(), f108);
                                    break;
                                case 3:
                                    float f122 = f107;
                                    long j21 = j19;
                                    float floatValue2 = ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue();
                                    float floatValue3 = ((Number) animateFloatAsState.getValue()).floatValue();
                                    float floatValue4 = ((ParcelableSnapshotMutableFloatState) mutableFloatState24).getFloatValue();
                                    List list12 = emptyList4;
                                    list12.getClass();
                                    searchCircle9.getClass();
                                    ChaserState chaserState6 = chaserState4;
                                    chaserState6.getClass();
                                    if (floatValue3 != RecyclerView.DECELERATION_RATE) {
                                        SearchCircle searchCircle10 = searchCircle9;
                                        float intBitsToFloat6 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() >> 32));
                                        float intBitsToFloat7 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                        float f123 = intBitsToFloat6 / 2.0f;
                                        float f124 = 0.0f;
                                        float f125 = intBitsToFloat7 / 2.0f;
                                        DrawScope drawScope7 = drawScope5;
                                        float gridSpacing2 = DotGridKt.gridSpacing(intBitsToFloat6, intBitsToFloat7, 20);
                                        int i43 = ((int) (f123 / gridSpacing2)) + 1;
                                        int i44 = ((int) (f125 / gridSpacing2)) + 1;
                                        int i45 = (i43 * 2) + 1;
                                        int i46 = (i44 * 2) + 1;
                                        long j22 = j18;
                                        if (i45 != chaserState6.cols || i46 != chaserState6.rows) {
                                            chaserState6.cols = i45;
                                            chaserState6.rows = i46;
                                            chaserState6.halfRows = i44;
                                            chaserState6.halfCols = i43;
                                            chaserState6.intensities = new float[i45 * i46];
                                        }
                                        float f126 = f56;
                                        float f127 = f126 * f126;
                                        float m677getAlphaimpl = 0.95f / Color.m677getAlphaimpl(j22);
                                        float f128 = m677getAlphaimpl > 1.0f ? 1.0f : m677getAlphaimpl;
                                        boolean z6 = ColorKt.m690luminance8_81llA(j22) > 0.3f;
                                        int size = list12.size();
                                        float[] fArr4 = new float[size];
                                        if (size > 0) {
                                            list12.get(0).getClass();
                                            a$$ExternalSyntheticBUOutline0.m$1();
                                            return null;
                                        }
                                        float[] fArr5 = new float[size];
                                        if (size > 0) {
                                            list12.get(0).getClass();
                                            a$$ExternalSyntheticBUOutline0.m$1();
                                            return null;
                                        }
                                        float[] fArr6 = new float[size];
                                        int i47 = 0;
                                        while (true) {
                                            ArrayList arrayList7 = arrayList3;
                                            if (i47 >= size) {
                                                int i48 = -i44;
                                                if (i48 <= i44) {
                                                    while (true) {
                                                        int i49 = -i43;
                                                        if (i49 <= i43) {
                                                            int i50 = i43;
                                                            while (true) {
                                                                float f129 = (i48 * gridSpacing2) + f125;
                                                                long noiseDrift2 = DotGridKt.noiseDrift(f105, floatValue2, f122, i49, i48);
                                                                int i51 = i48;
                                                                int i52 = i49;
                                                                float intBitsToFloat8 = Float.intBitsToFloat((int) (noiseDrift2 >> 32)) + (i49 * gridSpacing2) + f123;
                                                                f70 = floatValue2;
                                                                f71 = f122;
                                                                float intBitsToFloat9 = Float.intBitsToFloat((int) (noiseDrift2 & BodyPartID.bodyIdMax)) + f129;
                                                                float lerp = DotGridKt.lerp(f123, intBitsToFloat8, floatValue3);
                                                                float lerp2 = DotGridKt.lerp(f125, intBitsToFloat9, floatValue3);
                                                                SearchCircle searchCircle11 = searchCircle10;
                                                                float f130 = lerp - searchCircle11.x;
                                                                float f131 = lerp2 - searchCircle11.y;
                                                                if ((f131 * f131) + (f130 * f130) > f127 * 2.0f) {
                                                                    f74 = lerp2;
                                                                    exp = f124;
                                                                } else {
                                                                    f74 = lerp2;
                                                                    exp = (float) Math.exp((r13 * (-3.0f)) / f127);
                                                                }
                                                                int i53 = i52 + chaserState6.halfCols + ((i51 + chaserState6.halfRows) * chaserState6.cols);
                                                                float[] fArr7 = chaserState6.intensities;
                                                                float f132 = lerp;
                                                                float f133 = fArr7[i53] - (floatValue4 * 1.0f);
                                                                if (f133 < f124) {
                                                                    f133 = f124;
                                                                }
                                                                float f134 = (exp * 1.5f * floatValue4) + f133;
                                                                if (f134 > 1.0f) {
                                                                    f134 = 1.0f;
                                                                }
                                                                fArr7[i53] = f134;
                                                                float f135 = f74 - (f44 * exp);
                                                                float lerp3 = DotGridKt.lerp(1.0f, 1.8f, exp) * f106;
                                                                f72 = f125;
                                                                long j23 = j22;
                                                                long m689lerpjxsXWHM = ColorKt.m689lerpjxsXWHM(exp, j23, j21);
                                                                float m677getAlphaimpl2 = Color.m677getAlphaimpl(j23) * floatValue3;
                                                                j11 = j21;
                                                                float lerp4 = DotGridKt.lerp(m677getAlphaimpl2, m677getAlphaimpl2 * f128, exp);
                                                                int i54 = size;
                                                                float f136 = f135;
                                                                int i55 = 0;
                                                                while (i55 < i54) {
                                                                    float f137 = f132 - fArr4[i55];
                                                                    float f138 = f136 - fArr5[i55];
                                                                    float f139 = f136;
                                                                    float f140 = (f138 * f138) + (f137 * f137);
                                                                    if (f140 < fArr6[i55]) {
                                                                        i15 = i54;
                                                                        f75 = floatValue3;
                                                                        float sqrt2 = (float) Math.sqrt(f140);
                                                                        if (sqrt2 >= 0.001f) {
                                                                            float floatValue5 = ((Number) arrayList7.get(i55)).floatValue();
                                                                            i14 = i55;
                                                                            float f141 = f124;
                                                                            float smoothstep3 = DotGridKt.smoothstep(floatValue5 * 2.0f, f141, sqrt2);
                                                                            if (smoothstep3 > f141) {
                                                                                float f142 = smoothstep3 * floatValue5;
                                                                                f132 = ((f137 / sqrt2) * f142) + f132;
                                                                                f136 = ((f138 / sqrt2) * f142) + f139;
                                                                                i55 = i14 + 1;
                                                                                floatValue3 = f75;
                                                                                i54 = i15;
                                                                                f124 = RecyclerView.DECELERATION_RATE;
                                                                            }
                                                                        } else {
                                                                            i14 = i55;
                                                                        }
                                                                    } else {
                                                                        i14 = i55;
                                                                        i15 = i54;
                                                                        f75 = floatValue3;
                                                                    }
                                                                    f136 = f139;
                                                                    i55 = i14 + 1;
                                                                    floatValue3 = f75;
                                                                    i54 = i15;
                                                                    f124 = RecyclerView.DECELERATION_RATE;
                                                                }
                                                                i10 = i54;
                                                                f69 = floatValue3;
                                                                long floatToRawIntBits2 = (Float.floatToRawIntBits(f132) << 32) | (Float.floatToRawIntBits(f136) & BodyPartID.bodyIdMax);
                                                                long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(lerp4, m689lerpjxsXWHM, 14);
                                                                i13 = i44;
                                                                j22 = j23;
                                                                arrayList4 = arrayList7;
                                                                i11 = i50;
                                                                i12 = i51;
                                                                chaserState5 = chaserState6;
                                                                searchCircle8 = searchCircle11;
                                                                drawScope = drawScope7;
                                                                f73 = f123;
                                                                DrawScope.m738drawCircleVaOC9Bg$default(drawScope, m675copywmQWz5c$default2, lerp3, floatToRawIntBits2, null, 0, 120);
                                                                if (f134 > 0.15f && z6) {
                                                                    DotGridKt.m3667drawRgbChromaticAberrationEPk0efs(drawScope, floatToRawIntBits2, lerp3, 0.7f * lerp4 * f134, f110 * f134, true);
                                                                }
                                                                if (i52 != i11) {
                                                                    i49 = i52 + 1;
                                                                    i48 = i12;
                                                                    i44 = i13;
                                                                    arrayList7 = arrayList4;
                                                                    f123 = f73;
                                                                    chaserState6 = chaserState5;
                                                                    searchCircle10 = searchCircle8;
                                                                    f125 = f72;
                                                                    floatValue2 = f70;
                                                                    j21 = j11;
                                                                    floatValue3 = f69;
                                                                    size = i10;
                                                                    f124 = RecyclerView.DECELERATION_RATE;
                                                                    drawScope7 = drawScope;
                                                                    i50 = i11;
                                                                    f122 = f71;
                                                                }
                                                            }
                                                        } else {
                                                            i10 = size;
                                                            j11 = j21;
                                                            f69 = floatValue3;
                                                            chaserState5 = chaserState6;
                                                            arrayList4 = arrayList7;
                                                            f70 = floatValue2;
                                                            f71 = f122;
                                                            f72 = f125;
                                                            searchCircle8 = searchCircle10;
                                                            i11 = i43;
                                                            i12 = i48;
                                                            i13 = i44;
                                                            drawScope = drawScope7;
                                                            f73 = f123;
                                                        }
                                                        if (i12 == i13) {
                                                            break;
                                                        } else {
                                                            i48 = i12 + 1;
                                                            i44 = i13;
                                                            arrayList7 = arrayList4;
                                                            f123 = f73;
                                                            chaserState6 = chaserState5;
                                                            searchCircle10 = searchCircle8;
                                                            f125 = f72;
                                                            floatValue2 = f70;
                                                            j21 = j11;
                                                            floatValue3 = f69;
                                                            size = i10;
                                                            f124 = RecyclerView.DECELERATION_RATE;
                                                            drawScope7 = drawScope;
                                                            i43 = i11;
                                                            f122 = f71;
                                                        }
                                                    }
                                                }
                                            } else {
                                                fArr6[i47] = ((Number) arrayList7.get(i47)).floatValue() * 2.0f * ((Number) arrayList7.get(i47)).floatValue() * 2.0f;
                                                i47++;
                                            }
                                        }
                                    }
                                    break;
                                case 4:
                                    long j24 = j18;
                                    float f143 = f105;
                                    float f144 = f107;
                                    float floatValue6 = ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue();
                                    float floatValue7 = ((ParcelableSnapshotMutableFloatState) mutableFloatState21).getFloatValue();
                                    float floatValue8 = ((ParcelableSnapshotMutableFloatState) mutableFloatState24).getFloatValue();
                                    searchCircle9.getClass();
                                    list10.getClass();
                                    float intBitsToFloat10 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() >> 32));
                                    float intBitsToFloat11 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                    float f145 = intBitsToFloat10 / 2.0f;
                                    float f146 = intBitsToFloat11 / 2.0f;
                                    float gridSpacing3 = DotGridKt.gridSpacing(intBitsToFloat10, intBitsToFloat11, 20);
                                    int i56 = ((int) (f145 / gridSpacing3)) + 1;
                                    int i57 = ((int) (f146 / gridSpacing3)) + 1;
                                    List list13 = list10;
                                    float f147 = f146;
                                    searchCircle9.update(floatValue8, f145, f147, intBitsToFloat10, intBitsToFloat11);
                                    float f148 = f46;
                                    float f149 = f148 * 3.0f;
                                    float f150 = f149 * f149;
                                    int size2 = list13.size();
                                    float[] fArr8 = new float[size2];
                                    float f151 = 0.0f;
                                    float[] fArr9 = new float[size2];
                                    float[] fArr10 = new float[size2];
                                    float f152 = 1.0f;
                                    int i58 = 0;
                                    while (i58 < size2) {
                                        float f153 = f148;
                                        FrozenPerson frozenPerson2 = (FrozenPerson) list13.get(i58);
                                        DrawScope drawScope8 = drawScope5;
                                        float f154 = (floatValue7 - frozenPerson2.appearTime) - 0.2f;
                                        if (f154 < f151) {
                                            f154 = f151;
                                        }
                                        int i59 = i58;
                                        float f155 = f149;
                                        fArr8[i59] = (f152 - ((float) Math.exp(f154 * (-5.0f)))) * f153;
                                        float f156 = f151;
                                        float f157 = f152;
                                        fArr9[i59] = RangesKt___RangesKt.coerceIn((floatValue7 - frozenPerson2.appearTime) * 3.0f, f156, f157);
                                        float f158 = f155 - fArr8[i59];
                                        if (f158 < f157) {
                                            f158 = 1.0f;
                                        }
                                        fArr10[i59] = f158;
                                        i58 = i59 + 1;
                                        f149 = f155;
                                        f151 = f156;
                                        f148 = f153;
                                        drawScope5 = drawScope8;
                                        f152 = 1.0f;
                                    }
                                    DrawScope drawScope9 = drawScope5;
                                    float f159 = f151;
                                    int i60 = -i57;
                                    if (i60 <= i57) {
                                        int i61 = i60;
                                        while (true) {
                                            int i62 = -i56;
                                            if (i62 <= i56) {
                                                int i63 = i62;
                                                while (true) {
                                                    long noiseDrift3 = DotGridKt.noiseDrift(f143, floatValue6, f144, i63, i61);
                                                    float intBitsToFloat12 = Float.intBitsToFloat((int) (noiseDrift3 >> 32)) + (i63 * gridSpacing3) + f145;
                                                    float intBitsToFloat13 = Float.intBitsToFloat((int) (noiseDrift3 & BodyPartID.bodyIdMax)) + (i61 * gridSpacing3) + f147;
                                                    int i64 = 0;
                                                    float f160 = RecyclerView.DECELERATION_RATE;
                                                    float f161 = RecyclerView.DECELERATION_RATE;
                                                    while (i64 < size2) {
                                                        float f162 = fArr8[i64];
                                                        if (f162 > 0.5f) {
                                                            i19 = i64;
                                                            FrozenPerson frozenPerson3 = (FrozenPerson) list13.get(i64);
                                                            f83 = f160;
                                                            i20 = i57;
                                                            float intBitsToFloat14 = intBitsToFloat12 - Float.intBitsToFloat((int) (frozenPerson3.position >> 32));
                                                            float intBitsToFloat15 = intBitsToFloat13 - Float.intBitsToFloat((int) (frozenPerson3.position & BodyPartID.bodyIdMax));
                                                            float f163 = (intBitsToFloat15 * intBitsToFloat15) + (intBitsToFloat14 * intBitsToFloat14);
                                                            if (f163 > 0.01f && f163 < f150) {
                                                                float sqrt3 = (float) Math.sqrt(f163);
                                                                float f164 = intBitsToFloat14 / sqrt3;
                                                                float f165 = intBitsToFloat15 / sqrt3;
                                                                if (sqrt3 < f162) {
                                                                    cos = (f162 * 0.8f) + (f162 - sqrt3);
                                                                    f84 = f164;
                                                                } else {
                                                                    float f166 = (sqrt3 - f162) / fArr10[i19];
                                                                    SetBuilder setBuilder = DotGridConstantsKt.BLUETOOTH_SYMBOL_OFFSETS;
                                                                    f84 = f164;
                                                                    cos = (((float) Math.cos(f166 * 3.1415927f)) + 1.0f) * 0.5f * f162 * 0.8f;
                                                                }
                                                                float f167 = fArr9[i19];
                                                                f160 = (f84 * cos * f167) + f83;
                                                                f161 = (f165 * cos * f167) + f161;
                                                                i64 = i19 + 1;
                                                                i57 = i20;
                                                            }
                                                        } else {
                                                            i19 = i64;
                                                            f83 = f160;
                                                            i20 = i57;
                                                        }
                                                        f160 = f83;
                                                        i64 = i19 + 1;
                                                        i57 = i20;
                                                    }
                                                    long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat12 + f160) << 32) | (Float.floatToRawIntBits(intBitsToFloat13 + f161) & BodyPartID.bodyIdMax);
                                                    f76 = floatValue6;
                                                    list9 = list13;
                                                    f77 = f150;
                                                    f78 = f145;
                                                    f79 = f147;
                                                    i16 = size2;
                                                    i18 = i56;
                                                    i17 = i57;
                                                    f80 = RecyclerView.DECELERATION_RATE;
                                                    fArr = fArr10;
                                                    f82 = f144;
                                                    fArr2 = fArr8;
                                                    f81 = f143;
                                                    DrawScope drawScope10 = drawScope9;
                                                    long j25 = j24;
                                                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope10, j25, f106, floatToRawIntBits3, null, 0, 120);
                                                    j12 = j25;
                                                    drawScope2 = drawScope10;
                                                    if (i63 != i18) {
                                                        i63++;
                                                        drawScope9 = drawScope2;
                                                        j24 = j12;
                                                        i56 = i18;
                                                        i57 = i17;
                                                        f144 = f82;
                                                        f143 = f81;
                                                        fArr10 = fArr;
                                                        floatValue6 = f76;
                                                        list13 = list9;
                                                        fArr8 = fArr2;
                                                        f147 = f79;
                                                        size2 = i16;
                                                        f150 = f77;
                                                        f145 = f78;
                                                    }
                                                }
                                            } else {
                                                list9 = list13;
                                                f76 = floatValue6;
                                                fArr = fArr10;
                                                f77 = f150;
                                                f78 = f145;
                                                f79 = f147;
                                                i16 = size2;
                                                fArr2 = fArr8;
                                                f80 = f159;
                                                i17 = i57;
                                                f81 = f143;
                                                f82 = f144;
                                                i18 = i56;
                                                drawScope2 = drawScope9;
                                                j12 = j24;
                                            }
                                            if (i61 == i17) {
                                                break;
                                            } else {
                                                i61++;
                                                drawScope9 = drawScope2;
                                                j24 = j12;
                                                i56 = i18;
                                                i57 = i17;
                                                f144 = f82;
                                                f159 = f80;
                                                f143 = f81;
                                                fArr10 = fArr;
                                                floatValue6 = f76;
                                                list13 = list9;
                                                fArr8 = fArr2;
                                                f147 = f79;
                                                size2 = i16;
                                                f150 = f77;
                                                f145 = f78;
                                            }
                                        }
                                    }
                                    break;
                                case 5:
                                    RadialLayoutCache radialLayoutCache2 = (RadialLayoutCache) mutableState19.getValue();
                                    if (radialLayoutCache2 != null) {
                                        zzadt.m2017drawDotGridRadialTransitionV9fs2A(drawScope5, f105, f106, f107, ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue(), j18, RangesKt___RangesKt.coerceIn(((ParcelableSnapshotMutableFloatState) mutableFloatState23).getFloatValue() / 2.0f, RecyclerView.DECELERATION_RATE, 1.0f), radialLayoutCache2, f108);
                                        break;
                                    }
                                    break;
                                case 6:
                                    long j26 = j18;
                                    float f168 = RecyclerView.DECELERATION_RATE;
                                    ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue();
                                    float intBitsToFloat16 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() >> 32));
                                    float intBitsToFloat17 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                    RadialPulsingCache radialPulsingCache6 = radialPulsingCache5;
                                    float f169 = radialPulsingCache6.cachedWidth;
                                    float f170 = f38;
                                    if (intBitsToFloat16 == f169 && intBitsToFloat17 == radialPulsingCache6.cachedHeight) {
                                        i21 = 20;
                                        if (20 == radialPulsingCache6.cachedDensity) {
                                            f85 = f170;
                                            DrawScope drawScope11 = drawScope5;
                                            PulsingState pulsingState6 = pulsingState5;
                                            pulsingState6.getClass();
                                            float intBitsToFloat18 = Float.intBitsToFloat((int) (drawScope11.mo753getSizeNHjbRc() >> 32)) / 2.0f;
                                            float intBitsToFloat19 = Float.intBitsToFloat((int) (drawScope11.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
                                            float f171 = pulsingState6.elapsed;
                                            int i65 = (int) (f171 / 2.0f);
                                            int max2 = Math.max(0, i65 - ((int) Math.ceil(2.5d)));
                                            float f172 = f61 * 3.0f;
                                            float f173 = intBitsToFloat19 + f85;
                                            float f174 = f173 - intBitsToFloat19;
                                            float[] fArr11 = radialPulsingCache6.slotX;
                                            float[] fArr12 = radialPulsingCache6.slotY;
                                            float[] fArr13 = radialPulsingCache6.slotOpacity;
                                            float[] fArr14 = radialPulsingCache6.slotDistFromCenter;
                                            i22 = radialPulsingCache6.slotCount;
                                            ArrayList arrayList8 = pulsingState6.payWaveStartTimes;
                                            boolean isEmpty = arrayList8.isEmpty();
                                            i23 = 0;
                                            while (i23 < i22) {
                                                float f175 = fArr11[i23];
                                                float f176 = fArr12[i23];
                                                float f177 = fArr14[i23];
                                                float[] fArr15 = fArr11;
                                                float f178 = f171;
                                                int i66 = i22;
                                                if (max2 <= i65) {
                                                    int i67 = max2;
                                                    f86 = f168;
                                                    while (true) {
                                                        float f179 = f178 - (i67 * 2.0f);
                                                        if (f179 >= f168) {
                                                            float abs = Math.abs(f177 - (f47 * f179));
                                                            float f180 = f48;
                                                            if (abs < f180) {
                                                                float f181 = 1.0f - (abs / f180);
                                                                float f182 = 1.0f - (f179 / 5.0f);
                                                                if (f182 < f168) {
                                                                    f182 = f168;
                                                                }
                                                                f86 = Math.max(f86, f181 * f182);
                                                            }
                                                        }
                                                        if (i67 != i65) {
                                                            i67++;
                                                        }
                                                    }
                                                } else {
                                                    f86 = f168;
                                                }
                                                if (isEmpty) {
                                                    arrayList5 = arrayList8;
                                                    i24 = i65;
                                                    f87 = 1.0f;
                                                    f88 = f175;
                                                    f89 = f168;
                                                } else {
                                                    int size3 = arrayList8.size();
                                                    f88 = f175;
                                                    float f183 = f176;
                                                    int i68 = 0;
                                                    while (i68 < size3) {
                                                        float floatValue9 = f178 - ((Number) arrayList8.get(i68)).floatValue();
                                                        if (floatValue9 < f168 || floatValue9 > 3.0f) {
                                                            arrayList6 = arrayList8;
                                                            i27 = size3;
                                                            i28 = i68;
                                                        } else {
                                                            if (floatValue9 < 1.32f) {
                                                                float f184 = floatValue9 / 1.32f;
                                                                float f185 = f88 - intBitsToFloat18;
                                                                float f186 = f183 - (f173 - (((3.0f - (f184 * 2.0f)) * (f184 * f184)) * f174));
                                                                arrayList6 = arrayList8;
                                                                i27 = size3;
                                                                i28 = i68;
                                                                float sqrt4 = (float) Math.sqrt((f186 * f186) + (f185 * f185));
                                                                if (sqrt4 < f172 && sqrt4 > 0.1f) {
                                                                    float f187 = 1.0f - (sqrt4 / f172);
                                                                    float f188 = f187 * f187 * f62;
                                                                    f88 = ((f185 / sqrt4) * f188) + f88;
                                                                    f183 = ((f186 / sqrt4) * f188 * 0.3f) + f183;
                                                                }
                                                            } else {
                                                                arrayList6 = arrayList8;
                                                                i27 = size3;
                                                                i28 = i68;
                                                            }
                                                            if (floatValue9 < 2.97f) {
                                                                float f189 = floatValue9 / 2.97f;
                                                                float f190 = 1.0f - f189;
                                                                float f191 = 1.0f - (f190 * f190);
                                                                float f192 = f190;
                                                                float f193 = f64;
                                                                i29 = i65;
                                                                float f194 = f63;
                                                                float m = CameraState$Type$EnumUnboxingLocalUtility.m(f193, f194, f191, f194);
                                                                float f195 = f50;
                                                                float f196 = f49;
                                                                float m2 = CameraState$Type$EnumUnboxingLocalUtility.m(f195, f196, f189, f196);
                                                                float f197 = f88 - intBitsToFloat18;
                                                                float f198 = f183 - f173;
                                                                float sqrt5 = (float) Math.sqrt((f198 * f198) + (f197 * f197));
                                                                float abs2 = Math.abs(sqrt5 - m);
                                                                if (abs2 < m2 && sqrt5 > 0.1f) {
                                                                    float f199 = 1.0f - (abs2 / m2);
                                                                    if (f192 < f168) {
                                                                        f192 = f168;
                                                                    }
                                                                    float f200 = f199 * f192 * f51;
                                                                    f88 = ((f197 / sqrt5) * f200) + f88;
                                                                    f183 = ((f198 / sqrt5) * f200) + f183;
                                                                }
                                                                i68 = i28 + 1;
                                                                i65 = i29;
                                                                size3 = i27;
                                                                arrayList8 = arrayList6;
                                                            }
                                                        }
                                                        i29 = i65;
                                                        i68 = i28 + 1;
                                                        i65 = i29;
                                                        size3 = i27;
                                                        arrayList8 = arrayList6;
                                                    }
                                                    arrayList5 = arrayList8;
                                                    i24 = i65;
                                                    float f201 = f88 - f175;
                                                    float f202 = f183 - f176;
                                                    float sqrt6 = ((float) Math.sqrt((f202 * f202) + (f201 * f201))) / f65;
                                                    f87 = 1.0f;
                                                    f89 = Math.min(1.0f, sqrt6);
                                                    f176 = f183;
                                                }
                                                float m$1 = Recorder$$ExternalSyntheticOutline2.m$1(f86, 0.75f, 0.25f, RangesKt___RangesKt.coerceIn(fArr13[i23], f168, f87));
                                                float f203 = f106 * ((f86 * 0.5f) + f87) * ((f89 * 0.5f) + f87);
                                                if (m$1 >= 0.01f) {
                                                    long floatToRawIntBits4 = (Float.floatToRawIntBits(f88) << 32) | (Float.floatToRawIntBits(f176) & BodyPartID.bodyIdMax);
                                                    float f204 = f86;
                                                    long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(m$1, ColorKt.m689lerpjxsXWHM(f86, j26, j19), 14);
                                                    fArr3 = fArr12;
                                                    float f205 = f110;
                                                    i25 = i23;
                                                    j13 = j26;
                                                    drawScope3 = drawScope11;
                                                    i26 = max2;
                                                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope3, m675copywmQWz5c$default3, f203, floatToRawIntBits4, null, 0, 120);
                                                    boolean z7 = z5;
                                                    if (f204 > 0.4f) {
                                                        f91 = f205;
                                                        DotGridKt.m3667drawRgbChromaticAberrationEPk0efs(drawScope3, floatToRawIntBits4, f203, m$1 * f204 * 0.8f, f91, z7);
                                                    } else {
                                                        f91 = f205;
                                                    }
                                                    if (f89 > 0.15f) {
                                                        DotGridKt.m3667drawRgbChromaticAberrationEPk0efs(drawScope3, floatToRawIntBits4, f203, m$1 * f89, f91, z7);
                                                    }
                                                    f90 = f91;
                                                } else {
                                                    i25 = i23;
                                                    fArr3 = fArr12;
                                                    f90 = f110;
                                                    j13 = j26;
                                                    drawScope3 = drawScope11;
                                                    i26 = max2;
                                                }
                                                i23 = i25 + 1;
                                                max2 = i26;
                                                fArr12 = fArr3;
                                                fArr11 = fArr15;
                                                f171 = f178;
                                                i22 = i66;
                                                f110 = f90;
                                                i65 = i24;
                                                j26 = j13;
                                                f168 = RecyclerView.DECELERATION_RATE;
                                                drawScope11 = drawScope3;
                                                arrayList8 = arrayList5;
                                            }
                                            break;
                                        }
                                    } else {
                                        i21 = 20;
                                    }
                                    radialPulsingCache6.cachedWidth = intBitsToFloat16;
                                    radialPulsingCache6.cachedHeight = intBitsToFloat17;
                                    radialPulsingCache6.cachedDensity = i21;
                                    float f206 = intBitsToFloat16 / 2.0f;
                                    float f207 = intBitsToFloat17 / 2.0f;
                                    float min = Math.min(intBitsToFloat16, intBitsToFloat17) / 19.0f;
                                    int m$12 = Fragment$5$$ExternalSyntheticOutline0.m$1(((int) (f206 / min)) + 1, 2, 1, ((((int) (f207 / min)) + 1) * 2) + 1);
                                    f85 = f170;
                                    ArrayList computeRadialPositions$default = DotGridKt.computeRadialPositions$default(f206, f207, f54, f85, f39, m$12);
                                    int min2 = Math.min(computeRadialPositions$default.size(), m$12);
                                    radialPulsingCache6.slotCount = min2;
                                    if (radialPulsingCache6.slotX.length < min2) {
                                        radialPulsingCache6.slotX = new float[min2];
                                        radialPulsingCache6.slotY = new float[min2];
                                        radialPulsingCache6.slotOpacity = new float[min2];
                                        radialPulsingCache6.slotDistFromCenter = new float[min2];
                                    }
                                    int i69 = 0;
                                    while (i69 < min2) {
                                        radialPulsingCache6.slotX[i69] = ((RadialSlot) computeRadialPositions$default.get(i69)).x;
                                        radialPulsingCache6.slotY[i69] = ((RadialSlot) computeRadialPositions$default.get(i69)).y;
                                        radialPulsingCache6.slotOpacity[i69] = ((RadialSlot) computeRadialPositions$default.get(i69)).opacity;
                                        radialPulsingCache6.slotDistFromCenter[i69] = (float) Math.sqrt(CameraState$Type$EnumUnboxingLocalUtility.m(((RadialSlot) computeRadialPositions$default.get(i69)).y, f207, ((RadialSlot) computeRadialPositions$default.get(i69)).y - f207, (((RadialSlot) computeRadialPositions$default.get(i69)).x - f206) * (((RadialSlot) computeRadialPositions$default.get(i69)).x - f206)));
                                        i69++;
                                        drawScope5 = drawScope5;
                                        computeRadialPositions$default = computeRadialPositions$default;
                                    }
                                    DrawScope drawScope112 = drawScope5;
                                    PulsingState pulsingState62 = pulsingState5;
                                    pulsingState62.getClass();
                                    float intBitsToFloat182 = Float.intBitsToFloat((int) (drawScope112.mo753getSizeNHjbRc() >> 32)) / 2.0f;
                                    float intBitsToFloat192 = Float.intBitsToFloat((int) (drawScope112.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
                                    float f1712 = pulsingState62.elapsed;
                                    int i652 = (int) (f1712 / 2.0f);
                                    int max22 = Math.max(0, i652 - ((int) Math.ceil(2.5d)));
                                    float f1722 = f61 * 3.0f;
                                    float f1732 = intBitsToFloat192 + f85;
                                    float f1742 = f1732 - intBitsToFloat192;
                                    float[] fArr112 = radialPulsingCache6.slotX;
                                    float[] fArr122 = radialPulsingCache6.slotY;
                                    float[] fArr132 = radialPulsingCache6.slotOpacity;
                                    float[] fArr142 = radialPulsingCache6.slotDistFromCenter;
                                    i22 = radialPulsingCache6.slotCount;
                                    ArrayList arrayList82 = pulsingState62.payWaveStartTimes;
                                    boolean isEmpty2 = arrayList82.isEmpty();
                                    i23 = 0;
                                    while (i23 < i22) {
                                    }
                                    break;
                                case 7:
                                    float f208 = f106;
                                    float floatValue10 = ((ParcelableSnapshotMutableFloatState) mutableFloatState22).getFloatValue();
                                    float floatValue11 = ((ParcelableSnapshotMutableFloatState) mutableFloatState18).getFloatValue();
                                    float intBitsToFloat20 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() >> 32));
                                    float intBitsToFloat21 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                                    float f209 = intBitsToFloat20 / 2.0f;
                                    float f210 = intBitsToFloat21 / 2.0f;
                                    float gridSpacing4 = DotGridKt.gridSpacing(intBitsToFloat20, intBitsToFloat21, 20);
                                    int i70 = ((int) (f209 / gridSpacing4)) + 1;
                                    int i71 = ((int) (f210 / gridSpacing4)) + 1;
                                    float f211 = floatValue11 - 1.5f;
                                    if (f211 < RecyclerView.DECELERATION_RATE) {
                                        f211 = 0.0f;
                                    }
                                    float f212 = f211 % 3.9f;
                                    float btSymbolBrightness = ExtensionsKt.btSymbolBrightness(f212);
                                    long j27 = j19;
                                    long j28 = j18;
                                    long m689lerpjxsXWHM2 = ColorKt.m689lerpjxsXWHM(btSymbolBrightness, j28, j27);
                                    float m$13 = Recorder$$ExternalSyntheticOutline2.m$1(btSymbolBrightness, 2.0f, 1.0f, f208);
                                    float f213 = btSymbolBrightness * f52;
                                    int i72 = -i71;
                                    if (i72 <= i71) {
                                        while (true) {
                                            int i73 = -i70;
                                            if (i73 <= i70) {
                                                while (true) {
                                                    DrawScope drawScope12 = drawScope5;
                                                    float f214 = i73;
                                                    float f215 = (f214 * gridSpacing4) + f209;
                                                    float f216 = i72;
                                                    float f217 = (f216 * gridSpacing4) + f210;
                                                    float f218 = f214 * f105;
                                                    int i74 = i71;
                                                    float f219 = f216 * f105;
                                                    long j29 = j28;
                                                    float simplex3D = f215 + (DotGridKt.simplex3D(f218, f219, floatValue10) * f107);
                                                    float simplex3D2 = f217 + (DotGridKt.simplex3D(f218, f219, floatValue10 + 100.0f) * f107);
                                                    long packRowCol = DotGridConstantsKt.packRowCol(i72, i73);
                                                    if (DotGridConstantsKt.BLUETOOTH_SYMBOL_OFFSETS.backing.containsKey(Long.valueOf(packRowCol))) {
                                                        i31 = i72;
                                                        float f220 = m$13;
                                                        f93 = floatValue10;
                                                        f96 = gridSpacing4;
                                                        drawScope5 = drawScope12;
                                                        long j30 = m689lerpjxsXWHM2;
                                                        i33 = i74;
                                                        f94 = f209;
                                                        f97 = f210;
                                                        j16 = j27;
                                                        j15 = j29;
                                                        i32 = i73;
                                                        DrawScope.m738drawCircleVaOC9Bg$default(drawScope5, j30, f220, (Float.floatToRawIntBits(simplex3D2 - f213) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(simplex3D) << 32), null, 0, 120);
                                                        j14 = j30;
                                                        f92 = f220;
                                                    } else {
                                                        i31 = i72;
                                                        f92 = m$13;
                                                        i32 = i73;
                                                        f93 = floatValue10;
                                                        f96 = gridSpacing4;
                                                        j14 = m689lerpjxsXWHM2;
                                                        drawScope5 = drawScope12;
                                                        i33 = i74;
                                                        f94 = f209;
                                                        f97 = f210;
                                                        j15 = j29;
                                                        j16 = j27;
                                                        Float f221 = (Float) DotGridConstantsKt.BT_ADJACENT_DOTS.get(Long.valueOf(packRowCol));
                                                        if (f221 != null) {
                                                            float btSymbolBrightness2 = ExtensionsKt.btSymbolBrightness(f212 - (f221.floatValue() * 0.05f)) * (1.0f - (f221.floatValue() / 1.5f)) * 0.5f;
                                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope5, ColorKt.m689lerpjxsXWHM(btSymbolBrightness2, j15, j16), Recorder$$ExternalSyntheticOutline2.m$1(btSymbolBrightness2, 0.29999995f, 1.0f, f208), (Float.floatToRawIntBits(simplex3D) << 32) | (Float.floatToRawIntBits(simplex3D2 - (f57 * btSymbolBrightness2)) & BodyPartID.bodyIdMax), null, 0, 120);
                                                        } else {
                                                            float f222 = f208;
                                                            DrawScope.m738drawCircleVaOC9Bg$default(drawScope5, j15, f222, (Float.floatToRawIntBits(simplex3D) << 32) | (Float.floatToRawIntBits(simplex3D2) & BodyPartID.bodyIdMax), null, 0, 120);
                                                            f95 = f222;
                                                            i34 = i32;
                                                            if (i34 == i70) {
                                                                i73 = i34 + 1;
                                                                j28 = j15;
                                                                j27 = j16;
                                                                f210 = f97;
                                                                i71 = i33;
                                                                floatValue10 = f93;
                                                                i72 = i31;
                                                                gridSpacing4 = f96;
                                                                m689lerpjxsXWHM2 = j14;
                                                                m$13 = f92;
                                                                f208 = f95;
                                                                f209 = f94;
                                                            } else {
                                                                i71 = i33;
                                                                i30 = i31;
                                                            }
                                                        }
                                                    }
                                                    f95 = f208;
                                                    i34 = i32;
                                                    if (i34 == i70) {
                                                    }
                                                }
                                            } else {
                                                f92 = m$13;
                                                f93 = floatValue10;
                                                f94 = f209;
                                                f95 = f208;
                                                f96 = gridSpacing4;
                                                j14 = m689lerpjxsXWHM2;
                                                j15 = j28;
                                                f97 = f210;
                                                j16 = j27;
                                                i30 = i72;
                                            }
                                            if (i30 == i71) {
                                                break;
                                            } else {
                                                i72 = i30 + 1;
                                                j28 = j15;
                                                j27 = j16;
                                                f210 = f97;
                                                floatValue10 = f93;
                                                gridSpacing4 = f96;
                                                m689lerpjxsXWHM2 = j14;
                                                m$13 = f92;
                                                f208 = f95;
                                                f209 = f94;
                                            }
                                        }
                                    }
                                    break;
                                case 8:
                                    float floatValue12 = ((ParcelableSnapshotMutableFloatState) mutableFloatState13).getFloatValue();
                                    float intBitsToFloat22 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() >> 32)) / 2.0f;
                                    float intBitsToFloat23 = Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) / 2.0f;
                                    float gridSpacing5 = DotGridKt.gridSpacing(Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawScope5.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)), 20);
                                    int i75 = ((int) (intBitsToFloat22 / gridSpacing5)) + 1;
                                    int i76 = ((int) (intBitsToFloat23 / gridSpacing5)) + 1;
                                    float f223 = floatValue12 * 4.0f;
                                    float f224 = floatValue12 * 2.0f;
                                    int i77 = -i76;
                                    if (i77 <= i76) {
                                        while (true) {
                                            int i78 = -i75;
                                            if (i78 <= i75) {
                                                while (true) {
                                                    float f225 = i78;
                                                    float f226 = (f225 * gridSpacing5) + intBitsToFloat22;
                                                    float f227 = i77;
                                                    float f228 = (f227 * gridSpacing5) + intBitsToFloat23;
                                                    long packRowCol2 = DotGridConstantsKt.packRowCol(i77, i78);
                                                    DrawScope drawScope13 = drawScope5;
                                                    float f229 = f106;
                                                    boolean containsKey = DotGridConstantsKt.ERROR_X_FILL_OFFSETS.backing.containsKey(Long.valueOf(packRowCol2));
                                                    boolean contains = DotGridConstantsKt.ERROR_X_OUTLINE_OFFSETS.contains(Long.valueOf(packRowCol2));
                                                    if (containsKey || contains) {
                                                        f98 = intBitsToFloat22;
                                                        f99 = gridSpacing5;
                                                        float f230 = f109;
                                                        i35 = i77;
                                                        f102 = intBitsToFloat23;
                                                        i36 = i78;
                                                        float sqrt7 = (i36 == 0 && i35 == 0) ? 0.0f : 1.0f / ((float) Math.sqrt((f227 * f227) + (f225 * f225)));
                                                        float f231 = f225 * sqrt7;
                                                        float f232 = f227 * sqrt7;
                                                        float dotRandom = DotGridKt.dotRandom(i35, i36) * f230 * 3.1415927f;
                                                        float dotRandom2 = DotGridKt.dotRandom(i35 + 100, i36) * f230 * 3.1415927f;
                                                        float f233 = containsKey ? 1.8f : 1.0f;
                                                        f100 = f230;
                                                        float f234 = f59 * f233;
                                                        float f235 = f60 * f233;
                                                        float f236 = f58;
                                                        double d = dotRandom + f223;
                                                        float cos2 = (((float) Math.cos(d)) * f234) + (f231 * f236) + f226;
                                                        float sin = (((float) Math.sin(d)) * f235) + (f232 * f236) + f228;
                                                        drawScope5 = drawScope13;
                                                        j17 = j18;
                                                        f101 = f229;
                                                        DrawScope.m738drawCircleVaOC9Bg$default(drawScope5, j8, Recorder$$ExternalSyntheticOutline2.m$1((float) Math.sin(f224 + dotRandom2), 0.15f, 1.6f, f229), (Float.floatToRawIntBits(sin) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(cos2) << 32), null, 0, 120);
                                                    } else {
                                                        f98 = intBitsToFloat22;
                                                        f99 = gridSpacing5;
                                                        float f237 = f109;
                                                        i35 = i77;
                                                        f102 = intBitsToFloat23;
                                                        i36 = i78;
                                                        drawScope5 = drawScope13;
                                                        long j31 = j18;
                                                        DrawScope.m738drawCircleVaOC9Bg$default(drawScope5, j31, f229, (Float.floatToRawIntBits(f226) << 32) | (Float.floatToRawIntBits(f228) & BodyPartID.bodyIdMax), null, 0, 120);
                                                        j17 = j31;
                                                        f100 = f237;
                                                        f101 = f229;
                                                    }
                                                    if (i36 != i75) {
                                                        i78 = i36 + 1;
                                                        i77 = i35;
                                                        f106 = f101;
                                                        intBitsToFloat23 = f102;
                                                        intBitsToFloat22 = f98;
                                                        gridSpacing5 = f99;
                                                        f109 = f100;
                                                        j18 = j17;
                                                    }
                                                }
                                            } else {
                                                j17 = j18;
                                                f98 = intBitsToFloat22;
                                                f99 = gridSpacing5;
                                                f100 = f109;
                                                f101 = f106;
                                                i35 = i77;
                                                f102 = intBitsToFloat23;
                                            }
                                            if (i35 == i76) {
                                                break;
                                            } else {
                                                i77 = i35 + 1;
                                                f106 = f101;
                                                intBitsToFloat23 = f102;
                                                intBitsToFloat22 = f98;
                                                gridSpacing5 = f99;
                                                f109 = f100;
                                                j18 = j17;
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer = gapComposer;
                gapComposer.updateRememberedValue(rememberedValue25);
            }
            Function1 function13 = (Function1) rememberedValue25;
            onGloballyPositioned.getClass();
            function13.getClass();
            Modifier drawBehind = ClipKt.drawBehind(ColorKt.graphicsLayer(onGloballyPositioned, new OffersHomeQueries$$ExternalSyntheticLambda1(19)), function13);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, drawBehind);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            composableLambdaImpl2 = composableLambdaImpl;
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl2, gapComposer, true);
            i3 = 20;
            f4 = 0.05f;
            f3 = f36;
            list2 = emptyList;
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
            i3 = i;
            f3 = f;
            f4 = f2;
            list2 = list;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(dotGridPhase, z, dotGridPhase2, i3, f3, f4, list2, function1, set, function12, function0, composableLambdaImpl2, i2) { // from class: com.squareup.cash.nearby.views.DotGridKt$$ExternalSyntheticLambda2
                public final /* synthetic */ Set f$10;
                public final /* synthetic */ Function1 f$11;
                public final /* synthetic */ Function0 f$12;
                public final /* synthetic */ ComposableLambdaImpl f$13;
                public final /* synthetic */ DotGridPhase f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ DotGridPhase f$4;
                public final /* synthetic */ int f$5;
                public final /* synthetic */ float f$6;
                public final /* synthetic */ float f$7;
                public final /* synthetic */ List f$8;
                public final /* synthetic */ Function1 f$9;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(805309495);
                    DotGridKt.DotGrid(Modifier.this, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, (Composer) obj7, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final float DotGrid$safeClamp(float f, float f2, float f3) {
        float f4 = f3 - f2;
        return f2 <= f4 ? RangesKt___RangesKt.coerceIn(f, f2, f4) : f3 / 2.0f;
    }

    public static final void NearbyOrderedListsView(NearbyOrderedListsViewModel nearbyOrderedListsViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        nearbyOrderedListsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(34850489);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(nearbyOrderedListsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1037580164, new FakeOverlayLayerKt$$ExternalSyntheticLambda0(15, function1, nearbyOrderedListsViewModel), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(nearbyOrderedListsViewModel, function1, i, 5);
        }
    }

    public static ArrayList computeRadialPositions$default(float f, float f2, float f3, float f4, float f5, int i) {
        float f6 = (f4 - f3) / 9.0f;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= 12 && arrayList.size() >= i) {
                return arrayList;
            }
            int i3 = i2 + 1;
            float f7 = (i3 * f6) + f3;
            double d = 6.283185307179586d;
            int max = Math.max(1, MathKt__MathJVMKt.roundToInt(((float) (f7 * 6.283185307179586d)) / f5));
            float f8 = 1.0f;
            if (i2 >= 9) {
                f8 = 1.0f - ((i2 - 8) / (Math.max(3, r3) + 1));
            }
            int i4 = 0;
            while (i4 < max) {
                double d2 = (float) ((i4 * d) / max);
                arrayList.add(new RadialSlot((((float) Math.cos(d2)) * f7) + f, (((float) Math.sin(d2)) * f7) + f2, f8));
                i4++;
                d = 6.283185307179586d;
            }
            i2 = i3;
        }
    }

    public static final long computeSpreadPosition(List list, float f, float f2) {
        long j;
        char c;
        long j2;
        Float valueOf;
        list.getClass();
        float f3 = 0.15f * f;
        float f4 = 0.12f * f2;
        float f5 = 2.0f;
        long floatToRawIntBits = Float.floatToRawIntBits(f / 2.0f);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2 / 2.0f);
        char c2 = ' ';
        long j3 = BodyPartID.bodyIdMax;
        long j4 = (floatToRawIntBits2 & BodyPartID.bodyIdMax) | (floatToRawIntBits << 32);
        int size = list.size();
        float f6 = -1.0f;
        int i = 0;
        while (i < 30) {
            float dotRandom = (dotRandom(i, size) * (f - (f5 * f3))) + f3;
            float dotRandom2 = (dotRandom(i + 100, size) * (f2 - (f5 * f4))) + f4;
            Iterator it = list.iterator();
            if (it.hasNext()) {
                FrozenPerson frozenPerson = (FrozenPerson) it.next();
                j = j4;
                float intBitsToFloat = dotRandom - Float.intBitsToFloat((int) (frozenPerson.position >> c2));
                float intBitsToFloat2 = dotRandom2 - Float.intBitsToFloat((int) (frozenPerson.position & j3));
                float sqrt = (float) Math.sqrt((intBitsToFloat2 * intBitsToFloat2) + (intBitsToFloat * intBitsToFloat));
                while (it.hasNext()) {
                    FrozenPerson frozenPerson2 = (FrozenPerson) it.next();
                    char c3 = c2;
                    long j5 = j3;
                    float intBitsToFloat3 = dotRandom - Float.intBitsToFloat((int) (frozenPerson2.position >> c3));
                    float intBitsToFloat4 = dotRandom2 - Float.intBitsToFloat((int) (frozenPerson2.position & j5));
                    sqrt = Math.min(sqrt, (float) Math.sqrt((intBitsToFloat4 * intBitsToFloat4) + (intBitsToFloat3 * intBitsToFloat3)));
                    c2 = c3;
                    j3 = j5;
                }
                c = c2;
                j2 = j3;
                valueOf = Float.valueOf(sqrt);
            } else {
                valueOf = null;
                j = j4;
                c = c2;
                j2 = j3;
            }
            float floatValue = valueOf != null ? valueOf.floatValue() : Float.MAX_VALUE;
            if (floatValue > f6) {
                j = (Float.floatToRawIntBits(dotRandom) << c) | (Float.floatToRawIntBits(dotRandom2) & j2);
                f6 = floatValue;
            }
            i++;
            c2 = c;
            j4 = j;
            j3 = j2;
            f5 = 2.0f;
        }
        return j4;
    }

    public static final float dot3(float f, float f2, float f3, float[] fArr) {
        return (fArr[2] * f3) + (fArr[1] * f2) + (fArr[0] * f);
    }

    public static final float dotRandom(int i, int i2) {
        int i3 = (i2 * 668265263) + (i * 374761393);
        int i4 = ((i3 >>> 13) ^ i3) * 1274126177;
        return ((i4 ^ (i4 >>> 16)) & Integer.MAX_VALUE) / 2.1474836E9f;
    }

    /* renamed from: drawRgbChromaticAberration-EPk0efs, reason: not valid java name */
    public static final void m3667drawRgbChromaticAberrationEPk0efs(DrawScope drawScope, long j, float f, float f2, float f3, boolean z) {
        drawScope.getClass();
        if (z) {
            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(f2, Color.Red, 14);
            int i = (int) (j >> 32);
            float intBitsToFloat = Float.intBitsToFloat(i) - f3;
            int i2 = (int) (j & BodyPartID.bodyIdMax);
            float intBitsToFloat2 = Float.intBitsToFloat(i2);
            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, m675copywmQWz5c$default, f, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax), null, 12, 56);
            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(f2, Color.Green, 14), f, j, null, 12, 56);
            long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(f2, Color.Blue, 14);
            float intBitsToFloat3 = Float.intBitsToFloat(i) + f3;
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            DrawScope.m738drawCircleVaOC9Bg$default(drawScope, m675copywmQWz5c$default2, f, (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax), null, 12, 56);
            return;
        }
        long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(f2, Color.Cyan, 14);
        int i3 = (int) (j >> 32);
        float intBitsToFloat5 = Float.intBitsToFloat(i3) - f3;
        int i4 = (int) (j & BodyPartID.bodyIdMax);
        float intBitsToFloat6 = Float.intBitsToFloat(i4);
        DrawScope.m738drawCircleVaOC9Bg$default(drawScope, m675copywmQWz5c$default3, f, (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & BodyPartID.bodyIdMax), null, 24, 56);
        DrawScope.m738drawCircleVaOC9Bg$default(drawScope, Color.m675copywmQWz5c$default(f2, Color.Magenta, 14), f, j, null, 24, 56);
        long m675copywmQWz5c$default4 = Color.m675copywmQWz5c$default(f2, Color.Yellow, 14);
        float intBitsToFloat7 = Float.intBitsToFloat(i3) + f3;
        float intBitsToFloat8 = Float.intBitsToFloat(i4);
        DrawScope.m738drawCircleVaOC9Bg$default(drawScope, m675copywmQWz5c$default4, f, (Float.floatToRawIntBits(intBitsToFloat7) << 32) | (Float.floatToRawIntBits(intBitsToFloat8) & BodyPartID.bodyIdMax), null, 24, 56);
    }

    public static final float gridSpacing(float f, float f2, int i) {
        float min = Math.min(f, f2);
        return i > 1 ? min / (i - 1) : min;
    }

    public static final float lerp(float f, float f2, float f3) {
        return CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f);
    }

    public static final long noiseDrift(float f, float f2, float f3, int i, int i2) {
        float f4 = i * f;
        float f5 = i2 * f;
        float simplex3D = simplex3D(f4, f5, f2) * f3;
        float simplex3D2 = simplex3D(f4, f5, f2 + 100.0f) * f3;
        return (Float.floatToRawIntBits(simplex3D2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(simplex3D) << 32);
    }

    public static final float simplex3D(float f, float f2, float f3) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f4;
        float dot3;
        float dot32;
        float dot33;
        float f5 = (f + f2 + f3) * 0.33333334f;
        float f6 = f + f5;
        int i6 = (int) f6;
        if (f6 < i6) {
            i6--;
        }
        float f7 = f2 + f5;
        int i7 = (int) f7;
        if (f7 < i7) {
            i7--;
        }
        float f8 = f3 + f5;
        int i8 = (int) f8;
        if (f8 < i8) {
            i8--;
        }
        float f9 = (i6 + i7 + i8) * 0.16666667f;
        float f10 = f - (i6 - f9);
        float f11 = f2 - (i7 - f9);
        float f12 = f3 - (i8 - f9);
        int i9 = 0;
        if (f10 < f11) {
            if (f11 < f12) {
                i3 = 0;
                i4 = 0;
                i = 1;
            } else if (f10 < f12) {
                i = 0;
                i4 = 0;
                i3 = 1;
            } else {
                i = 0;
                i2 = 0;
                i3 = 1;
                i4 = 1;
                i5 = 1;
            }
            i5 = 1;
            i2 = 1;
        } else if (f11 >= f12) {
            i3 = 0;
            i = 0;
            i2 = 0;
            i9 = 1;
            i4 = 1;
            i5 = 1;
        } else {
            if (f10 >= f12) {
                i3 = 0;
                i = 0;
                i5 = 0;
                i9 = 1;
            } else {
                i3 = 0;
                i5 = 0;
                i = 1;
            }
            i4 = 1;
            i2 = 1;
        }
        float f13 = (f10 - i9) + 0.16666667f;
        float f14 = (f11 - i3) + 0.16666667f;
        float f15 = (f12 - i) + 0.16666667f;
        float f16 = (f10 - i4) + 0.33333334f;
        int i10 = i3;
        float f17 = (f11 - i5) + 0.33333334f;
        int i11 = i9;
        float f18 = (f12 - i2) + 0.33333334f;
        int i12 = i;
        float f19 = (f10 - 1.0f) + 0.5f;
        int i13 = i4;
        float f20 = (f11 - 1.0f) + 0.5f;
        int i14 = i5;
        float f21 = (f12 - 1.0f) + 0.5f;
        int i15 = i6 & 255;
        int i16 = i7 & 255;
        int i17 = i8 & 255;
        int[] iArr = DotGridConstantsKt.PERM_MOD12;
        int[] iArr2 = DotGridConstantsKt.PERM_TABLE;
        int i18 = iArr[i15 + iArr2[i16 + iArr2[i17]]];
        int i19 = iArr[i15 + i11 + iArr2[i16 + i10 + iArr2[i17 + i12]]];
        int i20 = iArr[i15 + i13 + iArr2[i16 + i14 + iArr2[i2 + i17]]];
        int i21 = iArr[i15 + 1 + iArr2[i16 + 1 + iArr2[i17 + 1]]];
        float f22 = ((0.6f - (f10 * f10)) - (f11 * f11)) - (f12 * f12);
        float f23 = RecyclerView.DECELERATION_RATE;
        if (f22 < RecyclerView.DECELERATION_RATE) {
            f4 = 0.6f;
            dot3 = 0.0f;
        } else {
            float f24 = f22 * f22;
            f4 = 0.6f;
            dot3 = dot3(f10, f11, f12, DotGridConstantsKt.GRAD3[i18]) * f24 * f24;
        }
        float f25 = ((f4 - (f13 * f13)) - (f14 * f14)) - (f15 * f15);
        if (f25 < RecyclerView.DECELERATION_RATE) {
            dot32 = 0.0f;
        } else {
            float f26 = f25 * f25;
            dot32 = dot3(f13, f14, f15, DotGridConstantsKt.GRAD3[i19]) * f26 * f26;
        }
        float f27 = ((f4 - (f16 * f16)) - (f17 * f17)) - (f18 * f18);
        if (f27 < RecyclerView.DECELERATION_RATE) {
            dot33 = 0.0f;
        } else {
            float f28 = f27 * f27;
            dot33 = dot3(f16, f17, f18, DotGridConstantsKt.GRAD3[i20]) * f28 * f28;
        }
        float f29 = ((f4 - (f19 * f19)) - (f20 * f20)) - (f21 * f21);
        if (f29 >= RecyclerView.DECELERATION_RATE) {
            float f30 = f29 * f29;
            f23 = dot3(f19, f20, f21, DotGridConstantsKt.GRAD3[i21]) * f30 * f30;
        }
        return (dot3 + dot32 + dot33 + f23) * 32.0f;
    }

    public static final float smoothstep(float f, float f2, float f3) {
        float coerceIn = RangesKt___RangesKt.coerceIn((f3 - f) / (f2 - f), RecyclerView.DECELERATION_RATE, 1.0f);
        return (3.0f - (coerceIn * 2.0f)) * coerceIn * coerceIn;
    }
}
