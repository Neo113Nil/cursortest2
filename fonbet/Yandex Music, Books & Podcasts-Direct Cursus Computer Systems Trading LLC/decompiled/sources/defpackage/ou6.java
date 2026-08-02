package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ou6 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ d8t s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou6(d8t d8tVar, int i) {
        super(1);
        this.r = i;
        this.s = d8tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return Boolean.valueOf(!Intrinsics.d(obj, this.s.d.getValue()));
            case 1:
                return new h8t(this.s, 0);
            default:
                return new h8t(this.s, 1);
        }
    }
}
