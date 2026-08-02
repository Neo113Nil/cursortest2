package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.connectsdk.service.airplay.PListParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.gms.common.api.Status;
import io.appmetrica.analytics.IReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public abstract class op2 extends hq0 {
    public m37 c;
    public Integer d;
    public Intent e;
    public lum f;
    public final jyr a = btf.b(new hp2(this, 0));
    public final jyr b = btf.b(new hp2(this, 2));
    public final jyr g = btf.b(new hp2(this, 1));
    public final fp2 h = new fp2(this, 0);

    public static /* synthetic */ void t(op2 op2Var, o oVar, boolean z, int i, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = R.id.fragment_container;
        }
        op2Var.s(oVar, z, i);
    }

    public final void j() {
        int H = getSupportFragmentManager().H() + 1;
        for (int i = 0; i < H; i++) {
            getSupportFragmentManager().W(-1, 1);
        }
    }

    public final void k() {
        if (this.d == null) {
            v(0, new Intent().putExtra("CODE", "NOT_STARTED"));
        }
        Intent intent = this.e;
        String stringExtra = intent != null ? intent.getStringExtra("MESSAGE") : null;
        Integer num = this.d;
        num.getClass();
        int intValue = num.intValue();
        if (intValue == -1) {
            u(gut.s(lkp.success, stringExtra));
        } else if (intValue != 0) {
            u(gut.s(lkp.failed, stringExtra));
        } else {
            u(gut.s(lkp.canceled, stringExtra));
        }
        finish();
    }

    public final p77 l() {
        return (p77) this.a.getValue();
    }

    public final boolean m() {
        Boolean bool = l().a().y;
        return bool != null ? bool.booleanValue() : n7w.R(q6c.h);
    }

    public abstract BroadcastReceiver n();

    @Override // androidx.fragment.app.t, defpackage.hn5, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        p1c D;
        super.onActivityResult(i, i2, intent);
        if (i == 663) {
            lnd lndVar = gp2.c;
            if (lndVar != null) {
                ond ondVar = lndVar.e;
                if (ondVar != null) {
                    if (i2 != -1) {
                        if (i2 == 0) {
                            Parcelable.Creator<bfk> creator = bfk.CREATOR;
                            ondVar.a(new p1c(q1c.t, r1c.a, null, "undo", "GooglePay was undo"));
                        } else if (i2 != 1) {
                            ondVar.e = null;
                        } else {
                            int i3 = q92.b;
                            Status status = intent == null ? null : (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
                            if (status == null || status.a != 10) {
                                Parcelable.Creator<bfk> creator2 = bfk.CREATOR;
                                D = y7g.D();
                            } else {
                                Parcelable.Creator<bfk> creator3 = bfk.CREATOR;
                                D = new p1c(q1c.t, r1c.a, null, "developer error", "GooglePay request returned developer error");
                            }
                            ondVar.a(D);
                        }
                    } else if (intent != null) {
                        Parcelable.Creator<kek> creator4 = kek.CREATOR;
                        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                        kek kekVar = (kek) (byteArrayExtra == null ? null : asq.A(byteArrayExtra, creator4));
                        String str = kekVar != null ? kekVar.g : null;
                        if (str == null) {
                            Parcelable.Creator<bfk> creator5 = bfk.CREATOR;
                            ondVar.a(y7g.D());
                        } else {
                            try {
                                String string = new JSONObject(str).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token");
                                string.getClass();
                                nnd nndVar = ondVar.e;
                                if (nndVar != null) {
                                    nndVar.onSuccess(string);
                                }
                                ondVar.e = null;
                            } catch (JSONException unused) {
                                Parcelable.Creator<bfk> creator6 = bfk.CREATOR;
                                ondVar.a(y7g.D());
                            }
                        }
                    } else {
                        Parcelable.Creator<bfk> creator7 = bfk.CREATOR;
                        ondVar.a(y7g.D());
                    }
                }
                lndVar.e = null;
            }
            gp2.c = null;
        }
        if (i == 1111 && i2 == 1000) {
            finish();
        }
    }

    @Override // androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        Parcelable[] parcelableArray;
        int i = 0;
        if (bundle != null && (parcelableArray = bundle.getParcelableArray("flags_state")) != null) {
            for (Parcelable parcelable : parcelableArray) {
                if (parcelable instanceof r6k) {
                    fhc fhcVar = fhc.b;
                    r6k r6kVar = (r6k) parcelable;
                    String str2 = r6kVar.b;
                    String str3 = r6kVar.a;
                    fhcVar.getClass();
                    str3.getClass();
                    if (((zn0) fhcVar.a.get(str3)) == null) {
                        if (str3.equals((String) pek.a.b) || str3.equals((String) ygc.a.b)) {
                            lc3 lc3Var = ygc.a;
                            fhcVar.a(new lc3(str3, Boolean.valueOf(Intrinsics.d(str2, PListParser.TAG_TRUE)), i));
                        } else {
                            fhcVar.a(fgq.F(str3, str2));
                        }
                    }
                }
            }
        }
        int a = hmd.a(this);
        setTheme(a);
        getApplicationContext().setTheme(a);
        super.onCreate(bundle);
        v(0, new Intent().putExtra("CODE", "NOT_STARTED"));
        getSupportFragmentManager().o.add(this.h);
        ehk ehkVar = (ehk) getIntent().getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN");
        if (ehkVar != null && (str = ehkVar.a) != null) {
            x60 x60Var = (x60) l().w.get();
            x60Var.getClass();
            x60Var.b.a.put("payment_token", str);
        }
        phg a2 = phg.a(this);
        a2.getClass();
        a2.b(n(), new IntentFilter("com.yandex.payment.sdk.ui.ui.notification.DISMISS_PAYMENT_INTERFACE"));
        if (!y(bundle)) {
            u7g.a = null;
            u7g.b = null;
            gp2.c = null;
        }
        if (n7w.R(q6c.e) && n7w.R(q6c.m)) {
            s77 s77Var = (s77) this.b.getValue();
            s77Var.getClass();
            n37 n37Var = (n37) s77Var.A.get();
            this.c = n37Var != null ? new m37(n37Var.a) : null;
        }
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        phg a = phg.a(this);
        a.getClass();
        a.d(n());
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.o.remove(this.h);
        ((atj) l().i.get()).d();
        super.onDestroy();
    }

    @Override // defpackage.hn5, android.app.Activity
    public void onNewIntent(Intent intent) {
        lum lumVar;
        intent.getClass();
        super.onNewIntent(intent);
        if (!intent.getBooleanExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_PROCESS_FINAL_STATE", false) || (lumVar = this.f) == null) {
            return;
        }
        lumVar.Y((vdc) intent.getParcelableExtra("com.yandex.payment.sdk.ui.network.extra.EXTRA_PAYMENT_FINAL_STATE_RESULT"));
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onPause() {
        IReporter a;
        z3i z3iVar = z3i.c;
        if (z3iVar != null && (a = z3iVar.a()) != null) {
            a.pauseSession();
        }
        g0c c = l().c();
        qne m = gut.m();
        x60 x60Var = (x60) c;
        x60Var.getClass();
        x60Var.a(m);
        super.onPause();
    }

    @Override // androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        IReporter a;
        super.onResume();
        z3i z3iVar = z3i.c;
        if (z3iVar != null && (a = z3iVar.a()) != null) {
            a.resumeSession();
        }
        g0c c = l().c();
        qne n = gut.n();
        x60 x60Var = (x60) c;
        x60Var.getClass();
        x60Var.a(n);
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        r6k r6kVar;
        bundle.getClass();
        LinkedHashMap linkedHashMap = fhc.b.a;
        linkedHashMap.getClass();
        ArrayList x0 = CollectionsKt.x0(CollectionsKt.z0(linkedHashMap.values()));
        ArrayList arrayList = new ArrayList();
        Iterator it = x0.iterator();
        while (it.hasNext()) {
            zn0 zn0Var = (zn0) it.next();
            String str = (String) zn0Var.b;
            xn0 xn0Var = zn0Var.d;
            if (Intrinsics.d(str, (String) pek.a.b) || Intrinsics.d(str, (String) ygc.a.b)) {
                Object invoke = xn0Var.invoke();
                r6kVar = new r6k(str, Intrinsics.d(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE) ? PListParser.TAG_TRUE : PListParser.TAG_FALSE);
            } else {
                Object invoke2 = xn0Var.invoke();
                String str2 = invoke2 instanceof String ? (String) invoke2 : null;
                if (str2 == null) {
                    str2 = zn0Var.c.toString();
                }
                r6kVar = new r6k(str, str2);
            }
            arrayList.add(r6kVar);
        }
        bundle.putParcelableArray("flags_state", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        boolean z;
        super.onStart();
        if (n7w.R(q6c.g)) {
            o C = getSupportFragmentManager().C(R.id.fragment_container);
            if (!(C instanceof a13) && !((z = C instanceof u07)) && !z) {
                getWindow().setFlags(0, RemoteCameraConfig.Notification.ID);
                return;
            }
        }
        getWindow().setFlags(RemoteCameraConfig.Notification.ID, RemoteCameraConfig.Notification.ID);
    }

    @Override // defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        super.onStop();
        getWindow().setFlags(0, RemoteCameraConfig.Notification.ID);
    }

    public final void p() {
        er0 er0Var = (er0) getDelegate();
        er0Var.A();
        View findViewById = er0Var.l.findViewById(R.id.loading_fragment_container);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public final void q() {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.x(new auc(supportFragmentManager, null, -1, 1), false);
    }

    public final void r(int i) {
        o C = getSupportFragmentManager().C(i);
        if (C != null) {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.m(C);
            aVar.k(true, true);
        }
    }

    public final void s(o oVar, boolean z, int i) {
        oVar.getClass();
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        a aVar = new a(supportFragmentManager);
        if (z) {
            aVar.c(null);
        }
        if (n7w.R(q6c.d)) {
            aVar.g(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
        }
        aVar.e(i, oVar, oVar.getClass().getName());
        aVar.k(true, true);
    }

    public final void u(qne qneVar) {
        ((x60) l().c()).a(qneVar);
    }

    public final void v(int i, Intent intent) {
        this.d = Integer.valueOf(i);
        if (intent == null) {
            intent = new Intent();
        }
        this.e = intent;
        setResult(i, intent);
    }

    public final void w(bfk bfkVar) {
        bfkVar.getClass();
        Intent putExtra = new Intent().putExtra("ERROR", (Parcelable) bfkVar);
        String str = bfkVar.d;
        v(1, putExtra.putExtra("CODE", str != null ? str : "ERROR").putExtra("MESSAGE", bfkVar.e));
    }

    public final void x(Parcelable parcelable) {
        v(-1, parcelable != null ? new Intent().putExtra("DATA", parcelable) : null);
    }

    public boolean y(Bundle bundle) {
        return bundle != null;
    }

    public abstract void z();
}
