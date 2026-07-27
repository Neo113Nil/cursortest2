package c0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import b0.C0512b;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f5477a;

    /* renamed from: b, reason: collision with root package name */
    public final E3.e f5478b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        E3.e eVar = new E3.e();
        this.f5477a = editText;
        this.f5478b = eVar;
        if (androidx.emoji2.text.j.f4772k != null) {
            androidx.emoji2.text.j a9 = androidx.emoji2.text.j.a();
            if (a9.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a9.f4777e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            C0512b c0512b = (C0512b) fVar.f4767c.f2788u;
            int a10 = c0512b.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? ((ByteBuffer) c0512b.f2045w).getInt(a10 + c0512b.f2042n) : 0);
            Bundle bundle2 = editorInfo.extras;
            fVar.f4765a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i6) {
        Editable editableText = this.f5477a.getEditableText();
        this.f5478b.getClass();
        return E3.e.y(this, editableText, i, i6, false) || super.deleteSurroundingText(i, i6);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i6) {
        Editable editableText = this.f5477a.getEditableText();
        this.f5478b.getClass();
        return E3.e.y(this, editableText, i, i6, true) || super.deleteSurroundingTextInCodePoints(i, i6);
    }
}
