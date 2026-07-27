package E5;

import B5.m;
import O7.AbstractC0399y;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import p8.g;
import q7.v;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final m f843a;

    /* renamed from: b, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.c f844b;

    /* renamed from: c, reason: collision with root package name */
    public final com.onesignal.debug.internal.logging.otel.android.a f845c;

    public f(m mVar, com.onesignal.debug.internal.logging.otel.android.c cVar, com.onesignal.debug.internal.logging.otel.android.a aVar) {
        this.f843a = mVar;
        this.f844b = cVar;
        this.f845c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC5219c abstractC5219c) {
        e eVar;
        int i;
        f fVar;
        if (abstractC5219c instanceof e) {
            eVar = (e) abstractC5219c;
            int i4 = eVar.f842w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.f842w = i4 - Integer.MIN_VALUE;
                Object obj = eVar.f840u;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = eVar.f842w;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    com.onesignal.debug.internal.logging.otel.android.c cVar = this.f844b;
                    Iterator it = g.g(cVar.getCrashStoragePath(), cVar.getMinFileAgeForReadMillis()).f40n.iterator();
                    h.d(it, "iterator(...)");
                    b(it);
                    long minFileAgeForReadMillis = cVar.getMinFileAgeForReadMillis();
                    eVar.f839n = this;
                    eVar.f842w = 1;
                    if (AbstractC0399y.f(minFileAgeForReadMillis, eVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    fVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = eVar.f839n;
                    com.bumptech.glide.f.r(obj);
                }
                com.onesignal.debug.internal.logging.otel.android.c cVar2 = fVar.f844b;
                Iterator it2 = g.g(cVar2.getCrashStoragePath(), cVar2.getMinFileAgeForReadMillis()).f40n.iterator();
                h.d(it2, "iterator(...)");
                fVar.b(it2);
                return v.f40183a;
            }
        }
        eVar = new e(this, abstractC5219c);
        Object obj2 = eVar.f840u;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = eVar.f842w;
        if (i != 0) {
        }
        com.onesignal.debug.internal.logging.otel.android.c cVar22 = fVar.f844b;
        Iterator it22 = g.g(cVar22.getCrashStoragePath(), cVar22.getMinFileAgeForReadMillis()).f40n.iterator();
        h.d(it22, "iterator(...)");
        fVar.b(it22);
        return v.f40183a;
    }

    public final void b(Iterator it) {
        a7.f fVar = (a7.f) this.f843a.f355g.getValue();
        boolean z8 = false;
        while (it.hasNext() && !z8) {
            U6.c e6 = fVar.e((Collection) it.next());
            com.onesignal.debug.internal.logging.otel.android.a aVar = this.f845c;
            aVar.debug("Sending OneSignal crash report");
            e6.c(30L, TimeUnit.SECONDS);
            z8 = !e6.b();
            aVar.debug("Done OneSignal crash report, failed: " + z8);
        }
    }

    public final Object c(x7.h hVar) {
        String remoteLogLevel = this.f844b.getRemoteLogLevel();
        v vVar = v.f40183a;
        com.onesignal.debug.internal.logging.otel.android.a aVar = this.f845c;
        if (remoteLogLevel != null && !remoteLogLevel.equals("NONE")) {
            aVar.info("OtelCrashUploader: starting");
            Object a9 = a(hVar);
            return a9 == EnumC5179a.f41704n ? a9 : vVar;
        }
        aVar.info("OtelCrashUploader: remote logging disabled (level: " + remoteLogLevel + ')');
        return vVar;
    }
}
