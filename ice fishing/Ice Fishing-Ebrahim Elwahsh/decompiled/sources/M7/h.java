package M7;

import a.AbstractC0415a;
import java.util.Iterator;
import java.util.regex.Matcher;
import r7.AbstractC4970a;

/* loaded from: classes2.dex */
public final class h extends AbstractC4970a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y2.e f1936n;

    public h(Y2.e eVar) {
        this.f1936n = eVar;
    }

    @Override // r7.AbstractC4970a
    public final int a() {
        return ((Matcher) this.f1936n.f3963u).groupCount() + 1;
    }

    public final e c(int i) {
        Y2.e eVar = this.f1936n;
        Matcher matcher = (Matcher) eVar.f3963u;
        J7.c E8 = AbstractC0415a.E(matcher.start(i), matcher.end(i));
        if (E8.f1464n < 0) {
            return null;
        }
        String group = ((Matcher) eVar.f3963u).group(i);
        kotlin.jvm.internal.h.d(group, "group(...)");
        return new e(group, E8);
    }

    @Override // r7.AbstractC4970a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof e) {
            return super.contains((e) obj);
        }
        return false;
    }

    @Override // r7.AbstractC4970a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new L7.l(new L7.e(new L7.g(2, new J7.c(0, a() - 1, 1)), new g(this, 0)));
    }
}
