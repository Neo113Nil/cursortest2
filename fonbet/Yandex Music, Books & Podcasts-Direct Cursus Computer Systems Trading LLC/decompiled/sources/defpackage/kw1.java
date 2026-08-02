package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class kw1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kw1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ExoPlayer) this.b).x0((lw1) this.c);
                break;
            case 1:
                mal.d(new uv(12, (i8l) this.b, (ypl) this.c));
                break;
            case 2:
                ((i8l) this.b).x0((lw1) this.c);
                break;
            case 3:
                zco zcoVar = (zco) obj;
                zcoVar.getClass();
                sdr sdrVar = (sdr) this.b;
                zcoVar.k(((Number) sdrVar.getValue()).floatValue());
                zcoVar.n(((Number) sdrVar.getValue()).floatValue());
                zcoVar.a(((Number) ((sdr) this.c).getValue()).floatValue());
                break;
            case 4:
                ((ExoPlayer) this.b).x0((rzs) this.c);
                break;
            case 5:
                opf opfVar = (opf) obj;
                opfVar.getClass();
                long j = ((ylu) ((Function0) this.b).invoke()).a;
                jpa.D0(opfVar, d85.b(j, ((Number) ((Function0) this.c).invoke()).floatValue() * d85.d(j), 0.0f, 0.0f, 0.0f, 14), 0.0f, 0L, 0.0f, null, 3, 62);
                opfVar.a();
                break;
            case 6:
                jpa jpaVar = (jpa) obj;
                jpaVar.getClass();
                w4k w4kVar = (w4k) this.b;
                mu3 s = jpaVar.q0().s();
                s.m(ywf.d(0L, jpaVar.e()), hld.p());
                w4k.h(w4kVar, jpaVar, jpaVar.e(), new d43(((ylu) ((Function0) this.c).invoke()).d, 5), 2);
                s.k();
                break;
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof c5w) {
                    ucg ucgVar = (ucg) this.b;
                    ucgVar.c.compareAndSet(-256, ((c5w) th).a);
                }
                ((lcg) this.c).cancel(false);
                break;
        }
        return Unit.a;
    }
}
