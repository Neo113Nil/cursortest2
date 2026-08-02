package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.core.imageloader.b;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.f;
import com.yandex.plus.ui.core.theme.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class s7f extends qon {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public s7f(a aVar, b bVar, Integer num) {
        this.d = 2;
        aVar.getClass();
        bVar.getClass();
        this.e = aVar;
        this.f = bVar;
        this.g = num;
        this.h = new ArrayList();
    }

    @Override // defpackage.qon
    public final int c() {
        switch (this.d) {
            case 0:
                return ((ArrayList) this.h).size() + 1;
            case 1:
                return ((String[]) this.e).length;
            default:
                return ((ArrayList) this.h).size();
        }
    }

    @Override // defpackage.qon
    public long d(int i) {
        switch (this.d) {
            case 1:
                return i;
            default:
                return super.d(i);
        }
    }

    @Override // defpackage.qon
    public int f(int i) {
        switch (this.d) {
            case 0:
                return i == 0 ? R.layout.item_add_to_playlist_create_new : R.layout.item_add_to_playlist;
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.qon
    public final void j(opn opnVar, int i) {
        switch (this.d) {
            case 0:
                su4.s(2, null, "onBindViewholder can't be invoked since payload version of the method is overridden", null);
                break;
            case 1:
                gbl gblVar = (gbl) opnVar;
                boolean u = u(i);
                View view = gblVar.a;
                if (u) {
                    view.setLayoutParams(new zon(-1, -2));
                } else {
                    view.setLayoutParams(new zon(0, 0));
                }
                gblVar.u.setText(((String[]) this.e)[i]);
                String str = ((String[]) this.f)[i];
                TextView textView = gblVar.v;
                if (str == null) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                }
                Drawable drawable = ((Drawable[]) this.g)[i];
                ImageView imageView = gblVar.w;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    break;
                } else {
                    imageView.setVisibility(8);
                    break;
                }
            default:
                f fVar = (f) opnVar;
                y yVar = (y) ((ArrayList) this.h).get(i);
                s9f[] s9fVarArr = f.x;
                yVar.getClass();
                s7f s7fVar = fVar.w;
                a aVar = (a) s7fVar.e;
                Context context = fVar.a.getContext();
                context.getClass();
                String str2 = u.r(context, aVar) ? yVar.b : yVar.a;
                Integer num = (Integer) s7fVar.g;
                if (num != null) {
                    ((MaterialCardView) fVar.u.g(s9fVarArr[0])).setStrokeColor(num.intValue());
                }
                ((com.yandex.plus.coil.b) ((b) s7fVar.f)).b(str2).i((ImageView) fVar.v.g(s9fVarArr[1]));
                break;
        }
    }

    @Override // defpackage.qon
    public void k(opn opnVar, int i, List list) {
        switch (this.d) {
            case 0:
                rl rlVar = (rl) opnVar;
                list.getClass();
                if (!(rlVar instanceof pl)) {
                    if (!(rlVar instanceof ru.yandex.music.catalog.juicybottommenu.dialog.addtoplaylist.a)) {
                        b6e.s();
                        break;
                    } else {
                        ru.yandex.music.catalog.juicybottommenu.dialog.addtoplaylist.a aVar = (ru.yandex.music.catalog.juicybottommenu.dialog.addtoplaylist.a) rlVar;
                        Object obj = ((ArrayList) this.h).get(i - 1);
                        obj.getClass();
                        evl evlVar = (evl) obj;
                        cvl cvlVar = evlVar.a;
                        if (list.isEmpty() || !Intrinsics.d(list.get(0), "partial_update_tag")) {
                            q13 q13Var = aVar.v;
                            s9f[] s9fVarArr = ru.yandex.music.catalog.juicybottommenu.dialog.addtoplaylist.a.z;
                            ((TextView) q13Var.a(s9fVarArr[0])).setText(cvlVar.b);
                            aVar.t(evlVar);
                            ((ImageView) aVar.y.a(s9fVarArr[3])).setBackgroundResource(0);
                            ImageView imageView = (ImageView) aVar.y.a(s9fVarArr[3]);
                            co6 c = op7.c(cvlVar);
                            int s = wct.s();
                            Context context = imageView.getContext();
                            context.getClass();
                            pce X = i4w.X(c, context, s);
                            X.f(imageView);
                            rce a = X.a();
                            l18 l18Var = l18.b;
                            bdt I = hag.I(cce.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            ((cce) qdcVar.C(I)).d(a);
                        } else {
                            aVar.t(evlVar);
                        }
                    }
                }
                rlVar.a.setAccessibilityDelegate(new fb(2, this));
                break;
            default:
                super.k(opnVar, i, list);
                break;
        }
    }

    @Override // defpackage.qon
    public final opn m(ViewGroup viewGroup, int i) {
        switch (this.d) {
            case 0:
                if (i == R.layout.item_add_to_playlist_create_new) {
                    return new pl(viewGroup, new v1e(10, this));
                }
                if (i == R.layout.item_add_to_playlist) {
                    return new ru.yandex.music.catalog.juicybottommenu.dialog.addtoplaylist.a(viewGroup, new lhd(11, this));
                }
                xq0.q(k5r.i(i, "unsupported item type "));
                return null;
            case 1:
                nbl nblVar = (nbl) this.h;
                return new gbl(nblVar, LayoutInflater.from(nblVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
            default:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pay_sdk_item_product_logo, viewGroup, false);
                inflate.getClass();
                return new f(this, inflate);
        }
    }

    public boolean u(int i) {
        nbl nblVar = (nbl) this.h;
        i8l i8lVar = nblVar.P0;
        if (i8lVar == null) {
            return false;
        }
        return i != 0 ? i != 1 || (i8lVar.V0(30) && nblVar.P0.V0(29)) : i8lVar.V0(13);
    }

    public s7f(v1e v1eVar, lhd lhdVar, t7f t7fVar) {
        this.d = 0;
        this.e = v1eVar;
        this.f = lhdVar;
        this.g = t7fVar;
        this.h = new ArrayList();
    }

    public s7f(nbl nblVar, String[] strArr, Drawable[] drawableArr) {
        this.d = 1;
        this.h = nblVar;
        this.e = strArr;
        this.f = new String[strArr.length];
        this.g = drawableArr;
    }
}
