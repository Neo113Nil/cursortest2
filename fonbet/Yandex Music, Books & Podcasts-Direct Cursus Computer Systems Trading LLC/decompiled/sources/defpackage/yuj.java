package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes6.dex */
public final class yuj extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ DataSourceParameters v;
    public final /* synthetic */ DataSourceParameters w;
    public final /* synthetic */ PlaybackParameters x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yuj(boolean z, boolean z2, boolean z3, DataSourceParameters dataSourceParameters, DataSourceParameters dataSourceParameters2, PlaybackParameters playbackParameters, int i, int i2) {
        super(1);
        this.r = i2;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = dataSourceParameters;
        this.w = dataSourceParameters2;
        this.x = playbackParameters;
        this.y = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                zv7 zv7Var = (zv7) obj;
                zv7Var.getClass();
                zv7Var.a = Boolean.valueOf(this.s && !this.t);
                zv7Var.b = Boolean.valueOf(this.u);
                zv7Var.c = this.v;
                zv7Var.d = this.w;
                zv7Var.e = this.x;
                zv7Var.f = this.y;
                break;
            default:
                zv7 zv7Var2 = (zv7) obj;
                zv7Var2.getClass();
                zv7Var2.a = Boolean.valueOf(this.s && !this.t);
                zv7Var2.b = Boolean.valueOf(this.u);
                zv7Var2.c = this.v;
                zv7Var2.d = this.w;
                zv7Var2.e = this.x;
                zv7Var2.f = this.y;
                break;
        }
        return Unit.a;
    }
}
