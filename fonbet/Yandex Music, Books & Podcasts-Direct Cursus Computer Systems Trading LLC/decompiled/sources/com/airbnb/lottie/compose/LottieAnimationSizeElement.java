package com.airbnb.lottie.compose;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.edi;
import defpackage.txg;
import defpackage.xci;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Ledi;", "Ltxg;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final /* data */ class LottieAnimationSizeElement extends edi {
    public final int a;
    public final int b;

    public LottieAnimationSizeElement(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.edi
    public final xci e() {
        txg txgVar = new txg();
        txgVar.o = this.a;
        txgVar.p = this.b;
        return txgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.a == lottieAnimationSizeElement.a && this.b == lottieAnimationSizeElement.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.edi
    public final void j(xci xciVar) {
        txg txgVar = (txg) xciVar;
        txgVar.getClass();
        txgVar.o = this.a;
        txgVar.p = this.b;
    }

    public final String toString() {
        return dfi.f("LottieAnimationSizeElement(width=", this.a, this.b, ", height=", ")");
    }
}
