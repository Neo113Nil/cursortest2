package defpackage;

import android.database.SQLException;
import com.yandex.pulse.metrics.o;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class dpo extends uif implements Function1 {
    public static final dpo A;
    public static final dpo A0;
    public static final dpo B;
    public static final dpo B0;
    public static final dpo C;
    public static final dpo D;
    public static final dpo E;
    public static final dpo F;
    public static final dpo G;
    public static final dpo H;
    public static final dpo I;
    public static final dpo J;
    public static final dpo K;
    public static final dpo L;
    public static final dpo X;
    public static final dpo Y;
    public static final dpo Z;
    public static final dpo s;
    public static final dpo t;
    public static final dpo u;
    public static final dpo v;
    public static final dpo v0;
    public static final dpo w;
    public static final dpo w0;
    public static final dpo x;
    public static final dpo x0;
    public static final dpo y;
    public static final dpo y0;
    public static final dpo z;
    public static final dpo z0;
    public final /* synthetic */ int r;

    static {
        int i = 1;
        s = new dpo(i, 0);
        t = new dpo(i, 1);
        u = new dpo(i, 2);
        v = new dpo(i, 3);
        w = new dpo(i, 4);
        x = new dpo(i, 5);
        y = new dpo(i, 6);
        z = new dpo(i, 7);
        A = new dpo(i, 8);
        B = new dpo(i, 9);
        C = new dpo(i, 10);
        D = new dpo(i, 11);
        E = new dpo(i, 12);
        F = new dpo(i, 13);
        G = new dpo(i, 14);
        H = new dpo(i, 15);
        I = new dpo(i, 16);
        J = new dpo(i, 17);
        K = new dpo(i, 18);
        L = new dpo(i, 19);
        X = new dpo(i, 20);
        Y = new dpo(i, 21);
        Z = new dpo(i, 22);
        v0 = new dpo(i, 23);
        w0 = new dpo(i, 24);
        x0 = new dpo(i, 25);
        y0 = new dpo(i, 26);
        z0 = new dpo(i, 27);
        A0 = new dpo(i, 28);
        B0 = new dpo(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dpo(int i, int i2) {
        super(i);
        this.r = i2;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kes kesVar = null;
        r6 = null;
        c4r c4rVar = null;
        kesVar = null;
        switch (this.r) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                return new ccs(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
            case 1:
                obj.getClass();
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                les[] lesVarArr = kes.b;
                cpo cpoVar = fpo.q;
                Boolean bool = Boolean.FALSE;
                kes kesVar2 = ((Intrinsics.d(obj2, bool) && cpoVar == null) || obj2 == null) ? null : (kes) cpoVar.b.invoke(obj2);
                kesVar2.getClass();
                long j = kesVar2.a;
                Object obj3 = list2.get(1);
                if ((!Intrinsics.d(obj3, bool) || cpoVar != null) && obj3 != null) {
                    kesVar = (kes) cpoVar.b.invoke(obj3);
                }
                kesVar.getClass();
                return new fcs(j, kesVar.a);
            case 2:
                obj.getClass();
                List list3 = (List) obj;
                Object obj4 = list3.get(0);
                apo apoVar = fpo.h;
                Boolean bool2 = Boolean.FALSE;
                c4r c4rVar2 = (Intrinsics.d(obj4, bool2) || obj4 == null) ? null : (c4r) ((Function1) apoVar.c).invoke(obj4);
                Object obj5 = list3.get(1);
                c4r c4rVar3 = (Intrinsics.d(obj5, bool2) || obj5 == null) ? null : (c4r) ((Function1) apoVar.c).invoke(obj5);
                Object obj6 = list3.get(2);
                c4r c4rVar4 = (Intrinsics.d(obj6, bool2) || obj6 == null) ? null : (c4r) ((Function1) apoVar.c).invoke(obj6);
                Object obj7 = list3.get(3);
                if (!Intrinsics.d(obj7, bool2) && obj7 != null) {
                    c4rVar = (c4r) ((Function1) apoVar.c).invoke(obj7);
                }
                return new hds(c4rVar2, c4rVar3, c4rVar4, c4rVar);
            case 3:
                obj.getClass();
                List list4 = (List) obj;
                Object obj8 = list4.get(0);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj9 = list4.get(1);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                num2.getClass();
                return new rds(y5g.P(intValue, num2.intValue()));
            case 4:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new kes(kes.c);
                }
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                Float f = obj10 != null ? (Float) obj10 : null;
                f.getClass();
                float floatValue = f.floatValue();
                Object obj11 = list5.get(1);
                les lesVar = obj11 != null ? (les) obj11 : null;
                lesVar.getClass();
                return new kes(v7g.D(floatValue, lesVar.a));
            case 5:
                String str = obj != null ? (String) obj : null;
                str.getClass();
                return new ppt(str);
            case 6:
                String str2 = obj != null ? (String) obj : null;
                str2.getClass();
                return new e0u(str2);
            case 7:
                obj.getClass();
                return new u5g(((Integer) obj).intValue());
            case 8:
                obj.getClass();
                List list6 = (List) obj;
                Object obj12 = list6.get(0);
                Boolean bool3 = obj12 != null ? (Boolean) obj12 : null;
                bool3.getClass();
                boolean booleanValue = bool3.booleanValue();
                Object obj13 = list6.get(1);
                (obj13 != null ? (e4b) obj13 : null).getClass();
                return new duk(0, booleanValue);
            case 9:
                obj.getClass();
                List list7 = (List) obj;
                Object obj14 = list7.get(0);
                kds kdsVar = obj14 != null ? (kds) obj14 : null;
                kdsVar.getClass();
                int i = kdsVar.a;
                Object obj15 = list7.get(1);
                Boolean bool4 = obj15 != null ? (Boolean) obj15 : null;
                bool4.getClass();
                return new lds(i, bool4.booleanValue());
            case 10:
                return Integer.valueOf(((dwo) obj).b);
            case 11:
                aqe aqeVar = ((dwo) obj).c;
                return Integer.valueOf(aqeVar.d - aqeVar.b);
            case 12:
                return new two(((Number) obj).intValue());
            case 13:
                return Boolean.valueOf(!(((lfm) obj).i == 2));
            case 14:
                ((sdk) obj).getClass();
                return Unit.a;
            case 15:
                ((sdk) obj).getClass();
                return Unit.a;
            case 16:
                s9f[] s9fVarArr = wfp.a;
                xfp xfpVar = ufp.e;
                Unit unit = Unit.a;
                ((jfp) obj).o(xfpVar, unit);
                return unit;
            case 17:
                long j2 = ((enj) obj).a;
                return (9223372034707292159L & j2) != 9205357640488583168L ? new zm0(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L))) : uep.a;
            case 18:
                zm0 zm0Var = (zm0) obj;
                return new enj((Float.floatToRawIntBits(zm0Var.a) << 32) | (4294967295L & Float.floatToRawIntBits(zm0Var.b)));
            case 19:
                return new bfp(((Number) obj).longValue());
            case 20:
                return Unit.a;
            case 21:
                return Unit.a;
            case 22:
                ((zbr) obj).getClass();
                return Unit.a;
            case 23:
                throw new SQLException("Insertion failed for raw jsons with ids: ".concat(CollectionsKt.X((List) obj, null, null, null, null, 63)));
            case 24:
                return ((pin) obj).getId();
            case 25:
                return Unit.a;
            case 26:
                q1f q1fVar = (q1f) obj;
                q1fVar.getClass();
                y28 y28Var = (y28) bkp.a0(q1fVar, e27.y0).d();
                return new jrr(y28Var.a, y28Var.b, y28Var.c);
            case 27:
                s9f[] s9fVarArr2 = wfp.a;
                xfp xfpVar2 = ufp.l;
                s9f s9fVar = wfp.a[5];
                Boolean bool5 = Boolean.TRUE;
                xfpVar2.getClass();
                ((jfp) obj).o(xfpVar2, bool5);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                s9f[] s9fVarArr3 = wfp.a;
                xfp xfpVar3 = ufp.l;
                s9f s9fVar2 = wfp.a[5];
                Boolean bool6 = Boolean.TRUE;
                xfpVar3.getClass();
                ((jfp) obj).o(xfpVar3, bool6);
                return Unit.a;
            default:
                return Unit.a;
        }
    }
}
