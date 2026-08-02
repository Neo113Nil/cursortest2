package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class nat extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ pat s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nat(pat patVar, int i) {
        super(1);
        this.r = i;
        this.s = patVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((Boolean) obj).getClass();
                this.s.c();
                break;
            case 1:
                this.s.i = (hx9) obj;
                break;
            case 2:
                pat patVar = this.s;
                patVar.h.close();
                patVar.k.close();
                patVar.l.close();
                patVar.m.close();
                break;
            default:
                this.s.i = (hx9) obj;
                break;
        }
        return Unit.a;
    }
}
