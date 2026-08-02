package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class ln5 extends Dialog implements dzf, rpj, woo {
    public gzf a;
    public final voo b;
    public final qpj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln5(Context context, int i) {
        super(context, i);
        context.getClass();
        this.b = new voo(new bnh(this, new b6n(28, this)));
        this.c = new qpj(new he0(18, this));
    }

    public static void a(ln5 ln5Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // defpackage.dzf
    public final nyf getLifecycle() {
        gzf gzfVar = this.a;
        if (gzfVar != null) {
            return gzfVar;
        }
        gzf gzfVar2 = new gzf(this);
        this.a = gzfVar2;
        return gzfVar2;
    }

    @Override // defpackage.rpj
    public final qpj getOnBackPressedDispatcher() {
        return this.c;
    }

    @Override // defpackage.woo
    public final uoo getSavedStateRegistry() {
        return this.b.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.d();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            qpj qpjVar = this.c;
            qpjVar.getClass();
            qpjVar.e = onBackInvokedDispatcher;
            qpjVar.e(qpjVar.g);
        }
        this.b.a(bundle);
        gzf gzfVar = this.a;
        if (gzfVar == null) {
            gzfVar = new gzf(this);
            this.a = gzfVar;
        }
        gzfVar.g(kyf.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.b.b(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        gzf gzfVar = this.a;
        if (gzfVar == null) {
            gzfVar = new gzf(this);
            this.a = gzfVar;
        }
        gzfVar.g(kyf.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        gzf gzfVar = this.a;
        if (gzfVar == null) {
            gzfVar = new gzf(this);
            this.a = gzfVar;
        }
        gzfVar.g(kyf.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        b();
        super.setContentView(view, layoutParams);
    }
}
