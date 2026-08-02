package androidx.media3.exoplayer.audio;

import android.os.Build;
import com.google.common.collect.ImmutableSet;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes3.dex */
public abstract class IamfUtil {
    public static final ImmutableSet IAMF_SUPPORTED_CHANNEL_MASKS;

    static {
        Integer valueOf = Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
        IAMF_SUPPORTED_CHANNEL_MASKS = Build.VERSION.SDK_INT < 32 ? ImmutableSet.construct(4, 12, valueOf, 6396, 4) : ImmutableSet.of((Object) 12, (Object) valueOf, (Object) 6396, (Object) 4, (Object) 3145980, (Object) 82172, (Object[]) new Integer[]{737532, 9126140, 33904892, 202070268, 744444, 67108860, 743676, 3152124, 88316, 81980, 205215996, 3890172});
    }
}
