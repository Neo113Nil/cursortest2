package defpackage;

import android.os.Bundle;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ftt implements Runnable {
    public final /* synthetic */ long a;

    public ftt(long j) {
        this.a = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[Catch: all -> 0x004b, TryCatch #2 {all -> 0x004b, blocks: (B:4:0x000e, B:8:0x0021, B:10:0x0028, B:12:0x0032, B:14:0x0036, B:16:0x0040, B:18:0x0046, B:20:0x0051, B:22:0x007d, B:28:0x00a7, B:30:0x00aa, B:32:0x00bc, B:40:0x00b9, B:45:0x001d, B:25:0x00a2, B:37:0x00b5, B:42:0x0019), top: B:3:0x000e, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ett ettVar;
        n8c f;
        String a;
        Set set = bp6.a;
        if (set.contains(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = gtt.a;
            AtomicBoolean atomicBoolean2 = null;
            if (!set.contains(gtt.class)) {
                try {
                    ettVar = gtt.e;
                } catch (Throwable th) {
                    bp6.a(gtt.class, th);
                }
                if (ettVar.a() && (f = q8c.f(j3c.c(), false)) != null && f.g) {
                    av1 C = etn.C(j3c.b());
                    a = (C != null || C.a() == null) ? null : C.a();
                    if (a != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("advertiser_id", a);
                        bundle.putString("fields", "auto_event_setup_enabled");
                        String str = ood.j;
                        ood oodVar = new ood(null, j3c.c(), null, null, null, 0);
                        oodVar.h = true;
                        oodVar.d = bundle;
                        JSONObject jSONObject = oodVar.c().c;
                        if (jSONObject != null) {
                            gtt gttVar = gtt.i;
                            gtt.a().a = Boolean.valueOf(jSONObject.optBoolean("auto_event_setup_enabled", false));
                            gtt.a().b = this.a;
                            ett a2 = gtt.a();
                            if (!bp6.a.contains(gtt.class)) {
                                try {
                                    gttVar.k(a2);
                                } catch (Throwable th2) {
                                    bp6.a(gtt.class, th2);
                                }
                            }
                        }
                    }
                }
                AtomicBoolean atomicBoolean3 = gtt.a;
                if (!bp6.a.contains(gtt.class)) {
                    try {
                        atomicBoolean2 = gtt.b;
                    } catch (Throwable th3) {
                        bp6.a(gtt.class, th3);
                    }
                }
                atomicBoolean2.set(false);
            }
            ettVar = null;
            if (ettVar.a()) {
                av1 C2 = etn.C(j3c.b());
                if (C2 != null) {
                }
                if (a != null) {
                }
            }
            AtomicBoolean atomicBoolean32 = gtt.a;
            if (!bp6.a.contains(gtt.class)) {
            }
            atomicBoolean2.set(false);
        } catch (Throwable th4) {
            bp6.a(this, th4);
        }
    }
}
