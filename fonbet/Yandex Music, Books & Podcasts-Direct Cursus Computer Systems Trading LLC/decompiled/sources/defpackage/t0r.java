package defpackage;

import java.util.EnumSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class t0r extends aur implements Function2 {
    public s5d j;
    public s5d k;
    public int l;
    public int m;
    public final /* synthetic */ cr n;
    public final /* synthetic */ r5d o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ mwk q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ long s;
    public final /* synthetic */ u3q t;
    public final /* synthetic */ t0q u;
    public final /* synthetic */ EnumSet v;
    public final /* synthetic */ noh w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0r(cr crVar, r5d r5dVar, boolean z, mwk mwkVar, boolean z2, long j, u3q u3qVar, t0q t0qVar, EnumSet enumSet, noh nohVar, Continuation continuation) {
        super(2, continuation);
        this.n = crVar;
        this.o = r5dVar;
        this.p = z;
        this.q = mwkVar;
        this.r = z2;
        this.s = j;
        this.t = u3qVar;
        this.u = t0qVar;
        this.v = enumSet;
        this.w = nohVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new t0r(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0r) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x010e, code lost:
    
        if (r3.c(r11, r21) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0110, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00de, code lost:
    
        if (r4 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r11 == r1) goto L35;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s5d s5dVar;
        Object m;
        int i;
        s5d s5dVar2;
        Object w;
        nm6 nm6Var = nm6.a;
        int i2 = this.m;
        boolean z = this.p;
        cr crVar = this.n;
        if (i2 == 0) {
            qgg.h0(obj);
            StringBuilder sb = new StringBuilder("prepare(type=");
            r5d r5dVar = this.o;
            sb.append(r5dVar);
            sb.append(", playable=");
            sb.append(this.q);
            sb.append(",startPosition=");
            sb.append(this.s);
            sb.append(", mediaOutputTarget=");
            sb.append(this.w);
            sb.append(", playWhenReady=");
            sb.append(z);
            sb.append(", mute=");
            sb.append(this.r);
            sb.append(", fade=");
            sb.append(this.u);
            sb.append(")");
            ssg.a(3, "SmartSwapPlayerWrapper", sb.toString(), null);
            s5dVar = (s5d) crVar.h;
            this.j = s5dVar;
            this.m = 1;
            m = cr.m(crVar, s5dVar, r5dVar, false, this);
        } else if (i2 == 1) {
            s5dVar = this.j;
            qgg.h0(obj);
            m = obj;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.l;
            s5dVar2 = this.k;
            qgg.h0(obj);
            w = obj;
            p5d p5dVar = new p5d(this.q, i != 0, this.r, this.s, (h4q) w, this.t, this.u, this.v);
            this.j = null;
            this.k = null;
            this.l = i;
            this.m = 3;
        }
        q5d q5dVar = (q5d) m;
        s5d s5dVar3 = (s5d) crVar.h;
        if (q5dVar != null) {
            ssg.a(3, "SmartSwapPlayerWrapper", hrg.r("swapped ", s5dVar.getClass().getSimpleName(), " to ", s5dVar3.getClass().getSimpleName()), null);
        }
        if (!z) {
            if (!(q5dVar != null ? q5dVar.a : false)) {
                i = 0;
                s5dVar2 = (s5d) crVar.h;
                this.j = null;
                this.k = s5dVar2;
                this.l = i;
                this.m = 2;
                w = s5dVar2.w(this);
            }
        }
        i = 1;
        s5dVar2 = (s5d) crVar.h;
        this.j = null;
        this.k = s5dVar2;
        this.l = i;
        this.m = 2;
        w = s5dVar2.w(this);
    }
}
