package ru.yandex.video.m3.player.provider.internal;

import android.content.Context;
import defpackage.i3y;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/provider/internal/VpuidProviderImpl;", "Lru/yandex/video/m3/player/provider/internal/VpuidProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getVpuid", "()Ljava/lang/String;", "_vpuid$delegate", "Li3y;", "get_vpuid", "_vpuid", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VpuidProviderImpl implements VpuidProvider {
    public static final int $stable = 8;

    /* renamed from: _vpuid$delegate, reason: from kotlin metadata */
    private final i3y _vpuid;

    public VpuidProviderImpl(final Context context) {
        this._vpuid = a.a(new sls() { // from class: ru.yandex.video.m3.player.provider.internal.VpuidProviderImpl$_vpuid$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                return new UuidProviderImpl(context).getUuid();
            }
        });
    }

    private final String get_vpuid() {
        return (String) this._vpuid.getValue();
    }

    @Override // ru.yandex.video.m3.player.provider.internal.VpuidProvider
    public String getVpuid() {
        return get_vpuid();
    }
}
