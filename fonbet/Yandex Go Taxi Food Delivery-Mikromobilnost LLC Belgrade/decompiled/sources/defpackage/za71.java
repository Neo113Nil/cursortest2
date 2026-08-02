package defpackage;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.Map;

/* loaded from: classes7.dex */
public final class za71 implements cy61 {
    @Override // defpackage.cy61
    public final void a(Context context, a aVar, Object obj, Map map, Map map2) {
        ((MediatedNativeAdapter) aVar).loadAd(context, (MediatedNativeAdapterListener) obj, map, map2);
    }

    @Override // defpackage.cy61
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }
}
