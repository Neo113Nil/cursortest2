package androidx.compose.ui.text;

import android.text.Editable;
import android.text.Html;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* loaded from: classes3.dex */
public final class Html_androidKt$TagHandler$1 implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !Intrinsics.areEqual(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new AnnotationContentHandler(xMLReader.getContentHandler(), editable));
    }
}
