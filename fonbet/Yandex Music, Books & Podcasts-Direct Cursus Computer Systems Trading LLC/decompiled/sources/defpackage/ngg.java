package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.f;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public abstract class ngg {
    public static int a;

    public static ukd A(ukd ukdVar, float f, float f2, float f3, int i) {
        float f4 = 0;
        if ((i & 2) != 0) {
            f = 0;
        }
        if ((i & 4) != 0) {
            f2 = 0;
        }
        if ((i & 8) != 0) {
            f3 = 0;
        }
        return ukdVar.d(new m0k(L(f4), L(f), L(f2), L(f3)));
    }

    public static TypedValue C(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean D(Context context, int i, boolean z) {
        TypedValue C = C(context, i);
        return (C == null || C.type != 18) ? z : C.data != 0;
    }

    public static TypedValue E(Context context, String str, int i) {
        TypedValue C = C(context, i);
        if (C != null) {
            return C;
        }
        b6e.p("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    public static final y7o F(Object obj) {
        return new y7o(obj, null);
    }

    public static final void G(ifp ifpVar, String str) {
        ifpVar.a.put(wdp.i, t75.c(str));
    }

    public static final void H(ifp ifpVar, String str) {
        ifpVar.a.put(wdp.j, str);
    }

    public static ArrayList J(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            byte b = asReadOnlyBuffer.get();
            int i = (b >> 3) & 15;
            if (((b >> 2) & 1) != 0) {
                asReadOnlyBuffer.get();
            }
            if (((b >> 1) & 1) != 0) {
                remaining = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    byte b2 = asReadOnlyBuffer.get();
                    remaining |= (b2 & Byte.MAX_VALUE) << (i2 * 7);
                    if ((b2 & 128) == 0) {
                        break;
                    }
                }
            } else {
                remaining = asReadOnlyBuffer.remaining();
            }
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + remaining);
            arrayList.add(new ikj(i, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
        }
        return arrayList;
    }

    public static final k0k L(float f) {
        return new k0k(2, f);
    }

    public static final mqs M(rxs rxsVar) {
        CoverPath none;
        rxsVar.getClass();
        ig5 ig5Var = rxsVar.a;
        List w = w(rxsVar.b, rxsVar.c, rxsVar.d, rxsVar.h, rxsVar.f, rxsVar.g, rxsVar.e);
        List<c01> list = w;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (c01 c01Var : list) {
            Parcelable.Creator<zp2> creator = zp2.CREATOR;
            arrayList.add(vq2.E(c01Var));
        }
        String str = ig5Var.F;
        String str2 = ig5Var.E;
        String str3 = ig5Var.G;
        String str4 = ig5Var.H;
        if (str4 != null) {
            none = men.x(str4, WebPath$Storage.AVATARS);
        } else {
            none = CoverPath.none();
            none.getClass();
        }
        mqs u0 = j66.u0(ig5Var, arrayList, w, new oq(str, str2, null, false, null, null, null, null, str3, null, 0, null, arrayList, none, 0, false, null, null, null, null, null, null, false, null, 536845820), 8);
        tfs tfsVar = wc7.a;
        u0.w0 = wc7.a.b(rxsVar.i);
        return u0;
    }

    public static final nav N(zsu zsuVar) {
        zsuVar.getClass();
        String str = zsuVar.a;
        String str2 = zsuVar.b;
        jcv jcvVar = zsuVar.c;
        String pathForSize = jcvVar != null ? jcvVar.getPathForSize(frv.b()) : null;
        rnu rnuVar = zsuVar.g;
        return new nav(str, str2, pathForSize, new m1u(pd.T(rnuVar.a), pd.T(rnuVar.b)), zsuVar.e, zsuVar.f);
    }

    public static final f O(x1u x1uVar, v80 v80Var, wmn wmnVar) {
        pwk pwkVar;
        sow sowVar;
        x1uVar.getClass();
        String str = x1uVar.a;
        gxc gxcVar = v80Var.b;
        String str2 = gxcVar.a;
        String str3 = gxcVar.b;
        String str4 = v80Var.a;
        String str5 = x1uVar.b;
        String uri = x1uVar.o.a.getUri();
        if (wmnVar != null) {
            int ordinal = wmnVar.ordinal();
            if (ordinal == 0) {
                sowVar = sow.b;
            } else if (ordinal == 1) {
                sowVar = sow.a;
            } else if (ordinal == 2) {
                sowVar = sow.c;
            } else if (ordinal == 3) {
                sowVar = sow.d;
            } else if (ordinal == 4) {
                sowVar = sow.e;
            } else {
                if (ordinal != 5) {
                    b6e.s();
                    return null;
                }
                sowVar = sow.f;
            }
            int T = avf.T(sowVar);
            if (T != 0) {
                pwkVar = new pwk(T);
                return bzf.J(str, lwk.VIDEO_CLIP, str2, str3, str4, str5, null, uri, pwkVar);
            }
        }
        pwkVar = null;
        return bzf.J(str, lwk.VIDEO_CLIP, str2, str3, str4, str5, null, uri, pwkVar);
    }

    public static final qwk P(row rowVar) {
        rowVar.getClass();
        if (rowVar instanceof pow) {
            pow powVar = (pow) rowVar;
            return new owk(powVar.b, powVar.c);
        }
        if (!(rowVar instanceof qow)) {
            b6e.s();
            return null;
        }
        int T = avf.T(((qow) rowVar).a);
        if (T != 0) {
            return new pwk(T);
        }
        return null;
    }

    public static final void Q(ViewGroup viewGroup, gc8 gc8Var, List list, szm szmVar) {
        ado currentRebindReusableList$div_release = gc8Var.getCurrentRebindReusableList$div_release();
        if (currentRebindReusableList$div_release == null) {
            return;
        }
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k79 k79Var = (k79) it.next();
            View a2 = currentRebindReusableList$div_release.a(k79Var.a);
            if (a2 == null) {
                a2 = ((p0a) szmVar.get()).W(k79Var.a, k79Var.b);
            }
            viewGroup.addView(a2);
        }
    }

    public static final bfu R(lm4 lm4Var, kfu kfuVar, String str, gfu gfuVar, is6 is6Var, hq5 hq5Var) {
        bnd h;
        if (gfuVar != null) {
            jfu viewModelStore = kfuVar.getViewModelStore();
            viewModelStore.getClass();
            is6Var.getClass();
            h = new bnd(viewModelStore, gfuVar, is6Var);
        } else if (kfuVar instanceof ssd) {
            jfu viewModelStore2 = kfuVar.getViewModelStore();
            gfu defaultViewModelProviderFactory = ((ssd) kfuVar).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            is6Var.getClass();
            h = new bnd(viewModelStore2, defaultViewModelProviderFactory, is6Var);
        } else {
            h = tjl.h(kfuVar, null, 6);
        }
        if (str != null) {
            return ((bjt) h.b).j(lm4Var, str);
        }
        bjt bjtVar = (bjt) h.b;
        String f = lm4Var.f();
        if (f != null) {
            return bjtVar.j(lm4Var, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(f));
        }
        xq0.x("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static j4x S(Bundle bundle, String str) {
        uz2 uz2Var = b6x.i;
        if (bundle == null) {
            l8x.g("BillingClient", str.concat(" got null owned items list"));
            return new j4x(uz2Var, 54, 25);
        }
        int a2 = l8x.a(bundle, "BillingClient");
        String e = l8x.e(bundle, "BillingClient");
        tzb a3 = uz2.a();
        a3.b = a2;
        a3.a = e;
        uz2 a4 = a3.a();
        if (a2 != 0) {
            l8x.g("BillingClient", str + " failed. Response code: " + a2);
            return new j4x(a4, 23, 25);
        }
        if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            l8x.g("BillingClient", "Bundle returned from " + str + " doesn't contain required fields.");
            return new j4x(uz2Var, 55, 25);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            l8x.g("BillingClient", "Bundle returned from " + str + " contains null SKUs list.");
            return new j4x(uz2Var, 56, 25);
        }
        if (stringArrayList2 == null) {
            l8x.g("BillingClient", "Bundle returned from " + str + " contains null purchases list.");
            return new j4x(uz2Var, 57, 25);
        }
        if (stringArrayList3 != null) {
            return new j4x(b6x.j, 1, 25);
        }
        l8x.g("BillingClient", "Bundle returned from " + str + " contains null signatures list.");
        return new j4x(uz2Var, 58, 25);
    }

    public static final void a(final boolean z, final wn5 wn5Var, final o0k o0kVar, final float f, final long j, final yci yciVar, hq5 hq5Var, final int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2114396588);
        if (((i | (oq5Var2.g(z) ? 4 : 2) | (oq5Var2.f(o0kVar) ? 256 : 128) | (oq5Var2.c(f) ? 2048 : 1024) | (oq5Var2.e(j) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX)) & 74899) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var = oq5Var2;
            q5g.k(d.e(yciVar, f), ugo.a, z ? j : d85.m, 0L, null, 0.0f, ild.C(216660632, new oc1(z, o0kVar, wn5Var, 17), oq5Var2), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(z, wn5Var, o0kVar, f, j, yciVar, i) { // from class: xwo
                public final /* synthetic */ boolean a;
                public final /* synthetic */ wn5 b;
                public final /* synthetic */ o0k c;
                public final /* synthetic */ float d;
                public final /* synthetic */ long e;
                public final /* synthetic */ yci f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(49);
                    ngg.a(this.a, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(c8i c8iVar, spd spdVar, ynn ynnVar, Function2 function2, ryc rycVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        c8iVar.getClass();
        spdVar.getClass();
        ynnVar.getClass();
        function2.getClass();
        rycVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1746336906);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(c8iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(spdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(ynnVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(rycVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 9363) != 9362)) {
            qo6 qo6Var = qo6.m;
            String str = (String) CollectionsKt.firstOrNull(c8iVar.e);
            if (str == null) {
                str = "";
            }
            String str2 = str;
            yci u = xp3.u(a.d(d.d(vci.a, 1.0f), 1.0f), o5g.F(oq5Var2));
            int i3 = i2 & 14;
            boolean h = ((i2 & 7168) == 2048) | (i3 == 4) | oq5Var2.h(spdVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new y7i(function2, c8iVar, spdVar, 0);
                oq5Var2.k0(K);
            }
            yci e = androidx.compose.foundation.a.e(u, false, null, null, (Function0) K, 7);
            boolean h2 = ((i2 & 57344) == 16384) | (i3 == 4) | oq5Var2.h(spdVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                K2 = new z7i(rycVar, c8iVar, spdVar, 0);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            ltg.e(qo6Var, str2, com.yandex.music.core.ui.compose.a.b(e, ynnVar, 0L, 0.0f, null, (Function2) K2, 14), null, null, null, null, null, oq5Var, 6, 248);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 21, c8iVar, spdVar, ynnVar, function2, rycVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(po6 po6Var, bg5 bg5Var, yci yciVar, pyc pycVar, boolean z, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        pyc pycVar2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        Object K;
        boolean a2;
        long j;
        boolean h;
        Object K2;
        long j2;
        boolean z4;
        boolean h2;
        Object K3;
        oq5 oq5Var;
        yci yciVar3;
        pyc pycVar3;
        xmn r;
        po6 po6Var2 = po6Var;
        po6Var2.getClass();
        bg5Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(888111387);
        int i6 = (oq5Var2.f(po6Var2) ? 4 : 2) | i | (oq5Var2.h(bg5Var) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | 384;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i3 = i6 | (oq5Var2.f(yciVar2) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            pycVar2 = pycVar;
            i3 |= oq5Var2.h(pycVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= oq5Var2.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i5 = i3;
                if ((i5 & 9363) == 9362 || !oq5Var2.z()) {
                    yci yciVar4 = i7 != 0 ? vci.a : yciVar2;
                    pyc pycVar4 = i8 != 0 ? null : pycVar2;
                    boolean z5 = i4 != 0 ? false : z2;
                    z3 = (i5 & 14) == 4;
                    K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (!z3 || K == kjnVar) {
                        K = szf.g0(Boolean.TRUE);
                        oq5Var2.k0(K);
                    }
                    aqi aqiVar = (aqi) K;
                    aqi M = gld.M(bg5Var.h(), oq5Var2);
                    a2 = ((frs) M.getValue()).a();
                    zyj zyjVar = zyj.d;
                    j = ((dq0) oq5Var2.j(eq0.a)).a.c;
                    wn5 C = ild.C(1187477831, new qul(bg5Var, j), oq5Var2);
                    rba rbaVar = rba.a;
                    boolean z6 = z5;
                    lzs lzsVar = lzs.a;
                    nxq nxqVar = nxq.b;
                    h = oq5Var2.h(bg5Var);
                    K2 = oq5Var2.K();
                    if (!h || K2 == kjnVar) {
                        j2 = j;
                        z4 = a2;
                        msj msjVar = new msj(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 23);
                        oq5Var2.k0(msjVar);
                        K2 = msjVar;
                    } else {
                        z4 = a2;
                        j2 = j;
                    }
                    h9f h9fVar = (h9f) K2;
                    h2 = oq5Var2.h(bg5Var);
                    K3 = oq5Var2.K();
                    if (!h2 || K3 == kjnVar) {
                        msj msjVar2 = new msj(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 24);
                        oq5Var2.k0(msjVar2);
                        K3 = msjVar2;
                    }
                    h9f h9fVar2 = (h9f) K3;
                    pyc pycVar5 = pycVar4 == null ? C : pycVar4;
                    qr qrVar = new qr(z6, aqiVar, bg5Var, po6Var, M);
                    z2 = z6;
                    po6Var2 = po6Var;
                    oq5Var = oq5Var2;
                    qgg.l(zyjVar, rbaVar, lzsVar, false, z4, (Function0) h9fVar, null, (Function0) h9fVar2, ild.C(496451233, qrVar, oq5Var2), ild.C(-1589391582, new rul(bg5Var, po6Var2, z4), oq5Var2), yciVar4, nxqVar, null, null, null, null, j2, 0L, null, pycVar5, false, oq5Var, 907546038, ((i5 >> 6) & 14) | 48, 0, 1503232);
                    yciVar3 = yciVar4;
                    pycVar3 = pycVar4;
                } else {
                    oq5Var2.S();
                    yciVar3 = yciVar2;
                    pycVar3 = pycVar2;
                    oq5Var = oq5Var2;
                }
                boolean z7 = z2;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new p91(po6Var2, bg5Var, yciVar3, pycVar3, z7, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i5 & 14) == 4) {
            }
            K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (!z3) {
            }
            K = szf.g0(Boolean.TRUE);
            oq5Var2.k0(K);
            aqi aqiVar2 = (aqi) K;
            aqi M2 = gld.M(bg5Var.h(), oq5Var2);
            a2 = ((frs) M2.getValue()).a();
            zyj zyjVar2 = zyj.d;
            j = ((dq0) oq5Var2.j(eq0.a)).a.c;
            wn5 C2 = ild.C(1187477831, new qul(bg5Var, j), oq5Var2);
            rba rbaVar2 = rba.a;
            boolean z62 = z5;
            lzs lzsVar2 = lzs.a;
            nxq nxqVar2 = nxq.b;
            h = oq5Var2.h(bg5Var);
            K2 = oq5Var2.K();
            if (h) {
            }
            j2 = j;
            z4 = a2;
            msj msjVar3 = new msj(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 23);
            oq5Var2.k0(msjVar3);
            K2 = msjVar3;
            h9f h9fVar3 = (h9f) K2;
            h2 = oq5Var2.h(bg5Var);
            K3 = oq5Var2.K();
            if (!h2) {
            }
            msj msjVar22 = new msj(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 24);
            oq5Var2.k0(msjVar22);
            K3 = msjVar22;
            h9f h9fVar22 = (h9f) K3;
            if (pycVar4 == null) {
            }
            qr qrVar2 = new qr(z62, aqiVar2, bg5Var, po6Var, M2);
            z2 = z62;
            po6Var2 = po6Var;
            oq5Var = oq5Var2;
            qgg.l(zyjVar2, rbaVar2, lzsVar2, false, z4, (Function0) h9fVar3, null, (Function0) h9fVar22, ild.C(496451233, qrVar2, oq5Var2), ild.C(-1589391582, new rul(bg5Var, po6Var2, z4), oq5Var2), yciVar4, nxqVar2, null, null, null, null, j2, 0L, null, pycVar5, false, oq5Var, 907546038, ((i5 >> 6) & 14) | 48, 0, 1503232);
            yciVar3 = yciVar4;
            pycVar3 = pycVar4;
            boolean z72 = z2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        pycVar2 = pycVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i5 & 14) == 4) {
        }
        K = oq5Var2.K();
        kjn kjnVar22 = gq5.a;
        if (!z3) {
        }
        K = szf.g0(Boolean.TRUE);
        oq5Var2.k0(K);
        aqi aqiVar22 = (aqi) K;
        aqi M22 = gld.M(bg5Var.h(), oq5Var2);
        a2 = ((frs) M22.getValue()).a();
        zyj zyjVar22 = zyj.d;
        j = ((dq0) oq5Var2.j(eq0.a)).a.c;
        wn5 C22 = ild.C(1187477831, new qul(bg5Var, j), oq5Var2);
        rba rbaVar22 = rba.a;
        boolean z622 = z5;
        lzs lzsVar22 = lzs.a;
        nxq nxqVar22 = nxq.b;
        h = oq5Var2.h(bg5Var);
        K2 = oq5Var2.K();
        if (h) {
        }
        j2 = j;
        z4 = a2;
        msj msjVar32 = new msj(0, bg5Var, bg5.class, "onClick", "onClick()V", 0, 23);
        oq5Var2.k0(msjVar32);
        K2 = msjVar32;
        h9f h9fVar32 = (h9f) K2;
        h2 = oq5Var2.h(bg5Var);
        K3 = oq5Var2.K();
        if (!h2) {
        }
        msj msjVar222 = new msj(0, bg5Var, bg5.class, "onOverflowClick", "onOverflowClick()V", 0, 24);
        oq5Var2.k0(msjVar222);
        K3 = msjVar222;
        h9f h9fVar222 = (h9f) K3;
        if (pycVar4 == null) {
        }
        qr qrVar22 = new qr(z622, aqiVar22, bg5Var, po6Var, M22);
        z2 = z622;
        po6Var2 = po6Var;
        oq5Var = oq5Var2;
        qgg.l(zyjVar22, rbaVar22, lzsVar22, false, z4, (Function0) h9fVar32, null, (Function0) h9fVar222, ild.C(496451233, qrVar22, oq5Var2), ild.C(-1589391582, new rul(bg5Var, po6Var2, z4), oq5Var2), yciVar4, nxqVar22, null, null, null, null, j2, 0L, null, pycVar5, false, oq5Var, 907546038, ((i5 >> 6) & 14) | 48, 0, 1503232);
        yciVar3 = yciVar4;
        pycVar3 = pycVar4;
        boolean z722 = z2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void d(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1987102040);
        if (((i | 48) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            zyj zyjVar = zyj.d;
            rba rbaVar = rba.a;
            lzs lzsVar = lzs.a;
            nxq nxqVar = nxq.b;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new ufl(27);
                oq5Var2.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new ufl(28);
                oq5Var2.k0(K2);
            }
            wn5 C = ild.C(1319913954, new d6h(13), oq5Var2);
            wn5 C2 = ild.C(-1097784447, new d6h(14), oq5Var2);
            oq5Var = oq5Var2;
            yciVar2 = vci.a;
            qgg.l(zyjVar, rbaVar, lzsVar, false, false, function0, null, (Function0) K2, C, C2, yciVar2, nxqVar, null, null, null, null, 0L, 0L, null, null, false, oq5Var, 920350134, 54, 6, 1044480);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar2, i, 7);
        }
    }

    public static final void e(String str, k4k k4kVar, lvf lvfVar, dib dibVar, fem femVar, tmb tmbVar, hq5 hq5Var, int i) {
        fem femVar2;
        int i2;
        kjn kjnVar;
        int i3;
        str.getClass();
        k4kVar.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2118219256);
        int i4 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(k4kVar) ? 32 : 16) | (oq5Var.h(lvfVar) ? 256 : 128) | (oq5Var.h(dibVar) ? 2048 : 1024) | (oq5Var.f(femVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(tmbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i4 & 1, (i4 & 74899) != 74898)) {
            ogp.g.e(k4kVar.c, k4kVar.b != null, null, oq5Var, 4096, 4);
            int i5 = i4 & 57344;
            boolean z = i5 == 16384;
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                i2 = 57344;
                kjnVar = kjnVar2;
                i3 = i5;
                ebm ebmVar = new ebm(0, femVar, fem.class, "onBackClicked", "onBackClicked()V", 0, 6);
                oq5Var.k0(ebmVar);
                K = ebmVar;
            } else {
                kjnVar = kjnVar2;
                i2 = 57344;
                i3 = i5;
            }
            Function0 function0 = (Function0) ((h9f) K);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new hvl(19);
                oq5Var.k0(K2);
            }
            Function0 function02 = (Function0) K2;
            boolean z2 = i3 == 16384;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                ebm ebmVar2 = new ebm(0, femVar, fem.class, "onRefresh", "onRefresh()V", 0, 7);
                oq5Var.k0(ebmVar2);
                K3 = ebmVar2;
            }
            Function0 function03 = (Function0) ((h9f) K3);
            boolean z3 = i3 == 16384;
            Object K4 = oq5Var.K();
            if (z3 || K4 == kjnVar) {
                K4 = new ebm(0, femVar, fem.class, "onRetry", "onRetry()V", 0, 8);
                femVar2 = femVar;
                oq5Var.k0(K4);
            } else {
                femVar2 = femVar;
            }
            Function0 function04 = (Function0) ((h9f) K4);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            wn5 C2 = ild.C(1478358897, new tik(5, femVar2), oq5Var);
            int i6 = i4 >> 3;
            int i7 = lvf.f;
            ezf.i(k4kVar, lvfVar, str, false, dibVar, function0, function02, function03, function04, tmbVar, C, C2, oq5Var, (i6 & 112) | (i6 & 14) | 1576000 | ((i4 << 6) & 896) | ((i4 << 3) & i2) | 1073741824 | ((i4 << 12) & 1879048192));
            oq5Var = oq5Var;
        } else {
            femVar2 = femVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(str, k4kVar, lvfVar, dibVar, femVar2, tmbVar, i, 15);
        }
    }

    public static final void f(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(895184833);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci m = d.m(vciVar, 48);
            kfh d = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_edge_24, 0, oq5Var), null, androidx.compose.ui.platform.a.a(b.a.a(wyf.R(d.m(vciVar, 24)), b2c.f), "right_arrow"), ((dq0) oq5Var.j(eq0.a)).a.c, oq5Var, 48, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j1p(i, 13);
        }
    }

    public static final void g(sg2 sg2Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1255326498);
        int i2 = (oq5Var.f(sg2Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            nyf lifecycle = ((dzf) oq5Var.j(ykg.a)).getLifecycle();
            long b = sg2Var.b();
            d85 d85Var = new d85(b);
            boolean e = oq5Var.e(b) | oq5Var.h(lifecycle);
            Object K = oq5Var.K();
            if (e || K == gq5.a) {
                K = new gud(lifecycle, b, 1);
                oq5Var.k0(K);
            }
            gld.j(lifecycle, d85Var, (Function1) K, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(sg2Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final String str, final List list, final Object obj, final Function1 function1, final wn5 wn5Var, yci yciVar, long j, long j2, boolean z, o0k o0kVar, float f, float f2, Function1 function12, hq5 hq5Var, final int i, final int i2, final int i3) {
        int i4;
        wn5 wn5Var2;
        yci yciVar2;
        long j3;
        long j4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        yci yciVar3;
        float f3;
        boolean z3;
        long j5;
        final float f4;
        final int i13;
        final Function1 function13;
        final long j6;
        final o0k o0kVar2;
        oq5 oq5Var;
        final float f5;
        final o0k o0kVar3;
        final long j7;
        final Function1 function14;
        final yci yciVar4;
        final long j8;
        final float f6;
        final boolean z4;
        xmn r;
        list.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-205129907);
        if ((i & 6) == 0) {
            i4 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? oq5Var2.f(list) : oq5Var2.h(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(obj) : oq5Var2.h(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= oq5Var2.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            wn5Var2 = wn5Var;
            i4 |= oq5Var2.h(wn5Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            wn5Var2 = wn5Var;
        }
        int i14 = i3 & 32;
        if (i14 != 0) {
            i4 |= 196608;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            if ((i & 196608) == 0) {
                i4 |= oq5Var2.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            j3 = j;
            i4 |= ((i3 & 64) == 0 && oq5Var2.e(j3)) ? 1048576 : 524288;
        } else {
            j3 = j;
        }
        if ((i & 12582912) == 0) {
            j4 = j2;
            i4 |= ((i3 & 128) == 0 && oq5Var2.e(j4)) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            j4 = j2;
        }
        int i15 = i3 & 256;
        if (i15 != 0) {
            i4 |= 100663296;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 100663296) == 0) {
                i4 |= oq5Var2.g(z2) ? 67108864 : 33554432;
            }
        }
        int i16 = i4;
        int i17 = i3 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i17 != 0) {
            i16 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i5 = i17;
            i16 |= oq5Var2.f(o0kVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            if ((i3 & 1024) == 0) {
                i6 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i6 = i2 | (oq5Var2.g(false) ? 4 : 2);
            } else {
                i6 = i2;
            }
            i7 = i3 & 2048;
            if (i7 == 0) {
                i6 |= 48;
                i8 = i7;
            } else if ((i2 & 48) == 0) {
                i8 = i7;
                i6 |= oq5Var2.c(f) ? 32 : 16;
            } else {
                i8 = i7;
            }
            int i18 = i6;
            i9 = i3 & 4096;
            if (i9 == 0) {
                i10 = i18 | 384;
            } else {
                int i19 = i18;
                if ((i2 & 384) == 0) {
                    i19 |= oq5Var2.c(f2) ? 256 : 128;
                }
                i10 = i19;
            }
            i11 = i3 & RemoteCameraConfig.Notification.ID;
            if (i11 == 0) {
                i12 = i10 | 3072;
            } else {
                i12 = i10 | (oq5Var2.h(function12) ? 2048 : 1024);
            }
            if ((i16 & 306783379) != 306783378 && (i12 & 1171) == 1170 && oq5Var2.z()) {
                oq5Var2.S();
                o0kVar3 = o0kVar;
                f6 = f;
                f5 = f2;
                z4 = z2;
                oq5Var = oq5Var2;
                function14 = function12;
                yciVar4 = yciVar2;
                j8 = j3;
                j7 = j4;
            } else {
                oq5Var2.U();
                if ((i & 1) != 0 || oq5Var2.y()) {
                    yci yciVar5 = i14 == 0 ? vci.a : yciVar2;
                    if ((i3 & 64) != 0) {
                        j3 = ((dq0) oq5Var2.j(eq0.a)).c.a;
                        i16 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        j4 = ((dq0) oq5Var2.j(eq0.a)).c.c;
                        i16 &= -29360129;
                    }
                    if (i15 != 0) {
                        z2 = true;
                    }
                    o0k a2 = i5 == 0 ? a.a(16, 0.0f, 2) : o0kVar;
                    float f7 = i8 == 0 ? 16 : f;
                    float f8 = i9 == 0 ? 48 : f2;
                    if (i11 == 0) {
                        yciVar3 = yciVar5;
                        f3 = f7;
                        z3 = z2;
                        j5 = j3;
                        f4 = f8;
                        function13 = null;
                        i13 = i16;
                    } else {
                        yciVar3 = yciVar5;
                        f3 = f7;
                        z3 = z2;
                        j5 = j3;
                        f4 = f8;
                        i13 = i16;
                        function13 = function12;
                    }
                    j6 = j4;
                    o0kVar2 = a2;
                } else {
                    oq5Var2.S();
                    if ((i3 & 64) != 0) {
                        i16 &= -3670017;
                    }
                    if ((i3 & 128) != 0) {
                        i16 &= -29360129;
                    }
                    f3 = f;
                    f4 = f2;
                    yciVar3 = yciVar2;
                    z3 = z2;
                    j5 = j3;
                    i13 = i16;
                    function13 = function12;
                    j6 = j4;
                    o0kVar2 = o0kVar;
                }
                oq5Var2.q();
                final wn5 wn5Var3 = wn5Var2;
                int i20 = i13 >> 9;
                oq5Var = oq5Var2;
                vxo.a(list.indexOf(obj) + (str == null ? 0 : 1), b2c.e, yciVar3, j5, 0L, f3, quj.c, quj.d, z3, false, ild.C(6405757, new Function2() { // from class: wwo
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r14v0, types: [int] */
                    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        hq5 hq5Var2;
                        float f9;
                        kjn kjnVar;
                        Throwable th;
                        boolean z5;
                        oq5 oq5Var3;
                        wwo wwoVar = this;
                        hq5 hq5Var3 = (hq5) obj2;
                        if ((((Integer) obj3).intValue() & 3) == 2) {
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            if (oq5Var4.z()) {
                                oq5Var4.S();
                                return Unit.a;
                            }
                        }
                        vci vciVar = vci.a;
                        String str2 = str;
                        float f10 = f4;
                        kjn kjnVar2 = gq5.a;
                        if (str2 != null) {
                            oq5 oq5Var5 = (oq5) hq5Var3;
                            oq5Var5.Z(1855402681);
                            yci e = d.e(vciVar, f10);
                            Object K = oq5Var5.K();
                            if (K == kjnVar2) {
                                K = new i6o(23);
                                oq5Var5.k0(K);
                            }
                            yci a3 = androidx.compose.ui.platform.a.a(a.q(d.x(nfp.b(e, false, (Function1) K), null, 3), 0.0f, 0.0f, 8, 0.0f, 11), "tabs_row_title");
                            h6g h6gVar = nu0.a;
                            h6g h6gVar2 = h6g.c;
                            th = null;
                            z5 = false;
                            f9 = f10;
                            hq5Var2 = hq5Var3;
                            kjnVar = kjnVar2;
                            xv7.j(str2, a3, ((dq0) oq5Var5.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var5, 0, 0, 65528);
                            oq5Var3 = oq5Var5;
                        } else {
                            hq5Var2 = hq5Var3;
                            f9 = f10;
                            kjnVar = kjnVar2;
                            th = null;
                            z5 = false;
                            oq5 oq5Var6 = (oq5) hq5Var2;
                            oq5Var6.Z(1852065221);
                            oq5Var3 = oq5Var6;
                        }
                        oq5Var3.p(z5);
                        Iterator it = list.iterator();
                        boolean z6 = z5;
                        while (true) {
                            final ?? r14 = z6;
                            if (!it.hasNext()) {
                                break;
                            }
                            final Object next = it.next();
                            ?? r3 = r14 + 1;
                            if (r14 < 0) {
                                u75.n();
                                throw th;
                            }
                            final Object obj4 = obj;
                            boolean d = Intrinsics.d(next, obj4);
                            oq5 oq5Var7 = (oq5) hq5Var2;
                            Object K2 = oq5Var7.K();
                            if (K2 == kjnVar) {
                                K2 = new e5o(10);
                                oq5Var7.k0(K2);
                            }
                            Function0 function0 = (Function0) K2;
                            yci u = xp3.u(vciVar, ugo.a);
                            final o0k o0kVar4 = o0kVar2;
                            final long j9 = j6;
                            final Function1 function15 = function13;
                            final Function1 function16 = function1;
                            final wn5 wn5Var4 = wn5Var3;
                            final int i21 = i13;
                            final float f11 = f9;
                            f1s.c(12582960, 120, 0L, 0L, ild.C(674356541, new pyc() { // from class: zwo
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    Function0 function02;
                                    hq5 hq5Var4 = (hq5) obj6;
                                    int intValue = ((Integer) obj7).intValue();
                                    ((ua5) obj5).getClass();
                                    if ((intValue & 17) == 16) {
                                        oq5 oq5Var8 = (oq5) hq5Var4;
                                        if (oq5Var8.z()) {
                                            oq5Var8.S();
                                            return Unit.a;
                                        }
                                    }
                                    final Object obj8 = next;
                                    Object obj9 = obj4;
                                    boolean d2 = Intrinsics.d(obj8, obj9);
                                    wn5 C = ild.C(2053234107, new dv(wn5Var4, obj8, i21, 2), hq5Var4);
                                    final Function1 function17 = function15;
                                    kjn kjnVar3 = gq5.a;
                                    if (function17 == null) {
                                        oq5 oq5Var9 = (oq5) hq5Var4;
                                        oq5Var9.Z(-2100799152);
                                        oq5Var9.p(false);
                                        function02 = null;
                                    } else {
                                        oq5 oq5Var10 = (oq5) hq5Var4;
                                        oq5Var10.Z(-2100799151);
                                        boolean f12 = oq5Var10.f(function17) | oq5Var10.h(obj8);
                                        Object K3 = oq5Var10.K();
                                        if (f12 || K3 == kjnVar3) {
                                            final int i22 = 0;
                                            K3 = new Function0() { // from class: axo
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    switch (i22) {
                                                        case 0:
                                                            function17.invoke(obj8);
                                                            break;
                                                        default:
                                                            function17.invoke(obj8);
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            oq5Var10.k0(K3);
                                        }
                                        function02 = (Function0) K3;
                                        oq5Var10.p(false);
                                    }
                                    Function0 S = irf.S(function02, hq5Var4, 0);
                                    oq5 oq5Var11 = (oq5) hq5Var4;
                                    final Function1 function18 = function16;
                                    boolean f13 = oq5Var11.f(function18) | oq5Var11.h(obj8);
                                    Object K4 = oq5Var11.K();
                                    if (f13 || K4 == kjnVar3) {
                                        final int i23 = 1;
                                        K4 = new Function0() { // from class: axo
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                switch (i23) {
                                                    case 0:
                                                        function18.invoke(obj8);
                                                        break;
                                                    default:
                                                        function18.invoke(obj8);
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        oq5Var11.k0(K4);
                                    }
                                    yci i24 = androidx.compose.foundation.a.i(vci.a, null, S, (Function0) K4, 47);
                                    boolean g = oq5Var11.g(d2);
                                    Object K5 = oq5Var11.K();
                                    if (g || K5 == kjnVar3) {
                                        K5 = new i32(5, d2);
                                        oq5Var11.k0(K5);
                                    }
                                    ngg.a(d2, C, o0kVar4, f11, j9, com.yandex.music.core.ui.compose.b.c(com.yandex.music.core.ui.compose.b.b(androidx.compose.ui.platform.a.a(nfp.b(i24, false, (Function1) K5), "tabs_row_tab"), r14), "tabs_row_tab_selected", Boolean.valueOf(Intrinsics.d(obj8, obj9))), oq5Var11, 48);
                                    return Unit.a;
                                }
                            }, oq5Var7), oq5Var7, u, function0, d, false);
                            wwoVar = this;
                            z6 = r3;
                        }
                        return Unit.a;
                    }
                }, oq5Var2), oq5Var, (i20 & 7168) | (i20 & 896) | 14155824 | ((i12 << 12) & 458752) | (234881024 & i13) | ((i12 << 27) & 1879048192), 16);
                f5 = f4;
                o0kVar3 = o0kVar2;
                j7 = j6;
                function14 = function13;
                yciVar4 = yciVar3;
                j8 = j5;
                f6 = f3;
                z4 = z3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: ywo
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int R = rvf.R(i | 1);
                        int R2 = rvf.R(i2);
                        ngg.h(str, list, obj, function1, wn5Var, yciVar4, j8, j7, z4, o0kVar3, f6, f5, function14, (hq5) obj2, R, R2, i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i5 = i17;
        if ((i3 & 1024) == 0) {
        }
        i7 = i3 & 2048;
        if (i7 == 0) {
        }
        int i182 = i6;
        i9 = i3 & 4096;
        if (i9 == 0) {
        }
        i11 = i3 & RemoteCameraConfig.Notification.ID;
        if (i11 == 0) {
        }
        if ((i16 & 306783379) != 306783378) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if ((i3 & 64) != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if (i15 != 0) {
        }
        if (i5 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if (i11 == 0) {
        }
        j6 = j4;
        o0kVar2 = a2;
        oq5Var2.q();
        final wn5 wn5Var32 = wn5Var2;
        int i202 = i13 >> 9;
        oq5Var = oq5Var2;
        vxo.a(list.indexOf(obj) + (str == null ? 0 : 1), b2c.e, yciVar3, j5, 0L, f3, quj.c, quj.d, z3, false, ild.C(6405757, new Function2() { // from class: wwo
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [int] */
            /* JADX WARN: Type inference failed for: r3v5, types: [int] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                hq5 hq5Var2;
                float f9;
                kjn kjnVar;
                Throwable th;
                boolean z5;
                oq5 oq5Var3;
                wwo wwoVar = this;
                hq5 hq5Var3 = (hq5) obj2;
                if ((((Integer) obj3).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var3;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                vci vciVar = vci.a;
                String str2 = str;
                float f10 = f4;
                kjn kjnVar2 = gq5.a;
                if (str2 != null) {
                    oq5 oq5Var5 = (oq5) hq5Var3;
                    oq5Var5.Z(1855402681);
                    yci e = d.e(vciVar, f10);
                    Object K = oq5Var5.K();
                    if (K == kjnVar2) {
                        K = new i6o(23);
                        oq5Var5.k0(K);
                    }
                    yci a3 = androidx.compose.ui.platform.a.a(a.q(d.x(nfp.b(e, false, (Function1) K), null, 3), 0.0f, 0.0f, 8, 0.0f, 11), "tabs_row_title");
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    th = null;
                    z5 = false;
                    f9 = f10;
                    hq5Var2 = hq5Var3;
                    kjnVar = kjnVar2;
                    xv7.j(str2, a3, ((dq0) oq5Var5.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var5, 0, 0, 65528);
                    oq5Var3 = oq5Var5;
                } else {
                    hq5Var2 = hq5Var3;
                    f9 = f10;
                    kjnVar = kjnVar2;
                    th = null;
                    z5 = false;
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    oq5Var6.Z(1852065221);
                    oq5Var3 = oq5Var6;
                }
                oq5Var3.p(z5);
                Iterator it = list.iterator();
                boolean z6 = z5;
                while (true) {
                    final int r14 = z6;
                    if (!it.hasNext()) {
                        break;
                    }
                    final Object next = it.next();
                    ?? r3 = r14 + 1;
                    if (r14 < 0) {
                        u75.n();
                        throw th;
                    }
                    final Object obj4 = obj;
                    boolean d = Intrinsics.d(next, obj4);
                    oq5 oq5Var7 = (oq5) hq5Var2;
                    Object K2 = oq5Var7.K();
                    if (K2 == kjnVar) {
                        K2 = new e5o(10);
                        oq5Var7.k0(K2);
                    }
                    Function0 function0 = (Function0) K2;
                    yci u = xp3.u(vciVar, ugo.a);
                    final o0k o0kVar4 = o0kVar2;
                    final long j9 = j6;
                    final Function1 function15 = function13;
                    final Function1 function16 = function1;
                    final wn5 wn5Var4 = wn5Var32;
                    final int i21 = i13;
                    final float f11 = f9;
                    f1s.c(12582960, 120, 0L, 0L, ild.C(674356541, new pyc() { // from class: zwo
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            Function0 function02;
                            hq5 hq5Var4 = (hq5) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            ((ua5) obj5).getClass();
                            if ((intValue & 17) == 16) {
                                oq5 oq5Var8 = (oq5) hq5Var4;
                                if (oq5Var8.z()) {
                                    oq5Var8.S();
                                    return Unit.a;
                                }
                            }
                            final Object obj8 = next;
                            Object obj9 = obj4;
                            boolean d2 = Intrinsics.d(obj8, obj9);
                            wn5 C = ild.C(2053234107, new dv(wn5Var4, obj8, i21, 2), hq5Var4);
                            final Function1 function17 = function15;
                            kjn kjnVar3 = gq5.a;
                            if (function17 == null) {
                                oq5 oq5Var9 = (oq5) hq5Var4;
                                oq5Var9.Z(-2100799152);
                                oq5Var9.p(false);
                                function02 = null;
                            } else {
                                oq5 oq5Var10 = (oq5) hq5Var4;
                                oq5Var10.Z(-2100799151);
                                boolean f12 = oq5Var10.f(function17) | oq5Var10.h(obj8);
                                Object K3 = oq5Var10.K();
                                if (f12 || K3 == kjnVar3) {
                                    final int i22 = 0;
                                    K3 = new Function0() { // from class: axo
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i22) {
                                                case 0:
                                                    function17.invoke(obj8);
                                                    break;
                                                default:
                                                    function17.invoke(obj8);
                                                    break;
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    oq5Var10.k0(K3);
                                }
                                function02 = (Function0) K3;
                                oq5Var10.p(false);
                            }
                            Function0 S = irf.S(function02, hq5Var4, 0);
                            oq5 oq5Var11 = (oq5) hq5Var4;
                            final Function1 function18 = function16;
                            boolean f13 = oq5Var11.f(function18) | oq5Var11.h(obj8);
                            Object K4 = oq5Var11.K();
                            if (f13 || K4 == kjnVar3) {
                                final int i23 = 1;
                                K4 = new Function0() { // from class: axo
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        switch (i23) {
                                            case 0:
                                                function18.invoke(obj8);
                                                break;
                                            default:
                                                function18.invoke(obj8);
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                };
                                oq5Var11.k0(K4);
                            }
                            yci i24 = androidx.compose.foundation.a.i(vci.a, null, S, (Function0) K4, 47);
                            boolean g = oq5Var11.g(d2);
                            Object K5 = oq5Var11.K();
                            if (g || K5 == kjnVar3) {
                                K5 = new i32(5, d2);
                                oq5Var11.k0(K5);
                            }
                            ngg.a(d2, C, o0kVar4, f11, j9, com.yandex.music.core.ui.compose.b.c(com.yandex.music.core.ui.compose.b.b(androidx.compose.ui.platform.a.a(nfp.b(i24, false, (Function1) K5), "tabs_row_tab"), r14), "tabs_row_tab_selected", Boolean.valueOf(Intrinsics.d(obj8, obj9))), oq5Var11, 48);
                            return Unit.a;
                        }
                    }, oq5Var7), oq5Var7, u, function0, d, false);
                    wwoVar = this;
                    z6 = r3;
                }
                return Unit.a;
            }
        }, oq5Var2), oq5Var, (i202 & 7168) | (i202 & 896) | 14155824 | ((i12 << 12) & 458752) | (234881024 & i13) | ((i12 << 27) & 1879048192), 16);
        f5 = f4;
        o0kVar3 = o0kVar2;
        j7 = j6;
        function14 = function13;
        yciVar4 = yciVar3;
        j8 = j5;
        f6 = f3;
        z4 = z3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(final Function0 function0, final yci yciVar, final wn5 wn5Var, boolean z, long j, Function0 function02, Function2 function2, float f, o0k o0kVar, final wn5 wn5Var2, hq5 hq5Var, final int i, final int i2) {
        int i3;
        boolean z2;
        long j2;
        int i4;
        Function0 function03;
        int i5;
        int i6;
        Function2 function22;
        int i7;
        float f2;
        int i8;
        o0k q0kVar;
        final boolean z3;
        oq5 oq5Var;
        final float f3;
        final o0k o0kVar2;
        final Function0 function04;
        final long j3;
        xmn r;
        int i9;
        int i10;
        function0.getClass();
        yciVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-85357355);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= oq5Var2.g(z2) ? 2048 : 1024;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    j2 = j;
                    if (oq5Var2.e(j2)) {
                        i10 = 16384;
                        i3 |= i10;
                    }
                } else {
                    j2 = j;
                }
                i10 = RemoteCameraConfig.Notification.ID;
                i3 |= i10;
            } else {
                j2 = j;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                function03 = function02;
                i3 |= oq5Var2.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                    i6 = 196608;
                    function22 = function2;
                } else {
                    i6 = 196608;
                    function22 = function2;
                    if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                        i3 |= oq5Var2.h(function22) ? 1048576 : 524288;
                    }
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    i3 |= 12582912;
                    f2 = f;
                } else {
                    f2 = f;
                    if ((i & 12582912) == 0) {
                        i3 |= oq5Var2.c(f2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    }
                }
                if ((i & 100663296) == 0) {
                    int i12 = i3;
                    if ((i2 & 256) == 0 && oq5Var2.f(o0kVar)) {
                        i9 = 67108864;
                        i8 = i12 | i9;
                    }
                    i9 = 33554432;
                    i8 = i12 | i9;
                } else {
                    i8 = i3;
                }
                if ((i & 805306368) == 0) {
                    i8 |= oq5Var2.h(wn5Var2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                if ((i8 & 306783379) == 306783378 || !oq5Var2.z()) {
                    oq5Var2.U();
                    if ((i & 1) != 0 || oq5Var2.y()) {
                        if (i11 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 16) != 0) {
                            j2 = ((dq0) oq5Var2.j(eq0.a)).c.a;
                            i8 &= -57345;
                        }
                        if (i4 != 0) {
                            function03 = null;
                        }
                        if (i5 != 0) {
                            function22 = leu.d;
                        }
                        if (i7 != 0) {
                            f2 = 12;
                        }
                        if ((i2 & 256) != 0) {
                            float f4 = 8;
                            i8 &= -234881025;
                            q0kVar = new q0k(16, f4, 4, f4);
                            float f5 = f2;
                            boolean z4 = z2;
                            long j4 = j2;
                            Function0 function05 = function03;
                            oq5Var2.q();
                            o0k o0kVar3 = q0kVar;
                            wn5 C = ild.C(-935647217, new ytq(o0kVar3, wn5Var, f5, wn5Var2, function22), oq5Var2);
                            int i13 = i8 >> 3;
                            int i14 = i8 >> 6;
                            ltg.i(yciVar, z4, j4, function0, function05, C, oq5Var2, (i13 & 14) | i6 | (i14 & 112) | (i14 & 896) | ((i8 << 9) & 7168) | (i13 & 57344), 0);
                            z3 = z4;
                            oq5Var = oq5Var2;
                            f3 = f5;
                            o0kVar2 = o0kVar3;
                            function04 = function05;
                            j3 = j4;
                        }
                    } else {
                        oq5Var2.S();
                        if ((i2 & 16) != 0) {
                            i8 &= -57345;
                        }
                        if ((i2 & 256) != 0) {
                            i8 &= -234881025;
                        }
                    }
                    q0kVar = o0kVar;
                    float f52 = f2;
                    boolean z42 = z2;
                    long j42 = j2;
                    Function0 function052 = function03;
                    oq5Var2.q();
                    o0k o0kVar32 = q0kVar;
                    wn5 C2 = ild.C(-935647217, new ytq(o0kVar32, wn5Var, f52, wn5Var2, function22), oq5Var2);
                    int i132 = i8 >> 3;
                    int i142 = i8 >> 6;
                    ltg.i(yciVar, z42, j42, function0, function052, C2, oq5Var2, (i132 & 14) | i6 | (i142 & 112) | (i142 & 896) | ((i8 << 9) & 7168) | (i132 & 57344), 0);
                    z3 = z42;
                    oq5Var = oq5Var2;
                    f3 = f52;
                    o0kVar2 = o0kVar32;
                    function04 = function052;
                    j3 = j42;
                } else {
                    oq5Var2.S();
                    oq5Var = oq5Var2;
                    z3 = z2;
                    j3 = j2;
                    function04 = function03;
                    o0kVar2 = o0kVar;
                    f3 = f2;
                }
                final Function2 function23 = function22;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new Function2() { // from class: dxq
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ngg.i(Function0.this, yciVar, wn5Var, z3, j3, function04, function23, f3, o0kVar2, wn5Var2, (hq5) obj, rvf.R(i | 1), i2);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            function03 = function02;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i8 & 306783379) == 306783378) {
            }
            oq5Var2.U();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 256) != 0) {
            }
            q0kVar = o0kVar;
            float f522 = f2;
            boolean z422 = z2;
            long j422 = j2;
            Function0 function0522 = function03;
            oq5Var2.q();
            o0k o0kVar322 = q0kVar;
            wn5 C22 = ild.C(-935647217, new ytq(o0kVar322, wn5Var, f522, wn5Var2, function22), oq5Var2);
            int i1322 = i8 >> 3;
            int i1422 = i8 >> 6;
            ltg.i(yciVar, z422, j422, function0, function0522, C22, oq5Var2, (i1322 & 14) | i6 | (i1422 & 112) | (i1422 & 896) | ((i8 << 9) & 7168) | (i1322 & 57344), 0);
            z3 = z422;
            oq5Var = oq5Var2;
            f3 = f522;
            o0kVar2 = o0kVar322;
            function04 = function0522;
            j3 = j422;
            final Function2 function232 = function22;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function03 = function02;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i8 & 306783379) == 306783378) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 256) != 0) {
        }
        q0kVar = o0kVar;
        float f5222 = f2;
        boolean z4222 = z2;
        long j4222 = j2;
        Function0 function05222 = function03;
        oq5Var2.q();
        o0k o0kVar3222 = q0kVar;
        wn5 C222 = ild.C(-935647217, new ytq(o0kVar3222, wn5Var, f5222, wn5Var2, function22), oq5Var2);
        int i13222 = i8 >> 3;
        int i14222 = i8 >> 6;
        ltg.i(yciVar, z4222, j4222, function0, function05222, C222, oq5Var2, (i13222 & 14) | i6 | (i14222 & 112) | (i14222 & 896) | ((i8 << 9) & 7168) | (i13222 & 57344), 0);
        z3 = z4222;
        oq5Var = oq5Var2;
        f3 = f5222;
        o0kVar2 = o0kVar3222;
        function04 = function05222;
        j3 = j4222;
        final Function2 function2322 = function22;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void j(m5s m5sVar, hq5 hq5Var, int i) {
        yci u;
        yci u2;
        agr agrVar;
        float f;
        Object vuqVar;
        String str;
        vci vciVar;
        kjn kjnVar;
        agr agrVar2;
        float f2;
        yci yciVar;
        float f3;
        m5s m5sVar2;
        float f4;
        long j;
        float f5;
        vci vciVar2;
        long j2;
        m5s m5sVar3 = m5sVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-498751443);
        int i2 = (oq5Var.h(m5sVar3) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            vci vciVar3 = vci.a;
            u = d.u(androidx.compose.ui.platform.a.a(vciVar3, "take_charge"), b2c.l, (r2 & 2) == 0);
            float f6 = 16;
            float f7 = 0;
            yci u3 = xp3.u(androidx.compose.ui.graphics.a.b(d.d(bfg.Q(u, bfg.C(oq5Var), false, 14), 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 126975), ugo.b(f6, f6, f7, f7));
            agr agrVar3 = eq0.a;
            yci b = androidx.compose.foundation.a.b(u3, ((dq0) oq5Var.j(agrVar3)).c.b, vnj.i);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            u2 = d.u(d.z(vciVar3, 3), b2c.l, (r2 & 2) == 0);
            yci u4 = xp3.u(a.n(u2, f6, f7).f(new HorizontalAlignElement(b2c.p)), ugo.b(f6, f6, f6, f6));
            boolean h = oq5Var.h(m5sVar3);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar2) {
                agrVar = agrVar3;
                f = f6;
                vuq vuqVar2 = new vuq(0, m5sVar3, m5s.class, "onCancelButtonClick", "onCancelButtonClick()V", 0, 24);
                oq5Var.k0(vuqVar2);
                K2 = vuqVar2;
            } else {
                f = f6;
                agrVar = agrVar3;
            }
            float f8 = f;
            agr agrVar4 = agrVar;
            irf.r(a0g.E(!((ma5) oq5Var.j(pa5.a)).g() ? R.drawable.ic_close_round_dark_28 : R.drawable.ic_close_round_light_28, 0, oq5Var), rvf.M(R.string.close_content_description, oq5Var), androidx.compose.foundation.a.d(u4, uoiVar, eeo.a(0.0f, 7, 0L, false), true, null, new meo(0), (Function0) ((h9f) K2), 8), null, null, 0.0f, null, oq5Var, 0, 120);
            ((o4s) m5sVar3.b.getValue()).getClass();
            p1g.a(o4s.c(), null, d.e(vciVar3, 160), null, null, null, null, 0.0f, null, 0, oq5Var, 432, 1016);
            String o = vz1.o(vciVar3, 28, oq5Var, R.string.take_charge_popup_title, oq5Var);
            float f9 = 24;
            yci o2 = a.o(d.d(vciVar3, 1.0f), f9, 0.0f, 2);
            Object K3 = oq5Var.K();
            int i4 = 8;
            if (K3 == kjnVar2) {
                K3 = new d5s(i4);
                oq5Var.k0(K3);
            }
            xcs.b(o, nfp.b(o2, false, (Function1) K3), ((dq0) oq5Var.j(agrVar4)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 0, 0, 65016);
            xcs.b(vz1.o(vciVar3, 12, oq5Var, R.string.take_charge_popup_message, oq5Var), a.o(d.d(vciVar3, 1.0f), 23, 0.0f, 2), ((dq0) oq5Var.j(agrVar4)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65016);
            String o3 = vz1.o(vciVar3, f9, oq5Var, R.string.take_charge_popup_button_take, oq5Var);
            float f10 = 11;
            yci o4 = a.o(vciVar3, f10, 0.0f, 2);
            boolean h2 = oq5Var.h(m5sVar3);
            Object K4 = oq5Var.K();
            if (h2 || K4 == kjnVar2) {
                str = o3;
                vciVar = vciVar3;
                kjnVar = kjnVar2;
                agrVar2 = agrVar4;
                f2 = f8;
                yciVar = o4;
                f3 = 0.0f;
                vuqVar = new vuq(0, m5sVar3, m5s.class, "onTakeButtonClick", "onTakeButtonClick()V", 0, 25);
                m5sVar2 = m5sVar3;
                oq5Var.k0(vuqVar);
            } else {
                m5sVar2 = m5sVar3;
                f2 = f8;
                kjnVar = kjnVar2;
                str = o3;
                yciVar = o4;
                vciVar = vciVar3;
                f3 = 0.0f;
                vuqVar = K4;
                agrVar2 = agrVar4;
            }
            hdg.o(str, (Function0) ((h9f) vuqVar), yciVar, 0.0f, oq5Var, 384, 8);
            String o5 = vz1.o(vciVar, 8, oq5Var, R.string.take_charge_popup_button_cancel, oq5Var);
            yci o6 = a.o(vciVar, f10, f3, 2);
            long j3 = d85.n;
            long j4 = ((dq0) oq5Var.j(agrVar2)).b.a;
            boolean h3 = oq5Var.h(m5sVar2);
            Object K5 = oq5Var.K();
            if (h3 || K5 == kjnVar) {
                f4 = f2;
                j = j3;
                f5 = f9;
                vciVar2 = vciVar;
                j2 = j4;
                vuq vuqVar3 = new vuq(0, m5sVar, m5s.class, "onNotInterestingButtonClick", "onNotInterestingButtonClick()V", 0, 26);
                oq5Var.k0(vuqVar3);
                K5 = vuqVar3;
            } else {
                vciVar2 = vciVar;
                f5 = f9;
                f4 = f2;
                j = j3;
                j2 = j4;
            }
            hdg.b(o5, (Function0) ((h9f) K5), o6, new d85(j), new d85(j2), oq5Var, 3456, 0);
            vci vciVar4 = vciVar2;
            m5sVar3 = m5sVar;
            xcs.b(vz1.o(vciVar4, f5, oq5Var, R.string.take_charge_popup_marker, oq5Var), a.o(d.d(vciVar4, 1.0f), f4, 0.0f, 2), d85.b(((dq0) oq5Var.j(agrVar2)).b.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, ges.f(nu0.h(), 0L, v7g.z(10), null, 0L, null, null, 0, 0L, 16777213), oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.e(vciVar4, 32));
            WeakHashMap weakHashMap = rqv.w;
            u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new l5s(m5sVar3, i);
        }
    }

    public static final void k(po6 po6Var, boolean z, boolean z2, hq5 hq5Var, int i) {
        oq5 oq5Var;
        boolean z3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(398725316);
        int i2 = (oq5Var2.f(po6Var) ? 4 : 2) | i | (oq5Var2.g(z) ? 32 : 16) | (oq5Var2.g(z2) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            z3 = z;
            oq5Var = oq5Var2;
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            String str = po6Var.b;
            Boolean valueOf = Boolean.valueOf(po6Var.f);
            if (!z2) {
                valueOf = null;
            }
            oq5Var = oq5Var2;
            qgg.r(str, valueOf != null ? valueOf.booleanValue() : false, po6Var.e, null, z, 0, oq5Var, (i2 << 9) & 57344, 40);
            z3 = z;
            String str2 = po6Var.c;
            if (str2 == null) {
                oq5Var.Z(-1917925418);
            } else {
                oq5Var.Z(-1917925417);
                u1g.l(oq5Var, d.e(vciVar, mu0.a));
                t7g.i(str2, z3, null, oq5Var, i2 & 112, 4);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pul(po6Var, z3, z2, i);
        }
    }

    public static void l(boolean z) {
        if (z) {
            throw new hkj();
        }
    }

    public static final float m(List list, Resources resources) {
        float f = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f;
    }

    public static final faq n(f fVar, wfw wfwVar, kiw kiwVar, izs izsVar, long j) {
        k10 k10Var;
        dlr q;
        String g;
        String a0;
        fVar.getClass();
        kiwVar.getClass();
        CoverPath coverPath = null;
        uow i0 = qgg.i0(fVar, izsVar, null, 14);
        if (!kiwVar.equals(liw.a) && !(kiwVar instanceof iiw)) {
            if (!(kiwVar instanceof miw)) {
                if (!(kiwVar instanceof jiw)) {
                    b6e.s();
                    return null;
                }
                Uri uri = Uri.EMPTY;
                uri.getClass();
                return new daq((jiw) kiwVar, i0, new e5d(ConnectableDevice.KEY_ID, uri, "title", "subtitle", "thumb", null, null));
            }
            String t = fVar.t();
            t.getClass();
            String w = fVar.w();
            if (w == null) {
                w = "";
            }
            CoverPath none = CoverPath.none();
            none.getClass();
            c5b c5bVar = c5b.a;
            return new saq(new miw(t), i0, new x1u(t, w, "", none, null, j, c5bVar, c5bVar, false, c5bVar, c5bVar, null, null));
        }
        ssg.a(2, null, hrg.s("[connect][key-not-found] FallbackItem(playableId=", fVar.t(), ", albumId=", fVar.p().g(), ")"), null);
        String t2 = fVar.t();
        t2.getClass();
        String w2 = fVar.w();
        w2.getClass();
        String g2 = fVar.p().g();
        if (g2 != null) {
            String str = !StringsKt.U(g2) ? g2 : null;
            if (str != null) {
                String t3 = fVar.t();
                t3.getClass();
                k10Var = new k10(str, (String) null, t3, "", 0, 0, false, 240);
                c5b c5bVar2 = c5b.a;
                q = fVar.q();
                if (q != null && (g = q.g()) != null && (a0 = qgg.a0(g)) != null) {
                    WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
                    webPath$Storage.getClass();
                    coverPath = etn.B(a0, webPath$Storage);
                }
                mqs mqsVar = new mqs(t2, null, w2, k10Var, j, c5bVar2, null, null, null, false, dg2.b, false, null, false, null, null, null, null, null, null, null, null, coverPath, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, 0L, null, -4195392, 222);
                return new naq(q(mqsVar), i0, mqsVar);
            }
        }
        k10Var = k10.i;
        c5b c5bVar22 = c5b.a;
        q = fVar.q();
        if (q != null) {
            WebPath$Storage webPath$Storage2 = WebPath$Storage.AVATARS;
            webPath$Storage2.getClass();
            coverPath = etn.B(a0, webPath$Storage2);
        }
        mqs mqsVar2 = new mqs(t2, null, w2, k10Var, j, c5bVar22, null, null, null, false, dg2.b, false, null, false, null, null, null, null, null, null, null, null, coverPath, null, null, null, false, null, null, null, null, null, false, null, null, null, null, false, 0L, null, -4195392, 222);
        return new naq(q(mqsVar2), i0, mqsVar2);
    }

    public static final faq o(f fVar, wfw wfwVar, kiw kiwVar, izs izsVar, Object obj, long j, gxc gxcVar) {
        fVar.getClass();
        kiwVar.getClass();
        obj.getClass();
        if (kiwVar.equals(liw.a)) {
            return n(fVar, wfwVar, kiwVar, izsVar, j);
        }
        if (kiwVar instanceof iiw) {
            mqs mqsVar = obj instanceof mqs ? (mqs) obj : null;
            return mqsVar == null ? n(fVar, wfwVar, kiwVar, izsVar, j) : new naq(q(mqsVar), qgg.i0(fVar, izsVar, gxcVar, 6), mqsVar);
        }
        if (kiwVar instanceof miw) {
            x1u x1uVar = obj instanceof x1u ? (x1u) obj : null;
            return x1uVar == null ? n(fVar, wfwVar, kiwVar, izsVar, j) : new saq(new miw(x1uVar.a), qgg.i0(fVar, izsVar, gxcVar, 6), x1uVar);
        }
        if (kiwVar instanceof jiw) {
            return n(fVar, wfwVar, kiwVar, izsVar, j);
        }
        b6e.s();
        return null;
    }

    public static final String p(f9b f9bVar) {
        f9bVar.getClass();
        int size = f9bVar.a.size();
        int size2 = f9bVar.b.size();
        int size3 = f9bVar.c.size();
        int size4 = f9bVar.d.size();
        int size5 = f9bVar.e.size();
        int size6 = f9bVar.f.size();
        StringBuilder l = dfi.l("tracks=", size, size2, ", albums=", ", artists=");
        hrg.w(size3, size4, ", playlists=", ", preSaves=", l);
        l.append(size5);
        l.append(", videoClips=");
        l.append(size6);
        return l.toString();
    }

    public static final iiw q(mqs mqsVar) {
        mqsVar.getClass();
        return q5g.G(mqsVar.a, mqsVar.d.a);
    }

    public static final int r(Context context, int i) {
        context.getClass();
        context.getClass();
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final int s(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int t(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final Long u(xsu xsuVar) {
        xsuVar.getClass();
        if (xsuVar instanceof wsu) {
            vsu vsuVar = ((wsu) xsuVar).c;
            if (vsuVar instanceof ssu) {
                return ((ssu) vsuVar).c;
            }
            if (!(vsuVar instanceof tsu) && !Intrinsics.d(vsuVar, usu.a)) {
                b6e.s();
                return null;
            }
        } else {
            if (xsuVar instanceof qsu) {
                return ((qsu) xsuVar).b;
            }
            if (!xsuVar.equals(rsu.a)) {
                b6e.s();
                return null;
            }
        }
        return null;
    }

    public static final List w(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        List D = ff7.D(str);
        List D2 = ff7.D(str2);
        List D3 = ff7.D(str3);
        List E = ff7.E(str4);
        List E2 = ff7.E(str5);
        List E3 = ff7.E(str6);
        List E4 = ff7.E(str7);
        if (D.size() > D2.size()) {
            su4.s(2, null, "artist Names more then IDs, ids: " + D2 + ", artists: " + D, null);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int min = Math.min(D.size(), D2.size());
        for (int i = 0; i < min; i++) {
            String str8 = (String) D2.get(i);
            String str9 = (String) D.get(i);
            boolean d = Intrinsics.d(CollectionsKt.S(D3, i), "1");
            String str10 = (String) CollectionsKt.S(E2, i);
            WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
            CoverPath x = men.x(str10, webPath$Storage);
            CoverPath x2 = men.x((String) CollectionsKt.S(E3, i), webPath$Storage);
            List B = q7g.B((String) CollectionsKt.S(E4, i));
            B.getClass();
            linkedHashSet.add(new c01(str8, str9, d, false, null, 0, null, x, x2, B, q7g.P((String) CollectionsKt.S(E, i)), false, 37880));
        }
        return CollectionsKt.w0(linkedHashSet);
    }

    public static final int x(RemoteViews remoteViews, e9t e9tVar, int i, int i2, Integer num) {
        if (i == -1) {
            xq0.x("viewStubId must not be View.NO_ID");
            return 0;
        }
        int intValue = num != null ? num.intValue() : e9tVar.g.incrementAndGet();
        if (intValue != -1) {
            remoteViews.setInt(i, "setInflatedId", intValue);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return intValue;
    }

    public static final boolean y(aaq aaqVar, aaq aaqVar2) {
        aaqVar.getClass();
        aaqVar2.getClass();
        if ((aaqVar instanceof y9q) && (aaqVar2 instanceof y9q)) {
            return true;
        }
        if (!(aaqVar instanceof hbq) || !(aaqVar2 instanceof hbq)) {
            return aaqVar.equals(aaqVar2);
        }
        hbq hbqVar = (hbq) aaqVar2;
        return qgg.Z(hbqVar, qgg.P(hbqVar), qgg.Q(hbqVar), hbqVar instanceof cbq);
    }

    public static final ukd z(ukd ukdVar, float f) {
        k0k L = L(f);
        return ukdVar.d(new m0k(L, L, L, L));
    }

    public abstract void B();

    public abstract void I();

    public abstract void K(bfg bfgVar);

    public abstract String v();
}
