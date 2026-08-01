package com.google.android.datatransport;

import com.adjust.sdk.network.ErrorCodes;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowIDEPipeline extends WinterFlowUserManagerLoader {
    public String WinterFlowResponseEngine;
    public int WinterFlowSyntax;

    public WinterFlowIDEPipeline() {
        super(6, 0);
        this.WinterFlowResponseEngine = "";
        WinterFlowVariableVersionControl();
        this.WinterFlowSyntax = 1000;
        WinterFlowVariableVersionControl();
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerLoader
    public final void WinterFlowArrayNetwork(ByteBuffer byteBuffer) {
        this.WinterFlowSyntax = ErrorCodes.SOCKET_TIMEOUT_EXCEPTION;
        this.WinterFlowResponseEngine = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.WinterFlowSyntax = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.WinterFlowSyntax = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            this.WinterFlowSyntax = allocate.getInt();
        }
        byteBuffer.reset();
        try {
            int position = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.WinterFlowResponseEngine = WinterFlowRequestPlatform.WinterFlowHookDataSource(byteBuffer);
                } catch (IllegalArgumentException unused) {
                    throw new WinterFlowStackLayer(ErrorCodes.IO_EXCEPTION);
                }
            } finally {
                byteBuffer.position(position);
            }
        } catch (WinterFlowStackLayer unused2) {
            this.WinterFlowSyntax = ErrorCodes.IO_EXCEPTION;
            this.WinterFlowResponseEngine = null;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerLoader
    public final void WinterFlowHookDataSource() {
        super.WinterFlowHookDataSource();
        if (this.WinterFlowSyntax == 1007 && this.WinterFlowResponseEngine.isEmpty()) {
            throw new WinterFlowStackLayer("Received text is no valid utf8 string!", ErrorCodes.IO_EXCEPTION);
        }
        if (this.WinterFlowSyntax == 1005 && this.WinterFlowResponseEngine.length() > 0) {
            throw new WinterFlowStackLayer("A close frame must have a closecode if it has a reason", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        }
        int i = this.WinterFlowSyntax;
        if (i > 1015 && i < 3000) {
            throw new WinterFlowStackLayer("Trying to send an illegal close code!", ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION);
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new WinterFlowFrameworkQuery("closecode must not be sent over the wire: " + this.WinterFlowSyntax);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerLoader
    public final ByteBuffer WinterFlowRouterStructure() {
        return this.WinterFlowSyntax == 1005 ? ByteBuffer.allocate(0) : this.WinterFlowCacheManagerAgent;
    }

    public final void WinterFlowVariableVersionControl() {
        String str = this.WinterFlowResponseEngine;
        CodingErrorAction codingErrorAction = WinterFlowRequestPlatform.WinterFlowRouterStructure;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.WinterFlowSyntax);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(bytes.length + 2);
        allocate2.put(allocate);
        allocate2.put(bytes);
        allocate2.rewind();
        this.WinterFlowCacheManagerAgent = allocate2;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerLoader
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WinterFlowIDEPipeline.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        WinterFlowIDEPipeline winterFlowIDEPipeline = (WinterFlowIDEPipeline) obj;
        if (this.WinterFlowSyntax != winterFlowIDEPipeline.WinterFlowSyntax) {
            return false;
        }
        String str = this.WinterFlowResponseEngine;
        String str2 = winterFlowIDEPipeline.WinterFlowResponseEngine;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerLoader
    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.WinterFlowSyntax) * 31;
        String str = this.WinterFlowResponseEngine;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.datatransport.WinterFlowUserManagerLoader
    public final String toString() {
        return super.toString() + "code: " + this.WinterFlowSyntax;
    }
}
