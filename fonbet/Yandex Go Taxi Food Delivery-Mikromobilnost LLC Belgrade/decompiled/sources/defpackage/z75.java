package defpackage;

import android.view.View;
import defpackage.z75;

/* loaded from: classes2.dex */
public abstract class z75 {
    public final View a;
    public final ike b;

    public z75(View view, jse jseVar) {
        this.a = view;
        this.b = bvf0.a(cvw.U(jl40.a(), jseVar));
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.BasePlusPanelViewController$onAttachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                z75.this.a();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                z75.this.b();
            }
        });
    }

    public void a() {
    }

    public abstract void b();
}
