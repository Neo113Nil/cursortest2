package defpackage;

import android.net.Uri;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class s8r implements q8r {
    public final jyr a;
    public final x8r b;

    public s8r(jyr jyrVar, x8r x8rVar) {
        x8rVar.getClass();
        this.a = jyrVar;
        this.b = x8rVar;
    }

    @Override // defpackage.q8r
    public final w8r a(Object obj) {
        String uri = obj instanceof String ? (String) obj : obj instanceof Uri ? ((Uri) obj).toString() : obj instanceof u7e ? ((u7e) obj).i : null;
        if (uri == null) {
            return null;
        }
        x8r x8rVar = this.b;
        x8rVar.getClass();
        Pair b = x8r.b(x8rVar.c);
        boolean booleanValue = ((Boolean) b.a).booleanValue();
        int intValue = ((Number) b.b).intValue();
        if (booleanValue) {
            return new w8r(x8rVar, uri, intValue);
        }
        return null;
    }

    @Override // defpackage.q8r
    public final cce b() {
        return (cce) this.a.getValue();
    }
}
