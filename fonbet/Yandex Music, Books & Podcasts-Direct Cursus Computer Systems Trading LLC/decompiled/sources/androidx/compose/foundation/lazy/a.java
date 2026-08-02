package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import defpackage.atf;
import defpackage.b9r;
import defpackage.weo;
import defpackage.wpe;
import defpackage.yci;

/* loaded from: classes.dex */
public interface a {
    static yci a(a aVar, yci yciVar) {
        b9r Q = weo.Q(0.0f, 400.0f, null, 5);
        long j = 1;
        b9r Q2 = weo.Q(0.0f, 400.0f, new wpe((j & 4294967295L) | (j << 32)), 1);
        b9r Q3 = weo.Q(0.0f, 400.0f, null, 5);
        ((atf) aVar).getClass();
        return yciVar.f(new LazyLayoutAnimateItemElement(Q, Q2, Q3));
    }

    static yci b(a aVar, yci yciVar) {
        atf atfVar = (atf) aVar;
        return yciVar.f(new ParentSizeElement(atfVar.a, atfVar.b));
    }
}
