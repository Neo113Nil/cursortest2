package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* loaded from: classes3.dex */
public final class ss2 extends Property {
    public final /* synthetic */ int a = 2;
    public Object b;

    public ss2() {
        super(Matrix.class, "imageMatrixProperty");
        this.b = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                return Float.valueOf(wm0.a(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.E0.getColorForState(extendedFloatingActionButton.getDrawableState(), ((ExtendedFloatingActionButton) ((ts2) this.b).b).E0.getDefaultColor()))));
            case 1:
                return (PointF) this.b;
            default:
                Matrix matrix = (Matrix) this.b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    @Override // android.util.Property
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void set(Object obj, Object obj2) {
        boolean z;
        float scaleX;
        switch (this.a) {
            case 0:
                ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) obj;
                Float f = (Float) obj2;
                int colorForState = extendedFloatingActionButton.E0.getColorForState(extendedFloatingActionButton.getDrawableState(), ((ExtendedFloatingActionButton) ((ts2) this.b).b).E0.getDefaultColor());
                ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (wm0.a(0.0f, Color.alpha(colorForState) / 255.0f, f.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                if (f.floatValue() != 1.0f) {
                    extendedFloatingActionButton.l(valueOf);
                    break;
                } else {
                    extendedFloatingActionButton.l(extendedFloatingActionButton.E0);
                    break;
                }
            case 1:
                View view = (View) obj;
                PointF pointF = (PointF) obj2;
                PointF pointF2 = (PointF) this.b;
                if (!pointF2.equals(pointF)) {
                    int round = Math.round(pointF.x);
                    int round2 = Math.round(pointF.y);
                    view.setTranslationX(round - view.getLeft());
                    view.setTranslationY(round2 - view.getTop());
                    Rect clipBounds = view.getClipBounds();
                    if (clipBounds != null) {
                        int i = (int) (pointF.y - pointF2.y);
                        int i2 = (int) (pointF.x - pointF2.x);
                        int i3 = clipBounds.top;
                        int i4 = clipBounds.left;
                        int i5 = clipBounds.right;
                        int i6 = clipBounds.bottom;
                        float scaleY = view.getScaleY() * view.getHeight();
                        boolean z2 = true;
                        if (clipBounds.height() < scaleY) {
                            if (i3 > 0 && i > 0) {
                                i3 = Math.max(0, i3 - i);
                            } else if (i6 < scaleY && i < 0) {
                                i6 = (int) Math.min(scaleY, i6 - i);
                            }
                            z = true;
                            scaleX = view.getScaleX() * view.getWidth();
                            if (clipBounds.width() < scaleX) {
                                if (i4 > 0 && i2 > 0) {
                                    i4 = Math.max(0, i4 - i2);
                                } else if (i5 < scaleX && i2 < 0) {
                                    i5 = (int) Math.min(scaleX, i5 - i2);
                                }
                                if (z2) {
                                    clipBounds.set(i4, i3, i5, i6);
                                    view.setClipBounds(clipBounds);
                                }
                            }
                            z2 = z;
                            if (z2) {
                            }
                        }
                        z = false;
                        scaleX = view.getScaleX() * view.getWidth();
                        if (clipBounds.width() < scaleX) {
                        }
                        z2 = z;
                        if (z2) {
                        }
                    }
                    pointF2.set(pointF);
                    break;
                }
                break;
            default:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
        }
    }

    public /* synthetic */ ss2(String str, Class cls) {
        super(cls, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss2(ts2 ts2Var) {
        super(Float.class, "LABEL_OPACITY_PROPERTY");
        this.b = ts2Var;
    }
}
