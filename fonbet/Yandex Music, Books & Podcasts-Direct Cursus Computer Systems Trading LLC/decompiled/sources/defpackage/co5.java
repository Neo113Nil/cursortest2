package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class co5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sai b;

    public /* synthetic */ co5(sai saiVar, int i) {
        this.a = i;
        this.b = saiVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.a) {
            case 0:
                this.b.a();
                return Unit.a;
            case 1:
                sai saiVar = this.b;
                bci bciVar = saiVar.c;
                if (bciVar == null) {
                    Intrinsics.j("sheetState");
                    throw null;
                }
                cci b = bciVar.b();
                cci cciVar = cci.a;
                if (b == cciVar) {
                    bci bciVar2 = saiVar.c;
                    if (bciVar2 == null) {
                        Intrinsics.j("sheetState");
                        throw null;
                    }
                    if (bciVar2.c() == cciVar) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 2:
                sai saiVar2 = this.b;
                bci bciVar3 = saiVar2.c;
                if (bciVar3 != null) {
                    return Boolean.valueOf(bciVar3.c() != cci.a || ((Boolean) saiVar2.g.getValue()).booleanValue());
                }
                Intrinsics.j("sheetState");
                throw null;
            case 3:
                this.b.a();
                return Unit.a;
            default:
                this.b.a();
                return Unit.a;
        }
    }
}
