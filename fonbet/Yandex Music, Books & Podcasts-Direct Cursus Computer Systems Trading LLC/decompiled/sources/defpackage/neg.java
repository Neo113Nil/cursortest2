package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.media.ynison.service.a;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.mixes.data.remote.MixesEntitiesDto;
import com.yandex.music.mixes.data.remote.MixesEntityDataDto;
import com.yandex.music.mixes.data.remote.MixesEntityDataStyleDto;
import com.yandex.music.mixes.data.remote.MixesEntityDto;
import com.yandex.music.shared.dto.domainitem.BlockActionDto;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import com.yandex.music.shared.dto.domainitem.PlaylistDomainItemDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.in_app_restore.RestorePurchasesActivity;
import ru.yandex.music.novelties.podcasts.catalog.PodcastsCatalogActivity;

/* loaded from: classes6.dex */
public abstract class neg {
    public static volatile o6c a;

    public static final void A(dyr dyrVar, String str) {
        String str2;
        grk grkVar = grk.b;
        grkVar.getClass();
        y60 e = grkVar.e();
        arf g = tlm.g(bwf.c);
        String format = tfs.g.a().format(Long.valueOf(System.currentTimeMillis()));
        format.getClass();
        ((Map) g.getValue()).put("timestamp", format);
        switch (dyrVar.ordinal()) {
            case 0:
                str2 = "default";
                break;
            case 1:
                str2 = "notification";
                break;
            case 2:
                str2 = "other";
                break;
            case 3:
                str2 = "like";
                break;
            case 4:
                str2 = "unlike";
                break;
            case 5:
                str2 = "dislike";
                break;
            case 6:
                str2 = "undislike";
                break;
            case 7:
                str2 = "modify_playlist";
                break;
            default:
                b6e.s();
                return;
        }
        ((Map) g.getValue()).put("trigger", str2);
        if (str != null) {
            ((Map) g.getValue()).put(ConnectableDevice.KEY_ID, str);
        }
        tlm.o(e, "Sync.Trigger", g.isInitialized() ? (Map) g.getValue() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(mxo mxoVar, float f, cg6 cg6Var) {
        iwo iwoVar;
        int i;
        uqn uqnVar;
        if (cg6Var instanceof iwo) {
            iwoVar = (iwo) cg6Var;
            int i2 = iwoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iwoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iwoVar.k;
                Object obj2 = nm6.a;
                i = iwoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    uqn uqnVar2 = new uqn();
                    Function2 jwoVar = new jwo(uqnVar2, f, (Continuation) null);
                    iwoVar.j = uqnVar2;
                    iwoVar.l = 1;
                    if (mxoVar.a(hqi.a, jwoVar, iwoVar) == obj2) {
                        return obj2;
                    }
                    uqnVar = uqnVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uqnVar = iwoVar.j;
                    qgg.h0(obj);
                }
                return new Float(uqnVar.a);
            }
        }
        iwoVar = new iwo(cg6Var);
        Object obj3 = iwoVar.k;
        Object obj22 = nm6.a;
        i = iwoVar.l;
        if (i != 0) {
        }
        return new Float(uqnVar.a);
    }

