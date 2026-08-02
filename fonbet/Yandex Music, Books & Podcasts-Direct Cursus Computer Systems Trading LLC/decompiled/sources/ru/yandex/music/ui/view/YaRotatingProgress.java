package ru.yandex.music.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.i7w;
import defpackage.v7w;
import defpackage.zdn;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.YaRotatingProgress;

/* loaded from: classes6.dex */
public class YaRotatingProgress extends View {
    public final i7w a;
    public long b;
    public boolean c;
    public boolean d;
    public final v7w e;
    public final v7w f;

    /* JADX WARN: Type inference failed for: r1v0, types: [v7w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v7w] */
    public YaRotatingProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -1L;
        final int i2 = 0;
        this.c = false;
        this.d = false;
        this.e = new Runnable(this) { // from class: v7w
            public final /* synthetic */ YaRotatingProgress b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                YaRotatingProgress yaRotatingProgress = this.b;
                switch (i3) {
                    case 0:
                        if (yaRotatingProgress.c) {
                            yaRotatingProgress.c = false;
                            yaRotatingProgress.b = System.currentTimeMillis();
                            jyr jyrVar = sht.a;
                            yaRotatingProgress.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        if (yaRotatingProgress.d) {
                            yaRotatingProgress.d = false;
                            jyr jyrVar2 = sht.a;
                            yaRotatingProgress.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f = new Runnable(this) { // from class: v7w
            public final /* synthetic */ YaRotatingProgress b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i32 = i3;
                YaRotatingProgress yaRotatingProgress = this.b;
                switch (i32) {
                    case 0:
                        if (yaRotatingProgress.c) {
                            yaRotatingProgress.c = false;
                            yaRotatingProgress.b = System.currentTimeMillis();
                            jyr jyrVar = sht.a;
                            yaRotatingProgress.setVisibility(0);
                            break;
                        }
                        break;
                    default:
                        if (yaRotatingProgress.d) {
                            yaRotatingProgress.d = false;
                            jyr jyrVar2 = sht.a;
                            yaRotatingProgress.setVisibility(8);
                            break;
                        }
                        break;
                }
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zdn.f, i, 0);
        this.a = new i7w(obtainStyledAttributes.getColor(0, context.getColor(R.color.icon_logo_night)), obtainStyledAttributes.getDimension(1, getResources().getDimension(R.dimen.thickness_circle)), 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.a.draw(canvas);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return;
        }
        this.a.setBounds(0, 0, measuredWidth, measuredHeight);
    }

    public void setAngle(int i) {
        this.a.e = i;
    }

    public YaRotatingProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YaRotatingProgress(Context context) {
        this(context, null, 0);
    }
}
