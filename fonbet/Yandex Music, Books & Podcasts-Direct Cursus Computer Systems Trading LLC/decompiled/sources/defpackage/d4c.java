package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class d4c extends aur implements Function2 {
    public float j;
    public float k;
    public float l;
    public float m;
    public long n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ au1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4c(au1 au1Var, Continuation continuation) {
        super(2, continuation);
        this.r = au1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        d4c d4cVar = new d4c(this.r, continuation);
        d4cVar.q = obj;
        return d4cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d4c) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00cf, code lost:
    
        if (r4.emit(r8, r18) == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e9, code lost:
    
        if (defpackage.y2x.o(100, r18) == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0106, code lost:
    
        if (r4.emit(r1, r18) == r5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        if (r4.emit(r11, r18) == r5) goto L39;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00e9 -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float J0;
        float f;
        long j;
        int i;
        float f2;
        char c;
        float f3;
        float f4;
        au1 au1Var = this.r;
        long j2 = au1Var.b;
        mka mkaVar = (mka) au1Var.c;
        rjc rjcVar = (rjc) this.q;
        nm6 nm6Var = nm6.a;
        int i2 = this.p;
        int i3 = 1;
        if (i2 == 0) {
            qgg.h0(obj);
            J0 = ((ExoPlayer) mkaVar.a).J0();
            f = j2 + J0;
            Float f5 = new Float(0.0f);
            this.q = rjcVar;
            this.j = J0;
            this.k = f;
            this.p = 1;
        } else if (i2 == 1) {
            f = this.k;
            J0 = this.j;
            qgg.h0(obj);
        } else {
            if (i2 == 2) {
                qgg.h0(obj);
                return Unit.a;
            }
            if (i2 == 3) {
                float f6 = this.m;
                f2 = this.l;
                i = this.o;
                j = this.n;
                float f7 = this.k;
                J0 = this.j;
                qgg.h0(obj);
                f3 = f6;
                c = 3;
                f = f7;
                float f8 = f2;
                f4 = J0;
                this.q = rjcVar;
                this.j = f4;
                this.k = f;
                this.n = j;
                this.o = i;
                this.l = f8;
                this.m = f3;
                this.p = 4;
            } else {
                if (i2 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f = this.k;
                f4 = this.j;
                qgg.h0(obj);
                c = 3;
                J0 = f4;
                i3 = 1;
            }
        }
        j = ((ExoPlayer) mkaVar.a).J0();
        float f9 = j;
        i = J0 - f9 > 1000.0f ? i3 : 0;
        if (i == 0 && f9 < f && ((ExoPlayer) mkaVar.a).e()) {
            f2 = (f9 - J0) / j2;
            f3 = 1.0f / (((float) Math.exp((f2 - 0.6f) * (-10.0f))) + 1.0f);
            Float f10 = new Float(f3);
            this.q = rjcVar;
            this.j = J0;
            this.k = f;
            this.n = j;
            this.o = i;
            this.l = f2;
            this.m = f3;
            c = 3;
            this.p = 3;
        } else {
            Float f11 = new Float(1.0f);
            this.q = null;
            this.j = J0;
            this.k = f;
            this.n = j;
            this.o = i;
            this.p = 2;
        }
        return nm6Var;
    }
}
