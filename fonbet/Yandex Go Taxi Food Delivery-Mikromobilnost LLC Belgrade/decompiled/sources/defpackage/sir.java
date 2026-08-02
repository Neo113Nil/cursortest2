package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sir implements su00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sir(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.su00
    public final Object getHost(Continuation continuation) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((not) ((uir) obj).b.a).d();
            default:
                return (String) obj;
        }
    }
}
