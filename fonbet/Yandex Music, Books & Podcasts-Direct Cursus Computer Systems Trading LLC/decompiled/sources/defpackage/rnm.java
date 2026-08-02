package defpackage;

import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.preload_manager.k;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class rnm {
    public final /* synthetic */ k a;
    public final /* synthetic */ snm b;

    public rnm(k kVar, snm snmVar) {
        this.a = kVar;
        this.b = snmVar;
    }

    public final void a(b9w b9wVar, IOException iOException) {
        b9wVar.getClass();
        iOException.getClass();
        Looper myLooper = Looper.myLooper();
        k kVar = this.a;
        Intrinsics.d(myLooper, kVar.f.getLooper());
        Timber.Companion companion = Timber.INSTANCE;
        StringBuilder sb = new StringBuilder("Downloader exception for preloadRequest = ");
        snm snmVar = this.b;
        sb.append(snmVar.a);
        companion.e(iOException, sb.toString(), new Object[0]);
        b9wVar.c();
        String str = snmVar.e;
        Intrinsics.d(Looper.myLooper(), kVar.f.getLooper());
        kVar.h.remove(str);
        c5b c5bVar = c5b.a;
        c5bVar.getClass();
        Set set = snmVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(c5bVar, iOException);
        }
        set.clear();
    }

    public final void b(b9w b9wVar) {
        Object t7oVar;
        Object t7oVar2;
        snm snmVar = this.b;
        String str = snmVar.e;
        k kVar = this.a;
        b9wVar.getClass();
        try {
            try {
                Intrinsics.d(Looper.myLooper(), kVar.f.getLooper());
                List a = k.a(kVar, b9wVar, snmVar.a);
                Timber.Companion companion = Timber.INSTANCE;
                companion.d("Downloader found " + a.size() + " tracks, key = " + str, new Object[0]);
                StringBuilder sb = new StringBuilder("Tracks are: ");
                sb.append(a);
                companion.d(sb.toString(), new Object[0]);
                snmVar.d = a;
                k.b(kVar, str, snmVar);
                try {
                    r7o r7oVar = z7o.b;
                    b9wVar.c();
                    t7oVar2 = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar2 = new t7o(th);
                }
                if (t7oVar2 instanceof t7o) {
                    Timber.INSTANCE.e(z7o.a(t7oVar2), "Failed to release downloader", new Object[0]);
                }
            } catch (Exception e) {
                a(b9wVar, new IOException("failed to extract tracks", e));
                try {
                    r7o r7oVar3 = z7o.b;
                    b9wVar.c();
                    t7oVar = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                if (t7oVar instanceof t7o) {
                    Timber.INSTANCE.e(z7o.a(t7oVar), "Failed to release downloader", new Object[0]);
                }
            }
        } finally {
        }
    }
}
