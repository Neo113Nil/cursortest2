package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a3n implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kpm b;
    public final /* synthetic */ bve c;

    public /* synthetic */ a3n(kpm kpmVar, bve bveVar, int i) {
        this.a = i;
        this.b = kpmVar;
        this.c = bveVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                this.b.I(this.c, booleanValue);
                break;
            case 1:
                this.b.I(this.c, booleanValue);
                break;
            case 2:
                this.b.I(this.c, booleanValue);
                break;
            default:
                this.b.I(this.c, booleanValue);
                break;
        }
        return Unit.a;
    }
}
