package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class cbn {
    public final bbn a() {
        String b = ((z6o) ((byb) l18.b.c(hag.I(byb.class))).b(z6o.class)).b();
        return Intrinsics.d(b, "none") ? bbn.a : Intrinsics.d(b, "local_only") ? bbn.b : Intrinsics.d(b, "ynison_only") ? bbn.c : Intrinsics.d(b, "local_then_ynison") ? bbn.d : Intrinsics.d(b, "local_if_single_device_then_ynison") ? bbn.e : Intrinsics.d(b, "ynison_then_local") ? bbn.f : Intrinsics.d(b, "on") ? bbn.e : bbn.f;
    }

    public final long b() {
        Long e = ((z6o) ((byb) l18.b.c(hag.I(byb.class))).b(z6o.class)).a().e("restoreYnisonTimeout");
        if (e != null) {
            return e.longValue();
        }
        return -1L;
    }
}
