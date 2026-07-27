package E0;

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
    public static final PorterDuff.Mode f721C = PorterDuff.Mode.SRC_IN;

    /* renamed from: A, reason: collision with root package name */
    public final Matrix f722A;

    /* renamed from: B, reason: collision with root package name */
    public final Rect f723B;

    /* renamed from: u, reason: collision with root package name */
    public n f724u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f725v;

    /* renamed from: w, reason: collision with root package name */
    public ColorFilter f726w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f727x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f728y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f729z;

    public p() {
        this.f728y = true;
        this.f729z = new float[9];
        this.f722A = new Matrix();
        this.f723B = new Rect();
        n nVar = new n();
        nVar.f711c = null;
        nVar.f712d = f721C;
        nVar.f710b = new m();
        this.f724u = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f670n;
        if (drawable == null) {
            return false;
        }
        H.a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f723B;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f726w;
        if (colorFilter == null) {
            colorFilter = this.f725v;
        }
        Matrix matrix = this.f722A;
        canvas.getMatrix(matrix);
        float[] fArr = this.f729z;
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
        n nVar = this.f724u;
        Bitmap bitmap = nVar.f714f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f714f.getHeight()) {
            nVar.f714f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f718k = true;
        }
        if (this.f728y) {
            n nVar2 = this.f724u;
            if (nVar2.f718k || nVar2.f715g != nVar2.f711c || nVar2.f716h != nVar2.f712d || nVar2.f717j != nVar2.f713e || nVar2.i != nVar2.f710b.getRootAlpha()) {
                n nVar3 = this.f724u;
                nVar3.f714f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f714f);
                m mVar = nVar3.f710b;
                mVar.a(mVar.f701g, m.f694p, canvas2, min, min2);
                n nVar4 = this.f724u;
                nVar4.f715g = nVar4.f711c;
                nVar4.f716h = nVar4.f712d;
                nVar4.i = nVar4.f710b.getRootAlpha();
                nVar4.f717j = nVar4.f713e;
                nVar4.f718k = false;
            }
        } else {
            n nVar5 = this.f724u;
            nVar5.f714f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f714f);
            m mVar2 = nVar5.f710b;
            mVar2.a(mVar2.f701g, m.f694p, canvas3, min, min2);
        }
        n nVar6 = this.f724u;
        if (nVar6.f710b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f719l == null) {
                Paint paint2 = new Paint();
                nVar6.f719l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f719l.setAlpha(nVar6.f710b.getRootAlpha());
            nVar6.f719l.setColorFilter(colorFilter);
            paint = nVar6.f719l;
        }
        canvas.drawBitmap(nVar6.f714f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getAlpha() : this.f724u.f710b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f724u.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f670n;
        return drawable != null ? H.a.c(drawable) : this.f726w;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f670n != null) {
            return new o(this.f670n.getConstantState());
        }
        this.f724u.f709a = getChangingConfigurations();
        return this.f724u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f724u.f710b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f724u.f710b.f702h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.isAutoMirrored() : this.f724u.f713e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f724u;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f710b;
        if (mVar.f707n == null) {
            mVar.f707n = Boolean.valueOf(mVar.f701g.a());
        }
        if (mVar.f707n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f724u.f711c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f727x && super.mutate() == this) {
            n nVar = this.f724u;
            n nVar2 = new n();
            nVar2.f711c = null;
            nVar2.f712d = f721C;
            if (nVar != null) {
                nVar2.f709a = nVar.f709a;
                m mVar = new m(nVar.f710b);
                nVar2.f710b = mVar;
                if (nVar.f710b.f699e != null) {
                    mVar.f699e = new Paint(nVar.f710b.f699e);
                }
                if (nVar.f710b.f698d != null) {
                    nVar2.f710b.f698d = new Paint(nVar.f710b.f698d);
                }
                nVar2.f711c = nVar.f711c;
                nVar2.f712d = nVar.f712d;
                nVar2.f713e = nVar.f713e;
            }
            this.f724u = nVar2;
            this.f727x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f670n;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f724u;
        ColorStateList colorStateList = nVar.f711c;
        if (colorStateList == null || (mode = nVar.f712d) == null) {
            z3 = false;
        } else {
            this.f725v = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        m mVar = nVar.f710b;
        if (mVar.f707n == null) {
            mVar.f707n = Boolean.valueOf(mVar.f701g.a());
        }
        if (mVar.f707n.booleanValue()) {
            boolean b9 = nVar.f710b.f701g.b(iArr);
            nVar.f718k |= b9;
            if (b9) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f724u.f710b.getRootAlpha() != i) {
            this.f724u.f710b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f724u.f713e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f726w = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            com.bumptech.glide.e.h(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            H.a.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f724u;
        if (nVar.f711c != colorStateList) {
            nVar.f711c = colorStateList;
            this.f725v = a(colorStateList, nVar.f712d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f670n;
        if (drawable != null) {
            H.a.i(drawable, mode);
            return;
        }
        n nVar = this.f724u;
        if (nVar.f712d != mode) {
            nVar.f712d = mode;
            this.f725v = a(nVar.f711c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z6) {
        Drawable drawable = this.f670n;
        return drawable != null ? drawable.setVisible(z3, z6) : super.setVisible(z3, z6);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f670n;
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
        boolean z3;
        char c9;
        int i6;
        int i9;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f670n;
        if (drawable != null) {
            H.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f724u;
        nVar.f710b = new m();
        TypedArray f3 = F.b.f(resources, theme, attributeSet, a.f651a);
        n nVar2 = this.f724u;
        m mVar2 = nVar2.f710b;
        int i10 = !F.b.c(xmlPullParser, "tintMode") ? -1 : f3.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
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
        nVar2.f712d = mode;
        int i11 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f3.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i12 >= 28 && i12 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f3.getResources();
                int resourceId = f3.getResourceId(1, 0);
                ThreadLocal threadLocal = F.c.f852a;
                try {
                    colorStateList = F.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e9) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e9);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f711c = colorStateList2;
        }
        boolean z6 = nVar2.f713e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z6 = f3.getBoolean(5, z6);
        }
        nVar2.f713e = z6;
        float f9 = mVar2.f703j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f9 = f3.getFloat(7, f9);
        }
        mVar2.f703j = f9;
        float f10 = mVar2.f704k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = f3.getFloat(8, f10);
        }
        mVar2.f704k = f10;
        boolean z9 = false;
        if (mVar2.f703j <= 0.0f) {
            throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 > 0.0f) {
            mVar2.f702h = f3.getDimension(3, mVar2.f702h);
            float dimension = f3.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.f702h <= 0.0f) {
                throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f3.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f3.getString(0);
                if (string != null) {
                    mVar2.f706m = string;
                    mVar2.f708o.put(string, mVar2);
                }
                f3.recycle();
                nVar.f709a = getChangingConfigurations();
                nVar.f718k = true;
                n nVar3 = this.f724u;
                m mVar3 = nVar3.f710b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f701g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                while (eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = com.anythink.expressad.a.f17603K.equals(name);
                        s.b bVar = mVar3.f708o;
                        mVar = mVar3;
                        if (equals) {
                            i iVar = new i();
                            iVar.f672e = 0.0f;
                            iVar.f674g = 1.0f;
                            iVar.f675h = 1.0f;
                            i = depth;
                            iVar.i = 0.0f;
                            iVar.f676j = 1.0f;
                            iVar.f677k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f678l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f679m = join2;
                            iVar.f680n = 4.0f;
                            TypedArray f11 = F.b.f(resources, theme, attributeSet, a.f653c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f11.getString(0);
                                if (string2 != null) {
                                    iVar.f692b = string2;
                                }
                                String string3 = f11.getString(2);
                                if (string3 != null) {
                                    iVar.f691a = S0.f.f(string3);
                                }
                                iVar.f673f = F.b.b(f11, xmlPullParser, theme, "fillColor", 1);
                                float f12 = iVar.f675h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = f11.getFloat(12, f12);
                                }
                                iVar.f675h = f12;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f11.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f678l;
                                if (i13 == 0) {
                                    cap = cap2;
                                } else if (i13 != 1) {
                                    cap = i13 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f678l = cap;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f11.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f679m;
                                if (i14 == 0) {
                                    join = join2;
                                } else if (i14 != 1) {
                                    join = i14 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f679m = join;
                                float f13 = iVar.f680n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = f11.getFloat(10, f13);
                                }
                                iVar.f680n = f13;
                                iVar.f671d = F.b.b(f11, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = iVar.f674g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = f11.getFloat(11, f14);
                                }
                                iVar.f674g = f14;
                                float f15 = iVar.f672e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = f11.getFloat(4, f15);
                                }
                                iVar.f672e = f15;
                                float f16 = iVar.f676j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = f11.getFloat(6, f16);
                                }
                                iVar.f676j = f16;
                                float f17 = iVar.f677k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = f11.getFloat(7, f17);
                                }
                                iVar.f677k = f17;
                                float f18 = iVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = f11.getFloat(5, f18);
                                }
                                iVar.i = f18;
                                int i15 = iVar.f693c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i15 = f11.getInt(13, i15);
                                }
                                iVar.f693c = i15;
                            }
                            f11.recycle();
                            jVar.f682b.add(iVar);
                            if (iVar.getPathName() != null) {
                                bVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f709a = nVar3.f709a;
                            i9 = 1;
                            z10 = false;
                            c9 = '\b';
                            z3 = false;
                        } else {
                            i = depth;
                            c9 = '\b';
                            z3 = false;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f19 = F.b.f(resources, theme, attributeSet, a.f654d);
                                    String string4 = f19.getString(0);
                                    if (string4 != null) {
                                        hVar.f692b = string4;
                                    }
                                    String string5 = f19.getString(1);
                                    if (string5 != null) {
                                        hVar.f691a = S0.f.f(string5);
                                    }
                                    hVar.f693c = !F.b.c(xmlPullParser, "fillType") ? 0 : f19.getInt(2, 0);
                                    f19.recycle();
                                }
                                jVar.f682b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    bVar.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f709a = nVar3.f709a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f20 = F.b.f(resources, theme, attributeSet, a.f652b);
                                float f21 = jVar2.f683c;
                                if (F.b.c(xmlPullParser, "rotation")) {
                                    f21 = f20.getFloat(5, f21);
                                }
                                jVar2.f683c = f21;
                                i9 = 1;
                                jVar2.f684d = f20.getFloat(1, jVar2.f684d);
                                jVar2.f685e = f20.getFloat(2, jVar2.f685e);
                                float f22 = jVar2.f686f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f22 = f20.getFloat(3, f22);
                                }
                                jVar2.f686f = f22;
                                float f23 = jVar2.f687g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f23 = f20.getFloat(4, f23);
                                }
                                jVar2.f687g = f23;
                                float f24 = jVar2.f688h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f24 = f20.getFloat(6, f24);
                                }
                                jVar2.f688h = f24;
                                float f25 = jVar2.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f25 = f20.getFloat(7, f25);
                                }
                                jVar2.i = f25;
                                String string6 = f20.getString(0);
                                if (string6 != null) {
                                    jVar2.f690k = string6;
                                }
                                jVar2.c();
                                f20.recycle();
                                jVar.f682b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    bVar.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f709a = nVar3.f709a;
                            }
                            i9 = 1;
                        }
                        i6 = i9;
                    } else {
                        mVar = mVar3;
                        i = depth;
                        z3 = z9;
                        c9 = '\b';
                        i6 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i11 = i6;
                    z9 = z3;
                    mVar3 = mVar;
                    depth = i;
                }
                if (!z10) {
                    this.f725v = a(nVar.f711c, nVar.f712d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f3.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f728y = true;
        this.f729z = new float[9];
        this.f722A = new Matrix();
        this.f723B = new Rect();
        this.f724u = nVar;
        this.f725v = a(nVar.f711c, nVar.f712d);
    }
}
