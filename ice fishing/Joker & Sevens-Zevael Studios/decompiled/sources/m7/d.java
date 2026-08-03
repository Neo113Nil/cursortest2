package m7;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4946g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f4947h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Runnable f4948i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f4949j;

    public /* synthetic */ d(f fVar, Runnable runnable, g gVar, int i10) {
        this.f4946g = i10;
        this.f4947h = fVar;
        this.f4948i = runnable;
        this.f4949j = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4946g) {
            case 0:
                ExecutorService executorService = this.f4947h.f4954g;
                final int i10 = 0;
                final Runnable runnable = this.f4948i;
                final g gVar = this.f4949j;
                executorService.execute(new Runnable() { // from class: m7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    gVar.v(e10);
                                    throw e10;
                                }
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e11) {
                                    gVar.v(e11);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                g gVar2 = gVar;
                                try {
                                    runnable2.run();
                                    i iVar = (i) gVar2.f4957h;
                                    if (v2.h.f7203l.g(iVar, null, v2.h.f7204m)) {
                                        v2.h.d(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e12) {
                                    gVar2.v(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ExecutorService executorService2 = this.f4947h.f4954g;
                final int i11 = 2;
                final Runnable runnable2 = this.f4948i;
                final g gVar2 = this.f4949j;
                executorService2.execute(new Runnable() { // from class: m7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    gVar2.v(e10);
                                    throw e10;
                                }
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e11) {
                                    gVar2.v(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                g gVar22 = gVar2;
                                try {
                                    runnable22.run();
                                    i iVar = (i) gVar22.f4957h;
                                    if (v2.h.f7203l.g(iVar, null, v2.h.f7204m)) {
                                        v2.h.d(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e12) {
                                    gVar22.v(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f4947h.f4954g;
                final int i12 = 1;
                final Runnable runnable3 = this.f4948i;
                final g gVar3 = this.f4949j;
                executorService3.execute(new Runnable() { // from class: m7.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    gVar3.v(e10);
                                    throw e10;
                                }
                            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e11) {
                                    gVar3.v(e11);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                g gVar22 = gVar3;
                                try {
                                    runnable22.run();
                                    i iVar = (i) gVar22.f4957h;
                                    if (v2.h.f7203l.g(iVar, null, v2.h.f7204m)) {
                                        v2.h.d(iVar);
                                        return;
                                    }
                                    return;
                                } catch (Exception e12) {
                                    gVar22.v(e12);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
