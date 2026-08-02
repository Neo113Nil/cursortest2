package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class wru implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hsu b;

    public /* synthetic */ wru(hsu hsuVar, int i) {
        this.a = i;
        this.b = hsuVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Float.valueOf(this.b instanceof gsu ? 1.0f : 0.5f);
            default:
                return Float.valueOf(this.b instanceof gsu ? 1.0f : 0.5f);
        }
    }
}
