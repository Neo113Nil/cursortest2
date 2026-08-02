package androidx.emoji2.text;

import A1.C0266h;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.C0467f;
import androidx.fragment.app.C0471j;
import androidx.fragment.app.a0;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4749n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4750u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4751v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4752w;

    public /* synthetic */ k(int i, Object obj, Object obj2, Object obj3) {
        this.f4749n = i;
        this.f4750u = obj;
        this.f4751v = obj2;
        this.f4752w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4749n) {
            case 0:
                C0266h c0266h = (C0266h) this.f4750u;
                A8.b bVar = (A8.b) this.f4751v;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4752w;
                c0266h.getClass();
                try {
                    q f2 = t8.g.f(c0266h.f60u);
                    if (f2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((i) f2.f4737b);
                    synchronized (pVar.f4759w) {
                        pVar.f4761y = threadPoolExecutor;
                    }
                    ((i) f2.f4737b).c(new l(bVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    bVar.r(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.f4750u;
                a0 a0Var = (a0) this.f4751v;
                kotlin.jvm.internal.h.e((C0471j) this.f4752w, "this$0");
                if (arrayList.contains(a0Var)) {
                    arrayList.remove(a0Var);
                    View view = a0Var.f4916c.f5018X;
                    int i = a0Var.f4914a;
                    kotlin.jvm.internal.h.d(view, "view");
                    D.x.a(i, view);
                    return;
                }
                return;
            case 2:
                C0471j this$0 = (C0471j) this.f4750u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                C0467f animationInfo = (C0467f) this.f4752w;
                kotlin.jvm.internal.h.e(animationInfo, "$animationInfo");
                this$0.f4959a.endViewTransition((View) this.f4751v);
                animationInfo.d();
                return;
            case 3:
                ((com.anythink.core.common.s.a.a) this.f4750u).a((SharedPreferences.OnSharedPreferenceChangeListener) this.f4751v, (String) this.f4752w);
                return;
            case 4:
                com.onesignal.core.internal.application.impl.a.decorViewReady$lambda$1((com.onesignal.core.internal.application.impl.a) this.f4750u, (Runnable) this.f4751v, (com.onesignal.core.internal.application.impl.a) this.f4752w);
                return;
            case 5:
                e7.b bVar2 = (e7.b) this.f4750u;
                Y6.c cVar = (Y6.c) this.f4751v;
                Y6.c cVar2 = (Y6.c) this.f4752w;
                bVar2.f37294F = false;
                Y6.c shutdown = bVar2.f37299w.shutdown();
                shutdown.f(new k(6, cVar, shutdown, cVar2));
                return;
            case 6:
                boolean b9 = ((Y6.c) this.f4750u).b();
                Y6.c cVar3 = (Y6.c) this.f4752w;
                if (b9 && ((Y6.c) this.f4751v).b()) {
                    cVar3.e();
                    return;
                } else {
                    cVar3.a(null);
                    return;
                }
            case 7:
                b2.i iVar = (b2.i) this.f4751v;
                String str = iVar.f5537a;
                b2.h hVar = (b2.h) this.f4752w;
                g2.b bVar3 = (g2.b) this.f4750u;
                bVar3.getClass();
                Logger logger = g2.b.f37664f;
                try {
                    c2.f a9 = bVar3.f37667c.a(str);
                    if (a9 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((i2.h) bVar3.f37669e).m(new g2.a(0, bVar3, iVar, ((Z1.c) a9).a(hVar)));
                    }
                    return;
                } catch (Exception e9) {
                    logger.warning("Error scheduling event " + e9.getMessage());
                    return;
                }
            default:
                Intent intent = (Intent) this.f4751v;
                l3.h hVar2 = (l3.h) this.f4752w;
                l4.h hVar3 = (l4.h) this.f4750u;
                hVar3.getClass();
                try {
                    hVar3.b(intent);
                    return;
                } finally {
                    hVar2.b(null);
                }
        }
    }

    public /* synthetic */ k(g2.b bVar, b2.i iVar, D0.n nVar, b2.h hVar) {
        this.f4749n = 7;
        this.f4750u = bVar;
        this.f4751v = iVar;
        this.f4752w = hVar;
    }
}
