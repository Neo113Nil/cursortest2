package ru.yandex.taxi.plus.design.gradient;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.Shape;
import defpackage.i3y;
import defpackage.m39;
import defpackage.ufd;
import defpackage.we8;
import kotlin.Metadata;
import kotlin.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/yandex/taxi/plus/design/gradient/CashbackDrawable;", "Landroid/graphics/drawable/PaintDrawable;", "<init>", "()V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/drawable/shapes/Shape;", "shape", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Paint;", "paint", "onDraw", "(Landroid/graphics/drawable/shapes/Shape;Landroid/graphics/Canvas;Landroid/graphics/Paint;)V", "Lm39;", "drawDelegate$delegate", "Li3y;", "getDrawDelegate", "()Lm39;", "drawDelegate", "plus_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CashbackDrawable extends PaintDrawable {

    /* renamed from: drawDelegate$delegate, reason: from kotlin metadata */
    private final i3y drawDelegate = a.a(new we8(16));

    /* JADX INFO: Access modifiers changed from: private */
    public static final m39 drawDelegate_delegate$lambda$0() {
        return new ufd();
    }

    private final m39 getDrawDelegate() {
        return (m39) this.drawDelegate.getValue();
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        getDrawDelegate().a(bounds.width(), bounds.height());
    }

    @Override // android.graphics.drawable.ShapeDrawable
    public void onDraw(Shape shape, Canvas canvas, Paint paint) {
        getDrawDelegate().e(shape, canvas, paint);
    }
}
