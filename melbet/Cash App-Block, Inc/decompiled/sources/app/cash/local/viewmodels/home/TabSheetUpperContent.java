package app.cash.local.viewmodels.home;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class TabSheetUpperContent {
    public final Pill.LocalCashAmount left;

    public interface Pill {

        public final class LocalCashAmount implements Pill {
            public final String amount;

            public LocalCashAmount(String str) {
                this.amount = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocalCashAmount) && this.amount.equals(((LocalCashAmount) obj).amount);
            }

            public final int hashCode() {
                return this.amount.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalCashAmount(amount=", this.amount, ")");
            }
        }

        public final class QrScanIcon implements Pill {
            public static final QrScanIcon INSTANCE = new QrScanIcon();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof QrScanIcon);
            }

            public final int hashCode() {
                return -1838994560;
            }

            public final String toString() {
                return "QrScanIcon";
            }
        }
    }

    public TabSheetUpperContent(Pill.LocalCashAmount localCashAmount) {
        this.left = localCashAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabSheetUpperContent) || !this.left.equals(((TabSheetUpperContent) obj).left)) {
            return false;
        }
        Pill.QrScanIcon qrScanIcon = Pill.QrScanIcon.INSTANCE;
        return qrScanIcon.equals(qrScanIcon);
    }

    public final int hashCode() {
        return (this.left.hashCode() * 31) - 1838994560;
    }

    public final String toString() {
        return "TabSheetUpperContent(left=" + this.left + ", right=" + Pill.QrScanIcon.INSTANCE + ")";
    }
}
