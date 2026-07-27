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
    ImageView f10454a;

    /* renamed from: b, reason: collision with root package name */
    ImageView f10455b;

    /* renamed from: c, reason: collision with root package name */
    private int f10456c;

    /* renamed from: d, reason: collision with root package name */
    private int f10457d;

    /* renamed from: e, reason: collision with root package name */
    private int f10458e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f10459f;

    /* renamed from: com.anythink.basead.ui.SimpleMediaATView$1, reason: invalid class name */
    public class AnonymousClass1 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10460a;

        public AnonymousClass1(String str) {
            this.f10460a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10460a)) {
                SimpleMediaATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimpleMediaATView.this.f10459f = bitmap;
                        SimpleMediaATView.this.a(bitmap);
                        SimpleMediaATView.this.f10454a.setImageBitmap(bitmap);
                        SimpleMediaATView.this.f10454a.setVisibility(0);
                        h.a(SimpleMediaATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1.1
                            @Override // com.anythink.core.common.v.h.a
                            public final void a() {
                            }

                            @Override // com.anythink.core.common.v.h.a
                            public final void a(Bitmap bitmap2) {
                                SimpleMediaATView.this.f10455b.setImageBitmap(bitmap2);
                                SimpleMediaATView.this.f10455b.setVisibility(0);
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
        this.f10458e = max;
        this.f10456c = max;
        this.f10457d = max;
        this.f10455b = (ImageView) findViewById(q.a(getContext(), "myoffer_simple_background", "id"));
        ImageView imageView = (ImageView) findViewById(q.a(getContext(), "myoffer_simple_main_image", "id"));
        this.f10454a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String B8 = wVar.B();
        try {
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, B8), new AnonymousClass1(B8));
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i4) {
        boolean z8;
        super.onMeasure(i, i4);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i4);
        Bitmap bitmap = this.f10459f;
        if (bitmap == null) {
            if (size != 0 && size < this.f10456c) {
                this.f10456c = size;
            }
            if (size2 == 0 || size2 >= this.f10457d) {
                return;
            }
            this.f10457d = size2;
            return;
        }
        boolean z9 = true;
        if (size == 0 || size >= this.f10456c) {
            z8 = false;
        } else {
            this.f10456c = size;
            z8 = true;
        }
        if (size2 == 0 || size2 >= this.f10457d) {
            z9 = z8;
        } else {
            this.f10457d = size2;
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
        boolean z8;
        int i;
        Bitmap bitmap;
        super.setLayoutParams(layoutParams);
        int i4 = layoutParams.width;
        boolean z9 = true;
        if (i4 == -1 || i4 == -2) {
            this.f10456c = this.f10458e;
        } else if (this.f10456c != i4) {
            this.f10456c = i4;
            z8 = true;
            i = layoutParams.height;
            if (i != -1 || i == -2) {
                this.f10457d = this.f10458e;
            } else if (this.f10457d != i) {
                this.f10457d = i;
                bitmap = this.f10459f;
                if (bitmap == null || !z9) {
                    return;
                }
                a(bitmap);
                return;
            }
            z9 = z8;
            bitmap = this.f10459f;
            if (bitmap == null) {
                return;
            } else {
                return;
            }
        }
        z8 = false;
        i = layoutParams.height;
        if (i != -1) {
        }
        this.f10457d = this.f10458e;
        z9 = z8;
        bitmap = this.f10459f;
        if (bitmap == null) {
        }
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        int[] a9 = am.a(this.f10456c, this.f10457d, bitmap.getWidth() / bitmap.getHeight());
        ViewGroup.LayoutParams layoutParams = this.f10454a.getLayoutParams();
        layoutParams.width = a9[0];
        layoutParams.height = a9[1];
        this.f10454a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            int i = layoutParams2.width == -2 ? a9[0] : this.f10456c;
            int i4 = layoutParams2.height == -2 ? a9[1] : this.f10457d;
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                View childAt = getChildAt(i9);
                if (!childAt.equals(this.f10454a)) {
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
