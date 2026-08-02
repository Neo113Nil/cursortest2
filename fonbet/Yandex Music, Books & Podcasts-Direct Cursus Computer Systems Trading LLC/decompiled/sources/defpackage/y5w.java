package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class y5w implements sr5, uyf {
    public final AndroidComposeView a;
    public final wr5 b;
    public boolean c;
    public nyf d;
    public Function2 e = hp5.a;

    public y5w(AndroidComposeView androidComposeView, wr5 wr5Var) {
        this.a = androidComposeView;
        this.b = wr5Var;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        if (kyfVar == kyf.ON_DESTROY) {
            c();
        } else {
            if (kyfVar != kyf.ON_CREATE || this.c) {
                return;
            }
            a(this.e);
        }
    }

    public final void a(Function2 function2) {
        this.a.setOnViewTreeOwnersAvailable(new qqv(1, this, function2));
    }

    @Override // defpackage.sr5
    public final void c() {
        if (!this.c) {
            this.c = true;
            this.a.getView().setTag(R.id.wrapped_composition_tag, null);
            nyf nyfVar = this.d;
            if (nyfVar != null) {
                nyfVar.d(this);
            }
        }
        this.b.c();
    }
}
