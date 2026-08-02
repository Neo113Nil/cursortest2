package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class swo extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ two s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swo(two twoVar, int i) {
        super(0);
        this.r = i;
        this.s = twoVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(this.s.a.h() > 0);
            default:
                two twoVar = this.s;
                return Boolean.valueOf(twoVar.a.h() < twoVar.d.h());
        }
    }
}
