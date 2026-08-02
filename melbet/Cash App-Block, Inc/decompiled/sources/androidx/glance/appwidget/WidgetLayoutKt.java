package androidx.glance.appwidget;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.glance.Emittable;
import androidx.glance.EmittableImage;
import androidx.glance.EmittableWithChildren;
import androidx.glance.appwidget.proto.LayoutProto$ContentScale;
import androidx.glance.appwidget.proto.LayoutProto$DimensionType;
import androidx.glance.appwidget.proto.LayoutProto$HorizontalAlignment;
import androidx.glance.appwidget.proto.LayoutProto$LayoutNode;
import androidx.glance.appwidget.proto.LayoutProto$LayoutType;
import androidx.glance.appwidget.proto.LayoutProto$VerticalAlignment;
import androidx.glance.appwidget.protobuf.TextFormatEscaper;
import androidx.glance.appwidget.protobuf.Utf8;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ContentScale;
import androidx.glance.layout.EmittableBox;
import androidx.glance.layout.EmittableColumn;
import androidx.glance.layout.EmittableSpacer;
import androidx.glance.layout.HeightModifier;
import androidx.glance.layout.WidthModifier;
import androidx.glance.text.EmittableText;
import androidx.glance.unit.Dimension;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.sharesheet.ShareSheetPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.sheet.ComposeBottomSheetKt;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.stablecoin.viewmodels.StablecoinHomeViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeBalanceWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeDisclosuresWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinHomeWidgetViewModel;
import com.squareup.cash.stablecoin.viewmodels.widgets.StablecoinWelcomeWidgetViewModel;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda3;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.util.compose.LifecycleKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class WidgetLayoutKt {
    public static final void AppletContent(int i, Composer composer, Modifier modifier, ArrayList arrayList) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2126421130);
        int i2 = (gapComposer.changedInstance(arrayList) ? 4 : 2) | i | 48;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            modifier = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(SizeKt.fillMaxSize(modifier, 1.0f), ImageKt.rememberScrollState(gapComposer), false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1595801932);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                UiCallbackModel uiCallbackModel = (UiCallbackModel) it.next();
                StablecoinHomeWidgetViewModel stablecoinHomeWidgetViewModel = (StablecoinHomeWidgetViewModel) uiCallbackModel.model;
                if (stablecoinHomeWidgetViewModel != null) {
                    if (stablecoinHomeWidgetViewModel instanceof StablecoinWelcomeWidgetViewModel) {
                        gapComposer.startReplaceGroup(-423595473);
                        ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(285595172, new SheetKt$$ExternalSyntheticLambda6(stablecoinHomeWidgetViewModel, 15), gapComposer), gapComposer, 3072, 7);
                        gapComposer.end(false);
                    } else if (stablecoinHomeWidgetViewModel instanceof StablecoinHomeBalanceWidgetViewModel) {
                        gapComposer.startReplaceGroup(1233265709);
                        TextFormatEscaper.StablecoinBalanceWidget((StablecoinHomeBalanceWidgetViewModel) stablecoinHomeWidgetViewModel, null, gapComposer, 0);
                        gapComposer.end(false);
                    } else {
                        if (!(stablecoinHomeWidgetViewModel instanceof StablecoinHomeDisclosuresWidgetViewModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1233260220, false);
                        }
                        gapComposer.startReplaceGroup(-423364244);
                        SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new PaddingValuesImpl(16.0f, 20.0f, 16.0f, 20.0f);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Function1 function1 = uiCallbackModel.onEvent;
                        function1.getClass();
                        TypeIntrinsics.beforeCheckcastToFunctionOfArity(1, function1);
                        Utf8.DecodeUtil.StablecoinDisclosureWidget((StablecoinHomeDisclosuresWidgetViewModel) stablecoinHomeWidgetViewModel, function1, (PaddingValues) rememberedValue, null, gapComposer, MLKEMEngine.KyberPolyBytes);
                        gapComposer.end(false);
                    }
                }
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StablecoinHomeViewKt$$ExternalSyntheticLambda7(arrayList, modifier, i, i3);
        }
    }

    public static final void HomeContent(StablecoinHomeViewModel stablecoinHomeViewModel, RealImageLoader realImageLoader, Modifier modifier, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-691081485);
        int i2 = i | (gapComposer.changedInstance(stablecoinHomeViewModel) ? 4 : 2) | (gapComposer.changedInstance(realImageLoader) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(stablecoinHomeViewModel instanceof StablecoinHomeViewModel.NullStateCarousel ? (StablecoinHomeViewModel.NullStateCarousel) stablecoinHomeViewModel : null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (Intrinsics.areEqual(stablecoinHomeViewModel, StablecoinHomeViewModel.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(608684585);
                LoadingContent(null, gapComposer, 0);
                gapComposer.end(false);
            } else if (stablecoinHomeViewModel instanceof StablecoinHomeViewModel.AppletState) {
                gapComposer.startReplaceGroup(1689394555);
                AppletContent(0, gapComposer, null, ((StablecoinHomeViewModel.AppletState) stablecoinHomeViewModel).widgets);
                gapComposer.end(false);
            } else {
                if (!(stablecoinHomeViewModel instanceof StablecoinHomeViewModel.NullStateCarousel)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 608683749, false);
                }
                gapComposer.startReplaceGroup(1689471962);
                gapComposer.end(false);
            }
            mutableState.setValue(stablecoinHomeViewModel instanceof StablecoinHomeViewModel.NullStateCarousel ? (StablecoinHomeViewModel.NullStateCarousel) stablecoinHomeViewModel : null);
            StablecoinHomeViewModel.NullStateCarousel nullStateCarousel = (StablecoinHomeViewModel.NullStateCarousel) mutableState.getValue();
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new OverlayKt$$ExternalSyntheticLambda1(20, mutableState);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ComposeBottomSheetKt.BottomSheet(null, nullStateCarousel, (Function0) rememberedValue2, false, true, 0, null, null, Expect_jvmKt.rememberComposableLambda(622299662, new TabToolbarsKt$$ExternalSyntheticLambda3(3, function1, realImageLoader), gapComposer), gapComposer, 100688256, EnumC0170g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleKt$$ExternalSyntheticLambda0(stablecoinHomeViewModel, i, realImageLoader, modifier2, function1, 7);
        }
    }

    public static final void LoadingContent(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-966508272);
        int i2 = i | 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-855125659, new ShareSheetPresenter$$ExternalSyntheticLambda0(24), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, 18);
        }
    }

    public static final void NullStateCarousel(NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content, Function1 function1, Modifier modifier, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2017226142);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(nullStateViewModel$SwipeViewModel$Content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(realImageLoader) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean changedInstance = gapComposer.changedInstance(realImageLoader);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, r4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            int i4 = (gapComposer.changedInstance(nullStateViewModel$SwipeViewModel$Content) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (i4 != 0 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BottomSheet$$ExternalSyntheticLambda3(9, function1, nullStateViewModel$SwipeViewModel$Content);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AndroidView_androidKt.AndroidView(function12, companion, (Function1) rememberedValue2, gapComposer, (i3 >> 3) & 112, 0);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4((Object) nullStateViewModel$SwipeViewModel$Content, function1, modifier2, (Object) realImageLoader, i, 21);
        }
    }

    public static final void StablecoinToolbar(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        NavigationIconType navigationIconType = NavigationIconType.BACK;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(44392795);
        int i2 = (gapComposer.changedInstance(function0) ? 32 : 16) | i | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String stringResource = Room.stringResource(gapComposer, R.string.stablecoin_toolbar_title);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            modifier2 = companion;
            KeypadKt.m3654ToolbarA_Dysh8(stringResource, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11), navigationIconType, 0L, function0, null, gapComposer, 24576 | ((i2 << 18) & 29360128), 364);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(i, modifier2, function0);
        }
    }

    public static final LayoutProto$LayoutNode createNode(Emittable emittable) {
        LayoutProto$LayoutType layoutProto$LayoutType;
        LayoutProto$VerticalAlignment layoutProto$VerticalAlignment;
        LayoutProto$ContentScale layoutProto$ContentScale;
        LayoutProto$LayoutNode.Builder newBuilder = LayoutProto$LayoutNode.newBuilder();
        if (emittable instanceof EmittableBox) {
            layoutProto$LayoutType = LayoutProto$LayoutType.BOX;
        } else if (emittable instanceof EmittableColumn) {
            layoutProto$LayoutType = ((EmittableColumn) emittable).modifier.any(RadioButtonKt$isSelectableGroup$1.INSTANCE) ? LayoutProto$LayoutType.RADIO_COLUMN : LayoutProto$LayoutType.COLUMN;
        } else if (emittable instanceof EmittableText) {
            layoutProto$LayoutType = LayoutProto$LayoutType.TEXT;
        } else if (emittable instanceof EmittableSpacer) {
            layoutProto$LayoutType = LayoutProto$LayoutType.SPACER;
        } else if (emittable instanceof EmittableImage) {
            layoutProto$LayoutType = LayoutProto$LayoutType.IMAGE;
        } else if (emittable instanceof RemoteViewsRoot) {
            layoutProto$LayoutType = LayoutProto$LayoutType.REMOTE_VIEWS_ROOT;
        } else {
            if (!(emittable instanceof EmittableSizeBox)) {
                Path$$ExternalSyntheticBUOutline0.m(emittable.getClass().getCanonicalName(), "Unknown element type ");
                return null;
            }
            layoutProto$LayoutType = LayoutProto$LayoutType.SIZE_BOX;
        }
        newBuilder.copyOnWrite();
        LayoutProto$LayoutNode.access$1900((LayoutProto$LayoutNode) newBuilder.instance, layoutProto$LayoutType);
        WidthModifier widthModifier = (WidthModifier) emittable.getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$22);
        Dimension dimension = Dimension.Wrap.INSTANCE;
        LayoutProto$DimensionType proto = toProto(widthModifier != null ? Dimension.Fill.INSTANCE : dimension);
        newBuilder.copyOnWrite();
        LayoutProto$LayoutNode.access$2200((LayoutProto$LayoutNode) newBuilder.instance, proto);
        HeightModifier heightModifier = (HeightModifier) emittable.getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$23);
        if (heightModifier != null) {
            dimension = heightModifier.height;
        }
        LayoutProto$DimensionType proto2 = toProto(dimension);
        newBuilder.copyOnWrite();
        LayoutProto$LayoutNode.access$2500((LayoutProto$LayoutNode) newBuilder.instance, proto2);
        boolean z = emittable.getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$20) != null;
        newBuilder.copyOnWrite();
        ((LayoutProto$LayoutNode) newBuilder.instance).hasAction_ = z;
        if (emittable.getModifier().foldIn(null, SizeBoxKt$SizeBox$1$2$1.INSTANCE$21) != null) {
            newBuilder.copyOnWrite();
            LayoutProto$LayoutNode.access$3700((LayoutProto$LayoutNode) newBuilder.instance);
        }
        if (emittable instanceof EmittableImage) {
            EmittableImage emittableImage = (EmittableImage) emittable;
            int i = emittableImage.contentScale;
            if (i == 1) {
                layoutProto$ContentScale = LayoutProto$ContentScale.FIT;
            } else if (i == 0) {
                layoutProto$ContentScale = LayoutProto$ContentScale.CROP;
            } else {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m(ContentScale.m1127toStringimpl(emittableImage.contentScale), "Unknown content scale ");
                    return null;
                }
                layoutProto$ContentScale = LayoutProto$ContentScale.FILL_BOUNDS;
            }
            newBuilder.copyOnWrite();
            LayoutProto$LayoutNode.access$3400((LayoutProto$LayoutNode) newBuilder.instance, layoutProto$ContentScale);
            boolean z2 = !androidx.glance.ImageKt.isDecorative(emittableImage);
            newBuilder.copyOnWrite();
            ((LayoutProto$LayoutNode) newBuilder.instance).hasImageDescription_ = z2;
            newBuilder.copyOnWrite();
            ((LayoutProto$LayoutNode) newBuilder.instance).hasImageColorFilter_ = false;
        } else if (emittable instanceof EmittableColumn) {
            LayoutProto$HorizontalAlignment m1121toProtouMT220 = m1121toProtouMT220(((EmittableColumn) emittable).horizontalAlignment);
            newBuilder.copyOnWrite();
            LayoutProto$LayoutNode.access$2800((LayoutProto$LayoutNode) newBuilder.instance, m1121toProtouMT220);
        } else if (emittable instanceof EmittableBox) {
            EmittableBox emittableBox = (EmittableBox) emittable;
            LayoutProto$HorizontalAlignment m1121toProtouMT2202 = m1121toProtouMT220(emittableBox.contentAlignment.horizontal);
            newBuilder.copyOnWrite();
            LayoutProto$LayoutNode.access$2800((LayoutProto$LayoutNode) newBuilder.instance, m1121toProtouMT2202);
            int i2 = emittableBox.contentAlignment.vertical;
            if (i2 == 0) {
                layoutProto$VerticalAlignment = LayoutProto$VerticalAlignment.TOP;
            } else if (i2 == 1) {
                layoutProto$VerticalAlignment = LayoutProto$VerticalAlignment.CENTER_VERTICALLY;
            } else {
                if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m(Alignment.Vertical.m1125toStringimpl(i2), "unknown vertical alignment ");
                    return null;
                }
                layoutProto$VerticalAlignment = LayoutProto$VerticalAlignment.BOTTOM;
            }
            newBuilder.copyOnWrite();
            LayoutProto$LayoutNode.access$3100((LayoutProto$LayoutNode) newBuilder.instance, layoutProto$VerticalAlignment);
        }
        if (emittable instanceof EmittableWithChildren) {
            ArrayList arrayList = ((EmittableWithChildren) emittable).children;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(createNode((Emittable) it.next()));
            }
            newBuilder.copyOnWrite();
            LayoutProto$LayoutNode.access$4400((LayoutProto$LayoutNode) newBuilder.instance, arrayList2);
        }
        return (LayoutProto$LayoutNode) newBuilder.build();
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.SwitchToManagedAccount.deepLinkSpecs;
    }

    public static final LayoutProto$DimensionType toProto(Dimension dimension) {
        if (Build.VERSION.SDK_INT >= 31) {
            return WidgetLayoutImpl31.INSTANCE.toProto(dimension);
        }
        Map map = LayoutSelectionKt.LayoutMap;
        if (dimension instanceof Dimension.Dp) {
            return LayoutProto$DimensionType.EXACT;
        }
        if (dimension instanceof Dimension.Wrap) {
            return LayoutProto$DimensionType.WRAP;
        }
        if (dimension instanceof Dimension.Fill) {
            return LayoutProto$DimensionType.FILL;
        }
        if (dimension instanceof Dimension.Expand) {
            return LayoutProto$DimensionType.EXPAND;
        }
        a$$ExternalSyntheticBUOutline0.m$1("After resolution, no other type should be present");
        return null;
    }

    /* renamed from: toProto-uMT2-20, reason: not valid java name */
    public static final LayoutProto$HorizontalAlignment m1121toProtouMT220(int i) {
        if (i == 0) {
            return LayoutProto$HorizontalAlignment.START;
        }
        if (i == 1) {
            return LayoutProto$HorizontalAlignment.CENTER_HORIZONTALLY;
        }
        if (i == 2) {
            return LayoutProto$HorizontalAlignment.END;
        }
        a$$ExternalSyntheticBUOutline0.m(Alignment.Horizontal.m1123toStringimpl(i), "unknown horizontal alignment ");
        return null;
    }
}
