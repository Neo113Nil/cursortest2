package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.WrapRoundImageView;
import com.anythink.basead.ui.animplayerview.scale.AlbumScaleAnimatorView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import java.util.List;

/* loaded from: classes.dex */
public class AlbumScaleAnimPlayerView extends BaseMainAnimPlayerView {

    /* renamed from: A, reason: collision with root package name */
    private boolean f11217A;

    /* renamed from: B, reason: collision with root package name */
    private List<Bitmap> f11218B;

    /* renamed from: C, reason: collision with root package name */
    private Paint f11219C;

    /* renamed from: h, reason: collision with root package name */
    private c f11220h;

    /* renamed from: com.anythink.basead.ui.animplayerview.AlbumScaleAnimPlayerView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {
        public AnonymousClass1() {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
            AlbumScaleAnimPlayerView.this.a(g.a(g.f6966l, g.f6950T));
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, AlbumScaleAnimPlayerView.this.f11227e)) {
                if (AlbumScaleAnimPlayerView.this.f11220h == null) {
                    AlbumScaleAnimPlayerView.this.f11220h = new AlbumScaleAnimatorView(AlbumScaleAnimPlayerView.this.getContext().getApplicationContext());
                    AlbumScaleAnimPlayerView.this.f11220h.setBitmapResources(AlbumScaleAnimPlayerView.this.f11218B);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(13);
                    AlbumScaleAnimPlayerView albumScaleAnimPlayerView = AlbumScaleAnimPlayerView.this;
                    albumScaleAnimPlayerView.addView((View) albumScaleAnimPlayerView.f11220h, layoutParams);
                    AlbumScaleAnimPlayerView.this.f11220h.addMainView(bitmap, new WrapRoundImageView[0]);
                }
                if (AlbumScaleAnimPlayerView.this.f11217A) {
                    AlbumScaleAnimPlayerView.d(AlbumScaleAnimPlayerView.this);
                    if (AlbumScaleAnimPlayerView.this.f11220h != null) {
                        AlbumScaleAnimPlayerView.this.f11220h.start();
                    }
                }
            }
        }
    }

    public AlbumScaleAnimPlayerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean d(AlbumScaleAnimPlayerView albumScaleAnimPlayerView) {
        albumScaleAnimPlayerView.f11217A = false;
        return false;
    }

    private void i() {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), new int[]{Color.parseColor("#DF4B32"), Color.parseColor("#800915")}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.f11219C = paint;
        paint.setShader(linearGradient);
    }

    private void j() {
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f11227e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass1());
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final int e() {
        return 4000;
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView, com.anythink.basead.ui.animplayerview.BaseAnimPlayerView, com.anythink.basead.ui.animplayerview.BasePlayerView
    public void init(w wVar, x xVar, boolean z6, List<Bitmap> list, com.anythink.basead.j.e eVar) {
        this.f11218B = list;
        super.init(wVar, xVar, z6, list, eVar);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f11219C != null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f11219C);
        }
    }

    public AlbumScaleAnimPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void b() {
        c cVar = this.f11220h;
        if (cVar != null) {
            cVar.pause();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void c() {
        c cVar = this.f11220h;
        if (cVar != null) {
            cVar.stop();
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void d() {
        c cVar = this.f11220h;
        if (cVar != null) {
            cVar.release();
            this.f11220h = null;
        }
    }

    public AlbumScaleAnimPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseAnimPlayerView
    public final void a() {
        c cVar = this.f11220h;
        if (cVar != null) {
            cVar.start();
        } else {
            this.f11217A = true;
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.BaseMainAnimPlayerView
    public final void a(Context context) {
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), new int[]{Color.parseColor("#DF4B32"), Color.parseColor("#800915")}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.f11219C = paint;
        paint.setShader(linearGradient);
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f11227e), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new AnonymousClass1());
    }
}
