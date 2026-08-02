package skeletor.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.jl40;
import defpackage.kks0;
import defpackage.lks0;
import defpackage.ooc;
import defpackage.qa10;
import defpackage.wls0;
import defpackage.yjs0;
import defpackage.ymp0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0002!\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u00060\u0016R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lskeletor/render/SkeletonContentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwls0;", "skeletonProxy", "Lzy11;", "setSkeletonProxy", "(Lwls0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lqa10;", "measures", "Lqa10;", "Llks0;", "paint", "Llks0;", "", "alreadyMeasured", "Z", "Lwls0;", "Lyjs0;", "skeleton", "Lyjs0;", "Companion", "kks0", "renderer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class SkeletonContentView extends FrameLayout {
    private static final kks0 Companion = new kks0();

    @Deprecated
    public static final long HUNDRED_PERCENTS_ALPHA = 4278190080L;
    private boolean alreadyMeasured;
    private final qa10 measures;
    private final lks0 paint;
    private yjs0 skeleton;
    private wls0 skeletonProxy;

    public SkeletonContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.measures = new qa10();
        this.paint = new lks0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSkeletonProxy$lambda$0(SkeletonContentView skeletonContentView) {
        yjs0 yjs0Var = skeletonContentView.skeleton;
        if (yjs0Var != null) {
            yjs0Var.b(skeletonContentView.getContext(), 0, 0, 0, skeletonContentView.paint);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!this.alreadyMeasured && this.skeleton != null) {
            int size = View.MeasureSpec.getSize(widthMeasureSpec);
            int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
            qa10 qa10Var = this.measures;
            qa10Var.a = size;
            qa10Var.b = size2;
            yjs0 yjs0Var = this.skeleton;
            if (yjs0Var != null) {
                yjs0Var.a(getContext(), this.measures);
            }
            this.alreadyMeasured = true;
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setSkeletonProxy(wls0 skeletonProxy) {
        if (jl40.l(this.skeletonProxy, skeletonProxy)) {
            return;
        }
        this.skeletonProxy = skeletonProxy;
        this.skeleton = ooc.t(skeletonProxy.b);
        this.alreadyMeasured = false;
        removeAllViews();
        post(new ymp0(4, this));
    }

    public SkeletonContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SkeletonContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public SkeletonContentView(Context context) {
        this(context, null, 0, 6, null);
    }
}
