package ru.yandex.taxi.persuggest.source;

import defpackage.b64;
import defpackage.dai0;
import defpackage.evu0;
import defpackage.gci0;
import defpackage.tje;
import defpackage.tse;
import defpackage.w6r;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.y6r;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

/* loaded from: classes9.dex */
public final class f implements w6r {
    public String a = FinalSuggestScreen.UNSUPPORTED.getValue();
    public boolean b;
    public boolean c;
    public boolean d;
    public final gci0 e;

    public f(tse tseVar, com.yandex.go.navigation.screen.c cVar) {
        this.e = kotlinx.coroutines.flow.e.R(new e(cVar.c()), tseVar, wsr0.a(xsr0.a, 3), dai0.z(cVar.b()));
        tje.N(tseVar, null, null, new FinalSuggestScreenRepositoryImpl$1(this, null), 3);
    }

    public final void a() {
        String str = (String) kotlin.collections.a.R(evu0.Y(this.a, new char[]{'.'}, 0, 6));
        if (str == null) {
            str = "";
        }
        this.a = b64.j(str, FinalSuggestScreen.ADDRESSES_EDIT_SUFFIX.getValue());
    }

    public final void b() {
        String str = (String) kotlin.collections.a.R(evu0.Y(this.a, new char[]{'.'}, 0, 6));
        if (str == null) {
            str = "";
        }
        this.a = b64.j(str, FinalSuggestScreen.ADDRESSES_SUFFIX.getValue());
    }

    public final void c(FinalSuggestScreen finalSuggestScreen) {
        if (this.c) {
            return;
        }
        int i = y6r.a[finalSuggestScreen.ordinal()];
        if (i == 1) {
            a();
            this.b = false;
            return;
        }
        if (i == 2) {
            b();
            this.b = false;
        } else if (i == 3) {
            this.b = true;
        } else if (i == 4) {
            this.b = false;
        } else {
            this.a = finalSuggestScreen.getValue();
            this.b = false;
        }
    }
}
