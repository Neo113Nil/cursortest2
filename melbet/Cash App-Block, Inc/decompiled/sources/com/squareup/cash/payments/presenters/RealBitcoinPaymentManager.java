package com.squareup.cash.payments.presenters;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.cdf.crypto.CryptoSendSubmitRecipient;
import com.squareup.cash.clipboard.RealClipboardObserver;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.CryptoPaymentSource;
import com.squareup.cash.crypto.navigation.RealCryptoFlowStarter;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.history.presenters.RealActivityInvitePresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.payments.presenters.CryptoPaymentManager;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.common.Money;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealBitcoinPaymentManager implements CryptoPaymentManager {
    public final Analytics analytics;
    public final RealBitcoinFormatter bitcoinFormatter;
    public final RealClipboardObserver clipboardObserver;
    public final CryptoFlowStarter cryptoFlowStarter;
    public final RealCryptoInvoiceParser cryptoInvoiceParser;
    public final DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 displayUnits;
    public final AndroidStringManager stringManager;

    public RealBitcoinPaymentManager(AndroidStringManager androidStringManager, CryptoFlowStarter cryptoFlowStarter, RealCryptoInvoiceParser realCryptoInvoiceParser, Analytics analytics, RealClipboardObserver realClipboardObserver, RealBitcoinFormatter realBitcoinFormatter, RealBitcoinProfileRepo realBitcoinProfileRepo) {
        this.stringManager = androidStringManager;
        this.cryptoFlowStarter = cryptoFlowStarter;
        this.cryptoInvoiceParser = realCryptoInvoiceParser;
        this.analytics = analytics;
        this.clipboardObserver = realClipboardObserver;
        this.bitcoinFormatter = realBitcoinFormatter;
        this.displayUnits = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public final RealBitcoinFormatter getBitcoinFormatter() {
        return this.bitcoinFormatter;
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public final Flow getClipboardRecipient(CryptoPaymentOrigin cryptoPaymentOrigin) {
        return new RealActivityInvitePresenter(25, this.clipboardObserver.observeClipboard(), this, cryptoPaymentOrigin);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public final DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 getDisplayUnits() {
        return this.displayUnits;
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public final AppLockMonitor$special$$inlined$map$2 getInputHint() {
        return new AppLockMonitor$special$$inlined$map$2(this.stringManager.get(R.string.bitcoin_lightning_send_recipient_selector_recipients_hint), 19);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public final String getNoteHint() {
        return this.stringManager.get(R.string.bitcoin_sent_note_hint_external_address);
    }

    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    public final Unit initiatePayment(UUID uuid, Recipient.CryptoRecipientPayment cryptoRecipientPayment, Money money, Screen screen, BetterNavigator.ScreenNavigator screenNavigator, MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$4) {
        if (!(cryptoRecipientPayment instanceof Recipient.CryptoRecipientPayment.Bitcoin)) {
            a$$ExternalSyntheticBUOutline0.m$3("Only accepts bitcoin payments.");
            return null;
        }
        this.analytics.track(new CryptoSendSubmitRecipient(), null);
        CryptoPayment.InvoicePayment invoicePayment = new CryptoPayment.InvoicePayment(((Recipient.CryptoRecipientPayment.Bitcoin) cryptoRecipientPayment).payment, CryptoPaymentSource.CRYPTO_RECIPIENT_SELECTOR_FOR_AMOUNT, money, uuid);
        if (screen == null) {
            screen = new BitcoinHome(null, null, null, null, 15);
        }
        Unit initiateCryptoPayment = ((RealCryptoFlowStarter) this.cryptoFlowStarter).initiateCryptoPayment(invoicePayment, screen, screenNavigator);
        return initiateCryptoPayment == CoroutineSingletons.COROUTINE_SUSPENDED ? initiateCryptoPayment : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseInvoice(CryptoPaymentOrigin cryptoPaymentOrigin, String str, ContinuationImpl continuationImpl) {
        RealBitcoinPaymentManager$parseInvoice$1 realBitcoinPaymentManager$parseInvoice$1;
        int i;
        BitcoinPayments bitcoinPayments;
        if (continuationImpl instanceof RealBitcoinPaymentManager$parseInvoice$1) {
            realBitcoinPaymentManager$parseInvoice$1 = (RealBitcoinPaymentManager$parseInvoice$1) continuationImpl;
            int i2 = realBitcoinPaymentManager$parseInvoice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBitcoinPaymentManager$parseInvoice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBitcoinPaymentManager$parseInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBitcoinPaymentManager$parseInvoice$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realBitcoinPaymentManager$parseInvoice$1.L$0 = cryptoPaymentOrigin;
                    realBitcoinPaymentManager$parseInvoice$1.label = 1;
                    obj = this.cryptoInvoiceParser.parse(str, true, realBitcoinPaymentManager$parseInvoice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cryptoPaymentOrigin = realBitcoinPaymentManager$parseInvoice$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                bitcoinPayments = (BitcoinPayments) obj;
                if (cryptoPaymentOrigin == CryptoPaymentOrigin.DEPOSIT_REVERSAL && (bitcoinPayments == null || !(bitcoinPayments instanceof BitcoinPayments.Bitcoin) || ((BitcoinPayments.Bitcoin) bitcoinPayments).bitcoinPayment.lightningInvoice != null)) {
                    bitcoinPayments = null;
                }
                if (bitcoinPayments == null) {
                    return new CryptoPaymentManager.SelectedRecipient.BitcoinPaymentRecipient(bitcoinPayments);
                }
                return null;
            }
        }
        realBitcoinPaymentManager$parseInvoice$1 = new RealBitcoinPaymentManager$parseInvoice$1(this, continuationImpl);
        Object obj2 = realBitcoinPaymentManager$parseInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBitcoinPaymentManager$parseInvoice$1.label;
        if (i != 0) {
        }
        bitcoinPayments = (BitcoinPayments) obj2;
        if (cryptoPaymentOrigin == CryptoPaymentOrigin.DEPOSIT_REVERSAL) {
            bitcoinPayments = null;
        }
        if (bitcoinPayments == null) {
        }
    }
}
