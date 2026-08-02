package ru.yandex.taxi.preorder.summary.selector.ui.ribbon;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.g18;
import defpackage.pwf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.preorder.summary.selector.ui.tariffselector.a;
import ru.yandex.taxi.utils.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/preorder/summary/selector/ui/ribbon/SeveralTariffsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;", "listener", "Lzy11;", "attachListener", "(Lru/yandex/taxi/preorder/summary/selector/ui/tariffselector/a$a;)V", "detachListeners", "()V", "Landroid/view/View;", "targetView", "animateViewBackgroundAppearing", "(Landroid/view/View;)V", "Lru/yandex/taxi/utils/f;", "listeners", "Lru/yandex/taxi/utils/f;", "getListeners", "()Lru/yandex/taxi/utils/f;", "Ljava/util/ArrayList;", "Lg18;", "Lkotlin/collections/ArrayList;", "listenersList", "Ljava/util/ArrayList;", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SeveralTariffsView extends FrameLayout {
    private final f listeners;
    private final ArrayList<g18> listenersList;

    public SeveralTariffsView(Context context) {
        super(context);
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.listeners = new f(a.InterfaceC0113a.class);
        this.listenersList = new ArrayList<>();
    }

    public final void animateViewBackgroundAppearing(View targetView) {
        ObjectAnimator.ofInt(targetView.getBackground(), CaretView.ALPHA_PROPERTY, 0, 255).setDuration(200L).start();
    }

    public final void attachListener(a.InterfaceC0113a listener) {
        this.listenersList.add(this.listeners.h(listener));
    }

    public final void detachListeners() {
        Iterator<T> it = this.listenersList.iterator();
        while (it.hasNext()) {
            ((g18) it.next()).cancel();
        }
        this.listenersList.clear();
    }

    public final f getListeners() {
        return this.listeners;
    }
}
