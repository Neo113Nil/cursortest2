package defpackage;

import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;

/* loaded from: classes4.dex */
public final class ycr extends cg6 {
    public StartVideoClipRadioQueueCommand j;
    public es6 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ zcr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycr(zcr zcrVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = zcrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, null, this);
    }
}
