package X;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f1377a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.e f1378b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        S0.e eVar = new S0.e(14);
        this.f1377a = editText;
        this.f1378b = eVar;
        if (V.j.f1213k != null) {
            V.j a2 = V.j.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            V.f fVar = a2.e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            W.b bVar = (W.b) fVar.f1209c.f28a;
            int a3 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a3 != 0 ? ((ByteBuffer) bVar.f839d).getInt(a3 + bVar.f836a) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f1207a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f1377a.getEditableText();
        this.f1378b.getClass();
        return S0.e.i(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f1377a.getEditableText();
        this.f1378b.getClass();
        return S0.e.i(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
