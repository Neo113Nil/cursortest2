package defpackage;

import android.content.Context;
import com.ybsdk.core.utils.text.Text;

/* loaded from: classes3.dex */
public final class xcg0 implements ev31 {
    public final Context a;

    public xcg0(Context context) {
        this.a = context;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        mcg0 mcg0Var = (mcg0) obj;
        ibv ibvVar = new ibv(rje.j(mcg0Var.b ? hyg0.ybsdk_ic_flashlight_on : hyg0.ybsdk_ic_flashlight_off, this.a));
        boolean z = mcg0Var.b;
        return new wcg0(ibvVar, z, unr0.h(Text.Companion, z ? dzh0.ybsdk_qr_payment_accessibility_flashlight_off : dzh0.ybsdk_qr_payment_accessibility_flashlight_on), mcg0Var.d > 0 || mcg0Var.e || (mcg0Var.f instanceof jcg0), mcg0Var.c);
    }
}
