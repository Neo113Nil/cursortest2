package defpackage;

import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class xvt extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ AtomicReference t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvt(Object obj, AtomicReference atomicReference, int i) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = atomicReference;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Object obj2 = this.s;
                AtomicReference atomicReference = this.t;
                synchronized (obj2) {
                    atomicReference.set(new u7o(obj));
                    obj2.notify();
                }
                return Unit.a;
            default:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                Object obj3 = this.s;
                AtomicReference atomicReference2 = this.t;
                synchronized (obj3) {
                    Parcelable.Creator<bfk> creator = bfk.CREATOR;
                    atomicReference2.set(new s7o(y7g.x(r7wVar)));
                    obj3.notify();
                }
                return Unit.a;
        }
    }
}
