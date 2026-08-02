package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

/* loaded from: classes6.dex */
public final class k1u extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ DrmProxy s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1u(DrmProxy drmProxy, int i) {
        super(1);
        this.r = i;
        this.s = drmProxy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                wqa wqaVar = (wqa) obj;
                wqaVar.getClass();
                wqaVar.b = null;
                wqaVar.a = this.s.getDrmRequestParams().getSessionId() != null ? "***" : null;
                break;
            default:
                uqa uqaVar = (uqa) obj;
                uqaVar.getClass();
                DrmProxy drmProxy = this.s;
                DrmRequestParams copy = drmProxy.getDrmRequestParams().copy(new k1u(drmProxy, 0));
                copy.getClass();
                uqaVar.a = copy;
                break;
        }
        return Unit.a;
    }
}
