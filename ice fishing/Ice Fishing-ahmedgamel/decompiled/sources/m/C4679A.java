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
import com.google.android.gms.internal.ads.C3067cm;
import g.AbstractC4528a;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: m.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4679A {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f39025d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39026a = 2;

    /* renamed from: b, reason: collision with root package name */
    public View f39027b;

    /* renamed from: c, reason: collision with root package name */
    public Object f39028c;

    public /* synthetic */ C4679A() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((C3067cm) ((n4.c) this.f39028c).f39658u).getClass();
        if (keyListener instanceof c0.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new c0.e(keyListener);
    }

    public void b(AttributeSet attributeSet, int i) {
        switch (this.f39026a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f39027b;
                l4.g s9 = l4.g.s(absSeekBar.getContext(), attributeSet, f39025d, i);
                Drawable j6 = s9.j(0);
                if (j6 != null) {
                    if (j6 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) j6;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable e9 = e(animationDrawable.getFrame(i4), true);
                            e9.setLevel(10000);
                            animationDrawable2.addFrame(e9, animationDrawable.getDuration(i4));
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
                TypedArray obtainStyledAttributes = ((EditText) this.f39027b).getContext().obtainStyledAttributes(attributeSet, AbstractC4528a.i, i, 0);
                try {
                    boolean z6 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
                    obtainStyledAttributes.recycle();
                    d(z6);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public c0.b c(InputConnection inputConnection, EditorInfo editorInfo) {
        n4.c cVar = (n4.c) this.f39028c;
        if (inputConnection == null) {
            cVar.getClass();
            inputConnection = null;
        } else {
            C3067cm c3067cm = (C3067cm) cVar.f39658u;
            c3067cm.getClass();
            if (!(inputConnection instanceof c0.b)) {
                inputConnection = new c0.b((EditText) c3067cm.f30365u, inputConnection, editorInfo);
            }
        }
        return (c0.b) inputConnection;
    }

    public void d(boolean z6) {
        c0.i iVar = (c0.i) ((C3067cm) ((n4.c) this.f39028c).f39658u).f30366v;
        if (iVar.f5640v != z6) {
            if (iVar.f5639u != null) {
                androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
                c0.h hVar = iVar.f5639u;
                a9.getClass();
                A8.b.e(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a9.f4741a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a9.f4742b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f5640v = z6;
            if (z6) {
                c0.i.a(iVar.f5638n, androidx.emoji2.text.j.a().b());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z6) {
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
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    layerDrawable2.setId(i4, layerDrawable.getId(i4));
                    layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
                    layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
                    layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
                    layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
                    layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
                    layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
                    layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
                    layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
                    layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f39028c) == null) {
                    this.f39028c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C4679A(AbsSeekBar absSeekBar) {
        this.f39027b = absSeekBar;
    }

    public C4679A(EditText editText) {
        this.f39027b = editText;
        this.f39028c = new n4.c(editText);
    }
}
