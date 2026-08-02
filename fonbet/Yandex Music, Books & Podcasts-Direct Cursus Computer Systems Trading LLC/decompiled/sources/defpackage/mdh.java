package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.a;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public class mdh extends Drawable.ConstantState {
    public eup a;
    public her b;
    public u2b c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public int q;
    public Paint.Style r;

    public mdh(mdh mdhVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = mdhVar.a;
        this.b = mdhVar.b;
        this.c = mdhVar.c;
        this.k = mdhVar.k;
        this.d = mdhVar.d;
        this.e = mdhVar.e;
        this.g = mdhVar.g;
        this.f = mdhVar.f;
        this.l = mdhVar.l;
        this.i = mdhVar.i;
        this.q = mdhVar.q;
        this.o = mdhVar.o;
        this.j = mdhVar.j;
        this.m = mdhVar.m;
        this.n = mdhVar.n;
        this.p = mdhVar.p;
        this.r = mdhVar.r;
        if (mdhVar.h != null) {
            this.h = new Rect(mdhVar.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        a aVar = new a(this);
        aVar.f = true;
        aVar.g = true;
        return aVar;
    }

    public mdh(eup eupVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = KotlinVersion.MAX_COMPONENT_VALUE;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = eupVar;
        this.c = null;
    }
}
