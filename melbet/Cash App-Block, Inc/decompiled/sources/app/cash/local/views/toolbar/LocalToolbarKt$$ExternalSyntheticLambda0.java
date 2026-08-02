package app.cash.local.views.toolbar;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.core.util.TypedValueCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directdeposit.views.DirectDepositDialogKt;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt;
import com.squareup.cash.savings.applets.viewmodels.SavingsAppletTileViewModel;
import com.squareup.cash.screens.Redacted;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalToolbarKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda0(float f, ToolbarModel toolbarModel) {
        this.$r8$classId = 0;
        this.f$0 = f;
        this.f$1 = toolbarModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        float f = this.f$0;
        Object obj3 = this.f$1;
        switch (i) {
            case 0:
                ToolbarModel toolbarModel = (ToolbarModel) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    gapComposer.startReplaceGroup(233064975);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier alpha = AlphaKt.alpha(companion, f);
                    if (f == RecyclerView.DECELERATION_RATE || StringsKt.isBlank(toolbarModel.title)) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new Yoga$$ExternalSyntheticLambda0(22);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        alpha = alpha.then(SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue));
                    }
                    Modifier modifier = alpha;
                    gapComposer.end(false);
                    String str = toolbarModel.title;
                    gapComposer.startReplaceGroup(233072339);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.semantic.text.prominent;
                    gapComposer.end(false);
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4016, j, (Composer) gapComposer, modifier, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                zzadn.CashGreenProgressBarVisual(f, (Float) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                Redacted redacted = (Redacted) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    gapComposer2.skipToGroupEnd();
                } else if (redacted != null) {
                    gapComposer2.startReplaceGroup(-1745681464);
                    String str2 = (String) redacted.getValue();
                    Object consume = gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                    consume.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, TextStyle.m994copyp1EtxEg$default((TextStyle) consume, 0L, 0L, null, FontFamily.Monospace, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1745521969);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m277height3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), f), 0.5f);
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j2 = colors2.semantic.background.subtle;
                    ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                    Object obj4 = DefaultSizes.border.entries;
                    VisibleKt.ShimmerBox(ImageKt.m177backgroundbw27NRU(fillMaxWidth, j2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(6.0f)), false, null, DirectDepositDialogKt.lambda$1901909425, gapComposer2, 3072, 6);
                    gapComposer2.end(false);
                }
                break;
            case 3:
                PoolsAppletTileModel.Installed installed = (PoolsAppletTileModel.Installed) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    PoolsAppletTileKt.m3715PoolsSharedVisualTDGSqEk(installed.activePools, installed.overflowCount, f, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                TypedValueCompat.m1100SavingsVisualziNgDLE((SavingsAppletTileViewModel.Installed) obj3, f, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda0(float f, Float f2, int i) {
        this.$r8$classId = 1;
        this.f$0 = f;
        this.f$1 = f2;
    }

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda0(SavingsAppletTileViewModel.Installed installed, float f, int i) {
        this.$r8$classId = 4;
        this.f$1 = installed;
        this.f$0 = f;
    }

    public /* synthetic */ LocalToolbarKt$$ExternalSyntheticLambda0(Object obj, float f, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = f;
    }
}
