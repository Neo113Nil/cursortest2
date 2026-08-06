package N1;

import J1.C0050a;
import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.q;
import io.flutter.view.r;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static l f1215e;

    /* renamed from: f, reason: collision with root package name */
    public static q f1216f;

    /* renamed from: a, reason: collision with root package name */
    public long f1217a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1218b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1219c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1220d;

    public l(M1.d taskRunner, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.e(taskRunner, "taskRunner");
        this.f1217a = timeUnit.toNanos(5L);
        this.f1218b = taskRunner.e();
        this.f1219c = new M1.b(this, kotlin.jvm.internal.i.h(" ConnectionPool", K1.b.f1056f));
        this.f1220d = new ConcurrentLinkedQueue();
    }

    public static l b(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f1215e == null) {
            f1215e = new l(flutterJNI);
        }
        if (f1216f == null) {
            l lVar = f1215e;
            Objects.requireNonNull(lVar);
            q qVar = new q(lVar, displayManager);
            f1216f = qVar;
            displayManager.registerDisplayListener(qVar, null);
        }
        if (f1215e.f1217a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f1215e.f1217a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f1215e;
    }

    public boolean a(C0050a c0050a, i call, ArrayList arrayList, boolean z2) {
        kotlin.jvm.internal.i.e(call, "call");
        Iterator it = ((ConcurrentLinkedQueue) this.f1220d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k connection = (k) it.next();
            kotlin.jvm.internal.i.d(connection, "connection");
            synchronized (connection) {
                if (z2) {
                    if (!(connection.f1204g != null)) {
                    }
                }
                if (connection.h(c0050a, arrayList)) {
                    call.a(connection);
                    return true;
                }
            }
        }
    }

    public int c(k kVar, long j2) {
        byte[] bArr = K1.b.f1051a;
        ArrayList arrayList = kVar.f1213p;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                String str = "A connection to " + kVar.f1199b.f803a.f820h + " was leaked. Did you forget to close a response body?";
                R1.n nVar = R1.n.f1772a;
                R1.n.f1772a.j(((g) reference).f1181a, str);
                arrayList.remove(i2);
                kVar.f1207j = true;
                if (arrayList.isEmpty()) {
                    kVar.f1214q = j2 - this.f1217a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public l(FlutterJNI flutterJNI) {
        this.f1217a = -1L;
        this.f1219c = new r(this, 0L);
        this.f1220d = new io.flutter.view.b(this);
        this.f1218b = flutterJNI;
    }
}
