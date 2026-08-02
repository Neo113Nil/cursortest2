package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.div.core.util.text.DivBackgroundSpan;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class d89 extends qes implements f29 {
    public final /* synthetic */ g29 A;
    public wj B;
    public st9 C;
    public long D;
    public q8k E;

    public /* synthetic */ d89(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.divTextStyle : i);
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        this.A.a();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.A.d(view);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        tp8 divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer == null) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        try {
            divBorderDrawer.c(canvas);
            super.draw(canvas);
            divBorderDrawer.d(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // defpackage.p7t
    public final boolean e() {
        return this.A.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.A.g(e23Var, op8Var, view);
    }

    public wj getAdaptiveMaxLines$div_release() {
        return this.B;
    }

    public long getAnimationStartDelay$div_release() {
        return this.D;
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.A.d;
    }

    @Override // defpackage.f29
    public rb8 getDiv() {
        return (rb8) this.A.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.A.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.A.a.b;
    }

    @NotNull
    public q8k getParticlesTicker$div_release() {
        q8k q8kVar = this.E;
        if (q8kVar != null) {
            return q8kVar;
        }
        q8k q8kVar2 = new q8k(this);
        this.E = q8kVar2;
        return q8kVar2;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.A.e;
    }

    public st9 getTextRoundedBgHelper$div_release() {
        return this.C;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.A.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.A.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.A.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.A.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.A.m();
    }

    @Override // defpackage.x2b, androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        q8k q8kVar = this.E;
        if (q8kVar != null) {
            q8kVar.b();
        }
        this.E = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.qes, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        st9 textRoundedBgHelper$div_release;
        if ((getText() instanceof Spanned) && getLayout() != null && (textRoundedBgHelper$div_release = getTextRoundedBgHelper$div_release()) != null && (!textRoundedBgHelper$div_release.c.isEmpty() || !textRoundedBgHelper$div_release.d.isEmpty())) {
            float totalPaddingLeft = getTotalPaddingLeft();
            float totalPaddingTop = getTotalPaddingTop();
            int save = canvas.save();
            canvas.translate(totalPaddingLeft, totalPaddingTop);
            try {
                st9 textRoundedBgHelper$div_release2 = getTextRoundedBgHelper$div_release();
                if (textRoundedBgHelper$div_release2 != null) {
                    CharSequence text = getText();
                    text.getClass();
                    Spanned spanned = (Spanned) text;
                    Layout layout = getLayout();
                    Iterator it = textRoundedBgHelper$div_release2.c.iterator();
                    while (it.hasNext()) {
                        textRoundedBgHelper$div_release2.a((DivBackgroundSpan) it.next(), canvas, spanned, layout);
                    }
                    Iterator it2 = textRoundedBgHelper$div_release2.d.iterator();
                    while (it2.hasNext()) {
                        textRoundedBgHelper$div_release2.a((DivBackgroundSpan) it2.next(), canvas, spanned, layout);
                    }
                }
            } finally {
                canvas.restoreToCount(save);
            }
        }
        super.onDraw(canvas);
    }

    @Override // defpackage.x2b, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A.b(i, i2);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        q8k q8kVar = this.E;
        if (i == 0) {
            if (q8kVar != null) {
                q8kVar.a();
            }
        } else if (q8kVar != null) {
            q8kVar.b();
        }
    }

    public void setAdaptiveMaxLines$div_release(wj wjVar) {
        this.B = wjVar;
    }

    public void setAnimationStartDelay$div_release(long j) {
        this.D = j;
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.A.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.A.setNeedClipping(z);
    }

    public void setTextRoundedBgHelper$div_release(st9 st9Var) {
        this.C = st9Var;
    }

    @Override // defpackage.f29
    public void setDiv(rb8 rb8Var) {
        this.A.c = rb8Var;
    }

    public d89(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public d89(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public d89(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = new g29();
    }
}
