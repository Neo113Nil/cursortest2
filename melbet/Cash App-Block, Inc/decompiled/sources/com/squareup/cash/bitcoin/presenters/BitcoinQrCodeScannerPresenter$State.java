package com.squareup.cash.bitcoin.presenters;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.backend.balance.CryptoBalance$BitcoinBalance;
import com.squareup.cash.qrcodes.viewmodels.CameraState;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinQrCodeScannerPresenter$State {
    public final CameraState cameraState;
    public final boolean handlingPastedAddress;
    public final CryptoBalance$BitcoinBalance instrument;
    public final boolean isCameraPermissionGranted;
    public final boolean needToRequestPermission;
    public final ProcessingCode processingCode;
    public final boolean showingDialog;

    public final class ProcessingCode {
        public final String code;
        public final CodeSource source;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class CodeSource {
            public static final /* synthetic */ CodeSource[] $VALUES;
            public static final CodeSource MANUALLY_PASTED;
            public static final CodeSource QR_CODE;

            static {
                CodeSource codeSource = new CodeSource("QR_CODE", 0);
                QR_CODE = codeSource;
                CodeSource codeSource2 = new CodeSource("MANUALLY_PASTED", 1);
                MANUALLY_PASTED = codeSource2;
                $VALUES = new CodeSource[]{codeSource, codeSource2};
            }

            public static CodeSource valueOf(String str) {
                return (CodeSource) Enum.valueOf(CodeSource.class, str);
            }

            public static CodeSource[] values() {
                return (CodeSource[]) $VALUES.clone();
            }
        }

        public ProcessingCode(String str, CodeSource codeSource) {
            str.getClass();
            this.code = str;
            this.source = codeSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProcessingCode)) {
                return false;
            }
            ProcessingCode processingCode = (ProcessingCode) obj;
            return Intrinsics.areEqual(this.code, processingCode.code) && this.source == processingCode.source;
        }

        public final int hashCode() {
            return this.source.hashCode() + (this.code.hashCode() * 31);
        }

        public final String toString() {
            return "ProcessingCode(code=" + this.code + ", source=" + this.source + ")";
        }
    }

    public BitcoinQrCodeScannerPresenter$State(boolean z, boolean z2, boolean z3, CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance, ProcessingCode processingCode, boolean z4, CameraState cameraState) {
        this.showingDialog = z;
        this.isCameraPermissionGranted = z2;
        this.needToRequestPermission = z3;
        this.instrument = cryptoBalance$BitcoinBalance;
        this.processingCode = processingCode;
        this.handlingPastedAddress = z4;
        this.cameraState = cameraState;
    }

    public static BitcoinQrCodeScannerPresenter$State copy$default(BitcoinQrCodeScannerPresenter$State bitcoinQrCodeScannerPresenter$State, boolean z, CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance, ProcessingCode processingCode, boolean z2, CameraState cameraState, int i) {
        if ((i & 1) != 0) {
            z = bitcoinQrCodeScannerPresenter$State.showingDialog;
        }
        boolean z3 = z;
        boolean z4 = (i & 2) != 0 ? bitcoinQrCodeScannerPresenter$State.isCameraPermissionGranted : true;
        boolean z5 = (i & 4) != 0 ? bitcoinQrCodeScannerPresenter$State.needToRequestPermission : false;
        if ((i & 8) != 0) {
            cryptoBalance$BitcoinBalance = bitcoinQrCodeScannerPresenter$State.instrument;
        }
        CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance2 = cryptoBalance$BitcoinBalance;
        if ((i & 16) != 0) {
            processingCode = bitcoinQrCodeScannerPresenter$State.processingCode;
        }
        ProcessingCode processingCode2 = processingCode;
        if ((i & 32) != 0) {
            z2 = bitcoinQrCodeScannerPresenter$State.handlingPastedAddress;
        }
        boolean z6 = z2;
        bitcoinQrCodeScannerPresenter$State.getClass();
        if ((i & 128) != 0) {
            cameraState = bitcoinQrCodeScannerPresenter$State.cameraState;
        }
        bitcoinQrCodeScannerPresenter$State.getClass();
        return new BitcoinQrCodeScannerPresenter$State(z3, z4, z5, cryptoBalance$BitcoinBalance2, processingCode2, z6, cameraState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinQrCodeScannerPresenter$State)) {
            return false;
        }
        BitcoinQrCodeScannerPresenter$State bitcoinQrCodeScannerPresenter$State = (BitcoinQrCodeScannerPresenter$State) obj;
        return this.showingDialog == bitcoinQrCodeScannerPresenter$State.showingDialog && this.isCameraPermissionGranted == bitcoinQrCodeScannerPresenter$State.isCameraPermissionGranted && this.needToRequestPermission == bitcoinQrCodeScannerPresenter$State.needToRequestPermission && Intrinsics.areEqual(this.instrument, bitcoinQrCodeScannerPresenter$State.instrument) && Intrinsics.areEqual(this.processingCode, bitcoinQrCodeScannerPresenter$State.processingCode) && this.handlingPastedAddress == bitcoinQrCodeScannerPresenter$State.handlingPastedAddress && this.cameraState == bitcoinQrCodeScannerPresenter$State.cameraState;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.showingDialog) * 31, 31, this.isCameraPermissionGranted), 31, this.needToRequestPermission);
        CryptoBalance$BitcoinBalance cryptoBalance$BitcoinBalance = this.instrument;
        int hashCode = (m + (cryptoBalance$BitcoinBalance == null ? 0 : cryptoBalance$BitcoinBalance.hashCode())) * 31;
        ProcessingCode processingCode = this.processingCode;
        return this.cameraState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (processingCode != null ? processingCode.hashCode() : 0)) * 31, 31, this.handlingPastedAddress), 31, true);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("State(showingDialog=", ", isCameraPermissionGranted=", ", needToRequestPermission=", this.showingDialog, this.isCameraPermissionGranted);
        m.append(this.needToRequestPermission);
        m.append(", instrument=");
        m.append(this.instrument);
        m.append(", processingCode=");
        m.append(this.processingCode);
        m.append(", handlingPastedAddress=");
        m.append(this.handlingPastedAddress);
        m.append(", lightningInvoicesEnabled=true, cameraState=");
        m.append(this.cameraState);
        m.append(")");
        return m.toString();
    }
}
