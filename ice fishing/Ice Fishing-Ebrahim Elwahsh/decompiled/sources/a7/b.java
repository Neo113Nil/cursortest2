package a7;

import B1.w;
import D.y;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import androidx.emoji2.text.i;
import androidx.emoji2.text.k;
import androidx.emoji2.text.l;
import androidx.emoji2.text.p;
import androidx.emoji2.text.q;
import androidx.fragment.app.C0473f;
import androidx.fragment.app.C0477j;
import androidx.fragment.app.a0;
import e2.C4468a;
import e2.C4469b;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4393n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4394u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f4395v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f4396w;

    public /* synthetic */ b(U6.c cVar, U6.c cVar2, U6.c cVar3) {
        this.f4393n = 1;
        this.f4394u = cVar;
        this.f4395v = cVar2;
        this.f4396w = cVar3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4393n) {
            case 0:
                c cVar = (c) this.f4396w;
                U6.c cVar2 = (U6.c) this.f4394u;
                U6.c cVar3 = (U6.c) this.f4395v;
                cVar.f4403F = false;
                U6.c shutdown = cVar.f4408w.shutdown();
                shutdown.f(new b(cVar2, shutdown, cVar3));
                return;
            case 1:
                boolean b9 = ((U6.c) this.f4394u).b();
                U6.c cVar4 = (U6.c) this.f4396w;
                if (b9 && ((U6.c) this.f4395v).b()) {
                    cVar4.e();
                    return;
                } else {
                    cVar4.a(null);
                    return;
                }
            case 2:
                l lVar = (l) this.f4396w;
                S0.f fVar = (S0.f) this.f4394u;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f4395v;
                lVar.getClass();
                try {
                    q c4 = K3.b.c(lVar.f4899u);
                    if (c4 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    p pVar = (p) ((i) c4.f4884b);
                    synchronized (pVar.f4904w) {
                        pVar.f4906y = threadPoolExecutor;
                    }
                    ((i) c4.f4884b).c(new k(fVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    fVar.o(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 3:
                ArrayList arrayList = (ArrayList) this.f4396w;
                a0 a0Var = (a0) this.f4394u;
                h.e((C0477j) this.f4395v, "this$0");
                if (arrayList.contains(a0Var)) {
                    arrayList.remove(a0Var);
                    View view = a0Var.f5060c.f5162X;
                    int i = a0Var.f5058a;
                    h.d(view, "view");
                    y.a(i, view);
                    return;
                }
                return;
            case 4:
                C0477j this$0 = (C0477j) this.f4396w;
                h.e(this$0, "this$0");
                C0473f animationInfo = (C0473f) this.f4395v;
                h.e(animationInfo, "$animationInfo");
                this$0.f5103a.endViewTransition((View) this.f4394u);
                animationInfo.d();
                return;
            case 5:
                ((com.anythink.core.common.s.a.a) this.f4396w).a((SharedPreferences.OnSharedPreferenceChangeListener) this.f4394u, (String) this.f4395v);
                return;
            case 6:
                com.onesignal.core.internal.application.impl.a.decorViewReady$lambda$1((com.onesignal.core.internal.application.impl.a) this.f4396w, (Runnable) this.f4394u, (com.onesignal.core.internal.application.impl.a) this.f4395v);
                return;
            case 7:
                Z1.i iVar = (Z1.i) this.f4394u;
                String str = iVar.f4225a;
                Z1.h hVar = (Z1.h) this.f4395v;
                C4469b c4469b = (C4469b) this.f4396w;
                c4469b.getClass();
                Logger logger = C4469b.f37319f;
                try {
                    a2.f a9 = c4469b.f37322c.a(str);
                    if (a9 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((g2.h) c4469b.f37324e).m(new C4468a(c4469b, iVar, ((X1.c) a9).a(hVar), 0));
                    }
                    return;
                } catch (Exception e6) {
                    logger.warning("Error scheduling event " + e6.getMessage());
                    return;
                }
            default:
                Intent intent = (Intent) this.f4394u;
                h3.h hVar2 = (h3.h) this.f4395v;
                f4.f fVar2 = (f4.f) this.f4396w;
                fVar2.getClass();
                try {
                    fVar2.b(intent);
                    return;
                } finally {
                    hVar2.b(null);
                }
        }
    }

    public /* synthetic */ b(C4469b c4469b, Z1.i iVar, w wVar, Z1.h hVar) {
        this.f4393n = 7;
        this.f4396w = c4469b;
        this.f4394u = iVar;
        this.f4395v = hVar;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i) {
        this.f4393n = i;
        this.f4396w = obj;
        this.f4394u = obj2;
        this.f4395v = obj3;
    }
}
