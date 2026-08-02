package c0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import b0.C0516b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f5625a;

    /* renamed from: b, reason: collision with root package name */
    public final G3.e f5626b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        G3.e eVar = new G3.e(15);
        this.f5625a = editText;
        this.f5626b = eVar;
        if (androidx.emoji2.text.j.f4740k != null) {
            androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
            if (a9.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a9.f4745e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            C0516b c0516b = (C0516b) fVar.f4735c.f2931u;
            int a10 = c0516b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? ((ByteBuffer) c0516b.f2133w).getInt(a10 + c0516b.f2130n) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f4733a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i4) {
        Editable editableText = this.f5625a.getEditableText();
        this.f5626b.getClass();
        return G3.e.r(this, editableText, i, i4, false) || super.deleteSurroundingText(i, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i4) {
        Editable editableText = this.f5625a.getEditableText();
        this.f5626b.getClass();
        return G3.e.r(this, editableText, i, i4, true) || super.deleteSurroundingTextInCodePoints(i, i4);
    }
}
