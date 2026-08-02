package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class wid implements bx4, jms {
    public final /* synthetic */ CompositeAddressSearchModalView a;

    public wid(CompositeAddressSearchModalView compositeAddressSearchModalView) {
        this.a = compositeAddressSearchModalView;
    }

    @Override // defpackage.bx4
    public final void a() {
        this.a.onKeyboardClosed();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bx4) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(0, this.a, CompositeAddressSearchModalView.class, "onKeyboardClosed", "onKeyboardClosed()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
