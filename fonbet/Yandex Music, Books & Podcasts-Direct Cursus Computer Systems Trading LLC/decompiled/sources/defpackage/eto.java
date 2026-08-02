package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class eto extends j8t {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eto(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.j8t, defpackage.a8t
    public void a() {
        switch (this.a) {
            case 1:
                ((ViewGroupOverlay) this.c).remove((ImageView) this.d);
                break;
        }
    }

    @Override // defpackage.j8t, defpackage.a8t
    public void c() {
        switch (this.a) {
            case 1:
                ImageView imageView = (ImageView) this.d;
                if (imageView.getParent() == null) {
                    ((ViewGroupOverlay) this.c).add(imageView);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.j8t, defpackage.a8t
    public final void e(b8t b8tVar) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((ViewGroup) obj2).removeOnAttachStateChangeListener((jb) obj);
                ((n8t) obj3).H(this);
                break;
            default:
                View view = (View) obj3;
                view.setTag(R.id.save_overlay_view, null);
                view.setVisibility(0);
                ((ViewGroupOverlay) obj2).remove((ImageView) obj);
                b8tVar.H(this);
                break;
        }
    }

    @Override // defpackage.j8t, defpackage.a8t
    public void f(b8t b8tVar) {
        switch (this.a) {
            case 1:
                ((View) this.b).setVisibility(4);
                break;
        }
    }
}
