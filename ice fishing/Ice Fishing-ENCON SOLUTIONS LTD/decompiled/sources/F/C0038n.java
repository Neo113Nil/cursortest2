package F;

import A1.C0011l;
import a1.C0085a;
import a1.InterfaceC0086b;
import a1.InterfaceC0087c;
import a1.InterfaceC0090f;
import a1.InterfaceC0094j;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import f1.C0163N;
import h1.C0239i;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* renamed from: F.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038n {

    /* renamed from: a, reason: collision with root package name */
    public Object f532a;

    /* renamed from: b, reason: collision with root package name */
    public Object f533b;

    /* renamed from: c, reason: collision with root package name */
    public Object f534c;

    /* renamed from: d, reason: collision with root package name */
    public Object f535d;

    public C0038n(int i2) {
        switch (i2) {
            case 5:
                C0163N c0163n = new C0163N();
                C0163N c0163n2 = new C0163N();
                this.f532a = new HashSet();
                this.f533b = c0163n;
                this.f534c = c0163n2;
                break;
            default:
                this.f533b = new ArrayDeque();
                this.f534c = new ArrayDeque();
                this.f535d = new ArrayDeque();
                break;
        }
    }

    public SpannableString a() {
        if (((String) this.f532a) == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString((String) this.f532a);
        ArrayList arrayList = (ArrayList) this.f533b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                io.flutter.view.k kVar = (io.flutter.view.k) it.next();
                int b2 = H.j.b(kVar.f8000c);
                if (b2 == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), kVar.f7998a, kVar.f7999b, 0);
                } else if (b2 == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((io.flutter.view.i) kVar).f7997d)), kVar.f7998a, kVar.f7999b, 0);
                }
            }
        }
        String str = (String) this.f535d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan((String) this.f535d), 0, ((String) this.f532a).length(), 0);
        }
        String str2 = (String) this.f534c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag((String) this.f534c)), 0, ((String) this.f532a).length(), 0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(AbstractC0991b abstractC0991b) {
        C0034j c0034j;
        int i2;
        C0038n c0038n;
        C0028d c0028d;
        if (abstractC0991b instanceof C0034j) {
            c0034j = (C0034j) abstractC0991b;
            int i3 = c0034j.f504g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0034j.f504g = i3 - Integer.MIN_VALUE;
                Object obj = c0034j.f502e;
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                i2 = c0034j.f504g;
                if (i2 != 0) {
                    R1.l.F(obj);
                    List list = (List) this.f534c;
                    P p2 = (P) this.f535d;
                    if (list == null || list.isEmpty()) {
                        c0034j.f501d = this;
                        c0034j.f504g = 1;
                        obj = P.e(p2, false, c0034j);
                        if (obj == enumC0985a) {
                            return enumC0985a;
                        }
                        c0038n = this;
                        c0028d = (C0028d) obj;
                    } else {
                        j0 f2 = p2.f();
                        C0037m c0037m = new C0037m(p2, this, null);
                        c0034j.f501d = this;
                        c0034j.f504g = 2;
                        obj = f2.b(c0037m, c0034j);
                        if (obj == enumC0985a) {
                            return enumC0985a;
                        }
                        c0038n = this;
                        c0028d = (C0028d) obj;
                    }
                } else if (i2 == 1) {
                    c0038n = c0034j.f501d;
                    R1.l.F(obj);
                    c0028d = (C0028d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0038n = c0034j.f501d;
                    R1.l.F(obj);
                    c0028d = (C0028d) obj;
                }
                ((P) c0038n.f535d).f419h.p(c0028d);
                return C0239i.f3393a;
            }
        }
        c0034j = new C0034j(this, abstractC0991b);
        Object obj2 = c0034j.f502e;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = c0034j.f504g;
        if (i2 != 0) {
        }
        ((P) c0038n.f535d).f419h.p(c0028d);
        return C0239i.f3393a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(N1.i call) {
        kotlin.jvm.internal.i.e(call, "call");
        ArrayDeque arrayDeque = (ArrayDeque) this.f535d;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            byte[] bArr = K1.b.f1051a;
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                try {
                    Iterator it = ((ArrayDeque) this.f533b).iterator();
                    kotlin.jvm.internal.i.d(it, "readyAsyncCalls.iterator()");
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        int size = ((ArrayDeque) this.f534c).size();
                        synchronized (this) {
                            if (size < 64) {
                                throw null;
                            }
                        }
                        if (arrayList.size() <= 0) {
                            if (arrayList.get(0) != null) {
                                throw new ClassCastException();
                            }
                            synchronized (this) {
                                try {
                                    if (((ThreadPoolExecutor) this.f532a) == null) {
                                        TimeUnit timeUnit = TimeUnit.SECONDS;
                                        SynchronousQueue synchronousQueue = new SynchronousQueue();
                                        String name = kotlin.jvm.internal.i.h(" Dispatcher", K1.b.f1056f);
                                        kotlin.jvm.internal.i.e(name, "name");
                                        this.f532a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new K1.a(name, false));
                                    }
                                    kotlin.jvm.internal.i.b((ThreadPoolExecutor) this.f532a);
                                } finally {
                                }
                            }
                            throw null;
                        }
                        return;
                    }
                    synchronized (this) {
                        ((ArrayDeque) this.f534c).size();
                        ((ArrayDeque) this.f535d).size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (arrayList.size() <= 0) {
            }
        }
        byte[] bArr2 = K1.b.f1051a;
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
        }
    }

    public File d(Context context) {
        ((C0163N) this.f533b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName(PluginErrorDetails.Platform.FLUTTER));
    }

    public void e(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        if (((H0.b) this.f535d) != null) {
            FlutterJNI.lambda$loadLibrary$0(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:25:0x0066, B:29:0x0078), top: B:24:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r2v6, types: [I1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(AbstractC0991b abstractC0991b) {
        e0 e0Var;
        int i2;
        I1.d dVar;
        C0038n c0038n;
        I1.a aVar;
        Throwable th;
        C0038n c0038n2;
        try {
            if (abstractC0991b instanceof e0) {
                e0Var = (e0) abstractC0991b;
                int i3 = e0Var.f476h;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    e0Var.f476h = i3 - Integer.MIN_VALUE;
                    Object obj = e0Var.f474f;
                    EnumC0985a enumC0985a = EnumC0985a.f8194a;
                    i2 = e0Var.f476h;
                    C0239i c0239i = C0239i.f3393a;
                    if (i2 != 0) {
                        R1.l.F(obj);
                        if (!(((C0011l) this.f533b).D() instanceof A1.N)) {
                            return c0239i;
                        }
                        e0Var.f472d = this;
                        dVar = (I1.d) this.f532a;
                        e0Var.f473e = dVar;
                        e0Var.f476h = 1;
                        if (dVar.c(e0Var) == enumC0985a) {
                            return enumC0985a;
                        }
                        c0038n = this;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = e0Var.f473e;
                            c0038n2 = e0Var.f472d;
                            try {
                                R1.l.F(obj);
                                ((C0011l) c0038n2.f533b).J(c0239i);
                                ((I1.d) aVar).e(null);
                                return c0239i;
                            } catch (Throwable th2) {
                                th = th2;
                                ((I1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        ?? r2 = e0Var.f473e;
                        c0038n = e0Var.f472d;
                        R1.l.F(obj);
                        dVar = r2;
                    }
                    if (((C0011l) c0038n.f533b).D() instanceof A1.N) {
                        dVar.e(null);
                        return c0239i;
                    }
                    e0Var.f472d = c0038n;
                    e0Var.f473e = dVar;
                    e0Var.f476h = 2;
                    if (c0038n.b(e0Var) == enumC0985a) {
                        return enumC0985a;
                    }
                    aVar = dVar;
                    c0038n2 = c0038n;
                    ((C0011l) c0038n2.f533b).J(c0239i);
                    ((I1.d) aVar).e(null);
                    return c0239i;
                }
            }
            if (((C0011l) c0038n.f533b).D() instanceof A1.N) {
            }
        } catch (Throwable th3) {
            aVar = dVar;
            th = th3;
            ((I1.d) aVar).e(null);
            throw th;
        }
        e0Var = new e0(this, abstractC0991b);
        Object obj2 = e0Var.f474f;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = e0Var.f476h;
        C0239i c0239i2 = C0239i.f3393a;
        if (i2 != 0) {
        }
    }

    public void g(Serializable serializable, InterfaceC0087c interfaceC0087c) {
        ((InterfaceC0090f) this.f532a).c((String) this.f533b, ((InterfaceC0094j) this.f534c).encodeMessage(serializable), interfaceC0087c == null ? null : new C0085a(0, this, interfaceC0087c));
    }

    public void h(InterfaceC0086b interfaceC0086b) {
        String str = (String) this.f533b;
        InterfaceC0090f interfaceC0090f = (InterfaceC0090f) this.f532a;
        m0.j jVar = (m0.j) this.f535d;
        if (jVar != null) {
            interfaceC0090f.h(str, interfaceC0086b != null ? new x0.e(this, interfaceC0086b, 18, false) : null, jVar);
        } else {
            interfaceC0090f.f(str, interfaceC0086b != null ? new x0.e(this, interfaceC0086b, 18, false) : null);
        }
    }

    public C0038n(InterfaceC0090f interfaceC0090f, String str, InterfaceC0094j interfaceC0094j, m0.j jVar) {
        this.f532a = interfaceC0090f;
        this.f533b = str;
        this.f534c = interfaceC0094j;
        this.f535d = jVar;
    }
}
