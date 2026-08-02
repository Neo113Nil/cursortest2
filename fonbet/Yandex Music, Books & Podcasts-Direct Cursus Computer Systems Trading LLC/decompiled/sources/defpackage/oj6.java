package defpackage;

import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class oj6 extends pj6 {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public oj6(String str, v76 v76Var) {
        str.getClass();
        v76Var.getClass();
        this.b = btf.b(new aw5(6, str, v76Var));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    private final arf c() {
        return this.b;
    }

    @Override // defpackage.pj6
    public IOException a() {
        switch (this.a) {
            case 1:
                return (IllegalRequestOnNetworkModeException) ((jyr) this.b).getValue();
            default:
                return super.a();
        }
    }

    @Override // defpackage.pj6
    public final arf b() {
        switch (this.a) {
            case 0:
                return c();
            default:
                return (jyr) this.b;
        }
    }

    public oj6(jyr jyrVar) {
        this.b = jyrVar;
    }

    public oj6(IOException iOException) {
        this.b = new kme(iOException);
    }
}
