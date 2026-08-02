package com.squareup.cash.qrcodes.viewmodels;

import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class QrAddressScannerViewEvent {

    public final class DialogClosed extends QrAddressScannerViewEvent {
        public final Screen dialog;

        public DialogClosed(Screen screen) {
            screen.getClass();
            this.dialog = screen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DialogClosed) && Intrinsics.areEqual(this.dialog, ((DialogClosed) obj).dialog);
        }

        public final int hashCode() {
            return this.dialog.hashCode();
        }

        public final String toString() {
            return re$$ExternalSyntheticOutline0.m(this.dialog, "DialogClosed(dialog=", ")");
        }
    }

    public final class Exit extends QrAddressScannerViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -547262010;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class PasteAddressPressed extends QrAddressScannerViewEvent {
        public static final PasteAddressPressed INSTANCE = new PasteAddressPressed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PasteAddressPressed);
        }

        public final int hashCode() {
            return -1115398823;
        }

        public final String toString() {
            return "PasteAddressPressed";
        }
    }

    public final class ScanComplete extends QrAddressScannerViewEvent {
        public final String code;

        public ScanComplete(String str) {
            str.getClass();
            this.code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScanComplete) && Intrinsics.areEqual(this.code, ((ScanComplete) obj).code);
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ScanComplete(code=", this.code, ")");
        }
    }

    /* loaded from: classes5.dex */
    public final class ScanError extends QrAddressScannerViewEvent {
        public static final ScanError INSTANCE = new ScanError();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanError);
        }

        public final int hashCode() {
            return -1550511645;
        }

        public final String toString() {
            return "ScanError";
        }
    }
}
