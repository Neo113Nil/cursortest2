package h;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r.C0334b;
import r.C0339g;

/* renamed from: h.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0170k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3218b;

    public /* synthetic */ RunnableC0170k(Context context, int i) {
        this.f3217a = i;
        this.f3218b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        K.g gVar;
        Object obj;
        Context context;
        switch (this.f3217a) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    Context context2 = this.f3218b;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i < 33) {
                            gVar = p.f3225c;
                            break;
                        } else {
                            C0339g c0339g = p.f3228g;
                            c0339g.getClass();
                            C0334b c0334b = new C0334b(c0339g);
                            while (true) {
                                if (c0334b.hasNext()) {
                                    p pVar = (p) ((WeakReference) c0334b.next()).get();
                                    if (pVar != null && (context = ((LayoutInflaterFactory2C0159B) pVar).f3113k) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            if (obj != null) {
                                gVar = new K.g(new K.h(AbstractC0172m.a(obj)));
                                if (gVar.f385a.f386a.isEmpty()) {
                                    String e = D.e.e(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        AbstractC0172m.b(systemService, AbstractC0171l.a(e));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            gVar = K.g.f384b;
                            if (gVar.f385a.f386a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                p.f3227f = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0170k(this.f3218b, 2));
                break;
            default:
                i0.f.t(this.f3218b, new i0.d(), i0.f.f3287a, false);
                break;
        }
    }
}
