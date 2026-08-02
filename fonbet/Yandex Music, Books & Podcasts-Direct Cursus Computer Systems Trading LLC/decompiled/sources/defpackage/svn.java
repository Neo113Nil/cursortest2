package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class svn implements o3c {
    public final /* synthetic */ int a;
    public final szm b;
    public final szm c;

    public /* synthetic */ svn(szm szmVar, szm szmVar2, int i) {
        this.a = i;
        this.b = szmVar;
        this.c = szmVar2;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new rvn((iw0) this.b.get(), (CoroutineContext) this.c.get());
            case 1:
                return new llp((CoroutineContext) this.b.get(), (wb7) this.c.get());
            case 2:
                return new amp((eis) this.b.get(), (gwt) this.c.get());
            default:
                return new lnp((esp) this.b.get(), (esp) this.c.get());
        }
    }
}
