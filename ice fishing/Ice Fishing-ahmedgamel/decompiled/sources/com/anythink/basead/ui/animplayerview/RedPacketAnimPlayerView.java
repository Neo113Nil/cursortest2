package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.j.e;
import com.anythink.basead.ui.animplayerview.redpacket.RedPacketAnimatorView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes.dex */
public class RedPacketAnimPlayerView extends BaseMainAnimPlayerView {

    /* renamed from: A, reason: collision with root package name */
    private RedPacketAnimatorView f11262A;

    /* renamed from: h, reason: collision with root package name */
    private List<Bitmap> f11263h;

    public RedPacketAnimPlayerView(Context context) {
        this(context, null);
    }

    private ViewGroup.LayoutParams i() {
        if (!q.c(getContext())) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().heightPixels, -1);
        layoutParams.addRule(13);
        return layoutParams;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView
    public final void a(Context context) {
        ViewGroup.LayoutParams layoutParams;
        super.a(context);
        RedPacketAnimatorView redPacketAnimatorView = new RedPacketAnimatorView(context);
        this.f11262A = redPacketAnimatorView;
        if (q.c(getContext())) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(getContext().getResources().getDisplayMetrics().heightPixels, -1);
            layoutParams2.addRule(13);
            layoutParams = layoutParams2;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        redPacketAnimatorView.setLayoutParams(layoutParams);
        this.f11262A.setBitmapResources(this.f11263h);
        addView(this.f11262A);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void b() {
        RedPacketAnimatorView redPacketAnimatorView = this.f11262A;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.pause();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void c() {
        RedPacketAnimatorView redPacketAnimatorView = this.f11262A;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.stop();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void d() {
        RedPacketAnimatorView redPacketAnimatorView = this.f11262A;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.release();
            this.f11262A = null;
        }
        List<Bitmap> list = this.f11263h;
        if (list != null) {
            for (Bitmap bitmap : list) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView, com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z6, List<Bitmap> list, e eVar) {
        this.f11263h = list;
        super.init(wVar, xVar, z6, list, eVar);
    }

    public RedPacketAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RedPacketAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void a() {
        RedPacketAnimatorView redPacketAnimatorView = this.f11262A;
        if (redPacketAnimatorView != null) {
            redPacketAnimatorView.start();
        }
    }
}
