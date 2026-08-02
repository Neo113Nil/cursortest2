package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class oe0 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ loc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe0(loc locVar, int i) {
        super(1);
        this.r = i;
        this.s = locVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
        }
        return Boolean.valueOf(((dpc) obj).W0(this.s.a));
    }
}
