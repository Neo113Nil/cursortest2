package defpackage;

import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final /* synthetic */ class h2q implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ h2q(cr crVar) {
        this.a = 1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 27;
        int i2 = 24;
        int i3 = 25;
        int i4 = 26;
        int i5 = 29;
        int i6 = 23;
        int i7 = 1;
        int i8 = 0;
        int i9 = 3;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                jyr jyrVar = i2q.e;
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return (i2q) ((byb) qdcVar.C(I)).c(ern.a(i2q.class));
            case 1:
                return Boolean.FALSE;
            case 2:
                ArrayList arrayList = ecu.a;
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = ecu.a;
                IntRange intRange = new IntRange(1, 44, 1);
                ArrayList arrayList3 = new ArrayList(v75.o(intRange, 10));
                ype it = intRange.iterator();
                while (it.c) {
                    it.nextInt();
                    ohn ohnVar = phn.a;
                    int size = arrayList2.size();
                    ohnVar.getClass();
                    arrayList3.add(Integer.valueOf(phn.b.e(0, size)));
                }
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Character ch = (Character) arrayList2.get(((Number) it2.next()).intValue());
                    ch.getClass();
                    arrayList4.add(ch);
                }
                sb.append(CollectionsKt.X(arrayList4, "", null, null, null, 62));
                sb.append("xMANx");
                sb.append(String.format("%04d", Arrays.copyOf(new Object[]{6391}, 1)));
                sb.append("x");
                sb.append(String.valueOf((System.currentTimeMillis() / 1000) % 10000000000L));
                return sb.toString();
            case 3:
                return "search";
            case 4:
                return "fromValue received incorrect string colorType";
            case 5:
                return new jaq(new laq(i9, i8, continuation), new e7q(i));
            case 6:
                return new jaq(new laq(i9, i7, continuation), new haq(i8));
            case 7:
                return new jaq(new kr3(i9, 4, continuation), new e7q(22));
            case 8:
                return new jaq(new t81(i9, i, continuation), new e7q(i5));
            case 9:
                int i10 = 28;
                return new jaq(new t81(i9, i10, continuation), new e7q(i10));
            case 10:
                return new jaq(new kaq(i9, i8, continuation), new e7q(20));
            case 11:
                return new jaq(new kaq(i9, i7, continuation), new e7q(i2));
            case 12:
                return new jaq(new t81(i9, i6, continuation), new e7q(i6));
            case 13:
                return new jaq(new t81(i9, i2, continuation), new e7q(i3));
            case 14:
                return new jaq(new t81(i9, i3, continuation), new e7q(i4));
            case 15:
                return new jaq(new t81(i9, i4, continuation), new e7q(21));
            case 16:
                return new jaq(new t81(i9, i5, continuation), new haq(i7));
            case 17:
                return new zf6(ern.a(q2a.class), (t9f) null, new t9f[0]);
            case 18:
                return new zf6(ern.a(t5a.class), (t9f) null, new t9f[0]);
            case 19:
                return new zf6(ern.a(q2a.class), (t9f) null, new t9f[0]);
            case 20:
                return new zf6(ern.a(md.class), (t9f) null, new t9f[0]);
            case 21:
                return Unit.a;
            case 22:
                return new wjg(i8, new xjf(i6));
            case 23:
                return new wjg(i8, new xjf(i6));
            case 24:
                return Integer.valueOf(wct.t());
            case 25:
                return Unit.a;
            case 26:
                return pd.t(new qzm[0]);
            case 27:
                jyr jyrVar2 = tpq.e;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return (tpq) ((byb) qdcVar2.C(I2)).c(ern.a(tpq.class));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                jyr jyrVar3 = tpq.e;
                return Boolean.valueOf(!Intrinsics.d(t7g.r().b(), "default"));
            default:
                return "Skeleton";
        }
    }

    public /* synthetic */ h2q(int i) {
        this.a = i;
    }
}
