package G;

import E2.M;
import E2.x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.ads.C0;
import com.google.android.gms.internal.ads.LD;
import i1.C4585b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Q3.b f1038a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0 f1039b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f1038a = new o();
        } else if (i >= 28) {
            f1038a = new n();
        } else if (i >= 26) {
            f1038a = new m();
        } else {
            Method method = l.f1047d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f1038a = new l();
            } else {
                f1038a = new k();
            }
        }
        f1039b = new C0(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r3.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, F.f fVar, Resources resources, int i, String str, int i4, int i6, F.b bVar, boolean z6) {
        Typeface c9;
        Typeface typeface;
        int i9 = 10;
        int i10 = 1;
        int i11 = 0;
        int i12 = -3;
        if (fVar instanceof F.i) {
            F.i iVar = (F.i) fVar;
            String str2 = iVar.f930d;
            c9 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new F.n(i11, bVar, typeface));
                }
                return typeface;
            }
            boolean z9 = !z6 ? bVar != null : iVar.f929c != 0;
            int i13 = z6 ? iVar.f928b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C4585b c4585b = new C4585b(7);
            c4585b.f38152u = bVar;
            M m9 = iVar.f927a;
            S0.l lVar = new S0.l(3, c4585b, handler);
            if (z9) {
                C0 c02 = L.g.f1703a;
                String str3 = ((String) m9.f765y) + "-" + i6;
                Typeface typeface2 = (Typeface) L.g.f1703a.a(str3);
                if (typeface2 != null) {
                    handler.post(new LD(i9, c4585b, typeface2));
                    c9 = typeface2;
                } else if (i13 == -1) {
                    L.f a9 = L.g.a(str3, context, m9, i6);
                    lVar.F(a9);
                    c9 = a9.f1701a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    L.f fVar2 = (L.f) L.g.f1704b.submit(new L.d(str3, context, m9, i6, 0)).get(i13, TimeUnit.MILLISECONDS);
                                    lVar.F(fVar2);
                                    c9 = fVar2.f1701a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e9) {
                                throw e9;
                            }
                        } catch (ExecutionException e10) {
                            throw new RuntimeException(e10);
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) lVar.f2927v).post(new L.a((C4585b) lVar.f2926u, i12, i11));
                    }
                }
            } else {
                C0 c03 = L.g.f1703a;
                String str4 = ((String) m9.f765y) + "-" + i6;
                Typeface typeface3 = (Typeface) L.g.f1703a.a(str4);
                if (typeface3 != null) {
                    handler.post(new LD(i9, c4585b, typeface3));
                    c9 = typeface3;
                } else {
                    L.e eVar = new L.e(i11, lVar);
                    synchronized (L.g.f1705c) {
                        try {
                            s.k kVar = L.g.f1706d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(eVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar);
                                kVar.put(str4, arrayList2);
                                L.d dVar = new L.d(str4, context, m9, i6, 1);
                                ThreadPoolExecutor threadPoolExecutor = L.g.f1704b;
                                L.e eVar2 = new L.e(i10, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                x xVar = new x(4);
                                xVar.f884u = dVar;
                                xVar.f885v = eVar2;
                                xVar.f886w = handler2;
                                threadPoolExecutor.execute(xVar);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            c9 = f1038a.c(context, (F.g) fVar, resources, i6);
            if (bVar != null) {
                if (c9 != null) {
                    new Handler(Looper.getMainLooper()).post(new F.n(i11, bVar, c9));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (c9 != null) {
            f1039b.b(b(resources, i, str, i4, i6), c9);
        }
        return c9;
    }

    public static String b(Resources resources, int i, String str, int i4, int i6) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i4 + '-' + i + '-' + i6;
    }
}
