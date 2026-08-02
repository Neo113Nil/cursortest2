package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class pl extends rl {
    public final v1e u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pl(ViewGroup viewGroup, v1e v1eVar) {
        super(r4);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_add_to_playlist_create_new, viewGroup, false);
        inflate.getClass();
        this.u = v1eVar;
        inflate.setOnClickListener(new ol(0, this));
    }
}
