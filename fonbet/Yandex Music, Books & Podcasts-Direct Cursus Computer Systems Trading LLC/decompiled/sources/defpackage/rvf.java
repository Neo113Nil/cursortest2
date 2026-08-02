package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.material.shape.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes.dex */
public abstract class rvf {
    public static InetAddress A(Context context) {
        String hostAddress;
        try {
            if (context != null) {
                int ipAddress = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getIpAddress();
                if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
                    ipAddress = Integer.reverseBytes(ipAddress);
                }
                try {
                    hostAddress = InetAddress.getByAddress(BigInteger.valueOf(ipAddress).toByteArray()).getHostAddress();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                return InetAddress.getByName(hostAddress);
            }
            return InetAddress.getByName(hostAddress);
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
            return null;
        }
        hostAddress = null;
    }

    public static final ViewParent B(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final a0q C(mwk mwkVar) {
        u3q J;
        mwkVar.getClass();
        izs D = D(mwkVar);
        if (D == null || (J = swf.J(D)) == null) {
            return null;
        }
        return J.getId();
    }

    public static final izs D(mwk mwkVar) {
        mwkVar.getClass();
        return (izs) dag.p(mwkVar, x2i.k);
    }

    public static Intent E(Context context, c0p c0pVar) {
        context.getClass();
        c0pVar.getClass();
        return F(context, c0pVar, p0p.a);
    }

    public static Intent F(Context context, c0p c0pVar, p0p p0pVar) {
        context.getClass();
        c0pVar.getClass();
        p0pVar.getClass();
        Intent intent = new Intent(context, (Class<?>) SearchActivity.class);
        intent.putExtra("extra.for.entity.search", new l5p(p0pVar, c0pVar));
        return intent;
    }

    public static final boolean G(cvl cvlVar) {
        cvlVar.getClass();
        return ivf.I(cvlVar);
    }

    public static final String H(int i, int i2, Object[] objArr, hq5 hq5Var) {
        return gdg.K(hq5Var).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void I(ConcurrentHashMap concurrentHashMap, Map.Entry entry) {
        concurrentHashMap.getClass();
        concurrentHashMap.put(entry.getKey(), entry.getValue());
    }

    public static void J(WifiManager.MulticastLock multicastLock) {
        if (multicastLock == null || !multicastLock.isHeld()) {
            return;
        }
        multicastLock.release();
    }

    public static void K(View view, a aVar) {
        u2b u2bVar = aVar.b.c;
        if (u2bVar == null || !u2bVar.a) {
            return;
        }
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += ((View) parent).getElevation();
        }
        mdh mdhVar = aVar.b;
        if (mdhVar.m != f) {
            mdhVar.m = f;
            aVar.B();
        }
    }

    public static void L(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof a) {
            K(viewGroup, (a) background);
        }
    }

    public static final String M(int i, hq5 hq5Var) {
        return gdg.K(hq5Var).getString(i);
    }

    public static final String N(int i, Object[] objArr, hq5 hq5Var) {
        return gdg.K(hq5Var).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final nyn O(int i) {
        if (i == 0) {
            throw null;
        }
        int D = ouj.D(i);
        if (D != 0 && D != 1) {
            if (D == 2) {
                return nyn.b;
            }
            if (D == 3) {
                return nyn.c;
            }
            if (D != 4) {
                b6e.s();
                return null;
            }
        }
        return nyn.a;
    }

    public static final nco P(lbo lboVar, mx7 mx7Var) {
        b7q b7qVar = mx7Var.a;
        zvs zvsVar = mx7Var.b;
        g7q g7qVar = mx7Var.c;
        zao zaoVar = zao.a;
        if (Intrinsics.d(lboVar, zaoVar)) {
            return xbo.b;
        }
        if (Intrinsics.d(lboVar, zao.b)) {
            return xbo.c;
        }
        zao zaoVar2 = zao.c;
        if (Intrinsics.d(lboVar, zaoVar2)) {
            bdt I = hag.I(zzp.class);
            qdc qdcVar = b7qVar.a;
            qdcVar.getClass();
            return new gco(1, (zzp) qdcVar.C(I));
        }
        if (lboVar instanceof gbo) {
            int i = ((gbo) lboVar).a;
            bdt I2 = hag.I(zzp.class);
            qdc qdcVar2 = b7qVar.a;
            qdcVar2.getClass();
            return new gco(i, (zzp) qdcVar2.C(I2));
        }
        if (lboVar instanceof hbo) {
            lm4 lm4Var = ((hbo) lboVar).a;
            bdt I3 = hag.I(zzp.class);
            qdc qdcVar3 = b7qVar.a;
            qdcVar3.getClass();
            return new hco(lm4Var, (zzp) qdcVar3.C(I3));
        }
        if (lboVar instanceof abo) {
            return new zbo(jhp.j(ghp.d(new mjm(14, lboVar), Long.valueOf(((abo) lboVar).a)), Integer.MAX_VALUE));
        }
        if (lboVar instanceof bbo) {
            return new zbo(ghp.b(new ry0(((bbo) lboVar).a)));
        }
        if (lboVar instanceof ibo) {
            ibo iboVar = (ibo) lboVar;
            lm4 lm4Var2 = iboVar.a;
            Function1 function1 = iboVar.b;
            Pair[] pairArr = iboVar.c;
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                arrayList.add(new Pair(pair.a, P((lbo) pair.b, mx7Var)));
            }
            return new ico(lm4Var2, function1, arrayList, P(iboVar.d, mx7Var));
        }
        if (lboVar instanceof kbo) {
            x0q x0qVar = g7qVar != null ? g7qVar.d : null;
            kbo kboVar = (kbo) lboVar;
            long j = kboVar.a;
            jbo jboVar = kboVar.b;
            nco P = P(kboVar.c, mx7Var);
            bdt I4 = hag.I(z66.class);
            qdc qdcVar4 = b7qVar.a;
            qdcVar4.getClass();
            return new mco(j, jboVar, P, (z66) qdcVar4.C(I4), x0qVar);
        }
        if (lboVar instanceof dbo) {
            nco P2 = P(zaoVar2, mx7Var);
            bdt I5 = hag.I(bp3.class);
            qdc qdcVar5 = b7qVar.a;
            qdcVar5.getClass();
            return new bco(P2, (bp3) qdcVar5.C(I5));
        }
        if (lboVar instanceof ebo) {
            nco P3 = P(zaoVar, mx7Var);
            zvsVar.getClass();
            bdt I6 = hag.I(q3t.class);
            qdc qdcVar6 = b7qVar.a;
            qdcVar6.getClass();
            return new dco(P3, zvsVar, (q3t) qdcVar6.C(I6));
        }
        if (!(lboVar instanceof fbo)) {
            b6e.s();
            return null;
        }
        fbo fboVar = (fbo) lboVar;
        nco P4 = P(fboVar.b, mx7Var);
        zvsVar.getClass();
        bdt I7 = hag.I(q3t.class);
        qdc qdcVar7 = b7qVar.a;
        qdcVar7.getClass();
        q3t q3tVar = (q3t) qdcVar7.C(I7);
        bdt I8 = hag.I(fys.class);
        qdc qdcVar8 = b7qVar.a;
        qdcVar8.getClass();
        return new fco(P4, zvsVar, q3tVar, (fys) qdcVar8.C(I8), fboVar.a);
    }

    public static final int Q(nyn nynVar) {
        nynVar.getClass();
        int ordinal = nynVar.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        b6e.s();
        return 0;
    }

