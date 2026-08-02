package androidx.appcompat.widget;

import android.R;
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
import android.util.AttributeSet;
import android.view.View;
import android.view.textclassifier.TextClassifier;
import android.widget.AbsSeekBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes3.dex */
public class AppCompatProgressBarHelper implements AppCompatTextView.SuperCaller {
    public static final int[] TINT_ATTRS = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Object mSampleTile;
    public final View mView;

    public AppCompatProgressBarHelper(AppCompatTextView appCompatTextView) {
        this.mSampleTile = appCompatTextView;
        this.mView = appCompatTextView;
    }

    public int getAutoSizeMaxTextSize() {
        int autoSizeMaxTextSize;
        autoSizeMaxTextSize = super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
        return autoSizeMaxTextSize;
    }

    public int getAutoSizeMinTextSize() {
        int autoSizeMinTextSize;
        autoSizeMinTextSize = super/*android.widget.TextView*/.getAutoSizeMinTextSize();
        return autoSizeMinTextSize;
    }

    public int getAutoSizeStepGranularity() {
        int autoSizeStepGranularity;
        autoSizeStepGranularity = super/*android.widget.TextView*/.getAutoSizeStepGranularity();
        return autoSizeStepGranularity;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        int[] autoSizeTextAvailableSizes;
        autoSizeTextAvailableSizes = super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
        return autoSizeTextAvailableSizes;
    }

    public int getAutoSizeTextType() {
        int autoSizeTextType;
        autoSizeTextType = super/*android.widget.TextView*/.getAutoSizeTextType();
        return autoSizeTextType;
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier;
        textClassifier = super/*android.widget.TextView*/.getTextClassifier();
        return textClassifier;
    }

    public void loadFromAttributes(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.mView;
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, 0, absSeekBar.getContext(), attributeSet, TINT_ATTRS);
        Drawable drawableIfKnown = obtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            if (drawableIfKnown instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableIfKnown;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable tileify = tileify(animationDrawable.getFrame(i2), true);
                    tileify.setLevel(10000);
                    animationDrawable2.addFrame(tileify, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableIfKnown = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableIfKnown);
        }
        Drawable drawableIfKnown2 = obtainStyledAttributes.getDrawableIfKnown(1);
        if (drawableIfKnown2 != null) {
            absSeekBar.setProgressDrawable(tileify(drawableIfKnown2, false));
        }
        obtainStyledAttributes.recycle();
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i);
    }

    public void setFirstBaselineToTopHeight(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    public void setLastBaselineToBottomHeight(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
    public void setLineHeight(int i, float f) {
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    public Drawable tileify(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.mSampleTile) == null) {
                this.mSampleTile = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = tileify(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
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

    public AppCompatProgressBarHelper(AbsSeekBar absSeekBar) {
        this.mView = absSeekBar;
    }
}
