package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class qv4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv4 b;

    public /* synthetic */ qv4(rv4 rv4Var, int i) {
        this.a = i;
        this.b = rv4Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
        }
        return this.b.getViewModelStore();
    }
}
