package com.google.android.datatransport;

import com.adjust.sdk.network.ErrorCodes;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowHookSoftware {
    public final ArrayList WinterFlowResponseEngine;
    public final ArrayList WinterFlowRouterRouter;
    public WinterFlowUserManagerLoader WinterFlowSyntax;
    public final int WinterFlowThreadListener;
    public ByteBuffer WinterFlowTransactionAgent;
    public WinterFlowIDEStack WinterFlowTransactionManagerStrategy;
    public WinterFlowServiceSingleton WinterFlowUnitTestResponse;
    public final ArrayList WinterFlowVariableVersionControl;
    public int WinterFlowRouterStructure = 0;
    public final WinterFlowValidatorPipeline WinterFlowHookDataSource = WinterFlowParserUtility.WinterFlowHookDataSource(WinterFlowHookSoftware.class);
    public WinterFlowIDEStack WinterFlowCacheManagerAgent = new WinterFlowIDEStack();
    public final WinterFlowIDEStack WinterFlowArrayNetwork = new WinterFlowIDEStack();
    public final SecureRandom WinterFlowServerProtocol = new SecureRandom();

    public WinterFlowHookSoftware(List list, List list2, int i) {
        boolean z = false;
        if (list == null || list2 == null || i < 1) {
            throw new IllegalArgumentException();
        }
        this.WinterFlowVariableVersionControl = new ArrayList(list.size());
        this.WinterFlowRouterRouter = new ArrayList(list2.size());
        this.WinterFlowResponseEngine = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((WinterFlowIDEStack) it.next()).getClass().equals(WinterFlowIDEStack.class)) {
                z = true;
            }
        }
        this.WinterFlowVariableVersionControl.addAll(list);
        if (!z) {
            ArrayList arrayList = this.WinterFlowVariableVersionControl;
            arrayList.add(arrayList.size(), this.WinterFlowCacheManagerAgent);
        }
        this.WinterFlowRouterRouter.addAll(list2);
        this.WinterFlowThreadListener = i;
        this.WinterFlowTransactionManagerStrategy = null;
    }

    public static String WinterFlowSyntax(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b = b2;
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        CodingErrorAction codingErrorAction = WinterFlowRequestPlatform.WinterFlowRouterStructure;
        return new String(array, 0, limit, StandardCharsets.US_ASCII);
    }

    public final void WinterFlowArrayNetwork() {
        long j;
        synchronized (this.WinterFlowResponseEngine) {
            try {
                ArrayList arrayList = this.WinterFlowResponseEngine;
                int size = arrayList.size();
                j = 0;
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    j += ((ByteBuffer) obj).limit();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j <= this.WinterFlowThreadListener) {
            return;
        }
        synchronized (this.WinterFlowResponseEngine) {
            this.WinterFlowResponseEngine.clear();
        }
        this.WinterFlowHookDataSource.WinterFlowServerProtocol("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(this.WinterFlowThreadListener), Long.valueOf(j));
        throw new WinterFlowLibrarySystem(this.WinterFlowThreadListener);
    }

    public final void WinterFlowBandwidthObject(int i, int i2) {
        if (i >= i2) {
            return;
        }
        this.WinterFlowHookDataSource.WinterFlowVariableVersionControl("Incomplete frame: maxpacketsize < realpacketsize");
        throw new WinterFlowListenerObject(i2);
    }

    public final void WinterFlowCacheManagerAgent(ByteBuffer byteBuffer) {
        synchronized (this.WinterFlowResponseEngine) {
            this.WinterFlowResponseEngine.add(byteBuffer);
        }
    }

    public final int WinterFlowHookDataSource(WinterFlowEventEmitterController winterFlowEventEmitterController) {
        boolean z;
        WinterFlowEventEmitterController winterFlowEventEmitterController2 = winterFlowEventEmitterController;
        String WinterFlowTransactionAgent = winterFlowEventEmitterController2.WinterFlowTransactionAgent("Sec-WebSocket-Version");
        int i = -1;
        if (WinterFlowTransactionAgent.length() > 0) {
            try {
                i = Integer.parseInt(WinterFlowTransactionAgent.trim());
            } catch (NumberFormatException unused) {
            }
        }
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowHookDataSource;
        if (i != 13) {
            winterFlowValidatorPipeline.WinterFlowVariableVersionControl("acceptHandshakeAsServer - Wrong websocket version.");
            return 2;
        }
        winterFlowEventEmitterController2.WinterFlowTransactionAgent("Sec-WebSocket-Extensions");
        Iterator it = this.WinterFlowVariableVersionControl.iterator();
        if (it.hasNext()) {
            WinterFlowIDEStack winterFlowIDEStack = (WinterFlowIDEStack) it.next();
            winterFlowIDEStack.getClass();
            this.WinterFlowCacheManagerAgent = winterFlowIDEStack;
            winterFlowValidatorPipeline.WinterFlowArrayNetwork(winterFlowIDEStack, "acceptHandshakeAsServer - Matching extension found: {}");
            z = true;
        } else {
            z = 2;
        }
        if (WinterFlowVariableVersionControl(winterFlowEventEmitterController2.WinterFlowTransactionAgent("Sec-WebSocket-Protocol")) == 1 && z) {
            return 1;
        }
        winterFlowValidatorPipeline.WinterFlowVariableVersionControl("acceptHandshakeAsServer - No matching extension or protocol found.");
        return 2;
    }

    public final String WinterFlowResponseEngine() {
        return getClass().getSimpleName();
    }

    public final void WinterFlowRouterRouter(WinterFlowRefactoringLayer winterFlowRefactoringLayer, WinterFlowUserManagerLoader winterFlowUserManagerLoader) {
        String str;
        int i;
        int i2 = winterFlowUserManagerLoader.WinterFlowHookDataSource;
        if (i2 == 6) {
            if (winterFlowUserManagerLoader instanceof WinterFlowIDEPipeline) {
                WinterFlowIDEPipeline winterFlowIDEPipeline = (WinterFlowIDEPipeline) winterFlowUserManagerLoader;
                i = winterFlowIDEPipeline.WinterFlowSyntax;
                str = winterFlowIDEPipeline.WinterFlowResponseEngine;
            } else {
                str = "";
                i = 1005;
            }
            if (winterFlowRefactoringLayer.WinterFlowSyntax == 3) {
                winterFlowRefactoringLayer.WinterFlowHookDataSource(i, str, true);
                return;
            } else {
                winterFlowRefactoringLayer.WinterFlowRouterStructure(i, str, true);
                return;
            }
        }
        if (i2 == 4) {
            WinterFlowWorkerAgent winterFlowWorkerAgent = new WinterFlowWorkerAgent(5, 0);
            winterFlowWorkerAgent.WinterFlowCacheManagerAgent = ((WinterFlowRequestView) winterFlowUserManagerLoader).WinterFlowCacheManagerAgent;
            winterFlowRefactoringLayer.WinterFlowRouterRouter(Collections.singletonList(winterFlowWorkerAgent));
            return;
        }
        if (i2 == 5) {
            winterFlowRefactoringLayer.WinterFlowConcurrencyThread = System.nanoTime();
            return;
        }
        boolean z = winterFlowUserManagerLoader.WinterFlowRouterStructure;
        if (z && i2 != 1) {
            if (this.WinterFlowSyntax != null) {
                this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent("Protocol error: Continuous frame sequence not completed.");
                throw new WinterFlowStackLayer("Continuous frame sequence not completed.", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
            }
            if (i2 == 2) {
                try {
                    WinterFlowObjectManager winterFlowObjectManager = winterFlowRefactoringLayer.WinterFlowUnitTestResponse;
                    winterFlowObjectManager.WinterFlowSerializerStructure.WinterFlowUnitTestResponse(WinterFlowRequestPlatform.WinterFlowHookDataSource(winterFlowUserManagerLoader.WinterFlowRouterStructure()));
                    winterFlowObjectManager.WinterFlowRouterStructure();
                    return;
                } catch (RuntimeException e) {
                    WinterFlowUnitTestResponse(winterFlowRefactoringLayer, e);
                    return;
                }
            }
            if (i2 != 3) {
                this.WinterFlowHookDataSource.WinterFlowCacheManagerAgent("non control or continious frame expected");
                throw new WinterFlowStackLayer("non control or continious frame expected", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
            }
            try {
                winterFlowUserManagerLoader.WinterFlowRouterStructure();
                return;
            } catch (RuntimeException e2) {
                WinterFlowUnitTestResponse(winterFlowRefactoringLayer, e2);
                return;
            }
        }
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowHookDataSource;
        WinterFlowUserManagerLoader winterFlowUserManagerLoader2 = this.WinterFlowSyntax;
        if (i2 != 1) {
            if (winterFlowUserManagerLoader2 != null) {
                winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Protocol error: Previous continuous frame sequence not completed.");
                throw new WinterFlowStackLayer("Previous continuous frame sequence not completed.", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
            }
            this.WinterFlowSyntax = winterFlowUserManagerLoader;
            WinterFlowCacheManagerAgent(winterFlowUserManagerLoader.WinterFlowRouterStructure());
            WinterFlowArrayNetwork();
        } else if (z) {
            if (winterFlowUserManagerLoader2 == null) {
                winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Protocol error: Previous continuous frame sequence not completed.");
                throw new WinterFlowStackLayer("Continuous frame sequence was not started.", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
            }
            WinterFlowCacheManagerAgent(winterFlowUserManagerLoader.WinterFlowRouterStructure());
            WinterFlowArrayNetwork();
            WinterFlowUserManagerLoader winterFlowUserManagerLoader3 = this.WinterFlowSyntax;
            int i3 = winterFlowUserManagerLoader3.WinterFlowHookDataSource;
            if (i3 == 2) {
                winterFlowUserManagerLoader3.WinterFlowArrayNetwork(WinterFlowTransactionManagerStrategy());
                this.WinterFlowSyntax.WinterFlowHookDataSource();
                try {
                    WinterFlowObjectManager winterFlowObjectManager2 = winterFlowRefactoringLayer.WinterFlowUnitTestResponse;
                    winterFlowObjectManager2.WinterFlowSerializerStructure.WinterFlowUnitTestResponse(WinterFlowRequestPlatform.WinterFlowHookDataSource(this.WinterFlowSyntax.WinterFlowRouterStructure()));
                    winterFlowObjectManager2.WinterFlowRouterStructure();
                } catch (RuntimeException e3) {
                    WinterFlowUnitTestResponse(winterFlowRefactoringLayer, e3);
                }
            } else if (i3 == 3) {
                winterFlowUserManagerLoader3.WinterFlowArrayNetwork(WinterFlowTransactionManagerStrategy());
                this.WinterFlowSyntax.WinterFlowHookDataSource();
                try {
                    this.WinterFlowSyntax.WinterFlowRouterStructure();
                } catch (RuntimeException e4) {
                    WinterFlowUnitTestResponse(winterFlowRefactoringLayer, e4);
                }
            }
            this.WinterFlowSyntax = null;
            synchronized (this.WinterFlowResponseEngine) {
                this.WinterFlowResponseEngine.clear();
            }
        } else if (winterFlowUserManagerLoader2 == null) {
            winterFlowValidatorPipeline.WinterFlowCacheManagerAgent("Protocol error: Continuous frame sequence was not started.");
            throw new WinterFlowStackLayer("Continuous frame sequence was not started.", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        }
        if (i2 == 2 && !WinterFlowRequestPlatform.WinterFlowRouterStructure(winterFlowUserManagerLoader.WinterFlowRouterStructure())) {
            winterFlowValidatorPipeline.WinterFlowCacheManagerAgent("Protocol error: Payload is not UTF8");
            throw new WinterFlowStackLayer(ErrorCodes.IO_EXCEPTION);
        }
        if (i2 != 1 || this.WinterFlowSyntax == null) {
            return;
        }
        WinterFlowCacheManagerAgent(winterFlowUserManagerLoader.WinterFlowRouterStructure());
    }

    public final int WinterFlowRouterStructure(WinterFlowEventEmitterController winterFlowEventEmitterController, WinterFlowSchedulerView winterFlowSchedulerView) {
        String str;
        boolean z;
        WinterFlowSchedulerView winterFlowSchedulerView2 = winterFlowSchedulerView;
        boolean equalsIgnoreCase = winterFlowSchedulerView2.WinterFlowTransactionAgent("Upgrade").equalsIgnoreCase("websocket");
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowHookDataSource;
        if (!equalsIgnoreCase || !winterFlowSchedulerView2.WinterFlowTransactionAgent("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade")) {
            winterFlowValidatorPipeline.WinterFlowVariableVersionControl("acceptHandshakeAsClient - Missing/wrong upgrade or connection in handshake.");
            return 2;
        }
        if (!((TreeMap) winterFlowEventEmitterController.WinterFlowRouterStructure).containsKey("Sec-WebSocket-Key") || !((TreeMap) winterFlowSchedulerView2.WinterFlowRouterStructure).containsKey("Sec-WebSocket-Accept")) {
            winterFlowValidatorPipeline.WinterFlowVariableVersionControl("acceptHandshakeAsClient - Missing Sec-WebSocket-Key or Sec-WebSocket-Accept");
            return 2;
        }
        String WinterFlowTransactionAgent = winterFlowSchedulerView2.WinterFlowTransactionAgent("Sec-WebSocket-Accept");
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest((winterFlowEventEmitterController.WinterFlowTransactionAgent("Sec-WebSocket-Key").trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes());
            try {
                str = WinterFlowEncryptionSubsystem.WinterFlowSerializerStructure(digest.length, digest);
            } catch (IOException unused) {
                str = null;
            }
            if (!str.equals(WinterFlowTransactionAgent)) {
                winterFlowValidatorPipeline.WinterFlowVariableVersionControl("acceptHandshakeAsClient - Wrong key for Sec-WebSocket-Key.");
                return 2;
            }
            winterFlowSchedulerView2.WinterFlowTransactionAgent("Sec-WebSocket-Extensions");
            Iterator it = this.WinterFlowVariableVersionControl.iterator();
            if (it.hasNext()) {
                WinterFlowIDEStack winterFlowIDEStack = (WinterFlowIDEStack) it.next();
                winterFlowIDEStack.getClass();
                this.WinterFlowCacheManagerAgent = winterFlowIDEStack;
                winterFlowValidatorPipeline.WinterFlowArrayNetwork(winterFlowIDEStack, "acceptHandshakeAsClient - Matching extension found: {}");
                z = true;
            } else {
                z = 2;
            }
            if (WinterFlowVariableVersionControl(winterFlowSchedulerView2.WinterFlowTransactionAgent("Sec-WebSocket-Protocol")) == 1 && z) {
                return 1;
            }
            winterFlowValidatorPipeline.WinterFlowVariableVersionControl("acceptHandshakeAsClient - No matching extension or protocol found.");
            return 2;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final WinterFlowPackageConsumer WinterFlowServerProtocol(ByteBuffer byteBuffer) {
        WinterFlowPackageConsumer winterFlowPackageConsumer;
        int i = this.WinterFlowRouterStructure;
        String WinterFlowSyntax = WinterFlowSyntax(byteBuffer);
        if (WinterFlowSyntax == null) {
            throw new WinterFlowManagerUtility(byteBuffer.capacity() + 128);
        }
        String[] split = WinterFlowSyntax.split(" ", 3);
        if (split.length != 3) {
            throw new WinterFlowDeserializationLayer(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        }
        if (i == 1) {
            if (!"101".equals(split[1])) {
                throw new WinterFlowDeserializationLayer("Invalid status code received: " + split[1] + " Status line: " + WinterFlowSyntax);
            }
            if (!"HTTP/1.1".equalsIgnoreCase(split[0])) {
                throw new WinterFlowDeserializationLayer("Invalid status line received: " + split[0] + " Status line: " + WinterFlowSyntax);
            }
            WinterFlowPackageConsumer winterFlowSchedulerView = new WinterFlowSchedulerView(1);
            Short.parseShort(split[1]);
            String str = split[2];
            winterFlowPackageConsumer = winterFlowSchedulerView;
        } else {
            if (!"GET".equalsIgnoreCase(split[0])) {
                throw new WinterFlowDeserializationLayer("Invalid request method received: " + split[0] + " Status line: " + WinterFlowSyntax);
            }
            if (!"HTTP/1.1".equalsIgnoreCase(split[2])) {
                throw new WinterFlowDeserializationLayer("Invalid status line received: " + split[2] + " Status line: " + WinterFlowSyntax);
            }
            WinterFlowEventEmitterController winterFlowEventEmitterController = new WinterFlowEventEmitterController();
            String str2 = split[1];
            if (str2 == null) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("http resource descriptor must not be null");
                return null;
            }
            winterFlowEventEmitterController.WinterFlowHookDataSource = str2;
            winterFlowPackageConsumer = winterFlowEventEmitterController;
        }
        String WinterFlowSyntax2 = WinterFlowSyntax(byteBuffer);
        while (WinterFlowSyntax2 != null && WinterFlowSyntax2.length() > 0) {
            String[] split2 = WinterFlowSyntax2.split(":", 2);
            if (split2.length != 2) {
                throw new WinterFlowDeserializationLayer("not an http header");
            }
            if (((TreeMap) winterFlowPackageConsumer.WinterFlowRouterStructure).containsKey(split2[0])) {
                String str3 = split2[0];
                winterFlowPackageConsumer.WinterFlowServiceUtility(str3, winterFlowPackageConsumer.WinterFlowTransactionAgent(str3) + "; " + split2[1].replaceFirst("^ +", ""));
            } else {
                winterFlowPackageConsumer.WinterFlowServiceUtility(split2[0], split2[1].replaceFirst("^ +", ""));
            }
            WinterFlowSyntax2 = WinterFlowSyntax(byteBuffer);
        }
        if (WinterFlowSyntax2 != null) {
            return winterFlowPackageConsumer;
        }
        throw new WinterFlowManagerUtility();
    }

    public final void WinterFlowServiceUtility(long j) {
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowHookDataSource;
        if (j > 2147483647L) {
            winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Limit exedeed: Payloadsize is to big...");
            throw new WinterFlowLibrarySystem("Payloadsize is to big...");
        }
        int i = this.WinterFlowThreadListener;
        if (j > i) {
            winterFlowValidatorPipeline.WinterFlowServerProtocol("Payload limit reached. Allowed: {} Current: {}", Integer.valueOf(i), Long.valueOf(j));
            throw new WinterFlowLibrarySystem("Payload limit reached.", i);
        }
        if (j >= 0) {
            return;
        }
        winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Limit underflow: Payloadsize is to little...");
        throw new WinterFlowLibrarySystem("Payloadsize is to little...");
    }

    public final WinterFlowUserManagerLoader WinterFlowThreadListener(ByteBuffer byteBuffer) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        WinterFlowUserManagerLoader winterFlowCloudResolver;
        int i5;
        if (byteBuffer == null) {
            throw new IllegalArgumentException();
        }
        int remaining = byteBuffer.remaining();
        WinterFlowBandwidthObject(remaining, 2);
        byte b = byteBuffer.get();
        boolean z2 = (b >> 8) != 0;
        boolean z3 = (b & 64) != 0;
        boolean z4 = (b & 32) != 0;
        boolean z5 = (b & 16) != 0;
        byte b2 = byteBuffer.get();
        boolean z6 = (b2 & Byte.MIN_VALUE) != 0;
        byte b3 = (byte) (b2 & Byte.MAX_VALUE);
        byte b4 = (byte) (b & 15);
        if (b4 == 0) {
            i = 2;
            i2 = 1;
        } else if (b4 == 1) {
            i2 = 2;
            i = 2;
        } else if (b4 != 2) {
            switch (b4) {
                case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                    i = 2;
                    i2 = 6;
                    break;
                case 9:
                    i = 2;
                    i2 = 4;
                    break;
                case 10:
                    i = 2;
                    i2 = 5;
                    break;
                default:
                    throw new WinterFlowFrameworkQuery("Unknown opcode " + ((int) b4));
            }
        } else {
            i = 2;
            i2 = 3;
        }
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowHookDataSource;
        if (b3 >= 0 && b3 <= 125) {
            i3 = b3;
            i4 = i;
            z = z3;
        } else {
            if (i2 == 4 || i2 == 5 || i2 == 6) {
                winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Invalid frame: more than 125 octets");
                throw new WinterFlowFrameworkQuery("more than 125 octets");
            }
            if (b3 == 126) {
                WinterFlowBandwidthObject(remaining, 4);
                byte[] bArr = new byte[3];
                bArr[1] = byteBuffer.get();
                bArr[i] = byteBuffer.get();
                i3 = new BigInteger(bArr).intValue();
                z = z3;
                i4 = 4;
            } else {
                WinterFlowBandwidthObject(remaining, 10);
                byte[] bArr2 = new byte[8];
                for (int i6 = 0; i6 < 8; i6++) {
                    bArr2[i6] = byteBuffer.get();
                }
                z = z3;
                long longValue = new BigInteger(bArr2).longValue();
                WinterFlowServiceUtility(longValue);
                i3 = (int) longValue;
                i4 = 10;
            }
        }
        WinterFlowServiceUtility(i3);
        WinterFlowBandwidthObject(remaining, i4 + (z6 ? 4 : 0) + i3);
        if (i3 < 0) {
            throw new WinterFlowStackLayer("Negative count", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        if (z6) {
            byte[] bArr3 = new byte[4];
            byteBuffer.get(bArr3);
            for (int i7 = 0; i7 < i3; i7++) {
                allocate.put((byte) (byteBuffer.get() ^ bArr3[i7 % 4]));
            }
        } else {
            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
            byteBuffer.position(allocate.limit() + byteBuffer.position());
        }
        int WinterFlowRouterAdapter = WinterFlowResolverBackend.WinterFlowRouterAdapter(i2);
        if (WinterFlowRouterAdapter != 0) {
            if (WinterFlowRouterAdapter == 1) {
                winterFlowCloudResolver = new WinterFlowCloudResolver(2, 2);
            } else if (WinterFlowRouterAdapter == i) {
                winterFlowCloudResolver = new WinterFlowCloudResolver(3, 0);
            } else if (WinterFlowRouterAdapter == 3) {
                winterFlowCloudResolver = new WinterFlowRequestView(4, 0);
            } else if (WinterFlowRouterAdapter == 4) {
                winterFlowCloudResolver = new WinterFlowWorkerAgent(5, 0);
            } else {
                if (WinterFlowRouterAdapter != 5) {
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Supplied opcode is invalid");
                    return null;
                }
                winterFlowCloudResolver = new WinterFlowIDEPipeline();
            }
            i5 = 1;
        } else {
            i5 = 1;
            winterFlowCloudResolver = new WinterFlowCloudResolver(1, 1);
        }
        winterFlowCloudResolver.WinterFlowRouterStructure = z2;
        winterFlowCloudResolver.WinterFlowVariableVersionControl = z;
        winterFlowCloudResolver.WinterFlowTransactionManagerStrategy = z4;
        winterFlowCloudResolver.WinterFlowUnitTestResponse = z5;
        allocate.flip();
        winterFlowCloudResolver.WinterFlowArrayNetwork(allocate);
        int i8 = winterFlowCloudResolver.WinterFlowHookDataSource;
        WinterFlowIDEStack winterFlowIDEStack = this.WinterFlowArrayNetwork;
        if (i8 != i5) {
            if (winterFlowCloudResolver.WinterFlowVariableVersionControl || winterFlowCloudResolver.WinterFlowTransactionManagerStrategy || winterFlowCloudResolver.WinterFlowUnitTestResponse) {
                this.WinterFlowTransactionManagerStrategy = this.WinterFlowCacheManagerAgent;
            } else {
                this.WinterFlowTransactionManagerStrategy = winterFlowIDEStack;
            }
        }
        WinterFlowIDEStack winterFlowIDEStack2 = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowIDEStack2 == null) {
            this.WinterFlowTransactionManagerStrategy = winterFlowIDEStack;
        } else {
            winterFlowIDEStack = winterFlowIDEStack2;
        }
        winterFlowIDEStack.getClass();
        if (!winterFlowCloudResolver.WinterFlowVariableVersionControl && !winterFlowCloudResolver.WinterFlowTransactionManagerStrategy && !winterFlowCloudResolver.WinterFlowUnitTestResponse) {
            this.WinterFlowTransactionManagerStrategy.getClass();
            if (winterFlowValidatorPipeline.WinterFlowTransactionAgent()) {
                winterFlowValidatorPipeline.WinterFlowServerProtocol("afterDecoding({}): {}", Integer.valueOf(winterFlowCloudResolver.WinterFlowRouterStructure().remaining()), winterFlowCloudResolver.WinterFlowRouterStructure().remaining() > 1000 ? "too big to display" : new String(winterFlowCloudResolver.WinterFlowRouterStructure().array()));
            }
            winterFlowCloudResolver.WinterFlowHookDataSource();
            return winterFlowCloudResolver;
        }
        throw new WinterFlowFrameworkQuery("bad rsv RSV1: " + winterFlowCloudResolver.WinterFlowVariableVersionControl + " RSV2: " + winterFlowCloudResolver.WinterFlowTransactionManagerStrategy + " RSV3: " + winterFlowCloudResolver.WinterFlowUnitTestResponse);
    }

    public final List WinterFlowTransactionAgent(ByteBuffer byteBuffer) {
        LinkedList linkedList;
        while (true) {
            linkedList = new LinkedList();
            if (this.WinterFlowTransactionAgent == null) {
                break;
            }
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.WinterFlowTransactionAgent.remaining();
                ByteBuffer byteBuffer2 = this.WinterFlowTransactionAgent;
                if (remaining2 > remaining) {
                    byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.EMPTY_LIST;
                }
                byteBuffer2.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(WinterFlowThreadListener((ByteBuffer) this.WinterFlowTransactionAgent.duplicate().position(0)));
                this.WinterFlowTransactionAgent = null;
            } catch (WinterFlowListenerObject e) {
                int i = e.WinterFlowVariableVersionControl;
                if (i < 0) {
                    throw new WinterFlowStackLayer("Negative count", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
                }
                ByteBuffer allocate = ByteBuffer.allocate(i);
                this.WinterFlowTransactionAgent.rewind();
                allocate.put(this.WinterFlowTransactionAgent);
                this.WinterFlowTransactionAgent = allocate;
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(WinterFlowThreadListener(byteBuffer));
            } catch (WinterFlowListenerObject e2) {
                byteBuffer.reset();
                int i2 = e2.WinterFlowVariableVersionControl;
                if (i2 < 0) {
                    throw new WinterFlowStackLayer("Negative count", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                this.WinterFlowTransactionAgent = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public final ByteBuffer WinterFlowTransactionManagerStrategy() {
        ByteBuffer allocate;
        synchronized (this.WinterFlowResponseEngine) {
            try {
                ArrayList arrayList = this.WinterFlowResponseEngine;
                int size = arrayList.size();
                int i = 0;
                long j = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    j += ((ByteBuffer) obj).limit();
                }
                WinterFlowArrayNetwork();
                allocate = ByteBuffer.allocate((int) j);
                ArrayList arrayList2 = this.WinterFlowResponseEngine;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    allocate.put((ByteBuffer) obj2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        allocate.flip();
        return allocate;
    }

    public final void WinterFlowUnitTestResponse(WinterFlowRefactoringLayer winterFlowRefactoringLayer, RuntimeException runtimeException) {
        this.WinterFlowHookDataSource.WinterFlowResponseEngine("Runtime exception during onWebsocketMessage", runtimeException);
        winterFlowRefactoringLayer.WinterFlowUnitTestResponse.WinterFlowArrayNetwork();
    }

    public final int WinterFlowVariableVersionControl(String str) {
        ArrayList arrayList = this.WinterFlowRouterRouter;
        if (arrayList.size() <= 0) {
            return 2;
        }
        WinterFlowServiceSingleton winterFlowServiceSingleton = (WinterFlowServiceSingleton) arrayList.get(0);
        winterFlowServiceSingleton.getClass();
        this.WinterFlowUnitTestResponse = winterFlowServiceSingleton;
        this.WinterFlowHookDataSource.WinterFlowArrayNetwork(winterFlowServiceSingleton, "acceptHandshake - Matching protocol found: {}");
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowHookSoftware.class != obj.getClass()) {
            return false;
        }
        WinterFlowHookSoftware winterFlowHookSoftware = (WinterFlowHookSoftware) obj;
        if (this.WinterFlowThreadListener != winterFlowHookSoftware.WinterFlowThreadListener) {
            return false;
        }
        WinterFlowIDEStack winterFlowIDEStack = this.WinterFlowCacheManagerAgent;
        WinterFlowIDEStack winterFlowIDEStack2 = winterFlowHookSoftware.WinterFlowCacheManagerAgent;
        if (winterFlowIDEStack != null) {
            if (!winterFlowIDEStack.equals(winterFlowIDEStack2)) {
                return false;
            }
        } else if (winterFlowIDEStack2 != null) {
            return false;
        }
        WinterFlowServiceSingleton winterFlowServiceSingleton = this.WinterFlowUnitTestResponse;
        WinterFlowServiceSingleton winterFlowServiceSingleton2 = winterFlowHookSoftware.WinterFlowUnitTestResponse;
        return winterFlowServiceSingleton != null ? winterFlowServiceSingleton.equals(winterFlowServiceSingleton2) : winterFlowServiceSingleton2 == null;
    }

    public final int hashCode() {
        int hashCode = this.WinterFlowCacheManagerAgent != null ? WinterFlowIDEStack.class.hashCode() : 0;
        int i = this.WinterFlowThreadListener;
        return (hashCode * 961) + (i ^ (i >>> 32));
    }

    public final String toString() {
        String WinterFlowResponseEngine = WinterFlowResponseEngine();
        if (this.WinterFlowCacheManagerAgent != null) {
            StringBuilder sb = new StringBuilder(WinterFlowResponseEngine);
            sb.append(" extension: ");
            this.WinterFlowCacheManagerAgent.getClass();
            sb.append(WinterFlowIDEStack.class.getSimpleName());
            WinterFlowResponseEngine = sb.toString();
        }
        WinterFlowServiceSingleton winterFlowServiceSingleton = this.WinterFlowUnitTestResponse;
        if (winterFlowServiceSingleton != null) {
            winterFlowServiceSingleton.getClass();
            WinterFlowResponseEngine = WinterFlowResponseEngine.concat(" protocol: ");
        }
        return WinterFlowResponseEngine + " max frame size: " + this.WinterFlowThreadListener;
    }
}
