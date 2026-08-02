package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import androidx.compose.animation.b;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.url.schemes.playVibe.EmptyScreenInDeeplinkActivity;

/* loaded from: classes.dex */
public abstract class qwp {
    public static final wn5 a = new wn5(new bo5(17), 948168406, false);
    public static final wn5 b = new wn5(new io5(22), -51128006, false);
    public static final wn5 c = new wn5(new ro5(18), 1220176012, false);
    public static final wn5 d;
    public static final Type[] e;
    public static final long[] f;

    static {
        new wn5(new ro5(19), -1872814482, false);
        d = new wn5(new ep5(0), 1593461767, false);
        e = new Type[0];
        f = new long[0];
    }

    public static void D(String str) {
        if (str.length() <= 0) {
            xq0.x("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ('!' > charAt || charAt >= 127) {
                xq0.o(cvt.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                return;
            }
        }
    }

    public static void E(Type type) {
        vwb.K(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static void F(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static void G(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                xq0.o(cvt.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2).concat(cvt.q(str2) ? "" : ": ".concat(str)));
                return;
            }
        }
    }

    public static final cn0 H(cn0 cn0Var) {
        cn0 c2 = cn0Var.c();
        int b2 = c2.b();
        for (int i = 0; i < b2; i++) {
            c2.e(i, cn0Var.a(i));
        }
        return c2;
    }

    public static final jc8 I(jc8 jc8Var, String str) {
        List list;
        String str2;
        if (jc8Var instanceof hb8) {
            i29 i29Var = ((hb8) jc8Var).c;
            return new hb8(new i29(i29Var.a, i29Var.b, i29Var.c, i29Var.d, i29Var.e, i29Var.f, i29Var.g, i29Var.h, i29Var.i, i29Var.j, i29Var.k, i29Var.l, i29Var.m, i29Var.n, i29Var.o, i29Var.p, i29Var.q, i29Var.r, i29Var.s, i29Var.t, i29Var.u, i29Var.v, i29Var.w, i29Var.x, i29Var.y, i29Var.z, str, i29Var.B, i29Var.C, i29Var.D, i29Var.E, i29Var.F, i29Var.G, i29Var.H, i29Var.I, i29Var.J, i29Var.K, i29Var.L, i29Var.M, i29Var.N, i29Var.O, i29Var.P, i29Var.Q, i29Var.R, i29Var.S, i29Var.T, i29Var.U, i29Var.V, i29Var.W, i29Var.X, i29Var.Y, i29Var.Z, i29Var.a0, i29Var.b0, i29Var.c0, i29Var.d0));
        }
        if (jc8Var instanceof fb8) {
            i19 i19Var = ((fb8) jc8Var).c;
            int i = i19.b0;
            return new fb8(new i19(i19Var.a, i19Var.b, i19Var.c, i19Var.d, i19Var.e, i19Var.f, i19Var.g, i19Var.h, i19Var.i, i19Var.j, i19Var.k, i19Var.l, i19Var.m, i19Var.n, i19Var.o, i19Var.p, i19Var.q, i19Var.r, i19Var.s, i19Var.t, i19Var.u, i19Var.v, i19Var.w, i19Var.x, str, i19Var.z, i19Var.A, i19Var.B, i19Var.C, i19Var.D, i19Var.E, i19Var.F, i19Var.G, i19Var.H, i19Var.I, i19Var.J, i19Var.K, i19Var.L, i19Var.M, i19Var.N, i19Var.O, i19Var.P, i19Var.Q, i19Var.R, i19Var.S, i19Var.T, i19Var.U, i19Var.V, i19Var.W, i19Var.X, i19Var.Y, i19Var.Z));
        }
        if (jc8Var instanceof rb8) {
            xq9 xq9Var = ((rb8) jc8Var).c;
            return new rb8(new xq9(xq9Var.a, xq9Var.b, xq9Var.c, xq9Var.d, xq9Var.e, xq9Var.f, xq9Var.g, xq9Var.h, xq9Var.i, xq9Var.j, xq9Var.k, xq9Var.l, xq9Var.m, xq9Var.n, xq9Var.o, xq9Var.p, xq9Var.q, xq9Var.r, xq9Var.s, xq9Var.t, xq9Var.u, xq9Var.v, xq9Var.w, xq9Var.x, xq9Var.y, xq9Var.z, xq9Var.A, xq9Var.B, xq9Var.C, xq9Var.D, str, xq9Var.F, xq9Var.G, xq9Var.H, xq9Var.I, xq9Var.J, xq9Var.K, xq9Var.L, xq9Var.M, xq9Var.N, xq9Var.O, xq9Var.P, xq9Var.Q, xq9Var.R, xq9Var.S, xq9Var.T, xq9Var.U, xq9Var.V, xq9Var.W, xq9Var.X, xq9Var.Y, xq9Var.Z, xq9Var.a0, xq9Var.b0, xq9Var.c0, xq9Var.d0, xq9Var.e0, xq9Var.f0, xq9Var.g0, xq9Var.h0, xq9Var.i0, xq9Var.j0, xq9Var.k0, xq9Var.l0, xq9Var.m0, xq9Var.n0, xq9Var.o0, xq9Var.p0, xq9Var.q0, xq9Var.r0));
        }
        if (jc8Var instanceof mb8) {
            ri9 ri9Var = ((mb8) jc8Var).c;
            return new mb8(new ri9(ri9Var.a, ri9Var.b, ri9Var.c, ri9Var.d, ri9Var.e, ri9Var.f, ri9Var.g, ri9Var.h, ri9Var.i, ri9Var.j, ri9Var.k, ri9Var.l, ri9Var.m, ri9Var.n, ri9Var.o, ri9Var.p, ri9Var.q, ri9Var.r, ri9Var.s, ri9Var.t, ri9Var.u, str, ri9Var.w, ri9Var.x, ri9Var.y, ri9Var.z, ri9Var.A, ri9Var.B, ri9Var.C, ri9Var.D, ri9Var.E, ri9Var.F, ri9Var.G, ri9Var.H, ri9Var.I, ri9Var.J, ri9Var.K, ri9Var.L, ri9Var.M, ri9Var.N, ri9Var.O, ri9Var.P, ri9Var.Q, ri9Var.R));
        }
        ArrayList arrayList = null;
        if (jc8Var instanceof cb8) {
            jt8 jt8Var = ((cb8) jc8Var).c;
            List list2 = jt8Var.B;
            if (list2 != null) {
                List list3 = list2;
                arrayList = new ArrayList(v75.o(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(J((jc8) it.next()));
                }
            }
            return new cb8(new jt8(jt8Var.a, jt8Var.b, jt8Var.c, jt8Var.d, jt8Var.e, jt8Var.f, jt8Var.g, jt8Var.h, jt8Var.i, jt8Var.j, jt8Var.k, jt8Var.l, jt8Var.m, jt8Var.n, jt8Var.o, jt8Var.p, jt8Var.q, jt8Var.r, jt8Var.s, jt8Var.t, jt8Var.u, jt8Var.v, jt8Var.w, jt8Var.x, ((-150994945) & 16777216) != 0 ? jt8Var.y : str, jt8Var.z, jt8Var.A, arrayList, jt8Var.C, jt8Var.D, jt8Var.E, jt8Var.F, jt8Var.G, jt8Var.H, jt8Var.I, jt8Var.J, jt8Var.K, jt8Var.L, jt8Var.M, jt8Var.N, jt8Var.O, jt8Var.P, jt8Var.Q, jt8Var.R, jt8Var.S, jt8Var.T, jt8Var.U, jt8Var.V, jt8Var.W, jt8Var.X, jt8Var.Y, jt8Var.Z, jt8Var.a0, jt8Var.b0, jt8Var.c0));
        }
        if (jc8Var instanceof gb8) {
            w19 w19Var = ((gb8) jc8Var).c;
            List list4 = w19Var.y;
            if (list4 != null) {
                List list5 = list4;
                arrayList = new ArrayList(v75.o(list5, 10));
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList.add(J((jc8) it2.next()));
                }
            }
            return new gb8(new w19(w19Var.a, w19Var.b, w19Var.c, w19Var.d, w19Var.e, w19Var.f, w19Var.g, w19Var.h, w19Var.i, w19Var.j, w19Var.k, w19Var.l, w19Var.m, w19Var.n, w19Var.o, w19Var.p, w19Var.q, w19Var.r, w19Var.s, w19Var.t, w19Var.u, w19Var.v, w19Var.w, ((-25165825) & 8388608) != 0 ? w19Var.x : str, arrayList, w19Var.z, w19Var.A, w19Var.B, w19Var.C, w19Var.D, w19Var.E, w19Var.F, w19Var.G, w19Var.H, w19Var.I, w19Var.J, w19Var.K, w19Var.L, w19Var.M, w19Var.N, w19Var.O, w19Var.P, w19Var.Q, w19Var.R, w19Var.S, w19Var.T, w19Var.U));
        }
        if (jc8Var instanceof eb8) {
            s09 s09Var = ((eb8) jc8Var).c;
            List list6 = s09Var.u;
            if (list6 != null) {
                List list7 = list6;
                arrayList = new ArrayList(v75.o(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList.add(J((jc8) it3.next()));
                }
            }
            return new eb8(new s09(s09Var.a, s09Var.b, s09Var.c, s09Var.d, s09Var.e, s09Var.f, s09Var.g, s09Var.h, s09Var.i, s09Var.j, s09Var.k, s09Var.l, s09Var.m, s09Var.n, s09Var.o, s09Var.p, s09Var.q, ((-1179649) & SQLiteDatabase.OPEN_SHAREDCACHE) != 0 ? s09Var.r : str, s09Var.s, s09Var.t, arrayList, s09Var.v, s09Var.w, s09Var.x, s09Var.y, s09Var.z, s09Var.A, s09Var.B, s09Var.C, s09Var.D, s09Var.E, s09Var.F, s09Var.G, s09Var.H, s09Var.I, s09Var.J, s09Var.K, s09Var.L, s09Var.M, s09Var.N, s09Var.O, s09Var.P, s09Var.Q, s09Var.R));
        }
        if (jc8Var instanceof kb8) {
            eb9 eb9Var = ((kb8) jc8Var).c;
            List list8 = eb9Var.t;
            if (list8 != null) {
                List list9 = list8;
                arrayList = new ArrayList(v75.o(list9, 10));
                Iterator it4 = list9.iterator();
                while (it4.hasNext()) {
                    arrayList.add(J((jc8) it4.next()));
                }
            }
            ArrayList arrayList2 = arrayList;
            tc8 tc8Var = eb9Var.a;
            szb szbVar = eb9Var.b;
            szb szbVar2 = eb9Var.c;
            szb szbVar3 = eb9Var.d;
            List list10 = eb9Var.e;
            List list11 = eb9Var.f;
            op8 op8Var = eb9Var.g;
            szb szbVar4 = eb9Var.h;
            szb szbVar5 = eb9Var.i;
            szb szbVar6 = eb9Var.j;
            List list12 = eb9Var.k;
            List list13 = eb9Var.l;
            wz8 wz8Var = eb9Var.m;
            List list14 = eb9Var.n;
            bk9 bk9Var = eb9Var.o;
            if (((-557057) & SQLiteDatabase.OPEN_NOMUTEX) != 0) {
                list = list13;
                str2 = eb9Var.p;
            } else {
                list = list13;
                str2 = str;
            }
            return new kb8(new eb9(tc8Var, szbVar, szbVar2, szbVar3, list10, list11, op8Var, szbVar4, szbVar5, szbVar6, list12, list, wz8Var, list14, bk9Var, str2, eb9Var.q, eb9Var.r, eb9Var.s, arrayList2, eb9Var.u, eb9Var.v, eb9Var.w, eb9Var.x, eb9Var.y, eb9Var.z, eb9Var.A, eb9Var.B, eb9Var.C, eb9Var.D, eb9Var.E, eb9Var.F, eb9Var.G, eb9Var.H, eb9Var.I, eb9Var.J, eb9Var.K, eb9Var.L, eb9Var.M, eb9Var.N, eb9Var.O, eb9Var.P, eb9Var.Q, eb9Var.R));
        }
        if (jc8Var instanceof qb8) {
            vo9 vo9Var = ((qb8) jc8Var).c;
            List<ro9> list15 = vo9Var.q;
            ArrayList arrayList3 = new ArrayList(v75.o(list15, 10));
            for (ro9 ro9Var : list15) {
                arrayList3.add(new ro9(J(ro9Var.a), ro9Var.b, ro9Var.c));
            }
            return new qb8(new vo9(vo9Var.a, vo9Var.b, vo9Var.c, vo9Var.d, vo9Var.e, vo9Var.f, vo9Var.g, vo9Var.h, vo9Var.i, vo9Var.j, vo9Var.k, vo9Var.l, vo9Var.m, vo9Var.n, vo9Var.o, str, arrayList3, vo9Var.r, vo9Var.s, vo9Var.t, vo9Var.u, vo9Var.v, vo9Var.w, vo9Var.x, vo9Var.y, vo9Var.z, vo9Var.A, vo9Var.B, vo9Var.C, vo9Var.D, vo9Var.E, vo9Var.F, vo9Var.G, vo9Var.H, vo9Var.I, vo9Var.J, vo9Var.K, vo9Var.L, vo9Var.M, vo9Var.N, vo9Var.O, vo9Var.P, vo9Var.Q, vo9Var.R));
        }
        if (jc8Var instanceof ob8) {
            dm9 dm9Var = ((ob8) jc8Var).c;
            List<cm9> list16 = dm9Var.I;
            ArrayList arrayList4 = new ArrayList(v75.o(list16, 10));
            for (cm9 cm9Var : list16) {
                jc8 jc8Var2 = cm9Var.c;
                arrayList4.add(new cm9(cm9Var.a, cm9Var.b, jc8Var2 != null ? I(jc8Var2, jc8Var2.d().getId()) : null, cm9Var.d, cm9Var.e));
            }
            return new ob8(new dm9(dm9Var.a, dm9Var.b, dm9Var.c, dm9Var.d, dm9Var.e, dm9Var.f, dm9Var.g, dm9Var.h, dm9Var.i, dm9Var.j, dm9Var.k, dm9Var.l, dm9Var.m, dm9Var.n, dm9Var.o, str, dm9Var.q, dm9Var.r, dm9Var.s, dm9Var.t, dm9Var.u, dm9Var.v, dm9Var.w, str, dm9Var.y, dm9Var.z, dm9Var.A, dm9Var.B, dm9Var.C, dm9Var.D, dm9Var.E, dm9Var.F, dm9Var.G, dm9Var.H, arrayList4, dm9Var.J, dm9Var.K, dm9Var.L, dm9Var.M, dm9Var.N, dm9Var.O, dm9Var.P, dm9Var.Q, dm9Var.R, dm9Var.S, dm9Var.T, dm9Var.U, dm9Var.V, dm9Var.W));
        }
        if (jc8Var instanceof db8) {
            yu8 yu8Var = ((db8) jc8Var).c;
            return new db8(new yu8(yu8Var.a, yu8Var.b, yu8Var.c, yu8Var.d, yu8Var.e, yu8Var.f, yu8Var.g, yu8Var.h, yu8Var.i, yu8Var.j, yu8Var.k, yu8Var.l, yu8Var.m, yu8Var.n, yu8Var.o, str, yu8Var.q, yu8Var.r, yu8Var.s, yu8Var.t, yu8Var.u, yu8Var.v, yu8Var.w, yu8Var.x, yu8Var.y, yu8Var.z, yu8Var.A, yu8Var.B, yu8Var.C, yu8Var.D, yu8Var.E, yu8Var.F, yu8Var.G, yu8Var.H, yu8Var.I, yu8Var.J));
        }
        if (jc8Var instanceof ib8) {
            k39 k39Var = ((ib8) jc8Var).c;
            return new ib8(new k39(k39Var.a, k39Var.b, k39Var.c, k39Var.d, k39Var.e, k39Var.f, k39Var.g, k39Var.h, k39Var.i, k39Var.j, k39Var.k, k39Var.l, k39Var.m, k39Var.n, k39Var.o, k39Var.p, k39Var.q, str, k39Var.s, k39Var.t, k39Var.u, k39Var.v, k39Var.w, k39Var.x, k39Var.y, k39Var.z, k39Var.A, k39Var.B, k39Var.C, k39Var.D, k39Var.E, k39Var.F, k39Var.G, k39Var.H, k39Var.I, k39Var.J, k39Var.K, k39Var.L, k39Var.M, k39Var.N, k39Var.O, k39Var.P, k39Var.Q, k39Var.R, k39Var.S));
        }
        if (jc8Var instanceof nb8) {
            zk9 zk9Var = ((nb8) jc8Var).c;
            tc8 tc8Var2 = zk9Var.a;
            szb szbVar7 = zk9Var.b;
            szb szbVar8 = zk9Var.c;
            szb szbVar9 = zk9Var.d;
            List list17 = zk9Var.e;
            List list18 = zk9Var.f;
            op8 op8Var2 = zk9Var.g;
            szb szbVar10 = zk9Var.h;
            List list19 = zk9Var.i;
            List list20 = zk9Var.j;
            wz8 wz8Var2 = zk9Var.k;
            List list21 = zk9Var.l;
            bk9 bk9Var2 = zk9Var.m;
            szb szbVar11 = zk9Var.o;
            w79 w79Var = zk9Var.p;
            ix8 ix8Var = zk9Var.q;
            szb szbVar12 = zk9Var.r;
            szb szbVar13 = zk9Var.s;
            ix8 ix8Var2 = zk9Var.t;
            List list22 = zk9Var.u;
            szb szbVar14 = zk9Var.v;
            szb szbVar15 = zk9Var.w;
            tc8 tc8Var3 = zk9Var.x;
            List list23 = zk9Var.y;
            dx8 dx8Var = zk9Var.z;
            yk9 yk9Var = zk9Var.A;
            String str3 = zk9Var.B;
            dx8 dx8Var2 = zk9Var.C;
            yk9 yk9Var2 = zk9Var.D;
            String str4 = zk9Var.E;
            dx8 dx8Var3 = zk9Var.F;
            dx8 dx8Var4 = zk9Var.G;
            List list24 = zk9Var.H;
            dx8 dx8Var5 = zk9Var.I;
            dx8 dx8Var6 = zk9Var.J;
            qv9 qv9Var = zk9Var.K;
            List list25 = zk9Var.L;
            sq8 sq8Var = zk9Var.M;
            un8 un8Var = zk9Var.N;
            un8 un8Var2 = zk9Var.O;
            List list26 = zk9Var.P;
            List list27 = zk9Var.Q;
            List list28 = zk9Var.R;
            szb szbVar16 = zk9Var.S;
            l1a l1aVar = zk9Var.T;
            List list29 = zk9Var.U;
            bk9 bk9Var3 = zk9Var.V;
            zk9Var.getClass();
            return new nb8(new zk9(tc8Var2, szbVar7, szbVar8, szbVar9, list17, list18, op8Var2, szbVar10, list19, list20, wz8Var2, list21, bk9Var2, str, szbVar11, w79Var, ix8Var, szbVar12, szbVar13, ix8Var2, list22, szbVar14, szbVar15, tc8Var3, list23, dx8Var, yk9Var, str3, dx8Var2, yk9Var2, str4, dx8Var3, dx8Var4, list24, dx8Var5, dx8Var6, qv9Var, list25, sq8Var, un8Var, un8Var2, list26, list27, list28, szbVar16, l1aVar, list29, bk9Var3));
        }
        if (jc8Var instanceof jb8) {
            l49 l49Var = ((jb8) jc8Var).c;
            tc8 tc8Var4 = l49Var.a;
            szb szbVar17 = l49Var.b;
            szb szbVar18 = l49Var.c;
            szb szbVar19 = l49Var.d;
            List list30 = l49Var.e;
            szb szbVar20 = l49Var.f;
            List list31 = l49Var.g;
            op8 op8Var3 = l49Var.h;
            szb szbVar21 = l49Var.i;
            List list32 = l49Var.j;
            List list33 = l49Var.k;
            szb szbVar22 = l49Var.l;
            List list34 = l49Var.m;
            List list35 = l49Var.n;
            wz8 wz8Var3 = l49Var.o;
            szb szbVar23 = l49Var.p;
            szb szbVar24 = l49Var.q;
            szb szbVar25 = l49Var.r;
            szb szbVar26 = l49Var.s;
            szb szbVar27 = l49Var.t;
            szb szbVar28 = l49Var.u;
            List list36 = l49Var.v;
            bk9 bk9Var4 = l49Var.w;
            szb szbVar29 = l49Var.x;
            szb szbVar30 = l49Var.y;
            szb szbVar31 = l49Var.z;
            szb szbVar32 = l49Var.B;
            szb szbVar33 = l49Var.C;
            w79 w79Var2 = l49Var.D;
            szb szbVar34 = l49Var.E;
            szb szbVar35 = l49Var.F;
            ix8 ix8Var3 = l49Var.G;
            v59 v59Var = l49Var.H;
            szb szbVar36 = l49Var.I;
            szb szbVar37 = l49Var.J;
            k49 k49Var = l49Var.K;
            ix8 ix8Var4 = l49Var.L;
            szb szbVar38 = l49Var.M;
            szb szbVar39 = l49Var.N;
            szb szbVar40 = l49Var.O;
            List list37 = l49Var.P;
            szb szbVar41 = l49Var.Q;
            szb szbVar42 = l49Var.R;
            szb szbVar43 = l49Var.S;
            String str5 = l49Var.T;
            List list38 = l49Var.U;
            qv9 qv9Var2 = l49Var.V;
            List list39 = l49Var.W;
            sq8 sq8Var2 = l49Var.X;
            un8 un8Var3 = l49Var.Y;
            un8 un8Var4 = l49Var.Z;
            List list40 = l49Var.a0;
            List list41 = l49Var.b0;
            List list42 = l49Var.c0;
            List list43 = l49Var.d0;
            szb szbVar44 = l49Var.e0;
            l1a l1aVar2 = l49Var.f0;
            List list44 = l49Var.g0;
            bk9 bk9Var5 = l49Var.h0;
            l49Var.getClass();
            return new jb8(new l49(tc8Var4, szbVar17, szbVar18, szbVar19, list30, szbVar20, list31, op8Var3, szbVar21, list32, list33, szbVar22, list34, list35, wz8Var3, szbVar23, szbVar24, szbVar25, szbVar26, szbVar27, szbVar28, list36, bk9Var4, szbVar29, szbVar30, szbVar31, str, szbVar32, szbVar33, w79Var2, szbVar34, szbVar35, ix8Var3, v59Var, szbVar36, szbVar37, k49Var, ix8Var4, szbVar38, szbVar39, szbVar40, list37, szbVar41, szbVar42, szbVar43, str5, list38, qv9Var2, list39, sq8Var2, un8Var3, un8Var4, list40, list41, list42, list43, szbVar44, l1aVar2, list44, bk9Var5));
        }
        if (jc8Var instanceof lb8) {
            ei9 ei9Var = ((lb8) jc8Var).c;
            tc8 tc8Var5 = ei9Var.a;
            szb szbVar45 = ei9Var.b;
            szb szbVar46 = ei9Var.c;
            szb szbVar47 = ei9Var.d;
            List list45 = ei9Var.e;
            List list46 = ei9Var.f;
            op8 op8Var4 = ei9Var.g;
            szb szbVar48 = ei9Var.h;
            List list47 = ei9Var.i;
            List list48 = ei9Var.j;
            wz8 wz8Var4 = ei9Var.k;
            szb szbVar49 = ei9Var.l;
            szb szbVar50 = ei9Var.m;
            szb szbVar51 = ei9Var.n;
            szb szbVar52 = ei9Var.o;
            szb szbVar53 = ei9Var.p;
            szb szbVar54 = ei9Var.q;
            List list49 = ei9Var.r;
            bk9 bk9Var6 = ei9Var.s;
            szb szbVar55 = ei9Var.t;
            szb szbVar56 = ei9Var.u;
            w79 w79Var3 = ei9Var.w;
            szb szbVar57 = ei9Var.x;
            szb szbVar58 = ei9Var.y;
            ix8 ix8Var5 = ei9Var.z;
            List list50 = ei9Var.A;
            ix8 ix8Var6 = ei9Var.B;
            szb szbVar59 = ei9Var.C;
            szb szbVar60 = ei9Var.D;
            List list51 = ei9Var.E;
            szb szbVar61 = ei9Var.F;
            List list52 = ei9Var.G;
            qv9 qv9Var3 = ei9Var.H;
            List list53 = ei9Var.I;
            sq8 sq8Var3 = ei9Var.J;
            un8 un8Var5 = ei9Var.K;
            un8 un8Var6 = ei9Var.L;
            List list54 = ei9Var.M;
            String str6 = ei9Var.N;
            List list55 = ei9Var.O;
            List list56 = ei9Var.P;
            szb szbVar62 = ei9Var.Q;
            l1a l1aVar3 = ei9Var.R;
            List list57 = ei9Var.S;
            bk9 bk9Var7 = ei9Var.T;
            ei9Var.getClass();
            return new lb8(new ei9(tc8Var5, szbVar45, szbVar46, szbVar47, list45, list46, op8Var4, szbVar48, list47, list48, wz8Var4, szbVar49, szbVar50, szbVar51, szbVar52, szbVar53, szbVar54, list49, bk9Var6, szbVar55, szbVar56, str, w79Var3, szbVar57, szbVar58, ix8Var5, list50, ix8Var6, szbVar59, szbVar60, list51, szbVar61, list52, qv9Var3, list53, sq8Var3, un8Var5, un8Var6, list54, str6, list55, list56, szbVar62, l1aVar3, list57, bk9Var7));
        }
        if (!(jc8Var instanceof sb8)) {
            if (!(jc8Var instanceof pb8)) {
                b6e.s();
                return null;
            }
            jo9 jo9Var = ((pb8) jc8Var).c;
            tc8 tc8Var6 = jo9Var.a;
            szb szbVar63 = jo9Var.b;
            szb szbVar64 = jo9Var.c;
            szb szbVar65 = jo9Var.d;
            List list58 = jo9Var.e;
            List list59 = jo9Var.f;
            op8 op8Var5 = jo9Var.g;
            szb szbVar66 = jo9Var.h;
            List list60 = jo9Var.i;
            List list61 = jo9Var.j;
            wz8 wz8Var5 = jo9Var.k;
            List list62 = jo9Var.l;
            bk9 bk9Var8 = jo9Var.m;
            szb szbVar67 = jo9Var.o;
            String str7 = jo9Var.p;
            w79 w79Var4 = jo9Var.q;
            ix8 ix8Var7 = jo9Var.r;
            szb szbVar68 = jo9Var.s;
            ix8 ix8Var8 = jo9Var.t;
            szb szbVar69 = jo9Var.u;
            szb szbVar70 = jo9Var.v;
            List list63 = jo9Var.w;
            List list64 = jo9Var.x;
            qv9 qv9Var4 = jo9Var.y;
            List list65 = jo9Var.z;
            sq8 sq8Var4 = jo9Var.A;
            un8 un8Var7 = jo9Var.B;
            un8 un8Var8 = jo9Var.C;
            List list66 = jo9Var.D;
            List list67 = jo9Var.E;
            List list68 = jo9Var.F;
            szb szbVar71 = jo9Var.G;
            l1a l1aVar4 = jo9Var.H;
            List list69 = jo9Var.I;
            bk9 bk9Var9 = jo9Var.J;
            jo9Var.getClass();
            return new pb8(new jo9(tc8Var6, szbVar63, szbVar64, szbVar65, list58, list59, op8Var5, szbVar66, list60, list61, wz8Var5, list62, bk9Var8, str, szbVar67, str7, w79Var4, ix8Var7, szbVar68, ix8Var8, szbVar69, szbVar70, list63, list64, qv9Var4, list65, sq8Var4, un8Var7, un8Var8, list66, list67, list68, szbVar71, l1aVar4, list69, bk9Var9));
        }
        pz9 pz9Var = ((sb8) jc8Var).c;
        tc8 tc8Var7 = pz9Var.a;
        szb szbVar72 = pz9Var.b;
        szb szbVar73 = pz9Var.c;
        szb szbVar74 = pz9Var.d;
        List list70 = pz9Var.e;
        do8 do8Var = pz9Var.f;
        szb szbVar75 = pz9Var.g;
        List list71 = pz9Var.h;
        op8 op8Var6 = pz9Var.i;
        List list72 = pz9Var.j;
        szb szbVar76 = pz9Var.k;
        List list73 = pz9Var.l;
        String str8 = pz9Var.m;
        List list74 = pz9Var.n;
        List list75 = pz9Var.o;
        List list76 = pz9Var.p;
        wz8 wz8Var6 = pz9Var.q;
        List list77 = pz9Var.r;
        bk9 bk9Var10 = pz9Var.s;
        w79 w79Var5 = pz9Var.u;
        ix8 ix8Var9 = pz9Var.v;
        szb szbVar77 = pz9Var.w;
        ix8 ix8Var10 = pz9Var.x;
        List list78 = pz9Var.y;
        szb szbVar78 = pz9Var.z;
        szb szbVar79 = pz9Var.A;
        szb szbVar80 = pz9Var.B;
        szb szbVar81 = pz9Var.C;
        List list79 = pz9Var.D;
        szb szbVar82 = pz9Var.E;
        szb szbVar83 = pz9Var.F;
        szb szbVar84 = pz9Var.G;
        List list80 = pz9Var.H;
        List list81 = pz9Var.I;
        qv9 qv9Var5 = pz9Var.J;
        List list82 = pz9Var.K;
        sq8 sq8Var5 = pz9Var.L;
        un8 un8Var9 = pz9Var.M;
        un8 un8Var10 = pz9Var.N;
        List list83 = pz9Var.O;
        List list84 = pz9Var.P;
        List list85 = pz9Var.Q;
        List list86 = pz9Var.R;
        szb szbVar85 = pz9Var.S;
        l1a l1aVar5 = pz9Var.T;
        List list87 = pz9Var.U;
        bk9 bk9Var11 = pz9Var.V;
        pz9Var.getClass();
        return new sb8(new pz9(tc8Var7, szbVar72, szbVar73, szbVar74, list70, do8Var, szbVar75, list71, op8Var6, list72, szbVar76, list73, str8, list74, list75, list76, wz8Var6, list77, bk9Var10, str, w79Var5, ix8Var9, szbVar77, ix8Var10, list78, szbVar78, szbVar79, szbVar80, szbVar81, list79, szbVar82, szbVar83, szbVar84, list80, list81, qv9Var5, list82, sq8Var5, un8Var9, un8Var10, list83, list84, list85, list86, szbVar85, l1aVar5, list87, bk9Var11));
    }

    public static /* synthetic */ jc8 J(jc8 jc8Var) {
        return I(jc8Var, jc8Var.d().getId());
    }

    public static boolean K(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return K(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Boolean N(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static Pair O(String str) {
        String str2;
        int i;
        if (bp6.a.contains(qwp.class)) {
            return null;
        }
        try {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || str.length() <= (i = indexOf + 1)) {
                str2 = null;
            } else {
                str2 = str.substring(0, indexOf);
                str = str.substring(i);
            }
            return new Pair(str2, str);
        } catch (Throwable th) {
            bp6.a(qwp.class, th);
            return null;
        }
    }

    public static Type P(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return P(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return P(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final xzb Q(pr8 pr8Var, Object obj, int i, xzb xzbVar) {
        zzb zzbVar = xzbVar instanceof zzb ? (zzb) xzbVar : null;
        if (zzbVar == null) {
            return xzbVar;
        }
        JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
        if (jSONObject == null) {
            dfb dfbVar = zzbVar.f;
            z7k z7kVar = a8k.a;
            StringBuilder q = k5r.q(i, "Item builder data at ", " position has wrong type: ");
            q.append(obj.getClass().getName());
            dfbVar.d(new z7k(b8k.d, q.toString(), null, null, null, 28));
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(':');
        sb.append(i);
        String sb2 = sb.toString();
        rjo rjoVar = zzbVar.c;
        String e2 = zzbVar.e(sb2);
        gr4 gr4Var = new gr4(pr8Var, jSONObject, i, zzbVar, sb2);
        LinkedHashMap linkedHashMap = rjoVar.i;
        Object obj2 = linkedHashMap.get(e2);
        if (obj2 == null) {
            obj2 = (xzb) gr4Var.invoke();
            linkedHashMap.put(e2, obj2);
        }
        return (xzb) obj2;
    }

    public static List R(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List S(String str, Map map) {
        List R = R(str, map);
        if (R == null) {
            return null;
        }
        for (int i = 0; i < R.size(); i++) {
            if (!(R.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", R.get(i), Integer.valueOf(i), R));
            }
        }
        return R;
    }

    public static Double T(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            b6e.p("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            b6e.p("value '%s' for key '%s' is not a double", new Object[]{obj, str});
            return null;
        }
    }

    public static Integer U(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                b6e.p("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                b6e.p("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
                return null;
            }
        }
        Double d2 = (Double) obj;
        int intValue = d2.intValue();
        if (intValue == d2.doubleValue()) {
            return Integer.valueOf(intValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d2);
    }

    public static Map V(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static Class W(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            vwb.K(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) W(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return W(((WildcardType) type).getUpperBounds()[0]);
        }
        wvs.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static String X(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static Long Y(String str, Map map) {
        String X = X(str, map);
        if (X == null) {
            return null;
        }
        try {
            return Long.valueOf(i0(X));
        } catch (ParseException e2) {
            b6e.q(e2);
            return null;
        }
    }

    public static final ges Z(ve4 ve4Var, hq5 hq5Var) {
        ue4 ue4Var = ve4Var.d;
        if (ue4Var == ue4.a && ve4Var.a != null) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(1578123243);
            ges e2 = nu0.e();
            oq5Var.p(false);
            return e2;
        }
        if (ue4Var != ue4.b || ve4Var.b == null) {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(1852029555);
            ges j = nu0.j();
            oq5Var2.p(false);
            return j;
        }
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.Z(1578263115);
        ges c2 = nu0.c();
        oq5Var3.p(false);
        return c2;
    }

    public static final void a(b81 b81Var, ArrayList arrayList, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(141097284);
        int i2 = i | (oq5Var.d(b81Var.ordinal()) ? 4 : 2) | (oq5Var.f(arrayList) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | 3072;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            vci vciVar = vci.a;
            yci a2 = b.a(d.d(vciVar, 1.0f), null, 3);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z = arrayList.size() > 1;
            iz2 iz2Var2 = b2c.c;
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            etn.f(z, bVar.a(vciVar, iz2Var2), c.e(null, 3).a(c.k(3, null)), c.f(null, 3).a(c.m()), null, ild.C(-693090654, new xk(8, b81Var, arrayList, function1), oq5Var), oq5Var, 200064, 16);
            etn.f(!z, bVar.a(vciVar, iz2Var), c.e(null, 3).a(c.k(3, null)), c.f(null, 3).a(c.m()), null, ild.C(920582617, new u2(11, b81Var), oq5Var), oq5Var, 200064, 16);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i, 12, b81Var, arrayList, function1, yciVar2);
        }
    }

    public static final yci a0(int i, hq5 hq5Var) {
        int i2 = (i & 1) != 0 ? 0 : 350;
        oq5 oq5Var = (oq5) hq5Var;
        float Q = ff7.Q(((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenHeightDp, oq5Var);
        boolean c2 = oq5Var.c(Q);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (c2 || K == kjnVar) {
            K = Float.valueOf(Q * 0.1f);
            oq5Var.k0(K);
        }
        float floatValue = ((Number) K).floatValue();
        wje s = fgq.s(fgq.D("infinite transition", oq5Var, 0), 0.0f, 1.0f, weo.C(new act(ScreenMirroringConfig.Test.pcVideoUdpPort, i2, lya.c), jyn.b, 0L, 4), "balloon infinite transition animation", oq5Var, 29112, 0);
        boolean f2 = oq5Var.f(s) | oq5Var.c(floatValue);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            K2 = new kz4(floatValue, s, 2);
            oq5Var.k0(K2);
        }
        return androidx.compose.ui.graphics.a.a(vci.a, (Function1) K2);
    }

    public static final void b(fvf fvfVar, o0k o0kVar, ez1 ez1Var, dz1 dz1Var, hq5 hq5Var, int i) {
        int i2;
        fvfVar.getClass();
        o0kVar.getClass();
        dz1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1970843835);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(fvfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(ez1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(dz1Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.Q(dz1Var.h, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(dz1Var);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                oi1 oi1Var = new oi1(0, dz1Var, dz1.class, "onRefresh", "onRefresh()V", 0, 12);
                oq5Var.k0(oi1Var);
                K = oi1Var;
            }
            bfg.f(booleanValue, (Function0) ((h9f) K), o0kVar, null, false, ild.C(1812234949, new wl(fvfVar, o0kVar, ez1Var, dz1Var, 19), oq5Var), oq5Var, ((i3 << 3) & 896) | 196608, 24);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(fvfVar, o0kVar, ez1Var, dz1Var, i, 9);
        }
    }

    public static Intent b0(Context context, List list, boolean z) {
        list.getClass();
        Intent putExtras = new Intent(context, (Class<?>) EmptyScreenInDeeplinkActivity.class).putExtras(cxb.K(new kotlin.Pair("wave.seeds", new ArrayList(list)), new kotlin.Pair("open.player", Boolean.valueOf(z))));
        putExtras.getClass();
        return putExtras;
    }

    public static final void c(ArrayList arrayList, v83 v83Var, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        v83Var.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1808920614);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(v83Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i2 >> 6) & 14) | ((i2 << 3) & 112));
            boolean f2 = oq5Var.f(arrayList);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            Object obj = K;
            if (f2 || K == kjnVar) {
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((gdj) it.next()).a);
                }
                oq5Var.k0(arrayList2);
                obj = arrayList2;
            }
            List list = (List) obj;
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.a(0.0f, 16, 1));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "chapters_list");
            boolean h = oq5Var.h(arrayList) | oq5Var.h(v83Var) | oq5Var.h(list);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new g3(14, arrayList, v83Var, list);
                oq5Var.k0(K2);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K2, oq5Var, ((i2 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(i, 12, arrayList, v83Var, fvfVar, o0kVar);
        }
    }

    public static final ArrayList c0(vo9 vo9Var, xzb xzbVar) {
        List list = vo9Var.q;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new k79(((ro9) it.next()).a, xzbVar));
        }
        return arrayList;
    }

    public static final void d(List list, um0 um0Var, Locale locale, d85 d85Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        list.getClass();
        um0Var.getClass();
        locale.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-85056008);
        if ((i & 48) == 0) {
            i2 = ((i & 64) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.d(um0Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(locale) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(d85Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i2 & 74897) == 74896 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bg3.a(d.x(yciVar, null, 3), null, false, ild.C(-1524089118, new up(list, um0Var, locale, d85Var, 10), oq5Var), oq5Var, 3072, 6);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 6, list, um0Var, locale, d85Var, yciVar);
        }
    }

    public static ood d0(ja jaVar, Uri uri, ibv ibvVar) {
        if (bp6.a.contains(qwp.class)) {
            return null;
        }
        if (uri != null) {
            try {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return e0(jaVar, new File(uri.getPath()), ibvVar);
                }
            } catch (Throwable th) {
                bp6.a(qwp.class, th);
                return null;
            }
        }
        if (uri == null || !"content".equalsIgnoreCase(uri.getScheme())) {
            throw new c3c("The image Uri must be either a file:// or content:// Uri");
        }
        nod nodVar = new nod(uri);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", nodVar);
        return new ood(jaVar, "me/staging_resources", bundle, z6e.b, ibvVar, 0);
    }

    public static final void e(ve4 ve4Var, int i, int i2, um0 um0Var, Locale locale, d85 d85Var, hq5 hq5Var, int i3) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2013997733);
        int i4 = i3 | (oq5Var.f(ve4Var) ? 4 : 2) | (oq5Var.d(i) ? 32 : 16) | (oq5Var.d(i2) ? 256 : 128) | (oq5Var.d(um0Var.ordinal()) ? 2048 : 1024) | (oq5Var.h(locale) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(d85Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            f(ve4Var, 0.0f, oq5Var, (i4 & 14) | 48);
            g(ve4Var, i, i2, um0Var, locale, d85Var, oq5Var, 524286 & i4);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ye4(ve4Var, i, i2, um0Var, locale, d85Var, i3, 0);
        }
    }

    public static ood e0(ja jaVar, File file, ibv ibvVar) {
        if (bp6.a.contains(qwp.class)) {
            return null;
        }
        try {
            nod nodVar = new nod(ParcelFileDescriptor.open(file, 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", nodVar);
            return new ood(jaVar, "me/staging_resources", bundle, z6e.b, ibvVar, 0);
        } catch (Throwable th) {
            bp6.a(qwp.class, th);
            return null;
        }
    }

    public static final void f(ve4 ve4Var, float f2, hq5 hq5Var, int i) {
        yci u;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1654708858);
        if ((((oq5Var.f(ve4Var) ? 4 : 2) | i | 3456) & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            f2 = 80;
            String str = ve4Var.e;
            etq etqVar = ve4Var.f;
            htq htqVar = new htq(etqVar);
            vci vciVar = vci.a;
            yci m = d.m(vciVar, f2);
            if (etqVar == etq.b) {
                oq5Var.Z(-2091514821);
                u = if4.b(1.0f, ((dq0) oq5Var.j(eq0.a)).c.a, true);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-2091259412);
                oq5Var.p(false);
                u = xp3.u(vciVar, ugo.a(10));
            }
            ocg.e(str, htqVar, m.f(u), null, oq5Var, 0, 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ze4(ve4Var, f2, i, 0);
        }
    }

    public static long f0(int i, long j) {
        long j2 = i;
        if (j2 <= -1000000000 || j2 >= 1000000000) {
            j = bzf.x(j, j2 / 1000000000);
            i = (int) (j2 % 1000000000);
        }
        if (j > 0 && i < 0) {
            i = (int) (i + 1000000000);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (i - 1000000000);
            j++;
        }
        if (j >= -315576000000L && j <= 315576000000L) {
            long j3 = i;
            if (j3 >= -999999999 && j3 < 1000000000 && ((j >= 0 && i >= 0) || (j <= 0 && i <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j);
                long j4 = i;
                long j5 = nanos + j4;
                return (((j4 ^ nanos) > 0L ? 1 : ((j4 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j5) >= 0) ? j5 : ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static final void g(ve4 ve4Var, int i, int i2, um0 um0Var, Locale locale, d85 d85Var, hq5 hq5Var, int i3) {
        long j;
        int i4;
        long j2;
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1744582126);
        int i6 = i3 | (oq5Var.f(ve4Var) ? 4 : 2) | (oq5Var.d(i) ? 32 : 16) | (oq5Var.d(i2) ? 256 : 128) | (oq5Var.d(um0Var.ordinal()) ? 2048 : 1024) | (oq5Var.h(locale) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(d85Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((599187 & i6) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
            ta5 a2 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i7 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (d85Var != null) {
                j = d85Var.a;
            } else {
                oq5Var.Z(-340372765);
                j = ((dq0) oq5Var.j(eq0.a)).b.a;
                oq5Var.p(false);
            }
            String str = ve4Var.b;
            Long l2 = ve4Var.a;
            ue4 ue4Var = ve4Var.d;
            if (ue4Var != ue4.a || l2 == null) {
                i4 = i6;
                j2 = j;
                i5 = -1967468186;
                if (ue4Var != ue4.b || str == null) {
                    oq5Var.Z(-1967468186);
                } else {
                    oq5Var.Z(-1960964293);
                    xv7.j(str, vciVar, j2, 0L, 0L, 0, 0L, 2, false, 2, 0, null, Z(ve4Var, oq5Var), oq5Var, 0, 3120, 55288);
                    j2 = j2;
                    oq5Var = oq5Var;
                }
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1961386668);
                int i8 = ((i6 >> 9) & 112) | ((i6 << 3) & 57344);
                j2 = j;
                i4 = i6;
                i5 = -1967468186;
                ldr.a(l2.longValue(), locale, null, null, um0Var, new d85(j), 0, 0, Z(ve4Var, oq5Var), oq5Var, i8, 204);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            vm0 b2 = fn0.b(i, 0.0f, um0Var, oq5Var, (i4 >> 3) & 910, 2);
            String str2 = ve4Var.c;
            if (str2 != null) {
                oq5Var.Z(-1960224757);
                boolean f2 = oq5Var.f(b2);
                Object K = oq5Var.K();
                if (f2 || K == gq5.a) {
                    K = new la1(b2, 13);
                    oq5Var.k0(K);
                }
                oq5 oq5Var2 = oq5Var;
                xv7.j(str2, wyf.s(vciVar, (Function0) K), j2, 0L, 0L, 0, 0L, 2, false, i2, 0, null, nu0.j(), oq5Var2, 0, ((i4 << 3) & 7168) | 48, 55288);
                oq5Var = oq5Var2;
            } else {
                oq5Var.Z(i5);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ye4(ve4Var, i, i2, um0Var, locale, d85Var, i3, 1);
        }
    }

    public static zvd g0(String... strArr) {
        if (strArr.length % 2 != 0) {
            xq0.x("Expected alternating header names and values");
            return null;
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str == null) {
                xq0.x("Headers cannot be null");
                return null;
            }
            strArr2[i2] = StringsKt.t0(str).toString();
        }
        int s = hag.s(0, strArr2.length - 1, 2);
        if (s >= 0) {
            while (true) {
                String str2 = strArr2[i];
                String str3 = strArr2[i + 1];
                D(str2);
                G(str3, str2);
                if (i == s) {
                    break;
                }
                i += 2;
            }
        }
        return new zvd(strArr2);
    }

    public static final void h(k65 k65Var, hq5 hq5Var, int i) {
        fvf fvfVar;
        l65 l65Var;
        k65Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(49944813);
        int i2 = (oq5Var.h(k65Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            l65 l65Var2 = (l65) gld.M(k65Var.f, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, ((Boolean) gld.M(k65Var.g, oq5Var).getValue()).booleanValue(), null, oq5Var, 4096, 5);
            String M = rvf.M(R.string.video_clips, oq5Var);
            boolean h = oq5Var.h(k65Var);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                fvfVar = a2;
                l65Var = l65Var2;
                e65 e65Var = new e65(0, k65Var, k65.class, "onBackClick", "onBackClick()V", 0, 0);
                oq5Var.k0(e65Var);
                K = e65Var;
            } else {
                l65Var = l65Var2;
                fvfVar = a2;
            }
            xp3.d(M, fvfVar, null, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var)), (Function0) ((h9f) K), ild.C(1795973739, new u2(27, k65Var), oq5Var), false, false, null, null, null, ild.C(-483838173, new xk(20, l65Var, fvfVar, k65Var), oq5Var), oq5Var, 196608, 48, 1988);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d65(k65Var, i);
        }
    }

    public static final int h0(lsf lsfVar, bxj bxjVar) {
        return (int) (bxjVar == bxj.a ? lsfVar.t & 4294967295L : lsfVar.t >> 32);
    }

    public static final void i(ct5 ct5Var, Function0 function0, boolean z, yci yciVar, hq5 hq5Var, int i) {
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1228485663);
        int i2 = (oq5Var.h(ct5Var) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            yci e2 = androidx.compose.foundation.a.e(xp3.u(yciVar, y9w.b), false, null, null, function0, 7);
            function02 = function0;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || oq5Var.h(ct5Var);
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new at5(0, ct5Var);
                oq5Var.k0(K);
            }
            yci a2 = nfp.a(e2, (Function1) K);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            int i5 = ((i2 >> 3) & 112) | i3 | 392;
            s(ct5Var, z, d.d(vciVar, 1.0f), oq5Var, i5);
            u1g.l(oq5Var, d.e(vciVar, ku5.a));
            m(ct5Var, z, d.d(vciVar, 1.0f), oq5Var, i5);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s43((Object) ct5Var, (Object) function02, z, yciVar, i, 6);
        }
    }

    public static long i0(String str) {
        boolean z;
        String str2;
        int i;
        if (str.isEmpty() || str.charAt(str.length() - 1) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String d2 = f1d.d(1, 0, str);
        int indexOf = d2.indexOf(46);
        if (indexOf != -1) {
            str2 = d2.substring(indexOf + 1);
            d2 = d2.substring(0, indexOf);
        } else {
            str2 = "";
        }
        long parseLong = Long.parseLong(d2);
        if (str2.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < 9; i2++) {
                i *= 10;
                if (i2 < str2.length()) {
                    if (str2.charAt(i2) < '0' || str2.charAt(i2) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    i = (str2.charAt(i2) - '0') + i;
                }
            }
        }
        if (parseLong < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            parseLong = -parseLong;
            i = -i;
        }
        try {
            return f0(i, parseLong);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }

    public static final void j(int i, int i2, hq5 hq5Var, yci yciVar) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-944884119);
        if ((((oq5Var.d(i) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            jf0.a(new qzm[0], null, true, ild.C(479340273, new jm0(yciVar, i, 3), oq5Var), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jm0(i, yciVar, i2, 4);
        }
    }

    public static u2i j0(s2c s2cVar, boolean z) {
        b6e b6eVar = z ? null : pae.b;
        d7k d7kVar = new d7k(10);
        u2i u2iVar = null;
        int i = 0;
        while (true) {
            try {
                s2cVar.A(d7kVar.a, 0, 10);
                d7kVar.H(0);
                if (d7kVar.y() != 4801587) {
                    break;
                }
                d7kVar.I(3);
                int u = d7kVar.u();
                int i2 = u + 10;
                if (u2iVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(d7kVar.a, 0, bArr, 0, 10);
                    s2cVar.A(bArr, 10, u);
                    u2iVar = new pae(b6eVar).g0(i2, bArr);
                } else {
                    s2cVar.u(u);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        s2cVar.n();
        s2cVar.u(i);
        if (u2iVar == null || u2iVar.a.length == 0) {
            return null;
        }
        return u2iVar;
    }

    public static final void k(String str, String str2, String str3, String str4, yci yciVar, float f2, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var;
        float f3;
        eta.r(str, str2, str3, str4);
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-173222966);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(str2) ? 32 : 16) | (oq5Var2.f(str3) ? 256 : 128) | (oq5Var2.f(str4) ? 2048 : 1024) | 221184;
        if ((74899 & i2) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            f3 = f2;
            oq5Var = oq5Var2;
        } else {
            float f4 = 6;
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            ges j = nu0.j();
            ges d2 = nu0.d();
            ges j2 = nu0.j();
            float p = w1g.p(j2, 0, oq5Var2, 0, 2) + w1g.p(d2, 0, oq5Var2, 0, 2) + w1g.p(j, 0, oq5Var2, 0, 2) + 7;
            vci vciVar = vci.a;
            yci u = xp3.u(xp3.u(androidx.compose.foundation.layout.a.d(d.e(vciVar, p), 0.9f), klx.c), o5g.F(oq5Var2));
            agr agrVar = eq0.a;
            yci D = ksw.D(androidx.compose.foundation.a.b(u, d85.b(((dq0) oq5Var2.j(agrVar)).c.c, 0.08f, 0.0f, 0.0f, 0.0f, 14), vnj.i), str4, null);
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var2, 54);
            int i3 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, D);
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
            int i4 = i2 & 14;
            yciVar2 = vciVar;
            xcs.b(str, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, f4, 1), "concert_date_month"), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 1, false, 1, 0, null, j, oq5Var2, i4, 3120, 54776);
            xcs.b(str2, androidx.compose.ui.platform.a.a(yciVar2, "concert_date_day_of_month"), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, d2, oq5Var2, ((i2 >> 3) & 14) | 48, 3072, 57336);
            xcs.b(str3, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(yciVar2, 0.0f, -f4, 1), "concert_date_day_of_week"), ((dq0) oq5Var2.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, j2, oq5Var2, (i2 >> 6) & 14, 3072, 57336);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            f3 = f4;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bt5(str, str2, str3, str4, yciVar2, f3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final String str, final String str2, final String str3, final long j, final yci yciVar, float f2, boolean z, float f3, float f4, boolean z2, hq5 hq5Var, final int i, final int i2) {
        int i3;
        String str4;
        String str5;
        long j2;
        float f5;
        int i4;
        boolean z3;
        int i5;
        float f6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        final boolean z4;
        final boolean z5;
        final float f7;
        final float f8;
        final float f9;
        xmn r;
        dfi.s(str, str2, str3);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-556825145);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i3 |= oq5Var.f(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i3 |= oq5Var.f(str5) ? 256 : 128;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            j2 = j;
            i3 |= oq5Var.e(j2) ? 2048 : 1024;
        } else {
            j2 = j;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i11 = i2 & 32;
        if (i11 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            f5 = f2;
            i3 |= oq5Var.c(f5) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i) == 0) {
                z3 = z;
                i3 |= oq5Var.g(z3) ? 1048576 : 524288;
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    f6 = f3;
                    i3 |= oq5Var.c(f6) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    int i12 = i3;
                    i6 = i2 & 256;
                    if (i6 == 0) {
                        i8 = i12 | 100663296;
                        i7 = i6;
                    } else if ((i & 100663296) == 0) {
                        i7 = i6;
                        i8 = i12 | (oq5Var.c(f4) ? 67108864 : 33554432);
                    } else {
                        i7 = i6;
                        i8 = i12;
                    }
                    i9 = i2 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                    if (i9 == 0) {
                        i8 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i10 = i9;
                        i8 |= oq5Var.g(z2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        if ((i8 & 306783379) == 306783378 || !oq5Var.z()) {
                            final float f10 = i11 != 0 ? 0 : f5;
                            final boolean z6 = i4 != 0 ? true : z3;
                            final float f11 = i5 != 0 ? 0.2f : f6;
                            final float f12 = i7 != 0 ? 0.2f : f4;
                            boolean z7 = i10 == 0 ? z2 : true;
                            h6g h6gVar = nu0.a;
                            h6g h6gVar2 = h6g.c;
                            final ges j3 = nu0.j();
                            final ges d2 = nu0.d();
                            final ges j4 = nu0.j();
                            final String str6 = str4;
                            final String str7 = str5;
                            final long j5 = j2;
                            boolean z8 = z7;
                            jf0.a(new qzm[0], null, z8, ild.C(-970336705, new Function2() { // from class: ys5
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
                                    ges gesVar = j3;
                                    float p = w1g.p(gesVar, 0, hq5Var2, 0, 2);
                                    ges gesVar2 = d2;
                                    float p2 = w1g.p(gesVar2, 0, hq5Var2, 0, 2) + p;
                                    ges gesVar3 = j4;
                                    yci u = xp3.u(androidx.compose.foundation.layout.a.d(d.e(yci.this, w1g.p(gesVar3, 0, hq5Var2, 0, 2) + p2 + 12), 0.82f), o5g.F(hq5Var2));
                                    boolean z9 = z6;
                                    long j6 = j5;
                                    if (z9) {
                                        p85 b0 = pd.b0(j6);
                                        int i13 = d85.o;
                                        float f13 = b0.a;
                                        float f14 = b0.b;
                                        float f15 = b0.c;
                                        j6 = mvt.z(f13, f14, ((double) f15) <= 0.55d ? f15 + f11 : f15 - f12, 0.0f, 24);
                                    }
                                    yci b2 = androidx.compose.foundation.a.b(u, j6, vnj.i);
                                    ta5 a2 = sa5.a(qx0.e, b2c.o, hq5Var2, 54);
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    int i14 = oq5Var3.P;
                                    a l = oq5Var3.l();
                                    yci H = vnj.H(hq5Var2, b2);
                                    xp5.T.getClass();
                                    grb grbVar = wp5.b;
                                    oq5Var3.d0();
                                    if (oq5Var3.O) {
                                        oq5Var3.k(grbVar);
                                    } else {
                                        oq5Var3.n0();
                                    }
                                    g0g.U(hq5Var2, a2, wp5.f);
                                    g0g.U(hq5Var2, l, wp5.e);
                                    kb5 kb5Var = wp5.g;
                                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                                        ouj.x(i14, oq5Var3, i14, kb5Var);
                                    }
                                    g0g.U(hq5Var2, H, wp5.d);
                                    vci vciVar = vci.a;
                                    float f16 = f10;
                                    yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, f16, 1), "month");
                                    agr agrVar = eq0.a;
                                    oq5 oq5Var4 = (oq5) hq5Var2;
                                    xcs.b(str, a3, ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 1, false, 1, 0, null, gesVar, hq5Var2, 0, 3120, 54776);
                                    xcs.b(str6, androidx.compose.ui.platform.a.a(vciVar, "day_of_month"), ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar2, hq5Var2, 48, 0, 65528);
                                    xcs.b(str7, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, -f16, 1), "day_of_week"), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar3, hq5Var2, 0, 0, 65528);
                                    oq5Var3.p(true);
                                    return Unit.a;
                                }
                            }, oq5Var), oq5Var, 3072, 2);
                            z4 = z8;
                            z5 = z6;
                            f7 = f11;
                            f8 = f12;
                            f9 = f10;
                        } else {
                            oq5Var.S();
                            z4 = z2;
                            f9 = f5;
                            z5 = z3;
                            f7 = f6;
                            f8 = f4;
                        }
                        r = oq5Var.r();
                        if (r != null) {
                            r.d = new Function2() { // from class: zs5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    qwp.l(str, str2, str3, j, yciVar, f9, z5, f7, f8, z4, (hq5) obj, rvf.R(i | 1), i2);
                                    return Unit.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i10 = i9;
                    if ((i8 & 306783379) == 306783378) {
                    }
                    if (i11 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    h6g h6gVar3 = nu0.a;
                    h6g h6gVar22 = h6g.c;
                    final ges j32 = nu0.j();
                    final ges d22 = nu0.d();
                    final ges j42 = nu0.j();
                    final String str62 = str4;
                    final String str72 = str5;
                    final long j52 = j2;
                    boolean z82 = z7;
                    jf0.a(new qzm[0], null, z82, ild.C(-970336705, new Function2() { // from class: ys5
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
                            ges gesVar = j32;
                            float p = w1g.p(gesVar, 0, hq5Var2, 0, 2);
                            ges gesVar2 = d22;
                            float p2 = w1g.p(gesVar2, 0, hq5Var2, 0, 2) + p;
                            ges gesVar3 = j42;
                            yci u = xp3.u(androidx.compose.foundation.layout.a.d(d.e(yci.this, w1g.p(gesVar3, 0, hq5Var2, 0, 2) + p2 + 12), 0.82f), o5g.F(hq5Var2));
                            boolean z9 = z6;
                            long j6 = j52;
                            if (z9) {
                                p85 b0 = pd.b0(j6);
                                int i13 = d85.o;
                                float f13 = b0.a;
                                float f14 = b0.b;
                                float f15 = b0.c;
                                j6 = mvt.z(f13, f14, ((double) f15) <= 0.55d ? f15 + f11 : f15 - f12, 0.0f, 24);
                            }
                            yci b2 = androidx.compose.foundation.a.b(u, j6, vnj.i);
                            ta5 a2 = sa5.a(qx0.e, b2c.o, hq5Var2, 54);
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            int i14 = oq5Var3.P;
                            a l = oq5Var3.l();
                            yci H = vnj.H(hq5Var2, b2);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var3.d0();
                            if (oq5Var3.O) {
                                oq5Var3.k(grbVar);
                            } else {
                                oq5Var3.n0();
                            }
                            g0g.U(hq5Var2, a2, wp5.f);
                            g0g.U(hq5Var2, l, wp5.e);
                            kb5 kb5Var = wp5.g;
                            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                                ouj.x(i14, oq5Var3, i14, kb5Var);
                            }
                            g0g.U(hq5Var2, H, wp5.d);
                            vci vciVar = vci.a;
                            float f16 = f10;
                            yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, f16, 1), "month");
                            agr agrVar = eq0.a;
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            xcs.b(str, a3, ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 1, false, 1, 0, null, gesVar, hq5Var2, 0, 3120, 54776);
                            xcs.b(str62, androidx.compose.ui.platform.a.a(vciVar, "day_of_month"), ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar2, hq5Var2, 48, 0, 65528);
                            xcs.b(str72, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, -f16, 1), "day_of_week"), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar3, hq5Var2, 0, 0, 65528);
                            oq5Var3.p(true);
                            return Unit.a;
                        }
                    }, oq5Var), oq5Var, 3072, 2);
                    z4 = z82;
                    z5 = z6;
                    f7 = f11;
                    f8 = f12;
                    f9 = f10;
                    r = oq5Var.r();
                    if (r != null) {
                    }
                }
                f6 = f3;
                int i122 = i3;
                i6 = i2 & 256;
                if (i6 == 0) {
                }
                i9 = i2 & RemoteCameraConfig.Mic.BUFFER_SIZE;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i8 & 306783379) == 306783378) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                if (i10 == 0) {
                }
                h6g h6gVar32 = nu0.a;
                h6g h6gVar222 = h6g.c;
                final ges j322 = nu0.j();
                final ges d222 = nu0.d();
                final ges j422 = nu0.j();
                final String str622 = str4;
                final String str722 = str5;
                final long j522 = j2;
                boolean z822 = z7;
                jf0.a(new qzm[0], null, z822, ild.C(-970336705, new Function2() { // from class: ys5
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
                        ges gesVar = j322;
                        float p = w1g.p(gesVar, 0, hq5Var2, 0, 2);
                        ges gesVar2 = d222;
                        float p2 = w1g.p(gesVar2, 0, hq5Var2, 0, 2) + p;
                        ges gesVar3 = j422;
                        yci u = xp3.u(androidx.compose.foundation.layout.a.d(d.e(yci.this, w1g.p(gesVar3, 0, hq5Var2, 0, 2) + p2 + 12), 0.82f), o5g.F(hq5Var2));
                        boolean z9 = z6;
                        long j6 = j522;
                        if (z9) {
                            p85 b0 = pd.b0(j6);
                            int i13 = d85.o;
                            float f13 = b0.a;
                            float f14 = b0.b;
                            float f15 = b0.c;
                            j6 = mvt.z(f13, f14, ((double) f15) <= 0.55d ? f15 + f11 : f15 - f12, 0.0f, 24);
                        }
                        yci b2 = androidx.compose.foundation.a.b(u, j6, vnj.i);
                        ta5 a2 = sa5.a(qx0.e, b2c.o, hq5Var2, 54);
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        int i14 = oq5Var3.P;
                        a l = oq5Var3.l();
                        yci H = vnj.H(hq5Var2, b2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var3.d0();
                        if (oq5Var3.O) {
                            oq5Var3.k(grbVar);
                        } else {
                            oq5Var3.n0();
                        }
                        g0g.U(hq5Var2, a2, wp5.f);
                        g0g.U(hq5Var2, l, wp5.e);
                        kb5 kb5Var = wp5.g;
                        if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                            ouj.x(i14, oq5Var3, i14, kb5Var);
                        }
                        g0g.U(hq5Var2, H, wp5.d);
                        vci vciVar = vci.a;
                        float f16 = f10;
                        yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, f16, 1), "month");
                        agr agrVar = eq0.a;
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        xcs.b(str, a3, ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 1, false, 1, 0, null, gesVar, hq5Var2, 0, 3120, 54776);
                        xcs.b(str622, androidx.compose.ui.platform.a.a(vciVar, "day_of_month"), ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar2, hq5Var2, 48, 0, 65528);
                        xcs.b(str722, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, -f16, 1), "day_of_week"), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar3, hq5Var2, 0, 0, 65528);
                        oq5Var3.p(true);
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 3072, 2);
                z4 = z822;
                z5 = z6;
                f7 = f11;
                f8 = f12;
                f9 = f10;
                r = oq5Var.r();
                if (r != null) {
                }
            }
            z3 = z;
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            f6 = f3;
            int i1222 = i3;
            i6 = i2 & 256;
            if (i6 == 0) {
            }
            i9 = i2 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i8 & 306783379) == 306783378) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            if (i10 == 0) {
            }
            h6g h6gVar322 = nu0.a;
            h6g h6gVar2222 = h6g.c;
            final ges j3222 = nu0.j();
            final ges d2222 = nu0.d();
            final ges j4222 = nu0.j();
            final String str6222 = str4;
            final String str7222 = str5;
            final long j5222 = j2;
            boolean z8222 = z7;
            jf0.a(new qzm[0], null, z8222, ild.C(-970336705, new Function2() { // from class: ys5
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
                    ges gesVar = j3222;
                    float p = w1g.p(gesVar, 0, hq5Var2, 0, 2);
                    ges gesVar2 = d2222;
                    float p2 = w1g.p(gesVar2, 0, hq5Var2, 0, 2) + p;
                    ges gesVar3 = j4222;
                    yci u = xp3.u(androidx.compose.foundation.layout.a.d(d.e(yci.this, w1g.p(gesVar3, 0, hq5Var2, 0, 2) + p2 + 12), 0.82f), o5g.F(hq5Var2));
                    boolean z9 = z6;
                    long j6 = j5222;
                    if (z9) {
                        p85 b0 = pd.b0(j6);
                        int i13 = d85.o;
                        float f13 = b0.a;
                        float f14 = b0.b;
                        float f15 = b0.c;
                        j6 = mvt.z(f13, f14, ((double) f15) <= 0.55d ? f15 + f11 : f15 - f12, 0.0f, 24);
                    }
                    yci b2 = androidx.compose.foundation.a.b(u, j6, vnj.i);
                    ta5 a2 = sa5.a(qx0.e, b2c.o, hq5Var2, 54);
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    int i14 = oq5Var3.P;
                    a l = oq5Var3.l();
                    yci H = vnj.H(hq5Var2, b2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(hq5Var2, a2, wp5.f);
                    g0g.U(hq5Var2, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                        ouj.x(i14, oq5Var3, i14, kb5Var);
                    }
                    g0g.U(hq5Var2, H, wp5.d);
                    vci vciVar = vci.a;
                    float f16 = f10;
                    yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, f16, 1), "month");
                    agr agrVar = eq0.a;
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    xcs.b(str, a3, ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 1, false, 1, 0, null, gesVar, hq5Var2, 0, 3120, 54776);
                    xcs.b(str6222, androidx.compose.ui.platform.a.a(vciVar, "day_of_month"), ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar2, hq5Var2, 48, 0, 65528);
                    xcs.b(str7222, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, -f16, 1), "day_of_week"), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar3, hq5Var2, 0, 0, 65528);
                    oq5Var3.p(true);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 3072, 2);
            z4 = z8222;
            z5 = z6;
            f7 = f11;
            f8 = f12;
            f9 = f10;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        f5 = f2;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        f6 = f3;
        int i12222 = i3;
        i6 = i2 & 256;
        if (i6 == 0) {
        }
        i9 = i2 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i8 & 306783379) == 306783378) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        if (i10 == 0) {
        }
        h6g h6gVar3222 = nu0.a;
        h6g h6gVar22222 = h6g.c;
        final ges j32222 = nu0.j();
        final ges d22222 = nu0.d();
        final ges j42222 = nu0.j();
        final String str62222 = str4;
        final String str72222 = str5;
        final long j52222 = j2;
        boolean z82222 = z7;
        jf0.a(new qzm[0], null, z82222, ild.C(-970336705, new Function2() { // from class: ys5
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
                ges gesVar = j32222;
                float p = w1g.p(gesVar, 0, hq5Var2, 0, 2);
                ges gesVar2 = d22222;
                float p2 = w1g.p(gesVar2, 0, hq5Var2, 0, 2) + p;
                ges gesVar3 = j42222;
                yci u = xp3.u(androidx.compose.foundation.layout.a.d(d.e(yci.this, w1g.p(gesVar3, 0, hq5Var2, 0, 2) + p2 + 12), 0.82f), o5g.F(hq5Var2));
                boolean z9 = z6;
                long j6 = j52222;
                if (z9) {
                    p85 b0 = pd.b0(j6);
                    int i13 = d85.o;
                    float f13 = b0.a;
                    float f14 = b0.b;
                    float f15 = b0.c;
                    j6 = mvt.z(f13, f14, ((double) f15) <= 0.55d ? f15 + f11 : f15 - f12, 0.0f, 24);
                }
                yci b2 = androidx.compose.foundation.a.b(u, j6, vnj.i);
                ta5 a2 = sa5.a(qx0.e, b2c.o, hq5Var2, 54);
                oq5 oq5Var3 = (oq5) hq5Var2;
                int i14 = oq5Var3.P;
                a l = oq5Var3.l();
                yci H = vnj.H(hq5Var2, b2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(hq5Var2, a2, wp5.f);
                g0g.U(hq5Var2, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i14))) {
                    ouj.x(i14, oq5Var3, i14, kb5Var);
                }
                g0g.U(hq5Var2, H, wp5.d);
                vci vciVar = vci.a;
                float f16 = f10;
                yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, f16, 1), "month");
                agr agrVar = eq0.a;
                oq5 oq5Var4 = (oq5) hq5Var2;
                xcs.b(str, a3, ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 1, false, 1, 0, null, gesVar, hq5Var2, 0, 3120, 54776);
                xcs.b(str62222, androidx.compose.ui.platform.a.a(vciVar, "day_of_month"), ((dq0) oq5Var4.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar2, hq5Var2, 48, 0, 65528);
                xcs.b(str72222, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, -f16, 1), "day_of_week"), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, gesVar3, hq5Var2, 0, 0, 65528);
                oq5Var3.p(true);
                return Unit.a;
            }
        }, oq5Var), oq5Var, 3072, 2);
        z4 = z82222;
        z5 = z6;
        f7 = f11;
        f8 = f12;
        f9 = f10;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void m(ct5 ct5Var, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        vci vciVar;
        agr agrVar;
        boolean z2;
        oq5 oq5Var;
        xmn r;
        xs5 xs5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1871836695);
        int w = oq5Var2.w();
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(ct5Var) : oq5Var2.h(ct5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            float f2 = ku5.a;
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            yci e2 = d.e(yciVar, w1g.p(nu0.i(), 0, oq5Var2, 0, 2) + w1g.p(ku5.a(), 0, oq5Var2, 0, 2) + w1g.p(nu0.j(), 0, oq5Var2, 0, 2));
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i3 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            oq5Var2.Z(1028551592);
            vci vciVar2 = vci.a;
            yci a3 = androidx.compose.ui.platform.a.a(d.d(vciVar2, 1.0f), "title");
            String str = ct5Var.c;
            ges j = nu0.j();
            agr agrVar2 = eq0.a;
            int i4 = i2;
            xcs.b(str, a3, ((dq0) oq5Var2.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j, oq5Var2, 48, 3120, 55288);
            if (!z) {
                oq5Var2.Z(1028860506);
                n(ct5Var, oq5Var2, (i4 & 14) | 8);
                oq5Var2.t(w);
                r = oq5Var2.r();
                if (r != null) {
                    xs5Var = new xs5(ct5Var, z, yciVar, i, 2);
                    r.d = xs5Var;
                }
                return;
            }
            oq5Var2.Z(1012238895);
            oq5Var2.p(false);
            yci d2 = d.d(vciVar2, 1.0f);
            nho a4 = lho.a(qx0.a, b2c.k, oq5Var2, 0);
            int i5 = oq5Var2.P;
            a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, d2);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a4, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            if (!(((double) 1.0f) > 0.0d)) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.c(new mn0(6, j66.d0(ct5Var.n.d(), oq5Var2), (ArrayList) null), androidx.compose.ui.platform.a.a(new LayoutWeightElement(false, 1.0f), "concert_card_event_type"), ((dq0) oq5Var2.j(agrVar2)).b.b, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, ku5.a(), oq5Var2, 0, 3120, 120824);
            oq5 oq5Var3 = oq5Var2;
            String str2 = ct5Var.j;
            if (str2 == null) {
                oq5Var3.Z(-143251965);
                oq5Var3.p(false);
                z2 = false;
                agrVar = agrVar2;
                vciVar = vciVar2;
            } else {
                oq5Var3.Z(-143251964);
                vciVar = vciVar2;
                agrVar = agrVar2;
                xcs.b(" • ".concat(str2), androidx.compose.ui.platform.a.a(vciVar2, "concert_card_content_rating"), ((dq0) oq5Var3.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, ku5.a(), oq5Var3, 48, 3072, 57336);
                oq5Var3 = oq5Var3;
                z2 = false;
                oq5Var3.p(false);
            }
            oq5Var3.p(true);
            oq5 oq5Var4 = oq5Var3;
            xcs.b(ct5Var.h, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 4, 0.0f, 11), "concert_card_city"), ((dq0) oq5Var3.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ku5.a(), oq5Var4, 48, 3120, 55288);
            oq5Var = oq5Var4;
            oq5Var.p(false);
            oq5Var.p(true);
        }
        r = oq5Var.r();
        if (r != null) {
            xs5Var = new xs5(ct5Var, z, yciVar, i, 3);
            r.d = xs5Var;
        }
    }

    public static vgc m0(d7k d7kVar) {
        d7kVar.I(1);
        int y = d7kVar.y();
        long j = d7kVar.b + y;
        int i = y / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long p = d7kVar.p();
            if (p == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = p;
            jArr2[i2] = d7kVar.p();
            d7kVar.I(2);
            i2++;
        }
        d7kVar.I((int) (j - d7kVar.b));
        return new vgc(jArr, jArr2);
    }

    public static final void n(ct5 ct5Var, hq5 hq5Var, int i) {
        int i2;
        vci vciVar;
        ct5 ct5Var2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-445577656);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? oq5Var.f(ct5Var) : oq5Var.h(ct5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            ct5Var2 = ct5Var;
        } else {
            vci vciVar2 = vci.a;
            yci d2 = d.d(vciVar2, 1.0f);
            x2i x2iVar = qx0.a;
            nho a2 = lho.a(x2iVar, b2c.k, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            StringBuilder sb = new StringBuilder();
            String str = ct5Var.h;
            String str2 = ct5Var.i;
            String str3 = ct5Var.j;
            sb.append(str);
            if (!(str2 == null || StringsKt.U(str2))) {
                sb.append(" • ");
                sb.append(str2);
                if (str3 != null) {
                    sb.append(StringUtil.SPACE);
                }
            }
            String sb2 = sb.toString();
            if (!(((double) 1.0f) > 0.0d)) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci a3 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(new LayoutWeightElement(false, 1.0f), 0.0f, 0.0f, str3 != null ? 0 : 4, 0.0f, 11), "info");
            ges a4 = ku5.a();
            agr agrVar = eq0.a;
            xcs.b(sb2, a3, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, a4, oq5Var, 0, 3120, 55288);
            oq5Var = oq5Var;
            if (str3 == null) {
                oq5Var.Z(64635929);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                oq5Var.Z(64635930);
                vciVar = vciVar2;
                xcs.b("• ".concat(str3), androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 4, 0.0f, 11), "content_rating"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ku5.a(), oq5Var, 48, 3120, 55288);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            oq5Var.p(true);
            String str4 = ct5Var.k;
            if (str4 == null) {
                oq5Var.Z(1541365287);
                oq5Var.p(false);
                ct5Var2 = ct5Var;
            } else {
                oq5Var.Z(1541365288);
                hz2 hz2Var = b2c.l;
                yci a5 = androidx.compose.ui.platform.a.a(vciVar, "cashback");
                nho a6 = lho.a(x2iVar, hz2Var, oq5Var, 48);
                int i4 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, a5);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a6, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                gae.b(a0g.E(R.drawable.ic_plus_12, 0, oq5Var), null, d.m(vciVar, 12), ((dq0) oq5Var.j(agrVar)).b.b, oq5Var, 432, 0);
                u1g.l(oq5Var, d.r(vciVar, 4));
                h6g h6gVar = nu0.a;
                h6g h6gVar2 = h6g.c;
                oq5 oq5Var2 = oq5Var;
                ct5Var2 = ct5Var;
                xcs.b(str4, null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var2, 0, 3120, 55290);
                oq5Var = oq5Var2;
                oq5Var.p(true);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i4(ct5Var2, i, 5);
        }
    }

    public static JSONArray n0(JSONArray jSONArray) {
        if (bp6.a.contains(qwp.class)) {
            return null;
        }
        try {
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONArray) {
                    obj = n0((JSONArray) obj);
                } else if (obj instanceof JSONObject) {
                    obj = o0((JSONObject) obj, true);
                }
                jSONArray2.put(obj);
            }
            return jSONArray2;
        } catch (Throwable th) {
            bp6.a(qwp.class, th);
            return null;
        }
    }

    public static final void o(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-116183364);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.g(true) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            oq5Var.Z(525198251);
            qo6 qo6Var = qo6.f;
            gce gceVar = gce.d;
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new uo5(9);
                oq5Var.k0(K);
            }
            swf.d(qo6Var, gceVar, androidx.compose.ui.draw.a.c(yciVar, (Function1) K), null, 0L, 0L, false, oq5Var, 54, 120);
            oq5Var.p(false);
        } else {
            oq5Var.Z(525448452);
            w1g.j(str, null, androidx.compose.ui.platform.a.a(yciVar, "cover_image"), null, null, null, hd6.a, 0.0f, null, 0, ild.C(2137607288, new ep5(7), oq5Var), oq5Var, (i2 & 14) | 1572912, 952);
            oq5Var = oq5Var;
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 4);
        }
    }

    public static JSONObject o0(JSONObject jSONObject, boolean z) {
        if (bp6.a.contains(qwp.class) || jSONObject == null) {
            return null;
        }
        try {
            try {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray names = jSONObject.names();
                for (int i = 0; i < names.length(); i++) {
                    String string = names.getString(i);
                    Object obj = jSONObject.get(string);
                    if (obj instanceof JSONObject) {
                        obj = o0((JSONObject) obj, true);
                    } else if (obj instanceof JSONArray) {
                        obj = n0((JSONArray) obj);
                    }
                    Pair O = O(string);
                    String str = (String) O.first;
                    String str2 = (String) O.second;
                    if (z) {
                        if (str == null || !str.equals("fbsdk")) {
                            if (str != null && !str.equals("og")) {
                                jSONObject3.put(str2, obj);
                            }
                            jSONObject2.put(str2, obj);
                        } else {
                            jSONObject2.put(string, obj);
                        }
                    } else if (str == null || !str.equals("fb")) {
                        jSONObject2.put(str2, obj);
                    } else {
                        jSONObject2.put(string, obj);
                    }
                }
                if (jSONObject3.length() > 0) {
                    jSONObject2.put("data", jSONObject3);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                throw new c3c("Failed to create json object from share content");
            }
        } catch (Throwable th) {
            bp6.a(qwp.class, th);
            return null;
        }
    }

    public static final void p(final String str, final boolean z, final Integer num, final String str2, final d85 d85Var, final yci yciVar, final float f2, final String str3, final boolean z2, final boolean z3, final Function0 function0, hq5 hq5Var, final int i) {
        vci vciVar;
        long j;
        kb5 kb5Var;
        grb grbVar;
        kb5 kb5Var2;
        yci u;
        boolean z4;
        long j2;
        long b2;
        ges c2;
        boolean z5;
        boolean z6;
        ges j3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2053898825);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(num) ? 256 : 128) | (oq5Var.f(str2) ? 2048 : 1024) | (oq5Var.f(d85Var) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(str3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.g(z2) ? 67108864 : 33554432) | (oq5Var.g(z3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        char c3 = oq5Var.h(function0) ? (char) 4 : (char) 2;
        if ((i2 & 306783379) == 306783378 && (c3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var3 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var3);
            kb5 kb5Var4 = wp5.e;
            g0g.U(oq5Var, l, kb5Var4);
            kb5 kb5Var5 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var5);
            }
            kb5 kb5Var6 = wp5.d;
            g0g.U(oq5Var, H, kb5Var6);
            vci vciVar2 = vci.a;
            if (num == null) {
                oq5Var.Z(-868724577);
                oq5Var.p(false);
                kb5Var2 = kb5Var4;
                kb5Var = kb5Var5;
                grbVar = grbVar2;
                vciVar = vciVar2;
            } else {
                oq5Var.Z(-868724576);
                String valueOf = String.valueOf(num.intValue());
                yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 8, 0.0f, 11);
                vciVar = vciVar2;
                ges d2 = nu0.d();
                if (d85Var == null) {
                    oq5Var.Z(1557160080);
                    long j4 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(false);
                    j = j4;
                } else {
                    oq5Var.Z(1557159057);
                    oq5Var.p(false);
                    j = d85Var.a;
                }
                kb5Var = kb5Var5;
                long j5 = j;
                grbVar = grbVar2;
                kb5Var2 = kb5Var4;
                xcs.b(valueOf, q, j5, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, d2, oq5Var, 48, 0, 65528);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            htq htqVar = new htq(z2 ? etq.b : etq.a);
            vci vciVar3 = vciVar;
            yci m = d.m(vciVar3, f2);
            if (z2) {
                oq5Var.Z(-868164778);
                u = if4.b(function0 != null ? ((Number) function0.invoke()).floatValue() : 1.0f, ((dq0) oq5Var.j(eq0.a)).c.a, z);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-867886057);
                oq5Var.p(false);
                u = xp3.u(vciVar3, ugo.a(10));
            }
            ocg.e(str2, htqVar, m.f(u), null, oq5Var, (i2 >> 9) & 14, 8);
            yci q2 = androidx.compose.foundation.layout.a.q(vciVar3, 12, 0.0f, 0.0f, 0.0f, 14);
            ta5 a3 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var3);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H2, kb5Var6);
            if (z3) {
                oq5Var.Z(-407820954);
                j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
                z4 = false;
            } else {
                z4 = false;
                oq5Var.Z(-407819836);
                j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
            }
            oq5Var.p(z4);
            if (z3) {
                oq5Var.Z(-407816604);
                b2 = ((dq0) oq5Var.j(eq0.a)).b.a;
            } else {
                oq5Var.Z(-407815281);
                b2 = d85.b(((dq0) oq5Var.j(eq0.a)).b.a, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                z4 = false;
            }
            oq5Var.p(z4);
            long j6 = b2;
            boolean z7 = str3 != null ? true : z4;
            if (z7) {
                oq5Var.Z(-407811063);
                c2 = nu0.j();
            } else {
                oq5Var.Z(-407809878);
                c2 = nu0.c();
            }
            oq5Var.p(z4);
            ges gesVar = c2;
            if (str == null) {
                oq5Var.Z(242837490);
                oq5Var.p(z4);
                z5 = z4;
            } else {
                oq5Var.Z(242837491);
                if (d85Var != null) {
                    j2 = d85Var.a;
                }
                oq5 oq5Var2 = oq5Var;
                xcs.b(str, null, j2, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, gesVar, oq5Var2, i2 & 14, 3120, 55290);
                oq5Var = oq5Var2;
                z5 = false;
                oq5Var.p(false);
            }
            if (z7) {
                oq5Var.Z(243161751);
                String str4 = str3 == null ? "" : str3;
                if (z3) {
                    oq5Var.Z(-407794582);
                    j3 = nu0.c();
                } else {
                    oq5Var.Z(-407793367);
                    j3 = nu0.j();
                }
                oq5Var.p(z5);
                ges gesVar2 = j3;
                if (d85Var != null) {
                    long j7 = d85Var.a;
                    j6 = z3 ? j7 : d85.b(j7, 0.5f, 0.0f, 0.0f, 0.0f, 14);
                }
                oq5 oq5Var3 = oq5Var;
                xcs.b(str4, null, j6, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, gesVar2, oq5Var3, 0, 3120, 55290);
                oq5Var = oq5Var3;
                z6 = false;
            } else {
                z6 = z5;
                oq5Var.Z(239634757);
            }
            oq5Var.p(z6);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(str, z, num, str2, d85Var, yciVar, f2, str3, z2, z3, function0, i) { // from class: go6
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Integer c;
                public final /* synthetic */ String d;
                public final /* synthetic */ d85 e;
                public final /* synthetic */ yci f;
                public final /* synthetic */ float g;
                public final /* synthetic */ String h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Function0 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1572865);
                    qwp.p(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[EDGE_INSN: B:24:0x013f->B:25:0x013f BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [frd] */
    /* JADX WARN: Type inference failed for: r12v4, types: [frd] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type p0(Type type, Class cls, Type type2, HashMap hashMap) {
        Type p0;
        Type erdVar;
        TypeVariable typeVariable = null;
        while (true) {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                TypeVariable typeVariable2 = type2;
                Type type3 = (Type) hashMap.get(typeVariable2);
                Class cls2 = Void.TYPE;
                if (type3 != null) {
                    return type3 == cls2 ? type2 : type3;
                }
                hashMap.put(typeVariable2, cls2);
                if (typeVariable == null) {
                    typeVariable = typeVariable2;
                }
                GenericDeclaration genericDeclaration = typeVariable2.getGenericDeclaration();
                Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls3 != null) {
                    Type P = P(type, cls, cls3);
                    if (P instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls3.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable2.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) P).getActualTypeArguments()[i];
                                if (type2 != typeVariable2) {
                                    break;
                                }
                            } else {
                                i++;
                            }
                        }
                        wvs.n();
                        return null;
                    }
                }
                type2 = typeVariable2;
                if (type2 != typeVariable2) {
                }
            } else {
                if (type2 instanceof Class) {
                    Class cls4 = type2;
                    if (cls4.isArray()) {
                        Class<?> componentType = cls4.getComponentType();
                        Type p02 = p0(type, cls, componentType, hashMap);
                        if (Objects.equals(componentType, p02)) {
                            type2 = cls4;
                        } else {
                            erdVar = new drd(p02);
                            type2 = erdVar;
                        }
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    type2 = (GenericArrayType) type2;
                    Type genericComponentType = type2.getGenericComponentType();
                    Type p03 = p0(type, cls, genericComponentType, hashMap);
                    if (!Objects.equals(genericComponentType, p03)) {
                        erdVar = new drd(p03);
                        type2 = erdVar;
                    }
                } else if (type2 instanceof ParameterizedType) {
                    type2 = (ParameterizedType) type2;
                    Type ownerType = type2.getOwnerType();
                    Type p04 = p0(type, cls, ownerType, hashMap);
                    boolean equals = Objects.equals(p04, ownerType);
                    Type[] actualTypeArguments = type2.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    Type[] typeArr = actualTypeArguments;
                    boolean z = false;
                    while (i < length2) {
                        Type p05 = p0(type, cls, typeArr[i], hashMap);
                        if (!Objects.equals(p05, typeArr[i])) {
                            if (!z) {
                                typeArr = (Type[]) typeArr.clone();
                                z = true;
                            }
                            typeArr[i] = p05;
                        }
                        i++;
                    }
                    if (!equals || z) {
                        erdVar = new erd(p04, (Class) type2.getRawType(), typeArr);
                        type2 = erdVar;
                    }
                } else if (type2 instanceof WildcardType) {
                    type2 = (WildcardType) type2;
                    Type[] lowerBounds = type2.getLowerBounds();
                    Type[] upperBounds = type2.getUpperBounds();
                    if (lowerBounds.length == 1) {
                        Type p06 = p0(type, cls, lowerBounds[0], hashMap);
                        if (p06 != lowerBounds[0]) {
                            type2 = new frd(new Type[]{Object.class}, p06 instanceof WildcardType ? ((WildcardType) p06).getLowerBounds() : new Type[]{p06});
                        }
                    } else if (upperBounds.length == 1 && (p0 = p0(type, cls, upperBounds[0], hashMap)) != upperBounds[0]) {
                        type2 = new frd(p0 instanceof WildcardType ? ((WildcardType) p0).getUpperBounds() : new Type[]{p0}, e);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(Function0 function0, Function0 function02, Function0 function03, hq5 hq5Var, int i, int i2) {
        Function0 function04;
        int i3;
        Function0 function05;
        int i4;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        xmn r;
        Function0 function09;
        boolean z;
        Function0 function010;
        boolean z2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-699420747);
        if ((i & 6) == 0) {
            function04 = function0;
            i3 = (oq5Var.h(function04) ? 4 : 2) | i;
        } else {
            function04 = function0;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function05 = function02;
            i3 |= oq5Var.h(function05) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function06 = function03;
                i3 |= oq5Var.h(function06) ? 256 : 128;
                if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
                    Function0 function011 = i5 != 0 ? null : function05;
                    Function0 function012 = i4 != 0 ? null : function06;
                    vci vciVar = vci.a;
                    yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.a.o(d.c(vciVar, 1.0f), 24, 0.0f, 2), "default_not_available_screen");
                    kfh d2 = ug3.d(b2c.f, false);
                    int i6 = oq5Var.P;
                    a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, a2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, d2, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var, i6, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    ta5 a3 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                    int i7 = oq5Var.P;
                    a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, vciVar);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a3, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var, i7, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    xcs.b(rvf.M(R.string.payment_screen_error_title, oq5Var), null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 0, 0, 65018);
                    oq5Var = oq5Var;
                    u1g.l(oq5Var, d.e(vciVar, 10));
                    bcx.d(function04, null, false, xv7.d, oq5Var, (i3 & 14) | 3072, 6);
                    if (function011 != null) {
                        oq5Var.Z(1884158115);
                        Function0 function013 = function011;
                        bcx.d(function013, null, false, xv7.e, oq5Var, ((i3 >> 3) & 14) | 3072, 6);
                        function09 = function013;
                        z = false;
                    } else {
                        function09 = function011;
                        z = false;
                        oq5Var.Z(1882200713);
                    }
                    oq5Var.p(z);
                    if (function012 != null) {
                        oq5Var.Z(1884520908);
                        function010 = function012;
                        bcx.d(function010, null, false, xv7.f, oq5Var, ((i3 >> 6) & 14) | 3072, 6);
                        z2 = false;
                    } else {
                        function010 = function012;
                        z2 = false;
                        oq5Var.Z(1882200713);
                    }
                    oq5Var.p(z2);
                    oq5Var.p(true);
                    oq5Var.p(true);
                    function07 = function09;
                    function08 = function010;
                } else {
                    oq5Var.S();
                    function07 = function05;
                    function08 = function06;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new lx(function0, function07, function08, i, i2);
                    return;
                }
                return;
            }
            function06 = function03;
            if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function05 = function02;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function06 = function03;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final gj q0(n4l n4lVar) {
        ewt ewtVar = n4lVar.b;
        return new gj(ewtVar != null ? ewtVar.c : null, ewtVar != null ? ewtVar.b : null, ewtVar != null ? ewtVar.a : null, ewtVar != null ? ewtVar.f : null, n4lVar.a, null);
    }

    public static final void r(yda ydaVar, hq5 hq5Var, int i) {
        ydaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1347088157);
        int i2 = (oq5Var.h(ydaVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            eea eeaVar = (eea) szf.Q(ydaVar.b.l, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h = oq5Var.h(ydaVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                dda ddaVar = new dda(0, ydaVar, yda.class, "onBackClicked", "onBackClicked()V", 0, 3);
                oq5Var.k0(ddaVar);
                K = ddaVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var.h(ydaVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                dda ddaVar2 = new dda(0, ydaVar, yda.class, "onSearchClicked", "onSearchClicked()V", 0, 4);
                oq5Var.k0(ddaVar2);
                K2 = ddaVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h3 = oq5Var.h(ydaVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                dda ddaVar3 = new dda(0, ydaVar, yda.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 5);
                oq5Var.k0(ddaVar3);
                K3 = ddaVar3;
            }
            kg5.g(R.string.artists, a2, function0, function02, (Function0) ((h9f) K3), ild.C(1439891920, new xk(24, eeaVar, ydaVar, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(ydaVar, i, 26);
        }
    }

    public static final ArrayList r0(List list, xzb xzbVar) {
        xzb xzbVar2;
        ArrayList K = wvo.K(list, gd9.s, gd9.t);
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            jc8 jc8Var = (jc8) obj;
            zzb zzbVar = xzbVar instanceof zzb ? (zzb) xzbVar : null;
            if (zzbVar != null) {
                xzbVar2 = zzbVar.c.h(jc8Var, xzbVar, zzbVar.e((String) K.get(i))).a;
                if (xzbVar2 != null) {
                    arrayList.add(new k79(jc8Var, xzbVar2));
                    i = i2;
                }
            }
            xzbVar2 = xzbVar;
            arrayList.add(new k79(jc8Var, xzbVar2));
            i = i2;
        }
        return arrayList;
    }

    public static final void s(ct5 ct5Var, boolean z, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        ct5 ct5Var2;
        xmn r;
        xs5 xs5Var;
        iz2 iz2Var = b2c.h;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1972244838);
        int w = oq5Var.w();
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(ct5Var) : oq5Var.h(ct5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            ct5Var2 = ct5Var;
        } else {
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(1476204946);
            String str = ct5Var.a;
            vci vciVar = vci.a;
            yci d3 = d.d(vciVar, 1.0f);
            float f2 = ku5.a;
            o(0, oq5Var, androidx.compose.foundation.layout.a.d(xp3.u(d3, o5g.F(oq5Var)), 0.66f), str);
            u1g.l(oq5Var, d.e(vciVar, ku5.a));
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            if (!z) {
                oq5Var.Z(1476583765);
                l(ct5Var.e, ct5Var.f, ct5Var.g, ct5Var.b, androidx.compose.foundation.layout.a.m(bVar.a(vciVar, iz2Var), 8), 0.0f, false, 0.0f, 0.0f, false, oq5Var, 0, 992);
                oq5Var.t(w);
                r = oq5Var.r();
                if (r != null) {
                    xs5Var = new xs5(ct5Var, z, yciVar, i, 0);
                    r.d = xs5Var;
                }
                return;
            }
            ct5Var2 = ct5Var;
            oq5Var.Z(1471990774);
            oq5Var.p(false);
            String str2 = ct5Var2.e;
            String str3 = ct5Var2.f;
            String str4 = ct5Var2.g;
            iu5 iu5Var = iu5.b;
            yci a2 = bVar.a(androidx.compose.foundation.layout.a.k(vciVar, 0.0f, 16, 1), iz2Var);
            float f3 = 8;
            t(str2, str3, str4, iu5Var, androidx.compose.foundation.layout.a.q(a2, f3, 0.0f, 0.0f, 6, 6), oq5Var, 3072);
            Integer num = ct5Var2.l;
            if (num != null) {
                oq5Var.Z(1477430220);
                j(num.intValue(), 0, oq5Var, androidx.compose.foundation.layout.a.m(bVar.a(vciVar, b2c.j), f3));
            } else {
                oq5Var.Z(1471990774);
            }
            oq5Var.p(false);
            oq5Var.p(false);
            oq5Var.p(true);
        }
        r = oq5Var.r();
        if (r != null) {
            xs5Var = new xs5(ct5Var2, z, yciVar, i, 1);
            r.d = xs5Var;
        }
    }

    public static JSONObject s0(sxp sxpVar) {
        if (!bp6.a.contains(qwp.class)) {
            try {
                rxp rxpVar = sxpVar.g;
                jkl jklVar = new jkl();
                if (rxpVar != null) {
                    Bundle bundle = rxpVar.a;
                    JSONObject jSONObject = new JSONObject();
                    for (String str : bundle.keySet()) {
                        jSONObject.put(str, w1g.F(bundle.get(str), jklVar));
                    }
                    return jSONObject;
                }
            } catch (Throwable th) {
                bp6.a(qwp.class, th);
                return null;
            }
        }
        return null;
    }

    public static final void t(String str, String str2, String str3, iu5 iu5Var, yci yciVar, hq5 hq5Var, int i) {
        ges e2;
        dfi.s(str, str2, str3);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(452947621);
        if (((i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.f(str3) ? 256 : 128) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID)) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            ges j = nu0.j();
            int ordinal = iu5Var.ordinal();
            if (ordinal == 0) {
                oq5Var.Z(1490977074);
                e2 = nu0.e();
                oq5Var.p(false);
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var, 1490975043, false);
                }
                oq5Var.Z(1490979346);
                e2 = nu0.d();
                oq5Var.p(false);
            }
            jf0.a(new qzm[0], null, false, ild.C(913667357, new x91(yciVar, j, e2, nu0.j(), iu5Var, str, str2, str3, 1), oq5Var), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(str, str2, str3, iu5Var, yciVar, i, 12);
        }
    }

    public static String t0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int u(int i, int i2, int i3, boolean z) {
        if (i2 >= i3) {
            if (z) {
                return 0;
            }
            return i3 - i2;
        }
        if (z) {
            if (z) {
                if (z) {
                }
            } else if (z) {
            }
        } else {
            if (z ? i3 - i2 <= i : i2 > i) {
                if (z) {
                    return i3 - i2;
                }
                return 0;
            }
            if (z) {
                return i - i2;
            }
        }
        return i;
    }

    public static final thj v(te teVar) {
        teVar.getClass();
        String str = teVar.a;
        pkb pkbVar = pkb.Shortcut;
        str.getClass();
        return new thj(pkbVar, str, 1, 1, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [k79] */
    public static final ArrayList w(pr8 pr8Var, xzb xzbVar) {
        Object obj;
        JSONArray jSONArray = (JSONArray) pr8Var.a.a(xzbVar);
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            xzb Q = Q(pr8Var, jSONArray.get(i), i, xzbVar);
            if (Q != null) {
                Iterator it = pr8Var.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((Boolean) ((or8) obj).c.a(Q)).booleanValue()) {
                        break;
                    }
                }
                or8 or8Var = (or8) obj;
                if (or8Var != null) {
                    jc8 jc8Var = or8Var.a;
                    szb szbVar = or8Var.b;
                    r5 = new k79(I(jc8Var, szbVar != null ? (String) szbVar.a(Q) : null), Q);
                }
            }
            if (r5 != null) {
                arrayList.add(r5);
            }
        }
        return arrayList;
    }

    public static final List x(List list, pr8 pr8Var, xzb xzbVar) {
        return pr8Var != null ? w(pr8Var, xzbVar) : list != null ? r0(list, xzbVar) : c5b.a;
    }

    public static final int y(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            naq naqVar = (naq) it.next();
            if (q7g.G(naqVar.d) != null) {
                return 0;
            }
            rr5 d2 = naqVar.e.d();
            int c2 = k5r.c(i * 31, 31, d2.a);
            String str = d2.b;
            int hashCode = (c2 + (str != null ? str.hashCode() : 0)) * 31;
            fa7 b2 = vr3.b(q7g.I(naqVar.d));
            i = hashCode + (b2 != null ? b2.hashCode() : 0);
        }
        return i;
    }

    public static Type z(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new drd(z(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new erd(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new drd(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new frd(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public abstract boolean A(v6 v6Var, j6 j6Var, j6 j6Var2);

    public abstract boolean B(v6 v6Var, Object obj, Object obj2);

    public abstract boolean C(v6 v6Var, u6 u6Var, u6 u6Var2);

    public abstract j6 L(v6 v6Var);

    public abstract u6 M(v6 v6Var);

    public abstract void k0(u6 u6Var, u6 u6Var2);

    public abstract void l0(u6 u6Var, Thread thread);
}
