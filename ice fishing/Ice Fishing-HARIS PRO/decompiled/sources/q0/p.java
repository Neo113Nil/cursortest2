package q0;

import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.C0338f;

/* loaded from: classes.dex */
public final class p extends g {
    public static final PorterDuff.Mode j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f4292b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f4293c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f4294d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4295f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f4296g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f4297h;
    public final Rect i;

    public p() {
        this.f4295f = true;
        this.f4296g = new float[9];
        this.f4297h = new Matrix();
        this.i = new Rect();
        n nVar = new n();
        nVar.f4284c = null;
        nVar.f4285d = j;
        nVar.f4283b = new m();
        this.f4292b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4249a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4294d;
        if (colorFilter == null) {
            colorFilter = this.f4293c;
        }
        Matrix matrix = this.f4297h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f4296g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != RecyclerView.f2111C0 || abs4 != RecyclerView.f2111C0) {
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
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), RecyclerView.f2111C0);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f4292b;
        Bitmap bitmap = nVar.f4286f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f4286f.getHeight()) {
            nVar.f4286f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f4289k = true;
        }
        if (this.f4295f) {
            n nVar2 = this.f4292b;
            if (nVar2.f4289k || nVar2.f4287g != nVar2.f4284c || nVar2.f4288h != nVar2.f4285d || nVar2.j != nVar2.e || nVar2.i != nVar2.f4283b.getRootAlpha()) {
                n nVar3 = this.f4292b;
                nVar3.f4286f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f4286f);
                m mVar = nVar3.f4283b;
                mVar.a(mVar.f4275g, m.f4269p, canvas2, min, min2);
                n nVar4 = this.f4292b;
                nVar4.f4287g = nVar4.f4284c;
                nVar4.f4288h = nVar4.f4285d;
                nVar4.i = nVar4.f4283b.getRootAlpha();
                nVar4.j = nVar4.e;
                nVar4.f4289k = false;
            }
        } else {
            n nVar5 = this.f4292b;
            nVar5.f4286f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f4286f);
            m mVar2 = nVar5.f4283b;
            mVar2.a(mVar2.f4275g, m.f4269p, canvas3, min, min2);
        }
        n nVar6 = this.f4292b;
        if (nVar6.f4283b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f4290l == null) {
                Paint paint2 = new Paint();
                nVar6.f4290l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f4290l.setAlpha(nVar6.f4283b.getRootAlpha());
            nVar6.f4290l.setColorFilter(colorFilter);
            paint = nVar6.f4290l;
        }
        canvas.drawBitmap(nVar6.f4286f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getAlpha() : this.f4292b.f4283b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4292b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getColorFilter() : this.f4294d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4249a != null) {
            return new o(this.f4249a.getConstantState());
        }
        this.f4292b.f4282a = getChangingConfigurations();
        return this.f4292b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4292b.f4283b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4292b.f4283b.f4276h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.isAutoMirrored() : this.f4292b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f4292b;
            if (nVar != null) {
                m mVar = nVar.f4283b;
                if (mVar.f4280n == null) {
                    mVar.f4280n = Boolean.valueOf(mVar.f4275g.a());
                }
                if (mVar.f4280n.booleanValue() || ((colorStateList = this.f4292b.f4284c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            n nVar = this.f4292b;
            n nVar2 = new n();
            nVar2.f4284c = null;
            nVar2.f4285d = j;
            if (nVar != null) {
                nVar2.f4282a = nVar.f4282a;
                m mVar = new m(nVar.f4283b);
                nVar2.f4283b = mVar;
                if (nVar.f4283b.e != null) {
                    mVar.e = new Paint(nVar.f4283b.e);
                }
                if (nVar.f4283b.f4273d != null) {
                    nVar2.f4283b.f4273d = new Paint(nVar.f4283b.f4273d);
                }
                nVar2.f4284c = nVar.f4284c;
                nVar2.f4285d = nVar.f4285d;
                nVar2.e = nVar.e;
            }
            this.f4292b = nVar2;
            this.e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f4292b;
        ColorStateList colorStateList = nVar.f4284c;
        if (colorStateList == null || (mode = nVar.f4285d) == null) {
            z2 = false;
        } else {
            this.f4293c = a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        m mVar = nVar.f4283b;
        if (mVar.f4280n == null) {
            mVar.f4280n = Boolean.valueOf(mVar.f4275g.a());
        }
        if (mVar.f4280n.booleanValue()) {
            boolean b2 = nVar.f4283b.f4275g.b(iArr);
            nVar.f4289k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4292b.f4283b.getRootAlpha() != i) {
            this.f4292b.f4283b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4292b.e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4294d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            AbstractC0078a.d0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f4292b;
        if (nVar.f4284c != colorStateList) {
            nVar.f4284c = colorStateList;
            this.f4293c = a(colorStateList, nVar.f4285d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f4292b;
        if (nVar.f4285d != mode) {
            nVar.f4285d = mode;
            this.f4293c = a(nVar.f4284c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4249a;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4249a;
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
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f4249a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f4292b;
        nVar.f4283b = new m();
        TypedArray f2 = F.b.f(resources, theme, attributeSet, AbstractC0332a.f4233a);
        n nVar2 = this.f4292b;
        m mVar2 = nVar2.f4283b;
        int i4 = !F.b.c(xmlPullParser, "tintMode") ? -1 : f2.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
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
        nVar2.f4285d = mode;
        int i6 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (F.b.c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal threadLocal = F.c.f193a;
                try {
                    colorStateList = F.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f4284c = colorStateList2;
        }
        boolean z5 = nVar2.e;
        if (F.b.c(xmlPullParser, "autoMirrored")) {
            z5 = f2.getBoolean(5, z5);
        }
        nVar2.e = z5;
        float f3 = mVar2.j;
        if (F.b.c(xmlPullParser, "viewportWidth")) {
            f3 = f2.getFloat(7, f3);
        }
        mVar2.j = f3;
        float f4 = mVar2.f4277k;
        if (F.b.c(xmlPullParser, "viewportHeight")) {
            f4 = f2.getFloat(8, f4);
        }
        mVar2.f4277k = f4;
        if (mVar2.j <= RecyclerView.f2111C0) {
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f4 > RecyclerView.f2111C0) {
            mVar2.f4276h = f2.getDimension(3, mVar2.f4276h);
            float dimension = f2.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.f4276h <= RecyclerView.f2111C0) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > RecyclerView.f2111C0) {
                float alpha = mVar2.getAlpha();
                if (F.b.c(xmlPullParser, "alpha")) {
                    alpha = f2.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f2.getString(0);
                if (string != null) {
                    mVar2.f4279m = string;
                    mVar2.f4281o.put(string, mVar2);
                }
                f2.recycle();
                nVar.f4282a = getChangingConfigurations();
                nVar.f4289k = true;
                n nVar3 = this.f4292b;
                m mVar3 = nVar3.f4283b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f4275g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        C0338f c0338f = mVar3.f4281o;
                        if (equals) {
                            i iVar = new i();
                            iVar.e = RecyclerView.f2111C0;
                            iVar.f4252g = 1.0f;
                            iVar.f4253h = 1.0f;
                            iVar.i = RecyclerView.f2111C0;
                            iVar.j = 1.0f;
                            iVar.f4254k = RecyclerView.f2111C0;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f4255l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            iVar.f4256m = join3;
                            mVar = mVar3;
                            iVar.f4257n = 4.0f;
                            TypedArray f5 = F.b.f(resources, theme, attributeSet, AbstractC0332a.f4235c);
                            if (F.b.c(xmlPullParser, "pathData")) {
                                String string2 = f5.getString(0);
                                if (string2 != null) {
                                    iVar.f4267b = string2;
                                }
                                String string3 = f5.getString(2);
                                if (string3 != null) {
                                    iVar.f4266a = AbstractC0078a.s(string3);
                                }
                                iVar.f4251f = F.b.b(f5, xmlPullParser, theme, "fillColor", 1);
                                float f6 = iVar.f4253h;
                                if (F.b.c(xmlPullParser, "fillAlpha")) {
                                    f6 = f5.getFloat(12, f6);
                                }
                                iVar.f4253h = f6;
                                int i8 = !F.b.c(xmlPullParser, "strokeLineCap") ? -1 : f5.getInt(8, -1);
                                Paint.Cap cap3 = iVar.f4255l;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                iVar.f4255l = cap;
                                int i9 = !F.b.c(xmlPullParser, "strokeLineJoin") ? -1 : f5.getInt(9, -1);
                                Paint.Join join4 = iVar.f4256m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                iVar.f4256m = join2;
                                float f7 = iVar.f4257n;
                                if (F.b.c(xmlPullParser, "strokeMiterLimit")) {
                                    f7 = f5.getFloat(10, f7);
                                }
                                iVar.f4257n = f7;
                                iVar.f4250d = F.b.b(f5, xmlPullParser, theme, "strokeColor", 3);
                                float f8 = iVar.f4252g;
                                if (F.b.c(xmlPullParser, "strokeAlpha")) {
                                    f8 = f5.getFloat(11, f8);
                                }
                                iVar.f4252g = f8;
                                float f9 = iVar.e;
                                if (F.b.c(xmlPullParser, "strokeWidth")) {
                                    f9 = f5.getFloat(4, f9);
                                }
                                iVar.e = f9;
                                float f10 = iVar.j;
                                if (F.b.c(xmlPullParser, "trimPathEnd")) {
                                    f10 = f5.getFloat(6, f10);
                                }
                                iVar.j = f10;
                                float f11 = iVar.f4254k;
                                if (F.b.c(xmlPullParser, "trimPathOffset")) {
                                    f11 = f5.getFloat(7, f11);
                                }
                                iVar.f4254k = f11;
                                float f12 = iVar.i;
                                if (F.b.c(xmlPullParser, "trimPathStart")) {
                                    f12 = f5.getFloat(5, f12);
                                }
                                iVar.i = f12;
                                int i10 = iVar.f4268c;
                                if (F.b.c(xmlPullParser, "fillType")) {
                                    i10 = f5.getInt(13, i10);
                                }
                                iVar.f4268c = i10;
                            }
                            f5.recycle();
                            jVar.f4259b.add(iVar);
                            if (iVar.getPathName() != null) {
                                c0338f.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f4282a = nVar3.f4282a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            mVar = mVar3;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (F.b.c(xmlPullParser, "pathData")) {
                                    TypedArray f13 = F.b.f(resources, theme, attributeSet, AbstractC0332a.f4236d);
                                    String string4 = f13.getString(0);
                                    if (string4 != null) {
                                        hVar.f4267b = string4;
                                    }
                                    String string5 = f13.getString(1);
                                    if (string5 != null) {
                                        hVar.f4266a = AbstractC0078a.s(string5);
                                    }
                                    hVar.f4268c = !F.b.c(xmlPullParser, "fillType") ? 0 : f13.getInt(2, 0);
                                    f13.recycle();
                                }
                                jVar.f4259b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    c0338f.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f4282a = nVar3.f4282a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f14 = F.b.f(resources, theme, attributeSet, AbstractC0332a.f4234b);
                                float f15 = jVar2.f4260c;
                                if (F.b.c(xmlPullParser, "rotation")) {
                                    f15 = f14.getFloat(5, f15);
                                }
                                jVar2.f4260c = f15;
                                i2 = 1;
                                jVar2.f4261d = f14.getFloat(1, jVar2.f4261d);
                                jVar2.e = f14.getFloat(2, jVar2.e);
                                float f16 = jVar2.f4262f;
                                if (F.b.c(xmlPullParser, "scaleX")) {
                                    f16 = f14.getFloat(3, f16);
                                }
                                jVar2.f4262f = f16;
                                float f17 = jVar2.f4263g;
                                if (F.b.c(xmlPullParser, "scaleY")) {
                                    f17 = f14.getFloat(4, f17);
                                }
                                jVar2.f4263g = f17;
                                float f18 = jVar2.f4264h;
                                if (F.b.c(xmlPullParser, "translateX")) {
                                    f18 = f14.getFloat(6, f18);
                                }
                                jVar2.f4264h = f18;
                                float f19 = jVar2.i;
                                if (F.b.c(xmlPullParser, "translateY")) {
                                    f19 = f14.getFloat(7, f19);
                                }
                                jVar2.i = f19;
                                z3 = false;
                                String string6 = f14.getString(0);
                                if (string6 != null) {
                                    jVar2.f4265k = string6;
                                }
                                jVar2.c();
                                f14.recycle();
                                jVar.f4259b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    c0338f.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f4282a = nVar3.f4282a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        mVar = mVar3;
                        i = depth;
                        i2 = i6;
                        z2 = z4;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z4 = z2;
                    i6 = i2;
                    depth = i;
                    mVar3 = mVar;
                }
                if (!z6) {
                    this.f4293c = a(nVar.f4284c, nVar.f4285d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f4295f = true;
        this.f4296g = new float[9];
        this.f4297h = new Matrix();
        this.i = new Rect();
        this.f4292b = nVar;
        this.f4293c = a(nVar.f4284c, nVar.f4285d);
    }
}
