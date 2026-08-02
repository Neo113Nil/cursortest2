package ru.yandex.taxi.scooters.presentation.common.ui.camera;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tfx;
import defpackage.tls;
import defpackage.z1w;

/* loaded from: classes6.dex */
public abstract class CameraLayer {
    public GoFrameLayout a;
    public sls b;
    public z1w c;
    public CameraLayer d;
    public CameraLayer e;
    public CameraLayer f;
    public CameraLayer g;
    public boolean h;
    public View i;
    public final tfx j = new CameraLayer$insetChangeListener$1(1, this, CameraLayer.class, "onInsetsChanged", "onInsetsChanged(Lru/yandex/taxi/utils/Insets;)V", 0);

    public final void a(CameraLayer cameraLayer) {
        CameraLayer cameraLayer2 = this.d;
        if (cameraLayer2 != null) {
            cameraLayer2.a(cameraLayer);
        } else {
            this.d = cameraLayer;
            cameraLayer.e = this;
        }
    }

    public void b() {
    }

    public final void c() {
        CameraLayer cameraLayer = this.e;
        if (cameraLayer != null) {
            f();
            cameraLayer.e();
        } else {
            CameraLayer cameraLayer2 = this.g;
            if (cameraLayer2 != null) {
                cameraLayer2.c();
            }
        }
    }

    public void d() {
    }

    public final void e() {
        if (this.i == null) {
            this.i = i();
        }
        GoFrameLayout goFrameLayout = this.a;
        if (goFrameLayout == null) {
            goFrameLayout = null;
        }
        final View view = this.i;
        if (view != null) {
            if (view.isAttachedToWindow()) {
                if (view.isAttachedToWindow()) {
                    view.addOnAttachStateChangeListener(new CameraLayer$attachToParent$lambda$0$$inlined$doOnDetach$1(view, this));
                } else {
                    d();
                }
                b();
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer$attachToParent$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view2) {
                        view.removeOnAttachStateChangeListener(this);
                        View view3 = view;
                        boolean isAttachedToWindow = view3.isAttachedToWindow();
                        CameraLayer cameraLayer = this;
                        if (isAttachedToWindow) {
                            view3.addOnAttachStateChangeListener(new CameraLayer$attachToParent$lambda$0$$inlined$doOnDetach$1(view3, cameraLayer));
                        } else {
                            cameraLayer.d();
                        }
                        this.b();
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view2) {
                    }
                });
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            goFrameLayout.addView(view, new FrameLayout.LayoutParams(layoutParams2 != null ? layoutParams2.width : -1, layoutParams2 != null ? layoutParams2.height : -1));
        }
        z1w z1wVar = this.c;
        z1w z1wVar2 = z1wVar != null ? z1wVar : null;
        tls tlsVar = (tls) this.j;
        z1wVar2.a.add(tlsVar);
        t1w t1wVar = (t1w) z1wVar2.b.getValue(z1wVar2, z1w.c[0]);
        if (t1wVar != null) {
            tlsVar.invoke(t1wVar);
        }
        this.h = true;
        CameraLayer cameraLayer = this.f;
        if (cameraLayer != null) {
            cameraLayer.e();
        }
    }

    public final void f() {
        if (!this.h) {
            CameraLayer cameraLayer = this.d;
            if (cameraLayer != null) {
                cameraLayer.f();
                return;
            }
            return;
        }
        CameraLayer cameraLayer2 = this.f;
        if (cameraLayer2 != null) {
            cameraLayer2.f();
        }
        z1w z1wVar = this.c;
        if (z1wVar == null) {
            z1wVar = null;
        }
        z1wVar.a.remove((tls) this.j);
        View view = this.i;
        if (view != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        this.h = false;
    }

    public final void g() {
        CameraLayer cameraLayer = this.d;
        if (cameraLayer != null) {
            f();
            cameraLayer.e();
        } else {
            CameraLayer cameraLayer2 = this.g;
            if (cameraLayer2 != null) {
                cameraLayer2.g();
            }
        }
    }

    public void h(t1w t1wVar) {
    }

    public abstract View i();
}
