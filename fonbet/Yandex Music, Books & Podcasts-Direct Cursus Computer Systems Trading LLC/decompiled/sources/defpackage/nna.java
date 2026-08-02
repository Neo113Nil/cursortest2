package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class nna extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Function2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nna(Function2 function2, int i) {
        super(1);
        this.r = i;
        this.s = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                lfm lfmVar = (lfm) obj;
                this.s.invoke(lfmVar, new enj(swf.f0(lfmVar, false)));
                lfmVar.a();
                break;
            case 1:
                lfm lfmVar2 = (lfm) obj;
                this.s.invoke(lfmVar2, Float.valueOf(Float.intBitsToFloat((int) (swf.f0(lfmVar2, false) & 4294967295L))));
                lfmVar2.a();
                break;
            default:
                this.s.invoke((mu3) obj, null);
                break;
        }
        return Unit.a;
    }
}
