package defpackage;

import com.apollographql.apollo3.api.http.c;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class sch extends m5j0 {
    public final /* synthetic */ quu b;

    public sch(quu quuVar) {
        this.b = quuVar;
    }

    @Override // defpackage.m5j0
    public final long a() {
        return this.b.getContentLength();
    }

    @Override // defpackage.m5j0
    public final wg10 b() {
        Regex regex = wg10.e;
        return qje.o(this.b.getContentType());
    }

    @Override // defpackage.m5j0
    public final boolean c() {
        return this.b instanceof c;
    }

    @Override // defpackage.m5j0
    public final void d(oq6 oq6Var) {
        this.b.a(oq6Var);
    }
}
