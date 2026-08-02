package ru.yandex.taxi.settings.activity;

import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.bn10;
import defpackage.el40;
import defpackage.fc5;
import defpackage.h3y;
import defpackage.hcs;
import defpackage.hef0;
import defpackage.ics;
import defpackage.ssu;
import defpackage.tls;
import defpackage.u300;
import defpackage.weu;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.ui.MultiClickHandler$OnClickListener;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/settings/activity/MenuButtonAttachStateChangeListener;", "Lru/yandex/taxi/settings/activity/MenuRouterStateChangeListener;", "Lh3y;", "Lbn10;", "menuRouter", "Lfc5;", "transitionManager", "Lhcs;", "fragmentHostProvider", "<init>", "(Lh3y;Lfc5;Lhcs;)V", "Lkotlin/Function1;", "", "Lzy11;", "onClick", "Lru/yandex/taxi/ui/MultiClickHandler$OnClickListener;", "createClickListener", "(Ltls;)Lru/yandex/taxi/ui/MultiClickHandler$OnClickListener;", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lh3y;", "Lfc5;", "Lhcs;", "Lel40;", "clickHandler", "Lel40;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MenuButtonAttachStateChangeListener implements MenuRouterStateChangeListener {
    private final el40 clickHandler = new u300(1, this);
    private final hcs fragmentHostProvider;
    private final h3y menuRouter;
    private final fc5 transitionManager;

    public MenuButtonAttachStateChangeListener(h3y h3yVar, fc5 fc5Var, hcs hcsVar) {
        this.menuRouter = h3yVar;
        this.transitionManager = fc5Var;
        this.fragmentHostProvider = hcsVar;
    }

    private final MultiClickHandler$OnClickListener createClickListener(final tls onClick) {
        final el40 el40Var = this.clickHandler;
        return new MultiClickHandler$OnClickListener(el40Var) { // from class: ru.yandex.taxi.settings.activity.MenuButtonAttachStateChangeListener$createClickListener$1
            @Override // ru.yandex.taxi.ui.MultiClickHandler$OnClickListener
            public void performActionsOnClick(View v) {
                hcs hcsVar;
                hcsVar = MenuButtonAttachStateChangeListener.this.fragmentHostProvider;
                Fragment a = ((ics) hcsVar).a();
                if (a instanceof YandexTaxiFragment) {
                    YandexTaxiFragment yandexTaxiFragment = (YandexTaxiFragment) a;
                    if (yandexTaxiFragment.isAttachedAndActive() && yandexTaxiFragment.canOpenMainMenu()) {
                        onClick.invoke(yandexTaxiFragment.getBusinessName());
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewAttachedToWindow$lambda$0(MenuButtonAttachStateChangeListener menuButtonAttachStateChangeListener) {
        ((bn10) menuButtonAttachStateChangeListener.menuRouter.get()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewAttachedToWindow$lambda$1(MenuButtonAttachStateChangeListener menuButtonAttachStateChangeListener, String str) {
        bn10 bn10Var = (bn10) menuButtonAttachStateChangeListener.menuRouter.get();
        if (bn10Var.b.a()) {
            ((hef0) bn10Var.c.get()).a(str, null, null);
        } else {
            ((j) bn10Var.a).t(str, "openSettings");
        }
        bn10Var.g();
        return zy11.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
        this.transitionManager.a(new ssu(11, this), "MenuActivityLifecycleListener");
        v.setOnClickListener(createClickListener(new weu(7, this)));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        v.setOnClickListener(null);
    }
}
