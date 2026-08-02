package defpackage;

import android.util.Log;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class lhb extends uif implements Function1 {
    public static final lhb A;
    public static final lhb A0;
    public static final lhb B;
    public static final lhb B0;
    public static final lhb C;
    public static final lhb D;
    public static final lhb E;
    public static final lhb F;
    public static final lhb G;
    public static final lhb H;
    public static final lhb I;
    public static final lhb J;
    public static final lhb K;
    public static final lhb L;
    public static final lhb X;
    public static final lhb Y;
    public static final lhb Z;
    public static final lhb s;
    public static final lhb t;
    public static final lhb u;
    public static final lhb v;
    public static final lhb v0;
    public static final lhb w;
    public static final lhb w0;
    public static final lhb x;
    public static final lhb x0;
    public static final lhb y;
    public static final lhb y0;
    public static final lhb z;
    public static final lhb z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new lhb(i, 0);
        t = new lhb(i, 1);
        u = new lhb(i, 2);
        v = new lhb(i, 3);
        w = new lhb(i, 4);
        x = new lhb(i, 5);
        y = new lhb(i, 6);
        z = new lhb(i, 7);
        A = new lhb(i, 8);
        B = new lhb(i, 9);
        C = new lhb(i, 10);
        D = new lhb(i, 11);
        E = new lhb(i, 12);
        F = new lhb(i, 13);
        G = new lhb(i, 14);
        H = new lhb(i, 15);
        I = new lhb(i, 16);
        J = new lhb(i, 17);
        K = new lhb(i, 18);
        L = new lhb(i, 19);
        X = new lhb(i, 20);
        Y = new lhb(i, 21);
        Z = new lhb(i, 22);
        v0 = new lhb(i, 23);
        w0 = new lhb(i, 24);
        x0 = new lhb(i, 25);
        y0 = new lhb(i, 26);
        z0 = new lhb(i, 27);
        A0 = new lhb(i, 28);
        B0 = new lhb(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lhb(int i, int i2) {
        super(i);
        this.r = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        q1f q1fVar;
        aqd aqdVar;
        ghc ghcVar;
        q1f q1fVar2;
        q1f q1fVar3;
        zgc zgcVar;
        z9h z9hVar;
        switch (this.r) {
            case 0:
                obj.getClass();
                return ghh.S(obj);
            case 1:
                return Unit.a;
            case 2:
                ((Boolean) obj).booleanValue();
                return Unit.a;
            case 3:
                ((lne) obj).getClass();
                return Unit.a;
            case 4:
                q1f q1fVar4 = (q1f) obj;
                q1fVar4.getClass();
                z9h b = q1fVar4.b();
                String o = b.o("uid");
                z9h b2 = b.k("family_info").b();
                String o2 = b2.o("family_id");
                int n = b2.n("expenses");
                int n2 = b2.n("limit");
                String o3 = b2.o("currency");
                String o4 = b2.o("frame");
                Boolean e = b2.e("unlimited");
                return new b5c(o, o2, n, n2, o3, o4, e != null ? e.booleanValue() : false);
            case 5:
                q1f q1fVar5 = (q1f) obj;
                q1fVar5.getClass();
                r1f r1fVar = q1fVar5.a;
                r1f r1fVar2 = r1f.f;
                if (r1fVar == r1fVar2) {
                    Map map = ((z9h) q1fVar5).b;
                    q1f q1fVar6 = (q1f) map.get("configurations");
                    if (q1fVar6 != null && q1fVar6.a == r1f.g && ((q1fVar = (q1f) map.get("logs")) == null || q1fVar.a == r1fVar2)) {
                        q1fVar.getClass();
                        aqdVar = new aqd(20, (my0) q1fVar6, (z9h) q1fVar);
                        if (aqdVar != null) {
                            ghcVar = null;
                        } else {
                            my0 my0Var = (my0) aqdVar.b;
                            ArrayList arrayList = new ArrayList();
                            for (q1f q1fVar7 : my0Var.b) {
                                q1fVar7.getClass();
                                r1f r1fVar3 = q1fVar7.a;
                                r1f r1fVar4 = r1f.f;
                                if (r1fVar3 == r1fVar4) {
                                    z9h z9hVar2 = (z9h) q1fVar7;
                                    q1f q1fVar8 = (q1f) z9hVar2.b.get("CONTEXT");
                                    if (q1fVar8 != null && q1fVar8.a == r1fVar4 && (q1fVar2 = (q1f) ((z9h) q1fVar8).b.get("MOBMAIL")) != null && q1fVar2.a == r1fVar4) {
                                        z9h z9hVar3 = (z9h) q1fVar2;
                                        Map map2 = z9hVar3.b;
                                        String g = z9hVar3.g("source");
                                        if (g != null) {
                                            ahc ahcVar = g.equals("global") ? ahc.global : g.equals("experiment") ? ahc.experiment : null;
                                            if (ahcVar != null && (q1fVar3 = (q1f) map2.get("flags")) != null && q1fVar3.a == r1fVar4) {
                                                zgcVar = new zgc(ahcVar, z9hVar2.g("CONDITION"), leu.N((q1f) map2.get("logs")), ((z9h) q1fVar3).b);
                                                if (zgcVar == null) {
                                                    arrayList.add(zgcVar);
                                                }
                                            }
                                        }
                                    }
                                }
                                zgcVar = null;
                                if (zgcVar == null) {
                                }
                            }
                            ghcVar = new ghc(arrayList, leu.N((z9h) aqdVar.c));
                        }
                        return ghcVar != null ? nif.c(new r7w("Failed to parse FlagsResponse:\n".concat(bkp.S(q1fVar5)), null)) : nif.d(ghcVar);
                    }
                }
                aqdVar = null;
                if (aqdVar != null) {
                }
                if (ghcVar != null) {
                }
                break;
            case 6:
                wm6 wm6Var = (wm6) obj;
                wm6Var.getClass();
                Log.w(FirebaseSessionsRegistrar.TAG, "CorruptionException in settings DataStore in " + rb.y() + '.', wm6Var);
                return imm.a();
            case 7:
                wm6 wm6Var2 = (wm6) obj;
                wm6Var2.getClass();
                Log.w(FirebaseSessionsRegistrar.TAG, "CorruptionException in sessions DataStore in " + rb.y() + '.', wm6Var2);
                return imm.a();
            case 8:
                return Unit.a;
            case 9:
                return Unit.a;
            case 10:
                return Unit.a;
            case 11:
                return Unit.a;
            case 12:
                return Boolean.valueOf(((dpc) obj).W0(7));
            case 13:
                ((cyc) obj).getClass();
                return Unit.a;
            case 14:
                azc azcVar = (azc) obj;
                azcVar.getClass();
                boolean z2 = azcVar.b;
                mhb mhbVar = azcVar.a;
                if (!z2) {
                    return mhbVar.a;
                }
                return "vararg " + mhbVar;
            case 15:
                synchronized (g2r.b) {
                    ?? r0 = g2r.h;
                    int size = ((Collection) r0).size();
                    for (int i = 0; i < size; i++) {
                        ((Function1) r0.get(i)).invoke(obj);
                    }
                }
                return Unit.a;
            case 16:
                return Unit.a;
            case 17:
                jpa.B((jpa) obj, d85.m, 0L, 0L, 0.0f, null, 0, 126);
                return Unit.a;
            case 18:
                fgk fgkVar = (fgk) obj;
                fgkVar.getClass();
                return fgkVar;
            case 19:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                LinkedHashMap linkedHashMap = sqg.a;
                uwf.l("Check status polling failed: " + r7wVar.getMessage());
                return nif.c(r7wVar);
            case 20:
                q1f q1fVar9 = (q1f) obj;
                q1fVar9.getClass();
                z9h b3 = q1fVar9.b();
                return new iae(b3.o("light"), b3.o("dark"));
            case 21:
                return Unit.a;
            case 22:
                q1f q1fVar10 = (q1f) obj;
                q1fVar10.getClass();
                z9h b4 = q1fVar10.b();
                z9h b5 = b4.k("tokenization_context").b();
                q1f q1fVar11 = (q1f) b4.b.get("integration_profile");
                if (q1fVar11 == null || (z9hVar = q1fVar11.a()) == null) {
                    z9hVar = null;
                }
                return new xle(b5, z9hVar != null ? (qre) bkp.a0(z9hVar, w0).d() : null);
            case 23:
                if (obj == null) {
                    return Unit.a;
                }
                l1j.f();
                return null;
            case 24:
                q1f q1fVar12 = (q1f) obj;
                q1fVar12.getClass();
                z9h b6 = q1fVar12.b();
                return new qre(b6.o("diehard_instance_id"), b6.o("diehard_api_url"));
            case 25:
                return obj;
            case 26:
                return Unit.a;
            case 27:
                return nif.d(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Unit.a;
            default:
                List list = (List) obj;
                return new tsf(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
