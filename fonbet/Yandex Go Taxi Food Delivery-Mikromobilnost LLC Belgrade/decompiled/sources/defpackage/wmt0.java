package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes11.dex */
public final class wmt0 implements nv31 {
    public final TextView a;
    public final int b;
    public final int c;
    public final CharSequence w;

    public wmt0(int i, int i2, TextView textView) {
        this.a = textView;
        this.b = i;
        this.c = i2;
        this.w = textView.getText();
    }

    public final void a(ImageSpan imageSpan) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((Object) this.w) + " %span_end%");
        int H = evu0.H(spannableStringBuilder, "%span_end%", 0, false, 6);
        spannableStringBuilder.setSpan(imageSpan, H, H + 10, 18);
        this.a.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
    }

    @Override // defpackage.jax0
    public final void b(Drawable drawable) {
        drawable.mutate();
        drawable.setBounds(0, 0, this.b, this.c);
        a(new ImageSpan(drawable, 2));
    }

    @Override // defpackage.jax0
    public final void f(Drawable drawable) {
        a(new ImageSpan(this.a.getContext(), Bitmap.createBitmap(this.b, this.c, Bitmap.Config.ARGB_8888)));
    }

    @Override // defpackage.jax0
    public final void g(Drawable drawable) {
        this.a.setText(this.w);
    }

    @Override // defpackage.nv31
    public final View getView() {
        return this.a;
    }
}
