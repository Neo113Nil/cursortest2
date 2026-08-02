package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class cdt {
    public static final hdg a;
    public static final e0h b;

    static {
        Trace.beginSection(y7g.X("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            a = new idt();
        } else if (i >= 28) {
            a = new hdt();
        } else if (i >= 26) {
            a = new gdt();
        } else {
            Method method = edt.f;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new edt();
            } else {
                a = new ddt();
            }
        }
        b = new e0h(16);
        Trace.endSection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r3.equals(r9) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, hqc hqcVar, Resources resources, int i, String str, int i2, int i3, hag hagVar, boolean z) {
        Typeface O;
        Typeface typeface;
        List unmodifiableList;
        int i4 = 20;
        int i5 = -3;
        if (hqcVar instanceof kqc) {
            kqc kqcVar = (kqc) hqcVar;
            String str2 = kqcVar.e;
            Typeface typeface2 = null;
            int i6 = 0;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (hagVar != null) {
                    new Handler(Looper.getMainLooper()).post(new zvh(i4, hagVar, typeface));
                }
                return typeface;
            }
            int i7 = 1;
            boolean z2 = !z ? hagVar != null : kqcVar.d != 0;
            int i8 = z ? kqcVar.c : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            gao gaoVar = new gao();
            gaoVar.a = hagVar;
            aqc aqcVar = kqcVar.b;
            aqc aqcVar2 = kqcVar.a;
            if (aqcVar != null) {
                Object[] objArr = {aqcVar2, aqcVar};
                ArrayList arrayList = new ArrayList(2);
                for (int i9 = 0; i9 < 2; i9++) {
                    Object obj = objArr[i9];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                Object obj2 = new Object[]{aqcVar2}[0];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
                unmodifiableList = Collections.unmodifiableList(arrayList2);
            }
            ks1 ks1Var = new ks1(handler, 3);
            le3 le3Var = new le3(gaoVar, ks1Var);
            int i10 = 13;
            if (!z2) {
                String a2 = gqc.a(unmodifiableList, i3);
                Typeface typeface3 = (Typeface) gqc.a.get(a2);
                if (typeface3 != null) {
                    ks1Var.execute(new x8x(i10, gaoVar, typeface3));
                    typeface2 = typeface3;
                } else {
                    eqc eqcVar = new eqc(i6, le3Var);
                    synchronized (gqc.c) {
                        try {
                            ciq ciqVar = gqc.d;
                            ArrayList arrayList3 = (ArrayList) ciqVar.get(a2);
                            if (arrayList3 != null) {
                                arrayList3.add(eqcVar);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                arrayList4.add(eqcVar);
                                ciqVar.put(a2, arrayList4);
                                dqc dqcVar = new dqc(a2, context, unmodifiableList, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = gqc.b;
                                eqc eqcVar2 = new eqc(i7, a2);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                nud nudVar = new nud();
                                nudVar.b = dqcVar;
                                nudVar.c = eqcVar2;
                                nudVar.d = handler2;
                                threadPoolExecutor.execute(nudVar);
                            }
                        } finally {
                        }
                    }
                }
            } else {
                if (unmodifiableList.size() > 1) {
                    xq0.x("Fallbacks with blocking fetches are not supported for performance reasons");
                    return null;
                }
                aqc aqcVar3 = (aqc) unmodifiableList.get(0);
                e0h e0hVar = gqc.a;
                ArrayList arrayList5 = new ArrayList(1);
                Object obj3 = new Object[]{aqcVar3}[0];
                Objects.requireNonNull(obj3);
                arrayList5.add(obj3);
                String a3 = gqc.a(Collections.unmodifiableList(arrayList5), i3);
                Typeface typeface4 = (Typeface) gqc.a.get(a3);
                if (typeface4 != null) {
                    ks1Var.execute(new x8x(i10, gaoVar, typeface4));
                    typeface2 = typeface4;
                } else if (i8 == -1) {
                    Object[] objArr2 = {aqcVar3};
                    ArrayList arrayList6 = new ArrayList(1);
                    Object obj4 = objArr2[0];
                    Objects.requireNonNull(obj4);
                    arrayList6.add(obj4);
                    fqc b2 = gqc.b(a3, context, Collections.unmodifiableList(arrayList6), i3);
                    le3Var.j(b2);
                    typeface2 = b2.a;
                } else {
                    try {
                        try {
                            try {
                                try {
                                    fqc fqcVar = (fqc) gqc.b.submit(new dqc(a3, context, aqcVar3, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                    le3Var.j(fqcVar);
                                    typeface2 = fqcVar.a;
                                } catch (TimeoutException unused) {
                                    throw new InterruptedException("timeout");
                                }
                            } catch (InterruptedException e) {
                                throw e;
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        ((ks1) le3Var.b).execute(new zs3((gao) le3Var.a, i5, i6));
                    }
                }
            }
            O = typeface2;
        } else {
            O = a.O(context, (iqc) hqcVar, resources, i3);
            if (hagVar != null) {
                if (O != null) {
                    new Handler(Looper.getMainLooper()).post(new zvh(i4, hagVar, O));
                } else {
                    hagVar.n(-3);
                }
            }
        }
        if (O != null) {
            b.put(b(resources, i, str, i2, i3), O);
        }
        return O;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
