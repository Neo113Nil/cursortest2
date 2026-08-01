package com.google.android.datatransport;

import com.adjust.sdk.network.ErrorCodes;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRefactoringLayer implements WinterFlowRefactoringVersion {
    public final WinterFlowHookSoftware WinterFlowResponseEngine;
    public final int WinterFlowTransactionAgent;
    public final WinterFlowObjectManager WinterFlowUnitTestResponse;
    public final WinterFlowValidatorPipeline WinterFlowVariableVersionControl = WinterFlowParserUtility.WinterFlowHookDataSource(WinterFlowRefactoringLayer.class);
    public boolean WinterFlowRouterRouter = false;
    public volatile int WinterFlowSyntax = 1;
    public ByteBuffer WinterFlowServerProtocol = ByteBuffer.allocate(0);
    public WinterFlowEventEmitterController WinterFlowThreadListener = null;
    public String WinterFlowServiceUtility = null;
    public Integer WinterFlowBandwidthObject = null;
    public Boolean WinterFlowOrchestrationSubsystem = null;
    public long WinterFlowConcurrencyThread = System.nanoTime();
    public final Object WinterFlowSingletonPlatform = new Object();
    public final LinkedBlockingQueue WinterFlowTransactionManagerStrategy = new LinkedBlockingQueue();

    public WinterFlowRefactoringLayer(WinterFlowObjectManager winterFlowObjectManager, WinterFlowHookSoftware winterFlowHookSoftware) {
        int i = 0;
        this.WinterFlowResponseEngine = null;
        new LinkedBlockingQueue();
        this.WinterFlowUnitTestResponse = winterFlowObjectManager;
        this.WinterFlowTransactionAgent = 1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = winterFlowHookSoftware.WinterFlowVariableVersionControl;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ((WinterFlowIDEStack) obj).getClass();
            arrayList.add(new WinterFlowIDEStack());
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = winterFlowHookSoftware.WinterFlowRouterRouter;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            ((WinterFlowServiceSingleton) obj2).getClass();
            arrayList3.add(new WinterFlowServiceSingleton());
        }
        this.WinterFlowResponseEngine = new WinterFlowHookSoftware(arrayList, arrayList3, winterFlowHookSoftware.WinterFlowThreadListener);
    }

    public final void WinterFlowArrayNetwork(ByteBuffer byteBuffer) {
        WinterFlowHookSoftware winterFlowHookSoftware = this.WinterFlowResponseEngine;
        WinterFlowObjectManager winterFlowObjectManager = this.WinterFlowUnitTestResponse;
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowVariableVersionControl;
        try {
            for (WinterFlowUserManagerLoader winterFlowUserManagerLoader : winterFlowHookSoftware.WinterFlowTransactionAgent(byteBuffer)) {
                winterFlowValidatorPipeline.WinterFlowArrayNetwork(winterFlowUserManagerLoader, "matched frame: {}");
                winterFlowHookSoftware.WinterFlowRouterRouter(this, winterFlowUserManagerLoader);
            }
        } catch (WinterFlowLibrarySystem e) {
            if (e.WinterFlowTransactionManagerStrategy == Integer.MAX_VALUE) {
                winterFlowValidatorPipeline.WinterFlowResponseEngine("Closing due to invalid size of frame", e);
                winterFlowObjectManager.WinterFlowArrayNetwork();
            }
            WinterFlowRouterStructure(e.WinterFlowVariableVersionControl, e.getMessage(), false);
        } catch (WinterFlowStackLayer e2) {
            winterFlowValidatorPipeline.WinterFlowResponseEngine("Closing due to invalid data in frame", e2);
            winterFlowObjectManager.WinterFlowArrayNetwork();
            WinterFlowRouterStructure(e2.WinterFlowVariableVersionControl, e2.getMessage(), false);
        } catch (LinkageError e3) {
            e = e3;
            winterFlowValidatorPipeline.WinterFlowCacheManagerAgent("Got fatal error during frame processing");
            throw e;
        } catch (ThreadDeath e4) {
            e = e4;
            winterFlowValidatorPipeline.WinterFlowCacheManagerAgent("Got fatal error during frame processing");
            throw e;
        } catch (VirtualMachineError e5) {
            e = e5;
            winterFlowValidatorPipeline.WinterFlowCacheManagerAgent("Got fatal error during frame processing");
            throw e;
        } catch (Error e6) {
            winterFlowValidatorPipeline.WinterFlowCacheManagerAgent("Closing web socket due to an error during frame processing");
            new Exception(e6);
            winterFlowObjectManager.WinterFlowArrayNetwork();
            WinterFlowRouterStructure(1011, "Got error ".concat(e6.getClass().getName()), false);
        }
    }

    public final void WinterFlowCacheManagerAgent(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.WinterFlowVariableVersionControl.WinterFlowTransactionAgent()) {
            this.WinterFlowVariableVersionControl.WinterFlowServerProtocol("process({}): ({})", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
        }
        if (this.WinterFlowSyntax != 1) {
            if (this.WinterFlowSyntax == 2) {
                WinterFlowArrayNetwork(byteBuffer);
                return;
            }
            return;
        }
        WinterFlowValidatorPipeline winterFlowValidatorPipeline = this.WinterFlowVariableVersionControl;
        if (this.WinterFlowServerProtocol.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.WinterFlowServerProtocol.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining() + this.WinterFlowServerProtocol.capacity());
                this.WinterFlowServerProtocol.flip();
                allocate.put(this.WinterFlowServerProtocol);
                this.WinterFlowServerProtocol = allocate;
            }
            this.WinterFlowServerProtocol.put(byteBuffer);
            this.WinterFlowServerProtocol.flip();
            byteBuffer2 = this.WinterFlowServerProtocol;
        }
        byteBuffer2.mark();
        try {
            try {
                int i = this.WinterFlowTransactionAgent;
                if (i == 2) {
                    this.WinterFlowResponseEngine.getClass();
                    WinterFlowPackageConsumer WinterFlowServerProtocol = this.WinterFlowResponseEngine.WinterFlowServerProtocol(byteBuffer2);
                    if (!(WinterFlowServerProtocol instanceof WinterFlowEventEmitterController)) {
                        winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Closing due to protocol error: wrong http function");
                        WinterFlowTransactionManagerStrategy(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, "wrong http function", false);
                        return;
                    }
                    WinterFlowEventEmitterController winterFlowEventEmitterController = (WinterFlowEventEmitterController) WinterFlowServerProtocol;
                    if (this.WinterFlowResponseEngine.WinterFlowHookDataSource(winterFlowEventEmitterController) != 1) {
                        winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Closing due to protocol error: the handshake did finally not match");
                        WinterFlowRouterStructure(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, "the handshake did finally not match", false);
                        return;
                    }
                    WinterFlowUnitTestResponse(winterFlowEventEmitterController);
                } else {
                    if (i != 1) {
                        return;
                    }
                    WinterFlowHookSoftware winterFlowHookSoftware = this.WinterFlowResponseEngine;
                    winterFlowHookSoftware.WinterFlowRouterStructure = i;
                    WinterFlowPackageConsumer WinterFlowServerProtocol2 = winterFlowHookSoftware.WinterFlowServerProtocol(byteBuffer2);
                    if (!(WinterFlowServerProtocol2 instanceof WinterFlowSchedulerView)) {
                        winterFlowValidatorPipeline.WinterFlowVariableVersionControl("Closing due to protocol error: wrong http function");
                        WinterFlowTransactionManagerStrategy(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, "wrong http function", false);
                        return;
                    }
                    WinterFlowSchedulerView winterFlowSchedulerView = (WinterFlowSchedulerView) WinterFlowServerProtocol2;
                    if (this.WinterFlowResponseEngine.WinterFlowRouterStructure(this.WinterFlowThreadListener, winterFlowSchedulerView) != 1) {
                        winterFlowValidatorPipeline.WinterFlowArrayNetwork(this.WinterFlowResponseEngine, "Closing due to protocol error: draft {} refuses handshake");
                        WinterFlowRouterStructure(ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION, "draft " + this.WinterFlowResponseEngine + " refuses handshake", false);
                        return;
                    }
                    WinterFlowUnitTestResponse(winterFlowSchedulerView);
                }
                if (this.WinterFlowSyntax == 3 || this.WinterFlowSyntax == 4) {
                    return;
                }
                if (byteBuffer.hasRemaining()) {
                    WinterFlowArrayNetwork(byteBuffer);
                } else if (this.WinterFlowServerProtocol.hasRemaining()) {
                    WinterFlowArrayNetwork(this.WinterFlowServerProtocol);
                }
            } catch (WinterFlowDeserializationLayer e) {
                winterFlowValidatorPipeline.WinterFlowSyntax("Closing due to invalid handshake", e);
                WinterFlowRouterStructure(e.WinterFlowVariableVersionControl, e.getMessage(), false);
            }
        } catch (WinterFlowManagerUtility e2) {
            if (this.WinterFlowServerProtocol.capacity() != 0) {
                ByteBuffer byteBuffer3 = this.WinterFlowServerProtocol;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.WinterFlowServerProtocol;
                byteBuffer4.limit(byteBuffer4.capacity());
                return;
            }
            byteBuffer2.reset();
            int i2 = e2.WinterFlowVariableVersionControl;
            if (i2 == 0) {
                i2 = byteBuffer2.capacity() + 16;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
            this.WinterFlowServerProtocol = allocate2;
            allocate2.put(byteBuffer);
        }
    }

    public final synchronized void WinterFlowHookDataSource(int i, String str, boolean z) {
        if (this.WinterFlowSyntax == 4) {
            return;
        }
        if (this.WinterFlowSyntax == 2 && i == 1006) {
            this.WinterFlowSyntax = 3;
        }
        try {
            this.WinterFlowUnitTestResponse.WinterFlowVariableVersionControl();
        } catch (RuntimeException unused) {
            this.WinterFlowUnitTestResponse.WinterFlowArrayNetwork();
        }
        WinterFlowHookSoftware winterFlowHookSoftware = this.WinterFlowResponseEngine;
        if (winterFlowHookSoftware != null) {
            winterFlowHookSoftware.WinterFlowTransactionAgent = null;
            winterFlowHookSoftware.WinterFlowCacheManagerAgent = new WinterFlowIDEStack();
            winterFlowHookSoftware.WinterFlowUnitTestResponse = null;
        }
        this.WinterFlowThreadListener = null;
        this.WinterFlowSyntax = 4;
    }

    public final void WinterFlowRouterRouter(List list) {
        String str;
        byte b;
        if (this.WinterFlowSyntax != 2) {
            throw new WinterFlowServerSystem();
        }
        if (list == null) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WinterFlowUserManagerLoader winterFlowUserManagerLoader = (WinterFlowUserManagerLoader) it.next();
            this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(winterFlowUserManagerLoader, "send frame: {}");
            WinterFlowHookSoftware winterFlowHookSoftware = this.WinterFlowResponseEngine;
            winterFlowHookSoftware.WinterFlowCacheManagerAgent.getClass();
            WinterFlowValidatorPipeline winterFlowValidatorPipeline = winterFlowHookSoftware.WinterFlowHookDataSource;
            if (winterFlowValidatorPipeline.WinterFlowTransactionAgent()) {
                winterFlowValidatorPipeline.WinterFlowServerProtocol("afterEnconding({}): {}", Integer.valueOf(winterFlowUserManagerLoader.WinterFlowRouterStructure().remaining()), winterFlowUserManagerLoader.WinterFlowRouterStructure().remaining() > 1000 ? "too big to display" : new String(winterFlowUserManagerLoader.WinterFlowRouterStructure().array()));
            }
            ByteBuffer WinterFlowRouterStructure = winterFlowUserManagerLoader.WinterFlowRouterStructure();
            boolean z = winterFlowHookSoftware.WinterFlowRouterStructure == 1;
            int i = WinterFlowRouterStructure.remaining() <= 125 ? 1 : WinterFlowRouterStructure.remaining() <= 65535 ? 2 : 8;
            int i2 = 4;
            ByteBuffer allocate = ByteBuffer.allocate(WinterFlowRouterStructure.remaining() + (i > 1 ? i + 1 : i) + 1 + (z ? 4 : 0));
            int i3 = winterFlowUserManagerLoader.WinterFlowHookDataSource;
            if (i3 == 1) {
                b = 0;
            } else if (i3 == 2) {
                b = 1;
            } else if (i3 == 3) {
                b = 2;
            } else if (i3 == 6) {
                b = 8;
            } else if (i3 == 4) {
                b = 9;
            } else {
                if (i3 != 5) {
                    switch (i3) {
                        case 1:
                            str = "CONTINUOUS";
                            break;
                        case 2:
                            str = "TEXT";
                            break;
                        case 3:
                            str = "BINARY";
                            break;
                        case 4:
                            str = "PING";
                            break;
                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                            str = "PONG";
                            break;
                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "CLOSING";
                            break;
                        default:
                            throw null;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Don't know how to handle ".concat(str));
                    return;
                }
                b = 10;
            }
            byte b2 = (byte) (b | ((byte) (winterFlowUserManagerLoader.WinterFlowRouterStructure ? -128 : 0)));
            if (winterFlowUserManagerLoader.WinterFlowVariableVersionControl) {
                b2 = (byte) (b2 | 64);
            }
            if (winterFlowUserManagerLoader.WinterFlowTransactionManagerStrategy) {
                b2 = (byte) (b2 | 32);
            }
            if (winterFlowUserManagerLoader.WinterFlowUnitTestResponse) {
                b2 = (byte) (b2 | 16);
            }
            allocate.put(b2);
            long remaining = WinterFlowRouterStructure.remaining();
            byte[] bArr = new byte[i];
            int i4 = (i * 8) - 8;
            int i5 = 0;
            while (i5 < i) {
                bArr[i5] = (byte) (r20 >>> (i4 - (i5 * 8)));
                i5++;
                i2 = i2;
                remaining = remaining;
            }
            int i6 = i2;
            if (i == 1) {
                allocate.put((byte) (bArr[0] | (z ? Byte.MIN_VALUE : (byte) 0)));
            } else if (i == 2) {
                allocate.put((byte) ((z ? Byte.MIN_VALUE : (byte) 0) | 126));
                allocate.put(bArr);
            } else if (i != 8) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Size representation not supported/specified");
                return;
            } else {
                allocate.put((byte) ((z ? Byte.MIN_VALUE : (byte) 0) | Byte.MAX_VALUE));
                allocate.put(bArr);
            }
            if (z) {
                ByteBuffer allocate2 = ByteBuffer.allocate(i6);
                allocate2.putInt(winterFlowHookSoftware.WinterFlowServerProtocol.nextInt());
                allocate.put(allocate2.array());
                int i7 = 0;
                while (WinterFlowRouterStructure.hasRemaining()) {
                    allocate.put((byte) (WinterFlowRouterStructure.get() ^ allocate2.get(i7 % 4)));
                    i7++;
                }
            } else {
                allocate.put(WinterFlowRouterStructure);
                WinterFlowRouterStructure.flip();
            }
            allocate.flip();
            arrayList.add(allocate);
        }
        WinterFlowSyntax(arrayList);
    }

    public final synchronized void WinterFlowRouterStructure(int i, String str, boolean z) {
        if (this.WinterFlowSyntax == 3 || this.WinterFlowSyntax == 4) {
            return;
        }
        boolean z2 = true;
        if (this.WinterFlowSyntax == 2) {
            if (i == 1006) {
                this.WinterFlowSyntax = 3;
                WinterFlowTransactionManagerStrategy(i, str, false);
                return;
            }
            this.WinterFlowResponseEngine.getClass();
            try {
                if (this.WinterFlowSyntax != 2) {
                    z2 = false;
                }
                if (z2) {
                    WinterFlowIDEPipeline winterFlowIDEPipeline = new WinterFlowIDEPipeline();
                    winterFlowIDEPipeline.WinterFlowResponseEngine = str == null ? "" : str;
                    winterFlowIDEPipeline.WinterFlowVariableVersionControl();
                    winterFlowIDEPipeline.WinterFlowSyntax = i;
                    if (i == 1015) {
                        winterFlowIDEPipeline.WinterFlowSyntax = ErrorCodes.SOCKET_TIMEOUT_EXCEPTION;
                        winterFlowIDEPipeline.WinterFlowResponseEngine = "";
                    }
                    winterFlowIDEPipeline.WinterFlowVariableVersionControl();
                    winterFlowIDEPipeline.WinterFlowHookDataSource();
                    WinterFlowRouterRouter(Collections.singletonList(winterFlowIDEPipeline));
                }
            } catch (WinterFlowStackLayer e) {
                this.WinterFlowVariableVersionControl.WinterFlowResponseEngine("generated frame is invalid", e);
                this.WinterFlowUnitTestResponse.WinterFlowArrayNetwork();
                WinterFlowTransactionManagerStrategy(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, "generated frame is invalid", false);
            }
            WinterFlowTransactionManagerStrategy(i, str, z);
        } else if (i == -3) {
            WinterFlowTransactionManagerStrategy(-3, str, true);
        } else if (i == 1002) {
            WinterFlowTransactionManagerStrategy(i, str, z);
        } else {
            WinterFlowTransactionManagerStrategy(-1, str, false);
        }
        this.WinterFlowSyntax = 3;
        this.WinterFlowServerProtocol = null;
    }

    public final void WinterFlowSyntax(List list) {
        synchronized (this.WinterFlowSingletonPlatform) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    this.WinterFlowVariableVersionControl.WinterFlowServerProtocol("write({}): {}", Integer.valueOf(byteBuffer.remaining()), byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
                    this.WinterFlowTransactionManagerStrategy.add(byteBuffer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void WinterFlowTransactionManagerStrategy(int i, String str, boolean z) {
        if (this.WinterFlowRouterRouter) {
            return;
        }
        this.WinterFlowBandwidthObject = Integer.valueOf(i);
        this.WinterFlowServiceUtility = str;
        this.WinterFlowOrchestrationSubsystem = Boolean.valueOf(z);
        this.WinterFlowRouterRouter = true;
        WinterFlowHookSoftware winterFlowHookSoftware = this.WinterFlowResponseEngine;
        if (winterFlowHookSoftware != null) {
            winterFlowHookSoftware.WinterFlowTransactionAgent = null;
            winterFlowHookSoftware.WinterFlowCacheManagerAgent = new WinterFlowIDEStack();
            winterFlowHookSoftware.WinterFlowUnitTestResponse = null;
        }
        this.WinterFlowThreadListener = null;
    }

    public final void WinterFlowUnitTestResponse(WinterFlowInvokerValidator winterFlowInvokerValidator) {
        this.WinterFlowVariableVersionControl.WinterFlowArrayNetwork(this.WinterFlowResponseEngine, "open using draft: {}");
        this.WinterFlowSyntax = 2;
        this.WinterFlowConcurrencyThread = System.nanoTime();
        try {
            this.WinterFlowUnitTestResponse.WinterFlowTransactionManagerStrategy(winterFlowInvokerValidator);
        } catch (RuntimeException unused) {
            this.WinterFlowUnitTestResponse.WinterFlowArrayNetwork();
        }
    }

    public final void WinterFlowVariableVersionControl() {
        if (this.WinterFlowSyntax == 1) {
            WinterFlowHookDataSource(-1, "", true);
        } else {
            if (this.WinterFlowRouterRouter) {
                WinterFlowHookDataSource(this.WinterFlowBandwidthObject.intValue(), this.WinterFlowServiceUtility, this.WinterFlowOrchestrationSubsystem.booleanValue());
                return;
            }
            this.WinterFlowResponseEngine.getClass();
            this.WinterFlowResponseEngine.getClass();
            WinterFlowHookDataSource(ErrorCodes.SSL_HANDSHAKE_EXCEPTION, "", true);
        }
    }
}
