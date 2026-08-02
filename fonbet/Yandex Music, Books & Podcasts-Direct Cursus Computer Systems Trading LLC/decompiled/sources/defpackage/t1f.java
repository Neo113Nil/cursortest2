package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.api.h;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.n2;
import com.yandex.passport.api.q;
import com.yandex.passport.api.q2;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.impl.q0;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.properties.v;
import com.yandex.passport.internal.ui.a;
import com.yandex.plus.core.locale.b;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.profile.ProfileActivity;

/* loaded from: classes3.dex */
public final class t1f implements tjp, gs3, rzb, w8p, yxk, trm {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public t1f(int i) {
        this.a = i;
        switch (i) {
            case 12:
                this.b = new CopyOnWriteArrayList();
                xdr a = ydr.a(null);
                this.c = a;
                this.d = new fkn(a);
                break;
            case 26:
                l18 l18Var = l18.b;
                bdt I = hag.I(jul.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                this.b = (jul) qdcVar.C(I);
                bdt I2 = hag.I(nsl.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                this.c = (nsl) qdcVar2.C(I2);
                this.d = l18Var.b(hag.I(jhq.class), true);
                break;
            default:
                this.b = rqi.a();
                this.c = new tpi();
                this.d = new cpi();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [qu2] */
    public static final mb5 n(t1f t1fVar, mb5 mb5Var, ofg ofgVar, ofg ofgVar2) {
        qu2 qu2Var;
        qu2 qu2Var2;
        ?? r11;
        t1fVar.getClass();
        nfg nfgVar = nfg.c;
        if (mb5Var == null || (qu2Var = mb5Var.a) == null) {
            qu2Var = nfgVar;
        }
        qu2 qu2Var3 = ofgVar.a;
        qu2 q = q(qu2Var, qu2Var3, qu2Var3, ofgVar2 != null ? ofgVar2.a : null);
        if (mb5Var == null || (qu2Var2 = mb5Var.b) == null) {
            qu2Var2 = nfgVar;
        }
        qu2 q2 = q(qu2Var2, qu2Var3, ofgVar.b, ofgVar2 != null ? ofgVar2.b : null);
        if (mb5Var != null && (r11 = mb5Var.c) != 0) {
            nfgVar = r11;
        }
        return new mb5(q, q2, q(nfgVar, qu2Var3, ofgVar.c, ofgVar2 != null ? ofgVar2.c : null), ofgVar, ofgVar2);
    }

    public static qu2 q(qu2 qu2Var, qu2 qu2Var2, qu2 qu2Var3, qu2 qu2Var4) {
        return qu2Var4 == null ? qu2Var3 : qu2Var instanceof mfg ? ((qu2Var2 instanceof nfg) && (qu2Var4 instanceof nfg)) ? qu2Var4 : qu2Var4 instanceof lfg ? qu2Var4 : qu2Var : qu2Var4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:14|15))(5:16|17|(3:22|(1:24)(1:27)|(1:26))|28|(0))|11|12))|31|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0028, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        com.yandex.music.shared.utils.assertions.Assertions.throwOrSkip$default(new com.yandex.music.shared.utils.assertions.FailedAssertionException("", r7), null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object A(cvl cvlVar, cg6 cg6Var) {
        izl izlVar;
        int i;
        Object obj;
        if (cg6Var instanceof izl) {
            izlVar = (izl) cg6Var;
            int i2 = izlVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                izlVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = izlVar.j;
                Object obj3 = nm6.a;
                i = izlVar.l;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    jul julVar = (jul) this.b;
                    izlVar.l = 1;
                    julVar.getClass();
                    if (cvlVar.B != 0 && fxf.G(cvlVar)) {
                        dq7 dq7Var = ca8.a;
                        obj = x97.V(mn7.d, new hul(julVar, cvlVar, continuation, i3), izlVar);
                        if (obj != obj3) {
                            obj = Unit.a;
                        }
                        if (obj == obj3) {
                            return obj3;
                        }
                    }
                    obj = Unit.a;
                    if (obj == obj3) {
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
        izlVar = new izl(this, cg6Var);
        Object obj22 = izlVar.j;
        Object obj32 = nm6.a;
        i = izlVar.l;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        return Unit.a;
    }

    public void B(l5t l5tVar, String str) {
        str.getClass();
        Context context = (Context) this.b;
        hq0 hq0Var = context instanceof hq0 ? (hq0) context : null;
        if (hq0Var == null) {
            dfi.r("Expected activity as context, cannot show TrailerBottomSheetDialog, see MUSICANDROID-31303", "LongTapBottomSheetNavigationImpl");
            return;
        }
        y supportFragmentManager = hq0Var.getSupportFragmentManager();
        supportFragmentManager.getClass();
        mvn.T(supportFragmentManager, l5tVar, str, false, (kxi) this.d, null);
    }

    public yop C(e1j e1jVar, Function1 function1, p1j p1jVar) {
        e1jVar.getClass();
        function1.getClass();
        d0j d0jVar = (d0j) this.b;
        d0jVar.getClass();
        e1jVar.getClass();
        ArrayList<b0j> arrayList = d0jVar.b;
        mif d = nif.d(e1jVar);
        for (b0j b0jVar : arrayList) {
            b0jVar.getClass();
            d = mif.a(d, new ybg(12, b0jVar), null, 5);
        }
        return mif.a(mif.a(mif.a(d, new ybg(11, d0jVar), null, 5), lhb.z0, new m1j(this, 0), 1), new ak0(this, function1, p1jVar, e1jVar), null, 5);
    }

    public a1l D(long j) {
        return new a1l(F(((f7l) this.b).c, j), 2);
    }

    @Override // defpackage.bjr
    public void E(rym rymVar) {
        try {
            synchronized (((oxj) this.c)) {
                oxj oxjVar = (oxj) this.c;
                oxjVar.e = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = oxjVar.g;
                if (concurrentLinkedQueue != null) {
                    concurrentLinkedQueue.add(rymVar);
                } else if (oxjVar.f == null) {
                    oxjVar.f = rymVar;
                } else {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue();
                    oxjVar.g = concurrentLinkedQueue2;
                    concurrentLinkedQueue2.add(rymVar);
                }
                ((oxj) this.c).c();
            }
        } catch (tgr e) {
            synchronized (((uhe) this.b)) {
                uhe uheVar = (uhe) this.b;
                sgr sgrVar = e.a;
                uheVar.b(sgrVar, sgrVar, false);
            }
        }
    }

    public pjc F(vdr vdrVar, long j) {
        nsa.b.getClass();
        int i = 3;
        Continuation continuation = null;
        return zsd.b0(zsd.k0(zsd.M0(new eno(new rlg(new a1l(vdrVar, i), this, continuation, 28)), new ukc(this, new eno(new fv0(j, continuation, i)), ((uol) this.c).i, null)), dm6.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0252 -> B:13:0x0257). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(String str, Set set, cg6 cg6Var) {
        aqk aqkVar;
        Collection arrayList;
        int i;
        yqk yqkVar;
        Iterator it;
        int i2;
        int i3;
        Iterator it2;
        Collection collection;
        String str2;
        k63 k63Var;
        if (cg6Var instanceof aqk) {
            aqkVar = (aqk) cg6Var;
            int i4 = aqkVar.s;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aqkVar.s = i4 - Integer.MIN_VALUE;
                Object obj = aqkVar.q;
                Object obj2 = nm6.a;
                switch (aqkVar.s) {
                    case 0:
                        qgg.h0(obj);
                        yqk p = bfg.p((cc7) this.c, str);
                        Set set2 = set;
                        arrayList = new ArrayList(v75.o(set2, 10));
                        i = 0;
                        yqkVar = p;
                        it = set2.iterator();
                        i2 = 0;
                        if (!it.hasNext()) {
                            n43 n43Var = (n43) it.next();
                            if (n43Var instanceof j43) {
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection2 = arrayList;
                                aqkVar.l = collection2;
                                aqkVar.m = it;
                                aqkVar.n = collection2;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 1;
                                Object L = L(str, yqkVar, (j43) n43Var, aqkVar);
                                if (L != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    collection = arrayList;
                                    k63Var = (k63) L;
                                    yqk yqkVar2 = yqkVar;
                                    int i5 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i5;
                                    yqkVar = yqkVar2;
                                }
                                return obj2;
                            }
                            if (n43Var instanceof g43) {
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection3 = arrayList;
                                aqkVar.l = collection3;
                                aqkVar.m = it;
                                aqkVar.n = collection3;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 2;
                                Object I = I(str, yqkVar, (g43) n43Var, aqkVar);
                                if (I != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    collection = arrayList;
                                    k63Var = (k63) I;
                                    yqk yqkVar22 = yqkVar;
                                    int i52 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i52;
                                    yqkVar = yqkVar22;
                                }
                                return obj2;
                            }
                            if (n43Var instanceof h43) {
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection4 = arrayList;
                                aqkVar.l = collection4;
                                aqkVar.m = it;
                                aqkVar.n = collection4;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 3;
                                Object J = J(str, yqkVar, (h43) n43Var, aqkVar);
                                if (J != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    collection = arrayList;
                                    k63Var = (k63) J;
                                    yqk yqkVar222 = yqkVar;
                                    int i522 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i522;
                                    yqkVar = yqkVar222;
                                }
                                return obj2;
                            }
                            if (n43Var instanceof i43) {
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection5 = arrayList;
                                aqkVar.l = collection5;
                                aqkVar.m = it;
                                aqkVar.n = collection5;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 4;
                                Object K = K(str, aqkVar);
                                if (K != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    collection = arrayList;
                                    k63Var = (k63) K;
                                    yqk yqkVar2222 = yqkVar;
                                    int i5222 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i5222;
                                    yqkVar = yqkVar2222;
                                }
                                return obj2;
                            }
                            if (n43Var instanceof l43) {
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection6 = arrayList;
                                aqkVar.l = collection6;
                                aqkVar.m = it;
                                aqkVar.n = collection6;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 5;
                                Object P = P(str, yqkVar, aqkVar);
                                if (P != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    collection = arrayList;
                                    k63Var = (k63) P;
                                    yqk yqkVar22222 = yqkVar;
                                    int i52222 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i52222;
                                    yqkVar = yqkVar22222;
                                }
                                return obj2;
                            }
                            if (n43Var instanceof m43) {
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection7 = arrayList;
                                aqkVar.l = collection7;
                                aqkVar.m = it;
                                aqkVar.n = collection7;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 6;
                                Object R = R(str, aqkVar);
                                if (R != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    collection = arrayList;
                                    k63Var = (k63) R;
                                    yqk yqkVar222222 = yqkVar;
                                    int i522222 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i522222;
                                    yqkVar = yqkVar222222;
                                }
                                return obj2;
                            }
                            if (n43Var instanceof k43) {
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection8 = arrayList;
                                aqkVar.l = collection8;
                                aqkVar.m = it;
                                aqkVar.n = collection8;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 7;
                                Object N = N(str, yqkVar, (k43) n43Var, aqkVar);
                                if (N != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    collection = arrayList;
                                    k63Var = (k63) N;
                                    yqk yqkVar2222222 = yqkVar;
                                    int i5222222 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i5222222;
                                    yqkVar = yqkVar2222222;
                                }
                            } else {
                                if (!(n43Var instanceof f43)) {
                                    b6e.s();
                                    return null;
                                }
                                aqkVar.j = str;
                                aqkVar.k = yqkVar;
                                Collection collection9 = arrayList;
                                aqkVar.l = collection9;
                                aqkVar.m = it;
                                aqkVar.n = collection9;
                                aqkVar.o = i2;
                                aqkVar.p = i;
                                aqkVar.s = 8;
                                Object H = H(str, aqkVar);
                                if (H != obj2) {
                                    str2 = str;
                                    i3 = i;
                                    it2 = it;
                                    obj = H;
                                    collection = arrayList;
                                    k63Var = (k63) obj;
                                    yqk yqkVar22222222 = yqkVar;
                                    int i52222222 = i3;
                                    str = str2;
                                    arrayList.add(k63Var);
                                    it = it2;
                                    arrayList = collection;
                                    i = i52222222;
                                    yqkVar = yqkVar22222222;
                                }
                            }
                            return obj2;
                            if (!it.hasNext()) {
                                return (List) arrayList;
                            }
                        }
                    case 1:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar222222222 = yqkVar;
                        int i522222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i522222222;
                        yqkVar = yqkVar222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 2:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar2222222222 = yqkVar;
                        int i5222222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i5222222222;
                        yqkVar = yqkVar2222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 3:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar22222222222 = yqkVar;
                        int i52222222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i52222222222;
                        yqkVar = yqkVar22222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 4:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar222222222222 = yqkVar;
                        int i522222222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i522222222222;
                        yqkVar = yqkVar222222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 5:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar2222222222222 = yqkVar;
                        int i5222222222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i5222222222222;
                        yqkVar = yqkVar2222222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 6:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar22222222222222 = yqkVar;
                        int i52222222222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i52222222222222;
                        yqkVar = yqkVar22222222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 7:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar222222222222222 = yqkVar;
                        int i522222222222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i522222222222222;
                        yqkVar = yqkVar222222222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 8:
                        i3 = aqkVar.p;
                        i2 = aqkVar.o;
                        arrayList = aqkVar.n;
                        it2 = aqkVar.m;
                        collection = aqkVar.l;
                        yqkVar = aqkVar.k;
                        str2 = aqkVar.j;
                        qgg.h0(obj);
                        k63Var = (k63) obj;
                        yqk yqkVar2222222222222222 = yqkVar;
                        int i5222222222222222 = i3;
                        str = str2;
                        arrayList.add(k63Var);
                        it = it2;
                        arrayList = collection;
                        i = i5222222222222222;
                        yqkVar = yqkVar2222222222222222;
                        if (!it.hasNext()) {
                        }
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        aqkVar = new aqk(this, cg6Var);
        Object obj3 = aqkVar.q;
        Object obj22 = nm6.a;
        switch (aqkVar.s) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0083, code lost:
    
        if (r2 == r5) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d1 A[LOOP:0: B:13:0x01cb->B:15:0x01d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017f A[LOOP:1: B:24:0x0179->B:26:0x017f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec A[LOOP:4: B:60:0x00e6->B:62:0x00ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0114 A[LOOP:5: B:65:0x010e->B:67:0x0114, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a A[LOOP:6: B:70:0x0134->B:72:0x013a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(String str, cg6 cg6Var) {
        bqk bqkVar;
        Object obj;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object d;
        String str2;
        List list;
        List list2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        String str3 = str;
        ac0 ac0Var = (ac0) this.b;
        if (cg6Var instanceof bqk) {
            bqkVar = (bqk) cg6Var;
            int i2 = bqkVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bqkVar.q = i2 - Integer.MIN_VALUE;
                Object obj2 = bqkVar.o;
                obj = nm6.a;
                i = bqkVar.q;
                if (i != 0) {
                    qgg.h0(obj2);
                    eka ekaVar = (eka) ac0Var.a.getValue();
                    bqkVar.j = str3;
                    bqkVar.q = 1;
                    obj2 = ekaVar.a.b(str3);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ArrayList arrayList6 = bqkVar.n;
                            List list3 = bqkVar.m;
                            List list4 = bqkVar.l;
                            List list5 = bqkVar.k;
                            qgg.h0(obj2);
                            arrayList5 = arrayList6;
                            list2 = list3;
                            arrayList3 = list5;
                            arrayList4 = list4;
                            Iterable<fga> iterable = (Iterable) obj2;
                            ArrayList arrayList7 = new ArrayList(v75.o(iterable, 10));
                            for (fga fgaVar : iterable) {
                                arrayList7.add(new afa(fgaVar.c, new nvl(fgaVar.a.a, fgaVar.b)));
                            }
                            return new c63(arrayList3, arrayList4, list2, arrayList5, arrayList7);
                        }
                        list = bqkVar.m;
                        List list6 = bqkVar.l;
                        List list7 = bqkVar.k;
                        str2 = bqkVar.j;
                        qgg.h0(obj2);
                        arrayList2 = list6;
                        arrayList = list7;
                        Iterable<jca> iterable2 = (Iterable) obj2;
                        ArrayList arrayList8 = new ArrayList(v75.o(iterable2, 10));
                        for (jca jcaVar : iterable2) {
                            arrayList8.add(new afa(jcaVar.b, jcaVar.a));
                        }
                        oga ogaVar = (oga) ac0Var.c.getValue();
                        bqkVar.j = null;
                        bqkVar.k = arrayList;
                        bqkVar.l = arrayList2;
                        bqkVar.m = list;
                        bqkVar.n = arrayList8;
                        bqkVar.q = 3;
                        obj2 = ogaVar.d(str2, bqkVar);
                        if (obj2 != obj) {
                            list2 = list;
                            arrayList3 = arrayList;
                            arrayList4 = arrayList2;
                            arrayList5 = arrayList8;
                            Iterable<fga> iterable3 = (Iterable) obj2;
                            ArrayList arrayList72 = new ArrayList(v75.o(iterable3, 10));
                            while (r2.hasNext()) {
                            }
                            return new c63(arrayList3, arrayList4, list2, arrayList5, arrayList72);
                        }
                        return obj;
                    }
                    str3 = bqkVar.j;
                    qgg.h0(obj2);
                }
                ArrayList arrayList9 = new ArrayList();
                ArrayList<ija> arrayList10 = new ArrayList();
                for (Object obj3 : (Iterable) obj2) {
                    if (((ija) obj3).e) {
                        arrayList9.add(obj3);
                    } else {
                        arrayList10.add(obj3);
                    }
                }
                ArrayList<ija> arrayList11 = new ArrayList();
                ArrayList<ija> arrayList12 = new ArrayList();
                for (Object obj4 : arrayList9) {
                    if (((ija) obj4).d == hja.c) {
                        arrayList11.add(obj4);
                    } else {
                        arrayList12.add(obj4);
                    }
                }
                arrayList = new ArrayList(v75.o(arrayList12, 10));
                for (ija ijaVar : arrayList12) {
                    arrayList.add(new afa(ijaVar.b, ijaVar.a));
                }
                arrayList2 = new ArrayList(v75.o(arrayList11, 10));
                for (ija ijaVar2 : arrayList11) {
                    arrayList2.add(new afa(ijaVar2.b, ijaVar2.a));
                }
                ArrayList arrayList13 = new ArrayList(v75.o(arrayList10, 10));
                for (ija ijaVar3 : arrayList10) {
                    arrayList13.add(new afa(ijaVar3.b, ijaVar3.a));
                }
                sca scaVar = (sca) ac0Var.b.getValue();
                bqkVar.j = str3;
                bqkVar.k = arrayList;
                bqkVar.l = arrayList2;
                bqkVar.m = arrayList13;
                bqkVar.q = 2;
                d = scaVar.d(str3, bqkVar);
                if (d != obj) {
                    str2 = str3;
                    list = arrayList13;
                    obj2 = d;
                    Iterable<jca> iterable22 = (Iterable) obj2;
                    ArrayList arrayList82 = new ArrayList(v75.o(iterable22, 10));
                    while (r2.hasNext()) {
                    }
                    oga ogaVar2 = (oga) ac0Var.c.getValue();
                    bqkVar.j = null;
                    bqkVar.k = arrayList;
                    bqkVar.l = arrayList2;
                    bqkVar.m = list;
                    bqkVar.n = arrayList82;
                    bqkVar.q = 3;
                    obj2 = ogaVar2.d(str2, bqkVar);
                    if (obj2 != obj) {
                    }
                }
                return obj;
            }
        }
        bqkVar = new bqk(this, cg6Var);
        Object obj22 = bqkVar.o;
        obj = nm6.a;
        i = bqkVar.q;
        if (i != 0) {
        }
        ArrayList arrayList92 = new ArrayList();
        ArrayList<ija> arrayList102 = new ArrayList();
        while (r2.hasNext()) {
        }
        ArrayList<ija> arrayList112 = new ArrayList();
        ArrayList<ija> arrayList122 = new ArrayList();
        while (r6.hasNext()) {
        }
        arrayList = new ArrayList(v75.o(arrayList122, 10));
        while (r11.hasNext()) {
        }
        arrayList2 = new ArrayList(v75.o(arrayList112, 10));
        while (r2.hasNext()) {
        }
        ArrayList arrayList132 = new ArrayList(v75.o(arrayList102, 10));
        while (r8.hasNext()) {
        }
        sca scaVar2 = (sca) ac0Var.b.getValue();
        bqkVar.j = str3;
        bqkVar.k = arrayList;
        bqkVar.l = arrayList2;
        bqkVar.m = arrayList132;
        bqkVar.q = 2;
        d = scaVar2.d(str3, bqkVar);
        if (d != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object I(String str, yqk yqkVar, g43 g43Var, cg6 cg6Var) {
        cqk cqkVar;
        nm6 nm6Var;
        int i;
        Object f;
        List list;
        yqk yqkVar2;
        g43 g43Var2;
        Object d;
        List list2;
        Integer num;
        if (cg6Var instanceof cqk) {
            cqkVar = (cqk) cg6Var;
            int i2 = cqkVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cqkVar.p = i2 - Integer.MIN_VALUE;
                Object obj = cqkVar.n;
                nm6Var = nm6.a;
                i = cqkVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    et etVar = (et) ((ac0) this.b).f.getValue();
                    cqkVar.j = yqkVar;
                    cqkVar.k = g43Var;
                    cqkVar.p = 1;
                    obj = etVar.i(str, cqkVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            num = cqkVar.m;
                            list2 = cqkVar.l;
                            qgg.h0(obj);
                            return new d63(num, (Boolean) obj, list2);
                        }
                        list = cqkVar.l;
                        g43Var2 = cqkVar.k;
                        yqkVar2 = cqkVar.j;
                        qgg.h0(obj);
                        Integer num2 = (Integer) obj;
                        cqkVar.j = null;
                        cqkVar.k = null;
                        cqkVar.l = list;
                        cqkVar.m = num2;
                        cqkVar.p = 3;
                        d = yqkVar2.d(g43Var2, cqkVar);
                        if (d != nm6Var) {
                            list2 = list;
                            num = num2;
                            obj = d;
                            return new d63(num, (Boolean) obj, list2);
                        }
                        return nm6Var;
                    }
                    g43Var = cqkVar.k;
                    yqkVar = cqkVar.j;
                    qgg.h0(obj);
                }
                List list3 = (List) obj;
                cqkVar.j = yqkVar;
                cqkVar.k = g43Var;
                cqkVar.l = list3;
                cqkVar.p = 2;
                f = yqkVar.f(g43Var, cqkVar);
                if (f != nm6Var) {
                    obj = f;
                    list = list3;
                    g43 g43Var3 = g43Var;
                    yqkVar2 = yqkVar;
                    g43Var2 = g43Var3;
                    Integer num22 = (Integer) obj;
                    cqkVar.j = null;
                    cqkVar.k = null;
                    cqkVar.l = list;
                    cqkVar.m = num22;
                    cqkVar.p = 3;
                    d = yqkVar2.d(g43Var2, cqkVar);
                    if (d != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        cqkVar = new cqk(this, cg6Var);
        Object obj2 = cqkVar.n;
        nm6Var = nm6.a;
        i = cqkVar.p;
        if (i != 0) {
        }
        List list32 = (List) obj2;
        cqkVar.j = yqkVar;
        cqkVar.k = g43Var;
        cqkVar.l = list32;
        cqkVar.p = 2;
        f = yqkVar.f(g43Var, cqkVar);
        if (f != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object J(String str, yqk yqkVar, h43 h43Var, cg6 cg6Var) {
        dqk dqkVar;
        nm6 nm6Var;
        int i;
        List list;
        Object f;
        yqk yqkVar2;
        List list2;
        Object d;
        List list3;
        Integer num;
        if (cg6Var instanceof dqk) {
            dqkVar = (dqk) cg6Var;
            int i2 = dqkVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dqkVar.q = i2 - Integer.MIN_VALUE;
                Object obj = dqkVar.o;
                nm6Var = nm6.a;
                i = dqkVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    p51 p51Var = (p51) ((ac0) this.b).g.getValue();
                    dqkVar.j = yqkVar;
                    dqkVar.k = h43Var;
                    dqkVar.q = 1;
                    obj = p51Var.g(str, dqkVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            num = dqkVar.n;
                            list2 = dqkVar.m;
                            list3 = dqkVar.l;
                            qgg.h0(obj);
                            return new e63(num, (Boolean) obj, list3, list2);
                        }
                        List list4 = dqkVar.m;
                        List list5 = dqkVar.l;
                        h43Var = dqkVar.k;
                        yqkVar2 = dqkVar.j;
                        qgg.h0(obj);
                        list2 = list4;
                        list = list5;
                        Integer num2 = (Integer) obj;
                        dqkVar.j = null;
                        dqkVar.k = null;
                        dqkVar.l = list;
                        dqkVar.m = list2;
                        dqkVar.n = num2;
                        dqkVar.q = 3;
                        d = yqkVar2.d(h43Var, dqkVar);
                        if (d != nm6Var) {
                            list3 = list;
                            num = num2;
                            obj = d;
                            return new e63(num, (Boolean) obj, list3, list2);
                        }
                        return nm6Var;
                    }
                    h43Var = dqkVar.k;
                    yqkVar = dqkVar.j;
                    qgg.h0(obj);
                }
                bc1 bc1Var = (bc1) obj;
                list = bc1Var.a;
                ArrayList arrayList = bc1Var.b;
                dqkVar.j = yqkVar;
                dqkVar.k = h43Var;
                dqkVar.l = list;
                dqkVar.m = arrayList;
                dqkVar.q = 2;
                f = yqkVar.f(h43Var, dqkVar);
                if (f != nm6Var) {
                    yqkVar2 = yqkVar;
                    list2 = arrayList;
                    obj = f;
                    Integer num22 = (Integer) obj;
                    dqkVar.j = null;
                    dqkVar.k = null;
                    dqkVar.l = list;
                    dqkVar.m = list2;
                    dqkVar.n = num22;
                    dqkVar.q = 3;
                    d = yqkVar2.d(h43Var, dqkVar);
                    if (d != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        dqkVar = new dqk(this, cg6Var);
        Object obj2 = dqkVar.o;
        nm6Var = nm6.a;
        i = dqkVar.q;
        if (i != 0) {
        }
        bc1 bc1Var2 = (bc1) obj2;
        list = bc1Var2.a;
        ArrayList arrayList2 = bc1Var2.b;
        dqkVar.j = yqkVar;
        dqkVar.k = h43Var;
        dqkVar.l = list;
        dqkVar.m = arrayList2;
        dqkVar.q = 2;
        f = yqkVar.f(h43Var, dqkVar);
        if (f != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[LOOP:0: B:11:0x0053->B:13:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object K(String str, cg6 cg6Var) {
        eqk eqkVar;
        int i;
        if (cg6Var instanceof eqk) {
            eqkVar = (eqk) cg6Var;
            int i2 = eqkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eqkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = eqkVar.j;
                Object obj2 = nm6.a;
                i = eqkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    rtl b = ((ac0) this.b).b();
                    eqkVar.l = 1;
                    obj = b.b(str, eqkVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                Iterable<cvl> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
                for (cvl cvlVar : iterable) {
                    arrayList.add(new z1g(cvlVar.g(), cvlVar.e, cvlVar.d));
                }
                return new f63(arrayList);
            }
        }
        eqkVar = new eqk(this, cg6Var);
        Object obj3 = eqkVar.j;
        Object obj22 = nm6.a;
        i = eqkVar.l;
        if (i != 0) {
        }
        Iterable<cvl> iterable2 = (Iterable) obj3;
        ArrayList arrayList2 = new ArrayList(v75.o(iterable2, 10));
        while (r6.hasNext()) {
        }
        return new f63(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0155, code lost:
    
        if (r15 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        if (r15 == r3) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cf, code lost:
    
        if (r15 == r3) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object L(String str, yqk yqkVar, j43 j43Var, cg6 cg6Var) {
        fqk fqkVar;
        cvl cvlVar;
        yqk yqkVar2;
        j43 j43Var2;
        String str2;
        String str3;
        j43 j43Var3;
        cvl cvlVar2;
        cvl cvlVar3;
        List list;
        yqk yqkVar3;
        j43 j43Var4;
        cvl cvlVar4;
        List list2;
        cvl cvlVar5;
        Object h;
        j43 j43Var5;
        cvl cvlVar6;
        yqk yqkVar4;
        Object f;
        cvl cvlVar7;
        cvl cvlVar8;
        List list3;
        List list4;
        Object d;
        Integer num;
        cvl cvlVar9;
        ac0 ac0Var = (ac0) this.b;
        jyr jyrVar = ac0Var.j;
        if (cg6Var instanceof fqk) {
            fqkVar = (fqk) cg6Var;
            int i = fqkVar.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                fqkVar.t = i - Integer.MIN_VALUE;
                Object obj = fqkVar.r;
                Object obj2 = nm6.a;
                switch (fqkVar.t) {
                    case 0:
                        qgg.h0(obj);
                        nvl nvlVar = new nvl(str, "3");
                        rtl b = ac0Var.b();
                        fqkVar.j = str;
                        fqkVar.k = yqkVar;
                        fqkVar.l = j43Var;
                        fqkVar.t = 1;
                        obj = b.d(str, nvlVar, false, fqkVar);
                        break;
                    case 1:
                        j43Var = fqkVar.l;
                        yqkVar = fqkVar.k;
                        str = fqkVar.j;
                        qgg.h0(obj);
                        cvlVar = (cvl) obj;
                        if (cvlVar == null) {
                            fqkVar.j = str;
                            fqkVar.k = yqkVar;
                            fqkVar.l = j43Var;
                            fqkVar.t = 2;
                            obj = v(str, str, fqkVar);
                            if (obj != obj2) {
                                j43 j43Var6 = j43Var;
                                str3 = str;
                                j43Var3 = j43Var6;
                                cvlVar = (cvl) obj;
                                str2 = str3;
                                yqkVar2 = yqkVar;
                                j43Var2 = j43Var3;
                                cvlVar2 = cvlVar;
                                i2m i2mVar = (i2m) jyrVar.getValue();
                                lxs lxsVar = lxs.b;
                                fqkVar.j = str2;
                                fqkVar.k = yqkVar2;
                                fqkVar.l = j43Var2;
                                fqkVar.m = cvlVar2;
                                fqkVar.t = 3;
                                obj = i2mVar.h(str2, lxsVar, fqkVar);
                                break;
                            }
                            return obj2;
                        }
                        j43 j43Var7 = j43Var;
                        yqkVar2 = yqkVar;
                        j43Var2 = j43Var7;
                        str2 = str;
                        cvlVar2 = cvlVar;
                        i2m i2mVar2 = (i2m) jyrVar.getValue();
                        lxs lxsVar2 = lxs.b;
                        fqkVar.j = str2;
                        fqkVar.k = yqkVar2;
                        fqkVar.l = j43Var2;
                        fqkVar.m = cvlVar2;
                        fqkVar.t = 3;
                        obj = i2mVar2.h(str2, lxsVar2, fqkVar);
                    case 2:
                        j43Var3 = fqkVar.l;
                        yqkVar = fqkVar.k;
                        str3 = fqkVar.j;
                        qgg.h0(obj);
                        cvlVar = (cvl) obj;
                        str2 = str3;
                        yqkVar2 = yqkVar;
                        j43Var2 = j43Var3;
                        cvlVar2 = cvlVar;
                        i2m i2mVar22 = (i2m) jyrVar.getValue();
                        lxs lxsVar22 = lxs.b;
                        fqkVar.j = str2;
                        fqkVar.k = yqkVar2;
                        fqkVar.l = j43Var2;
                        fqkVar.m = cvlVar2;
                        fqkVar.t = 3;
                        obj = i2mVar22.h(str2, lxsVar22, fqkVar);
                        break;
                    case 3:
                        cvlVar2 = fqkVar.m;
                        j43Var2 = fqkVar.l;
                        yqkVar2 = fqkVar.k;
                        str2 = fqkVar.j;
                        qgg.h0(obj);
                        List list5 = (List) obj;
                        nvl nvlVar2 = new nvl(str2, "-14");
                        rtl b2 = ac0Var.b();
                        fqkVar.j = str2;
                        fqkVar.k = yqkVar2;
                        fqkVar.l = j43Var2;
                        fqkVar.m = cvlVar2;
                        fqkVar.n = list5;
                        fqkVar.t = 4;
                        Object d2 = b2.d(str2, nvlVar2, false, fqkVar);
                        if (d2 != obj2) {
                            j43 j43Var8 = j43Var2;
                            cvlVar3 = cvlVar2;
                            list = list5;
                            obj = d2;
                            yqkVar3 = yqkVar2;
                            j43Var4 = j43Var8;
                            cvlVar4 = (cvl) obj;
                            if (cvlVar4 == null) {
                                fqkVar.j = str2;
                                fqkVar.k = yqkVar3;
                                fqkVar.l = j43Var4;
                                fqkVar.m = cvlVar3;
                                fqkVar.n = list;
                                fqkVar.t = 5;
                                obj = t(str2, str2, fqkVar);
                                break;
                            }
                            cvl cvlVar10 = cvlVar3;
                            list2 = list;
                            cvlVar5 = cvlVar4;
                            i2m i2mVar3 = (i2m) jyrVar.getValue();
                            lxs lxsVar3 = lxs.c;
                            fqkVar.j = null;
                            fqkVar.k = yqkVar3;
                            fqkVar.l = j43Var4;
                            fqkVar.m = cvlVar10;
                            fqkVar.n = list2;
                            fqkVar.o = cvlVar5;
                            fqkVar.t = 6;
                            h = i2mVar3.h(str2, lxsVar3, fqkVar);
                            if (h != obj2) {
                                j43Var5 = j43Var4;
                                cvlVar6 = cvlVar10;
                                obj = h;
                                yqkVar4 = yqkVar3;
                                List list6 = (List) obj;
                                fqkVar.j = null;
                                fqkVar.k = yqkVar4;
                                fqkVar.l = j43Var5;
                                fqkVar.m = cvlVar6;
                                fqkVar.n = list2;
                                fqkVar.o = cvlVar5;
                                fqkVar.p = list6;
                                fqkVar.t = 7;
                                f = yqkVar4.f(j43Var5, fqkVar);
                                if (f != obj2) {
                                    cvl cvlVar11 = cvlVar6;
                                    cvlVar7 = cvlVar5;
                                    cvlVar8 = cvlVar11;
                                    list3 = list2;
                                    list4 = list6;
                                    obj = f;
                                    Integer num2 = (Integer) obj;
                                    fqkVar.j = null;
                                    fqkVar.k = null;
                                    fqkVar.l = null;
                                    fqkVar.m = cvlVar8;
                                    fqkVar.n = list3;
                                    fqkVar.o = cvlVar7;
                                    fqkVar.p = list4;
                                    fqkVar.q = num2;
                                    fqkVar.t = 8;
                                    d = yqkVar4.d(j43Var5, fqkVar);
                                    if (d != obj2) {
                                        num = num2;
                                        obj = d;
                                        cvlVar9 = cvlVar8;
                                        return new g63(num, (Boolean) obj, new u2m(cvlVar9, list3), new u2m(cvlVar7, list4), cvlVar9.g);
                                    }
                                }
                            }
                        }
                        return obj2;
                    case 4:
                        list = fqkVar.n;
                        cvlVar3 = fqkVar.m;
                        j43Var4 = fqkVar.l;
                        yqkVar3 = fqkVar.k;
                        str2 = fqkVar.j;
                        qgg.h0(obj);
                        cvlVar4 = (cvl) obj;
                        if (cvlVar4 == null) {
                        }
                        cvl cvlVar102 = cvlVar3;
                        list2 = list;
                        cvlVar5 = cvlVar4;
                        i2m i2mVar32 = (i2m) jyrVar.getValue();
                        lxs lxsVar32 = lxs.c;
                        fqkVar.j = null;
                        fqkVar.k = yqkVar3;
                        fqkVar.l = j43Var4;
                        fqkVar.m = cvlVar102;
                        fqkVar.n = list2;
                        fqkVar.o = cvlVar5;
                        fqkVar.t = 6;
                        h = i2mVar32.h(str2, lxsVar32, fqkVar);
                        if (h != obj2) {
                        }
                        return obj2;
                    case 5:
                        list = fqkVar.n;
                        cvlVar3 = fqkVar.m;
                        j43Var4 = fqkVar.l;
                        yqkVar3 = fqkVar.k;
                        str2 = fqkVar.j;
                        qgg.h0(obj);
                        cvlVar4 = (cvl) obj;
                        cvl cvlVar1022 = cvlVar3;
                        list2 = list;
                        cvlVar5 = cvlVar4;
                        i2m i2mVar322 = (i2m) jyrVar.getValue();
                        lxs lxsVar322 = lxs.c;
                        fqkVar.j = null;
                        fqkVar.k = yqkVar3;
                        fqkVar.l = j43Var4;
                        fqkVar.m = cvlVar1022;
                        fqkVar.n = list2;
                        fqkVar.o = cvlVar5;
                        fqkVar.t = 6;
                        h = i2mVar322.h(str2, lxsVar322, fqkVar);
                        if (h != obj2) {
                        }
                        return obj2;
                    case 6:
                        cvlVar5 = fqkVar.o;
                        list2 = fqkVar.n;
                        cvlVar6 = fqkVar.m;
                        j43 j43Var9 = fqkVar.l;
                        yqk yqkVar5 = fqkVar.k;
                        qgg.h0(obj);
                        yqkVar4 = yqkVar5;
                        j43Var5 = j43Var9;
                        List list62 = (List) obj;
                        fqkVar.j = null;
                        fqkVar.k = yqkVar4;
                        fqkVar.l = j43Var5;
                        fqkVar.m = cvlVar6;
                        fqkVar.n = list2;
                        fqkVar.o = cvlVar5;
                        fqkVar.p = list62;
                        fqkVar.t = 7;
                        f = yqkVar4.f(j43Var5, fqkVar);
                        if (f != obj2) {
                        }
                        return obj2;
                    case 7:
                        List list7 = fqkVar.p;
                        cvl cvlVar12 = fqkVar.o;
                        List list8 = fqkVar.n;
                        cvl cvlVar13 = fqkVar.m;
                        j43Var5 = fqkVar.l;
                        yqkVar4 = fqkVar.k;
                        qgg.h0(obj);
                        list4 = list7;
                        cvlVar8 = cvlVar13;
                        list3 = list8;
                        cvlVar7 = cvlVar12;
                        Integer num22 = (Integer) obj;
                        fqkVar.j = null;
                        fqkVar.k = null;
                        fqkVar.l = null;
                        fqkVar.m = cvlVar8;
                        fqkVar.n = list3;
                        fqkVar.o = cvlVar7;
                        fqkVar.p = list4;
                        fqkVar.q = num22;
                        fqkVar.t = 8;
                        d = yqkVar4.d(j43Var5, fqkVar);
                        if (d != obj2) {
                        }
                        return obj2;
                    case 8:
                        Integer num3 = fqkVar.q;
                        list4 = fqkVar.p;
                        cvlVar7 = fqkVar.o;
                        list3 = fqkVar.n;
                        cvlVar9 = fqkVar.m;
                        qgg.h0(obj);
                        num = num3;
                        return new g63(num, (Boolean) obj, new u2m(cvlVar9, list3), new u2m(cvlVar7, list4), cvlVar9.g);
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        fqkVar = new fqk(this, cg6Var);
        Object obj3 = fqkVar.r;
        Object obj22 = nm6.a;
        switch (fqkVar.t) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(String str, yqk yqkVar, k43 k43Var, cg6 cg6Var) {
        gqk gqkVar;
        nm6 nm6Var;
        int i;
        List list;
        Object f;
        yqk yqkVar2;
        List list2;
        Object d;
        List list3;
        Integer num;
        if (cg6Var instanceof gqk) {
            gqkVar = (gqk) cg6Var;
            int i2 = gqkVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gqkVar.q = i2 - Integer.MIN_VALUE;
                Object obj = gqkVar.o;
                nm6Var = nm6.a;
                i = gqkVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    p3u p3uVar = (p3u) ((ac0) this.b).l.getValue();
                    gqkVar.j = yqkVar;
                    gqkVar.k = k43Var;
                    gqkVar.q = 1;
                    obj = ((b4u) p3uVar).e(str, gqkVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            num = gqkVar.n;
                            list2 = gqkVar.m;
                            list3 = gqkVar.l;
                            qgg.h0(obj);
                            return new h63(num, (Boolean) obj, list3, list2);
                        }
                        List list4 = gqkVar.m;
                        List list5 = gqkVar.l;
                        k43Var = gqkVar.k;
                        yqkVar2 = gqkVar.j;
                        qgg.h0(obj);
                        list2 = list4;
                        list = list5;
                        Integer num2 = (Integer) obj;
                        gqkVar.j = null;
                        gqkVar.k = null;
                        gqkVar.l = list;
                        gqkVar.m = list2;
                        gqkVar.n = num2;
                        gqkVar.q = 3;
                        d = yqkVar2.d(k43Var, gqkVar);
                        if (d != nm6Var) {
                            list3 = list;
                            num = num2;
                            obj = d;
                            return new h63(num, (Boolean) obj, list3, list2);
                        }
                        return nm6Var;
                    }
                    k43Var = gqkVar.k;
                    yqkVar = gqkVar.j;
                    qgg.h0(obj);
                }
                s4u s4uVar = (s4u) obj;
                list = s4uVar.a;
                List list6 = s4uVar.b;
                gqkVar.j = yqkVar;
                gqkVar.k = k43Var;
                gqkVar.l = list;
                gqkVar.m = list6;
                gqkVar.q = 2;
                f = yqkVar.f(k43Var, gqkVar);
                if (f != nm6Var) {
                    yqkVar2 = yqkVar;
                    list2 = list6;
                    obj = f;
                    Integer num22 = (Integer) obj;
                    gqkVar.j = null;
                    gqkVar.k = null;
                    gqkVar.l = list;
                    gqkVar.m = list2;
                    gqkVar.n = num22;
                    gqkVar.q = 3;
                    d = yqkVar2.d(k43Var, gqkVar);
                    if (d != nm6Var) {
                    }
                }
                return nm6Var;
            }
        }
        gqkVar = new gqk(this, cg6Var);
        Object obj2 = gqkVar.o;
        nm6Var = nm6.a;
        i = gqkVar.q;
        if (i != 0) {
        }
        s4u s4uVar2 = (s4u) obj2;
        list = s4uVar2.a;
        List list62 = s4uVar2.b;
        gqkVar.j = yqkVar;
        gqkVar.k = k43Var;
        gqkVar.l = list;
        gqkVar.m = list62;
        gqkVar.q = 2;
        f = yqkVar.f(k43Var, gqkVar);
        if (f != nm6Var) {
        }
        return nm6Var;
    }

    @Override // defpackage.tjp
    public qgr O() {
        return ((oxj) this.c).c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x01a1 -> B:12:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object P(String str, yqk yqkVar, cg6 cg6Var) {
        hqk hqkVar;
        int i;
        int i2;
        Collection collection;
        Serializable g;
        yqk yqkVar2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        ArrayList arrayList2;
        nvl nvlVar;
        int i5;
        cvl cvlVar;
        yqk yqkVar3;
        ArrayList arrayList3;
        int i6;
        String str2;
        Iterator it2;
        int i7;
        int i8;
        int i9;
        ac0 ac0Var;
        Object f;
        String str3 = str;
        ac0 ac0Var2 = (ac0) this.b;
        if (cg6Var instanceof hqk) {
            hqkVar = (hqk) cg6Var;
            int i10 = hqkVar.y;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hqkVar.y = i10 - Integer.MIN_VALUE;
                Object obj = hqkVar.w;
                nm6 nm6Var = nm6.a;
                i = hqkVar.y;
                if (i != 0) {
                    i2 = 0;
                    collection = null;
                    qgg.h0(obj);
                    rtl b = ac0Var2.b();
                    hqkVar.j = str3;
                    hqkVar.k = yqkVar;
                    hqkVar.y = 1;
                    g = b.g(str3, Integer.MAX_VALUE, hqkVar);
                    if (g != nm6Var) {
                        obj = g;
                        yqkVar2 = yqkVar;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    i2 = 0;
                    collection = null;
                    yqkVar2 = hqkVar.k;
                    str3 = hqkVar.j;
                    qgg.h0(obj);
                } else {
                    if (i == 2) {
                        i8 = hqkVar.v;
                        i7 = hqkVar.u;
                        int i11 = hqkVar.t;
                        int i12 = hqkVar.s;
                        int i13 = hqkVar.r;
                        ?? r10 = (Collection) hqkVar.p;
                        nvl nvlVar2 = hqkVar.o;
                        cvlVar = hqkVar.n;
                        Iterator it3 = hqkVar.m;
                        Collection collection2 = hqkVar.l;
                        yqk yqkVar4 = hqkVar.k;
                        String str4 = hqkVar.j;
                        qgg.h0(obj);
                        str2 = str4;
                        i9 = i11;
                        it2 = it3;
                        i5 = i13;
                        i6 = i12;
                        arrayList2 = r10;
                        arrayList3 = collection2;
                        nvlVar = nvlVar2;
                        yqkVar3 = yqkVar4;
                        Boolean bool = (Boolean) obj;
                        i2m i2mVar = (i2m) ac0Var2.j.getValue();
                        nvl g2 = cvlVar.g();
                        hqkVar.j = str2;
                        hqkVar.k = yqkVar3;
                        ac0Var = ac0Var2;
                        hqkVar.l = arrayList3;
                        hqkVar.m = it2;
                        hqkVar.n = null;
                        hqkVar.o = nvlVar;
                        hqkVar.p = bool;
                        hqkVar.q = arrayList2;
                        hqkVar.r = i5;
                        hqkVar.s = i6;
                        hqkVar.t = i9;
                        hqkVar.u = i7;
                        hqkVar.v = i8;
                        hqkVar.y = 3;
                        f = i2mVar.f(str2, g2, hqkVar);
                        if (f != nm6Var) {
                        }
                        return nm6Var;
                    }
                    if (i != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i8 = hqkVar.v;
                    int i14 = hqkVar.u;
                    i6 = hqkVar.s;
                    int i15 = hqkVar.r;
                    Collection collection3 = hqkVar.q;
                    Boolean bool2 = (Boolean) hqkVar.p;
                    nvl nvlVar3 = hqkVar.o;
                    Iterator it4 = hqkVar.m;
                    Collection collection4 = hqkVar.l;
                    yqkVar3 = hqkVar.k;
                    str2 = hqkVar.j;
                    qgg.h0(obj);
                    ac0Var = ac0Var2;
                    int i16 = i14;
                    it = it4;
                    i3 = i15;
                    Boolean bool3 = bool2;
                    nvl nvlVar4 = nvlVar3;
                    ArrayList arrayList4 = collection4;
                    int i17 = i8;
                    str3 = str2;
                    i4 = i6;
                    collection3.add(new szj(nvlVar4, i17, i16, bool3, (List) obj));
                    arrayList = arrayList4;
                    yqkVar2 = yqkVar3;
                    ac0Var2 = ac0Var;
                    i2 = 0;
                    collection = null;
                    if (!it.hasNext()) {
                        cvlVar = (cvl) it.next();
                        nvl g3 = cvlVar.g();
                        int i18 = cvlVar.e;
                        int i19 = cvlVar.d;
                        nvl g4 = cvlVar.g();
                        hqkVar.j = str3;
                        hqkVar.k = yqkVar2;
                        hqkVar.l = arrayList;
                        hqkVar.m = it;
                        hqkVar.n = cvlVar;
                        hqkVar.o = g3;
                        hqkVar.p = arrayList;
                        hqkVar.q = collection;
                        hqkVar.r = i3;
                        hqkVar.s = i4;
                        int i20 = i2;
                        hqkVar.t = i20;
                        hqkVar.u = i19;
                        hqkVar.v = i18;
                        hqkVar.y = 2;
                        Object e = yqkVar2.e(g4, hqkVar);
                        if (e != nm6Var) {
                            arrayList2 = arrayList;
                            obj = e;
                            i5 = i3;
                            it2 = it;
                            i7 = i19;
                            yqkVar3 = yqkVar2;
                            i9 = i20;
                            nvlVar = g3;
                            i6 = i4;
                            str2 = str3;
                            i8 = i18;
                            arrayList3 = arrayList2;
                            Boolean bool4 = (Boolean) obj;
                            i2m i2mVar2 = (i2m) ac0Var2.j.getValue();
                            nvl g22 = cvlVar.g();
                            hqkVar.j = str2;
                            hqkVar.k = yqkVar3;
                            ac0Var = ac0Var2;
                            hqkVar.l = arrayList3;
                            hqkVar.m = it2;
                            hqkVar.n = null;
                            hqkVar.o = nvlVar;
                            hqkVar.p = bool4;
                            hqkVar.q = arrayList2;
                            hqkVar.r = i5;
                            hqkVar.s = i6;
                            hqkVar.t = i9;
                            hqkVar.u = i7;
                            hqkVar.v = i8;
                            hqkVar.y = 3;
                            f = i2mVar2.f(str2, g22, hqkVar);
                            if (f != nm6Var) {
                                bool3 = bool4;
                                obj = f;
                                i16 = i7;
                                it = it2;
                                i3 = i5;
                                nvlVar4 = nvlVar;
                                collection3 = arrayList2;
                                arrayList4 = arrayList3;
                                int i172 = i8;
                                str3 = str2;
                                i4 = i6;
                                collection3.add(new szj(nvlVar4, i172, i16, bool3, (List) obj));
                                arrayList = arrayList4;
                                yqkVar2 = yqkVar3;
                                ac0Var2 = ac0Var;
                                i2 = 0;
                                collection = null;
                                if (!it.hasNext()) {
                                    return new i63(arrayList);
                                }
                            }
                        }
                        return nm6Var;
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    byr[] byrVarArr = new byr[2];
                    byrVarArr[i2] = wxr.b;
                    byrVarArr[1] = xxr.b;
                    if (!xz0.Y(byrVarArr).contains(((cvl) obj2).l)) {
                        arrayList5.add(obj2);
                    }
                }
                arrayList = new ArrayList(v75.o(arrayList5, 10));
                it = arrayList5.iterator();
                i3 = i2;
                i4 = i3;
                if (!it.hasNext()) {
                }
            }
        }
        hqkVar = new hqk(this, cg6Var);
        Object obj3 = hqkVar.w;
        nm6 nm6Var2 = nm6.a;
        i = hqkVar.y;
        if (i != 0) {
        }
        ArrayList arrayList52 = new ArrayList();
        while (r2.hasNext()) {
        }
        arrayList = new ArrayList(v75.o(arrayList52, 10));
        it = arrayList52.iterator();
        i3 = i2;
        i4 = i3;
        if (!it.hasNext()) {
        }
    }

    @Override // defpackage.tjp
    public void Q(sgr sgrVar, s2i s2iVar) {
        try {
            synchronized (((oxj) this.c)) {
                oxj oxjVar = (oxj) this.c;
                if (oxjVar.m == null) {
                    o2g.V(oxjVar.n == null);
                    oxjVar.m = sgrVar;
                    oxjVar.n = s2iVar;
                    oxjVar.e = true;
                    oxjVar.h = true;
                    oxjVar.c();
                }
            }
            synchronized (((uhe) this.b)) {
                uhe uheVar = (uhe) this.b;
                vhe vheVar = uheVar.n;
                vhe vheVar2 = vhe.f;
                if (vheVar != vheVar2) {
                    uheVar.g(vheVar2);
                    uheVar.e.g(sgrVar);
                    ((ujp) uheVar.f).s(sgr.e);
                }
            }
        } catch (tgr e) {
            synchronized (((uhe) this.b)) {
                uhe uheVar2 = (uhe) this.b;
                sgr sgrVar2 = e.a;
                uheVar2.b(sgrVar2, sgrVar2, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058 A[LOOP:0: B:11:0x0052->B:13:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object R(String str, cg6 cg6Var) {
        iqk iqkVar;
        int i;
        Iterator it;
        if (cg6Var instanceof iqk) {
            iqkVar = (iqk) cg6Var;
            int i2 = iqkVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iqkVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iqkVar.j;
                Object obj2 = nm6.a;
                i = iqkVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    fkm fkmVar = (fkm) ((ac0) this.b).k.getValue();
                    iqkVar.l = 1;
                    obj = fkmVar.d(str, null, iqkVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                HashSet hashSet = new HashSet();
                it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    hashSet.add(((kjm) it.next()).b);
                }
                return new j63(hashSet);
            }
        }
        iqkVar = new iqk(this, cg6Var);
        Object obj3 = iqkVar.j;
        Object obj22 = nm6.a;
        i = iqkVar.l;
        if (i != 0) {
        }
        HashSet hashSet2 = new HashSet();
        it = ((Iterable) obj3).iterator();
        while (it.hasNext()) {
        }
        return new j63(hashSet2);
    }

    public void S(String str, Exception exc) {
        weo.s("Reporter", exc, str, new Object[0]);
        b4i b4iVar = (b4i) this.b;
        if (b4iVar == null) {
            return;
        }
        b4iVar.reportError(((String) this.d) + str, exc);
    }

    public void T(String str, JsonObject jsonObject) {
        HashMap hashMap;
        if (((b4i) this.b) == null) {
            return;
        }
        synchronized (this) {
            hashMap = new HashMap((HashMap) this.c);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof JsonElement) {
                jsonObject.r((String) entry.getKey(), (JsonElement) value);
            } else {
                jsonObject.u((String) entry.getKey(), value.toString());
            }
        }
        ((b4i) this.b).reportEvent(su4.o(new StringBuilder(), (String) this.d, str), jsonObject.toString());
    }

    public void U(List list) {
        o2g.J("addrs is empty", !list.isEmpty());
        this.b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void V(Object obj, String str) {
        synchronized (this) {
            ((HashMap) this.c).put(str, obj);
        }
    }

    public ArrayList W(JSONArray jSONArray, tjl tjlVar) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj == null ? true : obj.equals(JSONObject.NULL)) {
                arrayList.add(null);
            } else if (obj instanceof JSONObject) {
                arrayList.add(new z7o(Y((JSONObject) obj, tjlVar)));
            } else if (obj instanceof JSONArray) {
                arrayList.add(W((JSONArray) obj, tjlVar));
            } else if (!(obj instanceof String)) {
                arrayList.add(obj);
            } else if (StringsKt.M((CharSequence) obj, "@{", false)) {
                String o = hrg.o("[", i, ']');
                ox8 ox8Var = qx8.a;
                arrayList.add(qx8.b((String) obj, o, nx8.STRING, (y7k) this.d).a((xzb) this.c));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public Serializable Y(JSONObject jSONObject, tjl tjlVar) {
        Object t7oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt == null ? true : opt.equals(JSONObject.NULL)) {
                linkedHashMap.put(next, null);
            } else if (opt instanceof JSONObject) {
                Serializable Y = Y((JSONObject) opt, tjlVar);
                Throwable a = z7o.a(Y);
                if (a != null) {
                    return new t7o(new RuntimeException("Nested JSON object evaluation failed (key: '" + next + "', json: '" + opt + "')!", a));
                }
                qgg.h0(Y);
                linkedHashMap.put(next, Y);
            } else if (opt instanceof JSONArray) {
                linkedHashMap.put(next, W((JSONArray) opt, tjlVar));
            } else if (!(opt instanceof String)) {
                linkedHashMap.put(next, opt);
            } else if (StringsKt.M((CharSequence) opt, "@{", false)) {
                try {
                    r7o r7oVar = z7o.b;
                    tjlVar.getClass();
                    t7oVar = nx8.STRING;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    return new t7o(new RuntimeException("Type resolving failed for key '" + next + "' of object '" + jSONObject + '\'', a2));
                }
                qgg.h0(t7oVar);
                ox8 ox8Var = qx8.a;
                linkedHashMap.put(next, qx8.b((String) opt, next, (nx8) t7oVar, (y7k) this.d).a((xzb) this.c));
            } else {
                linkedHashMap.put(next, opt);
            }
        }
        r7o r7oVar3 = z7o.b;
        return linkedHashMap;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|(1:(1:(1:(1:(1:(6:13|14|15|(3:17|(1:19)|20)(1:24)|21|22)(2:29|30))(6:31|32|33|(1:35)(3:38|(1:40)|41)|36|37))(8:46|47|48|49|50|51|(6:53|32|33|(0)(0)|36|37)|54))(6:68|69|70|71|72|73))(1:81))(3:97|(1:99)|54)|82|83|(1:85)|86|87|88|89|(3:91|72|73)|54))|100|6|(0)(0)|82|83|(0)|86|87|88|89|(0)|54|(2:(0)|(1:65))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0147, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0109, code lost:
    
        if (r0 != r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x016f A[Catch: all -> 0x017c, TryCatch #6 {all -> 0x017c, blocks: (B:15:0x0169, B:17:0x016f, B:19:0x0175, B:20:0x0178, B:24:0x017e), top: B:14:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x017e A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #6 {all -> 0x017c, blocks: (B:15:0x0169, B:17:0x016f, B:19:0x0175, B:20:0x0178, B:24:0x017e), top: B:14:0x0169 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:33:0x0126, B:35:0x012c, B:38:0x0133, B:40:0x0139, B:41:0x013c), top: B:32:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:33:0x0126, B:35:0x012c, B:38:0x0133, B:40:0x0139, B:41:0x013c), top: B:32:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00cf A[Catch: all -> 0x00d7, TryCatch #2 {all -> 0x00d7, blocks: (B:83:0x00c1, B:85:0x00cf, B:86:0x00da), top: B:82:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Z(String str, Function1 function1, cg6 cg6Var) {
        xbf xbfVar;
        nm6 nm6Var;
        int i;
        Function1 function12;
        String str2;
        qqi qqiVar;
        Object g;
        oqi oqiVar;
        Function1 function13;
        oqi oqiVar2;
        int i2;
        String str3;
        Throwable th;
        String str4;
        Object obj;
        String str5;
        int e;
        int e2;
        tpi tpiVar = (tpi) this.c;
        qqi qqiVar2 = (qqi) this.b;
        cpi cpiVar = (cpi) this.d;
        try {
            if (cg6Var instanceof xbf) {
                xbfVar = (xbf) cg6Var;
                int i3 = xbfVar.r;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    xbfVar.r = i3 - Integer.MIN_VALUE;
                    Object obj2 = xbfVar.p;
                    nm6Var = nm6.a;
                    i = xbfVar.r;
                    if (i != 0) {
                        qgg.h0(obj2);
                        xbfVar.j = str;
                        function12 = function1;
                        xbfVar.k = function12;
                        xbfVar.l = qqiVar2;
                        xbfVar.o = 0;
                        xbfVar.r = 1;
                        if (qqiVar2.a(xbfVar) != nm6Var) {
                            str2 = str;
                            qqiVar = qqiVar2;
                        }
                        return nm6Var;
                    }
                    if (i == 1) {
                        qqi qqiVar3 = xbfVar.l;
                        Function1 function14 = xbfVar.k;
                        str2 = xbfVar.j;
                        qgg.h0(obj2);
                        qqiVar = qqiVar3;
                        function12 = function14;
                    } else {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    qqiVar2 = xbfVar.n;
                                    obj = xbfVar.m;
                                    Function1 function15 = xbfVar.k;
                                    str5 = xbfVar.j;
                                    qgg.h0(obj2);
                                    try {
                                        e = cpiVar.e(str5);
                                        if (e <= 1) {
                                            cpiVar.i(e - 1, str5);
                                        } else {
                                            int d = cpiVar.d(str5);
                                            if (d >= 0) {
                                                cpiVar.h(d);
                                            }
                                            tpiVar.k(str5);
                                        }
                                        return obj;
                                    } finally {
                                        qqiVar2.b(null);
                                    }
                                }
                                if (i != 5) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qqiVar2 = xbfVar.n;
                                th = (Throwable) xbfVar.m;
                                Function1 function16 = xbfVar.k;
                                str4 = xbfVar.j;
                                qgg.h0(obj2);
                                try {
                                    e2 = cpiVar.e(str4);
                                    if (e2 > 1) {
                                        int d2 = cpiVar.d(str4);
                                        if (d2 >= 0) {
                                            cpiVar.h(d2);
                                        }
                                        tpiVar.k(str4);
                                    } else {
                                        cpiVar.i(e2 - 1, str4);
                                    }
                                    throw th;
                                } finally {
                                    qqiVar2.b(null);
                                }
                            }
                            oqiVar2 = (oqi) xbfVar.m;
                            Function1 function17 = xbfVar.k;
                            str3 = xbfVar.j;
                            try {
                                qgg.h0(obj2);
                                str2 = str3;
                                oqiVar2.b(null);
                                xbfVar.j = str2;
                                xbfVar.k = null;
                                xbfVar.l = null;
                                xbfVar.m = obj2;
                                xbfVar.n = qqiVar2;
                                xbfVar.o = 0;
                                xbfVar.r = 4;
                                if (qqiVar2.a(xbfVar) != nm6Var) {
                                    obj = obj2;
                                    str5 = str2;
                                    e = cpiVar.e(str5);
                                    if (e <= 1) {
                                    }
                                    return obj;
                                }
                                return nm6Var;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    oqiVar2.b(null);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str2 = str3;
                                    xbfVar.j = str2;
                                    xbfVar.k = null;
                                    xbfVar.l = null;
                                    xbfVar.m = th;
                                    xbfVar.n = qqiVar2;
                                    xbfVar.o = 0;
                                    xbfVar.r = 5;
                                    if (qqiVar2.a(xbfVar) != nm6Var) {
                                    }
                                    return nm6Var;
                                }
                            }
                        }
                        int i4 = xbfVar.o;
                        oqi oqiVar3 = (oqi) xbfVar.m;
                        Function1 function18 = xbfVar.k;
                        String str6 = xbfVar.j;
                        try {
                            qgg.h0(obj2);
                            str2 = str6;
                            function13 = function18;
                            i2 = i4;
                            oqiVar2 = oqiVar3;
                            try {
                                xbfVar.j = str2;
                                xbfVar.k = null;
                                xbfVar.l = null;
                                xbfVar.m = oqiVar2;
                                xbfVar.o = i2;
                                xbfVar.r = 3;
                                obj2 = function13.invoke(xbfVar);
                            } catch (Throwable th4) {
                                th = th4;
                                str3 = str2;
                                oqiVar2.b(null);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            str2 = str6;
                            xbfVar.j = str2;
                            xbfVar.k = null;
                            xbfVar.l = null;
                            xbfVar.m = th;
                            xbfVar.n = qqiVar2;
                            xbfVar.o = 0;
                            xbfVar.r = 5;
                            if (qqiVar2.a(xbfVar) != nm6Var) {
                                th = th;
                                str4 = str2;
                                e2 = cpiVar.e(str4);
                                if (e2 > 1) {
                                }
                                throw th;
                            }
                            return nm6Var;
                        }
                    }
                    cpiVar.i(cpiVar.f(0, str2) + 1, str2);
                    g = tpiVar.g(str2);
                    if (g == null) {
                        g = rqi.a();
                        tpiVar.m(str2, g);
                    }
                    oqiVar = (oqi) g;
                    qqiVar.b(null);
                    xbfVar.j = str2;
                    xbfVar.k = function12;
                    xbfVar.l = null;
                    xbfVar.m = oqiVar;
                    xbfVar.o = 0;
                    xbfVar.r = 2;
                    if (oqiVar.a(xbfVar) != nm6Var) {
                        function13 = function12;
                        oqiVar2 = oqiVar;
                        i2 = 0;
                        xbfVar.j = str2;
                        xbfVar.k = null;
                        xbfVar.l = null;
                        xbfVar.m = oqiVar2;
                        xbfVar.o = i2;
                        xbfVar.r = 3;
                        obj2 = function13.invoke(xbfVar);
                    }
                    return nm6Var;
                }
            }
            cpiVar.i(cpiVar.f(0, str2) + 1, str2);
            g = tpiVar.g(str2);
            if (g == null) {
            }
            oqiVar = (oqi) g;
            qqiVar.b(null);
            xbfVar.j = str2;
            xbfVar.k = function12;
            xbfVar.l = null;
            xbfVar.m = oqiVar;
            xbfVar.o = 0;
            xbfVar.r = 2;
            if (oqiVar.a(xbfVar) != nm6Var) {
            }
            return nm6Var;
        } finally {
            qqiVar.b(null);
        }
        xbfVar = new xbf(this, cg6Var);
        Object obj22 = xbfVar.p;
        nm6Var = nm6.a;
        i = xbfVar.r;
        if (i != 0) {
        }
    }

    @Override // defpackage.bjr
    public void a() {
        synchronized (((uhe) this.b)) {
            uhe uheVar = (uhe) this.b;
            uheVar.p++;
            uheVar.c();
        }
    }

    @Override // defpackage.w8p
    public void b(d7k d7kVar) {
        long d;
        long j;
        vq1.B((ojs) this.c);
        int i = dvt.a;
        ojs ojsVar = (ojs) this.c;
        synchronized (ojsVar) {
            try {
                long j2 = ojsVar.c;
                d = j2 != -9223372036854775807L ? j2 + ojsVar.b : ojsVar.d();
            } finally {
            }
        }
        ojs ojsVar2 = (ojs) this.c;
        synchronized (ojsVar2) {
            j = ojsVar2.b;
        }
        if (d == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        dsc dscVar = (dsc) this.b;
        if (j != dscVar.s) {
            bsc a = dscVar.a();
            a.r = j;
            dsc dscVar2 = new dsc(a);
            this.b = dscVar2;
            ((azs) this.d).d(dscVar2);
        }
        int a2 = d7kVar.a();
        ((azs) this.d).b(d7kVar, a2, 0);
        ((azs) this.d).a(d, 1, a2, 0, null);
    }

    @Override // defpackage.tjp
    public String b0() {
        xu1 xu1Var = (xu1) this.d;
        return (String) xu1Var.a.get(y13.p);
    }

    @Override // defpackage.yxk
    public Object c(foc focVar) {
        focVar.getClass();
        ((Function0) this.c).invoke();
        return Unit.a;
    }

    @Override // defpackage.rzb
    public jxt d(Map map) {
        return ((n03) this.d).B(((rzb) this.b).d(map), ((rzb) this.c).d(map));
    }

    @Override // defpackage.tjp
    public void d0(s2i s2iVar) {
        try {
            synchronized (((oxj) this.c)) {
                oxj oxjVar = (oxj) this.c;
                oxjVar.l = s2iVar;
                oxjVar.e = true;
                oxjVar.c();
            }
        } catch (tgr e) {
            synchronized (((uhe) this.b)) {
                uhe uheVar = (uhe) this.b;
                sgr sgrVar = e.a;
                uheVar.b(sgrVar, sgrVar, false);
            }
        }
    }

    @Override // defpackage.w8p
    public void e(ojs ojsVar, t2c t2cVar, cp2 cp2Var) {
        this.c = ojsVar;
        cp2Var.g();
        cp2Var.i();
        azs M = t2cVar.M(cp2Var.c, 5);
        this.d = M;
        M.d((dsc) this.b);
    }

    @Override // defpackage.tjp
    public void f(sgr sgrVar) {
        synchronized (((uhe) this.b)) {
            ((uhe) this.b).b(sgr.f, sgrVar, false);
        }
    }

    @Override // defpackage.yxk
    public Object g(faq faqVar) {
        Function0 function0 = (Function0) this.c;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            naq naqVar = (naq) faqVar;
            uow uowVar = naqVar.d;
            if (sil.a[uowVar.b.ordinal()] == 1) {
                ((Function2) this.b).invoke(naqVar.e, q7g.I(uowVar));
            } else {
                function0.invoke();
            }
        } else if (faqVar instanceof saq) {
            ((Function1) this.d).invoke(((saq) faqVar).e);
        } else if (faqVar instanceof daq) {
            function0.invoke();
        } else {
            if (!(faqVar instanceof qaq)) {
                b6e.s();
                return null;
            }
            function0.invoke();
        }
        return Unit.a;
    }

    @Override // defpackage.tjp
    public xu1 getAttributes() {
        return (xu1) this.d;
    }

    @Override // defpackage.yxk
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        ((Function2) this.b).invoke(jzsVar.a, jzsVar.g);
        return Unit.a;
    }

    @Override // defpackage.yxk
    public Object i(m1q m1qVar) {
        Function0 function0 = (Function0) this.c;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            Function2 function2 = (Function2) this.b;
            mqs mqsVar = ((c2q) m1qVar).d;
            function2.invoke(mqsVar, y5g.B0(mqsVar, ryt.a));
        } else if (m1qVar instanceof j1q) {
            function0.invoke();
        } else {
            if (!(m1qVar instanceof e2q)) {
                b6e.s();
                return null;
            }
            function0.invoke();
        }
        return Unit.a;
    }

    @Override // defpackage.yxk
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        ((Function1) this.d).invoke(i5uVar.a);
        return Unit.a;
    }

    @Override // defpackage.yxk
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        ((Function0) this.c).invoke();
        return Unit.a;
    }

    @Override // defpackage.trm
    public byte[] m(int i, byte[] bArr) {
        byte[] b0;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipher = (Cipher) t7b.e.a("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.b);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        if (max * 16 == bArr.length) {
            b0 = h4a.a0((max - 1) * 16, 0, 16, bArr, (byte[]) this.c);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length);
            if (copyOfRange.length >= 16) {
                xq0.x("x must be smaller than a block.");
                return null;
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            b0 = h4a.b0(copyOf, (byte[]) this.d);
        }
        byte[] bArr2 = new byte[16];
        for (int i2 = 0; i2 < max - 1; i2++) {
            bArr2 = cipher.doFinal(h4a.a0(0, i2 * 16, 16, bArr2, bArr));
        }
        return Arrays.copyOf(cipher.doFinal(h4a.b0(b0, bArr2)), i);
    }

    public void o(beg begVar) {
        wvo wvoVar;
        int i = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.d;
            int length = objArr.length;
            wvoVar = ceg.d;
            if (i >= length) {
                i = -1;
                break;
            } else if (wvoVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, ((Object[][]) this.d).length + 1, 2);
            Object[][] objArr3 = (Object[][]) this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.d = objArr2;
            i = objArr2.length - 1;
        }
        ((Object[][]) this.d)[i] = new Object[]{wvoVar, begVar};
    }

    @Override // defpackage.bjr
    public boolean p() {
        return ((oxj) this.c).a.i();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    @Override // defpackage.gs3
    public Type s() {
        return (Type) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(String str, String str2, cg6 cg6Var) {
        ypk ypkVar;
        int i;
        cuk cukVar;
        String str3;
        String str4;
        String str5;
        String str6 = str2;
        if (cg6Var instanceof ypk) {
            ypkVar = (ypk) cg6Var;
            int i2 = ypkVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ypkVar.q = i2 - Integer.MIN_VALUE;
                Object obj = ypkVar.o;
                nm6 nm6Var = nm6.a;
                i = ypkVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    dfi.r("There is no dislikes playlist in database for " + str6, "PhonotekaSynchronizer");
                    cukVar = drt.e;
                    frt frtVar = (frt) this.d;
                    str3 = str;
                    ypkVar.j = str3;
                    ypkVar.k = "-14";
                    ypkVar.l = "disliked";
                    ypkVar.m = cukVar;
                    ypkVar.n = str6;
                    ypkVar.q = 1;
                    obj = frtVar.f(ypkVar);
                    if (obj != nm6Var) {
                        str4 = "disliked";
                        str5 = "-14";
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return obj;
                }
                str6 = ypkVar.n;
                cukVar = ypkVar.m;
                String str7 = ypkVar.l;
                String str8 = ypkVar.k;
                String str9 = ypkVar.j;
                qgg.h0(obj);
                str4 = str7;
                str5 = str8;
                str3 = str9;
                String str10 = ((xxq) obj).b;
                cukVar.getClass();
                str6.getClass();
                str10.getClass();
                cvl cvlVar = new cvl(str5, str4, cuk.B(str6, str10, ""), 0, -1, false, 0, 0, 0, 0L, 0L, yxr.b, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134215656);
                rtl b = ((ac0) this.b).b();
                ypkVar.j = null;
                ypkVar.k = null;
                ypkVar.l = null;
                ypkVar.m = null;
                ypkVar.n = null;
                ypkVar.q = 2;
                Serializable d = b.a.d(str3, cvlVar, false, ypkVar);
                return d != nm6Var ? nm6Var : d;
            }
        }
        ypkVar = new ypk(this, cg6Var);
        Object obj2 = ypkVar.o;
        nm6 nm6Var2 = nm6.a;
        i = ypkVar.q;
        if (i != 0) {
        }
        String str102 = ((xxq) obj2).b;
        cukVar.getClass();
        str6.getClass();
        str102.getClass();
        cvl cvlVar2 = new cvl(str5, str4, cuk.B(str6, str102, ""), 0, -1, false, 0, 0, 0, 0L, 0L, yxr.b, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134215656);
        rtl b2 = ((ac0) this.b).b();
        ypkVar.j = null;
        ypkVar.k = null;
        ypkVar.l = null;
        ypkVar.m = null;
        ypkVar.n = null;
        ypkVar.q = 2;
        Serializable d2 = b2.a.d(str3, cvlVar2, false, ypkVar);
        if (d2 != nm6Var2) {
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "MultiMessageServerStream[" + ((uhe) this.b) + "/" + ((oxj) this.c) + "]";
            default:
                return super.toString();
        }
    }

    public void u(Function1 function1) {
        Object value;
        mb5 mb5Var;
        xdr xdrVar = (xdr) this.c;
        do {
            value = xdrVar.getValue();
            mb5 mb5Var2 = (mb5) value;
            mb5Var = (mb5) function1.invoke(mb5Var2);
            if (Intrinsics.d(mb5Var2, mb5Var)) {
                return;
            }
        } while (!xdrVar.k(value, mb5Var));
        if (mb5Var != null) {
            Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(mb5Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(String str, String str2, cg6 cg6Var) {
        zpk zpkVar;
        int i;
        cuk cukVar;
        String str3;
        String str4;
        String str5;
        String str6 = str2;
        if (cg6Var instanceof zpk) {
            zpkVar = (zpk) cg6Var;
            int i2 = zpkVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zpkVar.q = i2 - Integer.MIN_VALUE;
                Object obj = zpkVar.o;
                nm6 nm6Var = nm6.a;
                i = zpkVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    Assertions.throwOrSkip("PhonotekaSynchronizer", new FailedAssertionException("There is no favourites playlist in database for " + str6));
                    String b = g3o.b(R.string.favorite_playlist_title);
                    b.getClass();
                    cukVar = drt.e;
                    frt frtVar = (frt) this.d;
                    str3 = str;
                    zpkVar.j = str3;
                    zpkVar.k = "3";
                    zpkVar.l = b;
                    zpkVar.m = cukVar;
                    zpkVar.n = str6;
                    zpkVar.q = 1;
                    Object f = frtVar.f(zpkVar);
                    if (f != nm6Var) {
                        str4 = b;
                        obj = f;
                        str5 = "3";
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    return obj;
                }
                str6 = zpkVar.n;
                cukVar = zpkVar.m;
                String str7 = zpkVar.l;
                String str8 = zpkVar.k;
                str3 = zpkVar.j;
                qgg.h0(obj);
                str4 = str7;
                str5 = str8;
                String str9 = ((xxq) obj).b;
                cukVar.getClass();
                str6.getClass();
                str9.getClass();
                cvl cvlVar = new cvl(str5, str4, cuk.B(str6, str9, ""), 0, -1, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217704);
                rtl b2 = ((ac0) this.b).b();
                zpkVar.j = null;
                zpkVar.k = null;
                zpkVar.l = null;
                zpkVar.m = null;
                zpkVar.n = null;
                zpkVar.q = 2;
                Serializable d = b2.a.d(str3, cvlVar, false, zpkVar);
                return d != nm6Var ? nm6Var : d;
            }
        }
        zpkVar = new zpk(this, cg6Var);
        Object obj2 = zpkVar.o;
        nm6 nm6Var2 = nm6.a;
        i = zpkVar.q;
        if (i != 0) {
        }
        String str92 = ((xxq) obj2).b;
        cukVar.getClass();
        str6.getClass();
        str92.getClass();
        cvl cvlVar2 = new cvl(str5, str4, cuk.B(str6, str92, ""), 0, -1, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217704);
        rtl b22 = ((ac0) this.b).b();
        zpkVar.j = null;
        zpkVar.k = null;
        zpkVar.l = null;
        zpkVar.m = null;
        zpkVar.n = null;
        zpkVar.q = 2;
        Serializable d2 = b22.a.d(str3, cvlVar2, false, zpkVar);
        if (d2 != nm6Var2) {
        }
    }

    public yc4 w(String str, String str2) {
        str.getClass();
        str2.getClass();
        nsl nslVar = (nsl) this.c;
        nslVar.getClass();
        return zsd.M0(((z66) nslVar.d.getValue()).c(), new i04((Continuation) null, nslVar, str, str2, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(String str, cg6 cg6Var) {
        hzl hzlVar;
        int i;
        rj6 rj6Var;
        if (cg6Var instanceof hzl) {
            hzlVar = (hzl) cg6Var;
            int i2 = hzlVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hzlVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hzlVar.j;
                nm6 nm6Var = nm6.a;
                i = hzlVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    jhq jhqVar = (jhq) ((jyr) this.d).getValue();
                    hzlVar.l = 1;
                    obj = jhqVar.b(str, hzlVar);
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
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return (List) ((qj6) rj6Var).a;
                }
                if (rj6Var instanceof pj6) {
                    return c5b.a;
                }
                b6e.s();
                return null;
            }
        }
        hzlVar = new hzl(this, cg6Var);
        Object obj2 = hzlVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hzlVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object y(cg6 cg6Var) {
        jug jugVar;
        int i;
        h hVar;
        if (cg6Var instanceof jug) {
            jugVar = (jug) cg6Var;
            int i2 = jugVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jugVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jugVar.k;
                nm6 nm6Var = nm6.a;
                i = jugVar.m;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(le7.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = r9k.PRODUCTION.a;
                    q qVar = h.b;
                    int parseInt = Integer.parseInt(str);
                    qVar.getClass();
                    h a = q.a(parseInt);
                    if (a == null) {
                        xq0.x("Required value was null.");
                        return null;
                    }
                    pjc g = ((iv0) ((av0) ((jyr) this.b).getValue())).a.g();
                    jugVar.j = a;
                    jugVar.m = 1;
                    Object g0 = zsd.g0(g, jugVar);
                    if (g0 == nm6Var) {
                        return nm6Var;
                    }
                    hVar = a;
                    obj = g0;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hVar = jugVar.j;
                    qgg.h0(obj);
                }
                z1 d = b.d(hVar, Long.parseLong(((xxq) obj).a));
                q0 q0Var = (q0) this.c;
                htg htgVar = new htg(d, i3);
                zh zhVar = q0Var.s;
                y1 y1Var = y1.a;
                j2 j2Var = new j2();
                q2 q2Var = q2.a;
                n2 n2Var = n2.a;
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                zhVar.a(new u(a.D(htgVar.b), !pd.M() ? y1.b : y1.a, null, true, new v(j2Var, q2Var, n2Var, true), e5bVar));
                return Unit.a;
            }
        }
        jugVar = new jug(this, cg6Var);
        Object obj2 = jugVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jugVar.m;
        int i32 = 1;
        if (i != 0) {
        }
        z1 d2 = b.d(hVar, Long.parseLong(((xxq) obj2).a));
        q0 q0Var2 = (q0) this.c;
        htg htgVar2 = new htg(d2, i32);
        zh zhVar2 = q0Var2.s;
        y1 y1Var2 = y1.a;
        j2 j2Var2 = new j2();
        q2 q2Var2 = q2.a;
        n2 n2Var2 = n2.a;
        e5b e5bVar2 = e5b.a;
        e5bVar2.getClass();
        zhVar2.a(new u(a.D(htgVar2.b), !pd.M() ? y1.b : y1.a, null, true, new v(j2Var2, q2Var2, n2Var2, true), e5bVar2));
        return Unit.a;
    }

    @Override // defpackage.gs3
    public Object z(foj fojVar) {
        Annotation[] annotationArr = (Annotation[]) this.c;
        whi whiVar = (whi) this.d;
        int length = annotationArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (annotationArr[i] instanceof v2j) {
                z = true;
                break;
            }
            i++;
        }
        return new ms3(fojVar, annotationArr, z, whiVar.b, whiVar.a);
    }

    @Override // defpackage.tjp
    public void z0(ujp ujpVar) {
        synchronized (((uhe) this.b)) {
            uhe uheVar = (uhe) this.b;
            oxj oxjVar = (oxj) this.c;
            uheVar.d = oxjVar;
            uheVar.e = oxjVar.c;
            uheVar.f = ujpVar;
            if (uheVar.n != vhe.f) {
                uheVar.g(vhe.b);
            }
        }
    }

    @Override // defpackage.bjr
    public void X() {
    }

    @Override // defpackage.bjr
    public void flush() {
    }

    @Override // defpackage.bjr
    public void r(nq4 nq4Var) {
    }

    public /* synthetic */ t1f(int i, boolean z) {
        this.a = i;
    }

    public t1f(lml lmlVar) {
        this.a = 25;
        this.b = lmlVar;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: pml
            public final /* synthetic */ t1f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        lml lmlVar2 = (lml) this.b.b;
                        nml nmlVar = new nml();
                        nmlVar.a(new mml(lmlVar2, 3));
                        return nmlVar;
                    default:
                        t1f t1fVar = this.b;
                        nml nmlVar2 = (nml) ((jyr) t1fVar.c).getValue();
                        bdt I = hag.I(oq7.class);
                        qdc qdcVar = nmlVar2.a;
                        qdcVar.getClass();
                        oq7 oq7Var = (oq7) qdcVar.C(I);
                        nml nmlVar3 = (nml) ((jyr) t1fVar.c).getValue();
                        bdt I2 = hag.I(l1g.class);
                        qdc qdcVar2 = nmlVar3.a;
                        qdcVar2.getClass();
                        return new eil(oq7Var, (l1g) qdcVar2.C(I2), new s8i(19, t1fVar));
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: pml
            public final /* synthetic */ t1f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        lml lmlVar2 = (lml) this.b.b;
                        nml nmlVar = new nml();
                        nmlVar.a(new mml(lmlVar2, 3));
                        return nmlVar;
                    default:
                        t1f t1fVar = this.b;
                        nml nmlVar2 = (nml) ((jyr) t1fVar.c).getValue();
                        bdt I = hag.I(oq7.class);
                        qdc qdcVar = nmlVar2.a;
                        qdcVar.getClass();
                        oq7 oq7Var = (oq7) qdcVar.C(I);
                        nml nmlVar3 = (nml) ((jyr) t1fVar.c).getValue();
                        bdt I2 = hag.I(l1g.class);
                        qdc qdcVar2 = nmlVar3.a;
                        qdcVar2.getClass();
                        return new eil(oq7Var, (l1g) qdcVar2.C(I2), new s8i(19, t1fVar));
                }
            }
        });
    }

    public t1f(qdc qdcVar) {
        this.a = 17;
        qdcVar.getClass();
        this.b = qdcVar;
    }

    public /* synthetic */ t1f(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public t1f(t tVar, PlaybackScope playbackScope, kxi kxiVar) {
        this.a = 15;
        tVar.getClass();
        playbackScope.getClass();
        this.b = tVar;
        this.c = playbackScope;
        this.d = kxiVar;
    }

    public t1f(z1h z1hVar, c2h c2hVar) {
        this.a = 23;
        this.b = z1hVar;
        this.c = c2hVar;
        this.d = z1hVar.g;
    }

    public t1f(Context context) {
        this.a = 2;
        this.b = l18.b.b(hag.I(frt.class), true);
        this.c = btf.b(new zya(28, context, this));
        x3n x3nVar = new x3n();
        x3nVar.a = context;
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        x3nVar.b = l18Var.b(I, true);
        x3nVar.c = l18Var.b(hag.I(y18.class), true);
        x3nVar.d = btf.b(new eyq(6, x3nVar));
        this.d = x3nVar;
    }

    public t1f(k1l k1lVar, tf6 tf6Var) {
        this.a = 21;
        k1lVar.getClass();
        this.b = k1lVar;
        this.c = tf6Var;
        this.d = y0q.b(0, 0, null, 7);
        x97.y(tf6Var, null, null, new m1i(this, null, 29), 3);
    }

    public t1f(ProfileActivity profileActivity, qyf qyfVar) {
        this.a = 5;
        bdt I = hag.I(av0.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        q0 b = ((c9k) l18Var.b(hag.I(c9k.class), true).getValue()).b(profileActivity, qyfVar);
        this.c = b;
        this.d = new njf(b.d, this, 5);
    }

    public t1f(lhk lhkVar, qxp qxpVar, os8 os8Var) {
        this.a = 19;
        lhkVar.getClass();
        qxpVar.getClass();
        this.b = lhkVar;
        this.c = qxpVar;
        this.d = os8Var;
    }

    public t1f(ac0 ac0Var, cc7 cc7Var, frt frtVar, aaw aawVar) {
        this.a = 20;
        this.b = ac0Var;
        this.c = cc7Var;
        this.d = frtVar;
    }

    public t1f(sdk sdkVar, g0c g0cVar) {
        this.a = 27;
        dq7 dq7Var = ca8.a;
        mn7 mn7Var = mn7.d;
        mn7Var.getClass();
        this.b = sdkVar;
        this.c = g0cVar;
        this.d = mn7Var;
    }

    public t1f(f7l f7lVar, uol uolVar, wul wulVar, mka mkaVar) {
        this.a = 22;
        this.b = f7lVar;
        this.c = uolVar;
        this.d = mkaVar;
    }

    public t1f(Context context, IReporter iReporter) {
        this.a = 9;
        this.c = new HashMap();
        this.d = "gsdk";
        this.b = context == null ? null : new b4i(AppMetrica.getReporter(context, "3b4132c5-4c62-4cfd-acff-158a2797d5bf"), iReporter);
    }

    public t1f(byte[] bArr) {
        this.a = 29;
        qwt.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.b = secretKeySpec;
        Cipher cipher = (Cipher) t7b.e.a("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] u = xv7.u(cipher.doFinal(new byte[16]));
        this.c = u;
        this.d = xv7.u(u);
    }

    public t1f(String str) {
        this.a = 18;
        bsc bscVar = new bsc();
        bscVar.l = l5i.p("video/mp2t");
        bscVar.m = l5i.p(str);
        this.b = new dsc(bscVar);
    }

    public t1f(nch nchVar, View view) {
        Object ochVar;
        this.a = 7;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ochVar = new qch();
        } else {
            ochVar = i >= 33 ? new och() : null;
        }
        this.b = ochVar;
        this.c = nchVar;
        this.d = view;
    }

    public t1f(rzb rzbVar, rzb rzbVar2, n03 n03Var) {
        this.a = 16;
        rzbVar.getClass();
        rzbVar2.getClass();
        n03Var.getClass();
        this.b = rzbVar;
        this.c = rzbVar2;
        this.d = n03Var;
    }

    public t1f(Context context, View view) {
        this.a = 28;
        this.c = view;
        hxh hxhVar = new hxh(context);
        this.b = hxhVar;
        hxhVar.e = new itk();
        ayh ayhVar = new ayh(context, hxhVar, view, false, R.attr.popupMenuStyle, 0);
        this.d = ayhVar;
        ayhVar.f = 83;
        ayhVar.j = new nhm();
    }

    public t1f(pui puiVar, kxi kxiVar, pgf pgfVar) {
        this.a = 13;
        puiVar.getClass();
        this.b = puiVar;
        this.c = kxiVar;
        this.d = pgfVar;
    }
}
