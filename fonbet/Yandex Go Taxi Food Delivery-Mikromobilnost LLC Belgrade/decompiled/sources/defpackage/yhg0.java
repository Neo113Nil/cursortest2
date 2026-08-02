package defpackage;

import com.yandex.quark.utils.Disposable;
import com.yandex.quark.webchat.js.d;

/* loaded from: classes8.dex */
public final class yhg0 implements Disposable {
    public final /* synthetic */ d a;
    public final /* synthetic */ u28 b;

    public yhg0(d dVar, u28 u28Var) {
        this.a = dVar;
        this.b = u28Var;
    }

    @Override // com.yandex.quark.utils.Disposable
    public final void dispose() {
        d.a(this.a, new d38(this.b));
    }
}
