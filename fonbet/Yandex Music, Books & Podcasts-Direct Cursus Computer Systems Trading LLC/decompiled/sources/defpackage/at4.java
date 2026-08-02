package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class at4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pcu b;

    public /* synthetic */ at4(pcu pcuVar, int i) {
        this.a = i;
        this.b = pcuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float c;
        switch (this.a) {
            case 0:
                c = this.b.c();
                break;
            case 1:
                c = this.b.c();
                break;
            default:
                c = this.b.c();
                break;
        }
        return Float.valueOf(c);
    }
}
