package kotlin.text;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishWidgetMVVMAdMob implements CatchingFishMVVMKtor, CatchingFishServiceSnackbar {
    public static final List CatchingFishDaggerHiltFAB = Collections.singletonList(CatchingFishServicePicasso.HTTP_1_1);
    public boolean CatchingFish;
    public boolean CatchingFishAnimationMockk;
    public CatchingFishFirebaseLayout CatchingFishCloudMessaging;
    public final Random CatchingFishCoroutine;
    public boolean CatchingFishCoroutineFlow;
    public final String CatchingFishDaggerWebsocket;
    public ScheduledThreadPoolExecutor CatchingFishFragmentHandler;
    public int CatchingFishJetpackCompose;
    public CatchingFishMVIRecyclerView CatchingFishLayout;
    public String CatchingFishNavigation;
    public final CatchingFishReduxBundleMVP CatchingFishParcelableFAB;
    public final long CatchingFishReduxKtor;
    public final CatchingFishFluxFluxBundle CatchingFishSnackbar;
    public ScheduledFuture CatchingFishStateLiveData;
    public long CatchingFishUnitTesting;
    public CatchingFishToolbarGson CatchingFishViewModelFAB;
    public final CatchingFishMVPLayout CatchingFishViewModelScope;
    public CatchingFishDaggerWebSocket CatchingFishWorkManager;
    public final ArrayDeque CatchingFishEspressoTesting = new ArrayDeque();
    public final ArrayDeque CatchingFishOkHttp = new ArrayDeque();
    public int CatchingFishRoomDatabase = -1;

    public CatchingFishWidgetMVVMAdMob(CatchingFishReduxBundleMVP catchingFishReduxBundleMVP, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, Random random, long j) {
        String str = catchingFishReduxBundleMVP.CatchingFishSnackbar;
        if (!"GET".equals(str)) {
            throw new IllegalArgumentException("Request must be GET: " + str);
        }
        this.CatchingFishParcelableFAB = catchingFishReduxBundleMVP;
        this.CatchingFishSnackbar = catchingFishFluxFluxBundle;
        this.CatchingFishCoroutine = random;
        this.CatchingFishReduxKtor = j;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.CatchingFishDaggerWebsocket = CatchingFishWebSocketMockk.CatchingFishViewModelFAB(bArr).CatchingFishParcelableFAB();
        this.CatchingFishViewModelScope = new CatchingFishMVPLayout(17, this);
    }

    public final void CatchingFishCoroutine(Exception exc) {
        synchronized (this) {
            try {
                if (this.CatchingFish) {
                    return;
                }
                this.CatchingFish = true;
                CatchingFishFirebaseLayout catchingFishFirebaseLayout = this.CatchingFishCloudMessaging;
                this.CatchingFishCloudMessaging = null;
                ScheduledFuture scheduledFuture = this.CatchingFishStateLiveData;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.CatchingFishFragmentHandler;
                if (scheduledThreadPoolExecutor != null) {
                    scheduledThreadPoolExecutor.shutdown();
                }
                try {
                    CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishSnackbar;
                    catchingFishFluxFluxBundle.getClass();
                    ((CatchingFishFluxPicasso) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishParcelableFAB();
                    ((CatchingFishCustomViewKtor) catchingFishFluxFluxBundle.CatchingFishWorkManager).CatchingFishParcelableFAB();
                } finally {
                    CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishFirebaseLayout);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishDaggerWebsocket() {
        while (this.CatchingFishRoomDatabase == -1) {
            CatchingFishToolbarGson catchingFishToolbarGson = this.CatchingFishViewModelFAB;
            catchingFishToolbarGson.CatchingFishSnackbar();
            if (!catchingFishToolbarGson.CatchingFishViewModelScope) {
                CatchingFishServiceSnackbar catchingFishServiceSnackbar = catchingFishToolbarGson.CatchingFishSnackbar;
                CatchingFishWidgetGradle catchingFishWidgetGradle = catchingFishToolbarGson.CatchingFishLayout;
                int i = catchingFishToolbarGson.CatchingFishReduxKtor;
                if (i != 1 && i != 2) {
                    throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i));
                }
                while (!catchingFishToolbarGson.CatchingFishCoroutine) {
                    long j = catchingFishToolbarGson.CatchingFishDaggerWebsocket;
                    if (j > 0) {
                        catchingFishToolbarGson.CatchingFishParcelableFAB.CatchingFishPayPal(catchingFishWidgetGradle, j);
                    }
                    if (!catchingFishToolbarGson.CatchingFishWorkManager) {
                        while (!catchingFishToolbarGson.CatchingFishCoroutine) {
                            catchingFishToolbarGson.CatchingFishSnackbar();
                            if (!catchingFishToolbarGson.CatchingFishViewModelScope) {
                                break;
                            } else {
                                catchingFishToolbarGson.CatchingFishParcelableFAB();
                            }
                        }
                        if (catchingFishToolbarGson.CatchingFishReduxKtor != 0) {
                            throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(catchingFishToolbarGson.CatchingFishReduxKtor));
                        }
                    } else if (i == 1) {
                        String CatchingFishStateLiveData = catchingFishWidgetGradle.CatchingFishStateLiveData();
                        CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = (CatchingFishWidgetMVVMAdMob) catchingFishServiceSnackbar;
                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = catchingFishWidgetMVVMAdMob.CatchingFishSnackbar;
                        catchingFishFluxFluxBundle.getClass();
                        catchingFishWidgetMVVMAdMob.CatchingFishSnackbar(1000);
                        ((CatchingFishPayPalToast) catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket).CatchingFishFragmentHandler(CatchingFishStateLiveData);
                    } else {
                        catchingFishWidgetGradle.CatchingFishViewModelFAB(catchingFishWidgetGradle.CatchingFishDaggerWebsocket);
                        ((CatchingFishWidgetMVVMAdMob) catchingFishServiceSnackbar).CatchingFishSnackbar.getClass();
                    }
                }
                throw new IOException("closed");
            }
            catchingFishToolbarGson.CatchingFishParcelableFAB();
        }
    }

    public final void CatchingFishParcelableFAB(CatchingFishLayoutRedux catchingFishLayoutRedux, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        int i = catchingFishLayoutRedux.CatchingFishWorkManager;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(" ");
            throw new ProtocolException(CatchingFishMVPLiveData.CatchingFishStateLiveData(sb, catchingFishLayoutRedux.CatchingFishViewModelScope, "'"));
        }
        String CatchingFishSnackbar = catchingFishLayoutRedux.CatchingFishSnackbar("Connection");
        if (!"Upgrade".equalsIgnoreCase(CatchingFishSnackbar)) {
            throw new ProtocolException(CatchingFishMVPLiveData.CatchingFishOkHttp("Expected 'Connection' header value 'Upgrade' but was '", CatchingFishSnackbar, "'"));
        }
        String CatchingFishSnackbar2 = catchingFishLayoutRedux.CatchingFishSnackbar("Upgrade");
        if (!"websocket".equalsIgnoreCase(CatchingFishSnackbar2)) {
            throw new ProtocolException(CatchingFishMVPLiveData.CatchingFishOkHttp("Expected 'Upgrade' header value 'websocket' but was '", CatchingFishSnackbar2, "'"));
        }
        String CatchingFishSnackbar3 = catchingFishLayoutRedux.CatchingFishSnackbar("Sec-WebSocket-Accept");
        String CatchingFishStateLiveData = CatchingFishMVPLiveData.CatchingFishStateLiveData(new StringBuilder(), this.CatchingFishDaggerWebsocket, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
        String CatchingFishParcelableFAB = CatchingFishAdMobFAB.CatchingFishJetpackCompose(CatchingFishStateLiveData).CatchingFishCoroutine("SHA-1").CatchingFishParcelableFAB();
        if (CatchingFishParcelableFAB.equals(CatchingFishSnackbar3)) {
            if (catchingFishFluxFluxBundle == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + CatchingFishParcelableFAB + "' but was '" + CatchingFishSnackbar3 + "'");
    }

    public final void CatchingFishReduxKtor(String str, CatchingFishFirebaseLayout catchingFishFirebaseLayout) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (this) {
            try {
                this.CatchingFishCloudMessaging = catchingFishFirebaseLayout;
                this.CatchingFishLayout = new CatchingFishMVIRecyclerView(catchingFishFirebaseLayout.CatchingFishDaggerWebsocket, this.CatchingFishCoroutine);
                byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new CatchingFishAdMobAsyncTask(str, false));
                this.CatchingFishFragmentHandler = scheduledThreadPoolExecutor2;
                long j = this.CatchingFishReduxKtor;
                if (j != 0) {
                    scheduledThreadPoolExecutor2.scheduleAtFixedRate(new CatchingFishFluxRealmRedux(this, 1), j, j, TimeUnit.MILLISECONDS);
                }
                if (!this.CatchingFishOkHttp.isEmpty() && (scheduledThreadPoolExecutor = this.CatchingFishFragmentHandler) != null) {
                    scheduledThreadPoolExecutor.execute(this.CatchingFishViewModelScope);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.CatchingFishViewModelFAB = new CatchingFishToolbarGson(catchingFishFirebaseLayout.CatchingFishReduxKtor, this);
    }

    public final boolean CatchingFishSnackbar(int i) {
        synchronized (this) {
            String CatchingFishCoroutine = CatchingFishKtorViewModel.CatchingFishCoroutine(i);
            if (CatchingFishCoroutine != null) {
                throw new IllegalArgumentException(CatchingFishCoroutine);
            }
            if (!this.CatchingFish && !this.CatchingFishAnimationMockk) {
                this.CatchingFishAnimationMockk = true;
                this.CatchingFishOkHttp.add(new CatchingFishGradleIntent(i, null));
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.CatchingFishFragmentHandler;
                if (scheduledThreadPoolExecutor != null) {
                    scheduledThreadPoolExecutor.execute(this.CatchingFishViewModelScope);
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:20:0x005d, B:23:0x0065, B:25:0x0069, B:27:0x007b, B:29:0x0099, B:38:0x00b2, B:46:0x00c0, B:47:0x00c1, B:54:0x00c2, B:55:0x00c9, B:56:0x00ca, B:58:0x00ce, B:60:0x00df, B:62:0x00e9, B:63:0x00ec, B:67:0x00f7, B:69:0x00fb, B:72:0x0111, B:73:0x0113, B:74:0x0114, B:75:0x0119, B:76:0x011a, B:77:0x011f, B:66:0x00f4, B:40:0x00b3, B:41:0x00bc), top: B:17:0x0059, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishWorkManager() {
        Object obj;
        CatchingFishFirebaseLayout catchingFishFirebaseLayout;
        Object obj2;
        synchronized (this) {
            try {
                if (this.CatchingFish) {
                    return false;
                }
                CatchingFishMVIRecyclerView catchingFishMVIRecyclerView = this.CatchingFishLayout;
                CatchingFishWebSocketMockk catchingFishWebSocketMockk = (CatchingFishWebSocketMockk) this.CatchingFishEspressoTesting.poll();
                Throwable th = null;
                try {
                    if (catchingFishWebSocketMockk == null) {
                        obj = this.CatchingFishOkHttp.poll();
                        if (obj instanceof CatchingFishGradleIntent) {
                            int i = this.CatchingFishRoomDatabase;
                            obj2 = this.CatchingFishNavigation;
                            if (i != -1) {
                                catchingFishFirebaseLayout = this.CatchingFishCloudMessaging;
                                this.CatchingFishCloudMessaging = null;
                                this.CatchingFishFragmentHandler.shutdown();
                            } else {
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.CatchingFishFragmentHandler;
                                CatchingFishFluxRealmRedux catchingFishFluxRealmRedux = new CatchingFishFluxRealmRedux(this, 0);
                                ((CatchingFishGradleIntent) obj).getClass();
                                this.CatchingFishStateLiveData = scheduledThreadPoolExecutor.schedule(catchingFishFluxRealmRedux, 60000L, TimeUnit.MILLISECONDS);
                                catchingFishFirebaseLayout = null;
                            }
                            if (catchingFishWebSocketMockk == null) {
                                catchingFishMVIRecyclerView.CatchingFishParcelableFAB(10, catchingFishWebSocketMockk);
                            } else if (obj instanceof CatchingFishGradleViewPager) {
                                CatchingFishWebSocketMockk catchingFishWebSocketMockk2 = ((CatchingFishGradleViewPager) obj).CatchingFishParcelableFAB;
                                ((CatchingFishGradleViewPager) obj).getClass();
                                long length = catchingFishWebSocketMockk2.CatchingFishReduxKtor.length;
                                if (catchingFishMVIRecyclerView.CatchingFishViewModelScope) {
                                    throw new IllegalStateException("Another message writer is active. Did you call close()?");
                                }
                                catchingFishMVIRecyclerView.CatchingFishViewModelScope = true;
                                CatchingFishRoomToastToast catchingFishRoomToastToast = catchingFishMVIRecyclerView.CatchingFishWorkManager;
                                catchingFishRoomToastToast.CatchingFishReduxKtor = 1;
                                catchingFishRoomToastToast.CatchingFishDaggerWebsocket = length;
                                catchingFishRoomToastToast.CatchingFishWorkManager = true;
                                catchingFishRoomToastToast.CatchingFishViewModelScope = false;
                                CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
                                catchingFishWidgetGradle.CatchingFishCoroutineFlow(catchingFishWebSocketMockk2);
                                long CatchingFishSnackbar = catchingFishWidgetGradle.CatchingFishSnackbar();
                                if (CatchingFishSnackbar > 0) {
                                    catchingFishRoomToastToast.CatchingFishCloudMessaging(catchingFishWidgetGradle, CatchingFishSnackbar);
                                }
                                try {
                                    long j = catchingFishWidgetGradle.CatchingFishDaggerWebsocket;
                                    if (j > 0) {
                                        catchingFishRoomToastToast.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    catchingFishRoomToastToast.close();
                                } catch (Throwable th3) {
                                    if (th == null) {
                                        th = th3;
                                    }
                                }
                                if (th != null) {
                                    throw th;
                                }
                                synchronized (this) {
                                    this.CatchingFishUnitTesting -= catchingFishWebSocketMockk2.CatchingFishReduxKtor.length;
                                }
                            } else {
                                if (!(obj instanceof CatchingFishGradleIntent)) {
                                    throw new AssertionError();
                                }
                                CatchingFishGradleIntent catchingFishGradleIntent = (CatchingFishGradleIntent) obj;
                                int i2 = catchingFishGradleIntent.CatchingFishParcelableFAB;
                                CatchingFishWebSocketMockk catchingFishWebSocketMockk3 = catchingFishGradleIntent.CatchingFishSnackbar;
                                catchingFishMVIRecyclerView.getClass();
                                CatchingFishWebSocketMockk catchingFishWebSocketMockk4 = CatchingFishWebSocketMockk.CatchingFishViewModelScope;
                                String CatchingFishCoroutine = CatchingFishKtorViewModel.CatchingFishCoroutine(i2);
                                if (CatchingFishCoroutine != null) {
                                    throw new IllegalArgumentException(CatchingFishCoroutine);
                                }
                                CatchingFishWidgetGradle catchingFishWidgetGradle2 = new CatchingFishWidgetGradle();
                                catchingFishWidgetGradle2.CatchingFishFragmentFactory(i2);
                                if (catchingFishWebSocketMockk3 != null) {
                                    catchingFishWidgetGradle2.CatchingFishCoroutineFlow(catchingFishWebSocketMockk3);
                                }
                                try {
                                    catchingFishMVIRecyclerView.CatchingFishParcelableFAB(8, catchingFishWidgetGradle2.CatchingFishViewModelFAB(catchingFishWidgetGradle2.CatchingFishDaggerWebsocket));
                                    if (catchingFishFirebaseLayout != null) {
                                        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = this.CatchingFishSnackbar;
                                        catchingFishFluxFluxBundle.getClass();
                                        CatchingFishFirebaseDagger.CatchingFishNavigation(obj2, "reason");
                                        ((CatchingFishFluxPicasso) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishParcelableFAB();
                                    }
                                } finally {
                                    catchingFishMVIRecyclerView.CatchingFishReduxKtor = true;
                                }
                            }
                            return true;
                        }
                        if (obj == null) {
                            return false;
                        }
                        catchingFishFirebaseLayout = null;
                    } else {
                        obj = null;
                        catchingFishFirebaseLayout = null;
                    }
                    if (catchingFishWebSocketMockk == null) {
                    }
                    return true;
                } finally {
                    CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishFirebaseLayout);
                }
                obj2 = catchingFishFirebaseLayout;
            } finally {
            }
        }
    }
}
