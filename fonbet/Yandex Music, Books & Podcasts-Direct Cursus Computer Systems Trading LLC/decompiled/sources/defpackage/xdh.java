package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.t;
import com.connectsdk.service.DeviceService;
import com.google.gson.Gson;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.a;

/* loaded from: classes3.dex */
public final class xdh implements gs3, adu, upr, p7q, m1t {
    public final Object a;
    public final Object b;
    public Object c;
    public Object d;

    public xdh(Typeface typeface, a3i a3iVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.d = typeface;
        this.a = a3iVar;
        this.c = new f3i(1024);
        int a = a3iVar.a(6);
        if (a != 0) {
            int i5 = a + a3iVar.a;
            i = ((ByteBuffer) a3iVar.d).getInt(((ByteBuffer) a3iVar.d).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.b = new char[i * 2];
        int a2 = a3iVar.a(6);
        if (a2 != 0) {
            int i6 = a2 + a3iVar.a;
            i2 = ((ByteBuffer) a3iVar.d).getInt(((ByteBuffer) a3iVar.d).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            jdt jdtVar = new jdt(this, i7);
            z2i b = jdtVar.b();
            int a3 = b.a(4);
            Character.toChars(a3 != 0 ? ((ByteBuffer) b.d).getInt(a3 + b.a) : 0, (char[]) this.b, i7 * 2);
            z2i b2 = jdtVar.b();
            int a4 = b2.a(16);
            if (a4 != 0) {
                int i8 = a4 + b2.a;
                i3 = ((ByteBuffer) b2.d).getInt(((ByteBuffer) b2.d).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            o5g.u("invalid metadata codepoint length", i3 > 0);
            f3i f3iVar = (f3i) this.c;
            z2i b3 = jdtVar.b();
            int a5 = b3.a(16);
            if (a5 != 0) {
                int i9 = a5 + b3.a;
                i4 = ((ByteBuffer) b3.d).getInt(((ByteBuffer) b3.d).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            f3iVar.a(jdtVar, 0, i4 - 1);
        }
    }

    public static jtp d(qi4 qi4Var) {
        qi4Var.getClass();
        String str = qi4Var.a;
        return str.equals("success") ? nif.d(fgk.a) : str.equals("wait_for_payment_method") ? nif.d(fgk.a) : str.equals("in_progress") ? nif.d(fgk.a) : str.equals("challenge_in_progress") ? nif.d(fgk.a) : nif.c(new k03(q1c.b, r1c.a, null, str, hrg.q("Unable to convert status ", str, " to PollingResult")));
    }

    public boolean A(r3q r3qVar) {
        if (r3qVar instanceof p3q) {
            nvl nvlVar = (nvl) this.a;
            p3q p3qVar = (p3q) r3qVar;
            bd5 bd5Var = p3qVar.a;
            return Intrinsics.d(nvlVar.a, bd5Var.s()) && Intrinsics.d(nvlVar.b, bd5Var.a()) && p3qVar.b == ((o3q) this.b) && Intrinsics.d(pcg.E(bd5Var), (String) this.d);
        }
        if ((r3qVar instanceof j3q) || (r3qVar instanceof l3q) || (r3qVar instanceof m3q)) {
            return false;
        }
        b6e.s();
        return false;
    }

    @Override // defpackage.m1t
    public boolean C(mqs mqsVar, int i) {
        mqsVar.getClass();
        ((znk) this.a).getClass();
        mqsVar.getClass();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(long j, cg6 cg6Var) {
        v8l v8lVar;
        int i;
        if (cg6Var instanceof v8l) {
            v8lVar = (v8l) cg6Var;
            int i2 = v8lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v8lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = v8lVar.j;
                nm6 nm6Var = nm6.a;
                i = v8lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    b9l b9lVar = (b9l) this.d;
                    v8lVar.l = 1;
                    if (b9lVar.j(j, v8lVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.d = ofc.e;
                return Unit.a;
            }
        }
        v8lVar = new v8l(this, cg6Var);
        Object obj2 = v8lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = v8lVar.l;
        if (i != 0) {
        }
        this.d = ofc.e;
        return Unit.a;
    }

    @Override // defpackage.m1t
    public sbb E(uu5 uu5Var) {
        return new zw7(new iik(19, uu5Var, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(long j, mpl mplVar, cg6 cg6Var) {
        w8l w8lVar;
        int i;
        if (cg6Var instanceof w8l) {
            w8lVar = (w8l) cg6Var;
            int i2 = w8lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w8lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = w8lVar.j;
                nm6 nm6Var = nm6.a;
                i = w8lVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    b9l b9lVar = (b9l) this.d;
                    w8lVar.l = 1;
                    if (b9lVar.C(j, mplVar, w8lVar) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                this.d = ofc.e;
                return Unit.a;
            }
        }
        w8lVar = new w8l(this, cg6Var);
        Object obj2 = w8lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = w8lVar.l;
        if (i != 0) {
        }
        this.d = ofc.e;
        return Unit.a;
    }

    public void I(String str) {
        boolean z;
        ydh ydhVar;
        str.getClass();
        synchronized (this.c) {
            if (l().isEmpty()) {
                z = true;
            } else {
                ((LinkedHashSet) this.b).add(str);
                z = false;
            }
        }
        if (z) {
            synchronized (this.c) {
                ydhVar = (ydh) this.d;
            }
            ydhVar.getClass();
            ydhVar.a(str);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|8|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        com.yandex.music.shared.utils.assertions.Assertions.throwOrSkip("NetworkCache", new com.yandex.music.shared.utils.assertions.FailedAssertionException("Exception in NetworkCache#put", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        com.yandex.music.shared.utils.assertions.Assertions.throwOrSkip("NetworkCache", new com.yandex.music.shared.utils.assertions.FailedAssertionException("Exception in NetworkCache#put", r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(String str, Type type, Object obj, long j, cg6 cg6Var) {
        hzi hziVar;
        int i;
        if (cg6Var instanceof hzi) {
            hziVar = (hzi) cg6Var;
            int i2 = hziVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hziVar.l = i2 - Integer.MIN_VALUE;
                hzi hziVar2 = hziVar;
                Object obj2 = hziVar2.j;
                nm6 nm6Var = nm6.a;
                i = hziVar2.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    kzi kziVar = (kzi) this.b;
                    izi iziVar = new izi(j, this, obj, type, null);
                    hziVar2.l = 1;
                    kziVar.getClass();
                    if (x97.V(dm6.b, new avb(str, kziVar, iziVar, (Continuation) null), hziVar2) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                return Unit.a;
            }
        }
        hziVar = new hzi(this, cg6Var);
        hzi hziVar22 = hziVar;
        Object obj22 = hziVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = hziVar22.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    public s8 K(kgj kgjVar) {
        ArrayList arrayList;
        int ordinal = kgjVar.ordinal();
        if (ordinal == 0) {
            arrayList = (ArrayList) this.c;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            arrayList = (ArrayList) this.d;
        }
        if (arrayList != null) {
            return nif.d(arrayList);
        }
        igj igjVar = new igj(kgjVar, 0);
        g0c g0cVar = (g0c) this.b;
        int ordinal2 = kgjVar.ordinal();
        String concat = "Загрузка списка банковских приложений: ".concat(ordinal2 != 0 ? ordinal2 != 1 ? "" : "получить список приложений, поддерживающих привязку счета через СБП" : "получить все возможные приложения, поддерживающие Систему Быстрых Платежей");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        linkedHashMap.put("kind", new jkr(kgjVar.a));
        linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
        vtm vtmVar = new vtm((Map) linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(vtmVar, "event_name", "sbp_bank_load_list", "sbp_bank_load_list", vtmVar);
        ggj ggjVar = (ggj) this.a;
        ggjVar.getClass();
        yop b = mif.b(ggjVar.a.C(igjVar, k9i.x0, p1j.b), new afg(11, this, kgjVar), null, 5);
        ((x60) g0cVar).b(j, b);
        return b;
    }

    public void M() {
        t tVar = (t) this.a;
        cvo cvoVar = cvo.i;
        fxf.P(tVar, o6m.b(wjb.DescriptionScreen, (avo) this.d, 2), null, pd.t(new qzm[0]), null, new wn5(new t31(18, this), -480358543, true), 22);
    }

    public void a(ArrayList arrayList) {
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.c;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            l1j.f();
            return;
        }
        if (arrayList3.size() > 0) {
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                if (!arrayList2.contains(Integer.valueOf(i))) {
                    if (arrayList3.get(i) != null) {
                        l1j.f();
                        return;
                    }
                    int i2 = i + 1;
                    if (i2 < arrayList3.size()) {
                        arrayList3.get(i2).getClass();
                        l1j.f();
                        return;
                    }
                }
            }
            for (int size3 = arrayList2.size() - 1; -1 < size3; size3--) {
                arrayList3.remove(((Number) arrayList2.get(size3)).intValue());
            }
            if (arrayList3.size() <= 0) {
                arrayList3.clear();
                arrayList2.clear();
            } else {
                arrayList3.get(0).getClass();
                l1j.f();
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            zx0 l = l();
            wdh wdhVar = new wdh();
            wdhVar.a = false;
            wdhVar.b = false;
            l.addLast(wdhVar);
        }
    }

    /* JADX WARN: Type inference failed for: r14v39, types: [kotlin.jvm.functions.Function1, uif] */
    public y7o c(qi4 qi4Var) {
        String str;
        ft7 ft7Var;
        ft7 ft7Var2;
        qi4Var.getClass();
        String str2 = qi4Var.a;
        String str3 = qi4Var.c;
        String str4 = qi4Var.b;
        if (str2.equals("wait_for_payment_method")) {
            return ngg.F(ggm.retry);
        }
        if (str2.equals("in_progress")) {
            r();
            return ngg.F(ggm.retry);
        }
        if (str2.equals("success")) {
            r();
            return ngg.F(ggm.done);
        }
        if (!str2.equals("challenge_in_progress")) {
            String str5 = str4;
            if (str2.equals("failed")) {
                r();
                q1c q1cVar = q1c.b;
                r1c r1cVar = r1c.b;
                if (str5 == null) {
                    str5 = "null";
                }
                str = str3 != null ? str3 : "null";
                StringBuilder m = f1d.m("<MobileBackendResponse: status - ", str2, ", code - ", str5, ", desc - ");
                m.append(str);
                m.append(">");
                return new y7o(null, new k03(q1cVar, r1cVar, null, str2, "Challenge failed, response : ".concat(m.toString())));
            }
            if (str2.equals("repayment_allowed")) {
                r();
                return new y7o(null, new k03(q1c.D, r1c.b, null, str2, "Payment failed but new attempt allowed"));
            }
            q1c q1cVar2 = q1c.b;
            r1c r1cVar2 = r1c.b;
            if (str5 == null) {
                str5 = "null";
            }
            str = str3 != null ? str3 : "null";
            StringBuilder m2 = f1d.m("<MobileBackendResponse: status - ", str2, ", code - ", str5, ", desc - ");
            m2.append(str);
            m2.append(">");
            return new y7o(null, new k03(q1cVar2, r1cVar2, null, str2, "Undefined check payment status: ".concat(m2.toString())));
        }
        g0c g0cVar = (g0c) this.c;
        try {
            t9i t9iVar = qi4Var.d;
            if (t9iVar == null) {
                ((x60) g0cVar).a(gut.Q0("NO_CHALLENGE_INFO"));
                return new y7o(null, cxb.b0(qi4Var));
            }
            String str6 = t9iVar.a;
            if (!Intrinsics.d((String) this.d, str6)) {
                r();
                this.d = str6;
                if (t9iVar instanceof va4) {
                    String str7 = ((va4) t9iVar).b;
                    ((x60) g0cVar).a(gut.I0());
                    str7.getClass();
                    try {
                        String uri = new URI(str7).toString();
                        uri.getClass();
                        Uri parse = Uri.parse(uri);
                        parse.getClass();
                        ft7Var2 = new ft7(parse);
                    } catch (Throwable unused) {
                        ft7Var2 = null;
                    }
                    if (ft7Var2 == null) {
                        return new y7o(null, cxb.a0(str7, "redirectURL", qi4Var));
                    }
                } else if (t9iVar instanceof ab4) {
                    ab4 ab4Var = (ab4) t9iVar;
                    ((x60) g0cVar).a(gut.N0(ab4Var.b, ab4Var.c, ab4Var.d));
                } else if (t9iVar instanceof db4) {
                    ((x60) g0cVar).a(gut.P0(((db4) t9iVar).b));
                } else if (t9iVar instanceof cb4) {
                    cb4 cb4Var = (cb4) t9iVar;
                    String str8 = cb4Var.b;
                    ((x60) g0cVar).a(gut.O0(cb4Var.c));
                    str8.getClass();
                    try {
                        String uri2 = new URI(str8).toString();
                        uri2.getClass();
                        Uri parse2 = Uri.parse(uri2);
                        parse2.getClass();
                        ft7Var = new ft7(parse2);
                    } catch (Throwable unused2) {
                        ft7Var = null;
                    }
                    if (ft7Var == null) {
                        return new y7o(null, cxb.a0(str8, "formUrl", qi4Var));
                    }
                } else if (t9iVar instanceof xa4) {
                    ((x60) g0cVar).a(gut.L0());
                } else if (t9iVar instanceof fb4) {
                    ((x60) g0cVar).a(gut.R0(((fb4) t9iVar).a));
                } else {
                    if (!(t9iVar instanceof bb4)) {
                        ((x60) g0cVar).a(gut.Q0(str6));
                        return new y7o(null, cxb.b0(qi4Var));
                    }
                    ((x60) g0cVar).a(gut.H0(((bb4) t9iVar).a));
                }
                ((uif) this.a).invoke(t9iVar);
            }
            return ngg.F(ggm.retry);
        } catch (RuntimeException e) {
            String message = e instanceof r7w ? ((r7w) e).getMessage() : String.valueOf(e);
            q1c q1cVar3 = q1c.b;
            String str9 = str4;
            r1c r1cVar3 = r1c.a;
            if (str9 == null) {
                str9 = "null";
            }
            return new y7o(null, new k03(q1cVar3, r1cVar3, null, str2, hrg.r("Failed to handle challenge for response: ", su4.o(f1d.m("<MobileBackendResponse: status - ", str2, ", code - ", str9, ", desc - "), str3 != null ? str3 : "null", ">"), ", error: \"", message)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable e(String str, Type type, cg6 cg6Var) {
        gzi gziVar;
        int i;
        try {
            if (cg6Var instanceof gzi) {
                gziVar = (gzi) cg6Var;
                int i2 = gziVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gziVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = gziVar.j;
                    nm6 nm6Var = nm6.a;
                    i = gziVar.l;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        kzi kziVar = (kzi) this.b;
                        n71 n71Var = new n71(this, type, continuation, 23);
                        gziVar.l = 1;
                        kziVar.getClass();
                        obj = x97.V(dm6.b, new nw1(kziVar, str, n71Var, null), gziVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    return (Pair) obj;
                }
            }
            if (i != 0) {
            }
            return (Pair) obj;
        } catch (IOException e) {
            Assertions.throwOrSkip("NetworkCache", new FailedAssertionException("Exception in NetworkCache#get", e));
            return null;
        } catch (SecurityException e2) {
            Assertions.throwOrSkip("NetworkCache", new FailedAssertionException("Exception in NetworkCache#get", e2));
            return null;
        }
        gziVar = new gzi(this, cg6Var);
        Object obj2 = gziVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gziVar.l;
        Continuation continuation2 = null;
    }

    public xg2 f(Object obj) {
        xg2 xg2Var = (xg2) this.d;
        if (this.c == obj && xg2Var != null) {
            return xg2Var;
        }
        tpi tpiVar = (tpi) this.b;
        Object g = tpiVar.g(obj);
        if (g == null) {
            xg2 xg2Var2 = (xg2) this.a;
            xg2 xg2Var3 = new xg2();
            xg2Var3.a = xg2Var2.a;
            xg2Var3.b = xg2Var2.b;
            tpiVar.m(obj, xg2Var3);
            g = xg2Var3;
        }
        xg2 xg2Var4 = (xg2) g;
        this.c = obj;
        this.d = xg2Var4;
        return xg2Var4;
    }

    @Override // defpackage.m1t
    public sbb g(int i, uu5 uu5Var) {
        ((znk) this.a).getClass();
        return null;
    }

    @Override // defpackage.m1t
    public boolean h() {
        return ((znk) this.a).h();
    }

    @Override // defpackage.upr
    public void i(byte[] bArr, int i, int i2, tpr tprVar, ua6 ua6Var) {
        rv6 rv6Var;
        int i3;
        int i4;
        int i5;
        int y;
        ank ankVar = (ank) this.c;
        d7k d7kVar = (d7k) this.b;
        d7k d7kVar2 = (d7k) this.a;
        d7kVar2.F(i + i2, bArr);
        d7kVar2.H(i);
        if (((Inflater) this.d) == null) {
            this.d = new Inflater();
        }
        Inflater inflater = (Inflater) this.d;
        int i6 = dvt.a;
        if (d7kVar2.a() > 0 && d7kVar2.e() == 120 && dvt.S(d7kVar2, d7kVar, inflater)) {
            d7kVar2.F(d7kVar.c, d7kVar.a);
        }
        int i7 = 0;
        ankVar.d = 0;
        int[] iArr = ankVar.b;
        d7k d7kVar3 = ankVar.a;
        ankVar.e = 0;
        ankVar.f = 0;
        ankVar.g = 0;
        ankVar.h = 0;
        ankVar.i = 0;
        d7kVar3.E(0);
        ankVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (d7kVar2.a() >= 3) {
            int i8 = d7kVar2.c;
            int v = d7kVar2.v();
            int B = d7kVar2.B();
            int i9 = d7kVar2.b + B;
            if (i9 > i8) {
                d7kVar2.H(i8);
                i3 = i7;
                rv6Var = null;
            } else {
                char c = 128;
                if (v != 128) {
                    switch (v) {
                        case 20:
                            if (B % 5 == 2) {
                                d7kVar2.I(2);
                                Arrays.fill(iArr, i7);
                                int i10 = B / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int v2 = d7kVar2.v();
                                    char c2 = c;
                                    double v3 = d7kVar2.v();
                                    double v4 = d7kVar2.v() - 128;
                                    double v5 = d7kVar2.v() - 128;
                                    iArr[v2] = dvt.i((int) ((v5 * 1.772d) + v3), 0, KotlinVersion.MAX_COMPONENT_VALUE) | (d7kVar2.v() << 24) | (dvt.i((int) ((1.402d * v4) + v3), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16) | (dvt.i((int) ((v3 - (0.34414d * v5)) - (v4 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8);
                                    i11++;
                                    c = c2;
                                    ankVar = ankVar;
                                }
                                ankVar.c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (B >= 4) {
                                d7kVar2.I(3);
                                int i12 = B - 4;
                                if (((128 & d7kVar2.v()) != 0 ? 1 : i7) != 0) {
                                    if (i12 >= 7 && (y = d7kVar2.y()) >= 4) {
                                        ankVar.h = d7kVar2.B();
                                        ankVar.i = d7kVar2.B();
                                        d7kVar3.E(y - 4);
                                        i12 = B - 11;
                                    }
                                }
                                int i13 = d7kVar3.b;
                                int i14 = d7kVar3.c;
                                if (i13 < i14 && i12 > 0) {
                                    int min = Math.min(i12, i14 - i13);
                                    d7kVar2.f(d7kVar3.a, i13, min);
                                    d7kVar3.H(i13 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (B >= 19) {
                                ankVar.d = d7kVar2.B();
                                ankVar.e = d7kVar2.B();
                                d7kVar2.I(11);
                                ankVar.f = d7kVar2.B();
                                ankVar.g = d7kVar2.B();
                                break;
                            }
                            break;
                    }
                    i3 = 0;
                    rv6Var = null;
                } else {
                    if (ankVar.d == 0 || ankVar.e == 0 || ankVar.h == 0 || ankVar.i == 0 || (i4 = d7kVar3.c) == 0 || d7kVar3.b != i4 || !ankVar.c) {
                        rv6Var = null;
                    } else {
                        d7kVar3.H(0);
                        int i15 = ankVar.h * ankVar.i;
                        int[] iArr2 = new int[i15];
                        int i16 = 0;
                        while (i16 < i15) {
                            int v6 = d7kVar3.v();
                            if (v6 != 0) {
                                i5 = i16 + 1;
                                iArr2[i16] = iArr[v6];
                            } else {
                                int v7 = d7kVar3.v();
                                if (v7 != 0) {
                                    i5 = ((v7 & 64) == 0 ? v7 & 63 : ((v7 & 63) << 8) | d7kVar3.v()) + i16;
                                    Arrays.fill(iArr2, i16, i5, (v7 & 128) == 0 ? iArr[0] : iArr[d7kVar3.v()]);
                                }
                            }
                            i16 = i5;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, ankVar.h, ankVar.i, Bitmap.Config.ARGB_8888);
                        float f = ankVar.f;
                        float f2 = ankVar.d;
                        float f3 = f / f2;
                        float f4 = ankVar.g;
                        float f5 = ankVar.e;
                        rv6Var = new rv6(null, null, null, createBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, ankVar.h / f2, ankVar.i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    }
                    i3 = 0;
                    ankVar.d = 0;
                    ankVar.e = 0;
                    ankVar.f = 0;
                    ankVar.g = 0;
                    ankVar.h = 0;
                    ankVar.i = 0;
                    d7kVar3.E(0);
                    ankVar.c = false;
                }
                d7kVar2.H(i9);
            }
            if (rv6Var != null) {
                arrayList.add(rv6Var);
            }
            i7 = i3;
        }
        ua6Var.accept(new uv6(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public void j(ArrayList arrayList) {
        arrayList.getClass();
        synchronized (((ArrayList) this.b)) {
            arrayList.clear();
            a((ArrayList) this.a);
            a((ArrayList) this.b);
        }
    }

    public a k() {
        return (a) ((jyr) this.c).getValue();
    }

    public zx0 l() {
        Object obj = ((mo) this.a).get();
        obj.getClass();
        return (zx0) obj;
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:22:0x0038->B:31:?, LOOP_END, SYNTHETIC] */
    @Override // defpackage.p7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(szu szuVar) {
        List j;
        Iterator it;
        boolean A;
        boolean z;
        szuVar.getClass();
        Function0 function0 = (Function0) this.c;
        boolean z2 = true;
        if (function0 != null) {
            int ordinal = ((o3q) this.b).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
            }
            j = szuVar.j();
            if ((j instanceof Collection) || !j.isEmpty()) {
                it = j.iterator();
                while (it.hasNext()) {
                    izs izsVar = ((jzs) it.next()).g;
                    if (!Intrinsics.d(izsVar, hzs.a)) {
                        if (!(izsVar instanceof e6v)) {
                            b6e.s();
                            return null;
                        }
                        e6v e6vVar = (e6v) izsVar;
                        if (e6vVar instanceof b6v) {
                            A = A(((b6v) e6vVar).a);
                            if (A) {
                                z = false;
                                break;
                            }
                        } else if (!(e6vVar instanceof d6v)) {
                            b6e.s();
                            return null;
                        }
                    }
                    A = false;
                    if (A) {
                    }
                }
            }
            z = true;
            if (z || (function0 != null && !rzf.G((List) function0.invoke(), szuVar.j()))) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
        function0 = null;
        j = szuVar.j();
        if (j instanceof Collection) {
        }
        it = j.iterator();
        while (it.hasNext()) {
        }
        z = true;
        if (z) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    @Override // defpackage.p7q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q0(maq maqVar) {
        boolean z;
        naq naqVar;
        uow uowVar;
        maqVar.getClass();
        Function0 function0 = (Function0) this.c;
        boolean z2 = true;
        if (function0 != null) {
            int ordinal = ((o3q) this.b).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
            }
            if (!(maqVar instanceof jbq)) {
                jbq jbqVar = (jbq) maqVar;
                Set o = jbqVar.o();
                if ((o.size() == 1 ? o : null) != null && (naqVar = (naq) CollectionsKt.firstOrNull(jbqVar.n())) != null && (uowVar = naqVar.d) != null) {
                    izs I = q7g.I(uowVar);
                    if (I instanceof e6v) {
                        e6v e6vVar = (e6v) I;
                        if (e6vVar instanceof b6v) {
                            z = A(((b6v) e6vVar).a);
                            if (z || (function0 != null && !rzf.G((List) function0.invoke(), maqVar.j()))) {
                                z2 = false;
                            }
                            return Boolean.valueOf(z2);
                        }
                        if (!(e6vVar instanceof d6v)) {
                            b6e.s();
                            return null;
                        }
                    } else if (!I.equals(hzs.a)) {
                        b6e.s();
                        return null;
                    }
                }
            } else if (!(maqVar instanceof eaq) && !(maqVar instanceof raq) && !(maqVar instanceof vaq)) {
                b6e.s();
                return null;
            }
            z = false;
            if (z) {
            }
            z2 = false;
            return Boolean.valueOf(z2);
        }
        function0 = null;
        if (!(maqVar instanceof jbq)) {
        }
        z = false;
        if (z) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, uif] */
    public void r() {
        String str = (String) this.d;
        if (str != null) {
            ((uif) this.b).invoke(str);
            this.d = null;
        }
    }

    @Override // defpackage.gs3
    public Type s() {
        return o3o.class;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        o3q o3qVar = (o3q) this.b;
        t1qVar.getClass();
        z3q z3qVar = t1qVar.a;
        boolean z = false;
        if (z3qVar instanceof r1q) {
            if (o3qVar != o3q.a) {
                z = ((nvl) this.a).equals(((r1q) z3qVar).c.a);
            }
        } else if (z3qVar instanceof a2q) {
            if (o3qVar == o3q.a) {
                z = ((a2q) z3qVar).a.d().equals(null);
            }
        } else if (!(z3qVar instanceof c1q) && !(z3qVar instanceof e1q) && !(z3qVar instanceof h1q) && !(z3qVar instanceof k1q) && !(z3qVar instanceof u1q)) {
            b6e.s();
            return null;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.m1t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(mqs mqsVar, Continuation continuation) {
        q2m q2mVar;
        int i;
        if (continuation instanceof q2m) {
            q2mVar = (q2m) continuation;
            int i2 = q2mVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2mVar.l = i2 - Integer.MIN_VALUE;
                Object obj = q2mVar.j;
                Object obj2 = nm6.a;
                i = q2mVar.l;
                boolean z = true;
                if (i != 0) {
                    qgg.h0(obj);
                    if (mqsVar.k != dg2.b) {
                        q2mVar.l = 1;
                        obj = x(mqsVar, q2mVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    }
                    if (((cvl) this.b).d()) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
        }
        q2mVar = new q2m(this, (cg6) continuation);
        Object obj3 = q2mVar.j;
        Object obj22 = nm6.a;
        i = q2mVar.l;
        boolean z2 = true;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(mqs mqsVar, cg6 cg6Var) {
        r2m r2mVar;
        int i;
        if (cg6Var instanceof r2m) {
            r2mVar = (r2m) cg6Var;
            int i2 = r2mVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r2mVar.m = i2 - Integer.MIN_VALUE;
                Object obj = r2mVar.k;
                nm6 nm6Var = nm6.a;
                i = r2mVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    pjc g = ((frt) this.d).g();
                    r2mVar.j = mqsVar;
                    r2mVar.m = 1;
                    obj = zsd.g0(g, r2mVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        return bool;
                    }
                    mqsVar = r2mVar.j;
                    qgg.h0(obj);
                }
                String str = ((xxq) obj).a;
                str.getClass();
                rus rusVar = (rus) this.c;
                String str2 = mqsVar.a;
                r2mVar.j = null;
                r2mVar.m = 2;
                obj = rusVar.k(str, str2, r2mVar);
            }
        }
        r2mVar = new r2m(this, cg6Var);
        Object obj2 = r2mVar.k;
        nm6 nm6Var2 = nm6.a;
        i = r2mVar.m;
        if (i != 0) {
        }
        String str3 = ((xxq) obj2).a;
        str3.getClass();
        rus rusVar2 = (rus) this.c;
        String str22 = mqsVar.a;
        r2mVar.j = null;
        r2mVar.m = 2;
        obj2 = rusVar2.k(str3, str22, r2mVar);
    }

    @Override // defpackage.upr
    public int y() {
        return 2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.gs3
    public Object z(foj fojVar) {
        p9 w3oVar;
        ?? r0 = this.c;
        whi whiVar = (whi) this.a;
        Annotation[] annotationArr = (Annotation[]) this.b;
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                Type type = (Type) r0.getValue();
                type.getClass();
                w3oVar = new w3o(type);
                break;
            }
            if (annotationArr[i] instanceof v2j) {
                Type type2 = (Type) r0.getValue();
                if (!(type2 instanceof ParameterizedType)) {
                    xq0.x("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
                    return null;
                }
                Type H = jf0.H(0, (ParameterizedType) type2);
                H.getClass();
                w3oVar = new v3o(H);
            } else {
                i++;
            }
        }
        return new vhi(fojVar, (vao) this.d, w3oVar, (Annotation[]) this.b, whiVar.a, whiVar.c);
    }

    public xdh(cvo cvoVar, grh grhVar, jtc jtcVar, h0h h0hVar) {
        cvoVar.getClass();
        this.a = cvoVar;
        this.b = grhVar;
        this.c = jtcVar;
        this.d = h0hVar;
    }

    public xdh(String str, apo apoVar, c0p c0pVar, t1p t1pVar) {
        str.getClass();
        c0pVar.getClass();
        this.a = str;
        this.b = apoVar;
        this.c = c0pVar;
        this.d = t1pVar;
    }

    public xdh(ggj ggjVar, g0c g0cVar) {
        ggjVar.getClass();
        g0cVar.getClass();
        this.a = ggjVar;
        this.b = g0cVar;
    }

    public xdh(okb okbVar, wil wilVar, vil vilVar) {
        okbVar.getClass();
        wilVar.getClass();
        vilVar.getClass();
        this.a = okbVar;
        this.b = wilVar;
        this.c = vilVar;
        this.d = qld.m();
    }

    public xdh(jyr jyrVar, lum lumVar, oxa oxaVar, qyf qyfVar) {
        this.a = lumVar;
        this.b = oxaVar;
        this.c = qyfVar;
        this.d = jyrVar;
    }

    public xdh(t tVar, String str, String str2, avo avoVar) {
        tVar.getClass();
        str2.getClass();
        avoVar.getClass();
        this.a = tVar;
        this.b = str;
        this.c = str2;
        this.d = avoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xdh(Function1 function1, Function1 function12, g0c g0cVar) {
        this.a = (uif) function1;
        this.b = (uif) function12;
        this.c = g0cVar;
    }

    public xdh(xrb xrbVar) {
        this.a = xrbVar;
        xrbVar.t.getClass();
        this.b = btf.b(new p7l(this, 1));
        this.c = btf.b(new p7l(this, 0));
        this.d = new ris();
    }

    public xdh(vdr vdrVar) {
        vdrVar.getClass();
        this.a = vdrVar;
        x0q b = y0q.b(0, 0, null, 7);
        this.b = b;
        this.c = b;
        this.d = ofc.e;
    }

    public xdh(Gson gson, kzi kziVar) {
        kziVar.getClass();
        this.a = gson;
        this.b = kziVar;
        this.c = new coi(10);
        this.d = new coi(11);
    }

    public xdh(qdc qdcVar, g0c g0cVar) {
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        r5m r5mVar = new r5m(1, null);
        mn7Var.getClass();
        this.a = qdcVar;
        this.b = g0cVar;
        this.c = mn7Var;
        this.d = r5mVar;
    }

    public xdh(whi whiVar, Annotation[] annotationArr, vao vaoVar, arf arfVar) {
        this.a = whiVar;
        this.b = annotationArr;
        this.d = vaoVar;
        this.c = arfVar;
    }

    public xdh(f2a f2aVar, LinearLayout linearLayout, View view, CardView cardView, EditText editText) {
        this.a = linearLayout;
        this.b = view;
        this.c = cardView;
        this.d = editText;
    }

    public xdh(oq7 oq7Var) {
        this.a = oq7Var;
        this.b = gld.e(dm6.b().plus(a4g.n()).plus(new im6("PlaybackPresenterStateSubscriptions")));
        this.c = ydr.a(null);
    }

    public xdh(View view, whk whkVar, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.a = view;
        this.b = constraintLayout;
        this.c = constraintLayout2;
        this.d = textView;
    }

    public /* synthetic */ xdh(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public xdh(cvl cvlVar, f7l f7lVar, rus rusVar, frt frtVar) {
        cvlVar.getClass();
        f7lVar.getClass();
        rusVar.getClass();
        frtVar.getClass();
        this.a = new znk(f7lVar);
        this.b = cvlVar;
        this.c = rusVar;
        this.d = frtVar;
    }

    public xdh(tf6 tf6Var, evj evjVar) {
        this.d = tf6Var;
        bdt I = hag.I(oq7.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(k1l.class), true);
        this.c = btf.b(new yjl(evjVar, 0));
    }

    public xdh(int i) {
        switch (i) {
            case 16:
                this.a = new ArrayList();
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                new ArrayList();
                break;
            case 17:
                this.a = new d7k();
                this.b = new d7k();
                this.c = new ank();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                this.a = new xg2();
                long[] jArr = vso.a;
                this.b = new tpi();
                break;
            default:
                this.a = new mo(10);
                this.b = new LinkedHashSet();
                this.c = new Object();
                break;
        }
    }

    public xdh(qsn qsnVar, j6e j6eVar, qdc qdcVar, jtc jtcVar) {
        Object obj;
        if (qsnVar != null) {
            obj = yde.v(qsnVar);
        } else {
            ude udeVar = yde.b;
            obj = qsn.e;
        }
        this.a = obj;
        this.b = j6eVar;
        this.c = qdcVar;
        this.d = jtcVar;
    }

    public xdh(yvs yvsVar, boolean[] zArr) {
        this.a = yvsVar;
        this.b = zArr;
        int i = yvsVar.a;
        this.c = new boolean[i];
        this.d = new boolean[i];
    }
}
