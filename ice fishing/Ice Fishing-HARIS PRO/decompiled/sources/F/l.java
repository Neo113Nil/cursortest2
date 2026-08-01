package F;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f217c;

    public /* synthetic */ l(Object obj, int i, Object obj2) {
        this.f215a = i;
        this.f216b = obj;
        this.f217c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f215a) {
            case 0:
                ((b) this.f216b).h((Typeface) this.f217c);
                return;
            default:
                Runnable runnable = (Runnable) this.f217c;
                h.n nVar = (h.n) this.f216b;
                nVar.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    nVar.a();
                }
        }
    }
}
