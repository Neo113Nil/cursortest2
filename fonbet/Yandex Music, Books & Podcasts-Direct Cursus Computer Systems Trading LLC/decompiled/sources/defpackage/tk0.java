package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class tk0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uqn b;
    public final /* synthetic */ rwo c;

    public /* synthetic */ tk0(int i, uqn uqnVar, rwo rwoVar) {
        this.a = i;
        this.b = uqnVar;
        this.c = rwoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        float floatValue = ((Float) obj).floatValue();
        ((Float) obj2).getClass();
        switch (i) {
            case 0:
                uqn uqnVar = this.b;
                float f = uqnVar.a;
                uqnVar.a = this.c.a(floatValue - f) + f;
                break;
            default:
                uqn uqnVar2 = this.b;
                float f2 = uqnVar2.a;
                uqnVar2.a = this.c.a(floatValue - f2) + f2;
                break;
        }
        return Unit.a;
    }
}
