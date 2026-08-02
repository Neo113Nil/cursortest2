package defpackage;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.screen.cards.data.ActionButtonCardDtoOld;
import com.yandex.music.screen.cards.data.CardDtoOld;
import com.yandex.music.screen.cards.data.CardsDtoOld;
import com.yandex.music.screen.cards.data.VibeButtonCardDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class nt0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {ScreenMirroringConfig.Audio.SAMPLING_RATE, RemoteCameraConfig.Mic.SAMPLING_RATE, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, RemoteCameraConfig.Mic.BUFFER_SIZE, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, UibcKeyCode.TV_KEYCODE_FORWARD, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final wn5 g = new wn5(new fo5(9), -1542380549, false);
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final wn5 k;
    public static final wn5 l;
    public static final wn5 m;
    public static final wn5 n;
    public static final wn5 o;
    public static final wn5 p;
    public static final wn5 q;
    public static final rj7 r;
    public static final mj s;
    public static final c9n t;

    static {
        int i2 = 3;
        int i3 = 0;
        new wn5(new fo5(11), 463267238, false);
        h = new wn5(new fo5(13), -796046000, false);
        int i4 = 15;
        i = new wn5(new fo5(i4), -1211372817, false);
        int i5 = 16;
        j = new wn5(new fo5(i5), -1626699634, false);
        int i6 = 17;
        k = new wn5(new fo5(i6), 1837614028, false);
        int i7 = 7;
        new wn5(new go5(i7), -894234053, false);
        new wn5(new go5(8), -1328197734, false);
        new wn5(new go5(i2), -653835480, false);
        int i8 = 5;
        new wn5(new go5(i8), 1056815367, false);
        l = new wn5(new lo5(14), 1529686304, false);
        new wn5(new lo5(i4), 995157477, false);
        m = new wn5(new lo5(i5), -1538557886, false);
        new wn5(new lo5(i6), 1108064299, false);
        int i9 = 29;
        n = new wn5(new po5(i9), 1212584688, false);
        o = new wn5(new ap5(i3), -852908797, false);
        p = new wn5(new zo5(4), -937813876, false);
        new wn5(new zo5(i8), 179856043, false);
        new wn5(new zo5(6), 1606079009, false);
        new wn5(new zo5(i7), 803920972, false);
        new wn5(new wo5(i9), -1594887413, false);
        q = new wn5(new zo5(i3), -428164014, false);
        new wn5(new zo5(1), 1093454835, false);
        new wn5(new zo5(2), -906622982, false);
        new wn5(new zo5(i2), 1957996036, false);
        r = new rj7(21);
        s = new mj(22);
        t = new c9n(0, 0, 14);
    }

    public static final ArrayList A(List list, n60 n60Var) {
        list.getClass();
        n60Var.getClass();
        Set set = n60Var.f;
        Set set2 = n60Var.b;
        Set set3 = n60Var.a;
        Set set4 = n60Var.e;
        Set set5 = n60Var.c;
        Set set6 = n60Var.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            i4p i4pVar = (i4p) obj;
            if (i4pVar instanceof f3p) {
                if (!set6.contains(((f3p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof g3p) {
                if (!set3.contains(((g3p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof b4p) {
                if (!set2.contains(((b4p) i4pVar).b.e())) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof a4p) {
                if (!set6.contains(((a4p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof c4p) {
                if (!set5.contains(((c4p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof f4p) {
                if (!set5.contains(((f4p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof g4p) {
                if (!set4.contains(((g4p) i4pVar).b.a.h())) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof h4p) {
                if (!set.contains(((h4p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof z3p) {
                if (!n60Var.g.contains(((z3p) i4pVar).b.a.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof u3p) {
                if (!set5.contains(((u3p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof i3p) {
                if (!set3.contains(((i3p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof h3p) {
                if (!set6.contains(((h3p) i4pVar).b.a)) {
                    arrayList.add(obj);
                }
            } else if (i4pVar instanceof o3p) {
                if (!set2.contains(((o3p) i4pVar).b.f)) {
                    arrayList.add(obj);
                }
            } else if (!(i4pVar instanceof x3p)) {
                if (!(i4pVar instanceof l3p) && !(i4pVar instanceof v3p)) {
                    if (i4pVar instanceof r3p) {
                        if (!set6.contains(((r3p) i4pVar).b.a)) {
                        }
                    } else if (i4pVar instanceof p3p) {
                        if (!set6.contains(((p3p) i4pVar).b.a)) {
                        }
                    } else if (i4pVar instanceof m3p) {
                        if (!set6.contains(((m3p) i4pVar).b.a)) {
                        }
                    } else if (!(i4pVar instanceof j3p)) {
                        if (i4pVar instanceof q3p) {
                            if (!set5.contains(((q3p) i4pVar).b.a)) {
                            }
                        } else if (i4pVar instanceof k3p) {
                            if (!set5.contains(((k3p) i4pVar).b.a)) {
                            }
                        } else if (!(i4pVar instanceof n3p)) {
                            if (i4pVar instanceof w3p) {
                                if (!set.contains(((w3p) i4pVar).b.a)) {
                                }
                            } else if (i4pVar instanceof t3p) {
                                continue;
                            } else {
                                if (!(i4pVar instanceof d4p)) {
                                    b6e.s();
                                    return null;
                                }
                                if (!set4.contains(CollectionsKt.X(((d4p) i4pVar).b.c, StringUtils.COMMA, null, null, null, 62))) {
                                }
                            }
                        }
                    }
                }
                arrayList.add(obj);
            } else if (!set4.contains(((x3p) i4pVar).b.e)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final l7t B(tiu tiuVar, mn0 mn0Var) {
        tiuVar.getClass();
        int length = mn0Var.b.length();
        int length2 = mn0Var.b.length();
        int min = Math.min(length, 100);
        for (int i2 = 0; i2 < min; i2++) {
            R(i2, length2, i2);
        }
        R(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < min2; i3++) {
            S(i3, length, i3);
        }
        S(length2, length, length2);
        return new l7t(mn0Var, new c9n(mn0Var.b.length(), mn0Var.b.length(), 14));
    }

    public static void C(ArrayList arrayList, SpannableString spannableString, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
        boolean z;
        Matcher matcher = pattern.matcher(spannableString);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String group = matcher.group(0);
            if ((matchFilter == null || matchFilter.acceptMatch(spannableString, start, end)) && group != null) {
                g8g g8gVar = new g8g();
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    String str = strArr[i2];
                    if (group.regionMatches(true, 0, str, 0, str.length())) {
                        z = true;
                        if (!group.regionMatches(false, 0, str, 0, str.length())) {
                            group = str.concat(group.substring(str.length()));
                        }
                    } else {
                        i2++;
                    }
                }
                if (!z && strArr.length > 0) {
                    group = su4.o(new StringBuilder(), strArr[0], group);
                }
                g8gVar.b = group;
                g8gVar.c = start;
                g8gVar.d = end;
                arrayList.add(g8gVar);
            }
        }
    }

    public static int D(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final long E(efo efoVar) {
        DragEvent dragEvent = (DragEvent) efoVar.b;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final long F(Integer num, hq5 hq5Var, int i2) {
        long j2;
        boolean g2 = (i2 & 2) != 0 ? ((ma5) ((oq5) hq5Var).j(pa5.a)).g() : false;
        d85 d85Var = num != null ? new d85(c3x.f(num.intValue())) : null;
        if (d85Var == null) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(1377603069);
            j2 = d85.b(((dq0) oq5Var.j(eq0.a)).c.c, 1.0f, 0.0f, 0.0f, 0.0f, 14);
            oq5Var.p(false);
        } else {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(1377601333);
            oq5Var2.p(false);
            j2 = d85Var.a;
        }
        return c3x.D(g2 ? jf0.g0(j2, Float.valueOf(0.35f), 0.0f, 6) : jf0.g0(j2, Float.valueOf(0.65f), 0.0f, 6), ((dq0) ((oq5) hq5Var).j(eq0.a)).c.a);
    }

    public static x9 G(v94 v94Var) {
        int D;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int g2 = v94Var.g();
        v94Var.t(40);
        boolean z = v94Var.i(5) > 10;
        v94Var.q(g2);
        int[] iArr = d;
        int[] iArr2 = b;
        if (z) {
            v94Var.t(16);
            int i14 = v94Var.i(2);
            if (i14 == 0) {
                r8 = 0;
            } else if (i14 == 1) {
                r8 = 1;
            } else if (i14 == 2) {
                r8 = 2;
            }
            v94Var.t(3);
            D = (v94Var.i(11) + 1) * 2;
            int i15 = v94Var.i(2);
            if (i15 == 3) {
                i8 = c[v94Var.i(2)];
                i7 = 3;
                i9 = 6;
            } else {
                i7 = v94Var.i(2);
                int i16 = a[i7];
                i8 = iArr2[i15];
                i9 = i16;
            }
            i4 = i9 * 256;
            int i17 = (D * i8) / (i9 * 32);
            int i18 = v94Var.i(3);
            boolean h2 = v94Var.h();
            i3 = iArr[i18] + (h2 ? 1 : 0);
            v94Var.t(10);
            if (v94Var.h()) {
                v94Var.t(8);
            }
            if (i18 == 0) {
                v94Var.t(5);
                if (v94Var.h()) {
                    v94Var.t(8);
                }
            }
            if (r8 == 1 && v94Var.h()) {
                v94Var.t(16);
            }
            if (v94Var.h()) {
                if (i18 > 2) {
                    v94Var.t(2);
                }
                if ((i18 & 1) == 0 || i18 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    v94Var.t(6);
                }
                if ((i18 & 4) != 0) {
                    v94Var.t(i11);
                }
                if (h2 && v94Var.h()) {
                    v94Var.t(5);
                }
                if (r8 == 0) {
                    if (v94Var.h()) {
                        i12 = 6;
                        v94Var.t(6);
                    } else {
                        i12 = 6;
                    }
                    if (i18 == 0 && v94Var.h()) {
                        v94Var.t(i12);
                    }
                    if (v94Var.h()) {
                        v94Var.t(i12);
                    }
                    int i19 = v94Var.i(2);
                    if (i19 == 1) {
                        v94Var.t(5);
                        i13 = 2;
                    } else {
                        if (i19 == 2) {
                            v94Var.t(12);
                        } else if (i19 == 3) {
                            int i20 = v94Var.i(5);
                            if (v94Var.h()) {
                                v94Var.t(5);
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                }
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                }
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                }
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                }
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                }
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                }
                                if (v94Var.h()) {
                                    v94Var.t(4);
                                }
                                if (v94Var.h()) {
                                    if (v94Var.h()) {
                                        v94Var.t(4);
                                    }
                                    if (v94Var.h()) {
                                        v94Var.t(4);
                                    }
                                }
                            }
                            if (v94Var.h()) {
                                v94Var.t(5);
                                if (v94Var.h()) {
                                    v94Var.t(7);
                                    if (v94Var.h()) {
                                        v94Var.t(8);
                                        i13 = 2;
                                        v94Var.t((i20 + i13) * 8);
                                        v94Var.c();
                                    }
                                }
                            }
                            i13 = 2;
                            v94Var.t((i20 + i13) * 8);
                            v94Var.c();
                        }
                        i13 = 2;
                    }
                    if (i18 < i13) {
                        if (v94Var.h()) {
                            v94Var.t(14);
                        }
                        if (i18 == 0 && v94Var.h()) {
                            v94Var.t(14);
                        }
                    }
                    if (v94Var.h()) {
                        if (i7 == 0) {
                            v94Var.t(5);
                        } else {
                            for (int i21 = 0; i21 < i9; i21++) {
                                if (v94Var.h()) {
                                    v94Var.t(5);
                                }
                            }
                        }
                    }
                }
            }
            if (v94Var.h()) {
                v94Var.t(5);
                if (i18 == 2) {
                    v94Var.t(4);
                }
                if (i18 >= 6) {
                    v94Var.t(2);
                }
                if (v94Var.h()) {
                    v94Var.t(8);
                }
                if (i18 == 0 && v94Var.h()) {
                    v94Var.t(8);
                }
                if (i15 < 3) {
                    v94Var.s();
                }
            }
            if (r8 == 0 && i7 != 3) {
                v94Var.s();
            }
            if (r8 == 2 && (i7 == 3 || v94Var.h())) {
                i10 = 6;
                v94Var.t(6);
            } else {
                i10 = 6;
            }
            str = (v94Var.h() && v94Var.i(i10) == 1 && v94Var.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i6 = i8;
            i5 = i17;
        } else {
            v94Var.t(32);
            int i22 = v94Var.i(2);
            String str2 = i22 == 3 ? null : "audio/ac3";
            int i23 = v94Var.i(6);
            int i24 = e[i23 / 2] * 1000;
            D = D(i22, i23);
            v94Var.t(8);
            int i25 = v94Var.i(3);
            if ((i25 & 1) == 0 || i25 == 1) {
                i2 = 2;
            } else {
                i2 = 2;
                v94Var.t(2);
            }
            if ((i25 & 4) != 0) {
                v94Var.t(i2);
            }
            if (i25 == i2) {
                v94Var.t(i2);
            }
            r8 = i22 < 3 ? iArr2[i22] : -1;
            i3 = iArr[i25] + (v94Var.h() ? 1 : 0);
            i4 = 1536;
            str = str2;
            i5 = i24;
            i6 = r8;
        }
        return new x9(str, i3, i6, D, i4, i5);
    }

    public static final synchronized void H(la laVar, tlp tlpVar) {
        synchronized (nt0.class) {
            if (bp6.a.contains(nt0.class)) {
                return;
            }
            try {
                mlk J = J();
                J.a(laVar, tlpVar.c());
                L(J);
            } catch (Throwable th) {
                bp6.a(nt0.class, th);
            }
        }
    }

    public static final synchronized void I(pa7 pa7Var) {
        tlp tlpVar;
        synchronized (nt0.class) {
            if (bp6.a.contains(nt0.class)) {
                return;
            }
            try {
                pa7Var.getClass();
                mlk J = J();
                for (la laVar : pa7Var.d()) {
                    synchronized (pa7Var) {
                        laVar.getClass();
                        tlpVar = (tlp) pa7Var.a.get(laVar);
                    }
                    if (tlpVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    J.a(laVar, tlpVar.c());
                }
                L(J);
            } catch (Throwable th) {
                bp6.a(nt0.class, th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #9 {all -> 0x003d, blocks: (B:11:0x0010, B:18:0x002f, B:20:0x0032, B:22:0x00a4, B:27:0x0041, B:54:0x0077, B:56:0x007a, B:57:0x008c, B:60:0x0085, B:42:0x0064, B:44:0x0067, B:39:0x009e, B:31:0x008d, B:33:0x0090), top: B:10:0x0010, outer: #1, inners: #0, #7 }] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized mlk J() {
        mt0 mt0Var;
        String str;
        mlk mlkVar;
        Object readObject;
        synchronized (nt0.class) {
            ?? contains = bp6.a.contains(nt0.class);
            if (contains != 0) {
                return null;
            }
            try {
                try {
                    contains = j3c.b();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    FileInputStream openFileInput = contains.openFileInput("AppEventsLogger.persistedevents");
                    openFileInput.getClass();
                    mt0Var = new mt0(new BufferedInputStream(openFileInput));
                    try {
                        readObject = mt0Var.readObject();
                    } catch (FileNotFoundException unused) {
                        gvt.d(mt0Var);
                        try {
                            contains.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e2) {
                            e = e2;
                            str = "nt0";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                            mlkVar = null;
                            if (mlkVar == null) {
                            }
                            return mlkVar;
                        }
                        mlkVar = null;
                        if (mlkVar == null) {
                        }
                        return mlkVar;
                    } catch (Exception e3) {
                        e = e3;
                        Log.w("nt0", "Got unexpected exception while reading events: ", e);
                        gvt.d(mt0Var);
                        try {
                            contains.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception e4) {
                            e = e4;
                            str = "nt0";
                            Log.w(str, "Got unexpected exception when removing events file: ", e);
                            mlkVar = null;
                            if (mlkVar == null) {
                            }
                            return mlkVar;
                        }
                        mlkVar = null;
                        if (mlkVar == null) {
                        }
                        return mlkVar;
                    }
                } catch (FileNotFoundException unused2) {
                    mt0Var = null;
                } catch (Exception e5) {
                    e = e5;
                    mt0Var = null;
                } catch (Throwable th2) {
                    th = th2;
                    gvt.d(null);
                    try {
                        contains.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                    } catch (Exception e6) {
                        Log.w("nt0", "Got unexpected exception when removing events file: ", e6);
                    }
                    throw th;
                }
                if (readObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.PersistedEvents");
                }
                mlkVar = (mlk) readObject;
                gvt.d(mt0Var);
                try {
                    contains.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception e7) {
                    Log.w("nt0", "Got unexpected exception when removing events file: ", e7);
                }
                if (mlkVar == null) {
                    mlkVar = new mlk();
                }
                return mlkVar;
            } catch (Throwable th3) {
                bp6.a(nt0.class, th3);
                return null;
            }
        }
    }

    public static final long K(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    public static final void L(mlk mlkVar) {
        if (bp6.a.contains(nt0.class)) {
            return;
        }
        try {
            Context b2 = j3c.b();
            ObjectOutputStream objectOutputStream = null;
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(b2.openFileOutput("AppEventsLogger.persistedevents", 0)));
                try {
                    objectOutputStream2.writeObject(mlkVar);
                    gvt.d(objectOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    try {
                        Log.w("nt0", "Got unexpected exception while persisting events: ", th);
                        try {
                            b2.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                        } catch (Exception unused) {
                        }
                    } finally {
                        gvt.d(objectOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            bp6.a(nt0.class, th3);
        }
    }

    public static void M(Activity activity, jp0 jp0Var, wn5 wn5Var) {
        boolean M = pd.M();
        boolean M2 = pd.M();
        activity.getClass();
        jp0Var.getClass();
        wn5 wn5Var2 = new wn5(new xu0(1, M), -2001550513, true);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        viewGroup.getClass();
        ixf.I(viewGroup, jp0Var, M2, "unknown", wn5Var2, wn5Var);
    }

    public static void N(o oVar, jp0 jp0Var, wn5 wn5Var) {
        boolean M = pd.M();
        boolean M2 = pd.M();
        wn5 wn5Var2 = new wn5(new xu0(0, M), -1898389680, true);
        ViewGroup viewGroup = (ViewGroup) oVar.requireActivity().findViewById(R.id.content);
        viewGroup.getClass();
        ixf.I(viewGroup, jp0Var, M2, "unknown", wn5Var2, wn5Var);
    }

    public static String O(int i2) {
        Object[] objArr = {Integer.valueOf(Color.red(i2)), Integer.valueOf(Color.green(i2)), Integer.valueOf(Color.blue(i2)), Double.valueOf(Color.alpha(i2) / 255.0d)};
        int i3 = yut.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final ArrayList P(CardsDtoOld cardsDtoOld) {
        String buttonAccentColor;
        Integer R;
        s1u s1uVar;
        se seVar;
        ax3 ax3Var;
        se seVar2;
        String station;
        cardsDtoOld.getClass();
        List<CardDtoOld> cards = cardsDtoOld.getCards();
        if (cards != null) {
            ArrayList arrayList = new ArrayList();
            for (CardDtoOld cardDtoOld : cards) {
                if (cardDtoOld != null) {
                    String backgroundImageUrl = cardDtoOld.getBackgroundImageUrl();
                    if (backgroundImageUrl == null || (buttonAccentColor = cardDtoOld.getButtonAccentColor()) == null || (R = pd.R(buttonAccentColor)) == null) {
                        ax3Var = null;
                    } else {
                        int intValue = R.intValue();
                        VibeButtonCardDto vibeButton = cardDtoOld.getVibeButton();
                        if (vibeButton != null) {
                            String title = vibeButton.getTitle();
                            s1uVar = (title == null || (station = vibeButton.getStation()) == null) ? null : new s1u(title, station, vibeButton.getImageUrl());
                        } else {
                            s1uVar = null;
                        }
                        ActionButtonCardDtoOld actionButton = cardDtoOld.getActionButton();
                        if (actionButton != null) {
                            String title2 = actionButton.getTitle();
                            if (title2 != null) {
                                String coverUrl = actionButton.getCoverUrl();
                                String deeplink = actionButton.getDeeplink();
                                if (deeplink != null) {
                                    seVar2 = new se(title2, coverUrl, deeplink);
                                    seVar = seVar2;
                                }
                            }
                            seVar2 = null;
                            seVar = seVar2;
                        } else {
                            seVar = null;
                        }
                        ax3Var = new ax3(backgroundImageUrl, cardDtoOld.getBackgroundImageDescription(), intValue, s1uVar, seVar);
                    }
                    if (ax3Var != null) {
                        arrayList.add(ax3Var);
                    }
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final long Q(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static final void R(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder l2 = dfi.l("OffsetMapping.originalToTransformed returned invalid mapping: ", i4, i2, " -> ", " is not in range of transformed text [0, ");
        l2.append(i3);
        l2.append(']');
        vme.c(l2.toString());
    }

    public static final void S(int i2, int i3, int i4) {
        boolean z = false;
        if (i2 >= 0 && i2 <= i3) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder l2 = dfi.l("OffsetMapping.transformedToOriginal returned invalid mapping: ", i4, i2, " -> ", " is not in range of original text [0, ");
        l2.append(i3);
        l2.append(']');
        vme.c(l2.toString());
    }

    public static final void b(ka1 ka1Var, gvd gvdVar, fvf fvfVar, ea2 ea2Var, tvd tvdVar, yi1 yi1Var, q0d q0dVar, hq5 hq5Var, int i2) {
        int i3;
        List list;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1210151600);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(ka1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(gvdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(ea2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.f(tvdVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.h(yi1Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.h(q0dVar) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            cpq cpqVar = (cpq) gld.M(yi1Var.k, oq5Var2).getValue();
            boolean d2 = Intrinsics.d(cpqVar, apq.a);
            Object obj = gq5.a;
            if (d2) {
                oq5Var2.Z(-328739470);
                oq5Var2.p(false);
                list = c5b.a;
            } else if (cpqVar instanceof zoq) {
                oq5Var2.Z(-328604744);
                oq5Var2.p(false);
                list = c5b.a;
            } else {
                if (!(cpqVar instanceof bpq)) {
                    throw vz1.i(oq5Var2, -980438950, false);
                }
                oq5Var2.Z(-328472343);
                List list2 = ((bpq) cpqVar).a;
                boolean f2 = oq5Var2.f(list2);
                Object K = oq5Var2.K();
                if (f2 || K == obj) {
                    list2.getClass();
                    K = etn.j0(list2, (nnq) yi1Var.g.getValue(), yi1Var.a);
                    oq5Var2.k0(K);
                }
                list = (List) K;
                oq5Var2.p(false);
            }
            List list3 = list;
            String str = ka1Var.e;
            boolean z = !(str == null || StringsKt.U(str));
            int i4 = ((i3 >> 15) & 112) | ((i3 >> 3) & 14);
            gvdVar.getClass();
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var = ((fs5) K2).a;
            cce cceVar = (cce) oq5Var2.j(tkg.a);
            boolean f3 = ((((i4 & 14) ^ 6) > 4 && oq5Var2.f(gvdVar)) || (i4 & 6) == 4) | oq5Var2.f(q0dVar) | oq5Var2.f(context) | oq5Var2.f(mm6Var) | oq5Var2.f(cceVar) | oq5Var2.g(z);
            Object K3 = oq5Var2.K();
            if (f3 || K3 == obj) {
                Object ha1Var = new ha1(gvdVar, q0dVar, context, mm6Var, cceVar, z);
                oq5Var2.k0(ha1Var);
                K3 = ha1Var;
            }
            WeakHashMap weakHashMap = rqv.w;
            oq5Var = oq5Var2;
            irv.a(zs4.f(oq5Var2), 0.0f, 0.0f, ild.C(-357223580, new nd1(list3, fvfVar, p6g.n(z7l.h(oq5Var2).f, oq5Var2), ea2Var, yi1Var, (ha1) K3, tvdVar, ka1Var, q0dVar, gvdVar, 0), oq5Var2), oq5Var, 3072, 6);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kv(ka1Var, gvdVar, fvfVar, ea2Var, tvdVar, yi1Var, q0dVar, i2, 1);
        }
    }

    public static final void c(aj1 aj1Var, gvd gvdVar, yi1 yi1Var, q0d q0dVar, hq5 hq5Var, int i2) {
        gvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(865336764);
        int i3 = i2 | (oq5Var.f(aj1Var) ? 4 : 2) | (oq5Var.f(gvdVar) ? 32 : 16) | (oq5Var.h(yi1Var) ? 256 : 128) | (oq5Var.h(q0dVar) ? 2048 : 1024);
        vci vciVar = vci.a;
        int i4 = i3 | (oq5Var.f(vciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            float f2 = edo.b;
            tvd e2 = edo.e(a2, null, null, f2, oq5Var, 6);
            WeakHashMap weakHashMap = rqv.w;
            eoe n2 = p6g.n(z7l.h(oq5Var).f, oq5Var);
            boolean c2 = oq5Var.c(f2) | oq5Var.f(n2);
            Object K = oq5Var.K();
            int i5 = 1;
            kjn kjnVar = gq5.a;
            if (c2 || K == kjnVar) {
                K = new mv(n2, i5);
                oq5Var.k0(K);
            }
            ea2 v = u2x.v(a2, (Function1) K, oq5Var);
            yci a3 = a.a(d.c(vciVar, 1.0f), "artist_screen_success");
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, a3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            etn.t(a2, v, oq5Var, 0);
            int i7 = i4 << 9;
            b(aj1Var.a, gvdVar, a2, v, e2, yi1Var, q0dVar, oq5Var, (i4 & 112) | (458752 & i7) | (i7 & 3670016));
            String str = aj1Var.a.b;
            boolean h2 = oq5Var.h(yi1Var);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                m71 m71Var = new m71(0, yi1Var, yi1.class, "onBackClick", "onBackClick()V", 0, 12);
                oq5Var.k0(m71Var);
                K2 = m71Var;
            }
            Function0 function0 = (Function0) ((h9f) K2);
            boolean h3 = oq5Var.h(yi1Var);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                m71 m71Var2 = new m71(0, yi1Var, yi1.class, "onSearchClick", "onSearchClick()V", 0, 13);
                oq5Var.k0(m71Var2);
                K3 = m71Var2;
            }
            Function0 function02 = (Function0) ((h9f) K3);
            boolean h4 = oq5Var.h(yi1Var);
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar) {
                m71 m71Var3 = new m71(0, yi1Var, yi1.class, "onOverflowClick", "onOverflowClick()V", 0, 14);
                oq5Var.k0(m71Var3);
                K4 = m71Var3;
            }
            oq5Var = oq5Var;
            edo.c(e2, str, null, function0, function02, (Function0) ((h9f) K4), f2, oq5Var, 0, 4);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new md1(aj1Var, gvdVar, yi1Var, q0dVar, i2);
        }
    }

    public static final void d(float f2, ugt ugtVar, Function0 function0, Function0 function02, pyc pycVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        Function0 function03;
        oq5 oq5Var;
        yci yciVar2;
        boolean z;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1686997352);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.c(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(ugtVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function03 = function0;
            i3 |= oq5Var2.h(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.h(pycVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3 | 196608;
        if (oq5Var2.P(i4 & 1, (74899 & i4) != 74898)) {
            ynn i5 = irv.i(oq5Var2);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K;
            float f3 = 88;
            vci vciVar = vci.a;
            yci o2 = androidx.compose.foundation.layout.a.o(d.d(d.g(vciVar, f3, 0.0f, 2), 1.0f), 16, 0.0f, 2);
            String str = ugtVar.a;
            String str2 = ugtVar.b;
            yci d2 = androidx.compose.foundation.a.d(o2, uoiVar, null, false, str, new meo(0), function03, 4);
            boolean z2 = ((i4 & 112) == 32) | ((i4 & 57344) == 16384);
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                K2 = new m32(3, pycVar, ugtVar);
                oq5Var2.k0(K2);
            }
            yci a2 = a.a(com.yandex.music.core.ui.compose.a.b(d2, i5, 0L, 0.0f, null, (Function2) K2, 14), "banner_block_banner");
            kfh d3 = ug3.d(b2c.b, false);
            int i6 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d3, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            r(f2, str2 != null, ugtVar.a, ugtVar.d, ugtVar.c, function02, uoiVar, a.a(vciVar, "banner_block_banner_button"), oq5Var2, (i4 & 14) | 14155776 | ((i4 << 6) & 458752));
            oq5Var = oq5Var2;
            if (str2 != null) {
                oq5Var.Z(-23404425);
                ltg.e(qo6.m, ugtVar.b, a.a(d.o(b.a.a(vciVar, b2c.e), 80, f3), "banner_block_image"), null, null, bow.b, null, null, oq5Var, 196614, 216);
                z = false;
            } else {
                z = false;
                oq5Var.Z(-28688096);
            }
            oq5Var.p(z);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new nm2(f2, ugtVar, function0, function02, pycVar, yciVar2, i2);
        }
    }

    public static final void e(hht hhtVar, Function0 function0, Function0 function02, pyc pycVar, yci yciVar, hq5 hq5Var, int i2) {
        Function0 function03;
        pyc pycVar2;
        yci yciVar2;
        hhtVar.getClass();
        function0.getClass();
        function02.getClass();
        pycVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1661671645);
        int i3 = (oq5Var.f(hhtVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            function03 = function0;
            i3 |= oq5Var.h(function03) ? 32 : 16;
        } else {
            function03 = function0;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function02) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            pycVar2 = pycVar;
            i3 |= oq5Var.h(pycVar2) ? 2048 : 1024;
        } else {
            pycVar2 = pycVar;
        }
        int i4 = i3 | 24576;
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            oq5Var.Z(-861374967);
            float max = Math.max(((jx7) oq5Var.j(es5.h)).p(nu0.j().b.c) * 2, 60);
            oq5Var.p(false);
            vci vciVar = vci.a;
            yci a2 = a.a(vciVar, "banner_block");
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
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
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (hhtVar instanceof hgt) {
                oq5Var.Z(1073635175);
                boolean z = ((hgt) hhtVar).a;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new tf2(18);
                    oq5Var.k0(K);
                }
                f(max, z, nfp.a(vciVar, (Function1) K), oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!(hhtVar instanceof ugt)) {
                    throw vz1.i(oq5Var, 1073633839, false);
                }
                oq5Var.Z(1073642044);
                d(max, (ugt) hhtVar, function03, function02, pycVar2, null, oq5Var, (i4 << 3) & 65520);
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tu(i2, 1, hhtVar, function0, function02, pycVar, yciVar2);
        }
    }

    public static final void f(float f2, boolean z, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1727445897);
        int i3 = (oq5Var.c(f2) ? 4 : 2) | i2 | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            ivf.k((i3 >> 3) & 14, 0, oq5Var, a.a(d.d(xp3.u(d.e(androidx.compose.foundation.layout.a.n(yciVar, 16, 14), f2), o5g.G(oq5Var)), 1.0f), "banner_block_placeholder"), z);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new om2(f2, z, yciVar, i2, 0);
        }
    }

    public static final void g(q91 q91Var, yci yciVar, String str, hq5 hq5Var, int i2) {
        q91Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-135742438);
        if ((((oq5Var.f(q91Var) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16) | (oq5Var.f(str) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            j66.p(q91Var.b, ugo.a, a.a(yciVar, "bottom_sheet_circle_grid_item"), null, qo6.d, null, null, ild.C(-1694151732, new ar(14, q91Var, str), oq5Var), oq5Var, 12610560, 96);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new sh1(q91Var, yciVar, str, i2, 11);
        }
    }

    public static final void h(ny3 ny3Var, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        ny3Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1562641183);
        if ((((oq5Var2.h(ny3Var) ? 4 : 2) | i2) & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            yci c2 = d.c(vci.a, 1.0f);
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var2, 54);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var2.Z(1813833846);
            nmj nmjVar = ny3Var.i;
            t tVar = ny3Var.c;
            tmb tmbVar = ny3Var.k;
            boolean h2 = oq5Var2.h(ny3Var);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                K = new ti1(1, ny3Var);
                oq5Var2.k0(K);
            }
            jmj b2 = nmjVar.b((dmj) K, tVar, tmbVar, 1, oq5Var2, 36352);
            oq5Var2.p(false);
            ivf.g(b2, null, false, null, oq5Var2, 0, 14);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new iy3(ny3Var, i2, 0);
        }
    }

    public static final void j(tz5 tz5Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-945727376);
        if ((((oq5Var.h(tz5Var) ? 4 : 2) | i2) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            aqi M = gld.M(tz5Var.m, oq5Var);
            mud O = vnj.O(bcb.a(oq5Var), tz5Var.e, oq5Var);
            ogp.g.e(((yz5) M.getValue()) instanceof uz5, ((yz5) M.getValue()) instanceof wz5, null, oq5Var, 4096, 4);
            yciVar2 = yciVar;
            irv.a(zs4.f(oq5Var), 0.0f, 0.0f, ild.C(-1717501148, new pz5(tz5Var, O, yciVar2, M, 0), oq5Var), oq5Var, 3072, 6);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new qz5(tz5Var, yciVar2, i2, 0);
        }
    }

    public static final void k(int i2, hq5 hq5Var, yci yciVar, w4k w4kVar, String str, Function0 function0) {
        int i3;
        Function0 function02;
        w4k E;
        int i4;
        w4k w4kVar2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2092060119);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            function02 = function0;
            i3 |= oq5Var.h(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            w4kVar2 = w4kVar;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                E = a0g.E(ru.yandex.music.R.drawable.ic_arrow_small_right, 0, oq5Var);
                i4 = i3 & (-7169);
            } else {
                oq5Var.S();
                i4 = i3 & (-7169);
                E = w4kVar;
            }
            oq5Var.q();
            yci k2 = androidx.compose.foundation.a.k(androidx.compose.foundation.a.e(yciVar, false, null, null, function02, 7), true, null);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, k2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ges i6 = nu0.i();
            agr agrVar = eq0.a;
            xcs.b(str, null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, i6, oq5Var, i4 & 14, 0, 65530);
            oq5Var = oq5Var;
            w4k w4kVar3 = E;
            gae.b(w4kVar3, null, null, ((dq0) oq5Var.j(agrVar)).b.b, oq5Var, 48, 4);
            oq5Var.p(true);
            w4kVar2 = w4kVar3;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new gz7(str, function0, yciVar, w4kVar2, i2);
        }
    }

    public static final void m(n9b n9bVar, xbb xbbVar, twu twuVar) {
        n9bVar.getClass();
        xbbVar.getClass();
        n9bVar.a.a(new wn5(new ba1(xbbVar, twuVar, 1), -111559114, true));
    }

    public static final void n(xbb xbbVar, twu twuVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        xbbVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1476251851);
        int i3 = (oq5Var.h(xbbVar) ? 4 : 2) | i2 | (oq5Var.h(twuVar) ? 32 : 16) | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            xp3.f(xbbVar, twuVar, null, oq5Var, (i3 & 112) | (i3 & 14) | 8 | 384, 8);
            yciVar2 = vci.a;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ca1(xbbVar, twuVar, yciVar2, i2, 1);
        }
    }

    public static final void o(fvf fvfVar, sdr sdrVar, Function1 function1, hq5 hq5Var, int i2) {
        sdrVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(161889037);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2 | (oq5Var.f(sdrVar) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nyf lifecycle = ((dzf) oq5Var.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            boolean h2 = oq5Var.h(lifecycle);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new zbb(lifecycle, aqiVar, 1);
                oq5Var.k0(K2);
            }
            gld.k(lifecycle, (Function1) K2, oq5Var);
            if (((Boolean) aqiVar.getValue()).booleanValue()) {
                oq5Var.Z(-411247886);
                y2x.j(fvfVar, ((mtb) sdrVar.getValue()).a, function1, oq5Var, ((i3 << 6) & 57344) | (i3 & 14) | 3456);
            } else {
                oq5Var.Z(-412828235);
            }
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new v48(fvfVar, sdrVar, function1, i2, 10);
        }
    }

    public static final long p(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final void q(String str, jef jefVar, tmb tmbVar, qnq qnqVar, nnq nnqVar, hq5 hq5Var, int i2) {
        str.getClass();
        nnqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-729464091);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(jefVar) ? 32 : 16) | (oq5Var.h(tmbVar) ? 256 : 128) | (oq5Var.h(qnqVar) ? 2048 : 1024) | (oq5Var.f(nnqVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            aqi O = gld.O(jefVar.g, oq5Var);
            aqi P = ldg.P(O, a2, oq5Var);
            u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
            cpq cpqVar = (cpq) gld.M(jefVar.f, oq5Var).getValue();
            ogp.g.e(cpqVar instanceof zoq, cpqVar instanceof apq, null, oq5Var, 4096, 4);
            q7g.r(3078, 6, ild.C(781332799, new bj(str, O, a2, jefVar, P, 22), oq5Var), ild.C(-625001287, new kt4(cpqVar, jefVar, tmbVar, nnqVar, qnqVar, a2, 2), oq5Var), oq5Var, null, false);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new bj(i2, 23, str, jefVar, tmbVar, qnqVar, nnqVar);
        }
    }

    public static final void r(final float f2, final boolean z, final String str, final long j2, final long j3, final Function0 function0, final uoi uoiVar, final yci yciVar, hq5 hq5Var, final int i2) {
        int i3;
        String str2;
        long j4;
        long j5;
        Function0 function02;
        uoi uoiVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1661945859);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.c(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str2 = str;
            i3 |= oq5Var.f(str2) ? 256 : 128;
        } else {
            str2 = str;
        }
        if ((i2 & 3072) == 0) {
            j4 = j2;
            i3 |= oq5Var.e(j4) ? 2048 : 1024;
        } else {
            j4 = j2;
        }
        if ((i2 & 24576) == 0) {
            j5 = j3;
            i3 |= oq5Var.e(j5) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            j5 = j3;
        }
        if ((196608 & i2) == 0) {
            function02 = function0;
            i3 |= oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function02 = function0;
        }
        if ((1572864 & i2) == 0) {
            uoiVar2 = uoiVar;
            i3 |= oq5Var.f(uoiVar2) ? 1048576 : 524288;
        } else {
            uoiVar2 = uoiVar;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if (oq5Var.P(i3 & 1, (4793491 & i3) != 4793490)) {
            p85 b0 = pd.b0(j5);
            float f3 = b0.a;
            float f4 = b0.b + 0.1f;
            if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            float f5 = b0.c - 0.06f;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            int i4 = d85.o;
            final long z2 = mvt.z(f3, f4, f5, 1.0f, 16);
            final String str3 = str2;
            final long j6 = j4;
            final long j7 = j5;
            final Function0 function03 = function02;
            final uoi uoiVar3 = uoiVar2;
            zc4.m(z2, ild.C(-545598675, new Function2() { // from class: lm2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5;
                    float f6;
                    hq5 hq5Var2 = (hq5) obj;
                    int intValue = ((Integer) obj2).intValue();
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                        iz2 iz2Var = b2c.f;
                        yci b2 = androidx.compose.foundation.a.b(d.e(androidx.compose.foundation.layout.a.o(yci.this, 0.0f, 14, 1), f2), j7, o5g.G(oq5Var2));
                        kfh d2 = ug3.d(iz2Var, false);
                        int i6 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                        yci H = vnj.H(oq5Var2, b2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(oq5Var2, d2, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(oq5Var2, l2, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                            ouj.x(i6, oq5Var2, i6, kb5Var3);
                        }
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(oq5Var2, H, kb5Var4);
                        b bVar = b.a;
                        vci vciVar = vci.a;
                        ug3.a(e.a(xp3.u(bVar.b(vciVar), o5g.G(oq5Var2)), uoiVar3, eeo.a(0.0f, 3, z2, false)), oq5Var2, 0);
                        hz2 hz2Var = b2c.l;
                        boolean z3 = z;
                        yci q2 = androidx.compose.foundation.layout.a.q(vciVar, z3 ? 80 : 0, 0.0f, 0.0f, 0.0f, 14);
                        nho a2 = lho.a(qx0.a, hz2Var, oq5Var2, 48);
                        int i7 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                        yci H2 = vnj.H(oq5Var2, q2);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, a2, kb5Var);
                        g0g.U(oq5Var2, l3, kb5Var2);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var2, i7, kb5Var3);
                        }
                        g0g.U(oq5Var2, H2, kb5Var4);
                        ges j8 = nu0.j();
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        yci u = d.u(new LayoutWeightElement(true, 1.0f), hz2Var, true);
                        if (z3) {
                            f6 = 8;
                            i5 = 48;
                        } else {
                            i5 = 48;
                            f6 = 48;
                        }
                        yci q3 = androidx.compose.foundation.layout.a.q(u, f6, 0.0f, 0.0f, 0.0f, 14);
                        Object K = oq5Var2.K();
                        kjn kjnVar = gq5.a;
                        if (K == kjnVar) {
                            K = new tf2(17);
                            oq5Var2.k0(K);
                        }
                        yci a3 = a.a(nfp.b(q3, false, (Function1) K), "banner_block_title");
                        String str4 = str3;
                        long j9 = j6;
                        xv7.j(str4, a3, j9, 0L, 0L, 3, 0L, 2, false, 2, 0, null, j8, oq5Var2, 0, 3120, 55032);
                        yci m2 = d.m(vciVar, i5);
                        Object K2 = oq5Var2.K();
                        if (K2 == kjnVar) {
                            K2 = vz1.h(oq5Var2);
                        }
                        yci a4 = a.a(androidx.compose.foundation.a.d(m2, (uoi) K2, null, false, null, new meo(0), function03, 12), "banner_block_close_button");
                        kfh d3 = ug3.d(iz2Var, false);
                        int i8 = oq5Var2.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                        yci H3 = vnj.H(oq5Var2, a4);
                        oq5Var2.d0();
                        if (oq5Var2.O) {
                            oq5Var2.k(grbVar);
                        } else {
                            oq5Var2.n0();
                        }
                        g0g.U(oq5Var2, d3, kb5Var);
                        g0g.U(oq5Var2, l4, kb5Var2);
                        if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                            ouj.x(i8, oq5Var2, i8, kb5Var3);
                        }
                        g0g.U(oq5Var2, H3, kb5Var4);
                        gae.b(a0g.E(ru.yandex.music.R.drawable.ic_close_mid_24, 0, oq5Var2), rvf.M(ru.yandex.music.R.string.close_content_description, oq5Var2), null, j9, oq5Var2, 0, 4);
                        f1d.u(oq5Var2, true, true, true);
                    } else {
                        oq5Var2.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 48, 0);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: mm2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nt0.r(f2, z, str, j2, j3, function0, uoiVar, yciVar, (hq5) obj, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(ggs ggsVar, pyc pycVar, Throwable th, cg6 cg6Var) {
        ykc ykcVar;
        int i2;
        try {
            if (cg6Var instanceof ykc) {
                ykcVar = (ykc) cg6Var;
                int i3 = ykcVar.l;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ykcVar.l = i3 - Integer.MIN_VALUE;
                    Object obj = ykcVar.k;
                    Object obj2 = nm6.a;
                    i2 = ykcVar.l;
                    if (i2 != 0) {
                        qgg.h0(obj);
                        ykcVar.j = th;
                        ykcVar.l = 1;
                        if (pycVar.invoke(ggsVar, th, ykcVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = ykcVar.j;
                        qgg.h0(obj);
                    }
                    return Unit.a;
                }
            }
            if (i2 != 0) {
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                fob.a(th2, th);
            }
            throw th2;
        }
        ykcVar = new ykc(cg6Var);
        Object obj3 = ykcVar.k;
        Object obj22 = nm6.a;
        i2 = ykcVar.l;
    }

    public static final boolean t(v2q v2qVar, v2q v2qVar2) {
        if (v2qVar2 == null) {
            return false;
        }
        if ((v2qVar instanceof t2q) || (v2qVar instanceof s2q)) {
            return Intrinsics.d(v2qVar, v2qVar2);
        }
        if (!(v2qVar instanceof u2q)) {
            b6e.s();
            return false;
        }
        zvs zvsVar = ((u2q) v2qVar).b;
        u2q u2qVar = v2qVar2 instanceof u2q ? (u2q) v2qVar2 : null;
        return zvsVar.equals(u2qVar != null ? u2qVar.b : null);
    }

    public static final ukd u(ukd ukdVar, od odVar) {
        return ukdVar.d(new jg(odVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AnimatorSet v(bm4 bm4Var, float f2, float f3, float f4) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(bm4Var, yl4.a, xl4.b, new am4(f2, f3, f4));
        am4 revealInfo = bm4Var.getRevealInfo();
        if (revealInfo == null) {
            xq0.q("Caller must set a non-null RevealInfo before calling this.");
            return null;
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) bm4Var, (int) f2, (int) f3, revealInfo.c, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofObject, createCircularReveal);
        return animatorSet;
    }

    public static m7d w(String str, String str2) {
        Exception q2;
        str.getClass();
        try {
            sad sadVar = new sad(new o2(26), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                q2 = hld.q(new o2(0), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                q2 = hld.q(new o2(1), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                q2 = hld.q(new o2(2), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                q2 = hld.q(new o2(3), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                q2 = hld.q(new o2(4), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                q2 = hld.q(new o2(5), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                q2 = hld.q(new o2(6), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                q2 = hld.q(new o2(7), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                q2 = hld.q(new o2(8), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                q2 = hld.q(new o2(9), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                q2 = hld.q(new o2(10), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                q2 = hld.q(new o2(11), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                q2 = hld.q(new o2(12), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                q2 = hld.q(new o2(13), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                q2 = hld.q(new o2(14), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                q2 = hld.q(new o2(15), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                q2 = hld.q(new o2(16), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                q2 = hld.q(new o2(17), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                q2 = hld.q(new o2(18), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                q2 = hld.q(new o2(19), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                q2 = hld.q(new o2(20), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                q2 = hld.q(new o2(21), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                q2 = hld.q(new o2(22), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                q2 = hld.q(new o2(23), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                q2 = hld.q(new o2(24), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                q2 = hld.q(new o2(25), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                q2 = hld.q(new o2(26), str2, sadVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                q2 = hld.q(new o2(27), str2, sadVar);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new uvc();
                }
                q2 = hld.q(new o2(28), str2, sadVar);
            }
            return (m7d) q2;
        } catch (uvc unused) {
            return new l7d(str2, str);
        }
    }

    public static /* synthetic */ Object z(nt0 nt0Var, jc8 jc8Var, e23 e23Var, pm9 pm9Var, List list, pr8 pr8Var, int i2) {
        if ((i2 & 16) != 0) {
            pr8Var = null;
        }
        return nt0Var.y(jc8Var, e23Var, pm9Var, list, pr8Var, null);
    }

    public Object T(db8 db8Var, e23 e23Var, pm9 pm9Var) {
        return z(this, db8Var, e23Var, pm9Var, db8Var.c.q, null, 48);
    }

    public Object U(ob8 ob8Var, e23 e23Var, pm9 pm9Var) {
        dm9 dm9Var = ob8Var.c;
        List<cm9> list = dm9Var.I;
        String str = dm9Var.p;
        if (str == null && (str = dm9Var.x) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        for (cm9 cm9Var : list) {
            pm9 a2 = cm9Var.c == null ? null : pm9Var.a(str, cm9Var, cm9Var.d);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jc8 jc8Var = ((cm9) it.next()).c;
            if (jc8Var != null) {
                arrayList2.add(jc8Var);
            }
        }
        return y(ob8Var, e23Var, pm9Var, arrayList2, null, arrayList);
    }

    public Object V(sb8 sb8Var, e23 e23Var, pm9 pm9Var) {
        return x(sb8Var, e23Var, pm9Var);
    }

    public Object W(jc8 jc8Var, e23 e23Var, pm9 pm9Var) {
        e23 a2 = e23Var.a(e23Var.a.getRuntimeStore$div_release().h(jc8Var, e23Var.b, pm9Var.c()).a);
        if (jc8Var instanceof rb8) {
            return x((rb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof hb8) {
            return x((hb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof fb8) {
            return x((fb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof mb8) {
            return x((mb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof cb8) {
            cb8 cb8Var = (cb8) jc8Var;
            jt8 jt8Var = cb8Var.c;
            return z(this, cb8Var, a2, pm9Var, jt8Var.B, jt8Var.z, 32);
        }
        if (jc8Var instanceof gb8) {
            gb8 gb8Var = (gb8) jc8Var;
            return z(this, gb8Var, a2, pm9Var, gb8Var.c.y, null, 48);
        }
        if (jc8Var instanceof eb8) {
            eb8 eb8Var = (eb8) jc8Var;
            s09 s09Var = eb8Var.c;
            return z(this, eb8Var, a2, pm9Var, s09Var.u, s09Var.s, 32);
        }
        if (jc8Var instanceof kb8) {
            kb8 kb8Var = (kb8) jc8Var;
            eb9 eb9Var = kb8Var.c;
            return z(this, kb8Var, a2, pm9Var, eb9Var.t, eb9Var.r, 32);
        }
        if (jc8Var instanceof qb8) {
            qb8 qb8Var = (qb8) jc8Var;
            List list = qb8Var.c.q;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ro9) it.next()).a);
            }
            return z(this, qb8Var, a2, pm9Var, arrayList, null, 48);
        }
        if (jc8Var instanceof ob8) {
            return U((ob8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof db8) {
            return T((db8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof ib8) {
            return x((ib8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof nb8) {
            return x((nb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof jb8) {
            return x((jb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof lb8) {
            return x((lb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof sb8) {
            return V((sb8) jc8Var, a2, pm9Var);
        }
        if (jc8Var instanceof pb8) {
            return x((pb8) jc8Var, a2, pm9Var);
        }
        b6e.s();
        return null;
    }

    public void X(rv8 rv8Var, e23 e23Var) {
        for (qv8 qv8Var : rv8Var.c) {
            jc8 jc8Var = qv8Var.a;
            long j2 = qv8Var.b;
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            dp8 d2 = jc8Var.d();
            String H = d2 instanceof dm9 ? wvo.H((dm9) d2) : d2.getId();
            sb.append(H != null ? StringUtils.PROCESS_POSTFIX_DELIMITER.concat(H) : "");
            W(jc8Var, e23Var, new pm9(c5b.a, 8, t75.c(sb.toString()), j2));
        }
    }

    public abstract Unit x(jc8 jc8Var, e23 e23Var, pm9 pm9Var);

    public Object y(jc8 jc8Var, e23 e23Var, pm9 pm9Var, List list, pr8 pr8Var, ArrayList arrayList) {
        pm9 b2;
        zzb zzbVar;
        xzb xzbVar = e23Var.b;
        Unit x = x(jc8Var, e23Var, pm9Var);
        int i2 = 0;
        if (pr8Var != null) {
            gc8 gc8Var = e23Var.a;
            ArrayList w = qwp.w(pr8Var, xzbVar);
            ArrayList K = wvo.K(w, gd9.u, gd9.v);
            Iterator it = w.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    u75.n();
                    throw null;
                }
                k79 k79Var = (k79) next;
                pm9 b3 = pm9Var.b((String) K.get(i2));
                qjo runtimeStore$div_release = gc8Var.getRuntimeStore$div_release();
                jc8 jc8Var2 = k79Var.a;
                xzb xzbVar2 = k79Var.b;
                d0c j2 = runtimeStore$div_release.j(b3, jc8Var2, xzbVar2, xzbVar);
                if (j2 != null && (zzbVar = j2.a) != null) {
                    xzbVar2 = zzbVar;
                }
                W(k79Var.a, new e23(gc8Var, xzbVar2), b3);
                i2 = i3;
            }
        } else if (list != null) {
            ArrayList K2 = wvo.K(list, gd9.s, gd9.t);
            for (Object obj : list) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    u75.n();
                    throw null;
                }
                jc8 jc8Var3 = (jc8) obj;
                if (arrayList == null || (b2 = (pm9) arrayList.get(i2)) == null) {
                    b2 = pm9Var.b((String) K2.get(i2));
                }
                W(jc8Var3, e23Var, b2);
                i2 = i4;
            }
        }
        return x;
    }
}
