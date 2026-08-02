package androidx.compose.foundation.text;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import com.squareup.util.Strings;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public abstract class TextFieldDelegateKt {
    public static final String EmptyTextReplacement = StringsKt__StringsJVMKt.repeat(10, "H");

    public static final long computeSizeForDefaultText(TextStyle textStyle, Density density, FontFamilyResolverImpl fontFamilyResolverImpl, String str, int i) {
        AndroidParagraph m3985ParagraphUl8oQg4$default = Strings.m3985ParagraphUl8oQg4$default(str, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), density, fontFamilyResolverImpl, EmptyList.INSTANCE, i, 64);
        return (BasicTextKt.ceilToIntPx(m3985ParagraphUl8oQg4$default.paragraphIntrinsics.getMinIntrinsicWidth()) << 32) | (BasicTextKt.ceilToIntPx(m3985ParagraphUl8oQg4$default.getHeight()) & BodyPartID.bodyIdMax);
    }
}
