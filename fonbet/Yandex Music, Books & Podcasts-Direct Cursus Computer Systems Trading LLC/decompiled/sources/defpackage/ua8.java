package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ua8 extends uif implements Function0 {
    public final /* synthetic */ boolean r;
    public final /* synthetic */ uoo s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua8(boolean z, uoo uooVar, String str) {
        super(0);
        this.r = z;
        this.s = uooVar;
        this.t = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.r) {
            uoo uooVar = this.s;
            String str = this.t;
            bnh bnhVar = uooVar.a;
            synchronized (((l3l) bnhVar.f)) {
            }
        }
        return Unit.a;
    }
}
