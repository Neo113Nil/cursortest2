package com.yandex.payment.sdk.ui.bind;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.os.Parcelable;
import com.connectsdk.service.DeviceService;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import defpackage.bfk;
import defpackage.bnd;
import defpackage.ci0;
import defpackage.end;
import defpackage.ern;
import defpackage.f1d;
import defpackage.ind;
import defpackage.kib;
import defpackage.knd;
import defpackage.l83;
import defpackage.mif;
import defpackage.mvn;
import defpackage.op2;
import defpackage.qee;
import defpackage.qjb;
import defpackage.r1f;
import defpackage.su4;
import defpackage.tdk;
import defpackage.vtm;
import defpackage.wwj;
import defpackage.y7g;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public class BindGooglePayActivity extends op2 {
    @Override // defpackage.op2
    public final BroadcastReceiver n() {
        return new l83(4, this);
    }

    @Override // defpackage.op2, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wwj wwjVar = (wwj) getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.ORDER_DATA");
        ind indVar = l().a().m;
        if (wwjVar == null || indVar == null) {
            Parcelable.Creator<bfk> creator = bfk.CREATOR;
            StringBuilder m = f1d.m("Failed to init \"", ern.a(BindGooglePayActivity.class).h(), "\". OrderDetails is ", wwjVar != null ? wwjVar.getClass().getSimpleName() : null, ", Google Pay data is ");
            m.append(indVar);
            m.append(".");
            w(y7g.F(m.toString()));
            k();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Открытие формы GooglePay", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        u(su4.j(k, "event_name", "open_google_pay_dialog", "open_google_pay_dialog", k));
        Object obj = kib.a;
        a a = kib.a(l().b());
        if (a != null) {
            a.a(mvn.h);
        }
        end endVar = ((tdk) l().f()).i;
        bnd bndVar = new bnd(10, this);
        endVar.getClass();
        mif.b(endVar.a.a(wwjVar), new knd(bndVar, 0), new knd(bndVar, 1), 1);
    }
}
