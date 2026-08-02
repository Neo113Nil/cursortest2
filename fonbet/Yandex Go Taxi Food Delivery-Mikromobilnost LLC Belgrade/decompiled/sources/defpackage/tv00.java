package defpackage;

import com.yandex.go.blockeduser.api.analytics.BlockedReason;
import ru.yandex.taxi.net.taxi.dto.response.BlockedUserTypeDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class tv00 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[BlockedUserTypeDto.values().length];
        try {
            iArr[BlockedUserTypeDto.ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BlockedUserTypeDto.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[BlockedReason.values().length];
        try {
            iArr2[BlockedReason.LAUNCH_HAS_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[BlockedReason.HANDLE_FORBIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
