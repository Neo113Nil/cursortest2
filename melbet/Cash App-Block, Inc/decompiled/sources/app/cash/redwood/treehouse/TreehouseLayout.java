package app.cash.redwood.treehouse;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.core.view.ViewGroupKt$iterator$1;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.passcode.screens.EndAppLock;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.DensityKt;
import app.cash.redwood.ui.LayoutDirection;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.ui.Size;
import app.cash.redwood.ui.UiConfiguration;
import app.cash.redwood.widget.WindowInsetsCallback;
import app.cash.zipline.loader.ZiplineLoader$ModuleJob$run$3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import com.caverock.androidsvg.SVG;
import com.fillr.featuretoggle.UnleashContext;
import com.fillr.m1;
import com.squareup.cash.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes3.dex */
public final class TreehouseLayout extends ViewGroup {
    public final UnleashContext children;
    public final ActionBarPolicy dynamicContentWidgetFactory;
    public final StateFlowImpl mutableUiConfiguration;
    public final m1 onBackPressedDispatcher;
    public boolean readyForContent;
    public TreehouseView$ReadyForContentChangeListener readyForContentChangeListener;
    public TreehouseView$SaveCallback saveCallback;
    public String stateSnapshotId;
    public final SVG widgetSystem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreehouseLayout(Context context, SVG svg, OnBackPressedDispatcher onBackPressedDispatcher, ActionBarPolicy actionBarPolicy) {
        super(context);
        context.getClass();
        onBackPressedDispatcher.getClass();
        this.children = new UnleashContext(this);
        setId(R.id.redwood_layout);
        Margin.Companion.getClass();
        this.mutableUiConfiguration = FlowKt.MutableStateFlow(computeUiConfiguration$default(this, null, Margin.Zero, 1));
        int i = 3;
        this.onBackPressedDispatcher = new m1(onBackPressedDispatcher, i);
        WindowInsetsCallback windowInsetsCallback = new WindowInsetsCallback(new xg$$ExternalSyntheticLambda9(this, i));
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(this, windowInsetsCallback);
        if (isAttachedToWindow()) {
            requestApplyInsets();
        }
        addOnAttachStateChangeListener(windowInsetsCallback);
        ViewCompat.setWindowInsetsAnimationCallback(this, windowInsetsCallback);
        this.widgetSystem = svg;
        this.dynamicContentWidgetFactory = actionBarPolicy;
        this.stateSnapshotId = null;
        setId(R.id.treehouse_layout);
    }

    public static UiConfiguration computeUiConfiguration$default(TreehouseLayout treehouseLayout, Configuration configuration, Margin margin, int i) {
        LayoutDirection layoutDirection;
        if ((i & 1) != 0) {
            configuration = treehouseLayout.getContext().getResources().getConfiguration();
            configuration.getClass();
        }
        if ((i & 2) != 0) {
            margin = ((UiConfiguration) treehouseLayout.mutableUiConfiguration.getValue()).viewInsets;
        }
        Margin margin2 = margin;
        Resources resources = treehouseLayout.getResources();
        resources.getClass();
        double Density = DensityKt.Density(resources);
        Size size = new Size(Density.m1400toDpHt74L4(treehouseLayout.getWidth(), Density), Density.m1400toDpHt74L4(treehouseLayout.getHeight(), Density));
        boolean z = (configuration.uiMode & 48) == 32;
        Margin.Companion.getClass();
        Margin margin3 = Margin.Zero;
        int layoutDirection2 = configuration.getLayoutDirection();
        if (layoutDirection2 == 0) {
            layoutDirection = LayoutDirection.Ltr;
        } else {
            if (layoutDirection2 != 1) {
                a$$ExternalSyntheticBUOutline0.m$3("layoutDirection must be LTR or RTL");
                return null;
            }
            layoutDirection = LayoutDirection.Rtl;
        }
        return new UiConfiguration(z, margin3, margin2, size, Density, layoutDirection);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.readyForContent = true;
        TreehouseView$ReadyForContentChangeListener treehouseView$ReadyForContentChangeListener = this.readyForContentChangeListener;
        if (treehouseView$ReadyForContentChangeListener != null) {
            ((CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0) treehouseView$ReadyForContentChangeListener).onReadyForContentChanged(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        UiConfiguration computeUiConfiguration$default = computeUiConfiguration$default(this, configuration, null, 2);
        StateFlowImpl stateFlowImpl = this.mutableUiConfiguration;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, computeUiConfiguration$default);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.readyForContent = false;
        TreehouseView$ReadyForContentChangeListener treehouseView$ReadyForContentChangeListener = this.readyForContentChangeListener;
        if (treehouseView$ReadyForContentChangeListener != null) {
            ((CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0) treehouseView$ReadyForContentChangeListener).onReadyForContentChanged(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        UiConfiguration computeUiConfiguration$default = computeUiConfiguration$default(this, null, null, 3);
        StateFlowImpl stateFlowImpl = this.mutableUiConfiguration;
        stateFlowImpl.getClass();
        stateFlowImpl.updateState(null, computeUiConfiguration$default);
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        while (true) {
            ViewGroupKt$iterator$1 viewGroupKt$iterator$1 = (ViewGroupKt$iterator$1) it;
            if (!viewGroupKt$iterator$1.hasNext()) {
                return;
            } else {
                ((View) viewGroupKt$iterator$1.next()).layout(0, 0, i3 - i, i4 - i2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Iterator it = new ViewGroupKt$children$1(this).iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            View view = (View) it.next();
            view.measure(i, i2);
            i3 = Math.max(i3, view.getMeasuredWidth());
            i4 = Math.max(i4, view.getMeasuredHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        SavedState savedState = (SavedState) parcelable;
        this.stateSnapshotId = savedState.id;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        String m = Boxes$$ExternalSyntheticOutline1.m();
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        TreehouseView$SaveCallback treehouseView$SaveCallback = this.saveCallback;
        if (treehouseView$SaveCallback != null) {
            ViewContentCodeBinding viewContentCodeBinding = (ViewContentCodeBinding) treehouseView$SaveCallback;
            JobKt.launch$default(viewContentCodeBinding.bindingScope, viewContentCodeBinding.dispatchers.zipline, null, new ZiplineLoader$ModuleJob$run$3(viewContentCodeBinding, m, null, 26), 2);
        }
        return new SavedState(onSaveInstanceState, m);
    }

    public void setReadyForContentChangeListener(TreehouseView$ReadyForContentChangeListener treehouseView$ReadyForContentChangeListener) {
        if (treehouseView$ReadyForContentChangeListener == null || this.readyForContentChangeListener == null) {
            this.readyForContentChangeListener = treehouseView$ReadyForContentChangeListener;
        } else {
            a$$ExternalSyntheticBUOutline0.m$1("View already bound to a listener");
        }
    }

    public void setSaveCallback(TreehouseView$SaveCallback treehouseView$SaveCallback) {
        this.saveCallback = treehouseView$SaveCallback;
    }

    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new EndAppLock.Creator(25);
        public final String id;

        public SavedState(Parcel parcel) {
            super(parcel);
            String readString = parcel.readString();
            readString.getClass();
            this.id = readString;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            super.writeToParcel(parcel, i);
            parcel.writeString(this.id);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, String str) {
            super(parcelable);
            str.getClass();
            this.id = str;
        }
    }
}
