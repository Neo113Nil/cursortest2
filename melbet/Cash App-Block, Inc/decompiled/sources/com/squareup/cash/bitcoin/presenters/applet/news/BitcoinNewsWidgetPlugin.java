package com.squareup.cash.bitcoin.presenters.applet.news;

import androidx.media3.common.util.StuckPlayerDetector;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.bitcoin.capability.BitcoinCapability;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinHomeWidgetPresenter;
import com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPlugin;
import com.squareup.cash.support.backend.real.RealSearchPlaceholderProvider;
import com.stripe.hcaptcha.HCaptcha;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class BitcoinNewsWidgetPlugin extends BitcoinWidgetPlugin {
    public final /* synthetic */ int $r8$classId;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final BitcoinHomeWidgetPresenter presenter;

    public /* synthetic */ BitcoinNewsWidgetPlugin(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, BitcoinHomeWidgetPresenter bitcoinHomeWidgetPresenter, int i) {
        this.$r8$classId = i;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.presenter = bitcoinHomeWidgetPresenter;
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public Object checkAdditionalIsAvailable(Continuation continuation) {
        switch (this.$r8$classId) {
            case 2:
                return Boolean.valueOf(this.bitcoinCapabilityProvider.isAvailable(BitcoinCapability.BITCOIN_BOOSTS));
            default:
                return super.checkAdditionalIsAvailable(continuation);
        }
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        int i = this.$r8$classId;
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.bitcoin.presenters.applet.widget.BitcoinWidgetPlugin
    public final BitcoinHomeWidgetPresenter getPresenter() {
        int i = this.$r8$classId;
        BitcoinHomeWidgetPresenter bitcoinHomeWidgetPresenter = this.presenter;
        switch (i) {
            case 0:
                return (n) bitcoinHomeWidgetPresenter;
            case 1:
                return (StuckPlayerDetector) bitcoinHomeWidgetPresenter;
            case 2:
                return (n) bitcoinHomeWidgetPresenter;
            case 3:
                return (StuckPlayerDetector) bitcoinHomeWidgetPresenter;
            case 4:
                return (BinaryBitmap) bitcoinHomeWidgetPresenter;
            case 5:
                return (Result) bitcoinHomeWidgetPresenter;
            case 6:
                return (HCaptcha) bitcoinHomeWidgetPresenter;
            case 7:
                return (zzr) bitcoinHomeWidgetPresenter;
            case 8:
                return (n) bitcoinHomeWidgetPresenter;
            case 9:
                return (RealBugReportSenderFactory) bitcoinHomeWidgetPresenter;
            case 10:
                return (n) bitcoinHomeWidgetPresenter;
            case 11:
                return (BitcoinStackingToolsPresenter) bitcoinHomeWidgetPresenter;
            case 12:
                return (StuckPlayerDetector) bitcoinHomeWidgetPresenter;
            default:
                return (RealSearchPlaceholderProvider) bitcoinHomeWidgetPresenter;
        }
    }
}
