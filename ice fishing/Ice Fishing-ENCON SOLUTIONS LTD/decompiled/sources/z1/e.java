package z1;

import i1.AbstractC0248e;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class e extends AbstractC0248e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f8636a;

    public e(o.b bVar) {
        this.f8636a = bVar;
    }

    @Override // i1.AbstractC0248e
    public final int a() {
        return ((Matcher) this.f8636a.f8226b).groupCount() + 1;
    }

    @Override // i1.AbstractC0248e, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        String group = ((Matcher) this.f8636a.f8226b).group(i2);
        return group == null ? "" : group;
    }

    @Override // i1.AbstractC0248e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // i1.AbstractC0248e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
