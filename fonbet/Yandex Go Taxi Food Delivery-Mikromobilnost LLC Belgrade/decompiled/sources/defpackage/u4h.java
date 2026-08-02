package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class u4h implements ruy {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ qyg w;

    public /* synthetic */ u4h(h42 h42Var, a aVar, qyg qygVar, int i) {
        this.a = i;
        this.b = h42Var;
        this.c = aVar;
        this.w = qygVar;
    }

    @Override // defpackage.ruy
    public final void invoke(Object obj) {
        int i = this.a;
        qyg qygVar = this.w;
        a aVar = this.c;
        h42 h42Var = this.b;
        j42 j42Var = (j42) obj;
        switch (i) {
            case 0:
                j42Var.onVideoInputFormatChanged(h42Var, aVar, qygVar);
                break;
            default:
                j42Var.onAudioInputFormatChanged(h42Var, aVar, qygVar);
                break;
        }
    }
}
