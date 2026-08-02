package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes3.dex */
public class ContentLoadingProgressBar extends ProgressBar {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final ContentLoadingProgressBar$$ExternalSyntheticLambda0 mDelayedHide;
    public final ContentLoadingProgressBar$$ExternalSyntheticLambda0 mDelayedShow;

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0] */
    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final int i = 0;
        this.mDelayedHide = new Runnable(this) { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0
            public final /* synthetic */ ContentLoadingProgressBar f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f$0;
                switch (i2) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.$r8$clinit;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.$r8$clinit;
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
        final int i2 = 1;
        this.mDelayedShow = new Runnable(this) { // from class: androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0
            public final /* synthetic */ ContentLoadingProgressBar f$0;

            {
                this.f$0 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                ContentLoadingProgressBar contentLoadingProgressBar = this.f$0;
                switch (i22) {
                    case 0:
                        int i3 = ContentLoadingProgressBar.$r8$clinit;
                        contentLoadingProgressBar.setVisibility(8);
                        break;
                    default:
                        int i4 = ContentLoadingProgressBar.$r8$clinit;
                        System.currentTimeMillis();
                        contentLoadingProgressBar.setVisibility(0);
                        break;
                }
            }
        };
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }
}
