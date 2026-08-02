package yads;

import defpackage.br81;
import defpackage.tls;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class qf0 extends Lambda implements tls {
    public final /* synthetic */ br81 b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(br81 br81Var, long j) {
        super(1);
        this.b = br81Var;
        this.c = j;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        this.b.a(this.c);
        return zy11.a;
    }
}
