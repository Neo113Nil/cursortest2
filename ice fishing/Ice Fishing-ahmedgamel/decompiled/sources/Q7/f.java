package Q7;

import java.util.regex.Matcher;
import v7.AbstractC5113d;

/* loaded from: classes2.dex */
public final class f extends AbstractC5113d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b3.e f2718n;

    public f(b3.e eVar) {
        this.f2718n = eVar;
    }

    @Override // v7.AbstractC5110a
    public final int a() {
        return ((Matcher) this.f2718n.f5557u).groupCount() + 1;
    }

    @Override // v7.AbstractC5110a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = ((Matcher) this.f2718n.f5557u).group(i);
        return group == null ? "" : group;
    }

    @Override // v7.AbstractC5113d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // v7.AbstractC5113d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
