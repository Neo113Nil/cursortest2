package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.Base64;
import android.util.Xml;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.dto.disclaimer.DisclaimerDetailsDto;
import com.yandex.music.shared.dto.disclaimer.DisclaimerDto;
import com.yandex.music.shared.dto.disclaimer.ForeignAgentDisclaimerDto;
import com.yandex.music.shared.dto.disclaimer.ModalDisclaimerDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes.dex */
public abstract class hld {
    public static final Object[] a = new Object[0];
    public static final wn5 b = new wn5(new io5(3), 993350835, false);
    public static final wn5 c = new wn5(new io5(4), -1848970358, false);
    public static final wn5 d = new wn5(new rz3(13), -425076094, false);
    public static final wn5 e = new wn5(new dp5(4), 33415631, false);
    public static final wn5 f = new wn5(new dp5(5), -1908762834, false);
    public static final wn5 g = new wn5(new dp5(6), 444025997, false);
    public static final ode h = new ode(false);
    public static final z7l i = new z7l(0);
    public static final scx j = new scx(ConnectableDevice.KEY_ID);
    public static final scx k = new scx("type");
    public static yg0 l;
    public static ud0 m;
    public static ou3 n;

    public static k03 A(String str, hi4 hi4Var) {
        str.getClass();
        hi4Var.getClass();
        q1c q1cVar = q1c.f;
        r1c r1cVar = r1c.c;
        String str2 = hi4Var.a;
        String str3 = hi4Var.c;
        if (str3 == null) {
            str3 = "null";
        }
        return new k03(q1cVar, r1cVar, null, str2, hrg.r("Invalid url \"", str, "\" for property \"payment_form_url\" in response: ", hrg.s("<DiehardResponse: status - ", str2, ", desc - ", str3, ">")));
    }

