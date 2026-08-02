package app.cash.local.views.wallet;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.moneybot.views.card.InsightChartKt;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda6;
import com.squareup.cash.securityhub.views.RecoveryGuideViewKt;
import com.squareup.cash.support.views.article.ArticleViewKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda16(int i, Function1 function1, List list) {
        this.$r8$classId = 5;
        this.f$1 = i;
        this.f$2 = function1;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Function1 function1 = this.f$2;
        int i2 = this.f$1;
        List list = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ArrayList arrayList = ((SegmentedTab) list.get(i2)).widgets;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    LocalHomeViewKt.m1337WalletWidgetList_UE9MAk(m300paddingVpY3zN4$default, arrayList, RecyclerView.DECELERATION_RATE, colors.surface.money.background, this.f$2, gapComposer, 390, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.LocalSegmentedTabs(list, i2, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                BenefitsHomeViewKt.DisclosureSection(list, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                BenefitsHubViewKt.Disclosures(list, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                BugReportingViewKt.ScreenshotsSection(list, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 5:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changedInstance = gapComposer2.changedInstance(list);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda6(list, 6);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    ModalKt.SegmentedControl(this.f$1, this.f$2, fillMaxWidth, (Function1) rememberedValue, gapComposer2, MLKEMEngine.KyberPolyBytes, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                InsightChartKt.ToggleButtons(list, i2, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                RecoveryGuideViewKt.BookletCarousel(list, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ArticleViewKt.ContactSection(list, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ArticleViewKt.ContactSection(list, function1, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda16(List list, int i, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = list;
        this.f$1 = i;
        this.f$2 = function1;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda16(List list, int i, Function1 function1, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = list;
        this.f$1 = i;
        this.f$2 = function1;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda16(List list, Function1 function1, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = list;
        this.f$2 = function1;
        this.f$1 = i;
    }
}
