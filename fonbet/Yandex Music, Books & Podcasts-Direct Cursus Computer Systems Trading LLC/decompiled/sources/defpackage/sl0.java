package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class sl0 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d8t s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl0(d8t d8tVar, int i) {
        super(0);
        this.r = i;
        this.s = d8tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                d8t d8tVar = this.s;
                Object c = d8tVar.c();
                r8b r8bVar = r8b.c;
                return Boolean.valueOf(c == r8bVar && d8tVar.d.getValue() == r8bVar);
            default:
                return Long.valueOf(this.s.b());
        }
    }
}
