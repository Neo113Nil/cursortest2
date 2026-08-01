package com.anythink.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f11084a;

    public a(Context context) {
        this.f11084a = context;
    }

    private Context c() {
        return this.f11084a;
    }

    public abstract Paint a();

    public abstract Path a(int i);

    public abstract c a(int i, int i6, int i9);

    public void a(Context context, Canvas canvas, Path path) {
    }

    public abstract Paint b();

    public c b(int i, int i6, int i9) {
        return a(i, i6, i9);
    }
}
