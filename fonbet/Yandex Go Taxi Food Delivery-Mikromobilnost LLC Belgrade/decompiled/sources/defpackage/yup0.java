package defpackage;

import com.yandex.go.places.impl.ui.search.f;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes13.dex */
public final /* synthetic */ class yup0 implements jms {
    public final /* synthetic */ f a;

    public yup0(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yup0) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, f.class, "onNoItemsButtonItemClicked", "onNoItemsButtonItemClicked(Lcom/yandex/go/places/impl/ui/search/viewholder/SearchActionType;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
