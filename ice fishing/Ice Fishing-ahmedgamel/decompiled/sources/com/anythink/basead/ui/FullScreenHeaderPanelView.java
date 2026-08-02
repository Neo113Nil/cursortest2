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
    protected w f10820a;

    /* renamed from: b, reason: collision with root package name */
    protected x f10821b;

    /* renamed from: c, reason: collision with root package name */
    protected y f10822c;

    /* renamed from: d, reason: collision with root package name */
    protected a f10823d;

    /* renamed from: e, reason: collision with root package name */
    private View f10824e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f10825f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f10826g;

    /* renamed from: h, reason: collision with root package name */
    private ScanningAnimButton f10827h;
    private RoundImageView i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f10828j;

    /* renamed from: com.anythink.basead.ui.FullScreenHeaderPanelView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10830a;

        public AnonymousClass2(String str) {
            this.f10830a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10830a)) {
                FullScreenHeaderPanelView.this.i.setImageBitmap(bitmap);
            }
        }
    }

    public interface a {
        void a();
    }

    public FullScreenHeaderPanelView(Context context) {
        super(context);
        this.f10828j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10822c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10823d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10827h == null || view != FullScreenHeaderPanelView.this.f10827h || (aVar = FullScreenHeaderPanelView.this.f10823d) == null) {
                        return;
                    }
                    aVar.a();
                }
            }
        };
        a();
    }

    public void initSetting(w wVar, x xVar, a aVar) {
        this.f10820a = wVar;
        this.f10821b = xVar;
        this.f10822c = xVar.f14954o;
        this.f10823d = aVar;
        String z6 = wVar.z();
        if (TextUtils.isEmpty(z6)) {
            z6 = this.f10820a.B();
        }
        if (TextUtils.isEmpty(z6)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            int a9 = q.a(getContext(), 42.0f);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, z6), a9, a9, new AnonymousClass2(z6));
        }
        if (this.f10827h != null) {
            if (TextUtils.isEmpty(this.f10820a.D())) {
                this.f10827h.setText(com.anythink.basead.b.e.a(getContext(), this.f10820a));
            } else {
                this.f10827h.setText(this.f10820a.D());
            }
            this.f10827h.startAnimation(this.f10821b.f14954o.aH());
        }
        if (TextUtils.isEmpty(this.f10820a.x())) {
            this.f10825f.setVisibility(8);
        } else {
            this.f10825f.setVisibility(0);
            this.f10825f.setText(this.f10820a.x());
        }
        if (TextUtils.isEmpty(this.f10820a.y())) {
            this.f10826g.setVisibility(8);
        } else {
            this.f10826g.setVisibility(0);
            this.f10826g.setText(this.f10820a.y());
        }
    }

    private void a() {
        View inflate = LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_full_screen_top_panel", "layout"), (ViewGroup) this, true);
        this.f10824e = inflate;
        this.i = (RoundImageView) inflate.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_icon", "id"));
        this.f10827h = (ScanningAnimButton) this.f10824e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_cta", "id"));
        this.f10825f = (TextView) this.f10824e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_title", "id"));
        this.f10826g = (TextView) this.f10824e.findViewById(q.a(getContext(), "myoffer_full_screen_top_banner_desc", "id"));
        RoundImageView roundImageView = this.i;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.i.setRadiusInDip(12);
        }
        ScanningAnimButton scanningAnimButton = this.f10827h;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(this.f10828j);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(q.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        setOnClickListener(this.f10828j);
    }

    private void b() {
        String z6 = this.f10820a.z();
        if (TextUtils.isEmpty(z6)) {
            z6 = this.f10820a.B();
        }
        if (TextUtils.isEmpty(z6)) {
            this.i.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            int a9 = q.a(getContext(), 42.0f);
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, z6), a9, a9, new AnonymousClass2(z6));
        }
        if (this.f10827h != null) {
            if (TextUtils.isEmpty(this.f10820a.D())) {
                this.f10827h.setText(com.anythink.basead.b.e.a(getContext(), this.f10820a));
            } else {
                this.f10827h.setText(this.f10820a.D());
            }
            this.f10827h.startAnimation(this.f10821b.f14954o.aH());
        }
        if (TextUtils.isEmpty(this.f10820a.x())) {
            this.f10825f.setVisibility(8);
        } else {
            this.f10825f.setVisibility(0);
            this.f10825f.setText(this.f10820a.x());
        }
        if (TextUtils.isEmpty(this.f10820a.y())) {
            this.f10826g.setVisibility(8);
        } else {
            this.f10826g.setVisibility(0);
            this.f10826g.setText(this.f10820a.y());
        }
    }

    public FullScreenHeaderPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10828j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10822c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10823d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10827h == null || view != FullScreenHeaderPanelView.this.f10827h || (aVar = FullScreenHeaderPanelView.this.f10823d) == null) {
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
        this.f10828j = new View.OnClickListener() { // from class: com.anythink.basead.ui.FullScreenHeaderPanelView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar;
                y yVar = FullScreenHeaderPanelView.this.f10822c;
                if (yVar != null) {
                    if (yVar.J() != 1) {
                        a aVar2 = FullScreenHeaderPanelView.this.f10823d;
                        if (aVar2 != null) {
                            aVar2.a();
                            return;
                        }
                        return;
                    }
                    if (FullScreenHeaderPanelView.this.f10827h == null || view != FullScreenHeaderPanelView.this.f10827h || (aVar = FullScreenHeaderPanelView.this.f10823d) == null) {
                        return;
                    }
                    aVar.a();
                }
            }
        };
        a();
    }
}
