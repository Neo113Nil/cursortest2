package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class FullScreenHeaderPanelView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    protected w f10191a;

    /* renamed from: b, reason: collision with root package name */
    protected x f10192b;

    /* renamed from: c, reason: collision with root package name */
    protected y f10193c;

    /* renamed from: d, reason: collision with root package name */
    protected a f10194d;

    /* renamed from: e, reason: collision with root package name */
    private View f10195e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10196f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f10197g;

    /* renamed from: h, reason: collision with root package name */
    private ScanningAnimButton f10198h;
    private RoundImageView i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f10199j;

    /* renamed from: com.anythink.basead.ui.FullScreenHeaderPanelView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10201a;

        public AnonymousClass2(String str) {
            this.f10201a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10201a)) {
                FullScreenHeaderPanelView.this.i.setImageBitmap(bitmap);
            }
        }
    }

    public interface a {
        void a();
    }

    public FullScreenHeaderPanelView(Context context) {
        super(context);
        this.f10199j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10193c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10194d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10198h == null || view != FullScreenHeaderPanelView.this.f10198h || (aVar = FullScreenHeaderPanelView.this.f10194d) == null) {
                        return;
                    }
                    aVar.a();
                }
            }
        };
        a();
    }

    public void initSetting(w wVar, x xVar, a aVar) {
        this.f10191a = wVar;
        this.f10192b = xVar;
        this.f10193c = xVar.f14325o;
        this.f10194d = aVar;
        String z8 = wVar.z();
        if (TextUtils.isEmpty(z8)) {
            z8 = this.f10191a.B();
        }
        if (TextUtils.isEmpty(z8)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            int a9 = q.a(getContext(), 42.0f);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, z8), a9, a9, new AnonymousClass2(z8));
        }
        if (this.f10198h != null) {
            if (TextUtils.isEmpty(this.f10191a.D())) {
                this.f10198h.setText(com.anythink.basead.b.e.a(getContext(), this.f10191a));
            } else {
                this.f10198h.setText(this.f10191a.D());
            }
            this.f10198h.startAnimation(this.f10192b.f14325o.aH());
        }
        if (TextUtils.isEmpty(this.f10191a.x())) {
            this.f10196f.setVisibility(8);
        } else {
            this.f10196f.setVisibility(0);
            this.f10196f.setText(this.f10191a.x());
        }
        if (TextUtils.isEmpty(this.f10191a.y())) {
            this.f10197g.setVisibility(8);
        } else {
            this.f10197g.setVisibility(0);
            this.f10197g.setText(this.f10191a.y());
        }
    }

    private void a() {
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_full_screen_top_panel", "layout"), (ViewGroup) this, true);
        this.f10195e = inflate;
        this.i = (RoundImageView) inflate.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_icon", "id"));
        this.f10198h = (ScanningAnimButton) this.f10195e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_cta", "id"));
        this.f10196f = (TextView) this.f10195e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_title", "id"));
        this.f10197g = (TextView) this.f10195e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_desc", "id"));
        RoundImageView roundImageView = this.i;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.i.setRadiusInDip(12);
        }
        ScanningAnimButton scanningAnimButton = this.f10198h;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(this.f10199j);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(q.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        setOnClickListener(this.f10199j);
    }

    private void b() {
        String z8 = this.f10191a.z();
        if (TextUtils.isEmpty(z8)) {
            z8 = this.f10191a.B();
        }
        if (TextUtils.isEmpty(z8)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            int a9 = q.a(getContext(), 42.0f);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, z8), a9, a9, new AnonymousClass2(z8));
        }
        if (this.f10198h != null) {
            if (TextUtils.isEmpty(this.f10191a.D())) {
                this.f10198h.setText(com.anythink.basead.b.e.a(getContext(), this.f10191a));
            } else {
                this.f10198h.setText(this.f10191a.D());
            }
            this.f10198h.startAnimation(this.f10192b.f14325o.aH());
        }
        if (TextUtils.isEmpty(this.f10191a.x())) {
            this.f10196f.setVisibility(8);
        } else {
            this.f10196f.setVisibility(0);
            this.f10196f.setText(this.f10191a.x());
        }
        if (TextUtils.isEmpty(this.f10191a.y())) {
            this.f10197g.setVisibility(8);
        } else {
            this.f10197g.setVisibility(0);
            this.f10197g.setText(this.f10191a.y());
        }
    }

    public FullScreenHeaderPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10199j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10193c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10194d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10198h == null || view != FullScreenHeaderPanelView.this.f10198h || (aVar = FullScreenHeaderPanelView.this.f10194d) == null) {
                        return;
                    }
                    aVar.a();
                }
            }
        };
        a();
    }

    public FullScreenHeaderPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10199j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10193c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10194d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10198h == null || view != FullScreenHeaderPanelView.this.f10198h || (aVar = FullScreenHeaderPanelView.this.f10194d) == null) {
                        return;
                    }
                    aVar.a();
                }
            }
        };
        a();
    }
}
