package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes9.dex */
public final class v610 extends z6 {
    public final /* synthetic */ w610 a;

    public v610(w610 w610Var) {
        this.a = w610Var;
    }

    public final t610 a(int i) {
        Matcher matcher = this.a.a;
        d6w n = y6i0.n(matcher.start(i), matcher.end(i));
        if (n.a >= 0) {
            return new t610(matcher.group(i), n);
        }
        return null;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof t610) {
            return super.contains((t610) obj);
        }
        return false;
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.a.a.groupCount() + 1;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new xw01(new yw01(new h73(1, scc.e(this)), new k200(16, this)));
    }
}
