package com.squareup.cash.investing.components.families;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import coil3.RealImageLoader;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.instruments.views.InstrumentCellKt$$ExternalSyntheticLambda11;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Image;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import org.commonmark.internal.util.LinkScanner;

/* loaded from: classes6.dex */
public final /* synthetic */ class DependentAutoInvestViewKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ char f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ DependentAutoInvestViewKt$$ExternalSyntheticLambda4(RealImageLoader realImageLoader, LinkScanner linkScanner, char c) {
        this.$r8$classId = 1;
        this.f$2 = realImageLoader;
        this.f$0 = linkScanner;
        this.f$1 = c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        char c = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ChannelsKt__ChannelsKt.Icon((LinkScanner) obj4, c, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                LinkScanner linkScanner = (LinkScanner) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    InvestingCryptoAvatarContentModel$Image investingCryptoAvatarContentModel$Image = (InvestingCryptoAvatarContentModel$Image) linkScanner;
                    ChannelsKt__ChannelsKt.StackedAvatars(realImageLoader, investingCryptoAvatarContentModel$Image.image, investingCryptoAvatarContentModel$Image.accentColor, this.f$1, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                ChannelsKt__ChannelsKt.Icon((LinkScanner) obj4, c, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ChannelsKt__ChannelsKt.Icon((LinkScanner) obj4, c, (RealImageLoader) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                ColorModel colorModel = (ColorModel) obj4;
                Image image = (Image) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    StackedAvatarsKt.StackedAvatars(new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(colorModel, Character.valueOf(c), null, image, null, null, null, false, false, false, 4084)), new InstrumentCellKt$$ExternalSyntheticLambda11(22), SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 40.0f), null, gapComposer2, 392, 8);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DependentAutoInvestViewKt$$ExternalSyntheticLambda4(ColorModel colorModel, char c, Image image) {
        this.$r8$classId = 4;
        this.f$0 = colorModel;
        this.f$1 = c;
        this.f$2 = image;
    }

    public /* synthetic */ DependentAutoInvestViewKt$$ExternalSyntheticLambda4(LinkScanner linkScanner, char c, RealImageLoader realImageLoader, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = linkScanner;
        this.f$1 = c;
        this.f$2 = realImageLoader;
    }
}
