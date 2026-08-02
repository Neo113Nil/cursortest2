package ru.yandex.taxi.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.agh0;
import defpackage.c230;
import defpackage.e230;
import defpackage.mrg0;
import defpackage.rp31;
import defpackage.wnb1;
import defpackage.ysz0;
import defpackage.zgz0;
import defpackage.zrh0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ToolbarComponent;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u0000 )2\u00020\u0001:\u0001*B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00112\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010(¨\u0006+"}, d2 = {"Lru/yandex/taxi/widget/ToolbarModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Le230;", "insetsType", "()Le230;", "Landroid/view/View;", "child", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "Lzy11;", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "getContentLayoutRes", "()I", "contentView", "()Landroid/view/View;", "Lru/yandex/taxi/design/ToolbarComponent;", "toolbar", "()Lru/yandex/taxi/design/ToolbarComponent;", "onTouchOutside", "()V", "Ljava/lang/Runnable;", "onTouchOutsideListener", "setOnTouchOutsideListener", "(Ljava/lang/Runnable;)V", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/ToolbarComponent;", "", "isInflated", "Z", "Ljava/lang/Runnable;", "Companion", "ysz0", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ToolbarModalView extends ModalView {
    public static final int $stable = 8;
    private static final ysz0 Companion = new ysz0();
    private static final int NO_LAYOUT = -1;
    private final ViewGroup content;
    private boolean isInflated;
    private Runnable onTouchOutsideListener;
    private final ToolbarComponent toolbar;

    public ToolbarModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ru.yandex.taxi.design.utils.c.q(this, zrh0.toolbar_modal_view, true);
        this.isInflated = true;
        int i = agh0.toolbar_modal_view_content;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, i));
        this.content = viewGroup;
        this.toolbar = (ToolbarComponent) ((View) rp31.d(this, agh0.toolbar_modal_view_toolbar));
        if (getContentLayoutRes() != -1) {
            viewGroup.addView(LayoutInflater.from(getContext()).inflate(getContentLayoutRes(), (ViewGroup) this, false));
        }
        wnb1.d(viewGroup.getResources().getDimensionPixelSize(mrg0.modal_view_corner_radius), viewGroup);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (this.isInflated) {
            this.content.addView(child, index, params);
        } else {
            super.addView(child, index, params);
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public final View getBackgroundContent() {
        return this.content;
    }

    public int getContentLayoutRes() {
        return -1;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new c230(0, new zgz0(5, this), false);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        super.onTouchOutside();
        Runnable runnable = this.onTouchOutsideListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // ru.yandex.taxi.widget.ModalView, defpackage.u45
    public void setOnTouchOutsideListener(Runnable onTouchOutsideListener) {
        this.onTouchOutsideListener = onTouchOutsideListener;
    }

    /* renamed from: toolbar, reason: from getter */
    public final ToolbarComponent getToolbar() {
        return this.toolbar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarModalView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ToolbarModalView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
