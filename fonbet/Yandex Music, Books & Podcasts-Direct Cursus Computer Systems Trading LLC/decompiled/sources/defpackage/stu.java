package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class stu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;
    public final /* synthetic */ sdr c;

    public /* synthetic */ stu(sdr sdrVar, sdr sdrVar2, int i) {
        this.a = i;
        this.b = sdrVar;
        this.c = sdrVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((Boolean) this.b.getValue()).booleanValue() || ((Boolean) this.c.getValue()).booleanValue());
            case 1:
                return ((Boolean) this.b.getValue()).booleanValue() ? new s7v(((ylu) this.c.getValue()).b) : new s7v(zlu.c.b);
            default:
                return Boolean.valueOf(((Boolean) this.b.getValue()).booleanValue() || ((Boolean) this.c.getValue()).booleanValue());
        }
    }
}
