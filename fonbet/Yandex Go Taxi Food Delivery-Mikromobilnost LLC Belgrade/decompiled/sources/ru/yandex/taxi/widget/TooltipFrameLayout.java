package ru.yandex.taxi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.f1h0;
import defpackage.g4i0;
import defpackage.hvz0;
import defpackage.ivz0;
import defpackage.sa90;
import defpackage.vng;
import defpackage.w511;
import defpackage.wuz0;
import defpackage.xw31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0011J\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060$H\u0014¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010-¨\u0006."}, d2 = {"Lru/yandex/taxi/widget/TooltipFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "resource", "Lzy11;", "createPointerTip", "(Landroid/content/Context;I)V", "initAttrs", "(Landroid/util/AttributeSet;)V", "setPointer", "(I)V", "Lru/yandex/taxi/widget/TooltipPointerDrawer$Direction;", "direction", "setPointerDirection", "(Lru/yandex/taxi/widget/TooltipPointerDrawer$Direction;)V", "offset", "setPointerOffset", "Lru/yandex/taxi/widget/TooltipPointerDrawer$PointerGravity;", "gravity", "setPointerGravity", "(Lru/yandex/taxi/widget/TooltipPointerDrawer$PointerGravity;)V", "Lwuz0;", "pointerDirectionListener", "setPointerDirectionListener", "(Lwuz0;)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lsa90;", "measurePointerPaddings", "()Lsa90;", "", "isRtl", "Z", "Livz0;", "pointerDrawer", "Livz0;", "Lwuz0;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class TooltipFrameLayout extends FrameLayout {
    public static final int $stable = 8;
    private final boolean isRtl;
    private wuz0 pointerDirectionListener;
    private ivz0 pointerDrawer;

    public TooltipFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isRtl = xw31.n(context);
        setClickable(true);
        initAttrs(attributeSet);
    }

    private final void createPointerTip(Context context, int resource) {
        Drawable t = vng.t(resource, context);
        this.pointerDrawer = t != null ? new ivz0(t, this.isRtl) : null;
    }

    private final void initAttrs(AttributeSet attrs) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, g4i0.TooltipFrameLayout, 0, 0);
        try {
            createPointerTip(getContext(), obtainStyledAttributes.getResourceId(g4i0.TooltipFrameLayout_tip, f1h0.tooltip_pointer));
            setPointerOffset(obtainStyledAttributes.getDimensionPixelSize(g4i0.TooltipFrameLayout_pointer_offset, 0));
            setPointerDirection(TooltipPointerDrawer$Direction.values()[obtainStyledAttributes.getInt(g4i0.TooltipFrameLayout_tip_direction, 0)]);
            setPointerGravity(TooltipPointerDrawer$PointerGravity.values()[obtainStyledAttributes.getInt(g4i0.TooltipFrameLayout_pointer_gravity, ivz0.l.ordinal())]);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        canvas.save();
        ivz0 ivz0Var = this.pointerDrawer;
        if (ivz0Var != null) {
            TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction = ivz0Var.k;
            tooltipPointerDrawer$Direction.getClass();
            if (tooltipPointerDrawer$Direction != TooltipPointerDrawer$Direction.NONE) {
                int i9 = hvz0.a[ivz0Var.k.ordinal()];
                if (i9 == 1) {
                    boolean z = ivz0Var.b;
                    i7 = ivz0Var.f;
                    if (z) {
                        i7 = -i7;
                    }
                    i8 = 0;
                } else if (i9 != 2) {
                    i7 = 0;
                    i8 = 0;
                } else {
                    i8 = ivz0Var.e;
                    i7 = 0;
                }
                canvas.translate(i7, i8);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
        ivz0 ivz0Var2 = this.pointerDrawer;
        if (ivz0Var2 != null) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = ivz0Var2.a;
            boolean z2 = ivz0Var2.b;
            TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction2 = ivz0Var2.k;
            tooltipPointerDrawer$Direction2.getClass();
            if (tooltipPointerDrawer$Direction2 == TooltipPointerDrawer$Direction.NONE) {
                return;
            }
            int i10 = hvz0.b[ivz0Var2.j.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    i2 = ivz0Var2.i;
                } else if (i10 != 3) {
                    w511.b();
                    return;
                } else {
                    i = ivz0Var2.i;
                    if (i == 0) {
                        i2 = width / 2;
                    }
                }
                int i11 = height / 2;
                int rotate = ivz0Var2.k.getRotate();
                i3 = hvz0.a[ivz0Var2.k.ordinal()];
                if (i3 != 1) {
                    i4 = ivz0Var2.h;
                    i5 = ivz0Var2.f;
                    if (z2) {
                        i6 = i4 + i11;
                        i5 = width - i5;
                        rotate *= -1;
                    }
                    i6 = i11 - i4;
                } else if (i3 == 2) {
                    i5 = i2 + ivz0Var2.g;
                    i6 = ivz0Var2.e;
                } else if (i3 == 3) {
                    i4 = ivz0Var2.h;
                    i5 = ivz0Var2.f;
                    if (z2) {
                        rotate *= -1;
                        i6 = i11 - i4;
                    } else {
                        i6 = i4 + i11;
                        i5 = width - i5;
                    }
                } else if (i3 == 4) {
                    i5 = i2 - ivz0Var2.g;
                    i6 = height - ivz0Var2.e;
                } else if (i3 != 5) {
                    w511.b();
                    return;
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                canvas.save();
                canvas.translate(i5, i6);
                canvas.rotate(rotate, 0.0f, 0.0f);
                drawable.setBounds(0, 0, ivz0Var2.c, ivz0Var2.d);
                drawable.draw(canvas);
                canvas.restore();
            }
            i = ivz0Var2.i;
            i2 = width - i;
            int i112 = height / 2;
            int rotate2 = ivz0Var2.k.getRotate();
            i3 = hvz0.a[ivz0Var2.k.ordinal()];
            if (i3 != 1) {
            }
            canvas.save();
            canvas.translate(i5, i6);
            canvas.rotate(rotate2, 0.0f, 0.0f);
            drawable.setBounds(0, 0, ivz0Var2.c, ivz0Var2.d);
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public sa90 measurePointerPaddings() {
        int i;
        ivz0 ivz0Var = this.pointerDrawer;
        int i2 = 0;
        if (ivz0Var != null) {
            ivz0Var.a();
            TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction = ivz0Var.k;
            tooltipPointerDrawer$Direction.getClass();
            if (tooltipPointerDrawer$Direction == TooltipPointerDrawer$Direction.START || tooltipPointerDrawer$Direction == TooltipPointerDrawer$Direction.END) {
                i = ivz0Var.f;
            } else {
                TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction2 = ivz0Var.k;
                tooltipPointerDrawer$Direction2.getClass();
                if (tooltipPointerDrawer$Direction2 == TooltipPointerDrawer$Direction.UP || tooltipPointerDrawer$Direction2 == TooltipPointerDrawer$Direction.DOWN) {
                    i2 = ivz0Var.e;
                    i = 0;
                }
            }
            return sa90.a(Integer.valueOf(i2), Integer.valueOf(i));
        }
        i = 0;
        return sa90.a(Integer.valueOf(i2), Integer.valueOf(i));
    }

    public final void setPointer(int resource) {
        createPointerTip(getContext(), resource);
    }

    public final void setPointerDirection(TooltipPointerDrawer$Direction direction) {
        TooltipPointerDrawer$Direction tooltipPointerDrawer$Direction;
        ivz0 ivz0Var = this.pointerDrawer;
        if (ivz0Var == null || direction == (tooltipPointerDrawer$Direction = ivz0Var.k)) {
            return;
        }
        if (tooltipPointerDrawer$Direction != direction) {
            ivz0Var.k = direction;
            ivz0Var.a();
        }
        requestLayout();
    }

    public final void setPointerDirectionListener(wuz0 pointerDirectionListener) {
    }

    public final void setPointerGravity(TooltipPointerDrawer$PointerGravity gravity) {
        ivz0 ivz0Var = this.pointerDrawer;
        if (ivz0Var != null) {
            ivz0Var.j = gravity;
        }
    }

    public final void setPointerOffset(int offset) {
        ivz0 ivz0Var = this.pointerDrawer;
        if (ivz0Var != null) {
            ivz0Var.i = offset;
        }
    }

    public TooltipFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TooltipFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TooltipFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
