package com.squareup.cash.androidsvg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.runtime.saveable.Saver;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.caverock.androidsvg.SVG;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.PlacesLightboxActivity;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class SVGAndroidRenderer implements OnApplyWindowInsetsListener, Saver {
    public final float dpi;
    public final Object fullPath;

    public SVGAndroidRenderer() {
        this.fullPath = new Path();
        this.dpi = 96.0f;
    }

    public static Path makePathAndBoundingBox(SVG$PolyLine sVG$PolyLine) {
        Path path = new Path();
        float[] fArr = sVG$PolyLine.points;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = sVG$PolyLine.points;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (sVG$PolyLine instanceof SVG$Polygon) {
            path.close();
        }
        if (sVG$PolyLine.boundingBox == null) {
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            sVG$PolyLine.boundingBox = new SVG$Box(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        Matrix matrix = (Matrix) sVG$PolyLine.transform;
        if (matrix != null) {
            path.transform(matrix);
        }
        return path;
    }

    public void doStroke(Path path) {
        ((Path) this.fullPath).addPath(path);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        KProperty[] kPropertyArr = PlacesLightboxActivity.zza;
        view.getClass();
        ViewGroup.LayoutParams layoutParams = ((View) this.fullPath).getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, windowInsetsCompat.mImpl.getInsets(519).bottom + ((int) this.dpi));
        return windowInsetsCompat;
    }

    public void render(SVG$Svg sVG$Svg, SVG$Length sVG$Length, SVG$Length sVG$Length2) {
        if (sVG$Length == null || !sVG$Length.isZero()) {
            if (sVG$Length2 == null || !sVG$Length2.isZero()) {
                renderChildren(sVG$Svg);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void renderChildren(SVG$GraphicsElement sVG$GraphicsElement) {
        Iterator it;
        float floatValueX;
        float floatValueX2;
        float min;
        float floatValueX3;
        float floatValueX4;
        float f;
        float f2;
        Path path;
        Matrix matrix;
        Iterator it2;
        SVG$Path sVG$Path;
        SVG.PathDefinition pathDefinition;
        int i;
        int i2;
        SVG.PathDefinition pathDefinition2;
        float f3;
        float f4;
        float f5;
        SVGAndroidRenderer sVGAndroidRenderer = this;
        Iterator it3 = ((ArrayList) sVG$GraphicsElement.transform).iterator();
        while (it3.hasNext()) {
            SVG$GraphicsElement sVG$GraphicsElement2 = (SVG$GraphicsElement) it3.next();
            if (!(sVG$GraphicsElement2 instanceof SVG$NotDirectlyRendered)) {
                if (sVG$GraphicsElement2 instanceof SVG$Svg) {
                    SVG$Svg sVG$Svg = (SVG$Svg) sVG$GraphicsElement2;
                    sVGAndroidRenderer.render(sVG$Svg, sVG$Svg.width, sVG$Svg.height);
                } else if (sVG$GraphicsElement2 instanceof SVG$Group) {
                    sVGAndroidRenderer.renderChildren((SVG$Group) sVG$GraphicsElement2);
                } else {
                    byte b = 2;
                    if (sVG$GraphicsElement2 instanceof SVG$Path) {
                        SVG$Path sVG$Path2 = (SVG$Path) sVG$GraphicsElement2;
                        SVG.PathDefinition pathDefinition3 = sVG$Path2.d;
                        if (pathDefinition3 != null) {
                            Path path2 = new Path();
                            int i3 = 0;
                            float f6 = RecyclerView.DECELERATION_RATE;
                            float f7 = RecyclerView.DECELERATION_RATE;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= pathDefinition3.commandsLength) {
                                    break;
                                }
                                byte b2 = pathDefinition3.commands[i4];
                                if (b2 == 0) {
                                    it2 = it3;
                                    sVG$Path = sVG$Path2;
                                    pathDefinition = pathDefinition3;
                                    int i5 = i3;
                                    i = i4;
                                    float[] fArr = pathDefinition.coords;
                                    f6 = fArr[i5];
                                    i2 = i5 + 2;
                                    f7 = fArr[i5 + 1];
                                    path2.moveTo(f6, f7);
                                } else if (b2 != 1) {
                                    if (b2 == b) {
                                        it2 = it3;
                                        sVG$Path = sVG$Path2;
                                        pathDefinition = pathDefinition3;
                                        i = i4;
                                        float[] fArr2 = pathDefinition.coords;
                                        int i6 = i3 + 1;
                                        int i7 = i3;
                                        float f8 = fArr2[i7];
                                        float f9 = fArr2[i6];
                                        float f10 = fArr2[i7 + 2];
                                        float f11 = fArr2[i7 + 3];
                                        float f12 = fArr2[i7 + 4];
                                        float f13 = fArr2[i7 + 5];
                                        path2.cubicTo(f8, f9, f10, f11, f12, f13);
                                        i3 = i7 + 6;
                                        f6 = f12;
                                        f7 = f13;
                                    } else if (b2 != 3) {
                                        if (b2 != 8) {
                                            boolean z = (b2 & 2) != 0;
                                            boolean z2 = (b2 & 1) != 0;
                                            float[] fArr3 = pathDefinition3.coords;
                                            float f14 = fArr3[i3];
                                            float f15 = fArr3[i3 + 1];
                                            float f16 = fArr3[i3 + 2];
                                            float f17 = fArr3[i3 + 3];
                                            int i8 = i3 + 5;
                                            float f18 = fArr3[i3 + 4];
                                            if (f6 == f17 && f7 == f18) {
                                                it2 = it3;
                                                sVG$Path = sVG$Path2;
                                                pathDefinition2 = pathDefinition3;
                                                f3 = f18;
                                                i = i4;
                                            } else if (f14 == RecyclerView.DECELERATION_RATE || f15 == RecyclerView.DECELERATION_RATE) {
                                                it2 = it3;
                                                sVG$Path = sVG$Path2;
                                                pathDefinition2 = pathDefinition3;
                                                f3 = f18;
                                                i = i4;
                                                path2.lineTo(f17, f3);
                                            } else {
                                                float abs = Math.abs(f14);
                                                float abs2 = Math.abs(f15);
                                                i = i4;
                                                double radians = (float) Math.toRadians(f16 % 360.0d);
                                                float cos = (float) Math.cos(radians);
                                                float sin = (float) Math.sin(radians);
                                                float f19 = (f6 - f17) / 2.0f;
                                                float f20 = (f7 - f18) / 2.0f;
                                                it2 = it3;
                                                float f21 = (sin * f20) + (cos * f19);
                                                float f22 = (cos * f20) + ((-sin) * f19);
                                                float f23 = abs * abs;
                                                float f24 = abs2 * abs2;
                                                float f25 = f21 * f21;
                                                float f26 = f22 * f22;
                                                float f27 = (f26 / f24) + (f25 / f23);
                                                if (f27 > 1.0f) {
                                                    f4 = sin;
                                                    double d = f27;
                                                    abs *= (float) Math.sqrt(d);
                                                    abs2 *= (float) Math.sqrt(d);
                                                    f5 = abs * abs;
                                                    f24 = abs2 * abs2;
                                                } else {
                                                    f4 = sin;
                                                    f5 = f23;
                                                }
                                                float f28 = abs2;
                                                float f29 = f5 * f24;
                                                float f30 = f5 * f26;
                                                float f31 = f24 * f25;
                                                float f32 = ((f29 - f30) - f31) / (f30 + f31);
                                                Path path3 = path2;
                                                float sqrt = (float) (Math.sqrt(f32 < RecyclerView.DECELERATION_RATE ? 0.0f : f32) * (z == z2 ? -1.0f : 1.0f));
                                                float f33 = ((abs * f22) / f28) * sqrt;
                                                float f34 = sqrt * (-((f28 * f21) / abs));
                                                float f35 = (f7 + f18) / 2.0f;
                                                float f36 = ((cos * f33) - (f4 * f34)) + ((f6 + f17) / 2.0f);
                                                float f37 = (cos * f34) + (f4 * f33) + f35;
                                                float f38 = (f21 - f33) / abs;
                                                float f39 = (f22 - f34) / f28;
                                                float f40 = ((-f21) - f33) / abs;
                                                float f41 = ((-f22) - f34) / f28;
                                                float f42 = (f39 * f39) + (f38 * f38);
                                                float degrees = (float) Math.toDegrees(Math.acos(f38 / ((float) Math.sqrt(f42))) * (f39 < RecyclerView.DECELERATION_RATE ? -1.0f : 1.0f));
                                                double degrees2 = Math.toDegrees(Math.acos(((f39 * f41) + (f38 * f40)) / ((float) Math.sqrt(Recorder$$ExternalSyntheticOutline2.m$1(f41, f41, f40 * f40, f42)))) * ((f38 * f41) - (f39 * f40) < RecyclerView.DECELERATION_RATE ? -1.0f : 1.0f));
                                                if (!z2 && degrees2 > 0.0d) {
                                                    degrees2 -= 360.0d;
                                                } else if (z2 && degrees2 < 0.0d) {
                                                    degrees2 += 360.0d;
                                                }
                                                double d2 = degrees2 % 360.0d;
                                                double d3 = degrees % 360.0f;
                                                int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
                                                double radians2 = Math.toRadians(d3);
                                                double radians3 = (float) (Math.toRadians(d2) / ceil);
                                                double d4 = radians3 / 2.0d;
                                                double sin2 = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
                                                int i9 = ceil * 6;
                                                float[] fArr4 = new float[i9];
                                                int i10 = 0;
                                                int i11 = 0;
                                                while (i10 < ceil) {
                                                    double d5 = radians3;
                                                    double d6 = radians2 + (i10 * r4);
                                                    double cos2 = Math.cos(d6);
                                                    double sin3 = Math.sin(d6);
                                                    fArr4[i11] = (float) (cos2 - (sin2 * sin3));
                                                    fArr4[i11 + 1] = (float) ((cos2 * sin2) + sin3);
                                                    double d7 = d6 + d5;
                                                    double cos3 = Math.cos(d7);
                                                    double sin4 = Math.sin(d7);
                                                    SVG$Path sVG$Path3 = sVG$Path2;
                                                    fArr4[i11 + 2] = (float) ((sin2 * sin4) + cos3);
                                                    fArr4[i11 + 3] = (float) (sin4 - (sin2 * cos3));
                                                    int i12 = i11 + 5;
                                                    fArr4[i11 + 4] = (float) cos3;
                                                    i11 += 6;
                                                    fArr4[i12] = (float) sin4;
                                                    i10++;
                                                    ceil = ceil;
                                                    radians3 = d5;
                                                    sVG$Path2 = sVG$Path3;
                                                    pathDefinition3 = pathDefinition3;
                                                }
                                                sVG$Path = sVG$Path2;
                                                pathDefinition2 = pathDefinition3;
                                                Matrix matrix2 = new Matrix();
                                                matrix2.postScale(abs, f28);
                                                matrix2.postRotate(f16);
                                                matrix2.postTranslate(f36, f37);
                                                matrix2.mapPoints(fArr4);
                                                fArr4[i9 - 2] = f17;
                                                fArr4[i9 - 1] = f18;
                                                int i13 = 0;
                                                while (i13 < i9) {
                                                    path3.cubicTo(fArr4[i13], fArr4[i13 + 1], fArr4[i13 + 2], fArr4[i13 + 3], fArr4[i13 + 4], fArr4[i13 + 5]);
                                                    i13 += 6;
                                                    fArr4 = fArr4;
                                                }
                                                path2 = path3;
                                                f3 = f18;
                                            }
                                            f7 = f3;
                                            f6 = f17;
                                            i3 = i8;
                                        } else {
                                            it2 = it3;
                                            sVG$Path = sVG$Path2;
                                            pathDefinition2 = pathDefinition3;
                                            i = i4;
                                            path2.close();
                                        }
                                        pathDefinition = pathDefinition2;
                                    } else {
                                        it2 = it3;
                                        sVG$Path = sVG$Path2;
                                        pathDefinition = pathDefinition3;
                                        i = i4;
                                        float[] fArr5 = pathDefinition.coords;
                                        float f43 = fArr5[i3];
                                        float f44 = fArr5[i3 + 1];
                                        int i14 = i3 + 3;
                                        f6 = fArr5[i3 + 2];
                                        i3 += 4;
                                        f7 = fArr5[i14];
                                        path2.quadTo(f43, f44, f6, f7);
                                    }
                                    i4 = i + 1;
                                    pathDefinition3 = pathDefinition;
                                    it3 = it2;
                                    sVG$Path2 = sVG$Path;
                                    b = 2;
                                } else {
                                    it2 = it3;
                                    sVG$Path = sVG$Path2;
                                    pathDefinition = pathDefinition3;
                                    int i15 = i3;
                                    i = i4;
                                    float[] fArr6 = pathDefinition.coords;
                                    f6 = fArr6[i15];
                                    i2 = i15 + 2;
                                    f7 = fArr6[i15 + 1];
                                    path2.lineTo(f6, f7);
                                }
                                i3 = i2;
                                i4 = i + 1;
                                pathDefinition3 = pathDefinition;
                                it3 = it2;
                                sVG$Path2 = sVG$Path;
                                b = 2;
                            }
                            it = it3;
                            if (sVG$Path2.boundingBox == null) {
                                RectF rectF = new RectF();
                                path2.computeBounds(rectF, true);
                                sVG$Path2.boundingBox = new SVG$Box(rectF.left, rectF.top, rectF.width(), rectF.height());
                            }
                            sVGAndroidRenderer = this;
                            sVGAndroidRenderer.doStroke(path2);
                        }
                    } else {
                        it = it3;
                        if (sVG$GraphicsElement2 instanceof SVG$Rect) {
                            SVG$Rect sVG$Rect = (SVG$Rect) sVG$GraphicsElement2;
                            SVG$Length sVG$Length = sVG$Rect.width;
                            if (sVG$Length != null && sVG$Rect.height != null && !sVG$Length.isZero() && !sVG$Rect.height.isZero()) {
                                SVG$Length sVG$Length2 = sVG$Rect.rx;
                                if (sVG$Length2 == null && sVG$Rect.ry == null) {
                                    floatValueX = 0.0f;
                                } else {
                                    SVG$Length sVG$Length3 = sVG$Rect.ry;
                                    if (sVG$Length2 == null) {
                                        floatValueX = sVG$Length3.floatValueX(sVGAndroidRenderer);
                                    } else if (sVG$Length3 == null) {
                                        floatValueX = sVG$Length2.floatValueX(sVGAndroidRenderer);
                                    } else {
                                        floatValueX = sVG$Length2.floatValueX(sVGAndroidRenderer);
                                        floatValueX2 = sVG$Rect.ry.floatValueX(sVGAndroidRenderer);
                                        min = Math.min(floatValueX, sVG$Rect.width.floatValueX(sVGAndroidRenderer) / 2.0f);
                                        float min2 = Math.min(floatValueX2, sVG$Rect.height.floatValueX(sVGAndroidRenderer) / 2.0f);
                                        SVG$Length sVG$Length4 = sVG$Rect.x;
                                        floatValueX3 = sVG$Length4 == null ? sVG$Length4.floatValueX(sVGAndroidRenderer) : 0.0f;
                                        SVG$Length sVG$Length5 = sVG$Rect.y;
                                        floatValueX4 = sVG$Length5 == null ? sVG$Length5.floatValueX(sVGAndroidRenderer) : 0.0f;
                                        float floatValueX5 = sVG$Rect.width.floatValueX(sVGAndroidRenderer);
                                        float floatValueX6 = sVG$Rect.height.floatValueX(sVGAndroidRenderer);
                                        if (sVG$Rect.boundingBox == null) {
                                            sVG$Rect.boundingBox = new SVG$Box(floatValueX3, floatValueX4, floatValueX5, floatValueX6);
                                        }
                                        f = floatValueX5 + floatValueX3;
                                        f2 = floatValueX4 + floatValueX6;
                                        path = new Path();
                                        if (min != RecyclerView.DECELERATION_RATE || min2 == RecyclerView.DECELERATION_RATE) {
                                            path.moveTo(floatValueX3, floatValueX4);
                                            path.lineTo(f, floatValueX4);
                                            path.lineTo(f, f2);
                                            path.lineTo(floatValueX3, f2);
                                            path.lineTo(floatValueX3, floatValueX4);
                                        } else {
                                            float f45 = min * 0.5522848f;
                                            float f46 = 0.5522848f * min2;
                                            float f47 = floatValueX4 + min2;
                                            path.moveTo(floatValueX3, f47);
                                            float f48 = f47 - f46;
                                            float f49 = floatValueX3 + min;
                                            float f50 = f49 - f45;
                                            path.cubicTo(floatValueX3, f48, f50, floatValueX4, f49, floatValueX4);
                                            float f51 = f - min;
                                            path.lineTo(f51, floatValueX4);
                                            float f52 = f51 + f45;
                                            path.cubicTo(f52, floatValueX4, f, f48, f, f47);
                                            float f53 = f2 - min2;
                                            path.lineTo(f, f53);
                                            float f54 = f53 + f46;
                                            path.cubicTo(f, f54, f52, f2, f51, f2);
                                            path.lineTo(f49, f2);
                                            float f55 = floatValueX3;
                                            path.cubicTo(f50, f2, f55, f54, floatValueX3, f53);
                                            path.lineTo(f55, f47);
                                        }
                                        path.close();
                                        matrix = (Matrix) sVG$Rect.transform;
                                        if (matrix != null) {
                                            path.transform(matrix);
                                        }
                                        sVGAndroidRenderer.doStroke(path);
                                    }
                                }
                                floatValueX2 = floatValueX;
                                min = Math.min(floatValueX, sVG$Rect.width.floatValueX(sVGAndroidRenderer) / 2.0f);
                                float min22 = Math.min(floatValueX2, sVG$Rect.height.floatValueX(sVGAndroidRenderer) / 2.0f);
                                SVG$Length sVG$Length42 = sVG$Rect.x;
                                if (sVG$Length42 == null) {
                                }
                                SVG$Length sVG$Length52 = sVG$Rect.y;
                                if (sVG$Length52 == null) {
                                }
                                float floatValueX52 = sVG$Rect.width.floatValueX(sVGAndroidRenderer);
                                float floatValueX62 = sVG$Rect.height.floatValueX(sVGAndroidRenderer);
                                if (sVG$Rect.boundingBox == null) {
                                }
                                f = floatValueX52 + floatValueX3;
                                f2 = floatValueX4 + floatValueX62;
                                path = new Path();
                                if (min != RecyclerView.DECELERATION_RATE) {
                                }
                                path.moveTo(floatValueX3, floatValueX4);
                                path.lineTo(f, floatValueX4);
                                path.lineTo(f, f2);
                                path.lineTo(floatValueX3, f2);
                                path.lineTo(floatValueX3, floatValueX4);
                                path.close();
                                matrix = (Matrix) sVG$Rect.transform;
                                if (matrix != null) {
                                }
                                sVGAndroidRenderer.doStroke(path);
                            }
                        } else if (sVG$GraphicsElement2 instanceof SVG$Circle) {
                            SVG$Circle sVG$Circle = (SVG$Circle) sVG$GraphicsElement2;
                            SVG$Length sVG$Length6 = sVG$Circle.r;
                            if (sVG$Length6 != null && !sVG$Length6.isZero()) {
                                SVG$Length sVG$Length7 = sVG$Circle.cx;
                                float floatValueX7 = sVG$Length7 != null ? sVG$Length7.floatValueX(sVGAndroidRenderer) : 0.0f;
                                SVG$Length sVG$Length8 = sVG$Circle.cy;
                                float floatValueX8 = sVG$Length8 != null ? sVG$Length8.floatValueX(sVGAndroidRenderer) : 0.0f;
                                float floatValueX9 = sVG$Circle.r.floatValueX(sVGAndroidRenderer);
                                float f56 = floatValueX7 - floatValueX9;
                                float f57 = floatValueX8 - floatValueX9;
                                float f58 = floatValueX7 + floatValueX9;
                                float f59 = floatValueX8 + floatValueX9;
                                if (sVG$Circle.boundingBox == null) {
                                    float f60 = floatValueX9 * 2.0f;
                                    sVG$Circle.boundingBox = new SVG$Box(f56, f57, f60, f60);
                                }
                                float f61 = floatValueX9 * 0.5522848f;
                                Path path4 = new Path();
                                path4.moveTo(floatValueX7, f57);
                                float f62 = floatValueX7 + f61;
                                float f63 = floatValueX8 - f61;
                                path4.cubicTo(f62, f57, f58, f63, f58, floatValueX8);
                                float f64 = floatValueX8 + f61;
                                path4.cubicTo(f58, f64, f62, f59, floatValueX7, f59);
                                float f65 = floatValueX7 - f61;
                                path4.cubicTo(f65, f59, f56, f64, f56, floatValueX8);
                                path4.cubicTo(f56, f63, f65, f57, floatValueX7, f57);
                                path4.close();
                                Matrix matrix3 = (Matrix) sVG$Circle.transform;
                                if (matrix3 != null) {
                                    path4.transform(matrix3);
                                }
                                sVGAndroidRenderer.doStroke(path4);
                            }
                        } else if (sVG$GraphicsElement2 instanceof SVG$Ellipse) {
                            SVG$Ellipse sVG$Ellipse = (SVG$Ellipse) sVG$GraphicsElement2;
                            SVG$Length sVG$Length9 = sVG$Ellipse.rx;
                            if (sVG$Length9 != null && sVG$Ellipse.ry != null && !sVG$Length9.isZero() && !sVG$Ellipse.ry.isZero()) {
                                SVG$Length sVG$Length10 = sVG$Ellipse.cx;
                                float floatValueX10 = sVG$Length10 != null ? sVG$Length10.floatValueX(sVGAndroidRenderer) : 0.0f;
                                SVG$Length sVG$Length11 = sVG$Ellipse.cy;
                                float floatValueX11 = sVG$Length11 != null ? sVG$Length11.floatValueX(sVGAndroidRenderer) : 0.0f;
                                float floatValueX12 = sVG$Ellipse.rx.floatValueX(sVGAndroidRenderer);
                                float floatValueX13 = sVG$Ellipse.ry.floatValueX(sVGAndroidRenderer);
                                float f66 = floatValueX10 - floatValueX12;
                                float f67 = floatValueX11 - floatValueX13;
                                float f68 = floatValueX10 + floatValueX12;
                                float f69 = floatValueX11 + floatValueX13;
                                if (sVG$Ellipse.boundingBox == null) {
                                    sVG$Ellipse.boundingBox = new SVG$Box(f66, f67, floatValueX12 * 2.0f, floatValueX13 * 2.0f);
                                }
                                float f70 = floatValueX12 * 0.5522848f;
                                float f71 = floatValueX13 * 0.5522848f;
                                Path path5 = new Path();
                                path5.moveTo(floatValueX10, f67);
                                float f72 = floatValueX10 + f70;
                                float f73 = floatValueX11 - f71;
                                path5.cubicTo(f72, f67, f68, f73, f68, floatValueX11);
                                float f74 = floatValueX11 + f71;
                                path5.cubicTo(f68, f74, f72, f69, floatValueX10, f69);
                                float f75 = floatValueX10 - f70;
                                path5.cubicTo(f75, f69, f66, f74, f66, floatValueX11);
                                path5.cubicTo(f66, f73, f75, f67, floatValueX10, f67);
                                path5.close();
                                Matrix matrix4 = (Matrix) sVG$Ellipse.transform;
                                if (matrix4 != null) {
                                    path5.transform(matrix4);
                                }
                                sVGAndroidRenderer.doStroke(path5);
                            }
                        } else if (sVG$GraphicsElement2 instanceof SVG$Line) {
                            SVG$Line sVG$Line = (SVG$Line) sVG$GraphicsElement2;
                            SVG$Length sVG$Length12 = sVG$Line.x1;
                            float floatValueX14 = sVG$Length12 == null ? 0.0f : sVG$Length12.floatValueX(sVGAndroidRenderer);
                            SVG$Length sVG$Length13 = sVG$Line.y1;
                            float floatValueX15 = sVG$Length13 == null ? 0.0f : sVG$Length13.floatValueX(sVGAndroidRenderer);
                            SVG$Length sVG$Length14 = sVG$Line.x2;
                            float floatValueX16 = sVG$Length14 == null ? 0.0f : sVG$Length14.floatValueX(sVGAndroidRenderer);
                            SVG$Length sVG$Length15 = sVG$Line.y2;
                            float floatValueX17 = sVG$Length15 == null ? 0.0f : sVG$Length15.floatValueX(sVGAndroidRenderer);
                            if (sVG$Line.boundingBox == null) {
                                sVG$Line.boundingBox = new SVG$Box(Math.min(floatValueX14, floatValueX16), Math.min(floatValueX15, floatValueX17), Math.abs(floatValueX16 - floatValueX14), Math.abs(floatValueX17 - floatValueX15));
                            }
                            Path path6 = new Path();
                            path6.moveTo(floatValueX14, floatValueX15);
                            path6.lineTo(floatValueX16, floatValueX17);
                            Matrix matrix5 = (Matrix) sVG$Line.transform;
                            if (matrix5 != null) {
                                path6.transform(matrix5);
                            }
                            sVGAndroidRenderer.doStroke(path6);
                        } else if (sVG$GraphicsElement2 instanceof SVG$Polygon) {
                            SVG$Polygon sVG$Polygon = (SVG$Polygon) sVG$GraphicsElement2;
                            if (sVG$Polygon.points.length >= 2) {
                                sVGAndroidRenderer.doStroke(makePathAndBoundingBox(sVG$Polygon));
                            }
                        } else if (sVG$GraphicsElement2 instanceof SVG$PolyLine) {
                            SVG$PolyLine sVG$PolyLine = (SVG$PolyLine) sVG$GraphicsElement2;
                            if (sVG$PolyLine.points.length >= 2) {
                                sVGAndroidRenderer.doStroke(makePathAndBoundingBox(sVG$PolyLine));
                            }
                        }
                    }
                    it3 = it;
                }
            }
            it = it3;
            it3 = it;
        }
    }

    @Override // androidx.compose.runtime.saveable.Saver
    /* renamed from: restore */
    public Object mo380restore(Object obj) {
        List list = (List) obj;
        Function0 function0 = (Function0) this.fullPath;
        Float f = (Float) list.get(1);
        float f2 = RecyclerView.DECELERATION_RATE;
        CardNestedScrollExpander cardNestedScrollExpander = new CardNestedScrollExpander(function0, f != null ? f.floatValue() : 0.0f, true, null);
        cardNestedScrollExpander.cardHeight$delegate.setValue((Float) list.get(0));
        Float f3 = (Float) list.get(1);
        if (f3 != null) {
            f2 = f3.floatValue();
        }
        float f4 = this.dpi;
        if (f2 > f4) {
            f2 = f4;
        }
        cardNestedScrollExpander.cardRevealDistance$delegate.setFloatValue(f2);
        return cardNestedScrollExpander;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public Object save(SaveableHolder saveableHolder, Object obj) {
        CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj;
        saveableHolder.getClass();
        cardNestedScrollExpander.getClass();
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{(Float) cardNestedScrollExpander.cardHeight$delegate.getValue(), Float.valueOf(cardNestedScrollExpander.cardRevealDistance$delegate.getFloatValue())});
    }

    public /* synthetic */ SVGAndroidRenderer(Object obj, float f) {
        this.fullPath = obj;
        this.dpi = f;
    }

    public /* synthetic */ SVGAndroidRenderer(float f, Serializable serializable) {
        this.dpi = f;
        this.fullPath = serializable;
    }

    public SVGAndroidRenderer(float f, Function0 function0) {
        function0.getClass();
        this.fullPath = function0;
        this.dpi = f;
    }
}
