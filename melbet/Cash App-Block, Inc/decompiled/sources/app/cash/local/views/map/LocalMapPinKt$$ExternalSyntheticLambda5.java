package app.cash.local.views.map;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.Lock;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation;
import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewModel;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import app.cash.sqldelight.driver.android.AndroidStatement;
import coil3.Extras;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.borrow.views.BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2;
import com.squareup.cash.charting.components.AxisPlacement;
import com.squareup.cash.clientsync.errors.RealClientSyncErrorReporter;
import com.squareup.cash.clientsync.errors.SyncEntityShadowDivergence;
import com.squareup.cash.clientsync.errors.SyncEntityShadowException;
import com.squareup.cash.clientsync.persistence.ShadowedSyncEntityStore;
import com.squareup.cash.clientsync.persistence.SyncEntityStore;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda10;
import com.squareup.cash.investing.components.metrics.FinancialBarGraphKt$$ExternalSyntheticLambda16;
import com.squareup.cash.investing.components.metrics.InvestingAnalystGraphView;
import com.squareup.cash.investing.components.metrics.InvestingEarningsTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.investing.viewmodels.metrics.InvestingAnalystOpinionsViewModel$Content;
import com.squareup.cash.investing.viewmodels.metrics.InvestingEarningsViewModel;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.contour.ContourLayout;
import com.squareup.util.android.Intents;
import com.squareup.util.android.Keyboards;
import com.squareup.util.android.Views;
import com.squareup.wire.GrpcMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalMapPinKt$$ExternalSyntheticLambda5 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ LocalMapPinKt$$ExternalSyntheticLambda5(long j, PaddingValues paddingValues) {
        this.$r8$classId = 2;
        this.f$1 = j;
        this.f$0 = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LinearGradient m132linearGradientmHitzGk;
        int i = this.$r8$classId;
        int i2 = 14;
        float f = RecyclerView.DECELERATION_RATE;
        final long j = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj;
                layoutNodeDrawScope.getClass();
                DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope, (AndroidPath) obj2, this.f$1, RecyclerView.DECELERATION_RATE, null, 60);
                return Unit.INSTANCE;
            case 1:
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) obj2;
                lazyLayoutItemAnimation.m320setPlacementDeltagyyYBs(IntOffset.m1048minusqkQi6aY(((IntOffset) ((Animatable) obj).getValue()).packedValue, j));
                lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                return Unit.INSTANCE;
            case 2:
                PaddingValues paddingValues = (PaddingValues) obj2;
                LayoutNodeDrawScope layoutNodeDrawScope2 = (LayoutNodeDrawScope) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat > RecyclerView.DECELERATION_RATE) {
                    float mo236toPx0680j_4 = layoutNodeDrawScope2.mo236toPx0680j_4(4.0f);
                    CanvasDrawScope canvasDrawScope = layoutNodeDrawScope2.canvasDrawScope;
                    float mo236toPx0680j_42 = layoutNodeDrawScope2.mo236toPx0680j_4(paddingValues.mo265calculateLeftPaddingu2uoSUM(layoutNodeDrawScope2.getLayoutDirection())) - mo236toPx0680j_4;
                    float f2 = (mo236toPx0680j_4 * 2.0f) + intBitsToFloat + mo236toPx0680j_42;
                    LayoutDirection layoutDirection = layoutNodeDrawScope2.getLayoutDirection();
                    int[] iArr = OutlinedTextFieldKt.WhenMappings.$EnumSwitchMapping$0;
                    float intBitsToFloat2 = iArr[layoutDirection.ordinal()] == 1 ? Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32)) - f2 : mo236toPx0680j_42 < RecyclerView.DECELERATION_RATE ? 0.0f : mo236toPx0680j_42;
                    if (iArr[layoutNodeDrawScope2.getLayoutDirection().ordinal()] == 1) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32));
                        if (mo236toPx0680j_42 >= RecyclerView.DECELERATION_RATE) {
                            f = mo236toPx0680j_42;
                        }
                        f2 = intBitsToFloat3 - f;
                    }
                    float f3 = f2;
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
                    float f4 = (-intBitsToFloat4) / 2.0f;
                    float f5 = intBitsToFloat4 / 2.0f;
                    GrpcMethod grpcMethod = canvasDrawScope.drawContext;
                    long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                    grpcMethod.getCanvas().save();
                    try {
                        ((Extras.Key) grpcMethod.path).m1435clipRectN_I0leg(intBitsToFloat2, f4, f3, f5, 0);
                        layoutNodeDrawScope2.drawContent();
                    } finally {
                        Recorder$$ExternalSyntheticOutline2.m(grpcMethod, m3999getSizeNHjbRc);
                    }
                } else {
                    layoutNodeDrawScope2.drawContent();
                }
                return Unit.INSTANCE;
            case 3:
                final ArrayList arrayList = (ArrayList) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                lazyListScope.items(arrayList.size(), new Latch$await$2$2(i2, new Yoga$$ExternalSyntheticLambda0(18), arrayList), new BorrowHomeKt$BorrowHome$lambda$1$0$$inlined$itemsIndexed$default$2(3, arrayList), new ComposableLambdaImpl(new Function4() { // from class: app.cash.local.views.pos.LocalPosLocalCashRedemptionViewKt$RedeemExplanation_sW7UJKQ$lambda$0$1$0$$inlined$items$default$4
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i3;
                        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj3;
                        int intValue = ((Number) obj4).intValue();
                        Composer composer = (Composer) obj5;
                        int intValue2 = ((Number) obj6).intValue();
                        if ((intValue2 & 6) == 0) {
                            i3 = (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2) | intValue2;
                        } else {
                            i3 = intValue2;
                        }
                        if ((intValue2 & 48) == 0) {
                            i3 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                        }
                        GapComposer gapComposer = (GapComposer) composer;
                        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                            LocalPosLocalCashRedemptionViewModel.Coupon coupon = (LocalPosLocalCashRedemptionViewModel.Coupon) arrayList.get(intValue);
                            gapComposer.startReplaceGroup(872939908);
                            LocalPosCheckInViewKt.m1329CouponRPmYEkk(coupon, j, gapComposer, 0);
                            gapComposer.end(false);
                        } else {
                            gapComposer.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, true, 802480018));
                return Unit.INSTANCE;
            case 4:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, (Long) obj2);
                androidStatement.bindLong(1, Long.valueOf(j));
                return Unit.INSTANCE;
            case 5:
                PaddingValues.Absolute absolute = (PaddingValues.Absolute) obj2;
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float mo236toPx0680j_43 = drawScope.mo236toPx0680j_4(2.0f);
                LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
                drawScope.mo729drawLineNGM6Ib0(this.f$1, (Float.floatToRawIntBits(drawScope.mo236toPx0680j_4(SpacerKt.calculateStartPadding(absolute, layoutDirection2))) << 32) | (Float.floatToRawIntBits(drawScope.mo236toPx0680j_4(absolute.top)) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(drawScope.mo236toPx0680j_4(SpacerKt.calculateStartPadding(absolute, layoutDirection2))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - drawScope.mo236toPx0680j_4(absolute.bottom)) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : mo236toPx0680j_43, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                return Unit.INSTANCE;
            case 6:
                DrawScope drawScope2 = (DrawScope) obj;
                drawScope2.getClass();
                boolean z = ((SheetAppMessageModel.Loaded) obj2).isSolid;
                long j2 = this.f$1;
                if (z) {
                    DrawScope.m747drawRectnJ9OG0$default(drawScope2, j2, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                } else {
                    m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r0, new Pair[]{new Pair(Float.valueOf(RecyclerView.DECELERATION_RATE), new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, j2, 14))), new Pair(Float.valueOf(0.5f), new Color(j2))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                    DrawScope.m746drawRectAsUm42w$default(drawScope2, m132linearGradientmHitzGk, 0L, 0L, RecyclerView.DECELERATION_RATE, null, null, 0, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                }
                return Unit.INSTANCE;
            case 7:
                DrawScope drawScope3 = (DrawScope) obj;
                drawScope3.getClass();
                for (AxisPlacement axisPlacement : (List) obj2) {
                    drawScope3.mo729drawLineNGM6Ib0(this.f$1, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(axisPlacement.yOffset) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope3.mo753getSizeNHjbRc() >> 32))) << 32) | (Float.floatToRawIntBits(axisPlacement.yOffset) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : drawScope3.mo236toPx0680j_4(1.0f), (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                }
                return Unit.INSTANCE;
            case 8:
                ShadowedSyncEntityStore shadowedSyncEntityStore = (ShadowedSyncEntityStore) obj2;
                SyncEntityStore syncEntityStore = shadowedSyncEntityStore.mainStore;
                RealClientSyncErrorReporter realClientSyncErrorReporter = shadowedSyncEntityStore.errorReporter;
                SyncEntityStore syncEntityStore2 = shadowedSyncEntityStore.shadowStore;
                List allEntities = syncEntityStore.getAllEntities(j);
                try {
                    List allEntities2 = syncEntityStore2.getAllEntities(j);
                    Set set = CollectionsKt.toSet(allEntities);
                    Set set2 = CollectionsKt.toSet(allEntities2);
                    if (!Intrinsics.areEqual(set, set2)) {
                        int i3 = SyncEntityShadowDivergence.$r8$clinit;
                        Map mapOf = MapsKt__MapsKt.mapOf(new Pair("limit", String.valueOf(100L)), new Pair("offset", String.valueOf(j)));
                        Class<?> cls = syncEntityStore.getClass();
                        ReflectionFactory reflectionFactory = Reflection.factory;
                        realClientSyncErrorReporter.reportNonFatal(Intents.create("getAllEntities", mapOf, reflectionFactory.getOrCreateKotlinClass(cls), reflectionFactory.getOrCreateKotlinClass(syncEntityStore2.getClass()), set, set2));
                    }
                } catch (Throwable th) {
                    int i4 = SyncEntityShadowException.$r8$clinit;
                    Class<?> cls2 = syncEntityStore.getClass();
                    ReflectionFactory reflectionFactory2 = Reflection.factory;
                    realClientSyncErrorReporter.reportNonFatal(Keyboards.create("There was an exception in getAllEntities", th, reflectionFactory2.getOrCreateKotlinClass(cls2), reflectionFactory2.getOrCreateKotlinClass(syncEntityStore2.getClass())));
                }
                return allEntities;
            case 9:
                InvestingEarningsViewModel investingEarningsViewModel = (InvestingEarningsViewModel) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                linearLayout.getClass();
                Views.resizeAndBind$default(linearLayout, ((InvestingEarningsViewModel.Content) investingEarningsViewModel).earningsModels.size(), null, new FinancialBarGraphKt$$ExternalSyntheticLambda16(linearLayout, 1), new InvestingEarningsTileKt$$ExternalSyntheticLambda3(investingEarningsViewModel, j, ColorKt.m694toArgb8_81llA(ThemeHelpersKt.themeInfo(linearLayout).arcadeColors.semantic.icon.standard)), 14);
                return Unit.INSTANCE;
            default:
                InvestingAnalystGraphView investingAnalystGraphView = (InvestingAnalystGraphView) obj;
                investingAnalystGraphView.getClass();
                int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(ThemeHelpersKt.themeInfo(investingAnalystGraphView).arcadeColors.semantic.icon.standard);
                InvestingAnalystOpinionsViewModel$Content.InvestingAnalystOpinionsGraphModel investingAnalystOpinionsGraphModel = ((InvestingAnalystOpinionsViewModel$Content) ((X509CertChainUtils) obj2)).analystOpinionsModels;
                int m694toArgb8_81llA2 = ColorKt.m694toArgb8_81llA(j);
                AppCompatTextView appCompatTextView = investingAnalystGraphView.recommendTextView;
                AppCompatImageView appCompatImageView = investingAnalystGraphView.dotView;
                Drawable background = investingAnalystGraphView.barView.getBackground();
                background.getClass();
                ((GradientDrawable) background).setColor(m694toArgb8_81llA2);
                Drawable background2 = appCompatImageView.getBackground();
                background2.getClass();
                ((GradientDrawable) background2).setColor(m694toArgb8_81llA);
                investingAnalystGraphView.recommendTipView.setColorFilter(m694toArgb8_81llA);
                Drawable background3 = appCompatTextView.getBackground();
                background3.getClass();
                ((GradientDrawable) background3).setColor(m694toArgb8_81llA);
                appCompatTextView.setText(investingAnalystOpinionsGraphModel.recommendLabel);
                ContourLayout.updateLayoutBy$default(investingAnalystGraphView, appCompatImageView, ContourLayout.leftTo(new GLSceneScope$$ExternalSyntheticLambda10(25, investingAnalystGraphView, investingAnalystOpinionsGraphModel)), null, 2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LocalMapPinKt$$ExternalSyntheticLambda5(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }
}
