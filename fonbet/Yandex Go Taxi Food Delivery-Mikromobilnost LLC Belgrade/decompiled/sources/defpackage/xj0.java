package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.address.models.Address;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.map.IconStyle;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import java.util.HashMap;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.mapoverlay.AddToFavoritesOverlayTooltipView;
import ru.yandex.taxi.widget.TooltipPointerDrawer$Direction;

/* loaded from: classes6.dex */
public final class xj0 {
    public final vj0 a;
    public final zav0 b;
    public final l7s0 c;
    public final yj0 d;

    public xj0(vj0 vj0Var, zav0 zav0Var, l7s0 l7s0Var, yj0 yj0Var) {
        this.a = vj0Var;
        this.b = zav0Var;
        this.c = l7s0Var;
        this.d = yj0Var;
    }

    public final void a(Address address, boolean z) {
        Bitmap bitmap;
        zav0 zav0Var = this.b;
        boolean b = ((wav0) zav0Var.a.b()).b();
        vj0 vj0Var = this.a;
        if (!b || address == null || address.getIsFavorite() || jl40.l(address.D0(), yu21.c) || !z) {
            vj0Var.Hg();
            return;
        }
        if (jl40.l(this.d.b, address)) {
            return;
        }
        wav0 wav0Var = (wav0) zav0Var.a.b();
        String Y = d6z.Y(wav0Var, wav0Var.e.getA());
        if (Y.length() == 0) {
            vj0Var.Hg();
            return;
        }
        String uri = address.getUri();
        if (uri == null) {
            uri = "";
        }
        b1 b1Var = (b1) this.c.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(LaunchBrowserActivity.KEY_URI, uri);
        b1Var.a.a("AddToFavoritesMapAppeared", hashMap, 1, new HashMap());
        Context context = vj0Var.c;
        xm00 xm00Var = vj0Var.B;
        f4c0 f4c0Var = vj0Var.C;
        if (f4c0Var != null) {
            xm00Var.o(f4c0Var);
        }
        Pair pair = vj0Var.D;
        if (pair == null || !jl40.l((String) pair.c(), Y)) {
            AddToFavoritesOverlayTooltipView addToFavoritesOverlayTooltipView = new AddToFavoritesOverlayTooltipView(vj0Var.c, null, 0, 6, null);
            addToFavoritesOverlayTooltipView.setText(Y);
            addToFavoritesOverlayTooltipView.setPointer(z0h0.ic_favorites_overlay_tip);
            addToFavoritesOverlayTooltipView.setPointerDirection(TooltipPointerDrawer$Direction.UP);
            xw31.r(addToFavoritesOverlayTooltipView);
            vj0Var.D = new Pair(Y, xw31.t(addToFavoritesOverlayTooltipView));
        }
        Pair pair2 = vj0Var.D;
        if (pair2 == null || (bitmap = (Bitmap) pair2.f()) == null) {
            return;
        }
        yj0 yj0Var = vj0Var.w;
        Rect rect = new Rect(bitmap.getWidth() / 2, 0, bitmap.getWidth() / 2, bitmap.getHeight());
        yj0Var.b = address;
        r0 r0Var = yj0Var.a;
        r0Var.getClass();
        r0Var.m(null, rect);
        nqx nqxVar = new nqx(new BitmapDrawable(context.getResources(), bitmap), -1, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3, 4, Integer.MAX_VALUE, Integer.MAX_VALUE);
        vj0Var.z.getClass();
        xqx xqxVar = new xqx(context, nqxVar);
        f4c0 r = xm00Var.r(a.F(address.B()));
        r.x(bitmap);
        r.k(1.0f);
        r.D(new IconStyle().setAnchor(xqxVar.a()));
        r.g(new uj0(0, vj0Var, address));
        r.j(true, new Animation(Animation.Type.SMOOTH, 0.3f), null);
        vj0Var.C = r;
    }
}
