package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class abi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bci b;

    public /* synthetic */ abi(bci bciVar, int i) {
        this.a = i;
        this.b = bciVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.c() != cci.a);
            case 1:
                return Boolean.valueOf(this.b.c() != cci.a);
            default:
                return Boolean.valueOf(this.b.b() == cci.b);
        }
    }
}
