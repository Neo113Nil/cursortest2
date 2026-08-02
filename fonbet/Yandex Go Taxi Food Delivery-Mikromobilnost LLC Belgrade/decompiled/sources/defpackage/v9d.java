package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class v9d implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ m3u0 c;

    public /* synthetic */ v9d(long j, m3u0 m3u0Var, int i) {
        this.a = i;
        this.b = j;
        this.c = m3u0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m3u0 m3u0Var = this.c;
        switch (i) {
            case 0:
                x9d x9dVar = x9d.a;
                qam.g0((qam) obj, ((ldc) m3u0Var.getValue()).a, 0L, 0L, this.b, null, 246);
                break;
            case 1:
                qam.t0((qam) obj, this.b, 0L, 0L, y6i0.c(((Number) m3u0Var.getValue()).floatValue(), 0.0f, 1.0f), null, HProv.PP_INFO);
                break;
            case 2:
                qam.g0((qam) obj, ((ldc) m3u0Var.getValue()).a, 0L, 0L, this.b, null, 246);
                break;
            default:
                qam.z((qam) obj, this.b, 0.0f, 0L, ((Number) m3u0Var.getValue()).floatValue(), null, 0, HProv.PP_INFO);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ v9d(m3u0 m3u0Var, long j, int i) {
        this.a = i;
        this.c = m3u0Var;
        this.b = j;
    }
}
