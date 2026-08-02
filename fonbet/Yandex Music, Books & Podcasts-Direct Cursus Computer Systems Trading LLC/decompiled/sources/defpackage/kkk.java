package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.List;

/* loaded from: classes3.dex */
public final class kkk extends ClickableSpan {
    public final e23 a;
    public final List b;

    public kkk(e23 e23Var, List list) {
        this.a = e23Var;
        this.b = list;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        e23 e23Var = this.a;
        e23Var.a.getDiv2Component$div_release().t().a(e23Var, view, this.b);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
    }
}
