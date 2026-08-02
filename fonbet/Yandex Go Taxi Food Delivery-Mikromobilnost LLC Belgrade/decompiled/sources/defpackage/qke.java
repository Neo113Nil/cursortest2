package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Process;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.app.s0;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.address.models.Address;
import com.yandex.go.overdraft.data.model.DebtFlow;
import com.yandex.go.overdraft.data.model.DebtStatusesResponse;
import com.yandex.go.overdraft.data.model.OverdraftDto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.HapticController$Effect;

/* loaded from: classes9.dex */
public abstract class qke {
    public static final jb20 o;
    public static final jb20 p;
    public static long r = -1;
    public static Vibrator s;
    public static final int[] a = {-41907, -1358177, -8175121, -12621575};
    public static final float[] b = {0.0f, 0.333f, 0.688f, 1.0f};
    public static int[] c = {-41907, -1358177, -8175121, -12621575};
    public static final int[] d = {-12006176, -12416021, -11511075};
    public static final int[] e = {-12006176, -12347922, -11511075};
    public static int[] f = {-41907, -1358177, -8175121, -12621575};
    public static float[] g = {0.0f, 0.333f, 0.688f, 1.0f};
    public static final float[] h = {0.08f, 0.31f, 0.65f};
    public static float[] i = {0.0f, 0.333f, 0.688f, 1.0f};
    public static final float[] j = {0.0f, 0.24f, 0.65f};
    public static float[] k = {0.0f, 0.51f, 1.058f, 1.5385f};
    public static float[] l = {-1.857f, -0.91f, 0.108f, 1.0f};
    public static float m = 90.0f;
    public static float n = 90.0f;
    public static final gji0 q = new gji0();

    static {
        int i2 = 1;
        o = new jb20("REMOVED_TASK", i2);
        p = new jb20("CLOSED_EMPTY", i2);
    }

    public static final uuh A(Address address) {
        bgq0 d1 = address.d1();
        r0i e2 = d1 != null ? e991.e(d1) : null;
        String J1 = address.J1();
        String n0 = address.n0();
        List<fkb0> P1 = address.P1();
        ArrayList arrayList = new ArrayList(tcc.n(P1, 10));
        for (fkb0 fkb0Var : P1) {
            arrayList.add(new gkb0(fkb0Var.b(), fkb0Var.a()));
        }
        return new uuh(e2, J1, n0, arrayList, address.H1(), address.e2(), address.e0(), address.D1());
    }

