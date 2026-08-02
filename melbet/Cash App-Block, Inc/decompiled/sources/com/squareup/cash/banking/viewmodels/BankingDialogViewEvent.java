package com.squareup.cash.banking.viewmodels;

import com.squareup.protos.franklin.api.ClientScenario;

/* loaded from: classes5.dex */
public abstract class BankingDialogViewEvent {

    public final class ButtonClicked extends BankingDialogViewEvent {
        public final ClientScenario clientScenario;

        public ButtonClicked(ClientScenario clientScenario) {
            this.clientScenario = clientScenario;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonClicked) && this.clientScenario == ((ButtonClicked) obj).clientScenario;
        }

        public final int hashCode() {
            ClientScenario clientScenario = this.clientScenario;
            if (clientScenario == null) {
                return 0;
            }
            return clientScenario.hashCode();
        }

        public final String toString() {
            return "ButtonClicked(clientScenario=" + this.clientScenario + ")";
        }
    }

    public final class Dismissed extends BankingDialogViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -1711271865;
        }

        public final String toString() {
            return "Dismissed";
        }
    }
}
