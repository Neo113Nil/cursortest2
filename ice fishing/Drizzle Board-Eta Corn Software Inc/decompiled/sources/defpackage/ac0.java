package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ac0 extends e50 {
    public final /* synthetic */ e50 P7K7Inc8;
    public final /* synthetic */ TextPaint VgvYg0wo;
    public final /* synthetic */ bc0 b2ZJblxo;
    public final /* synthetic */ Context wxUZMvaN;

    public ac0(bc0 bc0Var, Context context, TextPaint textPaint, e50 e50Var) {
        this.b2ZJblxo = bc0Var;
        this.wxUZMvaN = context;
        this.VgvYg0wo = textPaint;
        this.P7K7Inc8 = e50Var;
    }

    @Override // defpackage.e50
    public final void k3x7lurq(int i) {
        this.P7K7Inc8.k3x7lurq(i);
    }

    @Override // defpackage.e50
    public final void ow5vqvCr(Typeface typeface, boolean z) {
        this.b2ZJblxo.VgvYg0wo(this.wxUZMvaN, this.VgvYg0wo, typeface);
        this.P7K7Inc8.ow5vqvCr(typeface, z);
    }
}
