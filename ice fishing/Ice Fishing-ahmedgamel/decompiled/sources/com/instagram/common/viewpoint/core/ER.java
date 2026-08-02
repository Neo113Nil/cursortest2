package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* loaded from: assets/audience_network/classes2.dex */
public class ER {

    @Nullable
    public final C2420qI A00;
    public final Throwable A01;

    public ER(@Nullable C2420qI c2420qI, Throwable th) {
        this.A00 = c2420qI;
        this.A01 = th;
    }
}
