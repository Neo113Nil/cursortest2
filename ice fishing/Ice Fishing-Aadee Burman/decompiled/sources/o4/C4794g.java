package o4;

import L3.q;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.icefishing.icefishinglive2.C5275R;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: o4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4794g implements NativeAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f39579n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f39580u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NativeBannerAd f39581v;

    public C4794g(Context context, ViewGroup viewGroup, NativeBannerAd nativeBannerAd) {
        this.f39579n = context;
        this.f39580u = viewGroup;
        this.f39581v = nativeBannerAd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeBannerAd nativeBannerAd = this.f39581v;
        if (nativeBannerAd == null || nativeBannerAd != ad) {
            return;
        }
        this.f39580u.addView(NativeBannerAdView.render(this.f39579n, nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100));
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (C4799l.f39612g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f39579n);
            ViewGroup viewGroup = this.f39580u;
            View inflate = from.inflate(C5275R.layout.qureka_nativebanner_layout, viewGroup, false);
            C4799l.d(inflate.findViewById(C5275R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(C4799l.f39603P[nextInt]);
            textView2.setText(C4799l.f39604Q[nextInt]);
            gifImageView.setImageResource(C4799l.f39605R[nextInt]);
            inflate.findViewById(C5275R.id.bannerclick).setOnClickListener(new q(8, this));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad) {
    }
}
