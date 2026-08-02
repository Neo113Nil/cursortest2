package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.connectsdk.service.airplay.PListParser;
import com.yandex.passport.api.impl.c;
import com.yandex.passport.common.core.b;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.methods.k6;
import com.yandex.passport.internal.methods.performer.s0;
import com.yandex.passport.internal.methods.r4;
import com.yandex.passport.internal.network.d;
import com.yandex.passport.internal.network.h;
import com.yandex.passport.internal.sloth.z;
import com.yandex.passport.internal.ui.util.s;
import com.yandex.passport.internal.usecase.c0;
import com.yandex.passport.internal.usecase.e0;
import com.yandex.plus.core.network.api.utils.a;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b8b extends aur implements Function2 {
    public final /* synthetic */ int j = 0;
    public Object k;
    public int l;
    public int m;
    public int n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8b(c8b c8bVar, v7b v7bVar, rwj rwjVar, List list, hib hibVar, rce rceVar, Continuation continuation) {
        super(2, continuation);
        this.s = c8bVar;
        this.t = v7bVar;
        this.r = rwjVar;
        this.p = list;
        this.u = hibVar;
        this.v = rceVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                b8b b8bVar = new b8b((c8b) this.s, (v7b) this.t, (rwj) this.r, (List) this.p, (hib) this.u, (rce) this.v, continuation);
                b8bVar.k = obj;
                return b8bVar;
            default:
                return new b8b((r4) this.u, (s0) this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b8b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x01dd, code lost:
    
        if (r2 == r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0263, code lost:
    
        if (defpackage.xz0.u(defpackage.k.a, r9) != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ba  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x02a5 -> B:48:0x02aa). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap M;
        mm6 mm6Var;
        rwj rwjVar;
        int size;
        List list;
        int i;
        c cVar;
        Object a;
        s0 s0Var;
        String str;
        l lVar;
        int i2;
        int i3;
        int i4;
        String str2;
        l lVar2;
        String str3;
        Pair[] pairArr;
        s0 s0Var2;
        Object obj2;
        Pair[] pairArr2;
        String str4;
        String a2;
        Object g;
        int i5 = this.j;
        Object obj3 = this.v;
        Object obj4 = this.u;
        switch (i5) {
            case 0:
                hib hibVar = (hib) obj4;
                rwj rwjVar2 = (rwj) this.r;
                v7b v7bVar = (v7b) this.t;
                nm6 nm6Var = nm6.a;
                int i6 = this.n;
                if (i6 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.k;
                    Drawable drawable = v7bVar.a;
                    if (drawable instanceof BitmapDrawable) {
                        M = ((BitmapDrawable) drawable).getBitmap();
                        Bitmap.Config config = M.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        break;
                    }
                    M = lg3.M(drawable, rwjVar2.b, rwjVar2.d, rwjVar2.e, rwjVar2.f);
                    hibVar.getClass();
                    List list2 = (List) this.p;
                    mm6Var = mm6Var2;
                    rwjVar = rwjVar2;
                    size = list2.size();
                    list = list2;
                    i = 0;
                    if (i < size) {
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    size = this.m;
                    int i7 = this.l;
                    rwj rwjVar3 = (rwj) this.q;
                    List list3 = (List) this.o;
                    mm6 mm6Var3 = (mm6) this.k;
                    qgg.h0(obj);
                    mm6Var = mm6Var3;
                    int i8 = 1;
                    list = list3;
                    Object b = obj;
                    M = (Bitmap) b;
                    saf.K(mm6Var.getCoroutineContext());
                    rwj rwjVar4 = rwjVar3;
                    i = i7 + i8;
                    rwjVar = rwjVar4;
                    if (i < size) {
                        e7t e7tVar = (e7t) list.get(i);
                        lmq lmqVar = rwjVar.d;
                        this.k = mm6Var;
                        this.o = list;
                        this.q = rwjVar;
                        this.l = i;
                        this.m = size;
                        i8 = 1;
                        this.n = 1;
                        b = e7tVar.b(M);
                        if (b == nm6Var) {
                            return nm6Var;
                        }
                        int i9 = i;
                        rwjVar3 = rwjVar;
                        i7 = i9;
                        M = (Bitmap) b;
                        saf.K(mm6Var.getCoroutineContext());
                        rwj rwjVar42 = rwjVar3;
                        i = i7 + i8;
                        rwjVar = rwjVar42;
                        if (i < size) {
                            hibVar.getClass();
                            return new v7b(new BitmapDrawable(((rce) obj3).a.getResources(), M), v7bVar.b, v7bVar.c, v7bVar.d);
                        }
                    }
                }
            default:
                k6 k6Var = ((r4) obj4).c;
                nm6 nm6Var2 = nm6.a;
                int i10 = this.n;
                if (i10 == 0) {
                    qgg.h0(obj);
                    b L = a.L(((c) k6Var.c).b);
                    cVar = (c) k6Var.c;
                    s0 s0Var3 = (s0) obj3;
                    l a3 = s0Var3.a.a();
                    d dVar = s0Var3.b;
                    long h = a3 != null ? a3.h() : 0L;
                    h hVar = (h) dVar;
                    hVar.getClass();
                    String str5 = hVar.l(L, h).a;
                    z zVar = s0Var3.e;
                    this.o = s0Var3;
                    this.p = cVar;
                    this.k = a3;
                    this.q = str5;
                    this.l = 0;
                    this.n = 1;
                    a = zVar.a(this);
                    if (a != nm6Var2) {
                        s0Var = s0Var3;
                        str = str5;
                        lVar = a3;
                        i2 = 0;
                    }
                    return nm6Var2;
                }
                if (i10 == 1) {
                    i2 = this.l;
                    str = (String) this.q;
                    lVar = (l) this.k;
                    cVar = (c) this.p;
                    s0 s0Var4 = (s0) this.o;
                    qgg.h0(obj);
                    s0Var = s0Var4;
                    a = obj;
                } else if (i10 == 2) {
                    i4 = this.m;
                    i3 = this.l;
                    str3 = (String) this.t;
                    pairArr2 = (Pair[]) this.s;
                    pairArr = (Pair[]) this.r;
                    str2 = (String) this.q;
                    lVar2 = (l) this.k;
                    s0Var2 = (s0) this.o;
                    qgg.h0(obj);
                    com.yandex.passport.common.value.b bVar = (com.yandex.passport.common.value.b) obj;
                    obj2 = bVar != null ? bVar.a : null;
                    str4 = (String) obj2;
                    if (str4 == null) {
                        str4 = null;
                    }
                    pairArr[i4] = new Pair(str3, String.valueOf(str4));
                    pairArr2[6] = new Pair("webview", ConstantDeviceInfo.APP_PLATFORM);
                    pairArr2[7] = new Pair("mode", "userMenu");
                    a2 = com.yandex.passport.common.url.b.a(str2, uah.e(pairArr2));
                    if (lVar2 == null) {
                        e0 e0Var = s0Var2.c;
                        c0 c0Var = new c0(lVar2.b, ((com.yandex.passport.internal.ui.lang.a) s0Var2.d).b(), a2, (String) null, (Map) null, (com.yandex.passport.common.core.c) null, 120);
                        this.o = null;
                        this.p = null;
                        this.k = a2;
                        this.q = null;
                        this.r = null;
                        this.s = null;
                        this.t = null;
                        this.l = i3;
                        this.n = 3;
                        g = e0Var.g(c0Var, this);
                        break;
                    } else {
                        return com.yandex.passport.common.url.b.b(a2, new Pair("deauthorize", PListParser.TAG_TRUE));
                    }
                } else {
                    if (i10 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a2 = (String) this.k;
                    qgg.h0(obj);
                    g = obj;
                    Object obj5 = ((z7o) g).a;
                    Throwable a4 = z7o.a(obj5);
                    if (a4 == null) {
                        return ((com.yandex.passport.common.url.b) obj5).a;
                    }
                    if (!(a4 instanceof IOException)) {
                        return com.yandex.passport.common.url.b.b(a2, new Pair("deauthorize", PListParser.TAG_TRUE));
                    }
                    kac.f("failed to get auth url");
                    return null;
                }
                String a5 = com.yandex.passport.common.url.b.a(str, uah.i(com.yandex.passport.internal.ui.a.p((Map) a), cVar.c));
                Pair[] pairArr3 = new Pair[8];
                Locale a6 = ((com.yandex.passport.internal.ui.lang.a) s0Var.d).a();
                int i11 = com.yandex.passport.common.ui.lang.a.a;
                String language = a6.getLanguage();
                language.getClass();
                pairArr3[0] = new Pair("lang", language);
                String country = ((com.yandex.passport.internal.ui.lang.a) s0Var.d).a().getCountry();
                country.getClass();
                pairArr3[1] = new Pair(CommonUrlParts.LOCALE, country);
                pairArr3[2] = new Pair("theme", s.b(cVar.a));
                pairArr3[3] = new Pair("source", "user_menu");
                pairArr3[4] = new Pair("device_name", Build.MODEL);
                z zVar2 = s0Var.e;
                this.o = s0Var;
                this.p = null;
                this.k = lVar;
                this.q = a5;
                this.r = pairArr3;
                this.s = pairArr3;
                this.t = "uuid";
                this.l = i2;
                this.m = 5;
                this.n = 2;
                Object b2 = zVar2.b(this);
                if (b2 != nm6Var2) {
                    i3 = i2;
                    i4 = 5;
                    str2 = a5;
                    lVar2 = lVar;
                    str3 = "uuid";
                    pairArr = pairArr3;
                    s0Var2 = s0Var;
                    obj2 = b2;
                    pairArr2 = pairArr;
                    str4 = (String) obj2;
                    if (str4 == null) {
                    }
                    pairArr[i4] = new Pair(str3, String.valueOf(str4));
                    pairArr2[6] = new Pair("webview", ConstantDeviceInfo.APP_PLATFORM);
                    pairArr2[7] = new Pair("mode", "userMenu");
                    a2 = com.yandex.passport.common.url.b.a(str2, uah.e(pairArr2));
                    if (lVar2 == null) {
                    }
                }
                return nm6Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8b(r4 r4Var, s0 s0Var, Continuation continuation) {
        super(2, continuation);
        this.u = r4Var;
        this.v = s0Var;
    }
}
