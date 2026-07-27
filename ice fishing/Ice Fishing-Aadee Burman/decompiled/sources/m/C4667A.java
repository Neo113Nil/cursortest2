package m;

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
import g.AbstractC4518a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4667A {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f38957d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38958a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f38959b;

    /* renamed from: c, reason: collision with root package name */
    public Object f38960c;

    public /* synthetic */ C4667A() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((S0.e) ((I0.j) this.f38960c).f1264u).getClass();
        if (keyListener instanceof c0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new c0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f38958a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f38959b;
                j4.g s9 = j4.g.s(absSeekBar.getContext(), attributeSet, f38957d, i);
                Drawable j6 = s9.j(0);
                if (j6 != null) {
                    if (j6 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) j6;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i6 = 0; i6 < numberOfFrames; i6++) {
                            Drawable e9 = e(animationDrawable.getFrame(i6), true);
                            e9.setLevel(10000);
                            animationDrawable2.addFrame(e9, animationDrawable.getDuration(i6));
                        }
                        animationDrawable2.setLevel(10000);
                        j6 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(j6);
                }
                Drawable j9 = s9.j(1);
                if (j9 != null) {
                    absSeekBar.setProgressDrawable(e(j9, false));
                }
                s9.t();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f38959b).getContext().obtainStyledAttributes(attributeSet, AbstractC4518a.i, i, 0);
                try {
                    boolean z3 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z3);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public c0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        I0.j jVar = (I0.j) this.f38960c;
        if (inputConnection == null) {
            jVar.getClass();
            inputConnection = null;
        } else {
            S0.e eVar = (S0.e) jVar.f1264u;
            eVar.getClass();
            if (!(inputConnection instanceof c0.b)) {
                inputConnection = new c0.b((EditText) eVar.f2781u, inputConnection, editorInfo);
            }
        }
        return (c0.b) inputConnection;
    }

    public void d(boolean z3) {
        c0.i iVar = (c0.i) ((S0.e) ((I0.j) this.f38960c).f1264u).f2782v;
        if (iVar.f5492v != z3) {
            if (iVar.f5491u != null) {
                androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
                c0.h hVar = iVar.f5491u;
                a9.getClass();
                L3.F.f(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a9.f4773a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a9.f4774b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f5492v = z3;
            if (z3) {
                c0.i.a(iVar.f5490n, androidx.emoji2.text.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z3) {
        if (drawable instanceof H.g) {
            ((H.h) ((H.g) drawable)).getClass();
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
                for (int i6 = 0; i6 < numberOfLayers; i6++) {
                    layerDrawable2.setId(i6, layerDrawable.getId(i6));
                    layerDrawable2.setLayerGravity(i6, layerDrawable.getLayerGravity(i6));
                    layerDrawable2.setLayerWidth(i6, layerDrawable.getLayerWidth(i6));
                    layerDrawable2.setLayerHeight(i6, layerDrawable.getLayerHeight(i6));
                    layerDrawable2.setLayerInsetLeft(i6, layerDrawable.getLayerInsetLeft(i6));
                    layerDrawable2.setLayerInsetRight(i6, layerDrawable.getLayerInsetRight(i6));
                    layerDrawable2.setLayerInsetTop(i6, layerDrawable.getLayerInsetTop(i6));
                    layerDrawable2.setLayerInsetBottom(i6, layerDrawable.getLayerInsetBottom(i6));
                    layerDrawable2.setLayerInsetStart(i6, layerDrawable.getLayerInsetStart(i6));
                    layerDrawable2.setLayerInsetEnd(i6, layerDrawable.getLayerInsetEnd(i6));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f38960c) == null) {
                    this.f38960c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C4667A(AbsSeekBar absSeekBar) {
        this.f38959b = absSeekBar;
    }

    public C4667A(EditText editText) {
        this.f38959b = editText;
        this.f38960c = new I0.j(editText);
    }
}
