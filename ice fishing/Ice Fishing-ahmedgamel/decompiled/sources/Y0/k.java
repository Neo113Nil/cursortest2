package Y0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* loaded from: classes.dex */
public final class k implements AdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f3844n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3845u;

    public k(Context context, ViewGroup viewGroup) {
        this.f3844n = context;
        this.f3845u = viewGroup;
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (p.f3878g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f3844n);
            ViewGroup viewGroup = this.f3845u;
            View inflate = from.inflate(C5248R.layout.qureka_nativebanner_layout, viewGroup, false);
            p.d(inflate.findViewById(C5248R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5248R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5248R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(p.f3869P[nextInt]);
            textView2.setText(p.f3870Q[nextInt]);
            gifImageView.setImageResource(p.f3871R[nextInt]);
            inflate.findViewById(C5248R.id.bannerclick).setOnClickListener(new N3.n(3, this));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
