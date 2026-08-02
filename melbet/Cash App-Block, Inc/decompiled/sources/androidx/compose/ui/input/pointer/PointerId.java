package androidx.compose.ui.input.pointer;

import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public abstract class PointerId {
    public static final AndroidPointerIconType pointerIconDefault = new AndroidPointerIconType(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO);
    public static final AndroidPointerIconType pointerIconHand;
    public static final AndroidPointerIconType pointerIconText;

    static {
        new AndroidPointerIconType(IptcConstants.IMAGE_RESOURCE_BLOCK_DISPLAY_INFO);
        pointerIconText = new AndroidPointerIconType(IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
        pointerIconHand = new AndroidPointerIconType(IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m812equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m813toStringimpl(long j) {
        return "PointerId(value=" + j + ')';
    }
}
