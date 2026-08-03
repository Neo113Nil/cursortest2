package b6;

import android.content.Intent;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import d6.j;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import q3.k;
import q3.l;
import q3.q;
import q3.r;
import w5.h;
import w5.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1017g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f1018h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1019i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1020j;

    public /* synthetic */ a(c cVar, i iVar, d6.f fVar, h hVar) {
        this.f1017g = 0;
        this.f1018h = cVar;
        this.f1019i = iVar;
        this.f1020j = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1017g) {
            case 0:
                c cVar = (c) this.f1018h;
                i iVar = (i) this.f1019i;
                String str = iVar.f7687a;
                h hVar = (h) this.f1020j;
                cVar.getClass();
                Logger logger = c.f1025f;
                try {
                    x5.f a6 = cVar.f1028c.a(str);
                    if (a6 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((j) cVar.f1030e).i(new b(cVar, iVar, ((u5.c) a6).a(hVar), 0));
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    return;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                com.onesignal.core.internal.application.impl.a.m7decorViewReady$lambda1((com.onesignal.core.internal.application.impl.a) this.f1018h, (Runnable) this.f1019i, (com.onesignal.core.internal.application.impl.a) this.f1020j);
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                d8.g gVar = (d8.g) this.f1018h;
                Intent intent = (Intent) this.f1019i;
                g7.h hVar2 = (g7.h) this.f1020j;
                try {
                    gVar.b(intent);
                    return;
                } finally {
                    hVar2.a(null);
                }
            case 3:
                PermissionsActivity.m6onRequestPermissionsResult$lambda0((PermissionsActivity) this.f1018h, (String[]) this.f1019i, (int[]) this.f1020j);
                return;
            default:
                l lVar = (l) this.f1018h;
                a.a aVar = (a.a) this.f1019i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1020j;
                try {
                    r G = x4.f.G(lVar.f5771a);
                    if (G == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    q qVar = (q) G.f5787a;
                    synchronized (qVar.f5781d) {
                        qVar.f5783f = threadPoolExecutor;
                    }
                    G.f5787a.a(new k(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    aVar.E(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f1017g = i10;
        this.f1018h = obj;
        this.f1019i = obj2;
        this.f1020j = obj3;
    }
}
