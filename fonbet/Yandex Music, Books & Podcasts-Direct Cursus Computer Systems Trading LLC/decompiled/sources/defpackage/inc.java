package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class inc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ eqi b;

    public /* synthetic */ inc(int i, eqi eqiVar) {
        this.a = i;
        this.b = eqiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jsk jskVar = (jsk) obj;
        switch (this.a) {
            case 0:
                jskVar.getClass();
                eqi eqiVar = this.b;
                int i = eqiVar.c;
                if (i > 0) {
                    Object[] objArr = eqiVar.a;
                    int i2 = 0;
                    do {
                        ((lfh) objArr[i2]).d();
                        i2++;
                    } while (i2 < i);
                }
                break;
            case 1:
                jskVar.getClass();
                eqi eqiVar2 = this.b;
                int i3 = eqiVar2.c;
                if (i3 > 0) {
                    Object[] objArr2 = eqiVar2.a;
                    int i4 = 0;
                    do {
                        ((lfh) objArr2[i4]).d();
                        i4++;
                    } while (i4 < i3);
                }
                break;
            default:
                jskVar.getClass();
                eqi eqiVar3 = this.b;
                int i5 = eqiVar3.c;
                if (i5 > 0) {
                    Object[] objArr3 = eqiVar3.a;
                    int i6 = 0;
                    do {
                        ((lfh) objArr3[i6]).d();
                        i6++;
                    } while (i6 < i5);
                }
                break;
        }
        return Unit.a;
    }
}
