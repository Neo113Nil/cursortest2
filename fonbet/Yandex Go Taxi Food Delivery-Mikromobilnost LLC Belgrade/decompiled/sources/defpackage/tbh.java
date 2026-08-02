package defpackage;

import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.flex.common.ui.DefaultFlexPopupModalView;
import com.yandex.go.places.impl.ui.organizations.v2.OrganizationsListV2ModalView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

/* loaded from: classes13.dex */
public final class tbh implements uji0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideableBindingModalView b;

    public /* synthetic */ tbh(SlideableBindingModalView slideableBindingModalView, int i) {
        this.a = i;
        this.b = slideableBindingModalView;
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    @Override // defpackage.uji0
    public final void a(View view) {
        int i = this.a;
    }

    @Override // defpackage.uji0
    public final void b(View view) {
        int i = this.a;
        SlideableBindingModalView slideableBindingModalView = this.b;
        switch (i) {
            case 0:
                OneShotPreDrawListener.add(view, new uqs(3, (DefaultFlexPopupModalView) slideableBindingModalView, view));
                break;
            default:
                ((OrganizationsListV2ModalView) slideableBindingModalView).disableNestedScrollOnInnerRecyclers(view);
                break;
        }
    }
}
