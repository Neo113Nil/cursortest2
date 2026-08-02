package defpackage;

import android.content.Context;
import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.dynamic.impl.ui.loading.DynamicFeatureLoadingLoadingModalView;
import com.yandex.go.navigation.modals.coroutines.a;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class r7n extends a {
    public final m7n F;
    public final p7n G;
    public final w030 H;
    public final boolean I;

    public r7n(m7n m7nVar, p7n p7nVar, w030 w030Var) {
        super(null);
        this.F = m7nVar;
        this.G = p7nVar;
        this.H = w030Var;
        this.I = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.H;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.I;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final Object S(Object obj, Continuation continuation) {
        DynamicFeature dynamicFeature = ((u7n) obj).a;
        mum mumVar = new mum(this);
        hzk hzkVar = this.G.a;
        return new DynamicFeatureLoadingLoadingModalView((Context) this.F.a.a.get(), new o7n(dynamicFeature, mumVar, (i7n) ((xvf0) hzkVar.a).get(), (a22) ((alm) hzkVar.b).get()));
    }
}
