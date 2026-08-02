package com.squareup.cash.formview.components;

import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarSizeOverride;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.arcade.ArcadeFormSelectedInstrumentKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormBlocker.Element.SelectedInstrumentElement f$0;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda2(FormBlocker.Element.SelectedInstrumentElement selectedInstrumentElement, int i) {
        this.$r8$classId = 2;
        this.f$0 = selectedInstrumentElement;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        FormBlocker.Element.SelectedInstrumentElement selectedInstrumentElement = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ArcadeFormSelectedInstrumentKt.ArcadeFormSelectedInstrument(selectedInstrumentElement, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    Strings.getSizes(gapComposer2).getClass();
                    DefaultSizes.spacing.getClass();
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 48);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer2.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    UiAvatar uiAvatar = selectedInstrumentElement.avatar;
                    if (uiAvatar == null) {
                        gapComposer2.startReplaceGroup(1383095563);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1383095564);
                        TextViewKt.Avatar(new AvatarSizeOverride(20.0f, 10.0f, 56, Room.getSp(10)), AvatarsKt.toAvatarEntry(uiAvatar, null, gapComposer2, 1), null, false, false, gapComposer2, 6, 28);
                        gapComposer2.end(false);
                    }
                    String str = selectedInstrumentElement.title;
                    if (str == null || StringsKt.isBlank(str)) {
                        gapComposer2.startReplaceGroup(1383525162);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1383327196);
                        String str2 = selectedInstrumentElement.title;
                        str2.getClass();
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    }
                    String str3 = selectedInstrumentElement.subtitle;
                    if (str3 == null || StringsKt.isBlank(str3)) {
                        gapComposer2.startReplaceGroup(1383775146);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1383577180);
                        String str4 = selectedInstrumentElement.subtitle;
                        str4.getClass();
                        Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    }
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                ArcadeFormSelectedInstrumentKt.ArcadeFormSelectedInstrument(selectedInstrumentElement, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda2(FormBlocker.Element.SelectedInstrumentElement selectedInstrumentElement, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = selectedInstrumentElement;
    }
}
