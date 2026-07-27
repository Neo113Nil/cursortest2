package c0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import b0.C0522b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f5637a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.i f5638b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        L2.i iVar = new L2.i(13);
        this.f5637a = editText;
        this.f5638b = iVar;
        if (androidx.emoji2.text.j.f4887k != null) {
            androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
            if (a9.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a9.f4892e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            C0522b c0522b = (C0522b) fVar.f4882c.f37763u;
            int a10 = c0522b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? ((ByteBuffer) c0522b.f2231w).getInt(a10 + c0522b.f2228n) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f4880a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i4) {
        Editable editableText = this.f5637a.getEditableText();
        this.f5638b.getClass();
        return L2.i.u(this, editableText, i, i4, false) || super.deleteSurroundingText(i, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i4) {
        Editable editableText = this.f5637a.getEditableText();
        this.f5638b.getClass();
        return L2.i.u(this, editableText, i, i4, true) || super.deleteSurroundingTextInCodePoints(i, i4);
    }
}
