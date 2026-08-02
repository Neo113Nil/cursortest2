package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class v28 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ e1j s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v28(e1j e1jVar) {
        super(1);
        this.r = 2;
        this.s = e1jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                n9i n9iVar = (n9i) obj;
                e1j e1jVar = this.s;
                q0j method = e1jVar.method();
                String b = e1jVar.b();
                z9h d = e1jVar.d();
                z9h a = e1jVar.a();
                z9h c = e1jVar.c();
                if (n9iVar != null) {
                    c.j("X-Oauth-Token", n9iVar.a);
                }
                return new uyo(method, b, d, a, c, e1jVar.encoding());
            case 1:
                String str = (String) obj;
                e1j e1jVar2 = this.s;
                q0j method2 = e1jVar2.method();
                String b2 = e1jVar2.b();
                z9h d2 = e1jVar2.d();
                z9h a2 = e1jVar2.a();
                z9h c2 = e1jVar2.c();
                if (str != null) {
                    c2.j("X-USER-UUID", str);
                }
                return new uyo(method2, b2, d2, a2, c2, e1jVar2.encoding());
            default:
                ((r7w) obj).getClass();
                return this.s;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v28(e1j e1jVar, b0j b0jVar, int i) {
        super(1);
        this.r = i;
        this.s = e1jVar;
    }
}
