package yads;

import defpackage.mh;
import defpackage.tls;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ah extends Lambda implements tls {
    public static final ah w = new ah();

    public ah() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int reason;
        reason = mh.g(obj).getReason();
        return Boolean.valueOf(reason == 6);
    }
}
