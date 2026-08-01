package I5;

import F5.m;
import S7.AbstractC0406y;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import u7.v;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f1311a;

    /* renamed from: b, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.c f1312b;

    /* renamed from: c, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.a f1313c;

    public f(m mVar, com.onesignal.debug.internal.logging.otel.android.c cVar, com.onesignal.debug.internal.logging.otel.android.a aVar) {
        this.f1311a = mVar;
        this.f1312b = cVar;
        this.f1313c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(B7.c cVar) {
        e eVar;
        int i;
        f fVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i6 = eVar.f1310w;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar.f1310w = i6 - Integer.MIN_VALUE;
                Object obj = eVar.f1308u;
                A7.a aVar = A7.a.f58n;
                i = eVar.f1310w;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    com.onesignal.debug.internal.logging.otel.android.c cVar2 = this.f1312b;
                    Iterator it = A8.b.j(cVar2.getCrashStoragePath(), cVar2.getMinFileAgeForReadMillis()).f837n.iterator();
                    h.d(it, "iterator(...)");
                    b(it);
                    long minFileAgeForReadMillis = cVar2.getMinFileAgeForReadMillis();
                    eVar.f1307n = this;
                    eVar.f1310w = 1;
                    if (AbstractC0406y.f(minFileAgeForReadMillis, eVar) == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = eVar.f1307n;
                    com.bumptech.glide.d.k(obj);
                }
                com.onesignal.debug.internal.logging.otel.android.c cVar3 = fVar.f1312b;
                Iterator it2 = A8.b.j(cVar3.getCrashStoragePath(), cVar3.getMinFileAgeForReadMillis()).f837n.iterator();
                h.d(it2, "iterator(...)");
                fVar.b(it2);
                return v.f41353a;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f1308u;
        A7.a aVar2 = A7.a.f58n;
        i = eVar.f1310w;
        if (i != 0) {
        }
        com.onesignal.debug.internal.logging.otel.android.c cVar32 = fVar.f1312b;
        Iterator it22 = A8.b.j(cVar32.getCrashStoragePath(), cVar32.getMinFileAgeForReadMillis()).f837n.iterator();
        h.d(it22, "iterator(...)");
        fVar.b(it22);
        return v.f41353a;
    }

    public final void b(Iterator it) {
        e7.e eVar = (e7.e) this.f1311a.f984g.getValue();
        boolean z3 = false;
        while (it.hasNext() && !z3) {
            Y6.c f3 = eVar.f((Collection) it.next());
            com.onesignal.debug.internal.logging.otel.android.a aVar = this.f1313c;
            aVar.debug("Sending OneSignal crash report");
            f3.c(30L, TimeUnit.SECONDS);
            z3 = !f3.b();
            aVar.debug("Done OneSignal crash report, failed: " + z3);
        }
    }

    public final Object c(B7.h hVar) {
        String remoteLogLevel = this.f1312b.getRemoteLogLevel();
        v vVar = v.f41353a;
        com.onesignal.debug.internal.logging.otel.android.a aVar = this.f1313c;
        if (remoteLogLevel != null && !remoteLogLevel.equals("NONE")) {
            aVar.info("OtelCrashUploader: starting");
            Object a9 = a(hVar);
            return a9 == A7.a.f58n ? a9 : vVar;
        }
        aVar.info("OtelCrashUploader: remote logging disabled (level: " + remoteLogLevel + ')');
        return vVar;
    }
}
