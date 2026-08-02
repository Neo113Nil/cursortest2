package E0;

import N3.C;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: C, reason: collision with root package name */
    public static final PorterDuff.Mode f701C = PorterDuff.Mode.SRC_IN;

    /* renamed from: A, reason: collision with root package name */
    public final Matrix f702A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f703B;

    /* renamed from: u, reason: collision with root package name */
    public n f704u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f705v;

    /* renamed from: w, reason: collision with root package name */
    public ColorFilter f706w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f707x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f708y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f709z;

    public p() {
        this.f708y = true;
        this.f709z = new float[9];
        this.f702A = new Matrix();
        this.f703B = new Rect();
        n nVar = new n();
        nVar.f691c = null;
        nVar.f692d = f701C;
        nVar.f690b = new m();
        this.f704u = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f650n;
        if (drawable == null) {
            return false;
        }
        H.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f703B;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f706w;
        if (colorFilter == null) {
            colorFilter = this.f705v;
        }
        Matrix matrix = this.f702A;
        canvas.getMatrix(matrix);
        float[] fArr = this.f709z;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && H.b.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f704u;
        Bitmap bitmap = nVar.f694f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f694f.getHeight()) {
            nVar.f694f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f698k = true;
        }
        if (this.f708y) {
            n nVar2 = this.f704u;
            if (nVar2.f698k || nVar2.f695g != nVar2.f691c || nVar2.f696h != nVar2.f692d || nVar2.f697j != nVar2.f693e || nVar2.i != nVar2.f690b.getRootAlpha()) {
                n nVar3 = this.f704u;
                nVar3.f694f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f694f);
                m mVar = nVar3.f690b;
                mVar.a(mVar.f681g, m.f674p, canvas2, min, min2);
                n nVar4 = this.f704u;
                nVar4.f695g = nVar4.f691c;
                nVar4.f696h = nVar4.f692d;
                nVar4.i = nVar4.f690b.getRootAlpha();
                nVar4.f697j = nVar4.f693e;
                nVar4.f698k = false;
            }
        } else {
            n nVar5 = this.f704u;
            nVar5.f694f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f694f);
            m mVar2 = nVar5.f690b;
            mVar2.a(mVar2.f681g, m.f674p, canvas3, min, min2);
        }
        n nVar6 = this.f704u;
        if (nVar6.f690b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f699l == null) {
                Paint paint2 = new Paint();
                nVar6.f699l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f699l.setAlpha(nVar6.f690b.getRootAlpha());
            nVar6.f699l.setColorFilter(colorFilter);
            paint = nVar6.f699l;
        }
        canvas.drawBitmap(nVar6.f694f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f650n;
        return drawable != null ? drawable.getAlpha() : this.f704u.f690b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f650n;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f704u.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f650n;
        return drawable != null ? H.a.c(drawable) : this.f706w;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f650n != null) {
            return new o(this.f650n.getConstantState());
        }
        this.f704u.f689a = getChangingConfigurations();
        return this.f704u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f650n;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f704u.f690b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f650n;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f704u.f690b.f682h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f650n;
        return drawable != null ? drawable.isAutoMirrored() : this.f704u.f693e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f704u;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f690b;
        if (mVar.f687n == null) {
            mVar.f687n = Boolean.valueOf(mVar.f681g.a());
        }
        if (mVar.f687n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f704u.f691c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f707x && super.mutate() == this) {
            n nVar = this.f704u;
            n nVar2 = new n();
            nVar2.f691c = null;
            nVar2.f692d = f701C;
            if (nVar != null) {
                nVar2.f689a = nVar.f689a;
                m mVar = new m(nVar.f690b);
                nVar2.f690b = mVar;
                if (nVar.f690b.f679e != null) {
                    mVar.f679e = new Paint(nVar.f690b.f679e);
                }
                if (nVar.f690b.f678d != null) {
                    nVar2.f690b.f678d = new Paint(nVar.f690b.f678d);
                }
                nVar2.f691c = nVar.f691c;
                nVar2.f692d = nVar.f692d;
                nVar2.f693e = nVar.f693e;
            }
            this.f704u = nVar2;
            this.f707x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f650n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f704u;
        ColorStateList colorStateList = nVar.f691c;
        if (colorStateList == null || (mode = nVar.f692d) == null) {
            z6 = false;
        } else {
            this.f705v = a(colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        m mVar = nVar.f690b;
        if (mVar.f687n == null) {
            mVar.f687n = Boolean.valueOf(mVar.f681g.a());
        }
        if (mVar.f687n.booleanValue()) {
            boolean b9 = nVar.f690b.f681g.b(iArr);
            nVar.f698k |= b9;
            if (b9) {
                invalidateSelf();
                return true;
            }
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f704u.f690b.getRootAlpha() != i) {
            this.f704u.f690b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f704u.f693e = z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f706w = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            com.bumptech.glide.e.l(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f704u;
        if (nVar.f691c != colorStateList) {
            nVar.f691c = colorStateList;
            this.f705v = a(colorStateList, nVar.f692d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            H.a.i(drawable, mode);
            return;
        }
        n nVar = this.f704u;
        if (nVar.f692d != mode) {
            nVar.f692d = mode;
            this.f705v = a(nVar.f691c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z9) {
        Drawable drawable = this.f650n;
        return drawable != null ? drawable.setVisible(z6, z9) : super.setVisible(z6, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f650n;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i;
        boolean z6;
        char c9;
        int i4;
        int i6;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f650n;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f704u;
        nVar.f690b = new m();
        TypedArray f2 = F.b.f(resources, theme, attributeSet, a.f631a);
        n nVar2 = this.f704u;
        m mVar2 = nVar2.f690b;
        int i9 = !F.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i9 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i9 != 5) {
            if (i9 != 9) {
                switch (i9) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f692d = mode;
        int i10 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i11 >= 28 && i11 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal threadLocal = F.c.f915a;
                try {
                    colorStateList = F.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e9) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e9);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f691c = colorStateList2;
        }
        boolean z9 = nVar2.f693e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z9 = f2.getBoolean(5, z9);
        }
        nVar2.f693e = z9;
        float f9 = mVar2.f683j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f9 = f2.getFloat(7, f9);
        }
        mVar2.f683j = f9;
        float f10 = mVar2.f684k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = f2.getFloat(8, f10);
        }
        mVar2.f684k = f10;
        boolean z10 = false;
        if (mVar2.f683j <= 0.0f) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 > 0.0f) {
            mVar2.f682h = f2.getDimension(3, mVar2.f682h);
            float dimension = f2.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.f682h <= 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f2.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    mVar2.f686m = string;
                    mVar2.f688o.put(string, mVar2);
                }
                f2.recycle();
                nVar.f689a = getChangingConfigurations();
                nVar.f698k = true;
                n nVar3 = this.f704u;
                m mVar3 = nVar3.f690b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f681g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                while (eventType != i10 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = com.anythink.expressad.a.f18390K.equals(name);
                        s.b bVar = mVar3.f688o;
                        mVar = mVar3;
                        if (equals) {
                            i iVar = new i();
                            iVar.f652e = 0.0f;
                            iVar.f654g = 1.0f;
                            iVar.f655h = 1.0f;
                            i = depth;
                            iVar.i = 0.0f;
                            iVar.f656j = 1.0f;
                            iVar.f657k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f658l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f659m = join2;
                            iVar.f660n = 4.0f;
                            TypedArray f11 = F.b.f(resources, theme, attributeSet, a.f633c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f11.getString(0);
                                if (string2 != null) {
                                    iVar.f672b = string2;
                                }
                                String string3 = f11.getString(2);
                                if (string3 != null) {
                                    iVar.f671a = C.D(string3);
                                }
                                iVar.f653f = F.b.b(f11, xmlPullParser, theme, "fillColor", 1);
                                float f12 = iVar.f655h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = f11.getFloat(12, f12);
                                }
                                iVar.f655h = f12;
                                int i12 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f11.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f658l;
                                if (i12 == 0) {
                                    cap = cap2;
                                } else if (i12 != 1) {
                                    cap = i12 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f658l = cap;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f11.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f659m;
                                if (i13 == 0) {
                                    join = join2;
                                } else if (i13 != 1) {
                                    join = i13 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f659m = join;
                                float f13 = iVar.f660n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = f11.getFloat(10, f13);
                                }
                                iVar.f660n = f13;
                                iVar.f651d = F.b.b(f11, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = iVar.f654g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = f11.getFloat(11, f14);
                                }
                                iVar.f654g = f14;
                                float f15 = iVar.f652e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = f11.getFloat(4, f15);
                                }
                                iVar.f652e = f15;
                                float f16 = iVar.f656j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = f11.getFloat(6, f16);
                                }
                                iVar.f656j = f16;
                                float f17 = iVar.f657k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = f11.getFloat(7, f17);
                                }
                                iVar.f657k = f17;
                                float f18 = iVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = f11.getFloat(5, f18);
                                }
                                iVar.i = f18;
                                int i14 = iVar.f673c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i14 = f11.getInt(13, i14);
                                }
                                iVar.f673c = i14;
                            }
                            f11.recycle();
                            jVar.f662b.add(iVar);
                            if (iVar.getPathName() != null) {
                                bVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f689a = nVar3.f689a;
                            i6 = 1;
                            z11 = false;
                            c9 = '\b';
                            z6 = false;
                        } else {
                            i = depth;
                            c9 = '\b';
                            z6 = false;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f19 = F.b.f(resources, theme, attributeSet, a.f634d);
                                    String string4 = f19.getString(0);
                                    if (string4 != null) {
                                        hVar.f672b = string4;
                                    }
                                    String string5 = f19.getString(1);
                                    if (string5 != null) {
                                        hVar.f671a = C.D(string5);
                                    }
                                    hVar.f673c = !F.b.c(xmlPullParser, "fillType") ? 0 : f19.getInt(2, 0);
                                    f19.recycle();
                                }
                                jVar.f662b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    bVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f689a = nVar3.f689a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f20 = F.b.f(resources, theme, attributeSet, a.f632b);
                                float f21 = jVar2.f663c;
                                if (F.b.c(xmlPullParser, "rotation")) {
                                    f21 = f20.getFloat(5, f21);
                                }
                                jVar2.f663c = f21;
                                i6 = 1;
                                jVar2.f664d = f20.getFloat(1, jVar2.f664d);
                                jVar2.f665e = f20.getFloat(2, jVar2.f665e);
                                float f22 = jVar2.f666f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f22 = f20.getFloat(3, f22);
                                }
                                jVar2.f666f = f22;
                                float f23 = jVar2.f667g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f23 = f20.getFloat(4, f23);
                                }
                                jVar2.f667g = f23;
                                float f24 = jVar2.f668h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f24 = f20.getFloat(6, f24);
                                }
                                jVar2.f668h = f24;
                                float f25 = jVar2.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f25 = f20.getFloat(7, f25);
                                }
                                jVar2.i = f25;
                                String string6 = f20.getString(0);
                                if (string6 != null) {
                                    jVar2.f670k = string6;
                                }
                                jVar2.c();
                                f20.recycle();
                                jVar.f662b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    bVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f689a = nVar3.f689a;
                            }
                            i6 = 1;
                        }
                        i4 = i6;
                    } else {
                        mVar = mVar3;
                        i = depth;
                        z6 = z10;
                        c9 = '\b';
                        i4 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i10 = i4;
                    z10 = z6;
                    mVar3 = mVar;
                    depth = i;
                }
                if (!z11) {
                    this.f705v = a(nVar.f691c, nVar.f692d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f708y = true;
        this.f709z = new float[9];
        this.f702A = new Matrix();
        this.f703B = new Rect();
        this.f704u = nVar;
        this.f705v = a(nVar.f691c, nVar.f692d);
    }
}
