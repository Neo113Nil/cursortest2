package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class u0d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w0d b;

    public /* synthetic */ u0d(w0d w0dVar, int i) {
        this.a = i;
        this.b = w0dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                w0d w0dVar = this.b;
                if (w0dVar.g) {
                    w0dVar.f.invoke();
                    w0dVar.a();
                }
                return Unit.a;
            default:
                w0d w0dVar2 = this.b;
                return Boolean.valueOf(CollectionsKt.S(w0dVar2.b, w0dVar2.a) instanceof k0d);
        }
    }
}
