package defpackage;

import android.text.Editable;
import android.text.Html;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* loaded from: classes.dex */
public final class v4e implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !Intrinsics.d(str, "ContentHandlerReplacementTag")) {
            return;
        }
        xMLReader.setContentHandler(new sn0(xMLReader.getContentHandler(), editable));
    }
}
