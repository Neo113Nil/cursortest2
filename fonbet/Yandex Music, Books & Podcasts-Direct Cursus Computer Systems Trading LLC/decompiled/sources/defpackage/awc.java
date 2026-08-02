package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.nfc.tech.IsoDep;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes.dex */
public final class awc implements u97, os3, agg, mv3, emj, gyd, x7o, ipo, m1t, xxf, gdu {
    public Object a;

    public awc(int i) {
        switch (i) {
            case 3:
                this.a = new g06(this);
                break;
            case 9:
                this.a = new vm0(azt.a, Float.valueOf(0.0f), new ym0(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 10:
                this.a = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 12:
                this.a = ff7.J(5);
                break;
            case 14:
                this.a = new Bundle();
                break;
            case 23:
                this.a = Build.VERSION.SDK_INT >= 28 ? new og3(5) : new quk();
                break;
            default:
                this.a = null;
                break;
        }
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        call.getClass();
        zt3 zt3Var = (zt3) this.a;
        r7o r7oVar = z7o.b;
        zt3Var.resumeWith(new t7o(th));
    }

    public void B(String str, String str2) {
        xy0 xy0Var = MediaMetadataCompat.d;
        if (!xy0Var.containsKey(str) || ((Integer) xy0Var.get(str)).intValue() == 1) {
            ((Bundle) this.a).putCharSequence(str, str2);
        } else {
            xq0.x(hrg.q("The ", str, " key cannot be used to put a String"));
        }
    }

    @Override // defpackage.m1t
    public boolean C(mqs mqsVar, int i) {
        mqsVar.getClass();
        d6l x = p6g.x((e6l) ((f7l) this.a).c.getValue());
        n7q n7qVar = x != null ? x.a : null;
        if (n7qVar == null || !((Boolean) wdg.A(n7qVar, bs4.g)).booleanValue() || y7g.B(n7qVar).size() < 2) {
            return false;
        }
        if (f8g.F(n7qVar) != i) {
            return true;
        }
        return ((Boolean) wdg.A(n7qVar, rwd.i)).booleanValue();
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        zt3 zt3Var = (zt3) this.a;
        call.getClass();
        if (!response.a.b()) {
            wp3 wp3Var = new wp3(response);
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(wp3Var));
            return;
        }
        Object obj = response.b;
        if (obj != null) {
            r7o r7oVar2 = z7o.b;
            zt3Var.resumeWith(obj);
            return;
        }
        Object cast = jye.class.cast(call.a().e.get(jye.class));
        if (cast == null) {
            Intrinsics.i();
        }
        cast.getClass();
        Method method = ((jye) cast).a;
        StringBuilder sb = new StringBuilder("Response from ");
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        sb.append(declaringClass.getName());
        sb.append('.');
        sb.append(method.getName());
        sb.append(" was null but response body type was declared as non-null");
        gif gifVar = new gif(sb.toString());
        r7o r7oVar3 = z7o.b;
        zt3Var.resumeWith(new t7o(gifVar));
    }

    @Override // defpackage.m1t
    public sbb E(uu5 uu5Var) {
        return new cx7(new gg5(1, uu5Var));
    }

    public void F(ih4 ih4Var) {
        yee yeeVar = (yee) this.a;
        if (ih4Var.equals(u6o.b) || ih4Var.equals(w6o.b) || ih4Var.equals(y6o.b)) {
            yee.a(yeeVar, ih4Var.a, null, null, 6);
            return;
        }
        if (ih4Var instanceof v6o) {
            yee.a(yeeVar, ih4Var.a, ((v6o) ih4Var).b, null, 4);
        } else if (ih4Var instanceof x6o) {
            yee.a(yeeVar, ih4Var.a, null, ((x6o) ih4Var).b.a, 2);
        } else {
            b6e.s();
        }
    }

    public void G(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            xq0.x("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y6n y6nVar = (y6n) it.next();
            if (!"play_pass_subs".equals(y6nVar.b)) {
                hashSet.add(y6nVar.b);
            }
        }
        if (hashSet.size() <= 1) {
            this.a = i6x.v(arrayList);
        } else {
            xq0.x("All products should be of the same product type.");
        }
    }

    public byte[] H(byte[] bArr) {
        try {
            byte[] transceive = ((IsoDep) this.a).transceive(bArr);
            transceive.getClass();
            if (transceive.length > 2) {
                byte[] bArr2 = new byte[transceive.length - 2];
                int length = transceive.length - 2;
                for (int i = 0; i < length; i++) {
                    bArr2[i] = 0;
                }
                System.arraycopy(transceive, 0, bArr2, 0, transceive.length - 2);
            }
            return transceive;
        } catch (Exception e) {
            throw new pg5(e.getMessage());
        }
    }

    public void I(float f, jx7 jx7Var, mm6 mm6Var) {
        if (f <= jx7Var.n0(huf.a)) {
            return;
        }
        b2r G = wyf.G();
        Continuation continuation = null;
        Function1 e = G != null ? G.e() : null;
        b2r Q = wyf.Q(G);
        try {
            float floatValue = ((Number) ((vm0) this.a).b.getValue()).floatValue();
            vm0 vm0Var = (vm0) this.a;
            if (vm0Var.f) {
                this.a = wdp.Z(vm0Var, floatValue - f, 0.0f, 30);
                x97.y(mm6Var, null, null, new guf(this, continuation, 0), 3);
            } else {
                this.a = new vm0(azt.a, Float.valueOf(-f), null, 60);
                x97.y(mm6Var, null, null, new guf(this, continuation, 1), 3);
            }
            wyf.b0(G, Q, e);
        } catch (Throwable th) {
            wyf.b0(G, Q, e);
            throw th;
        }
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        scv scvVar = (scv) this.a;
        byte d = om3Var.d();
        boolean z = (d & 128) == 128;
        scvVar.d = z;
        int i = d & Byte.MAX_VALUE;
        scvVar.h = i;
        if (i < 0 || i > 125) {
            scvVar.g = i == 126 ? 2 : 8;
            scvVar.b = 2;
        } else {
            scvVar.b = z ? 3 : 4;
        }
        scvVar.h();
    }

    @Override // defpackage.xxf
    public u8q a() {
        return ((PreselectActivity) this.a).C();
    }

    @Override // defpackage.xxf
    public Object b(o oVar, Class cls) {
        return ((rsd) qld.y(oVar)).a().b(s79.class);
    }

    @Override // defpackage.ipo
    public void c(ft7 ft7Var, String str) {
        ft7Var.getClass();
        str.getClass();
        qdq.A(new jgk((ozw) this.a, ft7Var, str, 0));
    }

    @Override // defpackage.xxf
    public void d() {
        ((ohk) ((PreselectActivity) this.a).D()).e.setVisibility(8);
    }

    @Override // defpackage.gdu
    public int e(View view) {
        return yon.V(view) - ((ViewGroup.MarginLayoutParams) ((zon) view.getLayoutParams())).leftMargin;
    }

    @Override // defpackage.gdu
    public int f() {
        return ((yon) this.a).c0();
    }

    @Override // defpackage.m1t
    public sbb g(int i, uu5 uu5Var) {
        return new bx7(new as7(uu5Var, i, 3));
    }

    @Override // defpackage.m1t
    public boolean h() {
        return false;
    }

    @Override // defpackage.agg
    public Drawable i(Drawable drawable) {
        return (Drawable) this.a;
    }

    @Override // defpackage.mv3
    public void j(lv3 lv3Var) {
        lv3Var.getClass();
        ((j3j) this.a).l.l(lv3Var);
    }

    @Override // defpackage.gyd
    public void k(hiu hiuVar) {
        awc awcVar = ((w1k) this.a).f;
        awcVar.getClass();
        ((g06) awcVar.a).R(hiuVar instanceof fiu ? (fiu) hiuVar : null, new y5(13, hiuVar));
    }

    @Override // defpackage.emj
    public void l() {
        Activity activity = (Activity) this.a;
        int i = CollectionMainActivity.v0;
        activity.startActivity(men.B(activity, v35.l));
    }

    @Override // defpackage.gdu
    public int m() {
        yon yonVar = (yon) this.a;
        return yonVar.n - yonVar.d0();
    }

    @Override // defpackage.emj
    public void o() {
        lhs lhsVar = MainScreenActivity.Q0;
        Activity activity = (Activity) this.a;
        activity.startActivity(imp.J(activity, rf3.l, null, w6h.a, 4));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r3v13, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        kn knVar = (kn) obj;
        knVar.getClass();
        dn9 dn9Var = (dn9) this.a;
        if (knVar instanceof gn) {
            int i = ubk.a[((gn) knVar).a.ordinal()];
            ((uif) dn9Var.b).invoke(Integer.valueOf(R.string.paymentsdk_success_title));
        } else {
            if (knVar instanceof hn) {
                ((uif) dn9Var.c).invoke(((hn) knVar).a);
                return;
            }
            if (knVar instanceof fn) {
                ((uif) dn9Var.d).invoke();
            } else if (knVar instanceof in) {
                ((uif) dn9Var.e).invoke(((in) knVar).a);
            } else {
                knVar.equals(jn.a);
            }
        }
    }

    @Override // defpackage.mv3
    public void p(k5 k5Var) {
        ((j3j) this.a).n = k5Var;
    }

    @Override // defpackage.gdu
    public View q(int i) {
        return ((yon) this.a).P(i);
    }

    @Override // defpackage.gdu
    public int r(View view) {
        return yon.Y(view) + ((ViewGroup.MarginLayoutParams) ((zon) view.getLayoutParams())).rightMargin;
    }

    @Override // defpackage.emj
    public void s() {
        Bundle K;
        Activity activity = (Activity) this.a;
        jyr jyrVar = t5j.e;
        boolean M = wyf.M();
        if (M) {
            K = rvf.w(o8g.R(new s9p(t75.c(r9p.a))), false);
        } else if (M) {
            b6e.s();
            return;
        } else {
            List d = StationId.d(StationId.f("user:onyourwave"), null);
            d.getClass();
            K = cxb.K(new Pair("landing.type.queue", new hi7(d, false)));
        }
        lhs lhsVar = MainScreenActivity.Q0;
        activity.startActivity(imp.J(activity, M ? rf3.m : rf3.h, K, null, 8));
    }

    public z6n t() {
        if (((i6x) this.a) != null) {
            return new z6n(this);
        }
        xq0.x("Product list must be set to a non empty list.");
        return null;
    }

    public x0q u(pfg pfgVar) {
        g06 g06Var = (g06) this.a;
        int ordinal = pfgVar.ordinal();
        if (ordinal == 1) {
            return ((fyd) g06Var.a).b;
        }
        if (ordinal == 2) {
            return ((fyd) g06Var.b).b;
        }
        xq0.x("invalid load type for hints");
        return null;
    }

    @Override // defpackage.m1t
    public Object v(mqs mqsVar, Continuation continuation) {
        return Boolean.FALSE;
    }

    public void w(mhc mhcVar, szm szmVar) {
        z(mhcVar, hyf.u(szmVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        ((uif) ((dn9) this.a).f).invoke(bfkVar);
    }

    @Override // defpackage.xxf
    public fs7 y() {
        return new fs7(26);
    }

    public void z(Object obj, rzm rzmVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        a4g.r(rzmVar, "provider");
        linkedHashMap.put(obj, rzmVar);
    }

    @Override // defpackage.xxf
    public void n(boolean z) {
    }

    public /* synthetic */ awc(Object obj) {
        this.a = obj;
    }

    public awc(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.a = bundle;
        osh.C(bundle);
    }
}
