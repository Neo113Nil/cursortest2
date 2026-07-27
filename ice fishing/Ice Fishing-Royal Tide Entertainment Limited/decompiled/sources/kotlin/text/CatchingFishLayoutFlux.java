package kotlin.text;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class CatchingFishLayoutFlux implements CatchingFishAnimationMVI {
    public final CatchingFishWidgetGradle CatchingFishDaggerWebsocket = new CatchingFishWidgetGradle();
    public final CatchingFishViewOkHttp CatchingFishReduxKtor;
    public boolean CatchingFishWorkManager;

    public CatchingFishLayoutFlux(CatchingFishViewOkHttp catchingFishViewOkHttp) {
        this.CatchingFishReduxKtor = catchingFishViewOkHttp;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final void CatchingFishCloudMessaging(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWidgetGradle, "source");
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        this.CatchingFishDaggerWebsocket.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
        CatchingFishSnackbar();
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishAnimationMVI CatchingFishDaggerHiltFAB(String str) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(str, "string");
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        this.CatchingFishDaggerWebsocket.CatchingFishMutableLiveData(str);
        CatchingFishSnackbar();
        return this;
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishAnimationMVI CatchingFishFragmentHandler() {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        long j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
        if (j > 0) {
            this.CatchingFishReduxKtor.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
        }
        return this;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.CatchingFishParcelableFAB();
    }

    public final CatchingFishAnimationMVI CatchingFishSnackbar() {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        long CatchingFishSnackbar = catchingFishWidgetGradle.CatchingFishSnackbar();
        if (CatchingFishSnackbar > 0) {
            this.CatchingFishReduxKtor.CatchingFishCloudMessaging(catchingFishWidgetGradle, CatchingFishSnackbar);
        }
        return this;
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishWidgetGradle CatchingFishViewModelScope() {
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishAnimationMVI CatchingFishWorkManager(long j) {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        this.CatchingFishDaggerWebsocket.CatchingFishMVPRobolectric(j);
        CatchingFishSnackbar();
        return this;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CatchingFishViewOkHttp catchingFishViewOkHttp = this.CatchingFishReduxKtor;
        if (this.CatchingFishWorkManager) {
            return;
        }
        try {
            CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
            long j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
            if (j > 0) {
                catchingFishViewOkHttp.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            catchingFishViewOkHttp.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.CatchingFishWorkManager = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // kotlin.text.CatchingFishAnimationMVI, kotlin.text.CatchingFishViewOkHttp, java.io.Flushable
    public final void flush() {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishDaggerWebsocket;
        long j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
        CatchingFishViewOkHttp catchingFishViewOkHttp = this.CatchingFishReduxKtor;
        if (j > 0) {
            catchingFishViewOkHttp.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
        }
        catchingFishViewOkHttp.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.CatchingFishWorkManager;
    }

    public final String toString() {
        return "buffer(" + this.CatchingFishReduxKtor + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(byteBuffer, "source");
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        int write = this.CatchingFishDaggerWebsocket.write(byteBuffer);
        CatchingFishSnackbar();
        return write;
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishAnimationMVI writeByte(int i) {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        this.CatchingFishDaggerWebsocket.CatchingFishCardViewView(i);
        CatchingFishSnackbar();
        return this;
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishAnimationMVI writeInt(int i) {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        this.CatchingFishDaggerWebsocket.CatchingFishCustomView(i);
        CatchingFishSnackbar();
        return this;
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishAnimationMVI writeShort(int i) {
        if (this.CatchingFishWorkManager) {
            throw new IllegalStateException("closed");
        }
        this.CatchingFishDaggerWebsocket.CatchingFishFragmentFactory(i);
        CatchingFishSnackbar();
        return this;
    }

    @Override // kotlin.text.CatchingFishAnimationMVI
    public final CatchingFishAnimationMVI write(byte[] bArr) {
        if (!this.CatchingFishWorkManager) {
            this.CatchingFishDaggerWebsocket.m12write(bArr);
            CatchingFishSnackbar();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
