package defpackage;

import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes3.dex */
public final class l8n extends opn {
    public final ComposeView u;
    public final xdr v;
    public final /* synthetic */ p8n w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8n(p8n p8nVar, ComposeView composeView) {
        super(composeView);
        this.w = p8nVar;
        this.u = composeView;
        this.v = ydr.a(Boolean.FALSE);
        composeView.setOnClickListener(new fq2(5, p8nVar, this));
    }
}
