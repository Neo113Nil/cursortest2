package defpackage;

import android.text.Editable;
import android.text.Html;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import org.xml.sax.XMLReader;

/* loaded from: classes4.dex */
public final class bx6 implements Html.TagHandler {
    public final mes a;

    public bx6(mes mesVar) {
        this.a = mesVar;
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        str.getClass();
        editable.getClass();
        xMLReader.getClass();
        if (str.equalsIgnoreCase("color")) {
            int length = editable.length();
            mes mesVar = this.a;
            if (z) {
                editable.setSpan(mesVar.invoke(), length, length, 17);
                return;
            }
            Object[] spans = editable.getSpans(0, editable.length(), ForegroundColorSpan.class);
            spans.getClass();
            Object obj = null;
            if (spans.length != 0) {
                int length2 = spans.length;
                while (true) {
                    if (length2 <= 0) {
                        break;
                    }
                    int i = length2 - 1;
                    if (editable.getSpanFlags(spans[i]) == 17) {
                        obj = spans[i];
                        break;
                    }
                    length2--;
                }
            }
            CharacterStyle characterStyle = (CharacterStyle) obj;
            int spanStart = editable.getSpanStart(characterStyle);
            editable.removeSpan(characterStyle);
            if (spanStart != length) {
                editable.setSpan(mesVar.invoke(), spanStart, length, 33);
            }
        }
    }
}
