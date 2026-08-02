package defpackage;

import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes7.dex */
public final class zg71 implements MediatedRewardedAdapterListener {
    public static final /* synthetic */ kgx[] c;
    public final aj81 a;
    public final r581 b = new r581(null);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("contentController", 0, "getContentController()Lcom/monetization/ads/rewarded/content/RewardedAdContentController;", zg71.class);
        qoi0.a.getClass();
        c = new kgx[]{mutablePropertyReference1Impl, qha1.a(zg71.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;"), qha1.a(zg71.class, "adQualityVerifierController", "getAdQualityVerifierController()Lcom/monetization/ads/base/quality/AdQualityVerifierController;")};
    }

    public zg71(bt81 bt81Var, j181 j181Var, aj81 aj81Var) {
        this.a = aj81Var;
        new WeakReference(bt81Var);
        new WeakReference(j181Var);
    }
}
