package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;

/* compiled from: MultiParagraphLayoutCache.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0082\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"times", "Landroidx/compose/ui/unit/TextUnit;", "other", "times-NB67dxo", "(JJ)J", "DefaultFontSize", "J", "foundation"}, k = 2, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCacheKt {
    private static final long DefaultFontSize = TextUnitKt.getSp(14);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: times-NB67dxo, reason: not valid java name */
    public static final long m2286timesNB67dxo(long j, long j2) {
        if (TextUnit.m9932isEmimpl(j2)) {
            if (TextUnit.m9932isEmimpl(j)) {
                throw new IllegalStateException("Cannot convert Em to Px when style.fontSize is Em (" + ((Object) TextUnit.m9937toStringimpl(j2)) + "). Please declare the style.fontSize with Sp units instead.");
            }
            if (TextUnit.m9928getRawTypeimpl(j) == 0) {
                long j3 = DefaultFontSize;
                float m9930getValueimpl = TextUnit.m9930getValueimpl(j2);
                TextUnitKt.m9943checkArithmeticR2X_6o(j3);
                return TextUnitKt.pack(TextUnit.m9928getRawTypeimpl(j3), TextUnit.m9930getValueimpl(j3) * m9930getValueimpl);
            }
            float m9930getValueimpl2 = TextUnit.m9930getValueimpl(j2);
            TextUnitKt.m9943checkArithmeticR2X_6o(j);
            return TextUnitKt.pack(TextUnit.m9928getRawTypeimpl(j), TextUnit.m9930getValueimpl(j) * m9930getValueimpl2);
        }
        throw new IllegalArgumentException("The multiplier must be in em, but was " + ((Object) TextUnit.m9937toStringimpl(j2)) + '.');
    }
}
