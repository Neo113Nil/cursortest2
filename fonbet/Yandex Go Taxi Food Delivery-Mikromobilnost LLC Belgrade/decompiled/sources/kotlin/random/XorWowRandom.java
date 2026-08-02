package kotlin.random;

import defpackage.gga1;
import defpackage.ny61;
import java.io.InvalidObjectException;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "", RemoteBioParameters.X, CA20Status.STATUS_USER_I, RemoteBioParameters.Y, "z", "w", "v", "addend", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public XorWowRandom(int i, int i2) {
        int i3 = ~i;
        int i4 = (i << 10) ^ (i2 >>> 4);
        this.x = i;
        this.y = i2;
        this.z = 0;
        this.w = 0;
        this.v = i3;
        this.addend = i4;
        j();
        for (int i5 = 0; i5 < 64; i5++) {
            b();
        }
    }

    private final Object readResolve() {
        try {
            j();
            return this;
        } catch (Throwable th) {
            throw new InvalidObjectException(th.getMessage()).initCause(th);
        }
    }

    @Override // kotlin.random.Random
    public final int a(int i) {
        return gga1.l(b(), i);
    }

    @Override // kotlin.random.Random
    public final int b() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    public final void j() {
        if ((this.v | this.x | this.y | this.z | this.w) != 0) {
            return;
        }
        ny61.g("Initial state must have at least one non-zero element.");
    }
}
