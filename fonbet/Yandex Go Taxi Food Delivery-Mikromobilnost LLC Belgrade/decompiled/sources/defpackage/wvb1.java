package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.n;
import androidx.appcompat.view.menu.MenuBuilder;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.e;
import com.yandex.messenger.websdk.api.ChatRequest;
import com.yandex.messenger.websdk.api.MessengerParams;
import io.flutter.embedding.android.FlutterView;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes11.dex */
public class wvb1 implements hw31, q87, r87, al7, tuw, wm10, e8b1, xsb1 {
    public static final wvb1 c = new wvb1(null, null, true);
    public boolean a;
    public Object b;

    public wvb1(Exception exc, String str, boolean z) {
        this.a = z;
        this.b = exc;
    }

    public static boolean c(ep7 ep7Var) {
        int[] iArr;
        if (Build.VERSION.SDK_INT > 34 && (iArr = (int[]) ep7Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES)) != null) {
            for (int i : iArr) {
                if (i == 6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static wvb1 f(Context context) {
        boolean z = false;
        Float f = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(ACSPConstants.STATUS, -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z = true;
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    f = Float.valueOf(intExtra2 / intExtra3);
                }
            }
        } catch (IllegalStateException e) {
            Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
        }
        return new wvb1(f, z);
    }

    public static wvb1 m(String str) {
        return new wvb1(null, str, false);
    }

    public static wvb1 n(Exception exc, String str) {
        return new wvb1(exc, str, false);
    }

    public void a(ArrayList arrayList) {
        Iterator it;
        Object obj;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            hx81 hx81Var = (hx81) it2.next();
            if (this.a) {
                i3y i3yVar = gs81.a;
                ji81 ji81Var = hx81Var.a;
                it = it2;
                Pair pair = new Pair(new Thread("ApplicationExitInfoDetails"), new StackTraceElement[]{new StackTraceElement("ExitInfo", ClidProvider.TIMESTAMP, ((SimpleDateFormat) gs81.a.getValue()).format(new Date(ji81Var.a)), 0), new StackTraceElement("ExitInfo", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, ji81Var.b, 0), new StackTraceElement("Memory", "pss", gs81.a(ji81Var.f), 0), new StackTraceElement("Memory", "rss", gs81.a(ji81Var.g), 0), new StackTraceElement("Process", "name", ji81Var.h, 0), new StackTraceElement("Process", "pid", String.valueOf(ji81Var.e), 0), new StackTraceElement("Process", "importance", String.valueOf(ji81Var.d), 0), new StackTraceElement("Process", "uid", String.valueOf(ji81Var.j), 0), new StackTraceElement("Process", ACSPConstants.STATUS, String.valueOf(ji81Var.i), 0)});
                obj = b.o(hx81Var.b, new Pair((Thread) pair.getFirst(), (StackTraceElement[]) pair.getSecond()));
            } else {
                it = it2;
                obj = hx81Var.b;
            }
            ge71 ge71Var = (ge71) this.b;
            if (ge71Var.a != null) {
                ge71Var.c.execute(new bo31(29, ge71Var, obj));
            }
            it2 = it;
        }
    }

    @Override // defpackage.xsb1
    public o3 b() {
        ebb1 ebb1Var = new ebb1();
        zzot zzotVar = this.a ? zzot.TYPE_THICK : zzot.TYPE_THIN;
        zzou zzouVar = (zzou) this.b;
        ebb1Var.c = zzotVar;
        lmb1 lmb1Var = new lmb1();
        lmb1Var.a = zzouVar;
        ebb1Var.e = new qmb1(lmb1Var);
        return new o3(ebb1Var, 0);
    }

    public synchronized void d() {
        if (this.a) {
            throw new IllegalStateException("CMSProcessableInputStream can only be used once");
        }
        this.a = true;
    }

    public boolean e() {
        return this.a;
    }

    public Float g() {
        return (Float) this.b;
    }

    @Override // defpackage.q87
    public Object getContent() {
        d();
        return (InputStream) this.b;
    }

    @Override // defpackage.r87
    public InputStream getInputStream() {
        d();
        return (InputStream) this.b;
    }

