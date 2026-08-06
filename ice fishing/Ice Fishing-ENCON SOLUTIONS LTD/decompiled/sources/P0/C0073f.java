package P0;

import android.os.Build;
import java.util.Iterator;

/* renamed from: P0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073f implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1414b;

    public /* synthetic */ C0073f(int i2, Object obj) {
        this.f1413a = i2;
        this.f1414b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f1413a) {
            case 0:
                C0075h c0075h = (C0075h) this.f1414b;
                c0075h.f1417a.getClass();
                c0075h.f1424h = false;
                break;
            case 1:
                t tVar = (t) this.f1414b;
                tVar.f1463h = false;
                Iterator it = tVar.f1462g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case 2:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f1414b).f7769c = false;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f1413a) {
            case 0:
                C0075h c0075h = (C0075h) this.f1414b;
                AbstractActivityC0072e abstractActivityC0072e = c0075h.f1417a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0072e.reportFullyDrawn();
                } else {
                    abstractActivityC0072e.getClass();
                }
                c0075h.f1424h = true;
                c0075h.f1425i = true;
                break;
            case 1:
                t tVar = (t) this.f1414b;
                tVar.f1463h = true;
                Iterator it = tVar.f1462g.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case 2:
                J j2 = (J) this.f1414b;
                j2.f1395a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = j2.f1396b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f1414b).f7769c = true;
                break;
        }
    }

    private final void c() {
    }
}
