package defpackage;

import com.yandex.passport.common.core.b;
import com.yandex.passport.internal.network.h;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class e93 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public e93(hab habVar, c93 c93Var, long j) {
        this.c = habVar;
        this.d = c93Var;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                hab habVar = (hab) this.c;
                c93 c93Var = (c93) this.d;
                String str2 = c93Var.a.h;
                long a = habVar.a(!(str2 == null || StringsKt.U(str2)), false);
                d85 d85Var = new d85(a);
                if (!c93Var.c.a) {
                    d85Var = null;
                }
                return new d85(d85Var != null ? d85Var.a : c3x.D(this.b, a));
            default:
                b bVar = (b) this.c;
                String str3 = (String) this.d;
                if (str3 == null) {
                    str3 = h.f(bVar, Long.valueOf(this.b));
                }
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    str = "https://id.yandex.%s";
                } else if (ordinal == 1) {
                    str = "https://passport.yandex-team.ru";
                } else if (ordinal == 2) {
                    str = "https://id-test.yandex.%s";
                } else if (ordinal == 3) {
                    str = "https://passport-test.yandex-team.ru";
                } else {
                    if (ordinal != 4) {
                        b6e.l(bVar, "Unknown environment ");
                        return null;
                    }
                    str = "https://id-rc.yandex.%s";
                }
                return new com.yandex.passport.common.url.b(String.format(str, Arrays.copyOf(new Object[]{str3}, 1)));
        }
    }

    public e93(h hVar, b bVar, String str, long j) {
        this.c = bVar;
        this.d = str;
        this.b = j;
    }
}
