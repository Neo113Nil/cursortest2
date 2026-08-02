package defpackage;

import android.content.res.Resources;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rvr extends uif implements Function1 {
    public static final rvr A;
    public static final rvr A0;
    public static final rvr B;
    public static final rvr B0;
    public static final rvr C;
    public static final rvr D;
    public static final rvr E;
    public static final rvr F;
    public static final rvr G;
    public static final rvr H;
    public static final rvr I;
    public static final rvr J;
    public static final rvr K;
    public static final rvr L;
    public static final rvr X;
    public static final rvr Y;
    public static final rvr Z;
    public static final rvr s;
    public static final rvr t;
    public static final rvr u;
    public static final rvr v;
    public static final rvr v0;
    public static final rvr w;
    public static final rvr w0;
    public static final rvr x;
    public static final rvr x0;
    public static final rvr y;
    public static final rvr y0;
    public static final rvr z;
    public static final rvr z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new rvr(i, 0);
        t = new rvr(i, 1);
        u = new rvr(i, 2);
        v = new rvr(i, 3);
        w = new rvr(i, 4);
        x = new rvr(i, 5);
        y = new rvr(i, 6);
        z = new rvr(i, 7);
        A = new rvr(i, 8);
        B = new rvr(i, 9);
        C = new rvr(i, 10);
        D = new rvr(i, 11);
        E = new rvr(i, 12);
        F = new rvr(i, 13);
        G = new rvr(i, 14);
        H = new rvr(i, 15);
        I = new rvr(i, 16);
        J = new rvr(i, 17);
        K = new rvr(i, 18);
        L = new rvr(i, 19);
        X = new rvr(i, 20);
        Y = new rvr(i, 21);
        Z = new rvr(i, 22);
        v0 = new rvr(i, 23);
        w0 = new rvr(i, 24);
        x0 = new rvr(i, 25);
        y0 = new rvr(i, 26);
        z0 = new rvr(i, 27);
        A0 = new rvr(i, 28);
        B0 = new rvr(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rvr(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hds a;
        c4r c4rVar;
        switch (this.r) {
            case 0:
                return Float.valueOf(((Number) obj).floatValue() * 0.7f);
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 2:
                ((Resources) obj).getClass();
                return Boolean.TRUE;
            case 3:
                ((Resources) obj).getClass();
                return Boolean.FALSE;
            case 4:
                ((Number) obj).floatValue();
                return Unit.a;
            case 5:
                gbs gbsVar = (gbs) obj;
                long j = gbsVar.f;
                int i = rds.c;
                return new dx7(((int) (j & 4294967295L)) - qgg.M((int) (j & 4294967295L), gbsVar.g.b), 0);
            case 6:
                gbs gbsVar2 = (gbs) obj;
                String str = gbsVar2.g.b;
                long j2 = gbsVar2.f;
                int i2 = rds.c;
                int L2 = qgg.L((int) (j2 & 4294967295L), str);
                if (L2 != -1) {
                    return new dx7(0, L2 - ((int) (4294967295L & gbsVar2.f)));
                }
                return null;
            case 7:
                gbs gbsVar3 = (gbs) obj;
                Integer e = gbsVar3.e();
                if (e == null) {
                    return null;
                }
                int intValue = e.intValue();
                long j3 = gbsVar3.f;
                int i3 = rds.c;
                return new dx7(((int) (4294967295L & j3)) - intValue, 0);
            case 8:
                gbs gbsVar4 = (gbs) obj;
                Integer d = gbsVar4.d();
                if (d == null) {
                    return null;
                }
                int intValue2 = d.intValue();
                long j4 = gbsVar4.f;
                int i4 = rds.c;
                return new dx7(0, intValue2 - ((int) (4294967295L & j4)));
            case 9:
                gbs gbsVar5 = (gbs) obj;
                Integer c = gbsVar5.c();
                if (c == null) {
                    return null;
                }
                int intValue3 = c.intValue();
                long j5 = gbsVar5.f;
                int i5 = rds.c;
                return new dx7(((int) (4294967295L & j5)) - intValue3, 0);
            case 10:
                gbs gbsVar6 = (gbs) obj;
                Integer b = gbsVar6.b();
                if (b == null) {
                    return null;
                }
                int intValue4 = b.intValue();
                long j6 = gbsVar6.f;
                int i6 = rds.c;
                return new dx7(0, intValue4 - ((int) (4294967295L & j6)));
            case 11:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                bxj bxjVar = ((Boolean) obj2).booleanValue() ? bxj.a : bxj.b;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new lbs(bxjVar, ((Float) obj3).floatValue());
            case 12:
                return Unit.a;
            case 13:
                return Unit.a;
            case 14:
                int i7 = ((hde) obj).a;
                return Unit.a;
            case 15:
                return Unit.a;
            case 16:
                int i8 = ((hde) obj).a;
                return Unit.a;
            case 17:
                return Unit.a;
            case 18:
                ln0 ln0Var = (ln0) obj;
                Object obj4 = ln0Var.a;
                if (!(obj4 instanceof p7g) || (a = ((p7g) obj4).a()) == null || (a.a == null && a.b == null && a.c == null && a.d == null)) {
                    return u75.d(ln0Var);
                }
                Object obj5 = ln0Var.a;
                obj5.getClass();
                hds a2 = ((p7g) obj5).a();
                if (a2 == null || (c4rVar = a2.a) == null) {
                    c4rVar = new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65535);
                }
                return u75.d(ln0Var, new ln0(c4rVar, ln0Var.b, ln0Var.c));
            case 19:
                xfp xfpVar = ufp.y;
                Unit unit = Unit.a;
                ((jfp) obj).o(xfpVar, unit);
                return unit;
            case 20:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b2 = q1fVar.b();
                return new jos(b2.o(ConnectableDevice.KEY_ID), (kos) bkp.a0(b2.k(CameraService.RESULT), Y).a());
            case 21:
                q1f q1fVar2 = (q1f) obj;
                q1fVar2.getClass();
                z9h b3 = q1fVar2.b();
                return new kos(b3.g("pmd"), b3.g("psd"));
            case 22:
                ((uvs) obj).getClass();
                return Unit.a;
            case 23:
                ((Function0) obj).invoke();
                return Unit.a;
            case 24:
                q1f q1fVar3 = (q1f) obj;
                q1fVar3.getClass();
                z9h b4 = q1fVar3.b();
                String o = b4.o("url");
                ArrayList arrayList = new ArrayList();
                List d2 = b4.d("tags");
                if (d2 != null) {
                    Iterator it = ((ArrayList) d2).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((q1f) it.next()).c().b);
                    }
                }
                return new bbt(o, arrayList);
            case 25:
                q1f q1fVar4 = (q1f) obj;
                q1fVar4.getClass();
                y28 y28Var = (y28) bkp.a0(q1fVar4, e27.y0).d();
                return new cit(y28Var.a, y28Var.b, y28Var.c);
            case 26:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                g4fVar.e = true;
                g4fVar.a = true;
                g4fVar.b = false;
                return Unit.a;
            case 27:
                q1f q1fVar5 = (q1f) obj;
                q1fVar5.getClass();
                z9h b5 = q1fVar5.b();
                return new mwt(b5.o("verification_id"), b5.o("binding_id"), b5.g("status"), b5.g("message_code"));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return Unit.a;
            default:
                long j7 = ((ema) obj).a;
                return new zm0(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
        }
    }
}
