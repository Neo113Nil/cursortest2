package Q7;

import java.util.Iterator;
import java.util.regex.Matcher;
import v7.AbstractC5110a;

/* loaded from: classes2.dex */
public final class h extends AbstractC5110a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b3.e f2721n;

    public h(b3.e eVar) {
        this.f2721n = eVar;
    }

    @Override // v7.AbstractC5110a
    public final int a() {
        return ((Matcher) this.f2721n.f5557u).groupCount() + 1;
    }

    public final e c(int i) {
        b3.e eVar = this.f2721n;
        Matcher matcher = (Matcher) eVar.f5557u;
        N7.c x9 = S0.f.x(matcher.start(i), matcher.end(i));
        if (x9.f2105n < 0) {
            return null;
        }
        String group = ((Matcher) eVar.f5557u).group(i);
        kotlin.jvm.internal.h.d(group, "group(...)");
        return new e(group, x9);
    }

    @Override // v7.AbstractC5110a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof e) {
            return super.contains((e) obj);
        }
        return false;
    }

    @Override // v7.AbstractC5110a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new P7.l(new P7.e(new P7.g(2, new N7.c(0, a() - 1, 1)), new g(this, 0)));
    }
}
