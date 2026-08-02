package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;

/* loaded from: classes.dex */
public final class jmo extends u7g {
    public final /* synthetic */ int c;
    public float d;
    public final float e;
    public final /* synthetic */ mmo f;
    public final Object g;

    public jmo(mmo mmoVar, float f, float f2) {
        this.c = 1;
        this.f = mmoVar;
        this.g = new RectF();
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.u7g
    public final boolean F(ylo yloVar) {
        switch (this.c) {
            case 0:
                if (!(yloVar instanceof zlo)) {
                    return true;
                }
                Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
                return false;
            default:
                if (!(yloVar instanceof zlo)) {
                    return true;
                }
                zlo zloVar = (zlo) yloVar;
                llo H = yloVar.a.H(zloVar.n);
                if (H == null) {
                    mmo.O("TextPath path reference '%s' not found", zloVar.n);
                } else {
                    xko xkoVar = (xko) H;
                    gmo gmoVar = new gmo(xkoVar.o);
                    Matrix matrix = xkoVar.n;
                    Path path = gmoVar.a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.g).union(rectF);
                }
                return false;
        }
    }

    @Override // defpackage.u7g
    public final void S(String str) {
        String str2;
        switch (this.c) {
            case 0:
                mmo mmoVar = this.f;
                if (mmoVar.d1()) {
                    Path path = new Path();
                    str2 = str;
                    ((kmo) mmoVar.d).d.getTextPath(str2, 0, str.length(), this.d, this.e, path);
                    ((Path) this.g).addPath(path);
                } else {
                    str2 = str;
                }
                this.d = ((kmo) mmoVar.d).d.measureText(str2) + this.d;
                break;
            default:
                mmo mmoVar2 = this.f;
                if (mmoVar2.d1()) {
                    Rect rect = new Rect();
                    ((kmo) mmoVar2.d).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.d, this.e);
                    ((RectF) this.g).union(rectF);
                }
                this.d = ((kmo) mmoVar2.d).d.measureText(str) + this.d;
                break;
        }
    }

    public jmo(mmo mmoVar, float f, float f2, Path path) {
        this.c = 0;
        this.f = mmoVar;
        this.d = f;
        this.e = f2;
        this.g = path;
    }
}