    public static final int R(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(o3k o3kVar, yci yciVar, o0k o0kVar, d2k d2kVar, int i, float f, hz2 hz2Var, s1r s1rVar, boolean z, Function1 function1, wxi wxiVar, z1r z1rVar, qg0 qg0Var, wn5 wn5Var, hq5 hq5Var, int i2, int i3, int i4) {
        int i5;
        o0k o0kVar2;
        int i6;
        d2k d2kVar2;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        hz2 hz2Var2;
        s1r s1rVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        oq5 oq5Var;
        wxi wxiVar2;
        qg0 qg0Var2;
        d2k d2kVar3;
        int i19;
        float f3;
        hz2 hz2Var3;
        s1r s1rVar3;
        o0k o0kVar3;
        boolean z2;
        Function1 function12;
        z1r z1rVar2;
        xmn r;
        int i20;
        s1r s1rVar4;
        Function1 function13;
        wxi wxiVar3;
        d2k d2kVar4;
        o0k o0kVar4;
        z1r z1rVar3;
        hz2 hz2Var4;
        float f4;
        s1r s1rVar5;
        wxi wxiVar4;
        qg0 qg0Var3;
        int i21;
        boolean z3;
        int i22;
        int i23;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1372972868);
        if ((i2 & 6) == 0) {
            i5 = (oq5Var2.f(o3kVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        int i24 = i4 & 4;
        if (i24 != 0) {
            i5 |= 384;
        } else if ((i2 & 384) == 0) {
            o0kVar2 = o0kVar;
            i5 |= oq5Var2.f(o0kVar2) ? 256 : 128;
            i6 = i4 & 8;
            int i25 = 1024;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                d2kVar2 = d2kVar;
                i5 |= oq5Var2.f(d2kVar2) ? 2048 : 1024;
                i7 = i4 & 16;
                if (i7 != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i8 = i;
                    i5 |= oq5Var2.d(i8) ? 16384 : 8192;
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 196608) == 0) {
                            i5 |= oq5Var2.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                        hz2Var2 = hz2Var;
                    } else {
                        hz2Var2 = hz2Var;
                        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                            i5 |= oq5Var2.f(hz2Var2) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 12582912) != 0) {
                        if ((i4 & 128) == 0) {
                            s1rVar2 = s1rVar;
                            if (oq5Var2.f(s1rVar2)) {
                                i23 = 8388608;
                                i5 |= i23;
                            }
                        } else {
                            s1rVar2 = s1rVar;
                        }
                        i23 = RemoteCameraConfig.Camera.BITRATE;
                        i5 |= i23;
                    } else {
                        s1rVar2 = s1rVar;
                    }
                    i11 = i4 & 256;
                    if (i11 == 0) {
                        i5 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        i5 |= oq5Var2.g(z) ? 67108864 : 33554432;
                    }
                    if ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                        i5 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        i5 |= oq5Var2.g(false) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    i12 = i4 & 1024;
                    if (i12 == 0) {
                        i14 = i3 | 6;
                        i13 = i12;
                    } else if ((i3 & 6) == 0) {
                        i13 = i12;
                        i14 = i3 | (oq5Var2.h(function1) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        if ((i4 & 2048) == 0 && oq5Var2.h(wxiVar)) {
                            i22 = 32;
                            i14 |= i22;
                        }
                        i22 = 16;
                        i14 |= i22;
                    }
                    int i26 = i14;
                    i15 = i5;
                    i16 = i4 & 4096;
                    if (i16 == 0) {
                        i17 = i26 | 384;
                    } else {
                        i17 = i26;
                        if ((i3 & 384) == 0) {
                            i17 |= oq5Var2.f(z1rVar) ? 256 : 128;
                            if ((i3 & 3072) == 0) {
                                if ((i4 & RemoteCameraConfig.Notification.ID) == 0 && oq5Var2.f(qg0Var)) {
                                    i25 = 2048;
                                }
                                i17 |= i25;
                            }
                            if ((i3 & 24576) == 0) {
                                i17 |= oq5Var2.h(wn5Var) ? 16384 : 8192;
                            }
                            i18 = i17;
                            if (oq5Var2.P(i15 & 1, (i15 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
                                oq5Var2.U();
                                if ((i2 & 1) == 0 || oq5Var2.y()) {
                                    if (i24 != 0) {
                                        float f5 = 0;
                                        o0kVar2 = new q0k(f5, f5, f5, f5);
                                    }
                                    d2k d2kVar5 = i6 != 0 ? b2c.t : d2kVar2;
                                    if (i7 != 0) {
                                        i8 = 0;
                                    }
                                    float f6 = i9 != 0 ? 0 : f2;
                                    hz2 hz2Var5 = i10 != 0 ? b2c.l : hz2Var2;
                                    if ((i4 & 128) != 0) {
                                        s1rVar4 = avf.F(o3kVar, null, oq5Var2, (i15 & 14) | 196608, 30);
                                        i20 = i15 & (-29360129);
                                    } else {
                                        i20 = i15;
                                        s1rVar4 = s1rVar2;
                                    }
                                    boolean z4 = i11 == 0 ? z : true;
                                    function13 = i13 == 0 ? function1 : null;
                                    if ((i4 & 2048) != 0) {
                                        wxiVar3 = avf.O(o3kVar, bxj.b, oq5Var2, (i20 & 14) | 432);
                                        i18 &= -113;
                                    } else {
                                        wxiVar3 = wxiVar;
                                    }
                                    z1r z1rVar4 = i16 != 0 ? wvo.h : z1rVar;
                                    if ((i4 & RemoteCameraConfig.Notification.ID) != 0) {
                                        qg0 a = lzj.a(oq5Var2);
                                        i18 &= -7169;
                                        hz2 hz2Var6 = hz2Var5;
                                        d2kVar4 = d2kVar5;
                                        o0kVar4 = o0kVar2;
                                        z1rVar3 = z1rVar4;
                                        hz2Var4 = hz2Var6;
                                        oq5Var = oq5Var2;
                                        f4 = f6;
                                        s1rVar5 = s1rVar4;
                                        wxiVar4 = wxiVar3;
                                        qg0Var3 = a;
                                    } else {
                                        hz2 hz2Var7 = hz2Var5;
                                        d2kVar4 = d2kVar5;
                                        o0kVar4 = o0kVar2;
                                        z1rVar3 = z1rVar4;
                                        hz2Var4 = hz2Var7;
                                        oq5Var = oq5Var2;
                                        f4 = f6;
                                        s1rVar5 = s1rVar4;
                                        wxiVar4 = wxiVar3;
                                        qg0Var3 = qg0Var;
                                    }
                                    i21 = i20;
                                    z3 = z4;
                                } else {
                                    oq5Var2.S();
                                    int i27 = (i4 & 128) != 0 ? i15 & (-29360129) : i15;
                                    if ((i4 & 2048) != 0) {
                                        i18 &= -113;
                                    }
                                    if ((i4 & RemoteCameraConfig.Notification.ID) != 0) {
                                        i18 &= -7169;
                                    }
                                    function13 = function1;
                                    oq5Var = oq5Var2;
                                    f4 = f2;
                                    hz2Var4 = hz2Var2;
                                    s1rVar5 = s1rVar2;
                                    o0kVar4 = o0kVar2;
                                    wxiVar4 = wxiVar;
                                    z1rVar3 = z1rVar;
                                    i21 = i27;
                                    d2kVar4 = d2kVar2;
                                    z3 = z;
                                    qg0Var3 = qg0Var;
                                }
                                oq5Var.q();
                                int i28 = i18;
                                int i29 = i21 >> 6;
                                int i30 = i21 << 12;
                                int i31 = i28 << 6;
                                bow.j(yciVar, o3kVar, o0kVar4, bxj.b, s1rVar5, z3, qg0Var3, i8, f4, d2kVar4, wxiVar4, function13, b2c.o, hz2Var4, z1rVar3, wn5Var, oq5Var, ((i21 >> 3) & 14) | 24576 | ((i21 << 3) & 112) | (i21 & 896) | ((i21 >> 18) & 7168) | (i29 & 458752) | (i29 & 3670016) | ((i28 << 12) & 29360128) | (i30 & 234881024) | (i30 & 1879048192), (i31 & 896) | ((i21 >> 9) & 14) | 3072 | (i28 & 112) | (i29 & 57344) | ((i28 << 9) & 458752) | (i31 & 3670016));
                                float f7 = f4;
                                s1rVar3 = s1rVar5;
                                d2kVar3 = d2kVar4;
                                z2 = z3;
                                i19 = i8;
                                hz2Var3 = hz2Var4;
                                qg0Var2 = qg0Var3;
                                f3 = f7;
                                Function1 function14 = function13;
                                wxiVar2 = wxiVar4;
                                function12 = function14;
                                o0kVar3 = o0kVar4;
                                z1rVar2 = z1rVar3;
                            } else {
                                oq5Var = oq5Var2;
                                oq5Var.S();
                                wxiVar2 = wxiVar;
                                qg0Var2 = qg0Var;
                                d2kVar3 = d2kVar2;
                                i19 = i8;
                                f3 = f2;
                                hz2Var3 = hz2Var2;
                                s1rVar3 = s1rVar2;
                                o0kVar3 = o0kVar2;
                                z2 = z;
                                function12 = function1;
                                z1rVar2 = z1rVar;
                            }
                            r = oq5Var.r();
                            if (r != null) {
                                r.d = new p2k(o3kVar, yciVar, o0kVar3, d2kVar3, i19, f3, hz2Var3, s1rVar3, z2, function12, wxiVar2, z1rVar2, qg0Var2, wn5Var, i2, i3, i4);
                                return;
                            }
                            return;
                        }
                    }
                    if ((i3 & 3072) == 0) {
                    }
                    if ((i3 & 24576) == 0) {
                    }
                    i18 = i17;
                    if (oq5Var2.P(i15 & 1, (i15 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
                    }
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                i8 = i;
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i2 & 12582912) != 0) {
                }
                i11 = i4 & 256;
                if (i11 == 0) {
                }
                if ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                }
                i12 = i4 & 1024;
                if (i12 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i262 = i14;
                i15 = i5;
                i16 = i4 & 4096;
                if (i16 == 0) {
                }
                if ((i3 & 3072) == 0) {
                }
                if ((i3 & 24576) == 0) {
                }
                i18 = i17;
                if (oq5Var2.P(i15 & 1, (i15 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
                }
                r = oq5Var.r();
                if (r != null) {
                }
            }
            d2kVar2 = d2kVar;
            i7 = i4 & 16;
            if (i7 != 0) {
            }
            i8 = i;
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i2 & 12582912) != 0) {
            }
            i11 = i4 & 256;
            if (i11 == 0) {
            }
            if ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            }
            i12 = i4 & 1024;
            if (i12 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i2622 = i14;
            i15 = i5;
            i16 = i4 & 4096;
            if (i16 == 0) {
            }
            if ((i3 & 3072) == 0) {
            }
            if ((i3 & 24576) == 0) {
            }
            i18 = i17;
            if (oq5Var2.P(i15 & 1, (i15 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        o0kVar2 = o0kVar;
        i6 = i4 & 8;
        int i252 = 1024;
        if (i6 == 0) {
        }
        d2kVar2 = d2kVar;
        i7 = i4 & 16;
        if (i7 != 0) {
        }
        i8 = i;
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i2 & 12582912) != 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        if ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
        }
        i12 = i4 & 1024;
        if (i12 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i26222 = i14;
        i15 = i5;
        i16 = i4 & 4096;
        if (i16 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i18 = i17;
        if (oq5Var2.P(i15 & 1, (i15 & 306783379) == 306783378 || (i18 & 9363) != 9362)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(o3k o3kVar, yci yciVar, o0k o0kVar, d2k d2kVar, int i, float f, hz2 hz2Var, s1r s1rVar, boolean z, Function1 function1, wxi wxiVar, z1r z1rVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3, int i4) {
        int i5;
        yci yciVar2;
        int i6;
        o0k o0kVar2;
        int i7;
        d2k d2kVar2;
        int i8;
        int i9;
        float f2;
        int i10;
        hz2 hz2Var2;
        s1r s1rVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z2;
        wxi wxiVar2;
        yci yciVar3;
        o0k o0kVar3;
        hz2 hz2Var3;
        s1r s1rVar3;
        d2k d2kVar3;
        Function1 function12;
        z1r z1rVar2;
        xmn r;
        o0k o0kVar4;
        float f3;
        hz2 hz2Var4;
        int i19;
        s1r s1rVar4;
        int i20;
        int i21;
        s1r s1rVar5;
        Function1 function13;
        wxi wxiVar3;
        z1r z1rVar3;
        int i22;
        yci yciVar4;
        o0k o0kVar5;
        boolean z3;
        int i23;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1870896258);
        if ((i2 & 6) == 0) {
            i5 = (oq5Var.f(o3kVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i24 = i4 & 2;
        if (i24 != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i2 & 384) == 0) {
                o0kVar2 = o0kVar;
                i5 |= oq5Var.f(o0kVar2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    d2kVar2 = d2kVar;
                    i5 |= oq5Var.f(d2kVar2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= oq5Var.d(i) ? 16384 : RemoteCameraConfig.Notification.ID;
                        i9 = i4 & 32;
                        if (i9 != 0) {
                            i5 |= 196608;
                            f2 = f;
                        } else {
                            f2 = f;
                            if ((i2 & 196608) == 0) {
                                i5 |= oq5Var.c(f2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                            }
                        }
                        i10 = i4 & 64;
                        if (i10 != 0) {
                            i5 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                            hz2Var2 = hz2Var;
                        } else {
                            hz2Var2 = hz2Var;
                            if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                                i5 |= oq5Var.f(hz2Var2) ? 1048576 : 524288;
                            }
                        }
                        if ((i2 & 12582912) == 0) {
                            if ((i4 & 128) == 0) {
                                s1rVar2 = s1rVar;
                                if (oq5Var.f(s1rVar2)) {
                                    i23 = 8388608;
                                    i5 |= i23;
                                }
                            } else {
                                s1rVar2 = s1rVar;
                            }
                            i23 = RemoteCameraConfig.Camera.BITRATE;
                            i5 |= i23;
                        } else {
                            s1rVar2 = s1rVar;
                        }
                        i11 = i4 & 256;
                        if (i11 != 0) {
                            i5 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i12 = i11;
                            i5 |= oq5Var.g(z) ? 67108864 : 33554432;
                            i13 = i5 | 805306368;
                            i14 = i4 & 1024;
                            if (i14 == 0) {
                                i16 = i3 | 6;
                                i15 = i14;
                            } else if ((i3 & 6) == 0) {
                                i15 = i14;
                                i16 = i3 | (oq5Var.h(function1) ? 4 : 2);
                            } else {
                                i15 = i14;
                                i16 = i3;
                            }
                            if ((i3 & 48) == 0) {
                                i16 |= 16;
                            }
                            int i25 = i16 | 384;
                            if ((i3 & 3072) == 0) {
                                i25 |= oq5Var.h(wn5Var) ? 2048 : 1024;
                            }
                            i17 = i25;
                            if (oq5Var.P(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
                                oq5Var.S();
                                i18 = i;
                                z2 = z;
                                wxiVar2 = wxiVar;
                                yciVar3 = yciVar2;
                                o0kVar3 = o0kVar2;
                                hz2Var3 = hz2Var2;
                                s1rVar3 = s1rVar2;
                                d2kVar3 = d2kVar2;
                                function12 = function1;
                                z1rVar2 = z1rVar;
                            } else {
                                oq5Var.U();
                                if ((i2 & 1) == 0 || oq5Var.y()) {
                                    yci yciVar5 = i24 != 0 ? vci.a : yciVar2;
                                    if (i6 != 0) {
                                        float f4 = 0;
                                        o0kVar4 = new q0k(f4, f4, f4, f4);
                                    } else {
                                        o0kVar4 = o0kVar2;
                                    }
                                    if (i7 != 0) {
                                        d2kVar2 = b2c.t;
                                    }
                                    int i26 = i8 != 0 ? 0 : i;
                                    f3 = i9 != 0 ? 0 : f2;
                                    hz2Var4 = i10 != 0 ? b2c.l : hz2Var2;
                                    if ((i4 & 128) != 0) {
                                        s1rVar4 = avf.F(o3kVar, null, oq5Var, (i13 & 14) | 196608, 30);
                                        i19 = i13 & (-29360129);
                                    } else {
                                        i19 = i13;
                                        s1rVar4 = s1rVar2;
                                    }
                                    boolean z4 = i12 == 0 ? z : true;
                                    Function1 function14 = i15 == 0 ? function1 : null;
                                    dp7 O = avf.O(o3kVar, bxj.b, oq5Var, (i19 & 14) | 432);
                                    i20 = i19;
                                    i21 = i26;
                                    s1rVar5 = s1rVar4;
                                    function13 = function14;
                                    wxiVar3 = O;
                                    z1rVar3 = wvo.h;
                                    i22 = i17 & (-113);
                                    yciVar4 = yciVar5;
                                    o0kVar5 = o0kVar4;
                                    z3 = z4;
                                } else {
                                    oq5Var.S();
                                    function13 = function1;
                                    z1rVar3 = z1rVar;
                                    f3 = f2;
                                    o0kVar5 = o0kVar2;
                                    hz2Var4 = hz2Var2;
                                    s1rVar5 = s1rVar2;
                                    wxiVar3 = wxiVar;
                                    i22 = i17 & (-113);
                                    i20 = (i4 & 128) != 0 ? i13 & (-29360129) : i13;
                                    yciVar4 = yciVar2;
                                    i21 = i;
                                    z3 = z;
                                }
                                d2k d2kVar4 = d2kVar2;
                                oq5Var.q();
                                a(o3kVar, yciVar4, o0kVar5, d2kVar4, i21, f3, hz2Var4, s1rVar5, z3, function13, wxiVar3, z1rVar3, lzj.a(oq5Var), wn5Var, oq5Var, i20 & 2147483646, (i22 & 1022) | ((i22 << 3) & 57344), 0);
                                z1rVar2 = z1rVar3;
                                wxiVar2 = wxiVar3;
                                function12 = function13;
                                z2 = z3;
                                s1rVar3 = s1rVar5;
                                hz2Var3 = hz2Var4;
                                f2 = f3;
                                i18 = i21;
                                d2kVar3 = d2kVar4;
                                o0kVar3 = o0kVar5;
                                yciVar3 = yciVar4;
                            }
                            r = oq5Var.r();
                            if (r == null) {
                                r.d = new q2k(o3kVar, yciVar3, o0kVar3, d2kVar3, i18, f2, hz2Var3, s1rVar3, z2, function12, wxiVar2, z1rVar2, wn5Var, i2, i3, i4);
                                return;
                            }
                            return;
                        }
                        i12 = i11;
                        i13 = i5 | 805306368;
                        i14 = i4 & 1024;
                        if (i14 == 0) {
                        }
                        if ((i3 & 48) == 0) {
                        }
                        int i252 = i16 | 384;
                        if ((i3 & 3072) == 0) {
                        }
                        i17 = i252;
                        if (oq5Var.P(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
                        }
                        r = oq5Var.r();
                        if (r == null) {
                        }
                    }
                    i9 = i4 & 32;
                    if (i9 != 0) {
                    }
                    i10 = i4 & 64;
                    if (i10 != 0) {
                    }
                    if ((i2 & 12582912) == 0) {
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    i13 = i5 | 805306368;
                    i14 = i4 & 1024;
                    if (i14 == 0) {
                    }
                    if ((i3 & 48) == 0) {
                    }
                    int i2522 = i16 | 384;
                    if ((i3 & 3072) == 0) {
                    }
                    i17 = i2522;
                    if (oq5Var.P(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
                    }
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
                d2kVar2 = d2kVar;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 != 0) {
                }
                i10 = i4 & 64;
                if (i10 != 0) {
                }
                if ((i2 & 12582912) == 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i5 | 805306368;
                i14 = i4 & 1024;
                if (i14 == 0) {
                }
                if ((i3 & 48) == 0) {
                }
                int i25222 = i16 | 384;
                if ((i3 & 3072) == 0) {
                }
                i17 = i25222;
                if (oq5Var.P(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            o0kVar2 = o0kVar;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            d2kVar2 = d2kVar;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 != 0) {
            }
            i10 = i4 & 64;
            if (i10 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i5 | 805306368;
            i14 = i4 & 1024;
            if (i14 == 0) {
            }
            if ((i3 & 48) == 0) {
            }
            int i252222 = i16 | 384;
            if ((i3 & 3072) == 0) {
            }
            i17 = i252222;
            if (oq5Var.P(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        o0kVar2 = o0kVar;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        d2kVar2 = d2kVar;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 != 0) {
        }
        i10 = i4 & 64;
        if (i10 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i5 | 805306368;
        i14 = i4 & 1024;
        if (i14 == 0) {
        }
        if ((i3 & 48) == 0) {
        }
        int i2522222 = i16 | 384;
        if ((i3 & 3072) == 0) {
        }
        i17 = i2522222;
        if (oq5Var.P(i13 & 1, (i13 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(qo6 qo6Var, ukd ukdVar, plv plvVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1546246261);
        int i2 = (oq5Var.d(qo6Var.ordinal()) ? 4 : 2) | i | (oq5Var.f(ukdVar) ? 32 : 16) | (oq5Var.f(plvVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            vq2.c(ukdVar, f40.f, ild.C(-555851027, new wcj(8, qo6Var, plvVar), oq5Var), oq5Var, ((i2 >> 3) & 14) | 384, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(qo6Var, ukdVar, plvVar, i, 16);
        }
    }

    public static final void d(wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(674185128);
        int i2 = 0;
        int i3 = 2;
        if (oq5Var.P(i & 1, (i & 3) != 2)) {
            ozm ozmVar = moo.a;
            Object obj = (koo) oq5Var.j(ozmVar);
            oq5Var.Z(-796079677);
            ioo iooVar = (ioo) o2g.g0(new Object[0], ioo.e, xuj.X, oq5Var, 3072, 4);
            iooVar.c = (koo) oq5Var.j(ozmVar);
            oq5Var.p(false);
            Object[] objArr = {obj};
            xce xceVar = xce.G;
            sea seaVar = new sea(25, obj, iooVar);
            apo apoVar = bpo.a;
            apo apoVar2 = new apo(i2, xceVar, seaVar);
            boolean h = oq5Var.h(obj) | oq5Var.h(iooVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new ssb(11, obj, iooVar);
                oq5Var.k0(K);
            }
            Object obj2 = (qvf) o2g.g0(objArr, apoVar2, (Function0) K, oq5Var, 0, 4);
            etn.l(ozmVar.a(obj2), ild.C(1863926504, new qtf(i3, wn5Var, obj2), oq5Var), oq5Var, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp0(i, i3, wn5Var);
        }
    }

    public static final void e(yci yciVar, o0k o0kVar, tsf tsfVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        tsf tsfVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-293525996);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(o0kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            tsfVar2 = tsfVar;
            i2 |= oq5Var2.f(tsfVar2) ? 256 : 128;
        } else {
            tsfVar2 = tsfVar;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(function1) ? 2048 : 1024;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            float f = 16;
            oq5Var = oq5Var2;
            wdp.U(new kpd(irv.h(oq5Var2) ? 4 : 2), d.c(yciVar, 1.0f), tsfVar2, ghh.C(new q0k(f, 24, f, 52), o0kVar), qx0.g(f), qx0.g(f), null, false, null, function1, oq5Var, (i2 & 896) | 1769472, (i2 >> 9) & 14, 912);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(yciVar, o0kVar, tsfVar, function1, i);
        }
    }

    public static final void f(w8i w8iVar, tmb tmbVar, hq5 hq5Var, int i) {
        tmb tmbVar2;
        a9i a9iVar;
        w8i w8iVar2 = w8iVar;
        w8iVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-73009656);
        int i2 = (oq5Var.f(w8iVar2) ? 4 : 2) | i | (oq5Var.h(tmbVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            tsf a = wsf.a(oq5Var);
            a9i a9iVar2 = (a9i) szf.Q(w8iVar2.c, oq5Var).getValue();
            ogp.g.e(a9iVar2 instanceof x8i, a9iVar2 instanceof y8i, null, oq5Var, 4096, 4);
            String M = M(R.string.mixes_screen_toolbar_title, oq5Var);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                a9iVar = a9iVar2;
                K = new k5h(0, w8iVar2, w8i.class, "onBackClick", "onBackClick()V", 0, 14);
                oq5Var.k0(K);
            } else {
                a9iVar = a9iVar2;
            }
            tmbVar2 = tmbVar;
            w8iVar2 = w8iVar;
            xp3.d(M, a, null, C, (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(-451217602, new up(a9iVar, a, w8iVar, tmbVar2, 20), oq5Var), oq5Var, 0, 48, 2020);
            oq5Var = oq5Var;
        } else {
            tmbVar2 = tmbVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(w8iVar2, tmbVar2, i, 8);
        }
    }

    public static final void g(w8i w8iVar, tmb tmbVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1585854094);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(w8iVar) : oq5Var.h(w8iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(tmbVar) : oq5Var.h(tmbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 256 : 128;
        }
        boolean z = false;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            vci vciVar = vci.a;
            yci l = androidx.compose.foundation.layout.a.l(d.c(vciVar, 1.0f), o0kVar);
            kfh d = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, l);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci x = d.x(bfg.Q(d.c(vciVar, 1.0f), bfg.C(oq5Var), false, 14), new iz2(0.0f, -0.1f), 2);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && oq5Var.h(w8iVar))) {
                z = true;
            }
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new s8i(0, w8iVar);
                oq5Var.k0(K);
            }
            j((Function1) K, tmbVar, x, 0, true, null, oq5Var, 24640 | (i2 & 112), 40);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(w8iVar, tmbVar, o0kVar, i, 18);
        }
    }

    public static final void h(o0k o0kVar, tsf tsfVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-376720676);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(o0kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(tsfVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            pm0.a(null, ild.C(991412211, new m2g(9, o0kVar, tsfVar), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(o0kVar, tsfVar, i, 16);
        }
    }

    public static final void i(List list, w8i w8iVar, o0k o0kVar, tsf tsfVar, hq5 hq5Var, int i) {
        int i2;
        tsf tsfVar2;
        o0k o0kVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-48002400);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(w8iVar) : oq5Var.h(w8iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(tsfVar) ? 2048 : 1024;
        }
        boolean z = false;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            yci a = androidx.compose.ui.platform.a.a(vci.a, "mixes_screen_content");
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && oq5Var.h(w8iVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object K = oq5Var.K();
            if (z3 || K == gq5.a) {
                K = new dae(22, list, w8iVar);
                oq5Var.k0(K);
            }
            int i3 = i2 >> 3;
            e(a, o0kVar, tsfVar, (Function1) K, oq5Var, (i3 & 112) | 6 | (i3 & 896));
            o0kVar2 = o0kVar;
            tsfVar2 = tsfVar;
        } else {
            tsfVar2 = tsfVar;
            o0kVar2 = o0kVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(list, w8iVar, o0kVar2, tsfVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(Function1 function1, tmb tmbVar, yci yciVar, int i, boolean z, hmj hmjVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        yci yciVar2;
        int i6;
        hmj hmjVar2;
        boolean z3;
        xmn r;
        boolean z4;
        function1.getClass();
        tmbVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-394181754);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? oq5Var.f(tmbVar) : oq5Var.h(tmbVar) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i8 = i4 | 3072;
        int i9 = i3 & 16;
        if (i9 != 0) {
            i8 = i4 | 27648;
        } else if ((i2 & 24576) == 0) {
            z2 = z;
            i8 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i5 = i3 & 32;
            int i10 = 196608;
            if (i5 == 0) {
                if ((196608 & i2) == 0) {
                    i10 = oq5Var.d(hmjVar == null ? -1 : hmjVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                if (oq5Var.P(i8 & 1, (74899 & i8) != 74898)) {
                    yci yciVar3 = i7 != 0 ? vci.a : yciVar;
                    boolean z5 = i9 != 0 ? false : z2;
                    hmj hmjVar3 = i5 != 0 ? hmj.a : hmjVar;
                    if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                        oq5Var.Z(-627756453);
                        int i11 = i8;
                        z4 = z5;
                        yciVar2 = yciVar3;
                        int i12 = ((i11 >> 3) & 112) | 8;
                        int i13 = i11 >> 6;
                        ivf.g(new imj(), yciVar2, z4, hmjVar3, oq5Var, (i13 & 7168) | i12 | (i13 & 896), 0);
                        oq5Var = oq5Var;
                        oq5Var.p(false);
                    } else {
                        int i14 = i8;
                        boolean z6 = z5;
                        yci yciVar4 = yciVar3;
                        oq5Var.Z(-627546180);
                        l18 l18Var = l18.b;
                        bdt I = hag.I(nmj.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        nmj nmjVar = (nmj) qdcVar.C(I);
                        hmj hmjVar4 = hmjVar3;
                        ivf.h(nmjVar, tmbVar, yciVar4, z6, null, new omj(function1), hmjVar4, oq5Var, (i14 & 112) | 72 | ((i14 >> 3) & 896) | ((i14 << 3) & 7168) | (57344 & i14) | ((i14 << 6) & 29360128));
                        z4 = z6;
                        hmjVar3 = hmjVar4;
                        yciVar2 = yciVar4;
                        oq5Var.p(false);
                    }
                    hmjVar2 = hmjVar3;
                    z3 = z4;
                    i6 = 1;
                } else {
                    oq5Var.S();
                    yciVar2 = yciVar;
                    i6 = i;
                    hmjVar2 = hmjVar;
                    z3 = z2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new lba(function1, tmbVar, yciVar2, i6, z3, hmjVar2, i2, i3);
                    return;
                }
                return;
            }
            i8 |= i10;
            if (oq5Var.P(i8 & 1, (74899 & i8) != 74898)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        i5 = i3 & 32;
        int i102 = 196608;
        if (i5 == 0) {
        }
        i8 |= i102;
        if (oq5Var.P(i8 & 1, (74899 & i8) != 74898)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void k(Function1 function1, yci yciVar, boolean z, hmj hmjVar, hq5 hq5Var, int i) {
        yci yciVar2;
        vci vciVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-749026717);
        int i2 = i | (oq5Var.h(function1) ? 4 : 2) | 48 | (oq5Var.g(z) ? 256 : 128) | (oq5Var.d(hmjVar.ordinal()) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            vci vciVar2 = vci.a;
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                oq5Var.Z(-1899586306);
                ivf.g(new imj(), vciVar2, z, hmjVar, oq5Var, 56 | (i2 & 896) | (i2 & 7168), 0);
                vciVar = vciVar2;
                oq5Var.p(false);
            } else {
                vciVar = vciVar2;
                oq5Var.Z(-1899376963);
                l18 l18Var = l18.b;
                bdt I = hag.I(nmj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                ivf.i((nmj) qdcVar.C(I), z, null, new omj(function1), hmjVar, oq5Var, ((i2 << 3) & 7168) | 440 | ((i2 << 9) & 3670016));
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43(function1, yciVar2, z, hmjVar, i, 16);
        }
    }

    public static final void l(List list, sem semVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        list.getClass();
        semVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-600636807);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(semVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            c3x.t(fvfVar, list, oq5Var, ((i2 >> 6) & 14) | ((i2 << 3) & 112));
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.a(0.0f, 16, 1));
            yci a = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "podcasts_list");
            boolean h = oq5Var.h(list) | oq5Var.h(semVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new avi(25, list, semVar);
                oq5Var.k0(K);
            }
            weo.f(a, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i2 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zkl(i, 2, list, semVar, fvfVar, o0kVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m(final Function0 function0, final boolean z, yci yciVar, long j, hq5 hq5Var, final int i, final int i2) {
        int i3;
        yci yciVar2;
        long j2;
        yci yciVar3;
        final long j3;
        final yci yciVar4;
        xmn r;
        int i4;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1168500515);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    j2 = j;
                    if (oq5Var.e(j2)) {
                        i4 = 2048;
                        i3 |= i4;
                    }
                } else {
                    j2 = j;
                }
                i4 = 1024;
                i3 |= i4;
            } else {
                j2 = j;
            }
            if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                oq5Var.U();
                if ((i & 1) != 0 || oq5Var.y()) {
                    yciVar3 = i5 == 0 ? vci.a : yciVar2;
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        j2 = ((dq0) oq5Var.j(eq0.a)).a.a;
                    }
                } else {
                    oq5Var.S();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    yciVar3 = yciVar2;
                }
                oq5Var.q();
                aae.a(function0, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.m(d.m(yciVar3, 48), 8), "small_round_playback_button"), false, ild.C(-1905494151, new tl3(1, j2, z), oq5Var), oq5Var, (i3 & 14) | 24576, 12);
                j3 = j2;
                yciVar4 = yciVar3;
            } else {
                oq5Var.S();
                j3 = j2;
                yciVar4 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: txq
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        rvf.m(Function0.this, z, yciVar4, j3, (hq5) obj, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 8) != 0) {
        }
        oq5Var.q();
        aae.a(function0, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.m(d.m(yciVar3, 48), 8), "small_round_playback_button"), false, ild.C(-1905494151, new tl3(1, j2, z), oq5Var), oq5Var, (i3 & 14) | 24576, 12);
        j3 = j2;
        yciVar4 = yciVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(boolean z, yci yciVar, bhs bhsVar, hq5 hq5Var, int i, int i2) {
        bhs bhsVar2;
        int i3;
        int i4;
        yci yciVar2;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-583135933);
        int i5 = i | 48;
        if ((i2 & 4) == 0) {
            bhsVar2 = bhsVar;
            if (oq5Var.f(bhsVar2)) {
                i3 = 256;
                i4 = i5 | i3;
                if (oq5Var.P(i4 & 1, (i4 & 147) == 146)) {
                    oq5Var.S();
                    yciVar2 = yciVar;
                } else {
                    oq5Var.U();
                    int i6 = i & 1;
                    vci vciVar = vci.a;
                    if (i6 == 0 || oq5Var.y()) {
                        if ((i2 & 4) != 0) {
                            bhsVar2 = ywf.s(oq5Var);
                        }
                        yciVar2 = vciVar;
                    } else {
                        oq5Var.S();
                        yciVar2 = yciVar;
                    }
                    oq5Var.q();
                    hz2 hz2Var = b2c.l;
                    float f = 12;
                    yci o = androidx.compose.foundation.layout.a.o(d.e(d.d(yciVar2, 1.0f), bhsVar2.a + f), 0.0f, 6, 1);
                    nho a = lho.a(qx0.a, hz2Var, oq5Var, 48);
                    int i7 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, o);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, a, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var, i7, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    if (!bhsVar2.c || bhsVar2.b) {
                        oq5Var.Z(1401773259);
                        swf.n(6, oq5Var, null, z);
                        vz1.B(vciVar, f, oq5Var, false);
                    } else {
                        oq5Var.Z(1400319235);
                        oq5Var.p(false);
                    }
                    ta5 a2 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
                    int i8 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, vciVar);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var, i8, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    swf.q(z, oq5Var, 6);
                    u1g.l(oq5Var, d.e(vciVar, ff7.P(v7g.z(8), oq5Var)));
                    swf.p(z, oq5Var, 6);
                    oq5Var.p(true);
                    oq5Var.p(true);
                }
                r = oq5Var.r();
                if (r == null) {
                    r.d = new yj(z, yciVar2, bhsVar2, i, i2);
                    return;
                }
                return;
            }
        } else {
            bhsVar2 = bhsVar;
        }
        i3 = 128;
        i4 = i5 | i3;
        if (oq5Var.P(i4 & 1, (i4 & 147) == 146)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void o(jki jkiVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        int i3;
        yci yciVar2;
        jkiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(535748107);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(jkiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (jkiVar instanceof gki) {
                i3 = R.string.listening_history_context_album;
            } else if (jkiVar instanceof hki) {
                i3 = R.string.listening_history_context_artist;
            } else {
                if (!(jkiVar instanceof iki)) {
                    b6e.s();
                    return;
                }
                i3 = R.string.listening_history_context_playlist;
            }
            yciVar2 = yciVar;
            yci q = androidx.compose.foundation.layout.a.q(yciVar2, 0.0f, 0.0f, 0.0f, 4, 7);
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            men.h(i3, 0, 2, oq5Var, null);
            gld.g(jkiVar.c(), null, null, oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(jkiVar, yciVar2, i, 25);
        }
    }

    public static final void p(o3k o3kVar, yci yciVar, q0k q0kVar, d2k d2kVar, int i, float f, gz2 gz2Var, s1r s1rVar, boolean z, wxi wxiVar, z1r z1rVar, qg0 qg0Var, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        q0k q0kVar2;
        d2k d2kVar2;
        int i5;
        z1r z1rVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(632853564);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(o3kVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 32 : 16;
        } else {
            yciVar2 = yciVar;
        }
        if ((i2 & 384) == 0) {
            q0kVar2 = q0kVar;
            i4 |= oq5Var2.f(q0kVar2) ? 256 : 128;
        } else {
            q0kVar2 = q0kVar;
        }
        if ((i2 & 3072) == 0) {
            d2kVar2 = d2kVar;
            i4 |= oq5Var2.f(d2kVar2) ? 2048 : 1024;
        } else {
            d2kVar2 = d2kVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var2.d(i) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= oq5Var2.c(f) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i4 |= oq5Var2.f(gz2Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= oq5Var2.f(s1rVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= oq5Var2.g(z) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= oq5Var2.g(false) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (oq5Var2.h(null) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var2.h(wxiVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            z1rVar2 = z1rVar;
            i5 |= oq5Var2.f(z1rVar2) ? 256 : 128;
        } else {
            z1rVar2 = z1rVar;
        }
        if ((i3 & 3072) == 0) {
            i5 |= oq5Var2.f(qg0Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= oq5Var2.h(wn5Var) ? 16384 : 8192;
        }
        if (oq5Var2.P(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362) ? false : true)) {
            oq5Var2.U();
            if ((i2 & 1) != 0 && !oq5Var2.y()) {
                oq5Var2.S();
            }
            oq5Var2.q();
            int i6 = i4 >> 6;
            int i7 = ((i4 >> 3) & 14) | 24576 | ((i4 << 3) & 112) | (i4 & 896) | ((i4 >> 18) & 7168) | (i6 & 458752) | (i6 & 3670016) | ((i5 << 12) & 29360128);
            int i8 = i4 << 12;
            int i9 = i7 | (i8 & 234881024) | (i8 & 1879048192);
            int i10 = i4 >> 9;
            int i11 = i5 << 6;
            oq5Var = oq5Var2;
            bow.j(yciVar2, o3kVar, q0kVar2, bxj.a, s1rVar, z, qg0Var, i, f, d2kVar2, wxiVar, null, gz2Var, b2c.l, z1rVar2, wn5Var, oq5Var, i9, (i11 & 896) | (i10 & 14) | 24576 | (i5 & 112) | (i10 & 7168) | ((i5 << 9) & 458752) | (i11 & 3670016));
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new r2k(o3kVar, yciVar, q0kVar, d2kVar, i, f, gz2Var, s1rVar, z, wxiVar, z1rVar, qg0Var, wn5Var, i2, i3);
        }
    }

    public static final void q(o3k o3kVar, yci yciVar, q0k q0kVar, d2k d2kVar, int i, float f, gz2 gz2Var, s1r s1rVar, boolean z, wxi wxiVar, z1r z1rVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        gz2 gz2Var2;
        boolean z2;
        wxi wxiVar2;
        z1r z1rVar2;
        wxi O;
        z1r z1rVar3;
        boolean z3;
        gz2 gz2Var3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(909160706);
        int i3 = i2 | (oq5Var.f(o3kVar) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | (oq5Var.f(d2kVar) ? 2048 : 1024) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (oq5Var.f(s1rVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | 905969664;
        if (oq5Var.P(i3 & 1, (306783379 & i3) != 306783378)) {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                gz2 gz2Var4 = b2c.o;
                O = avf.O(o3kVar, bxj.a, oq5Var, (i3 & 14) | 432);
                z1rVar3 = wvo.h;
                z3 = true;
                gz2Var3 = gz2Var4;
            } else {
                oq5Var.S();
                gz2Var3 = gz2Var;
                z3 = z;
                O = wxiVar;
                z1rVar3 = z1rVar;
            }
            oq5Var.q();
            p(o3kVar, yciVar, q0kVar, d2kVar, i, f, gz2Var3, s1rVar, z3, O, z1rVar3, lzj.a(oq5Var), wn5Var, oq5Var, i3 & 2147483646, 24966);
            gz2Var2 = gz2Var3;
            z1rVar2 = z1rVar3;
            wxiVar2 = O;
            z2 = z3;
        } else {
            oq5Var.S();
            gz2Var2 = gz2Var;
            z2 = z;
            wxiVar2 = wxiVar;
            z1rVar2 = z1rVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jyj(o3kVar, yciVar, q0kVar, d2kVar, i, f, gz2Var2, s1rVar, z2, wxiVar2, z1rVar2, wn5Var, i2);
        }
    }

    public static final void r(final rxv rxvVar, final Function0 function0, final String str, hq5 hq5Var, final int i) {
        Window window;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1571134913);
        int i2 = (oq5Var.f(rxvVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object j = oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Activity activity = j instanceof Activity ? (Activity) j : null;
            if (activity == null || (window = activity.getWindow()) == null) {
                xmn r = oq5Var.r();
                if (r != null) {
                    final int i3 = 0;
                    r.d = new Function2(rxvVar, function0, str, i, i3) { // from class: vzv
                        public final /* synthetic */ int a;
                        public final /* synthetic */ rxv b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ String d;

                        {
                            this.a = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            hq5 hq5Var2 = (hq5) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    rvf.r(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                                    break;
                                default:
                                    rvf.r(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            Function2 function2 = ((d3w) oq5Var.j(e3w.a)).m;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new dzv((ezv) function2.invoke(window, "WizardScreen.".concat(str)));
                oq5Var.k0(K);
            }
            s(rxvVar, function0, (dzv) K, oq5Var, i2 & 126);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            final int i4 = 1;
            r2.d = new Function2(rxvVar, function0, str, i, i4) { // from class: vzv
                public final /* synthetic */ int a;
                public final /* synthetic */ rxv b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ String d;

                {
                    this.a = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    hq5 hq5Var2 = (hq5) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            rvf.r(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                            break;
                        default:
                            rvf.r(this.b, this.c, this.d, hq5Var2, rvf.R(385));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(rxv rxvVar, Function0 function0, dzv dzvVar, hq5 hq5Var, int i) {
        Object wzvVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-581945479);
        int i2 = i | (oq5Var.f(rxvVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(dzvVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean z = (i4 == 4) | ((i2 & 112) == 32) | (i3 == 256);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                wzvVar = new wzv(function0, dzvVar, rxvVar, null, 0);
                oq5Var.k0(wzvVar);
            } else {
                wzvVar = K;
            }
            gld.w(oq5Var, rxvVar, (Function2) wzvVar);
            boolean z2 = (i3 == 256) | (i4 == 4);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new itv(4, dzvVar, rxvVar);
                oq5Var.k0(K2);
            }
            gld.k(rxvVar, (Function1) K2, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(rxvVar, function0, dzvVar, i, 23);
        }
    }

    public static final void t(rxv rxvVar, hq5 hq5Var, int i) {
        rxvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1853083791);
        int i2 = (oq5Var.f(rxvVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = Float.valueOf(Math.min(rxvVar.b, 2.2f));
                oq5Var.k0(K);
            }
            float floatValue = ((Number) K).floatValue();
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new keh(rxvVar, 10);
                oq5Var.k0(K2);
            }
            int i4 = i3 | 384;
            r(rxvVar, (Function0) K2, "GenreSwitch", oq5Var, i4);
            boolean z2 = i3 == 4;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                K3 = new keh(rxvVar, 11);
                oq5Var.k0(K3);
            }
            r(rxvVar, (Function0) K3, "OneToOneModeSwitch", oq5Var, i4);
            boolean z3 = i3 == 4;
            Object K4 = oq5Var.K();
            if (z3 || K4 == kjnVar) {
                K4 = new keh(rxvVar, 12);
                oq5Var.k0(K4);
            }
            r(rxvVar, (Function0) K4, "Gesture", oq5Var, i4);
            boolean z4 = i3 == 4;
            Object K5 = oq5Var.K();
            if (z4 || K5 == kjnVar) {
                K5 = new o24(rxvVar, floatValue, 2);
                oq5Var.k0(K5);
            }
            r(rxvVar, (Function0) K5, "OneToOneGesture", oq5Var, i4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new leh(rxvVar, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(final q3t q3tVar, final zvs zvsVar, boolean z, cg6 cg6Var) {
        nao naoVar;
        Object obj;
        int i;
        if (cg6Var instanceof nao) {
            naoVar = (nao) cg6Var;
            int i2 = naoVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                naoVar.n = i2 - Integer.MIN_VALUE;
                obj = naoVar.m;
                nm6 nm6Var = nm6.a;
                i = naoVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    naoVar.j = q3tVar;
                    naoVar.k = zvsVar;
                    naoVar.l = z;
                    naoVar.n = 1;
                    final String a = q3tVar.n.a();
                    a.getClass();
                    final int i3 = 0;
                    obj = sk3.S(q3tVar.h, new Function0() { // from class: p3t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z2;
                            Object putIfAbsent;
                            boolean z3;
                            Object putIfAbsent2;
                            switch (i3) {
                                case 0:
                                    q3t q3tVar2 = q3tVar;
                                    List a2 = q3tVar2.d.a();
                                    j3t j3tVar = q3tVar2.a;
                                    zvs zvsVar2 = zvsVar;
                                    String str = a;
                                    ArrayList d = j3tVar.d(zvsVar2, str);
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = d.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        if (a2.contains(((iss) next).c)) {
                                            arrayList.add(next);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        if (!((iss) next2).f.b()) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(((iss) it3.next()).a);
                                    }
                                    if (arrayList3.isEmpty()) {
                                        z2 = false;
                                    } else {
                                        if (Thread.interrupted()) {
                                            b6e.h();
                                            return null;
                                        }
                                        ArrayList arrayList4 = new ArrayList();
                                        Iterator it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            zvs zvsVar3 = (zvs) it4.next();
                                            ConcurrentHashMap concurrentHashMap = q3tVar2.g.a;
                                            Object obj2 = concurrentHashMap.get(zvsVar3);
                                            if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(zvsVar3, (obj2 = new eys()))) != null) {
                                                obj2 = putIfAbsent;
                                            }
                                            eys eysVar = (eys) obj2;
                                            x97.D(g.a, new zts(eysVar, null, 2));
                                            try {
                                                ArrayList a3 = j3tVar.a(str, arrayList3);
                                                ArrayList arrayList5 = new ArrayList();
                                                Iterator it5 = a3.iterator();
                                                while (it5.hasNext()) {
                                                    Object next3 = it5.next();
                                                    if (((Boolean) ((iss) next3).f.b.getValue()).booleanValue()) {
                                                        arrayList5.add(next3);
                                                    }
                                                }
                                                yfx yfxVar = q3tVar2.b;
                                                ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                                                Iterator it6 = arrayList5.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList6.add(((iss) it6.next()).a.a);
                                                }
                                                yfxVar.m(arrayList6);
                                                eysVar.b(null);
                                                z75.t(arrayList4, a3);
                                            } finally {
                                                eysVar.b(null);
                                            }
                                        }
                                        Iterator it7 = arrayList4.iterator();
                                        while (it7.hasNext()) {
                                            q3tVar2.g((iss) it7.next());
                                        }
                                        z2 = !arrayList4.isEmpty();
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    q3t q3tVar3 = q3tVar;
                                    List a4 = q3tVar3.d.a();
                                    j3t j3tVar2 = q3tVar3.a;
                                    zvs zvsVar4 = zvsVar;
                                    String str2 = a;
                                    ArrayList d2 = j3tVar2.d(zvsVar4, str2);
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it8 = d2.iterator();
                                    while (it8.hasNext()) {
                                        Object next4 = it8.next();
                                        if (a4.contains(((iss) next4).c)) {
                                            arrayList7.add(next4);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList();
                                    Iterator it9 = arrayList7.iterator();
                                    while (it9.hasNext()) {
                                        Object next5 = it9.next();
                                        if (((iss) next5).f.b()) {
                                            arrayList8.add(next5);
                                        }
                                    }
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it10 = arrayList8.iterator();
                                    while (it10.hasNext()) {
                                        Object next6 = it10.next();
                                        if (((iss) next6).d == bb6.c) {
                                            arrayList9.add(next6);
                                        }
                                    }
                                    if (arrayList9.isEmpty()) {
                                        z3 = false;
                                    } else {
                                        if (Thread.interrupted()) {
                                            b6e.h();
                                            return null;
                                        }
                                        ConcurrentHashMap concurrentHashMap2 = q3tVar3.g.a;
                                        Object obj3 = concurrentHashMap2.get(zvsVar4);
                                        if (obj3 == null && (putIfAbsent2 = concurrentHashMap2.putIfAbsent(zvsVar4, (obj3 = new eys()))) != null) {
                                            obj3 = putIfAbsent2;
                                        }
                                        eys eysVar2 = (eys) obj3;
                                        x97.D(g.a, new zts(eysVar2, null, 2));
                                        try {
                                            ssg.a(3, "TracksCacheRepositoryImpl", "launch removing permanent track data cacheRowsSize=" + arrayList9, null);
                                            Iterator it11 = arrayList9.iterator();
                                            while (it11.hasNext()) {
                                                iss issVar = (iss) it11.next();
                                                ssg.a(3, "TracksCacheRepositoryImpl", "remove track data for removing permanent track data for " + issVar, null);
                                                int ordinal = issVar.d.ordinal();
                                                if (ordinal == 0) {
                                                    throw new IllegalStateException("Unexpected type RAW cacheRow=" + issVar);
                                                }
                                                if (ordinal == 1) {
                                                    throw new IllegalStateException("Unexpected type HLS cacheRow=" + issVar);
                                                }
                                                if (ordinal != 2) {
                                                    throw new x7j();
                                                }
                                                bts L = leu.L(issVar.e);
                                                Object value = bts.f.getValue();
                                                value.getClass();
                                                List list = L.c;
                                                String str3 = L.d;
                                                Date date = L.e;
                                                list.getClass();
                                                str3.getClass();
                                                date.getClass();
                                                j3tVar2.e(str2, issVar.a(), leu.Y(new bts((Uri) value, list, str3, date)), issVar.d);
                                                q3tVar3.g(issVar);
                                            }
                                            eysVar2.b(null);
                                            z3 = true;
                                        } finally {
                                            eysVar2.b(null);
                                        }
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    }, naoVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        ((Boolean) obj).getClass();
                        return Unit.a;
                    }
                    z = naoVar.l;
                    zvsVar = naoVar.k;
                    q3tVar = naoVar.j;
                    qgg.h0(obj);
                }
                if (!((Boolean) obj).booleanValue() && z) {
                    naoVar.j = null;
                    naoVar.k = null;
                    naoVar.l = z;
                    naoVar.n = 2;
                    final String a2 = q3tVar.n.a();
                    a2.getClass();
                    final int i4 = 1;
                    obj = sk3.S(q3tVar.h, new Function0() { // from class: p3t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            boolean z2;
                            Object putIfAbsent;
                            boolean z3;
                            Object putIfAbsent2;
                            switch (i4) {
                                case 0:
                                    q3t q3tVar2 = q3tVar;
                                    List a22 = q3tVar2.d.a();
                                    j3t j3tVar = q3tVar2.a;
                                    zvs zvsVar2 = zvsVar;
                                    String str = a2;
                                    ArrayList d = j3tVar.d(zvsVar2, str);
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = d.iterator();
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        if (a22.contains(((iss) next).c)) {
                                            arrayList.add(next);
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        Object next2 = it2.next();
                                        if (!((iss) next2).f.b()) {
                                            arrayList2.add(next2);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                                    Iterator it3 = arrayList2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(((iss) it3.next()).a);
                                    }
                                    if (arrayList3.isEmpty()) {
                                        z2 = false;
                                    } else {
                                        if (Thread.interrupted()) {
                                            b6e.h();
                                            return null;
                                        }
                                        ArrayList arrayList4 = new ArrayList();
                                        Iterator it4 = arrayList3.iterator();
                                        while (it4.hasNext()) {
                                            zvs zvsVar3 = (zvs) it4.next();
                                            ConcurrentHashMap concurrentHashMap = q3tVar2.g.a;
                                            Object obj2 = concurrentHashMap.get(zvsVar3);
                                            if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(zvsVar3, (obj2 = new eys()))) != null) {
                                                obj2 = putIfAbsent;
                                            }
                                            eys eysVar = (eys) obj2;
                                            x97.D(g.a, new zts(eysVar, null, 2));
                                            try {
                                                ArrayList a3 = j3tVar.a(str, arrayList3);
                                                ArrayList arrayList5 = new ArrayList();
                                                Iterator it5 = a3.iterator();
                                                while (it5.hasNext()) {
                                                    Object next3 = it5.next();
                                                    if (((Boolean) ((iss) next3).f.b.getValue()).booleanValue()) {
                                                        arrayList5.add(next3);
                                                    }
                                                }
                                                yfx yfxVar = q3tVar2.b;
                                                ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                                                Iterator it6 = arrayList5.iterator();
                                                while (it6.hasNext()) {
                                                    arrayList6.add(((iss) it6.next()).a.a);
                                                }
                                                yfxVar.m(arrayList6);
                                                eysVar.b(null);
                                                z75.t(arrayList4, a3);
                                            } finally {
                                                eysVar.b(null);
                                            }
                                        }
                                        Iterator it7 = arrayList4.iterator();
                                        while (it7.hasNext()) {
                                            q3tVar2.g((iss) it7.next());
                                        }
                                        z2 = !arrayList4.isEmpty();
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    q3t q3tVar3 = q3tVar;
                                    List a4 = q3tVar3.d.a();
                                    j3t j3tVar2 = q3tVar3.a;
                                    zvs zvsVar4 = zvsVar;
                                    String str2 = a2;
                                    ArrayList d2 = j3tVar2.d(zvsVar4, str2);
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it8 = d2.iterator();
                                    while (it8.hasNext()) {
                                        Object next4 = it8.next();
                                        if (a4.contains(((iss) next4).c)) {
                                            arrayList7.add(next4);
                                        }
                                    }
                                    ArrayList arrayList8 = new ArrayList();
                                    Iterator it9 = arrayList7.iterator();
                                    while (it9.hasNext()) {
                                        Object next5 = it9.next();
                                        if (((iss) next5).f.b()) {
                                            arrayList8.add(next5);
                                        }
                                    }
                                    ArrayList arrayList9 = new ArrayList();
                                    Iterator it10 = arrayList8.iterator();
                                    while (it10.hasNext()) {
                                        Object next6 = it10.next();
                                        if (((iss) next6).d == bb6.c) {
                                            arrayList9.add(next6);
                                        }
                                    }
                                    if (arrayList9.isEmpty()) {
                                        z3 = false;
                                    } else {
                                        if (Thread.interrupted()) {
                                            b6e.h();
                                            return null;
                                        }
                                        ConcurrentHashMap concurrentHashMap2 = q3tVar3.g.a;
                                        Object obj3 = concurrentHashMap2.get(zvsVar4);
                                        if (obj3 == null && (putIfAbsent2 = concurrentHashMap2.putIfAbsent(zvsVar4, (obj3 = new eys()))) != null) {
                                            obj3 = putIfAbsent2;
                                        }
                                        eys eysVar2 = (eys) obj3;
                                        x97.D(g.a, new zts(eysVar2, null, 2));
                                        try {
                                            ssg.a(3, "TracksCacheRepositoryImpl", "launch removing permanent track data cacheRowsSize=" + arrayList9, null);
                                            Iterator it11 = arrayList9.iterator();
                                            while (it11.hasNext()) {
                                                iss issVar = (iss) it11.next();
                                                ssg.a(3, "TracksCacheRepositoryImpl", "remove track data for removing permanent track data for " + issVar, null);
                                                int ordinal = issVar.d.ordinal();
                                                if (ordinal == 0) {
                                                    throw new IllegalStateException("Unexpected type RAW cacheRow=" + issVar);
                                                }
                                                if (ordinal == 1) {
                                                    throw new IllegalStateException("Unexpected type HLS cacheRow=" + issVar);
                                                }
                                                if (ordinal != 2) {
                                                    throw new x7j();
                                                }
                                                bts L = leu.L(issVar.e);
                                                Object value = bts.f.getValue();
                                                value.getClass();
                                                List list = L.c;
                                                String str3 = L.d;
                                                Date date = L.e;
                                                list.getClass();
                                                str3.getClass();
                                                date.getClass();
                                                j3tVar2.e(str2, issVar.a(), leu.Y(new bts((Uri) value, list, str3, date)), issVar.d);
                                                q3tVar3.g(issVar);
                                            }
                                            eysVar2.b(null);
                                            z3 = true;
                                        } finally {
                                            eysVar2.b(null);
                                        }
                                    }
                                    return Boolean.valueOf(z3);
                            }
                        }
                    }, naoVar);
                }
                return Unit.a;
            }
        }
        naoVar = new nao(cg6Var);
        obj = naoVar.m;
        nm6 nm6Var2 = nm6.a;
        i = naoVar.n;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
            naoVar.j = null;
            naoVar.k = null;
            naoVar.l = z;
            naoVar.n = 2;
            final String a22 = q3tVar.n.a();
            a22.getClass();
            final int i42 = 1;
            obj = sk3.S(q3tVar.h, new Function0() { // from class: p3t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    boolean z2;
                    Object putIfAbsent;
                    boolean z3;
                    Object putIfAbsent2;
                    switch (i42) {
                        case 0:
                            q3t q3tVar2 = q3tVar;
                            List a222 = q3tVar2.d.a();
                            j3t j3tVar = q3tVar2.a;
                            zvs zvsVar2 = zvsVar;
                            String str = a22;
                            ArrayList d = j3tVar.d(zvsVar2, str);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = d.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (a222.contains(((iss) next).c)) {
                                    arrayList.add(next);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                if (!((iss) next2).f.b()) {
                                    arrayList2.add(next2);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((iss) it3.next()).a);
                            }
                            if (arrayList3.isEmpty()) {
                                z2 = false;
                            } else {
                                if (Thread.interrupted()) {
                                    b6e.h();
                                    return null;
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    zvs zvsVar3 = (zvs) it4.next();
                                    ConcurrentHashMap concurrentHashMap = q3tVar2.g.a;
                                    Object obj2 = concurrentHashMap.get(zvsVar3);
                                    if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(zvsVar3, (obj2 = new eys()))) != null) {
                                        obj2 = putIfAbsent;
                                    }
                                    eys eysVar = (eys) obj2;
                                    x97.D(g.a, new zts(eysVar, null, 2));
                                    try {
                                        ArrayList a3 = j3tVar.a(str, arrayList3);
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it5 = a3.iterator();
                                        while (it5.hasNext()) {
                                            Object next3 = it5.next();
                                            if (((Boolean) ((iss) next3).f.b.getValue()).booleanValue()) {
                                                arrayList5.add(next3);
                                            }
                                        }
                                        yfx yfxVar = q3tVar2.b;
                                        ArrayList arrayList6 = new ArrayList(v75.o(arrayList5, 10));
                                        Iterator it6 = arrayList5.iterator();
                                        while (it6.hasNext()) {
                                            arrayList6.add(((iss) it6.next()).a.a);
                                        }
                                        yfxVar.m(arrayList6);
                                        eysVar.b(null);
                                        z75.t(arrayList4, a3);
                                    } finally {
                                        eysVar.b(null);
                                    }
                                }
                                Iterator it7 = arrayList4.iterator();
                                while (it7.hasNext()) {
                                    q3tVar2.g((iss) it7.next());
                                }
                                z2 = !arrayList4.isEmpty();
                            }
                            return Boolean.valueOf(z2);
                        default:
                            q3t q3tVar3 = q3tVar;
                            List a4 = q3tVar3.d.a();
                            j3t j3tVar2 = q3tVar3.a;
                            zvs zvsVar4 = zvsVar;
                            String str2 = a22;
                            ArrayList d2 = j3tVar2.d(zvsVar4, str2);
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it8 = d2.iterator();
                            while (it8.hasNext()) {
                                Object next4 = it8.next();
                                if (a4.contains(((iss) next4).c)) {
                                    arrayList7.add(next4);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it9 = arrayList7.iterator();
                            while (it9.hasNext()) {
                                Object next5 = it9.next();
                                if (((iss) next5).f.b()) {
                                    arrayList8.add(next5);
                                }
                            }
                            ArrayList arrayList9 = new ArrayList();
                            Iterator it10 = arrayList8.iterator();
                            while (it10.hasNext()) {
                                Object next6 = it10.next();
                                if (((iss) next6).d == bb6.c) {
                                    arrayList9.add(next6);
                                }
                            }
                            if (arrayList9.isEmpty()) {
                                z3 = false;
                            } else {
                                if (Thread.interrupted()) {
                                    b6e.h();
                                    return null;
                                }
                                ConcurrentHashMap concurrentHashMap2 = q3tVar3.g.a;
                                Object obj3 = concurrentHashMap2.get(zvsVar4);
                                if (obj3 == null && (putIfAbsent2 = concurrentHashMap2.putIfAbsent(zvsVar4, (obj3 = new eys()))) != null) {
                                    obj3 = putIfAbsent2;
                                }
                                eys eysVar2 = (eys) obj3;
                                x97.D(g.a, new zts(eysVar2, null, 2));
                                try {
                                    ssg.a(3, "TracksCacheRepositoryImpl", "launch removing permanent track data cacheRowsSize=" + arrayList9, null);
                                    Iterator it11 = arrayList9.iterator();
                                    while (it11.hasNext()) {
                                        iss issVar = (iss) it11.next();
                                        ssg.a(3, "TracksCacheRepositoryImpl", "remove track data for removing permanent track data for " + issVar, null);
                                        int ordinal = issVar.d.ordinal();
                                        if (ordinal == 0) {
                                            throw new IllegalStateException("Unexpected type RAW cacheRow=" + issVar);
                                        }
                                        if (ordinal == 1) {
                                            throw new IllegalStateException("Unexpected type HLS cacheRow=" + issVar);
                                        }
                                        if (ordinal != 2) {
                                            throw new x7j();
                                        }
                                        bts L = leu.L(issVar.e);
                                        Object value = bts.f.getValue();
                                        value.getClass();
                                        List list = L.c;
                                        String str3 = L.d;
                                        Date date = L.e;
                                        list.getClass();
                                        str3.getClass();
                                        date.getClass();
                                        j3tVar2.e(str2, issVar.a(), leu.Y(new bts((Uri) value, list, str3, date)), issVar.d);
                                        q3tVar3.g(issVar);
                                    }
                                    eysVar2.b(null);
                                    z3 = true;
                                } finally {
                                    eysVar2.b(null);
                                }
                            }
                            return Boolean.valueOf(z3);
                    }
                }
            }, naoVar);
        }
        return Unit.a;
    }

    public static WifiManager.MulticastLock v(Context context, String str) {
        WifiManager.MulticastLock createMulticastLock = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).createMulticastLock(str);
        createMulticastLock.setReferenceCounted(true);
        createMulticastLock.acquire();
        return createMulticastLock;
    }

    public static final Bundle w(List list, boolean z) {
        list.getClass();
        list.getClass();
        return cxb.K(new Pair("wave.landing.queue.type", new rnf(list, z)));
    }

    public static c0p x(rf3 rf3Var) {
        switch (rf3Var == null ? -1 : ezo.a[rf3Var.ordinal()]) {
            case -1:
            case 1:
                return c0p.d;
            case 0:
            default:
                b6e.s();
                return null;
            case 2:
                return c0p.b;
            case 3:
                return c0p.a;
            case 4:
                return c0p.c;
            case 5:
                return c0p.d;
            case 6:
                return c0p.d;
        }
    }

    public static ff7 y(int i) {
        return i != 0 ? i != 1 ? new vgo() : new hy6() : new vgo();
    }

    public static final h3f z(View view, qyf qyfVar) {
        view.getClass();
        int paddingBottom = view.getPaddingBottom();
        Context context = view.getContext();
        context.getClass();
        xkg xkgVar = new xkg(view, paddingBottom);
        if (ogp.v() == null) {
            return saf.p();
        }
        return ox6.B(zsd.s0(rke.a(context).d(qyfVar), new seg(ff7.i(context), (Continuation) null, 12)), qyfVar, new fmi(13, xkgVar));
    }

    public abstract b8x S(j8x j8xVar);

    public abstract i8x T(j8x j8xVar);

    public abstract void U(i8x i8xVar, i8x i8xVar2);

    public abstract void V(i8x i8xVar, Thread thread);

    public abstract boolean W(j8x j8xVar, b8x b8xVar, b8x b8xVar2);

    public abstract boolean X(j8x j8xVar, Object obj, Object obj2);

    public abstract boolean Y(j8x j8xVar, i8x i8xVar, i8x i8xVar2);
}
