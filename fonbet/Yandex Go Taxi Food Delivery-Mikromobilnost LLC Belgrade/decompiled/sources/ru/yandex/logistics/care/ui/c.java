package ru.yandex.logistics.care.ui;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class c {
    public final CareWebViewViewModelImpl$SdkCloseType a;
    public final boolean b;

    public /* synthetic */ c(int i) {
        this(null, (i & 2) == 0);
    }

    public static c a(c cVar, CareWebViewViewModelImpl$SdkCloseType careWebViewViewModelImpl$SdkCloseType) {
        boolean z = cVar.b;
        cVar.getClass();
        return new c(careWebViewViewModelImpl$SdkCloseType, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b;
    }

    public final int hashCode() {
        CareWebViewViewModelImpl$SdkCloseType careWebViewViewModelImpl$SdkCloseType = this.a;
        return Boolean.hashCode(this.b) + ((careWebViewViewModelImpl$SdkCloseType == null ? 0 : careWebViewViewModelImpl$SdkCloseType.hashCode()) * 31);
    }

    public final String toString() {
        return "CloseTrackingState(closeType=" + this.a + ", hasTracked=" + this.b + Extension.C_BRAKE;
    }

    public c() {
        this(3);
    }

    public c(CareWebViewViewModelImpl$SdkCloseType careWebViewViewModelImpl$SdkCloseType, boolean z) {
        this.a = careWebViewViewModelImpl$SdkCloseType;
        this.b = z;
    }
}
