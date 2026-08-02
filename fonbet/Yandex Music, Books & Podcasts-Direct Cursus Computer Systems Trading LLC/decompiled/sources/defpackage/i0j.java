package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class i0j {
    public final osh a;
    public final jp0 b;
    public final h50 c;
    public final Context d;
    public final cr e;
    public final q76 f;
    public final hwd g;
    public final Gson h;
    public final kzi i;
    public final sfm j;
    public final ljn k;
    public final jyr l;
    public final ozw m;
    public final AtomicReference n;
    public final jyr o;
    public final jyr p;
    public final up3 q;

    public i0j(osh oshVar, jp0 jp0Var, h50 h50Var, Context context, cr crVar, ard ardVar, q76 q76Var, q02 q02Var, b3i b3iVar, hwd hwdVar) {
        tf6 e = gld.e(e.c(saf.p(), dm6.b));
        this.a = oshVar;
        this.b = jp0Var;
        this.c = h50Var;
        this.d = context;
        this.e = crVar;
        this.f = q76Var;
        this.g = hwdVar;
        this.h = (Gson) ardVar.c.getValue();
        this.i = new kzi(context);
        sfm sfmVar = new sfm();
        sfmVar.a = b3iVar;
        sfmVar.b = crVar;
        sfmVar.c = new kkp(new oxo(14, sfmVar), new vzp(12));
        this.j = sfmVar;
        this.k = new ljn(q02Var, sfmVar, btf.b(new jt5(this, 8)));
        this.l = btf.b(new jt5(this, 9));
        this.m = new ozw(5);
        this.n = new AtomicReference(null);
        this.o = btf.b(new jt5(this, 10));
        this.p = btf.b(new jt5(this, 11));
        this.q = new up3(5, (nxv) crVar.f);
        ox6.B(zsd.b0((pjc) ((jyr) crVar.i).getValue()), e, new h0j(this, 0));
        ox6.B(zsd.b0((pjc) crVar.g), e, new h0j(this, 1));
    }

    public static e0j a(i0j i0jVar, ooj oojVar, Function1 function1, Function0 function0, fos fosVar, int i) {
        ljn ljnVar;
        ooj oojVar2 = (i & 2) != 0 ? new ooj(null, null, 63) : oojVar;
        Function1 function12 = (i & 4) != 0 ? null : function1;
        Function0 function02 = (i & 8) != 0 ? null : function0;
        fos fosVar2 = (i & 16) == 0 ? fosVar : null;
        boolean z = (i & 32) == 0;
        jp0 jp0Var = i0jVar.b;
        hwd hwdVar = i0jVar.g;
        Gson gson = i0jVar.h;
        gson.getClass();
        GsonBuilder gsonBuilder = new GsonBuilder(gson);
        if (function12 != null) {
            function12.invoke(gsonBuilder);
        }
        Gson a = gsonBuilder.a();
        joj c = ((OkHttpClient) ((jyr) i0jVar.a.c).getValue()).c();
        ArrayList arrayList = c.c;
        ArrayList arrayList2 = c.d;
        c.a(i0jVar.q);
        Function1 function13 = oojVar2.e;
        boolean z2 = oojVar2.c;
        if (function13 != null) {
            function13.invoke(c);
        }
        voj vojVar = (voj) jp0Var.d;
        String str = (String) jp0Var.b;
        fos fosVar3 = fosVar2;
        arrayList2.add(new xoj(vojVar, new ex(15, function02)));
        if (jp0Var.a) {
            uwf.M(c);
        }
        if (z2) {
            arrayList.add(new up3(4, (gst) jp0Var.c));
        }
        arrayList2.add(new up3(i0jVar.f));
        if (oojVar2.a) {
            arrayList2.add(new ewd(hwdVar, new g06(i0jVar.d, hwdVar, fosVar3 == null ? hwdVar.b : fosVar3)));
        } else {
            c.b((ewd) i0jVar.l.getValue());
        }
        Iterator it = ((List) jp0Var.f).iterator();
        while (it.hasNext()) {
            c.a((bse) it.next());
        }
        Iterator it2 = ((List) jp0Var.e).iterator();
        while (it2.hasNext()) {
            c.b((bse) it2.next());
        }
        arrayList.add(new n56(2));
        if (oojVar2.b) {
            c.a((bse) i0jVar.o.getValue());
        }
        if (z2 && (ljnVar = i0jVar.k) != null) {
            arrayList.add(ljnVar);
        }
        jib jibVar = oojVar2.d;
        if (jibVar != null) {
            c.e = new put(jibVar);
        }
        OkHttpClient okHttpClient = new OkHttpClient(c);
        whi whiVar = new whi(i0jVar.j, a, (h2q) i0jVar.e.d);
        if (z && m7b.a.contains(str)) {
            str = (String) jp0Var.g;
        }
        uao uaoVar = new uao();
        uaoVar.b = okHttpClient;
        uaoVar.b(str);
        uaoVar.e.add(whiVar);
        uaoVar.a(new nwj(1));
        uaoVar.a(new yqd(a));
        uaoVar.f = new gx0(1);
        return new e0j(uaoVar.c(), a, btf.b(new y6g(19, i0jVar, a)));
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, java.util.Map] */
    public final r9t b(evj evjVar) {
        List c;
        joj c2 = ((OkHttpClient) ((jyr) this.a.c).getValue()).c();
        ArrayList arrayList = c2.d;
        ozw ozwVar = (ozw) evjVar.e;
        rao raoVar = (rao) evjVar.c;
        if (ozwVar == null) {
            ozwVar = this.m;
        }
        ozwVar.getClass();
        c2.b = ozwVar;
        Function1 function1 = (Function1) evjVar.f;
        if (function1 != null) {
            function1.invoke(c2);
        }
        jp0 jp0Var = this.b;
        if (jp0Var.a) {
            uwf.M(c2);
        }
        int i = 1;
        if (((String) evjVar.b) != null) {
            arrayList.add(new xoj((voj) jp0Var.d, new g0j(evjVar, i)));
        }
        boolean z = evjVar.a;
        q76 q76Var = this.f;
        if (z) {
            arrayList.add(new up3(q76Var));
        }
        c2.a(this.q);
        if (!Intrinsics.d(raoVar, qao.a)) {
            if (Intrinsics.d(raoVar, pao.a)) {
                c2.a((bse) this.p.getValue());
            } else {
                if (!(raoVar instanceof oao)) {
                    b6e.s();
                    return null;
                }
                ?? r1 = ((oao) raoVar).a;
                Object obj = sbo.a;
                q76Var.getClass();
                c2.c.add(new up3(q76Var, new iwe((Map) r1, new AtomicReference(null))));
            }
        }
        Iterator it = ((List) jp0Var.f).iterator();
        while (it.hasNext()) {
            c2.a((bse) it.next());
        }
        Iterator it2 = ((List) jp0Var.e).iterator();
        while (it2.hasNext()) {
            c2.b((bse) it2.next());
        }
        int ordinal = ((s9t) evjVar.d).ordinal();
        izm izmVar = izm.HTTP_1_1;
        if (ordinal != 0) {
            izm izmVar2 = izm.HTTP_2;
            if (ordinal == 1) {
                c = u75.h(izmVar, izmVar2);
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                c = u75.h(izmVar2, izmVar);
            }
        } else {
            c = t75.c(izmVar);
        }
        c2.d(c);
        return new r9t(new OkHttpClient(c2), wg.D);
    }
}
