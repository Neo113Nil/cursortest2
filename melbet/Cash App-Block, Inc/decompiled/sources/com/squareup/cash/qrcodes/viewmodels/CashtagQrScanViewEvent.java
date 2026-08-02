package com.squareup.cash.qrcodes.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class CashtagQrScanViewEvent {

    public final class CodeScanned extends CashtagQrScanViewEvent {
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

    public final class Exit extends CashtagQrScanViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return 895465656;
        }

        public final String toString() {
            return "Exit";
        }
    }
}
