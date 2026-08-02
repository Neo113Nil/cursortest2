package ru.yandex.music.catalog.juicybottommenu.dialog.addtoplaylist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import defpackage.ern;
import defpackage.evl;
import defpackage.f1d;
import defpackage.lhd;
import defpackage.ol;
import defpackage.q13;
import defpackage.ql;
import defpackage.rl;
import defpackage.s9f;
import defpackage.yxm;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class a extends rl {
    public static final /* synthetic */ s9f[] z = {new yxm(a.class, "playlistName", "getPlaylistName()Landroid/widget/TextView;", 0), f1d.c(ern.a, a.class, "containsImageView", "getContainsImageView()Landroid/widget/ImageView;", 0), new yxm(a.class, "addImageView", "getAddImageView()Landroid/widget/ImageView;", 0), new yxm(a.class, "cover", "getCover()Landroid/widget/ImageView;", 0)};
    public final lhd u;
    public final q13 v;
    public final q13 w;
    public final q13 x;
    public final q13 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(ViewGroup viewGroup, lhd lhdVar) {
        super(r4);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_add_to_playlist, viewGroup, false);
        inflate.getClass();
        this.u = lhdVar;
        inflate.setOnClickListener(new ol(1, this));
        this.v = new q13(new ql(inflate, 0));
        this.w = new q13(new ql(inflate, 1));
        this.x = new q13(new ql(inflate, 2));
        this.y = new q13(new ql(inflate, 3));
    }

    public final void t(evl evlVar) {
        s9f[] s9fVarArr = z;
        ImageView imageView = (ImageView) this.w.a(s9fVarArr[1]);
        boolean z2 = evlVar.b;
        imageView.setVisibility(z2 ? 0 : 8);
        ((ImageView) this.x.a(s9fVarArr[2])).setVisibility(z2 ? 8 : 0);
    }
}
