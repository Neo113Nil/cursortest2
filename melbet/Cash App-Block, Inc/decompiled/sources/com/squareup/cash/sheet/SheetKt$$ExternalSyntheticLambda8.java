package com.squareup.cash.sheet;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class SheetKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ SheetKt$$ExternalSyntheticLambda8(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue2 = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(1382868815);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, str, gapComposer2, intValue2 & 14, 0);
                gapComposer2.end(false);
                return rememberAsyncImagePainter;
            case 2:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue3 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                gapComposer3.startReplaceGroup(-622939692);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, str, gapComposer3, intValue3 & 14, 0);
                gapComposer3.end(false);
                return rememberAsyncImagePainter2;
            case 3:
                Composer composer2 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer2;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue5 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer5 = (GapComposer) ((Composer) obj2);
                gapComposer5.startReplaceGroup(-876477940);
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, str, gapComposer5, intValue5 & 14, 0);
                gapComposer5.end(false);
                return rememberAsyncImagePainter3;
            case 5:
                Composer composer3 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer3;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer4 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer4;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                PainterRequest painterRequest4 = (PainterRequest) obj;
                int intValue8 = ((Integer) obj3).intValue();
                painterRequest4.getClass();
                GapComposer gapComposer8 = (GapComposer) ((Composer) obj2);
                gapComposer8.startReplaceGroup(821860547);
                AsyncImagePainter rememberAsyncImagePainter4 = AsyncImageKt.rememberAsyncImagePainter(painterRequest4, str, gapComposer8, intValue8 & 14, 0);
                gapComposer8.end(false);
                return rememberAsyncImagePainter4;
            case 8:
                PainterRequest painterRequest5 = (PainterRequest) obj;
                int intValue9 = ((Integer) obj3).intValue();
                painterRequest5.getClass();
                GapComposer gapComposer9 = (GapComposer) ((Composer) obj2);
                gapComposer9.startReplaceGroup(760407394);
                AsyncImagePainter rememberAsyncImagePainter5 = AsyncImageKt.rememberAsyncImagePainter(painterRequest5, str, gapComposer9, intValue9 & 14, 0);
                gapComposer9.end(false);
                return rememberAsyncImagePainter5;
            case 9:
                PainterRequest painterRequest6 = (PainterRequest) obj;
                int intValue10 = ((Integer) obj3).intValue();
                painterRequest6.getClass();
                GapComposer gapComposer10 = (GapComposer) ((Composer) obj2);
                gapComposer10.startReplaceGroup(-202528322);
                AsyncImagePainter rememberAsyncImagePainter6 = AsyncImageKt.rememberAsyncImagePainter(painterRequest6, str, gapComposer10, intValue10 & 14, 0);
                gapComposer10.end(false);
                return rememberAsyncImagePainter6;
            case 10:
                PainterRequest painterRequest7 = (PainterRequest) obj;
                int intValue11 = ((Integer) obj3).intValue();
                painterRequest7.getClass();
                GapComposer gapComposer11 = (GapComposer) ((Composer) obj2);
                gapComposer11.startReplaceGroup(562820978);
                AsyncImagePainter rememberAsyncImagePainter7 = AsyncImageKt.rememberAsyncImagePainter(painterRequest7, str, gapComposer11, intValue11 & 14, 0);
                gapComposer11.end(false);
                return rememberAsyncImagePainter7;
            case 11:
                PainterRequest painterRequest8 = (PainterRequest) obj;
                int intValue12 = ((Integer) obj3).intValue();
                painterRequest8.getClass();
                GapComposer gapComposer12 = (GapComposer) ((Composer) obj2);
                gapComposer12.startReplaceGroup(-1161462969);
                AsyncImagePainter rememberAsyncImagePainter8 = AsyncImageKt.rememberAsyncImagePainter(painterRequest8, str, gapComposer12, intValue12 & 14, 0);
                gapComposer12.end(false);
                return rememberAsyncImagePainter8;
            case 12:
                PainterRequest painterRequest9 = (PainterRequest) obj;
                int intValue13 = ((Integer) obj3).intValue();
                painterRequest9.getClass();
                GapComposer gapComposer13 = (GapComposer) ((Composer) obj2);
                gapComposer13.startReplaceGroup(75318049);
                AsyncImagePainter rememberAsyncImagePainter9 = AsyncImageKt.rememberAsyncImagePainter(painterRequest9, str, gapComposer13, intValue13 & 14, 0);
                gapComposer13.end(false);
                return rememberAsyncImagePainter9;
            case 13:
                Composer composer5 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer5;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    if (str == null) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer14, 262008281, R.string.personalize_payment_pay, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(262007692);
                        gapComposer14.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer6 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer6;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    if (str == null) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer15, -1285849968, R.string.personalize_payment_pay, gapComposer15, false);
                    } else {
                        gapComposer15.startReplaceGroup(-1285850557);
                        gapComposer15.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                PainterRequest painterRequest10 = (PainterRequest) obj;
                int intValue16 = ((Integer) obj3).intValue();
                painterRequest10.getClass();
                GapComposer gapComposer16 = (GapComposer) ((Composer) obj2);
                gapComposer16.startReplaceGroup(1253733633);
                AsyncImagePainter rememberAsyncImagePainter10 = AsyncImageKt.rememberAsyncImagePainter(painterRequest10, str, gapComposer16, intValue16 & 14, 0);
                gapComposer16.end(false);
                return rememberAsyncImagePainter10;
            case 16:
                Composer composer7 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer7;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                Composer composer8 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer8;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                Composer composer9 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer9;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer10 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer10;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer20, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer11 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer11, 0);
                GapComposer gapComposer21 = (GapComposer) composer11;
                int hashCode = Long.hashCode(gapComposer21.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer21.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer11, Modifier.Companion.$$INSTANCE);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer22 = (GapComposer) composer11;
                if (gapComposer22.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer22.startReusableNode();
                if (gapComposer22.inserting) {
                    gapComposer22.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer22.useNode();
                }
                Updater.m576setimpl(composer11, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer11, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer11, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer11, materializeModifier, ComposeUiNode.Companion.SetModifier);
                DBUtil.SpacerWithinSectionSmall(0, 1, composer11, null);
                TextStyle textStyle = ((Typography) gapComposer22.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors = (Colors) gapComposer22.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer22, -1762997026, gapComposer22, false);
                } else {
                    gapComposer22.startReplaceGroup(-1762997739);
                    gapComposer22.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, composer11, (Modifier) null, textStyle, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                gapComposer22.end(true);
                return Unit.INSTANCE;
            case 21:
                Composer composer12 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer23 = (GapComposer) composer12;
                if (gapComposer23.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer23, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer13 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer13;
                if (gapComposer24.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer14 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer14;
                if (gapComposer25.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer25, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer15 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer15;
                if (gapComposer26.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer16 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer16;
                if (gapComposer27.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer27, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer17 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer17;
                if (gapComposer28.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer28, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer18 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer18;
                if (gapComposer29.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer19 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer19;
                if (gapComposer30.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer30, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                    Trace.m1191Iconww6aTOc(Icons.AlertFill16, (String) null, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 0L, gapComposer30, 438, 8);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer20 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer31 = (GapComposer) composer20;
                if (gapComposer31.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer31, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                    Trace.m1191Iconww6aTOc(Icons.SubtlePush16, (String) null, SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), 0L, gapComposer31, 438, 8);
                } else {
                    gapComposer31.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
