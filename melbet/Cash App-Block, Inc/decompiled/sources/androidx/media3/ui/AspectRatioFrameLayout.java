package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.internal.zzjy;

/* loaded from: classes3.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final zzjy aspectRatioUpdateDispatcher;
    public int resizeMode;
    public float videoAspectRatio;

    public interface AspectRatioListener {
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.resizeMode = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.AspectRatioFrameLayout, 0, 0);
            try {
                this.resizeMode = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.aspectRatioUpdateDispatcher = new zzjy(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r4 > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r2 = r2 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        r1 = r1 / r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (r4 > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L23;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.videoAspectRatio <= RecyclerView.DECELERATION_RATE) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = (this.videoAspectRatio / (f2 / f3)) - 1.0f;
        float abs = Math.abs(f4);
        zzjy zzjyVar = this.aspectRatioUpdateDispatcher;
        if (abs <= 0.01f) {
            if (zzjyVar.zza) {
                return;
            }
            zzjyVar.zza = true;
            ((AspectRatioFrameLayout) zzjyVar.zzb).post(zzjyVar);
            return;
        }
        int i3 = this.resizeMode;
        if (i3 == 0) {
            f = this.videoAspectRatio;
        } else if (i3 == 1) {
            float f5 = f2 / this.videoAspectRatio;
            measuredHeight = (int) f5;
        } else if (i3 == 2) {
            float f6 = f3 * this.videoAspectRatio;
            measuredWidth = (int) f6;
        } else if (i3 == 4) {
            f = this.videoAspectRatio;
        }
        if (!zzjyVar.zza) {
            zzjyVar.zza = true;
            ((AspectRatioFrameLayout) zzjyVar.zzb).post(zzjyVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.videoAspectRatio != f) {
            this.videoAspectRatio = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(AspectRatioListener aspectRatioListener) {
    }

    public void setResizeMode(int i) {
        if (this.resizeMode != i) {
            this.resizeMode = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }
}
