package defpackage;

import com.yandex.music.shared.wave.screen.wheel.data.dto.request.WheelContextDto;

/* loaded from: classes4.dex */
public final class zjv extends cg6 {
    public WheelContextDto j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bkv l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjv(bkv bkvVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = bkvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
