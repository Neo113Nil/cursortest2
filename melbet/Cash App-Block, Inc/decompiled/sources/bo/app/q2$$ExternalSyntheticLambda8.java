package bo.app;

import android.app.Activity;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.emoji2.text.MetadataRepo;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeImageUtils;
import com.braze.ui.support.ViewUtils;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet$WalletOptions;
import com.google.android.gms.wallet.zzk;
import com.squareup.cash.arcade.treehouse.ArcadeTimeline2Binding;
import com.squareup.cash.core.navigationcontainer.LegacySheetConfig;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.lending.CashCreditScoreHomeData;
import java.net.URL;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import papa.internal.InputTracker$listener$1$1$2$trigger$1;

/* loaded from: classes3.dex */
public final /* synthetic */ class q2$$ExternalSyntheticLambda8 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ q2$$ExternalSyntheticLambda8(Http2Connection http2Connection, int i, ErrorCode errorCode) {
        this.$r8$classId = 15;
        this.f$1 = http2Connection;
        this.f$0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String remoteBitmap$lambda$1;
        String activityRequestedOrientation$lambda$0;
        String isCurrentOrientationValid$lambda$2;
        switch (this.$r8$classId) {
            case 0:
                return q2.a(this.f$0, (q2) this.f$1);
            case 1:
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = (TextFieldDecoratorModifierNode) this.f$1;
                textFieldDecoratorModifierNode.keyboardActionScope.this$0.m407defaultKeyboardActionWithResultKlQnJC8(this.f$0);
                return Unit.INSTANCE;
            case 2:
                SelectableInfo selectableInfo = (SelectableInfo) this.f$1;
                return Integer.valueOf(selectableInfo.textLayoutResult.multiParagraph.getLineForOffset(this.f$0));
            case 3:
                int i = this.f$0;
                MetadataRepo metadataRepo = (MetadataRepo) this.f$1;
                InputTracker$listener$1$1$2$trigger$1 inputTracker$listener$1$1$2$trigger$1 = new InputTracker$listener$1$1$2$trigger$1();
                inputTracker$listener$1$1$2$trigger$1.setEnvironment(i);
                Wallet$WalletOptions wallet$WalletOptions = new Wallet$WalletOptions(inputTracker$listener$1$1$2$trigger$1);
                Activity activity = (Activity) metadataRepo.mRootNode;
                return new PaymentsClient(activity, activity, zzk.API, wallet$WalletOptions, GoogleApi.Settings.DEFAULT_SETTINGS);
            case 4:
                return tc.a((Integer) this.f$1, this.f$0);
            case 5:
                remoteBitmap$lambda$1 = BrazeImageUtils.getRemoteBitmap$lambda$1(this.f$0, (URL) this.f$1);
                return remoteBitmap$lambda$1;
            case 6:
                activityRequestedOrientation$lambda$0 = ViewUtils.setActivityRequestedOrientation$lambda$0(this.f$0, (Activity) this.f$1);
                return activityRequestedOrientation$lambda$0;
            case 7:
                isCurrentOrientationValid$lambda$2 = ViewUtils.isCurrentOrientationValid$lambda$2(this.f$0, (Orientation) this.f$1);
                return isCurrentOrientationValid$lambda$2;
            case 8:
                ((Function1) ((ArcadeTimeline2Binding) this.f$1).onItemClick$delegate.getValue()).invoke(Integer.valueOf(this.f$0));
                return Unit.INSTANCE;
            case 9:
                ((MutableState) this.f$1).setValue(Integer.valueOf(this.f$0));
                return Unit.INSTANCE;
            case 10:
                ((LegacySheetConfig) this.f$1).onSheetPositionChanged(this.f$0);
                return Unit.INSTANCE;
            case 11:
                TextFieldStateKt.clearText((TextFieldState) ((List) this.f$1).get(this.f$0));
                return Unit.INSTANCE;
            case 12:
                int i2 = this.f$0;
                RealGooglePayPaymentsClient realGooglePayPaymentsClient = (RealGooglePayPaymentsClient) this.f$1;
                InputTracker$listener$1$1$2$trigger$1 inputTracker$listener$1$1$2$trigger$12 = new InputTracker$listener$1$1$2$trigger$1();
                inputTracker$listener$1$1$2$trigger$12.setEnvironment(i2);
                Wallet$WalletOptions wallet$WalletOptions2 = new Wallet$WalletOptions(inputTracker$listener$1$1$2$trigger$12);
                Activity activity2 = realGooglePayPaymentsClient.activity;
                return new PaymentsClient(activity2, activity2, zzk.API, wallet$WalletOptions2, GoogleApi.Settings.DEFAULT_SETTINGS);
            case 13:
                ((ParcelableSnapshotMutableIntState) this.f$1).setIntValue(this.f$0);
                return Unit.INSTANCE;
            case 14:
                CashCreditScoreHomeData.ScoreSummary scoreSummary = (CashCreditScoreHomeData.ScoreSummary) this.f$1;
                int i3 = this.f$0;
                Integer num = scoreSummary.previous_score;
                if (num != null) {
                    i3 = num.intValue();
                }
                return new ParcelableSnapshotMutableIntState(i3);
            default:
                Http2Connection http2Connection = (Http2Connection) this.f$1;
                int i4 = this.f$0;
                http2Connection.pushObserver.getClass();
                synchronized (http2Connection) {
                    http2Connection.currentPushRequests.remove(Integer.valueOf(i4));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ q2$$ExternalSyntheticLambda8(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
    }

    public /* synthetic */ q2$$ExternalSyntheticLambda8(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
    }
}
