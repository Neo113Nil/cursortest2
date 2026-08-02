package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class spy0 implements wni {
    public final Context a;
    public final upy0 b;
    public final hwy0 c;
    public final dci w;

    public spy0(Context context, upy0 upy0Var, hwy0 hwy0Var, dci dciVar) {
        this.a = context;
        this.b = upy0Var;
        this.c = hwy0Var;
        this.w = dciVar;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView(this.a, null, 0, 6, null);
        composeView.setContent(new a(-1241379420, new qpy0(this, 0), true));
        return composeView;
    }
}
