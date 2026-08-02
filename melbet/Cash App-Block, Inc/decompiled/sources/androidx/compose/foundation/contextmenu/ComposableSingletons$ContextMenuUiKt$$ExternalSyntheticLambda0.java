package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function8;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class ComposableSingletons$ContextMenuUiKt$$ExternalSyntheticLambda0 implements Function8 {
    @Override // kotlin.jvm.functions.Function8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        int i;
        Modifier modifier = (Modifier) obj;
        String str = (String) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ContextMenuColors contextMenuColors = (ContextMenuColors) obj4;
        Function3 function3 = (Function3) obj5;
        Function0 function0 = (Function0) obj6;
        Composer composer = (Composer) obj7;
        int intValue = ((Integer) serializable).intValue();
        if ((intValue & 6) == 0) {
            i = (((GapComposer) composer).changed(modifier) ? 4 : 2) | intValue;
        } else {
            i = intValue;
        }
        if ((intValue & 48) == 0) {
            i |= ((GapComposer) composer).changed(str) ? 32 : 16;
        }
        if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
            i |= ((GapComposer) composer).changed(booleanValue) ? 256 : 128;
        }
        if ((intValue & 3072) == 0) {
            i |= ((GapComposer) composer).changed(contextMenuColors) ? 2048 : 1024;
        }
        if ((intValue & 24576) == 0) {
            i |= ((GapComposer) composer).changedInstance(function3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((intValue & 196608) == 0) {
            i |= ((GapComposer) composer).changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(i & 1, (599187 & i) != 599186)) {
            ContextMenuUiKt.ContextMenuItem(str, booleanValue, contextMenuColors, modifier, function3, function0, gapComposer, ((i >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
