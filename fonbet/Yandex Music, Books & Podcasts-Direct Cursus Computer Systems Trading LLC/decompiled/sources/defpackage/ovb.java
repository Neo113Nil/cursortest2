package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ovb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aqi b;
    public final /* synthetic */ pcu c;

    public /* synthetic */ ovb(aqi aqiVar, pcu pcuVar, int i) {
        this.a = i;
        this.b = aqiVar;
        this.c = pcuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float a;
        float a2;
        switch (this.a) {
            case 0:
                int ordinal = ((ptb) this.b.getValue()).ordinal();
                if (ordinal == 0) {
                    a = this.c.a();
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    a = 1.0f;
                }
                return Float.valueOf(a);
            default:
                int ordinal2 = ((ptb) this.b.getValue()).ordinal();
                if (ordinal2 == 0) {
                    a2 = this.c.a();
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    a2 = 1.0f;
                }
                return Float.valueOf(a2);
        }
    }
}
