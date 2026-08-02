package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebViewClient;
import androidx.fragment.app.o;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class sev implements ngv {
    public j0i a;
    public o b;

    @Override // defpackage.ngv
    public final void A(String str, Function0 function0) {
        j0i j0iVar = this.a;
        if (j0iVar == null || j0iVar.getParent() == null) {
            return;
        }
        function0.invoke();
    }

    @Override // defpackage.ngv
    public final void F(o oVar) {
        oVar.getClass();
        j0i j0iVar = this.a;
        if (j0iVar == null) {
            return;
        }
        ViewParent parent = j0iVar.getParent();
        if (parent != null) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.getResources().getResourceEntryName(viewGroup.getId());
            ern.a(viewGroup.getClass()).h();
            s0();
        }
        if (this.b != null) {
            s0();
        }
        View view = oVar.getView();
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        ern.a(oVar.getClass()).h();
        if (viewGroup2 != null) {
            viewGroup2.addView(j0iVar, 0);
        }
        this.b = oVar;
    }

    @Override // defpackage.ngv
    public final boolean U() {
        return this.a != null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b != null) {
            s0();
        }
        j0i j0iVar = this.a;
        if (j0iVar != null) {
            j0iVar.setWebChromeClient(null);
            j0iVar.setWebViewClient(new WebViewClient());
            j0iVar.loadUrl("about:blank");
            j0iVar.stopLoading();
            j0iVar.onPause();
            j0iVar.clearHistory();
            j0iVar.setVisibility(8);
            j0iVar.removeAllViews();
            j0iVar.destroy();
        }
        this.a = null;
    }

    @Override // defpackage.ngv
    public final void d() {
        j0i j0iVar = this.a;
        if (j0iVar != null) {
            j0iVar.clearHistory();
        }
    }

    @Override // defpackage.ngv
    public final boolean e() {
        j0i j0iVar = this.a;
        if (j0iVar == null) {
            return false;
        }
        boolean canGoBack = j0iVar.canGoBack();
        if (canGoBack) {
            j0iVar.goBack();
        }
        return canGoBack;
    }

    @Override // defpackage.ngv
    public final void f() {
        j0i j0iVar = this.a;
        if (j0iVar != null) {
            j0iVar.setVisibility(0);
            j0iVar.requestFocus();
        }
    }

    @Override // defpackage.ngv
    public final boolean n(String str, Map map) {
        map.getClass();
        j0i j0iVar = this.a;
        if (j0iVar == null) {
            return false;
        }
        j0iVar.loadUrl(str, map);
        return true;
    }

    @Override // defpackage.ngv
    public final View n0() {
        return this.a;
    }

    @Override // defpackage.ngv
    public final void r() {
        j0i j0iVar = this.a;
        if (j0iVar != null) {
            j0iVar.setVisibility(0);
        }
    }

    @Override // defpackage.ngv
    public final void s0() {
        j0i j0iVar = this.a;
        ViewParent parent = j0iVar != null ? j0iVar.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.a);
        }
        this.b = null;
    }

    @Override // defpackage.ngv
    public final void x(int i) {
        j0i j0iVar = this.a;
        if (j0iVar != null) {
            j0iVar.setBackgroundColor(i);
        }
    }
}
