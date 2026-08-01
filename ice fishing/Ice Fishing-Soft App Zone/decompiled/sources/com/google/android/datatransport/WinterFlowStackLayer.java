package com.google.android.datatransport;

import com.adjust.sdk.network.ErrorCodes;
import java.nio.charset.CharacterCodingException;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowStackLayer extends Exception {
    public final int WinterFlowVariableVersionControl;

    public WinterFlowStackLayer(CharacterCodingException characterCodingException) {
        super(characterCodingException);
        this.WinterFlowVariableVersionControl = ErrorCodes.IO_EXCEPTION;
    }

    public WinterFlowStackLayer(String str, int i) {
        super(str);
        this.WinterFlowVariableVersionControl = i;
    }

    public WinterFlowStackLayer(int i) {
        this.WinterFlowVariableVersionControl = i;
    }
}
