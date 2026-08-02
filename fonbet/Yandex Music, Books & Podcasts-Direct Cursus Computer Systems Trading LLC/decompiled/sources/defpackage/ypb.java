package defpackage;

import android.graphics.Bitmap;
import android.graphics.Movie;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.lazy.layout.b;
import com.yandex.pulse.metrics.o;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ypb extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ypb(Function0 function0) {
        super(0);
        this.r = 6;
        this.s = (ezc) function0;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean W0;
        wb7 wb7Var;
        switch (this.r) {
            case 0:
                return new qqb(((aqb) this.s).a).a();
            case 1:
                ((tsb) this.s).a.w0(0);
                return Unit.a;
            case 2:
                ((dpc) this.s).T0();
                return Unit.a;
            case 3:
                W0 = ((fpc) this.s).v.W0(7);
                return Boolean.valueOf(W0);
            case 4:
                ocd ocdVar = (ocd) this.s;
                tce tceVar = ocdVar.a;
                rwj rwjVar = ocdVar.b;
                ikn iknVar = new ikn(new nvc(tceVar.o()));
                try {
                    Movie decodeStream = Movie.decodeStream(iknVar.E0());
                    iknVar.close();
                    if (decodeStream == null || decodeStream.width() <= 0 || decodeStream.height() <= 0) {
                        xq0.q("Failed to decode GIF.");
                    } else {
                        Bitmap.Config config = (decodeStream.isOpaque() && rwjVar.g) ? Bitmap.Config.RGB_565 : woe.o(rwjVar.b) ? Bitmap.Config.ARGB_8888 : rwjVar.b;
                        nso nsoVar = rwjVar.e;
                        m6k m6kVar = rwjVar.l;
                        rfi rfiVar = new rfi(decodeStream, config, nsoVar);
                        Integer num = (Integer) m6kVar.a("coil#repeat_count");
                        int intValue = num != null ? num.intValue() : -1;
                        if (intValue >= -1) {
                            rfiVar.q = intValue;
                            Function0 function0 = (Function0) m6kVar.a("coil#animation_start_callback");
                            Function0 function02 = (Function0) m6kVar.a("coil#animation_end_callback");
                            if (function0 != null || function02 != null) {
                                rfiVar.e.add(new d(function0, function02));
                            }
                            if (m6kVar.a("coil#animated_transformation") == null) {
                                rfiVar.r = null;
                                rfiVar.s = isk.a;
                                rfiVar.t = false;
                                rfiVar.invalidateSelf();
                                return new zf7(rfiVar, false);
                            }
                            l1j.f();
                        } else {
                            xq0.o(k5r.i(intValue, "Invalid repeatCount: "));
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        yd5.q(iknVar, th);
                        throw th2;
                    }
                }
            case 5:
                okd okdVar = (okd) this.s;
                synchronized (okd.d) {
                    wb7Var = okd.f;
                    if (wb7Var == null) {
                        wb7Var = (wb7) okd.e.getValue(okdVar.a, hkd.a[0]);
                        okd.f = wb7Var;
                    }
                }
                return wb7Var;
            case 6:
                return ((ezc) this.s).invoke();
            case 7:
                return Float.valueOf(v5g.D(((mm6) this.s).getCoroutineContext()));
            case 8:
                Object systemService = ((View) ((ime) this.s).b).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 9:
                Object systemService2 = ((View) ((qne) this.s).a).getContext().getSystemService("input_method");
                systemService2.getClass();
                return (InputMethodManager) systemService2;
            case 10:
                ase aseVar = (ase) this.s;
                long nanoTime = System.nanoTime();
                wqn wqnVar = new wqn();
                wqn wqnVar2 = new wqn();
                synchronized (aseVar.c) {
                    wqnVar.a = nanoTime - aseVar.e;
                    wqnVar2.a = 1000000000 / aseVar.d;
                }
                x97.y(aseVar.a, null, null, new n5(wqnVar, wqnVar2, aseVar, nanoTime, (Continuation) null), 3);
                return Unit.a;
            case 11:
                qpf qpfVar = ((mpf) this.s).G;
                qpfVar.p.A = true;
                zwg zwgVar = qpfVar.q;
                if (zwgVar != null) {
                    zwgVar.u = true;
                }
                return Unit.a;
            case 12:
                ntf ntfVar = ((b) this.s).j;
                if (ntfVar != null) {
                    vq1.Z(ntfVar);
                }
                return Unit.a;
            case 13:
                return new BaseInputConnection(((bxf) this.s).a, false);
            case 14:
                pxf pxfVar = (pxf) this.s;
                int ordinal = pxfVar.a.ordinal();
                if (ordinal == 0) {
                    if (Intrinsics.d(y7g.e, "sandbox")) {
                        return new URL("https://diehard-mock-test.paysys.yandex.net:8043/api/");
                    }
                    qre qreVar = pxfVar.b;
                    return new URL(qreVar != null ? qreVar.b : "https://diehard.yandex.ru/api/");
                }
                if (ordinal == 1) {
                    qre qreVar2 = pxfVar.b;
                    return new URL(qreVar2 != null ? qreVar2.b : "https://pci-tf.fin.yandex.ru/api/");
                }
                if (ordinal == 2) {
                    return new URL("https://pci-front-test.crowdtest.yandex.ru/api/");
                }
                if (ordinal == 3) {
                    return new URL("https://pci-tf.fin.yandex.ru/api/");
                }
                if (ordinal == 4) {
                    return new URL("http://127.0.0.1:8080/diehard/api/");
                }
                b6e.s();
                return null;
            case 15:
                return ((kzn) ((qdc) this.s).c).c("LPM", new anf(250));
            case 16:
                return nif.b(nif.a, new wk0(7, (wnd) this.s));
            case 17:
                adi adiVar = (adi) this.s;
                eqi eqiVar = adiVar.c;
                eqi eqiVar2 = adiVar.b;
                eqi eqiVar3 = adiVar.e;
                adiVar.f = false;
                HashSet hashSet = new HashSet();
                eqi eqiVar4 = adiVar.d;
                Object[] objArr = eqiVar4.a;
                int i = eqiVar4.c;
                for (int i2 = 0; i2 < i; i2++) {
                    mpf mpfVar = (mpf) objArr[i2];
                    pzm pzmVar = (pzm) eqiVar3.a[i2];
                    xci xciVar = (xci) mpfVar.F.f;
                    if (xciVar.n) {
                        adi.b(xciVar, pzmVar, hashSet);
                    }
                }
                eqiVar4.i();
                eqiVar3.i();
                Object[] objArr2 = eqiVar2.a;
                int i3 = eqiVar2.c;
                for (int i4 = 0; i4 < i3; i4++) {
                    jk2 jk2Var = (jk2) objArr2[i4];
                    pzm pzmVar2 = (pzm) eqiVar.a[i4];
                    if (jk2Var.n) {
                        adi.b(jk2Var, pzmVar2, hashSet);
                    }
                }
                eqiVar2.i();
                eqiVar.i();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((jk2) it.next()).U0();
                }
                return Unit.a;
            case 18:
                return (efi) gd4.b(((lc4) this.s).k());
            case 19:
                g1k g1kVar = (g1k) CollectionsKt.firstOrNull(((khc) ((x0) ((vgi) this.s).b.a).c).b());
                if (g1kVar != null && (g1kVar instanceof a1k)) {
                    a1k a1kVar = (a1k) g1kVar;
                    if (a1kVar.a == pfg.a) {
                        return a1kVar;
                    }
                }
                return null;
            case 20:
                return ((cyi) this.s).d;
            case 21:
                return ((gyi) this.s).S0();
            case 22:
                ((tjl) ((tyi) this.s).c).getClass();
                return Long.valueOf(SystemClock.uptimeMillis());
            case 23:
                return (kfu) ((a3j) this.s).invoke();
            case 24:
                return (i6j) this.s;
            case 25:
                return (kfu) ((ypb) this.s).invoke();
            case 26:
                Function1 function1 = (Function1) this.s;
                zco zcoVar = f8j.H;
                function1.invoke(zcoVar);
                zcoVar.t = zcoVar.m.I(zcoVar.p, zcoVar.r, zcoVar.q);
                return Unit.a;
            case 27:
                x0q x0qVar = ((kvf) this.s).m;
                Unit unit = Unit.a;
                x0qVar.a(unit);
                return unit;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((tdk) this.s).g = null;
                return Unit.a;
            default:
                ((gek) ((oxa) this.s).b).c();
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ypb(int i, Object obj) {
        super(0);
        this.r = i;
        this.s = obj;
    }
}
