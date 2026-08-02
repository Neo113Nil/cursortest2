package defpackage;

/* loaded from: classes15.dex */
public final class to4 implements k120 {
    public final /* synthetic */ int a;
    public final b220 b;

    public /* synthetic */ to4(b220 b220Var, int i) {
        this.a = i;
        this.b = b220Var;
    }

    @Override // defpackage.k120
    public final Object j() {
        String str;
        String str2;
        int i = this.a;
        b220 b220Var = this.b;
        switch (i) {
            case 0:
                b5o b = b220Var.b();
                return (b == null || (str = b.a) == null) ? "backend.messenger.yandex.net" : str;
            default:
                b5o g = b220Var.g();
                return (g == null || (str2 = g.a) == null) ? "tools.messenger.yandex.net" : str2;
        }
    }

    @Override // defpackage.k120
    public final /* bridge */ /* synthetic */ Object k() {
        switch (this.a) {
            case 0:
                return "internal.mssngr.yandex-team.ru";
            default:
                return "tools.messenger.yandex.net";
        }
    }

    @Override // defpackage.k120
    public final /* bridge */ /* synthetic */ Object l() {
        switch (this.a) {
            case 0:
                return "backend.messenger.test.yandex-team.ru";
            default:
                return "tools.messenger.yandex.net";
        }
    }

    @Override // defpackage.k120
    public final /* bridge */ /* synthetic */ Object m() {
        switch (this.a) {
            case 0:
                return "yandex.ru";
            default:
                return "tools.messenger.yandex.net";
        }
    }

    @Override // defpackage.k120
    public final Object o() {
        String str;
        String str2;
        int i = this.a;
        b220 b220Var = this.b;
        switch (i) {
            case 0:
                b5o b = b220Var.b();
                return (b == null || (str = b.b) == null) ? "mssngr-router-test.search.yandex.net" : str;
            default:
                b5o g = b220Var.g();
                return (g == null || (str2 = g.b) == null) ? "tools.messenger.yandex.net" : str2;
        }
    }

    @Override // defpackage.k120
    public final /* bridge */ /* synthetic */ Object s() {
        switch (this.a) {
            case 0:
                return "backend.messenger.alpha.yandex-team.ru";
            default:
                return "tools.messenger.yandex.net";
        }
    }
}
