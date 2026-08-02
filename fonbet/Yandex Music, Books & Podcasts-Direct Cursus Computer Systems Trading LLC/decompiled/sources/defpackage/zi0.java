package defpackage;

import android.view.ActionMode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class zi0 implements hes {
    public final AndroidComposeView a;
    public ActionMode b;
    public final eps c;
    public ies d;

    public zi0(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        k5 k5Var = new k5(6, this);
        eps epsVar = new eps();
        epsVar.a = k5Var;
        epsVar.b = ynn.e;
        epsVar.c = null;
        epsVar.d = null;
        epsVar.e = null;
        epsVar.f = null;
        epsVar.g = null;
        this.c = epsVar;
        this.d = ies.b;
    }

    public final void a(ynn ynnVar, Function0 function0, obs obsVar, Function0 function02, Function0 function03, obs obsVar2) {
        eps epsVar = this.c;
        epsVar.b = ynnVar;
        epsVar.c = function0;
        epsVar.e = function02;
        epsVar.d = obsVar;
        epsVar.f = function03;
        epsVar.g = obsVar2;
        ActionMode actionMode = this.b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.d = ies.a;
        this.b = this.a.startActionMode(new njc(epsVar), 1);
    }
}
