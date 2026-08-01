package V;

import Z.C0058f;
import Z.C0063k;
import Z.Y;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1224b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1225c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1226d;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i) {
        this.f1223a = i;
        this.f1224b = obj;
        this.f1225c = obj2;
        this.f1226d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1223a) {
            case 0:
                B.b bVar = (B.b) this.f1224b;
                R.j jVar = (R.j) this.f1225c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1226d;
                bVar.getClass();
                try {
                    s p2 = R.j.p((Context) bVar.f10b);
                    if (p2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    r rVar = (r) ((i) p2.f1211b);
                    synchronized (rVar.f1237d) {
                        rVar.f1238f = threadPoolExecutor;
                    }
                    ((i) p2.f1211b).t(new m(jVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    jVar.W(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ArrayList arrayList = (ArrayList) this.f1224b;
                Y y2 = (Y) this.f1225c;
                D1.i.e((C0063k) this.f1226d, "this$0");
                if (arrayList.contains(y2)) {
                    arrayList.remove(y2);
                    View view = y2.f1505c.f1584F;
                    int i = y2.f1503a;
                    D1.i.d(view, "view");
                    D1.h.a(view, i);
                    return;
                }
                return;
            default:
                C0063k c0063k = (C0063k) this.f1224b;
                D1.i.e(c0063k, "this$0");
                C0058f c0058f = (C0058f) this.f1226d;
                D1.i.e(c0058f, "$animationInfo");
                c0063k.f1559a.endViewTransition((View) this.f1225c);
                c0058f.d();
                return;
        }
    }
}
