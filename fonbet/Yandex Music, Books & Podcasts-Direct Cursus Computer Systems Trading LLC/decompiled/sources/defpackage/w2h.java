package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class w2h implements Function1 {
    public final z1h a;

    public w2h(z1h z1hVar) {
        this.a = z1hVar;
    }

    public final void a(boolean z) {
        this.a.c(z ? p2h.a : p2h.b);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return Unit.a;
    }
}
