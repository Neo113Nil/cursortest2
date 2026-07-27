package D;

import L0.C0054l;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k.C0189a;
import l0.C0206i;
import m0.C0216a;
import m0.InterfaceC0217b;
import m0.InterfaceC0218c;
import t0.C0252g;

/* renamed from: D.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n {

    /* renamed from: a, reason: collision with root package name */
    public Object f243a;

    /* renamed from: b, reason: collision with root package name */
    public Object f244b;

    /* renamed from: c, reason: collision with root package name */
    public Object f245c;

    /* renamed from: d, reason: collision with root package name */
    public Object f246d;

    public C0013n(C0189a c0189a) {
        this.f246d = c0189a;
    }

    public static boolean e(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public SpannableString a() {
        if (((String) this.f243a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f243a);
        ArrayList arrayList = (ArrayList) this.f244b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.k kVar = (io.flutter.view.k) it.next();
                int b2 = F.j.b(kVar.f2618c);
                if (b2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f2616a, kVar.f2617b, 0);
                } else if (b2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.i) kVar).f2615d)), kVar.f2616a, kVar.f2617b, 0);
                }
            }
        }
        String str = (String) this.f246d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f246d), 0, ((String) this.f243a).length(), 0);
        }
        String str2 = (String) this.f245c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f245c)), 0, ((String) this.f243a).length(), 0);
        }
        return spannableString;
    }

    public Object b(int i2, int i3) {
        return ((C0189a) this.f246d).f2668f[(i2 << 1) + i3];
    }

    public void c(int i2) {
        ((C0189a) this.f246d).g(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(x0.b bVar) {
        C0009j c0009j;
        int i2;
        C0013n c0013n;
        C0003d c0003d;
        if (bVar instanceof C0009j) {
            c0009j = (C0009j) bVar;
            int i3 = c0009j.f212k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0009j.f212k = i3 - Integer.MIN_VALUE;
                Object obj = c0009j.f210i;
                w0.a aVar = w0.a.f3076e;
                i2 = c0009j.f212k;
                if (i2 != 0) {
                    o.g.z(obj);
                    List list = (List) this.f245c;
                    S s2 = (S) this.f246d;
                    if (list == null || list.isEmpty()) {
                        c0009j.f209h = this;
                        c0009j.f212k = 1;
                        obj = S.e(s2, false, c0009j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0013n = this;
                        c0003d = (C0003d) obj;
                    } else {
                        l0 f2 = s2.f();
                        C0012m c0012m = new C0012m(s2, this, null);
                        c0009j.f209h = this;
                        c0009j.f212k = 2;
                        obj = f2.b(c0012m, c0009j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0013n = this;
                        c0003d = (C0003d) obj;
                    }
                } else if (i2 == 1) {
                    c0013n = c0009j.f209h;
                    o.g.z(obj);
                    c0003d = (C0003d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0013n = c0009j.f209h;
                    o.g.z(obj);
                    c0003d = (C0003d) obj;
                }
                ((S) c0013n.f246d).f132l.G(c0003d);
                return C0252g.f2994a;
            }
        }
        c0009j = new C0009j(this, bVar);
        Object obj2 = c0009j.f210i;
        w0.a aVar2 = w0.a.f3076e;
        i2 = c0009j.f212k;
        if (i2 != 0) {
        }
        ((S) c0013n.f246d).f132l.G(c0003d);
        return C0252g.f2994a;
    }

    public File f(Context context) {
        ((E.a) this.f244b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void g(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((C0206i) this.f246d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [T0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(x0.b bVar) {
        g0 g0Var;
        int i2;
        T0.d dVar;
        C0013n c0013n;
        T0.a aVar;
        Throwable th;
        C0013n c0013n2;
        try {
            if (bVar instanceof g0) {
                g0Var = (g0) bVar;
                int i3 = g0Var.f194l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g0Var.f194l = i3 - Integer.MIN_VALUE;
                    Object obj = g0Var.f192j;
                    w0.a aVar2 = w0.a.f3076e;
                    i2 = g0Var.f194l;
                    C0252g c0252g = C0252g.f2994a;
                    if (i2 != 0) {
                        o.g.z(obj);
                        if (!(((C0054l) this.f244b).E() instanceof L0.M)) {
                            return c0252g;
                        }
                        g0Var.f190h = this;
                        dVar = (T0.d) this.f243a;
                        g0Var.f191i = dVar;
                        g0Var.f194l = 1;
                        if (dVar.c(g0Var) == aVar2) {
                            return aVar2;
                        }
                        c0013n = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = g0Var.f191i;
                            c0013n2 = g0Var.f190h;
                            try {
                                o.g.z(obj);
                                ((C0054l) c0013n2.f244b).K(c0252g);
                                ((T0.d) aVar).e(null);
                                return c0252g;
                            } catch (Throwable th2) {
                                th = th2;
                                ((T0.d) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r2 = g0Var.f191i;
                        c0013n = g0Var.f190h;
                        o.g.z(obj);
                        dVar = r2;
                    }
                    if (((C0054l) c0013n.f244b).E() instanceof L0.M) {
                        dVar.e(null);
                        return c0252g;
                    }
                    g0Var.f190h = c0013n;
                    g0Var.f191i = dVar;
                    g0Var.f194l = 2;
                    if (c0013n.d(g0Var) == aVar2) {
                        return aVar2;
                    }
                    aVar = dVar;
                    c0013n2 = c0013n;
                    ((C0054l) c0013n2.f244b).K(c0252g);
                    ((T0.d) aVar).e(null);
                    return c0252g;
                }
            }
            if (((C0054l) c0013n.f244b).E() instanceof L0.M) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((T0.d) aVar).e(null);
            throw th;
        }
        g0Var = new g0(this, bVar);
        Object obj2 = g0Var.f192j;
        w0.a aVar22 = w0.a.f3076e;
        i2 = g0Var.f194l;
        C0252g c0252g2 = C0252g.f2994a;
        if (i2 != 0) {
        }
    }

    public void i(Serializable serializable, InterfaceC0218c interfaceC0218c) {
        ((m0.f) this.f243a).m((String) this.f244b, ((m0.j) this.f245c).b(serializable), interfaceC0218c == null ? null : new C0216a(0, this, interfaceC0218c));
    }

    public void j(InterfaceC0217b interfaceC0217b) {
        String str = (String) this.f244b;
        m0.f fVar = (m0.f) this.f243a;
        E.a aVar = (E.a) this.f246d;
        if (aVar != null) {
            fVar.g(str, interfaceC0217b != null ? new L.Q(this, interfaceC0217b, 21, false) : null, aVar);
        } else {
            fVar.f(str, interfaceC0217b != null ? new L.Q(this, interfaceC0217b, 21, false) : null);
        }
    }

    public Object[] k(int i2, Object[] objArr) {
        int i3 = ((C0189a) this.f246d).f2669g;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = b(i4, i2);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public C0013n(m0.f fVar, String str, m0.j jVar, E.a aVar) {
        this.f243a = fVar;
        this.f244b = str;
        this.f245c = jVar;
        this.f246d = aVar;
    }
}
