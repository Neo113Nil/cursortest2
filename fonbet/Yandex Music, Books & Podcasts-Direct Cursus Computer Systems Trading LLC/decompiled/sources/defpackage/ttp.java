package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes3.dex */
public final class ttp extends CharacterStyle {
    public final rtp a;

    public ttp(rtp rtpVar) {
        this.a = rtpVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            rtp rtpVar = this.a;
            textPaint.setShadowLayer(rtpVar.c, rtpVar.a, rtpVar.b, rtpVar.d);
        }
    }
}
