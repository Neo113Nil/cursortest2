package Y0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes.dex */
public final class n implements NativeAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f3852n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3853u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NativeAd f3854v;

    public n(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        this.f3852n = context;
        this.f3853u = viewGroup;
        this.f3854v = nativeAd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeAd nativeAd = this.f3854v;
        if (nativeAd == null || !nativeAd.isAdLoaded()) {
            return;
        }
        this.f3853u.addView(NativeAdView.render(this.f3852n, nativeAd, NativeAdView.Type.HEIGHT_300));
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (p.f3878g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f3852n);
            ViewGroup viewGroup = this.f3853u;
            View inflate = from.inflate(C5248R.layout.qureka_native, viewGroup, false);
            p.d(inflate.findViewById(C5248R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5248R.id.gif1);
            TextView textView = (TextView) inflate.findViewById(C5248R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5248R.id.desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(p.f3872S[nextInt]);
            textView2.setText(p.f3873T[nextInt]);
            gifImageView.setBackgroundResource(p.f3874U[nextInt]);
            inflate.findViewById(C5248R.id.nativeclick).setOnClickListener(new N3.n(5, this));
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
