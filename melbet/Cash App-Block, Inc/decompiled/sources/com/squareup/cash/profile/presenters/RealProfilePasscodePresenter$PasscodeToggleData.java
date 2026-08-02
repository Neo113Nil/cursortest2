package com.squareup.cash.profile.presenters;

import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;

/* loaded from: classes7.dex */
public final class RealProfilePasscodePresenter$PasscodeToggleData {
    public final String customerPasscodeToken;
    public final VerificationInstrument verificationInstrument;

    public interface VerificationInstrument {

        /* loaded from: classes6.dex */
        public final class BalanceVerificationInstrument implements VerificationInstrument {
            public final BalanceSnapshot balance;

            public BalanceVerificationInstrument(BalanceSnapshot balanceSnapshot) {
                this.balance = balanceSnapshot;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BalanceVerificationInstrument) && this.balance.equals(((BalanceVerificationInstrument) obj).balance);
            }

            public final int hashCode() {
                return this.balance.hashCode();
            }

            public final String toString() {
                return "BalanceVerificationInstrument(balance=" + this.balance + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class BitcoinVerificationInstrument implements VerificationInstrument {
            public final CryptoBalance$BitcoinBalance balance;

            public BitcoinVerificationInstrument(CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance) {
                this.balance = cryptoBalance$BitcoinBalance;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BitcoinVerificationInstrument) && this.balance.equals(((BitcoinVerificationInstrument) obj).balance);
            }

            public final int hashCode() {
                return this.balance.hashCode();
            }

            public final String toString() {
                return "BitcoinVerificationInstrument(balance=" + this.balance + ")";
            }
        }

        /* loaded from: classes6.dex */
        public final class ExternalVerificationInstrument implements VerificationInstrument {
            public final Instrument instrument;

            public ExternalVerificationInstrument(Instrument instrument) {
                this.instrument = instrument;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExternalVerificationInstrument) && this.instrument.equals(((ExternalVerificationInstrument) obj).instrument);
            }

            public final int hashCode() {
                return this.instrument.hashCode();
            }

            public final String toString() {
                return "ExternalVerificationInstrument(instrument=" + this.instrument + ")";
            }
        }
    }

    public RealProfilePasscodePresenter$PasscodeToggleData(String str, VerificationInstrument verificationInstrument) {
        this.customerPasscodeToken = str;
        this.verificationInstrument = verificationInstrument;
    }
}
