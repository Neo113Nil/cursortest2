package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import coil.view.Scale;
import com.adjust.sdk.Constants;
import com.ybsdk.core.utils.ext.a;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes11.dex */
public abstract class s4b1 {
    public static final void a(bev bevVar, int i, int i2, boolean z) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = z;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        bevVar.c = Integer.valueOf(i);
        kxa1.d(bevVar, i2);
        bevVar.e = new vbv(ref$ObjectRef);
        bev.m(bevVar, "coil#animation_start_callback", new mqu(3, ref$BooleanRef, ref$ObjectRef));
    }

    public static byte[] b(String str) {
        return Base64.decode(str, 0);
    }

    public static final wvn0 c(odn0 odn0Var) {
        r7p0 r7p0Var;
        List list = odn0Var.f;
        Uri uri = odn0Var.a;
        if (list.contains("hub")) {
            return new jvn0(new pxm0("summary", "hub"), uri, false);
        }
        String str = odn0Var.b;
        zzs zzsVar = null;
        if (str != null) {
            String str2 = odn0Var.c;
            if (str2 == null || str2.length() == 0) {
                str2 = null;
            }
            r7p0Var = new r7p0(str, str2);
        } else {
            r7p0Var = null;
        }
        Double d = odn0Var.d;
        if (d != null) {
            double doubleValue = d.doubleValue();
            Double d2 = odn0Var.e;
            if (d2 != null) {
                zzsVar = new zzs(doubleValue, d2.doubleValue(), 0, null, null, 28);
            }
        }
        if (r7p0Var == null || zzsVar == null) {
            return new jvn0(odn0Var.f.contains("qr_superapp") ? new pxm0("main", "qr_superapp") : new pxm0("main", Constants.DEEPLINK), uri, false);
        }
        return new svn0(new pxm0("main", "deeplink_to_destination"), uri, r7p0Var, zzsVar);
    }

    public static String d(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public static final hev e(rbv rbvVar, Context context, boolean z) {
        boolean z2 = rbvVar instanceof jbv;
        if (z2) {
            return e(((jbv) rbvVar).a.a(context), context, z);
        }
        bev bevVar = new bev(context);
        bevVar.a();
        bevVar.o = Boolean.valueOf(z);
        wis0 wis0Var = null;
        if (z2) {
            ny61.r("LateInitImage must be unwrapped before reaching this branch");
            return null;
        }
        if (rbvVar instanceof ibv) {
            bevVar.c = ((ibv) rbvVar).a;
            sjh sjhVar = uyj.a;
            bevVar.q = o400.a.x;
            bevVar.n(wis0.c);
        } else if (rbvVar instanceof nbv) {
            nbv nbvVar = (nbv) rbvVar;
            tev tevVar = nbvVar.b;
            if (tevVar != null) {
                int i = tevVar.a;
                jh91 jh91Var = nkj.a;
                jh91 lkjVar = i > 0 ? new lkj(i) : jh91Var;
                int i2 = tevVar.b;
                if (i2 > 0) {
                    jh91Var = new lkj(i2);
                }
                wis0Var = new wis0(lkjVar, jh91Var);
            }
            bevVar.c = Integer.valueOf(nbvVar.a);
            sjh sjhVar2 = uyj.a;
            bevVar.q = o400.a.x;
            if (wis0Var == null) {
                wis0Var = wis0.c;
            }
            bevVar.n(wis0Var);
        } else if (rbvVar instanceof pbv) {
            pbv pbvVar = (pbv) rbvVar;
            a.e(bevVar, pbvVar.a, pbvVar.c, context);
            bevVar.y = Scale.FILL;
            dcv dcvVar = pbvVar.d;
            if (dcvVar instanceof ccv) {
                bevVar.u = Integer.valueOf(((ccv) dcvVar).a);
                bevVar.v = null;
            } else if (dcvVar instanceof bcv) {
                bevVar.v = ((bcv) dcvVar).a;
                bevVar.u = 0;
            } else if (dcvVar != null) {
                w511.b();
                return null;
            }
            vfv vfvVar = pbvVar.e;
            if (jl40.l(vfvVar, h2b1.G)) {
                bevVar.p(new iub());
            } else if (vfvVar instanceof ufv) {
                ufv ufvVar = (ufv) vfvVar;
                bevVar.p(new jyk0(kp50.s(ufvVar.a), kp50.s(ufvVar.b), kp50.s(ufvVar.c), kp50.s(ufvVar.w)));
            } else if (vfvVar != null) {
                w511.b();
                return null;
            }
            if (pbvVar.f) {
                bevVar.e();
            }
            a.a(bevVar, pbvVar.b);
        } else if (rbvVar instanceof lbv) {
            a(bevVar, ((lbv) rbvVar).a, 0, false);
        } else {
            if (!(rbvVar instanceof mbv)) {
                w511.b();
                return null;
            }
            mbv mbvVar = (mbv) rbvVar;
            a(bevVar, rje.h(context) ? ((mbv) rbvVar).a : ((mbv) rbvVar).b, mbvVar.c, mbvVar.d);
        }
        pva1.d(bevVar, rbvVar, new Exception("Coil ImageRequest built in YbAsyncImage"));
        return bevVar.d();
    }
}
