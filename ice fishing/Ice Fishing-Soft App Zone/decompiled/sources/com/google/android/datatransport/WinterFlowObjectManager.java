package com.google.android.datatransport;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowObjectManager implements Runnable, WinterFlowRefactoringVersion {
    public final Proxy WinterFlowBandwidthObject;
    public final WinterFlowPackageHook WinterFlowBatchUI;
    public Thread WinterFlowConcurrencyThread;
    public Thread WinterFlowOrchestrationSubsystem;
    public final Object WinterFlowResponseEngine;
    public final /* synthetic */ WinterFlowPackageResponse WinterFlowRouterAdapter;
    public ScheduledFuture WinterFlowRouterRouter;
    public final /* synthetic */ WinterFlowCompilerCloud WinterFlowSerializerStructure;
    public final WinterFlowRefactoringLayer WinterFlowServerProtocol;
    public OutputStream WinterFlowServiceUtility;
    public final CountDownLatch WinterFlowSingletonPlatform;
    public final long WinterFlowSyntax;
    public Socket WinterFlowThreadListener;
    public final URI WinterFlowTransactionAgent;
    public final WinterFlowValidatorPipeline WinterFlowTransactionManagerStrategy;
    public ScheduledExecutorService WinterFlowUnitTestResponse;
    public final CountDownLatch WinterFlowVariableBandwidth;
    public WinterFlowRequestView WinterFlowVariableVersionControl;

    public WinterFlowObjectManager(WinterFlowPackageResponse winterFlowPackageResponse, WinterFlowCompilerCloud winterFlowCompilerCloud, URI uri) {
        this.WinterFlowRouterAdapter = winterFlowPackageResponse;
        this.WinterFlowSerializerStructure = winterFlowCompilerCloud;
        WinterFlowHookSoftware winterFlowHookSoftware = new WinterFlowHookSoftware(Collections.EMPTY_LIST, Collections.singletonList(new WinterFlowServiceSingleton()), Integer.MAX_VALUE);
        this.WinterFlowTransactionManagerStrategy = WinterFlowParserUtility.WinterFlowHookDataSource(WinterFlowObjectManager.class);
        this.WinterFlowSyntax = 60000000000L;
        this.WinterFlowResponseEngine = new Object();
        this.WinterFlowTransactionAgent = null;
        this.WinterFlowServerProtocol = null;
        this.WinterFlowThreadListener = null;
        this.WinterFlowBandwidthObject = Proxy.NO_PROXY;
        int i = 1;
        this.WinterFlowSingletonPlatform = new CountDownLatch(1);
        this.WinterFlowVariableBandwidth = new CountDownLatch(1);
        this.WinterFlowBatchUI = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        this.WinterFlowTransactionAgent = uri;
        this.WinterFlowBatchUI = new WinterFlowPackageHook(i);
        this.WinterFlowServerProtocol = new WinterFlowRefactoringLayer(this, winterFlowHookSoftware);
    }

    public final void WinterFlowArrayNetwork() {
        this.WinterFlowSerializerStructure.WinterFlowUnitTestResponse("");
        WinterFlowRouterStructure();
    }

    public final int WinterFlowCacheManagerAgent() {
        URI uri = this.WinterFlowTransactionAgent;
        int port = uri.getPort();
        String scheme = uri.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
        } else {
            if (!"ws".equals(scheme)) {
                WinterFlowEventEmitterOrchestration.WinterFlowTransactionManagerStrategy(scheme, "unknown scheme: ");
                return 0;
            }
            if (port == -1) {
                return 80;
            }
        }
        return port;
    }

    public final void WinterFlowHookDataSource(WinterFlowRefactoringVersion winterFlowRefactoringVersion, long j) {
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowRefactoringVersion instanceof WinterFlowRefactoringLayer) {
            WinterFlowRefactoringLayer winterFlowRefactoringLayer = (WinterFlowRefactoringLayer) winterFlowRefactoringVersion;
            if (winterFlowRefactoringLayer.WinterFlowConcurrencyThread < j) {
                winterFlowValidatorPipeline.WinterFlowArrayNetwork(winterFlowRefactoringLayer, "Closing connection due to no pong received: {}");
                winterFlowRefactoringLayer.WinterFlowHookDataSource(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", false);
            } else {
                if (winterFlowRefactoringLayer.WinterFlowSyntax != 2) {
                    winterFlowValidatorPipeline.WinterFlowArrayNetwork(winterFlowRefactoringLayer, "Trying to ping a non open connection: {}");
                    return;
                }
                WinterFlowObjectManager winterFlowObjectManager = winterFlowRefactoringLayer.WinterFlowUnitTestResponse;
                WinterFlowRequestView winterFlowRequestView = winterFlowObjectManager.WinterFlowVariableVersionControl;
                if (winterFlowRequestView == null) {
                    winterFlowRequestView = new WinterFlowRequestView(4, 0);
                    winterFlowObjectManager.WinterFlowVariableVersionControl = winterFlowRequestView;
                }
                winterFlowRefactoringLayer.WinterFlowRouterRouter(Collections.singletonList(winterFlowRequestView));
            }
        }
    }

    public final void WinterFlowRouterRouter() {
        String str;
        URI uri = this.WinterFlowTransactionAgent;
        String rawPath = uri.getRawPath();
        String rawQuery = uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent();
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getHost());
        sb.append((WinterFlowCacheManagerAgent == 80 || WinterFlowCacheManagerAgent == 443) ? "" : WinterFlowResolverBackend.WinterFlowSyntax(":", WinterFlowCacheManagerAgent));
        String sb2 = sb.toString();
        WinterFlowEventEmitterController winterFlowEventEmitterController = new WinterFlowEventEmitterController();
        winterFlowEventEmitterController.WinterFlowHookDataSource = rawPath;
        winterFlowEventEmitterController.WinterFlowServiceUtility("Host", sb2);
        WinterFlowRefactoringLayer winterFlowRefactoringLayer = this.WinterFlowServerProtocol;
        WinterFlowObjectManager winterFlowObjectManager = winterFlowRefactoringLayer.WinterFlowUnitTestResponse;
        WinterFlowHookSoftware winterFlowHookSoftware = winterFlowRefactoringLayer.WinterFlowResponseEngine;
        winterFlowHookSoftware.getClass();
        winterFlowEventEmitterController.WinterFlowServiceUtility("Upgrade", "websocket");
        winterFlowEventEmitterController.WinterFlowServiceUtility("Connection", "Upgrade");
        byte[] bArr = new byte[16];
        winterFlowHookSoftware.WinterFlowServerProtocol.nextBytes(bArr);
        try {
            str = WinterFlowEncryptionSubsystem.WinterFlowSerializerStructure(16, bArr);
        } catch (IOException unused) {
            str = null;
        }
        winterFlowEventEmitterController.WinterFlowServiceUtility("Sec-WebSocket-Key", str);
        winterFlowEventEmitterController.WinterFlowServiceUtility("Sec-WebSocket-Version", "13");
        StringBuilder sb3 = new StringBuilder();
        ArrayList arrayList = winterFlowHookSoftware.WinterFlowVariableVersionControl;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((WinterFlowIDEStack) obj).getClass();
        }
        if (sb3.length() != 0) {
            winterFlowEventEmitterController.WinterFlowServiceUtility("Sec-WebSocket-Extensions", sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder();
        ArrayList arrayList2 = winterFlowHookSoftware.WinterFlowRouterRouter;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            ((WinterFlowServiceSingleton) obj2).getClass();
        }
        if (sb4.length() != 0) {
            winterFlowEventEmitterController.WinterFlowServiceUtility("Sec-WebSocket-Protocol", sb4.toString());
        }
        winterFlowRefactoringLayer.WinterFlowThreadListener = winterFlowEventEmitterController;
        winterFlowRefactoringLayer.WinterFlowResponseEngine.getClass();
        StringBuilder sb5 = new StringBuilder(100);
        sb5.append("GET ");
        sb5.append(winterFlowEventEmitterController.WinterFlowHookDataSource);
        sb5.append(" HTTP/1.1");
        sb5.append("\r\n");
        for (String str2 : Collections.unmodifiableSet(((TreeMap) winterFlowEventEmitterController.WinterFlowRouterStructure).keySet())) {
            String WinterFlowTransactionAgent = winterFlowEventEmitterController.WinterFlowTransactionAgent(str2);
            sb5.append(str2);
            sb5.append(": ");
            sb5.append(WinterFlowTransactionAgent);
            sb5.append("\r\n");
        }
        sb5.append("\r\n");
        String sb6 = sb5.toString();
        CodingErrorAction codingErrorAction = WinterFlowRequestPlatform.WinterFlowRouterStructure;
        byte[] bytes = sb6.getBytes(StandardCharsets.US_ASCII);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
        allocate.put(bytes);
        allocate.flip();
        winterFlowRefactoringLayer.WinterFlowSyntax(Collections.singletonList(allocate));
    }

    public final void WinterFlowRouterStructure() {
        if (this.WinterFlowOrchestrationSubsystem != null) {
            this.WinterFlowServerProtocol.WinterFlowRouterStructure(1000, "", false);
        }
    }

    public final void WinterFlowSyntax() {
        this.WinterFlowThreadListener = ((SSLSocketFactory) SSLSocketFactory.getDefault()).createSocket(this.WinterFlowThreadListener, this.WinterFlowTransactionAgent.getHost(), WinterFlowCacheManagerAgent(), true);
    }

    public final void WinterFlowTransactionManagerStrategy(WinterFlowInvokerValidator winterFlowInvokerValidator) {
        synchronized (this.WinterFlowResponseEngine) {
            try {
                long j = this.WinterFlowSyntax;
                WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowTransactionManagerStrategy;
                if (j <= 0) {
                    winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Connection lost timer deactivated");
                } else {
                    winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Connection lost timer started");
                    ScheduledExecutorService scheduledExecutorService = this.WinterFlowUnitTestResponse;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdownNow();
                        this.WinterFlowUnitTestResponse = null;
                    }
                    ScheduledFuture scheduledFuture = this.WinterFlowRouterRouter;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.WinterFlowRouterRouter = null;
                    }
                    this.WinterFlowUnitTestResponse = Executors.newSingleThreadScheduledExecutor(new WinterFlowCompilerScheduler());
                    WinterFlowValidatorSystem winterFlowValidatorSystem = new WinterFlowValidatorSystem(this);
                    ScheduledExecutorService scheduledExecutorService2 = this.WinterFlowUnitTestResponse;
                    long j2 = this.WinterFlowSyntax;
                    this.WinterFlowRouterRouter = scheduledExecutorService2.scheduleAtFixedRate(winterFlowValidatorSystem, j2, j2, TimeUnit.NANOSECONDS);
                }
            } finally {
            }
        }
        String str = this.WinterFlowRouterAdapter.WinterFlowHookDataSource;
        if (str == null) {
            WinterFlowManagerRequest.WinterFlowCloudMicroservice("data");
            throw null;
        }
        WinterFlowRefactoringLayer winterFlowRefactoringLayer = this.WinterFlowServerProtocol;
        WinterFlowHookSoftware winterFlowHookSoftware = winterFlowRefactoringLayer.WinterFlowResponseEngine;
        boolean z = winterFlowRefactoringLayer.WinterFlowTransactionAgent == 1;
        winterFlowHookSoftware.getClass();
        WinterFlowCloudResolver winterFlowCloudResolver = new WinterFlowCloudResolver(2, 2);
        CodingErrorAction codingErrorAction = WinterFlowRequestPlatform.WinterFlowRouterStructure;
        winterFlowCloudResolver.WinterFlowCacheManagerAgent = ByteBuffer.wrap(str.getBytes(StandardCharsets.UTF_8));
        winterFlowCloudResolver.WinterFlowArrayNetwork = z;
        try {
            winterFlowCloudResolver.WinterFlowHookDataSource();
            winterFlowRefactoringLayer.WinterFlowRouterRouter(Collections.singletonList(winterFlowCloudResolver));
            this.WinterFlowSingletonPlatform.countDown();
        } catch (WinterFlowStackLayer e) {
            throw new WinterFlowServerSystem(e);
        }
    }

    public final boolean WinterFlowUnitTestResponse() {
        Proxy proxy = Proxy.NO_PROXY;
        Proxy proxy2 = this.WinterFlowBandwidthObject;
        if (proxy2 != proxy) {
            this.WinterFlowThreadListener = new Socket(proxy2);
            return true;
        }
        Socket socket = this.WinterFlowThreadListener;
        if (socket == null) {
            this.WinterFlowThreadListener = new Socket(proxy2);
            return true;
        }
        if (socket.isClosed()) {
            throw new IOException();
        }
        return false;
    }

    public final void WinterFlowVariableVersionControl() {
        synchronized (this.WinterFlowResponseEngine) {
            try {
                if (this.WinterFlowUnitTestResponse == null) {
                    if (this.WinterFlowRouterRouter != null) {
                    }
                }
                this.WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl("Connection lost timer stopped");
                ScheduledExecutorService scheduledExecutorService = this.WinterFlowUnitTestResponse;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    this.WinterFlowUnitTestResponse = null;
                }
                ScheduledFuture scheduledFuture = this.WinterFlowRouterRouter;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.WinterFlowRouterRouter = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Thread thread = this.WinterFlowOrchestrationSubsystem;
        if (thread != null) {
            thread.interrupt();
        }
        this.WinterFlowSingletonPlatform.countDown();
        this.WinterFlowVariableBandwidth.countDown();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int read;
        WinterFlowPackageHook winterFlowPackageHook = this.WinterFlowBatchUI;
        URI uri = this.WinterFlowTransactionAgent;
        WinterFlowRefactoringLayer winterFlowRefactoringLayer = this.WinterFlowServerProtocol;
        try {
            boolean WinterFlowUnitTestResponse = WinterFlowUnitTestResponse();
            this.WinterFlowThreadListener.setTcpNoDelay(false);
            this.WinterFlowThreadListener.setReuseAddress(false);
            if (!this.WinterFlowThreadListener.isConnected()) {
                this.WinterFlowThreadListener.connect(winterFlowPackageHook == null ? InetSocketAddress.createUnresolved(uri.getHost(), WinterFlowCacheManagerAgent()) : new InetSocketAddress(InetAddress.getByName(uri.getHost()), WinterFlowCacheManagerAgent()), 0);
            }
            if (WinterFlowUnitTestResponse && "wss".equals(uri.getScheme())) {
                WinterFlowSyntax();
            }
            Socket socket = this.WinterFlowThreadListener;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.WinterFlowThreadListener.getInputStream();
            this.WinterFlowServiceUtility = this.WinterFlowThreadListener.getOutputStream();
            WinterFlowRouterRouter();
            Thread thread = this.WinterFlowOrchestrationSubsystem;
            if (thread != null) {
                thread.interrupt();
                try {
                    this.WinterFlowOrchestrationSubsystem.join();
                } catch (InterruptedException unused) {
                }
            }
            Thread thread2 = new Thread(new WinterFlowDeploymentSystem(this, this));
            this.WinterFlowOrchestrationSubsystem = thread2;
            thread2.setDaemon(false);
            this.WinterFlowOrchestrationSubsystem.start();
            byte[] bArr = new byte[65536];
            while (true) {
                try {
                    boolean z = true;
                    if (!(winterFlowRefactoringLayer.WinterFlowSyntax == 3)) {
                        if (winterFlowRefactoringLayer.WinterFlowSyntax != 4) {
                            z = false;
                        }
                        if (z || (read = inputStream.read(bArr)) == -1) {
                            break;
                        } else {
                            winterFlowRefactoringLayer.WinterFlowCacheManagerAgent(ByteBuffer.wrap(bArr, 0, read));
                        }
                    } else {
                        break;
                    }
                } catch (IOException e) {
                    if (e instanceof SSLException) {
                        WinterFlowArrayNetwork();
                    }
                    this.WinterFlowServerProtocol.WinterFlowVariableVersionControl();
                    return;
                } catch (RuntimeException e2) {
                    WinterFlowArrayNetwork();
                    winterFlowRefactoringLayer.WinterFlowHookDataSource(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, e2.getMessage(), false);
                    return;
                }
            }
            winterFlowRefactoringLayer.WinterFlowVariableVersionControl();
        } catch (Exception e3) {
            WinterFlowArrayNetwork();
            winterFlowRefactoringLayer.WinterFlowHookDataSource(-1, e3.getMessage(), false);
        } catch (InternalError e4) {
            if (!(e4.getCause() instanceof InvocationTargetException) || !(e4.getCause().getCause() instanceof IOException)) {
                throw e4;
            }
            IOException iOException = (IOException) e4.getCause().getCause();
            WinterFlowArrayNetwork();
            winterFlowRefactoringLayer.WinterFlowHookDataSource(-1, iOException.getMessage(), false);
        }
    }
}
