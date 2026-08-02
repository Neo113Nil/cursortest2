package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class se0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ AndroidComposeView k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se0(AndroidComposeView androidComposeView, cg6 cg6Var) {
        super(cg6Var);
        this.k = androidComposeView;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.L(null, this);
        return nm6.a;
    }
}
