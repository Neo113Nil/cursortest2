package app.cash.local.views.home;

import android.content.Context;
import android.graphics.DashPathEffect;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.material.SurfaceKt$$ExternalSyntheticLambda3;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.SimpleDropShadowElement;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ToolbarConfig;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandLocationMarketingMessagesContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocalBrandProfileSectionContent;
import app.cash.local.viewmodels.LocalBrandProfileSectionViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.home.TabSheetUpperContent;
import app.cash.local.viewmodels.wallet.BrandCollectionModel;
import app.cash.local.views.map.LocalMapPinKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.RealImageLoader$execute$2;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.CashComposeInsets;
import com.squareup.cash.common.composeui.CashInsetsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashCluster;
import com.squareup.cash.maps.views.MapEngineConfig;
import com.squareup.cash.maps.views.MapEngineConfigKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.sheet.UserDismissMode;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.MapboxConfiguration;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalHomeGeoViewKt {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        new BrandSpot("preview-brand-token", "preview-location-token");
    }

    public static final void LocalHomeGeoCluster(CashCluster cashCluster, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(143895072);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? gapComposer.changed(cashCluster) : gapComposer.changedInstance(cashCluster) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ClipKt.clip(Modifier.Companion.$$INSTANCE, roundedCornerShape), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), 1.0f, Strings.getColors(gapComposer).semantic.border.standard, roundedCornerShape), 14.0f, 10.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, String.valueOf(cashCluster.items.size()), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda19(cashCluster, i, 0);
        }
    }

    public static final void LocalHomeGeoPreviewMap(int i, Composer composer, Modifier modifier, final List list) {
        GapComposer gapComposer;
        List list2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1851520144);
        int i2 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(list) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            List list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(Double.valueOf(((LocalHomeGeoViewModel.Location) it.next()).latitude));
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(((LocalHomeGeoViewModel.Location) it2.next()).longitude));
            }
            Double m4124minOrNull = CollectionsKt.m4124minOrNull((Iterable) arrayList);
            double doubleValue = m4124minOrNull != null ? m4124minOrNull.doubleValue() : 45.45d;
            Double m4122maxOrNull = CollectionsKt.m4122maxOrNull((Iterable) arrayList);
            final double doubleValue2 = m4122maxOrNull != null ? m4122maxOrNull.doubleValue() : 45.57d;
            Double m4124minOrNull2 = CollectionsKt.m4124minOrNull((Iterable) arrayList2);
            final double doubleValue3 = m4124minOrNull2 != null ? m4124minOrNull2.doubleValue() : -122.72d;
            Double m4122maxOrNull2 = CollectionsKt.m4122maxOrNull((Iterable) arrayList2);
            double doubleValue4 = m4122maxOrNull2 != null ? m4122maxOrNull2.doubleValue() : -122.61d;
            double d = doubleValue2 - doubleValue;
            Double valueOf = Double.valueOf(d);
            if (d <= 0.0d) {
                valueOf = null;
            }
            final double doubleValue5 = valueOf != null ? valueOf.doubleValue() : 0.01d;
            double d2 = doubleValue4 - doubleValue3;
            Double valueOf2 = d2 > 0.0d ? Double.valueOf(d2) : null;
            final double doubleValue6 = valueOf2 != null ? valueOf2.doubleValue() : 0.01d;
            final long Color = ColorKt.Color(4280628812L);
            final long Color2 = ColorKt.Color(4283064442L);
            final long Color3 = ColorKt.Color(4281486184L);
            final long Color4 = ColorKt.Color(4281419102L);
            final long Color5 = ColorKt.Color(4280766277L);
            list2 = list;
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(ImageKt.m177backgroundbw27NRU(modifier, Color, ColorKt.RectangleShape), null, false, Expect_jvmKt.rememberComposableLambda(1819792250, new Function3() { // from class: app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
                        Object rememberedValue = gapComposer3.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            final long j = Color;
                            final long j2 = Color4;
                            final long j3 = Color5;
                            final long j4 = Color3;
                            final long j5 = Color2;
                            Function1 function1 = new Function1() { // from class: app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    long j6;
                                    long j7;
                                    float f;
                                    DrawScope drawScope = (DrawScope) obj4;
                                    drawScope.getClass();
                                    DrawScope.m747drawRectnJ9OG0$default(drawScope, j, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    AndroidPathEffect androidPathEffect = new AndroidPathEffect(new DashPathEffect(new float[]{6.0f, 10.0f}, RecyclerView.DECELERATION_RATE));
                                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.55f, j2, 14);
                                    long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.58f) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                                    float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.14f;
                                    DrawScope.m747drawRectnJ9OG0$default(drawScope, m675copywmQWz5c$default, floatToRawIntBits, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32), RecyclerView.DECELERATION_RATE, null, null, 0, 120);
                                    long j8 = j3;
                                    DrawScope.m747drawRectnJ9OG0$default(drawScope, Color.m675copywmQWz5c$default(0.85f, j8, 14), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.12f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.35f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.16f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.1f) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, null, null, 0, 120);
                                    long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(0.75f, j8, 14);
                                    float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.62f;
                                    long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.56f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                                    float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.12f;
                                    DrawScope.m747drawRectnJ9OG0$default(drawScope, m675copywmQWz5c$default2, floatToRawIntBits2, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.08f) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat3) << 32), RecyclerView.DECELERATION_RATE, null, null, 0, 120);
                                    float f2 = 0.9f;
                                    drawScope.mo729drawLineNGM6Ib0(j4, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.1f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.95f) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * 0.9f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * 0.1f) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : 44.0f, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                    int i3 = 0;
                                    int i4 = 0;
                                    while (true) {
                                        j6 = j5;
                                        if (i4 >= 9) {
                                            break;
                                        }
                                        float intBitsToFloat4 = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) * i4) / 8.0f;
                                        int i5 = i4 % 3;
                                        AndroidPathEffect androidPathEffect2 = androidPathEffect;
                                        int i6 = i4;
                                        drawScope.mo729drawLineNGM6Ib0(Color.m675copywmQWz5c$default(i5 == 0 ? 0.9f : 0.45f, j6, 14), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : i5 == 0 ? 3.0f : 1.5f, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : androidPathEffect2, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                        i4 = i6 + 1;
                                        androidPathEffect = androidPathEffect2;
                                    }
                                    AndroidPathEffect androidPathEffect3 = androidPathEffect;
                                    while (i3 < 7) {
                                        float intBitsToFloat5 = (Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) * i3) / 6.0f;
                                        int i7 = i3 % 2;
                                        long m675copywmQWz5c$default3 = Color.m675copywmQWz5c$default(i7 == 0 ? f2 : 0.45f, j6, 14);
                                        long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax);
                                        int i8 = i3;
                                        long floatToRawIntBits4 = (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax);
                                        DrawScope drawScope2 = drawScope;
                                        if (i7 == 0) {
                                            j7 = m675copywmQWz5c$default3;
                                            f = 3.0f;
                                        } else {
                                            j7 = m675copywmQWz5c$default3;
                                            f = 1.5f;
                                        }
                                        long j9 = j6;
                                        AndroidPathEffect androidPathEffect4 = androidPathEffect3;
                                        drawScope2.mo729drawLineNGM6Ib0(j7, floatToRawIntBits3, floatToRawIntBits4, (r23 & 8) != 0 ? 0.0f : f, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : androidPathEffect4, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                        drawScope = drawScope2;
                                        androidPathEffect3 = androidPathEffect4;
                                        j6 = j9;
                                        f2 = 0.9f;
                                        i3 = i8 + 1;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            gapComposer3.updateRememberedValue(function1);
                            rememberedValue = function1;
                        }
                        CanvasKt.Canvas(54, gapComposer3, fillMaxSize, (Function1) rememberedValue);
                        List list4 = list;
                        int size = list4.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            LocalHomeGeoViewModel.Location location = (LocalHomeGeoViewModel.Location) list4.get(i3);
                            Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(companion, 48.0f + ((Dp) RangesKt___RangesKt.coerceAtLeast(new Dp((boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM() - 96.0f) * ((float) ((location.longitude - doubleValue3) / doubleValue6))), new Dp(RecyclerView.DECELERATION_RATE))).value, boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() * ((float) ((doubleValue2 - location.latitude) / doubleValue5)));
                            String str = location.title;
                            BrandCollectionModel.Location location2 = location.sheetModel;
                            String str2 = location2.artwork;
                            LocalColor localColor = location.markerColor;
                            if (localColor == null) {
                                localColor = location2.backgroundColor;
                            }
                            LocalMapPinKt.LocalBrandLocationMarker(str, false, str2, localColor, m272offsetVpY3zN4, gapComposer3, 48, 0);
                        }
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 3072, 6);
        } else {
            gapComposer = gapComposer2;
            list2 = list;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(modifier, list2, i, 0);
        }
    }

    public static final void LocalHomeGeoSheetUpperContent(TabSheetUpperContent tabSheetUpperContent, boolean z, Function0 function0, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(991733346);
        int i2 = i | (gapComposer.changedInstance(tabSheetUpperContent) ? 4 : 2) | (gapComposer.changed(z) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Bottom, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = i2 & 8176;
            LocalHomeGeoSheetUpperPill(tabSheetUpperContent.left, z, function0, function1, gapComposer, i3);
            LocalHomeGeoSheetUpperPill(TabSheetUpperContent.Pill.QrScanIcon.INSTANCE, z, function0, function1, gapComposer, i3);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(tabSheetUpperContent, z, function0, function1, modifier, i, 0);
        }
    }

    public static final void LocalHomeGeoSheetUpperPill(TabSheetUpperContent.Pill pill, boolean z, Function0 function0, Function1 function1, Composer composer, int i) {
        int i2;
        long j;
        Colors colors;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1528979649);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(pill) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = pill instanceof TabSheetUpperContent.Pill.LocalCashAmount;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3) {
                gapComposer.startReplaceGroup(1704786617);
                Modifier pillIcon = pillIcon(SizeKt.m277height3ABfNKs(companion, 44.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(22.0f), gapComposer);
                boolean z4 = (i2 & 7168) == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z4 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(22, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m183clickableoSLSa3U$default(pillIcon, false, null, null, (Function0) rememberedValue, 15), 4.0f, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 10);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                ImageKt.Image(Countries.painterResource(2131232818, 0, gapComposer), null, SizeKt.m285size3ABfNKs(companion, 36.0f), null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 25008, 104);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                String str = ((TabSheetUpperContent.Pill.LocalCashAmount) pill).amount;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors2.semantic.text.standard, (Composer) gapComposer, m302paddingqDBjuR0$default2, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                int i3 = i2;
                if (!pill.equals(TabSheetUpperContent.Pill.QrScanIcon.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 470635051, false);
                }
                gapComposer.startReplaceGroup(1705566825);
                Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 44.0f, 104.0f);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Start, gapComposer, 6);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m287sizeVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                if (applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Integer valueOf = Integer.valueOf(hashCode2);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 44.0f);
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(pillIcon(m285size3ABfNKs, roundedCornerShape, gapComposer), false, null, new Role(0), function0, 11);
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Icons icons = Icons.Recenter24;
                String stringResource = Room.stringResource(gapComposer, R.string.center_location_description);
                if (z) {
                    gapComposer.startReplaceGroup(2023239194);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        z2 = false;
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        colors = colors3;
                        z2 = false;
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors.semantic.accent.ocean;
                    gapComposer.end(z2);
                } else {
                    gapComposer.startReplaceGroup(2023318585);
                    Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors4.semantic.icon.standard;
                    gapComposer.end(false);
                }
                Trace.m1191Iconww6aTOc(icons, stringResource, m285size3ABfNKs2, j, gapComposer, 390, 0);
                gapComposer.end(true);
                Modifier pillIcon2 = pillIcon(SizeKt.m285size3ABfNKs(companion, 44.0f), roundedCornerShape, gapComposer);
                boolean z5 = (i3 & 7168) == 2048;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z5 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(23, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                pillIcon2.getClass();
                function02.getClass();
                Modifier m183clickableoSLSa3U$default2 = ImageKt.m183clickableoSLSa3U$default(pillIcon2, false, null, null, function02, 15);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                Modifier m285size3ABfNKs3 = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Painter painterResource = Countries.painterResource(R.drawable.local_views_qr_icon, 0, gapComposer);
                String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_check_in);
                Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors5 == null) {
                    colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Trace.m1190Iconww6aTOc(painterResource, stringResource2, m285size3ABfNKs3, colors5.semantic.icon.standard, gapComposer, Painter.$stable | MLKEMEngine.KyberPolyBytes, 0);
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(pill, z, function0, function1, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalHomeGeoView(Modifier modifier, final LocalHomeGeoViewModel localHomeGeoViewModel, final Function1 function1, boolean z, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        GapComposer gapComposer;
        Modifier modifier3;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        RealSheetState realSheetState;
        CoroutineScope coroutineScope;
        Collection build;
        LocalImage localImage;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1208431131);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(localHomeGeoViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 2048 : 1024;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                z3 = z2;
            } else {
                Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                boolean z4 = i5 != 0 ? false : z2;
                final RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(UserDismissMode.DragNoDismiss, gapComposer2, 6, 0);
                RealSheetState rememberSheetState2 = SheetStateKt.rememberSheetState(SheetPosition.Hidden, gapComposer2);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj = Composer.Companion.Empty;
                if (rememberedValue == obj) {
                    rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) rememberedValue;
                final long j = Strings.getColors(gapComposer2).surface.money.background;
                final Colors copy$default = Colors.copy$default(Strings.getColors(gapComposer2), Colors.Component.copy$default(Strings.getColors(gapComposer2).component, null, null, null, null, null, new Colors.Component.Sheet(j, Strings.getColors(gapComposer2).component.sheet.handle), null, 133693439), null, 55);
                final float mo264calculateBottomPaddingD9Ej5fM = SpacerKt.asPaddingValues(((CashComposeInsets) gapComposer2.consume(CashInsetsKt.LocalCashInsets)).inlineBottomNavigation, gapComposer2).mo264calculateBottomPaddingD9Ej5fM();
                Object obj2 = localHomeGeoViewModel.locations;
                boolean changed = gapComposer2.changed(obj2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    List list = (Iterable) obj2;
                    realSheetState = rememberSheetState2;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                        arrayList.add(new LocalHomeGeoClusterItem((LocalHomeGeoViewModel.Location) it.next()));
                    }
                    gapComposer2.updateRememberedValue(arrayList);
                    rememberedValue2 = arrayList;
                } else {
                    realSheetState = rememberSheetState2;
                }
                final List list2 = (List) rememberedValue2;
                final UiCallbackModel uiCallbackModel = localHomeGeoViewModel.selectedLocationBrandProfileUiCallbackModel;
                Object obj3 = uiCallbackModel != null ? (LocalBrandProfileViewModel) uiCallbackModel.model : null;
                final boolean z5 = z4;
                boolean changed2 = gapComposer2.changed(localHomeGeoViewModel.tabContent.segmentedTabsEnabled);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue3 == obj) {
                    rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(R.string.local_views_explore, gapComposer2);
                }
                final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
                boolean changed3 = gapComposer2.changed(obj2) | gapComposer2.changed(obj3);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue4 == obj) {
                    LocalBrandProfileViewModel.Content content = obj3 instanceof LocalBrandProfileViewModel.Content ? (LocalBrandProfileViewModel.Content) obj3 : null;
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    if (content == null) {
                        build = EmptyList.INSTANCE;
                        coroutineScope = coroutineScope2;
                    } else {
                        ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                        coroutineScope = coroutineScope2;
                        LocalImage localImage2 = content.heroImage;
                        if (localImage2 != null) {
                            createListBuilder2.add(localImage2);
                        }
                        LocalBrandBannerModel localBrandBannerModel = content.banner;
                        if (localBrandBannerModel != null && (localImage = localBrandBannerModel.image) != null) {
                            createListBuilder2.add(localImage);
                        }
                        Iterator it2 = content.sections.iterator();
                        while (it2.hasNext()) {
                            LocalBrandProfileSectionContent localBrandProfileSectionContent = ((LocalBrandProfileSectionViewModel) it2.next()).content;
                            Iterator it3 = it2;
                            if (localBrandProfileSectionContent instanceof LocalBrandLocationMarketingMessagesContentModel) {
                                Iterator it4 = ((LocalBrandLocationMarketingMessagesContentModel) localBrandProfileSectionContent).entries.iterator();
                                while (it4.hasNext()) {
                                    LocalImage localImage3 = ((LocalBrandLocationMarketingMessagesContentModel.Entry) it4.next()).image;
                                    if (localImage3 != null) {
                                        createListBuilder2.add(localImage3);
                                    }
                                }
                            } else if (localBrandProfileSectionContent instanceof LocalBrandLocationMenuCarouselContentModel) {
                                Iterator it5 = ((LocalBrandLocationMenuCarouselContentModel) localBrandProfileSectionContent).entries.iterator();
                                while (it5.hasNext()) {
                                    LocalImage localImage4 = ((LocalBrandLocationMenuCarouselContentModel.Entry) it5.next()).image;
                                    if (localImage4 != null) {
                                        createListBuilder2.add(localImage4);
                                    }
                                }
                            } else if (localBrandProfileSectionContent instanceof LocalBrandLocationMenuContentModel) {
                                Iterator it6 = ((LocalBrandLocationMenuContentModel) localBrandProfileSectionContent).menus.iterator();
                                while (it6.hasNext()) {
                                    Iterator it7 = ((LocalBrandLocationMenuContentModel.Menu) it6.next()).entries.iterator();
                                    while (it7.hasNext()) {
                                        Iterator it8 = it6;
                                        LocalImage localImage5 = ((LocalBrandLocationMenuContentModel.Entry) it7.next()).image;
                                        if (localImage5 != null) {
                                            createListBuilder2.add(localImage5);
                                        }
                                        it6 = it8;
                                    }
                                }
                            }
                            it2 = it3;
                        }
                        build = CollectionsKt__CollectionsJVMKt.build(createListBuilder2);
                    }
                    createListBuilder.addAll(build);
                    Iterator it9 = SequencesKt___SequencesKt.take(SequencesKt___SequencesKt.mapNotNull(CollectionsKt.asSequence((Iterable) obj2), new LocationMenu$$ExternalSyntheticLambda6(23)), 50).iterator();
                    while (it9.hasNext()) {
                        createListBuilder.add((LocalImage) it9.next());
                    }
                    rememberedValue4 = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                } else {
                    coroutineScope = coroutineScope2;
                }
                List list3 = (List) rememberedValue4;
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (rememberedValue5 == obj) {
                    rememberedValue5 = Updater.mutableStateOf$default(uiCallbackModel);
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                final MutableState mutableState = (MutableState) rememberedValue5;
                if (uiCallbackModel != null) {
                    mutableState.setValue(uiCallbackModel);
                }
                PreloadLocalImages(0, gapComposer2, list3);
                boolean changed4 = gapComposer2.changed(rememberSheetState);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (changed4 || rememberedValue6 == obj) {
                    rememberedValue6 = new RealSheetState$peek$3(rememberSheetState, null, 1);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(gapComposer2, rememberSheetState, (Function2) rememberedValue6);
                Modifier clipToBounds = ClipKt.clipToBounds(SizeKt.fillMaxSize(modifier4, 1.0f));
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clipToBounds, colors.surface.money.background, ColorKt.RectangleShape);
                gapComposer = gapComposer2;
                final CoroutineScope coroutineScope3 = coroutineScope;
                final RealSheetState realSheetState2 = realSheetState;
                OffsetKt.BoxWithConstraints(m177backgroundbw27NRU, null, false, Expect_jvmKt.rememberComposableLambda(2121593713, new Function3() { // from class: app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        CoroutineScope coroutineScope4;
                        String str;
                        ToolbarConfig toolbarConfig;
                        LocalHomeGeoViewModel localHomeGeoViewModel2;
                        Object obj7;
                        String str2;
                        String str3;
                        String str4;
                        RealSheetState realSheetState3;
                        boolean z6;
                        RealSheetState realSheetState4;
                        CoroutineScope coroutineScope5;
                        float f;
                        float f2;
                        float f3;
                        MutableState mutableState2;
                        Function1 function12;
                        int i6;
                        GapComposer gapComposer3;
                        float f4;
                        MutableState mutableState3;
                        RealSheetState realSheetState5;
                        MutableState mutableState4;
                        Continuation continuation;
                        RealSheetState realSheetState6;
                        LocalHomeGeoViewModel localHomeGeoViewModel3 = localHomeGeoViewModel;
                        MapboxConfiguration mapboxConfiguration = localHomeGeoViewModel3.mapboxConfiguration;
                        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj4;
                        Composer composer2 = (Composer) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        boxWithConstraintsScopeImpl.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                        }
                        GapComposer gapComposer4 = (GapComposer) composer2;
                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                            final float m258getMaxHeightD9Ej5fM = boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() / 3.0f;
                            float m258getMaxHeightD9Ej5fM2 = boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM() / 2.0f;
                            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                            float mo267calculateTopPaddingD9Ej5fM = SpacerKt.asPaddingValues(Arrangement$End$1.current(gapComposer4).statusBars, gapComposer4).mo267calculateTopPaddingD9Ej5fM();
                            RealSheetState realSheetState7 = RealSheetState.this;
                            float expandProgress = realSheetState7.getExpandProgress();
                            CoroutineScope coroutineScope6 = coroutineScope3;
                            boolean changedInstance = gapComposer4.changedInstance(coroutineScope6);
                            RealSheetState realSheetState8 = realSheetState2;
                            boolean changed5 = changedInstance | gapComposer4.changed(realSheetState8) | gapComposer4.changedInstance(localHomeGeoViewModel3);
                            Object rememberedValue7 = gapComposer4.rememberedValue();
                            Object obj8 = Composer.Companion.Empty;
                            if (changed5 || rememberedValue7 == obj8) {
                                rememberedValue7 = new UtilsKt$$ExternalSyntheticLambda0(4, coroutineScope6, localHomeGeoViewModel3, realSheetState8);
                                gapComposer4.updateRememberedValue(rememberedValue7);
                            }
                            Function1 function13 = (Function1) rememberedValue7;
                            String stringResource = Room.stringResource(gapComposer4, R.string.local_views_local);
                            final Function1 function14 = function1;
                            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function14, gapComposer4);
                            boolean z7 = z5;
                            Continuation continuation2 = null;
                            if (z7) {
                                gapComposer4.startReplaceGroup(-339524021);
                                boolean changed6 = gapComposer4.changed(localHomeGeoViewModel3.toolbarInternalModel) | gapComposer4.changed(stringResource);
                                Object rememberedValue8 = gapComposer4.rememberedValue();
                                if (changed6 || rememberedValue8 == obj8) {
                                    coroutineScope4 = coroutineScope6;
                                    rememberedValue8 = new ToolbarConfig(null, null, null, localHomeGeoViewModel3.toolbarInternalModel, stringResource, new DateInputKt$$ExternalSyntheticLambda5(18, rememberUpdatedState), false, false, null, null, 967);
                                    str = stringResource;
                                    gapComposer4.updateRememberedValue(rememberedValue8);
                                } else {
                                    coroutineScope4 = coroutineScope6;
                                    str = stringResource;
                                }
                                gapComposer4.end(false);
                                toolbarConfig = (ToolbarConfig) rememberedValue8;
                            } else {
                                coroutineScope4 = coroutineScope6;
                                str = stringResource;
                                gapComposer4.startReplaceGroup(-339265605);
                                gapComposer4.end(false);
                                toolbarConfig = null;
                            }
                            boolean booleanValue = ((Boolean) gapComposer4.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            float f5 = mo264calculateBottomPaddingD9Ej5fM;
                            MutableState mutableState5 = mutableState;
                            if (booleanValue) {
                                gapComposer4.startReplaceGroup(-339200598);
                                LocalHomeGeoViewKt.LocalHomeGeoPreviewMap(0, gapComposer4, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f5, 7), localHomeGeoViewModel3.locations);
                                gapComposer4.end(false);
                                realSheetState3 = realSheetState8;
                                mutableState2 = mutableState5;
                                z6 = z7;
                                realSheetState4 = realSheetState7;
                                coroutineScope5 = coroutineScope4;
                                f3 = m258getMaxHeightD9Ej5fM2;
                                f2 = f5;
                                f = 1.0f;
                            } else {
                                gapComposer4.startReplaceGroup(-338977894);
                                boolean changed7 = gapComposer4.changed(mapboxConfiguration);
                                Object rememberedValue9 = gapComposer4.rememberedValue();
                                if (changed7 || rememberedValue9 == obj8) {
                                    List list4 = mapboxConfiguration != null ? mapboxConfiguration.usage_options : null;
                                    if (list4 == null) {
                                        list4 = EmptyList.INSTANCE;
                                    }
                                    Iterator it10 = list4.iterator();
                                    while (true) {
                                        if (!it10.hasNext()) {
                                            localHomeGeoViewModel2 = localHomeGeoViewModel3;
                                            obj7 = null;
                                            break;
                                        }
                                        obj7 = it10.next();
                                        Iterator it11 = it10;
                                        localHomeGeoViewModel2 = localHomeGeoViewModel3;
                                        if (((MapboxConfiguration.UsageOptions) obj7).context == MapboxConfiguration.UsageOptions.Context.CONTEXT_NEIGHBORHOODS_TAB) {
                                            break;
                                        }
                                        it10 = it11;
                                        localHomeGeoViewModel3 = localHomeGeoViewModel2;
                                    }
                                    MapboxConfiguration.UsageOptions usageOptions = (MapboxConfiguration.UsageOptions) obj7;
                                    if (mapboxConfiguration == null || (str2 = mapboxConfiguration.access_token) == null || StringsKt.isBlank(str2)) {
                                        str2 = null;
                                    }
                                    if (usageOptions == null || (str3 = usageOptions.style_uri_light) == null || StringsKt.isBlank(str3)) {
                                        str3 = null;
                                    }
                                    if (usageOptions == null || (str4 = usageOptions.style_uri_dark) == null || StringsKt.isBlank(str4)) {
                                        str4 = null;
                                    }
                                    rememberedValue9 = new MapEngineConfig(str2, str3, str4);
                                    gapComposer4.updateRememberedValue(rememberedValue9);
                                } else {
                                    localHomeGeoViewModel2 = localHomeGeoViewModel3;
                                }
                                realSheetState3 = realSheetState8;
                                z6 = z7;
                                realSheetState4 = realSheetState7;
                                coroutineScope5 = coroutineScope4;
                                localHomeGeoViewModel3 = localHomeGeoViewModel2;
                                f = 1.0f;
                                f2 = f5;
                                f3 = m258getMaxHeightD9Ej5fM2;
                                mutableState2 = mutableState5;
                                Updater.CompositionLocalProvider(MapEngineConfigKt.LocalMapEngineConfig.defaultProvidedValue$runtime((MapEngineConfig) rememberedValue9), Expect_jvmKt.rememberComposableLambda(1232040149, new LocalHomeGeoViewKt$$ExternalSyntheticLambda4(f5, localHomeGeoViewModel3, m258getMaxHeightD9Ej5fM2, list2, function13, mutableState5), gapComposer4), gapComposer4, 56);
                                gapComposer4.end(false);
                            }
                            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                            if (expandProgress > RecyclerView.DECELERATION_RATE) {
                                gapComposer4.startReplaceGroup(-337194030);
                                Modifier alpha = AlphaKt.alpha(SizeKt.fillMaxSize(companion, f), expandProgress);
                                Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                                i6 = 0;
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                                } else {
                                    gapComposer4.startReplaceGroup(-1762997739);
                                    gapComposer4.end(false);
                                }
                                function12 = function13;
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(alpha, colors2.component.ui.dimmer.background, rectangleShapeKt$RectangleShape$1), gapComposer4, 0);
                                gapComposer4.end(false);
                            } else {
                                function12 = function13;
                                i6 = 0;
                                gapComposer4.startReplaceGroup(-337010479);
                                gapComposer4.end(false);
                            }
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, f);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer4, i6);
                            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth);
                            ComposeUiNode.Companion.getClass();
                            Function0 function0 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer4.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer4.startReusableNode();
                            if (gapComposer4.inserting) {
                                gapComposer4.createNode(function0);
                            } else {
                                gapComposer4.useNode();
                            }
                            Updater.m576setimpl(gapComposer4, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer4, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            if (z6) {
                                gapComposer4.startReplaceGroup(1608075573);
                                ChromeConfigKt.ChromeConfig(null, null, null, null, null, toolbarConfig, null, gapComposer4, PKIFailureInfo.transactionIdInUse, 95);
                                TabToolbarsKt.SharedTabToolbarSpacer(6, 0, gapComposer4, SizeKt.fillMaxWidth(companion, f));
                                gapComposer4.end(false);
                                gapComposer3 = gapComposer4;
                            } else {
                                gapComposer4.startReplaceGroup(1608216530);
                                TabToolbarInternalViewModel tabToolbarInternalViewModel = localHomeGeoViewModel3.toolbarInternalModel;
                                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(634314395, new LocalHomeViewKt$$ExternalSyntheticLambda1(str, 7), gapComposer4);
                                boolean changed8 = gapComposer4.changed(function14);
                                Object rememberedValue10 = gapComposer4.rememberedValue();
                                if (changed8 || rememberedValue10 == obj8) {
                                    rememberedValue10 = new GestureNodeKt$$ExternalSyntheticLambda0(26, function14);
                                    gapComposer4.updateRememberedValue(rememberedValue10);
                                }
                                TabToolbarsKt.TabToolbar(null, tabToolbarInternalViewModel, null, false, null, null, rememberComposableLambda, (Function1) rememberedValue10, null, null, null, null, false, gapComposer4, 1572864, 0, 7997);
                                gapComposer3 = gapComposer4;
                                gapComposer3.end(false);
                            }
                            gapComposer3.end(true);
                            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxSize(companion, f), RecyclerView.DECELERATION_RATE, mo267calculateTopPaddingD9Ej5fM, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                            final Colors colors3 = copy$default;
                            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                            final long j2 = j;
                            final RealSheetState realSheetState9 = realSheetState4;
                            final boolean z8 = z6;
                            final CoroutineScope coroutineScope7 = coroutineScope5;
                            final Function1 function15 = function12;
                            final LocalHomeGeoViewModel localHomeGeoViewModel4 = localHomeGeoViewModel3;
                            boolean z9 = true;
                            OffsetKt.BoxWithConstraints(m302paddingqDBjuR0$default, null, false, Expect_jvmKt.rememberComposableLambda(-2078297145, new Function3() { // from class: app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl2 = (BoxWithConstraintsScopeImpl) obj9;
                                    Composer composer3 = (Composer) obj10;
                                    int intValue2 = ((Integer) obj11).intValue();
                                    boxWithConstraintsScopeImpl2.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((GapComposer) composer3).changed(boxWithConstraintsScopeImpl2) ? 4 : 2;
                                    }
                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        ArcadeThemeKt.ArcadeTheme(Colors.this, null, null, Expect_jvmKt.rememberComposableLambda(230160338, new LocalHomeGeoViewKt$$ExternalSyntheticLambda12(m258getMaxHeightD9Ej5fM, coroutineScope7, realSheetState9, localHomeGeoViewModel4, parcelableSnapshotMutableIntState2, j2, function14, z8, boxWithConstraintsScopeImpl2, function15, 0), gapComposer5), gapComposer5, 3072, 6);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer3), gapComposer3, 3072, 6);
                            UiCallbackModel uiCallbackModel2 = (UiCallbackModel) mutableState2.getValue();
                            if (uiCallbackModel2 != null) {
                                gapComposer3.startReplaceGroup(-333124629);
                                Object rememberUpdatedState2 = Updater.rememberUpdatedState(localHomeGeoViewModel4.onDismissSellerSheet, gapComposer3);
                                Object obj9 = uiCallbackModel;
                                if (obj9 == null) {
                                    z9 = false;
                                }
                                Object rememberUpdatedState3 = Updater.rememberUpdatedState(Boolean.valueOf(z9), gapComposer3);
                                Object rememberedValue11 = gapComposer3.rememberedValue();
                                if (rememberedValue11 == obj8) {
                                    rememberedValue11 = Updater.mutableStateOf$default(Boolean.FALSE);
                                    gapComposer3.updateRememberedValue(rememberedValue11);
                                }
                                MutableState mutableState6 = (MutableState) rememberedValue11;
                                Object rememberedValue12 = gapComposer3.rememberedValue();
                                if (rememberedValue12 == obj8) {
                                    rememberedValue12 = Updater.mutableStateOf$default(Boolean.FALSE);
                                    gapComposer3.updateRememberedValue(rememberedValue12);
                                }
                                MutableState mutableState7 = (MutableState) rememberedValue12;
                                Unit unit = Unit.INSTANCE;
                                RealSheetState realSheetState10 = realSheetState3;
                                boolean changed9 = gapComposer3.changed(realSheetState10);
                                Object rememberedValue13 = gapComposer3.rememberedValue();
                                if (changed9 || rememberedValue13 == obj8) {
                                    mutableState3 = mutableState7;
                                    rememberedValue13 = new RealImageLoader$execute$2(realSheetState10, mutableState6, mutableState3, continuation2, 14);
                                    realSheetState5 = realSheetState10;
                                    mutableState4 = mutableState6;
                                    continuation = null;
                                    gapComposer3.updateRememberedValue(rememberedValue13);
                                } else {
                                    realSheetState5 = realSheetState10;
                                    mutableState4 = mutableState6;
                                    mutableState3 = mutableState7;
                                    continuation = null;
                                }
                                Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue13);
                                boolean changed10 = gapComposer3.changed(realSheetState5) | gapComposer3.changed(rememberUpdatedState3) | gapComposer3.changed(rememberUpdatedState2);
                                Object rememberedValue14 = gapComposer3.rememberedValue();
                                if (changed10 || rememberedValue14 == obj8) {
                                    RealSheetState realSheetState11 = realSheetState5;
                                    rememberedValue14 = new zzmo(realSheetState11, mutableState3, rememberUpdatedState3, rememberUpdatedState2, null, 14);
                                    realSheetState6 = realSheetState11;
                                    gapComposer3.updateRememberedValue(rememberedValue14);
                                } else {
                                    realSheetState6 = realSheetState5;
                                }
                                Updater.LaunchedEffect(gapComposer3, realSheetState6, (Function2) rememberedValue14);
                                boolean changedInstance2 = gapComposer3.changedInstance(obj9) | gapComposer3.changed(realSheetState6);
                                Object rememberedValue15 = gapComposer3.rememberedValue();
                                if (changedInstance2 || rememberedValue15 == obj8) {
                                    rememberedValue15 = new RealImageLoader$execute$2(obj9, realSheetState6, mutableState2, continuation, 15);
                                    gapComposer3.updateRememberedValue(rememberedValue15);
                                }
                                Updater.LaunchedEffect(gapComposer3, obj9, (Function2) rememberedValue15);
                                float f6 = f2;
                                f4 = f6;
                                ArcadeThemeKt.ArcadeTheme(colors3, null, null, Expect_jvmKt.rememberComposableLambda(-257533553, new SurfaceKt$$ExternalSyntheticLambda3(realSheetState6, f3, mutableState4, j2, f6, uiCallbackModel2, coroutineScope5), gapComposer3), gapComposer3, 3072, 6);
                                gapComposer3.end(false);
                            } else {
                                f4 = f2;
                                gapComposer3.startReplaceGroup(-329889903);
                                gapComposer3.end(false);
                            }
                            if (Dp.m1036compareTo0680j_4(f4, RecyclerView.DECELERATION_RATE) > 0) {
                                gapComposer3.startReplaceGroup(-329840923);
                                Modifier m277height3ABfNKs = SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), 1.0f), f4);
                                Colors colors4 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors4 == null) {
                                    colors4 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                BoxKt.Box(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors4.surface.money.background, rectangleShapeKt$RectangleShape$1), gapComposer3, 0);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(-329614127);
                                gapComposer3.end(false);
                            }
                        } else {
                            gapComposer4.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 3072, 6);
                z3 = z5;
                modifier3 = modifier4;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(modifier3, localHomeGeoViewModel, function1, z3, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void PreloadLocalImages(int i, Composer composer, List list) {
        RecomposeScopeImpl endRestartGroup;
        LocalHomeGeoViewKt$$ExternalSyntheticLambda9 localHomeGeoViewKt$$ExternalSyntheticLambda9;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1566578470);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i;
        int i3 = 1;
        int i4 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            boolean z = colors.isLight;
            boolean changed = gapComposer.changed(list) | gapComposer.changed(z);
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            Object obj = Composer.Companion.Empty;
            if (changed || rememberedValue == obj) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    LocalImage localImage = (LocalImage) it.next();
                    if (z) {
                        str = localImage.light_url;
                    } else {
                        String str2 = localImage.dark_url;
                        if (str2 != null) {
                            if (StringsKt.isBlank(str2)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                str = str2;
                            }
                        }
                        str = localImage.light_url;
                    }
                    if (str == null || StringsKt.isBlank(str)) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                rememberedValue = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            List list2 = (List) rememberedValue;
            if (list2.isEmpty()) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    localHomeGeoViewKt$$ExternalSyntheticLambda9 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, i4, list);
                    endRestartGroup.block = localHomeGeoViewKt$$ExternalSyntheticLambda9;
                }
                return;
            }
            Object applicationContext = ((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)).getApplicationContext();
            Object obj2 = (RealImageLoader) gapComposer.consume(LocalImageLoaderKt.LocalImageLoader);
            boolean changedInstance = gapComposer.changedInstance(list2) | gapComposer.changedInstance(obj2) | gapComposer.changedInstance(applicationContext);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                Object animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(list2, obj2, applicationContext, continuation, 19);
                gapComposer.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
                rememberedValue2 = animatedImageDecoder$wrapDrawable$2;
            }
            Updater.LaunchedEffect(obj2, list2, (Function2) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            localHomeGeoViewKt$$ExternalSyntheticLambda9 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda9(i, i3, list);
            endRestartGroup.block = localHomeGeoViewKt$$ExternalSyntheticLambda9;
        }
    }

    public static final Modifier pillIcon(Modifier modifier, Shape shape, Composer composer) {
        return modifier.then(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ClipKt.clip(new SimpleDropShadowElement(shape, new Shadow(16.0f, Color.m675copywmQWz5c$default(0.16f, Strings.getColors(composer).base.constantBlack, 14), RecyclerView.DECELERATION_RATE, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, 48)), shape), Strings.getColors(composer).semantic.background.subtle, ColorKt.RectangleShape), 1.0f, Strings.getColors(composer).semantic.border.subtle, shape));
    }
}
