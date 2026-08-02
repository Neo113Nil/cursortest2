package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.WebView;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.music.shared.playback.api.commands.SeekToFractionCommand;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes.dex */
public final class osh implements ogg, olr, n7a, t0d, c6e, u97, kw3, oo4 {
    public static int d;
    public static osh e;
    public static osh h;
    public static Method i;
    public static final mdr k;
    public static final mdr l;
    public static final mdr m;
    public Object a;
    public Object b;
    public Object c;
    public static final klx f = new klx(14);
    public static final wq6 g = new wq6();
    public static final Object j = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        long j2 = -9223372036854775807L;
        k = new mdr(0, j2, false);
        l = new mdr(2, j2, 0 == true ? 1 : 0);
        m = new mdr(3, j2, 0 == true ? 1 : 0);
    }

    public osh(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".new");
        this.c = new File(file.getPath() + ".bak");
    }

    public static void C(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(osh.class.getClassLoader());
        }
    }

    public static void R(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static Bundle a0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        C(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(osh oshVar, cg6 cg6Var) {
        f76 f76Var;
        int i2;
        txr txrVar;
        if (cg6Var instanceof f76) {
            f76Var = (f76) cg6Var;
            int i3 = f76Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f76Var.l = i3 - Integer.MIN_VALUE;
                Object obj = f76Var.j;
                nm6 nm6Var = nm6.a;
                i2 = f76Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    vxr vxrVar = (vxr) ((jyr) oshVar.b).getValue();
                    f76Var.l = 1;
                    obj = vxrVar.a(f76Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                txrVar = (txr) obj;
                if (!Intrinsics.d(txrVar, rxr.a)) {
                    hn5 hn5Var = ((qnq) oshVar.a).b;
                    String c = ((skr) ((jyr) oshVar.c).getValue()).c(R.string.check_internet_connection);
                    hn5Var.getClass();
                    hag.y(hn5Var, c);
                } else if (!Intrinsics.d(txrVar, sxr.a)) {
                    b6e.s();
                    return null;
                }
                return Unit.a;
            }
        }
        f76Var = new f76(oshVar, cg6Var);
        Object obj2 = f76Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = f76Var.l;
        if (i2 != 0) {
        }
        txrVar = (txr) obj2;
        if (!Intrinsics.d(txrVar, rxr.a)) {
        }
        return Unit.a;
    }

    public static /* synthetic */ void u(osh oshVar, sjb sjbVar) {
        oshVar.r(sjbVar, kmb.Tap);
    }

    public static final void x() {
        if (((Boolean) new ej6(0, g, wq6.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 8).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void y() {
        if (((Boolean) new ej6(0, g, wq6.class, "isBlockingThread", "isBlockingThread()Z", 0, 9).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001c, code lost:
    
        if (r1.c(r2) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void A(sgr sgrVar, s2i s2iVar) {
        zn4 zn4Var = (zn4) this.c;
        ce7 ce7Var = zn4Var.h.a;
        ce7 H = zn4Var.e.H();
        if (ce7Var != null) {
            if (H != null) {
                ce7Var.a(H);
            }
            if (sgrVar.a == rgr.CANCELLED && ce7Var != null && ce7Var.d()) {
                joe joeVar = new joe(0);
                zn4Var.i.y0(joeVar);
                sgrVar = sgr.i.c("ClientCall was cancelled at or after deadline. " + joeVar);
                s2iVar = new s2i();
            }
            jkk.b();
            zn4Var.b.execute(new xn4(this, sgrVar, s2iVar));
        }
        ce7Var = H;
        if (sgrVar.a == rgr.CANCELLED) {
            joe joeVar2 = new joe(0);
            zn4Var.i.y0(joeVar2);
            sgrVar = sgr.i.c("ClientCall was cancelled at or after deadline. " + joeVar2);
            s2iVar = new s2i();
        }
        jkk.b();
        zn4Var.b.execute(new xn4(this, sgrVar, s2iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0575 A[LOOP:2: B:158:0x0573->B:159:0x0575, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0504 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025b  */
    /* JADX WARN: Type inference failed for: r15v3, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void B(String str, PrintWriter printWriter, View view, int i2, int i3, boolean z, boolean z2) {
        int i4;
        ?? r17;
        Class<?> cls;
        osh oshVar;
        ViewGroup viewGroup;
        int childCount;
        int i5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        String r;
        Iterator<AccessibilityNodeInfo.AccessibilityAction> it;
        String str2;
        String obj;
        Object tag;
        boolean z3;
        String str3;
        PrintWriter printWriter2 = printWriter;
        String str4 = "";
        printWriter2.print(str);
        if (view == null) {
            printWriter2.println("null");
            return;
        }
        printWriter2.print(view.getClass().getName());
        printWriter2.print("{");
        printWriter2.print(Integer.toHexString(view.hashCode()));
        printWriter2.print(StringUtil.SPACE);
        int visibility = view.getVisibility();
        if (visibility == 0) {
            printWriter2.print("V");
        } else if (visibility == 4) {
            printWriter2.print("I");
        } else if (visibility != 8) {
            printWriter2.print(".");
        } else {
            printWriter2.print("G");
        }
        printWriter2.print(view.isFocusable() ? "F" : ".");
        printWriter2.print(view.isEnabled() ? "E" : ".");
        printWriter2.print(".");
        printWriter2.print(view.isHorizontalScrollBarEnabled() ? "H" : ".");
        printWriter2.print(view.isVerticalScrollBarEnabled() ? "V" : ".");
        printWriter2.print(view.isClickable() ? "C" : ".");
        printWriter2.print(view.isLongClickable() ? "L" : ".");
        printWriter2.print(StringUtil.SPACE);
        printWriter2.print(view.isFocused() ? "F" : ".");
        printWriter2.print(view.isSelected() ? "S" : ".");
        printWriter2.print(view.isHovered() ? "H" : ".");
        printWriter2.print(view.isActivated() ? "A" : ".");
        printWriter2.print(view.isDirty() ? "D" : ".");
        int i6 = 2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        printWriter2.print(StringUtil.SPACE);
        printWriter2.print(iArr[0] - i2);
        printWriter2.print(StringUtils.COMMA);
        boolean z4 = true;
        printWriter2.print(iArr[1] - i3);
        printWriter2.print("-");
        printWriter2.print((view.getWidth() + iArr[0]) - i2);
        printWriter2.print(StringUtils.COMMA);
        printWriter2.print((view.getHeight() + iArr[1]) - i3);
        try {
            int id = view.getId();
            if (id == -1) {
                klx.b0(printWriter, view);
            } else {
                printWriter2.append(" #");
                printWriter2.append((CharSequence) Integer.toHexString(id));
                Resources resources = view.getResources();
                if (id > 0 && resources != null) {
                    int i7 = (-16777216) & id;
                    if (i7 == 16777216) {
                        str3 = ConstantDeviceInfo.APP_PLATFORM;
                    } else if (i7 != 2130706432) {
                        str3 = resources.getResourcePackageName(id);
                        str3.getClass();
                    } else {
                        str3 = "app";
                    }
                    printWriter2.print(StringUtil.SPACE);
                    printWriter2.print(str3);
                    printWriter2.print(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    printWriter2.print(resources.getResourceTypeName(id));
                    printWriter2.print("/");
                    printWriter2.print(resources.getResourceEntryName(id));
                }
                klx.b0(printWriter, view);
            }
        } catch (Exception unused) {
            klx.b0(printWriter, view);
        }
        try {
        } catch (Exception unused2) {
            i4 = 2;
            r17 = 1;
        }
        if (view instanceof TextView) {
            obj = ((TextView) view).getText().toString();
        } else if (view.getClass().getSimpleName().equals("RCTextView")) {
            if (i == null) {
                i = view.getClass().getDeclaredMethod("getText", null);
            }
            Method method = i;
            Object invoke = method != null ? method.invoke(view, null) : null;
            obj = invoke != null ? invoke.toString() : null;
        } else {
            CharSequence contentDescription = view.getContentDescription();
            obj = contentDescription != null ? contentDescription.toString() : null;
            if ((obj == null || obj.length() == 0) && (tag = view.getTag()) != null) {
                String obj2 = tag.toString();
                int length = obj2.length() - 1;
                int i8 = 0;
                boolean z5 = false;
                while (true) {
                    if (i8 > length) {
                        i4 = i6;
                        z3 = z4;
                        break;
                    }
                    r17 = z4;
                    try {
                        i4 = i6;
                        try {
                            boolean z6 = Intrinsics.e(obj2.charAt(!z5 ? i8 : length), 32) <= 0 ? r17 == true ? 1 : 0 : false;
                            if (z5) {
                                if (!z6) {
                                    z3 = r17;
                                    break;
                                }
                                length--;
                            } else if (z6) {
                                i8++;
                            } else {
                                z5 = r17 == true ? 1 : 0;
                            }
                            z4 = r17 == true ? 1 : 0;
                            i6 = i4;
                            z5 = z5;
                        } catch (Exception unused3) {
                        }
                    } catch (Exception unused4) {
                        i4 = i6;
                    }
                }
                obj = obj2.subSequence(i8, length + 1).toString();
                r17 = z3;
                if (obj != null && obj.length() != 0) {
                    printWriter2.print(" text=\"");
                    printWriter2.print(klx.V(600, obj));
                    printWriter2.print("\"");
                }
                if (z2) {
                    Field field = k7b.a;
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
                    try {
                        view.onInitializeAccessibilityNodeInfo(obtain);
                    } catch (NullPointerException unused5) {
                        if (obtain != null) {
                            obtain.recycle();
                        }
                        obtain = null;
                    }
                    if (obtain != null) {
                        ?? jSONObject = new JSONObject();
                        try {
                            if (view instanceof TextView) {
                                ColorStateList textColors = ((TextView) view).getTextColors();
                                textColors.getClass();
                                jSONObject.put("textColor", textColors.getDefaultColor());
                                accessibilityNodeInfo = obtain;
                                jSONObject.put("textSize", ((TextView) view).getTextSize());
                                CharSequence hint = ((TextView) view).getHint();
                                if (hint != null && hint.length() != 0) {
                                    str2 = c.r(c.r(c.r(hint.toString(), " \n", StringUtil.SPACE, false), StringUtil.LF, StringUtil.SPACE, false), "\"", "", false);
                                    if (hint.length() > 100) {
                                        str2 = str2.substring(0, 100).concat("...");
                                    }
                                    jSONObject.put("hint", str2);
                                }
                                str2 = "";
                                jSONObject.put("hint", str2);
                            } else {
                                accessibilityNodeInfo = obtain;
                            }
                            JSONObject a = k7b.a(view);
                            if (a != null) {
                                jSONObject.put("keyedTags", a);
                            }
                            JSONArray jSONArray = new JSONArray();
                            Iterator<AccessibilityNodeInfo.AccessibilityAction> it2 = accessibilityNodeInfo.getActionList().iterator();
                            while (it2.hasNext()) {
                                AccessibilityNodeInfo.AccessibilityAction next = it2.next();
                                next.getClass();
                                CharSequence label = next.getLabel();
                                if (label == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                String str5 = (String) label;
                                if (str5.length() == 0) {
                                    it = it2;
                                    r = "";
                                } else {
                                    r = c.r(c.r(c.r(str5.toString(), " \n", StringUtil.SPACE, false), StringUtil.LF, StringUtil.SPACE, false), "\"", "", false);
                                    it = it2;
                                    if (str5.length() > 50) {
                                        r = r.substring(0, 50).concat("...");
                                    }
                                }
                                jSONArray.put(r);
                                it2 = it;
                            }
                            if (jSONArray.length() > 0) {
                                jSONObject.put("actions", jSONArray);
                            }
                            String V = klx.V(50, accessibilityNodeInfo.getContentDescription());
                            if (V.length() > 0) {
                                jSONObject.put("content-description", V);
                            }
                            jSONObject.put("accessibility-focused", accessibilityNodeInfo.isAccessibilityFocused()).put("checkable", accessibilityNodeInfo.isCheckable()).put("checked", accessibilityNodeInfo.isChecked()).put("class-name", klx.V(50, accessibilityNodeInfo.getClassName())).put("clickable", accessibilityNodeInfo.isClickable()).put("content-invalid", accessibilityNodeInfo.isContentInvalid()).put("dismissable", accessibilityNodeInfo.isDismissable()).put("editable", accessibilityNodeInfo.isEditable()).put("enabled", accessibilityNodeInfo.isEnabled()).put("focusable", accessibilityNodeInfo.isFocusable()).put("focused", accessibilityNodeInfo.isFocused()).put("long-clickable", accessibilityNodeInfo.isLongClickable()).put("multiline", accessibilityNodeInfo.isMultiLine()).put("password", accessibilityNodeInfo.isPassword()).put("scrollable", accessibilityNodeInfo.isScrollable()).put("selected", accessibilityNodeInfo.isSelected()).put("visible-to-user", accessibilityNodeInfo.isVisibleToUser());
                            jSONObject.put("context-clickable", accessibilityNodeInfo.isContextClickable()).put("drawing-order", accessibilityNodeInfo.getDrawingOrder()).put("important-for-accessibility", accessibilityNodeInfo.isImportantForAccessibility());
                        } catch (Exception e2) {
                            try {
                                String message = e2.getMessage();
                                if (message != null && message.length() != 0) {
                                    str4 = c.r(c.r(c.r(message.toString(), " \n", StringUtil.SPACE, false), StringUtil.LF, StringUtil.SPACE, false), "\"", "", false);
                                    if (message.length() > 50) {
                                        str4 = str4.substring(0, 50).concat("...");
                                    }
                                }
                                jSONObject.put("DUMP-ERROR", str4);
                            } catch (JSONException unused6) {
                            }
                        }
                        printWriter2.append(" props=\"").append((CharSequence) jSONObject.toString()).append("\"");
                    }
                }
                printWriter2.println("}");
                cls = view.getClass();
                while (true) {
                    if (cls != null) {
                        oshVar = this;
                        break;
                    }
                    if (cls.getName().equals("com.facebook.litho.LithoView")) {
                        oshVar = this;
                        try {
                            if (((Method) oshVar.c) == null) {
                                oshVar.c = Class.forName("com.facebook.litho.LithoViewTestHelper").getDeclaredMethod("viewToStringForE2E", View.class, Integer.TYPE, Boolean.TYPE);
                            }
                            Method method2 = (Method) oshVar.c;
                            Object invoke2 = method2 != null ? method2.invoke(null, view, Integer.valueOf((str.length() / 2) + 1), Boolean.valueOf(z2)) : null;
                            if (invoke2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            printWriter2.append((CharSequence) invoke2).getClass();
                        } catch (Exception e3) {
                            printWriter2.append((CharSequence) str).append("Failed litho view sub hierarch dump: ").append((CharSequence) klx.V(100, e3.getMessage())).println();
                        }
                    } else {
                        cls = cls.getSuperclass();
                    }
                }
                if (z && (view instanceof WebView)) {
                    le3 le3Var = (le3) oshVar.b;
                    WebView webView = (WebView) view;
                    le3Var.getClass();
                    pdv pdvVar = new pdv(webView);
                    ((LinkedHashSet) le3Var.a).add(pdvVar);
                    Resources resources2 = webView.getResources();
                    resources2.getClass();
                    webView.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", Arrays.copyOf(new Object[]{Integer.valueOf(pdvVar.b), Integer.valueOf(pdvVar.c), Float.valueOf(resources2.getDisplayMetrics().scaledDensity)}, 3)), new qdv(le3Var, pdvVar));
                }
                if (!(view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
                    String concat = str.concat("  ");
                    int[] iArr2 = new int[i4];
                    view.getLocationOnScreen(iArr2);
                    i5 = 0;
                    while (i5 < childCount) {
                        oshVar.B(concat, printWriter2, viewGroup.getChildAt(i5), iArr2[0], iArr2[r17], z, z2);
                        i5++;
                        oshVar = this;
                        printWriter2 = printWriter;
                    }
                }
                return;
            }
        }
        i4 = 2;
        r17 = 1;
        if (obj != null) {
            printWriter2.print(" text=\"");
            printWriter2.print(klx.V(600, obj));
            printWriter2.print("\"");
        }
        if (z2) {
        }
        printWriter2.println("}");
        cls = view.getClass();
        while (true) {
            if (cls != null) {
            }
            cls = cls.getSuperclass();
        }
        if (z) {
            le3 le3Var2 = (le3) oshVar.b;
            WebView webView2 = (WebView) view;
            le3Var2.getClass();
            pdv pdvVar2 = new pdv(webView2);
            ((LinkedHashSet) le3Var2.a).add(pdvVar2);
            Resources resources22 = webView2.getResources();
            resources22.getClass();
            webView2.evaluateJavascript(String.format("(function() {  try {    const leftOf = %d;    const topOf = %d;    const density = %f;    const elements = Array.from(document.querySelectorAll('body, body *'));    for (const el of elements) {      const rect = el.getBoundingClientRect();      const left = Math.round(leftOf + rect.left * density);      const top = Math.round(topOf + rect.top * density);      const width = Math.round(rect.width * density);      const height = Math.round(rect.height * density);      el.setAttribute('data-rect', `${left},${top},${width},${height}`);      const style = window.getComputedStyle(el);      const hidden = style.display === 'none' || style.visibility !== 'visible' || el.getAttribute('hidden') === 'true';      const disabled = el.disabled || el.getAttribute('aria-disabled') === 'true';      const focused = el === document.activeElement;      if (hidden || disabled || focused) {        el.setAttribute('data-flag', `${hidden ? 'H' : ''}${disabled ? 'D' : ''}${focused ? 'F' : ''}`);      } else {        el.removeAttribute('data-flag');      }    }    document.activeElement.setAttribute('focused', 'true');    const doc = document.cloneNode(true);    for (const el of Array.from(doc.querySelectorAll('script, link'))) {      el.remove();    }    for (const el of Array.from(doc.querySelectorAll('*'))) {      el.removeAttribute('class');    }    return doc.getElementsByTagName('body')[0].outerHTML.trim();  } catch (e) {    return 'Failed: ' + e;  }})();", Arrays.copyOf(new Object[]{Integer.valueOf(pdvVar2.b), Integer.valueOf(pdvVar2.c), Float.valueOf(resources22.getDisplayMetrics().scaledDensity)}, 3)), new qdv(le3Var2, pdvVar2));
        }
        if (view instanceof ViewGroup) {
            return;
        }
        String concat2 = str.concat("  ");
        int[] iArr22 = new int[i4];
        view.getLocationOnScreen(iArr22);
        i5 = 0;
        while (i5 < childCount) {
        }
    }

    public void D(FileOutputStream fileOutputStream) {
        File file = (File) this.b;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public void E(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e2) {
            Log.e("AtomicFile", "Failed to close file output stream", e2);
        }
        R((File) this.b, (File) this.a);
    }

    public bqg F() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((i5l) this.c)) {
            try {
                bqg bqgVar = (bqg) this.b;
                if (bqgVar != null && localeList == ((LocaleList) this.a)) {
                    return bqgVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new zpg(localeList.get(i2)));
                }
                bqg bqgVar2 = new bqg(arrayList);
                this.a = localeList;
                this.b = bqgVar2;
                return bqgVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public cml G() {
        jil a = ((me5) ((wjl) this.a).d.a.getValue()).a();
        iil iilVar = a instanceof iil ? (iil) a : null;
        if (iilVar != null) {
            return iilVar.a.b;
        }
        return null;
    }

    public boolean H() {
        return ((IOException) this.c) != null;
    }

    public boolean I() {
        return ((igg) this.b) != null;
    }

    public void J(wjb wjbVar) {
        pkl pklVar = (pkl) ((Function0) this.b).invoke();
        if (pklVar == null) {
            return;
        }
        ((hjl) this.c).c(wjbVar, pklVar);
    }

    public void K() {
        sjb sjbVar;
        cml G = G();
        if (G != null) {
            int ordinal = G.b.a.ordinal();
            if (ordinal == 0) {
                sjbVar = sjb.Unlike;
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    b6e.s();
                    return;
                }
                sjbVar = sjb.Like;
            }
            u(this, sjbVar);
        }
        ((wjl) this.a).c.a();
    }

    public void L() {
        sjb sjbVar;
        wjl wjlVar = (wjl) this.a;
        boolean z = ((u7l) wjlVar.e.a.getValue()).a;
        if (z) {
            sjbVar = sjb.Pause;
        } else {
            if (z) {
                b6e.s();
                return;
            }
            sjbVar = sjb.Play;
        }
        u(this, sjbVar);
        wjlVar.b.a(new ToggleCommand(false), new b3t("core_toggle"));
    }

    public void M(float f2, rap rapVar) {
        kmb kmbVar;
        rapVar.getClass();
        sjb sjbVar = sjb.Seek;
        int ordinal = rapVar.ordinal();
        if (ordinal == 0) {
            kmbVar = kmb.Tap;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            kmbVar = kmb.Pan;
        }
        r(sjbVar, kmbVar);
        ((k1l) ((wjl) this.a).f.b).a(new SeekToFractionCommand(f2), new b3t("core_seek"));
    }

    public void N(xur xurVar) {
        sjb sjbVar;
        wjl wjlVar = (wjl) this.a;
        xurVar.getClass();
        int ordinal = xurVar.ordinal();
        if (ordinal == 0) {
            sjbVar = sjb.Skip;
        } else {
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            sjbVar = sjb.Backskip;
        }
        u(this, sjbVar);
        int ordinal2 = xurVar.ordinal();
        if (ordinal2 == 0) {
            wjlVar.b.a(new SkipCommand(), new b3t("queue_skip"));
        } else if (ordinal2 == 1) {
            wjlVar.a(true);
        } else {
            b6e.s();
        }
    }

    public void O(String str, Bitmap bitmap) {
        synchronized (j) {
            ((hzg) ((Map) this.c).get(str)).f = bitmap;
        }
    }

    public void P(kgg kggVar) {
        z7h z7hVar = (z7h) this.a;
        igg iggVar = (igg) this.b;
        if (iggVar != null) {
            iggVar.a(true);
        }
        if (kggVar != null) {
            z7hVar.execute(new dsd(5, kggVar));
        }
        ((b6e) z7hVar.c).accept(z7hVar.b);
    }

    @Override // defpackage.u97
    public void Q(aa7 aa7Var, om3 om3Var) {
        ByteBuffer o;
        ByteBuffer o2;
        aa aaVar = (aa) this.a;
        om3 om3Var2 = (om3) this.b;
        ss1 ss1Var = (ss1) this.c;
        om3 om3Var3 = ss1Var.p;
        if (ss1Var.c) {
            return;
        }
        try {
            try {
                ss1Var.c = true;
                om3Var.f(om3Var2);
                boolean i2 = om3Var2.i();
                ay0 ay0Var = om3Var2.a;
                if (i2) {
                    int i3 = om3Var2.c;
                    if (i3 == 0) {
                        o2 = om3.j;
                    } else {
                        om3Var2.k(i3);
                        o2 = om3Var2.o();
                    }
                    om3Var2.a(o2);
                }
                ByteBuffer byteBuffer = om3.j;
                while (true) {
                    if (byteBuffer.remaining() == 0 && ay0Var.size() > 0) {
                        byteBuffer = om3Var2.o();
                    }
                    int remaining = byteBuffer.remaining();
                    int i4 = om3Var3.c;
                    ByteBuffer j2 = om3.j(Math.min(Math.max(aaVar.b, aaVar.c), aaVar.a));
                    SSLEngineResult unwrap = ss1Var.d.unwrap(byteBuffer, j2);
                    j2.flip();
                    if (j2.hasRemaining()) {
                        om3Var3.a(j2);
                    } else {
                        om3.m(j2);
                    }
                    aaVar.b = (om3Var3.c - i4) * 2;
                    if (unwrap.getStatus() != SSLEngineResult.Status.BUFFER_OVERFLOW) {
                        if (unwrap.getStatus() == SSLEngineResult.Status.BUFFER_UNDERFLOW) {
                            om3Var2.c(byteBuffer);
                            if (ay0Var.size() <= 1) {
                                break;
                            }
                            int i5 = om3Var2.c;
                            if (i5 == 0) {
                                o = om3.j;
                            } else {
                                om3Var2.k(i5);
                                o = om3Var2.o();
                            }
                            om3Var2.c(o);
                            byteBuffer = om3.j;
                        }
                        ss1Var.b(unwrap.getHandshakeStatus());
                        if (byteBuffer.remaining() != remaining && i4 == om3Var3.c) {
                            om3Var2.c(byteBuffer);
                            break;
                        }
                    } else {
                        aaVar.c *= 2;
                    }
                    remaining = -1;
                    ss1Var.b(unwrap.getHandshakeStatus());
                    if (byteBuffer.remaining() != remaining) {
                    }
                }
                ss1Var.f();
                ss1Var.c = false;
            } catch (SSLException e2) {
                e2.printStackTrace();
                ss1Var.i(e2);
                ss1Var.c = false;
            }
        } catch (Throwable th) {
            ss1Var.c = false;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object S(cg6 cg6Var) {
        pb0 pb0Var;
        int i2;
        boolean z;
        boolean booleanValue;
        cx1 cx1Var = (cx1) this.c;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
        if (cg6Var instanceof pb0) {
            pb0Var = (pb0) cg6Var;
            int i3 = pb0Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pb0Var.m = i3 - Integer.MIN_VALUE;
                Object obj = pb0Var.k;
                nm6 nm6Var = nm6.a;
                i2 = pb0Var.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    boolean z2 = atomicBoolean.get();
                    pb0Var.j = z2;
                    pb0Var.m = 1;
                    Object e2 = cx1Var.e(true, pb0Var);
                    if (e2 == nm6Var) {
                        return nm6Var;
                    }
                    z = z2;
                    obj = e2;
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = pb0Var.j;
                    qgg.h0(obj);
                }
                Boolean bool = (Boolean) obj;
                booleanValue = bool.booleanValue();
                atomicBoolean.set(booleanValue);
                if (booleanValue) {
                    ssg.a(7, "AndroidAudioFocusAdapter", "Audio focus is not granted, previousFocusValue= " + z + ", " + cx1Var.b(), null);
                } else {
                    ((y1c) this.a).b();
                }
                return bool;
            }
        }
        pb0Var = new pb0(this, cg6Var);
        Object obj2 = pb0Var.k;
        nm6 nm6Var2 = nm6.a;
        i2 = pb0Var.m;
        if (i2 != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        booleanValue = bool2.booleanValue();
        atomicBoolean.set(booleanValue);
        if (booleanValue) {
        }
        return bool2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r11.invoke(r9, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r11.a(r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object T(wc wcVar, int i2, cg6 cg6Var) {
        yc ycVar;
        int i3;
        if (cg6Var instanceof yc) {
            ycVar = (yc) cg6Var;
            int i4 = ycVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ycVar.n = i4 - Integer.MIN_VALUE;
                Object obj = ycVar.l;
                nm6 nm6Var = nm6.a;
                i3 = ycVar.n;
                if (i3 != 0) {
                    qgg.h0(obj);
                    ssg.a(3, null, "saveAccountStatus " + wcVar, null);
                    wb7 wb7Var = (wb7) zc.b.getValue((Context) this.a, zc.a[0]);
                    l5 l5Var = new l5(wcVar, i2, (Continuation) null);
                    ycVar.j = wcVar;
                    ycVar.k = i2;
                    ycVar.n = 1;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = ycVar.k;
                    wcVar = ycVar.j;
                    qgg.h0(obj);
                }
                w4i w4iVar = (w4i) this.b;
                String h2 = wcVar.h();
                ycVar.j = null;
                ycVar.k = i2;
                ycVar.n = 2;
            }
        }
        ycVar = new yc(this, cg6Var);
        Object obj2 = ycVar.l;
        nm6 nm6Var2 = nm6.a;
        i3 = ycVar.n;
        if (i3 != 0) {
        }
        w4i w4iVar2 = (w4i) this.b;
        String h22 = wcVar.h();
        ycVar.j = null;
        ycVar.k = i2;
        ycVar.n = 2;
    }

    public void U(bsh bshVar, Handler handler) {
        esh eshVar = (esh) this.a;
        if (bshVar == null) {
            eshVar.c(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        eshVar.c(bshVar, handler);
    }

    public void V(ow3 ow3Var) {
        ow3 ow3Var2 = (ow3) this.b;
        if (ow3Var2 != null) {
            ow3Var2.setOnStateChangeListener(null);
            ow3Var2.setMaskedCardNumberListener(null);
            ow3Var2.setCardPaymentSystemListener(null);
        }
        if (ow3Var != null) {
            ow3Var.setOnStateChangeListener((m40) this.c);
            ow3Var.setMaskedCardNumberListener(null);
            ow3Var.setCardPaymentSystemListener(null);
        }
        this.b = ow3Var;
    }

    public void W(MediaMetadataCompat mediaMetadataCompat) {
        esh eshVar = (esh) this.a;
        eshVar.g = mediaMetadataCompat;
        MediaSession mediaSession = eshVar.a;
        if (mediaMetadataCompat.b == null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat.b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        mediaSession.setMetadata(mediaMetadataCompat.b);
    }

    public void X(jgg jggVar, hgg hggVar, int i2) {
        Looper myLooper = Looper.myLooper();
        vq1.B(myLooper);
        this.c = null;
        igg iggVar = new igg(this, myLooper, jggVar, hggVar, i2, SystemClock.elapsedRealtime());
        vq1.A(((igg) this.b) == null);
        this.b = iggVar;
        iggVar.b();
    }

    public FileOutputStream Y() {
        File file = (File) this.b;
        File file2 = (File) this.c;
        if (file2.exists()) {
            R(file2, (File) this.a);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                tiu.j(file, "Failed to create directory for ");
                return null;
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e2) {
                throw new IOException("Failed to create new file " + file, e2);
            }
        }
    }

    public void Z() {
        ViewGroup viewGroup = (ViewGroup) this.a;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                rj7.m();
                return;
            }
            Integer num = (Integer) ((LinkedHashMap) this.c).get(childAt);
            if (num != null) {
                childAt.setImportantForAccessibility(num.intValue());
            }
            i2 = i3;
        }
    }

    @Override // defpackage.olr
    public void a() {
        ((slr) this.a).b(true);
    }

    @Override // defpackage.ogg
    public void b() {
        IOException iOException = (IOException) this.c;
        if (iOException != null) {
            throw iOException;
        }
        igg iggVar = (igg) this.b;
        if (iggVar != null) {
            int i2 = iggVar.a;
            IOException iOException2 = iggVar.e;
            if (iOException2 != null && iggVar.f > i2) {
                throw iOException2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
    @Override // defpackage.c6e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(Exception exc, nr1 nr1Var) {
        String p;
        String p2;
        String str;
        rn5 rn5Var;
        le3 le3Var = (le3) this.b;
        viq viqVar = (viq) this.a;
        if (exc != null) {
            if (viqVar.k(exc, null)) {
                le3Var.i(exc, null);
                return;
            }
            return;
        }
        qzc qzcVar = ((rr1) this.c).c;
        if (nr1Var != null && nr1Var.k == 101 && "websocket".equalsIgnoreCase(nr1Var.i.p("Upgrade")) && (p = nr1Var.i.p("Sec-WebSocket-Accept")) != null && (p2 = qzcVar.p("Sec-WebSocket-Key")) != null) {
            String concat = p2.concat("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
            boolean z = false;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(concat.getBytes("iso-8859-1"), 0, concat.length());
                str = Base64.encodeToString(messageDigest.digest(), 2);
            } catch (Exception unused) {
                str = null;
            }
            if (p.equalsIgnoreCase(str.trim())) {
                String p3 = qzcVar.p("Sec-WebSocket-Extensions");
                if (p3 != null && p3.equals("x-webkit-deflate-frame")) {
                    z = true;
                }
                dt1 dt1Var = nr1Var.h;
                if (dt1Var == null) {
                    dt1Var = null;
                } else {
                    dt1Var.h(null);
                    dt1Var.d(null);
                    dt1Var.s(null);
                    dt1Var.c(null);
                    nr1Var.h = null;
                }
                rn5Var = new rn5(10);
                rn5Var.c = dt1Var;
                rn5Var.d = new dj3(dt1Var);
                scv scvVar = new scv(rn5Var, dt1Var);
                rn5Var.e = scvVar;
                scvVar.a = z;
                if (dt1Var.g()) {
                    dt1Var.m();
                }
                if (rn5Var != null) {
                    exc = new my1("Unable to complete websocket handshake");
                    if (!viqVar.k(exc, null)) {
                        return;
                    }
                } else if (!viqVar.k(null, rn5Var)) {
                    return;
                }
                le3Var.i(exc, rn5Var);
            }
        }
        rn5Var = null;
        if (rn5Var != null) {
        }
        le3Var.i(exc, rn5Var);
    }

    @Override // defpackage.oo4
    public void d(s2i s2iVar) {
        zn4 zn4Var = (zn4) this.c;
        jkk.c();
        try {
            jkk.a();
            jkk.b();
            zn4Var.b.execute(new wn4(this, s2iVar));
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.kw3
    public void e() {
        ow3 ow3Var = (ow3) this.b;
        if (ow3Var != null) {
            ow3Var.e();
        }
    }

    @Override // defpackage.olr
    public void f(paw pawVar, Map map, boolean z) {
        synchronized (this) {
            try {
                olr olrVar = (olr) this.c;
                this.c = z ? (b2c) this.b : (slr) this.a;
                Log.v("AdaptiveStrmManagerImpl", "Offline state: " + Intrinsics.d(olrVar, (b2c) this.b) + " -> " + z);
                if (!Intrinsics.d((olr) this.c, olrVar)) {
                    olrVar.stop();
                }
                ((olr) this.c).f(pawVar, map, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.olr
    public nlr g() {
        return ((olr) this.c).g();
    }

    @Override // defpackage.kw3
    public nw3 getMode() {
        return (nw3) this.a;
    }

    @Override // defpackage.kw3
    public void h() {
        ow3 ow3Var = (ow3) this.b;
        if (ow3Var != null) {
            ow3Var.h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        if (r9 == r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0076, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0049, code lost:
    
        if (r9 == r3) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r1v1, types: [dn9] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    @Override // defpackage.t0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(Continuation continuation) {
        n91 n91Var;
        int i2;
        rd1 rd1Var;
        ?? r1;
        u9b u9bVar;
        List list;
        m91 m91Var = (m91) this.b;
        ?? r12 = (dn9) this.a;
        if (continuation instanceof n91) {
            n91Var = (n91) continuation;
            int i3 = n91Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n91Var.l = i3 - Integer.MIN_VALUE;
                Object obj = n91Var.j;
                nm6 nm6Var = nm6.a;
                i2 = n91Var.l;
                int i4 = 2;
                n01 n01Var = null;
                ?? r7 = 0;
                if (i2 != 0) {
                    qgg.h0(obj);
                    n91Var.l = 1;
                    obj = r12.m(n91Var);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        rd1 rd1Var2 = (rd1) obj;
                        qd1 qd1Var = rd1Var2 instanceof qd1 ? (qd1) rd1Var2 : null;
                        if (qd1Var != null) {
                            n01Var = (n01) qd1Var.a;
                        }
                        if (n01Var != null || (list = n01Var.f) == null) {
                            r1 = m91Var.a;
                        } else {
                            List list2 = list;
                            r1 = new ArrayList(v75.o(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                r1.add(kg5.M((u9b) it.next(), (WebPath$Storage) this.c));
                            }
                        }
                        if (n01Var != null || (u9bVar = n01Var.a.c) == null || (r9 = u9bVar.c) == null) {
                            String str = m91Var.b;
                        }
                        return new f0d(r1, str);
                    }
                    qgg.h0(obj);
                }
                rd1Var = (rd1) obj;
                if (!(rd1Var instanceof qd1)) {
                    n01Var = (n01) ((qd1) rd1Var).a;
                    if (n01Var != null) {
                    }
                    r1 = m91Var.a;
                    if (n01Var != null) {
                    }
                    String str2 = m91Var.b;
                    return new f0d(r1, str2);
                }
                if (!(rd1Var instanceof pd1)) {
                    b6e.s();
                    return null;
                }
                vdr vdrVar = (vdr) ((jyr) r12.f).getValue();
                xc xcVar = new xc(i4, 2, r7 == true ? 1 : 0);
                n91Var.l = 2;
                obj = zsd.h0(vdrVar, xcVar, n91Var);
            }
        }
        n91Var = new n91(this, (cg6) continuation);
        Object obj2 = n91Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = n91Var.l;
        int i42 = 2;
        n01 n01Var2 = null;
        ?? r72 = 0;
        if (i2 != 0) {
        }
        rd1Var = (rd1) obj2;
        if (!(rd1Var instanceof qd1)) {
        }
    }

    @Override // defpackage.olr
    public String k(String str, VideoData videoData, String str2, long j2, boolean z, int i2, boolean z2) {
        str.getClass();
        return (z2 ? (b2c) this.b : (slr) this.a).k(str, videoData, str2, j2, z, i2, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(cg6 cg6Var) {
        ob0 ob0Var;
        int i2;
        Boolean bool;
        if (cg6Var instanceof ob0) {
            ob0Var = (ob0) cg6Var;
            int i3 = ob0Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ob0Var.l = i3 - Integer.MIN_VALUE;
                Object obj = ob0Var.j;
                nm6 nm6Var = nm6.a;
                i2 = ob0Var.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    cx1 cx1Var = (cx1) this.c;
                    ob0Var.l = 1;
                    obj = cx1Var.a(ob0Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    ((AtomicBoolean) this.b).set(false);
                }
                return bool;
            }
        }
        ob0Var = new ob0(this, cg6Var);
        Object obj2 = ob0Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = ob0Var.l;
        if (i2 != 0) {
        }
        bool = (Boolean) obj2;
        if (bool.booleanValue()) {
        }
        return bool;
    }

    @Override // defpackage.n7a
    public void m(u51 u51Var) {
        rmb.j((rmb) this.a, wjb.ArtistScreen, (thj) this.b, null, 12);
        dy dyVar = ((j00) this.c).d;
        dyVar.getClass();
        new m(dyVar.b, new s2(18), dyVar.a, dyVar.c, null, 48).x(u51Var);
    }

    @Override // defpackage.oo4
    public void n(sgr sgrVar, no4 no4Var, s2i s2iVar) {
        jkk.c();
        try {
            jkk.a();
            A(sgrVar, s2iVar);
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.olr
    public Map o() {
        return ((slr) this.a).L;
    }

    @Override // defpackage.mjr
    public void onReady() {
        zn4 zn4Var = (zn4) this.c;
        j3i j3iVar = zn4Var.a.a;
        j3iVar.getClass();
        if (j3iVar == j3i.a || j3iVar == j3i.c) {
            return;
        }
        jkk.c();
        try {
            jkk.a();
            jkk.b();
            zn4Var.b.execute(new yn4(this));
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void r(sjb sjbVar, kmb kmbVar) {
        pkl pklVar = (pkl) ((Function0) this.b).invoke();
        if (pklVar == null) {
            return;
        }
        hjl hjlVar = (hjl) this.c;
        thj thjVar = (thj) pklVar.h.getValue();
        xmb xmbVar = hjlVar.d;
        zil zilVar = pklVar.c.a;
        zlb zlbVar = zilVar.c;
        ylb ylbVar = zilVar.d;
        hmb hmbVar = zilVar.e;
        nab nabVar = hjlVar.a;
        cvo d2 = pklVar.d();
        String str = (String) hjlVar.e.get(thjVar.b);
        if (str == null) {
            str = "";
        }
        String str2 = pklVar.d;
        String str3 = pklVar.c().b;
        xmbVar.getClass();
        zlbVar.getClass();
        ylbVar.getClass();
        d2.getClass();
        str2.getClass();
        str3.getClass();
        nmb d3 = xmbVar.d();
        if (d3 != null) {
            String G = xmbVar.a.G();
            wjb wjbVar = d2.a;
            ilb ilbVar = d2.g;
            glb glbVar = d2.c;
            String str4 = d2.d.a;
            avo avoVar = d2.e;
            pkb pkbVar = avoVar.a;
            String str5 = avoVar.b;
            qkb qkbVar = qkb.Carousel;
            int b = nabVar.b();
            int d4 = nabVar.d();
            G.getClass();
            wjbVar.getClass();
            ilbVar.getClass();
            glbVar.getClass();
            str4.getClass();
            pkbVar.getClass();
            str5.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("queue_source", ylbVar.a);
            linkedHashMap.put("queue_type", zlbVar.a);
            linkedHashMap.put("target_device", hmbVar.a);
            linkedHashMap.put("hash", G);
            linkedHashMap.put("page_id", wjbVar.a);
            linkedHashMap.put("page_style", ilbVar.a);
            linkedHashMap.put("page_placement", glbVar.a);
            linkedHashMap.put("skeleton_id", str4);
            linkedHashMap.put("main_object_type", pkbVar.a);
            linkedHashMap.put("main_object_id", str5);
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str3);
            linkedHashMap.put("view_uuid", str);
            linkedHashMap.put("action_type", sjbVar.a);
            linkedHashMap.put("user_interaction_type", kmbVar.a);
            eta.m(0, "loaded_view_uuid", str2, "player_parameters", linkedHashMap);
            linkedHashMap.put("entity_type", "player");
            eta.m(b, "entity_id", "player", "entity_pos_x", linkedHashMap);
            linkedHashMap.put("entity_pos_y", String.valueOf(d4));
            linkedHashMap.put("_meta", nmb.u(1));
            d3.C("Player.ActionPerformed", linkedHashMap);
        }
    }

    @Override // defpackage.kw3
    public void setOnStateChangeListener(Function1 function1) {
        this.c = (m40) function1;
        ow3 ow3Var = (ow3) this.b;
        if (ow3Var != null) {
            ow3Var.setOnStateChangeListener(function1);
        }
    }

    @Override // defpackage.olr
    public void stop() {
        synchronized (this) {
            ((olr) this.c).stop();
        }
    }

    @Override // defpackage.mjr
    public void t(ljr ljrVar) {
        zn4 zn4Var = (zn4) this.c;
        jkk.c();
        try {
            jkk.a();
            jkk.b();
            zn4Var.b.execute(new wn4(this, ljrVar));
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.n7a
    public void v(m7a m7aVar) {
        m7aVar.getClass();
        rmb.k((rmb) this.a, m7aVar.a, (thj) this.b, null, 4);
        dy dyVar = ((j00) this.c).d;
        List c = t75.c(m7aVar);
        dyVar.getClass();
        c.getClass();
        if (c.size() == 1) {
            String str = ((m7a) c.get(0)).a;
            jyr jyrVar = y7a.a;
            y7a.a(dyVar.a, str, true);
            return;
        }
        List list = c;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((m7a) it.next()).c);
        }
        List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList));
        kc kcVar = new kc(6, c, dyVar);
        ao1.a.getClass();
        pd.U(w0, kcVar, ao1.b, dyVar.c, pd.t(new qzm[0]));
    }

    public void w() {
        igg iggVar = (igg) this.b;
        vq1.B(iggVar);
        iggVar.a(false);
    }

    public Object z(cg6 cg6Var) {
        ssg.a(3, null, "clear", null);
        Object a = ((wb7) zc.b.getValue((Context) this.a, zc.a[0])).a(new xc(2, 0, null), cg6Var);
        return a == nm6.a ? a : Unit.a;
    }

    public /* synthetic */ osh(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public osh(nw3 nw3Var) {
        nw3Var.getClass();
        this.a = nw3Var;
    }

    public osh(int i2) {
        switch (i2) {
            case 11:
                this.c = new i5l();
                break;
            default:
                this.a = new z0j(1, false);
                this.b = new le3(2);
                break;
        }
    }

    public /* synthetic */ osh(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public osh(String str) {
        this(new z7h(Executors.newSingleThreadExecutor(new y36(r3, 3)), new b6e()));
        String concat = "ExoPlayer:Loader:".concat(str);
        int i2 = dvt.a;
    }
}
