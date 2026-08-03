package m;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k0 implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4375g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o0 f4376h;

    public /* synthetic */ k0(o0 o0Var, int i10) {
        this.f4375g = i10;
        this.f4376h = o0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4375g;
        o0 o0Var = this.f4376h;
        switch (i10) {
            case 0:
                q0 q0Var = o0Var.f4402i;
                if (q0Var != null) {
                    q0Var.setListSelectionHidden(true);
                    q0Var.requestLayout();
                    break;
                }
                break;
            default:
                q0 q0Var2 = o0Var.f4402i;
                if (q0Var2 != null) {
                    Field field = h3.w.f2829a;
                    if (q0Var2.isAttachedToWindow() && o0Var.f4402i.getCount() > o0Var.f4402i.getChildCount() && o0Var.f4402i.getChildCount() <= Integer.MAX_VALUE) {
                        o0Var.B.setInputMethodMode(2);
                        o0Var.b();
                        break;
                    }
                }
                break;
        }
    }
}
