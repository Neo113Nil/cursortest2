package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a9q implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sdr b;

    public /* synthetic */ a9q(sdr sdrVar, int i) {
        this.a = i;
        this.b = sdrVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
        }
        return Float.valueOf(((Number) this.b.getValue()).floatValue());
    }
}
