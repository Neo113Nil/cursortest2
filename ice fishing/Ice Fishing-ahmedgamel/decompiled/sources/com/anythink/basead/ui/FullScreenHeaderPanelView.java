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
    protected w f10034a;

    /* renamed from: b, reason: collision with root package name */
    protected x f10035b;

    /* renamed from: c, reason: collision with root package name */
    protected y f10036c;

    /* renamed from: d, reason: collision with root package name */
    protected a f10037d;

    /* renamed from: e, reason: collision with root package name */
    private View f10038e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10039f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f10040g;

    /* renamed from: h, reason: collision with root package name */
    private ScanningAnimButton f10041h;
    private RoundImageView i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f10042j;

    /* renamed from: com.anythink.basead.ui.FullScreenHeaderPanelView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10044a;

        public AnonymousClass2(String str) {
            this.f10044a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10044a)) {
                FullScreenHeaderPanelView.this.i.setImageBitmap(bitmap);
            }
        }
    }

    public interface a {
        void a();
    }

    public FullScreenHeaderPanelView(Context context) {
        super(context);
        this.f10042j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10036c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10037d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10041h == null || view != FullScreenHeaderPanelView.this.f10041h || (aVar = FullScreenHeaderPanelView.this.f10037d) == null) {
                        return;
                    }
                    aVar.a();
                }
            }
        };
        a();
    }

    public void initSetting(w wVar, x xVar, a aVar) {
        this.f10034a = wVar;
        this.f10035b = xVar;
        this.f10036c = xVar.f14168o;
        this.f10037d = aVar;
        String z3 = wVar.z();
        if (TextUtils.isEmpty(z3)) {
            z3 = this.f10034a.B();
        }
        if (TextUtils.isEmpty(z3)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            int a9 = q.a(getContext(), 42.0f);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, z3), a9, a9, new AnonymousClass2(z3));
        }
        if (this.f10041h != null) {
            if (TextUtils.isEmpty(this.f10034a.D())) {
                this.f10041h.setText(com.anythink.basead.b.e.a(getContext(), this.f10034a));
            } else {
                this.f10041h.setText(this.f10034a.D());
            }
            this.f10041h.startAnimation(this.f10035b.f14168o.aH());
        }
        if (TextUtils.isEmpty(this.f10034a.x())) {
            this.f10039f.setVisibility(8);
        } else {
            this.f10039f.setVisibility(0);
            this.f10039f.setText(this.f10034a.x());
        }
        if (TextUtils.isEmpty(this.f10034a.y())) {
            this.f10040g.setVisibility(8);
        } else {
            this.f10040g.setVisibility(0);
            this.f10040g.setText(this.f10034a.y());
        }
    }

    private void a() {
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_full_screen_top_panel", "layout"), (ViewGroup) this, true);
        this.f10038e = inflate;
        this.i = (RoundImageView) inflate.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_icon", "id"));
        this.f10041h = (ScanningAnimButton) this.f10038e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_cta", "id"));
        this.f10039f = (TextView) this.f10038e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_title", "id"));
        this.f10040g = (TextView) this.f10038e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_desc", "id"));
        RoundImageView roundImageView = this.i;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.i.setRadiusInDip(12);
        }
        ScanningAnimButton scanningAnimButton = this.f10041h;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(this.f10042j);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(q.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        setOnClickListener(this.f10042j);
    }

    private void b() {
        String z3 = this.f10034a.z();
        if (TextUtils.isEmpty(z3)) {
            z3 = this.f10034a.B();
        }
        if (TextUtils.isEmpty(z3)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            int a9 = q.a(getContext(), 42.0f);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, z3), a9, a9, new AnonymousClass2(z3));
        }
        if (this.f10041h != null) {
            if (TextUtils.isEmpty(this.f10034a.D())) {
                this.f10041h.setText(com.anythink.basead.b.e.a(getContext(), this.f10034a));
            } else {
                this.f10041h.setText(this.f10034a.D());
            }
            this.f10041h.startAnimation(this.f10035b.f14168o.aH());
        }
        if (TextUtils.isEmpty(this.f10034a.x())) {
            this.f10039f.setVisibility(8);
        } else {
            this.f10039f.setVisibility(0);
            this.f10039f.setText(this.f10034a.x());
        }
        if (TextUtils.isEmpty(this.f10034a.y())) {
            this.f10040g.setVisibility(8);
        } else {
            this.f10040g.setVisibility(0);
            this.f10040g.setText(this.f10034a.y());
        }
    }

    public FullScreenHeaderPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10042j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10036c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10037d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10041h == null || view != FullScreenHeaderPanelView.this.f10041h || (aVar = FullScreenHeaderPanelView.this.f10037d) == null) {
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
        this.f10042j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10036c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10037d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10041h == null || view != FullScreenHeaderPanelView.this.f10041h || (aVar = FullScreenHeaderPanelView.this.f10037d) == null) {
                        return;
                    }
                    aVar.a();
                }
            }
        };
        a();
    }
}
