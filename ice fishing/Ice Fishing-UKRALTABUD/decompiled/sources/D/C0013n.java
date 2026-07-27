package D;

import K0.C0036l;
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
import m0.C0203a;
import m0.InterfaceC0204b;
import m0.InterfaceC0205c;
import m0.InterfaceC0208f;
import m0.InterfaceC0212j;

/* renamed from: D.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013n {

    /* renamed from: a, reason: collision with root package name */
    public Object f242a;

    /* renamed from: b, reason: collision with root package name */
    public Object f243b;

    /* renamed from: c, reason: collision with root package name */
    public Object f244c;

    /* renamed from: d, reason: collision with root package name */
    public Object f245d;

    public C0013n(C0189a c0189a) {
        this.f245d = c0189a;
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
        if (((String) this.f242a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f242a);
        ArrayList arrayList = (ArrayList) this.f243b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.k kVar = (io.flutter.view.k) it.next();
                int b2 = F.j.b(kVar.f2610c);
                if (b2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f2608a, kVar.f2609b, 0);
                } else if (b2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.i) kVar).f2607d)), kVar.f2608a, kVar.f2609b, 0);
                }
            }
        }
        String str = (String) this.f245d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f245d), 0, ((String) this.f242a).length(), 0);
        }
        String str2 = (String) this.f244c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f244c)), 0, ((String) this.f242a).length(), 0);
        }
        return spannableString;
    }

    public Object b(int i2, int i3) {
        return ((C0189a) this.f245d).f2660g[(i2 << 1) + i3];
    }

    public void c(int i2) {
        ((C0189a) this.f245d).g(i2);
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
            int i3 = c0009j.f212l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0009j.f212l = i3 - Integer.MIN_VALUE;
                Object obj = c0009j.f210j;
                w0.a aVar = w0.a.f3071f;
                i2 = c0009j.f212l;
                if (i2 != 0) {
                    o.g.C(obj);
                    List list = (List) this.f244c;
                    S s2 = (S) this.f245d;
                    if (list == null || list.isEmpty()) {
                        c0009j.f209i = this;
                        c0009j.f212l = 1;
                        obj = S.e(s2, false, c0009j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0013n = this;
                        c0003d = (C0003d) obj;
                    } else {
                        l0 f2 = s2.f();
                        C0012m c0012m = new C0012m(s2, this, null);
                        c0009j.f209i = this;
                        c0009j.f212l = 2;
                        obj = f2.b(c0012m, c0009j);
                        if (obj == aVar) {
                            return aVar;
                        }
                        c0013n = this;
                        c0003d = (C0003d) obj;
                    }
                } else if (i2 == 1) {
                    c0013n = c0009j.f209i;
                    o.g.C(obj);
                    c0003d = (C0003d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0013n = c0009j.f209i;
                    o.g.C(obj);
                    c0003d = (C0003d) obj;
                }
                ((S) c0013n.f245d).f132m.G(c0003d);
                return t0.g.f2989a;
            }
        }
        c0009j = new C0009j(this, bVar);
        Object obj2 = c0009j.f210j;
        w0.a aVar2 = w0.a.f3071f;
        i2 = c0009j.f212l;
        if (i2 != 0) {
        }
        ((S) c0013n.f245d).f132m.G(c0003d);
        return t0.g.f2989a;
    }

    public File f(Context context) {
        ((E.a) this.f243b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void g(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((l0.i) this.f245d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [S0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(x0.b bVar) {
        g0 g0Var;
        int i2;
        S0.d dVar;
        C0013n c0013n;
        S0.a aVar;
        Throwable th;
        C0013n c0013n2;
        try {
            if (bVar instanceof g0) {
                g0Var = (g0) bVar;
                int i3 = g0Var.f194m;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g0Var.f194m = i3 - Integer.MIN_VALUE;
                    Object obj = g0Var.f192k;
                    w0.a aVar2 = w0.a.f3071f;
                    i2 = g0Var.f194m;
                    t0.g gVar = t0.g.f2989a;
                    if (i2 != 0) {
                        o.g.C(obj);
                        if (!(((C0036l) this.f243b).E() instanceof K0.M)) {
                            return gVar;
                        }
                        g0Var.f190i = this;
                        dVar = (S0.d) this.f242a;
                        g0Var.f191j = dVar;
                        g0Var.f194m = 1;
                        if (dVar.c(g0Var) == aVar2) {
                            return aVar2;
                        }
                        c0013n = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = g0Var.f191j;
                            c0013n2 = g0Var.f190i;
                            try {
                                o.g.C(obj);
                                ((C0036l) c0013n2.f243b).K(gVar);
                                ((S0.d) aVar).e(null);
                                return gVar;
                            } catch (Throwable th2) {
                                th = th2;
                                ((S0.d) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r2 = g0Var.f191j;
                        c0013n = g0Var.f190i;
                        o.g.C(obj);
                        dVar = r2;
                    }
                    if (((C0036l) c0013n.f243b).E() instanceof K0.M) {
                        dVar.e(null);
                        return gVar;
                    }
                    g0Var.f190i = c0013n;
                    g0Var.f191j = dVar;
                    g0Var.f194m = 2;
                    if (c0013n.d(g0Var) == aVar2) {
                        return aVar2;
                    }
                    aVar = dVar;
                    c0013n2 = c0013n;
                    ((C0036l) c0013n2.f243b).K(gVar);
                    ((S0.d) aVar).e(null);
                    return gVar;
                }
            }
            if (((C0036l) c0013n.f243b).E() instanceof K0.M) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((S0.d) aVar).e(null);
            throw th;
        }
        g0Var = new g0(this, bVar);
        Object obj2 = g0Var.f192k;
        w0.a aVar22 = w0.a.f3071f;
        i2 = g0Var.f194m;
        t0.g gVar2 = t0.g.f2989a;
        if (i2 != 0) {
        }
    }

    public void i(Serializable serializable, InterfaceC0205c interfaceC0205c) {
        ((InterfaceC0208f) this.f242a).l((String) this.f243b, ((InterfaceC0212j) this.f244c).b(serializable), interfaceC0205c == null ? null : new C0203a(0, this, interfaceC0205c));
    }

    public void j(InterfaceC0204b interfaceC0204b) {
        String str = (String) this.f243b;
        InterfaceC0208f interfaceC0208f = (InterfaceC0208f) this.f242a;
        E.a aVar = (E.a) this.f245d;
        if (aVar != null) {
            interfaceC0208f.g(str, interfaceC0204b != null ? new L.Q(this, interfaceC0204b, 21, false) : null, aVar);
        } else {
            interfaceC0208f.f(str, interfaceC0204b != null ? new L.Q(this, interfaceC0204b, 21, false) : null);
        }
    }

    public Object[] k(int i2, Object[] objArr) {
        int i3 = ((C0189a) this.f245d).f2661h;
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

    public C0013n(InterfaceC0208f interfaceC0208f, String str, InterfaceC0212j interfaceC0212j, E.a aVar) {
        this.f242a = interfaceC0208f;
        this.f243b = str;
        this.f244c = interfaceC0212j;
        this.f245d = aVar;
    }
}
