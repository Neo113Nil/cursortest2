package r;

import J1.u;
import Q1.A;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l.k;
import q.C1033c;
import q.InterfaceC1032b;
import u0.AbstractC1050a;
import v.j;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1050a f8452a;

    /* renamed from: b, reason: collision with root package name */
    public static final l.f f8453b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f8452a = new i();
        } else if (i2 >= 28) {
            f8452a = new h();
        } else if (i2 >= 26) {
            f8452a = new g();
        } else {
            Method method = f.f8461e;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f8452a = new f();
            } else {
                f8452a = new e();
            }
        }
        f8453b = new l.f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r6.equals(r10) == false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, InterfaceC1032b interfaceC1032b, Resources resources, int i2, String str, int i3, int i4, A a2) {
        Typeface j2;
        Typeface typeface;
        Typeface typeface2;
        int i5 = 8;
        int i6 = 1;
        int i7 = 9;
        boolean z2 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (interfaceC1032b instanceof q.e) {
            q.e eVar = (q.e) interfaceC1032b;
            String str2 = eVar.f8443d;
            j2 = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                new Handler(Looper.getMainLooper()).post(new F0.c(i7, a2, typeface));
                return typeface;
            }
            Object[] objArr3 = eVar.f8442c == 0;
            int i8 = eVar.f8441b;
            Handler handler = new Handler(Looper.getMainLooper());
            Z0.i iVar = new Z0.i();
            iVar.f1992b = a2;
            u uVar = eVar.f8440a;
            o.b bVar = new o.b(iVar, handler);
            if (objArr3 == true) {
                l.f fVar = v.f.f8493a;
                String str3 = ((String) uVar.f976f) + "-" + i4;
                typeface2 = (Typeface) v.f.f8493a.a(str3);
                if (typeface2 != null) {
                    handler.post(new D0.f(iVar, typeface2, i5, z2));
                } else if (i8 == -1) {
                    v.e a3 = v.f.a(str3, context, uVar, i4);
                    bVar.b(a3);
                    j2 = a3.f8491a;
                } else {
                    try {
                        try {
                            v.e eVar2 = (v.e) v.f.f8494b.submit(new v.c(str3, context, uVar, i4, 0)).get(i8, TimeUnit.MILLISECONDS);
                            bVar.b(eVar2);
                            j2 = eVar2.f8491a;
                        } catch (InterruptedException e2) {
                            throw e2;
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) bVar.f8227c).post(new C.b((Z0.i) bVar.f8226b, -3));
                    }
                }
            } else {
                l.f fVar2 = v.f.f8493a;
                String str4 = ((String) uVar.f976f) + "-" + i4;
                typeface2 = (Typeface) v.f.f8493a.a(str4);
                if (typeface2 != null) {
                    handler.post(new D0.f(iVar, typeface2, i5, objArr2 == true ? 1 : 0));
                } else {
                    v.d dVar = new v.d(objArr == true ? 1 : 0, bVar);
                    synchronized (v.f.f8495c) {
                        try {
                            k kVar = v.f.f8496d;
                            ArrayList arrayList = (ArrayList) kVar.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(dVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(dVar);
                                kVar.put(str4, arrayList2);
                                v.c cVar = new v.c(str4, context, uVar, i4, 1);
                                ThreadPoolExecutor threadPoolExecutor = v.f.f8494b;
                                v.d dVar2 = new v.d(i6, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                j jVar = new j();
                                jVar.f8505a = cVar;
                                jVar.f8506b = dVar2;
                                jVar.f8507c = handler2;
                                threadPoolExecutor.execute(jVar);
                            }
                        } finally {
                        }
                    }
                }
            }
            j2 = typeface2;
        } else {
            j2 = f8452a.j(context, (C1033c) interfaceC1032b, resources, i4);
            if (j2 != null) {
                new Handler(Looper.getMainLooper()).post(new F0.c(i7, a2, j2));
            } else {
                a2.a();
            }
        }
        if (j2 != null) {
            f8453b.b(b(resources, i2, str, i3, i4), j2);
        }
        return j2;
    }

    public static String b(Resources resources, int i2, String str, int i3, int i4) {
        return resources.getResourcePackageName(i2) + '-' + str + '-' + i3 + '-' + i2 + '-' + i4;
    }
}
