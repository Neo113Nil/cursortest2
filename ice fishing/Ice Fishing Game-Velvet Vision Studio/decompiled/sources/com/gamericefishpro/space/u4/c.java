package com.gamericefishpro.space.u4;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends InputConnectionWrapper {
    public final EditText a;
    public final b b;

    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        b bVar = new b();
        super(inputConnection, false);
        this.a = editText;
        this.b = bVar;
        if (com.gamericefishpro.space.s4.k.c()) {
            com.gamericefishpro.space.s4.k kVarA = com.gamericefishpro.space.s4.k.a();
            if (kVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            com.gamericefishpro.space.s4.e eVar = kVarA.e;
            eVar.getClass();
            Bundle bundle = editorInfo.extras;
            com.gamericefishpro.space.t4.b bVar2 = (com.gamericefishpro.space.t4.b) eVar.c.d;
            int iA = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar2.v).getInt(iA + bVar2.d) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return b.b(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return b.b(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
