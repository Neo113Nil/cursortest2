package androidx.emoji2.text;

import D.y;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.C0463f;
import androidx.fragment.app.C0467j;
import androidx.fragment.app.a0;
import e2.C4461a;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4781n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4782u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4783v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4784w;

    public /* synthetic */ k(int i, Object obj, Object obj2, Object obj3) {
        this.f4781n = i;
        this.f4782u = obj;
        this.f4783v = obj2;
        this.f4784w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4781n) {
            case 0:
                V2.b bVar = (V2.b) this.f4782u;
                t8.g gVar = (t8.g) this.f4783v;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4784w;
                bVar.getClass();
                try {
                    q d2 = d6.c.d(bVar.f3273u);
                    if (d2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((i) d2.f4769b);
                    synchronized (pVar.f4791w) {
                        pVar.f4793y = threadPoolExecutor;
                    }
                    ((i) d2.f4769b).a(new l(gVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    gVar.s(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.f4782u;
                a0 a0Var = (a0) this.f4783v;
                kotlin.jvm.internal.h.e((C0467j) this.f4784w, "this$0");
                if (arrayList.contains(a0Var)) {
                    arrayList.remove(a0Var);
                    View view = a0Var.f4948c.f5050X;
                    int i = a0Var.f4946a;
                    kotlin.jvm.internal.h.d(view, "view");
                    y.a(i, view);
                    return;
                }
                return;
            case 2:
                C0467j this$0 = (C0467j) this.f4782u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                C0463f animationInfo = (C0463f) this.f4784w;
                kotlin.jvm.internal.h.e(animationInfo, "$animationInfo");
                this$0.f4991a.endViewTransition((View) this.f4783v);
                animationInfo.d();
                return;
            case 3:
                ((com.anythink.core.common.s.a.a) this.f4782u).a((SharedPreferences.OnSharedPreferenceChangeListener) this.f4783v, (String) this.f4784w);
                return;
            case 4:
                com.onesignal.core.internal.application.impl.a.decorViewReady$lambda$1((com.onesignal.core.internal.application.impl.a) this.f4782u, (Runnable) this.f4783v, (com.onesignal.core.internal.application.impl.a) this.f4784w);
                return;
            case 5:
                Z1.i iVar = (Z1.i) this.f4783v;
                String str = iVar.f4148a;
                Z1.h hVar = (Z1.h) this.f4784w;
                e2.b bVar2 = (e2.b) this.f4782u;
                bVar2.getClass();
                Logger logger = e2.b.f37188f;
                try {
                    a2.g a9 = bVar2.f37191c.a(str);
                    if (a9 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((g2.h) bVar2.f37193e).m(new C4461a(0, bVar2, iVar, ((X1.c) a9).a(hVar)));
                    }
                    return;
                } catch (Exception e9) {
                    logger.warning("Error scheduling event " + e9.getMessage());
                    return;
                }
            case 6:
                e7.b bVar3 = (e7.b) this.f4782u;
                Y6.c cVar = (Y6.c) this.f4783v;
                Y6.c cVar2 = (Y6.c) this.f4784w;
                bVar3.f37218F = false;
                Y6.c shutdown = bVar3.f37223w.shutdown();
                shutdown.f(new k(7, cVar, shutdown, cVar2));
                return;
            case 7:
                boolean b9 = ((Y6.c) this.f4782u).b();
                Y6.c cVar3 = (Y6.c) this.f4784w;
                if (b9 && ((Y6.c) this.f4783v).b()) {
                    cVar3.e();
                    return;
                } else {
                    cVar3.a(null);
                    return;
                }
            default:
                Intent intent = (Intent) this.f4783v;
                j3.h hVar2 = (j3.h) this.f4784w;
                j4.h hVar3 = (j4.h) this.f4782u;
                hVar3.getClass();
                try {
                    hVar3.b(intent);
                    return;
                } finally {
                    hVar2.b(null);
                }
        }
    }

    public /* synthetic */ k(e2.b bVar, Z1.i iVar, B1.x xVar, Z1.h hVar) {
        this.f4781n = 5;
        this.f4782u = bVar;
        this.f4783v = iVar;
        this.f4784w = hVar;
    }
}
