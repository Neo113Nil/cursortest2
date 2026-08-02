package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w0n extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d1n s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0n(d1n d1nVar, int i) {
        super(0);
        this.r = i;
        this.s = d1nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                d1n d1nVar = this.s;
                return Float.valueOf(d1nVar.a() / d1nVar.g.e() < 1.0f ? 0.3f : 1.0f);
            default:
                return Float.valueOf(this.s.f.e() * 0.5f);
        }
    }
}
