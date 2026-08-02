package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Bundle;
import android.util.Base64;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.h;
import androidx.compose.foundation.text.KeyCommand;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.videoplayer.multiplatform.estimate.a;

/* loaded from: classes10.dex */
public class zoy0 implements b851, pke, ww01, vyn, w451, dzh, vm11, pfm, xyn, f8p, h0r {
    public static final s2u0 a = new s2u0(11);
    public static final s2u0 b = new s2u0(12);
    public static final zoy0 c = new zoy0();
    public static final dy31 w = new dy31(1);
    public static final zoy0 x = new zoy0();
    public static final /* synthetic */ zoy0 y = new zoy0();
    public static final /* synthetic */ zoy0 z = new zoy0();

    public /* synthetic */ zoy0(Object obj, Object obj2, Object obj3, Object obj4) {
    }

    public static qiy A(List list, float f, float f2, int i) {
        return new qiy(list, null, (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0);
    }

    public static qiy B(Pair[] pairArr, float f, float f2, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = Float.POSITIVE_INFINITY;
        }
        return D((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }

    public static qiy D(Pair[] pairArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new ldc(((ldc) pair.f()).a));
        }
        ArrayList arrayList2 = new ArrayList(pairArr.length);
        for (Pair pair2 : pairArr) {
            arrayList2.add(Float.valueOf(((Number) pair2.c()).floatValue()));
        }
        return new qiy(arrayList, arrayList2, j, j2, 0);
    }

