package c0;

import android.os.Build;
import java.util.Iterator;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0105g implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1695b;

    public /* synthetic */ C0105g(int i2, Object obj) {
        this.f1694a = i2;
        this.f1695b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
        switch (this.f1694a) {
            case 0:
                C0107i c0107i = (C0107i) this.f1695b;
                AbstractActivityC0104f abstractActivityC0104f = c0107i.f1698a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0104f.reportFullyDrawn();
                } else {
                    abstractActivityC0104f.getClass();
                }
                c0107i.f1705h = true;
                c0107i.f1706i = true;
                break;
            case 1:
                r rVar = (r) this.f1695b;
                rVar.f1746l = true;
                Iterator it = rVar.f1745k.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).a();
                }
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                K k2 = (K) this.f1695b;
                k2.f1676a.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.h hVar = k2.f1677b;
                if (hVar != null) {
                    hVar.c(this);
                    break;
                }
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f1695b).f2383c = true;
                break;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        switch (this.f1694a) {
            case 0:
                C0107i c0107i = (C0107i) this.f1695b;
                c0107i.f1698a.getClass();
                c0107i.f1705h = false;
                break;
            case 1:
                r rVar = (r) this.f1695b;
                rVar.f1746l = false;
                Iterator it = rVar.f1745k.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.i) it.next()).b();
                }
                break;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            default:
                ((io.flutter.embedding.engine.renderer.h) this.f1695b).f2383c = false;
                break;
        }
    }

    private final void c() {
    }
}
