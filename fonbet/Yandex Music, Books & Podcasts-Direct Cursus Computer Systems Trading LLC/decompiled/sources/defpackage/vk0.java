package defpackage;

import androidx.compose.animation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vk0 extends uif implements Function2 {
    public final /* synthetic */ Object r;
    public final /* synthetic */ yci s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ g40 u;
    public final /* synthetic */ String v;
    public final /* synthetic */ Function1 w;
    public final /* synthetic */ wn5 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk0(Object obj, yci yciVar, Function1 function1, g40 g40Var, String str, Function1 function12, wn5 wn5Var, int i, int i2) {
        super(2);
        this.r = obj;
        this.s = yciVar;
        this.t = function1;
        this.u = g40Var;
        this.v = str;
        this.w = function12;
        this.x = wn5Var;
        this.y = i;
        this.z = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        a.b(this.r, this.s, this.t, this.u, this.v, this.w, this.x, (hq5) obj, rvf.R(this.y | 1), this.z);
        return Unit.a;
    }
}
