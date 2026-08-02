package com.anythink.expressad.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.core.express.d.a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.b.i;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkClickMiniCardView extends AnythinkH5EndCardView {

    /* renamed from: A, reason: collision with root package name */
    private static final float f22257A = 0.7f;

    /* renamed from: B, reason: collision with root package name */
    private boolean f22258B;

    public AnythinkClickMiniCardView(Context context) {
        super(context);
        this.f22258B = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        d dVar = this.f22229b;
        if (dVar != null) {
            d.c N8 = dVar.N();
            r1 = N8 != null ? N8.d() : null;
            if (!TextUtils.isEmpty(r1) && r1.contains(".zip")) {
                String b9 = i.a().b(r1);
                if (!TextUtils.isEmpty(b9)) {
                    return b9;
                }
            }
        }
        return r1;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final void e() {
        super.e();
        if (this.f22233f) {
            setBackgroundResource(findColor("anythink_reward_minicard_bg"));
            a(this.f22323p);
            setClickable(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f22233f) {
            a(this.f22323p);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i, int i4) {
        View findViewById = ((Activity) this.f22228a).getWindow().findViewById(R.id.content);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i <= 0 || i4 <= 0 || i > width || i4 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f22323p.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i4;
        this.f22323p.setLayoutParams(layoutParams);
    }

    public void setAnythinkClickMiniCardViewClickable(boolean z6) {
        setClickable(z6);
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i, int i4, int i6, int i9) {
        this.f22258B = true;
        resizeMiniCard(i6, i9);
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v.b(getContext(), i));
            gradientDrawable.setColor(-1);
            this.f22326s.setBackground(gradientDrawable);
            this.f22326s.setClipToOutline(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f22326s;
        if (windVaneWebView != null) {
            windVaneWebView.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str = "";
                    try {
                        try {
                            AnythinkClickMiniCardView.this.f22326s.getLocationOnScreen(new int[2]);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", v.a(t.b().g(), r2[0]));
                            jSONObject.put("startY", v.a(t.b().g(), r2[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        h.a();
                        a.a((WebView) AnythinkClickMiniCardView.this.f22326s, "webviewshow", encodeToString);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            });
        }
    }

    public AnythinkClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22258B = false;
    }

    private void a(View view) {
        int f2 = v.f(this.f22228a);
        int e9 = v.e(this.f22228a);
        int i = (int) ((f2 * f22257A) + 0.5f);
        int i4 = (int) ((e9 * f22257A) + 0.5f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i4;
        view.setLayoutParams(layoutParams);
    }
}
