package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.arf;
import defpackage.btf;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Hi {
    public final Oi a;
    public final Jb b;
    public final Zi c;
    public final arf d = btf.b(new Ei(this));
    public final arf e = btf.b(new Ci(this));
    public final arf f = btf.b(new Gi(this));
    public final ArrayList g = new ArrayList();

    public Hi(Oi oi, Yi yi, Jb jb, Zi zi) {
        this.a = oi;
        this.b = jb;
        this.c = zi;
    }

    public static final void a(Hi hi, Qi qi, InterfaceC0839zi interfaceC0839zi) {
        boolean d;
        hi.g.add(qi);
        Zi zi = hi.c;
        if (qi == null) {
            zi.getClass();
        } else {
            SafePackageManager safePackageManager = zi.b;
            Context context = zi.a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = qi.d.ordinal();
            if (ordinal == 1) {
                d = Intrinsics.d(zi.f, installerPackageName);
            } else if (ordinal == 2) {
                d = Intrinsics.d(zi.g, installerPackageName);
            }
            if (d) {
                hi.a(qi);
                return;
            }
        }
        interfaceC0839zi.a();
    }

    public static final InterfaceC0839zi a(Hi hi) {
        return (InterfaceC0839zi) hi.d.getValue();
    }

    public final void a(Qi qi) {
        Oi oi = this.a;
        synchronized (oi) {
            oi.b = qi;
            oi.c = true;
            oi.d.a(qi);
            oi.d.d();
            oi.a(oi.b);
        }
    }
}
