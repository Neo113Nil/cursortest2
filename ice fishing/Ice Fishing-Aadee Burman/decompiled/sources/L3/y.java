package L3;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.internal.ads.LD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final d3.c f1742a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1743b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1744c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1747f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f1748g;

    /* renamed from: h, reason: collision with root package name */
    public final s f1749h;

    /* renamed from: j, reason: collision with root package name */
    public x f1750j;

    /* renamed from: k, reason: collision with root package name */
    public IInterface f1751k;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1745d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f1746e = new CopyOnWriteArrayList();
    public final w i = new IBinder.DeathRecipient() { // from class: L3.w
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            y yVar = y.this;
            if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                Log.i("ServiceConnMgrImpl", "Binder has died: ".concat(yVar.f1744c));
            }
            ArrayList arrayList = yVar.f1745d;
            synchronized (arrayList) {
                arrayList.clear();
            }
            yVar.c(new t(yVar, 1));
        }
    };

    /* JADX WARN: Type inference failed for: r2v3, types: [L3.w] */
    public y(Context context, String str, Intent intent, s sVar) {
        this.f1743b = context;
        this.f1744c = str;
        this.f1748g = intent;
        this.f1749h = sVar;
        this.f1742a = S0.f.w(new v(str, 0));
    }

    public final void a(Runnable runnable) {
        c(new LD(16, this, runnable));
    }

    public final void b() {
        Iterator it = this.f1746e.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.getClass();
            Log.i("HsdpClientImpl", "HSDP bound service disconnected");
            ((Handler) gVar.f1693b.f1742a.c()).post(new G0.c(6, gVar));
        }
    }

    public final void c(Runnable runnable) {
        ((Handler) this.f1742a.c()).post(new u(0, runnable));
    }
}
