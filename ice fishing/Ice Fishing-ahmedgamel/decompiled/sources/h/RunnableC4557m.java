package h;

import D.AbstractC0279i;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ExecutorC4756a;
import r0.AbstractC4895d;

/* renamed from: h.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4557m implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f37927n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f37928u;

    public /* synthetic */ RunnableC4557m(Context context, int i) {
        this.f37927n = i;
        this.f37928u = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        K.l lVar;
        Object obj;
        Context context;
        switch (this.f37927n) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f37928u;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            lVar = p.f37933v;
                            break;
                        } else {
                            Iterator it = p.f37937z.iterator();
                            while (true) {
                                s.f fVar = (s.f) it;
                                if (fVar.hasNext()) {
                                    p pVar = (p) ((WeakReference) fVar.next()).get();
                                    if (pVar != null && (context = ((LayoutInflaterFactory2C4537A) pVar).f37786D) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                lVar = new K.l(new K.m(o.a(obj)));
                                if (lVar.f1592a.f1593a.isEmpty()) {
                                    String e9 = AbstractC0279i.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        o.b(systemService, n.a(e9));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            lVar = K.l.f1591b;
                            if (lVar.f1592a.f1593a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                p.f37936y = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC4557m(this.f37928u, 2));
                break;
            default:
                AbstractC4895d.t(this.f37928u, new ExecutorC4756a(1), AbstractC4895d.f40123a, false);
                break;
        }
    }
}
