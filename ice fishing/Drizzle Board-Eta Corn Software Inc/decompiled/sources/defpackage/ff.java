package defpackage;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ff extends InputConnectionWrapper {
    public final TextView qoPGr6Ce;

    public ff(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        this.qoPGr6Ce = textView;
        if (ze.k3x7lurq != null) {
            ze qoPGr6Ce = ze.qoPGr6Ce();
            if (qoPGr6Ce.NCTxEWno() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            ve veVar = qoPGr6Ce.VgvYg0wo;
            veVar.getClass();
            Bundle bundle = editorInfo.extras;
            us usVar = (us) veVar.MdtA4re8.qoPGr6Ce;
            int qoPGr6Ce2 = usVar.qoPGr6Ce(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", qoPGr6Ce2 != 0 ? ((ByteBuffer) usVar.VgvYg0wo).getInt(qoPGr6Ce2 + usVar.NCTxEWno) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return f0.WYNAV5pd(this, this.qoPGr6Ce.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return f0.WYNAV5pd(this, this.qoPGr6Ce.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
