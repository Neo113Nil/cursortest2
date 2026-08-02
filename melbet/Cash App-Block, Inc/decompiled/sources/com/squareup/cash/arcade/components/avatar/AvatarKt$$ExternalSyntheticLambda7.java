package com.squareup.cash.arcade.components.avatar;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.activity.views.compact.RealCompactActivityAvatarScope;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda7(int i, AvatarSizeImpl avatarSizeImpl, long j, int i2) {
        this.f$0 = i;
        this.f$1 = avatarSizeImpl;
        this.f$2 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        long j = this.f$2;
        int i2 = this.f$0;
        Object obj3 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TextViewKt.m3620OverflowCountAvatarXOJAsU(this.f$0, (AvatarSizeImpl) obj3, this.f$2, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.m1301CheckoutOrderSummaryContentiJQMabo((LocalCheckoutOrderSummaryViewModel) obj3, this.f$2, (Composer) obj, Updater.updateChangedFlags(1), this.f$0);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((RealCompactActivityAvatarScope) obj3).m2974AvatarOadGlvw(j, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                String str = (String) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.startReplaceGroup(1243502779);
                    gapComposer.end(false);
                    ImageKt.Image(Countries.painterResource(i2, 0, gapComposer), str, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable, 60);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda7(long j, String str, int i) {
        this.f$0 = i;
        this.f$1 = str;
        this.f$2 = j;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda7(LocalCheckoutOrderSummaryViewModel localCheckoutOrderSummaryViewModel, long j, int i, int i2) {
        this.f$1 = localCheckoutOrderSummaryViewModel;
        this.f$2 = j;
        this.f$0 = i2;
    }

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda7(RealCompactActivityAvatarScope realCompactActivityAvatarScope, long j, int i) {
        this.f$1 = realCompactActivityAvatarScope;
        this.f$2 = j;
        this.f$0 = i;
    }
}
