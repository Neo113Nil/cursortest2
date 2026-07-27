package o4;

import L3.q;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.icefishing.icefishinglive2.C5275R;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: o4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4797j implements NativeAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f39586n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f39587u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NativeAd f39588v;

    public C4797j(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        this.f39586n = context;
        this.f39587u = viewGroup;
        this.f39588v = nativeAd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeAd nativeAd = this.f39588v;
        if (nativeAd == null || !nativeAd.isAdLoaded()) {
            return;
        }
        this.f39587u.addView(NativeAdView.render(this.f39586n, nativeAd, NativeAdView.Type.HEIGHT_300));
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (C4799l.f39612g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f39586n);
            ViewGroup viewGroup = this.f39587u;
            View inflate = from.inflate(C5275R.layout.qureka_native, viewGroup, false);
            C4799l.d(inflate.findViewById(C5275R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.gif1);
            TextView textView = (TextView) inflate.findViewById(C5275R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(C4799l.f39606S[nextInt]);
            textView2.setText(C4799l.f39607T[nextInt]);
            gifImageView.setBackgroundResource(C4799l.f39608U[nextInt]);
            inflate.findViewById(C5275R.id.nativeclick).setOnClickListener(new q(11, this));
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