    public static /* synthetic */ qiy E(Pair[] pairArr, long j, long j2, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = 9187343241974906880L;
        }
        return D(pairArr, j, j2);
    }

    public static qiy G(List list, float f, float f2, int i) {
        return new qiy(list, null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? 0.0f : f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0);
    }

    public static qiy H(Pair[] pairArr, float f, int i) {
        if ((i & 4) != 0) {
            f = Float.POSITIVE_INFINITY;
        }
        return D((Pair[]) Arrays.copyOf(pairArr, pairArr.length), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    public static void I(azn aznVar, StringBuilder sb) {
        int charAt = sb.charAt(2) + (sb.charAt(1) * '(') + (sb.charAt(0) * 1600) + 1;
        aznVar.c.append(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }

    public static final String m(String str) {
        ua90 ua90Var = kqo.f;
        return (str.length() <= 0 || str.charAt(0) != '#') ? str.toLowerCase(Locale.ROOT) : str.substring(1).toLowerCase(Locale.ROOT);
    }

    public static ByteArrayInputStream p(String str) {
        if (!str.startsWith("data:image")) {
            ny61.g("Not a valid image data URL.");
            return null;
        }
        int indexOf = str.indexOf(44);
        if (indexOf == -1) {
            ny61.g("Missing comma in data URL.");
            return null;
        }
        if (str.substring(0, indexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
        }
        ny61.g("Not a base64 image data URL.");
        return null;
    }

    public static fqc r(String str, String str2) {
        bqc bqcVar = bqc.c;
        if (jl40.l(str, "emergency")) {
            return bqcVar;
        }
        bqc bqcVar2 = bqc.b;
        if (jl40.l(str, TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
            return bqcVar2;
        }
        if (jl40.l(str, TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
            return eqc.b;
        }
        return jl40.l(str, "plus") ? bqc.d : jl40.l(str, "scooters") ? new dqc(null, null, null, null, null, null) : jl40.l(str, "chargers") ? new aqc(null, null, null) : new cqc(str, str2);
    }

    public static a y(double d) {
        a aVar = a.e;
        a aVar2 = a.e;
        if (aVar2 != null) {
            return aVar2;
        }
        f050 f050Var = a.f;
        if (f050.b) {
            a aVar3 = a.e;
            if (aVar3 != null) {
                return aVar3;
            }
            a aVar4 = new a(d);
            a.e = aVar4;
            return aVar4;
        }
        synchronized (f050Var.a) {
            a aVar5 = a.e;
            if (aVar5 != null) {
                return aVar5;
            }
            a aVar6 = new a(d);
            a.e = aVar6;
            return aVar6;
        }
    }

    @Override // defpackage.xyn
    public void C(pyn pynVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyCommand F(KeyEvent keyEvent) {
        KeyCommand keyCommand;
        KeyCommand keyCommand2;
        KeyCommand keyCommand3;
        int b2 = icb1.b(keyEvent);
        KeyCommand keyCommand4 = null;
        if (b2 == 9) {
            long a2 = jcb1.a(keyEvent.getKeyCode());
            if (mhx.a(a2, mhx.f)) {
                keyCommand = KeyCommand.SELECT_LINE_LEFT;
            } else if (mhx.a(a2, mhx.g)) {
                keyCommand = KeyCommand.SELECT_LINE_RIGHT;
            } else if (mhx.a(a2, mhx.d)) {
                keyCommand = KeyCommand.SELECT_HOME;
            } else {
                if (mhx.a(a2, mhx.e)) {
                    keyCommand = KeyCommand.SELECT_END;
                }
                keyCommand = null;
            }
        } else {
            if (b2 == 1) {
                long a3 = jcb1.a(keyEvent.getKeyCode());
                if (mhx.a(a3, mhx.f)) {
                    keyCommand = KeyCommand.LINE_LEFT;
                } else if (mhx.a(a3, mhx.g)) {
                    keyCommand = KeyCommand.LINE_RIGHT;
                } else if (mhx.a(a3, mhx.d)) {
                    keyCommand = KeyCommand.HOME;
                } else if (mhx.a(a3, mhx.e)) {
                    keyCommand = KeyCommand.END;
                } else if (mhx.a(a3, mhx.s)) {
                    keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                }
            }
            keyCommand = null;
        }
        if (keyCommand != null) {
            return keyCommand;
        }
        int b3 = icb1.b(keyEvent);
        long a4 = jcb1.a(keyEvent.getKeyCode());
        if (mhx.a(a4, mhx.s)) {
            if (b3 == 0 || b3 == 8 || b3 == 12) {
                keyCommand2 = KeyCommand.DELETE_PREV_CHAR;
            } else {
                if (b3 == 2 || b3 == 10) {
                    keyCommand2 = KeyCommand.DELETE_PREV_WORD;
                }
                keyCommand2 = null;
            }
            if (keyCommand2 != null) {
                return keyCommand2;
            }
            int b4 = icb1.b(keyEvent);
            if (b4 == 10) {
                long a5 = jcb1.a(keyEvent.getKeyCode());
                if (mhx.a(a5, mhx.f) || mhx.a(a5, mhx.H)) {
                    keyCommand3 = KeyCommand.SELECT_LEFT_WORD;
                } else if (mhx.a(a5, mhx.g) || mhx.a(a5, mhx.I)) {
                    keyCommand3 = KeyCommand.SELECT_RIGHT_WORD;
                } else if (mhx.a(a5, mhx.d) || mhx.a(a5, mhx.F)) {
                    keyCommand3 = KeyCommand.SELECT_PREV_PARAGRAPH;
                } else {
                    if (mhx.a(a5, mhx.e) || mhx.a(a5, mhx.G)) {
                        keyCommand3 = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                    keyCommand3 = null;
                }
                if (keyCommand3 != null) {
                    return keyCommand3;
                }
                Object obj = mj91.a.b;
                int b5 = icb1.b(keyEvent);
                if (b5 == 10) {
                    if (mhx.a(jcb1.a(keyEvent.getKeyCode()), mhx.o)) {
                        keyCommand4 = KeyCommand.REDO;
                    }
                } else if (b5 == 2) {
                    long a6 = jcb1.a(keyEvent.getKeyCode());
                    if (mhx.a(a6, mhx.j) || mhx.a(a6, mhx.x) || mhx.a(a6, mhx.N)) {
                        keyCommand4 = KeyCommand.COPY;
                    } else if (mhx.a(a6, mhx.l)) {
                        keyCommand4 = KeyCommand.PASTE;
                    } else if (mhx.a(a6, mhx.m)) {
                        keyCommand4 = KeyCommand.CUT;
                    } else if (mhx.a(a6, mhx.i)) {
                        keyCommand4 = KeyCommand.SELECT_ALL;
                    } else if (mhx.a(a6, mhx.n)) {
                        keyCommand4 = KeyCommand.REDO;
                    } else if (mhx.a(a6, mhx.o)) {
                        keyCommand4 = KeyCommand.UNDO;
                    }
                } else if (b5 == 8) {
                    long a7 = jcb1.a(keyEvent.getKeyCode());
                    if (mhx.a(a7, mhx.f) || mhx.a(a7, mhx.H)) {
                        keyCommand4 = KeyCommand.SELECT_LEFT_CHAR;
                    } else if (mhx.a(a7, mhx.g) || mhx.a(a7, mhx.I)) {
                        keyCommand4 = KeyCommand.SELECT_RIGHT_CHAR;
                    } else if (mhx.a(a7, mhx.d) || mhx.a(a7, mhx.F)) {
                        keyCommand4 = KeyCommand.SELECT_UP;
                    } else if (mhx.a(a7, mhx.e) || mhx.a(a7, mhx.G)) {
                        keyCommand4 = KeyCommand.SELECT_DOWN;
                    } else if (mhx.a(a7, mhx.C) || mhx.a(a7, mhx.L)) {
                        keyCommand4 = KeyCommand.SELECT_PAGE_UP;
                    } else if (mhx.a(a7, mhx.D) || mhx.a(a7, mhx.M)) {
                        keyCommand4 = KeyCommand.SELECT_PAGE_DOWN;
                    } else if (mhx.a(a7, mhx.v) || mhx.a(a7, mhx.J)) {
                        keyCommand4 = KeyCommand.SELECT_LINE_START;
                    } else if (mhx.a(a7, mhx.w) || mhx.a(a7, mhx.K)) {
                        keyCommand4 = KeyCommand.SELECT_LINE_END;
                    } else if (mhx.a(a7, mhx.x) || mhx.a(a7, mhx.N)) {
                        keyCommand4 = KeyCommand.PASTE;
                    }
                } else if (b5 == 0) {
                    long a8 = jcb1.a(keyEvent.getKeyCode());
                    if (mhx.a(a8, mhx.f) || mhx.a(a8, mhx.H)) {
                        keyCommand4 = KeyCommand.LEFT_CHAR;
                    } else if (mhx.a(a8, mhx.g) || mhx.a(a8, mhx.I)) {
                        keyCommand4 = KeyCommand.RIGHT_CHAR;
                    } else if (mhx.a(a8, mhx.d) || mhx.a(a8, mhx.F)) {
                        keyCommand4 = KeyCommand.UP;
                    } else if (mhx.a(a8, mhx.e) || mhx.a(a8, mhx.G)) {
                        keyCommand4 = KeyCommand.DOWN;
                    } else if (mhx.a(a8, mhx.h)) {
                        keyCommand4 = KeyCommand.CENTER;
                    } else if (mhx.a(a8, mhx.C) || mhx.a(a8, mhx.L)) {
                        keyCommand4 = KeyCommand.PAGE_UP;
                    } else if (mhx.a(a8, mhx.D) || mhx.a(a8, mhx.M)) {
                        keyCommand4 = KeyCommand.PAGE_DOWN;
                    } else if (mhx.a(a8, mhx.v) || mhx.a(a8, mhx.J)) {
                        keyCommand4 = KeyCommand.LINE_START;
                    } else if (mhx.a(a8, mhx.w) || mhx.a(a8, mhx.K)) {
                        keyCommand4 = KeyCommand.LINE_END;
                    } else if (mhx.a(a8, mhx.r) || mhx.a(a8, mhx.E)) {
                        keyCommand4 = KeyCommand.NEW_LINE;
                    } else if (mhx.a(a8, mhx.s)) {
                        keyCommand4 = KeyCommand.DELETE_PREV_CHAR;
                    } else if (mhx.a(a8, mhx.t)) {
                        keyCommand4 = KeyCommand.DELETE_NEXT_CHAR;
                    } else if (mhx.a(a8, mhx.A)) {
                        keyCommand4 = KeyCommand.PASTE;
                    } else if (mhx.a(a8, mhx.y)) {
                        keyCommand4 = KeyCommand.CUT;
                    } else if (mhx.a(a8, mhx.z)) {
                        keyCommand4 = KeyCommand.COPY;
                    } else if (mhx.a(a8, mhx.p)) {
                        keyCommand4 = KeyCommand.TAB;
                    }
                }
                return keyCommand4;
            }
            if (b4 == 2) {
                long a9 = jcb1.a(keyEvent.getKeyCode());
                if (mhx.a(a9, mhx.f) || mhx.a(a9, mhx.H)) {
                    keyCommand3 = KeyCommand.LEFT_WORD;
                } else if (mhx.a(a9, mhx.g) || mhx.a(a9, mhx.I)) {
                    keyCommand3 = KeyCommand.RIGHT_WORD;
                } else if (mhx.a(a9, mhx.d) || mhx.a(a9, mhx.F)) {
                    keyCommand3 = KeyCommand.PREV_PARAGRAPH;
                } else if (mhx.a(a9, mhx.e) || mhx.a(a9, mhx.G)) {
                    keyCommand3 = KeyCommand.NEXT_PARAGRAPH;
                } else if (mhx.a(a9, mhx.k)) {
                    keyCommand3 = KeyCommand.DELETE_PREV_CHAR;
                } else if (mhx.a(a9, mhx.t)) {
                    keyCommand3 = KeyCommand.DELETE_NEXT_WORD;
                } else {
                    if (mhx.a(a9, mhx.B)) {
                        keyCommand3 = KeyCommand.DESELECT;
                    }
                    keyCommand3 = null;
                }
                if (keyCommand3 != null) {
                }
            } else if (b4 == 8) {
                long a10 = jcb1.a(keyEvent.getKeyCode());
                if (mhx.a(a10, mhx.v) || mhx.a(a10, mhx.J)) {
                    keyCommand3 = KeyCommand.SELECT_LINE_START;
                } else {
                    if (mhx.a(a10, mhx.w) || mhx.a(a10, mhx.K)) {
                        keyCommand3 = KeyCommand.SELECT_LINE_END;
                    }
                    keyCommand3 = null;
                }
                if (keyCommand3 != null) {
                }
            } else {
                if (b4 == 1 && mhx.a(jcb1.a(keyEvent.getKeyCode()), mhx.t)) {
                    keyCommand3 = KeyCommand.DELETE_TO_LINE_END;
                    if (keyCommand3 != null) {
                    }
                }
                keyCommand3 = null;
                if (keyCommand3 != null) {
                }
            }
        } else {
            if ((mhx.a(a4, mhx.r) || mhx.a(a4, mhx.E)) && (b3 == 0 || b3 == 8 || b3 == 2 || b3 == 10)) {
                keyCommand2 = KeyCommand.NEW_LINE;
                if (keyCommand2 != null) {
                }
            }
            keyCommand2 = null;
            if (keyCommand2 != null) {
            }
        }
    }

    @Override // defpackage.h0r
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.b851
    public w751 c(Activity activity, gwi gwiVar) {
        ii6.Y0.getClass();
        return new w751(new hi6(h2b1.e().a(activity)), gwiVar.b(activity));
    }

    @Override // defpackage.pfm
    public void d(Throwable th) {
    }

    @Override // defpackage.xyn
    public void e(EncodeException encodeException) {
    }

    @Override // defpackage.f8p
    public h8p f(float f, float f2, float f3) {
        return new h8p(ry01.e(f2, f3, f, 255, 0), 255, false);
    }

    @Override // defpackage.pfm
    public void g(String str, LinkedHashMap linkedHashMap) {
    }

    @Override // defpackage.pke
    public Object h(Task task) {
        Intent intent = (Intent) ((Bundle) task.k()).getParcelable("notification_data");
        if (intent != null) {
            return new CloudMessage(intent);
        }
        return null;
    }

    @Override // defpackage.h0r
    public Object i(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.b851
    public w751 j(Activity activity, gwi gwiVar) {
        ii6.Y0.getClass();
        return new w751(new hi6(h2b1.e().d(activity)), gwiVar.b(activity));
    }

    @Override // defpackage.b851
    public w751 k(Context context, gwi gwiVar) {
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                context2 = context;
                break;
            }
            if ((context2 instanceof Activity) || (context2 instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context2;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context2 = contextWrapper.getBaseContext();
        }
        if (context2 instanceof Activity) {
            return c((Activity) context2, gwiVar);
        }
        if (!(context2 instanceof InputMethodService) && !(context2 instanceof Application)) {
            ny61.g("Must provide a UiContext or Application Context");
            return null;
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new w751(new Rect(0, 0, point.x, point.y), gwiVar.b(context));
    }

    @Override // defpackage.xyn
    public void l() {
    }

    @Override // defpackage.h0r
    public void n(Object obj) {
        ((InputStream) obj).close();
    }

    public j1g o(TaxiApplication taxiApplication) {
        j1g j1gVar = new j1g();
        j1gVar.a = n3w.a(j1gVar);
        return j1gVar;
    }

    @Override // defpackage.vm11
    public /* synthetic */ Object q() {
        return new rg21("");
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof rg21;
    }

    public int u(char c2, StringBuilder sb) {
        if (c2 == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c2 >= '0' && c2 <= '9') {
            sb.append((char) (c2 - ','));
            return 1;
        }
        if (c2 >= 'A' && c2 <= 'Z') {
            sb.append((char) (c2 - '3'));
            return 1;
        }
        if (c2 < ' ') {
            sb.append((char) 0);
            sb.append(c2);
            return 2;
        }
        if (c2 <= '/') {
            sb.append((char) 1);
            sb.append((char) (c2 - '!'));
            return 2;
        }
        if (c2 <= '@') {
            sb.append((char) 1);
            sb.append((char) (c2 - '+'));
            return 2;
        }
        if (c2 <= '_') {
            sb.append((char) 1);
            sb.append((char) (c2 - 'E'));
            return 2;
        }
        if (c2 > 127) {
            sb.append("\u0001\u001e");
            return u((char) (c2 - 128), sb) + 2;
        }
        sb.append((char) 2);
        sb.append((char) (c2 - '`'));
        return 2;
    }

    public void v(azn aznVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!aznVar.b()) {
                break;
            }
            char a2 = aznVar.a();
            aznVar.d++;
            int u = u(a2, sb);
            int length = aznVar.c.length() + ((sb.length() / 3) * 2);
            aznVar.c(length);
            int i = aznVar.f.b - length;
            if (!aznVar.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && i != 2) {
                    int length2 = sb.length();
                    sb.delete(length2 - u, length2);
                    aznVar.d--;
                    u = u(aznVar.a(), sb2);
                    aznVar.f = null;
                }
                while (sb.length() % 3 == 1 && (u > 3 || i != 1)) {
                    int length3 = sb.length();
                    sb.delete(length3 - u, length3);
                    aznVar.d--;
                    u = u(aznVar.a(), sb2);
                    aznVar.f = null;
                }
            } else if (sb.length() % 3 == 0) {
                if (l1b1.k(aznVar.d, x(), aznVar.a) != x()) {
                    aznVar.e = 0;
                    break;
                }
            }
        }
        z(aznVar, sb);
    }

    @Override // defpackage.xyn
    public void w(h hVar) {
    }

    public int x() {
        return 1;
    }

    public void z(azn aznVar, StringBuilder sb) {
        int length = (sb.length() / 3) * 2;
        int length2 = sb.length() % 3;
        int length3 = aznVar.c.length() + length;
        aznVar.c(length3);
        int i = aznVar.f.b - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                I(aznVar, sb);
            }
            if (aznVar.b()) {
                aznVar.d((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                I(aznVar, sb);
            }
            if (aznVar.b()) {
                aznVar.d((char) 254);
            }
            aznVar.d--;
        } else {
            if (length2 != 0) {
                ny61.r("Unexpected case. Please report!");
                return;
            }
            while (sb.length() >= 3) {
                I(aznVar, sb);
            }
            if (i > 0 || aznVar.b()) {
                aznVar.d((char) 254);
            }
        }
        aznVar.e = 0;
    }

    public zoy0() {
    }
}
