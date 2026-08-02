package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class SimpleMediaATView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    ImageView f11083a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f11084b;

    /* renamed from: c, reason: collision with root package name */
    private int f11085c;

    /* renamed from: d, reason: collision with root package name */
    private int f11086d;

    /* renamed from: e, reason: collision with root package name */
    private int f11087e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f11088f;

    /* renamed from: com.anythink.basead.ui.SimpleMediaATView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f11089a;

        public AnonymousClass1(String str) {
            this.f11089a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, this.f11089a)) {
                SimpleMediaATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimpleMediaATView.this.f11088f = bitmap;
                        SimpleMediaATView.this.a(bitmap);
                        SimpleMediaATView.this.f11083a.setImageBitmap(bitmap);
                        SimpleMediaATView.this.f11083a.setVisibility(0);
                        h.a(SimpleMediaATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1.1
                            @Override // com.anythink.core.common.v.h.a
                            public final void a() {
                            }

                            @Override // com.anythink.core.common.v.h.a
                            public final void a(Bitmap bitmap2) {
                                SimpleMediaATView.this.f11084b.setImageBitmap(bitmap2);
                                SimpleMediaATView.this.f11084b.setVisibility(0);
                            }
                        });
                    }
                });
            }
        }
    }

    public SimpleMediaATView(Context context) {
        this(context, null);
    }

    public void initView(w wVar) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_simple_media_ad_view", "layout"), this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f11087e = max;
        this.f11085c = max;
        this.f11086d = max;
        this.f11084b = (ImageView) findViewById(q.a(getContext(), "myoffer_simple_background", "id"));
        ImageView imageView = (ImageView) findViewById(q.a(getContext(), "myoffer_simple_main_image", "id"));
        this.f11083a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String B3 = wVar.B();
        try {
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, B3), new AnonymousClass1(B3));
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        boolean z6;
        super.onMeasure(i, i4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i4);
        Bitmap bitmap = this.f11088f;
        if (bitmap == null) {
            if (size != 0 && size < this.f11085c) {
                this.f11085c = size;
            }
            if (size2 == 0 || size2 >= this.f11086d) {
                return;
            }
            this.f11086d = size2;
            return;
        }
        boolean z9 = true;
        if (size == 0 || size >= this.f11085c) {
            z6 = false;
        } else {
            this.f11085c = size;
            z6 = true;
        }
        if (size2 == 0 || size2 >= this.f11086d) {
            z9 = z6;
        } else {
            this.f11086d = size2;
        }
        if (z9) {
            a(bitmap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z6;
        int i;
        Bitmap bitmap;
        super.setLayoutParams(layoutParams);
        int i4 = layoutParams.width;
        boolean z9 = true;
        if (i4 == -1 || i4 == -2) {
            this.f11085c = this.f11087e;
        } else if (this.f11085c != i4) {
            this.f11085c = i4;
            z6 = true;
            i = layoutParams.height;
            if (i != -1 || i == -2) {
                this.f11086d = this.f11087e;
            } else if (this.f11086d != i) {
                this.f11086d = i;
                bitmap = this.f11088f;
                if (bitmap == null || !z9) {
                    return;
                }
                a(bitmap);
                return;
            }
            z9 = z6;
            bitmap = this.f11088f;
            if (bitmap == null) {
                return;
            } else {
                return;
            }
        }
        z6 = false;
        i = layoutParams.height;
        if (i != -1) {
        }
        this.f11086d = this.f11087e;
        z9 = z6;
        bitmap = this.f11088f;
        if (bitmap == null) {
        }
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        int[] a9 = am.a(this.f11085c, this.f11086d, bitmap.getWidth() / bitmap.getHeight());
        ViewGroup.LayoutParams layoutParams = this.f11083a.getLayoutParams();
        layoutParams.width = a9[0];
        layoutParams.height = a9[1];
        this.f11083a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            int i = layoutParams2.width == -2 ? a9[0] : this.f11085c;
            int i4 = layoutParams2.height == -2 ? a9[1] : this.f11086d;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (!childAt.equals(this.f11083a)) {
                    ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                    layoutParams3.width = i;
                    childAt.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                    layoutParams4.height = i4;
                    childAt.setLayoutParams(layoutParams4);
                }
            }
        }
    }

    private static void b(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private static void a(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }
}
