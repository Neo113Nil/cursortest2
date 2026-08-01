package Q7;

import java.util.regex.Matcher;
import v7.AbstractC5123d;

/* loaded from: classes2.dex */
public final class f extends AbstractC5123d {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z2.e f2681n;

    public f(Z2.e eVar) {
        this.f2681n = eVar;
    }

    @Override // v7.AbstractC5120a
    public final int a() {
        return ((Matcher) this.f2681n.f4170u).groupCount() + 1;
    }

    @Override // v7.AbstractC5120a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = ((Matcher) this.f2681n.f4170u).group(i);
        return group == null ? "" : group;
    }

    @Override // v7.AbstractC5123d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // v7.AbstractC5123d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
