package com.squareup.cash.retro.views;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda5;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PaymentPlanSummaryKt$$ExternalSyntheticLambda11 implements Function3 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PaymentPlanSummaryKt$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = null;
        switch (i) {
            case 0:
                PainterRequest painterRequest = (PainterRequest) obj;
                int intValue = ((Integer) obj3).intValue();
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                gapComposer.startReplaceGroup(-274520693);
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, null, gapComposer, intValue & 14, 1);
                gapComposer.end(false);
                return rememberAsyncImagePainter;
            case 1:
                Composer composer = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer2 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
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
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.profile_personal_contact_info_alias_remove), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                Composer composer4 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.profile_contact_add_phone), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Composer composer5 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.profile_contact_add_email), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                Composer composer6 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer7, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer7, R.string.personal_info_confirmation_dialog_positive_message), (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                Composer composer7 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer8, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer8, R.string.personal_info_confirmation_dialog_negative_message), (Map) null, (Function1) null, false);
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
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.profile_taxes_change_password_button), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer9 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.profile_investing_contact_edit), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                Composer composer10 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.profile_investing_contact_remove), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer11 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer11).changed(listUnorderedScope) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    int i2 = intValue12;
                    AnnotatedString annotatedString = new AnnotatedString(Room.stringResource(gapComposer12, R.string.qr_shortcuts_onboarding_widget_label));
                    Icons icons = Icons.GridView24;
                    AnnotatedString annotatedString2 = new AnnotatedString(Room.stringResource(gapComposer12, R.string.qr_shortcuts_onboarding_widget_body));
                    int i3 = ((i2 << 15) & 458752) | MLKEMEngine.KyberPolyBytes;
                    listUnorderedScope.ListUnorderedItem(annotatedString, (Modifier) null, icons, (AnnotatedString) null, annotatedString2, gapComposer12, i3, 10);
                    listUnorderedScope.ListUnorderedItem(new AnnotatedString(Room.stringResource(gapComposer12, R.string.qr_shortcuts_onboarding_tile_label)), (Modifier) null, Icons.Qr24, (AnnotatedString) null, new AnnotatedString(Room.stringResource(gapComposer12, R.string.qr_shortcuts_onboarding_tile_body)), gapComposer12, i3, 10);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                Composer composer12 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer13, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer13, R.string.qr_shortcuts_onboarding_add_widget_cta), (Map) null, (Function1) null, false);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                Composer composer13 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer14, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer14, R.string.qr_shortcuts_onboarding_add_tile_cta), (Map) null, (Function1) null, false);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer14 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer15, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer15, R.string.qr_shortcuts_onboarding_dismiss), (Map) null, (Function1) null, false);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer15 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.profile_share), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                PainterRequest painterRequest2 = (PainterRequest) obj;
                int intValue17 = ((Integer) obj3).intValue();
                painterRequest2.getClass();
                GapComposer gapComposer17 = (GapComposer) ((Composer) obj2);
                gapComposer17.startReplaceGroup(479138054);
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest2, null, gapComposer17, intValue17 & 14, 1);
                gapComposer17.end(false);
                return rememberAsyncImagePainter2;
            case 17:
                PainterRequest painterRequest3 = (PainterRequest) obj;
                int intValue18 = ((Integer) obj3).intValue();
                painterRequest3.getClass();
                GapComposer gapComposer18 = (GapComposer) ((Composer) obj2);
                gapComposer18.startReplaceGroup(1114377483);
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest3, null, gapComposer18, intValue18 & 14, 1);
                gapComposer18.end(false);
                return rememberAsyncImagePainter3;
            case 18:
                PainterRequest painterRequest4 = (PainterRequest) obj;
                int intValue19 = ((Integer) obj3).intValue();
                painterRequest4.getClass();
                GapComposer gapComposer19 = (GapComposer) ((Composer) obj2);
                gapComposer19.startReplaceGroup(-2086582203);
                AsyncImagePainter rememberAsyncImagePainter4 = AsyncImageKt.rememberAsyncImagePainter(painterRequest4, null, gapComposer19, intValue19 & 14, 1);
                gapComposer19.end(false);
                return rememberAsyncImagePainter4;
            case 19:
                PainterRequest painterRequest5 = (PainterRequest) obj;
                int intValue20 = ((Integer) obj3).intValue();
                painterRequest5.getClass();
                GapComposer gapComposer20 = (GapComposer) ((Composer) obj2);
                gapComposer20.startReplaceGroup(1670848266);
                AsyncImagePainter rememberAsyncImagePainter5 = AsyncImageKt.rememberAsyncImagePainter(painterRequest5, null, gapComposer20, intValue20 & 14, 1);
                gapComposer20.end(false);
                return rememberAsyncImagePainter5;
            case 20:
                PainterRequest painterRequest6 = (PainterRequest) obj;
                int intValue21 = ((Integer) obj3).intValue();
                painterRequest6.getClass();
                GapComposer gapComposer21 = (GapComposer) ((Composer) obj2);
                gapComposer21.startReplaceGroup(2103453689);
                AsyncImagePainter rememberAsyncImagePainter6 = AsyncImageKt.rememberAsyncImagePainter(painterRequest6, null, gapComposer21, intValue21 & 14, 1);
                gapComposer21.end(false);
                return rememberAsyncImagePainter6;
            case 21:
                PainterRequest painterRequest7 = (PainterRequest) obj;
                int intValue22 = ((Integer) obj3).intValue();
                painterRequest7.getClass();
                GapComposer gapComposer22 = (GapComposer) ((Composer) obj2);
                gapComposer22.startReplaceGroup(1863878441);
                AsyncImagePainter rememberAsyncImagePainter7 = AsyncImageKt.rememberAsyncImagePainter(painterRequest7, null, gapComposer22, intValue22 & 14, 1);
                gapComposer22.end(false);
                return rememberAsyncImagePainter7;
            case 22:
                PainterRequest painterRequest8 = (PainterRequest) obj;
                ((Integer) obj3).getClass();
                painterRequest8.getClass();
                GapComposer gapComposer23 = (GapComposer) ((Composer) obj2);
                gapComposer23.startReplaceGroup(2127190670);
                String str = painterRequest8.url;
                Function1 function12 = painterRequest8.onError;
                if (function12 == null) {
                    gapComposer23.startReplaceGroup(-1105124544);
                } else {
                    gapComposer23.startReplaceGroup(-1105124543);
                    boolean changed = gapComposer23.changed(function12);
                    Object rememberedValue = gapComposer23.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ScoreHomeKt$$ExternalSyntheticLambda5(3, function12);
                        gapComposer23.updateRememberedValue(rememberedValue);
                    }
                    function1 = (Function1) rememberedValue;
                }
                gapComposer23.end(false);
                AsyncImagePainter m1447rememberAsyncImagePainter3HmZ8SU = AsyncImageKt.m1447rememberAsyncImagePainter3HmZ8SU(str, (RealImageLoader) gapComposer23.consume(LocalImageLoaderKt.LocalImageLoader), null, null, function1, gapComposer23, 0, 892);
                gapComposer23.end(false);
                return m1447rememberAsyncImagePainter3HmZ8SU;
            case 23:
                Composer composer16 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer24 = (GapComposer) composer16;
                if (gapComposer24.shouldExecute(intValue23 & 1, (intValue23 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer24, 0);
                    int hashCode = Long.hashCode(gapComposer24.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer24.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer24, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer24.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer24.startReusableNode();
                    if (gapComposer24.inserting) {
                        gapComposer24.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer24.useNode();
                    }
                    Updater.m576setimpl(gapComposer24, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer24, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer24, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer24, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer24, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer24, null);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer24, null);
                    gapComposer24.end(true);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer17 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer17;
                if (!gapComposer25.shouldExecute(intValue24 & 1, (intValue24 & 17) != 16)) {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer18 = (Composer) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer26 = (GapComposer) composer18;
                if (gapComposer26.shouldExecute(intValue25 & 1, (intValue25 & 17) != 16)) {
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer26, null);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer19 = (Composer) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer27 = (GapComposer) composer19;
                if (gapComposer27.shouldExecute(intValue26 & 1, (intValue26 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer27, 0);
                    int hashCode2 = Long.hashCode(gapComposer27.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer27.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer27, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer27.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer27.startReusableNode();
                    if (gapComposer27.inserting) {
                        gapComposer27.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer27.useNode();
                    }
                    Updater.m576setimpl(gapComposer27, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer27, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer27, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer27, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer27, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer27, null);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer27, null);
                    Countries.PageHeader(Room.stringResource(gapComposer27, R.string.security_hub_page_header), (Modifier) null, (Function2) null, (String) null, gapComposer27, 0, 14);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer27, null);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer27, null);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer27, null);
                    gapComposer27.end(true);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer20 = (Composer) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer28 = (GapComposer) composer20;
                if (gapComposer28.shouldExecute(intValue27 & 1, (intValue27 & 17) != 16)) {
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer28, 0);
                    int hashCode3 = Long.hashCode(gapComposer28.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer28.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer28, companion);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer28.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer28.startReusableNode();
                    if (gapComposer28.inserting) {
                        gapComposer28.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer28.useNode();
                    }
                    Updater.m576setimpl(gapComposer28, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer28, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer28, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer28, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer28, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer28, null);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer28, null);
                    gapComposer28.end(true);
                } else {
                    gapComposer28.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer21 = (Composer) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer29 = (GapComposer) composer21;
                if (gapComposer29.shouldExecute(intValue28 & 1, (intValue28 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer29, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer29, R.string.edit_info), (Map) null, (Function1) null, false);
                } else {
                    gapComposer29.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer22 = (Composer) obj2;
                int intValue29 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer30 = (GapComposer) composer22;
                if (gapComposer30.shouldExecute(intValue29 & 1, (intValue29 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer30, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer30, R.string.ok), (Map) null, (Function1) null, false);
                } else {
                    gapComposer30.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
