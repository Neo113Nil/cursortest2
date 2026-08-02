package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import android.content.Context;
import defpackage.aoi;
import defpackage.b801;
import defpackage.c1x0;
import defpackage.c9v;
import defpackage.cf00;
import defpackage.cjw0;
import defpackage.cxm;
import defpackage.czh;
import defpackage.e100;
import defpackage.ef00;
import defpackage.ey4;
import defpackage.gzh;
import defpackage.hf00;
import defpackage.hwy0;
import defpackage.imc;
import defpackage.itq;
import defpackage.izh;
import defpackage.j00;
import defpackage.j770;
import defpackage.jwh;
import defpackage.kbg;
import defpackage.kcz0;
import defpackage.kfz0;
import defpackage.lfz0;
import defpackage.mfz0;
import defpackage.osq;
import defpackage.q5z;
import defpackage.st2;
import defpackage.syc;
import defpackage.tpr;
import defpackage.w511;
import defpackage.z501;
import defpackage.ziq0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;

/* loaded from: classes5.dex */
public final class e implements b801 {
    public final itq a;
    public final imc b;
    public final j00 c;
    public final osq d;
    public final LocalFeedbackRepository e;
    public final ru.yandex.taxi.logistics.sdk.tracking.impl.data.c f;
    public final kcz0 g;
    public final e100 h;
    public final ru.yandex.taxi.logistics.payment.a i;
    public final st2 j;
    public final j770 k;
    public final tpr l;

    public e(ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e eVar, itq itqVar, imc imcVar, j00 j00Var, osq osqVar, LocalFeedbackRepository localFeedbackRepository, ru.yandex.taxi.logistics.sdk.tracking.impl.data.c cVar, kcz0 kcz0Var, e100 e100Var, ru.yandex.taxi.logistics.payment.a aVar, st2 st2Var, j770 j770Var) {
        this.a = itqVar;
        this.b = imcVar;
        this.c = j00Var;
        this.d = osqVar;
        this.e = localFeedbackRepository;
        this.f = cVar;
        this.g = kcz0Var;
        this.h = e100Var;
        this.i = aVar;
        this.j = st2Var;
        this.k = j770Var;
        this.l = kotlinx.coroutines.flow.e.t(new m0(new ey4(new syc(eVar.e, 13), 9), localFeedbackRepository.f, new FeedbackStateHolder$widgetModelFlow$2(this, null)));
    }

    @Override // defpackage.b801
    public final tpr a() {
        return this.l;
    }

    public final void b(mfz0 mfz0Var) {
        if (mfz0Var instanceof lfz0) {
            lfz0 lfz0Var = (lfz0) mfz0Var;
            ziq0 ziq0Var = new ziq0(lfz0Var.a, lfz0Var.c);
            r0 r0Var = this.e.b;
            r0Var.getClass();
            r0Var.m(null, ziq0Var);
            return;
        }
        if (!(mfz0Var instanceof kfz0)) {
            w511.b();
            return;
        }
        e100 e100Var = this.h;
        czh create = ((gzh) e100Var.c).create();
        c9v c9vVar = (c9v) e100Var.w;
        String str = (String) e100Var.b;
        cf00 cf00Var = new cf00(str);
        hf00 hf00Var = new hf00(create);
        kbg a = ((z501) c9vVar.c).a(str);
        ef00 ef00Var = (ef00) c9vVar.b;
        ef00Var.getClass();
        q5z.h(ef00Var.b);
        Context context = ef00Var.a;
        q5z.h(context);
        jwh jwhVar = ef00Var.d;
        q5z.h(jwhVar);
        LocalFeedbackRepository localFeedbackRepository = (LocalFeedbackRepository) a.r.get();
        q5z.h(localFeedbackRepository);
        ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e b = a.b();
        q5z.h(b);
        j00 j00Var = new j00(b);
        ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e b2 = a.b();
        q5z.h(b2);
        ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e b3 = a.b();
        q5z.h(b3);
        ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.b bVar = new ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui.b(hf00Var, jwhVar, localFeedbackRepository, j00Var, new c1x0(new cjw0(b2, new j00(b3))));
        hwy0 hwy0Var = ef00Var.c;
        q5z.h(hwy0Var);
        czh.a(create, new izh(new cxm(new aoi(new e100(2, context, bVar, hwy0Var), cf00Var, hf00Var)), null, null, null, null, null, 8190));
    }

    @Override // defpackage.b801
    public final String getKey() {
        return "feedback-key";
    }
}
