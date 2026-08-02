package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class x5l0 implements wni {
    public final Context a;
    public final hwy0 b;
    public final a6l0 c;

    public x5l0(Context context, hwy0 hwy0Var, a6l0 a6l0Var) {
        this.a = context;
        this.b = hwy0Var;
        this.c = a6l0Var;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new a(-1414306638, new v5l0(this, 2), true));
        return composeView;
    }
}
