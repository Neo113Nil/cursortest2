package com.squareup.cash.arcade.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.common.composeui.BannerColors;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;

/* loaded from: classes5.dex */
public final /* synthetic */ class ToastKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Function0 f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ int f$9;

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda8(Modifier modifier, MarketingMessageViewModel.OfferPreview.SheetDetails sheetDetails, LocalColor localColor, LocalColor localColor2, LocalImage localImage, String str, Function0 function0, Function0 function02, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = sheetDetails;
        this.f$2 = localColor;
        this.f$3 = localColor2;
        this.f$5 = localImage;
        this.f$4 = str;
        this.f$6 = function0;
        this.f$7 = function02;
        this.f$9 = i;
        this.f$10 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$1;
        int i2 = this.f$9;
        Object obj4 = this.f$7;
        Object obj5 = this.f$4;
        Object obj6 = this.f$0;
        Object obj7 = this.f$5;
        Object obj8 = this.f$3;
        Object obj9 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                ModalKt.m3380ToastBAHpl2s((Modifier) obj6, this.f$1, (ComposableLambdaImpl) obj9, (Function3) obj8, (Function2) obj5, (Function3) obj7, this.f$6, (Duration) obj4, (Composer) obj, updateChangedFlags, this.f$10);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                MarketingMessageKt.MarketingMessageOfferSheetContent((Modifier) obj6, (MarketingMessageViewModel.OfferPreview.SheetDetails) obj3, (LocalColor) obj9, (LocalColor) obj8, (LocalImage) obj7, (String) obj5, this.f$6, (Function0) obj4, (Composer) obj, updateChangedFlags2, this.f$10);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                AfterpaySearchViewKt.AfterpayAppletError((String) obj6, (String) obj3, (String) obj9, (String) obj8, (String) obj7, this.f$6, (Function0) obj5, (Function0) obj4, (Composer) obj, updateChangedFlags3, this.f$10);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                VisibleKt.ArcadeBannerCard((Icons) obj3, (String) obj9, (Modifier) obj6, (String) obj8, (Function2) obj5, (String) obj7, this.f$6, (BannerColors) obj4, (Composer) obj, updateChangedFlags4, this.f$10);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                AlphaKt.ExpressivePreview((Image) obj3, (Color) obj9, (List) obj8, (String) obj7, this.f$6, (Modifier) obj6, (Color) obj5, (List) obj4, (Composer) obj, updateChangedFlags5, this.f$10);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda8(Modifier modifier, Object obj, ComposableLambdaImpl composableLambdaImpl, Function3 function3, Function2 function2, Function3 function32, Function0 function0, Duration duration, int i, int i2) {
        this.f$0 = modifier;
        this.f$1 = obj;
        this.f$2 = composableLambdaImpl;
        this.f$3 = function3;
        this.f$4 = function2;
        this.f$5 = function32;
        this.f$6 = function0;
        this.f$7 = duration;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda8(Icons icons, String str, Modifier modifier, String str2, Function2 function2, String str3, Function0 function0, BannerColors bannerColors, int i, int i2) {
        this.f$1 = icons;
        this.f$2 = str;
        this.f$0 = modifier;
        this.f$3 = str2;
        this.f$4 = function2;
        this.f$5 = str3;
        this.f$6 = function0;
        this.f$7 = bannerColors;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda8(Image image, Color color, List list, String str, Function0 function0, Modifier modifier, Color color2, List list2, int i, int i2) {
        this.f$1 = image;
        this.f$2 = color;
        this.f$3 = list;
        this.f$5 = str;
        this.f$6 = function0;
        this.f$0 = modifier;
        this.f$4 = color2;
        this.f$7 = list2;
        this.f$9 = i;
        this.f$10 = i2;
    }

    public /* synthetic */ ToastKt$$ExternalSyntheticLambda8(String str, String str2, String str3, String str4, String str5, Function0 function0, Function0 function02, Function0 function03, int i, int i2) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
        this.f$5 = str5;
        this.f$6 = function0;
        this.f$4 = function02;
        this.f$7 = function03;
        this.f$9 = i;
        this.f$10 = i2;
    }
}
