package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class yeo implements xeo {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ jdj b;

    public yeo(jdj jdjVar) {
        this.b = jdjVar;
    }

    @Override // defpackage.xeo
    public final void endOfStream() {
        if (this.a.getAndSet(true)) {
            return;
        }
        jdj jdjVar = this.b;
        if (((AtomicReference) jdjVar.b).get() != this) {
            return;
        }
        afo afoVar = (afo) jdjVar.w;
        afoVar.a.l(afoVar.b, null);
    }

    @Override // defpackage.xeo
    public final void error(String str, String str2, Object obj) {
        if (this.a.get()) {
            return;
        }
        jdj jdjVar = this.b;
        if (((AtomicReference) jdjVar.b).get() != this) {
            return;
        }
        afo afoVar = (afo) jdjVar.w;
        afoVar.a.l(afoVar.b, afoVar.c.d(str, str2, obj));
    }

    @Override // defpackage.xeo
    public final void success(Object obj) {
        if (this.a.get()) {
            return;
        }
        jdj jdjVar = this.b;
        if (((AtomicReference) jdjVar.b).get() != this) {
            return;
        }
        afo afoVar = (afo) jdjVar.w;
        afoVar.a.l(afoVar.b, afoVar.c.e(obj));
    }
}
