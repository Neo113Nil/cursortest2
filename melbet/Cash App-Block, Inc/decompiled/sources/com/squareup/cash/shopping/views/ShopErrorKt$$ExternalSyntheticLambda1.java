package com.squareup.cash.shopping.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class ShopErrorKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Modifier f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ ShopErrorKt$$ExternalSyntheticLambda1(String str, String str2, String str3, Modifier modifier, Function0 function0, int i) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = modifier;
        this.f$4 = function0;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                ShopErrorKt.ShopError(Updater.updateChangedFlags(this.f$5 | 1), (Composer) obj, this.f$3, this.f$0, this.f$1, this.f$2, this.f$4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.InvalidEmailDialog(Updater.updateChangedFlags(this.f$5 | 1), (Composer) obj, this.f$3, this.f$0, this.f$1, this.f$2, this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.FailedMessageSubmitDialog(Updater.updateChangedFlags(this.f$5 | 1), (Composer) obj, this.f$3, this.f$0, this.f$1, this.f$2, this.f$4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ShopErrorKt$$ExternalSyntheticLambda1(Modifier modifier, Function0 function0, String str, String str2, String str3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$3 = modifier;
        this.f$4 = function0;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$5 = i;
    }
}
