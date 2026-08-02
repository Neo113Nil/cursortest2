package com.squareup.cash.db2;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.airbnb.lottie.LottieCompositionFactory;
import com.knotapi.knot.utilities.LoaderView$$ExternalSyntheticLambda1;
import com.knotapi.knot.utilities.LoaderView$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.lottie.CashLottieAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncDetailsQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ SyncDetailsQueries$$ExternalSyntheticLambda2(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindString(0, str);
                break;
            case 1:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                androidStatement2.bindString(0, str);
                break;
            case 2:
                AndroidStatement androidStatement3 = (AndroidStatement) obj;
                androidStatement3.getClass();
                androidStatement3.bindString(0, str);
                break;
            case 3:
                AndroidStatement androidStatement4 = (AndroidStatement) obj;
                androidStatement4.getClass();
                androidStatement4.bindString(0, str);
                break;
            case 4:
                AndroidStatement androidStatement5 = (AndroidStatement) obj;
                androidStatement5.getClass();
                androidStatement5.bindString(0, str);
                break;
            case 5:
                AndroidStatement androidStatement6 = (AndroidStatement) obj;
                androidStatement6.getClass();
                androidStatement6.bindString(0, str);
                break;
            case 6:
                AndroidStatement androidStatement7 = (AndroidStatement) obj;
                androidStatement7.getClass();
                androidStatement7.bindString(0, str);
                break;
            case 7:
                AndroidStatement androidStatement8 = (AndroidStatement) obj;
                androidStatement8.getClass();
                androidStatement8.bindString(0, str);
                break;
            case 8:
                AndroidStatement androidStatement9 = (AndroidStatement) obj;
                androidStatement9.getClass();
                androidStatement9.bindString(0, str);
                break;
            case 9:
                AndroidStatement androidStatement10 = (AndroidStatement) obj;
                androidStatement10.getClass();
                androidStatement10.bindBoolean(0, Boolean.TRUE);
                androidStatement10.bindString(1, str);
                break;
            case 10:
                AndroidStatement androidStatement11 = (AndroidStatement) obj;
                androidStatement11.getClass();
                androidStatement11.bindString(0, str);
                break;
            case 11:
                AndroidStatement androidStatement12 = (AndroidStatement) obj;
                androidStatement12.getClass();
                androidStatement12.bindString(0, str);
                break;
            case 12:
                AndroidStatement androidStatement13 = (AndroidStatement) obj;
                androidStatement13.getClass();
                androidStatement13.bindString(0, str);
                break;
            case 13:
                AndroidStatement androidStatement14 = (AndroidStatement) obj;
                androidStatement14.getClass();
                androidStatement14.bindString(0, str);
                break;
            case 14:
                AndroidStatement androidStatement15 = (AndroidStatement) obj;
                androidStatement15.getClass();
                androidStatement15.bindString(0, str);
                break;
            case 15:
                AndroidStatement androidStatement16 = (AndroidStatement) obj;
                androidStatement16.getClass();
                androidStatement16.bindString(0, str);
                break;
            case 16:
                AndroidStatement androidStatement17 = (AndroidStatement) obj;
                androidStatement17.getClass();
                androidStatement17.bindString(0, str);
                break;
            case 17:
                AndroidStatement androidStatement18 = (AndroidStatement) obj;
                androidStatement18.getClass();
                androidStatement18.bindString(0, str);
                break;
            case 18:
                AndroidStatement androidStatement19 = (AndroidStatement) obj;
                androidStatement19.getClass();
                androidStatement19.bindString(0, str);
                break;
            case 19:
                AndroidStatement androidStatement20 = (AndroidStatement) obj;
                androidStatement20.getClass();
                androidStatement20.bindString(0, str);
                break;
            case 20:
                AndroidStatement androidStatement21 = (AndroidStatement) obj;
                androidStatement21.getClass();
                androidStatement21.bindString(0, str);
                break;
            case 21:
                AndroidStatement androidStatement22 = (AndroidStatement) obj;
                androidStatement22.getClass();
                androidStatement22.bindString(0, str);
                break;
            case 22:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
                break;
            case 23:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, str);
                break;
            case 24:
                PayerCustomerRowModel payerCustomerRowModel = (PayerCustomerRowModel) obj;
                payerCustomerRowModel.getClass();
                break;
            case 25:
                AndroidStatement androidStatement23 = (AndroidStatement) obj;
                androidStatement23.getClass();
                androidStatement23.bindString(0, str);
                break;
            case 26:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver3, str);
                break;
            case 27:
                CashLottieAnimationView cashLottieAnimationView = (CashLottieAnimationView) obj;
                cashLottieAnimationView.getClass();
                LottieCompositionFactory.fromUrl(cashLottieAnimationView.getContext(), str).addListener(new LoaderView$$ExternalSyntheticLambda1(cashLottieAnimationView, 3)).addFailureListener(new LoaderView$$ExternalSyntheticLambda2(1));
                break;
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver4, str);
                break;
            default:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver5, str);
                break;
        }
        return Unit.INSTANCE;
    }
}
