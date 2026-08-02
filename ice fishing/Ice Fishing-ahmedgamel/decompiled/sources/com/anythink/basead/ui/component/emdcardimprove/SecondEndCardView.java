package com.anythink.basead.ui.component.emdcardimprove;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.ui.ScanningAnimButton;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.a.b;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.g;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class SecondEndCardView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    RelativeLayout f11527a;

    /* renamed from: b, reason: collision with root package name */
    RoundImageView f11528b;

    /* renamed from: c, reason: collision with root package name */
    ImageView f11529c;

    /* renamed from: d, reason: collision with root package name */
    TextView f11530d;

    /* renamed from: e, reason: collision with root package name */
    TextView f11531e;

    /* renamed from: f, reason: collision with root package name */
    ScanningAnimButton f11532f;

    /* renamed from: g, reason: collision with root package name */
    b.a f11533g;

    /* renamed from: h, reason: collision with root package name */
    ObjectAnimator f11534h;

    public SecondEndCardView(Context context) {
        this(context, null);
    }

    public void a() {
        LayoutInflater.from(getContext()).inflate(c(), this);
        this.f11527a = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_second_ec_container", "id"));
        this.f11528b = (RoundImageView) findViewById(q.a(getContext(), "myoffer_second_ec_ad_icon", "id"));
        this.f11529c = (ImageView) findViewById(q.a(getContext(), "myoffer_second_ec_ad_poster", "id"));
        if (m.f(getContext()) == 2) {
            this.f11528b.setRadiusInDip(18);
        } else {
            this.f11528b.setRadiusInDip(24);
        }
        this.f11528b.setNeedRadiu(true);
        this.f11530d = (TextView) findViewById(q.a(getContext(), "myoffer_second_ec_ad_title", "id"));
        this.f11531e = (TextView) findViewById(q.a(getContext(), "myoffer_second_ec_ad_desc", "id"));
        this.f11532f = (ScanningAnimButton) findViewById(q.a(getContext(), "myoffer_second_ec_cta", "id"));
        b();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.2f, 1.0f);
        this.f11534h = ofFloat;
        ofFloat.setDuration(500L);
        if (this.f11529c != null) {
            String a9 = g.a().a(b.d.f12916p);
            if (TextUtils.isEmpty(a9)) {
                return;
            }
            k.j().a(new e(3, a9), new b.a() { // from class: com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView.1
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    ImageView imageView = SecondEndCardView.this.f11529c;
                    if (imageView != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        }
    }

    public void addApkComplianceElements(boolean z6) {
        RelativeLayout relativeLayout;
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_include_4_element", "layout"), (ViewGroup) null);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (z6 || (relativeLayout = this.f11527a) == null) {
            addView(inflate, layoutParams);
        } else {
            relativeLayout.addView(inflate, layoutParams);
        }
    }

    public void addCloseView(View view, ViewGroup.LayoutParams layoutParams) {
        RelativeLayout relativeLayout = this.f11527a;
        if (relativeLayout != null) {
            relativeLayout.addView(view, layoutParams);
        } else {
            addView(view, layoutParams);
        }
    }

    public void b() {
        ScanningAnimButton scanningAnimButton = this.f11532f;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView.2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar = SecondEndCardView.this.f11533g;
                    if (aVar != null) {
                        aVar.a(15, 36);
                    }
                }
            });
        }
        RelativeLayout relativeLayout = this.f11527a;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView.3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.a aVar = SecondEndCardView.this.f11533g;
                    if (aVar != null) {
                        aVar.a(15, 37);
                    }
                }
            });
        }
        setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.a aVar = SecondEndCardView.this.f11533g;
                if (aVar != null) {
                    aVar.a(15, 38);
                }
            }
        });
    }

    public int c() {
        return q.a(getContext(), "myoffer_endcard_improve_second_endcard", "layout");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f11534h;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f11534h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void setAdDesc(String str) {
        if (this.f11531e == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f11531e.setText(str);
    }

    public void setAdIcon(final String str) {
        if (this.f11528b == null || TextUtils.isEmpty(str)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f11528b.getLayoutParams();
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, str), layoutParams.width, layoutParams.height, new b.a() { // from class: com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView.5
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str2, String str3) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str2, Bitmap bitmap) {
                RoundImageView roundImageView;
                if (!TextUtils.equals(str2, str) || (roundImageView = SecondEndCardView.this.f11528b) == null) {
                    return;
                }
                roundImageView.setImageBitmap(bitmap);
            }
        });
    }

    public void setAdPoster(final String str) {
        if (this.f11529c == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, str), new b.a() { // from class: com.anythink.basead.ui.component.emdcardimprove.SecondEndCardView.6
            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str2, String str3) {
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str2, Bitmap bitmap) {
                ImageView imageView;
                if (!TextUtils.equals(str2, str) || (imageView = SecondEndCardView.this.f11529c) == null) {
                    return;
                }
                imageView.setImageBitmap(bitmap);
            }
        });
    }

    public void setAdTitle(String str) {
        if (this.f11530d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f11530d.setText(str);
    }

    public void setCTAText(String str) {
        if (this.f11532f == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f11532f.setText(str);
    }

    public void setSecondECClickListener(b.a aVar) {
        this.f11533g = aVar;
    }

    public SecondEndCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SecondEndCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
