package defpackage;

import android.widget.FrameLayout;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;

/* loaded from: classes6.dex */
public final /* synthetic */ class vid implements oxf0, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ vid(int i, FrameLayout frameLayout) {
        this.a = i;
        this.b = frameLayout;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof oxf0) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof oxf0) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof oxf0) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        int i = this.a;
        FrameLayout frameLayout = this.b;
        switch (i) {
            case 0:
                return new FunctionReferenceImpl(0, (CompositeAddressSearchModalView) frameLayout, CompositeAddressSearchModalView.class, "collapse", "collapse()V", 0);
            case 1:
                return new FunctionReferenceImpl(0, (CompositeAddressSearchModalView) frameLayout, CompositeAddressSearchModalView.class, "expand", "expand()V", 0);
            default:
                return new FunctionReferenceImpl(0, (CompositeAddressSearchView) frameLayout, CompositeAddressSearchView.class, "onUpdateOffsets", "onUpdateOffsets()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        FrameLayout frameLayout = this.b;
        switch (i) {
            case 0:
                ((CompositeAddressSearchModalView) frameLayout).collapse();
                break;
            case 1:
                ((CompositeAddressSearchModalView) frameLayout).expand();
                break;
            default:
                ((CompositeAddressSearchView) frameLayout).onUpdateOffsets();
                break;
        }
    }
}
