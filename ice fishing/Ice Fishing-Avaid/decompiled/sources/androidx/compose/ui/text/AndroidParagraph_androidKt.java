package androidx.compose.ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.ui.text.android.SpannedExtensions_androidKt;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.style.IndentationFixSpan;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* compiled from: AndroidParagraph.android.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0005\u001a\u0017\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a\u0017\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0005\u001a\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0005\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002\u001a\f\u0010\u001e\u001a\u00020\u001f*\u00020\u001fH\u0002\u001a\u0013\u0010 \u001a\u00020\u0001*\u00020!H\u0002¢\u0006\u0004\b\"\u0010\u0005¨\u0006#"}, d2 = {"toLayoutAlign", "", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-aXe7zB0", "(I)I", "toLayoutHyphenationFrequency", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "toLayoutHyphenationFrequency--3fSNIE", "toLayoutBreakStrategy", "breakStrategy", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "toLayoutBreakStrategy-xImikfE", "toLayoutLineBreakStyle", "lineBreakStrictness", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "toLayoutLineBreakStyle-hpcqdu8", "toLayoutLineBreakWordStyle", "lineBreakWordStyle", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "toLayoutLineBreakWordStyle-wPN0Rpw", "numberOfLinesThatFitMaxHeight", "Landroidx/compose/ui/text/android/TextLayout;", "maxHeight", "shouldAttachIndentationFixSpan", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "ellipsis", "attachIndentationFixSpan", "", "toLayoutTextGranularity", "Landroidx/compose/ui/text/TextGranularity;", "toLayoutTextGranularity-duNsdkg", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes3.dex */
public final class AndroidParagraph_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutAlign-aXe7zB0, reason: not valid java name */
    public static final int m8940toLayoutAlignaXe7zB0(int i) {
        if (TextAlign.m9596equalsimpl0(i, TextAlign.INSTANCE.m9603getLefte0LSkKk())) {
            return 3;
        }
        if (TextAlign.m9596equalsimpl0(i, TextAlign.INSTANCE.m9604getRighte0LSkKk())) {
            return 4;
        }
        if (TextAlign.m9596equalsimpl0(i, TextAlign.INSTANCE.m9600getCentere0LSkKk())) {
            return 2;
        }
        return (!TextAlign.m9596equalsimpl0(i, TextAlign.INSTANCE.m9605getStarte0LSkKk()) && TextAlign.m9596equalsimpl0(i, TextAlign.INSTANCE.m9601getEnde0LSkKk())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency--3fSNIE, reason: not valid java name */
    public static final int m8942toLayoutHyphenationFrequency3fSNIE(int i) {
        if (Hyphens.m9488equalsimpl0(i, Hyphens.INSTANCE.m9492getAutovmbZdU8())) {
            return Build.VERSION.SDK_INT <= 32 ? 2 : 4;
        }
        Hyphens.m9488equalsimpl0(i, Hyphens.INSTANCE.m9493getNonevmbZdU8());
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-xImikfE, reason: not valid java name */
    public static final int m8941toLayoutBreakStrategyxImikfE(int i) {
        if (LineBreak.Strategy.m9522equalsimpl0(i, LineBreak.Strategy.INSTANCE.m9528getSimplefcGXIks())) {
            return 0;
        }
        if (LineBreak.Strategy.m9522equalsimpl0(i, LineBreak.Strategy.INSTANCE.m9527getHighQualityfcGXIks())) {
            return 1;
        }
        return LineBreak.Strategy.m9522equalsimpl0(i, LineBreak.Strategy.INSTANCE.m9526getBalancedfcGXIks()) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-hpcqdu8, reason: not valid java name */
    public static final int m8943toLayoutLineBreakStylehpcqdu8(int i) {
        if (LineBreak.Strictness.m9533equalsimpl0(i, LineBreak.Strictness.INSTANCE.m9537getDefaultusljTpc())) {
            return 0;
        }
        if (LineBreak.Strictness.m9533equalsimpl0(i, LineBreak.Strictness.INSTANCE.m9538getLooseusljTpc())) {
            return 1;
        }
        if (LineBreak.Strictness.m9533equalsimpl0(i, LineBreak.Strictness.INSTANCE.m9539getNormalusljTpc())) {
            return 2;
        }
        return LineBreak.Strictness.m9533equalsimpl0(i, LineBreak.Strictness.INSTANCE.m9540getStrictusljTpc()) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-wPN0Rpw, reason: not valid java name */
    public static final int m8944toLayoutLineBreakWordStylewPN0Rpw(int i) {
        return (!LineBreak.WordBreak.m9545equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m9549getDefaultjp8hJ3c()) && LineBreak.WordBreak.m9545equalsimpl0(i, LineBreak.WordBreak.INSTANCE.m9550getPhrasejp8hJ3c())) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > i) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        return (!z || TextUnit.m9927equalsimpl0(textStyle.m9177getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m9927equalsimpl0(textStyle.m9177getLetterSpacingXSAIIZE(), TextUnit.INSTANCE.m9941getUnspecifiedXSAIIZE()) || TextAlign.m9596equalsimpl0(textStyle.m9182getTextAligne0LSkKk(), TextAlign.INSTANCE.m9606getUnspecifiede0LSkKk()) || TextAlign.m9596equalsimpl0(textStyle.m9182getTextAligne0LSkKk(), TextAlign.INSTANCE.m9605getStarte0LSkKk()) || TextAlign.m9596equalsimpl0(textStyle.m9182getTextAligne0LSkKk(), TextAlign.INSTANCE.m9602getJustifye0LSkKk())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        if (charSequence.length() == 0) {
            return charSequence;
        }
        SpannableString spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : null;
        if (spannableString == null) {
            spannableString = new SpannableString(charSequence);
        }
        if (!SpannedExtensions_androidKt.hasSpan(spannableString, IndentationFixSpan.class)) {
            SpannableExtensions_androidKt.setSpan(spannableString, new IndentationFixSpan(), spannableString.length() - 1, spannableString.length() - 1);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toLayoutTextGranularity-duNsdkg, reason: not valid java name */
    public static final int m8945toLayoutTextGranularityduNsdkg(int i) {
        return (!TextGranularity.m9098equalsimpl0(i, TextGranularity.INSTANCE.m9102getCharacterDRrd7Zo()) && TextGranularity.m9098equalsimpl0(i, TextGranularity.INSTANCE.m9103getWordDRrd7Zo())) ? 1 : 0;
    }
}
