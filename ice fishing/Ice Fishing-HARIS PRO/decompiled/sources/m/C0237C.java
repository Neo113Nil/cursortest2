package m;

import a.AbstractC0078a;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import g.AbstractC0155a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: m.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0237C {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3793d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3794a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f3795b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3796c;

    public /* synthetic */ C0237C() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((F.i) ((B.b) this.f3796c).f10b).getClass();
        if (keyListener instanceof X.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new X.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f3794a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f3795b;
                M0.h i2 = M0.h.i(absSeekBar.getContext(), attributeSet, f3793d, i);
                Drawable d2 = i2.d(0);
                if (d2 != null) {
                    if (d2 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) d2;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i3 = 0; i3 < numberOfFrames; i3++) {
                            Drawable e = e(animationDrawable.getFrame(i3), true);
                            e.setLevel(10000);
                            animationDrawable2.addFrame(e, animationDrawable.getDuration(i3));
                        }
                        animationDrawable2.setLevel(10000);
                        d2 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(d2);
                }
                Drawable d3 = i2.d(1);
                if (d3 != null) {
                    absSeekBar.setProgressDrawable(e(d3, false));
                }
                i2.l();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f3795b).getContext().obtainStyledAttributes(attributeSet, AbstractC0155a.i, i, 0);
                try {
                    boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public X.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        B.b bVar = (B.b) this.f3796c;
        if (inputConnection == null) {
            bVar.getClass();
            inputConnection = null;
        } else {
            F.i iVar = (F.i) bVar.f10b;
            iVar.getClass();
            if (!(inputConnection instanceof X.b)) {
                inputConnection = new X.b((EditText) iVar.f208b, inputConnection, editorInfo);
            }
        }
        return (X.b) inputConnection;
    }

    public void d(boolean z2) {
        X.i iVar = (X.i) ((F.i) ((B.b) this.f3796c).f10b).f209c;
        if (iVar.f1392c != z2) {
            if (iVar.f1391b != null) {
                V.j a2 = V.j.a();
                X.h hVar = iVar.f1391b;
                a2.getClass();
                AbstractC0078a.g(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a2.f1214a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a2.f1215b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f1392c = z2;
            if (z2) {
                X.i.a(iVar.f1390a, V.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z2) {
        if (drawable instanceof H.a) {
            ((H.b) ((H.a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = e(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                    layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
                    layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
                    layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
                    layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
                    layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
                    layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
                    layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
                    layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
                    layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f3796c) == null) {
                    this.f3796c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C0237C(AbsSeekBar absSeekBar) {
        this.f3795b = absSeekBar;
    }

    public C0237C(EditText editText) {
        this.f3795b = editText;
        this.f3796c = new B.b(editText);
    }
}
