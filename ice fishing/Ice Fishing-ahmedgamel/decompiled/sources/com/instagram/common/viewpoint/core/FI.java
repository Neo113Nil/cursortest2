package com.instagram.common.viewpoint.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.instagram.common.viewpoint.core.FL;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public interface FI<T extends FL> {
    void AEc(T t6, long j6, long j9, boolean z3);

    void AEe(T t6, long j6, long j9);

    FJ AEf(T t6, long j6, long j9, IOException iOException, int i);

    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "For Media3 Migration Backward Compatibility")
    void AEi(T t6, long j6, long j9, int i);
}
