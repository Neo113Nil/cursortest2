package com.gamericefishpro.space.u4;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.s4.h implements Runnable {
    public final WeakReference d;

    public j(EditText editText) {
        this.d = new WeakReference(editText);
    }

    @Override // com.gamericefishpro.space.s4.h
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.d.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.a((EditText) this.d.get(), 1);
    }
}
