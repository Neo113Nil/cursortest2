package G;

import C2.N;
import C2.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.internal.ads.C0;
import com.google.android.gms.internal.ads.LD;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final V2.a f1012a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0 f1013b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f1012a = new o();
        } else if (i >= 28) {
            f1012a = new n();
        } else if (i >= 26) {
            f1012a = new m();
        } else {
            Method method = l.f1021e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f1012a = new l();
            } else {
                f1012a = new k();
            }
        }
        f1013b = new C0(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (r5.equals(r11) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, F.f fVar, Resources resources, int i, String str, int i6, int i9, F.b bVar, boolean z3) {
        Typeface d2;
        Typeface typeface;
        int i10 = 10;
        int i11 = 4;
        int i12 = 1;
        int i13 = 0;
        int i14 = -3;
        if (fVar instanceof F.i) {
            F.i iVar = (F.i) fVar;
            String str2 = iVar.f867d;
            d2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new F.n(i13, bVar, typeface));
                }
                return typeface;
            }
            boolean z6 = !z3 ? bVar != null : iVar.f866c != 0;
            int i15 = z3 ? iVar.f865b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            I0.j jVar = new I0.j(4);
            jVar.f1264u = bVar;
            N n9 = iVar.f864a;
            S0.e eVar = new S0.e(3, jVar, handler);
            if (z6) {
                C0 c02 = L.g.f1594a;
                String str3 = ((String) n9.f305y) + "-" + i9;
                Typeface typeface2 = (Typeface) L.g.f1594a.a(str3);
                if (typeface2 != null) {
                    handler.post(new LD(i10, jVar, typeface2));
                    d2 = typeface2;
                } else if (i15 == -1) {
                    L.f a9 = L.g.a(str3, context, n9, i9);
                    eVar.l(a9);
                    d2 = a9.f1592a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    L.f fVar2 = (L.f) L.g.f1595b.submit(new L.d(str3, context, n9, i9, 0)).get(i15, TimeUnit.MILLISECONDS);
                                    eVar.l(fVar2);
                                    d2 = fVar2.f1592a;
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
                        ((Handler) eVar.f2782v).post(new L.a((I0.j) eVar.f2781u, i14, i13));
                    }
                }
            } else {
                C0 c03 = L.g.f1594a;
                String str4 = ((String) n9.f305y) + "-" + i9;
                Typeface typeface3 = (Typeface) L.g.f1594a.a(str4);
                if (typeface3 != null) {
                    handler.post(new LD(i10, jVar, typeface3));
                    d2 = typeface3;
                } else {
                    L.e eVar2 = new L.e(i13, eVar);
                    synchronized (L.g.f1596c) {
                        try {
                            s.k kVar = L.g.f1597d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(eVar2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(eVar2);
                                kVar.put(str4, arrayList2);
                                L.d dVar = new L.d(str4, context, n9, i9, 1);
                                ThreadPoolExecutor threadPoolExecutor = L.g.f1595b;
                                L.e eVar3 = new L.e(i12, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                y yVar = new y(i11);
                                yVar.f425u = dVar;
                                yVar.f426v = eVar3;
                                yVar.f427w = handler2;
                                threadPoolExecutor.execute(yVar);
                            }
                        } finally {
                        }
                    }
                }
            }
        } else {
            d2 = f1012a.d(context, (F.g) fVar, resources, i9);
            if (bVar != null) {
                if (d2 != null) {
                    new Handler(Looper.getMainLooper()).post(new F.n(i13, bVar, d2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (d2 != null) {
            f1013b.b(b(resources, i, str, i6, i9), d2);
        }
        return d2;
    }

    public static String b(Resources resources, int i, String str, int i6, int i9) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i6 + '-' + i + '-' + i9;
    }
}
