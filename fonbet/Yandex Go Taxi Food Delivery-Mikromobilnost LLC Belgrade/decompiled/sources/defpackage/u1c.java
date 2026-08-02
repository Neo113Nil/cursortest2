package defpackage;

import android.graphics.drawable.Drawable;
import androidx.core.view.b;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes5.dex */
public final class u1c {
    public final ListItemComponent a;
    public final tls b;
    public final mh7 c;
    public final yqb d;

    public u1c(ListItemComponent listItemComponent, tls tlsVar) {
        mh7 mh7Var = new mh7(listItemComponent.getContext());
        this.a = listItemComponent;
        this.b = tlsVar;
        this.c = mh7Var;
        yqb yqbVar = new yqb(this);
        this.d = yqbVar;
        b.p(listItemComponent.trailFrame, yqbVar);
    }

    public final void a(Object obj, String str) {
        ListItemComponent listItemComponent = this.a;
        listItemComponent.setTrailMode(1);
        listItemComponent.setTrailImage((Drawable) this.c.a.getValue());
        listItemComponent.setTrailContainerClickListener(new l7a(11, this, obj));
        this.d.b = str;
        listItemComponent.trailFrame.setImportantForAccessibility(1);
    }

    public final void b(Drawable drawable) {
        ListItemComponent listItemComponent = this.a;
        listItemComponent.setTrailImage(drawable);
        if (drawable != null) {
            listItemComponent.setTrailMode(1);
        } else {
            listItemComponent.setTrailMode(this.c.c);
        }
        listItemComponent.setTrailContainerClickListener(null);
        listItemComponent.trailFrame.setImportantForAccessibility(2);
        this.d.b = null;
    }
}
