package ru.yandex.taxi.clarifypoint;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.czo0;
import defpackage.dbl0;
import defpackage.en11;
import defpackage.evu0;
import defpackage.hbp0;
import defpackage.is60;
import defpackage.jbh;
import defpackage.mth;
import defpackage.mzb;
import defpackage.nyb;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.qbl0;
import defpackage.rqo;
import defpackage.t41;
import defpackage.tpr;
import defpackage.wiq0;
import defpackage.yal0;
import defpackage.yyb;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes6.dex */
public final class b {
    public final nyb a;
    public final qbl0 b;
    public final wiq0 c;
    public final c d;
    public final t41 e;
    public final ru.yandex.taxi.persuggest.clarifypoints.a f;
    public final com.yandex.go.navigation.screen.c g;
    public final mzb h;
    public final en11 i;
    public final a j = new Runnable() { // from class: ru.yandex.taxi.clarifypoint.a
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
        
            if (r1.a().equals(r0) != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            if (r3.contains(r1.a()) != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
        
            if (r5.d.d() == null) goto L31;
         */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, mth] */
        /* JADX WARN: Type inference failed for: r1v11, types: [T, mth] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            ServiceLevel h;
            b bVar = b.this;
            qbl0 qbl0Var = bVar.b;
            if (((yyb) bVar.i.b()).b && bVar.g.g()) {
                dbl0 b = qbl0Var.b();
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = qbl0Var.a();
                if (b != null) {
                    yal0 yal0Var = b.a;
                    pex0 m = ((k) bVar.c).m();
                    if (m != null && (h = yal0Var.h(m.n)) != null) {
                        String str = h.S;
                        ArrayList arrayList = new ArrayList();
                        if (str != null && !evu0.J(str)) {
                            is60 is60Var = m.J0.b;
                            if (is60Var.b) {
                            }
                        }
                    }
                    ref$ObjectRef.element = new mth((tpr) ref$ObjectRef.element, 4);
                }
                pzt0 pzt0Var = bVar.m;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar.m = hbp0.e(bVar.l, null, null, new ClarifyPointControllerImpl$subscribeToRouteStats$2(ref$ObjectRef, bVar, null), 3);
            }
        }
    };
    public final Handler k = new Handler(Looper.getMainLooper());
    public final hbp0 l = new hbp0(new czo0(14), "", null);
    public pzt0 m;

    /* JADX WARN: Type inference failed for: r1v3, types: [ru.yandex.taxi.clarifypoint.a] */
    public b(nyb nybVar, qbl0 qbl0Var, wiq0 wiq0Var, c cVar, t41 t41Var, ru.yandex.taxi.persuggest.clarifypoints.a aVar, com.yandex.go.navigation.screen.c cVar2, mzb mzbVar, rqo rqoVar) {
        this.a = nybVar;
        this.b = qbl0Var;
        this.c = wiq0Var;
        this.d = cVar;
        this.e = t41Var;
        this.f = aVar;
        this.g = cVar2;
        this.h = mzbVar;
        this.i = ((jbh) rqoVar).b(yyb.e);
    }

    public final void a() {
        hbp0 hbp0Var = this.l;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new ClarifyPointControllerImpl$resume$1(null, this), 3);
        hbp0.e(hbp0Var, null, null, new ClarifyPointControllerImpl$resume$2(null, this), 3);
    }
}
