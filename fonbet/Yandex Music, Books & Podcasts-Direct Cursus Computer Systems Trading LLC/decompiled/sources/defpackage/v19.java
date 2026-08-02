package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class v19 extends bgg implements f29 {
    public final /* synthetic */ g29 n;
    public Uri o;
    public ffg p;
    public Uri q;

    public v19(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new g29();
        setCropToPadding(true);
    }

    @Override // defpackage.bgg, defpackage.ptn
    public final void a() {
        super.a();
        s();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.n.d(view);
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
        return this.n.b.e();
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.n.g(e23Var, op8Var, view);
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.n.d;
    }

    @Override // defpackage.f29
    public fb8 getDiv() {
        return (fb8) this.n.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.n.a.a;
    }

    public final Uri getGifUrl$div_release() {
        return this.o;
    }

    public final ffg getLoadPreviewReference$div_release() {
        return this.p;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.n.a.b;
    }

    public final Uri getPreviewUrl$div_release() {
        return this.q;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.n.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.n.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.n.i(ja8Var);
    }

    @Override // defpackage.yp8
    public final void k() {
        this.n.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.n.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.n.m();
    }

    @Override // defpackage.kq1, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.n.b(i, i2);
    }

    @Override // defpackage.bgg
    public final void q() {
        super.q();
        this.o = null;
    }

    public final void s() {
        super.a();
        this.o = null;
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.n.d = e23Var;
    }

    public final void setGifUrl$div_release(Uri uri) {
        this.o = uri;
    }

    public final void setLoadPreviewReference$div_release(ffg ffgVar) {
        this.p = ffgVar;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.n.setNeedClipping(z);
    }

    public final void setPreviewUrl$div_release(Uri uri) {
        this.q = uri;
    }

    @Override // defpackage.f29
    public void setDiv(fb8 fb8Var) {
        this.n.c = fb8Var;
    }

    public v19(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ v19(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public v19(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
