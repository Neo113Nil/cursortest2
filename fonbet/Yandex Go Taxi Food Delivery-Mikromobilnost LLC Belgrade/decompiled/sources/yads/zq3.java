package yads;

import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import defpackage.b64;
import defpackage.gn61;
import defpackage.hst;
import defpackage.jst;
import defpackage.ke00;
import defpackage.sls;
import defpackage.uk10;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class zq3 extends Lambda implements sls {
    public final /* synthetic */ gn61 b;
    public final /* synthetic */ AdRequestError c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq3(gn61 gn61Var, AdRequestError adRequestError) {
        super(0);
        this.b = gn61Var;
        this.c = adRequestError;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        NativeAdLoadListener nativeAdLoadListener = this.b.a;
        AdRequestError adRequestError = this.c;
        ((uk10) nativeAdLoadListener).getClass();
        hst hstVar = jst.e;
        ke00 a = hstVar.b.a();
        if (a != null && a.b(15)) {
            a.a(15, null, null, b64.l("MobileAdsNativeBannerView: failed to load ad for unit=", adRequestError.getAdUnitId(), Extension.COLON_SPACE, adRequestError.getRu.yandex.video.m3.player.utils.DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION java.lang.String()), hstVar.a);
        }
        return zy11.a;
    }
}
