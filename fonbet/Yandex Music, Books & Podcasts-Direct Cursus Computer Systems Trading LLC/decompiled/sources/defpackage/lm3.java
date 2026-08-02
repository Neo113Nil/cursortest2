package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lm3 implements o2o {
    public final /* synthetic */ int a;
    public final kl0 b;

    public lm3(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new kl0();
                break;
            default:
                this.b = new kl0();
                break;
        }
    }

    @Override // defpackage.o2o
    public final /* bridge */ /* synthetic */ boolean a(Object obj, pwj pwjVar) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.o2o
    public final k2o b(Object obj, int i, int i2, pwj pwjVar) {
        switch (this.a) {
            case 0:
                return this.b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, pwjVar);
            default:
                return this.b.c(ImageDecoder.createSource(tm3.b((InputStream) obj)), i, i2, pwjVar);
        }
    }
}
