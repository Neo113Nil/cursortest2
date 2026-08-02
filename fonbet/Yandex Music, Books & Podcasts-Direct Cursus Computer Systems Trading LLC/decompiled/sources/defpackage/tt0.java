package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.draw.a;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.material.appbar.AppBarLayout;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceType;

/* loaded from: classes.dex */
public abstract class tt0 {
    public static final wn5 h;
    public static final wn5 k;
    public static final wn5 l;
    public static final lc8 m;
    public static final Object n;
    public static final int[] o;
    public static final int[] a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] d = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] e = {R.attr.drawable};
    public static final int[] f = {R.attr.name, R.attr.animation};
    public static final wn5 g = new wn5(new go5(9), -1216141319, false);
    public static final wn5 i = new wn5(new go5(11), 105694001, false);
    public static final wn5 j = new wn5(new go5(12), -288709838, false);

    static {
        int i2 = 10;
        h = new wn5(new go5(i2), 500097840, false);
        int i3 = 18;
        new wn5(new fo5(i3), 1155247505, false);
        k = new wn5(new lo5(i3), 1879752203, false);
        l = new wn5(new zo5(i2), 643363415, false);
        m = new lc8(10);
        n = new Object();
        o = new int[]{R.attr.stateListAnimator};
    }

    public static final yci A(yci yciVar, pj2 pj2Var, Function0 function0, Function0 function02, boolean z, boolean z2, f83 f83Var) {
        yciVar.getClass();
        pj2Var.getClass();
        function0.getClass();
        function02.getClass();
        f83Var.getClass();
        if (Build.VERSION.SDK_INT < 32 || f83Var == e83.a) {
            return a.a(yciVar, new epa(pj2Var, z, function02, function0, 0));
        }
        long j2 = d85.f;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        return f83Var.a(yciVar, z2 ? y9w.U(new Pair[]{new Pair(valueOf2, new d85(j2)), new Pair(Float.valueOf(0.95f), new d85(j2)), new Pair(valueOf, new d85(d85.m))}, 14) : y9w.U(new Pair[]{new Pair(valueOf2, new d85(d85.m)), new Pair(Float.valueOf(0.05f), new d85(j2)), new Pair(valueOf, new d85(j2))}, 14), new tka(2));
    }

    public static void B(String str, zcd zcdVar) {
        String replace;
        synchronized (n) {
            Throwable th = zcdVar;
            while (true) {
                if (th == null) {
                    replace = Log.getStackTraceString(zcdVar).trim().replace(StringUtil.TAB, "    ");
                    break;
                }
                try {
                    if (th instanceof UnknownHostException) {
                        replace = "UnknownHostException (no network)";
                    } else {
                        th = th.getCause();
                    }
                } finally {
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder m2 = tlm.m(str, "\n  ");
            m2.append(replace.replace(StringUtil.LF, "\n  "));
            m2.append('\n');
            str = m2.toString();
        }
        synchronized (n) {
            Log.e("SceneRenderer", str);
        }
    }

    public static final String C(int i2) {
        htr htrVar;
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        return ot0.B(i2, htrVar.c);
    }

    public static final String D(int i2) {
        htr htrVar;
        quk qukVar = htr.f;
        String language = swf.I().getLanguage();
        language.getClass();
        qukVar.getClass();
        int hashCode = language.hashCode();
        if (hashCode == 3424) {
            if (language.equals("kk")) {
                htrVar = htr.j;
            }
            htrVar = htr.g;
        } else if (hashCode != 3651) {
            if (hashCode == 3749 && language.equals("uz")) {
                htrVar = htr.i;
            }
            htrVar = htr.g;
        } else {
            if (language.equals("ru")) {
                htrVar = htr.h;
            }
            htrVar = htr.g;
        }
        return ot0.C(i2, htrVar.c);
    }

    public static final Activity E(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            b6e.l(context, "Unknown view context ");
            return null;
        }
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        b6e.l(context, "Unknown view context ");
        return null;
    }

    public static final float F(hq5 hq5Var) {
        WeakHashMap weakHashMap = rqv.w;
        return Math.max(w1g.p(nu0.i(), 2, hq5Var, 48, 0), 48) + p6g.n(z7l.h(hq5Var).f, hq5Var).d();
    }

    public static final Intent G(od odVar, e9t e9tVar, int i2, Function1 function1) {
        int i3 = e9tVar.b;
        if (odVar instanceof hjo) {
            int i4 = ActionCallbackBroadcastReceiver.a;
            return ot0.r(pd.A(e9tVar.a, i3, (mg) function1.invoke(((hjo) odVar).a)), e9tVar, i2);
        }
        if (!(odVar instanceof vif)) {
            b6e.l(odVar, "Cannot create fill-in Intent for action type: ");
            return null;
        }
        ComponentName componentName = e9tVar.n;
        if (componentName != null) {
            return ot0.r(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i3), e9tVar, i2);
        }
        xq0.x("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        return null;
    }

    public static final PendingIntent H(od odVar, e9t e9tVar, int i2, Function1 function1) {
        int i3 = e9tVar.b;
        Context context = e9tVar.a;
        if (odVar instanceof hjo) {
            int i4 = ActionCallbackBroadcastReceiver.a;
            Intent A = pd.A(context, i3, (mg) function1.invoke(((hjo) odVar).a));
            A.setData(ot0.y(e9tVar, i2, 5, ""));
            return PendingIntent.getBroadcast(context, 0, A, 201326592);
        }
        if (!(odVar instanceof vif)) {
            b6e.l(odVar, "Cannot create PendingIntent for action type: ");
            return null;
        }
        ComponentName componentName = e9tVar.n;
        if (componentName == null) {
            xq0.x("In order to use LambdaAction, actionBroadcastReceiver must be provided");
            return null;
        }
        Intent putExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i3);
        putExtra.setData(ot0.y(e9tVar, i2, 5, null));
        return PendingIntent.getBroadcast(context, 0, putExtra, 201326592);
    }

    public static final int I(e09 e09Var, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i2 = e09Var == null ? -1 : my9.a[e09Var.ordinal()];
        if (i2 == 1) {
            return 300;
        }
        if (i2 == 2) {
            return 400;
        }
        if (i2 != 3) {
            return i2 != 4 ? 400 : 700;
        }
        return 500;
    }

    public static int J(int i2, int i3, int i4) {
        if ((i3 & 8) != 0) {
            i2--;
        }
        if (i4 <= i2) {
            return i2 - i4;
        }
        kac.f(f1d.e(i4, i2, "PROTOCOL_ERROR padding ", " > remaining length "));
        return 0;
    }

    public static final void K(ysr ysrVar, um4 um4Var) {
        String l2 = um4Var.l();
        Object[] j2 = um4Var.j();
        ysrVar.d = l2;
        ysrVar.e = j2;
    }

    public static void L(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(ru.yandex.music.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, ru.yandex.music.R.attr.state_liftable, -ru.yandex.music.R.attr.state_lifted}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static final c01 M(zd1 zd1Var) {
        zd1Var.getClass();
        String str = zd1Var.c;
        String str2 = zd1Var.a;
        int i2 = zd1Var.g;
        int i3 = zd1Var.f;
        Integer num = zd1Var.l;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = zd1Var.m;
        int intValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = zd1Var.k;
        a01 a01Var = new a01(i2, i3, -1, 0, intValue, intValue2, num3 != null ? num3.intValue() : 0);
        String str3 = zd1Var.d;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        CoverPath x = men.x(str3, webPath$Storage);
        CoverPath x2 = men.x(zd1Var.e, webPath$Storage);
        List B = q7g.B(zd1Var.h);
        B.getClass();
        c01 c01Var = new c01(str, str2, false, zd1Var.i, null, 0, a01Var, x, x2, B, q7g.P(zd1Var.j), false, 37356);
        tfs tfsVar = wc7.a;
        c01Var.r = wc7.a.b(zd1Var.b);
        return c01Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(hwl hwlVar, zii ziiVar, w70 w70Var, sy7 sy7Var, cg6 cg6Var) {
        zj6 zj6Var;
        int i2;
        eul eulVar;
        int i3;
        hwl hwlVar2;
        Object o2;
        String str;
        zii ziiVar2 = ziiVar;
        w70 w70Var2 = w70Var;
        if (cg6Var instanceof zj6) {
            zj6Var = (zj6) cg6Var;
            int i4 = zj6Var.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zj6Var.p = i4 - Integer.MIN_VALUE;
                Object obj = zj6Var.o;
                nm6 nm6Var = nm6.a;
                i2 = zj6Var.p;
                r7 = null;
                klu kluVar = null;
                if (i2 != 0) {
                    qgg.h0(obj);
                    if (ziiVar2 instanceof qii) {
                        qii qiiVar = (qii) ziiVar2;
                        ArrayList arrayList = qiiVar.b;
                        lt ltVar = qiiVar.a;
                        if (qiiVar.c) {
                            return new zji(vnj.t(ltVar, arrayList), ltVar, w70Var2);
                        }
                        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(ghh.M((u51) it.next()));
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                        String L = arrayList2 != null ? xp3.L(arrayList2, c5b.a) : null;
                        return new gki(new w48(qo6.b, ltVar.c, L, L, 8), w70Var2, ltVar.a);
                    }
                    if (ziiVar2 instanceof rii) {
                        rii riiVar = (rii) ziiVar2;
                        u51 u51Var = riiVar.a;
                        if (!riiVar.b) {
                            return new hki(new w48(qo6.d, u51Var.b, null, null, 28), w70Var2, u51Var.a);
                        }
                        u9b u9bVar = u51Var.c;
                        if (u9bVar == null || (str = u9bVar.e(wct.s(), WebPath$Storage.AVATARS)) == null) {
                            str = "";
                        }
                        return new aki(new jd1(str, u51Var.b, false, null), u51Var, w70Var2);
                    }
                    if (!(ziiVar2 instanceof tii)) {
                        boolean z = ziiVar2 instanceof yii;
                        r9p r9pVar = r9p.a;
                        if (z) {
                            yii yiiVar = (yii) ziiVar2;
                            dou douVar = yiiVar.a;
                            String str2 = douVar.c;
                            String str3 = !douVar.b.equals(new s9p(t75.c(r9pVar))) ? douVar.d : null;
                            String str4 = yiiVar.c;
                            euu euuVar = new euu(str2, str3, str4 != null ? new jcv(str4, WebPath$Storage.AVATARS).getPathForSize(wct.s()) : null, c3x.f(yiiVar.d));
                            np npVar = yiiVar.b;
                            if (npVar != null) {
                                op opVar = npVar.b;
                                String str5 = douVar.c;
                                String str6 = douVar.d;
                                String pathForSize = new jcv(opVar.a, WebPath$Storage.AVATARS).getPathForSize(wct.s());
                                String str7 = npVar.a;
                                Integer R = pd.R(opVar.b);
                                if (R != null) {
                                    kluVar = new klu(str5, str6, pathForSize, str7, R.intValue(), npVar.c);
                                }
                            }
                            return new eki(euuVar, kluVar, douVar, w70Var2);
                        }
                        if (ziiVar2 instanceof sii) {
                            sii siiVar = (sii) ziiVar2;
                            dou douVar2 = siiVar.a;
                            String str8 = douVar2.c;
                            String str9 = douVar2.d;
                            if (douVar2.b.equals(new s9p(t75.c(r9pVar)))) {
                                str9 = null;
                            }
                            String str10 = siiVar.b;
                            return new bki(new rhi(str8, str9, str10 != null ? new jcv(str10, WebPath$Storage.AVATARS).getPathForSize(wct.s()) : null), douVar2, w70Var2);
                        }
                        if (ziiVar2 instanceof uii) {
                            n7n n7nVar = ((uii) ziiVar2).a;
                            return new dki(q7g.x(n7nVar), n7nVar, w70Var2);
                        }
                        if (Intrinsics.d(ziiVar2, wii.a)) {
                            return lki.a;
                        }
                        if (Intrinsics.d(ziiVar2, vii.a)) {
                            return kki.a;
                        }
                        b6e.s();
                        return null;
                    }
                    tii tiiVar = (tii) ziiVar2;
                    eulVar = tiiVar.a;
                    if (!tiiVar.c) {
                        hwlVar.getClass();
                        return new iki(new w48(qo6.e, eulVar.c, null, null, 28), w70Var2, eulVar.f);
                    }
                    i3 = tiiVar.b;
                    nvl d2 = eulVar.d();
                    zj6Var.j = w70Var2;
                    zj6Var.k = tiiVar;
                    hwlVar2 = hwlVar;
                    zj6Var.l = hwlVar2;
                    zj6Var.m = eulVar;
                    zj6Var.n = i3;
                    zj6Var.p = 1;
                    o2 = ((t3g) ((u3g) sy7Var.a.getValue())).o(d2, zj6Var);
                    if (o2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = zj6Var.n;
                    eul eulVar2 = zj6Var.m;
                    hwl hwlVar3 = zj6Var.l;
                    tii tiiVar2 = zj6Var.k;
                    w70 w70Var3 = zj6Var.j;
                    qgg.h0(obj);
                    i3 = i5;
                    ziiVar2 = tiiVar2;
                    eulVar = eulVar2;
                    w70Var2 = w70Var3;
                    o2 = obj;
                    hwlVar2 = hwlVar3;
                }
                return new cki(hwlVar2.a(eulVar, i3, ((Boolean) o2).booleanValue(), null), ((tii) ziiVar2).a, w70Var2);
            }
        }
        zj6Var = new zj6(cg6Var);
        Object obj2 = zj6Var.o;
        nm6 nm6Var2 = nm6.a;
        i2 = zj6Var.p;
        kluVar = null;
        klu kluVar2 = null;
        if (i2 != 0) {
        }
        return new cki(hwlVar2.a(eulVar, i3, ((Boolean) o2).booleanValue(), null), ((tii) ziiVar2).a, w70Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r0v44, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x01fe -> B:10:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f9 -> B:14:0x0165). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object O(List list, d20 d20Var, no6 no6Var, hwl hwlVar, sy7 sy7Var, p1i p1iVar, d6h d6hVar, cg6 cg6Var) {
        ak6 ak6Var;
        int i2;
        int i3;
        Throwable th;
        sy7 sy7Var2;
        p1i p1iVar2;
        d6h d6hVar2;
        ArrayList q;
        ak6 ak6Var2;
        n8g b2;
        n8g n8gVar;
        Iterator it;
        int i4;
        int i5;
        int i6;
        d20 d20Var2;
        no6 no6Var2;
        hwl hwlVar2;
        if (cg6Var instanceof ak6) {
            ak6Var = (ak6) cg6Var;
            int i7 = ak6Var.X;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ak6Var.X = i7 - Integer.MIN_VALUE;
                Object obj = ak6Var.L;
                nm6 nm6Var = nm6.a;
                i2 = ak6Var.X;
                if (i2 != 0) {
                    i3 = 1;
                    th = null;
                    sy7Var2 = sy7Var;
                    p1iVar2 = p1iVar;
                    d6hVar2 = d6hVar;
                    q = su4.q(obj);
                    ak6Var2 = ak6Var;
                    b2 = t75.b();
                    n8gVar = b2;
                    it = list.iterator();
                    i4 = 0;
                    i5 = 0;
                    i6 = 0;
                    d20Var2 = d20Var;
                    no6Var2 = no6Var;
                    hwlVar2 = hwlVar;
                    List list2 = list;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = ak6Var.K;
                    int i9 = ak6Var.J;
                    int i10 = ak6Var.I;
                    int i11 = ak6Var.H;
                    int i12 = ak6Var.G;
                    int i13 = ak6Var.F;
                    int i14 = ak6Var.E;
                    int i15 = ak6Var.D;
                    int i16 = ak6Var.C;
                    int i17 = ak6Var.B;
                    th = null;
                    List list3 = ak6Var.A;
                    Iterator it2 = ak6Var.z;
                    d20 d20Var3 = ak6Var.y;
                    Object obj2 = obj;
                    no6 no6Var3 = ak6Var.x;
                    hwl hwlVar3 = ak6Var.w;
                    t80 t80Var = ak6Var.v;
                    imi imiVar = ak6Var.u;
                    Iterator it3 = ak6Var.t;
                    List list4 = ak6Var.s;
                    List list5 = ak6Var.r;
                    ArrayList arrayList = ak6Var.q;
                    List list6 = ak6Var.p;
                    ?? r0 = ak6Var.o;
                    p1i p1iVar3 = ak6Var.n;
                    sy7 sy7Var3 = ak6Var.m;
                    hwl hwlVar4 = ak6Var.l;
                    no6 no6Var4 = ak6Var.k;
                    d20 d20Var4 = ak6Var.j;
                    qgg.h0(obj2);
                    Iterator it4 = it3;
                    n8g n8gVar2 = list5;
                    ak6 ak6Var3 = ak6Var;
                    int i18 = i12;
                    int i19 = i13;
                    int i20 = i15;
                    int i21 = i17;
                    int i22 = 1;
                    hwl hwlVar5 = hwlVar3;
                    t80 t80Var2 = t80Var;
                    d20 d20Var5 = d20Var4;
                    Iterator it5 = it2;
                    int i23 = i14;
                    n8g n8gVar3 = list4;
                    nm6 nm6Var2 = nm6Var;
                    d20 d20Var6 = d20Var3;
                    int i24 = i16;
                    no6 no6Var5 = no6Var4;
                    n8g n8gVar4 = list3;
                    sy7 sy7Var4 = sy7Var3;
                    imi imiVar2 = imiVar;
                    d6h d6hVar3 = r0;
                    no6 no6Var6 = no6Var3;
                    n8gVar4.addAll((Collection) obj2);
                    if (i8 != imiVar2.b.size() - 1) {
                        n8gVar3.add(oki.a);
                    }
                    n8g n8gVar5 = n8gVar3;
                    imi imiVar3 = imiVar2;
                    int i25 = i10;
                    int i26 = i11;
                    t80 t80Var3 = t80Var2;
                    d20 d20Var7 = d20Var5;
                    no6 no6Var7 = no6Var5;
                    hwl hwlVar6 = hwlVar5;
                    ArrayList arrayList2 = arrayList;
                    list = list6;
                    no6 no6Var8 = no6Var6;
                    p1i p1iVar4 = p1iVar3;
                    d6h d6hVar4 = d6hVar3;
                    hwl hwlVar7 = hwlVar4;
                    sy7 sy7Var5 = sy7Var4;
                    int i27 = i21;
                    n8g n8gVar6 = n8gVar2;
                    ak6 ak6Var4 = ak6Var3;
                    Iterator it6 = it4;
                    int i28 = i18;
                    int i29 = i19;
                    nm6 nm6Var3 = nm6Var2;
                    d20 d20Var8 = d20Var6;
                    Iterator it7 = it5;
                    i3 = i22;
                    int i30 = i9;
                    int i31 = i23;
                    int i32 = i20;
                    if (it7.hasNext()) {
                        Object next = it7.next();
                        int i33 = i31;
                        i9 = i30 + 1;
                        if (i30 < 0) {
                            u75.n();
                            throw th;
                        }
                        kji kjiVar = (kji) next;
                        i20 = i32;
                        int i34 = i24;
                        w70 w70Var = new w70(t80Var3, i33 + 1, i9);
                        ak6Var4.getClass();
                        ak6 ak6Var5 = ak6Var4;
                        ak6Var5.j = d20Var7;
                        ak6Var5.k = no6Var7;
                        ak6Var5.l = hwlVar7;
                        ak6Var5.m = sy7Var5;
                        sy7Var4 = sy7Var5;
                        ak6Var5.n = p1iVar4;
                        ak6Var5.o = d6hVar4;
                        ak6Var5.p = list;
                        ak6Var5.q = arrayList2;
                        ak6Var5.r = n8gVar6;
                        n8g n8gVar7 = n8gVar5;
                        ak6Var5.s = n8gVar7;
                        ak6Var5.t = it6;
                        ak6Var5.u = imiVar3;
                        ak6Var5.v = t80Var3;
                        ak6Var5.w = hwlVar6;
                        ak6Var5.x = no6Var8;
                        ak6Var5.y = d20Var8;
                        ak6Var5.z = it7;
                        ak6Var5.A = n8gVar7;
                        ak6Var5.B = i27;
                        ak6Var5.C = i34;
                        ak6Var5.D = i20;
                        ak6Var5.E = i33;
                        it4 = it6;
                        ak6Var5.F = i29;
                        ak6Var5.G = i28;
                        ak6Var5.H = i26;
                        ak6Var5.I = i25;
                        ak6Var5.J = i9;
                        ak6Var5.K = i30;
                        int i35 = i3;
                        ak6Var5.X = i35;
                        d20 d20Var9 = d20Var8;
                        no6Var6 = no6Var8;
                        hwl hwlVar8 = hwlVar6;
                        Object P = P(d20Var9, no6Var6, hwlVar8, kjiVar, w70Var, sy7Var4, ak6Var4);
                        nm6Var2 = nm6Var3;
                        if (P == nm6Var2) {
                            return nm6Var2;
                        }
                        n8g n8gVar8 = n8gVar6;
                        obj2 = P;
                        i24 = i34;
                        i18 = i28;
                        n8gVar2 = n8gVar8;
                        arrayList = arrayList2;
                        i11 = i26;
                        i23 = i33;
                        d20Var5 = d20Var7;
                        hwlVar4 = hwlVar7;
                        it5 = it7;
                        d6hVar3 = d6hVar4;
                        d20Var6 = d20Var9;
                        i19 = i29;
                        list6 = list;
                        n8gVar3 = n8gVar5;
                        n8gVar4 = n8gVar3;
                        t80Var2 = t80Var3;
                        no6Var5 = no6Var7;
                        ak6Var3 = ak6Var4;
                        i10 = i25;
                        imiVar2 = imiVar3;
                        i21 = i27;
                        hwlVar5 = hwlVar8;
                        p1iVar3 = p1iVar4;
                        i8 = i30;
                        i22 = i35;
                        n8gVar4.addAll((Collection) obj2);
                        if (i8 != imiVar2.b.size() - 1) {
                        }
                        n8g n8gVar52 = n8gVar3;
                        imi imiVar32 = imiVar2;
                        int i252 = i10;
                        int i262 = i11;
                        t80 t80Var32 = t80Var2;
                        d20 d20Var72 = d20Var5;
                        no6 no6Var72 = no6Var5;
                        hwl hwlVar62 = hwlVar5;
                        ArrayList arrayList22 = arrayList;
                        list = list6;
                        no6 no6Var82 = no6Var6;
                        p1i p1iVar42 = p1iVar3;
                        d6h d6hVar42 = d6hVar3;
                        hwl hwlVar72 = hwlVar4;
                        sy7 sy7Var52 = sy7Var4;
                        int i272 = i21;
                        n8g n8gVar62 = n8gVar2;
                        ak6 ak6Var42 = ak6Var3;
                        Iterator it62 = it4;
                        int i282 = i18;
                        int i292 = i19;
                        nm6 nm6Var32 = nm6Var2;
                        d20 d20Var82 = d20Var6;
                        Iterator it72 = it5;
                        i3 = i22;
                        int i302 = i9;
                        int i312 = i23;
                        int i322 = i20;
                        if (it72.hasNext()) {
                            sy7 sy7Var6 = sy7Var52;
                            Iterator it8 = it62;
                            int i36 = i24;
                            int i37 = i322;
                            int i38 = i3;
                            nm6 nm6Var4 = nm6Var32;
                            if (i312 != u75.g(list)) {
                                n8gVar = n8gVar52;
                                n8gVar.add(pki.a);
                            } else {
                                n8gVar = n8gVar52;
                            }
                            i3 = i38;
                            d20Var2 = d20Var72;
                            nm6Var = nm6Var4;
                            no6Var2 = no6Var72;
                            hwlVar2 = hwlVar72;
                            d6hVar2 = d6hVar42;
                            i5 = i272;
                            b2 = n8gVar62;
                            sy7Var2 = sy7Var6;
                            ak6Var2 = ak6Var42;
                            it = it8;
                            i4 = i37;
                            i6 = i36;
                            p1iVar2 = p1iVar42;
                            q = arrayList22;
                            List list22 = list;
                            if (it.hasNext()) {
                                return new hli(t75.a(b2), q);
                            }
                            Object next2 = it.next();
                            int i39 = i4 + 1;
                            if (i4 < 0) {
                                u75.n();
                                throw th;
                            }
                            list = list22;
                            imi imiVar4 = (imi) next2;
                            d20 d20Var10 = d20Var2;
                            vki vkiVar = (vki) p1iVar2.invoke(imiVar4.a);
                            n8gVar.add(vkiVar);
                            no6 no6Var9 = no6Var2;
                            hwl hwlVar9 = hwlVar2;
                            t80 t80Var4 = (t80) d6hVar2.invoke(imiVar4.a, new Integer(i4));
                            sy7 sy7Var7 = sy7Var2;
                            q.add(new v0s(n8gVar.size() - 1, vkiVar, t80Var4));
                            Iterator it9 = it;
                            it72 = imiVar4.b.iterator();
                            it62 = it9;
                            nm6Var32 = nm6Var;
                            i24 = i6;
                            i272 = i5;
                            d6hVar42 = d6hVar2;
                            i312 = i4;
                            i322 = i39;
                            d20Var72 = d20Var10;
                            t80Var32 = t80Var4;
                            ak6Var42 = ak6Var2;
                            n8gVar62 = b2;
                            i252 = 0;
                            i262 = 0;
                            i282 = 0;
                            i292 = 0;
                            no6Var82 = no6Var9;
                            hwlVar72 = hwlVar9;
                            imiVar32 = imiVar4;
                            p1iVar42 = p1iVar2;
                            d20Var82 = d20Var72;
                            sy7Var52 = sy7Var7;
                            arrayList22 = q;
                            n8gVar52 = n8gVar;
                            i302 = 0;
                            no6Var72 = no6Var82;
                            hwlVar62 = hwlVar72;
                            if (it72.hasNext()) {
                            }
                        }
                    }
                }
            }
        }
        ak6Var = new ak6(cg6Var);
        Object obj3 = ak6Var.L;
        nm6 nm6Var5 = nm6.a;
        i2 = ak6Var.X;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(d20 d20Var, no6 no6Var, hwl hwlVar, kji kjiVar, w70 w70Var, sy7 sy7Var, cg6 cg6Var) {
        ck6 ck6Var;
        int i2;
        pz0 pz0Var;
        pz0 pz0Var2;
        w70 w70Var2;
        kji kjiVar2;
        no6 no6Var2;
        d20 d20Var2;
        kji kjiVar3;
        pz0 pz0Var3;
        pz0 pz0Var4;
        w70 w70Var3;
        kji kjiVar4;
        no6 no6Var3;
        d20 d20Var3;
        kji kjiVar5;
        if (cg6Var instanceof ck6) {
            ck6Var = (ck6) cg6Var;
            int i3 = ck6Var.r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ck6Var.r = i3 - Integer.MIN_VALUE;
                Object obj = ck6Var.q;
                nm6 nm6Var = nm6.a;
                i2 = ck6Var.r;
                if (i2 == 0) {
                    if (i2 == 1) {
                        pz0Var3 = ck6Var.p;
                        pz0 pz0Var5 = ck6Var.o;
                        kji kjiVar6 = ck6Var.n;
                        w70 w70Var4 = ck6Var.m;
                        kji kjiVar7 = ck6Var.l;
                        no6 no6Var4 = ck6Var.k;
                        d20 d20Var4 = ck6Var.j;
                        qgg.h0(obj);
                        pz0Var4 = pz0Var5;
                        kjiVar5 = kjiVar7;
                        d20Var3 = d20Var4;
                        kjiVar4 = kjiVar6;
                        no6Var3 = no6Var4;
                        w70Var3 = w70Var4;
                        pz0Var3.b(obj);
                        pz0Var4.c(Q(kjiVar5.b, d20Var3, no6Var3, kjiVar4, w70Var3, w1t.b));
                        ArrayList arrayList = pz0Var4.a;
                        return u75.h(arrayList.toArray(new gli[arrayList.size()]));
                    }
                    if (i2 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz0Var = ck6Var.p;
                    pz0 pz0Var6 = ck6Var.o;
                    kji kjiVar8 = ck6Var.n;
                    w70 w70Var5 = ck6Var.m;
                    kji kjiVar9 = ck6Var.l;
                    no6 no6Var5 = ck6Var.k;
                    d20 d20Var5 = ck6Var.j;
                    qgg.h0(obj);
                    pz0Var2 = pz0Var6;
                    kjiVar3 = kjiVar9;
                    d20Var2 = d20Var5;
                    kjiVar2 = kjiVar8;
                    no6Var2 = no6Var5;
                    w70Var2 = w70Var5;
                    pz0Var.b(obj);
                    pz0Var2.c(Q(kjiVar3.b, d20Var2, no6Var2, kjiVar2, w70Var2, w1t.a));
                    ArrayList arrayList2 = pz0Var2.a;
                    return u75.h(arrayList2.toArray(new gli[arrayList2.size()]));
                }
                qgg.h0(obj);
                hji hjiVar = kjiVar.a;
                ArrayList arrayList3 = kjiVar.b;
                if (hjiVar instanceof gji) {
                    gji gjiVar = (gji) hjiVar;
                    if (gjiVar instanceof bji) {
                        pz0 pz0Var7 = new pz0(2);
                        pz0Var7.b(new tji((bji) hjiVar, w70Var));
                        pz0Var7.c(Q(arrayList3, d20Var, no6Var, kjiVar, w70Var, w1t.a));
                        ArrayList arrayList4 = pz0Var7.a;
                        return u75.h(arrayList4.toArray(new gli[arrayList4.size()]));
                    }
                    if (gjiVar instanceof dji) {
                        pz0 pz0Var8 = new pz0(2);
                        pz0Var8.b(new vji((dji) hjiVar, w70Var));
                        pz0Var8.c(Q(arrayList3, d20Var, no6Var, kjiVar, w70Var, w1t.a));
                        ArrayList arrayList5 = pz0Var8.a;
                        return u75.h(arrayList5.toArray(new gli[arrayList5.size()]));
                    }
                    if (gjiVar instanceof fji) {
                        pz0 pz0Var9 = new pz0(2);
                        pz0Var9.b(new xji((fji) hjiVar, w70Var));
                        pz0Var9.c(Q(arrayList3, d20Var, no6Var, kjiVar, w70Var, w1t.a));
                        ArrayList arrayList6 = pz0Var9.a;
                        return u75.h(arrayList6.toArray(new gli[arrayList6.size()]));
                    }
                    if (gjiVar instanceof cji) {
                        pz0 pz0Var10 = new pz0(2);
                        pz0Var10.b(new uji((cji) hjiVar, w70Var));
                        pz0Var10.c(Q(arrayList3, d20Var, no6Var, kjiVar, w70Var, w1t.a));
                        ArrayList arrayList7 = pz0Var10.a;
                        return u75.h(arrayList7.toArray(new gli[arrayList7.size()]));
                    }
                    if (gjiVar instanceof aji) {
                        pz0 pz0Var11 = new pz0(2);
                        pz0Var11.b(new sji((aji) hjiVar, w70Var));
                        pz0Var11.c(Q(arrayList3, d20Var, no6Var, kjiVar, w70Var, w1t.b));
                        ArrayList arrayList8 = pz0Var11.a;
                        return u75.h(arrayList8.toArray(new gli[arrayList8.size()]));
                    }
                    if (!(gjiVar instanceof eji)) {
                        b6e.s();
                        return null;
                    }
                    pz0 pz0Var12 = new pz0(2);
                    pz0Var12.b(new wji((eji) hjiVar, w70Var));
                    pz0Var12.c(Q(arrayList3, d20Var, no6Var, kjiVar, w70Var, w1t.a));
                    ArrayList arrayList9 = pz0Var12.a;
                    return u75.h(arrayList9.toArray(new gli[arrayList9.size()]));
                }
                if (hjiVar instanceof qii) {
                    pz0Var3 = new pz0(2);
                    ck6Var.j = d20Var;
                    ck6Var.k = no6Var;
                    ck6Var.l = kjiVar;
                    ck6Var.m = w70Var;
                    ck6Var.n = kjiVar;
                    ck6Var.o = pz0Var3;
                    ck6Var.p = pz0Var3;
                    ck6Var.r = 1;
                    obj = N(hwlVar, (zii) hjiVar, w70Var, sy7Var, ck6Var);
                    if (obj != nm6Var) {
                        pz0Var4 = pz0Var3;
                        w70Var3 = w70Var;
                        kjiVar4 = kjiVar;
                        no6Var3 = no6Var;
                        d20Var3 = d20Var;
                        kjiVar5 = kjiVar4;
                        pz0Var3.b(obj);
                        pz0Var4.c(Q(kjiVar5.b, d20Var3, no6Var3, kjiVar4, w70Var3, w1t.b));
                        ArrayList arrayList10 = pz0Var4.a;
                        return u75.h(arrayList10.toArray(new gli[arrayList10.size()]));
                    }
                } else {
                    if (!(hjiVar instanceof zii)) {
                        b6e.s();
                        return null;
                    }
                    pz0Var = new pz0(2);
                    ck6Var.j = d20Var;
                    ck6Var.k = no6Var;
                    ck6Var.l = kjiVar;
                    ck6Var.m = w70Var;
                    ck6Var.n = kjiVar;
                    ck6Var.o = pz0Var;
                    ck6Var.p = pz0Var;
                    ck6Var.r = 2;
                    obj = N(hwlVar, (zii) hjiVar, w70Var, sy7Var, ck6Var);
                    if (obj != nm6Var) {
                        pz0Var2 = pz0Var;
                        w70Var2 = w70Var;
                        kjiVar2 = kjiVar;
                        no6Var2 = no6Var;
                        d20Var2 = d20Var;
                        kjiVar3 = kjiVar2;
                        pz0Var.b(obj);
                        pz0Var2.c(Q(kjiVar3.b, d20Var2, no6Var2, kjiVar2, w70Var2, w1t.a));
                        ArrayList arrayList22 = pz0Var2.a;
                        return u75.h(arrayList22.toArray(new gli[arrayList22.size()]));
                    }
                }
                return nm6Var;
            }
        }
        ck6Var = new ck6(cg6Var);
        Object obj2 = ck6Var.q;
        nm6 nm6Var2 = nm6.a;
        i2 = ck6Var.r;
        if (i2 == 0) {
        }
    }

    public static final fli[] Q(ArrayList arrayList, d20 d20Var, no6 no6Var, kji kjiVar, w70 w70Var, w1t w1tVar) {
        fli aliVar;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            lmi lmiVar = (lmi) obj;
            if (lmiVar instanceof jmi) {
                ArrayList arrayList3 = kjiVar.b;
                hji hjiVar = kjiVar.a;
                zii ziiVar = hjiVar instanceof zii ? (zii) hjiVar : null;
                if (ziiVar == null) {
                    su4.s(2, null, "Developer error. Full track must have full context " + hjiVar, null);
                }
                if (ziiVar == null) {
                    ziiVar = vii.a;
                }
                mqs mqsVar = ((jmi) lmiVar).a;
                w2r w2rVar = new w2r(i2, ziiVar, arrayList3, mqsVar);
                int ordinal = w1tVar.ordinal();
                if (ordinal == 0) {
                    no6Var.getClass();
                    w70Var.getClass();
                    aliVar = new dli(no6Var.a(mqsVar), w70Var, w2rVar);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    aliVar = a4g.w(d20Var, w2rVar, w70Var);
                }
            } else {
                if (!(lmiVar instanceof kmi)) {
                    b6e.s();
                    return null;
                }
                anx anxVar = new anx(i2, kjiVar.a, kjiVar.b, ((kmi) lmiVar).a);
                int ordinal2 = w1tVar.ordinal();
                if (ordinal2 == 0) {
                    aliVar = new ali(anxVar, w70Var);
                } else {
                    if (ordinal2 != 1) {
                        b6e.s();
                        return null;
                    }
                    aliVar = new zki(anxVar, w70Var);
                }
            }
            arrayList2.add(aliVar);
            i2 = i3;
        }
        return (fli[]) arrayList2.toArray(new fli[0]);
    }

    public static final void a(rab rabVar, yci yciVar, String str, Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        rabVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(433377456);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(rabVar) : oq5Var.h(rabVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            j66.p(rabVar.d, o5g.F(oq5Var), androidx.compose.ui.platform.a.a(yciVar, "bottom_sheet_square_grid_item"), function0, qo6.b, null, null, ild.C(1528779490, new ar(15, rabVar, str), oq5Var), oq5Var, (i3 & 7168) | 12607488, 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(rabVar, yciVar, false, str, function0, i2, 14);
        }
    }

    public static final void b(ny3 ny3Var, wy3 wy3Var, hq5 hq5Var, int i2) {
        iz2 iz2Var = b2c.d;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1579783915);
        int i3 = 2;
        int i4 = (oq5Var.h(ny3Var) ? 4 : 2) | i2 | (oq5Var.h(wy3Var) ? 32 : 16);
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            vci vciVar = vci.a;
            yci o2 = androidx.compose.foundation.layout.a.o(gut.a0(gut.p1(androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) oq5Var.j(eq0.a)).c.a, vnj.i))), 0.0f, 8, 1);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, o2);
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
            ty3 ty3Var = ty3.a;
            boolean d3 = Intrinsics.d(wy3Var, ty3Var);
            uy3 uy3Var = uy3.a;
            if (d3) {
                oq5Var.Z(967891394);
                nt0.h(ny3Var, oq5Var, i4 & 14);
                oq5Var.p(false);
            } else if (Intrinsics.d(wy3Var, uy3Var)) {
                oq5Var.Z(967893807);
                ot0.g(0, oq5Var);
                oq5Var.p(false);
            } else {
                if (!(wy3Var instanceof vy3)) {
                    throw vz1.i(oq5Var, 967889576, false);
                }
                oq5Var.Z(967895890);
                q((vy3) wy3Var, ny3Var, androidx.compose.ui.platform.a.a(vciVar, "cards_success_screen"), oq5Var, ((i4 << 3) & 112) | ((i4 >> 3) & 14) | 384);
                oq5Var.p(false);
            }
            boolean d4 = Intrinsics.d(wy3Var, ty3Var);
            kjn kjnVar = gq5.a;
            b bVar = b.a;
            if (d4) {
                oq5Var.Z(-59749767);
                boolean h2 = oq5Var.h(ny3Var);
                Object K = oq5Var.K();
                if (h2 || K == kjnVar) {
                    t93 t93Var = new t93(0, ny3Var, ny3.class, "close", "close()V", 0, 16);
                    oq5Var.k0(t93Var);
                    K = t93Var;
                }
                hld.f((Function0) ((h9f) K), bVar.a(vciVar, iz2Var), oq5Var, 0);
                oq5Var.p(false);
            } else if (Intrinsics.d(wy3Var, uy3Var)) {
                oq5Var.Z(-59532271);
                Boolean bool = Boolean.FALSE;
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new z21(i3, 6, null);
                    oq5Var.k0(K2);
                }
                if (((Boolean) szf.i0(oq5Var, bool, (Function2) K2).getValue()).booleanValue()) {
                    oq5Var.Z(-59342427);
                    boolean h3 = oq5Var.h(ny3Var);
                    Object K3 = oq5Var.K();
                    if (h3 || K3 == kjnVar) {
                        t93 t93Var2 = new t93(0, ny3Var, ny3.class, "close", "close()V", 0, 17);
                        oq5Var.k0(t93Var2);
                        K3 = t93Var2;
                    }
                    hld.f((Function0) ((h9f) K3), bVar.a(vciVar, iz2Var), oq5Var, 0);
                } else {
                    oq5Var.Z(-62403801);
                }
                oq5Var.p(false);
                oq5Var.p(false);
            } else {
                if (!(wy3Var instanceof vy3)) {
                    throw vz1.i(oq5Var, 967902893, false);
                }
                oq5Var.Z(967924831);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(ny3Var, wy3Var, i2, 12);
        }
    }

    public static final void c(ny3 ny3Var, hq5 hq5Var, int i2) {
        ny3Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-581015385);
        int i3 = (oq5Var.h(ny3Var) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            b(ny3Var, (wy3) gld.N(ny3Var.l, uy3.a, oq5Var, 0).getValue(), oq5Var, i3 & 14);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iy3(ny3Var, i2, 1);
        }
    }

    public static final void d(Function0 function0, yci yciVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-37052468);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = i5 != 0 ? vci.a : yciVar;
            aae.a(function0, androidx.compose.ui.platform.a.a(yciVar2, "collapse_button"), false, weo.d, oq5Var, (i4 & 14) | 24576, 12);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qtb(function0, yciVar2, i2, i3, 0);
        }
    }

    public static final void e(tz5 tz5Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1965038000);
        if ((((oq5Var.h(tz5Var) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            q5g.k(null, null, 0L, 0L, null, 0.0f, ild.C(902467052, new qz5(tz5Var, yciVar), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 63);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qz5(tz5Var, yciVar, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(d8t d8tVar, yci yciVar, wdc wdcVar, Function1 function1, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        yci yciVar2;
        int i4;
        wdc wdcVar2;
        int i5;
        Function1 function12;
        wn5 wn5Var2;
        yci yciVar3;
        wdc wdcVar3;
        xmn r;
        wdc wdcVar4;
        d8t d8tVar2 = d8tVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(679005231);
        int i6 = (i2 & 6) == 0 ? (oq5Var.f(d8tVar2) ? 4 : 2) | i2 : i2;
        int i7 = i3 & 1;
        if (i7 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i3 & 2;
            if (i4 == 0) {
                i6 |= 384;
            } else if ((i2 & 384) == 0) {
                wdcVar2 = wdcVar;
                i6 |= oq5Var.h(wdcVar2) ? 256 : 128;
                i5 = i3 & 4;
                if (i5 != 0) {
                    i6 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    function12 = function1;
                    i6 |= oq5Var.h(function12) ? 2048 : 1024;
                    if ((i2 & 24576) != 0) {
                        wn5Var2 = wn5Var;
                        i6 |= oq5Var.h(wn5Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
                    } else {
                        wn5Var2 = wn5Var;
                    }
                    int i8 = 0;
                    if (oq5Var.P(i6 & 1, (i6 & 9363) == 9362)) {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        wdcVar3 = wdcVar2;
                    } else {
                        yci yciVar4 = i7 != 0 ? vci.a : yciVar2;
                        if (i4 != 0) {
                            wdcVar2 = weo.S(0, 0, null, 7);
                        }
                        if (i5 != 0) {
                            function12 = gx3.Y;
                        }
                        Object K = oq5Var.K();
                        kjn kjnVar = gq5.a;
                        Object obj = K;
                        if (K == kjnVar) {
                            s2r s2rVar = new s2r();
                            s2rVar.add(d8tVar2.c());
                            oq5Var.k0(s2rVar);
                            obj = s2rVar;
                        }
                        s2r s2rVar2 = (s2r) obj;
                        Object K2 = oq5Var.K();
                        if (K2 == kjnVar) {
                            long[] jArr = vso.a;
                            K2 = new tpi();
                            oq5Var.k0(K2);
                        }
                        tpi tpiVar = (tpi) K2;
                        Object c2 = d8tVar2.c();
                        x6k x6kVar = d8tVar2.d;
                        if (Intrinsics.d(c2, x6kVar.getValue())) {
                            oq5Var.Z(860925177);
                            if (s2rVar2.size() == 1 && Intrinsics.d(s2rVar2.get(0), x6kVar.getValue())) {
                                oq5Var.Z(861249809);
                                oq5Var.p(false);
                            } else {
                                oq5Var.Z(861059531);
                                boolean z = (i6 & 14) == 4;
                                Object K3 = oq5Var.K();
                                if (z || K3 == kjnVar) {
                                    K3 = new ou6(d8tVar2, i8);
                                    oq5Var.k0(K3);
                                }
                                z75.z(s2rVar2, (Function1) K3);
                                tpiVar.a();
                                oq5Var.p(false);
                            }
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(861255761);
                            oq5Var.p(false);
                        }
                        if (tpiVar.b(x6kVar.getValue())) {
                            wdcVar4 = wdcVar2;
                            oq5Var.Z(862059281);
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(861316428);
                            ListIterator listIterator = s2rVar2.listIterator();
                            int i9 = 0;
                            while (true) {
                                ezd ezdVar = (ezd) listIterator;
                                if (!ezdVar.hasNext()) {
                                    i9 = -1;
                                    break;
                                } else if (Intrinsics.d(function12.invoke(ezdVar.next()), function12.invoke(x6kVar.getValue()))) {
                                    break;
                                } else {
                                    i9++;
                                }
                            }
                            if (i9 == -1) {
                                s2rVar2.add(x6kVar.getValue());
                            } else {
                                s2rVar2.set(i9, x6kVar.getValue());
                            }
                            tpiVar.a();
                            int size = s2rVar2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj2 = s2rVar2.get(i10);
                                wdc wdcVar5 = wdcVar2;
                                tpiVar.m(obj2, ild.C(-1426421288, new pu6(d8tVar2, wdcVar5, obj2, wn5Var2, 0), oq5Var));
                                i10++;
                                d8tVar2 = d8tVar;
                                wn5Var2 = wn5Var;
                                wdcVar2 = wdcVar5;
                            }
                            wdcVar4 = wdcVar2;
                            oq5Var.p(false);
                        }
                        kfh d2 = ug3.d(b2c.b, false);
                        int i11 = oq5Var.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var.l();
                        yci H = vnj.H(oq5Var, yciVar4);
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
                        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                            ouj.x(i11, oq5Var, i11, kb5Var);
                        }
                        g0g.U(oq5Var, H, wp5.d);
                        oq5Var.Z(-187474512);
                        int size2 = s2rVar2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            Object obj3 = s2rVar2.get(i12);
                            oq5Var.W(-1081865889, function12.invoke(obj3));
                            Function2 function2 = (Function2) tpiVar.g(obj3);
                            if (function2 == null) {
                                oq5Var.Z(821932266);
                            } else {
                                oq5Var.Z(-1081864713);
                                function2.invoke(oq5Var, 0);
                            }
                            oq5Var.p(false);
                            oq5Var.p(false);
                        }
                        oq5Var.p(false);
                        oq5Var.p(true);
                        wdcVar3 = wdcVar4;
                        yciVar3 = yciVar4;
                    }
                    Function1 function13 = function12;
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new sj0(d8tVar, yciVar3, wdcVar3, function13, wn5Var, i2, i3);
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i2 & 24576) != 0) {
                }
                int i82 = 0;
                if (oq5Var.P(i6 & 1, (i6 & 9363) == 9362)) {
                }
                Function1 function132 = function12;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            wdcVar2 = wdcVar;
            i5 = i3 & 4;
            if (i5 != 0) {
            }
            function12 = function1;
            if ((i2 & 24576) != 0) {
            }
            int i822 = 0;
            if (oq5Var.P(i6 & 1, (i6 & 9363) == 9362)) {
            }
            Function1 function1322 = function12;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i3 & 2;
        if (i4 == 0) {
        }
        wdcVar2 = wdcVar;
        i5 = i3 & 4;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i2 & 24576) != 0) {
        }
        int i8222 = 0;
        if (oq5Var.P(i6 & 1, (i6 & 9363) == 9362)) {
        }
        Function1 function13222 = function12;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(Object obj, yci yciVar, wdc wdcVar, String str, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        wdc wdcVar2;
        int i6;
        String str2;
        wdc wdcVar3;
        String str3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-310686752);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? oq5Var.f(obj) : oq5Var.h(obj) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                wdcVar2 = wdcVar;
                i4 |= oq5Var.h(wdcVar2) ? 256 : 128;
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    str2 = str;
                    i4 |= oq5Var.f(str2) ? 2048 : 1024;
                    if ((i2 & 24576) == 0) {
                        i4 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
                    }
                    if (oq5Var.P(i4 & 1, (i4 & 9363) == 9362)) {
                        oq5Var.S();
                        wdcVar3 = wdcVar2;
                        str3 = str2;
                    } else {
                        yci yciVar3 = i7 != 0 ? vci.a : yciVar2;
                        wdc S = i5 != 0 ? weo.S(0, 0, null, 7) : wdcVar2;
                        String str4 = i6 != 0 ? "Crossfade" : str2;
                        f(i8t.e(obj, str4, oq5Var, (i4 & 14) | ((i4 >> 6) & 112), 0), yciVar3, S, null, wn5Var, oq5Var, i4 & 58352, 4);
                        str3 = str4;
                        yciVar2 = yciVar3;
                        wdcVar3 = S;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new sj0(obj, yciVar2, wdcVar3, str3, wn5Var, i2, i3, 1);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((i2 & 24576) == 0) {
                }
                if (oq5Var.P(i4 & 1, (i4 & 9363) == 9362)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            wdcVar2 = wdcVar;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            str2 = str;
            if ((i2 & 24576) == 0) {
            }
            if (oq5Var.P(i4 & 1, (i4 & 9363) == 9362)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        wdcVar2 = wdcVar;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        str2 = str;
        if ((i2 & 24576) == 0) {
        }
        if (oq5Var.P(i4 & 1, (i4 & 9363) == 9362)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final o08 h(DeviceType deviceType, String str, Function1 function1) {
        deviceType.getClass();
        m08 m08Var = new m08();
        function1.invoke(m08Var);
        return new o08(deviceType, str, m08Var.a, m08Var.b, m08Var.c, m08Var.d, m08Var.e, m08Var.f);
    }

    public static o08 i(DeviceType deviceType, String str) {
        deviceType.getClass();
        m08 m08Var = new m08();
        return new o08(deviceType, str, m08Var.a, m08Var.b, m08Var.c, m08Var.d, m08Var.e, m08Var.f);
    }

    public static final void j(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1107518358);
        if (oq5Var.P(i2 & 1, i2 != 0)) {
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci m2 = d.m(vciVar, 64);
            long j2 = d85.f;
            tgo tgoVar = ugo.a;
            ug3.a(androidx.compose.foundation.a.b(m2, j2, tgoVar), oq5Var, 0);
            ug3.a(androidx.compose.foundation.a.b(d.o(androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 14, 0.0f, 0.0f, 13), 36, 8), j2, tgoVar), oq5Var, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rea(i2, 8);
        }
    }

    public static final void k(float f2, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(154785979);
        int i3 = (oq5Var.c(f2) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            wn5 wn5Var = h4a.f;
            boolean z = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new y8q(f2);
                oq5Var.k0(K);
            }
            p9b.a(wn5Var, wyf.s(vci.a, (Function0) K), false, oq5Var, 6, 4);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xd1(i2, f2, 2);
        }
    }

    public static final void l(String str, fud fudVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i2) {
        fudVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1146053516);
        int i3 = (oq5Var.h(fudVar) ? 32 : 16) | i2;
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function03) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = ((i3 >> 15) & 14) | 3504;
            int i5 = i3 << 9;
            s(yciVar, ild.C(1455396792, new iv(str, function03, 2), oq5Var), h4a.d, h4a.e, fudVar, function0, function02, function03, 0.0f, oq5Var, i4 | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (i5 & 29360128), 256);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sd1(str, fudVar, function0, function02, function03, yciVar, i2, 1);
        }
    }

    public static final void m(jil jilVar, Function0 function0, Function1 function1, Function0 function02, Function1 function12, drh drhVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        jilVar.getClass();
        function0.getClass();
        function1.getClass();
        function02.getClass();
        function12.getClass();
        drhVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1270551300);
        int i3 = i2 | (oq5Var.h(jilVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | (oq5Var.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(drhVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            iz2 iz2Var = b2c.i;
            float F = F(oq5Var);
            vci vciVar = vci.a;
            yci e2 = d.e(vciVar, F);
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (jilVar.equals(gil.a)) {
                oq5Var.Z(-1959498148);
                n(function0, null, oq5Var, (i3 >> 3) & 14);
                oq5Var.p(false);
            } else {
                if (!(jilVar instanceof iil)) {
                    throw vz1.i(oq5Var, -340305606, false);
                }
                oq5Var.Z(-1959322316);
                o(((iil) jilVar).c, function0, function1, function02, function12, drhVar, null, oq5Var, i3 & 524272);
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl1(jilVar, function0, function1, function02, function12, drhVar, yciVar2, i2);
        }
    }

    public static final void n(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(274988166);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            d(function0, null, oq5Var, i4 & 14, 2);
            oq5Var.p(true);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function0, yciVar, i2, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(l9n l9nVar, Function0 function0, Function1 function1, Function0 function02, Function1 function12, drh drhVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        MinimumInteractiveModifier minimumInteractiveModifier;
        jxi jxiVar;
        j9n j9nVar;
        Object K;
        int i4;
        b94 b94Var;
        boolean z2;
        String str;
        boolean z3;
        long j2;
        yci yciVar2;
        boolean z4;
        vci vciVar;
        kjn kjnVar;
        MinimumInteractiveModifier minimumInteractiveModifier2;
        String str2;
        long j3;
        yci x;
        boolean z5;
        yci yciVar3;
        l9nVar.getClass();
        function0.getClass();
        function1.getClass();
        function02.getClass();
        function12.getClass();
        drhVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-785095673);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(l9nVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.f(drhVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i5 = i3 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((599187 & i5) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            vci vciVar2 = vci.a;
            yci H = vnj.H(oq5Var, vciVar2);
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
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            Object K2 = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (K2 == kjnVar2) {
                K2 = new dcb(20);
                oq5Var.k0(K2);
            }
            d(function0, nfp.b(vciVar2, false, (Function1) K2), oq5Var, (i5 >> 3) & 14, 0);
            c94 c94Var = l9nVar.c;
            k9n k9nVar = l9nVar.d;
            boolean z6 = c94Var instanceof z84;
            MinimumInteractiveModifier minimumInteractiveModifier3 = MinimumInteractiveModifier.a;
            b94 b94Var2 = b94.a;
            j9n j9nVar2 = j9n.a;
            if (!z6) {
                z = false;
                if (!c94Var.equals(b94Var2)) {
                    b6e.s();
                    return;
                }
            } else if (k9nVar instanceof i9n) {
                oq5Var.Z(-1818550099);
                agr agrVar = yre.a;
                u1g.l(oq5Var, minimumInteractiveModifier3);
                oq5Var.p(false);
                minimumInteractiveModifier = minimumInteractiveModifier3;
                gz2 gz2Var = b2c.o;
                oq5Var.Z(-612844662);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                jxiVar = l9nVar.e;
                if (jxiVar != null) {
                    j9nVar = j9nVar2;
                } else {
                    yci u = xp3.u(vciVar2, o5g.E(oq5Var));
                    j9nVar = j9nVar2;
                    boolean h2 = ((i5 & 57344) == 16384) | oq5Var.h(jxiVar);
                    Object K3 = oq5Var.K();
                    if (h2 || K3 == kjnVar2) {
                        K3 = new zya(3, function12, jxiVar);
                        oq5Var.k0(K3);
                    }
                    layoutWeightElement = layoutWeightElement.f(androidx.compose.foundation.a.e(u, false, null, null, (Function0) K3, 7));
                }
                oq5Var.p(false);
                K = oq5Var.K();
                if (K == kjnVar2) {
                    K = new dcb(21);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(layoutWeightElement, true, (Function1) K);
                ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
                i4 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, b2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a3, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                    ouj.x(i4, oq5Var, i4, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                if (!(c94Var instanceof w84)) {
                    b94Var = b94Var2;
                    z2 = true;
                } else if (c94Var instanceof a94) {
                    z2 = ((a94) c94Var).a;
                    b94Var = b94Var2;
                } else {
                    if (c94Var instanceof x84) {
                        b94Var = b94Var2;
                    } else {
                        b94Var = b94Var2;
                        if (!c94Var.equals(b94Var)) {
                            b6e.s();
                            return;
                        }
                    }
                    z2 = false;
                }
                str = l9nVar.a;
                if (str != null) {
                    oq5Var.Z(1254639281);
                    oq5Var.p(false);
                    z4 = false;
                    kjnVar = kjnVar2;
                    vciVar = vciVar2;
                    minimumInteractiveModifier2 = minimumInteractiveModifier;
                } else {
                    oq5Var.Z(1254639282);
                    ges i7 = nu0.i();
                    if (z2) {
                        oq5Var.Z(-664580406);
                        j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                        z3 = false;
                    } else {
                        z3 = false;
                        oq5Var.Z(-664579348);
                        j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
                    }
                    oq5Var.p(z3);
                    long j4 = j2;
                    if (z2) {
                        oq5Var.Z(-664574388);
                        yciVar2 = ldg.x(oq5Var, vciVar2);
                        oq5Var.p(z3);
                    } else {
                        oq5Var.Z(-664573909);
                        oq5Var.p(z3);
                        yciVar2 = vciVar2;
                    }
                    z4 = z3;
                    vciVar = vciVar2;
                    kjnVar = kjnVar2;
                    minimumInteractiveModifier2 = minimumInteractiveModifier;
                    xcs.b(str, androidx.compose.ui.platform.a.a(yciVar2, "context_title"), j4, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, i7, oq5Var, 0, 3120, 54776);
                    oq5Var = oq5Var;
                    oq5Var.p(z4);
                }
                str2 = l9nVar.b;
                if (str2 != null) {
                    oq5Var.Z(1255200753);
                } else {
                    oq5Var.Z(1255200754);
                    ges i8 = nu0.i();
                    if (z2) {
                        oq5Var.Z(-1539990080);
                        j3 = ((dq0) oq5Var.j(eq0.a)).b.d;
                    } else {
                        oq5Var.Z(-1539989055);
                        j3 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    }
                    oq5Var.p(z4);
                    long j5 = j3;
                    if (z2) {
                        oq5Var.Z(-1539984446);
                        oq5Var.p(z4);
                        x = vciVar;
                    } else {
                        oq5Var.Z(-1539983709);
                        x = ldg.x(oq5Var, vciVar);
                        oq5Var.p(z4);
                    }
                    oq5 oq5Var2 = oq5Var;
                    xcs.b(str2, androidx.compose.ui.platform.a.a(x, "context_subtitle"), j5, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, i8, oq5Var2, 0, 3120, 54776);
                    oq5Var = oq5Var2;
                }
                oq5Var.p(z4);
                oq5Var.p(true);
                z5 = c94Var instanceof z84;
                if (!z5) {
                    oq5Var.Z(-1816636810);
                    z84 z84Var = (z84) c94Var;
                    Object K4 = oq5Var.K();
                    if (K4 == kjnVar) {
                        K4 = new dcb(22);
                        oq5Var.k0(K4);
                    }
                    saf.h(function1, z84Var, drhVar, nfp.b(vciVar, z4, (Function1) K4), oq5Var, ((i5 >> 6) & 14) | ((i5 >> 9) & 896));
                    oq5Var.p(z4);
                } else {
                    if (!c94Var.equals(b94Var)) {
                        throw vz1.i(oq5Var, -612793281, z4);
                    }
                    oq5Var.Z(-612778225);
                    oq5Var.p(z4);
                }
                if (!(k9nVar instanceof i9n)) {
                    oq5Var.Z(-1816112321);
                    Object K5 = oq5Var.K();
                    if (K5 == kjnVar) {
                        K5 = new dcb(23);
                        oq5Var.k0(K5);
                    }
                    aae.a(function02, nfp.b(vciVar, z4, (Function1) K5), false, weo.c, oq5Var, ((i5 >> 9) & 14) | 24576, 12);
                    oq5Var.p(z4);
                } else {
                    if (!Intrinsics.d(k9nVar, j9nVar)) {
                        throw vz1.i(oq5Var, -612776490, z4);
                    }
                    oq5Var.Z(-1815408528);
                    if (z5) {
                        oq5Var.Z(-1823779241);
                    } else if (!c94Var.equals(b94Var)) {
                        b6e.s();
                        return;
                    } else {
                        oq5Var.Z(-1815348419);
                        agr agrVar2 = yre.a;
                        u1g.l(oq5Var, minimumInteractiveModifier2);
                    }
                    oq5Var.p(z4);
                    oq5Var.p(z4);
                }
                oq5Var.p(true);
                yciVar3 = vciVar;
            } else {
                z = false;
                if (!Intrinsics.d(k9nVar, j9nVar2)) {
                    b6e.s();
                    return;
                }
            }
            minimumInteractiveModifier = minimumInteractiveModifier3;
            oq5Var.Z(-1823779241);
            oq5Var.p(z);
            gz2 gz2Var2 = b2c.o;
            oq5Var.Z(-612844662);
            if (1.0f <= 0.0d) {
            }
            yci layoutWeightElement2 = new LayoutWeightElement(true, 1.0f);
            jxiVar = l9nVar.e;
            if (jxiVar != null) {
            }
            oq5Var.p(false);
            K = oq5Var.K();
            if (K == kjnVar2) {
            }
            yci b22 = nfp.b(layoutWeightElement2, true, (Function1) K);
            ta5 a32 = sa5.a(qx0.c, gz2Var2, oq5Var, 48);
            i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l32 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, b22);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a32, kb5Var);
            g0g.U(oq5Var, l32, kb5Var2);
            if (!oq5Var.O) {
            }
            ouj.x(i4, oq5Var, i4, kb5Var3);
            g0g.U(oq5Var, H22, kb5Var4);
            if (!(c94Var instanceof w84)) {
            }
            str = l9nVar.a;
            if (str != null) {
            }
            str2 = l9nVar.b;
            if (str2 != null) {
            }
            oq5Var.p(z4);
            oq5Var.p(true);
            z5 = c94Var instanceof z84;
            if (!z5) {
            }
            if (!(k9nVar instanceof i9n)) {
            }
            oq5Var.p(true);
            yciVar3 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv(l9nVar, function0, function1, function02, function12, drhVar, yciVar3, i2);
        }
    }

    public static final void p(zef zefVar, hq5 hq5Var, int i2) {
        zefVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-964595027);
        int i3 = (oq5Var.h(zefVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            nff nffVar = (nff) szf.Q(zefVar.e, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(zefVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                v2d v2dVar = new v2d(0, zefVar, zef.class, "onBackClicked", "onBackClicked()V", 0, 24);
                oq5Var.k0(v2dVar);
                K = v2dVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(zefVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                v2d v2dVar2 = new v2d(0, zefVar, zef.class, "onSearchClicked", "onSearchClicked()V", 0, 26);
                oq5Var.k0(v2dVar2);
                K2 = v2dVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(zefVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                v2d v2dVar3 = new v2d(0, zefVar, zef.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 28);
                oq5Var.k0(v2dVar3);
                K3 = v2dVar3;
            }
            kg5.g(ru.yandex.music.R.string.kids_playlists_title, a2, function0, function02, (Function0) ((h9f) K3), ild.C(-1792885350, new vtb(5, nffVar, zefVar, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(zefVar, i2, 24);
        }
    }

    public static final void q(vy3 vy3Var, ny3 ny3Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1599732623);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(vy3Var) : oq5Var.h(vy3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(ny3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        boolean z = false;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 14;
            boolean z2 = i4 == 4 || ((i3 & 8) != 0 && oq5Var.h(vy3Var));
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = new r93(8, vy3Var);
                oq5Var.k0(K);
            }
            fp7 b2 = r3k.b(0, (Function0) K, oq5Var, 6, 2);
            Integer valueOf = Integer.valueOf(b2.q());
            boolean h2 = oq5Var.h(ny3Var) | oq5Var.f(b2);
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (h2 || K2 == kjnVar) {
                K2 = new qi(ny3Var, b2, continuation, 18);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, valueOf, (Function2) K2);
            Integer valueOf2 = Integer.valueOf(vy3Var.b);
            boolean f2 = oq5Var.f(b2);
            if (i4 == 4 || ((i3 & 8) != 0 && oq5Var.h(vy3Var))) {
                z = true;
            }
            boolean z3 = f2 | z;
            Object K3 = oq5Var.K();
            if (z3 || K3 == kjnVar) {
                K3 = new cs1(b2, vy3Var, continuation, 17);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, valueOf2, (Function2) K3);
            vq1.d(vy3Var, ((Number) b2.v.getValue()).intValue(), ny3Var, ild.C(106119638, new qy3(b2, 0), oq5Var), yciVar2, oq5Var, ((i3 << 6) & 57344) | i4 | 3080 | ((i3 << 3) & 896));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(vy3Var, ny3Var, yciVar, i2, 18);
        }
    }

    public static final void r(fud fudVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i2) {
        fudVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1486032970);
        int i3 = i2 | (oq5Var.h(fudVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128) | (oq5Var.h(function03) ? 2048 : 1024);
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 << 12;
            s(yciVar, h4a.b, h4a.c, null, fudVar, function0, function02, function03, 0.0f, oq5Var, (57344 & i4) | 3510 | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 256);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(fudVar, function0, function02, function03, yciVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(yci yciVar, wn5 wn5Var, wn5 wn5Var2, Function2 function2, fud fudVar, Function0 function0, Function0 function02, Function0 function03, float f2, hq5 hq5Var, int i2, int i3) {
        int i4;
        wn5 wn5Var3;
        Function2 function22;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        float f3;
        float f4;
        float f5;
        boolean h2;
        Object K;
        int i5;
        boolean h3;
        Object K2;
        int i6;
        yciVar.getClass();
        fudVar.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-937040771);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            wn5Var3 = wn5Var2;
            i4 |= oq5Var.h(wn5Var3) ? 256 : 128;
        } else {
            wn5Var3 = wn5Var2;
        }
        if ((i2 & 3072) == 0) {
            function22 = function2;
            i4 |= oq5Var.h(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.h(fudVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            function04 = function0;
            i4 |= oq5Var.h(function04) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            function04 = function0;
        }
        if ((1572864 & i2) == 0) {
            function05 = function02;
            i4 |= oq5Var.h(function05) ? 1048576 : 524288;
        } else {
            function05 = function02;
        }
        if ((12582912 & i2) == 0) {
            function06 = function03;
            i4 |= oq5Var.h(function06) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function06 = function03;
        }
        if ((100663296 & i2) == 0) {
            if ((i3 & 256) == 0) {
                f3 = f2;
                if (oq5Var.c(f3)) {
                    i6 = 67108864;
                    i4 |= i6;
                }
            } else {
                f3 = f2;
            }
            i6 = 33554432;
            i4 |= i6;
        } else {
            f3 = f2;
        }
        if (oq5Var.P(i4 & 1, (38347923 & i4) != 38347922)) {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
                int i7 = i3 & 256;
            } else if ((i3 & 256) != 0) {
                f5 = 114;
                oq5Var.q();
                wje s = fgq.s(fgq.D(null, oq5Var, 1), 0.05f, 0.1f, weo.C(weo.S(800, 0, null, 6), jyn.b, 0L, 4), null, oq5Var, 4104, 8);
                oq5Var = oq5Var;
                h2 = oq5Var.h(fudVar);
                K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (!h2 || K == kjnVar) {
                    K = new td1(fudVar, 1);
                    oq5Var.k0(K);
                }
                yci a2 = a.a(yciVar, (Function1) K);
                kfh d2 = ug3.d(b2c.b, false);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, a2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                pd.b(new qzm[0], true, ild.C(615830522, new abb(function04, function05, function06, function22, wn5Var3, wn5Var, f5, s, 0), oq5Var), oq5Var, 432, 0);
                h3 = oq5Var.h(fudVar);
                K2 = oq5Var.K();
                if (!h3 || K2 == kjnVar) {
                    K2 = new yd1(fudVar, 1);
                    oq5Var.k0(K2);
                }
                zsd.r((Function0) K2, null, androidx.compose.foundation.layout.a.j(b.a.a(vci.a, b2c.i), 0, 160), oq5Var, 48);
                oq5Var.p(true);
                f4 = f5;
            }
            f5 = f3;
            oq5Var.q();
            wje s2 = fgq.s(fgq.D(null, oq5Var, 1), 0.05f, 0.1f, weo.C(weo.S(800, 0, null, 6), jyn.b, 0L, 4), null, oq5Var, 4104, 8);
            oq5Var = oq5Var;
            h2 = oq5Var.h(fudVar);
            K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (!h2) {
            }
            K = new td1(fudVar, 1);
            oq5Var.k0(K);
            yci a22 = a.a(yciVar, (Function1) K);
            kfh d22 = ug3.d(b2c.b, false);
            i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l22 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d22, wp5.f);
            g0g.U(oq5Var, l22, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var2);
            g0g.U(oq5Var, H2, wp5.d);
            pd.b(new qzm[0], true, ild.C(615830522, new abb(function04, function05, function06, function22, wn5Var3, wn5Var, f5, s2, 0), oq5Var), oq5Var, 432, 0);
            h3 = oq5Var.h(fudVar);
            K2 = oq5Var.K();
            if (!h3) {
            }
            K2 = new yd1(fudVar, 1);
            oq5Var.k0(K2);
            zsd.r((Function0) K2, null, androidx.compose.foundation.layout.a.j(b.a.a(vci.a, b2c.i), 0, 160), oq5Var, 48);
            oq5Var.p(true);
            f4 = f5;
        } else {
            oq5Var.S();
            f4 = f3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lp5(yciVar, wn5Var, wn5Var2, function2, fudVar, function0, function02, function03, f4, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(rjc rjcVar, Object obj, Object obj2, cg6 cg6Var) {
        klc klcVar;
        int i2;
        if (cg6Var instanceof klc) {
            klcVar = (klc) cg6Var;
            int i3 = klcVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                klcVar.l = i3 - Integer.MIN_VALUE;
                Object obj3 = klcVar.k;
                Object obj4 = nm6.a;
                i2 = klcVar.l;
                if (i2 != 0) {
                    qgg.h0(obj3);
                    klcVar.j = obj2;
                    klcVar.l = 1;
                    if (rjcVar.emit(obj, klcVar) == obj4) {
                        return;
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    obj2 = klcVar.j;
                    qgg.h0(obj3);
                }
                throw new p2(obj2);
            }
        }
        klcVar = new klc(cg6Var);
        Object obj32 = klcVar.k;
        Object obj42 = nm6.a;
        i2 = klcVar.l;
        if (i2 != 0) {
        }
        throw new p2(obj2);
    }

    public static final thj u(ahs ahsVar, spd spdVar) {
        ahsVar.getClass();
        spdVar.getClass();
        String title = ahsVar.getTitle();
        pkb pkbVar = pkb.Shortcut;
        int i2 = spdVar.a;
        int i3 = spdVar.b;
        title.getClass();
        return new thj(pkbVar, title, i2 + 1, i3 + 1, "");
    }

    public static void v(int i2, int i3) {
        GLES20.glBindTexture(i2, i3);
        w();
        GLES20.glTexParameteri(i2, 10240, 9729);
        w();
        GLES20.glTexParameteri(i2, 10241, 9729);
        w();
        GLES20.glTexParameteri(i2, 10242, 33071);
        w();
        GLES20.glTexParameteri(i2, 10243, 33071);
        w();
    }

    public static void w() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new add(sb.toString());
        }
    }

    public static void x(String str, boolean z) {
        if (!z) {
            throw new add(str);
        }
    }

    public static final Object y(rjc rjcVar, pyc pycVar, Continuation continuation, Function0 function0, pjc[] pjcVarArr) {
        ku kuVar = new ku(rjcVar, pycVar, null, function0, pjcVarArr);
        tjc tjcVar = new tjc(continuation.getContext(), continuation, 0);
        Object l0 = swf.l0(tjcVar, true, tjcVar, kuVar);
        return l0 == nm6.a ? l0 : Unit.a;
    }

    public static FloatBuffer z(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
