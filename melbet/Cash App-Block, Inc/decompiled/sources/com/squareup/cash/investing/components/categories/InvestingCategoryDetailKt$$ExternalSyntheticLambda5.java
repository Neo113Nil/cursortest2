package com.squareup.cash.investing.components.categories;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class InvestingCategoryDetailKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InvestingCategoryDetailViewModel f$0;

    public /* synthetic */ InvestingCategoryDetailKt$$ExternalSyntheticLambda5(InvestingCategoryDetailViewModel investingCategoryDetailViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = investingCategoryDetailViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        InvestingCategoryDetailViewModel investingCategoryDetailViewModel = this.f$0;
        int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((InvestingCategoryDetailViewModel.Content) investingCategoryDetailViewModel).categoryName, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    InvestingCategoryDetailViewModel.Content content = (InvestingCategoryDetailViewModel.Content) investingCategoryDetailViewModel;
                    String urlForTheme = ThemablesKt.urlForTheme(content.categoryImage.image, gapComposer2);
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Color forTheme = ThemablesKt.forTheme(content.categoryImage.bgColor, gapComposer2);
                    forTheme.getClass();
                    long j = forTheme.value;
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", j, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.Remote.Image(urlForTheme, true, null, colors.semantic.icon.inverse, new InstrumentCellKt$$ExternalSyntheticLambda11(14), 44), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer2, 3126, 0, 2000);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                    InvestingCategoryDetailViewModel.Content content2 = (InvestingCategoryDetailViewModel.Content) investingCategoryDetailViewModel;
                    Countries.PageHeader(content2.categoryName, (Modifier) null, Expect_jvmKt.rememberComposableLambda(469124942, new InvestingCategoryDetailKt$$ExternalSyntheticLambda5(investingCategoryDetailViewModel, i2), gapComposer3), content2.categoryDescription, gapComposer3, MLKEMEngine.KyberPolyBytes, 2);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
