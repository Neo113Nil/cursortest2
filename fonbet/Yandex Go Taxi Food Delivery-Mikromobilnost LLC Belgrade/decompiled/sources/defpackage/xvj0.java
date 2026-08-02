package defpackage;

import com.ybsdk.core.common.data.network.dto.cache.DataEntryDescriptorDto;

/* loaded from: classes15.dex */
public abstract /* synthetic */ class xvj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DataEntryDescriptorDto.Behaviour.values().length];
        try {
            iArr[DataEntryDescriptorDto.Behaviour.REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataEntryDescriptorDto.Behaviour.OPTIONAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
