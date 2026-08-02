package ru.yandex.tankerapp.go.sdk.location;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.k4o;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.enums.a;
import org.webrtc.PeerConnectionFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/tankerapp/go/sdk/location/CartechLocationServiceStatus;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Disabled", PeerConnectionFactory.TRIAL_ENABLED, "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CartechLocationServiceStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CartechLocationServiceStatus[] $VALUES;

    @ysq0(BackendConfig.Restrictions.DISABLED)
    public static final CartechLocationServiceStatus Disabled;

    @ysq0(BackendConfig.Restrictions.ENABLED)
    public static final CartechLocationServiceStatus Enabled;
    private final String value;

    static {
        CartechLocationServiceStatus cartechLocationServiceStatus = new CartechLocationServiceStatus("Disabled", 0, BackendConfig.Restrictions.DISABLED);
        Disabled = cartechLocationServiceStatus;
        CartechLocationServiceStatus cartechLocationServiceStatus2 = new CartechLocationServiceStatus(PeerConnectionFactory.TRIAL_ENABLED, 1, BackendConfig.Restrictions.ENABLED);
        Enabled = cartechLocationServiceStatus2;
        CartechLocationServiceStatus[] cartechLocationServiceStatusArr = {cartechLocationServiceStatus, cartechLocationServiceStatus2};
        $VALUES = cartechLocationServiceStatusArr;
        $ENTRIES = a.a(cartechLocationServiceStatusArr);
    }

    private CartechLocationServiceStatus(String str, int i, String str2) {
        this.value = str2;
    }

    public static CartechLocationServiceStatus valueOf(String str) {
        return (CartechLocationServiceStatus) Enum.valueOf(CartechLocationServiceStatus.class, str);
    }

    public static CartechLocationServiceStatus[] values() {
        return (CartechLocationServiceStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
