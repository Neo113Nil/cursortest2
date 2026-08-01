package G;

import F.l;
import L.m;
import a.AbstractC0078a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k0.j0;
import r.C0342j;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0078a f268a;

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f269b;

    static {
        h0.f.b("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f268a = new i();
        } else if (i >= 28) {
            f268a = new h();
        } else {
            f268a = new g();
        }
        f269b = new j0(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, F.e eVar, Resources resources, int i, String str, int i2, int i3, F.b bVar, boolean z2) {
        Typeface o2;
        Typeface typeface;
        List unmodifiableList;
        int i4 = 1;
        int i5 = 0;
        int i6 = -3;
        if (eVar instanceof F.h) {
            F.h hVar = (F.h) eVar;
            String str2 = hVar.e;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new l(bVar, 0, typeface));
                }
                return typeface;
            }
            boolean z3 = !z2 ? bVar != null : hVar.f206d != 0;
            int i7 = z2 ? hVar.f205c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            B.b bVar2 = new B.b(3);
            bVar2.f10b = bVar;
            L.e eVar2 = hVar.f204b;
            if (eVar2 != null) {
                Object[] objArr = {hVar.f203a, eVar2};
                ArrayList arrayList = new ArrayList(2);
                for (int i8 = 0; i8 < 2; i8++) {
                    Object obj = objArr[i8];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                Object[] objArr2 = {hVar.f203a};
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = objArr2[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            List list = unmodifiableList;
            K.e eVar3 = new K.e(handler, 1);
            F.i iVar = new F.i(bVar2, i4, eVar3);
            if (!z3) {
                String a2 = L.i.a(list, i3);
                Typeface typeface2 = (Typeface) L.i.f427a.f(a2);
                if (typeface2 != null) {
                    eVar3.execute(new D.b(bVar2, 3, typeface2));
                    o2 = typeface2;
                } else {
                    L.g gVar = new L.g(i5, iVar);
                    synchronized (L.i.f429c) {
                        try {
                            C0342j c0342j = L.i.f430d;
                            ArrayList arrayList3 = (ArrayList) c0342j.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(gVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(gVar);
                                c0342j.put(a2, arrayList4);
                                L.f fVar = new L.f(a2, context, list, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = L.i.f428b;
                                L.g gVar2 = new L.g(i4, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                m mVar = new m();
                                mVar.f437b = fVar;
                                mVar.f438c = gVar2;
                                mVar.f439d = handler2;
                                threadPoolExecutor.execute(mVar);
                            }
                        } finally {
                        }
                    }
                    o2 = null;
                }
            } else {
                if (list.size() > 1) {
                    throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
                }
                L.e eVar4 = (L.e) list.get(0);
                j0 j0Var = L.i.f427a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{eVar4}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a3 = L.i.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface3 = (Typeface) L.i.f427a.f(a3);
                if (typeface3 != null) {
                    eVar3.execute(new D.b(bVar2, 3, typeface3));
                    o2 = typeface3;
                } else if (i7 == -1) {
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = new Object[]{eVar4}[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    L.h b2 = L.i.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    iVar.D(b2);
                    o2 = b2.f425a;
                } else {
                    try {
                        try {
                            try {
                                L.h hVar2 = (L.h) L.i.f428b.submit(new L.f(a3, context, eVar4, i3, 0)).get(i7, TimeUnit.MILLISECONDS);
                                iVar.D(hVar2);
                                o2 = hVar2.f425a;
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((K.e) iVar.f209c).execute(new L.a(i6, i5, (B.b) iVar.f208b));
                    }
                }
            }
        } else {
            o2 = f268a.o(context, (F.f) eVar, resources, i3);
            if (bVar != null) {
                if (o2 != null) {
                    new Handler(Looper.getMainLooper()).post(new l(bVar, 0, o2));
                } else {
                    bVar.a(-3);
                }
            }
        }
        if (o2 != null) {
            f269b.j(b(resources, i, str, i2, i3), o2);
        }
        return o2;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
