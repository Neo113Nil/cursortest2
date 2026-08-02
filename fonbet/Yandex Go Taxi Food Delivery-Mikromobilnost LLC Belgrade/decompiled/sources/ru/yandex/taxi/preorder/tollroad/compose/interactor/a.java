package ru.yandex.taxi.preorder.tollroad.compose.interactor;

import com.yandex.go.taxi.tariffs.interactor.v;
import defpackage.bvf0;
import defpackage.teh;
import defpackage.xtk0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.preorder.tollroad.o;

/* loaded from: classes6.dex */
public final class a {
    public final o a;
    public final teh b;
    public final v c;
    public final xtk0 d;

    public a(o oVar, teh tehVar, v vVar, xtk0 xtk0Var) {
        this.a = oVar;
        this.b = tehVar;
        this.c = vVar;
        this.d = xtk0Var;
    }

    public final Object a(Continuation continuation) {
        return bvf0.n(new RoadsPaneLifecycleInteractor$launchOnAttachActions$2(this, null), continuation);
    }
}