    public static void C(Context context) {
        zee zeeVar = zee.a;
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) RestorePurchasesActivity.class);
        intent.putExtra("extra.entrypoint", (Parcelable) zeeVar);
        context.startActivity(intent);
    }

    public static final yci D() {
        return d.t(vci.a, 0.0f, 148, 1);
    }

    public static final yci E(yci yciVar, w2r w2rVar, hq5 hq5Var) {
        String str;
        boolean f = ((oq5) hq5Var).f(w2rVar);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            zii ziiVar = (zii) w2rVar.c;
            if (ziiVar instanceof qii) {
                str = "album";
            } else if (ziiVar instanceof rii) {
                str = "artist";
            } else if (ziiVar instanceof tii) {
                str = "playlist";
            } else if (ziiVar.equals(wii.a)) {
                str = "search";
            } else if (ziiVar.equals(vii.a)) {
                str = "other";
            } else if (ziiVar instanceof yii) {
                str = "wave";
            } else if (ziiVar instanceof sii) {
                str = "multiwave";
            } else {
                if (!(ziiVar instanceof uii)) {
                    b6e.s();
                    return null;
                }
                str = "q2v_wave";
            }
            K = str;
            oq5Var.k0(K);
        }
        return b.c(yciVar, "context", (String) K);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r7 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [c5b] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList F(MixesEntitiesDto mixesEntitiesDto) {
        c8i c8iVar;
        MixesEntityDataDto data;
        String id;
        String title;
        BlockActionDto action;
        String deeplink;
        gde gdeVar;
        ?? r8;
        String imagesLayoutType;
        mixesEntitiesDto.getClass();
        List<MixesEntityDto> items = mixesEntitiesDto.getItems();
        if (items != null) {
            ArrayList arrayList = new ArrayList();
            for (MixesEntityDto mixesEntityDto : items) {
                if (mixesEntityDto == null || (data = mixesEntityDto.getData()) == null || (id = data.getId()) == null || (title = data.getTitle()) == null || (action = data.getAction()) == null || (deeplink = action.getDeeplink()) == null) {
                    c8iVar = null;
                } else {
                    MixesEntityDataStyleDto style = data.getStyle();
                    if (style != null && (imagesLayoutType = style.getImagesLayoutType()) != null) {
                        int hashCode = imagesLayoutType.hashCode();
                        if (hashCode == -1885250017) {
                            if (imagesLayoutType.equals("RADIAL")) {
                                gdeVar = gde.b;
                            }
                            su4.s(2, null, "unsupported imagesLayoutType", null);
                            gdeVar = null;
                        } else if (hashCode != -1848936376) {
                            if (hashCode == 79219304 && imagesLayoutType.equals("STACK")) {
                                gdeVar = gde.a;
                            }
                            su4.s(2, null, "unsupported imagesLayoutType", null);
                            gdeVar = null;
                        } else {
                            if (imagesLayoutType.equals("SINGLE")) {
                                gdeVar = gde.c;
                            }
                            su4.s(2, null, "unsupported imagesLayoutType", null);
                            gdeVar = null;
                        }
                    }
                    gdeVar = gde.a;
                    List<String> covers = data.getCovers();
                    if (covers != null) {
                        r8 = new ArrayList();
                        for (String str : covers) {
                            String pathForSize = str != null ? new jcv(str, WebPath$Storage.AVATARS).getPathForSize(wct.s()) : null;
                            if (pathForSize != null) {
                                r8.add(pathForSize);
                            }
                        }
                    } else {
                        r8 = 0;
                    }
                    if (r8 == 0) {
                        r8 = c5b.a;
                    }
                    c8iVar = new c8i(id, title, deeplink, gdeVar, r8);
                }
                if (c8iVar != null) {
                    arrayList.add(c8iVar);
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }

    public static final gow G(a aVar, String str, String str2, boolean z) {
        fow fowVar;
        List list;
        aVar.getClass();
        str.getClass();
        String m = aVar.k().m();
        if (m == null) {
            return null;
        }
        int l = aVar.j().l();
        vqw vqwVar = new vqw(l);
        switch (ouj.D(aVar.k().o())) {
            case 0:
            case 10:
                fowVar = fow.l;
                break;
            case 1:
                fowVar = fow.g;
                break;
            case 2:
                fowVar = fow.e;
                break;
            case 3:
                fowVar = fow.c;
                break;
            case 4:
                fowVar = fow.j;
                break;
            case 5:
                fowVar = fow.h;
                break;
            case 6:
                fowVar = fow.f;
                break;
            case 7:
                fowVar = fow.d;
                break;
            case 8:
                fowVar = fow.k;
                break;
            case 9:
                if (!z) {
                    fowVar = fow.l;
                    break;
                } else {
                    fowVar = fow.i;
                    break;
                }
            default:
                b6e.s();
                return null;
        }
        String n = aVar.k().n();
        if (n == null) {
            n = "";
        }
        String k = aVar.k().k();
        if (k == null) {
            k = "";
        }
        String appVersion = aVar.k().getAppVersion();
        String str3 = appVersion != null ? appVersion : "";
        com.yandex.media.ynison.service.d m2 = aVar.m();
        wqw a2 = vqwVar.a(eeh.a((m2 != null ? m2.j() : 0.0d) * l));
        boolean equals = m.equals(str2);
        boolean i = aVar.j().i();
        boolean j = aVar.j().j();
        boolean equals2 = m.equals(str);
        boolean z2 = !aVar.l();
        switch (nym.a[ouj.D(aVar.k().o())]) {
            case -1:
            case 10:
            case 11:
                list = c5b.a;
                break;
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                list = c5b.a;
                break;
            case 2:
                list = c5b.a;
                break;
            case 3:
                list = c5b.a;
                break;
            case 4:
                list = c5b.a;
                break;
            case 5:
                list = t75.c(eow.a);
                break;
            case 6:
                list = t75.c(eow.a);
                break;
            case 7:
                list = t75.c(eow.a);
                break;
            case 8:
                list = c5b.a;
                break;
            case 9:
                list = t75.c(eow.a);
                break;
        }
        return new gow(m, fowVar, n, k, str3, a2, equals, i, j, equals2, z2, list);
    }

    public static final eul H(PlaylistDomainItemDto playlistDomainItemDto) {
        String kind;
        String title;
        playlistDomainItemDto.getClass();
        String uuid = playlistDomainItemDto.getUuid();
        String uid = playlistDomainItemDto.getUid();
        if (uid == null || (kind = playlistDomainItemDto.getKind()) == null || (title = playlistDomainItemDto.getTitle()) == null) {
            return null;
        }
        EntityCoverDto cover = playlistDomainItemDto.getCover();
        return new eul(uid, kind, title, cover != null ? c3x.V(cover) : null, uuid);
    }

    public static final String I(String str) {
        if (str == null) {
            return null;
        }
        return new jcv(str, WebPath$Storage.AVATARS_NO_CROP).getPathForSize(frv.b());
    }

    public static final hbq J(aou aouVar) {
        aouVar.getClass();
        if (aouVar instanceof tnu) {
            tnu tnuVar = (tnu) aouVar;
            return new ebq(tnuVar.a, tnuVar.b);
        }
        if (aouVar instanceof unu) {
            unu unuVar = (unu) aouVar;
            return new fbq(unuVar.a, unuVar.b);
        }
        if (aouVar instanceof znu) {
            return new cbq(((znu) aouVar).c());
        }
        b6e.s();
        return null;
    }

    public static void K(View view) {
        try {
            if (!xeu.s) {
                xeu.s = true;
                if (Build.VERSION.SDK_INT < 28) {
                    xeu.q = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                    xeu.r = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    xeu.q = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    xeu.r = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = xeu.q;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = xeu.r;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = xeu.r;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = xeu.q;
            if (method2 != null) {
                method2.invoke(view, null);
            }
        } catch (Throwable unused) {
            xeu.t = true;
        }
    }

    public static int L(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final meg a(geg gegVar) {
        Float valueOf = Float.valueOf(gegVar.d);
        return new meg(Long.valueOf(gegVar.b), Long.valueOf(gegVar.c), valueOf, Boolean.valueOf(gegVar.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, nzj nzjVar, yci yciVar, String str2, boolean z, int i, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        String str3;
        int i6;
        int i7;
        boolean z2;
        Object K;
        int i8;
        oq5 oq5Var;
        yci yciVar3;
        boolean z3;
        String str4;
        boolean z4;
        xmn r;
        nzjVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-248387378);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? oq5Var2.f(nzjVar) : oq5Var2.h(nzjVar) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                str3 = str2;
                i4 |= oq5Var2.f(str3) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    i4 |= oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
                }
                if ((196608 & i2) == 0) {
                    i6 = i;
                    i4 |= oq5Var2.d(i6) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                } else {
                    i6 = i;
                }
                i7 = i4;
                if ((74899 & i7) == 74898 || !oq5Var2.z()) {
                    yci yciVar4 = i9 != 0 ? vci.a : yciVar2;
                    String str5 = i5 != 0 ? null : str3;
                    yci o = androidx.compose.foundation.layout.a.o(yciVar4, 16, 0.0f, 2);
                    int i10 = i7 & 112;
                    z2 = i10 != 32 || ((i7 & 64) != 0 && oq5Var2.h(nzjVar));
                    K = oq5Var2.K();
                    kjn kjnVar = gq5.a;
                    if (!z2 || K == kjnVar) {
                        K = new ykf(18, nzjVar);
                        oq5Var2.k0(K);
                    }
                    yci a2 = androidx.compose.ui.platform.a.a(d.d(com.yandex.music.core.ui.compose.a.b(o, null, 0L, 0.0f, null, (Function2) K, 15), 1.0f), "overview_block_ui");
                    kfh d = ug3.d(b2c.b, false);
                    i8 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, a2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, d, wp5.f);
                    g0g.U(oq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var2, i8, kb5Var);
                    }
                    g0g.U(oq5Var2, H, wp5.d);
                    if (z) {
                        oq5Var2.Z(492624705);
                        boolean z5 = i10 == 32 || ((i7 & 64) != 0 && oq5Var2.h(nzjVar));
                        Object K2 = oq5Var2.K();
                        if (z5 || K2 == kjnVar) {
                            z4 = false;
                            msj msjVar = new msj(0, nzjVar, nzj.class, "onExpandClick", "onExpandClick()V", 0, 4);
                            oq5Var2.k0(msjVar);
                            K2 = msjVar;
                        } else {
                            z4 = false;
                        }
                        h9f h9fVar = (h9f) K2;
                        h6g h6gVar = nu0.a;
                        h6g h6gVar2 = h6g.c;
                        boolean z6 = z4;
                        Function0 function0 = (Function0) h9fVar;
                        yciVar3 = yciVar4;
                        z3 = true;
                        pd.n(str, i6, nu0.j(), function0, null, rvf.N(R.string.overview_block_content_description, new Object[]{str5 == null ? "" : str5}, oq5Var2), oq5Var2, (i7 & 14) | ((i7 >> 12) & 112), 80);
                        oq5Var = oq5Var2;
                        oq5Var.p(z6);
                    } else {
                        oq5Var = oq5Var2;
                        yciVar3 = yciVar4;
                        z3 = true;
                        oq5Var.Z(492992179);
                        h6g h6gVar3 = nu0.a;
                        h6g h6gVar4 = h6g.c;
                        xcs.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, i, 0, null, nu0.j(), oq5Var, i7 & 14, ((i7 >> 6) & 7168) | 48, 55294);
                        oq5Var.p(false);
                    }
                    oq5Var.p(z3);
                    str4 = str5;
                } else {
                    oq5Var2.S();
                    yciVar3 = yciVar2;
                    oq5Var = oq5Var2;
                    str4 = str3;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new lba(str, nzjVar, yciVar3, str4, z, i, i2, i3);
                    return;
                }
                return;
            }
            str3 = str2;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i7 = i4;
            if ((74899 & i7) == 74898) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            yci o2 = androidx.compose.foundation.layout.a.o(yciVar4, 16, 0.0f, 2);
            int i102 = i7 & 112;
            if (i102 != 32) {
            }
            K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (!z2) {
            }
            K = new ykf(18, nzjVar);
            oq5Var2.k0(K);
            yci a22 = androidx.compose.ui.platform.a.a(d.d(com.yandex.music.core.ui.compose.a.b(o2, null, 0L, 0.0f, null, (Function2) K, 15), 1.0f), "overview_block_ui");
            kfh d2 = ug3.d(b2c.b, false);
            i8 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, a22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var2.O) {
            }
            ouj.x(i8, oq5Var2, i8, kb5Var2);
            g0g.U(oq5Var2, H2, wp5.d);
            if (z) {
            }
            oq5Var.p(z3);
            str4 = str5;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str3 = str2;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i7 = i4;
        if ((74899 & i7) == 74898) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        yci o22 = androidx.compose.foundation.layout.a.o(yciVar4, 16, 0.0f, 2);
        int i1022 = i7 & 112;
        if (i1022 != 32) {
        }
        K = oq5Var2.K();
        kjn kjnVar22 = gq5.a;
        if (!z2) {
        }
        K = new ykf(18, nzjVar);
        oq5Var2.k0(K);
        yci a222 = androidx.compose.ui.platform.a.a(d.d(com.yandex.music.core.ui.compose.a.b(o22, null, 0L, 0.0f, null, (Function2) K, 15), 1.0f), "overview_block_ui");
        kfh d22 = ug3.d(b2c.b, false);
        i8 = oq5Var2.P;
        androidx.compose.runtime.internal.a l22 = oq5Var2.l();
        yci H22 = vnj.H(oq5Var2, a222);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        g0g.U(oq5Var2, d22, wp5.f);
        g0g.U(oq5Var2, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var2.O) {
        }
        ouj.x(i8, oq5Var2, i8, kb5Var22);
        g0g.U(oq5Var2, H22, wp5.d);
        if (z) {
        }
        oq5Var.p(z3);
        str4 = str5;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void c(min minVar, grv grvVar, hq5 hq5Var, int i) {
        int i2;
        min minVar2;
        oq5 oq5Var;
        grv grvVar2;
        int i3;
        grv grvVar3;
        Object r9nVar;
        yci yciVar;
        vci vciVar;
        float f;
        boolean z;
        String str;
        float f2;
        float f3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-234950386);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var2.f(minVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 3) != 2)) {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                i3 = i2 & (-113);
                grvVar3 = ltg.A(oq5Var2).a;
            } else {
                oq5Var2.S();
                i3 = i2 & (-113);
                grvVar3 = grvVar;
            }
            oq5Var2.q();
            vci vciVar2 = vci.a;
            float f4 = 16;
            float f5 = 0;
            yci u = xp3.u(d.d(vciVar2, 1.0f), ugo.b(f4, f4, f5, f5));
            agr agrVar = eq0.a;
            float f6 = 24;
            yci o = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.b(u, ((dq0) oq5Var2.j(agrVar)).c.b, vnj.i), f6, 0.0f, 2);
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var2, 54);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, o);
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
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            float f7 = 40;
            u1g.l(oq5Var2, d.e(vciVar2, f7));
            xv7.j(rvf.M(R.string.permissions_notifications, oq5Var2), null, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var2, 0, 0, 65274);
            float f8 = 12;
            u1g.l(oq5Var2, d.e(vciVar2, f8));
            xv7.j(rvf.M(R.string.permissions_notifications_desc, oq5Var2), null, ((dq0) oq5Var2.j(agrVar)).b.b, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var2, 0, 0, 65274);
            oq5Var = oq5Var2;
            u1g.l(oq5Var, d.e(vciVar2, f6));
            float f9 = 150;
            yci t = d.t(vciVar2, f9, 0.0f, 2);
            String M = rvf.M(R.string.permissions_notifications_to_settings, oq5Var);
            int i5 = i3 & 14;
            boolean z2 = i5 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                yciVar = t;
                vciVar = vciVar2;
                f = f7;
                z = false;
                str = M;
                f2 = 0.0f;
                f3 = f8;
                r9nVar = new r9n(0, minVar, min.class, "onTryClicked", "onTryClicked()V", 0, 7);
                oq5Var.k0(r9nVar);
            } else {
                vciVar = vciVar2;
                yciVar = t;
                str = M;
                r9nVar = K;
                z = false;
                f3 = f8;
                f = f7;
                f2 = 0.0f;
            }
            hdg.o(str, (Function0) ((h9f) r9nVar), yciVar, 0.0f, oq5Var, 384, 8);
            u1g.l(oq5Var, d.e(vciVar, f3));
            yci t2 = d.t(vciVar, f9, f2, 2);
            boolean z3 = i5 != 4 ? z : true;
            Object K2 = oq5Var.K();
            if (z3 || K2 == kjnVar) {
                K2 = new r9n(0, minVar, min.class, "onNotNowClicked", "onNotNowClicked()V", 0, 8);
                minVar2 = minVar;
                oq5Var.k0(K2);
            } else {
                minVar2 = minVar;
            }
            bcx.d((Function0) ((h9f) K2), t2, false, ghh.e, oq5Var, 3120, 4);
            eta.p(vciVar, f, oq5Var, true);
            grvVar2 = grvVar3;
        } else {
            minVar2 = minVar;
            oq5Var = oq5Var2;
            oq5Var.S();
            grvVar2 = grvVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(minVar2, grvVar2, i, 5);
        }
    }

    public static final void d(int i, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        int i2;
        wn5 wn5Var = jf0.g;
        wn5 wn5Var2 = jf0.j;
        wn5 wn5Var3 = jf0.m;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1025818272);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (((i2 | 196608) & 74899) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, true, ild.C(-890656296, new t2n(yciVar, d.r(vci.a, 104), function0), oq5Var), oq5Var, 3072, 2);
            z = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new egs(function0, yciVar, z, i);
        }
    }

    public static final void e(int i, int i2, hq5 hq5Var, yci yciVar) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1283923986);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        }
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new s2(28);
                oq5Var.k0(K);
            }
            d(((i3 << 12) & 57344) | 3510, oq5Var, yciVar, (Function0) K, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(yciVar, i, i2, 13);
        }
    }

    public static final void f(fli fliVar, xli xliVar, yci yciVar, hq5 hq5Var, int i) {
        fliVar.getClass();
        xliVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(492544350);
        int i2 = (oq5Var.f(fliVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(xliVar) ? 32 : 16;
        }
        int i3 = i2 | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (fliVar instanceof cli) {
            oq5Var.Z(1780681487);
            cli cliVar = (cli) fliVar;
            ksw.a(cliVar.a, gut.U0(xliVar, (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b), (eli) fliVar, oq5Var, ((i3 << 6) & 896) | ((i3 >> 3) & 14)), E(androidx.compose.ui.platform.a.a(yciVar, "music_history_album_track"), cliVar.c, oq5Var), oq5Var, 0);
            oq5Var.p(false);
        } else if (fliVar instanceof dli) {
            oq5Var.Z(1781076303);
            dli dliVar = (dli) fliVar;
            vut.i(dliVar.a, gut.U0(xliVar, (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b), (eli) fliVar, oq5Var, ((i3 << 6) & 896) | ((i3 >> 3) & 14)), E(androidx.compose.ui.platform.a.a(yciVar, "music_history_cover_track"), dliVar.c, oq5Var), oq5Var, 0);
            oq5Var.p(false);
        } else if (fliVar instanceof zki) {
            oq5Var.Z(1781463462);
            ksw.e(6, oq5Var, null, true);
            oq5Var.p(false);
        } else if (fliVar instanceof ali) {
            oq5Var.Z(1781613254);
            vut.k(6, 2, oq5Var, null, true);
            oq5Var.p(false);
        } else if (fliVar instanceof wki) {
            oq5Var.Z(1781761093);
            ksw.e(6, oq5Var, null, false);
            oq5Var.p(false);
        } else {
            if (!fliVar.equals(xki.a)) {
                throw vz1.i(oq5Var, 888724040, false);
            }
            oq5Var.Z(1781906917);
            vut.k(6, 2, oq5Var, null, false);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(fliVar, xliVar, yciVar, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(mxo mxoVar, float f, tm0 tm0Var, Continuation continuation) {
        hwo hwoVar;
        int i;
        uqn uqnVar;
        if (continuation instanceof hwo) {
            hwoVar = (hwo) continuation;
            int i2 = hwoVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hwoVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hwoVar.k;
                Object obj2 = nm6.a;
                i = hwoVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    uqn uqnVar2 = new uqn();
                    Function2 en0Var = new en0(f, tm0Var, uqnVar2, (Continuation) null);
                    hwoVar.j = uqnVar2;
                    hwoVar.l = 1;
                    if (mxoVar.a(hqi.a, en0Var, hwoVar) == obj2) {
                        return obj2;
                    }
                    uqnVar = uqnVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uqnVar = hwoVar.j;
                    qgg.h0(obj);
                }
                return new Float(uqnVar.a);
            }
        }
        hwoVar = new hwo(continuation);
        Object obj3 = hwoVar.k;
        Object obj22 = nm6.a;
        i = hwoVar.l;
        if (i != 0) {
        }
        return new Float(uqnVar.a);
    }

    public static int h(rnj rnjVar, boolean z) {
        int i = rnjVar.b;
        int i2 = rnjVar.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) rnjVar.d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b2 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b2 == b) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b = b2;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public static final String i(Number number, hq5 hq5Var) {
        String str;
        String str2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(11454921);
        if (number != null) {
            long longValue = number.longValue();
            if (longValue >= 8388608) {
                double d = 100;
                str2 = String.format(Locale.US, "%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor((longValue / 8388608.0d) * d) / d)}, 1));
            } else if (longValue >= 8192) {
                double d2 = 100;
                str2 = String.format(Locale.US, "%.2f kB", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor((longValue / 8192.0d) * d2) / d2)}, 1));
            } else if (longValue >= 8) {
                double d3 = 100;
                str2 = String.format(Locale.US, "%.2f B", Arrays.copyOf(new Object[]{Double.valueOf(Math.floor((longValue / 8.0d) * d3) / d3)}, 1));
            } else {
                str2 = longValue + " b";
            }
            str = str2.concat("/s");
        } else {
            str = null;
        }
        if (str == null) {
            str = z(oq5Var);
        }
        oq5Var.p(false);
        return str;
    }

    public static final void j(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            xq0.o(i != i2 ? dfi.f("Both size ", i, i2, " and step ", " must be greater than zero.") : dfi.c(i, "size ", " must be greater than zero."));
        }
    }

    public static final yci k() {
        return d.t(vci.a, 0.0f, 180, 1);
    }

    public static final ryc l(hq5 hq5Var) {
        ((zn2) ((oq5) hq5Var).j(ao2.a)).getClass();
        return dii.b;
    }

    public static final ym2 m(hq5 hq5Var) {
        return ((zn2) ((oq5) hq5Var).j(ao2.a)).c;
    }

    public static final cuv n(hq5 hq5Var) {
        return ((d3w) ((oq5) hq5Var).j(e3w.a)).g;
    }

    public static final huv o(hq5 hq5Var) {
        return ((d3w) ((oq5) hq5Var).j(e3w.a)).d;
    }

    public static o6c p() {
        if (a == null) {
            o6c o6cVar = new o6c(28);
            new ConcurrentHashMap();
            new ConcurrentHashMap();
            a = o6cVar;
        }
        return a;
    }

    public static final pyc q(hq5 hq5Var) {
        return ((d3w) ((oq5) hq5Var).j(e3w.a)).j;
    }

    public static final vn2 r(hq5 hq5Var) {
        return ((zn2) ((oq5) hq5Var).j(ao2.a)).a;
    }

    public static final w2w s(hq5 hq5Var) {
        return ((d3w) ((oq5) hq5Var).j(e3w.a)).a;
    }

    public static final c3w t(hq5 hq5Var) {
        return ((d3w) ((oq5) hq5Var).j(e3w.a)).h;
    }

    public static final d3w u(hq5 hq5Var) {
        return (d3w) ((oq5) hq5Var).j(e3w.a);
    }

    public static Intent v(Context context, fbj fbjVar, String str, String str2) {
        context.getClass();
        Intent putExtra = new Intent(context, (Class<?>) PodcastsCatalogActivity.class).putExtra("non.music.landing.screen.content", fbjVar).putExtra("non.music.landing.tab.id", str).putExtra("non.music.landing.block.id", str2).putExtra("non.music.landing.back.nav", true);
        putExtra.getClass();
        return putExtra;
    }

    public static final void w(ofp ofpVar) {
        bcx.F(ofpVar).E();
    }

    public static final boolean x(hsu hsuVar) {
        if (hsuVar instanceof gsu) {
            return ((gsu) hsuVar).e != mhi.a;
        }
        if (hsuVar instanceof fsu) {
            return false;
        }
        b6e.s();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void y(xci xciVar, Function0 function0) {
        fkj fkjVar = xciVar.g;
        if (fkjVar == null) {
            fkjVar = new fkj((ekj) xciVar);
            xciVar.g = fkjVar;
        }
        bcx.G(xciVar).getSnapshotObserver().a(fkjVar, k9i.B0, function0);
    }

    public static final String z(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1109975501);
        String M = rvf.M(R.string.unknown_text, oq5Var);
        oq5Var.p(false);
        return M;
    }
}
