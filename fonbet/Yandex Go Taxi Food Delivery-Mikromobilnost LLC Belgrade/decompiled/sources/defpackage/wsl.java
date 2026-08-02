package defpackage;

import android.content.Context;
import android.os.Parcelable;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public final class wsl implements ev31 {
    public final Context a;

    public wsl(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        rb6 rb6Var;
        Parcelable parcelable;
        fxy0 fxy0Var;
        ColorModel colorModel;
        stz0 stz0Var;
        bsl bslVar;
        List list;
        kpn kpnVar;
        msl mslVar = (msl) obj;
        u8j0 u8j0Var = mslVar.d;
        DivkitScreenConfig divkitScreenConfig = mslVar.c;
        String bottomBarItemId = divkitScreenConfig.getBottomBarItemId();
        yon yonVar = null;
        if (bottomBarItemId != null) {
            BottomBarItemId.Companion.getClass();
            BottomBarItemId a = qb6.a(bottomBarItemId);
            rb6Var = a != null ? fab1.c(mslVar.e, a) : null;
        } else {
            rb6Var = null;
        }
        if (!(u8j0Var instanceof r8j0)) {
            if ((u8j0Var instanceof t8j0) || u8j0Var == null) {
                return new usl(mslVar.b, divkitScreenConfig.getShowNavBar(), rb6Var);
            }
            if (u8j0Var instanceof s8j0) {
                return new tsl(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534), rb6Var == null, rb6Var);
            }
            w511.b();
            return null;
        }
        r8j0 r8j0Var = (r8j0) u8j0Var;
        bsl bslVar2 = (bsl) r8j0Var.a;
        rr51 rr51Var = bslVar2.a;
        rr51 rr51Var2 = bslVar2.d;
        Text text = bslVar2.b;
        if (text == null) {
            String title = divkitScreenConfig.getDivkitHeader().getTitle();
            text = title != null ? d.e(title) : null;
        }
        if (text != null) {
            parcelable = bslVar2.c;
            if (parcelable == null) {
                String subTitle = divkitScreenConfig.getDivkitHeader().getSubTitle();
                if (subTitle != null) {
                    parcelable = d.e(subTitle);
                }
            }
            if (divkitScreenConfig.getShowNavBar() && text == null && parcelable == null) {
                stz0Var = null;
            } else {
                if (text == null) {
                    text = Text.Empty.INSTANCE;
                }
                Text text2 = text;
                Text text3 = bslVar2.c;
                fxy0Var = bslVar2.e;
                if (fxy0Var == null) {
                    String str = (String) fxy0Var.a(this.a);
                    b bVar = ColorModel.Hex.Companion;
                    ColorModel attr = new ColorModel.Attr(ung0.ybColor_background_primary);
                    bVar.getClass();
                    ColorModel.Hex a2 = b.a(str);
                    if (a2 != null) {
                        attr = a2;
                    }
                    colorModel = attr;
                } else {
                    colorModel = null;
                }
                stz0Var = new stz0(text2, text3, colorModel, null, null, divkitScreenConfig.getShowNavBar() ? new ntz0(0) : bslVar2.d != null ? otz0.a : qtz0.a, false, null, null, null, null, null, 32728);
            }
            boolean showNavBar = divkitScreenConfig.getShowNavBar();
            if (!mslVar.f) {
                r8j0Var = null;
            }
            if (r8j0Var != null && (bslVar = (bsl) r8j0Var.a) != null && (list = bslVar.g) != null && (kpnVar = (kpn) a.R(list)) != null) {
                yonVar = new yon(new jfp0(mslVar.a), kpnVar, false, 48);
            }
            return new ssl(rr51Var, stz0Var, rr51Var2, showNavBar, yonVar, rb6Var);
        }
        parcelable = null;
        if (divkitScreenConfig.getShowNavBar()) {
        }
        if (text == null) {
        }
        Text text22 = text;
        Text text32 = bslVar2.c;
        fxy0Var = bslVar2.e;
        if (fxy0Var == null) {
        }
        stz0Var = new stz0(text22, text32, colorModel, null, null, divkitScreenConfig.getShowNavBar() ? new ntz0(0) : bslVar2.d != null ? otz0.a : qtz0.a, false, null, null, null, null, null, 32728);
        boolean showNavBar2 = divkitScreenConfig.getShowNavBar();
        if (!mslVar.f) {
        }
        if (r8j0Var != null) {
            yonVar = new yon(new jfp0(mslVar.a), kpnVar, false, 48);
        }
        return new ssl(rr51Var, stz0Var, rr51Var2, showNavBar2, yonVar, rb6Var);
    }
}
