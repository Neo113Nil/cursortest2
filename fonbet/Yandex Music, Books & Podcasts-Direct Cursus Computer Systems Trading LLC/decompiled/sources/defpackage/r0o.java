package defpackage;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Trace;
import androidx.media3.session.i;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class r0o implements r8h, p7q, kzc, nld, nkq {
    public final /* synthetic */ int a;
    public boolean b;
    public Object c;
    public Object d;

    public r0o(lah lahVar) {
        this.a = 0;
        this.c = lahVar;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.d = e5bVar;
        ArrayList b = fsg.b(r0o.class.getSimpleName());
        xhc.a.getClass();
        d5b d5bVar = y9w.d;
        n8g b2 = t75.b();
        b2.add(new zhc("flex"));
        kcc kccVar = new kcc(new lcc(new wz0(1, b), false, new san(25)));
        while (kccVar.hasNext()) {
            b2.add(new zhc(((zhc) kccVar.next()).a));
        }
        t75.a(b2);
        d5bVar.getClass();
    }

    public e0g a(n7q n7qVar) {
        mqs a = n7qVar.b().a();
        boolean z = this.b;
        String string = ((Resources) this.c).getString((z && a != null && wyf.P(a)) ? R.string.podcast_added_to_favorites : (z || a == null || !wyf.P(a)) ? (z && a != null && wyf.L(a)) ? R.string.bookmate_audiobook_added_to_favorites : (z || a == null || !wyf.L(a)) ? z ? R.string.track_added_to_favorites : R.string.track_was_removed_from_favorites : R.string.bookmate_audiobook_removed_from_favorites : R.string.podcast_removed_from_favorites);
        string.getClass();
        return new e0g(string, true);
    }

    @Override // defpackage.nkq
    public void b(ka8 ka8Var) {
        nkq nkqVar = (nkq) this.c;
        try {
            ((g3a) this.d).accept(ka8Var);
            nkqVar.b(ka8Var);
        } catch (Throwable th) {
            leu.a0(th);
            this.b = true;
            ka8Var.a();
            nkqVar.b(t4b.a);
            nkqVar.onError(th);
        }
    }

    public nsh c() {
        nsh nshVar = new nsh(7, false);
        nshVar.b = (xzi) this.c;
        nshVar.c = (Set) this.d;
        nshVar.d = Boolean.valueOf(this.b);
        return nshVar;
    }

    public void d(ScheduledFuture scheduledFuture) {
        synchronized (this.c) {
            try {
                if (!this.b) {
                    this.d = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(boolean z) {
        owe oweVar = (owe) this.d;
        oweVar.j.execute(new cj3(oweVar, (kwe) this.c, z, 2));
    }

    public void f(sgr sgrVar) {
        owe oweVar = (owe) this.d;
        oweVar.i.J(2, "{0} SHUTDOWN with {1}", ((kwe) this.c).a(), owe.i(sgrVar));
        this.b = true;
        oweVar.j.execute(new pv7(16, this, sgrVar));
    }

    public void g() {
        o2g.U("transportShutdown() must be called before transportTerminated().", this.b);
        owe oweVar = (owe) this.d;
        zc4 zc4Var = oweVar.i;
        kwe kweVar = (kwe) this.c;
        zc4Var.J(2, "{0} Terminated", kweVar.a());
        lte.b(oweVar.g.d, kweVar);
        vq6 vq6Var = oweVar.j;
        vq6Var.execute(new cj3(oweVar, kweVar, false, 2));
        vq6Var.execute(new mwe(this, 1));
    }

    @Override // defpackage.nld
    public Object get() {
        if (this.b) {
            xq0.q("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        Trace.beginSection(y7g.X("Glide registry"));
        this.b = true;
        try {
            return tyf.p((a) this.c, (ArrayList) this.d);
        } finally {
            this.b = false;
            Trace.endSection();
        }
    }

    public Set h() {
        xzi xziVar = (xzi) this.c;
        if (xziVar == null) {
            return q5b.a;
        }
        Map map = (Map) xziVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (Intrinsics.d(entry.getValue(), Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return a(szuVar);
    }

    @Override // defpackage.nkq
    public void onError(Throwable th) {
        if (this.b) {
            y5g.g0(th);
        } else {
            ((nkq) this.c).onError(th);
        }
    }

    @Override // defpackage.kzc
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 7:
                xrh xrhVar = (xrh) obj;
                i iVar = ((sth) this.d).h;
                Handler handler = iVar.l;
                wrh wrhVar = (wrh) this.c;
                dvt.c0(handler, new juc(iVar, wrhVar, new srb(this, xrhVar, this.b, wrhVar, 3)));
                break;
            default:
                if (!this.b) {
                    ((nkq) this.c).onSuccess(obj);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return (e0g) this.d;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            return a(maqVar);
        }
        if (maqVar instanceof vaq) {
            return a(maqVar);
        }
        if (maqVar instanceof eaq) {
            return (e0g) this.d;
        }
        if (maqVar instanceof raq) {
            return a(maqVar);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        m1q m1qVar = t1qVar.c;
        if (m1qVar instanceof c2q) {
            return a(t1qVar);
        }
        if (m1qVar instanceof j1q) {
            return (e0g) this.d;
        }
        if (m1qVar instanceof e2q) {
            return null;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return a(u7uVar);
    }

    @Override // defpackage.kzc
    public void onFailure(Throwable th) {
    }

    public /* synthetic */ r0o(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public r0o(ryu ryuVar) {
        this.a = 11;
        ryuVar.getClass();
        this.c = ryuVar;
    }

    public /* synthetic */ r0o() {
        this.a = 4;
    }

    public r0o(nkq nkqVar, g3a g3aVar) {
        this.a = 10;
        this.c = nkqVar;
        this.d = g3aVar;
    }

    public r0o(va7 va7Var) {
        this.a = 2;
        this.c = va7Var;
        this.d = new mvt(20);
    }

    public r0o(a aVar, ArrayList arrayList, kg5 kg5Var) {
        this.a = 8;
        this.c = aVar;
        this.d = arrayList;
    }

    public r0o(Function0 function0, Function1 function1) {
        this.a = 12;
        function1.getClass();
        function0.getClass();
        this.c = function1;
        this.d = function0;
    }

    public r0o(Resources resources, hve hveVar, boolean z) {
        e0g e0gVar;
        this.a = 6;
        resources.getClass();
        hveVar.getClass();
        this.c = resources;
        this.b = z;
        if (hveVar instanceof fve) {
            String[] stringArray = resources.getStringArray(R.array.track_generative_liked);
            stringArray.getClass();
            Object O = xz0.O(stringArray, phn.a);
            O.getClass();
            e0gVar = new e0g((String) O, false);
        } else {
            e0gVar = null;
        }
        this.d = e0gVar;
    }

    public r0o(owe oweVar, kwe kweVar) {
        this.a = 5;
        this.d = oweVar;
        this.b = false;
        this.c = kweVar;
    }

    public r0o(sth sthVar, wrh wrhVar, boolean z) {
        this.a = 7;
        this.d = sthVar;
        this.c = wrhVar;
        this.b = z;
    }

    public r0o(Object obj) {
        this.a = 9;
        this.c = obj;
    }
}
