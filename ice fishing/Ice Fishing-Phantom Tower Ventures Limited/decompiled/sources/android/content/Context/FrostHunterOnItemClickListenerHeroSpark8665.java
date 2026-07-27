package android.content.Context;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnItemClickListenerHeroSpark8665 implements Closeable {
    public final ReentrantLock FrostHunterAlertDialogAuroraDelta3200 = new ReentrantLock();
    public boolean FrostHunterCameraXPixelTurboCosmos9814;
    public int FrostHunterFlowMaxDragonHero5809;
    public final RandomAccessFile FrostHunterKeyframeGammaGamma1197;

    public FrostHunterOnItemClickListenerHeroSpark8665(RandomAccessFile randomAccessFile) {
        this.FrostHunterKeyframeGammaGamma1197 = randomAccessFile;
    }

    public final FrostHunterTextViewCosmosPixel1328 FrostHunterAlphaAnimationNeoCosmos5761(long j) {
        ReentrantLock reentrantLock = this.FrostHunterAlertDialogAuroraDelta3200;
        reentrantLock.lock();
        try {
            if (this.FrostHunterCameraXPixelTurboCosmos9814) {
                throw new IllegalStateException("closed");
            }
            this.FrostHunterFlowMaxDragonHero5809++;
            reentrantLock.unlock();
            return new FrostHunterTextViewCosmosPixel1328(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.FrostHunterAlertDialogAuroraDelta3200;
        reentrantLock.lock();
        try {
            if (this.FrostHunterCameraXPixelTurboCosmos9814) {
                return;
            }
            this.FrostHunterCameraXPixelTurboCosmos9814 = true;
            if (this.FrostHunterFlowMaxDragonHero5809 != 0) {
                return;
            }
            synchronized (this) {
                this.FrostHunterKeyframeGammaGamma1197.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.FrostHunterAlertDialogAuroraDelta3200;
        reentrantLock.lock();
        try {
            if (this.FrostHunterCameraXPixelTurboCosmos9814) {
                throw new IllegalStateException("closed");
            }
            synchronized (this) {
                length = this.FrostHunterKeyframeGammaGamma1197.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
