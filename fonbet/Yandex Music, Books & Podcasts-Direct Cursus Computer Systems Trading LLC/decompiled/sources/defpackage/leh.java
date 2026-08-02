package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class leh implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rxv b;

    public /* synthetic */ leh(rxv rxvVar, int i) {
        this.a = 3;
        this.b = rxvVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        rxv rxvVar = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                act actVar = rxv.K;
                rxvVar.i.h(floatValue);
                break;
            case 1:
                long j = ((enj) obj).a;
                act actVar2 = rxv.K;
                rxvVar.q(j);
                break;
            case 2:
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                rxvVar.h.h(floatValue2);
                break;
            default:
                ((Integer) obj2).getClass();
                rvf.t(rxvVar, (hq5) obj, rvf.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ leh(rxv rxvVar, int i, byte b) {
        this.a = i;
        this.b = rxvVar;
    }
}
