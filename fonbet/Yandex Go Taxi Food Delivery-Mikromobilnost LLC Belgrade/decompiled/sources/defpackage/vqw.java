package defpackage;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yandex.go.platform.di.InternalActivityComponent;
import com.yandex.go.platform.di.b;
import com.yandex.go.platform.sdk.a;

/* loaded from: classes13.dex */
public final class vqw implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ vqw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(pey peyVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                b bVar = a.a;
                if (bVar == null) {
                    ny61.g("GoPlatform.init must be invoked before using Go Platform");
                    break;
                } else {
                    bVar.o.a.clear();
                    ((InternalActivityComponent) obj).getActivity().getLifecycle().d(this);
                    break;
                }
            case 1:
                ((com.yandex.go.places.organization.card.impl.ui.card.flex.v2.a) obj).B = true;
                peyVar.getLifecycle().d(this);
                break;
            default:
                ((odf0) obj).invoke((FragmentActivity) peyVar);
                break;
        }
    }
}
