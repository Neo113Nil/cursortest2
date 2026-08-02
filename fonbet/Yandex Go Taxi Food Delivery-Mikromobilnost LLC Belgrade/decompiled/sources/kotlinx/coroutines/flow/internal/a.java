package kotlinx.coroutines.flow.internal;

import defpackage.b64;
import defpackage.bvf0;
import defpackage.fse;
import defpackage.gqs;
import defpackage.jl40;
import defpackage.q5z;
import defpackage.sb2;
import defpackage.tfi0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class a implements gqs {
    public final fse a;
    public final int b;
    public final BufferOverflow c;

    public a(fse fseVar, int i, BufferOverflow bufferOverflow) {
        this.a = fseVar;
        this.b = i;
        this.c = bufferOverflow;
    }

    @Override // defpackage.gqs
    public final tpr a(fse fseVar, int i, BufferOverflow bufferOverflow) {
        fse fseVar2 = this.a;
        fse plus = fseVar.plus(fseVar2);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.c;
        int i2 = this.b;
        if (bufferOverflow == bufferOverflow2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = bufferOverflow3;
        }
        return (jl40.l(plus, fseVar2) && i == i2 && bufferOverflow == bufferOverflow3) ? this : h(plus, i, bufferOverflow);
    }

    @Override // defpackage.tpr
    public Object collect(vpr vprVar, Continuation continuation) {
        Object n = bvf0.n(new ChannelFlow$collect$2(vprVar, this, null), continuation);
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : zy11.a;
    }

    public String d() {
        return null;
    }

    public abstract Object e(y6f0 y6f0Var, Continuation continuation);

    public abstract a h(fse fseVar, int i, BufferOverflow bufferOverflow);

    public tpr i() {
        return null;
    }

    public tfi0 j(tse tseVar) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        wls channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        x6f0 x6f0Var = new x6f0(q5z.M(tseVar, this.a), sb2.a(i, this.c, null, 4));
        x6f0Var.m0(coroutineStart, x6f0Var, channelFlow$collectToFun$1);
        return x6f0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        fse fseVar = this.a;
        if (fseVar != emptyCoroutineContext) {
            arrayList.add("context=" + fseVar);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.c;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return b64.p(sb, kotlin.collections.a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62), ']');
    }
}
