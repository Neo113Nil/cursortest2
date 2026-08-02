package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.ui.debug.PreloadState;

/* loaded from: classes6.dex */
public final class neb extends uif implements Function2 {
    public final /* synthetic */ String r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ Integer t;
    public final /* synthetic */ PreloadState u;
    public final /* synthetic */ mmq v;
    public final /* synthetic */ pi3 w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ List y;
    public final /* synthetic */ yci z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public neb(String str, Integer num, Integer num2, PreloadState preloadState, mmq mmqVar, pi3 pi3Var, boolean z, List list, yci yciVar, int i) {
        super(2);
        this.r = str;
        this.s = num;
        this.t = num2;
        this.u = preloadState;
        this.v = mmqVar;
        this.w = pi3Var;
        this.x = z;
        this.y = list;
        this.z = yciVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = rvf.R(1);
        vwb.n(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (hq5) obj, R);
        return Unit.a;
    }
}
