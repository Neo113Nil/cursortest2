package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class owo extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pwo s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ owo(pwo pwoVar, int i) {
        super(0);
        this.r = i;
        this.s = pwoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Float.valueOf(this.s.o.a.h());
            default:
                return Float.valueOf(this.s.o.d.h());
        }
    }
}
