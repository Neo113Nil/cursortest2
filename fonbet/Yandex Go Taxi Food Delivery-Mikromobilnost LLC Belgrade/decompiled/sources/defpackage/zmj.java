package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;

/* loaded from: classes2.dex */
public final class zmj implements png {
    public final i3y a;
    public final i3y b;

    public zmj(gcx gcxVar, TDirective tDirective, zwf0 zwf0Var) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.a = a.b(lazyThreadSafetyMode, new t7j(1, gcxVar, tDirective, zwf0Var));
        this.b = a.b(lazyThreadSafetyMode, new ymj(0, tDirective, zwf0Var));
    }

    @Override // defpackage.png
    public final String a() {
        return (String) this.a.getValue();
    }

    @Override // defpackage.png
    public final byte[] b() {
        return (byte[]) this.b.getValue();
    }
}
