package androidx.compose.ui.window;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.glance.layout.SpacerKt$Spacer$3;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.internal.measurement.zzabh;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class DialogLayout extends AbstractComposeView implements OnApplyWindowInsetsListener {
    public final ParcelableSnapshotMutableState content$delegate;
    public boolean decorFitsSystemWindows;
    public boolean hasCalledSetLayout;
    public boolean shouldCreateCompositionOnAttachedToWindow;
    public boolean usePlatformDefaultWidth;
    public final Window window;

    public DialogLayout(Context context, Window window) {
        super(context, null, 6, 0);
        this.window = window;
        this.content$delegate = Updater.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.lambda$210148896);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, this);
        ViewCompat.setWindowInsetsAnimationCallback(this, new zzabh() { // from class: androidx.compose.ui.window.DialogLayout.1
            @Override // com.google.android.gms.internal.measurement.zzabh
            public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return windowInsetsCompat.mImpl.inset(max, max2, max3, max4);
                    }
                }
                return windowInsetsCompat;
            }

            @Override // com.google.android.gms.internal.measurement.zzabh
            public final WorkLauncherImpl onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WorkLauncherImpl workLauncherImpl) {
                DialogLayout dialogLayout = DialogLayout.this;
                if (!dialogLayout.decorFitsSystemWindows) {
                    View childAt = dialogLayout.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dialogLayout.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dialogLayout.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        Insets of = Insets.of(max, max2, max3, max4);
                        int i = of.left;
                        Insets insets = (Insets) workLauncherImpl.processor;
                        int i2 = of.top;
                        int i3 = of.right;
                        int i4 = of.bottom;
                        return new WorkLauncherImpl(16, WindowInsetsCompat.insetInsets(insets, i, i2, i3, i4), WindowInsetsCompat.insetInsets((Insets) workLauncherImpl.workTaskExecutor, i, i2, i3, i4));
                    }
                }
                return workLauncherImpl;
            }
        });
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void Content(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1735448596);
        int i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) this.content$delegate.getValue()).invoke(gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SpacerKt$Spacer$3(this, i, 5);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i5 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i6 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    @Override // androidx.compose.ui.platform.AbstractComposeView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void internalOnMeasure$ui(int i, int i2) {
        int i3;
        int i4;
        int mode;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.internalOnMeasure$ui(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        Window window = this.window;
        if (mode2 == Integer.MIN_VALUE && !this.usePlatformDefaultWidth && window.getAttributes().height == -2) {
            if (this.decorFitsSystemWindows) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 < 30) {
                    i3 = Api21Impl.INSTANCE.getMaxDialogHeightExcludingSystemBarInsets(window);
                } else if (i5 < 32) {
                    i3 = Api30Impl.INSTANCE.getMaxDialogHeightExcludingSystemBarInsets(window);
                }
            } else {
                i3 = size2 + 1;
            }
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            i4 = size - paddingRight;
            if (i4 < 0) {
                i4 = 0;
            }
            int i6 = i3 - paddingBottom;
            int i7 = i6 >= 0 ? i6 : 0;
            mode = View.MeasureSpec.getMode(i);
            if (mode != 0) {
                i = View.MeasureSpec.makeMeasureSpec(i4, PKIFailureInfo.systemUnavail);
            }
            if (mode2 != 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(i7, PKIFailureInfo.systemUnavail);
            }
            childAt.measure(i, i2);
            if (mode != Integer.MIN_VALUE) {
                size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
            } else if (mode != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
            setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
            if (this.decorFitsSystemWindows && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
                window.addFlags(PKIFailureInfo.systemUnavail);
                if (this.usePlatformDefaultWidth) {
                    return;
                }
                window.setLayout(-1, -1);
                return;
            }
            return;
        }
        i3 = size2;
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        i4 = size - paddingRight2;
        if (i4 < 0) {
        }
        int i62 = i3 - paddingBottom2;
        if (i62 >= 0) {
        }
        mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
        }
        if (mode2 != 0) {
        }
        childAt.measure(i, i2);
        if (mode != Integer.MIN_VALUE) {
        }
        setMeasuredDimension(size, mode2 == Integer.MIN_VALUE ? mode2 != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom2 : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom2));
        if (this.decorFitsSystemWindows) {
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        if (!this.decorFitsSystemWindows) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return windowInsetsCompat.mImpl.inset(max, max2, max3, max4);
            }
        }
        return windowInsetsCompat;
    }

    public final void setContent(CompositionContext compositionContext, Function2<? super Composer, ? super Integer, Unit> function2) {
        setParentCompositionContext(compositionContext);
        this.content$delegate.setValue(function2);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
