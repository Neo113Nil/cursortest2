package json.state.disk.storage.feature;

import android.content.Context;
import defpackage.jse;
import defpackage.p0u;
import defpackage.sbx;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.xfz;
import defpackage.zcx;
import defpackage.zjr;
import defpackage.zse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class c {
    public final Context a;
    public final String b;
    public final zjr c = new zjr(xfz.b(c.class.getSimpleName()));
    public final zcx d = tje.a(sbx.d, new p0u(7));

    public c(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        sjh sjhVar = uyj.a;
        return tje.k0((jse) zse.a.c, new JasonStateDiskStorageImpl$fetchState$2(this, null), continuationImpl);
    }
}
