package defpackage;

import android.content.Context;
import defpackage.sls;
import kotlin.a;
import ru.yandex.taxi.design.FloatingTitleToolbarComponent;

/* loaded from: classes8.dex */
public final class rpr implements vsz0 {
    public final Context a;
    public final i3y b = a.a(new ppr(1, this));

    public rpr(Context context) {
        this.a = context;
    }

    @Override // defpackage.vsz0
    public final void A() {
    }

    @Override // defpackage.vsz0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FloatingTitleToolbarComponent c() {
        return (FloatingTitleToolbarComponent) this.b.getValue();
    }

    @Override // defpackage.vsz0
    public final void h(boolean z) {
        if (z) {
            c().enableBackButton();
        } else {
            c().disableBackButton();
        }
    }

    @Override // defpackage.vsz0
    public final void j(Runnable runnable) {
        c().setOnBackClickListener(runnable);
    }

    @Override // defpackage.vsz0
    public final void l(final sls slsVar) {
        c().setToolbarItemAction(new Runnable() { // from class: com.yandex.go.payments.summary.ui.a
            @Override // java.lang.Runnable
            public final void run() {
                ((PaymentMethodsListModalView$onAttachedToWindow$1) sls.this).invoke();
            }
        });
    }

    @Override // defpackage.vsz0
    public final void x(String str, String str2) {
        FloatingTitleToolbarComponent c = c();
        c.setTitle(str);
        c.setToolbarItemTitle(str2);
        if (c.actionTitleIsAccessibilityFocused()) {
            c.announceForAccessibility(str2);
        }
    }
}
