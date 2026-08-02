package defpackage;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class zq9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ long b;
    public final /* synthetic */ la5 c;
    public final /* synthetic */ er9 d;

    public zq9(TextView textView, long j, la5 la5Var, er9 er9Var) {
        this.a = textView;
        this.b = j;
        this.c = la5Var;
        this.d = er9Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        TextView textView = this.a;
        TextPaint paint = textView.getPaint();
        int i9 = q6g.e;
        float f = this.b;
        la5 la5Var = this.c;
        paint.setShader(p6g.q(f, la5Var.a, la5Var.b, er9.G(this.d, textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
        textView.invalidate();
    }
}
