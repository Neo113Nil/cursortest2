package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class xb5 extends vf {
    public final jsg c;
    public final jsg d;
    public final boolean e;
    public final jsg f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public final boolean j;
    public final boolean k;
    public final jsg l;
    public final jsg m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xb5(Function0 function0, Integer num, int i, Integer num2, Integer num3, boolean z, Integer num4, cf cfVar, boolean z2, boolean z3, Integer num5, int i2) {
        this(function0, num != null ? new jsg(num.intValue(), 5) : null, new jsg(i, r1), z, null, num4, r10, r11, r12, r13, r14, new jsg(i, r1), num5 != null ? new jsg(num5.intValue(), 15) : null);
        Integer num6 = (i2 & 8) != 0 ? null : num2;
        Integer num7 = (i2 & 16) != 0 ? null : num3;
        cf cfVar2 = (i2 & 256) != 0 ? cf.Main : cfVar;
        boolean z4 = (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? false : z2;
        boolean z5 = (i2 & 1024) != 0 ? false : z3;
        function0.getClass();
        cfVar2.getClass();
        int i3 = 15;
    }

    public /* synthetic */ xb5(Function0 function0, jsg jsgVar, jsg jsgVar2, jsg jsgVar3, Integer num, cf cfVar, Integer num2, Integer num3, jsg jsgVar4, int i) {
        this(function0, jsgVar, jsgVar2, false, jsgVar3, num, (i & 64) != 0 ? cf.Main : cfVar, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3, false, false, jsgVar2, jsgVar4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb5(Function0 function0, jsg jsgVar, jsg jsgVar2, boolean z, jsg jsgVar3, Integer num, cf cfVar, Integer num2, Integer num3, boolean z2, boolean z3, jsg jsgVar4, jsg jsgVar5) {
        super(function0, cfVar);
        function0.getClass();
        jsgVar2.getClass();
        cfVar.getClass();
        jsgVar4.getClass();
        this.c = jsgVar;
        this.d = jsgVar2;
        this.e = z;
        this.f = jsgVar3;
        this.g = num;
        this.h = num2;
        this.i = num3;
        this.j = z2;
        this.k = z3;
        this.l = jsgVar4;
        this.m = jsgVar5;
    }
}
