package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class x5u implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6u b;

    public /* synthetic */ x5u(a6u a6uVar, int i) {
        this.a = i;
        this.b = a6uVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        gbw gbwVar;
        gbw gbwVar2;
        switch (this.a) {
            case 0:
                a6u a6uVar = this.b;
                int ordinal = a6uVar.h.ordinal();
                return Long.valueOf(((ordinal == 3 || ordinal == 4) && (gbwVar = a6uVar.d) != null) ? gbwVar.a.getPosition() : 0L);
            case 1:
                a6u a6uVar2 = this.b;
                int ordinal2 = a6uVar2.h.ordinal();
                return Long.valueOf(((ordinal2 == 3 || ordinal2 == 4) && (gbwVar2 = a6uVar2.d) != null) ? gbwVar2.a.o() : 0L);
            default:
                a6u.y(this.b, tnl.f);
                return Unit.a;
        }
    }
}
