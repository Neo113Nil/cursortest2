package androidx.compose.foundation.layout;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCompat;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.squareup.cash.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    public static final WeakHashMap viewMap = new WeakHashMap();
    public int accessCount;
    public final AndroidWindowInsets captionBar;
    public final ValueInsets captionBarIgnoringVisibility;
    public final boolean consumes;
    public final ParcelableSnapshotMutableState cutoutPath$delegate;
    public final AndroidWindowInsets displayCutout;
    public final AndroidWindowInsets ime;
    public final ValueInsets imeAnimationSource;
    public final ValueInsets imeAnimationTarget;
    public final InsetsListener insetsListener;
    public final AndroidWindowInsets mandatorySystemGestures;
    public final AndroidWindowInsets navigationBars;
    public final ValueInsets navigationBarsIgnoringVisibility;
    public final AndroidWindowInsets statusBars;
    public final ValueInsets statusBarsIgnoringVisibility;
    public final AndroidWindowInsets systemBars;
    public final ValueInsets systemBarsIgnoringVisibility;
    public final AndroidWindowInsets systemGestures;
    public final AndroidWindowInsets tappableElement;
    public final ValueInsets tappableElementIgnoringVisibility;
    public final ValueInsets waterfall;

    public WindowInsetsHolder(View view) {
        AndroidWindowInsets access$systemInsets = Arrangement$End$1.access$systemInsets(4, "captionBar");
        this.captionBar = access$systemInsets;
        AndroidWindowInsets access$systemInsets2 = Arrangement$End$1.access$systemInsets(128, "displayCutout");
        this.displayCutout = access$systemInsets2;
        AndroidWindowInsets access$systemInsets3 = Arrangement$End$1.access$systemInsets(8, "ime");
        this.ime = access$systemInsets3;
        AndroidWindowInsets access$systemInsets4 = Arrangement$End$1.access$systemInsets(32, "mandatorySystemGestures");
        this.mandatorySystemGestures = access$systemInsets4;
        AndroidWindowInsets access$systemInsets5 = Arrangement$End$1.access$systemInsets(2, "navigationBars");
        this.navigationBars = access$systemInsets5;
        AndroidWindowInsets access$systemInsets6 = Arrangement$End$1.access$systemInsets(1, "statusBars");
        this.statusBars = access$systemInsets6;
        AndroidWindowInsets access$systemInsets7 = Arrangement$End$1.access$systemInsets(519, "systemBars");
        this.systemBars = access$systemInsets7;
        AndroidWindowInsets access$systemInsets8 = Arrangement$End$1.access$systemInsets(16, "systemGestures");
        this.systemGestures = access$systemInsets8;
        AndroidWindowInsets access$systemInsets9 = Arrangement$End$1.access$systemInsets(64, "tappableElement");
        this.tappableElement = access$systemInsets9;
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "waterfall");
        this.waterfall = valueInsets;
        this.cutoutPath$delegate = Updater.mutableStateOf$default(null);
        new UnionInsets(new UnionInsets(new UnionInsets(access$systemInsets7, access$systemInsets3), access$systemInsets2), new UnionInsets(new UnionInsets(new UnionInsets(access$systemInsets9, access$systemInsets4), access$systemInsets8), valueInsets));
        this.captionBarIgnoringVisibility = Arrangement$End$1.access$valueInsetsIgnoringVisibility(4, "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = Arrangement$End$1.access$valueInsetsIgnoringVisibility(2, "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = Arrangement$End$1.access$valueInsetsIgnoringVisibility(1, "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = Arrangement$End$1.access$valueInsetsIgnoringVisibility(519, "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = Arrangement$End$1.access$valueInsetsIgnoringVisibility(64, "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = new ValueInsets(new InsetsValues(0, 0, 0, 0), "imeAnimationTarget");
        this.imeAnimationSource = new ValueInsets(new InsetsValues(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : false;
        this.insetsListener = new InsetsListener(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        WindowInsetsCompat rootWindowInsets = ViewCompat.Api23Impl.getRootWindowInsets(view);
        if (rootWindowInsets != null) {
            WindowInsetsCompat.Impl impl = rootWindowInsets.mImpl;
            access$systemInsets.setVisible(impl.isVisible(4));
            access$systemInsets2.setVisible(impl.isVisible(128));
            access$systemInsets3.setVisible(impl.isVisible(8));
            access$systemInsets4.setVisible(impl.isVisible(32));
            access$systemInsets5.setVisible(impl.isVisible(2));
            access$systemInsets6.setVisible(impl.isVisible(1));
            access$systemInsets7.setVisible(impl.isVisible(519));
            access$systemInsets8.setVisible(impl.isVisible(16));
            access$systemInsets9.setVisible(impl.isVisible(64));
        }
    }

    public static void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat) {
        boolean z = false;
        windowInsetsHolder.captionBar.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.ime.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.displayCutout.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.navigationBars.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.statusBars.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.systemBars.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.systemGestures.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.tappableElement.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.mandatorySystemGestures.update$foundation_layout(windowInsetsCompat, 0);
        windowInsetsHolder.captionBarIgnoringVisibility.setValue$foundation_layout(SpacerKt.toInsetsValues(windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(4)));
        windowInsetsHolder.navigationBarsIgnoringVisibility.setValue$foundation_layout(SpacerKt.toInsetsValues(windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(2)));
        windowInsetsHolder.statusBarsIgnoringVisibility.setValue$foundation_layout(SpacerKt.toInsetsValues(windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(1)));
        windowInsetsHolder.systemBarsIgnoringVisibility.setValue$foundation_layout(SpacerKt.toInsetsValues(windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(519)));
        windowInsetsHolder.tappableElementIgnoringVisibility.setValue$foundation_layout(SpacerKt.toInsetsValues(windowInsetsCompat.mImpl.getInsetsIgnoringVisibility(64)));
        DisplayCutoutCompat displayCutout = windowInsetsCompat.mImpl.getDisplayCutout();
        windowInsetsHolder.waterfall.setValue$foundation_layout(SpacerKt.toInsetsValues(displayCutout != null ? displayCutout.getWaterfallInsets() : Insets.NONE));
        AndroidPath androidPath = null;
        if (displayCutout != null) {
            Path cutoutPath = Build.VERSION.SDK_INT >= 31 ? DisplayCompat.getCutoutPath(displayCutout.mDisplayCutout) : null;
            if (cutoutPath != null) {
                androidPath = new AndroidPath(cutoutPath);
            }
        }
        windowInsetsHolder.cutoutPath$delegate.setValue(androidPath);
        synchronized (SnapshotKt.lock) {
            MutableScatterSet mutableScatterSet = SnapshotKt.globalSnapshot.modified;
            if (mutableScatterSet != null) {
                if (mutableScatterSet.isNotEmpty()) {
                    z = true;
                }
            }
        }
        if (z) {
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
        }
    }

    public final void incrementAccessors(View view) {
        if (this.accessCount == 0) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            InsetsListener insetsListener = this.insetsListener;
            ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, insetsListener);
        }
        this.accessCount++;
    }
}
