package N3;

import a.AbstractC0426a;
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
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final f3.c f2014a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2015b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2016c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2019f;

    /* renamed from: g, reason: collision with root package name */
    public final Intent f2020g;

    /* renamed from: h, reason: collision with root package name */
    public final p f2021h;

    /* renamed from: j, reason: collision with root package name */
    public u f2022j;

    /* renamed from: k, reason: collision with root package name */
    public IInterface f2023k;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2017d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f2018e = new CopyOnWriteArrayList();
    public final t i = new IBinder.DeathRecipient() { // from class: N3.t
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            v vVar = v.this;
            if (Log.isLoggable("ServiceConnMgrImpl", 4)) {
                Log.i("ServiceConnMgrImpl", "Binder has died: ".concat(vVar.f2016c));
            }
            ArrayList arrayList = vVar.f2017d;
            synchronized (arrayList) {
                arrayList.clear();
            }
            vVar.c(new q(vVar, 1));
        }
    };

    /* JADX WARN: Type inference failed for: r2v3, types: [N3.t] */
    public v(Context context, String str, Intent intent, p pVar) {
        this.f2015b = context;
        this.f2016c = str;
        this.f2020g = intent;
        this.f2021h = pVar;
        this.f2014a = AbstractC0426a.r(new s(str));
    }

    public final void a(Runnable runnable) {
        c(new LD(16, this, runnable));
    }

    public final void b() {
        Iterator it = this.f2018e.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            gVar.getClass();
            Log.i("HsdpClientImpl", "HSDP bound service disconnected");
            ((Handler) gVar.f1972b.f2014a.c()).post(new G0.c(6, gVar));
        }
    }

    public final void c(Runnable runnable) {
        ((Handler) this.f2014a.c()).post(new r(0, runnable));
    }
}
