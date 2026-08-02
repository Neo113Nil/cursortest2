package defpackage;

import android.content.Context;
import android.os.StatFs;
import com.yandex.go.overdraft.api.domain.model.OverdraftContext;
import com.yandex.go.overdraft.domain.e;
import com.yandex.go.overdraft.domain.h;
import com.yandex.go.overdraft.domain.o;
import com.yandex.go.overdraft.g;
import com.yandex.go.payments.badges.a;
import com.yandex.go.payments.superapp.payment.b;
import com.yandex.go.yb.data.u;
import com.yandex.mapkit.map.Map;
import com.yandex.messaging.paging.PagedLoader$LoadType;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.payment.sdk.ui.view.Default3DSWebView;
import java.util.Iterator;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.rt.ebs.cryptosdk.entities.exceptions.InstructionHandlerException;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;
import ru.rt.ebs.cryptosdk.presentation.biometry_capturing.photoRecording.PhotoRecordingFragment;

/* loaded from: classes13.dex */
public final class yj70 implements uw70, v790, ryj0, b88, efm0, b4z, z2v, q1c0 {
    public final Object a;

    public /* synthetic */ yj70(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qg90 j(Integer num, g8l0 g8l0Var, List list) {
        qg90 qg90Var;
        Object obj;
        qg90 qg90Var2 = null;
        if (g8l0Var == null || list == null) {
            qg90Var = null;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((qg90) obj).b.equals(g8l0Var)) {
                    break;
                }
            }
            qg90Var = (qg90) obj;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    g8l0 g8l0Var2 = ((qg90) next).b;
                    int i = g8l0Var2.a;
                    if (intValue <= g8l0Var2.b && i <= intValue) {
                        qg90Var2 = next;
                        break;
                    }
                }
                qg90Var2 = qg90Var2;
            }
        }
        return qg90Var == null ? qg90Var2 : qg90Var;
    }

    @Override // defpackage.v790
    public void F(w790 w790Var) {
        b890 b890Var = (b890) this.a;
        b890Var.b.postDelayed(new ud30(9, b890Var, PagedLoader$LoadType.APPEND, w790Var), 0L);
    }

    @Override // defpackage.q1c0
    public float a() {
        return ((Map) this.a).getCameraPosition().getZoom();
    }

    @Override // defpackage.efm0
    public void b(anh anhVar, String str) {
        n891.n(new uga0((ljh) this.a, anhVar, str, 0));
    }

    public void c(on70 on70Var) {
        g gVar = (g) this.a;
        mz80 mz80Var = gVar.a0;
        if (mz80Var != null) {
            mz80Var.a(on70Var);
        }
        gVar.r(new qu(9));
    }

    @Override // defpackage.b88
    public void d(Context context, qq31 qq31Var) {
        qq31Var.invoke(new Default3DSWebView(context, ((pwf) ((PaymentActivity) this.a).getBaseComponent$paymentsdk_release()).c()));
    }

    public long e() {
        r0r r0rVar = (r0r) this.a;
        try {
            if (r0rVar instanceof r0r) {
                return new StatFs(r0rVar.b.c.getParentFile().getPath()).getAvailableBytes();
            }
            throw new AssertionError("Unknown OutputOptions: " + r0rVar);
        } catch (RuntimeException unused) {
            sgb1.g(5, "OutputStorageImpl");
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
    }

    @Override // defpackage.z2v
    public void f() {
        PhotoRecordingFragment.access$getViewModel((PhotoRecordingFragment) this.a).f0(fib0.a);
    }

    @Override // defpackage.z2v
    public void g() {
        CryptoSdkDesign cryptoSdkDesign;
        PhotoRecordingFragment photoRecordingFragment = (PhotoRecordingFragment) this.a;
        Context context = photoRecordingFragment.getContext();
        if (context != null) {
            cryptoSdkDesign = photoRecordingFragment.getCryptoSdkDesign();
            PhotoRecordingFragment.access$getViewModel(photoRecordingFragment).f0(new cib0(z2a1.f(context, cryptoSdkDesign), photoRecordingFragment.getString(kzh0.ebssdk_pre_instructions_for_photo)));
        }
    }

    @Override // defpackage.z2v
    public void h(InstructionHandlerException instructionHandlerException) {
        PhotoRecordingFragment.access$getViewModel((PhotoRecordingFragment) this.a).f0(new hao(instructionHandlerException));
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((tls) ((v920) this.a).y).invoke((PaymentKitError) obj);
    }

    public void k() {
        h0a0 h0a0Var;
        g gVar = (g) this.a;
        j4n j4nVar = gVar.Z;
        if (j4nVar == null) {
            return;
        }
        c0g c0gVar = (c0g) ((i6r) j4nVar.a);
        sz80 sz80Var = (sz80) c0gVar.z.H8.get();
        q5z.h(sz80Var);
        fz80 fz80Var = new fz80(new aq80(sz80Var), (yj70) j4nVar.b, j4nVar.D(), j4nVar.F(), (OverdraftContext) j4nVar.c);
        nw70 nw70Var = new nw70(5, j4nVar.E());
        h E = j4nVar.E();
        e n = j4nVar.n();
        zzf zzfVar = c0gVar.z;
        zzf zzfVar2 = c0gVar.z;
        u uVar = (u) zzfVar.V1.get();
        q5z.h(uVar);
        o oVar = new o(E, n, uVar);
        yy80 D = j4nVar.D();
        z4g z4gVar = (z4g) j4nVar.w;
        h3y a = i5m.a((z4g) j4nVar.x);
        com.yandex.go.overdraft.domain.g gVar2 = (com.yandex.go.overdraft.domain.g) zzfVar2.Xo.get();
        q5z.h(gVar2);
        cba0 cba0Var = (cba0) zzfVar2.vj.get();
        tse tseVar = (tse) c0gVar.B.get();
        q5z.h(tseVar);
        a x1 = c0gVar.x1();
        wiq0 c6 = c0gVar.c6();
        q5z.h(c6);
        f9y0 f9y0Var = (f9y0) c0gVar.Z6.a;
        q5z.h(f9y0Var);
        jb7 w5 = c0gVar.w5();
        b bVar = new b(i5m.a(c0gVar.b0), (cy90) c0gVar.h6.a, (vyz) c0gVar.j6.a, (a30) c0gVar.k6.get());
        ql21 ql21Var = (ql21) zzfVar2.I8.get();
        q5z.h(ql21Var);
        sz80 sz80Var2 = (sz80) zzfVar2.H8.get();
        q5z.h(sz80Var2);
        com.yandex.go.overdraft.e eVar = new com.yandex.go.overdraft.e(fz80Var, nw70Var, oVar, D, z4gVar, a, gVar2, cba0Var, tseVar, x1, c6, f9y0Var, w5, bVar, ql21Var, sz80Var2, (OverdraftContext) j4nVar.c);
        Object obj = gVar.x;
        pz80 pz80Var = obj instanceof pz80 ? (pz80) obj : null;
        if (pz80Var == null || (h0a0Var = pz80Var.c) == null) {
            h0a0Var = h0a0.c;
        }
        gVar.D(eVar, h0a0Var, new lz80(gVar, 1));
    }

    public edb0 l(zcb0 zcb0Var, boolean z) {
        gdb0 gdb0Var = (gdb0) this.a;
        if (zcb0Var instanceof xcb0) {
            return z ? ddb0.a : gdb0Var.a((xcb0) zcb0Var);
        }
        if (!(zcb0Var instanceof ycb0)) {
            w511.b();
            return null;
        }
        ycb0 ycb0Var = (ycb0) zcb0Var;
        gdb0Var.getClass();
        return new bdb0(ycb0Var.b, ycb0Var.a);
    }

    @Override // defpackage.v790
    public void onError() {
        b890 b890Var = (b890) this.a;
        b890Var.b.post(new sd30(26, b890Var, PagedLoader$LoadType.APPEND));
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        int i;
        ym0 ym0Var = (ym0) obj;
        v920 v920Var = (v920) this.a;
        if (ym0Var instanceof um0) {
            if (ss90.a[((um0) ym0Var).a.ordinal()] == 1) {
                xry0 xry0Var = yry0.a;
                i = yry0.a.q;
            } else {
                xry0 xry0Var2 = yry0.a;
                i = yry0.a.c;
            }
            ((tls) ((v920) this.a).a).invoke(Integer.valueOf(i));
            return;
        }
        if (ym0Var instanceof vm0) {
            ((tls) v920Var.b).invoke(((vm0) ym0Var).a);
            return;
        }
        if (ym0Var instanceof tm0) {
            ((sls) v920Var.c).invoke();
        } else if (ym0Var instanceof wm0) {
            ((tls) v920Var.x).invoke(((wm0) ym0Var).a);
        } else {
            if (ym0Var.equals(xm0.a)) {
                return;
            }
            w511.b();
        }
    }
}
