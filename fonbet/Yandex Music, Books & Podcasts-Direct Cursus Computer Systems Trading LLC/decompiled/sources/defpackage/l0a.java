package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class l0a extends kvc implements f29, ptn {
    public final /* synthetic */ g29 l;
    public pm9 m;
    public final ArrayList n;

    public l0a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = new g29();
        this.n = new ArrayList();
    }

    @Override // defpackage.f29, defpackage.a0c, defpackage.ptn
    public final void a() {
        super.a();
        j();
    }

    @Override // defpackage.p7t
    public final void d(View view) {
        this.l.d(view);
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
        return this.l.b.e();
    }

    public final void f(ja8 ja8Var) {
        if (ja8Var == null || ja8Var == ja8.b0) {
            return;
        }
        this.n.add(ja8Var);
    }

    @Override // defpackage.yp8
    public final void g(e23 e23Var, op8 op8Var, View view) {
        this.l.g(e23Var, op8Var, view);
    }

    @Override // android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    @Override // defpackage.f29
    public e23 getBindingContext() {
        return this.l.d;
    }

    @Override // defpackage.f29
    public sb8 getDiv() {
        return (sb8) this.l.c;
    }

    @Override // defpackage.yp8
    public tp8 getDivBorderDrawer() {
        return this.l.a.a;
    }

    @Override // defpackage.yp8
    public boolean getNeedClipping() {
        return this.l.a.b;
    }

    public final pm9 getPath() {
        return this.m;
    }

    public final af9 getPlayerView() {
        getChildCount();
        View childAt = getChildAt(0);
        if (childAt == null || !(childAt instanceof af9)) {
            return null;
        }
        return (af9) childAt;
    }

    @Override // defpackage.a0c
    @NotNull
    public List<ja8> getSubscriptions() {
        return this.l.e;
    }

    @Override // defpackage.p7t
    public final void h(View view) {
        this.l.h(view);
    }

    @Override // defpackage.a0c
    public final void i(ja8 ja8Var) {
        this.l.i(ja8Var);
    }

    public final void j() {
        af9 playerView = getPlayerView();
        if (playerView != null) {
            se9 attachedPlayer = playerView.getAttachedPlayer();
            playerView.b();
            if (attachedPlayer != null) {
                attachedPlayer.a();
            }
        }
        ArrayList arrayList = this.n;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ja8) it.next()).close();
        }
        arrayList.clear();
    }

    @Override // defpackage.yp8
    public final void k() {
        this.l.k();
    }

    @Override // defpackage.a0c
    public final void l() {
        this.l.l();
    }

    @Override // defpackage.yp8
    public final void m() {
        this.l.m();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l.b(i, i2);
    }

    @Override // defpackage.f29
    public void setBindingContext(e23 e23Var) {
        this.l.d = e23Var;
    }

    @Override // defpackage.yp8
    public void setNeedClipping(boolean z) {
        this.l.setNeedClipping(z);
    }

    public final void setPath(pm9 pm9Var) {
        this.m = pm9Var;
    }

    @Override // defpackage.f29
    public void setDiv(sb8 sb8Var) {
        this.l.c = sb8Var;
    }

    public l0a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ l0a(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.divImageStyle : i);
    }

    public l0a(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
