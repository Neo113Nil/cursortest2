package skeletor.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.jl40;
import defpackage.ooc;
import defpackage.qa10;
import defpackage.wls0;
import defpackage.yjs0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\r\u0010\u001c¨\u0006\u001d"}, d2 = {"Lskeletor/render/BaseSkeletorView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lwls0;", "skeletonProxy", "Lzy11;", "setSkeleton", "(Lwls0;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lqa10;", "measures", "Lqa10;", "Lwls0;", "Lyjs0;", "skeleton", "Lyjs0;", "getSkeleton", "()Lyjs0;", "(Lyjs0;)V", "renderer_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseSkeletorView extends View {
    private final qa10 measures;
    private yjs0 skeleton;
    private wls0 skeletonProxy;

    public /* synthetic */ BaseSkeletorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final yjs0 getSkeleton() {
        return this.skeleton;
    }

    @Override // android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        yjs0 yjs0Var = this.skeleton;
        if (yjs0Var == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        qa10 qa10Var = this.measures;
        qa10Var.a = size;
        qa10Var.b = size2;
        yjs0Var.a(getContext(), this.measures);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(yjs0Var.b, 1073741824), View.MeasureSpec.makeMeasureSpec(yjs0Var.c, 1073741824));
    }

    public final void setSkeleton(wls0 skeletonProxy) {
        if (jl40.l(this.skeletonProxy, skeletonProxy)) {
            return;
        }
        this.skeletonProxy = skeletonProxy;
        this.skeleton = ooc.t(skeletonProxy.b);
        requestLayout();
    }

    public BaseSkeletorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public BaseSkeletorView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BaseSkeletorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.measures = new qa10();
    }

    public final void setSkeleton(yjs0 yjs0Var) {
        this.skeleton = yjs0Var;
    }
}
