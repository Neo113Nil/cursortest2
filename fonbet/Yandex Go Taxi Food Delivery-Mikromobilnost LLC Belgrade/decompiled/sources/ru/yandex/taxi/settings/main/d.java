package ru.yandex.taxi.settings.main;

import android.view.View;
import defpackage.g1a0;
import defpackage.i700;
import defpackage.tje;
import defpackage.vb3;
import defpackage.z0a0;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i700 b;

    public /* synthetic */ d(i700 i700Var, int i) {
        this.a = i;
        this.b = i700Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        f fVar2;
        f fVar3;
        int i = this.a;
        i700 i700Var = this.b;
        switch (i) {
            case 0:
                ((g1a0) ((z0a0) i700Var.x.get())).a();
                f fVar4 = i700Var.c;
                fVar4.Bg(i700Var);
                fVar4.g0 = new WeakReference(i700Var);
                i700Var.r0 = fVar4;
                ru.yandex.taxi.settings.domain.a aVar = (ru.yandex.taxi.settings.domain.a) fVar4.U.get();
                aVar.d.b(aVar, new vb3(11, aVar));
                com.yandex.go.coroutines.b.g(fVar4.Jg(), null, null, new NativeMenuPresenter$attachView$1(fVar4, i700Var, null), 3);
                i700Var.E.a();
                final View view = i700Var.F;
                view.setVisibility(0);
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                if (!view.isAttachedToWindow()) {
                    view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.settings.main.MainMenuViewImpl$lambda$0$0$$inlined$doOnAttach$1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view2) {
                            view.removeOnAttachStateChangeListener(this);
                            view2.requestApplyInsets();
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view2) {
                        }
                    });
                    break;
                } else {
                    view.requestApplyInsets();
                    break;
                }
            case 1:
                if (!i700Var.s0 && !i700Var.t0 && (fVar = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    fVar.A.a("Menu.UpgradeAccountTapped", new Pair[0]);
                    tje.N(fVar.Jg(), null, null, new NativeMenuPresenter$onUpgradeAccount$1(fVar, null), 3);
                    break;
                }
                break;
            case 2:
                if (!i700Var.s0 && !i700Var.t0 && (fVar2 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    tje.N(fVar2.Jg(), null, null, new NativeMenuPresenter$onLogOutSelected$1(fVar2, null), 3);
                    break;
                }
                break;
            default:
                if (!i700Var.s0 && !i700Var.t0 && (fVar3 = i700Var.r0) != null) {
                    i700Var.s0 = true;
                    com.yandex.go.coroutines.b.g(fVar3.Jg(), null, null, new NativeMenuPresenter$onYangoBusinessSelected$1(fVar3, null), 3);
                    break;
                }
                break;
        }
    }
}
