package com.gamericefishpro.space.f4;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.gamericefishpro.space.a8.b;
import com.gamericefishpro.space.d4.d;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.n.s;
import com.gamericefishpro.space.vb.c;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InputConnectionWrapper {
    public final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        c cVar;
        Bundle bundle2;
        com.gamericefishpro.space.d4.c cVar2;
        if (inputContentInfo == null) {
            cVar = null;
        } else {
            cVar = new c(15, new c(14, inputContentInfo));
        }
        s sVar = (s) this.a.e;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((c) cVar.e).e).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((c) cVar.e).e;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((c) cVar.e).e;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            cVar2 = new c(clipData, 2);
        } else {
            d dVar = new d();
            dVar.e = clipData;
            dVar.i = 2;
            cVar2 = dVar;
        }
        cVar2.d(inputContentInfo3.getLinkUri());
        cVar2.setExtras(bundle2);
        if (l0.h(sVar, cVar2.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
