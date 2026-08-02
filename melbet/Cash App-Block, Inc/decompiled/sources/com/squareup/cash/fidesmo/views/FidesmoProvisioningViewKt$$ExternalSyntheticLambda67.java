package com.squareup.cash.fidesmo.views;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class FidesmoProvisioningViewKt$$ExternalSyntheticLambda67 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ FidesmoProvisioningViewKt$$ExternalSyntheticLambda67(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        String m;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        List<FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item> list = this.f$0;
        int i6 = 1;
        switch (i5) {
            case 0:
                FlowRowScope flowRowScope = (FlowRowScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                flowRowScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(flowRowScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    for (FidesmoProvisioningViewModel.Success.Provisioned.BookletGrid.Item item : list) {
                        Modifier weight = flowRowScope.weight(1.0f, Modifier.Companion.$$INSTANCE, true);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda1(i6);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Modifier semantics = SemanticsModifierKt.semantics(weight, true, (Function1) rememberedValue);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
                        String str = item.icon.arcade_id;
                        if (str == null) {
                            gapComposer.startReplaceGroup(-285816210);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-285816209);
                            Icons.Companion.getClass();
                            Icons icons = zzd.get(str);
                            icons.getClass();
                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                            gapComposer.end(false);
                        }
                        String str2 = item.title;
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                        GapComposer gapComposer2 = gapComposer;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer2, null);
                        String str3 = item.body;
                        TextStyle textStyle = ((Typography) gapComposer2.consume(staticProvidableCompositionLocal)).bodySmall;
                        Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                        } else {
                            gapComposer2.startReplaceGroup(-1762997739);
                            gapComposer2.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer2;
                        gapComposer.end(true);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    ViewfinderDefaults.SectionHeader(Room.stringResource(gapComposer3, R.string.linked_businesses_section_title), (Modifier) null, (String) null, (Function0) null, list.isEmpty() ? Room.stringResource(gapComposer3, R.string.linked_businesses_empty) : null, gapComposer3, 0, 14);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    String stringResource = Room.stringResource(gapComposer4, R.string.linked_businesses_about_section_title);
                    List list2 = list;
                    boolean z = list2 instanceof Collection;
                    if (!z || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((CashAppPaySettingsRowViewModel$BusinessViewModel) it.next()).actionType == SyncBusinessGrant.ActionType.RECURRING_DEPOSITS) {
                                gapComposer4.startReplaceGroup(-1481497965);
                                if (!z || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((CashAppPaySettingsRowViewModel$BusinessViewModel) it2.next()).renderingBehavior == SyncBusinessGrant.RenderingBehavior.AFTERPAY) {
                                            i = -1481329449;
                                            i2 = R.string.linked_business_about_section_description_sq_btc_with_ap_conversions;
                                            m = re$$ExternalSyntheticOutline0.m(gapComposer4, i, i2, gapComposer4, false);
                                            gapComposer4.end(false);
                                            ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, (String) null, (Function0) null, m, gapComposer4, 0, 14);
                                        }
                                    }
                                }
                                i = -1481162049;
                                i2 = R.string.linked_business_about_section_description_sq_btc_conversions;
                                m = re$$ExternalSyntheticOutline0.m(gapComposer4, i, i2, gapComposer4, false);
                                gapComposer4.end(false);
                                ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, (String) null, (Function0) null, m, gapComposer4, 0, 14);
                            }
                        }
                    }
                    gapComposer4.startReplaceGroup(-47772669);
                    if (!z || !list2.isEmpty()) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            if (((CashAppPaySettingsRowViewModel$BusinessViewModel) it3.next()).renderingBehavior == SyncBusinessGrant.RenderingBehavior.AFTERPAY) {
                                i3 = -1480797458;
                                i4 = R.string.linked_business_with_ap_about_section_description;
                                m = re$$ExternalSyntheticOutline0.m(gapComposer4, i3, i4, gapComposer4, false);
                                gapComposer4.end(false);
                                ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, (String) null, (Function0) null, m, gapComposer4, 0, 14);
                            }
                        }
                    }
                    i3 = -1480684618;
                    i4 = R.string.linked_business_about_section_description;
                    m = re$$ExternalSyntheticOutline0.m(gapComposer4, i3, i4, gapComposer4, false);
                    gapComposer4.end(false);
                    ViewfinderDefaults.SectionHeader(stringResource, (Modifier) null, (String) null, (Function0) null, m, gapComposer4, 0, 14);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
