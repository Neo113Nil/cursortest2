package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;

/* loaded from: classes6.dex */
public final class saw extends aur implements uyc {
    public /* synthetic */ mmq j;
    public /* synthetic */ DrmMode k;
    public /* synthetic */ int l;
    public /* synthetic */ String m;
    public /* synthetic */ String n;

    public saw(Continuation continuation) {
        super(6, continuation);
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj3).intValue();
        saw sawVar = new saw((Continuation) obj6);
        sawVar.j = (mmq) obj;
        sawVar.k = (DrmMode) obj2;
        sawVar.l = intValue;
        sawVar.m = (String) obj4;
        sawVar.n = (String) obj5;
        return sawVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        return new hxj(this.j, this.k, this.l, this.n, this.m);
    }
}
