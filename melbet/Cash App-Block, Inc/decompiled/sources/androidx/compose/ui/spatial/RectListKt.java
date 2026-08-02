package androidx.compose.ui.spatial;

import kotlin.ULong;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public abstract class RectListKt {
    public static final long EverythingButLastChildOffset;
    public static final long EverythingButParentId;
    public static final long TombStone;

    static {
        ULong.Companion companion = ULong.Companion;
        EverythingButLastChildOffset = -1151795604700004353L;
        EverythingButParentId = -1125899873288193L;
        TombStone = (Math.min(0, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2) << 50) | 1125899906842623L;
    }
}
