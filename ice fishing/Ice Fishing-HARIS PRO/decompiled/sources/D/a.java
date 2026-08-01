package D;

import B0.k;
import L.j;
import V.r;
import Z.AbstractComponentCallbacksC0070s;
import a.AbstractC0078a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0096m;
import b.DialogC0114j;
import b.ExecutorC0112h;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import h.AbstractActivityC0168i;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f104b;

    public /* synthetic */ a(int i, Object obj) {
        this.f103a = i;
        this.f104b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Application application;
        c cVar;
        switch (this.f103a) {
            case 0:
                Activity activity = (Activity) this.f104b;
                if (activity.isFinishing()) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    Class cls = d.f113a;
                    activity.recreate();
                    return;
                }
                Class cls2 = d.f113a;
                ?? r6 = 26;
                ?? r7 = i == 26 || i == 27;
                Method method = d.f117f;
                if ((r7 == false || method != null) && (d.e != null || d.f116d != null)) {
                    try {
                        Object obj2 = d.f115c.get(activity);
                        if (obj2 != null && (obj = d.f114b.get(activity)) != null) {
                            Application application2 = activity.getApplication();
                            c cVar2 = new c(activity);
                            application2.registerActivityLifecycleCallbacks(cVar2);
                            Handler handler = d.f118g;
                            handler.post(new b(cVar2, 0, obj2));
                            try {
                                if ((i == 26 || i == 27) == true) {
                                    try {
                                        Boolean bool = Boolean.FALSE;
                                        r6 = handler;
                                        cVar = cVar2;
                                        application = application2;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } catch (Throwable th) {
                                        th = th;
                                        r6 = handler;
                                        cVar = cVar2;
                                        application = application2;
                                        r6.post(new b(application, cVar, 1, 0 == true ? 1 : 0));
                                        throw th;
                                    }
                                } else {
                                    r6 = handler;
                                    cVar = cVar2;
                                    application = application2;
                                    activity.recreate();
                                }
                                r6.post(new b(application, cVar, 1, 0 == true ? 1 : 0));
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                ((CarouselLayoutManager) this.f104b).p0();
                return;
            case 2:
                View view = (View) this.f104b;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
            case 3:
                k kVar = (k) this.f104b;
                kVar.f56c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) kVar.e;
                U.e eVar = sideSheetBehavior.i;
                if (eVar != null && eVar.h()) {
                    kVar.a(kVar.f55b);
                    return;
                } else {
                    if (sideSheetBehavior.f2570h == 2) {
                        sideSheetBehavior.w(kVar.f55b);
                        return;
                    }
                    return;
                }
            case 4:
                r rVar = (r) this.f104b;
                synchronized (rVar.f1237d) {
                    try {
                        if (rVar.f1240h == null) {
                            return;
                        }
                        try {
                            j b2 = rVar.b();
                            int i2 = b2.e;
                            if (i2 == 2) {
                                synchronized (rVar.f1237d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = K.i.f387a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                S0.e eVar2 = rVar.f1236c;
                                Context context = rVar.f1234a;
                                eVar2.getClass();
                                j[] jVarArr = {b2};
                                AbstractC0078a abstractC0078a = G.f.f268a;
                                h0.f.b("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface p2 = G.f.f268a.p(context, jVarArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer Q2 = AbstractC0078a.Q(rVar.f1234a, b2.f431a);
                                    if (Q2 == null || p2 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        B.k kVar2 = new B.k(p2, R.j.f0(Q2));
                                        Trace.endSection();
                                        synchronized (rVar.f1237d) {
                                            try {
                                                R.j jVar = rVar.f1240h;
                                                if (jVar != null) {
                                                    jVar.Z(kVar2);
                                                }
                                            } finally {
                                            }
                                        }
                                        rVar.a();
                                        return;
                                    } finally {
                                        int i4 = K.i.f387a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            synchronized (rVar.f1237d) {
                                try {
                                    R.j jVar2 = rVar.f1240h;
                                    if (jVar2 != null) {
                                        jVar2.W(th3);
                                    }
                                    rVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 5:
                ((V0.e) this.f104b).t(true);
                return;
            case 6:
                V0.k kVar3 = (V0.k) this.f104b;
                boolean isPopupShowing = kVar3.f1282h.isPopupShowing();
                kVar3.t(isPopupShowing);
                kVar3.f1285m = isPopupShowing;
                return;
            case 7:
                ((TextInputLayout) this.f104b).f2621d.requestLayout();
                return;
            case 8:
                AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s = (AbstractComponentCallbacksC0070s) this.f104b;
                abstractComponentCallbacksC0070s.f1593P.e.b(abstractComponentCallbacksC0070s.f1602d);
                abstractComponentCallbacksC0070s.f1602d = null;
                return;
            case 9:
                E e = (E) this.f104b;
                D1.i.e(e, "this$0");
                int i5 = e.f1992b;
                C0103u c0103u = e.f1995f;
                if (i5 == 0) {
                    e.f1993c = true;
                    c0103u.d(EnumC0096m.ON_PAUSE);
                }
                if (e.f1991a == 0 && e.f1993c) {
                    c0103u.d(EnumC0096m.ON_STOP);
                    e.f1994d = true;
                    return;
                }
                return;
            case 10:
                ((AbstractActivityC0168i) this.f104b).invalidateOptionsMenu();
                return;
            case 11:
                ExecutorC0112h executorC0112h = (ExecutorC0112h) this.f104b;
                Runnable runnable = executorC0112h.f2278b;
                if (runnable != null) {
                    runnable.run();
                    executorC0112h.f2278b = null;
                    return;
                }
                return;
            default:
                DialogC0114j.a((DialogC0114j) this.f104b);
                return;
        }
    }
}
