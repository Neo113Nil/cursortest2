package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class h9i extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ i9i s;
    public final /* synthetic */ e1j t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h9i(i9i i9iVar, e1j e1jVar, int i) {
        super(1);
        this.r = i;
        this.s = i9iVar;
        this.t = e1jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return this.s.a(this.t, bool);
            default:
                ((r7w) obj).getClass();
                return this.s.a(this.t, null);
        }
    }
}
