package ru.rt.ebs.cryptosdk.presentation.customView;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import defpackage.ny61;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u000f\u0010\u0017\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0017\u0010\u0011J\u000f\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0011J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CameraPreview;", "Landroid/view/TextureView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "width", "", "getWidthScaleByScreen", "(I)F", "getScreenWidth", "()I", "getScreenWidthWithWindowMetrics", "getScreenWidthWithWindowManager", "height", "getHeightScaleByScreen", "getScreenHeight", "getScreenHeightWithWindowMetrics", "getScreenHeightWithWindowManager", "Lzy11;", "setAspectRatio", "(II)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "ratioWidth", CA20Status.STATUS_USER_I, "ratioHeight", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CameraPreview extends TextureView {
    private int ratioHeight;
    private int ratioWidth;

    public CameraPreview(Context context) {
        super(context);
        this.ratioWidth = 1;
        this.ratioHeight = 1;
    }

    private final float getHeightScaleByScreen(int height) {
        return getScreenHeight() / height;
    }

    private final int getScreenHeight() {
        return Build.VERSION.SDK_INT >= 30 ? getScreenHeightWithWindowMetrics() : getScreenHeightWithWindowManager();
    }

    private final int getScreenHeightWithWindowManager() {
        WindowManager windowManager;
        Display defaultDisplay;
        Point point = new Point();
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getSize(point);
        }
        return point.y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        r3 = r3.getCurrentWindowMetrics();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getScreenHeightWithWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (r3 = activity.getWindowManager()) == null || currentWindowMetrics == null) {
            return 0;
        }
        windowInsets = currentWindowMetrics.getWindowInsets();
        navigationBars = WindowInsets.Type.navigationBars();
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
        int i = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
        bounds = currentWindowMetrics.getBounds();
        return bounds.height() - i;
    }

    private final int getScreenWidth() {
        return Build.VERSION.SDK_INT >= 30 ? getScreenWidthWithWindowMetrics() : getScreenWidthWithWindowManager();
    }

    private final int getScreenWidthWithWindowManager() {
        WindowManager windowManager;
        Display defaultDisplay;
        Point point = new Point();
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (windowManager = activity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getSize(point);
        }
        return point.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        r3 = r3.getCurrentWindowMetrics();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int getScreenWidthWithWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        int navigationBars;
        int displayCutout;
        Insets insetsIgnoringVisibility;
        Rect bounds;
        Context context = getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (r3 = activity.getWindowManager()) == null || currentWindowMetrics == null) {
            return 0;
        }
        windowInsets = currentWindowMetrics.getWindowInsets();
        navigationBars = WindowInsets.Type.navigationBars();
        displayCutout = WindowInsets.Type.displayCutout();
        insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(navigationBars | displayCutout);
        int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
        bounds = currentWindowMetrics.getBounds();
        return bounds.width() - i;
    }

    private final float getWidthScaleByScreen(int width) {
        return getScreenWidth() / width;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        getWidthScaleByScreen(size);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        getHeightScaleByScreen(size2);
        int i = this.ratioWidth;
        int i2 = this.ratioHeight;
        int i3 = (size2 * i) / i2;
        if (size < i3) {
            setMeasuredDimension(i3, size2);
        } else {
            setMeasuredDimension(size, (i2 * size) / i);
        }
    }

    public final void setAspectRatio(int width, int height) {
        if (width < 0 || height < 0) {
            ny61.g("Size2 cannot be negative.");
            return;
        }
        this.ratioWidth = width;
        this.ratioHeight = height;
        requestLayout();
    }

    public CameraPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ratioWidth = 1;
        this.ratioHeight = 1;
    }

    public CameraPreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ratioWidth = 1;
        this.ratioHeight = 1;
    }
}
