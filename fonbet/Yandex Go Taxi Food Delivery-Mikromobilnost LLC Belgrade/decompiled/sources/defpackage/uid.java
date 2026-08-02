package defpackage;

import android.view.ViewTreeObserver;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;
import com.yandex.plus.plaquesdk.widget.RobotoTextView;
import com.yandex.urbanads.internal.visibility.a;
import com.ybsdk.core.design.widget.ModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class uid implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uid(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean onPreDrawListener$lambda$0;
        boolean lambda$getPreDrawListener$1;
        boolean invalidateAutosize$lambda$4;
        boolean preDrawListener$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                onPreDrawListener$lambda$0 = CompositeAddressSearchModalView.onPreDrawListener$lambda$0((CompositeAddressSearchModalView) obj);
                break;
            case 1:
                lambda$getPreDrawListener$1 = ((ModalView) obj).lambda$getPreDrawListener$1();
                break;
            case 2:
                invalidateAutosize$lambda$4 = RobotoTextView.invalidateAutosize$lambda$4((RobotoTextView) obj);
                break;
            case 3:
                ((tls) obj).invoke(zy11.a);
                break;
            case 4:
                preDrawListener$lambda$0 = SuperAppMapSearchbarView.preDrawListener$lambda$0((SuperAppMapSearchbarView) obj);
                break;
            case 5:
                ((a) obj).b();
                break;
            default:
                oj61 oj61Var = (oj61) obj;
                oj61Var.h.postDelayed(new nj61(oj61Var, 0), 50L);
                break;
        }
        return true;
    }
}
