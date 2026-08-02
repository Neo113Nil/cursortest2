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
import com.icefishingapp.icefishing.C5275R;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: o4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4795h implements NativeAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f39582n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f39583u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NativeBannerAd f39584v;

    public C4795h(Context context, ViewGroup viewGroup, NativeBannerAd nativeBannerAd) {
        this.f39582n = context;
        this.f39583u = viewGroup;
        this.f39584v = nativeBannerAd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeBannerAd nativeBannerAd = this.f39584v;
        if (nativeBannerAd == null || nativeBannerAd != ad) {
            return;
        }
        this.f39583u.addView(NativeBannerAdView.render(this.f39582n, nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100));
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (m.f39615g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f39582n);
            ViewGroup viewGroup = this.f39583u;
            View inflate = from.inflate(C5275R.layout.qureka_nativebanner_layout, viewGroup, false);
            m.d(inflate.findViewById(C5275R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(m.f39606P[nextInt]);
            textView2.setText(m.f39607Q[nextInt]);
            gifImageView.setImageResource(m.f39608R[nextInt]);
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
