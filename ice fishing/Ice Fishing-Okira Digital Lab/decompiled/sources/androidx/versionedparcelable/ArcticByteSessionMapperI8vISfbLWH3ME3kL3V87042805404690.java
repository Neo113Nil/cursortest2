package androidx.versionedparcelable;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ArcticByteSessionMapperI8vISfbLWH3ME3kL3V87042805404690 implements SolarMeshDecoderPolymorphismZNQanuoTvmaJs3vTgy65343563108738 {
    public final MysticCacheResponsePrefixSlwuYJovSK9CHPCZ9999428307575990 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public ArcticByteSessionMapperI8vISfbLWH3ME3kL3V87042805404690(MysticCacheResponsePrefixSlwuYJovSK9CHPCZ9999428307575990 mysticCacheResponsePrefixSlwuYJovSK9CHPCZ9999428307575990) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = mysticCacheResponsePrefixSlwuYJovSK9CHPCZ9999428307575990;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(WhiteFieldMiddlewareRouterU7ueIyQ4CNKVMehQ6j49076943639696 whiteFieldMiddlewareRouterU7ueIyQ4CNKVMehQ6j49076943639696) {
        ClipboardManager clipboardManager = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (whiteFieldMiddlewareRouterU7ueIyQ4CNKVMehQ6j49076943639696 != null) {
            clipboardManager.setPrimaryClip(whiteFieldMiddlewareRouterU7ueIyQ4CNKVMehQ6j49076943639696.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
