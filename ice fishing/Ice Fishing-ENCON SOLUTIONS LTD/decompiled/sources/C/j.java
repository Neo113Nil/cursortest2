package C;

import A1.C0015p;
import C.j;
import F.C0028d;
import F.C0044u;
import F.InterfaceC0033i;
import F.b0;
import F.d0;
import F.k0;
import F.l0;
import P0.AbstractActivityC0072e;
import Q1.A;
import a1.C0093i;
import a1.C0099o;
import a1.C0100p;
import a1.InterfaceC0086b;
import a1.InterfaceC0088d;
import a1.InterfaceC0089e;
import a1.InterfaceC0090f;
import a1.InterfaceC0095k;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import b.AbstractDialogC0126a;
import com.yandex.varioqub.config.FetchError;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.model.ConfigValue;
import h1.C0239i;
import io.appmetrica.analytics.impl.C0376e9;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m1.EnumC0985a;
import n1.AbstractC0995f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j implements D1.d, OnFetchCompleteListener, InterfaceC0033i, N.d, InterfaceC0088d, InterfaceC0090f, InterfaceC0086b, InterfaceC0095k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123a;

    /* renamed from: b, reason: collision with root package name */
    public Object f124b;

    public /* synthetic */ j(int i2, Object obj) {
        this.f123a = i2;
        this.f124b = obj;
    }

    public static int m(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0175 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x0197, B:45:0x019f, B:47:0x01a7, B:49:0x01b9, B:50:0x01bc, B:52:0x01e3, B:54:0x01f3, B:71:0x02b4, B:78:0x02ce, B:80:0x02de, B:81:0x02ef, B:84:0x02ec, B:114:0x01da, B:107:0x0227, B:100:0x0245, B:68:0x0289, B:93:0x02ac, B:75:0x02c6, B:86:0x02f4, B:116:0x001f, B:119:0x002d, B:122:0x0038, B:125:0x0044, B:128:0x0050, B:131:0x005b, B:134:0x0067, B:137:0x0071, B:140:0x007b, B:143:0x0085, B:146:0x008f, B:149:0x0099, B:152:0x00a4, B:155:0x00af, B:158:0x00ba, B:57:0x024e, B:59:0x0258, B:60:0x025b, B:62:0x0271, B:63:0x0283, B:66:0x027a), top: B:6:0x0014, inners: #3, #6, #8, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0182 A[Catch: JSONException -> 0x002a, TryCatch #10 {JSONException -> 0x002a, blocks: (B:7:0x0014, B:8:0x001a, B:13:0x00cf, B:15:0x00d4, B:17:0x0103, B:20:0x0127, B:22:0x011a, B:25:0x0121, B:26:0x0136, B:28:0x015a, B:38:0x015e, B:31:0x016b, B:33:0x0175, B:35:0x0182, B:40:0x0163, B:41:0x0187, B:43:0x0197, B:45:0x019f, B:47:0x01a7, B:49:0x01b9, B:50:0x01bc, B:52:0x01e3, B:54:0x01f3, B:71:0x02b4, B:78:0x02ce, B:80:0x02de, B:81:0x02ef, B:84:0x02ec, B:114:0x01da, B:107:0x0227, B:100:0x0245, B:68:0x0289, B:93:0x02ac, B:75:0x02c6, B:86:0x02f4, B:116:0x001f, B:119:0x002d, B:122:0x0038, B:125:0x0044, B:128:0x0050, B:131:0x005b, B:134:0x0067, B:137:0x0071, B:140:0x007b, B:143:0x0085, B:146:0x008f, B:149:0x0099, B:152:0x00a4, B:155:0x00af, B:158:0x00ba, B:57:0x024e, B:59:0x0258, B:60:0x025b, B:62:0x0271, B:63:0x0283, B:66:0x027a), top: B:6:0x0014, inners: #3, #6, #8, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void n(x0.e eVar, Z0.j jVar) {
        char c2;
        Z0.d a2;
        CharSequence l2;
        ClipDescription primaryClipDescription;
        x0.e eVar2 = (x0.e) this.f124b;
        if (((Z0.i) eVar2.f8531c) == null) {
            return;
        }
        String str = (String) eVar.f8530b;
        try {
            boolean z2 = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            Object obj = eVar.f8531c;
            switch (c2) {
                case 0:
                    try {
                        int c3 = C1.a.c((String) obj);
                        io.flutter.plugin.platform.e eVar3 = (io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b;
                        if (c3 == 1) {
                            eVar3.f7837a.getWindow().getDecorView().playSoundEffect(0);
                        } else {
                            eVar3.getClass();
                        }
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        jVar.a("error", e2.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((Z0.i) eVar2.f8531c).x(C1.a.b((String) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException e3) {
                        jVar.a("error", e3.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b).f7837a.setRequestedOrientation(x0.e.h(eVar2, (JSONArray) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e4) {
                        jVar.a("error", e4.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i2 = jSONObject.getInt("primaryColor");
                        if (i2 != 0) {
                            i2 |= -16777216;
                        }
                        String string = jSONObject.getString("label");
                        Z0.i iVar = (Z0.i) eVar2.f8531c;
                        int i3 = Build.VERSION.SDK_INT;
                        AbstractActivityC0072e abstractActivityC0072e = ((io.flutter.plugin.platform.e) iVar.f1992b).f7837a;
                        if (i3 < 28) {
                            abstractActivityC0072e.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i2));
                        } else {
                            abstractActivityC0072e.setTaskDescription(F0.e.d(i2, string));
                        }
                        jVar.c(null);
                        return;
                    } catch (JSONException e5) {
                        jVar.a("error", e5.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((Z0.i) eVar2.f8531c).u(x0.e.j(eVar2, (JSONArray) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        jVar.a("error", e6.getMessage(), null);
                        return;
                    }
                case 5:
                    try {
                        ((Z0.i) eVar2.f8531c).v(x0.e.k(eVar2, (String) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        jVar.a("error", e7.getMessage(), null);
                        return;
                    }
                case 6:
                    io.flutter.plugin.platform.e eVar4 = (io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b;
                    View decorView = eVar4.f7837a.getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.d(eVar4, decorView));
                    jVar.c(null);
                    return;
                case 7:
                    ((io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b).b();
                    jVar.c(null);
                    return;
                case '\b':
                    try {
                        ((io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b).a(x0.e.l(eVar2, (JSONObject) obj));
                        jVar.c(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e8) {
                        jVar.a("error", e8.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    AbstractActivityC0072e abstractActivityC0072e2 = ((io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b).f7839c;
                    if (abstractActivityC0072e2 != null) {
                        abstractActivityC0072e2.i(booleanValue);
                    }
                    jVar.c(null);
                    return;
                case '\n':
                    io.flutter.plugin.platform.e eVar5 = (io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b;
                    AbstractActivityC0072e abstractActivityC0072e3 = eVar5.f7839c;
                    AbstractActivityC0072e abstractActivityC0072e4 = eVar5.f7837a;
                    if (abstractActivityC0072e4 instanceof b.b) {
                        ((AbstractDialogC0126a) ((b.b) abstractActivityC0072e4)).getClass();
                        throw null;
                    }
                    abstractActivityC0072e4.finish();
                    jVar.c(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a2 = Z0.d.a(str2);
                        } catch (NoSuchFieldException unused) {
                            jVar.a("error", "No such clipboard content format: ".concat(str2), null);
                        }
                        l2 = ((Z0.i) eVar2.f8531c).l(a2);
                        if (l2 != null) {
                            jVar.c(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", l2);
                        jVar.c(jSONObject2);
                        return;
                    }
                    a2 = null;
                    l2 = ((Z0.i) eVar2.f8531c).l(a2);
                    if (l2 != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b).f7837a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    jVar.c(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b).f7837a.getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z2 = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z2);
                    jVar.c(jSONObject3);
                    return;
                case 14:
                    io.flutter.plugin.platform.e eVar6 = (io.flutter.plugin.platform.e) ((Z0.i) eVar2.f8531c).f1992b;
                    eVar6.getClass();
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    eVar6.f7837a.startActivity(Intent.createChooser(intent, null));
                    jVar.c(null);
                    return;
                default:
                    jVar.b();
                    return;
            }
        } catch (JSONException e9) {
            jVar.a("error", "JSON error: " + e9.getMessage(), null);
        }
        jVar.a("error", "JSON error: " + e9.getMessage(), null);
    }

    @Override // N.d
    public void a(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f124b).setResultCode(i2);
    }

    @Override // a1.InterfaceC0088d
    public void b(ByteBuffer byteBuffer, R0.g gVar) {
        C0100p.f2038b.getClass();
        C0100p.a(byteBuffer);
        ((R0.b) this.f124b).getClass();
    }

    @Override // a1.InterfaceC0090f
    public void c(String str, ByteBuffer byteBuffer, InterfaceC0089e interfaceC0089e) {
        ((R0.i) this.f124b).c(str, byteBuffer, interfaceC0089e);
    }

    @Override // N.d
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // a1.InterfaceC0090f
    public m0.j e(C0093i c0093i) {
        return ((R0.i) this.f124b).e(c0093i);
    }

    @Override // a1.InterfaceC0090f
    public void f(String str, InterfaceC0088d interfaceC0088d) {
        ((R0.i) this.f124b).h(str, interfaceC0088d, null);
    }

    @Override // a1.InterfaceC0086b
    public void g(Object obj, x0.e eVar) {
        HashMap hashMap;
        HashMap hashMap2;
        I0.b bVar = (I0.b) this.f124b;
        if (((io.flutter.view.b) bVar.f723d) == null) {
            eVar.f(null);
            return;
        }
        hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) bVar.f723d;
                    if (Build.VERSION.SDK_INT < 28) {
                        io.flutter.view.h hVar = (io.flutter.view.h) bVar2.f7887a;
                        AccessibilityEvent d2 = hVar.d(0, 32);
                        d2.getText().add(str2);
                        hVar.h(d2);
                        break;
                    } else {
                        bVar2.getClass();
                        break;
                    }
                }
                break;
            case "announce":
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) bVar.f723d;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar3.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.h) bVar3.f7887a).f7975a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) bVar.f723d;
                    ((io.flutter.view.h) bVar4.f7887a).g(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar5 = (io.flutter.view.b) bVar.f723d;
                    ((io.flutter.view.h) bVar5.f7887a).g(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar6 = (io.flutter.view.b) bVar.f723d;
                    ((io.flutter.view.h) bVar6.f7887a).g(num3.intValue(), 2);
                    break;
                }
                break;
        }
        eVar.f(null);
    }

    @Override // F.InterfaceC0033i
    public D1.d getData() {
        return ((InterfaceC0033i) this.f124b).getData();
    }

    @Override // a1.InterfaceC0090f
    public void h(String str, InterfaceC0088d interfaceC0088d, m0.j jVar) {
        ((R0.i) this.f124b).h(str, interfaceC0088d, jVar);
    }

    @Override // a1.InterfaceC0095k
    public void i(x0.e eVar, Z0.j jVar) {
        Object obj;
        switch (this.f123a) {
            case 23:
                ((m0.j) this.f124b).getClass();
                return;
            case 24:
            case C0376e9.f5886H /* 27 */:
            default:
                Z0.i iVar = (Z0.i) this.f124b;
                if (((x0.e) iVar.f1992b) == null) {
                    return;
                }
                String str = (String) eVar.f8530b;
                str.getClass();
                obj = eVar.f8531c;
                switch (str) {
                    case "create":
                        Map map = (Map) obj;
                        boolean z2 = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            FlutterJNI flutterJNI = ((io.flutter.plugin.platform.j) ((x0.e) iVar.f1992b).f8531c).f7846d;
                            if (!(flutterJNI == null ? false : flutterJNI.IsSurfaceControlEnabled())) {
                                if (z2) {
                                    ((io.flutter.plugin.platform.k) ((x0.e) iVar.f1992b).f8530b).f7876u.h(new A(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                    throw null;
                                }
                                ((io.flutter.plugin.platform.k) ((x0.e) iVar.f1992b).f8530b).f7876u.j(new A(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                                throw null;
                            }
                            ((Integer) map.get("id")).getClass();
                            String str2 = (String) map.get("viewType");
                            ((Integer) map.get("direction")).getClass();
                            if (((io.flutter.plugin.platform.j) ((io.flutter.plugin.platform.j) ((x0.e) iVar.f1992b).f8531c).f7856n.f1992b).f7843a.f1552a.get(str2) != null) {
                                throw new ClassCastException();
                            }
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str2);
                        } catch (IllegalStateException e2) {
                            jVar.a("error", Log.getStackTraceString(e2), null);
                            return;
                        }
                    case "offset":
                        Map map2 = (Map) obj;
                        try {
                            x0.e eVar2 = (x0.e) iVar.f1992b;
                            int intValue = ((Integer) map2.get("id")).intValue();
                            double doubleValue = ((Double) map2.get("top")).doubleValue();
                            double doubleValue2 = ((Double) map2.get("left")).doubleValue();
                            ((io.flutter.plugin.platform.j) eVar2.f8531c).g(intValue);
                            ((io.flutter.plugin.platform.k) eVar2.f8530b).f7876u.p(intValue, doubleValue, doubleValue2);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e3) {
                            jVar.a("error", Log.getStackTraceString(e3), null);
                            return;
                        }
                    case "resize":
                        Map map3 = (Map) obj;
                        int intValue2 = ((Integer) map3.get("id")).intValue();
                        Z0.h hVar = new Z0.h(intValue2, ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue());
                        try {
                            x0.e eVar3 = (x0.e) iVar.f1992b;
                            H0.b bVar = new H0.b(11, jVar);
                            eVar3.getClass();
                            ((io.flutter.plugin.platform.j) eVar3.f8531c).g(intValue2);
                            ((io.flutter.plugin.platform.k) eVar3.f8530b).f7876u.s(hVar, bVar);
                            return;
                        } catch (IllegalStateException e4) {
                            jVar.a("error", Log.getStackTraceString(e4), null);
                            return;
                        }
                    case "clearFocus":
                        int intValue3 = ((Integer) obj).intValue();
                        try {
                            x0.e eVar4 = (x0.e) iVar.f1992b;
                            ((io.flutter.plugin.platform.j) eVar4.f8531c).g(intValue3);
                            ((io.flutter.plugin.platform.k) eVar4.f8530b).f7876u.g(intValue3);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e5) {
                            jVar.a("error", Log.getStackTraceString(e5), null);
                            return;
                        }
                    case "synchronizeToNativeViewHierarchy":
                        try {
                            ((io.flutter.plugin.platform.k) ((io.flutter.plugin.platform.k) ((x0.e) iVar.f1992b).f8530b).f7876u.f1992b).f7873q = ((Boolean) obj).booleanValue();
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e6) {
                            jVar.a("error", Log.getStackTraceString(e6), null);
                            return;
                        }
                    case "touch":
                        List list = (List) obj;
                        int intValue4 = ((Integer) list.get(0)).intValue();
                        Z0.g gVar = new Z0.g(intValue4, (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                        try {
                            x0.e eVar5 = (x0.e) iVar.f1992b;
                            eVar5.getClass();
                            ((io.flutter.plugin.platform.j) eVar5.f8531c).g(intValue4);
                            ((io.flutter.plugin.platform.k) eVar5.f8530b).f7876u.q(gVar);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e7) {
                            jVar.a("error", Log.getStackTraceString(e7), null);
                            return;
                        }
                    case "setDirection":
                        Map map4 = (Map) obj;
                        int intValue5 = ((Integer) map4.get("id")).intValue();
                        int intValue6 = ((Integer) map4.get("direction")).intValue();
                        try {
                            x0.e eVar6 = (x0.e) iVar.f1992b;
                            ((io.flutter.plugin.platform.j) eVar6.f8531c).g(intValue5);
                            ((io.flutter.plugin.platform.k) eVar6.f8530b).f7876u.t(intValue5, intValue6);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e8) {
                            jVar.a("error", Log.getStackTraceString(e8), null);
                            return;
                        }
                    case "dispose":
                        int intValue7 = ((Integer) ((Map) obj).get("id")).intValue();
                        try {
                            x0.e eVar7 = (x0.e) iVar.f1992b;
                            ((io.flutter.plugin.platform.j) eVar7.f8531c).g(intValue7);
                            ((io.flutter.plugin.platform.k) eVar7.f8530b).f7876u.k(intValue7);
                            jVar.c(null);
                            return;
                        } catch (IllegalStateException e9) {
                            jVar.a("error", Log.getStackTraceString(e9), null);
                            return;
                        }
                    default:
                        jVar.b();
                        return;
                }
            case C0376e9.f5885F /* 25 */:
                x0.e eVar8 = (x0.e) this.f124b;
                if (((Z0.i) eVar8.f8531c) == null) {
                    return;
                }
                String str3 = (String) eVar.f8530b;
                str3.getClass();
                if (!str3.equals("Localization.getStringResource")) {
                    jVar.b();
                    return;
                }
                JSONObject jSONObject = (JSONObject) eVar.f8531c;
                try {
                    jVar.c(((Z0.i) eVar8.f8531c).m(jSONObject.getString("key"), jSONObject.has(CommonUrlParts.LOCALE) ? jSONObject.getString(CommonUrlParts.LOCALE) : null));
                    return;
                } catch (JSONException e10) {
                    jVar.a("error", e10.getMessage(), null);
                    return;
                }
            case C0376e9.G /* 26 */:
                j jVar2 = (j) this.f124b;
                if (((Z0.i) jVar2.f124b) == null) {
                    return;
                }
                String str4 = (String) eVar.f8530b;
                try {
                    if (str4.hashCode() == -1307105544 && str4.equals("activateSystemCursor")) {
                        try {
                            ((Z0.i) jVar2.f124b).f((String) ((HashMap) eVar.f8531c).get("kind"));
                            jVar.c(Boolean.TRUE);
                        } catch (Exception e11) {
                            jVar.a("error", "Error when setting cursors: " + e11.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e12) {
                    jVar.a("error", "Unhandled error: " + e12.getMessage(), null);
                    return;
                }
            case 28:
                n(eVar, jVar);
                return;
        }
    }

    @Override // F.InterfaceC0033i
    public Object j(t1.p pVar, AbstractC0995f abstractC0995f) {
        return ((InterfaceC0033i) this.f124b).j(new I.c(pVar, null), abstractC0995f);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T0.a] */
    public Bitmap k(ByteBuffer byteBuffer, T0.d dVar) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: T0.a
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace.Named named;
                    ColorSpace colorSpace;
                    Size size;
                    j jVar = j.this;
                    jVar.getClass();
                    named = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(named);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    Q0.j jVar2 = (Q0.j) jVar.f124b;
                    if (jVar2 != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(jVar2.f1553a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e2) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e2);
            return null;
        }
    }

    public k0 l() {
        D1.r rVar = (D1.r) this.f124b;
        rVar.getClass();
        j jVar = E1.l.f331a;
        Object obj = D1.r.f299e.get(rVar);
        if (obj == jVar) {
            obj = null;
        }
        return (k0) obj;
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onError(String str, FetchError fetchError) {
        long j2;
        switch (G0.a.f641a[fetchError.ordinal()]) {
            case 1:
                j2 = 1;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j2 = 2;
                break;
            default:
                Log.e("VarioqubFlutter", "Unknown fetch error: " + fetchError);
                j2 = -1;
                break;
        }
        Long valueOf = Long.valueOf(j2);
        String name = fetchError.name();
        H0.a aVar = new H0.a();
        aVar.f653a = name;
        aVar.f654b = valueOf;
        x0.e eVar = (x0.e) this.f124b;
        ArrayList arrayList = (ArrayList) eVar.f8530b;
        arrayList.add(0, aVar);
        ((x0.e) eVar.f8531c).f(arrayList);
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onSuccess() {
        H0.a aVar = new H0.a();
        aVar.f653a = null;
        aVar.f654b = 0L;
        x0.e eVar = (x0.e) this.f124b;
        ArrayList arrayList = (ArrayList) eVar.f8530b;
        arrayList.add(0, aVar);
        ((x0.e) eVar.f8531c).f(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f516a > r3.f516a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(k0 newState) {
        D1.r rVar;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.i.e(newState, "newState");
        do {
            rVar = (D1.r) this.f124b;
            rVar.getClass();
            obj = E1.l.f331a;
            Object obj3 = D1.r.f299e.get(rVar);
            obj2 = obj3;
            if (obj3 == obj) {
                obj2 = null;
            }
            k0 k0Var = (k0) obj2;
            if (!(k0Var instanceof d0 ? true : kotlin.jvm.internal.i.a(k0Var, l0.f521b))) {
                if (!(k0Var instanceof C0028d)) {
                    if (!(k0Var instanceof b0)) {
                        throw new C0015p();
                    }
                }
                if (obj2 == null) {
                    obj2 = obj;
                }
                if (k0Var != null) {
                    obj = k0Var;
                }
            }
            k0Var = newState;
            if (obj2 == null) {
            }
            if (k0Var != null) {
            }
        } while (!rVar.b(obj2, obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Type inference failed for: r7v4, types: [n1.f, t1.p] */
    @Override // D1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(D1.e eVar, l1.d dVar) {
        D1.a aVar;
        int i2;
        Throwable th;
        E1.n nVar;
        switch (this.f123a) {
            case 1:
                if (dVar instanceof D1.a) {
                    aVar = (D1.a) dVar;
                    int i3 = aVar.f238g;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        aVar.f238g = i3 - Integer.MIN_VALUE;
                        Object obj = aVar.f236e;
                        EnumC0985a enumC0985a = EnumC0985a.f8194a;
                        i2 = aVar.f238g;
                        C0239i c0239i = C0239i.f3393a;
                        if (i2 != 0) {
                            R1.l.F(obj);
                            l1.i iVar = aVar.f8213b;
                            kotlin.jvm.internal.i.b(iVar);
                            E1.n nVar2 = new E1.n(eVar, iVar);
                            try {
                                aVar.f235d = nVar2;
                                aVar.f238g = 1;
                                Object invoke = ((AbstractC0995f) this.f124b).invoke(nVar2, aVar);
                                if (invoke != enumC0985a) {
                                    invoke = c0239i;
                                }
                                if (invoke == enumC0985a) {
                                    return enumC0985a;
                                }
                                nVar = nVar2;
                            } catch (Throwable th2) {
                                th = th2;
                                nVar = nVar2;
                                nVar.h();
                                throw th;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar = aVar.f235d;
                            try {
                                R1.l.F(obj);
                            } catch (Throwable th3) {
                                th = th3;
                                nVar.h();
                                throw th;
                            }
                        }
                        nVar.h();
                        return c0239i;
                    }
                }
                aVar = new D1.a(this, dVar);
                Object obj2 = aVar.f236e;
                EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
                i2 = aVar.f238g;
                C0239i c0239i2 = C0239i.f3393a;
                if (i2 != 0) {
                }
                nVar.h();
                return c0239i2;
            default:
                Object r2 = ((x0.e) this.f124b).r(new C0044u(eVar, 0), dVar);
                return r2 == EnumC0985a.f8194a ? r2 : C0239i.f3393a;
        }
    }

    public String toString() {
        switch (this.f123a) {
            case 5:
                return "<" + ((String) this.f124b) + '>';
            default:
                return super.toString();
        }
    }

    public j(R0.b bVar) {
        this.f123a = 27;
        new I0.b(bVar, "flutter/mousecursor", C0099o.f2035b, 9).M(new j(26, this));
    }

    public j(int i2) {
        this.f123a = i2;
        switch (i2) {
            case 4:
                this.f124b = new D1.r(l0.f521b);
                break;
            case 9:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                kotlin.jvm.internal.i.e(timeUnit, "timeUnit");
                this.f124b = new N1.l(M1.d.f1096h, timeUnit);
                break;
            case 13:
                this.f124b = new LinkedHashSet();
                break;
            case 14:
                this.f124b = new SparseIntArray();
                break;
            case C0376e9.f5883D /* 20 */:
                break;
            default:
                this.f124b = new AtomicInteger(0);
                break;
        }
    }

    public j(boolean z2) {
        this.f123a = 7;
        this.f124b = new AtomicBoolean(z2);
    }

    public j(InterfaceC0090f interfaceC0090f) {
        this.f123a = 24;
        new I0.b(interfaceC0090f, "flutter/keyboard", C0099o.f2035b, 9).M(new x0.e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(t1.p pVar) {
        this.f123a = 1;
        this.f124b = (AbstractC0995f) pVar;
    }

    public j(K1.a aVar) {
        this.f123a = 11;
        this.f124b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }
}
