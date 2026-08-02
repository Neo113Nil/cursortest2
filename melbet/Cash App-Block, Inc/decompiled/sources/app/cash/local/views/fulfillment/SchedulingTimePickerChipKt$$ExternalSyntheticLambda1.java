package app.cash.local.views.fulfillment;

import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
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
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.util.Strings;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SchedulingTimePickerChipKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ SchedulingTimePickerChipKt$$ExternalSyntheticLambda1(String str, String str2, int i, boolean z) {
        this.f$1 = str;
        this.f$2 = str2;
        this.f$0 = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterHorizontally, gapComposer, 54);
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
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    boolean z = this.f$0;
                    if (z) {
                        gapComposer.startReplaceGroup(1010013130);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors.semantic.text.inverse;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1010084585);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors2.semantic.text.standard;
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, this.f$1, (Map) null, (Function1) null, false);
                    if (z) {
                        gapComposer.startReplaceGroup(1010323626);
                        j2 = Strings.getColors(gapComposer).semantic.text.inverse;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(1010395019);
                        j2 = Strings.getColors(gapComposer).semantic.text.subtle;
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j2, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, this.f$2, (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageSenderName(Updater.updateChangedFlags(1), (Composer) obj, Modifier.Companion.$$INSTANCE, this.f$1, this.f$2, this.f$0);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SchedulingTimePickerChipKt$$ExternalSyntheticLambda1(String str, String str2, boolean z) {
        this.f$0 = z;
        this.f$1 = str;
        this.f$2 = str2;
    }
}
