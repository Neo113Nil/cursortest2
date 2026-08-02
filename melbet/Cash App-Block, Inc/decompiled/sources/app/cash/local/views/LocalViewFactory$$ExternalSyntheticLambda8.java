package app.cash.local.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.viewmodels.map.BrandCollectionMapViewModel;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.map.BrandCollectionMapViewKt;
import app.cash.local.views.map.BrandCollectionMapViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.map.BrandCollectionSheetViewKt;
import app.cash.local.views.map.BrandSheetViewKt;
import app.cash.local.views.map.LocalMapPinKt;
import app.cash.local.views.map.LocationClusterItem;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.views.CashMapViewKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalViewFactory$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ BrandCollectionMapViewModel f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda8(Modifier modifier, BrandCollectionMapViewModel brandCollectionMapViewModel, Function1 function1, int i) {
        this.$r8$classId = 2;
        this.f$0 = modifier;
        this.f$1 = brandCollectionMapViewModel;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function1 function1;
        int i = this.$r8$classId;
        Function1 function12 = this.f$2;
        BrandCollectionMapViewModel brandCollectionMapViewModel = this.f$1;
        Modifier modifier = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    BrandCollectionMapViewKt.BrandCollectionMapView(modifier, brandCollectionMapViewModel, function12, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                boolean shouldExecute = gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = gapComposer2.applier;
                if (shouldExecute) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors.semantic.background.f1047app;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier systemBarsPadding = SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, j, rectangleShapeKt$RectangleShape$1));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, systemBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1745788333, new CartBannerViewKt$$ExternalSyntheticLambda2(brandCollectionMapViewModel, 11), gapComposer2);
                    NavigationType navigationType = NavigationType.BACK;
                    Function1 function13 = this.f$2;
                    boolean changed = gapComposer2.changed(function13);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    Object obj3 = Composer.Companion.Empty;
                    if (changed || rememberedValue == obj3) {
                        rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(29, function13);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    DBUtil.TitleBarSub(rememberComposableLambda, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, gapComposer2, 54, 108);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SizeKt.fillMaxWidth(companion, 1.0f), true);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    UiCallbackModel uiCallbackModel = brandCollectionMapViewModel.cashMapUiCallbackModel;
                    if (uiCallbackModel == null) {
                        gapComposer2.startReplaceGroup(-458492111);
                        gapComposer2.end(false);
                        function1 = function13;
                    } else {
                        gapComposer2.startReplaceGroup(-458492110);
                        Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                        Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors2.semantic.background.subtle, rectangleShapeKt$RectangleShape$1);
                        CashMapViewModel cashMapViewModel = (CashMapViewModel) uiCallbackModel.model;
                        List list = brandCollectionMapViewModel.locations;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new LocationClusterItem((BrandCollectionMapViewModel.Location) it.next()));
                        }
                        Function1 function14 = uiCallbackModel.onEvent;
                        ComposableLambdaImpl composableLambdaImpl = LocalMapPinKt.f51lambda$1120212204;
                        ComposableLambdaImpl composableLambdaImpl2 = LocalMapPinKt.f52lambda$1786935808;
                        Object rememberedValue2 = gapComposer2.rememberedValue();
                        if (rememberedValue2 == obj3) {
                            rememberedValue2 = new Yoga$$ExternalSyntheticLambda0(8);
                            gapComposer2.updateRememberedValue(rememberedValue2);
                        }
                        Function1 function15 = (Function1) rememberedValue2;
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        if (rememberedValue3 == obj3) {
                            rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda10(7);
                            gapComposer2.updateRememberedValue(rememberedValue3);
                        }
                        function1 = function13;
                        CashMapViewKt.CashMapView(m177backgroundbw27NRU, arrayList, cashMapViewModel, composableLambdaImpl, composableLambdaImpl2, function15, (Function2) rememberedValue3, null, LocalMapPinKt.lambda$1548716539, Expect_jvmKt.rememberComposableLambda(1166485415, new BrandCollectionMapViewKt$$ExternalSyntheticLambda6(0, brandCollectionMapViewModel, function1), gapComposer2), null, false, false, function14, gapComposer2, 819683328, 6, 14600);
                        gapComposer2 = gapComposer2;
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                    gapComposer2.end(true);
                    TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE("", 0L, gapComposer2, 6, 2);
                    BrandCollectionMapViewModel.Sheet sheet = brandCollectionMapViewModel.sheet;
                    if (sheet == null) {
                        gapComposer2.startReplaceGroup(-1269302504);
                        gapComposer2.end(false);
                    } else {
                        boolean z = false;
                        gapComposer2.startReplaceGroup(-1269302503);
                        if (sheet instanceof BrandCollectionMapViewModel.Sheet.Brand) {
                            gapComposer2.startReplaceGroup(1181649724);
                            BrandSheetViewKt.BrandSheetView(null, ((BrandCollectionMapViewModel.Sheet.Brand) sheet).location, function1, gapComposer2, 0);
                            gapComposer2.end(false);
                        } else {
                            if (!(sheet instanceof BrandCollectionMapViewModel.Sheet.BrandCollection)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1146495336, false);
                            }
                            gapComposer2.startReplaceGroup(1181767679);
                            BrandCollectionSheetViewKt.BrandCollectionSheetView(((BrandCollectionMapViewModel.Sheet.BrandCollection) sheet).model, function1, m382rememberTextFieldStateLepunE, false, gapComposer2, 0, 8);
                            z = false;
                            gapComposer2.end(false);
                        }
                        gapComposer2.end(z);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                BrandCollectionMapViewKt.BrandCollectionMapView(modifier, brandCollectionMapViewModel, function12, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalViewFactory$$ExternalSyntheticLambda8(Modifier modifier, BrandCollectionMapViewModel brandCollectionMapViewModel, Function1 function1, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = modifier;
        this.f$1 = brandCollectionMapViewModel;
        this.f$2 = function1;
    }
}
