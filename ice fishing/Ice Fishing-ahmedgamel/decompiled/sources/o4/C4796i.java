package o4;

import L3.q;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: o4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4796i implements AdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f39585n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f39586u;

    public C4796i(Context context, ViewGroup viewGroup) {
        this.f39585n = context;
        this.f39586u = viewGroup;
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (m.f39615g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f39585n);
            ViewGroup viewGroup = this.f39586u;
            View inflate = from.inflate(C5275R.layout.qureka_nativebanner_layout, viewGroup, false);
            m.d(inflate.findViewById(C5275R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5275R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5275R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(m.f39606P[nextInt]);
            textView2.setText(m.f39607Q[nextInt]);
            gifImageView.setImageResource(m.f39608R[nextInt]);
            inflate.findViewById(C5275R.id.bannerclick).setOnClickListener(new q(9, this));
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
