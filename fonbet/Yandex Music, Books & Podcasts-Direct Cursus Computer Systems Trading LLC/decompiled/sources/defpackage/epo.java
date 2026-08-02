package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class epo extends uif implements Function2 {
    public static final epo A;
    public static final epo A0;
    public static final epo B;
    public static final epo B0;
    public static final epo C;
    public static final epo D;
    public static final epo E;
    public static final epo F;
    public static final epo G;
    public static final epo H;
    public static final epo I;
    public static final epo J;
    public static final epo K;
    public static final epo L;
    public static final epo X;
    public static final epo Y;
    public static final epo Z;
    public static final epo s;
    public static final epo t;
    public static final epo u;
    public static final epo v;
    public static final epo v0;
    public static final epo w;
    public static final epo w0;
    public static final epo x;
    public static final epo x0;
    public static final epo y;
    public static final epo y0;
    public static final epo z;
    public static final epo z0;
    public final /* synthetic */ int r;

    static {
        int i = 2;
        s = new epo(i, 0);
        t = new epo(i, 1);
        u = new epo(i, 2);
        v = new epo(i, 3);
        w = new epo(i, 4);
        x = new epo(i, 5);
        y = new epo(i, 6);
        z = new epo(i, 7);
        A = new epo(i, 8);
        B = new epo(i, 9);
        C = new epo(i, 10);
        D = new epo(i, 11);
        E = new epo(i, 12);
        F = new epo(i, 13);
        G = new epo(i, 14);
        H = new epo(i, 15);
        I = new epo(i, 16);
        J = new epo(i, 17);
        K = new epo(i, 18);
        L = new epo(i, 19);
        X = new epo(i, 20);
        Y = new epo(i, 21);
        Z = new epo(i, 22);
        v0 = new epo(i, 23);
        w0 = new epo(i, 24);
        x0 = new epo(i, 25);
        y0 = new epo(i, 26);
        z0 = new epo(i, 27);
        A0 = new epo(i, 28);
        B0 = new epo(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ epo(int i, int i2) {
        super(i);
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        syc sycVar;
        switch (this.r) {
            case 0:
                String str2 = ((e0u) obj2).a;
                apo apoVar = fpo.a;
                return str2;
            case 1:
                return Integer.valueOf(((u5g) obj2).a);
            case 2:
                Boolean valueOf = Boolean.valueOf(((duk) obj2).a);
                apo apoVar2 = fpo.a;
                return u75.d(valueOf, new e4b());
            case 3:
                lds ldsVar = (lds) obj2;
                kds kdsVar = new kds(ldsVar.a);
                apo apoVar3 = fpo.a;
                return u75.d(kdsVar, Boolean.valueOf(ldsVar.b));
            case 4:
                return Integer.valueOf(((two) obj2).a.h());
            case 5:
                return Long.valueOf(((bfp) obj2).d.get());
            case 6:
                return (uf0) obj;
            case 7:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 8:
                return (ce6) obj;
            case 9:
                return (Unit) obj;
            case 10:
                return (Unit) obj;
            case 11:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 12:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 13:
                return (Unit) obj;
            case 14:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 15:
                meo meoVar = (meo) obj;
                int i = ((meo) obj2).a;
                return meoVar;
            case 16:
                return (String) obj;
            case 17:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 18:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 19:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 20:
                sa saVar = (sa) obj;
                sa saVar2 = (sa) obj2;
                if (saVar == null || (str = saVar.a) == null) {
                    str = saVar2.a;
                }
                if (saVar == null || (sycVar = saVar.b) == null) {
                    sycVar = saVar2.b;
                }
                return new sa(str, sycVar);
            case 21:
                return obj == null ? obj2 : obj;
            case 22:
                return (gdq) ((x6k) ((zcq) obj2).b.g).getValue();
            case 23:
                ((k3b) obj).c = ((fma) obj2).a;
                return Unit.a;
            case 24:
                ((k3b) obj).d = (ymq) obj2;
                return Unit.a;
            case 25:
                ((l3b) obj).a = (ukd) obj2;
                return Unit.a;
            case 26:
                ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                return Float.valueOf(0.0f);
            case 27:
                lbs lbsVar = (lbs) obj2;
                return u75.h(Float.valueOf(lbsVar.a.e()), Boolean.valueOf(((bxj) lbsVar.f.getValue()) == bxj.a));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((m3b) obj).a = (String) obj2;
                return Unit.a;
            default:
                ((m3b) obj).d = (ukd) obj2;
                return Unit.a;
        }
    }
}
