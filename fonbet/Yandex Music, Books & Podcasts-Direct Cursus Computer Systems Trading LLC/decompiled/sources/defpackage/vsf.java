package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.AdRevenueScheme;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vsf extends uif implements Function1 {
    public static final vsf A;
    public static final vsf A0;
    public static final vsf B;
    public static final vsf B0;
    public static final vsf C;
    public static final vsf D;
    public static final vsf E;
    public static final vsf F;
    public static final vsf G;
    public static final vsf H;
    public static final vsf I;
    public static final vsf J;
    public static final vsf K;
    public static final vsf L;
    public static final vsf X;
    public static final vsf Y;
    public static final vsf Z;
    public static final vsf s;
    public static final vsf t;
    public static final vsf u;
    public static final vsf v;
    public static final vsf v0;
    public static final vsf w;
    public static final vsf w0;
    public static final vsf x;
    public static final vsf x0;
    public static final vsf y;
    public static final vsf y0;
    public static final vsf z;
    public static final vsf z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new vsf(i, 0);
        t = new vsf(i, 1);
        u = new vsf(i, 2);
        v = new vsf(i, 3);
        w = new vsf(i, 4);
        x = new vsf(i, 5);
        y = new vsf(i, 6);
        z = new vsf(i, 7);
        A = new vsf(i, 8);
        B = new vsf(i, 9);
        C = new vsf(i, 10);
        D = new vsf(i, 11);
        E = new vsf(i, 12);
        F = new vsf(i, 13);
        G = new vsf(i, 14);
        H = new vsf(i, 15);
        I = new vsf(i, 16);
        J = new vsf(i, 17);
        K = new vsf(i, 18);
        L = new vsf(i, 19);
        X = new vsf(i, 20);
        Y = new vsf(i, 21);
        Z = new vsf(i, 22);
        v0 = new vsf(i, 23);
        w0 = new vsf(i, 24);
        x0 = new vsf(i, 25);
        y0 = new vsf(i, 26);
        z0 = new vsf(i, 27);
        A0 = new vsf(i, 28);
        B0 = new vsf(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vsf(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        z9h z9hVar;
        switch (this.r) {
            case 0:
                ((Number) obj).intValue();
                return c5b.a;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                return Unit.a;
            case 3:
                ((Number) obj).intValue();
                return null;
            case 4:
                List list = (List) obj;
                return new fvf(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 5:
                return Unit.a;
            case 6:
                return Unit.a;
            case 7:
                int i = ((hde) obj).a;
                return Unit.a;
            case 8:
                ((sdg) obj).getClass();
                return Unit.a;
            case 9:
                ((ueg) obj).getClass();
                return Unit.a;
            case 10:
                a aVar = (a) obj;
                agr agrVar = AndroidCompositionLocals_androidKt.b;
                aVar.getClass();
                Context context = (Context) weo.L(aVar, agrVar);
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        context = null;
                    } else if (!(context instanceof Activity)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                return (Activity) context;
            case 11:
                g4f g4fVar = (g4f) obj;
                g4fVar.getClass();
                g4fVar.c = true;
                return Unit.a;
            case 12:
                msk mskVar = (msk) obj;
                if (mskVar.U()) {
                    mskVar.b.E0(mskVar);
                }
                return Unit.a;
            case 13:
                ((Number) obj).longValue();
                return Unit.a;
            case 14:
                ((q1f) obj).getClass();
                return null;
            case 15:
                ((String) obj).getClass();
                return null;
            case 16:
                ((ru.yandex.video.m3.data.a) obj).getClass();
                return Unit.a;
            case 17:
                ((sih) obj).getClass();
                return Unit.a;
            case 18:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                z9h b = q1fVar.b();
                return new qyh(b.o("city"), b.o(AdRevenueScheme.COUNTRY), b.o("home"), b.o("street"), b.o("zip"));
            case 19:
                q1f q1fVar2 = (q1f) obj;
                q1fVar2.getClass();
                z9h b2 = q1fVar2.b();
                String o = b2.o("name");
                String o2 = b2.o("schedule_text");
                String o3 = b2.o("ogrn");
                q1f q1fVar3 = (q1f) b2.b.get("legal_address");
                if (q1fVar3 == null || (z9hVar = q1fVar3.a()) == null) {
                    z9hVar = null;
                }
                return new syh(o, o2, o3, z9hVar != null ? (qyh) bkp.a0(z9hVar, K).d() : null);
            case 20:
                q1f q1fVar4 = (q1f) obj;
                q1fVar4.getClass();
                return bkp.a0(q1fVar4, new m40(10, q1fVar4));
            case 21:
                q1f q1fVar5 = (q1f) obj;
                q1fVar5.getClass();
                return bkp.a0(q1fVar5, gx3.B);
            case 22:
                q1f q1fVar6 = (q1f) obj;
                q1fVar6.getClass();
                return bkp.a0(q1fVar6, gx3.D);
            case 23:
                q1f q1fVar7 = (q1f) obj;
                q1fVar7.getClass();
                return bkp.a0(q1fVar7, gx3.B);
            case 24:
                q1f q1fVar8 = (q1f) obj;
                q1fVar8.getClass();
                return ngg.F(q1fVar8);
            case 25:
                q1f q1fVar9 = (q1f) obj;
                q1fVar9.getClass();
                return bkp.a0(q1fVar9, lhb.Z);
            case 26:
                q1f q1fVar10 = (q1f) obj;
                q1fVar10.getClass();
                return bkp.a0(q1fVar10, new u8b(1, 7));
            case 27:
                q1f q1fVar11 = (q1f) obj;
                q1fVar11.getClass();
                return bkp.a0(q1fVar11, hhm.A);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                q1f q1fVar12 = (q1f) obj;
                q1fVar12.getClass();
                return bkp.a0(q1fVar12, k9i.A);
            default:
                q1f q1fVar13 = (q1f) obj;
                q1fVar13.getClass();
                return bkp.a0(q1fVar13, k9i.A);
        }
    }
}
