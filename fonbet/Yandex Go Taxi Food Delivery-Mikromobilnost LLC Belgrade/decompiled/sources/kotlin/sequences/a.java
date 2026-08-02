package kotlin.sequences;

import defpackage.a7e;
import defpackage.abl0;
import defpackage.e2k;
import defpackage.e2r;
import defpackage.h73;
import defpackage.hlq0;
import defpackage.ixn;
import defpackage.qhq0;
import defpackage.qrq0;
import defpackage.sls;
import defpackage.tls;
import defpackage.wrq0;
import defpackage.yw01;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class a extends wrq0 {
    public static qrq0 b(Iterator it) {
        return new a7e(new h73(3, it));
    }

    public static e2r c(qrq0 qrq0Var) {
        hlq0 hlq0Var = new hlq0(6);
        int i = 1;
        if (!(qrq0Var instanceof yw01)) {
            return new e2r(i, hlq0Var, qrq0Var, new abl0(17));
        }
        yw01 yw01Var = (yw01) qrq0Var;
        return new e2r(i, hlq0Var, yw01Var.a, yw01Var.b);
    }

    public static qrq0 d(tls tlsVar, Object obj) {
        if (obj == null) {
            return ixn.a;
        }
        return new e2k(1, new qhq0(2, obj), tlsVar);
    }

    public static h73 e(yw01 yw01Var, sls slsVar) {
        return new h73(2, new SequencesKt__SequencesKt$ifEmpty$1(yw01Var, slsVar, null));
    }
}
