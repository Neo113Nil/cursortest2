package defpackage;

import androidx.media3.ui.AspectRatioFrameLayout;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nq1 implements Runnable {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nq1(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[Catch: all -> 0x0044, LOOP:0: B:11:0x0066->B:13:0x006f, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:6:0x000f, B:9:0x003e, B:10:0x0046, B:11:0x0066, B:13:0x006f, B:20:0x001a, B:21:0x0028, B:23:0x0031), top: B:5:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        vy0 vy0Var;
        Iterator it;
        vy0 vy0Var2;
        switch (this.a) {
            case 0:
                this.b = false;
                int i = oq1.d;
                return;
            case 1:
                this.b = false;
                int i2 = AspectRatioFrameLayout.d;
                return;
            case 2:
                g2a g2aVar = (g2a) ((pv7) this.c).b;
                if (this.b) {
                    g2aVar.l = true;
                    if (g2aVar.i > 0) {
                        hhr hhrVar = g2aVar.k;
                        hhrVar.a = false;
                        hhrVar.b();
                    }
                }
                g2aVar.q = false;
                return;
            case 3:
                xd0 xd0Var = (xd0) this.c;
                boolean z = this.b;
                xut.a();
                z0j z0jVar = (z0j) xd0Var.b;
                boolean z2 = z0jVar.b;
                z0jVar.b = z;
                if (z2 != z) {
                    ((emq) z0jVar.c).a(z);
                    return;
                }
                return;
            default:
                pgu pguVar = (pgu) this.c;
                synchronized (pguVar.a) {
                    try {
                        lum lumVar = pguVar.a;
                        if (((kum) lumVar.b).b <= 0) {
                            Iterator it2 = ((sy0) ((xy0) lumVar.c).entrySet()).iterator();
                            do {
                                vy0Var = (vy0) it2;
                                if (vy0Var.hasNext()) {
                                    vy0Var.next();
                                } else {
                                    lum lumVar2 = pguVar.a;
                                    kum kumVar = (kum) lumVar2.a;
                                    kumVar.a = 0L;
                                    kumVar.b = 0;
                                    kum kumVar2 = (kum) lumVar2.b;
                                    kumVar2.a = 0L;
                                    kumVar2.b = 0;
                                    it = ((sy0) ((xy0) lumVar2.c).entrySet()).iterator();
                                    while (true) {
                                        vy0Var2 = (vy0) it;
                                        if (!vy0Var2.hasNext()) {
                                            vy0Var2.next();
                                            kum kumVar3 = (kum) vy0Var2.getValue();
                                            kumVar3.a = 0L;
                                            kumVar3.b = 0;
                                        }
                                    }
                                }
                            } while (((kum) vy0Var.getValue()).b <= 0);
                        }
                        pguVar.a.H();
                        lum lumVar22 = pguVar.a;
                        kum kumVar4 = (kum) lumVar22.a;
                        kumVar4.a = 0L;
                        kumVar4.b = 0;
                        kum kumVar22 = (kum) lumVar22.b;
                        kumVar22.a = 0L;
                        kumVar22.b = 0;
                        it = ((sy0) ((xy0) lumVar22.c).entrySet()).iterator();
                        while (true) {
                            vy0Var2 = (vy0) it;
                            if (!vy0Var2.hasNext()) {
                            }
                            vy0Var2.next();
                            kum kumVar32 = (kum) vy0Var2.getValue();
                            kumVar32.a = 0L;
                            kumVar32.b = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.b = false;
                return;
        }
    }

    public /* synthetic */ nq1(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }
}
