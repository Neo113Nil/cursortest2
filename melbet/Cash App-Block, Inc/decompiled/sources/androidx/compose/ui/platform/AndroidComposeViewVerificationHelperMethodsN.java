package androidx.compose.ui.platform;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    public static PointerIcon toAndroidPointerIcon(Context context, androidx.compose.ui.input.pointer.PointerIcon pointerIcon) {
        return pointerIcon instanceof AndroidPointerIconType ? PointerIcon.getSystemIcon(context, ((AndroidPointerIconType) pointerIcon).f857type) : PointerIcon.getSystemIcon(context, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
    }

    public final void setPointerIcon(View view, androidx.compose.ui.input.pointer.PointerIcon pointerIcon) {
        PointerIcon androidPointerIcon = toAndroidPointerIcon(view.getContext(), pointerIcon);
        if (Intrinsics.areEqual(view.getPointerIcon(), androidPointerIcon)) {
            return;
        }
        view.setPointerIcon(androidPointerIcon);
    }
}
