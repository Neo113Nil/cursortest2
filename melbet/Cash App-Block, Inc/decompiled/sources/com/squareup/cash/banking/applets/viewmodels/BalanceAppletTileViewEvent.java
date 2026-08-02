package com.squareup.cash.banking.applets.viewmodels;

/* loaded from: classes5.dex */
public interface BalanceAppletTileViewEvent {

    public final class BalanceAppletObfuscationToggled implements BalanceAppletTileViewEvent {
        public static final BalanceAppletObfuscationToggled INSTANCE = new BalanceAppletObfuscationToggled();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BalanceAppletObfuscationToggled);
        }

        public final int hashCode() {
            return 1608002038;
        }

        public final String toString() {
            return "BalanceAppletObfuscationToggled";
        }
    }

    public final class BalanceAppletOnClickAddCash implements BalanceAppletTileViewEvent {
        public static final BalanceAppletOnClickAddCash INSTANCE = new BalanceAppletOnClickAddCash();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BalanceAppletOnClickAddCash);
        }

        public final int hashCode() {
            return -1411139788;
        }

        public final String toString() {
            return "BalanceAppletOnClickAddCash";
        }
    }

    public final class BalanceAppletOnClickCashOut implements BalanceAppletTileViewEvent {
        public static final BalanceAppletOnClickCashOut INSTANCE = new BalanceAppletOnClickCashOut();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BalanceAppletOnClickCashOut);
        }

        public final int hashCode() {
            return 292917979;
        }

        public final String toString() {
            return "BalanceAppletOnClickCashOut";
        }
    }

    public final class BalanceAppletOnClickTile implements BalanceAppletTileViewEvent {
        public static final BalanceAppletOnClickTile INSTANCE = new BalanceAppletOnClickTile();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BalanceAppletOnClickTile);
        }

        public final int hashCode() {
            return 1539826414;
        }

        public final String toString() {
            return "BalanceAppletOnClickTile";
        }
    }

    public final class BalanceAppletOnClickUninstalledRow implements BalanceAppletTileViewEvent {
        public static final BalanceAppletOnClickUninstalledRow INSTANCE = new BalanceAppletOnClickUninstalledRow();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BalanceAppletOnClickUninstalledRow);
        }

        public final int hashCode() {
            return -397258407;
        }

        public final String toString() {
            return "BalanceAppletOnClickUninstalledRow";
        }
    }

    public final class Viewed implements BalanceAppletTileViewEvent {
        public static final Viewed INSTANCE = new Viewed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Viewed);
        }

        public final int hashCode() {
            return 529406257;
        }

        public final String toString() {
            return "Viewed";
        }
    }
}
