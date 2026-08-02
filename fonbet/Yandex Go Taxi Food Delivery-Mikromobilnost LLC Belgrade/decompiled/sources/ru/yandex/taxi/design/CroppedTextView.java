package ru.yandex.taxi.design;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ci8;
import defpackage.jl40;
import defpackage.jst;
import defpackage.lyc;
import defpackage.oyr;
import defpackage.rg3;
import defpackage.sls;
import defpackage.smw0;
import defpackage.tls;
import defpackage.vfc;
import defpackage.w511;
import defpackage.xbf;
import defpackage.yi;
import defpackage.yty0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.CroppedTextView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000 *2\u00020\u0001:\u0002+,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)¨\u0006-"}, d2 = {"Lru/yandex/taxi/design/CroppedTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "getTextByState", "()Ljava/lang/CharSequence;", "Lzy11;", "setExpandOnClickListener", "()V", "showFullTextWithAnimation", "", "isAllLinesVisible", "()Z", "Lru/yandex/taxi/design/CroppedTextView$a;", "textModel", "expanded", "expandable", "setModel", "(Lru/yandex/taxi/design/CroppedTextView$a;ZZ)V", "Lkotlin/Function1;", "onExpandChangedListener", "Ltls;", "getOnExpandChangedListener", "()Ltls;", "setOnExpandChangedListener", "(Ltls;)V", "Lkotlin/Function0;", "onTextClick", "Lsls;", "getOnTextClick", "()Lsls;", "setOnTextClick", "(Lsls;)V", "Lru/yandex/taxi/design/CroppedTextView$a;", "Z", "Companion", "a", "xbf", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class CroppedTextView extends RobotoTextView {
    public static final int $stable = 8;
    public static final xbf Companion = new xbf();
    private static final long TIME_OF_EXPANDING = 300;
    private boolean expandable;
    private boolean expanded;
    private tls onExpandChangedListener;
    private sls onTextClick;
    private a textModel;

    public CroppedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textModel = new a(0);
        this.expandable = true;
    }

    private final CharSequence getTextByState() {
        int lineStart;
        int lineEnd;
        int i;
        boolean z = this.expanded;
        a aVar = this.textModel;
        if (z) {
            return aVar.a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(aVar.c);
        spannableStringBuilder.append(aVar.b);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        float measureText = yty0.b(this, spannedString).measureText(spannedString, 0, spannedString.length());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        CharSequence charSequence = aVar.a;
        StaticLayout a2 = yty0.a(this, charSequence);
        int i2 = aVar.d;
        do {
            i2--;
            lineStart = a2.getLineStart(i2);
            lineEnd = a2.getLineEnd(i2) - 1;
            if (lineStart != lineEnd) {
                break;
            }
        } while (i2 > 0);
        Pair pair = new Pair(Integer.valueOf(lineStart), Integer.valueOf(lineEnd));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        while (true) {
            i = intValue + 1;
            if (intValue2 <= i) {
                break;
            }
            CharSequence subSequence = charSequence.subSequence(intValue, intValue2);
            if (yty0.b(this, subSequence).measureText(subSequence, 0, subSequence.length()) + measureText < measuredWidth && Character.isLetterOrDigit(charSequence.charAt(intValue2 - 1))) {
                break;
            }
            intValue2--;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (intValue2 > i) {
            spannableStringBuilder2.append(charSequence.subSequence(0, intValue2));
        }
        spannableStringBuilder2.append((CharSequence) spannedString);
        return new SpannedString(spannableStringBuilder2);
    }

    private final boolean isAllLinesVisible() {
        return yty0.a(this, this.textModel.a).getLineCount() <= this.textModel.d;
    }

    private final void setExpandOnClickListener() {
        ru.yandex.taxi.design.utils.c.z(new lyc(29, this), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setExpandOnClickListener$lambda$0(CroppedTextView croppedTextView) {
        if (!croppedTextView.expanded && croppedTextView.expandable) {
            croppedTextView.setOnClickListener(new ci8(15, croppedTextView));
            croppedTextView.showFullTextWithAnimation();
        }
        sls slsVar = croppedTextView.onTextClick;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setExpandOnClickListener$lambda$0$0(CroppedTextView croppedTextView, View view) {
        sls slsVar = croppedTextView.onTextClick;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public static /* synthetic */ void setModel$default(CroppedTextView croppedTextView, a aVar, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: setModel");
            return;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = true;
        }
        croppedTextView.setModel(aVar, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setModel$lambda$0(CroppedTextView croppedTextView, boolean z) {
        tls tlsVar;
        boolean z2 = croppedTextView.expanded || croppedTextView.isAllLinesVisible();
        croppedTextView.expanded = z2;
        if (z2 != z && (tlsVar = croppedTextView.onExpandChangedListener) != null) {
            tlsVar.invoke(Boolean.valueOf(z2));
        }
        croppedTextView.setText(croppedTextView.getTextByState());
        croppedTextView.setExpandOnClickListener();
    }

    private final void showFullTextWithAnimation() {
        ValueAnimator ofInt = ValueAnimator.ofInt(getHeight(), yty0.a(this, this.textModel.a).getHeight());
        ofInt.setDuration(300L);
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.design.CroppedTextView$showFullTextWithAnimation$lambda$0$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                CroppedTextView.a aVar;
                CroppedTextView croppedTextView = CroppedTextView.this;
                aVar = croppedTextView.textModel;
                croppedTextView.setText(aVar.a);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: ru.yandex.taxi.design.CroppedTextView$showFullTextWithAnimation$lambda$0$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                CroppedTextView.this.expanded = true;
                tls onExpandChangedListener = CroppedTextView.this.getOnExpandChangedListener();
                if (onExpandChangedListener != null) {
                    onExpandChangedListener.invoke(Boolean.TRUE);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ofInt.addUpdateListener(new yi(15, this));
        ofInt.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showFullTextWithAnimation$lambda$0$2(CroppedTextView croppedTextView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        if (num != null) {
            int intValue = num.intValue();
            if (croppedTextView.isAttachedToWindow()) {
                croppedTextView.setHeight(intValue);
            }
        }
    }

    public final tls getOnExpandChangedListener() {
        return this.onExpandChangedListener;
    }

    public final sls getOnTextClick() {
        return this.onTextClick;
    }

    public final void setModel(a textModel, boolean expanded, boolean expandable) {
        this.textModel = textModel;
        this.expanded = expanded;
        this.expandable = expandable;
        int i = textModel.d;
        if (i < 1) {
            jst.e.j(new IllegalStateException(oyr.i(i, "TextModel#shortTextLines should be >= 1, actual: ")));
            this.textModel = new a(textModel.a, textModel.b, textModel.c, Integer.MAX_VALUE);
        }
        post(new rg3(this, expanded, 5));
    }

    public final void setOnExpandChangedListener(tls tlsVar) {
        this.onExpandChangedListener = tlsVar;
    }

    public final void setOnTextClick(sls slsVar) {
        this.onTextClick = slsVar;
    }

    public static final class a {
        public final CharSequence a;
        public final CharSequence b;
        public final CharSequence c;
        public final int d;

        public a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
            this.a = charSequence;
            this.b = charSequence2;
            this.c = charSequence3;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b) && jl40.l(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder r = vfc.r(this.a, this.b, "CroppedTextModel(text=", ", moreButtonText=", ", ellipsisText=");
            r.append((Object) this.c);
            r.append(", shortTextLines=");
            r.append(this.d);
            r.append(Extension.C_BRAKE);
            return r.toString();
        }

        public /* synthetic */ a(int i) {
            this("", "", "", Integer.MAX_VALUE);
        }

        public a() {
            this(0);
        }
    }

    public CroppedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CroppedTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CroppedTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
