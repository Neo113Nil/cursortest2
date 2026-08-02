package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.LanguageFeatureSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SubtitleView extends FrameLayout {
    public boolean applyEmbeddedFontSizes;
    public boolean applyEmbeddedStyles;
    public float bottomPaddingFraction;
    public List cues;
    public float defaultTextSize;
    public int defaultTextSizeType;
    public View innerSubtitleView;
    public Output output;
    public CaptionStyleCompat style;
    public int viewType;

    public interface Output {
        void update(List list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2);
    }

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.cues = Collections.EMPTY_LIST;
        this.style = CaptionStyleCompat.DEFAULT;
        this.defaultTextSizeType = 0;
        this.defaultTextSize = 0.0533f;
        this.bottomPaddingFraction = 0.08f;
        this.applyEmbeddedStyles = true;
        this.applyEmbeddedFontSizes = true;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context);
        this.output = canvasSubtitleOutput;
        this.innerSubtitleView = canvasSubtitleOutput;
        addView(canvasSubtitleOutput);
        this.viewType = 1;
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.applyEmbeddedFontSizes = z;
        updateOutput();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.applyEmbeddedStyles = z;
        updateOutput();
    }

    public void setBottomPaddingFraction(float f) {
        this.bottomPaddingFraction = f;
        updateOutput();
    }

    public void setCues(List<Cue> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.cues = list;
        updateOutput();
    }

    public void setFixedTextSize(int i, float f) {
        Context context = getContext();
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        this.defaultTextSizeType = 2;
        this.defaultTextSize = applyDimension;
        updateOutput();
    }

    public void setFractionalTextSize(float f, boolean z) {
        this.defaultTextSizeType = z ? 1 : 0;
        this.defaultTextSize = f;
        updateOutput();
    }

    public void setStyle(CaptionStyleCompat captionStyleCompat) {
        this.style = captionStyleCompat;
        updateOutput();
    }

    public void setUserDefaultStyle() {
        CaptionStyleCompat captionStyleCompat;
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager == null || !captioningManager.isEnabled()) {
            captionStyleCompat = CaptionStyleCompat.DEFAULT;
        } else {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            captionStyleCompat = new CaptionStyleCompat(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        setStyle(captionStyleCompat);
    }

    public void setUserDefaultTextSize() {
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        setFractionalTextSize(((captioningManager == null || !captioningManager.isEnabled()) ? 1.0f : captioningManager.getFontScale()) * 0.0533f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setView(View view) {
        removeView(this.innerSubtitleView);
        View view2 = this.innerSubtitleView;
        if (view2 instanceof WebViewSubtitleOutput) {
            ((WebViewSubtitleOutput) view2).webView.destroy();
        }
        this.innerSubtitleView = view;
        this.output = (Output) view;
        addView(view);
    }

    public void setViewType(int i) {
        if (this.viewType == i) {
            return;
        }
        if (i == 1) {
            setView(new CanvasSubtitleOutput(getContext()));
        } else {
            if (i != 2) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return;
            }
            setView(new WebViewSubtitleOutput(getContext()));
        }
        this.viewType = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.ui.SubtitleView$Output] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    public final void updateOutput() {
        ?? arrayList;
        ?? r0 = this.output;
        if (this.applyEmbeddedStyles && this.applyEmbeddedFontSizes) {
            arrayList = this.cues;
        } else {
            arrayList = new ArrayList(this.cues.size());
            for (int i = 0; i < this.cues.size(); i++) {
                Cue.Builder buildUpon = ((Cue) this.cues.get(i)).buildUpon();
                if (!this.applyEmbeddedStyles) {
                    buildUpon.windowColorSet = false;
                    CharSequence charSequence = buildUpon.text;
                    if (charSequence instanceof Spanned) {
                        if (!(charSequence instanceof Spannable)) {
                            buildUpon.text = SpannableString.valueOf(charSequence);
                            buildUpon.bitmap = null;
                        }
                        CharSequence charSequence2 = buildUpon.text;
                        charSequence2.getClass();
                        Spannable spannable = (Spannable) charSequence2;
                        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                            if (!(obj instanceof LanguageFeatureSpan)) {
                                spannable.removeSpan(obj);
                            }
                        }
                    }
                    SubtitleViewUtils.removeEmbeddedFontSizes(buildUpon);
                } else if (!this.applyEmbeddedFontSizes) {
                    SubtitleViewUtils.removeEmbeddedFontSizes(buildUpon);
                }
                arrayList.add(buildUpon.build());
            }
        }
        r0.update(arrayList, this.style, this.defaultTextSize, this.defaultTextSizeType, this.bottomPaddingFraction);
    }

    public void setFractionalTextSize(float f) {
        setFractionalTextSize(f, false);
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
