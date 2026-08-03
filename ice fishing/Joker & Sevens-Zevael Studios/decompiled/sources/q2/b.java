package q2;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.lifecycle.n0;
import e1.e;
import f1.n;
import m0.i0;
import m0.l1;
import m0.z;
import o2.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends CharacterStyle implements UpdateAppearance {

    /* renamed from: g, reason: collision with root package name */
    public final n f5745g;

    /* renamed from: h, reason: collision with root package name */
    public final float f5746h;

    /* renamed from: i, reason: collision with root package name */
    public final l1 f5747i = z.s(new e(9205357640488583168L));

    /* renamed from: j, reason: collision with root package name */
    public final i0 f5748j = z.n(new n0(4, this));

    public b(n nVar, float f10) {
        this.f5745g = nVar;
        this.f5746h = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        j.a(textPaint, this.f5746h);
        textPaint.setShader((Shader) this.f5748j.getValue());
    }
}
