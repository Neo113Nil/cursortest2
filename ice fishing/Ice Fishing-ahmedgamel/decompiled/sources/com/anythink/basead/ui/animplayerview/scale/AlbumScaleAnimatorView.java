package com.anythink.basead.ui.animplayerview.scale;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.basead.ui.animplayerview.c;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes.dex */
public class AlbumScaleAnimatorView extends FrameLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    private List<Bitmap> f11330a;

    /* renamed from: b, reason: collision with root package name */
    private AlbumScaleMainView f11331b;

    /* renamed from: c, reason: collision with root package name */
    private BaseAlbumScaleItemView f11332c;

    /* renamed from: d, reason: collision with root package name */
    private BaseAlbumScaleItemView f11333d;

    /* renamed from: e, reason: collision with root package name */
    private BaseAlbumScaleItemView f11334e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11335f;

    public AlbumScaleAnimatorView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean a(AlbumScaleAnimatorView albumScaleAnimatorView) {
        albumScaleAnimatorView.f11335f = true;
        return true;
    }

    @Override // com.anythink.basead.ui.animplayerview.c
    public void addMainView(Bitmap bitmap, WrapRoundImageView... wrapRoundImageViewArr) {
        if (bitmap == null) {
            return;
        }
        AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
        this.f11331b = albumScaleMainView;
        boolean c9 = q.c(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c9 ? a(90) : a(42), c9 ? a(42) : a(90));
        layoutParams.gravity = 17;
        albumScaleMainView.setLayoutParams(layoutParams);
        addView(this.f11331b);
        this.f11331b.initView(bitmap, true);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView03 albumScaleItemView03 = new AlbumScaleItemView03(getContext());
        albumScaleItemView03.setBitmapResources(this.f11330a);
        albumScaleItemView03.setOrientation(q.c(getContext()));
        addView(albumScaleItemView03, layoutParams2);
        this.f11334e = albumScaleItemView03;
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView02 albumScaleItemView02 = new AlbumScaleItemView02(getContext());
        albumScaleItemView02.setOrientation(q.c(getContext()));
        albumScaleItemView02.setBitmapResources(this.f11330a);
        addView(albumScaleItemView02, layoutParams3);
        this.f11333d = albumScaleItemView02;
        ViewGroup.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView01 albumScaleItemView01 = new AlbumScaleItemView01(getContext());
        albumScaleItemView01.setBitmapResources(this.f11330a);
        albumScaleItemView01.setOrientation(q.c(getContext()));
        addView(albumScaleItemView01, layoutParams4);
        this.f11332c = albumScaleItemView01;
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void pause() {
        AlbumScaleMainView albumScaleMainView = this.f11331b;
        if (albumScaleMainView != null) {
            albumScaleMainView.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f11332c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f11333d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.pause();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f11334e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.pause();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.c
    public void release() {
        List<Bitmap> list = this.f11330a;
        if (list != null) {
            for (Bitmap bitmap : list) {
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            this.f11330a.clear();
        }
        AlbumScaleMainView albumScaleMainView = this.f11331b;
        if (albumScaleMainView != null) {
            albumScaleMainView.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f11332c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f11333d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.release();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f11334e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.release();
        }
        removeAllViews();
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void resume() {
        AlbumScaleMainView albumScaleMainView = this.f11331b;
        if (albumScaleMainView != null) {
            albumScaleMainView.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f11332c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f11333d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.resume();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f11334e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.resume();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
        this.f11330a = list;
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.f11331b == null || this.f11332c == null || this.f11333d == null || this.f11334e == null) {
            return;
        }
        if (this.f11335f) {
            resume();
        } else {
            post(new Runnable() { // from class: com.anythink.basead.ui.animplayerview.scale.AlbumScaleAnimatorView.1
                @Override // java.lang.Runnable
                public final void run() {
                    AlbumScaleAnimatorView.a(AlbumScaleAnimatorView.this);
                    AlbumScaleAnimatorView.this.f11332c.start();
                    AlbumScaleAnimatorView.this.f11333d.setStartDelay(200L);
                    AlbumScaleAnimatorView.this.f11333d.start();
                    AlbumScaleAnimatorView.this.f11331b.setStartDelay(300L);
                    AlbumScaleAnimatorView.this.f11331b.start();
                    AlbumScaleAnimatorView.this.f11334e.setMainViewScale(AlbumScaleAnimatorView.this.f11331b.getMainViewScale());
                    AlbumScaleAnimatorView.this.f11334e.setStartDelay(300L);
                    AlbumScaleAnimatorView.this.f11334e.start();
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.b
    public void stop() {
        AlbumScaleMainView albumScaleMainView = this.f11331b;
        if (albumScaleMainView != null) {
            albumScaleMainView.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView = this.f11332c;
        if (baseAlbumScaleItemView != null) {
            baseAlbumScaleItemView.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView2 = this.f11333d;
        if (baseAlbumScaleItemView2 != null) {
            baseAlbumScaleItemView2.stop();
        }
        BaseAlbumScaleItemView baseAlbumScaleItemView3 = this.f11334e;
        if (baseAlbumScaleItemView3 != null) {
            baseAlbumScaleItemView3.stop();
        }
        this.f11335f = false;
    }

    public AlbumScaleAnimatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean a() {
        return q.c(getContext());
    }

    private void b() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView01 albumScaleItemView01 = new AlbumScaleItemView01(getContext());
        albumScaleItemView01.setBitmapResources(this.f11330a);
        albumScaleItemView01.setOrientation(q.c(getContext()));
        addView(albumScaleItemView01, layoutParams);
        this.f11332c = albumScaleItemView01;
    }

    private void c() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView02 albumScaleItemView02 = new AlbumScaleItemView02(getContext());
        albumScaleItemView02.setOrientation(q.c(getContext()));
        albumScaleItemView02.setBitmapResources(this.f11330a);
        addView(albumScaleItemView02, layoutParams);
        this.f11333d = albumScaleItemView02;
    }

    private void d() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        AlbumScaleItemView03 albumScaleItemView03 = new AlbumScaleItemView03(getContext());
        albumScaleItemView03.setBitmapResources(this.f11330a);
        albumScaleItemView03.setOrientation(q.c(getContext()));
        addView(albumScaleItemView03, layoutParams);
        this.f11334e = albumScaleItemView03;
    }

    public AlbumScaleAnimatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11335f = false;
    }

    private void a(Bitmap bitmap) {
        AlbumScaleMainView albumScaleMainView = new AlbumScaleMainView(getContext());
        this.f11331b = albumScaleMainView;
        boolean c9 = q.c(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c9 ? a(90) : a(42), c9 ? a(42) : a(90));
        layoutParams.gravity = 17;
        albumScaleMainView.setLayoutParams(layoutParams);
        addView(this.f11331b);
        this.f11331b.initView(bitmap, true);
    }

    private ViewGroup.LayoutParams a(boolean z6) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z6 ? a(90) : a(42), z6 ? a(42) : a(90));
        layoutParams.gravity = 17;
        return layoutParams;
    }

    private int a(int i) {
        return q.a(getContext(), i);
    }
}
