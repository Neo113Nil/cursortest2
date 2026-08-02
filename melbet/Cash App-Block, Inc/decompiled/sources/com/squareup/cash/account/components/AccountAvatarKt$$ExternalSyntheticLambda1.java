package com.squareup.cash.account.components;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountAvatarKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AccountAvatarKt$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(-459639100);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer, intValue & 14, 1);
                gapComposer.end(false);
                return rememberAsyncImagePainter;
            case 1:
                Composer composer = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer2, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 100.0f));
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                    Painter painterResource = Countries.painterResource(R.drawable.local_views_qr_icon, 0, gapComposer3);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Trace.m1190Iconww6aTOc(painterResource, (String) null, m285size3ABfNKs, colors.semantic.icon.standard, gapComposer3, Painter.$stable | 432, 0);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.local_views_check_in), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                Composer composer3 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.local_views_profile), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (!gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.local_views_offer_got_it), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (!gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.local_views_done), (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer8 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.local_views_map), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (!gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer10 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                Composer composer11 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((GoogleMapEngine.GoogleClusterItemAdapter) obj).getClass();
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (!gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer12 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((GoogleMapEngine.GoogleClusterItemAdapter) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (!gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue14 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer14 = (GapComposer) ((Composer) obj2);
                gapComposer14.startReplaceGroup(1737225135);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer14, intValue14 & 14, 1);
                gapComposer14.end(false);
                return rememberAsyncImagePainter2;
            case 14:
                Composer composer13 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (!gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer14 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer16.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer16.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer16, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer16.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer16.startReusableNode();
                    if (gapComposer16.inserting) {
                        gapComposer16.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer16.useNode();
                    }
                    Updater.m576setimpl(gapComposer16, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer16, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer16, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer16, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer16, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer16, null);
                    gapComposer16.end(true);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                Composer composer15 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.account_documents_download_options_download), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer16 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.account_create_business_account), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer17 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer17;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer19, R.string.account_create_personal_account), (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer18 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer18;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3838, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer20, R.string.account_sign_out), (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer19 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer21 = (GapComposer) composer19;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer21, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer21, R.string.edit_profile_toolbar_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer20 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer22 = (GapComposer) composer20;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer22, R.string.account_add_qr_to_home_screen), (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer21 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer21;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer23, R.string.qr_code_error_retry), (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue24 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer24 = (GapComposer) ((Composer) obj2);
                gapComposer24.startReplaceGroup(1613178510);
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, null, gapComposer24, intValue24 & 14, 1);
                gapComposer24.end(false);
                return rememberAsyncImagePainter3;
            case 24:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ShimmerCellsKt.ShimmerCells(6, 0, (Composer) obj2, SizeKt.fillMaxWidth(companion, 1.0f));
                return Unit.INSTANCE;
            case 25:
                Composer composer22 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer22;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer25, R.string.activity_error_action), (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer23 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer23;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer26, SizeKt.m277height3ABfNKs(companion, 32.0f));
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer24 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer24;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer27, SizeKt.m277height3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer25 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer25;
                if (gapComposer28.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    SpacerKt.Spacer(gapComposer28, SizeKt.m277height3ABfNKs(companion, 8.0f));
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer26 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer26;
                if (gapComposer29.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    AvatarsKt.ErrorActivityItem(gapComposer29, 0);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