    public int h() {
        Float f;
        if (!this.a || (f = (Float) this.b) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }

    public boolean i(int i, int i2, CharSequence charSequence) {
        if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
            w511.q();
            return false;
        }
        if (((wly0) this.b) == null) {
            return e();
        }
        int i3 = i2 + i;
        char c2 = 2;
        while (i < i3 && c2 == 2) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i));
            wvb1 wvb1Var = xly0.a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                    i++;
                }
                c2 = 0;
                i++;
            }
            c2 = 1;
            i++;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return e();
        }
        return false;
    }

    public void j(boolean z) {
        if (this.a) {
            ny61.r("The onKeyEventHandledCallback should be called exactly once.");
            return;
        }
        this.a = true;
        xe6 xe6Var = (xe6) this.b;
        int i = xe6Var.b - 1;
        xe6Var.b = i;
        boolean z2 = z | xe6Var.c;
        xe6Var.c = z2;
        if (i != 0 || z2) {
            return;
        }
        jkx jkxVar = (jkx) xe6Var.e;
        KeyEvent keyEvent = (KeyEvent) xe6Var.d;
        HashSet hashSet = jkxVar.b;
        FlutterView flutterView = jkxVar.c;
        if (flutterView == null || flutterView.onTextInputKeyEvent(keyEvent)) {
            return;
        }
        hashSet.add(keyEvent);
        flutterView.redispatch(keyEvent);
        hashSet.remove(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    @Override // defpackage.hw31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n751 k(View view, n751 n751Var, iw31 iw31Var) {
        boolean z;
        boolean z2;
        k751 k751Var = n751Var.a;
        u1w g = k751Var.g(519);
        u1w g2 = k751Var.g(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
        int i = g.b;
        int i2 = g.c;
        int i3 = g.a;
        bottomSheetBehavior.Q = i;
        boolean i4 = e.i(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z3 = bottomSheetBehavior.I;
        if (z3) {
            int a = n751Var.a();
            bottomSheetBehavior.P = a;
            paddingBottom = a + iw31Var.d;
        }
        if (bottomSheetBehavior.J) {
            paddingLeft = (i4 ? iw31Var.c : iw31Var.a) + i3;
        }
        if (bottomSheetBehavior.K) {
            paddingRight = (i4 ? iw31Var.a : iw31Var.c) + i2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z4 = true;
        if (!bottomSheetBehavior.M || marginLayoutParams.leftMargin == i3) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i3;
            z = true;
        }
        if (bottomSheetBehavior.N && marginLayoutParams.rightMargin != i2) {
            marginLayoutParams.rightMargin = i2;
            z = true;
        }
        if (bottomSheetBehavior.O) {
            int i5 = marginLayoutParams.topMargin;
            int i6 = g.b;
            if (i5 != i6) {
                marginLayoutParams.topMargin = i6;
                if (z4) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z2 = this.a;
                if (z2) {
                    bottomSheetBehavior.G = g2.d;
                }
                if (z3 && !z2) {
                    return n751Var;
                }
                bottomSheetBehavior.e0();
                return n751Var;
            }
        }
        z4 = z;
        if (z4) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z2 = this.a;
        if (z2) {
        }
        if (z3) {
        }
        bottomSheetBehavior.e0();
        return n751Var;
    }

    public void l() {
    }

    @Override // defpackage.wm10
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        n nVar = (n) this.b;
        if (this.a) {
            return;
        }
        this.a = true;
        nVar.a.a.dismissPopupMenus();
        nVar.b.onPanelClosed(108, menuBuilder);
        this.a = false;
    }

    @Override // defpackage.al7
    public void onFailure(yf7 yf7Var, IOException iOException) {
        hwu hwuVar = (hwu) this.b;
        ew2 ew2Var = hwuVar.f;
        Pair pair = new Pair(CRLReasonCodeExtension.REASON, "network error");
        String message = iOException.getMessage();
        if (message == null) {
            message = "";
        }
        ew2Var.c("wm_unread_count_error", b.i(pair, new Pair("error", message)));
        hwuVar.b(iOException);
    }

    @Override // defpackage.wm10
    public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
        ((n) this.b).b.onMenuOpened(108, menuBuilder);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    @Override // defpackage.al7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        JSONObject jSONObject;
        JSONObject f;
        Class<Integer> cls;
        boolean z;
        String str;
        Class<Integer> cls2;
        MapBuilder mapBuilder;
        MapBuilder mapBuilder2;
        MapBuilder mapBuilder3;
        MapBuilder mapBuilder4;
        ChatRequest chatRequest;
        int i;
        Integer d;
        Object obj;
        ChatRequest chatRequest2;
        Object obj2;
        Integer num;
        int intValue;
        Integer d2;
        long j;
        long j2;
        long millis;
        Integer d3;
        Integer d4;
        Integer d5;
        JSONObject f2;
        Object l;
        Object valueOf;
        JSONObject f3;
        Object l2;
        Object valueOf2;
        byte[] bytes;
        byte[] bytes2;
        boolean z2 = this.a;
        hwu hwuVar = (hwu) this.b;
        rvj0 rvj0Var = kvj0Var.z;
        if (!kvj0Var.J) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(oyr.k(kvj0Var.w, "messenger's backend error, code = ", ", body = ", (rvj0Var == null || (bytes2 = rvj0Var.bytes()) == null) ? null : cvu0.q(bytes2)));
            ew2 ew2Var = hwuVar.f;
            Pair pair = new Pair(CRLReasonCodeExtension.REASON, "backend error");
            String message = illegalArgumentException.getMessage();
            if (message == null) {
                message = "";
            }
            ew2Var.c("wm_unread_count_error", b.i(pair, new Pair("error", message)));
            hwuVar.b(illegalArgumentException);
            return;
        }
        if (rvj0Var != null && (bytes = rvj0Var.bytes()) != null) {
            String q = cvu0.q(bytes);
            if (evu0.J(q)) {
                q = null;
            }
            if (q != null) {
                jSONObject = new JSONObject(q);
                f = jSONObject == null ? hbb1.f("Details", jSONObject) : null;
                String str2 = "null cannot be cast to non-null type kotlin.Int";
                cls = Integer.class;
                Class cls3 = Integer.TYPE;
                Class cls4 = Long.TYPE;
                if (f != null || (f3 = hbb1.f("Ns", f)) == null) {
                    z = z2;
                    str = "null cannot be cast to non-null type kotlin.Int";
                    cls2 = cls;
                    mapBuilder = null;
                    mapBuilder2 = null;
                } else {
                    mapBuilder = null;
                    MapBuilder mapBuilder5 = new MapBuilder();
                    Iterator<String> keys = f3.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        boolean z3 = z2;
                        g0c a = qoi0.a(cls);
                        String str3 = str2;
                        if (a.equals(qoi0.a(String.class))) {
                            l2 = next;
                        } else if (a.equals(qoi0.a(cls4))) {
                            l2 = bvu0.m(10, next);
                        } else {
                            if (!a.equals(qoi0.a(cls3))) {
                                ny61.r("Not implemented");
                                return;
                            }
                            l2 = bvu0.l(10, next);
                        }
                        if (l2 == null) {
                            ny61.t(str3);
                            return;
                        }
                        Integer num2 = (Integer) l2;
                        g0c a2 = qoi0.a(cls);
                        Class<Integer> cls5 = cls;
                        if (a2.equals(qoi0.a(String.class))) {
                            valueOf2 = f3.optString(next);
                        } else if (a2.equals(qoi0.a(cls4))) {
                            valueOf2 = Long.valueOf(f3.optLong(next));
                        } else {
                            if (!a2.equals(qoi0.a(cls3))) {
                                ny61.r("Not implemented");
                                return;
                            }
                            valueOf2 = Integer.valueOf(f3.optInt(next));
                        }
                        if (valueOf2 == null) {
                            ny61.t(str3);
                            return;
                        }
                        mapBuilder5.put(num2, (Integer) valueOf2);
                        str2 = str3;
                        z2 = z3;
                        cls = cls5;
                    }
                    z = z2;
                    str = str2;
                    cls2 = cls;
                    mapBuilder2 = mapBuilder5.j();
                }
                if (f != null || (f2 = hbb1.f("Bots", f)) == null) {
                    mapBuilder3 = mapBuilder2;
                    mapBuilder4 = mapBuilder;
                } else {
                    MapBuilder mapBuilder6 = new MapBuilder();
                    Iterator<String> keys2 = f2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        g0c a3 = qoi0.a(String.class);
                        if (a3.equals(qoi0.a(String.class))) {
                            l = next2;
                        } else if (a3.equals(qoi0.a(cls4))) {
                            l = bvu0.m(10, next2);
                        } else {
                            if (!a3.equals(qoi0.a(cls3))) {
                                ny61.r("Not implemented");
                                return;
                            }
                            l = bvu0.l(10, next2);
                        }
                        if (l == null) {
                            ny61.t("null cannot be cast to non-null type kotlin.String");
                            return;
                        }
                        String str4 = (String) l;
                        g0c a4 = qoi0.a(cls2);
                        MapBuilder mapBuilder7 = mapBuilder2;
                        if (a4.equals(qoi0.a(String.class))) {
                            valueOf = f2.optString(next2);
                        } else if (a4.equals(qoi0.a(cls4))) {
                            valueOf = Long.valueOf(f2.optLong(next2));
                        } else {
                            if (!a4.equals(qoi0.a(cls3))) {
                                ny61.r("Not implemented");
                                return;
                            }
                            valueOf = Integer.valueOf(f2.optInt(next2));
                        }
                        if (valueOf == null) {
                            ny61.t(str);
                            return;
                        } else {
                            mapBuilder6.put(str4, (Integer) valueOf);
                            mapBuilder2 = mapBuilder7;
                        }
                    }
                    mapBuilder3 = mapBuilder2;
                    mapBuilder4 = mapBuilder6.j();
                }
                chatRequest = hwuVar.a;
                MessengerParams messengerParams = hwuVar.e;
                i = 0;
                if (chatRequest instanceof j8b) {
                    if (!(chatRequest instanceof f8b) && !(chatRequest instanceof i8b) && chatRequest != null) {
                        w511.b();
                        return;
                    }
                    obj = Integer.valueOf((jSONObject == null || (d = hbb1.d("UnreadCount", jSONObject)) == null) ? 0 : d.intValue());
                } else if (z) {
                    obj = mapBuilder;
                } else {
                    obj = Integer.valueOf((jSONObject == null || (d5 = hbb1.d("UnreadCount", jSONObject)) == null) ? 0 : d5.intValue());
                }
                chatRequest2 = hwuVar.a;
                if (!(chatRequest2 instanceof f8b)) {
                    obj2 = Integer.valueOf((jSONObject == null || (d4 = hbb1.d("ChatUnreadCount", jSONObject)) == null) ? 0 : d4.intValue());
                } else if (chatRequest2 instanceof j8b) {
                    if (z) {
                        if (jSONObject != null && (d2 = hbb1.d("UnreadCount", jSONObject)) != null) {
                            intValue = d2.intValue();
                            obj2 = Integer.valueOf(intValue);
                        }
                        intValue = 0;
                        obj2 = Integer.valueOf(intValue);
                    } else {
                        if (mapBuilder4 != null && (num = (Integer) mapBuilder4.get(((j8b) chatRequest2).a)) != null) {
                            intValue = num.intValue();
                            obj2 = Integer.valueOf(intValue);
                        }
                        intValue = 0;
                        obj2 = Integer.valueOf(intValue);
                    }
                } else {
                    if (!(chatRequest2 instanceof i8b) && chatRequest2 != null) {
                        w511.b();
                        return;
                    }
                    obj2 = mapBuilder;
                }
                if (jSONObject != null && (d3 = hbb1.d("ChatCount", jSONObject)) != null) {
                    i = d3.intValue();
                }
                if (jSONObject != null) {
                    Long valueOf3 = jSONObject.has("Ttl") ? Long.valueOf(jSONObject.getLong("Ttl")) : null;
                    if (valueOf3 != null) {
                        j = valueOf3.longValue();
                        messengerParams.getClass();
                        if (j > 0) {
                            Integer valueOf4 = Integer.valueOf(i);
                            if (mapBuilder3 != null) {
                                messengerParams.getClass();
                            }
                            if (mapBuilder4 != null) {
                                messengerParams.getClass();
                            }
                            j2 = j;
                            w221 w221Var = new w221(obj, obj2, valueOf4, mapBuilder, mapBuilder);
                            o221 o221Var = hwuVar.d;
                            if (o221Var != null) {
                                o221Var.invoke(w221Var);
                            }
                        } else {
                            j2 = j;
                        }
                        millis = TimeUnit.SECONDS.toMillis(j2);
                        if (!jl40.f && jl40.l(Looper.getMainLooper(), Looper.myLooper())) {
                            ny61.f("code must working only in background thread");
                            return;
                        } else if (millis > 0) {
                            hwuVar.j.postDelayed(new gwu(hwuVar, 2), millis);
                            return;
                        } else {
                            hwuVar.b(new IllegalArgumentException("wrong ttl"));
                            hwuVar.f.c("wm_unread_count_error", b.i(new Pair(CRLReasonCodeExtension.REASON, "wrong ttl"), new Pair("error", qv10.j(millis, "unread_count polling stopped because of wrong ttl "))));
                            return;
                        }
                    }
                }
                j = 0;
                messengerParams.getClass();
                if (j > 0) {
                }
                millis = TimeUnit.SECONDS.toMillis(j2);
                if (!jl40.f) {
                }
                if (millis > 0) {
                }
            }
        }
        jSONObject = null;
        if (jSONObject == null) {
        }
        String str22 = "null cannot be cast to non-null type kotlin.Int";
        cls = Integer.class;
        Class cls32 = Integer.TYPE;
        Class cls42 = Long.TYPE;
        if (f != null) {
        }
        z = z2;
        str = "null cannot be cast to non-null type kotlin.Int";
        cls2 = cls;
        mapBuilder = null;
        mapBuilder2 = null;
        if (f != null) {
        }
        mapBuilder3 = mapBuilder2;
        mapBuilder4 = mapBuilder;
        chatRequest = hwuVar.a;
        MessengerParams messengerParams2 = hwuVar.e;
        i = 0;
        if (chatRequest instanceof j8b) {
        }
        chatRequest2 = hwuVar.a;
        if (!(chatRequest2 instanceof f8b)) {
        }
        if (jSONObject != null) {
            i = d3.intValue();
        }
        if (jSONObject != null) {
        }
        j = 0;
        messengerParams2.getClass();
        if (j > 0) {
        }
        millis = TimeUnit.SECONDS.toMillis(j2);
        if (!jl40.f) {
        }
        if (millis > 0) {
        }
    }

    @Override // defpackage.tuw
    public void start() {
        ((tuw) this.b).start();
        this.a = true;
    }

    @Override // defpackage.tuw
    public void stop() {
        ((tuw) this.b).stop();
        this.a = false;
    }

    @Override // defpackage.q87
    public void write(OutputStream outputStream) {
        d();
        InputStream inputStream = (InputStream) this.b;
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr, 0, 4096);
            if (read < 0) {
                inputStream.close();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    @Override // defpackage.e8b1
    public o3 zza() {
        boolean z = this.a;
        zzks zzksVar = (zzks) this.b;
        rqa1 rqa1Var = new rqa1();
        rqa1Var.c = z ? zzkr.TYPE_THICK : zzkr.TYPE_THIN;
        tua1 tua1Var = new tua1();
        tua1Var.a = zzksVar;
        rqa1Var.e = new dva1(tua1Var);
        return new o3(rqa1Var, 0);
    }

    public /* synthetic */ wvb1(Object obj) {
        this.b = obj;
    }

    public /* synthetic */ wvb1(Object obj, boolean z) {
        this.a = z;
        this.b = obj;
    }

    public /* synthetic */ wvb1(boolean z, Object obj) {
        this.a = z;
        this.b = obj;
    }

    public wvb1(wly0 wly0Var, boolean z) {
        this(wly0Var);
        this.a = z;
    }
}
