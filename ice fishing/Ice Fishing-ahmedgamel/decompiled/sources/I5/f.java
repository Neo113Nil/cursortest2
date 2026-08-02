package I5;

import F5.m;
import S7.AbstractC0410y;
import com.bumptech.glide.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import u7.v;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f1341a;

    /* renamed from: b, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.c f1342b;

    /* renamed from: c, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.a f1343c;

    public f(m mVar, com.onesignal.debug.internal.logging.otel.android.c cVar, com.onesignal.debug.internal.logging.otel.android.a aVar) {
        this.f1341a = mVar;
        this.f1342b = cVar;
        this.f1343c = aVar;
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
            int i4 = eVar.f1340w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.f1340w = i4 - Integer.MIN_VALUE;
                Object obj = eVar.f1338u;
                A7.a aVar = A7.a.f215n;
                i = eVar.f1340w;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.debug.internal.logging.otel.android.c cVar2 = this.f1342b;
                    Iterator it = h.f(cVar2.getCrashStoragePath(), cVar2.getMinFileAgeForReadMillis()).f900n.iterator();
                    kotlin.jvm.internal.h.d(it, "iterator(...)");
                    b(it);
                    long minFileAgeForReadMillis = cVar2.getMinFileAgeForReadMillis();
                    eVar.f1337n = this;
                    eVar.f1340w = 1;
                    if (AbstractC0410y.f(minFileAgeForReadMillis, eVar) == aVar) {
                        return aVar;
                    }
                    fVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = eVar.f1337n;
                    Q3.b.s(obj);
                }
                com.onesignal.debug.internal.logging.otel.android.c cVar3 = fVar.f1342b;
                Iterator it2 = h.f(cVar3.getCrashStoragePath(), cVar3.getMinFileAgeForReadMillis()).f900n.iterator();
                kotlin.jvm.internal.h.d(it2, "iterator(...)");
                fVar.b(it2);
                return v.f41073a;
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f1338u;
        A7.a aVar2 = A7.a.f215n;
        i = eVar.f1340w;
        if (i != 0) {
        }
        com.onesignal.debug.internal.logging.otel.android.c cVar32 = fVar.f1342b;
        Iterator it22 = h.f(cVar32.getCrashStoragePath(), cVar32.getMinFileAgeForReadMillis()).f900n.iterator();
        kotlin.jvm.internal.h.d(it22, "iterator(...)");
        fVar.b(it22);
        return v.f41073a;
    }

    public final void b(Iterator it) {
        e7.e eVar = (e7.e) this.f1341a.f1010g.getValue();
        boolean z6 = false;
        while (it.hasNext() && !z6) {
            Y6.c f2 = eVar.f((Collection) it.next());
            com.onesignal.debug.internal.logging.otel.android.a aVar = this.f1343c;
            aVar.debug("Sending OneSignal crash report");
            f2.c(30L, TimeUnit.SECONDS);
            z6 = !f2.b();
            aVar.debug("Done OneSignal crash report, failed: " + z6);
        }
    }

    public final Object c(B7.h hVar) {
        String remoteLogLevel = this.f1342b.getRemoteLogLevel();
        v vVar = v.f41073a;
        com.onesignal.debug.internal.logging.otel.android.a aVar = this.f1343c;
        if (remoteLogLevel != null && !remoteLogLevel.equals("NONE")) {
            aVar.info("OtelCrashUploader: starting");
            Object a9 = a(hVar);
            return a9 == A7.a.f215n ? a9 : vVar;
        }
        aVar.info("OtelCrashUploader: remote logging disabled (level: " + remoteLogLevel + ')');
        return vVar;
    }
}
