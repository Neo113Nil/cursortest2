package com.squareup.cash.arcade.treehouse;

import android.content.Context;
import androidx.paging.PageFetcher$generateNewPagingSource$3;
import app.cash.redwood.Modifier;
import app.cash.redwood.widget.ChangeListener;
import app.cash.redwood.widget.Widget;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.qrcodes.views.QrAddressScannerView;
import com.squareup.cash.ui.util.RealCashVibrator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class QrCodeScannerBinding implements ChangeListener, Widget {
    public String buttonText;
    public String hint;
    public Modifier modifier;
    public PageFetcher$generateNewPagingSource$3 onButtonClick;
    public Function1 onResult;
    public final QrAddressScannerView qrAddressScannerView;
    public String title;

    public QrCodeScannerBinding(Context context, RealCashVibrator realCashVibrator) {
        QrAddressScannerView qrAddressScannerView = new QrAddressScannerView(context, realCashVibrator);
        qrAddressScannerView.setEventReceiver(new QrCodeScannerBinding$$ExternalSyntheticLambda0(this, 0));
        this.qrAddressScannerView = qrAddressScannerView;
        this.modifier = Modifier.Companion.$$INSTANCE;
        this.buttonText = "";
        this.hint = "";
        this.onResult = new AvatarsKt$$ExternalSyntheticLambda2(1);
        this.title = "";
    }

    @Override // app.cash.redwood.widget.Widget
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // app.cash.redwood.widget.Widget
    public final Object getValue() {
        return this.qrAddressScannerView;
    }

    @Override // app.cash.redwood.widget.ChangeListener
    public final void onEndChanges() {
        this.qrAddressScannerView.setModel(new QrAddressScannerViewModel(false, true, this.title, this.buttonText, this.hint, CameraState.RESUMED));
    }

    @Override // app.cash.redwood.widget.Widget
    public final void setModifier(Modifier modifier) {
        modifier.getClass();
        this.modifier = modifier;
    }
}
