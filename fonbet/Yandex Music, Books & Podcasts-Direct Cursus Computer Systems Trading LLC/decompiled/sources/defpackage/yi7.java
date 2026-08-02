package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class yi7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iwm b;
    public final /* synthetic */ diu c;

    public /* synthetic */ yi7(iwm iwmVar, diu diuVar, int i) {
        this.a = i;
        this.b = iwmVar;
        this.c = diuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((String) obj2).getClass();
        switch (i) {
            case 0:
                if (booleanValue) {
                    this.b.b(this.c);
                }
                break;
            case 1:
                if (booleanValue) {
                    this.b.f.a(this.c.a);
                }
                break;
            case 2:
                if (booleanValue) {
                    this.b.f.a(this.c.a);
                }
                break;
            case 3:
                if (booleanValue) {
                    this.b.b(this.c);
                }
                break;
            case 4:
                if (booleanValue) {
                    this.b.f.a(this.c.a);
                }
                break;
            default:
                if (booleanValue) {
                    this.b.f.a(this.c.a);
                }
                break;
        }
        return Unit.a;
    }
}
