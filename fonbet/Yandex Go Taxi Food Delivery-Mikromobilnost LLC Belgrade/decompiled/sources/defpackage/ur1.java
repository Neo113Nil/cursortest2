package defpackage;

import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.mobile.drive.view.AlertView;

/* loaded from: classes15.dex */
public final class ur1 implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ur1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(pey peyVar) {
    }

    private final void b(pey peyVar) {
    }

    private final void c(pey peyVar) {
    }

    private final void d(pey peyVar) {
    }

    private final void f(pey peyVar) {
    }

    private final void g(pey peyVar) {
    }

    private final void h(pey peyVar) {
    }

    private final void i(pey peyVar) {
    }

    private final void j(pey peyVar) {
    }

    private final void k(pey peyVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(pey peyVar) {
        int i = this.a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((j18) obj2).resumeWith(zy11.a);
                ((AlertView) obj).getLifecycle().d(this);
                break;
            default:
                ((cf21) obj2).c.remove((Context) obj);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        int i = this.a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        int i = this.a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(pey peyVar) {
        int i = this.a;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(pey peyVar) {
        int i = this.a;
    }
}