    public static final ArrayList B(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Address address = (Address) it.next();
            uuh A = address != null ? A(address) : null;
            if (A != null) {
                arrayList.add(A);
            }
        }
        return arrayList;
    }

    public static final meu C(List list) {
        keu keuVar = new keu();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hvu hvuVar = (hvu) it.next();
            keuVar.a(hvuVar.a, hvuVar.b);
        }
        return keuVar.d();
    }

    public static final c D(c cVar, String[] strArr, tls tlsVar) {
        b bVar;
        if (strArr.length == 0) {
            ny61.g("keys must not be empty");
            return null;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            b bVar2 = (b) cVar.get(str);
            b bVar3 = bVar2 != null ? (b) tlsVar.invoke(bVar2) : null;
            return bVar3 == bVar2 ? cVar : bVar3 == null ? new c(kotlin.collections.b.j(str, cVar)) : new c(kotlin.collections.b.o(cVar, new Pair(str, bVar3)));
        }
        String str2 = strArr[0];
        b bVar4 = (b) cVar.get(str2);
        if (bVar4 == null || bVar4.equals(JsonNull.INSTANCE)) {
            bVar = bVar4;
        } else {
            c m2 = qcx.m(bVar4);
            String[] strArr2 = (String[]) f73.n(1, strArr.length, strArr);
            bVar = D(m2, (String[]) Arrays.copyOf(strArr2, strArr2.length), tlsVar);
        }
        return bVar == bVar4 ? cVar : bVar == null ? new c(kotlin.collections.b.j(str2, cVar)) : new c(kotlin.collections.b.o(cVar, new Pair(str2, bVar)));
    }

    public static void E(Context context, HapticController$Effect hapticController$Effect, boolean z, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        w(context, hapticController$Effect, true, z);
    }

    public static void F(int i2, int i3) {
        String f2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                f2 = ppa1.f("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    ny61.g(oyr.i(i3, "negative size: "));
                    return;
                }
                f2 = ppa1.f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(f2);
        }
    }

    public static void G(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? I(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? I(i3, i4, "end index") : ppa1.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void H(String str, boolean z) {
        if (z) {
            return;
        }
        ny61.r(str);
    }

    public static String I(int i2, int i3, String str) {
        if (i2 < 0) {
            return ppa1.f("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return ppa1.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        ny61.g(oyr.i(i3, "negative size: "));
        return null;
    }

    public static final String a(ht90 ht90Var) {
        return ht90Var.g() + '.' + ht90Var.getName();
    }

    public static final x131 b(a aVar, String str) {
        c231 g2 = aVar.g(str);
        if (g2 instanceof x131) {
            return (x131) g2;
        }
        return null;
    }

    public static void c(ows0 ows0Var, List list, bii0 bii0Var) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            int c2 = ows0Var.c((yss) list.get(i2));
            int P = ows0Var.P(ows0Var.r(c2), ows0Var.b);
            Object obj = P < ows0Var.g(ows0Var.r(c2 + 1), ows0Var.b) ? ows0Var.c[ows0Var.h(P)] : did.a;
            aii0 aii0Var = obj instanceof aii0 ? (aii0) obj : null;
            if (aii0Var != null) {
                aii0Var.a = bii0Var;
            }
        }
    }

    public static int h(Context context, String str) {
        y5e.H(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new s0(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static final long i() {
        return Thread.currentThread().getId();
    }

    public static final t1w j(t1w t1wVar, int i2) {
        int absoluteGravity = Gravity.getAbsoluteGravity(119, i2);
        boolean z = (absoluteGravity & 3) == 3;
        boolean z2 = (absoluteGravity & 48) == 48;
        boolean z3 = (absoluteGravity & 5) == 5;
        boolean z4 = (absoluteGravity & 80) == 80;
        return new t1w(z ? t1wVar.a : 0, z2 ? t1wVar.b : 0, z3 ? t1wVar.c : 0, z4 ? t1wVar.d : 0, z4 ? t1wVar.e : null);
    }

    public static final MapBuilder k(Map map) {
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                mapBuilder.put(key, value);
            }
        }
        return mapBuilder.j();
    }

    public static pl21 l(DebtStatusesResponse debtStatusesResponse) {
        OverdraftDto overdraftDto;
        ArrayList e2 = debtStatusesResponse.e();
        List b2 = debtStatusesResponse.getB();
        DebtFlow e3 = debtStatusesResponse.getE();
        boolean z = (e3 == null || (overdraftDto = e3.g) == null || !overdraftDto.getA()) ? false : true;
        ArrayList h2 = debtStatusesResponse.h();
        DebtFlow e4 = debtStatusesResponse.getE();
        List g2 = debtStatusesResponse.getG();
        List h3 = debtStatusesResponse.getH();
        ief f2 = debtStatusesResponse.getF();
        return new pl21(true, new mug(e2, b2, z, h2, e4, g2, h3, f2 != null ? gwk0.h(f2) : null, debtStatusesResponse.g()));
    }

    public static ColorStateList m(int i2, Context context) {
        return wuj0.a(context.getResources(), i2, context.getTheme());
    }

    public static final KSerializer n(KSerializer kSerializer) {
        return kSerializer.getDescriptor().b() ? kSerializer : new pm60(kSerializer);
    }

    public static final Integer o(ConcurrentHashMap concurrentHashMap, String str, String str2) {
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(new q690(str));
        String str3 = "first";
        if (concurrentHashMap2 == null) {
            concurrentHashMap.put(new q690(str), new ConcurrentHashMap(kotlin.collections.b.l(new Pair(new bnz0(str3), 1))));
            return 1;
        }
        if (concurrentHashMap2.isEmpty()) {
            ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap.get(new q690(str));
            if (concurrentHashMap3 != null) {
            }
            return 1;
        }
        if (str2 == null) {
            return null;
        }
        if (concurrentHashMap2.get(new bnz0(str2)) != null) {
            return (Integer) concurrentHashMap2.get(new bnz0(str2));
        }
        int size = concurrentHashMap2.size() + 1;
        ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) concurrentHashMap.get(new q690(str));
        if (concurrentHashMap4 != null) {
        }
        return Integer.valueOf(size);
    }

    public static final ViewParent p(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(j6h0.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final String q(k7z k7zVar) {
        return k7zVar.e.a();
    }

    public static final String r(xl20 xl20Var, String str) {
        if (xl20Var instanceof ll20) {
            return ((ll20) xl20Var).c.get(str);
        }
        if (xl20Var instanceof tl20) {
            return ((tl20) xl20Var).b.get(str);
        }
        if ((xl20Var instanceof ep20) || (xl20Var instanceof zp20)) {
            return null;
        }
        w511.b();
        return null;
    }

    public static void s(SharedPreferences.Editor editor, SharedPreferences.Editor editor2, SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains(str)) {
            editor2.putBoolean(str, sharedPreferences.getBoolean(str, false));
            editor.remove(str);
        }
    }

    public static void t(SharedPreferences.Editor editor, SharedPreferences.Editor editor2, SharedPreferences sharedPreferences, String str) {
        if (sharedPreferences.contains(str)) {
            editor2.putInt(str, sharedPreferences.getInt(str, 0));
            editor.remove(str);
        }
    }

    public static void u(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final void v(Context context) {
        w(context, HapticController$Effect.CLICK_MEDIUM, true, false);
    }

    public static void w(Context context, HapticController$Effect hapticController$Effect, boolean z, boolean z2) {
        VibrationAttributes createForUsage;
        Vibrator vibrator;
        if (Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 1) != 1) {
            return;
        }
        Vibrator vibrator2 = null;
        if (s == null) {
            if (jx81.e()) {
                VibratorManager h2 = a82.h(context.getSystemService("vibrator_manager"));
                vibrator = h2 != null ? h2.getDefaultVibrator() : null;
            } else {
                vibrator = (Vibrator) context.getSystemService("vibrator");
            }
            s = vibrator;
        }
        Vibrator vibrator3 = s;
        if (vibrator3 != null && vibrator3.hasVibrator()) {
            vibrator2 = s;
        }
        if (vibrator2 == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            long j2 = r;
            if (j2 != -1 && (currentTimeMillis - j2) - 100 < 0) {
                return;
            }
        }
        r = currentTimeMillis;
        boolean hasAmplitudeControl = vibrator2.hasAmplitudeControl();
        if (hasAmplitudeControl || z2) {
            VibrationEffect a2 = hapticController$Effect.a(hasAmplitudeControl);
            if (!jx81.f()) {
                vibrator2.vibrate(a2);
            } else {
                createForUsage = VibrationAttributes.createForUsage(18);
                vibrator2.vibrate(a2, createForUsage);
            }
        }
    }

    public static Intent z(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        int i3 = i2 & 1;
        if (i3 != 0 && (i2 & 4) != 0) {
            ny61.g("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (i3 != 0) {
            i2 |= 2;
        }
        int i4 = i2;
        int i5 = i4 & 2;
        if (i5 == 0 && (i4 & 4) == 0) {
            ny61.g("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i5 == 0 || (i4 & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, null, i4) : pqb1.c(context, broadcastReceiver, intentFilter, i4);
        }
        ny61.g("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        return null;
    }

    public abstract boolean d(ga gaVar, y9 y9Var, y9 y9Var2);

    public abstract boolean e(ga gaVar, Object obj, Object obj2);

    public abstract boolean f(ga gaVar, ea eaVar, ea eaVar2);

    public abstract void g();

    public abstract void x(ea eaVar, ea eaVar2);

    public abstract void y(ea eaVar, Thread thread);
}
