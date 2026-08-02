package com.squareup.cash.payments.presenters;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import app.cash.broadway.screen.Screen;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.primitives.CryptoPaymentOrigin;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.multiplatform.bitcoin.parsers.solana.SolanaAddress;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public interface CryptoPaymentManager {

    public interface SelectedRecipient {

        public final class BitcoinPaymentRecipient implements SelectedRecipient {
            public final BitcoinPayments invoice;

            public BitcoinPaymentRecipient(BitcoinPayments bitcoinPayments) {
                this.invoice = bitcoinPayments;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BitcoinPaymentRecipient) && this.invoice.equals(((BitcoinPaymentRecipient) obj).invoice);
            }

            @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager.SelectedRecipient
            public final String getData() {
                return this.invoice.getOriginalData();
            }

            @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager.SelectedRecipient
            public final int getSubtitleId() {
                BitcoinPayments bitcoinPayments = this.invoice;
                if (!(bitcoinPayments instanceof BitcoinPayments.Lightning)) {
                    return R.string.bitcoin_recipient_selector_crypto_invoice;
                }
                LightningInvoice lightningInvoice = ((BitcoinPayments.Lightning) bitcoinPayments).invoice;
                if (lightningInvoice instanceof LightningInvoice.Invoice) {
                    return R.string.lightning_recipient_selector_crypto_invoice;
                }
                if (lightningInvoice instanceof LightningInvoice.LUD16Address) {
                    return R.string.lightning_human_readable_recipient_selector_crypto_invoice;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            public final int hashCode() {
                return this.invoice.hashCode();
            }

            public final String toString() {
                return "BitcoinPaymentRecipient(invoice=" + this.invoice + ")";
            }
        }

        public final class SolanaPaymentRecipient implements SelectedRecipient {
            public final SolanaAddress address;

            public SolanaPaymentRecipient(SolanaAddress solanaAddress) {
                this.address = solanaAddress;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SolanaPaymentRecipient) && this.address.equals(((SolanaPaymentRecipient) obj).address);
            }

            @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager.SelectedRecipient
            public final String getData() {
                return this.address.address;
            }

            @Override // com.squareup.cash.payments.presenters.CryptoPaymentManager.SelectedRecipient
            public final int getSubtitleId() {
                return R.string.solana_recipient_selector_crypto_invoice;
            }

            public final int hashCode() {
                return this.address.hashCode();
            }

            public final String toString() {
                return "SolanaPaymentRecipient(address=" + this.address + ")";
            }
        }

        String getData();

        int getSubtitleId();
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CurrencyCode.values().length];
            try {
                iArr[CurrencyCode.BTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    RealBitcoinFormatter getBitcoinFormatter();

    Flow getClipboardRecipient(CryptoPaymentOrigin cryptoPaymentOrigin);

    DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 getDisplayUnits();

    default String getFormattedAmount(Money money, MoneyFormatter moneyFormatter, BitcoinDisplayUnits bitcoinDisplayUnits) {
        money.getClass();
        moneyFormatter.getClass();
        bitcoinDisplayUnits.getClass();
        CurrencyCode currencyCode = money.currency_code;
        return (currencyCode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[currencyCode.ordinal()]) == 1 ? RealBitcoinFormatter.format$default(getBitcoinFormatter(), bitcoinDisplayUnits, money, false, 28) : moneyFormatter.format(money);
    }

    AppLockMonitor$special$$inlined$map$2 getInputHint();

    String getNoteHint();

    Unit initiatePayment(UUID uuid, Recipient.CryptoRecipientPayment cryptoRecipientPayment, Money money, Screen screen, BetterNavigator.ScreenNavigator screenNavigator, MainPaymentPresenter$models$4$4 mainPaymentPresenter$models$4$4);

    Object parseInvoice(CryptoPaymentOrigin cryptoPaymentOrigin, String str, ContinuationImpl continuationImpl);
}
