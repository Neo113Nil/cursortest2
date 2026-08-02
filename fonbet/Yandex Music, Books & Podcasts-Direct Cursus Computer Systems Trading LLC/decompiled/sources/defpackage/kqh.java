package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class kqh extends qon {
    public final ArrayList d = new ArrayList();
    public final LayoutInflater e;
    public final Drawable f;
    public final Drawable g;
    public final Drawable h;
    public final Drawable i;
    public final /* synthetic */ lqh j;

    public kqh(lqh lqhVar) {
        this.j = lqhVar;
        Context context = lqhVar.h;
        this.e = LayoutInflater.from(context);
        this.f = v3g.F(context, R.attr.mediaRouteDefaultIconDrawable);
        this.g = v3g.F(context, R.attr.mediaRouteTvIconDrawable);
        this.h = v3g.F(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.i = v3g.F(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        u();
    }

    @Override // defpackage.qon
    public final int c() {
        return this.d.size();
    }

    @Override // defpackage.qon
    public final int f(int i) {
        return ((hqh) this.d.get(i)).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r2 != null) goto L25;
     */
    @Override // defpackage.qon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(opn opnVar, int i) {
        Drawable createFromStream;
        int f = f(i);
        hqh hqhVar = (hqh) this.d.get(i);
        if (f == 1) {
            ((gqh) opnVar).u.setText(hqhVar.a.toString());
            return;
        }
        if (f != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        jqh jqhVar = (jqh) opnVar;
        irh irhVar = (irh) hqhVar.a;
        View view = jqhVar.u;
        view.setVisibility(0);
        jqhVar.w.setVisibility(4);
        view.setOnClickListener(new iqh(jqhVar, irhVar));
        jqhVar.x.setText(irhVar.d);
        ImageView imageView = jqhVar.v;
        kqh kqhVar = jqhVar.y;
        Uri uri = irhVar.f;
        if (uri != null) {
            try {
                createFromStream = Drawable.createFromStream(kqhVar.j.h.getContentResolver().openInputStream(uri), null);
            } catch (IOException e) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e);
            }
        }
        int i2 = irhVar.n;
        createFromStream = i2 != 1 ? i2 != 2 ? irhVar.e() ? kqhVar.i : kqhVar.f : kqhVar.h : kqhVar.g;
        imageView.setImageDrawable(createFromStream);
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.e;
        if (i != 1) {
            if (i == 2) {
                return new jqh(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            e7o.n();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        gqh gqhVar = new gqh(inflate);
        gqhVar.u = (TextView) inflate.findViewById(R.id.mr_picker_header_name);
        return gqhVar;
    }

    public final void u() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        lqh lqhVar = this.j;
        arrayList.add(new hqh(lqhVar.h.getString(R.string.mr_chooser_title)));
        Iterator it = lqhVar.j.iterator();
        while (it.hasNext()) {
            arrayList.add(new hqh((irh) it.next()));
        }
        g();
    }
}
