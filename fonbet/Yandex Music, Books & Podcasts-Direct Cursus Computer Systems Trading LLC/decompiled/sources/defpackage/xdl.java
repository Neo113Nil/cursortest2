package defpackage;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class xdl {
    public static String d = "";
    public final hke a;
    public final fke b;
    public gke c;

    public xdl(hke hkeVar, fke fkeVar) {
        hkeVar.getClass();
        this.a = hkeVar;
        this.b = fkeVar;
    }

    public final void a(avo avoVar, avo avoVar2, String str) {
        String str2 = this.b.a;
        String valueOf = String.valueOf(UUID.randomUUID());
        str2.getClass();
        hke hkeVar = this.a;
        hkeVar.getClass();
        nmb.m((nmb) hkeVar.a.getValue(), "android_client_informer_".concat(valueOf), hke.c, hke.d, hke.e, null, avoVar2.a, avoVar2.b, null, 0, false, str2, str2, 0, 0, 1, null, null, null, 0, 504720);
        this.c = new gke(valueOf, str2, str, avoVar, avoVar2);
    }

    public final void b(wdl wdlVar) {
        gke gkeVar;
        String valueOf = String.valueOf(Math.abs(wdlVar.hashCode()));
        gke gkeVar2 = this.c;
        if (gkeVar2 == null || Intrinsics.d(d, valueOf)) {
            return;
        }
        String str = d;
        str.getClass();
        boolean d2 = Intrinsics.d(d, "");
        hke hkeVar = this.a;
        if (!d2 && Intrinsics.d(d, str) && (gkeVar = this.c) != null) {
            hkeVar.b(gkeVar, str);
            d = "";
        }
        d = valueOf;
        hkeVar.d(gkeVar2, valueOf);
    }
}
