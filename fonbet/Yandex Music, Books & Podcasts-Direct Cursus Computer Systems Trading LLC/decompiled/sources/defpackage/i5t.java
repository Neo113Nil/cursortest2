package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class i5t implements Function2 {
    public final /* synthetic */ h5t a;
    public final /* synthetic */ int b;

    public i5t(h5t h5tVar, int i) {
        this.a = h5tVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Boolean) obj).getClass();
        String str = (String) obj2;
        str.getClass();
        h5t h5tVar = this.a;
        h5tVar.getClass();
        h5tVar.a.a(new v50(h5tVar, str, this.b, 18));
        return Unit.a;
    }
}
