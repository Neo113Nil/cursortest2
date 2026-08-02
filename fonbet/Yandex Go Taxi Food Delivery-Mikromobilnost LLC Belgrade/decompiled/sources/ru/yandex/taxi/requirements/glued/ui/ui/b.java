package ru.yandex.taxi.requirements.glued.ui.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.i8h;

/* loaded from: classes6.dex */
public final class b {
    public final i8h a;

    public b(i8h i8hVar) {
        this.a = i8hVar;
    }

    public final a a(ImageView imageView, RecyclerView recyclerView, View view, ViewGroup viewGroup, Runnable runnable) {
        return new a(this.a, imageView, recyclerView, view, viewGroup, new SolidSummaryCarImageBinderFactory$create$1(0, runnable, Runnable.class, "run", "run()V", 0));
    }
}
