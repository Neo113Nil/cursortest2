package kotlin.text;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishToolbarGson {
    public boolean CatchingFishCoroutine;
    public long CatchingFishDaggerWebsocket;
    public final byte[] CatchingFishFragmentHandler;
    public final CatchingFishLayoutFragment CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public final CatchingFishServiceSnackbar CatchingFishSnackbar;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;
    public final CatchingFishWidgetGradle CatchingFishViewModelFAB = new CatchingFishWidgetGradle();
    public final CatchingFishWidgetGradle CatchingFishLayout = new CatchingFishWidgetGradle();

    public CatchingFishToolbarGson(CatchingFishLayoutFragment catchingFishLayoutFragment, CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob) {
        if (catchingFishLayoutFragment == null) {
            throw new NullPointerException("source == null");
        }
        if (catchingFishWidgetMVVMAdMob == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.CatchingFishParcelableFAB = catchingFishLayoutFragment;
        this.CatchingFishSnackbar = catchingFishWidgetMVVMAdMob;
        this.CatchingFishFragmentHandler = null;
    }

    public final void CatchingFishParcelableFAB() {
        String str;
        short s;
        CatchingFishFirebaseLayout catchingFishFirebaseLayout;
        long j = this.CatchingFishDaggerWebsocket;
        if (j > 0) {
            this.CatchingFishParcelableFAB.CatchingFishPayPal(this.CatchingFishViewModelFAB, j);
        }
        switch (this.CatchingFishReduxKtor) {
            case CatchingFishMoshiSpannable.BYTES_FIELD_NUMBER /* 8 */:
                CatchingFishWidgetGradle catchingFishWidgetGradle = this.CatchingFishViewModelFAB;
                long j2 = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = catchingFishWidgetGradle.readShort();
                    str = this.CatchingFishViewModelFAB.CatchingFishStateLiveData();
                    String CatchingFishCoroutine = CatchingFishKtorViewModel.CatchingFishCoroutine(s);
                    if (CatchingFishCoroutine != null) {
                        throw new ProtocolException(CatchingFishCoroutine);
                    }
                } else {
                    str = "";
                    s = 1005;
                }
                CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = (CatchingFishWidgetMVVMAdMob) this.CatchingFishSnackbar;
                if (s == -1) {
                    catchingFishWidgetMVVMAdMob.getClass();
                    throw new IllegalArgumentException();
                }
                synchronized (catchingFishWidgetMVVMAdMob) {
                    try {
                        if (catchingFishWidgetMVVMAdMob.CatchingFishRoomDatabase != -1) {
                            throw new IllegalStateException("already closed");
                        }
                        catchingFishWidgetMVVMAdMob.CatchingFishRoomDatabase = s;
                        catchingFishWidgetMVVMAdMob.CatchingFishNavigation = str;
                        catchingFishFirebaseLayout = null;
                        if (catchingFishWidgetMVVMAdMob.CatchingFishAnimationMockk && catchingFishWidgetMVVMAdMob.CatchingFishOkHttp.isEmpty()) {
                            CatchingFishFirebaseLayout catchingFishFirebaseLayout2 = catchingFishWidgetMVVMAdMob.CatchingFishCloudMessaging;
                            catchingFishWidgetMVVMAdMob.CatchingFishCloudMessaging = null;
                            ScheduledFuture scheduledFuture = catchingFishWidgetMVVMAdMob.CatchingFishStateLiveData;
                            if (scheduledFuture != null) {
                                scheduledFuture.cancel(false);
                            }
                            catchingFishWidgetMVVMAdMob.CatchingFishFragmentHandler.shutdown();
                            catchingFishFirebaseLayout = catchingFishFirebaseLayout2;
                        }
                    } finally {
                    }
                }
                try {
                    catchingFishWidgetMVVMAdMob.CatchingFishSnackbar.getClass();
                    if (catchingFishFirebaseLayout != null) {
                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishWidgetMVVMAdMob.CatchingFishSnackbar;
                        catchingFishFluxFluxBundle.getClass();
                        ((CatchingFishFluxPicasso) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishParcelableFAB();
                    }
                    CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishFirebaseLayout);
                    this.CatchingFishCoroutine = true;
                    return;
                } catch (Throwable th) {
                    CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishFirebaseLayout);
                    throw th;
                }
            case 9:
                CatchingFishServiceSnackbar catchingFishServiceSnackbar = this.CatchingFishSnackbar;
                CatchingFishWidgetGradle catchingFishWidgetGradle2 = this.CatchingFishViewModelFAB;
                CatchingFishWebSocketMockk CatchingFishViewModelFAB = catchingFishWidgetGradle2.CatchingFishViewModelFAB(catchingFishWidgetGradle2.CatchingFishDaggerWebsocket);
                CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob2 = (CatchingFishWidgetMVVMAdMob) catchingFishServiceSnackbar;
                synchronized (catchingFishWidgetMVVMAdMob2) {
                    try {
                        if (!catchingFishWidgetMVVMAdMob2.CatchingFish && (!catchingFishWidgetMVVMAdMob2.CatchingFishAnimationMockk || !catchingFishWidgetMVVMAdMob2.CatchingFishOkHttp.isEmpty())) {
                            catchingFishWidgetMVVMAdMob2.CatchingFishEspressoTesting.add(CatchingFishViewModelFAB);
                            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = catchingFishWidgetMVVMAdMob2.CatchingFishFragmentHandler;
                            if (scheduledThreadPoolExecutor != null) {
                                scheduledThreadPoolExecutor.execute(catchingFishWidgetMVVMAdMob2.CatchingFishViewModelScope);
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                CatchingFishServiceSnackbar catchingFishServiceSnackbar2 = this.CatchingFishSnackbar;
                CatchingFishWidgetGradle catchingFishWidgetGradle3 = this.CatchingFishViewModelFAB;
                catchingFishWidgetGradle3.CatchingFishViewModelFAB(catchingFishWidgetGradle3.CatchingFishDaggerWebsocket);
                CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob3 = (CatchingFishWidgetMVVMAdMob) catchingFishServiceSnackbar2;
                synchronized (catchingFishWidgetMVVMAdMob3) {
                    catchingFishWidgetMVVMAdMob3.CatchingFishCoroutineFlow = false;
                }
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Integer.toHexString(this.CatchingFishReduxKtor));
        }
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishCoroutine) {
            throw new IOException("closed");
        }
        CatchingFishLayoutFragment catchingFishLayoutFragment = this.CatchingFishParcelableFAB;
        long CatchingFishViewModelFAB = catchingFishLayoutFragment.CatchingFishParcelableFAB().CatchingFishViewModelFAB();
        catchingFishLayoutFragment.CatchingFishParcelableFAB().CatchingFishSnackbar();
        try {
            byte readByte = catchingFishLayoutFragment.readByte();
            catchingFishLayoutFragment.CatchingFishParcelableFAB().CatchingFishViewModelScope(CatchingFishViewModelFAB, TimeUnit.NANOSECONDS);
            this.CatchingFishReduxKtor = readByte & 15;
            boolean z = (readByte & 128) != 0;
            this.CatchingFishWorkManager = z;
            boolean z2 = (readByte & 8) != 0;
            this.CatchingFishViewModelScope = z2;
            if (z2 && !z) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z3 = (readByte & 64) != 0;
            boolean z4 = (readByte & 32) != 0;
            boolean z5 = (readByte & 16) != 0;
            if (z3 || z4 || z5) {
                throw new ProtocolException("Reserved flags are unsupported.");
            }
            byte readByte2 = catchingFishLayoutFragment.readByte();
            boolean z6 = (readByte2 & 128) != 0;
            if (z6) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.CatchingFishDaggerWebsocket = j;
            if (j == 126) {
                this.CatchingFishDaggerWebsocket = catchingFishLayoutFragment.readShort() & 65535;
            } else if (j == 127) {
                long readLong = catchingFishLayoutFragment.readLong();
                this.CatchingFishDaggerWebsocket = readLong;
                if (readLong < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.CatchingFishDaggerWebsocket) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.CatchingFishViewModelScope && this.CatchingFishDaggerWebsocket > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z6) {
                catchingFishLayoutFragment.readFully(this.CatchingFishFragmentHandler);
            }
        } catch (Throwable th) {
            catchingFishLayoutFragment.CatchingFishParcelableFAB().CatchingFishViewModelScope(CatchingFishViewModelFAB, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
