package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vpf implements lfh {
    public final /* synthetic */ int a;
    public final /* synthetic */ lfh b;
    public final /* synthetic */ zpf c;
    public final /* synthetic */ int d;
    public final /* synthetic */ lfh e;

    public /* synthetic */ vpf(lfh lfhVar, zpf zpfVar, int i, lfh lfhVar2, int i2) {
        this.a = i2;
        this.c = zpfVar;
        this.d = i;
        this.e = lfhVar2;
        this.b = lfhVar;
    }

    @Override // defpackage.lfh
    public final int a() {
        switch (this.a) {
        }
        return this.b.a();
    }

    @Override // defpackage.lfh
    public final Map b() {
        switch (this.a) {
        }
        return this.b.b();
    }

    @Override // defpackage.lfh
    public final int c() {
        switch (this.a) {
        }
        return this.b.c();
    }

    @Override // defpackage.lfh
    public final void d() {
        switch (this.a) {
            case 0:
                int i = this.d;
                zpf zpfVar = this.c;
                zpfVar.e = i;
                this.e.d();
                tpi tpiVar = zpfVar.l;
                long[] jArr = tpiVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = tpiVar.b[i5];
                                    anr anrVar = (anr) tpiVar.c[i5];
                                    int k = zpfVar.m.k(obj);
                                    if (k < 0 || k >= zpfVar.e) {
                                        anrVar.a();
                                        tpiVar.l(i5);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                break;
            default:
                int i6 = this.d;
                zpf zpfVar2 = this.c;
                zpfVar2.d = i6;
                this.e.d();
                zpfVar2.c(zpfVar2.d);
                break;
        }
    }

    @Override // defpackage.lfh
    public final Function1 e() {
        switch (this.a) {
        }
        return this.b.e();
    }
}
