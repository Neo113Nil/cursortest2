package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x30 implements kfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public /* synthetic */ x30(float f, float f2, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public static final void f(ArrayList arrayList, vqn vqnVar, mfh mfhVar, float f, ArrayList arrayList2, ArrayList arrayList3, vqn vqnVar2, ArrayList arrayList4, vqn vqnVar3, vqn vqnVar4) {
        if (!arrayList.isEmpty()) {
            vqnVar.a = mfhVar.L(f) + vqnVar.a;
        }
        arrayList.add(0, CollectionsKt.w0(arrayList2));
        arrayList3.add(Integer.valueOf(vqnVar2.a));
        arrayList4.add(Integer.valueOf(vqnVar.a));
        vqnVar.a += vqnVar2.a;
        vqnVar3.a = Math.max(vqnVar3.a, vqnVar4.a);
        arrayList2.clear();
        vqnVar4.a = 0;
        vqnVar2.a = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0104 A[SYNTHETIC] */
    @Override // defpackage.kfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lfh b(mfh mfhVar, List list, long j) {
        int i;
        ksk kskVar;
        List list2 = list;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vqn vqnVar = new vqn();
                vqn vqnVar2 = new vqn();
                ArrayList arrayList4 = new ArrayList();
                vqn vqnVar3 = new vqn();
                vqn vqnVar4 = new vqn();
                int i2 = 0;
                long b = ia6.b(ga6.i(j), 0, 13);
                for (int size = list2.size(); i2 < size; size = i) {
                    ksk M = ((ffh) list2.get(i2)).M(b);
                    boolean isEmpty = arrayList4.isEmpty();
                    float f = this.b;
                    if (!isEmpty) {
                        ArrayList arrayList5 = arrayList;
                        vqn vqnVar5 = vqnVar2;
                        if (mfhVar.L(f) + vqnVar3.a + M.a <= ga6.i(j)) {
                            arrayList = arrayList5;
                            vqnVar2 = vqnVar5;
                        } else {
                            i = size;
                            vqnVar2 = vqnVar5;
                            kskVar = M;
                            arrayList = arrayList5;
                            f(arrayList, vqnVar2, mfhVar, this.c, arrayList4, arrayList2, vqnVar4, arrayList3, vqnVar, vqnVar3);
                            if (arrayList4.isEmpty()) {
                                vqnVar3.a = mfhVar.L(f) + vqnVar3.a;
                            }
                            arrayList4.add(kskVar);
                            vqnVar3.a += kskVar.a;
                            vqnVar4.a = Math.max(vqnVar4.a, kskVar.b);
                            i2++;
                            list2 = list;
                        }
                    }
                    i = size;
                    kskVar = M;
                    if (arrayList4.isEmpty()) {
                    }
                    arrayList4.add(kskVar);
                    vqnVar3.a += kskVar.a;
                    vqnVar4.a = Math.max(vqnVar4.a, kskVar.b);
                    i2++;
                    list2 = list;
                }
                if (!arrayList4.isEmpty()) {
                    f(arrayList, vqnVar2, mfhVar, this.c, arrayList4, arrayList2, vqnVar4, arrayList3, vqnVar, vqnVar3);
                }
                int i3 = ga6.i(j) != Integer.MAX_VALUE ? ga6.i(j) : Math.max(vqnVar.a, ga6.k(j));
                return mfh.m0(mfhVar, i3, Math.max(vqnVar2.a, ga6.j(j)), new w30(arrayList, mfhVar, this.b, i3, arrayList3));
            default:
                mfhVar.getClass();
                list2.getClass();
                final float i4 = ga6.i(j);
                float h = ga6.h(j);
                double d = (float) ((this.b * 3.141592653589793d) / 180);
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = i4 / 2.0f;
                float sqrt = ((float) Math.sqrt((r2 * r2 * cos * cos) + (f2 * f2 * sin * sin))) * 2.0f;
                final float f3 = -(0.625f * i4 * sin);
                final float f4 = ((h / 2.0f) - (sqrt / 2.0f)) - this.c;
                int b2 = eeh.b(0.735f * i4);
                final ksk M2 = ((ffh) list2.get(0)).M(ia6.a(b2, b2, 0, ga6.h(j)));
                return mfh.m0(mfhVar, ga6.i(j), ga6.h(j), new Function1() { // from class: vjv
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        jsk jskVar = (jsk) obj;
                        jskVar.getClass();
                        float f5 = i4 / 2.0f;
                        jsk.g(jskVar, M2, eeh.b((f5 - (r2.a / 2.0f)) + f3), eeh.b(f4));
                        return Unit.a;
                    }
                });
        }
    }
}
