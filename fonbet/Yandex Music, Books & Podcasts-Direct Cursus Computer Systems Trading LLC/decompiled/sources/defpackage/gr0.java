package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class gr0 extends ln5 implements kq0 {
    public er0 d;
    public final fr0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [fr0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gr0(Context context, int i) {
        super(context, r2);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.e = new raf() { // from class: fr0
            @Override // defpackage.raf
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return gr0.this.d(keyEvent);
            }
        };
        rq0 c = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((er0) c).A0 = i;
        c.g();
    }

    @Override // defpackage.ln5, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        er0 er0Var = (er0) c();
        er0Var.A();
        ((ViewGroup) er0Var.B.findViewById(android.R.id.content)).addView(view, layoutParams);
        er0Var.m.a(er0Var.l.getCallback());
    }

    public final rq0 c() {
        if (this.d == null) {
            qhp qhpVar = rq0.a;
            this.d = new er0(getContext(), getWindow(), this, this);
        }
        return this.d;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        c().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return u2x.B(this.e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        er0 er0Var = (er0) c();
        er0Var.A();
        return er0Var.l.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().e();
    }

    @Override // defpackage.ln5, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().d();
        super.onCreate(bundle);
        c().g();
    }

    @Override // defpackage.ln5, android.app.Dialog
    public void onStop() {
        super.onStop();
        er0 er0Var = (er0) c();
        er0Var.F();
        qd qdVar = er0Var.o;
        if (qdVar != null) {
            qdVar.p(false);
        }
    }

    @Override // defpackage.kq0
    public final ig onWindowStartingSupportActionMode(hg hgVar) {
        return null;
    }

    @Override // defpackage.ln5, android.app.Dialog
    public void setContentView(int i) {
        b();
        c().k(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        c().o(getContext().getString(i));
    }

    @Override // defpackage.ln5, android.app.Dialog
    public void setContentView(View view) {
        b();
        c().l(view);
    }

    @Override // defpackage.ln5, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().o(charSequence);
    }

    @Override // defpackage.kq0
    public final void onSupportActionModeFinished(ig igVar) {
    }

    @Override // defpackage.kq0
    public final void onSupportActionModeStarted(ig igVar) {
    }
}
