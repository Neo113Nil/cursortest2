package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.v.h;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseMainAnimPlayerView extends BaseAnimPlayerView {

    /* renamed from: com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WrapRoundImageView f10452a;

        public AnonymousClass1(WrapRoundImageView wrapRoundImageView) {
            this.f10452a = wrapRoundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            BaseMainAnimPlayerView.this.a(g.a(g.f6180l, g.f6164T));
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, BaseMainAnimPlayerView.this.f10441e)) {
                WrapRoundImageView wrapRoundImageView = this.f10452a;
                if (wrapRoundImageView != null) {
                    wrapRoundImageView.post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass1.this.f10452a.setBitmapAndResize(bitmap, BaseMainAnimPlayerView.this.getWidth(), BaseMainAnimPlayerView.this.getHeight());
                        }
                    });
                }
                BaseMainAnimPlayerView baseMainAnimPlayerView = BaseMainAnimPlayerView.this;
                if (baseMainAnimPlayerView.f10442f == null || bitmap == null) {
                    return;
                }
                h.a(baseMainAnimPlayerView.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView.1.2
                    @Override // com.anythink.core.common.v.h.a
                    public final void a() {
                    }

                    @Override // com.anythink.core.common.v.h.a
                    public final void a(Bitmap bitmap2) {
                        BaseMainAnimPlayerView.this.f10442f.setImageBitmap(bitmap2);
                    }
                });
            }
        }
    }

    public BaseMainAnimPlayerView(Context context) {
        this(context, null);
    }

    public void a(Context context) {
        RecycleImageView recycleImageView = new RecycleImageView(context);
        this.f10442f = recycleImageView;
        recycleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.f10442f, -1, -1);
        this.f10443g = new WrapRoundImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f10443g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        addView(this.f10443g, layoutParams);
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10441e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass1(this.f10443g));
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z3, List<Bitmap> list, com.anythink.basead.j.e eVar) {
        super.init(wVar, xVar, z3, list, eVar);
        a(getContext().getApplicationContext());
    }

    public BaseMainAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMainAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a(WrapRoundImageView wrapRoundImageView) {
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f10441e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass1(wrapRoundImageView));
    }
}
