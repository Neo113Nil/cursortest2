package com.google.android.gms.internal.mlkit_genai_prompt;

import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaer;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.offers.viewmodels.itemviewmodels.ClusterItem;
import com.squareup.cash.offers.viewmodels.itemviewmodels.InfoTileViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEvent;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.views.home.collectionCluster.ItemDirection;
import com.squareup.cash.offers.views.home.collectionCluster.ThreeOfferClusterSize;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzaer {
    public static final Recorder.AnonymousClass4 ShadowContext() {
        return new Recorder.AnonymousClass4(18, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThreeOffersCluster(final OffersHomeListItemViewModel.ClusterSection clusterSection, final Modifier modifier, final Function1 function1, final ThreeOfferClusterSize threeOfferClusterSize, Composer composer, final int i) {
        final Function1 function12;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Object obj;
        OffersHomeListItemViewModel.ClusterSection clusterSection2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        final Function1 function13;
        boolean changed;
        Object rememberedValue;
        final int i2;
        GapComposer gapComposer2;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        Object rememberedValue3;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1038083742);
        Applier applier = gapComposer3.applier;
        int i3 = i | (gapComposer3.changed(clusterSection) ? 4 : 2) | (gapComposer3.changed(modifier) ? 32 : 16) | (gapComposer3.changedInstance(function1) ? 256 : 128) | (gapComposer3.changed(threeOfferClusterSize) ? 2048 : 1024);
        if (gapComposer3.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            gapComposer3.startDefaults();
            if ((i & 1) != 0 && !gapComposer3.getDefaultsInvalid()) {
                gapComposer3.skipToGroupEnd();
            }
            gapComposer3.endDefaults();
            if (clusterSection.getOffersList().size() < 3) {
                endRestartGroup = gapComposer3.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    function2 = new Function2(clusterSection, modifier, function1, threeOfferClusterSize, i, i4) { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ OffersHomeListItemViewModel.ClusterSection f$0;
                        public final /* synthetic */ Modifier f$1;
                        public final /* synthetic */ Function1 f$2;
                        public final /* synthetic */ ThreeOfferClusterSize f$3;

                        {
                            this.$r8$classId = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(1);
                                    zzaer.ThreeOffersCluster(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj2, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(1);
                                    zzaer.ThreeOffersCluster(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj2, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            String browseFlowToken = clusterSection.getBrowseFlowToken();
            int i5 = i3 & 14;
            int i6 = i3 & 896;
            boolean z = (i5 == 4) | (i6 == 256);
            Object rememberedValue4 = gapComposer3.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            Continuation continuation = null;
            int i7 = 6;
            if (z || rememberedValue4 == obj2) {
                rememberedValue4 = new MainPaymentView$Content$2$1(clusterSection, function1, continuation, i7);
                gapComposer3.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer3, browseFlowToken, (Function2) rememberedValue4);
            Modifier testTag = TestTagKt.testTag(SizeKt.fillMaxWidth(modifier, 1.0f), "OffersCluster");
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.Top, gapComposer3, 6);
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, testTag);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$15);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$16);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer3, 6);
            int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, companion);
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function0);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$15, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$16);
            float f = threeOfferClusterSize.itemWidth;
            float f2 = threeOfferClusterSize.smallCollectionItemHeight;
            Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f);
            InfoTileViewModel infoItem = clusterSection.getInfoItem();
            boolean z2 = (i5 == 4) | (i6 == 256);
            Object rememberedValue5 = gapComposer3.rememberedValue();
            if (z2) {
                obj = obj2;
            } else {
                obj = obj2;
                if (rememberedValue5 != obj) {
                    clusterSection2 = clusterSection;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                    function13 = function1;
                    BitmapPainterKt.InfoCollectionItem(m277height3ABfNKs, infoItem, (Function0) rememberedValue5, gapComposer3, 0);
                    gapComposer3.startReplaceGroup(249411410);
                    final ClusterItem clusterItem = (ClusterItem) clusterSection2.getOffersList().get(2);
                    Modifier m277height3ABfNKs2 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f2);
                    changed = (i6 != 256) | gapComposer3.changed(clusterItem);
                    rememberedValue = gapComposer3.rememberedValue();
                    if (!changed || rememberedValue == obj) {
                        i2 = 0;
                        rememberedValue = new Function0() { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i2;
                                ClusterItem clusterItem2 = clusterItem;
                                Function1 function14 = function13;
                                switch (i8) {
                                    case 0:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem2.getActionUrl(), clusterItem2.getItemToken(), clusterItem2.getTapEventSpecs()));
                                        break;
                                    case 1:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem2.getActionUrl(), clusterItem2.getItemToken(), clusterItem2.getTapEventSpecs()));
                                        break;
                                    default:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem2.getActionUrl(), clusterItem2.getItemToken(), clusterItem2.getTapEventSpecs()));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue);
                    } else {
                        i2 = 0;
                    }
                    boolean z3 = i2;
                    gapComposer2 = gapComposer3;
                    Object obj3 = obj;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$1;
                    TileMode.CollectionItem(m277height3ABfNKs2, clusterItem, null, (Function0) rememberedValue, gapComposer2, 0, 4);
                    gapComposer2.end(z3);
                    gapComposer2.end(true);
                    ProvidableCompositionLocal providableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 8.0f));
                    ((DefaultSizes) gapComposer2.consume(providableCompositionLocal)).getClass();
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer2, 0);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.useNode();
                    } else {
                        gapComposer2.createNode(function0);
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$17);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$12);
                    gapComposer2.startReplaceGroup(1049897339);
                    final ClusterItem clusterItem2 = (ClusterItem) clusterSection.getOffersList().get(1);
                    Modifier m277height3ABfNKs3 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f2);
                    changed2 = (i6 != 256) | gapComposer2.changed(clusterItem2);
                    rememberedValue2 = gapComposer2.rememberedValue();
                    if (!changed2 || rememberedValue2 == obj3) {
                        function12 = function1;
                        final int i8 = 1;
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i82 = i8;
                                ClusterItem clusterItem22 = clusterItem2;
                                Function1 function14 = function12;
                                switch (i82) {
                                    case 0:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                                        break;
                                    case 1:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                                        break;
                                    default:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    } else {
                        function12 = function1;
                    }
                    TileMode.CollectionItem(m277height3ABfNKs3, clusterItem2, null, (Function0) rememberedValue2, gapComposer2, 0, 4);
                    gapComposer2.end(false);
                    gapComposer2.startReplaceGroup(1049912300);
                    final ClusterItem clusterItem3 = (ClusterItem) clusterSection.getOffersList().get(0);
                    Modifier testTag2 = TestTagKt.testTag(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f), "LargeOfferTile");
                    ItemDirection itemDirection = ItemDirection.Vertical;
                    changed3 = gapComposer2.changed(clusterItem3) | (i6 != 256);
                    rememberedValue3 = gapComposer2.rememberedValue();
                    if (!changed3 || rememberedValue3 == obj3) {
                        final int i9 = 2;
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i82 = i9;
                                ClusterItem clusterItem22 = clusterItem3;
                                Function1 function14 = function12;
                                switch (i82) {
                                    case 0:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                                        break;
                                    case 1:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                                        break;
                                    default:
                                        function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    TileMode.CollectionItem(testTag2, clusterItem3, itemDirection, (Function0) rememberedValue3, gapComposer2, MLKEMEngine.KyberPolyBytes, 0);
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer2, false, true, true);
                    gapComposer = gapComposer2;
                }
            }
            clusterSection2 = clusterSection;
            composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$14;
            composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
            function13 = function1;
            rememberedValue5 = new OffersHomeV2Kt$$ExternalSyntheticLambda7(6, function13, clusterSection2);
            gapComposer3.updateRememberedValue(rememberedValue5);
            BitmapPainterKt.InfoCollectionItem(m277height3ABfNKs, infoItem, (Function0) rememberedValue5, gapComposer3, 0);
            gapComposer3.startReplaceGroup(249411410);
            final ClusterItem clusterItem4 = (ClusterItem) clusterSection2.getOffersList().get(2);
            Modifier m277height3ABfNKs22 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f2);
            changed = (i6 != 256) | gapComposer3.changed(clusterItem4);
            rememberedValue = gapComposer3.rememberedValue();
            if (changed) {
            }
            i2 = 0;
            rememberedValue = new Function0() { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i82 = i2;
                    ClusterItem clusterItem22 = clusterItem4;
                    Function1 function14 = function13;
                    switch (i82) {
                        case 0:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                            break;
                        case 1:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                            break;
                        default:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem22.getActionUrl(), clusterItem22.getItemToken(), clusterItem22.getTapEventSpecs()));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer3.updateRememberedValue(rememberedValue);
            boolean z32 = i2;
            gapComposer2 = gapComposer3;
            Object obj32 = obj;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$172 = composeUiNode$Companion$SetModifier$1;
            TileMode.CollectionItem(m277height3ABfNKs22, clusterItem4, null, (Function0) rememberedValue, gapComposer2, 0, 4);
            gapComposer2.end(z32);
            gapComposer2.end(true);
            ProvidableCompositionLocal providableCompositionLocal2 = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal2)).getClass();
            DefaultSizes.spacing.getClass();
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 8.0f));
            ((DefaultSizes) gapComposer2.consume(providableCompositionLocal2)).getClass();
            ColumnMeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer2, 0);
            int hashCode32 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope32 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier32 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy22, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope32, composeUiNode$Companion$SetModifier$172);
            Recorder$$ExternalSyntheticOutline2.m(hashCode32, gapComposer2, composeUiNode$Companion$SetModifier$15, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier32, composeUiNode$Companion$SetModifier$12);
            gapComposer2.startReplaceGroup(1049897339);
            final ClusterItem clusterItem22 = (ClusterItem) clusterSection.getOffersList().get(1);
            Modifier m277height3ABfNKs32 = SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f2);
            changed2 = (i6 != 256) | gapComposer2.changed(clusterItem22);
            rememberedValue2 = gapComposer2.rememberedValue();
            if (changed2) {
            }
            function12 = function1;
            final int i82 = 1;
            rememberedValue2 = new Function0() { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i822 = i82;
                    ClusterItem clusterItem222 = clusterItem22;
                    Function1 function14 = function12;
                    switch (i822) {
                        case 0:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem222.getActionUrl(), clusterItem222.getItemToken(), clusterItem222.getTapEventSpecs()));
                            break;
                        case 1:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem222.getActionUrl(), clusterItem222.getItemToken(), clusterItem222.getTapEventSpecs()));
                            break;
                        default:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem222.getActionUrl(), clusterItem222.getItemToken(), clusterItem222.getTapEventSpecs()));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer2.updateRememberedValue(rememberedValue2);
            TileMode.CollectionItem(m277height3ABfNKs32, clusterItem22, null, (Function0) rememberedValue2, gapComposer2, 0, 4);
            gapComposer2.end(false);
            gapComposer2.startReplaceGroup(1049912300);
            final ClusterItem clusterItem32 = (ClusterItem) clusterSection.getOffersList().get(0);
            Modifier testTag22 = TestTagKt.testTag(SizeKt.m277height3ABfNKs(SizeKt.m290width3ABfNKs(companion, f), f), "LargeOfferTile");
            ItemDirection itemDirection2 = ItemDirection.Vertical;
            changed3 = gapComposer2.changed(clusterItem32) | (i6 != 256);
            rememberedValue3 = gapComposer2.rememberedValue();
            if (!changed3) {
            }
            final int i92 = 2;
            rememberedValue3 = new Function0() { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i822 = i92;
                    ClusterItem clusterItem222 = clusterItem32;
                    Function1 function14 = function12;
                    switch (i822) {
                        case 0:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem222.getActionUrl(), clusterItem222.getItemToken(), clusterItem222.getTapEventSpecs()));
                            break;
                        case 1:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem222.getActionUrl(), clusterItem222.getItemToken(), clusterItem222.getTapEventSpecs()));
                            break;
                        default:
                            function14.invoke(new OffersHomeViewEvent.OffersClusterItemClicked(clusterItem222.getActionUrl(), clusterItem222.getItemToken(), clusterItem222.getTapEventSpecs()));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer2.updateRememberedValue(rememberedValue3);
            TileMode.CollectionItem(testTag22, clusterItem32, itemDirection2, (Function0) rememberedValue3, gapComposer2, MLKEMEngine.KyberPolyBytes, 0);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer2, false, true, true);
            gapComposer = gapComposer2;
        } else {
            GapComposer gapComposer4 = gapComposer3;
            function12 = function1;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i10 = 1;
            final Function1 function14 = function12;
            function2 = new Function2(clusterSection, modifier, function14, threeOfferClusterSize, i, i10) { // from class: com.squareup.cash.offers.views.home.collectionCluster.ThreeOffersClusterKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ OffersHomeListItemViewModel.ClusterSection f$0;
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ Function1 f$2;
                public final /* synthetic */ ThreeOfferClusterSize f$3;

                {
                    this.$r8$classId = i10;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj33) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj33).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(1);
                            zzaer.ThreeOffersCluster(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj22, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj33).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(1);
                            zzaer.ThreeOffersCluster(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj22, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final String accessibleBitcoinText(String str, Composer composer) {
        str.getClass();
        if (!StringsKt.contains((CharSequence) str, (CharSequence) "₿", false)) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(1229131271);
            gapComposer.end(false);
            return str;
        }
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(1228970164);
        String stringResource = Room.stringResource(gapComposer2, R.string.bitcoin_views_bitcoin_symbol_description);
        String obj = StringsKt.trim(StringsKt.trim(StringsKt__StringsJVMKt.replace$default(str, "₿", "")).toString() + " " + stringResource).toString();
        gapComposer2.end(false);
        return obj;
    }
}
