package com.anythink.basead.ui.guidetoclickv2.picverify;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f11870a;

    public a(Context context) {
        this.f11870a = context;
    }

    private Context c() {
        return this.f11870a;
    }

    public abstract Paint a();

    public abstract Path a(int i);

    public abstract c a(int i, int i4, int i6);

    public void a(Context context, Canvas canvas, Path path) {
    }

    public abstract Paint b();

    public c b(int i, int i4, int i6) {
        return a(i, i4, i6);
    }
}
