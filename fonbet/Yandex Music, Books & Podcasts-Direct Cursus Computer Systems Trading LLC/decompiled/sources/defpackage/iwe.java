package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import io.opentelemetry.proto.common.v1.a;
import io.opentelemetry.proto.common.v1.d;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.Response;
import ru.kinopoisk.sdk.easylogin.internal.F4;

/* loaded from: classes5.dex */
public final class iwe implements oo4, y1r, leg, r9c, os3, x7o, wbj, nkq, yla {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public iwe(int i) {
        this.a = i;
        switch (i) {
            case 27:
                this.b = null;
                this.c = new LinkedHashSet();
                break;
            default:
                xdr a = ydr.a(new ahn(new LinkedHashMap(), new HashMap()));
                this.b = a;
                this.c = a;
                break;
        }
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        vhi vhiVar = (vhi) this.b;
        call.getClass();
        if (th instanceof IllegalRequestOnNetworkModeException) {
            sfm sfmVar = vhiVar.e;
            d0o a = call.a();
            a.getClass();
            sfmVar.G(new nnd(y1g.f0(a, vhiVar.d), ((IllegalRequestOnNetworkModeException) th).b));
        }
        ((os3) this.c).A(vhiVar, th);
    }

    public void B(uyi uyiVar) {
        synchronized (this) {
            ((HashSet) this.c).remove(uyiVar);
            if (((HashSet) this.c).isEmpty()) {
                xdr xdrVar = (xdr) ((tyi) this.b).i;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C(xsi xsiVar, cg6 cg6Var) {
        msi msiVar;
        int i;
        oq oqVar;
        jbj jbjVar;
        xsi xsiVar2 = xsiVar;
        cej cejVar = (cej) this.c;
        if (cg6Var instanceof msi) {
            msiVar = (msi) cg6Var;
            int i2 = msiVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                msiVar.o = i2 - Integer.MIN_VALUE;
                Object obj = msiVar.m;
                nm6 nm6Var = nm6.a;
                i = msiVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!(xsiVar2 instanceof usi)) {
                        if (xsiVar2 instanceof wsi) {
                            wsi wsiVar = (wsi) xsiVar2;
                            mqs mqsVar = wsiVar.b;
                            return new bti(cejVar.a(mqsVar, false), wsiVar.a, mqsVar);
                        }
                        if (xsiVar2 instanceof vsi) {
                            mqs mqsVar2 = ((vsi) xsiVar2).a;
                            return new ati(cejVar.a(mqsVar2, false), mqsVar2);
                        }
                        b6e.s();
                        return null;
                    }
                    usi usiVar = (usi) xsiVar2;
                    mqs mqsVar3 = usiVar.b;
                    oqVar = usiVar.a;
                    if (u2x.J(oqVar) && mqsVar3 != null) {
                        return new cti(cejVar.a(mqsVar3, false), oqVar, mqsVar3);
                    }
                    if (!u2x.J(oqVar) && oqVar.x != null) {
                        k8w k8wVar = isi.a;
                        return new zsi(new raj(vz1.w(oqVar.o), oqVar.b, oqVar.g.b(), oqVar.i(), false, (g0t) null, ((m8w) isi.a).a(oqVar), false, 256), oqVar, mqsVar3);
                    }
                    u3g u3gVar = (u3g) this.b;
                    String str = oqVar.a;
                    msiVar.j = usiVar;
                    jbj jbjVar2 = jbj.a;
                    msiVar.k = jbjVar2;
                    msiVar.l = oqVar;
                    msiVar.o = 1;
                    Object k = ((t3g) u3gVar).k(str, msiVar);
                    if (k == nm6Var) {
                        return nm6Var;
                    }
                    jbjVar = jbjVar2;
                    obj = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oq oqVar2 = msiVar.l;
                    jbjVar = msiVar.k;
                    usi usiVar2 = msiVar.j;
                    qgg.h0(obj);
                    oqVar = oqVar2;
                    xsiVar2 = usiVar2;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                jbjVar.getClass();
                return new dti(((usi) xsiVar2).a, jbj.a(oqVar, booleanValue));
            }
        }
        msiVar = new msi(this, cg6Var);
        Object obj2 = msiVar.m;
        nm6 nm6Var2 = nm6.a;
        i = msiVar.o;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        jbjVar.getClass();
        return new dti(((usi) xsiVar2).a, jbj.a(oqVar, booleanValue2));
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        os3 os3Var = (os3) this.c;
        vhi vhiVar = (vhi) this.b;
        call.getClass();
        try {
            os3Var.D(vhiVar, vhiVar.b(response));
        } catch (Throwable th) {
            if (!(th instanceof IOException) && !(th instanceof JsonParseException)) {
                ssg.a(7, "MusicBackendResponseCall", "Unexpected exception when convert response, url=" + response.a.a.a, th);
            }
            os3Var.A(vhiVar, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008c -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(qsi qsiVar, cg6 cg6Var) {
        nsi nsiVar;
        int i;
        Iterator it;
        String str;
        int i2;
        Collection collection;
        int i3;
        if (cg6Var instanceof nsi) {
            nsiVar = (nsi) cg6Var;
            int i4 = nsiVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nsiVar.r = i4 - Integer.MIN_VALUE;
                Object obj = nsiVar.p;
                Object obj2 = nm6.a;
                i = nsiVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    if (qsiVar == null) {
                        return new zab("", c5b.a);
                    }
                    String str2 = qsiVar.b;
                    List list = qsiVar.c;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    it = list.iterator();
                    str = str2;
                    i2 = 0;
                    collection = arrayList;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = nsiVar.o;
                    i3 = nsiVar.n;
                    collection = nsiVar.m;
                    str = nsiVar.l;
                    it = nsiVar.k;
                    Collection collection2 = nsiVar.j;
                    qgg.h0(obj);
                    collection.add((eti) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        xsi xsiVar = (xsi) it.next();
                        Collection collection3 = collection;
                        nsiVar.j = collection3;
                        nsiVar.k = it;
                        nsiVar.l = str;
                        nsiVar.m = collection3;
                        nsiVar.n = i3;
                        nsiVar.o = i2;
                        nsiVar.r = 1;
                        obj = C(xsiVar, nsiVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        collection2 = collection;
                        collection.add((eti) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return new zab(str, (List) collection);
                        }
                    }
                }
            }
        }
        nsiVar = new nsi(this, cg6Var);
        Object obj3 = nsiVar.p;
        Object obj22 = nm6.a;
        i = nsiVar.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008c -> B:10:0x008d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object F(lui luiVar, cg6 cg6Var) {
        osi osiVar;
        int i;
        Iterator it;
        String str;
        int i2;
        Collection collection;
        int i3;
        if (cg6Var instanceof osi) {
            osiVar = (osi) cg6Var;
            int i4 = osiVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                osiVar.r = i4 - Integer.MIN_VALUE;
                Object obj = osiVar.p;
                Object obj2 = nm6.a;
                i = osiVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    if (luiVar == null) {
                        return new zab("", c5b.a);
                    }
                    String str2 = luiVar.b;
                    List list = luiVar.d;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    it = list.iterator();
                    str = str2;
                    i2 = 0;
                    collection = arrayList;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = osiVar.o;
                    i3 = osiVar.n;
                    collection = osiVar.m;
                    str = osiVar.l;
                    it = osiVar.k;
                    Collection collection2 = osiVar.j;
                    qgg.h0(obj);
                    collection.add((eti) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        xsi xsiVar = (xsi) it.next();
                        Collection collection3 = collection;
                        osiVar.j = collection3;
                        osiVar.k = it;
                        osiVar.l = str;
                        osiVar.m = collection3;
                        osiVar.n = i3;
                        osiVar.o = i2;
                        osiVar.r = 1;
                        obj = C(xsiVar, osiVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        collection2 = collection;
                        collection.add((eti) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return new zab(str, (List) collection);
                        }
                    }
                }
            }
        }
        osiVar = new osi(this, cg6Var);
        Object obj3 = osiVar.p;
        Object obj22 = nm6.a;
        i = osiVar.r;
        if (i != 0) {
        }
    }

    @Override // defpackage.r9c
    public void a(File file) {
        file.getClass();
        nci nciVar = (nci) this.b;
        nciVar.b = (gci) this.c;
        nciVar.a = file;
        Runnable runnable = nciVar.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // defpackage.nkq
    public void b(ka8 ka8Var) {
        ((nkq) this.b).b(ka8Var);
    }

    @Override // defpackage.yla
    public void c() {
        non nonVar = (non) this.b;
        synchronized (nonVar) {
            nonVar.c = nonVar.a.length;
        }
    }

    @Override // defpackage.oo4
    public void d(s2i s2iVar) {
        ((oo4) this.b).d(s2iVar);
    }

    @Override // defpackage.wbj
    public cvo e() {
        return (cvo) this.c;
    }

    @Override // defpackage.leg
    public axh f() {
        ((Context) this.b).getClass();
        jtc jtcVar = new jtc();
        jtcVar.a = uah.g(new Pair("BUFFER_PROVIDER_BY_CONSTANT", new j86(50000 / 1000.0d)));
        jtcVar.b = new ArrayList();
        return jtcVar.f();
    }

    @Override // defpackage.wbj
    public fnb g() {
        return (fnb) this.b;
    }

    @Override // defpackage.yla
    public void h(r33 r33Var, Bitmap bitmap) {
        IOException iOException = ((bob) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            r33Var.o(bitmap);
            throw iOException;
        }
    }

    public void i(pmh pmhVar, int i) {
        okh okhVar = (okh) this.b;
        if ((okhVar.a.getFlags() & 4) == 0) {
            qq6.d("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", uwf.j(pmhVar, MediaDescriptionCompat.CREATOR));
        bundle.putInt("android.support.v4.media.session.command.ARGUMENT_INDEX", i);
        okhVar.a.sendCommand("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT", bundle, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        if (r11 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object j(jsi jsiVar, tui tuiVar, cg6 cg6Var) {
        ksi ksiVar;
        int i;
        Object obj;
        List list;
        List list2;
        zab zabVar;
        if (cg6Var instanceof ksi) {
            ksiVar = (ksi) cg6Var;
            int i2 = ksiVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ksiVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = ksiVar.l;
                Object obj3 = nm6.a;
                i = ksiVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    qsi a = jsiVar.a();
                    Iterator it = jsiVar.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((zqi) obj) instanceof lui) {
                            break;
                        }
                    }
                    lui luiVar = obj instanceof lui ? (lui) obj : null;
                    if ((a != null && (list2 = a.c) != null && (!list2.isEmpty())) || !tuiVar.b.isEmpty()) {
                        ksiVar.j = tuiVar;
                        ksiVar.n = 1;
                        obj2 = E(a, ksiVar);
                    } else {
                        if (luiVar == null || (list = luiVar.d) == null || !(!list.isEmpty())) {
                            return null;
                        }
                        ksiVar.j = null;
                        ksiVar.n = 3;
                        obj2 = F(luiVar, ksiVar);
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i == 2) {
                        zabVar = ksiVar.k;
                        qgg.h0(obj2);
                        return new lvi(zabVar, (zab) obj2);
                    }
                    if (i == 3) {
                        qgg.h0(obj2);
                        return new mvi((zab) obj2);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tuiVar = ksiVar.j;
                qgg.h0(obj2);
                zabVar = (zab) obj2;
                ksiVar.j = null;
                ksiVar.k = zabVar;
                ksiVar.n = 2;
                obj2 = k(tuiVar, ksiVar);
            }
        }
        ksiVar = new ksi(this, cg6Var);
        Object obj22 = ksiVar.l;
        Object obj32 = nm6.a;
        i = ksiVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0084 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object k(tui tuiVar, cg6 cg6Var) {
        lsi lsiVar;
        int i;
        Iterator it;
        String str;
        int i2;
        Collection collection;
        int i3;
        if (cg6Var instanceof lsi) {
            lsiVar = (lsi) cg6Var;
            int i4 = lsiVar.r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lsiVar.r = i4 - Integer.MIN_VALUE;
                Object obj = lsiVar.p;
                Object obj2 = nm6.a;
                i = lsiVar.r;
                if (i != 0) {
                    qgg.h0(obj);
                    String str2 = tuiVar.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    List list = tuiVar.b;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    it = list.iterator();
                    str = str2;
                    i2 = 0;
                    collection = arrayList;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = lsiVar.o;
                    i3 = lsiVar.n;
                    collection = lsiVar.m;
                    str = lsiVar.l;
                    it = lsiVar.k;
                    Collection collection2 = lsiVar.j;
                    qgg.h0(obj);
                    collection.add((eti) obj);
                    collection = collection2;
                    if (it.hasNext()) {
                        xsi xsiVar = (xsi) it.next();
                        Collection collection3 = collection;
                        lsiVar.j = collection3;
                        lsiVar.k = it;
                        lsiVar.l = str;
                        lsiVar.m = collection3;
                        lsiVar.n = i3;
                        lsiVar.o = i2;
                        lsiVar.r = 1;
                        obj = C(xsiVar, lsiVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        collection2 = collection;
                        collection.add((eti) obj);
                        collection = collection2;
                        if (it.hasNext()) {
                            return new zab(str, (List) collection);
                        }
                    }
                }
            }
        }
        lsiVar = new lsi(this, cg6Var);
        Object obj3 = lsiVar.p;
        Object obj22 = nm6.a;
        i = lsiVar.r;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r10) <= java.lang.Math.abs(r9)) goto L41;
     */
    @Override // defpackage.y1r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float l(float f) {
        fvf fvfVar = (fvf) this.b;
        List list = fvfVar.j().k;
        z1r z1rVar = (z1r) this.c;
        int size = list.size();
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            cvf cvfVar = (cvf) list.get(i);
            cvf cvfVar2 = cvfVar != null ? cvfVar : null;
            if (cvfVar2 == null || !cvfVar2.t) {
                bvf j = fvfVar.j();
                int g = (int) (j.p == bxj.a ? j.g() & 4294967295L : j.g() >> 32);
                int i2 = -fvfVar.j().l;
                int i3 = fvfVar.j().q;
                int i4 = cvfVar.q;
                int i5 = cvfVar.p;
                int i6 = fvfVar.j().n;
                float a = i5 - z1rVar.a(g, i4, i2, i3);
                if (a <= 0.0f && a > f2) {
                    f2 = a;
                }
                if (a >= 0.0f && a < f3) {
                    f3 = a;
                }
            }
        }
        char c = Math.abs(f) >= ((bvf) fvfVar.e.getValue()).i.n0(w1r.a) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    f2 = 0.0f;
                }
            }
            f2 = f3;
        }
        if (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f2;
    }

    public g8k m(InputStream inputStream) {
        e8k e8kVar;
        i5f i5fVar = (i5f) this.b;
        w1g.w(i5fVar).k(new mrq());
        w1g.w(i5fVar).b();
        try {
            try {
                try {
                    Object C = i4w.C(i5fVar, (t9f) this.c, inputStream);
                    u();
                    f8k f8kVar = new f8k(C);
                    w1g.w(i5fVar).d();
                    return f8kVar;
                } catch (IOException e) {
                    uah.m(jhp.e(xz0.r(new Pair[]{null, null})));
                    u();
                    e8kVar = new e8k(e);
                    w1g.w(i5fVar).d();
                    return e8kVar;
                } catch (Throwable th) {
                    uah.m(jhp.e(xz0.r(new Pair[]{null, null})));
                    u();
                    e8kVar = new e8k(th);
                    w1g.w(i5fVar).d();
                    return e8kVar;
                }
            } catch (gic e2) {
                u();
                e8kVar = new e8k(e2);
                w1g.w(i5fVar).d();
                return e8kVar;
            } catch (IllegalArgumentException e3) {
                e3.getMessage();
                uah.m(jhp.e(xz0.r(new Pair[]{null, null})));
                u();
                e8kVar = new e8k(e3);
                w1g.w(i5fVar).d();
                return e8kVar;
            }
        } catch (Throwable th2) {
            w1g.w(i5fVar).d();
            throw th2;
        }
    }

    @Override // defpackage.oo4
    public void n(sgr sgrVar, no4 no4Var, s2i s2iVar) {
        ((jwe) this.c).b.b.D(sgrVar.g());
        ((oo4) this.b).n(sgrVar, no4Var, s2iVar);
    }

    public rkh o() {
        MediaController.PlaybackInfo playbackInfo = ((okh) this.b).a.getPlaybackInfo();
        if (playbackInfo != null) {
            return new rkh(playbackInfo.getPlaybackType(), hv1.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }
        return null;
    }

    @Override // defpackage.nkq
    public void onError(Throwable th) {
        ((nkq) this.b).onError(th);
    }

    @Override // defpackage.mjr
    public void onReady() {
        ((oo4) this.b).onReady();
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        Object obj2;
        String str;
        switch (this.a) {
            case 13:
                List list = (List) obj;
                list.getClass();
                ArrayList<kcp> arrayList = (ArrayList) this.b;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                for (kcp kcpVar : arrayList) {
                    kcpVar.getClass();
                    rfk rfkVar = kcpVar.a;
                    if (rfkVar instanceof mfk) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (StringsKt.M(((gl2) obj2).b, ((mfk) rfkVar).b, false)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        gl2 gl2Var = (gl2) obj2;
                        kcpVar = new kcp(rfkVar, kcpVar.b, kcpVar.c, gl2Var != null ? gl2Var.g : null, (qdq.y() && ((str = ((mfk) rfkVar).d) == null || str.length() == 0)) ? gl2Var != null ? gl2Var.a : null : null);
                    }
                    arrayList2.add(kcpVar);
                }
                ((x7o) this.c).onSuccess(arrayList2);
                return;
            case 17:
                ((Unit) obj).getClass();
                eqm eqmVar = (eqm) this.b;
                ArrayList arrayList3 = eqmVar.s;
                rfk rfkVar2 = (rfk) this.c;
                arrayList3.remove(rfkVar2);
                eqmVar.p.l(null);
                eqmVar.q.l(new bqm(rfkVar2));
                eqmVar.l.postDelayed(new dsd(23, eqmVar), 1500L);
                return;
            case 23:
                en enVar = (en) obj;
                enVar.getClass();
                hpo hpoVar = (hpo) ((x3n) this.b).d;
                j5n j5nVar = new j5n(6, (e47) this.c, enVar);
                if (hpoVar.a) {
                    j5nVar.invoke();
                    return;
                }
                return;
            case 25:
                List list2 = (List) obj;
                list2.getClass();
                gdp gdpVar = (gdp) this.b;
                voi voiVar = gdpVar.t;
                rn5 rn5Var = gdpVar.y;
                if (rn5Var == null) {
                    Intrinsics.j("mediator");
                    throw null;
                }
                voiVar.l(new xcp(list2, rn5Var.I()));
                gdp.L(gdpVar);
                return;
            default:
                try {
                    Unit a = F4.a((F4.e) ((g3a) this.c).b, obj);
                    up6.L(a, "The mapper function returned a null value.");
                    ((nkq) this.b).onSuccess(a);
                    return;
                } catch (Throwable th) {
                    leu.a0(th);
                    onError(th);
                    return;
                }
        }
    }

    public i6l p() {
        okh okhVar = (okh) this.b;
        d9e d = okhVar.e.d();
        if (d != null) {
            try {
                return d.c();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
        }
        PlaybackState playbackState = okhVar.a.getPlaybackState();
        if (playbackState != null) {
            return i6l.a(playbackState);
        }
        return null;
    }

    @Override // defpackage.y1r
    public float r(float f, float f2) {
        float abs = Math.abs(f2);
        List list = ((fvf) this.b).j().k;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((cvf) it.next()).q;
            }
            i /= size;
        }
        float f3 = abs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }

    @Override // defpackage.mjr
    public void t(ljr ljrVar) {
        ((oo4) this.b).t(ljrVar);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                z0j Y = ezf.Y(this);
                Y.q((oo4) this.b, "delegate");
                return Y.toString();
            default:
                return super.toString();
        }
    }

    public List u() {
        ArrayList arrayList;
        mrq mrqVar = (mrq) w1g.w((i5f) this.b).g(ern.a(mrq.class));
        return (mrqVar == null || (arrayList = mrqVar.a) == null) ? c5b.a : arrayList;
    }

    public tkh v() {
        MediaController.TransportControls transportControls = ((okh) this.b).a.getTransportControls();
        return Build.VERSION.SDK_INT >= 29 ? new vkh(transportControls) : new tkh(transportControls);
    }

    public void w(pmh pmhVar) {
        okh okhVar = (okh) this.b;
        if ((okhVar.a.getFlags() & 4) == 0) {
            qq6.d("This session doesn't support queue management operations");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION", uwf.j(pmhVar, MediaDescriptionCompat.CREATOR));
        okhVar.a.sendCommand("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM", bundle, null);
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        switch (this.a) {
            case 13:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                ((x7o) this.c).x(bfkVar);
                break;
            case 17:
                bfk bfkVar2 = (bfk) obj;
                bfkVar2.getClass();
                ((eqm) this.b).q.l(new xpm(bfkVar2));
                break;
            case 23:
                bfk bfkVar3 = (bfk) obj;
                bfkVar3.getClass();
                hpo hpoVar = (hpo) ((x3n) this.b).d;
                j5n j5nVar = new j5n(5, (e47) this.c, bfkVar3);
                if (hpoVar.a) {
                    j5nVar.invoke();
                    break;
                }
                break;
            default:
                ((bfk) obj).getClass();
                ((gdp) this.b).J((List) this.c);
                break;
        }
    }

    public void y(Map map) {
        nbf nbfVar = (nbf) d.d.createBuilder();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            nbfVar.d();
            d dVar = (d) nbfVar.b;
            dVar.getClass();
            str.getClass();
            dVar.b = str;
            co0 co0Var = (co0) a.c.createBuilder();
            String str2 = (String) entry.getValue();
            co0Var.d();
            a aVar = (a) co0Var.b;
            aVar.getClass();
            str2.getClass();
            aVar.a = 1;
            aVar.b = str2;
            nbfVar.d();
            d dVar2 = (d) nbfVar.b;
            a aVar2 = (a) co0Var.b();
            dVar2.getClass();
            dVar2.c = aVar2;
            dVar2.a |= 1;
            j2o j2oVar = (j2o) this.b;
            d dVar3 = (d) nbfVar.b();
            j2oVar.d();
            io.opentelemetry.proto.resource.v1.a aVar3 = (io.opentelemetry.proto.resource.v1.a) j2oVar.b;
            aVar3.getClass();
            rse rseVar = aVar3.a;
            if (!((u8) rseVar).a) {
                aVar3.a = o3d.mutableCopy(rseVar);
            }
            aVar3.a.add(dVar3);
        }
    }

    public void z(uyi uyiVar) {
        synchronized (this) {
            if (((HashSet) this.c).add(uyiVar)) {
                xdr xdrVar = (xdr) ((tyi) this.b).i;
                Boolean bool = Boolean.TRUE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
            }
        }
    }

    public /* synthetic */ iwe(int i, boolean z) {
        this.a = i;
    }

    public iwe(fnb fnbVar) {
        this.a = 2;
        fnbVar.getClass();
        this.b = fnbVar;
        this.c = qld.m();
    }

    public iwe(tyi tyiVar) {
        this.a = 11;
        this.b = tyiVar;
        this.c = new HashSet();
    }

    public /* synthetic */ iwe(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public iwe(dkl dklVar) {
        this.a = 5;
        dklVar.getClass();
        this.b = dklVar;
    }

    public iwe(u3g u3gVar) {
        this.a = 10;
        this.b = u3gVar;
        l18 l18Var = l18.b;
        bdt I = hag.I(cej.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.c = (cej) qdcVar.C(I);
    }

    public iwe(Map map, AtomicReference atomicReference) {
        this.a = 22;
        map.getClass();
        atomicReference.getClass();
        this.b = map;
        this.c = atomicReference;
    }

    public iwe(r9t r9tVar, kni kniVar, Gson gson) {
        this.a = 20;
        it0 it0Var = it0.a;
        r9tVar.getClass();
        this.b = btf.b(new cte(20, kniVar, gson, r9tVar));
        this.c = new quk();
    }

    public iwe(jwe jweVar, oo4 oo4Var) {
        this.a = 0;
        this.c = jweVar;
        this.b = oo4Var;
    }

    public iwe(ExecutorService executorService) {
        this.a = 21;
        this.c = new xy0(0);
        this.b = executorService;
    }

    public iwe(qbm qbmVar) {
        this.a = 16;
        this.b = qbmVar.g.m();
        this.c = qbmVar.getP();
    }

    public iwe(hgp hgpVar) {
        this.a = 15;
        this.b = (oq7) ((jyr) hgpVar.h).getValue();
        this.c = (gkl) ((jyr) hgpVar.e).getValue();
    }

    public iwe(Context context, String str) {
        this.a = 12;
        context.getClass();
        this.b = (j2o) io.opentelemetry.proto.resource.v1.a.b.createBuilder();
        dq7 dq7Var = ca8.a;
        this.c = gld.e(mn7.d);
    }

    public iwe(Context context, msh mshVar) {
        this.a = 6;
        if (mshVar != null) {
            this.c = Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new pkh(context, mshVar);
                return;
            } else {
                this.b = new okh(context, mshVar);
                return;
            }
        }
        xq0.x("sessionToken must not be null");
        throw null;
    }
}
