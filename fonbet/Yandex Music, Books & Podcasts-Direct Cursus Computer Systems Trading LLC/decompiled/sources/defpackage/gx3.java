package defpackage;

import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class gx3 extends uif implements Function1 {
    public static final gx3 A;
    public static final gx3 A0;
    public static final gx3 B;
    public static final gx3 B0;
    public static final gx3 C;
    public static final gx3 D;
    public static final gx3 E;
    public static final gx3 F;
    public static final gx3 G;
    public static final gx3 H;
    public static final gx3 I;
    public static final gx3 J;
    public static final gx3 K;
    public static final gx3 L;
    public static final gx3 X;
    public static final gx3 Y;
    public static final gx3 Z;
    public static final gx3 s;
    public static final gx3 t;
    public static final gx3 u;
    public static final gx3 v;
    public static final gx3 v0;
    public static final gx3 w;
    public static final gx3 w0;
    public static final gx3 x;
    public static final gx3 x0;
    public static final gx3 y;
    public static final gx3 y0;
    public static final gx3 z;
    public static final gx3 z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new gx3(i, 0);
        t = new gx3(i, 1);
        u = new gx3(i, 2);
        v = new gx3(i, 3);
        w = new gx3(i, 4);
        x = new gx3(i, 5);
        y = new gx3(i, 6);
        z = new gx3(i, 7);
        A = new gx3(i, 8);
        B = new gx3(i, 9);
        C = new gx3(i, 10);
        D = new gx3(i, 11);
        E = new gx3(i, 12);
        F = new gx3(i, 13);
        G = new gx3(i, 14);
        H = new gx3(i, 15);
        I = new gx3(i, 16);
        J = new gx3(i, 17);
        K = new gx3(i, 18);
        L = new gx3(i, 19);
        X = new gx3(i, 20);
        Y = new gx3(i, 21);
        Z = new gx3(i, 22);
        v0 = new gx3(i, 23);
        w0 = new gx3(i, 24);
        x0 = new gx3(i, 25);
        y0 = new gx3(i, 26);
        z0 = new gx3(i, 27);
        A0 = new gx3(i, 28);
        B0 = new gx3(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx3(int i, int i2) {
        super(i);
        this.r = i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        z9h z9hVar;
        t9i t9iVar;
        z9h z9hVar2;
        switch (this.r) {
            case 0:
                ((Boolean) obj).booleanValue();
                break;
            case 1:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b = q1fVar.b();
                String o = b.o("method");
                String o2 = b.o("redirect_url");
                List d = b.d("trusted_urls");
                ArrayList arrayList = new ArrayList();
                if (d != null) {
                    Iterator it = ((ArrayList) d).iterator();
                    while (it.hasNext()) {
                        q1f q1fVar2 = (q1f) it.next();
                        q1fVar2.getClass();
                        y7o a0 = bkp.a0(q1fVar2, rvr.w0);
                        if (a0.c()) {
                            arrayList.add(a0.a());
                        }
                    }
                }
                break;
            case 2:
                q1f q1fVar3 = (q1f) obj;
                q1fVar3.getClass();
                break;
            case 3:
                q1f q1fVar4 = (q1f) obj;
                q1fVar4.getClass();
                z9h b2 = q1fVar4.b();
                break;
            case 4:
                q1f q1fVar5 = (q1f) obj;
                q1fVar5.getClass();
                z9h b3 = q1fVar5.b();
                break;
            case 5:
                q1f q1fVar6 = (q1f) obj;
                q1fVar6.getClass();
                z9h b4 = q1fVar6.b();
                break;
            case 6:
                q1f q1fVar7 = (q1f) obj;
                q1fVar7.getClass();
                z9h b5 = q1fVar7.b();
                break;
            case 7:
                q1f q1fVar8 = (q1f) obj;
                q1fVar8.getClass();
                z9h b6 = q1fVar8.b();
                String o3 = b6.o("method");
                String o4 = b6.o("web_url");
                List d2 = b6.d("trusted_urls");
                ArrayList arrayList2 = new ArrayList();
                if (d2 != null) {
                    Iterator it2 = ((ArrayList) d2).iterator();
                    while (it2.hasNext()) {
                        q1f q1fVar9 = (q1f) it2.next();
                        q1fVar9.getClass();
                        y7o a02 = bkp.a0(q1fVar9, rvr.w0);
                        if (a02.c()) {
                            arrayList2.add(a02.a());
                        }
                    }
                }
                break;
            case 8:
                q1f q1fVar10 = (q1f) obj;
                q1fVar10.getClass();
                a38 a38Var = (a38) bkp.a0(q1fVar10, e27.A0).d();
                z9h b7 = q1fVar10.b();
                break;
            case 9:
                q1f q1fVar11 = (q1f) obj;
                q1fVar11.getClass();
                z9h b8 = q1fVar11.b();
                String o5 = b8.o("status");
                String g = b8.g("code");
                String g2 = b8.g(Constants.KEY_MESSAGE);
                q1f q1fVar12 = (q1f) b8.b.get("challenge_info");
                t9i t9iVar2 = null;
                if (q1fVar12 == null || (z9hVar = q1fVar12.a()) == null) {
                    z9hVar = null;
                }
                if (z9hVar != null) {
                    String o6 = z9hVar.o("method");
                    switch (o6.hashCode()) {
                        case 52226:
                            if (o6.equals("3ds")) {
                                t9iVar2 = (t9i) bkp.a0(z9hVar, t).a();
                                break;
                            }
                            t9iVar = (fb4) bkp.a0(z9hVar, z).a();
                            if (t9iVar == null) {
                                t9iVar = new t9i(o6);
                            }
                            t9iVar2 = t9iVar;
                            break;
                        case 98915:
                            if (o6.equals("cvv")) {
                                t9iVar2 = (t9i) bkp.a0(z9hVar, u).a();
                                break;
                            }
                            t9iVar = (fb4) bkp.a0(z9hVar, z).a();
                            if (t9iVar == null) {
                            }
                            t9iVar2 = t9iVar;
                            break;
                        case 113665:
                            if (o6.equals("sbp")) {
                                t9iVar2 = (t9i) bkp.a0(z9hVar, x).a();
                                break;
                            }
                            t9iVar = (fb4) bkp.a0(z9hVar, z).a();
                            if (t9iVar == null) {
                            }
                            t9iVar2 = t9iVar;
                            break;
                        case 114009:
                            if (o6.equals("sms")) {
                                t9iVar2 = (t9i) bkp.a0(z9hVar, y).a();
                                break;
                            }
                            t9iVar = (fb4) bkp.a0(z9hVar, z).a();
                            if (t9iVar == null) {
                            }
                            t9iVar2 = t9iVar;
                            break;
                        case 115962956:
                            if (o6.equals("random_amt")) {
                                t9iVar2 = (t9i) bkp.a0(z9hVar, v).a();
                                break;
                            }
                            t9iVar = (fb4) bkp.a0(z9hVar, z).a();
                            if (t9iVar == null) {
                            }
                            t9iVar2 = t9iVar;
                            break;
                        case 1499577324:
                            if (o6.equals("system_redirect")) {
                                t9iVar2 = (t9i) bkp.a0(z9hVar, w).a();
                                break;
                            }
                            t9iVar = (fb4) bkp.a0(z9hVar, z).a();
                            if (t9iVar == null) {
                            }
                            t9iVar2 = t9iVar;
                            break;
                        default:
                            t9iVar = (fb4) bkp.a0(z9hVar, z).a();
                            if (t9iVar == null) {
                            }
                            t9iVar2 = t9iVar;
                            break;
                    }
                }
                b8.g("external_status");
                b8.g("external_details");
                break;
            case 10:
                q1f q1fVar13 = (q1f) obj;
                q1fVar13.getClass();
                a38 a38Var2 = (a38) bkp.a0(q1fVar13, e27.A0).d();
                z9h b9 = q1fVar13.b();
                q1f q1fVar14 = (q1f) b9.b.get("challenge_info");
                iek iekVar = null;
                if (q1fVar14 == null || (z9hVar2 = q1fVar14.a()) == null) {
                    z9hVar2 = null;
                }
                if (z9hVar2 != null) {
                    y7o a03 = bkp.a0(z9hVar2, kzj.K);
                    iekVar = (iek) (a03.b() ? null : a03.a());
                }
                break;
            case 11:
                q1f q1fVar15 = (q1f) obj;
                q1fVar15.getClass();
                z9h b10 = q1fVar15.b().k("verification").b();
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                long a = d85.a(((d85) obj).a, n95.x);
                break;
            case 18:
                ((Number) obj).longValue();
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                float[] fArr = ((feh) obj).a;
                break;
            case 23:
                float[] fArr2 = ((feh) obj).a;
                break;
            case 24:
                ((lne) obj).getClass();
                break;
            case 25:
                ((f2a) obj).getClass();
                break;
            case 26:
                ((jw3) obj).getClass();
                break;
            case 27:
                ((lne) obj).getClass();
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((Boolean) obj).booleanValue();
                break;
            default:
                ((Boolean) obj).booleanValue();
                break;
        }
        return Unit.a;
    }
}
