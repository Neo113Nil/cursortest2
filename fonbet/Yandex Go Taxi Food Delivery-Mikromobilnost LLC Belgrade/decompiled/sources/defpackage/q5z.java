package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.widget.Toast;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
import com.squareup.moshi.Types;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.shimmer.ShimmerDivHandler;
import com.yandex.go.address.dto.AddressDTO;
import com.yandex.go.address.models.Address;
import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.go.proxyprovision.MobApiNameSuffix;
import com.yandex.mob.api.model.MobEnvironment;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.TrackIdPushOverrideDefaultContentConfig;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;
import okio.ByteString;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public abstract class q5z {
    public static final b43 a = new b43(1);
    public static final kbs b = new kbs(19);
    public static final abl0 c = new abl0(17);
    public static final f0m d = new f0m(null);

    public static ArrayList A() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new qbp0(0L, 100.0d));
        arrayList.add(new qbp0(50L, 95.0d));
        arrayList.add(new qbp0(125L, 85.0d));
        arrayList.add(new qbp0(200L, 70.0d));
        arrayList.add(new qbp0(500L, 50.0d));
        arrayList.add(new qbp0(1000L, 25.0d));
        arrayList.add(new qbp0(2000L, 0.0d));
        return arrayList;
    }

    public static ArrayList B() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new qbp0(0L, 100.0d));
        arrayList.add(new qbp0(500L, 95.0d));
        arrayList.add(new qbp0(1000L, 85.0d));
        arrayList.add(new qbp0(2000L, 70.0d));
        arrayList.add(new qbp0(3500L, 50.0d));
        arrayList.add(new qbp0(5000L, 25.0d));
        arrayList.add(new qbp0(10000L, 0.0d));
        return arrayList;
    }

    public static final Object C(syj0 syj0Var) {
        if (syj0Var instanceof lyj0) {
            return ((lyj0) syj0Var).a;
        }
        if (syj0Var instanceof jyj0) {
            return null;
        }
        w511.b();
        return null;
    }

    public static final String D(Address address) {
        AddressDTO address2;
        String str = (address == null || (address2 = address.getAddress()) == null) ? null : address2.g;
        return str == null ? "" : str;
    }

    public static ArrayList E() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new qbp0(0L, 100.0d));
        arrayList.add(new qbp0(333L, 95.0d));
        arrayList.add(new qbp0(900L, 85.0d));
        arrayList.add(new qbp0(2000L, 70.0d));
        arrayList.add(new qbp0(4800L, 50.0d));
        arrayList.add(new qbp0(14000L, 25.0d));
        arrayList.add(new qbp0(28000L, 0.0d));
        return arrayList;
    }

    public static final String F(Address address) {
        return address == null ? "" : address.D1().length() == 0 ? address.d() : address.D1();
    }

    public static ArrayList G() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new qbp0(0L, 100.0d));
        arrayList.add(new qbp0(150L, 95.0d));
        arrayList.add(new qbp0(300L, 85.0d));
        arrayList.add(new qbp0(400L, 70.0d));
        arrayList.add(new qbp0(800L, 50.0d));
        arrayList.add(new qbp0(4500L, 25.0d));
        arrayList.add(new qbp0(9000L, 0.0d));
        return arrayList;
    }

    public static final boolean H(Intent intent) {
        return "ru.yandex.taxi.action.ORDER_TAXI".equals(intent.getAction()) || "ru.yandex.taxi.action.BUILD_TAXI_ROUTE".equals(intent.getAction()) || "android.intent.action.VIEW".equals(intent.getAction());
    }

    public static final boolean I(int i) {
        return View.MeasureSpec.getMode(i) == 1073741824;
    }

    public static String J(kwu kwuVar) {
        String str = kwuVar.i;
        ByteString byteString = new ByteString(str.getBytes(uza.a));
        byteString.b = str;
        return byteString.f("MD5").i();
    }

    public static final String K(Address address) {
        String name = address.getName();
        return name.length() == 0 ? F(address) : name;
    }

    public static final String L(Address address) {
        AddressDTO address2 = address.getAddress();
        String str = address2.f;
        if (str != null && str.length() != 0) {
            return str;
        }
        String str2 = address2.b;
        return str2 == null ? "" : str2;
    }

    public static final fse M(tse tseVar, fse fseVar) {
        fse p = p(tseVar.getCoroutineContext(), fseVar, true);
        sjh sjhVar = uyj.a;
        return (p == sjhVar || p.get(x4c.K) != null) ? p : p.plus(sjhVar);
    }

    public static final lyj0 N() {
        return new lyj0(zy11.a);
    }

    public static final boolean O(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268468224);
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    public static final void P(Context context, String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268468224);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse(str2));
        intent2.setFlags(268468224);
        if (intent2.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent2);
        } else {
            Toast.makeText(context.getApplicationContext(), str3, 1).show();
        }
    }

    public static int Q(int i, String str) {
        if (str == null || evu0.J(str) || str.equalsIgnoreCase(ShimmerDivHandler.NUMBER_SING)) {
            return i;
        }
        String upperCase = str.toUpperCase(Locale.US);
        if (upperCase.charAt(0) != '#') {
            try {
                return Color.parseColor(ShimmerDivHandler.NUMBER_SING.concat(upperCase));
            } catch (IllegalArgumentException unused) {
            }
        }
        try {
            return Color.parseColor(upperCase);
        } catch (IllegalArgumentException e) {
            xby.d.k(e, "Parsing color error, color = ".concat(upperCase));
            return i;
        }
    }

    public static int R(Context context, int i, String str) {
        return Q(context.getColor(i), str);
    }

    public static Integer S(String str) {
        int Q = Q(Integer.MIN_VALUE, str);
        if (Q == Integer.MIN_VALUE) {
            return null;
        }
        return Integer.valueOf(Q);
    }

    public static AttributeSet T(Context context, int i, String str) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), str)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) str) + "> start tag");
        } catch (IOException | XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(oyr.r(new StringBuilder("Can't load badge resource ID #0x"), i));
            notFoundException.initCause(e);
            throw notFoundException;
        }
    }

    public static final g0p U(g0p g0pVar, g0p g0pVar2) {
        return new g0p(a.m0(g0pVar2.a, g0pVar.a), a.m0(g0pVar2.b, g0pVar.b), a.m0(g0pVar2.c, g0pVar.c), a.m0(g0pVar2.d, g0pVar.d), a.m0(g0pVar2.e, g0pVar.e), a.m0(g0pVar2.f, g0pVar.f), a.m0(g0pVar2.g, g0pVar.g), a.m0(g0pVar2.h, g0pVar.h), a.m0(g0pVar2.i, g0pVar.i), a.m0(g0pVar2.j, g0pVar.j));
    }

    public static zzw V(Task task, Task task2) {
        x18 x18Var = new x18();
        atx0 atx0Var = new atx0(x18Var.a);
        i3f i3fVar = new i3f(0, atx0Var, new AtomicBoolean(false), x18Var);
        b43 b43Var = a;
        task.i(b43Var, i3fVar);
        task2.i(b43Var, i3fVar);
        return atx0Var.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r6 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        defpackage.rza.a(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
    
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(java.lang.Integer.toString(r10, 16)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int W(jci0 jci0Var) {
        try {
            yp6 yp6Var = jci0Var.b;
            jci0Var.B1(1L);
            long j = 0;
            while (true) {
                long j2 = j + 1;
                if (!jci0Var.S(j2)) {
                    break;
                }
                byte e = yp6Var.e(j);
                if ((e < 48 || e > 57) && (j != 0 || e != 45)) {
                    break;
                }
                j = j2;
            }
            long D = yp6Var.D();
            String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            if (D >= 0 && D <= 2147483647L && j1.length() <= 0) {
                return (int) D;
            }
            throw new IOException("expected an int but was \"" + D + j1 + OpenList.CHAR_QUOTE);
        } catch (NumberFormatException e2) {
            ny61.v(e2.getMessage());
            return 0;
        }
    }

    public static final void X(j18 j18Var, Continuation continuation, boolean z) {
        Object t = j18Var.t();
        Throwable e = j18Var.e(t);
        Object failure = e != null ? new Result.Failure(e) : j18Var.f(t);
        if (!z) {
            continuation.resumeWith(failure);
            return;
        }
        pyj pyjVar = (pyj) continuation;
        ContinuationImpl continuationImpl = pyjVar.x;
        Object obj = pyjVar.z;
        fse fseVar = continuationImpl.get_context();
        Object H = gwk0.H(fseVar, obj);
        zx11 n0 = H != gwk0.d ? n0(continuationImpl, fseVar, H) : null;
        try {
            continuationImpl.resumeWith(failure);
            if (n0 == null || n0.o0()) {
                gwk0.x(fseVar, H);
            }
        } catch (Throwable th) {
            if (n0 == null || n0.o0()) {
                gwk0.x(fseVar, H);
            }
            throw th;
        }
    }

    public static final void Y(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                extras.size();
            }
        } catch (RuntimeException e) {
            jst.e.x(e, "Failed to unparcel extras in intent: " + intent);
        }
    }

    public static final void Z(String str, List list, String str2, Context context) {
        Intent createChooser = Intent.createChooser(new Intent().setAction("android.intent.action.SEND_MULTIPLE").putExtra("android.intent.extra.TEXT", str).putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(list)).addFlags(1).addFlags(SelfTester_JCP.IMITA).setType("image/*"), str2);
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(createChooser, 122);
        } else {
            context.startActivity(createChooser);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final c a(LayoutNode layoutNode, boolean z) {
        t300 t300Var = layoutNode.a0;
        gnq0 gnq0Var = null;
        if ((((e530) t300Var.g).getAggregateChildKindSet$ui() & 8) != 0) {
            e530 e530Var = (e530) t300Var.g;
            loop0: while (true) {
                if (e530Var != null) {
                    if ((e530Var.getKindSet$ui() & 8) != 0) {
                        lqh lqhVar = e530Var;
                        ?? r3 = 0;
                        while (lqhVar != 0) {
                            if (lqhVar instanceof gnq0) {
                                gnq0Var = lqhVar;
                                break loop0;
                            }
                            if ((lqhVar.getKindSet$ui() & 8) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var2 = lqhVar.b;
                                int i = 0;
                                lqhVar = lqhVar;
                                r3 = r3;
                                while (e530Var2 != null) {
                                    if ((e530Var2.getKindSet$ui() & 8) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            lqhVar = e530Var2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r3.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r3.b(e530Var2);
                                        }
                                    }
                                    e530Var2 = e530Var2.getChild$ui();
                                    lqhVar = lqhVar;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            lqhVar = qje.c(r3);
                        }
                    }
                    if ((e530Var.getAggregateChildKindSet$ui() & 8) == 0) {
                        break;
                    }
                    e530Var = e530Var.getChild$ui();
                } else {
                    break;
                }
            }
        }
        e530 node = gnq0Var.getNode();
        cnq0 u = layoutNode.u();
        if (u == null) {
            u = new cnq0();
        }
        return new c(node, z, layoutNode, u);
    }

    public static final void a0(String str, Uri uri, String str2, Context context) {
        Intent createChooser = Intent.createChooser(new Intent().setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", str).putExtra("android.intent.extra.STREAM", uri).addFlags(1).setType("image/*"), str2);
        if (!(context instanceof Activity)) {
            hst hstVar = jst.e;
            Objects.toString(context);
            hstVar.getClass();
            createChooser.addFlags(SelfTester_JCP.IMITA);
        }
        context.startActivity(createChooser);
    }

    public static final void b(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final void b0(Context context, String str) {
        c0(str, null, context, 0);
    }

    public static final HostMobSupportedApiNames c(GoApiName goApiName) {
        switch (lsu.c[goApiName.ordinal()]) {
            case 1:
                return HostMobSupportedApiNames.TAXI;
            case 2:
                return HostMobSupportedApiNames.TAXI_V4;
            case 3:
                return HostMobSupportedApiNames.BILLING;
            case 4:
                return HostMobSupportedApiNames.BILLING_INTERNATIONAL;
            case 5:
                return HostMobSupportedApiNames.PLUS;
            case 6:
                return HostMobSupportedApiNames.TAXI_V4;
            default:
                w511.b();
                return null;
        }
    }

    public static final void c0(String str, CharSequence charSequence, Context context, int i) {
        if (str.length() == 0) {
            jst.e.k(new Exception("Trying to share empty sharing link"), "Trying to share empty sharing link!");
            return;
        }
        Intent createChooser = Intent.createChooser(new Intent().setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", str).setType("text/plain"), charSequence);
        boolean z = context instanceof Activity;
        if (!z) {
            hst hstVar = jst.e;
            Objects.toString(context);
            hstVar.getClass();
            createChooser.addFlags(SelfTester_JCP.IMITA);
        }
        if (!z || i == 0) {
            context.startActivity(createChooser);
        } else {
            ((Activity) context).startActivityForResult(createChooser, i);
        }
    }

    public static void d(String str, Number number, Number number2) {
        if (number.equals(number2)) {
            return;
        }
        q(str, number, number2);
    }

    public static long d0(String str) {
        long j;
        int length = str.length();
        long j2 = 0;
        if (length < 0) {
            w511.f(oyr.h(length, 0, "endIndex < beginIndex: ", " < "));
            return 0L;
        }
        if (length > str.length()) {
            w511.n(b64.t(length, "endIndex > string.length: ", " > "), str.length());
            return 0L;
        }
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j2++;
            } else {
                if (charAt < 2048) {
                    j = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char charAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return j2;
    }

    public static float e(int i) {
        return (((Color.blue(i) / 255.0f) * 114.0f) + (((Color.green(i) / 255.0f) * 587.0f) + ((Color.red(i) / 255.0f) * 299.0f))) / 1000.0f;
    }

    public static final void e0(Activity activity, Uri uri, String str, String str2) {
        if ((str != null && str.length() != 0) || (str2 != null && str2.length() != 0)) {
            ListBuilder a2 = rcc.a();
            if (str != null && str.length() != 0) {
                a2.add("subject=" + Uri.encode(str));
            }
            if (str2 != null && str2.length() != 0) {
                a2.add("body=" + Uri.encode(str2));
            }
            uri = Uri.parse(uri + "?" + a.X(a2.j(), "&", null, null, null, 62));
        }
        Intent intent = new Intent("android.intent.action.SENDTO", uri);
        if (str != null && str.length() != 0) {
            intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str);
        }
        if (str2 != null && str2.length() != 0) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        if (activity == null) {
            intent.setFlags(SelfTester_JCP.IMITA);
        }
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }

    public static void f(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        vg10.n(cls.getCanonicalName(), " must be set");
    }

    public static final String f0(HostMobSupportedApiNames hostMobSupportedApiNames, MobEnvironment mobEnvironment) {
        MobApiNameSuffix mobApiNameSuffix;
        switch (lsu.a[hostMobSupportedApiNames.ordinal()]) {
            case 1:
                mobApiNameSuffix = MobApiNameSuffix.Billing;
                break;
            case 2:
                mobApiNameSuffix = MobApiNameSuffix.BillingInternational;
                break;
            case 3:
                mobApiNameSuffix = MobApiNameSuffix.Legal;
                break;
            case 4:
                mobApiNameSuffix = MobApiNameSuffix.Taxi;
                break;
            case 5:
                mobApiNameSuffix = MobApiNameSuffix.TaxiV4;
                break;
            case 6:
                mobApiNameSuffix = MobApiNameSuffix.WebAm;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                mobApiNameSuffix = null;
                break;
            default:
                w511.b();
                return null;
        }
        if (mobApiNameSuffix == null) {
            return null;
        }
        int i = lsu.b[mobEnvironment.ordinal()];
        if (i == 1) {
            return mobApiNameSuffix.getProdSuffix();
        }
        if (i == 2) {
            return mobApiNameSuffix.getTestingSuffix();
        }
        w511.b();
        return null;
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static kf70 g0(rf70 rf70Var) {
        if (rf70Var instanceof of70) {
            return new if70(((of70) rf70Var).a);
        }
        if (rf70Var instanceof qf70) {
            return new jf70(((qf70) rf70Var).b());
        }
        if (rf70Var instanceof mf70) {
            return new gf70(((mf70) rf70Var).a);
        }
        if (!(rf70Var instanceof nf70)) {
            w511.b();
            return null;
        }
        Collection b2 = ((nf70) rf70Var).b();
        ArrayList arrayList = new ArrayList(tcc.n(b2, 10));
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            arrayList.add(g0((rf70) it.next()));
        }
        return new hf70(arrayList);
    }

    public static void h(Object obj) {
        if (obj != null) {
            return;
        }
        ny61.t("Cannot return null from a non-@Nullable component method");
    }

    public static rf70 h0(kf70 kf70Var) {
        if (kf70Var instanceof if70) {
            return new of70(((if70) kf70Var).a);
        }
        if (kf70Var instanceof jf70) {
            return new qf70(((jf70) kf70Var).a());
        }
        if (kf70Var instanceof gf70) {
            return new mf70(((gf70) kf70Var).a());
        }
        if (!(kf70Var instanceof hf70)) {
            w511.b();
            return null;
        }
        Collection a2 = ((hf70) kf70Var).a();
        ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(h0((kf70) it.next()));
        }
        return new nf70(arrayList);
    }

    public static void i(Object obj) {
        if (obj != null) {
            return;
        }
        ny61.t("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final syj0 i0(Object obj) {
        Throwable a2 = Result.a(obj);
        return a2 == null ? new lyj0(obj) : new jyj0(a2);
    }

    public static Drawable j(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Serializable j0(kf70 kf70Var) {
        if (kf70Var instanceof if70) {
            return Integer.valueOf(((if70) kf70Var).a);
        }
        if (kf70Var instanceof jf70) {
            return ((jf70) kf70Var).a();
        }
        if (kf70Var instanceof gf70) {
            return Boolean.valueOf(((gf70) kf70Var).a());
        }
        if (!(kf70Var instanceof hf70)) {
            w511.b();
            return null;
        }
        Collection a2 = ((hf70) kf70Var).a();
        ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(j0((kf70) it.next()));
        }
        return arrayList;
    }

    public static final String k(List list) {
        StringBuilder sb = new StringBuilder(x((Address) list.get(0)));
        int size = list.size();
        for (int i = 1; i < size; i++) {
            sb.append(" ➔ ");
            sb.append(x((Address) list.get(i)));
        }
        return sb.toString();
    }

    public static final Serializable k0(rf70 rf70Var) {
        if (rf70Var instanceof of70) {
            return Integer.valueOf(((of70) rf70Var).a);
        }
        if (rf70Var instanceof qf70) {
            return ((qf70) rf70Var).b();
        }
        if (rf70Var instanceof mf70) {
            return Boolean.valueOf(((mf70) rf70Var).a);
        }
        if (!(rf70Var instanceof nf70)) {
            w511.b();
            return null;
        }
        Collection b2 = ((nf70) rf70Var).b();
        ArrayList arrayList = new ArrayList(tcc.n(b2, 10));
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            arrayList.add(k0((rf70) it.next()));
        }
        return arrayList;
    }

    public static final String l(List list) {
        StringBuilder sb = new StringBuilder(F((Address) list.get(0)));
        int size = list.size();
        for (int i = 1; i < size; i++) {
            sb.append(" ➔ ");
            sb.append(F((Address) list.get(i)));
        }
        return sb.toString();
    }

    public static final Serializable l0(b bVar) {
        if (bVar instanceof JsonNull) {
            return null;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (dVar.b()) {
                return dVar.a();
            }
            Serializable f = qcx.f(dVar);
            return (f == null && (f = qcx.o(dVar)) == null && (f = qcx.i(dVar)) == null) ? qcx.k(dVar) : f;
        }
        if (bVar instanceof kotlinx.serialization.json.c) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((kotlinx.serialization.json.c) bVar).a.entrySet()) {
                String str = (String) entry.getKey();
                Serializable l0 = l0((b) entry.getValue());
                if (l0 != null) {
                    linkedHashMap.put(str, l0);
                }
            }
            return linkedHashMap;
        }
        if (!(bVar instanceof kotlinx.serialization.json.a)) {
            w511.b();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((kotlinx.serialization.json.a) bVar).a.iterator();
        while (it.hasNext()) {
            Serializable l02 = l0((b) it.next());
            if (l02 != null) {
                arrayList.add(l02);
            }
        }
        return arrayList;
    }

    public static Drawable m(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static final dfr m0(Context context) {
        return new dfr("yb_track_id_push_override_default_content", Types.newParameterizedType(CommonExperiment.class, TrackIdPushOverrideDefaultContentConfig.class), new CommonExperiment(new TrackIdPushOverrideDefaultContentConfig(context.getString(dzh0.ybsdk_push_notifications_push_notifications_lost_code_title), context.getString(dzh0.ybsdk_push_notifications_push_notifications_lost_code_subtitle), "ybapp://screen.open/bottom_sheet?target=otp_code&is_error=true"), ExperimentApplyType.LATEST));
    }

    public static yr31 n(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                kbs.g(qv10.l(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                return (yr31) declaredConstructor.newInstance(null);
            } catch (IllegalAccessException e) {
                ny61.n(qv10.l(cls, "Cannot create an instance of "), e);
                return null;
            } catch (InstantiationException e2) {
                ny61.n(qv10.l(cls, "Cannot create an instance of "), e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            ny61.n(qv10.l(cls, "Cannot create an instance of "), e3);
            return null;
        }
    }

    public static final zx11 n0(Continuation continuation, fse fseVar, Object obj) {
        zx11 zx11Var = null;
        if ((continuation instanceof wse) && fseVar.get(hwk0.c) != null) {
            wse wseVar = (wse) continuation;
            while (true) {
                if ((wseVar instanceof kotlinx.coroutines.b) || (wseVar = wseVar.getCallerFrame()) == null) {
                    break;
                }
                if (wseVar instanceof zx11) {
                    zx11Var = (zx11) wseVar;
                    break;
                }
            }
            if (zx11Var != null) {
                zx11Var.q0(fseVar, obj);
            }
        }
        return zx11Var;
    }

    public static qkj o(Integer num) {
        return new qkj(null, num);
    }

    public static Set o0(meu meuVar) {
        int size = meuVar.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(meuVar.b(i))) {
                String f = meuVar.f(i);
                if (treeSet == null) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it = evu0.Y(f, new char[]{HexString.CHAR_COMMA}, 0, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(evu0.k0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? EmptySet.a : treeSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [T, java.lang.Object] */
    public static final fse p(fse fseVar, fse fseVar2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 7;
        boolean booleanValue = ((Boolean) fseVar.fold(bool, new yk(i))).booleanValue();
        boolean booleanValue2 = ((Boolean) fseVar2.fold(bool, new yk(i))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return fseVar.plus(fseVar2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = fseVar2;
        gse gseVar = new gse(ref$ObjectRef, z);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        fse fseVar3 = (fse) fseVar.fold(emptyCoroutineContext, gseVar);
        if (booleanValue2) {
            ref$ObjectRef.element = ((fse) ref$ObjectRef.element).fold(emptyCoroutineContext, new gse(1));
        }
        return fseVar3.plus((fse) ref$ObjectRef.element);
    }

    public static void p0(int i, int i2) {
        String j;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                j = pva1.j("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    ny61.g(oyr.i(i2, "negative size: "));
                    return;
                }
                j = pva1.j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(j);
        }
    }

    public static String q(String str, Object obj, Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str.concat(" ");
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (!valueOf.equals(valueOf2)) {
            StringBuilder w = oyr.w(str2, "expected:<", valueOf, "> but was:<", valueOf2);
            w.append('>');
            return w.toString();
        }
        StringBuilder v = oyr.v(str2, "expected: ");
        v.append(r(obj, valueOf));
        v.append(" but was: ");
        v.append(r(obj2, valueOf2));
        return v.toString();
    }

    public static void q0(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? r0(i, i3, "start index") : (i2 < 0 || i2 > i3) ? r0(i2, i3, "end index") : pva1.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String r(Object obj, String str) {
        return (obj == null ? "null" : obj.getClass().getName()) + '<' + str + '>';
    }

    public static String r0(int i, int i2, String str) {
        if (i < 0) {
            return pva1.j("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return pva1.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ny61.g(oyr.i(i2, "negative size: "));
        return null;
    }

    public static String s(int i) {
        int alpha = Color.alpha(i);
        return alpha == 255 ? String.format("#%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i))}, 3)) : String.format("#%02X%02X%02X%02X", Arrays.copyOf(new Object[]{Integer.valueOf(alpha), Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i))}, 4));
    }

    public static final String t(Context context, Address address) {
        if (address == null) {
            return null;
        }
        String J1 = address.J1();
        return (J1 == null || J1.length() == 0) ? L(address) : context.getString(kyh0.common_source_porch, L(address), address.J1());
    }

    public static final b580 u(jmw0 jmw0Var, List list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ejj0 ejj0Var = (ejj0) it.next();
            kf70 kf70Var = ejj0Var.l;
            rf70 h0 = kf70Var != null ? h0(kf70Var) : null;
            if (h0 == null) {
                unr0.z(jst.e, "Missing option value!");
            } else {
                arrayList.add(h0);
                arrayList2.add(ejj0Var.a);
            }
        }
        return gi.f(jmw0Var.getName(), jmw0Var.getLabel(), arrayList2, arrayList.size() == 1 ? (rf70) arrayList.get(0) : new nf70(arrayList));
    }

    public static final String v(p5z p5zVar) {
        return p5zVar.getLocale().getLanguage();
    }

    public static int[] w(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static final String x(Address address) {
        String q0 = address != null ? address.q0() : null;
        return q0 == null ? "" : q0;
    }

    public static ColorStateList y(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static ArrayList z() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new qbp0(0L, 100.0d));
        arrayList.add(new qbp0(50L, 95.0d));
        arrayList.add(new qbp0(100L, 85.0d));
        arrayList.add(new qbp0(150L, 70.0d));
        arrayList.add(new qbp0(300L, 50.0d));
        arrayList.add(new qbp0(500L, 25.0d));
        arrayList.add(new qbp0(750L, 0.0d));
        return arrayList;
    }
}