    public static List B(long... jArr) {
        if (jArr.length == 0) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j2 : jArr) {
            arrayList.add(new ffb(j2));
        }
        return arrayList;
    }

    public static final String C() {
        return eta.e();
    }

    public static final void D(exa exaVar, wjb wjbVar, thj thjVar, int i2) {
        wjbVar.getClass();
        thjVar.getClass();
        cvo cvoVar = (cvo) exaVar.b.getValue();
        cvoVar.getClass();
        xmb xmbVar = exaVar.c;
        nab nabVar = exaVar.a;
        String str = thjVar.e;
        String str2 = (String) exaVar.e.get(thjVar.b);
        if (str2 == null) {
            str2 = "";
        }
        xmbVar.g(wjbVar, nabVar, null, cvoVar, i2, str2, thjVar, null, (r20 & 256) != 0 ? null : str, "");
    }

    public static hqc E(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            J(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), een.b);
        String string = obtainAttributes.getString(0);
        String string2 = obtainAttributes.getString(5);
        String string3 = obtainAttributes.getString(6);
        String string4 = obtainAttributes.getString(2);
        int resourceId = obtainAttributes.getResourceId(1, 0);
        int integer = obtainAttributes.getInteger(3, 1);
        int integer2 = obtainAttributes.getInteger(4, 500);
        String string5 = obtainAttributes.getString(7);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                J(xmlResourceParser);
            }
            List G = G(resources, resourceId);
            return new kqc(new aqc(string, string2, string3, G), string4 != null ? new aqc(string, string2, string4, G) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), een.c);
                    int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                    boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                    int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                    String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                    int i4 = obtainAttributes2.getInt(i3, 0);
                    int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                    int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                    String string7 = obtainAttributes2.getString(i5);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        J(xmlResourceParser);
                    }
                    arrayList.add(new jqc(string7, z, string6, i2, i4, resourceId2));
                } else {
                    J(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new iqc((jqc[]) arrayList.toArray(new jqc[0]));
    }

    public static final Pair F(String str) {
        str.getClass();
        if (str.length() == 73 && str.charAt(36) == '_') {
            String substring = str.substring(0, 36);
            try {
                UUID.fromString(substring);
                String substring2 = str.substring(37);
                UUID.fromString(substring2);
                return new Pair(substring, substring2);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static List G(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void H(Context context, x66 x66Var) {
        if (x66Var.b == u0j.a) {
            hag.x(context, R.string.offline_mode_on, 0);
        } else {
            if (x66Var.a) {
                return;
            }
            hag.x(context, R.string.check_internet_connection, 0);
        }
    }

    public static void I(Context context, z66 z66Var) {
        H(context, z66Var.a());
    }

    public static void J(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static final Object[] K(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] L(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final ao1 M(lqs lqsVar) {
        ccb ccbVar;
        switch (lqsVar.ordinal()) {
            case 0:
                ccbVar = ccb.b;
                break;
            case 1:
                ccbVar = ccb.c;
                break;
            case 2:
                ccbVar = ccb.d;
                break;
            case 3:
                ccbVar = ccb.e;
                break;
            case 4:
                ccbVar = ccb.f;
                break;
            case 5:
                ccbVar = ccb.g;
                break;
            case 6:
                ccbVar = ccb.h;
                break;
            case 7:
                ccbVar = ccb.i;
                break;
            case 8:
                ccbVar = ccb.j;
                break;
            case 9:
                ccbVar = ccb.k;
                break;
            case 10:
                ccbVar = ccb.l;
                break;
            case 11:
                ccbVar = ccb.m;
                break;
            case 12:
                ccbVar = ccb.n;
                break;
            case 13:
                ccbVar = ccb.o;
                break;
            case 14:
                ccbVar = ccb.p;
                break;
            default:
                b6e.s();
                return null;
        }
        if (ccbVar != null) {
            return ccbVar.a;
        }
        ao1.a.getClass();
        return ao1.b;
    }

    public static final ao1 N(Album$AlbumType album$AlbumType) {
        ccb ccbVar;
        if (album$AlbumType != null) {
            switch (bo1.a[album$AlbumType.ordinal()]) {
                case 1:
                    ccbVar = ccb.b;
                    break;
                case 2:
                    ccbVar = ccb.q;
                    break;
                case 3:
                    ccbVar = ccb.r;
                    break;
                case 4:
                    ccbVar = ccb.c;
                    break;
                case 5:
                    ccbVar = ccb.e;
                    break;
                case 6:
                    ccbVar = ccb.f;
                    break;
                case 7:
                    ccbVar = ccb.g;
                    break;
                case 8:
                    ccbVar = ccb.j;
                    break;
                case 9:
                    ccbVar = ccb.l;
                    break;
                default:
                    b6e.s();
                    return null;
            }
            if (ccbVar != null) {
                return ccbVar.a;
            }
        }
        ao1.a.getClass();
        return ao1.b;
    }

    public static final z9b O(DisclaimerDto disclaimerDto) {
        eci eciVar;
        String title;
        String reason;
        String title2;
        String text;
        String url;
        disclaimerDto.getClass();
        ModalDisclaimerDto modal = disclaimerDto.getModal();
        vrc vrcVar = null;
        if (modal == null || (reason = modal.getReason()) == null || (title2 = modal.getTitle()) == null) {
            eciVar = null;
        } else {
            String description = modal.getDescription();
            DisclaimerDetailsDto details = modal.getDetails();
            eciVar = new eci(reason, title2, description, (details == null || (text = details.getText()) == null || (url = details.getUrl()) == null) ? null : new f58(text, url));
        }
        ForeignAgentDisclaimerDto foreignAgent = disclaimerDto.getForeignAgent();
        if (foreignAgent != null && (title = foreignAgent.getTitle()) != null) {
            vrcVar = new vrc(title);
        }
        return new z9b(eciVar, vrcVar);
    }

    public static final void a(j00 j00Var, iab iabVar, jab jabVar, thj thjVar, tvd tvdVar, yci yciVar, hq5 hq5Var, int i2) {
        tvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1420674123);
        int i3 = i2 | (oq5Var.f(j00Var) ? 4 : 2) | (oq5Var.f(iabVar) ? 32 : 16) | (oq5Var.h(jabVar) ? 256 : 128) | (oq5Var.h(thjVar) ? 2048 : 1024) | (oq5Var.f(tvdVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            boolean z = (57344 & i3) == 16384;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = new nr(tvdVar, 0);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.U(new or(0, function0));
                oq5Var.k0(K2);
            }
            if (((Boolean) ((sdr) K2).getValue()).booleanValue()) {
                oq5Var.Z(695474013);
                b(j00Var, iabVar.i, jabVar, thjVar, function0, yciVar, oq5Var, i3 & 466830);
            } else {
                oq5Var.Z(693962391);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(j00Var, iabVar, jabVar, thjVar, tvdVar, yciVar, i2, 0);
        }
    }

    public static final void b(j00 j00Var, boolean z, jab jabVar, thj thjVar, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(482561266);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(j00Var) : oq5Var2.h(j00Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(jabVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.h(thjVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var2.P(i3 & 1, (74899 & i3) != 74898)) {
            oq5Var = oq5Var2;
            p9b.a(ild.C(-490715681, new qr(0, j00Var, jabVar, thjVar, function0, z), oq5Var2), wyf.s(yciVar, function0), false, oq5Var, 6, 4);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(j00Var, z, jabVar, thjVar, function0, yciVar, i2);
        }
    }

    public static final void c(w31 w31Var, s31 s31Var, nii niiVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        nii niiVar2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-412432648);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(w31Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(s31Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            niiVar2 = niiVar;
            i3 |= oq5Var2.f(niiVar2) ? 256 : 128;
        } else {
            niiVar2 = niiVar;
        }
        int i4 = i3 | 3072;
        if ((i4 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            ArrayList arrayList = w31Var.a;
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            jf0.m(niiVar2, arrayList.size(), 2, 3, ild.C(-152749280, new av(1, arrayList, s31Var), oq5Var2), a.a(vciVar, "concerts_horizontal_pager"), null, 0.0f, 0.0f, oq5Var, ((i4 >> 6) & 14) | 28032, 480);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(w31Var, s31Var, false, niiVar, yciVar2, i2, 4);
        }
    }

    public static final void d(nii niiVar, s31 s31Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        niiVar.getClass();
        s31Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1055419069);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(niiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(s31Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            x31 x31Var = (x31) bcx.x(s31Var.b.h, oq5Var, 0).getValue();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new zs0(8);
                oq5Var.k0(K);
            }
            ot0.l(x31Var, (Function1) K, yciVar, null, null, false, ild.C(595861844, new ar(3, niiVar, s31Var), oq5Var), oq5Var, (i3 & 896) | 1572912, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(niiVar, s31Var, yciVar, i2, 5);
        }
    }

    public static final void e(v31 v31Var, nii niiVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-757437911);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(v31Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(niiVar) ? 32 : 16;
        }
        if (((i3 | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, ild.C(1633703104, new a3(niiVar, v31Var), oq5Var), oq5Var, 48, 1);
            yciVar = vci.a;
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(v31Var, niiVar, yciVar2, i2, 6);
        }
    }

    public static final void f(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1277894531);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            function02 = function0;
            aae.a(function02, d.m(yciVar, 68), false, ox6.c, oq5Var, (i3 & 14) | 24576, 12);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function02, yciVar, i2, 2);
        }
    }

    public static final void g(final int i2, final long j2, final float f2, yci yciVar, hq5 hq5Var, final int i3, final int i4) {
        yci yciVar2;
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1848682700);
        int i6 = i3 | (oq5Var.d(i2) ? 4 : 2) | (oq5Var.e(j2) ? 32 : 16) | (oq5Var.c(f2) ? 256 : 128);
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 = i6 | 3072;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i5 = i6 | (oq5Var.f(yciVar2) ? 2048 : 1024);
        }
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i7 != 0) {
                yciVar2 = vci.a;
            }
            gae.b(a0g.E(i2, i5 & 14, oq5Var), null, yciVar2, d85.b(j2, f2, 0.0f, 0.0f, 0.0f, 14), oq5Var, ((i5 >> 3) & 896) | 48, 0);
        }
        final yci yciVar3 = yciVar2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(i2, j2, f2, yciVar3, i3, i4) { // from class: q74
                public final /* synthetic */ int a;
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ yci d;
                public final /* synthetic */ int e;

                {
                    this.e = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    hld.g(this.a, this.b, this.c, this.d, (hq5) obj, R, this.e);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final int i2, int i3, final long j2, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i4;
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-154261222);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.e(j2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            int i5 = i4 >> 6;
            aae.a(function0, yciVar, false, ild.C(-1543132418, new Function2() { // from class: o74
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    hq5 hq5Var2 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    yci D = ksw.D(vci.a, rvf.M(R.string.cast_to_device_content_description, hq5Var2), null);
                    long j3 = j2;
                    hld.g(i2, j3, d85.d(j3), D, hq5Var2, 0, 0);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, (i5 & 14) | 24576 | (i5 & 112), 12);
            function02 = function0;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new p74(i2, j2, function02, yciVar, i3);
        }
    }

    public static final gm5 i(Object obj) {
        gm5 gm5Var = new gm5(null);
        gm5Var.U(obj);
        return gm5Var;
    }

    public static gm5 j() {
        return new gm5(null);
    }

    public static final mm6 k(gyf gyfVar, CoroutineContext coroutineContext) {
        gyfVar.getClass();
        coroutineContext.getClass();
        if (gyfVar instanceof rjq) {
            return new um6((rjq) gyfVar, coroutineContext);
        }
        wqr n2 = a4g.n();
        gyfVar.D(new yg6(2, n2));
        return gld.e(coroutineContext.plus(n2));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final List list, final yci yciVar, Function1 function1, float f2, float f3, float f4, float f5, o0k o0kVar, int i2, boolean z, boolean z2, boolean z3, final wn5 wn5Var, hq5 hq5Var, final int i3, final int i4, final int i5) {
        int i6;
        Function1 function12;
        int i7;
        float f6;
        int i8;
        float f7;
        int i9;
        float f8;
        int i10;
        final float f9;
        o0k o0kVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        oq5 oq5Var;
        int i19;
        final int i20;
        final float f10;
        final o0k o0kVar3;
        final boolean z4;
        final Function1 function13;
        final float f11;
        final float f12;
        final boolean z5;
        final boolean z6;
        oq5 oq5Var2;
        final float f13;
        final Function1 function14;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final int i21;
        final float f14;
        final float f15;
        final o0k o0kVar4;
        final float f16;
        xmn r;
        int i22;
        list.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1725530565);
        if ((i3 & 6) == 0) {
            i6 = ((i3 & 8) == 0 ? oq5Var3.f(list) : oq5Var3.h(list) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= oq5Var3.f(yciVar) ? 32 : 16;
        }
        int i23 = i5 & 4;
        if (i23 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            function12 = function1;
            i6 |= oq5Var3.h(function12) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                f6 = f2;
                i6 |= oq5Var3.c(f6) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i3 & 24576) == 0) {
                    f7 = f3;
                    i6 |= oq5Var3.c(f7) ? 16384 : RemoteCameraConfig.Notification.ID;
                    i9 = i5 & 32;
                    if (i9 == 0) {
                        i6 |= 196608;
                        f8 = f4;
                    } else {
                        f8 = f4;
                        if ((i3 & 196608) == 0) {
                            i6 |= oq5Var3.c(f8) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                        }
                    }
                    i10 = i5 & 64;
                    if (i10 == 0) {
                        i6 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
                        f9 = f5;
                    } else {
                        f9 = f5;
                        if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
                            i6 |= oq5Var3.c(f9) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 12582912) != 0) {
                        if ((i5 & 128) == 0) {
                            o0kVar2 = o0kVar;
                            if (oq5Var3.f(o0kVar2)) {
                                i22 = 8388608;
                                i6 |= i22;
                            }
                        } else {
                            o0kVar2 = o0kVar;
                        }
                        i22 = RemoteCameraConfig.Camera.BITRATE;
                        i6 |= i22;
                    } else {
                        o0kVar2 = o0kVar;
                    }
                    i11 = i5 & 256;
                    if (i11 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i6 |= oq5Var3.d(i2) ? 67108864 : 33554432;
                    }
                    i12 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                    if (i12 == 0) {
                        i6 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        i13 = i12;
                        i6 |= oq5Var3.g(z) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        i14 = i5 & 1024;
                        if (i14 != 0) {
                            i16 = i4 | 6;
                            i15 = i14;
                        } else if ((i4 & 6) == 0) {
                            i15 = i14;
                            i16 = i4 | (oq5Var3.g(z2) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i4;
                        }
                        i17 = i5 & 2048;
                        if (i17 != 0) {
                            oq5Var = oq5Var3;
                            i18 = i17;
                            i19 = i16 | 48;
                        } else {
                            if ((i4 & 48) == 0) {
                                i18 = i17;
                                i16 |= oq5Var3.g(z3) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            oq5Var = oq5Var3;
                            i19 = i16;
                        }
                        if ((i6 & 306783379) != 306783378 && (i19 & 147) == 146 && oq5Var.z()) {
                            oq5Var.S();
                            float f17 = f9;
                            f15 = f8;
                            function14 = function12;
                            o0kVar4 = o0kVar2;
                            f14 = f17;
                            i21 = i2;
                            z8 = z2;
                            oq5Var2 = oq5Var;
                            f13 = f6;
                            f16 = f7;
                            z9 = z;
                            z7 = z3;
                        } else {
                            oq5Var.U();
                            if ((i3 & 1) != 0 || oq5Var.y()) {
                                Function1 function15 = i23 != 0 ? null : function12;
                                float f18 = i7 != 0 ? vt0.e : f6;
                                float f19 = i8 != 0 ? 8 : f7;
                                float f20 = i9 != 0 ? 8 : f8;
                                float f21 = i10 != 0 ? Float.NaN : f9;
                                o0k a2 = (i5 & 128) != 0 ? androidx.compose.foundation.layout.a.a(f19 + f20, 0.0f, 2) : o0kVar2;
                                i20 = i11 != 0 ? 1 : i2;
                                boolean z10 = i13 != 0 ? false : z;
                                boolean z11 = i15 != 0 ? true : z2;
                                if (i18 != 0) {
                                    float f22 = f21;
                                    f10 = f18;
                                    o0kVar3 = a2;
                                    f9 = f22;
                                    function13 = function15;
                                    z4 = true;
                                    z5 = z11;
                                    f11 = f20;
                                    f12 = f19;
                                } else {
                                    float f23 = f21;
                                    f10 = f18;
                                    o0kVar3 = a2;
                                    f9 = f23;
                                    z4 = z3;
                                    function13 = function15;
                                    f11 = f20;
                                    f12 = f19;
                                    z5 = z11;
                                }
                                z6 = z10;
                            } else {
                                oq5Var.S();
                                i20 = i2;
                                z6 = z;
                                z4 = z3;
                                o0kVar3 = o0kVar2;
                                f12 = f7;
                                f11 = f8;
                                function13 = function12;
                                f10 = f6;
                                z5 = z2;
                            }
                            oq5Var.q();
                            oq5Var2 = oq5Var;
                            bg3.a(d.d(yciVar, 1.0f), null, false, ild.C(-1630454127, new pyc() { // from class: k6c
                                @Override // defpackage.pyc
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    c cVar = (c) obj;
                                    hq5 hq5Var2 = (hq5) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    hz2 hz2Var = b2c.k;
                                    cVar.getClass();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                                    }
                                    if ((intValue & 19) == 18) {
                                        oq5 oq5Var4 = (oq5) hq5Var2;
                                        if (oq5Var4.z()) {
                                            oq5Var4.S();
                                            return Unit.a;
                                        }
                                    }
                                    float e2 = cVar.e();
                                    oq5 oq5Var5 = (oq5) hq5Var2;
                                    xof xofVar = (xof) oq5Var5.j(es5.n);
                                    o0k o0kVar5 = o0k.this;
                                    float f24 = androidx.compose.foundation.layout.a.f(o0kVar5, xofVar);
                                    List list2 = list;
                                    int size = list2.size();
                                    float f25 = f12;
                                    float s = o5g.s(e2, f24, f25, f10, i20, size, f9, f11, oq5Var5, 0);
                                    boolean L = c3x.L(oq5Var5);
                                    vci vciVar = vci.a;
                                    wn5 wn5Var2 = wn5Var;
                                    Object obj4 = gq5.a;
                                    if (L) {
                                        oq5Var5.Z(-1073246217);
                                        nx0 g2 = qx0.g(f25);
                                        yci z12 = d.z(vciVar, 3);
                                        boolean h2 = oq5Var5.h(list2) | oq5Var5.c(s) | oq5Var5.f(wn5Var2);
                                        Object K = oq5Var5.K();
                                        if (h2 || K == obj4) {
                                            K = new m6c(list2, s, wn5Var2, 0);
                                            oq5Var5.k0(K);
                                        }
                                        weo.h(z12, null, o0kVar5, g2, hz2Var, null, false, (Function1) K, oq5Var5, 196614, 202);
                                        oq5Var5.p(false);
                                    } else {
                                        oq5Var5.Z(-1072634835);
                                        float f26 = 0;
                                        if (Float.compare(s, f26) <= 0) {
                                            ssg.a(3, "FeatureCircularLazyRow", "try to lay out with item width = ".concat(cma.b(s)), null);
                                            oq5Var5.p(false);
                                            return Unit.a;
                                        }
                                        if (Float.compare(cVar.e(), f26) <= 0) {
                                            ssg.a(3, "FeatureCircularLazyRow", "try to lay out with parent width = ".concat(cma.b(cVar.e())), null);
                                            oq5Var5.p(false);
                                            return Unit.a;
                                        }
                                        int e3 = (int) (cVar.e() / s);
                                        if (e3 < 1) {
                                            e3 = 1;
                                        }
                                        jsg jsgVar = new jsg(e3, 3);
                                        int size2 = list2.size();
                                        boolean z13 = z5;
                                        int size3 = ((e3 < size2 || z6) && z13) ? Integer.MAX_VALUE : list2.size();
                                        int size4 = z13 ? 1073741823 - (1073741823 % list2.size()) : 0;
                                        boolean d2 = oq5Var5.d(size3);
                                        Object K2 = oq5Var5.K();
                                        if (d2 || K2 == obj4) {
                                            K2 = new uw1(size3, 1);
                                            oq5Var5.k0(K2);
                                        }
                                        fp7 b2 = r3k.b(size4, (Function0) K2, oq5Var5, 48, 0);
                                        boolean z14 = list2.size() > 1 && e3 < list2.size() && z4;
                                        s1r F = avf.F(b2, new l48(0), oq5Var5, 0, 28);
                                        yci z15 = d.z(vciVar, 3);
                                        Object K3 = oq5Var5.K();
                                        if (K3 == obj4) {
                                            K3 = new qxb(20);
                                            oq5Var5.k0(K3);
                                        }
                                        rvf.b(b2, a.a(nfp.b(z15, false, (Function1) K3), "feature_circular_lazy_row"), o0kVar5, jsgVar, 0, f25, hz2Var, F, z14, function13, null, null, ild.C(1755754455, new jv(7, list2, wn5Var2), oq5Var5), oq5Var5, ScreenMirroringConfig.Video.BITRATE_1_5MB, 3072, 6672);
                                        oq5Var5.p(false);
                                    }
                                    return Unit.a;
                                }
                            }, oq5Var2), oq5Var2, 3072, 6);
                            int i24 = i20;
                            f13 = f10;
                            function14 = function13;
                            z7 = z4;
                            z8 = z5;
                            z9 = z6;
                            i21 = i24;
                            float f24 = f11;
                            f14 = f9;
                            f15 = f24;
                            o0kVar4 = o0kVar3;
                            f16 = f12;
                        }
                        r = oq5Var2.r();
                        if (r != null) {
                            r.d = new Function2() { // from class: l6c
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int R = rvf.R(i3 | 1);
                                    int R2 = rvf.R(i4);
                                    hld.l(list, yciVar, function14, f13, f16, f15, f14, o0kVar4, i21, z9, z8, z7, wn5Var, (hq5) obj, R, R2, i5);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i13 = i12;
                    i14 = i5 & 1024;
                    if (i14 != 0) {
                    }
                    i17 = i5 & 2048;
                    if (i17 != 0) {
                    }
                    if ((i6 & 306783379) != 306783378) {
                    }
                    oq5Var.U();
                    if ((i3 & 1) != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if ((i5 & 128) != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (i13 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    z6 = z10;
                    oq5Var.q();
                    oq5Var2 = oq5Var;
                    bg3.a(d.d(yciVar, 1.0f), null, false, ild.C(-1630454127, new pyc() { // from class: k6c
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            c cVar = (c) obj;
                            hq5 hq5Var2 = (hq5) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            hz2 hz2Var = b2c.k;
                            cVar.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                            }
                            if ((intValue & 19) == 18) {
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                if (oq5Var4.z()) {
                                    oq5Var4.S();
                                    return Unit.a;
                                }
                            }
                            float e2 = cVar.e();
                            oq5 oq5Var5 = (oq5) hq5Var2;
                            xof xofVar = (xof) oq5Var5.j(es5.n);
                            o0k o0kVar5 = o0k.this;
                            float f242 = androidx.compose.foundation.layout.a.f(o0kVar5, xofVar);
                            List list2 = list;
                            int size = list2.size();
                            float f25 = f12;
                            float s = o5g.s(e2, f242, f25, f10, i20, size, f9, f11, oq5Var5, 0);
                            boolean L = c3x.L(oq5Var5);
                            vci vciVar = vci.a;
                            wn5 wn5Var2 = wn5Var;
                            Object obj4 = gq5.a;
                            if (L) {
                                oq5Var5.Z(-1073246217);
                                nx0 g2 = qx0.g(f25);
                                yci z12 = d.z(vciVar, 3);
                                boolean h2 = oq5Var5.h(list2) | oq5Var5.c(s) | oq5Var5.f(wn5Var2);
                                Object K = oq5Var5.K();
                                if (h2 || K == obj4) {
                                    K = new m6c(list2, s, wn5Var2, 0);
                                    oq5Var5.k0(K);
                                }
                                weo.h(z12, null, o0kVar5, g2, hz2Var, null, false, (Function1) K, oq5Var5, 196614, 202);
                                oq5Var5.p(false);
                            } else {
                                oq5Var5.Z(-1072634835);
                                float f26 = 0;
                                if (Float.compare(s, f26) <= 0) {
                                    ssg.a(3, "FeatureCircularLazyRow", "try to lay out with item width = ".concat(cma.b(s)), null);
                                    oq5Var5.p(false);
                                    return Unit.a;
                                }
                                if (Float.compare(cVar.e(), f26) <= 0) {
                                    ssg.a(3, "FeatureCircularLazyRow", "try to lay out with parent width = ".concat(cma.b(cVar.e())), null);
                                    oq5Var5.p(false);
                                    return Unit.a;
                                }
                                int e3 = (int) (cVar.e() / s);
                                if (e3 < 1) {
                                    e3 = 1;
                                }
                                jsg jsgVar = new jsg(e3, 3);
                                int size2 = list2.size();
                                boolean z13 = z5;
                                int size3 = ((e3 < size2 || z6) && z13) ? Integer.MAX_VALUE : list2.size();
                                int size4 = z13 ? 1073741823 - (1073741823 % list2.size()) : 0;
                                boolean d2 = oq5Var5.d(size3);
                                Object K2 = oq5Var5.K();
                                if (d2 || K2 == obj4) {
                                    K2 = new uw1(size3, 1);
                                    oq5Var5.k0(K2);
                                }
                                fp7 b2 = r3k.b(size4, (Function0) K2, oq5Var5, 48, 0);
                                boolean z14 = list2.size() > 1 && e3 < list2.size() && z4;
                                s1r F = avf.F(b2, new l48(0), oq5Var5, 0, 28);
                                yci z15 = d.z(vciVar, 3);
                                Object K3 = oq5Var5.K();
                                if (K3 == obj4) {
                                    K3 = new qxb(20);
                                    oq5Var5.k0(K3);
                                }
                                rvf.b(b2, a.a(nfp.b(z15, false, (Function1) K3), "feature_circular_lazy_row"), o0kVar5, jsgVar, 0, f25, hz2Var, F, z14, function13, null, null, ild.C(1755754455, new jv(7, list2, wn5Var2), oq5Var5), oq5Var5, ScreenMirroringConfig.Video.BITRATE_1_5MB, 3072, 6672);
                                oq5Var5.p(false);
                            }
                            return Unit.a;
                        }
                    }, oq5Var2), oq5Var2, 3072, 6);
                    int i242 = i20;
                    f13 = f10;
                    function14 = function13;
                    z7 = z4;
                    z8 = z5;
                    z9 = z6;
                    i21 = i242;
                    float f242 = f11;
                    f14 = f9;
                    f15 = f242;
                    o0kVar4 = o0kVar3;
                    f16 = f12;
                    r = oq5Var2.r();
                    if (r != null) {
                    }
                }
                f7 = f3;
                i9 = i5 & 32;
                if (i9 == 0) {
                }
                i10 = i5 & 64;
                if (i10 == 0) {
                }
                if ((i3 & 12582912) != 0) {
                }
                i11 = i5 & 256;
                if (i11 == 0) {
                }
                i12 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i5 & 1024;
                if (i14 != 0) {
                }
                i17 = i5 & 2048;
                if (i17 != 0) {
                }
                if ((i6 & 306783379) != 306783378) {
                }
                oq5Var.U();
                if ((i3 & 1) != 0) {
                }
                if (i23 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i10 != 0) {
                }
                if ((i5 & 128) != 0) {
                }
                if (i11 != 0) {
                }
                if (i13 != 0) {
                }
                if (i15 != 0) {
                }
                if (i18 != 0) {
                }
                z6 = z10;
                oq5Var.q();
                oq5Var2 = oq5Var;
                bg3.a(d.d(yciVar, 1.0f), null, false, ild.C(-1630454127, new pyc() { // from class: k6c
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        c cVar = (c) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        hz2 hz2Var = b2c.k;
                        cVar.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                        }
                        if ((intValue & 19) == 18) {
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            if (oq5Var4.z()) {
                                oq5Var4.S();
                                return Unit.a;
                            }
                        }
                        float e2 = cVar.e();
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        xof xofVar = (xof) oq5Var5.j(es5.n);
                        o0k o0kVar5 = o0k.this;
                        float f2422 = androidx.compose.foundation.layout.a.f(o0kVar5, xofVar);
                        List list2 = list;
                        int size = list2.size();
                        float f25 = f12;
                        float s = o5g.s(e2, f2422, f25, f10, i20, size, f9, f11, oq5Var5, 0);
                        boolean L = c3x.L(oq5Var5);
                        vci vciVar = vci.a;
                        wn5 wn5Var2 = wn5Var;
                        Object obj4 = gq5.a;
                        if (L) {
                            oq5Var5.Z(-1073246217);
                            nx0 g2 = qx0.g(f25);
                            yci z12 = d.z(vciVar, 3);
                            boolean h2 = oq5Var5.h(list2) | oq5Var5.c(s) | oq5Var5.f(wn5Var2);
                            Object K = oq5Var5.K();
                            if (h2 || K == obj4) {
                                K = new m6c(list2, s, wn5Var2, 0);
                                oq5Var5.k0(K);
                            }
                            weo.h(z12, null, o0kVar5, g2, hz2Var, null, false, (Function1) K, oq5Var5, 196614, 202);
                            oq5Var5.p(false);
                        } else {
                            oq5Var5.Z(-1072634835);
                            float f26 = 0;
                            if (Float.compare(s, f26) <= 0) {
                                ssg.a(3, "FeatureCircularLazyRow", "try to lay out with item width = ".concat(cma.b(s)), null);
                                oq5Var5.p(false);
                                return Unit.a;
                            }
                            if (Float.compare(cVar.e(), f26) <= 0) {
                                ssg.a(3, "FeatureCircularLazyRow", "try to lay out with parent width = ".concat(cma.b(cVar.e())), null);
                                oq5Var5.p(false);
                                return Unit.a;
                            }
                            int e3 = (int) (cVar.e() / s);
                            if (e3 < 1) {
                                e3 = 1;
                            }
                            jsg jsgVar = new jsg(e3, 3);
                            int size2 = list2.size();
                            boolean z13 = z5;
                            int size3 = ((e3 < size2 || z6) && z13) ? Integer.MAX_VALUE : list2.size();
                            int size4 = z13 ? 1073741823 - (1073741823 % list2.size()) : 0;
                            boolean d2 = oq5Var5.d(size3);
                            Object K2 = oq5Var5.K();
                            if (d2 || K2 == obj4) {
                                K2 = new uw1(size3, 1);
                                oq5Var5.k0(K2);
                            }
                            fp7 b2 = r3k.b(size4, (Function0) K2, oq5Var5, 48, 0);
                            boolean z14 = list2.size() > 1 && e3 < list2.size() && z4;
                            s1r F = avf.F(b2, new l48(0), oq5Var5, 0, 28);
                            yci z15 = d.z(vciVar, 3);
                            Object K3 = oq5Var5.K();
                            if (K3 == obj4) {
                                K3 = new qxb(20);
                                oq5Var5.k0(K3);
                            }
                            rvf.b(b2, a.a(nfp.b(z15, false, (Function1) K3), "feature_circular_lazy_row"), o0kVar5, jsgVar, 0, f25, hz2Var, F, z14, function13, null, null, ild.C(1755754455, new jv(7, list2, wn5Var2), oq5Var5), oq5Var5, ScreenMirroringConfig.Video.BITRATE_1_5MB, 3072, 6672);
                            oq5Var5.p(false);
                        }
                        return Unit.a;
                    }
                }, oq5Var2), oq5Var2, 3072, 6);
                int i2422 = i20;
                f13 = f10;
                function14 = function13;
                z7 = z4;
                z8 = z5;
                z9 = z6;
                i21 = i2422;
                float f2422 = f11;
                f14 = f9;
                f15 = f2422;
                o0kVar4 = o0kVar3;
                f16 = f12;
                r = oq5Var2.r();
                if (r != null) {
                }
            }
            f6 = f2;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            f7 = f3;
            i9 = i5 & 32;
            if (i9 == 0) {
            }
            i10 = i5 & 64;
            if (i10 == 0) {
            }
            if ((i3 & 12582912) != 0) {
            }
            i11 = i5 & 256;
            if (i11 == 0) {
            }
            i12 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            i17 = i5 & 2048;
            if (i17 != 0) {
            }
            if ((i6 & 306783379) != 306783378) {
            }
            oq5Var.U();
            if ((i3 & 1) != 0) {
            }
            if (i23 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i10 != 0) {
            }
            if ((i5 & 128) != 0) {
            }
            if (i11 != 0) {
            }
            if (i13 != 0) {
            }
            if (i15 != 0) {
            }
            if (i18 != 0) {
            }
            z6 = z10;
            oq5Var.q();
            oq5Var2 = oq5Var;
            bg3.a(d.d(yciVar, 1.0f), null, false, ild.C(-1630454127, new pyc() { // from class: k6c
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    c cVar = (c) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    hz2 hz2Var = b2c.k;
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        if (oq5Var4.z()) {
                            oq5Var4.S();
                            return Unit.a;
                        }
                    }
                    float e2 = cVar.e();
                    oq5 oq5Var5 = (oq5) hq5Var2;
                    xof xofVar = (xof) oq5Var5.j(es5.n);
                    o0k o0kVar5 = o0k.this;
                    float f24222 = androidx.compose.foundation.layout.a.f(o0kVar5, xofVar);
                    List list2 = list;
                    int size = list2.size();
                    float f25 = f12;
                    float s = o5g.s(e2, f24222, f25, f10, i20, size, f9, f11, oq5Var5, 0);
                    boolean L = c3x.L(oq5Var5);
                    vci vciVar = vci.a;
                    wn5 wn5Var2 = wn5Var;
                    Object obj4 = gq5.a;
                    if (L) {
                        oq5Var5.Z(-1073246217);
                        nx0 g2 = qx0.g(f25);
                        yci z12 = d.z(vciVar, 3);
                        boolean h2 = oq5Var5.h(list2) | oq5Var5.c(s) | oq5Var5.f(wn5Var2);
                        Object K = oq5Var5.K();
                        if (h2 || K == obj4) {
                            K = new m6c(list2, s, wn5Var2, 0);
                            oq5Var5.k0(K);
                        }
                        weo.h(z12, null, o0kVar5, g2, hz2Var, null, false, (Function1) K, oq5Var5, 196614, 202);
                        oq5Var5.p(false);
                    } else {
                        oq5Var5.Z(-1072634835);
                        float f26 = 0;
                        if (Float.compare(s, f26) <= 0) {
                            ssg.a(3, "FeatureCircularLazyRow", "try to lay out with item width = ".concat(cma.b(s)), null);
                            oq5Var5.p(false);
                            return Unit.a;
                        }
                        if (Float.compare(cVar.e(), f26) <= 0) {
                            ssg.a(3, "FeatureCircularLazyRow", "try to lay out with parent width = ".concat(cma.b(cVar.e())), null);
                            oq5Var5.p(false);
                            return Unit.a;
                        }
                        int e3 = (int) (cVar.e() / s);
                        if (e3 < 1) {
                            e3 = 1;
                        }
                        jsg jsgVar = new jsg(e3, 3);
                        int size2 = list2.size();
                        boolean z13 = z5;
                        int size3 = ((e3 < size2 || z6) && z13) ? Integer.MAX_VALUE : list2.size();
                        int size4 = z13 ? 1073741823 - (1073741823 % list2.size()) : 0;
                        boolean d2 = oq5Var5.d(size3);
                        Object K2 = oq5Var5.K();
                        if (d2 || K2 == obj4) {
                            K2 = new uw1(size3, 1);
                            oq5Var5.k0(K2);
                        }
                        fp7 b2 = r3k.b(size4, (Function0) K2, oq5Var5, 48, 0);
                        boolean z14 = list2.size() > 1 && e3 < list2.size() && z4;
                        s1r F = avf.F(b2, new l48(0), oq5Var5, 0, 28);
                        yci z15 = d.z(vciVar, 3);
                        Object K3 = oq5Var5.K();
                        if (K3 == obj4) {
                            K3 = new qxb(20);
                            oq5Var5.k0(K3);
                        }
                        rvf.b(b2, a.a(nfp.b(z15, false, (Function1) K3), "feature_circular_lazy_row"), o0kVar5, jsgVar, 0, f25, hz2Var, F, z14, function13, null, null, ild.C(1755754455, new jv(7, list2, wn5Var2), oq5Var5), oq5Var5, ScreenMirroringConfig.Video.BITRATE_1_5MB, 3072, 6672);
                        oq5Var5.p(false);
                    }
                    return Unit.a;
                }
            }, oq5Var2), oq5Var2, 3072, 6);
            int i24222 = i20;
            f13 = f10;
            function14 = function13;
            z7 = z4;
            z8 = z5;
            z9 = z6;
            i21 = i24222;
            float f24222 = f11;
            f14 = f9;
            f15 = f24222;
            o0kVar4 = o0kVar3;
            f16 = f12;
            r = oq5Var2.r();
            if (r != null) {
            }
        }
        function12 = function1;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        f6 = f2;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        f7 = f3;
        i9 = i5 & 32;
        if (i9 == 0) {
        }
        i10 = i5 & 64;
        if (i10 == 0) {
        }
        if ((i3 & 12582912) != 0) {
        }
        i11 = i5 & 256;
        if (i11 == 0) {
        }
        i12 = i5 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        i17 = i5 & 2048;
        if (i17 != 0) {
        }
        if ((i6 & 306783379) != 306783378) {
        }
        oq5Var.U();
        if ((i3 & 1) != 0) {
        }
        if (i23 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i10 != 0) {
        }
        if ((i5 & 128) != 0) {
        }
        if (i11 != 0) {
        }
        if (i13 != 0) {
        }
        if (i15 != 0) {
        }
        if (i18 != 0) {
        }
        z6 = z10;
        oq5Var.q();
        oq5Var2 = oq5Var;
        bg3.a(d.d(yciVar, 1.0f), null, false, ild.C(-1630454127, new pyc() { // from class: k6c
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                c cVar = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                hz2 hz2Var = b2c.k;
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        return Unit.a;
                    }
                }
                float e2 = cVar.e();
                oq5 oq5Var5 = (oq5) hq5Var2;
                xof xofVar = (xof) oq5Var5.j(es5.n);
                o0k o0kVar5 = o0k.this;
                float f242222 = androidx.compose.foundation.layout.a.f(o0kVar5, xofVar);
                List list2 = list;
                int size = list2.size();
                float f25 = f12;
                float s = o5g.s(e2, f242222, f25, f10, i20, size, f9, f11, oq5Var5, 0);
                boolean L = c3x.L(oq5Var5);
                vci vciVar = vci.a;
                wn5 wn5Var2 = wn5Var;
                Object obj4 = gq5.a;
                if (L) {
                    oq5Var5.Z(-1073246217);
                    nx0 g2 = qx0.g(f25);
                    yci z12 = d.z(vciVar, 3);
                    boolean h2 = oq5Var5.h(list2) | oq5Var5.c(s) | oq5Var5.f(wn5Var2);
                    Object K = oq5Var5.K();
                    if (h2 || K == obj4) {
                        K = new m6c(list2, s, wn5Var2, 0);
                        oq5Var5.k0(K);
                    }
                    weo.h(z12, null, o0kVar5, g2, hz2Var, null, false, (Function1) K, oq5Var5, 196614, 202);
                    oq5Var5.p(false);
                } else {
                    oq5Var5.Z(-1072634835);
                    float f26 = 0;
                    if (Float.compare(s, f26) <= 0) {
                        ssg.a(3, "FeatureCircularLazyRow", "try to lay out with item width = ".concat(cma.b(s)), null);
                        oq5Var5.p(false);
                        return Unit.a;
                    }
                    if (Float.compare(cVar.e(), f26) <= 0) {
                        ssg.a(3, "FeatureCircularLazyRow", "try to lay out with parent width = ".concat(cma.b(cVar.e())), null);
                        oq5Var5.p(false);
                        return Unit.a;
                    }
                    int e3 = (int) (cVar.e() / s);
                    if (e3 < 1) {
                        e3 = 1;
                    }
                    jsg jsgVar = new jsg(e3, 3);
                    int size2 = list2.size();
                    boolean z13 = z5;
                    int size3 = ((e3 < size2 || z6) && z13) ? Integer.MAX_VALUE : list2.size();
                    int size4 = z13 ? 1073741823 - (1073741823 % list2.size()) : 0;
                    boolean d2 = oq5Var5.d(size3);
                    Object K2 = oq5Var5.K();
                    if (d2 || K2 == obj4) {
                        K2 = new uw1(size3, 1);
                        oq5Var5.k0(K2);
                    }
                    fp7 b2 = r3k.b(size4, (Function0) K2, oq5Var5, 48, 0);
                    boolean z14 = list2.size() > 1 && e3 < list2.size() && z4;
                    s1r F = avf.F(b2, new l48(0), oq5Var5, 0, 28);
                    yci z15 = d.z(vciVar, 3);
                    Object K3 = oq5Var5.K();
                    if (K3 == obj4) {
                        K3 = new qxb(20);
                        oq5Var5.k0(K3);
                    }
                    rvf.b(b2, a.a(nfp.b(z15, false, (Function1) K3), "feature_circular_lazy_row"), o0kVar5, jsgVar, 0, f25, hz2Var, F, z14, function13, null, null, ild.C(1755754455, new jv(7, list2, wn5Var2), oq5Var5), oq5Var5, ScreenMirroringConfig.Video.BITRATE_1_5MB, 3072, 6672);
                    oq5Var5.p(false);
                }
                return Unit.a;
            }
        }, oq5Var2), oq5Var2, 3072, 6);
        int i242222 = i20;
        f13 = f10;
        function14 = function13;
        z7 = z4;
        z8 = z5;
        z9 = z6;
        i21 = i242222;
        float f242222 = f11;
        f14 = f9;
        f15 = f242222;
        o0kVar4 = o0kVar3;
        f16 = f12;
        r = oq5Var2.r();
        if (r != null) {
        }
    }

    public static final void m(ml4 ml4Var, hvq hvqVar, hq5 hq5Var, int i2) {
        int i3;
        ml4 ml4Var2;
        ml4Var.getClass();
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2090121053);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(ml4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(hvqVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            ml4Var2 = ml4Var;
        } else {
            ruq w = hvqVar.w();
            pwq k2 = hvqVar.k();
            boolean h2 = ((i3 & 14) == 4) | oq5Var.h(w) | oq5Var.h(k2);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                ml4Var2 = ml4Var;
                akc akcVar = new akc(ml4Var2, w, k2, null, 22);
                oq5Var.k0(akcVar);
                K = akcVar;
            } else {
                ml4Var2 = ml4Var;
            }
            gld.w(oq5Var, ml4Var2, (Function2) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lnf(ml4Var2, hvqVar, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void n(nki nkiVar, xli xliVar, yci yciVar, hq5 hq5Var, int i2) {
        xli xliVar2;
        oq5 oq5Var;
        int i3;
        String str;
        xmn r;
        kki kkiVar = kki.a;
        kjn kjnVar = gq5.a;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(523080848);
        int i4 = i2 | (oq5Var2.f(nkiVar) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(xliVar) ? 32 : 16;
        }
        int i5 = i4 | (oq5Var2.f(yciVar) ? 256 : 128);
        if ((i5 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
        } else if (nkiVar instanceof zji) {
            oq5Var2.Z(169529406);
            zji zjiVar = (zji) nkiVar;
            boolean h2 = oq5Var2.h(xliVar);
            Object K = oq5Var2.K();
            if (h2 || K == kjnVar) {
                aub aubVar = new aub(1, xliVar, xli.class, "onAlbumClick", "onAlbumClick(Lcom/yandex/music/shared/history/ui/model/MusicHistoryListItem$Context$Success$Album;)V", 0, 20);
                oq5Var2.k0(aubVar);
                K = aubVar;
            }
            ltg.d(zjiVar, (Function1) ((h9f) K), a.a(yciVar, "music_history_context_album"), oq5Var2, i5 & 14);
            oq5Var2.p(false);
        } else if (nkiVar instanceof cki) {
            oq5Var2.Z(169537989);
            cki ckiVar = (cki) nkiVar;
            boolean h3 = oq5Var2.h(xliVar);
            Object K2 = oq5Var2.K();
            if (h3 || K2 == kjnVar) {
                aub aubVar2 = new aub(1, xliVar, xli.class, "onPlaylistClick", "onPlaylistClick(Lcom/yandex/music/shared/history/ui/model/MusicHistoryListItem$Context$Success$Playlist;)V", 0, 21);
                oq5Var2.k0(aubVar2);
                K2 = aubVar2;
            }
            tyf.e(ckiVar, (Function1) ((h9f) K2), a.a(yciVar, "music_history_context_playlist"), oq5Var2, i5 & 14);
            oq5Var2.p(false);
        } else {
            if (nkiVar instanceof aki) {
                oq5Var2.Z(169546717);
                aki akiVar = (aki) nkiVar;
                boolean h4 = oq5Var2.h(xliVar);
                Object K3 = oq5Var2.K();
                if (h4 || K3 == kjnVar) {
                    aub aubVar3 = new aub(1, xliVar, xli.class, "onArtistClick", "onArtistClick(Lcom/yandex/music/shared/history/ui/model/MusicHistoryListItem$Context$Success$Artist;)V", 0, 22);
                    xliVar2 = xliVar;
                    oq5Var2.k0(aubVar3);
                    K3 = aubVar3;
                } else {
                    xliVar2 = xliVar;
                }
                ox6.d(akiVar, (Function1) ((h9f) K3), a.a(yciVar, "music_history_context_artist"), oq5Var2, i5 & 14);
                oq5Var2.p(false);
                oq5Var = oq5Var2;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new yja(nkiVar, xliVar2, yciVar, i2, 14);
                    return;
                }
                return;
            }
            xliVar2 = xliVar;
            boolean z = true;
            if (nkiVar instanceof eki) {
                oq5Var2.Z(169555238);
                eki ekiVar = (eki) nkiVar;
                int i6 = ((i5 >> 3) & 14) | ((i5 << 3) & 112);
                Object K4 = oq5Var2.K();
                if (K4 == kjnVar) {
                    K4 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
                }
                mm6 mm6Var = ((fs5) K4).a;
                boolean f2 = oq5Var2.f(xliVar2);
                if ((((i6 & 112) ^ 48) <= 32 || !oq5Var2.f(ekiVar)) && (i6 & 48) != 32) {
                    z = false;
                }
                boolean z2 = f2 | z;
                Object K5 = oq5Var2.K();
                if (z2 || K5 == kjnVar) {
                    xliVar2.getClass();
                    K5 = xliVar2.b(ekiVar.c, ekiVar.d, mm6Var);
                    oq5Var2.k0(K5);
                }
                avf.n(ekiVar, (owu) K5, ((Boolean) xliVar2.j.invoke()).booleanValue(), a.a(yciVar, "music_history_context_wave"), oq5Var2, i5 & 14);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            } else {
                oq5Var = oq5Var2;
                if (nkiVar instanceof bki) {
                    oq5Var.Z(169567110);
                    bki bkiVar = (bki) nkiVar;
                    int i7 = ((i5 >> 3) & 14) | ((i5 << 3) & 112);
                    Object K6 = oq5Var.K();
                    if (K6 == kjnVar) {
                        K6 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                    }
                    mm6 mm6Var2 = ((fs5) K6).a;
                    boolean f3 = oq5Var.f(xliVar2);
                    if ((((i7 & 112) ^ 48) <= 32 || !oq5Var.f(bkiVar)) && (i7 & 48) != 32) {
                        z = false;
                    }
                    boolean z3 = z | f3;
                    Object K7 = oq5Var.K();
                    if (z3 || K7 == kjnVar) {
                        xliVar2.getClass();
                        K7 = xliVar2.b(bkiVar.b, bkiVar.c, mm6Var2);
                        oq5Var.k0(K7);
                    }
                    o2g.f(bkiVar, (owu) K7, a.a(yciVar, "music_history_context_multiwave"), oq5Var, i5 & 14);
                    oq5Var.p(false);
                } else if (nkiVar instanceof dki) {
                    oq5Var.Z(169577068);
                    dki dkiVar = (dki) nkiVar;
                    q7n q7nVar = dkiVar.a;
                    int i8 = ((i5 >> 3) & 14) | ((i5 << 3) & 112);
                    Object K8 = oq5Var.K();
                    if (K8 == kjnVar) {
                        K8 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
                    }
                    mm6 mm6Var3 = ((fs5) K8).a;
                    boolean f4 = ((((i8 & 112) ^ 48) > 32 && oq5Var.f(dkiVar)) || (i8 & 48) == 32) | oq5Var.f(xliVar2);
                    Object K9 = oq5Var.K();
                    if (f4 || K9 == kjnVar) {
                        xliVar2.getClass();
                        n7n n7nVar = dkiVar.b;
                        twu S = wyf.S(mm6Var3, xliVar2.c, xliVar2.d, null, null, xliVar2.g, xliVar2.e, n7nVar.c, new cte(8, xliVar2, dkiVar, n7nVar), null);
                        int i9 = dkiVar.c.c;
                        d1h d1hVar = xliVar2.f;
                        l0f l0fVar = new l0f(xliVar2, n7nVar, i9, 1);
                        ly4 ly4Var = d1hVar.a;
                        bdt I = hag.I(q0h.class);
                        qdc qdcVar = ly4Var.a;
                        qdcVar.getClass();
                        r7n r7nVar = new r7n(S, (q0h) qdcVar.C(I), l0fVar);
                        oq5Var.k0(r7nVar);
                        K9 = r7nVar;
                    }
                    gut.g(q7nVar, (r7n) K9, a.a(yciVar, "music_history_context_q2v_wave"), oq5Var, 0);
                    oq5Var.p(false);
                } else if (nkiVar instanceof jki) {
                    oq5Var.Z(169586804);
                    rvf.o((jki) nkiVar, yciVar, oq5Var, (i5 & 14) | ((i5 >> 3) & 112));
                    oq5Var.p(false);
                } else if (nkiVar instanceof mki) {
                    oq5Var.Z(169591754);
                    mki mkiVar = (mki) nkiVar;
                    lki lkiVar = lki.a;
                    if (mkiVar.equals(lkiVar)) {
                        i3 = R.string.listening_history_context_search;
                    } else {
                        if (!mkiVar.equals(kkiVar)) {
                            b6e.s();
                            return;
                        }
                        i3 = R.string.listening_history_context_shuffle;
                    }
                    if ((((i5 & 14) ^ 6) <= 4 || !oq5Var.f(mkiVar)) && (i5 & 6) != 4) {
                        z = false;
                    }
                    Object K10 = oq5Var.K();
                    if (z || K10 == kjnVar) {
                        if (mkiVar.equals(lkiVar)) {
                            str = "music_history_context_search";
                        } else {
                            if (!mkiVar.equals(kkiVar)) {
                                b6e.s();
                                return;
                            }
                            str = "music_history_context_other";
                        }
                        K10 = str;
                        oq5Var.k0(K10);
                    }
                    men.h(i3, 0, 0, oq5Var, a.a(yciVar, (String) K10));
                    oq5Var.p(false);
                } else if (nkiVar instanceof sji) {
                    oq5Var.Z(169598515);
                    ltg.c(((i5 >> 3) & 112) | 6, oq5Var, yciVar, true);
                    oq5Var.p(false);
                } else if (nkiVar instanceof tji) {
                    oq5Var.Z(169603604);
                    ox6.c(((i5 >> 3) & 112) | 6, oq5Var, yciVar, true);
                    oq5Var.p(false);
                } else if (nkiVar instanceof vji) {
                    oq5Var.Z(169608790);
                    tyf.d(((i5 >> 3) & 112) | 6, oq5Var, yciVar, true);
                    oq5Var.p(false);
                } else if (nkiVar instanceof xji) {
                    oq5Var.Z(169613906);
                    avf.m(((i5 >> 3) & 112) | 6, oq5Var, yciVar, true);
                    oq5Var.p(false);
                } else if (nkiVar instanceof uji) {
                    oq5Var.Z(169619058);
                    avf.m(((i5 >> 3) & 112) | 6, oq5Var, yciVar, true);
                    oq5Var.p(false);
                } else if (nkiVar instanceof wji) {
                    oq5Var.Z(169624274);
                    avf.m(((i5 >> 3) & 112) | 6, oq5Var, yciVar, true);
                    oq5Var.p(false);
                } else if (Intrinsics.d(nkiVar, lji.a)) {
                    oq5Var.Z(169629141);
                    ltg.c(((i5 >> 3) & 112) | 6, oq5Var, yciVar, false);
                    oq5Var.p(false);
                } else if (Intrinsics.d(nkiVar, mji.a)) {
                    oq5Var.Z(169634134);
                    ox6.c(((i5 >> 3) & 112) | 6, oq5Var, yciVar, false);
                    oq5Var.p(false);
                } else if (Intrinsics.d(nkiVar, oji.a)) {
                    oq5Var.Z(169639224);
                    tyf.d(((i5 >> 3) & 112) | 6, oq5Var, yciVar, false);
                    oq5Var.p(false);
                } else if (Intrinsics.d(nkiVar, qji.a)) {
                    oq5Var.Z(169644244);
                    avf.m(((i5 >> 3) & 112) | 6, oq5Var, yciVar, false);
                    oq5Var.p(false);
                } else if (Intrinsics.d(nkiVar, nji.a)) {
                    oq5Var.Z(169649300);
                    avf.m(((i5 >> 3) & 112) | 6, oq5Var, yciVar, false);
                    oq5Var.p(false);
                } else {
                    if (!Intrinsics.d(nkiVar, pji.a)) {
                        throw vz1.i(oq5Var, 169530798, false);
                    }
                    oq5Var.Z(169654420);
                    avf.m(((i5 >> 3) & 112) | 6, oq5Var, yciVar, false);
                    oq5Var.p(false);
                }
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        xliVar2 = xliVar;
        oq5Var = oq5Var2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void o(gli gliVar, ynn ynnVar, xli xliVar, hq5 hq5Var, int i2) {
        int i3;
        gliVar.getClass();
        ynnVar.getClass();
        xliVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1677092599);
        int i4 = i2 | (oq5Var.f(gliVar) ? 4 : 2) | (oq5Var.f(ynnVar) ? 32 : 16) | (oq5Var.h(xliVar) ? 256 : 128);
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i5 = i4 & 14;
            boolean h2 = (i5 == 4) | oq5Var.h(xliVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new t1b(16, xliVar, gliVar);
                oq5Var.k0(K);
            }
            Function2 function2 = (Function2) K;
            vci vciVar = vci.a;
            yci b2 = com.yandex.music.core.ui.compose.a.b(vciVar, ynnVar, 0L, 0.0f, null, function2, 14);
            if (gliVar instanceof vki) {
                oq5Var.Z(1073263439);
                ezf.o((vki) gliVar, b2, oq5Var, i5);
                oq5Var.p(false);
            } else if (gliVar instanceof nki) {
                oq5Var.Z(1073267747);
                n((nki) gliVar, xliVar, b2, oq5Var, ((i4 >> 3) & 112) | i5);
                oq5Var.p(false);
            } else if (gliVar instanceof fli) {
                oq5Var.Z(1073273587);
                neg.f((fli) gliVar, xliVar, b2, oq5Var, ((i4 >> 3) & 112) | i5);
                oq5Var.p(false);
            } else {
                if (gliVar.equals(oki.a)) {
                    oq5Var.Z(1073279072);
                    i3 = 24;
                } else {
                    if (!gliVar.equals(pki.a)) {
                        throw vz1.i(oq5Var, 1073262176, false);
                    }
                    oq5Var.Z(1073281824);
                    i3 = 40;
                }
                eta.p(vciVar, i3, oq5Var, false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(gliVar, ynnVar, xliVar, i2, 21);
        }
    }

    public static final gh0 p() {
        return new gh0(new Paint(7));
    }

    public static final Exception q(o2 o2Var, String str, Exception exc) {
        if (exc instanceof as6) {
            return new as6(o2Var, str);
        }
        if (exc instanceof sad) {
            return new sad(o2Var, str);
        }
        throw new uvc();
    }

    public static final mm6 r(gyf gyfVar, CoroutineContext coroutineContext) {
        gyfVar.getClass();
        coroutineContext.getClass();
        return gyfVar instanceof rjq ? new um6((rjq) gyfVar, coroutineContext) : k(gyfVar, coroutineContext);
    }

    public static final um6 s(rjq rjqVar, CoroutineContext coroutineContext) {
        rjqVar.getClass();
        coroutineContext.getClass();
        return new um6(rjqVar, coroutineContext);
    }

    public static k03 t(hi4 hi4Var, RuntimeException runtimeException) {
        hi4Var.getClass();
        String message = runtimeException instanceof r7w ? ((r7w) runtimeException).getMessage() : String.valueOf(runtimeException);
        q1c q1cVar = q1c.f;
        r1c r1cVar = r1c.a;
        String str = hi4Var.a;
        String str2 = hi4Var.c;
        if (str2 == null) {
            str2 = "null";
        }
        return new k03(q1cVar, r1cVar, null, str, hrg.s("Failed to handle 3ds challenge for response: ", hrg.s("<DiehardResponse: status - ", str, ", desc - ", str2, ">"), ", error: \"", message, "\""));
    }

    public static k03 u(hi4 hi4Var) {
        hi4Var.getClass();
        q1c q1cVar = q1c.f;
        r1c r1cVar = r1c.c;
        String str = hi4Var.a;
        String str2 = hi4Var.g;
        String str3 = hi4Var.c;
        if (str3 == null) {
            str3 = "null";
        }
        return new k03(q1cVar, r1cVar, null, str, hrg.r("Invalid redirectUrl \"", str2, "\" in response: ", hrg.s("<DiehardResponse: status - ", str, ", desc - ", str3, ">")));
    }

    public static void v(Object obj, Object obj2) {
        if (obj == null) {
            jj4.j(hrg.n(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            jj4.j(dfi.g("null value in entry: ", "=null", obj));
        }
    }

    public static void w(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        l1j.h(i2, str, " cannot be negative but was: ");
    }

    public static void x(db7 db7Var) {
        if (db7Var != null) {
            try {
                db7Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int y(x66 x66Var) {
        if (x66Var.b == u0j.a) {
            return R.string.offline_mode_on;
        }
        if (!x66Var.a) {
            return R.string.check_internet_connection;
        }
        Assertions.fail("Invalid connection info, only connected == false allowed");
        return R.string.check_internet_connection;
    }

    public static final u5l z(exa exaVar, thj thjVar, int i2) {
        thjVar.getClass();
        cvo cvoVar = (cvo) exaVar.b.getValue();
        cvoVar.getClass();
        xmb xmbVar = exaVar.c;
        nab nabVar = exaVar.a;
        Integer valueOf = Integer.valueOf(i2);
        xmbVar.getClass();
        return xmb.c(thjVar, nabVar, null, cvoVar, valueOf);
    }
}
