package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class yal extends qon {
    public List d = new ArrayList();
    public final /* synthetic */ nbl e;
    public final /* synthetic */ int f;
    public final /* synthetic */ nbl g;

    public yal(nbl nblVar, int i) {
        this.f = i;
        this.g = nblVar;
        this.e = nblVar;
    }

    @Override // defpackage.qon
    public final int c() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // defpackage.qon
    public /* bridge */ /* synthetic */ void j(opn opnVar, int i) {
        switch (this.f) {
            case 1:
                w((hbl) opnVar, i);
                break;
            default:
                w((hbl) opnVar, i);
                break;
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        return new hbl(LayoutInflater.from(this.e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean u(w0t w0tVar) {
        for (int i = 0; i < this.d.size(); i++) {
            if (w0tVar.D.containsKey(((ibl) this.d.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    public void v(List list) {
        nbl nblVar = this.g;
        ImageView imageView = nblVar.w;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((qsn) list).d) {
                break;
            }
            ibl iblVar = (ibl) ((qsn) list).get(i);
            if (iblVar.a.e[iblVar.b]) {
                z = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            imageView.setImageDrawable(z ? nblVar.H0 : nblVar.I0);
            imageView.setContentDescription(z ? nblVar.J0 : nblVar.K0);
        }
        this.d = list;
    }

    public void w(hbl hblVar, int i) {
        switch (this.f) {
            case 1:
                x(hblVar, i);
                if (i > 0) {
                    ibl iblVar = (ibl) this.d.get(i - 1);
                    hblVar.v.setVisibility(iblVar.a.e[iblVar.b] ? 0 : 4);
                    break;
                }
                break;
            default:
                x(hblVar, i);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r9.a.e[r9.b] != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(hbl hblVar, int i) {
        final i8l i8lVar = this.e.P0;
        if (i8lVar == null) {
        }
        int i2 = 0;
        boolean z = true;
        if (i != 0) {
            final ibl iblVar = (ibl) this.d.get(i - 1);
            final xvs xvsVar = iblVar.a.b;
            if (i8lVar.Z().D.get(xvsVar) != null) {
            }
            z = false;
            hblVar.u.setText(iblVar.c);
            hblVar.v.setVisibility(z ? 0 : 4);
            hblVar.a.setOnClickListener(new View.OnClickListener() { // from class: jbl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i8l i8lVar2 = i8lVar;
                    if (i8lVar2.V0(29)) {
                        v0t a = i8lVar2.Z().a();
                        ibl iblVar2 = iblVar;
                        i8lVar2.H(a.k(new s0t(xvsVar, yde.y(Integer.valueOf(iblVar2.b)))).o(iblVar2.a.b.c).b());
                        String str = iblVar2.c;
                        yal yalVar = yal.this;
                        switch (yalVar.f) {
                            case 0:
                                ((String[]) yalVar.g.f.f)[1] = str;
                                break;
                        }
                        yalVar.e.k.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.f) {
            case 0:
                hblVar.u.setText(R.string.exo_track_selection_auto);
                i8l i8lVar2 = this.g.P0;
                i8lVar2.getClass();
                hblVar.v.setVisibility(u(i8lVar2.Z()) ? 4 : 0);
                hblVar.a.setOnClickListener(new xal(i2, this));
                break;
            default:
                hblVar.u.setText(R.string.exo_track_selection_none);
                int i3 = 0;
                while (true) {
                    if (i3 < this.d.size()) {
                        ibl iblVar2 = (ibl) this.d.get(i3);
                        if (iblVar2.a.e[iblVar2.b]) {
                            z = false;
                        } else {
                            i3++;
                        }
                    }
                }
                hblVar.v.setVisibility(z ? 0 : 4);
                hblVar.a.setOnClickListener(new xal(2, this));
                break;
        }
    }

    private final void y(String str) {
    }
}
