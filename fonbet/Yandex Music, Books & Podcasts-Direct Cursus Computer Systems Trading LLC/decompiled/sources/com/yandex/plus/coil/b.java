package com.yandex.plus.coil;

import android.content.Context;
import android.widget.ImageView;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.k;
import defpackage.mmo;
import defpackage.pce;
import defpackage.skn;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class b implements com.yandex.plus.core.imageloader.b {
    public final Context a;
    public final skn b;
    public final WeakHashMap c = new WeakHashMap();

    public b(Context context) {
        this.a = context;
        this.b = new mmo(context).k();
    }

    public final void a(ImageView imageView) {
        imageView.getClass();
        k.c(imageView).c();
    }

    public final f b(String str) {
        pce pceVar = new pce(this.a);
        pceVar.c = str;
        return new f(3, pceVar, this);
    }
}
