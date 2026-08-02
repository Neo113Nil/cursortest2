package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.t;

/* loaded from: classes4.dex */
public final class vpo extends ClickableSpan {
    public final /* synthetic */ xpo a;
    public final /* synthetic */ tl2 b;

    public vpo(xpo xpoVar, tl2 tl2Var) {
        this.a = xpoVar;
        this.b = tl2Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        boolean z;
        view.getClass();
        xpo xpoVar = this.a;
        String str = this.b.b;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        try {
            t l = xpoVar.l();
            if (l != null) {
                l.startActivity(intent);
            }
            z = true;
        } catch (ActivityNotFoundException unused) {
            z = false;
        }
        jqo y = xpoVar.y();
        ((x60) y.n).a(gut.Y0(str, z));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
