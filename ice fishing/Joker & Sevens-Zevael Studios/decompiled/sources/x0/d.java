package x0;

import bc.c0;
import java.util.List;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends RuntimeException {

    /* renamed from: g, reason: collision with root package name */
    public final List f7965g;

    public d(List list) {
        this.f7965g = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        cc.c cVar = new cc.c(10);
        List list = this.f7965g;
        j.e(list, "<this>");
        c0 c0Var = new c0(list);
        if (c0Var.a() > 0) {
            ((a) c0Var.get(0)).getClass();
            throw null;
        }
        cc.c n7 = i7.b.n(cVar);
        j.e(n7, "<this>");
        c0 c0Var2 = new c0(n7);
        int a6 = c0Var2.a();
        for (int i10 = 0; i10 < a6; i10++) {
            sb.append("\tat " + ((String) c0Var2.get(i10)));
            sb.append('\n');
        }
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }
}
