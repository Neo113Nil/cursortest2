package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class mx {
    public final tf6 a = gld.e(dm6.b);
    public final ds3 b;

    public mx(e0j e0jVar) {
        this.b = e0jVar.a.b;
    }

    public final void a(String str) {
        b0o b0oVar = new b0o();
        b0oVar.e(ServiceCommand.TYPE_GET, null);
        b0oVar.g(str);
        x97.y(this.a, null, null, new qi(this, b0oVar.b(), (Continuation) null, 2), 3);
    }
}
