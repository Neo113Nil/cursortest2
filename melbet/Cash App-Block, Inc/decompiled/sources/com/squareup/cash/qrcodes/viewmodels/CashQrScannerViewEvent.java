package com.squareup.cash.qrcodes.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class CashQrScannerViewEvent {

    public final class CodeScanned extends CashQrScannerViewEvent {
        public final String uri;

        public CodeScanned(String str) {
            str.getClass();
            this.uri = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CodeScanned) && Intrinsics.areEqual(this.uri, ((CodeScanned) obj).uri);
        }

        public final int hashCode() {
            return this.uri.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CodeScanned(uri=", this.uri, ")");
        }
    }

    public final class Exit extends CashQrScannerViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -990178307;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class MyCode extends CashQrScannerViewEvent {
        public static final MyCode INSTANCE = new MyCode();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MyCode);
        }

        public final int hashCode() {
            return -2144757544;
        }

        public final String toString() {
            return "MyCode";
        }
    }
}
