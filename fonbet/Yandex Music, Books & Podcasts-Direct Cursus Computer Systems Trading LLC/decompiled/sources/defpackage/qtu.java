package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class qtu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2v b;

    public /* synthetic */ qtu(s2v s2vVar, int i) {
        this.a = i;
        this.b = s2vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.b(((Boolean) obj).booleanValue());
                break;
            case 1:
                xur xurVar = (xur) obj;
                xurVar.getClass();
                int ordinal = xurVar.ordinal();
                s2v s2vVar = this.b;
                if (ordinal == 0) {
                    s2vVar.e();
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    s2vVar.d();
                }
                break;
            case 2:
                xur xurVar2 = (xur) obj;
                xurVar2.getClass();
                int ordinal2 = xurVar2.ordinal();
                s2v s2vVar2 = this.b;
                if (ordinal2 == 0) {
                    s2vVar2.e();
                } else if (ordinal2 != 1) {
                    b6e.s();
                    break;
                } else {
                    s2vVar2.d();
                }
                break;
            case 3:
                xur xurVar3 = (xur) obj;
                xurVar3.getClass();
                int ordinal3 = xurVar3.ordinal();
                s2v s2vVar3 = this.b;
                if (ordinal3 == 0) {
                    s2vVar3.e();
                } else if (ordinal3 != 1) {
                    b6e.s();
                    break;
                } else {
                    s2vVar3.d();
                }
                break;
            default:
                xur xurVar4 = (xur) obj;
                xurVar4.getClass();
                int ordinal4 = xurVar4.ordinal();
                s2v s2vVar4 = this.b;
                if (ordinal4 == 0) {
                    s2vVar4.e();
                } else if (ordinal4 != 1) {
                    b6e.s();
                    break;
                } else {
                    s2vVar4.d();
                }
                break;
        }
        return Unit.a;
    }
}
