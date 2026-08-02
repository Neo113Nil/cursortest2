package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.chart.catalog.ChartActivity;
import ru.yandex.quasar.glagol.impl.ConversationImpl;
import ru.yandex.video.m3.player.AbrPreferences;

/* loaded from: classes.dex */
public abstract /* synthetic */ class weo {
    public static final wn5 a = new wn5(new bo5(12), -1298651009, false);
    public static final wn5 b = new wn5(new bo5(13), -2057846917, false);
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static r8e g;
    public static final ynn h;

    static {
        new wn5(new bo5(14), -379656705, false);
        c = new wn5(new io5(18), -75863754, false);
        d = new wn5(new io5(19), -1425923664, false);
        e = new wn5(new po5(19), 907401796, false);
        f = new wn5(new ap5(29), -1228720876, false);
        g = new qee(27);
        h = new ynn(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:190:0x03d0, code lost:
    
        if (r3 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x07f8, code lost:
    
        if (r3 == null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        if (r3 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if (r6 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0192, code lost:
    
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean B(String str, uk8 uk8Var, w0a w0aVar, xzb xzbVar) {
        boolean z;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        ClipData clipData;
        boolean z5;
        int i;
        hdg jirVar;
        xzb xzbVar2;
        Object a2;
        List list;
        gc8 gc8Var;
        int i2;
        Integer num;
        int intValue;
        ObjectAnimator ofArgb;
        Double d2;
        Double e0;
        Object a3;
        Object a4;
        Animator animator;
        int i3 = 0;
        if (uk8Var == null || !(w0aVar instanceof gc8)) {
            return false;
        }
        if (uk8Var instanceof gk8) {
            ((Uri) ((gk8) uk8Var).b.c.a(xzbVar)).toString();
            ((gc8) w0aVar).getDiv2Component$div_release().j();
            xq0.w("To load patch you must provide implementation of DivDownloader to your DivConfiguration. ");
            return false;
        }
        gc8 gc8Var2 = (gc8) w0aVar;
        Iterator it = gc8Var2.getDiv2Component$div_release().s().a.iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                switch (((xk8) next).a) {
                    case 0:
                        if (!(uk8Var instanceof zj8)) {
                            z = true;
                            if (uk8Var instanceof ak8) {
                                sd8 sd8Var = ((ak8) uk8Var).b;
                                String str2 = (String) sd8Var.b.a(xzbVar);
                                hyf.L(gc8Var2, str2, xzbVar, new sv4(gc8Var2, new vk8((int) ((Number) sd8Var.a.a(xzbVar)).longValue(), gc8Var2, str2)));
                            } else if (!(uk8Var instanceof bk8)) {
                                z2 = false;
                                z3 = z2;
                                break;
                            } else {
                                xd8 xd8Var = ((bk8) uk8Var).b;
                                String str3 = (String) xd8Var.c.a(xzbVar);
                                hyf.L(gc8Var2, str3, xzbVar, new sv4(gc8Var2, new yx7((int) ((Number) xd8Var.a.a(xzbVar)).longValue(), gc8Var2, str3, ot0.z(xd8Var.b, xzbVar))));
                            }
                        } else {
                            nd8 nd8Var = ((zj8) uk8Var).b;
                            String str4 = (String) nd8Var.c.a(xzbVar);
                            szb szbVar = nd8Var.a;
                            z = true;
                            hyf.L(gc8Var2, str4, xzbVar, new sv4(gc8Var2, new ak0(szbVar != null ? Integer.valueOf((int) ((Number) szbVar.a(xzbVar)).longValue()) : null, gc8Var2, str4, ot0.z(nd8Var.b, xzbVar), 4)));
                        }
                        z2 = z;
                        z3 = z2;
                    case 1:
                        z4 = true;
                        if (uk8Var instanceof ck8) {
                            gc8Var2.clearFocus();
                            wdp.X(gc8Var2);
                            z3 = z4;
                            z = z4;
                            break;
                        }
                        z3 = false;
                        z = z4;
                    case 2:
                        z4 = true;
                        if (uk8Var instanceof dk8) {
                            ye8 ye8Var = ((dk8) uk8Var).b.a;
                            Object systemService = gc8Var2.getContext$div_release().getSystemService("clipboard");
                            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                            if (clipboardManager != null) {
                                if (ye8Var instanceof we8) {
                                    clipData = new ClipData("Copied text", new String[]{"text/plain"}, new ClipData.Item((String) ((we8) ye8Var).b.a.a(xzbVar)));
                                } else if (ye8Var instanceof xe8) {
                                    clipData = new ClipData("Copied url", new String[]{"text/uri-list"}, new ClipData.Item((Uri) ((xe8) ye8Var).b.a.a(xzbVar)));
                                } else {
                                    b6e.s();
                                }
                                clipboardManager.setPrimaryClip(clipData);
                            }
                            z3 = z4;
                            z = z4;
                            break;
                        }
                        z3 = false;
                        z = z4;
                    case 3:
                        z4 = true;
                        if (uk8Var instanceof fk8) {
                            of8 of8Var = ((fk8) uk8Var).b;
                            String str5 = (String) of8Var.c.a(xzbVar);
                            String str6 = (String) of8Var.a.a(xzbVar);
                            wx9 wx9Var = of8Var.b;
                            hyf.L(gc8Var2, str5, xzbVar, new lj0(15, gc8Var2, wx9Var != null ? ot0.z(wx9Var, xzbVar) : null, str6));
                            z3 = z4;
                            z = z4;
                            break;
                        }
                        z3 = false;
                        z = z4;
                    case 4:
                        if (uk8Var instanceof hk8) {
                            String str7 = (String) ((hk8) uk8Var).b.a.a(xzbVar);
                            View findViewWithTag = gc8Var2.findViewWithTag(str7);
                            if (findViewWithTag == null) {
                                Set entrySet = gc8Var2.getViewComponent$div_release().e().f.entrySet();
                                ArrayList arrayList = new ArrayList();
                                Iterator it2 = entrySet.iterator();
                                while (it2.hasNext()) {
                                    View contentView = ((dps) ((Map.Entry) it2.next()).getValue()).d.getContentView();
                                    if (contentView != null) {
                                        arrayList.add(contentView);
                                    }
                                }
                                Iterator it3 = arrayList.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        findViewWithTag = null;
                                        break;
                                    } else {
                                        View findViewWithTag2 = ((View) it3.next()).findViewWithTag(str7);
                                        if (findViewWithTag2 != null) {
                                            findViewWithTag = findViewWithTag2;
                                            break;
                                        }
                                    }
                                }
                            }
                            findViewWithTag.requestFocus();
                            if (findViewWithTag instanceof j79) {
                                j79 j79Var = (j79) findViewWithTag;
                                InputMethodManager inputMethodManager = (InputMethodManager) j79Var.getContext().getSystemService(InputMethodManager.class);
                                if (inputMethodManager != null) {
                                    z4 = true;
                                    inputMethodManager.showSoftInput(j79Var, 1);
                                    z3 = z4;
                                    z = z4;
                                    break;
                                }
                            }
                            z4 = true;
                            z3 = z4;
                            z = z4;
                        } else {
                            z4 = true;
                            z3 = false;
                            z = z4;
                        }
                    case 5:
                        if (uk8Var instanceof ik8) {
                            gc8Var2.G((String) ((ik8) uk8Var).b.a.a(xzbVar));
                            z5 = true;
                            z3 = z5;
                            z = true;
                            break;
                        }
                        z5 = false;
                        z3 = z5;
                        z = true;
                    case 6:
                        if (!(uk8Var instanceof jk8)) {
                            if (uk8Var instanceof kk8) {
                                nh8 nh8Var = ((kk8) uk8Var).b;
                                String str8 = (String) nh8Var.c.a(xzbVar);
                                boolean booleanValue = ((Boolean) nh8Var.a.a(xzbVar)).booleanValue();
                                jzi m = qee.m(str8, gc8Var2, xzbVar, 1);
                                if (m != null) {
                                    j66 j66Var = (j66) m.a;
                                    dh8 dh8Var = nh8Var.b;
                                    if (dh8Var instanceof bh8) {
                                        j66Var.o0((int) ((Number) ((bh8) dh8Var).b.a.a(xzbVar)).longValue(), jk9.DP, booleanValue);
                                    } else if (dh8Var instanceof zg8) {
                                        m.B((int) ((Number) ((zg8) dh8Var).b.a.a(xzbVar)).longValue(), booleanValue);
                                    } else if (dh8Var instanceof yg8) {
                                        j66Var.p0(booleanValue);
                                    } else if (dh8Var instanceof ch8) {
                                        m.B(0, booleanValue);
                                    } else if (dh8Var instanceof ah8) {
                                        try {
                                            m.A((String) ((ah8) dh8Var).b.a.a(xzbVar), booleanValue);
                                        } catch (RuntimeException e2) {
                                            gc8Var2.I(e2);
                                        }
                                    }
                                }
                            }
                            z5 = false;
                            z3 = z5;
                            z = true;
                            break;
                        } else {
                            sg8 sg8Var = ((jk8) uk8Var).b;
                            String str9 = (String) sg8Var.b.a(xzbVar);
                            int longValue = (int) ((Number) sg8Var.d.a(xzbVar)).longValue();
                            int longValue2 = (int) ((Number) sg8Var.c.a(xzbVar)).longValue();
                            String str10 = ((rg8) sg8Var.e.a(xzbVar)).a;
                            boolean booleanValue2 = ((Boolean) sg8Var.a.a(xzbVar)).booleanValue();
                            jzi m2 = qee.m(str9, gc8Var2, xzbVar, 1);
                            if (m2 != null) {
                                m2.e(longValue2, str10, booleanValue2);
                                m2.z(longValue, str10, booleanValue2);
                            }
                        }
                        z5 = true;
                        z3 = z5;
                        z = true;
                    case 7:
                        if (uk8Var instanceof lk8) {
                            uh8 uh8Var = ((lk8) uk8Var).b;
                            szb szbVar2 = uh8Var.a;
                            th8 th8Var = uh8Var.b;
                            String str11 = (String) szbVar2.a(xzbVar);
                            List q = bfg.q(gc8Var2, str11);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : q) {
                                if (obj2 instanceof j79) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                xk8.a(gc8Var2, "No input view with id '" + str11 + '\'');
                            } else if (arrayList2.size() > 1) {
                                xk8.a(gc8Var2, "Found multiple input views with id '" + str11 + '\'');
                            } else {
                                j79 j79Var2 = (j79) CollectionsKt.Q(arrayList2);
                                int length = j79Var2.length();
                                long longValue3 = ((Number) th8Var.b.a(xzbVar)).longValue();
                                Integer b2 = xk8.b(length, longValue3);
                                if (b2 != null) {
                                    int intValue2 = b2.intValue();
                                    szb szbVar3 = th8Var.a;
                                    if (szbVar3 != null) {
                                        long longValue4 = ((Number) szbVar3.a(xzbVar)).longValue();
                                        Integer b3 = xk8.b(length, longValue4);
                                        if (b3 != null) {
                                            i = b3.intValue();
                                        } else {
                                            xk8.a(gc8Var2, "Wrong end value " + longValue4);
                                        }
                                    } else {
                                        i = intValue2;
                                    }
                                    if (!j79Var2.isFocused()) {
                                        j79Var2.requestFocus();
                                        InputMethodManager inputMethodManager2 = (InputMethodManager) j79Var2.getContext().getSystemService(InputMethodManager.class);
                                        if (inputMethodManager2 != null) {
                                            inputMethodManager2.showSoftInput(j79Var2, 1);
                                        }
                                    }
                                    j79Var2.setSelection(intValue2, i);
                                } else {
                                    xk8.a(gc8Var2, "Wrong start value " + longValue3);
                                }
                            }
                            z3 = true;
                            z = true;
                            break;
                        }
                        z3 = false;
                        z = true;
                    case 8:
                        if (uk8Var instanceof mk8) {
                            ci8 ci8Var = ((mk8) uk8Var).b;
                            String str12 = (String) ci8Var.a.a(xzbVar);
                            try {
                                gc8Var2.T(kg5.E(str12), ((Boolean) ci8Var.b.a(xzbVar)).booleanValue());
                            } catch (iak e3) {
                                gc8Var2.I(new IllegalArgumentException(f1d.g("Invalid format of ", str12), e3));
                            }
                            z3 = true;
                            z = true;
                            break;
                        }
                        z3 = false;
                        z = true;
                    case 9:
                        if (uk8Var instanceof nk8) {
                            ji8 ji8Var = ((nk8) uk8Var).b;
                            String str13 = (String) ji8Var.b.a(xzbVar);
                            long longValue5 = ((Number) ji8Var.a.a(xzbVar)).longValue();
                            szb szbVar4 = ji8Var.c;
                            ii8 ii8Var = szbVar4 != null ? (ii8) szbVar4.a(xzbVar) : null;
                            wx9 wx9Var2 = ji8Var.d;
                            if (wx9Var2 instanceof ux9) {
                                jirVar = new mir(str13, (String) ((ux9) wx9Var2).b.a.a(xzbVar));
                            } else if (wx9Var2 instanceof sx9) {
                                jirVar = new lir(str13, ((Number) ((sx9) wx9Var2).b.a.a(xzbVar)).longValue());
                            } else if (wx9Var2 instanceof px9) {
                                jirVar = new hir(str13, ((Boolean) ((px9) wx9Var2).b.a.a(xzbVar)).booleanValue());
                            } else if (wx9Var2 instanceof tx9) {
                                jirVar = new kir(str13, ((Number) ((tx9) wx9Var2).b.a.a(xzbVar)).doubleValue());
                            } else if (wx9Var2 instanceof qx9) {
                                jirVar = new iir(str13, ((Number) ((qx9) wx9Var2).b.a.a(xzbVar)).intValue());
                            } else if (wx9Var2 instanceof vx9) {
                                String uri = ((Uri) ((vx9) wx9Var2).b.a.a(xzbVar)).toString();
                                uri.getClass();
                                try {
                                    new URL(uri);
                                    jirVar = new nir(str13, uri);
                                } catch (MalformedURLException unused) {
                                    xq0.x("Invalid url ".concat(uri));
                                }
                            } else if (wx9Var2 instanceof ox9) {
                                jirVar = new gir(str13, (JSONArray) ((ox9) wx9Var2).b.a.a(xzbVar));
                            } else if (wx9Var2 instanceof rx9) {
                                jirVar = new jir(str13, (JSONObject) ((rx9) wx9Var2).b.a.a(xzbVar));
                            } else {
                                b6e.s();
                            }
                            ldg.t(jirVar, longValue5, gc8Var2, ii8Var);
                            z3 = true;
                            z = true;
                            break;
                        }
                        z3 = false;
                        z = true;
                    case 10:
                        if (uk8Var instanceof ok8) {
                            pi8 pi8Var = ((ok8) uk8Var).b;
                            if (str != null) {
                                k79 Y = new cb6(str).Y(gc8Var2);
                                if (Y != null) {
                                    xzbVar2 = Y.b;
                                    break;
                                } else {
                                    xzbVar2 = null;
                                    break;
                                }
                            }
                            xzbVar2 = xzbVar;
                            String str14 = (String) pi8Var.b.a(xzbVar2);
                            wx9 wx9Var3 = pi8Var.a;
                            if (wx9Var3 instanceof ox9) {
                                a2 = ((ox9) wx9Var3).b.a.a(xzbVar2);
                            } else if (wx9Var3 instanceof px9) {
                                a2 = ((px9) wx9Var3).b.a.a(xzbVar2);
                            } else if (wx9Var3 instanceof qx9) {
                                a2 = ((qx9) wx9Var3).b.a.a(xzbVar2);
                            } else if (wx9Var3 instanceof rx9) {
                                a2 = ((rx9) wx9Var3).b.a.a(xzbVar2);
                            } else if (wx9Var3 instanceof sx9) {
                                a2 = ((sx9) wx9Var3).b.a.a(xzbVar2);
                            } else if (wx9Var3 instanceof tx9) {
                                a2 = ((tx9) wx9Var3).b.a.a(xzbVar2);
                            } else if (wx9Var3 instanceof ux9) {
                                a2 = ((ux9) wx9Var3).b.a.a(xzbVar2);
                            } else if (wx9Var3 instanceof vx9) {
                                a2 = ((vx9) wx9Var3).b.a.a(xzbVar2);
                            } else {
                                b6e.s();
                            }
                            hyf.L(gc8Var2, str14, xzbVar2, new sv4(19, a2, gc8Var2));
                            z3 = true;
                            z = true;
                            break;
                        }
                        z3 = false;
                        z = true;
                    case 11:
                        if (uk8Var instanceof pk8) {
                            ui8 ui8Var = ((pk8) uk8Var).b;
                            String str15 = (String) ui8Var.a.a(xzbVar);
                            szb szbVar5 = ui8Var.b;
                            Boolean bool = szbVar5 != null ? (Boolean) szbVar5.a(xzbVar) : null;
                            if (bool != null) {
                                gc8Var2.P(str15, bool.booleanValue());
                            } else {
                                gc8Var2.O(str15);
                            }
                            z3 = true;
                            z = true;
                            break;
                        }
                        z3 = false;
                        z = true;
                    case 12:
                        qk8 qk8Var = uk8Var instanceof qk8 ? (qk8) uk8Var : null;
                        if (qk8Var != null) {
                            cj8 cj8Var = qk8Var.b;
                            bj8 bj8Var = cj8Var.d;
                            k79 Y2 = new cb6((String) cj8Var.a.a(xzbVar)).Y(gc8Var2);
                            if (Y2 != null) {
                                List list2 = bj8Var.a;
                                if (list2 != null) {
                                    List<zi8> list3 = list2;
                                    ArrayList arrayList3 = new ArrayList(v75.o(list3, 10));
                                    for (zi8 zi8Var : list3) {
                                        arrayList3.add(new o6c(21));
                                    }
                                }
                                ((aj8) bj8Var.b.a(xzbVar)).toString();
                                List i4 = Y2.a.d().i();
                                List list4 = i4;
                                if (list4 != null && !list4.isEmpty()) {
                                    JSONObject jSONObject = new JSONObject();
                                    Iterator it4 = i4.iterator();
                                    while (it4.hasNext()) {
                                        String H = bg3.H((zy9) it4.next());
                                        kxt c2 = Y2.b.c(H);
                                        if (c2 == null || jSONObject.put(H, bg3.o0(c2.d())) == null) {
                                            gc8Var2.I(new b6i(H));
                                        }
                                    }
                                    jSONObject.toString();
                                }
                                List list5 = cj8Var.c;
                                List list6 = cj8Var.b;
                                List list7 = list5;
                                if ((list7 == null || list7.isEmpty()) && (list = list6) != null) {
                                    list.isEmpty();
                                }
                                gc8Var2.p(new ih9());
                                z3 = true;
                                z = true;
                                break;
                            }
                        }
                        z3 = false;
                        z = true;
                        break;
                    case 13:
                        if (uk8Var instanceof rk8) {
                            rj8 rj8Var = ((rk8) uk8Var).b;
                            gc8Var2.s((String) rj8Var.b.a(xzbVar), ((qj8) rj8Var.a.a(xzbVar)).a);
                            z3 = true;
                            z = true;
                            break;
                        }
                        z3 = false;
                        z = true;
                    case 14:
                        if (uk8Var instanceof sk8) {
                            bm8 bm8Var = ((sk8) uk8Var).b;
                            hyf.L(gc8Var2, (String) bm8Var.c.a(xzbVar), xzbVar, new ak0(bm8Var, xzbVar, new sml(new am8(gc8Var2, 0)), gc8Var2, 5));
                            z3 = true;
                            z = true;
                            break;
                        }
                        z3 = false;
                        z = true;
                    case 15:
                        gc8 gc8Var3 = gc8Var2;
                        if (uk8Var instanceof tk8) {
                            hm8 hm8Var = ((tk8) uk8Var).b;
                            gc8Var2 = gc8Var3;
                            gc8Var2.t((String) hm8Var.b.a(xzbVar), ((gm8) hm8Var.a.a(xzbVar)).a, xzbVar);
                            z3 = true;
                            z = true;
                            break;
                        } else {
                            gc8Var2 = gc8Var3;
                            z3 = false;
                            z = true;
                        }
                    default:
                        if (uk8Var instanceof xj8) {
                            if (str != null) {
                                List q2 = bfg.q(gc8Var2, str);
                                if (q2.size() == 1) {
                                    View view = (View) CollectionsKt.Q(q2);
                                    en8 m3 = gc8Var2.getViewComponent$div_release().m();
                                    cd8 cd8Var = ((xj8) uk8Var).b;
                                    LinkedHashMap linkedHashMap = m3.b;
                                    String str16 = cd8Var.a;
                                    wx9 wx9Var4 = cd8Var.d;
                                    wx9 wx9Var5 = cd8Var.h;
                                    bn8 a5 = m3.a(view, str16);
                                    if (a5 != null) {
                                        Pair pair = new Pair(str, str16);
                                        if (linkedHashMap.containsKey(pair) && (animator = (Animator) linkedHashMap.remove(pair)) != null) {
                                            animator.cancel();
                                        }
                                        gc8 gc8Var4 = m3.a;
                                        if (a5 instanceof an8) {
                                            q99 q99Var = ((an8) a5).b;
                                            String str17 = q99Var.k;
                                            i2 = i3;
                                            szb szbVar6 = q99Var.e;
                                            szb szbVar7 = q99Var.j;
                                            kxt c3 = xzbVar.c(str17);
                                            gc8Var = gc8Var2;
                                            if (c3 instanceof ext) {
                                                ext extVar = (ext) c3;
                                                if (wx9Var5 != null) {
                                                    if (wx9Var5 instanceof sx9) {
                                                        a3 = (Long) ((sx9) wx9Var5).b.a.a(xzbVar);
                                                        break;
                                                    } else {
                                                        a3 = null;
                                                        break;
                                                    }
                                                }
                                                a3 = szbVar7 != null ? szbVar7.a(xzbVar) : null;
                                                if (wx9Var4 != null) {
                                                    if (wx9Var4 instanceof sx9) {
                                                        a4 = (Long) ((sx9) wx9Var4).b.a.a(xzbVar);
                                                        break;
                                                    } else {
                                                        a4 = null;
                                                        break;
                                                    }
                                                }
                                                a4 = szbVar6.a(xzbVar);
                                                if (a3 != null) {
                                                    extVar.i(a3);
                                                }
                                                ofArgb = ObjectAnimator.ofInt(extVar, hre.a, ((Number) a4).intValue());
                                                vq2.z(ofArgb, gc8Var4, q99Var, cd8Var, xzbVar);
                                            } else if (c3 instanceof dxt) {
                                                dxt dxtVar = (dxt) c3;
                                                if (wx9Var5 == null || (d2 = wdp.e0(wx9Var5, xzbVar)) == null) {
                                                    d2 = szbVar7 != null ? (Double) szbVar7.a(xzbVar) : null;
                                                }
                                                double doubleValue = (wx9Var4 == null || (e0 = wdp.e0(wx9Var4, xzbVar)) == null) ? ((Number) szbVar6.a(xzbVar)).doubleValue() : e0.doubleValue();
                                                if (d2 != null) {
                                                    dxtVar.i(d2);
                                                }
                                                hhj hhjVar = hhj.a;
                                                float f2 = (float) doubleValue;
                                                float[] fArr = new float[1];
                                                fArr[i2] = f2;
                                                ofArgb = ObjectAnimator.ofFloat(dxtVar, hhjVar, fArr);
                                                vq2.z(ofArgb, gc8Var4, q99Var, cd8Var, xzbVar);
                                            } else {
                                                gc8Var4.I(new RuntimeException(ouj.k('\'', "Unable to find number variable with name '", str17)));
                                                ofArgb = null;
                                            }
                                            if (ofArgb != null) {
                                                ofArgb.addListener(new dn8(m3, pair, 1));
                                                ofArgb.addListener(new dn8(m3, pair, i2));
                                                linkedHashMap.put(pair, ofArgb);
                                                ofArgb.start();
                                            }
                                            z3 = true;
                                        } else {
                                            i2 = i3;
                                            gc8Var = gc8Var2;
                                            if (a5 instanceof zm8) {
                                                yr8 yr8Var = ((zm8) a5).b;
                                                String str18 = yr8Var.k;
                                                kxt c4 = xzbVar.c(str18);
                                                bxt bxtVar = c4 instanceof bxt ? (bxt) c4 : null;
                                                if (bxtVar == null) {
                                                    gc8Var4.I(new RuntimeException(ouj.k('\'', "Unable to find color variable with name '", str18)));
                                                    ofArgb = null;
                                                    if (ofArgb != null) {
                                                    }
                                                    z3 = true;
                                                } else {
                                                    if (wx9Var5 != null) {
                                                        if (wx9Var5 instanceof qx9) {
                                                            num = (Integer) ((qx9) wx9Var5).b.a.a(xzbVar);
                                                            break;
                                                        } else {
                                                            num = null;
                                                            break;
                                                        }
                                                    }
                                                    szb szbVar8 = yr8Var.j;
                                                    num = szbVar8 != null ? (Integer) szbVar8.a(xzbVar) : null;
                                                    if (wx9Var4 != null) {
                                                        Integer num2 = wx9Var4 instanceof qx9 ? (Integer) ((qx9) wx9Var4).b.a.a(xzbVar) : null;
                                                        if (num2 != null) {
                                                            intValue = num2.intValue();
                                                            if (num != null) {
                                                                bxtVar.i(new c85(num.intValue()));
                                                            }
                                                            ofArgb = ObjectAnimator.ofArgb(bxtVar, r85.a, intValue);
                                                            vq2.z(ofArgb, gc8Var4, yr8Var, cd8Var, xzbVar);
                                                            if (ofArgb != null) {
                                                            }
                                                            z3 = true;
                                                        }
                                                    }
                                                    intValue = ((Number) yr8Var.e.a(xzbVar)).intValue();
                                                    if (num != null) {
                                                    }
                                                    ofArgb = ObjectAnimator.ofArgb(bxtVar, r85.a, intValue);
                                                    vq2.z(ofArgb, gc8Var4, yr8Var, cd8Var, xzbVar);
                                                    if (ofArgb != null) {
                                                    }
                                                    z3 = true;
                                                }
                                            } else {
                                                b6e.s();
                                                z3 = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            gc8Var = gc8Var2;
                            z3 = true;
                        } else {
                            gc8Var = gc8Var2;
                            if (uk8Var instanceof yj8) {
                                if (str != null) {
                                    Animator animator2 = (Animator) gc8Var.getViewComponent$div_release().m().b.remove(new Pair(str, ((yj8) uk8Var).b.a));
                                    if (animator2 != null) {
                                        animator2.cancel();
                                    }
                                }
                                z3 = true;
                            }
                            z3 = false;
                        }
                        gc8Var2 = gc8Var;
                        z = true;
                        break;
                }
                if (z3) {
                    obj = next;
                } else {
                    i3 = 0;
                }
            } else {
                z = true;
                obj = null;
            }
        }
        boolean z6 = obj != null ? z : false;
        if (!z6) {
            int i5 = i9f.a;
        }
        return z6;
    }

    public static vje C(osa osaVar, jyn jynVar, long j, int i) {
        if ((i & 2) != 0) {
            jynVar = jyn.a;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new vje(osaVar, jynVar, j);
    }

    public static Intent D(Context context, og4 og4Var) {
        Intent putExtra = new Intent(context, (Class<?>) ChartActivity.class).putExtra("transit.args", cxb.K(new Pair("chart.type", og4Var)));
        putExtra.getClass();
        return putExtra;
    }

    public static boolean E(d0o d0oVar, l3o l3oVar) {
        d0oVar.getClass();
        int i = l3oVar.d;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String a2 = l3oVar.f.a("Expires");
            if (a2 == null) {
                a2 = null;
            }
            if (a2 == null && l3oVar.a().c == -1 && !l3oVar.a().f && !l3oVar.a().e) {
                return false;
            }
        }
        return (l3oVar.a().b || d0oVar.a().b) ? false : true;
    }

    public static final boolean G(d0o d0oVar) {
        d0oVar.getClass();
        return ofc.class.cast(d0oVar.e.get(ofc.class)) != null;
    }

    public static final void H(rmb rmbVar, thj thjVar, boolean z, String str, fcc fccVar) {
        rmbVar.getClass();
        thjVar.getClass();
        str.getClass();
        if (z) {
            rmbVar.l(fccVar, thjVar, str);
        } else {
            rmbVar.f(thjVar, fccVar);
        }
    }

    public static final dn6 I(String str) {
        ru ruVar = new ru(null, "", str, null, null, false);
        Parcelable.Creator<oq> creator = oq.CREATOR;
        return new dn6(new oq(str, "", null, false, null, null, null, null, null, null, 0, null, c5b.a, null, 0, false, null, null, null, null, null, null, false, null, 536862716), ruVar);
    }

    public static final io6 J(String str) {
        return new io6(new po6("", str, "by awesome Freddie", true, jzb.d, true, true), wyf.E(str));
    }

    public static final cdj K(oq oqVar, boolean z) {
        Long l;
        String N;
        oqVar.getClass();
        Integer num = oqVar.w;
        Long l2 = null;
        if (num != null) {
            msa msaVar = nsa.b;
            long f2 = nsa.f(yd5.M(num.intValue(), ssa.SECONDS));
            if (f2 < 0) {
                f2 = 0;
            }
            l = Long.valueOf(f2);
        } else {
            l = null;
        }
        Integer num2 = oqVar.x;
        if (num2 != null) {
            msa msaVar2 = nsa.b;
            long f3 = nsa.f(yd5.M(num2.intValue(), ssa.SECONDS));
            l2 = Long.valueOf(f3 >= 0 ? f3 : 0L);
        }
        if (l == null || l2 == null) {
            return new zcj("");
        }
        if (l2.longValue() <= 1500) {
            return ycj.a;
        }
        long longValue = l2.longValue();
        if (z) {
            long j = longValue / 1000;
            long j2 = (j / 60) + (((int) j) % 60 >= 30 ? 1 : 0);
            l18 l18Var = l18.b;
            bdt I = hag.I(skr.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            N = ((skr) qdcVar.C(I)).b(R.plurals.podcast_episode_time_left, (int) j2, saf.N(longValue));
        } else {
            N = saf.N(longValue);
        }
        return new bdj(N, l2.longValue(), (l.longValue() - l2.longValue()) / l.longValue());
    }

    public static final Object L(a aVar, ozm ozmVar) {
        ozmVar.getClass();
        Object obj = aVar.get(ozmVar);
        if (obj == null) {
            obj = ozmVar.b();
        }
        return ((vwt) obj).a(aVar);
    }

    public static final int M(Context context, int i) {
        context.getClass();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static final int N(Context context, int i, int i2) {
        Resources.Theme theme;
        context.getClass();
        TypedValue typedValue = new TypedValue();
        if (i == 0) {
            theme = context.getTheme();
            theme.getClass();
        } else {
            theme = new uf6(context, i).getTheme();
            theme.getClass();
        }
        theme.resolveAttribute(i2, typedValue, true);
        return typedValue.data;
    }

    public static b9r Q(float f2, float f3, Object obj, int i) {
        if ((i & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new b9r(f2, f3, obj);
    }

    public static final AbrPreferences R(e5 e5Var) {
        e5Var.getClass();
        return new AbrPreferences(null, Boolean.valueOf(e5Var.a.t()), e5Var.b.s(), false, null);
    }

    public static act S(int i, int i2, kya kyaVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            kyaVar = nya.a;
        }
        return new act(i, i2, kyaVar);
    }

    public static final a T(qzm[] qzmVarArr, a aVar, a aVar2) {
        a aVar3 = a.g;
        qlk qlkVar = new qlk(aVar3);
        qlkVar.g = aVar3;
        for (qzm qzmVar : qzmVarArr) {
            ozm ozmVar = qzmVar.a;
            if (qzmVar.f || !aVar.containsKey(ozmVar)) {
                qlkVar.put(ozmVar, ozmVar.c(qzmVar, (vwt) aVar2.get(ozmVar)));
            }
        }
        return qlkVar.d();
    }

    public static final ynn U(wof wofVar) {
        ynn w = ltg.w(wofVar);
        long k = wofVar.k(w.f());
        float f2 = w.c;
        float f3 = w.d;
        return ywf.c(k, wofVar.k((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L)));
    }

    public static final void a(t71 t71Var, o0k o0kVar, hq5 hq5Var, int i) {
        t71 t71Var2;
        o0k o0kVar2;
        int i2;
        aqi aqiVar;
        fp7 fp7Var;
        boolean z;
        t71Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1571642202);
        int i3 = (oq5Var.f(t71Var) ? 4 : 2) | i | (oq5Var.f(o0kVar) ? 32 : 16);
        int i4 = 1;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            aqi Q = szf.Q(t71Var.getState(), oq5Var);
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            fvf a3 = hvf.a(0, 0, oq5Var, 0, 3);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = k5r.h(((v71) Q.getValue()).b(), oq5Var);
            }
            u6k u6kVar = (u6k) K;
            u6kVar.i(((v71) Q.getValue()).b());
            List h2 = u75.h(a2, a3);
            h2.getClass();
            boolean f2 = oq5Var.f(h2);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = new u2s(u6kVar, h2);
                oq5Var.k0(K2);
            }
            ek B = yd5.B((u2s) K2, oq5Var);
            yci a4 = androidx.compose.ui.input.nestedscroll.a.a(vci.a, zc4.L(B, false, oq5Var, 2), null);
            ogp.g.e(false, ((v71) Q.getValue()).c, t71Var.d(), oq5Var, 4096, 1);
            ta5 a5 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a5, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i6 = 6;
            yd5.b(B, rvf.M(R.string.artist_familiar_block, oq5Var), mp0.a(oq5Var), null, null, ild.C(1687321666, new q2(i6, t71Var), oq5Var), 0L, oq5Var, 196608, 88);
            oq5Var = oq5Var;
            oq5Var.W(-1604912438, Integer.valueOf(((v71) Q.getValue()).b.size()));
            int b2 = ((v71) Q.getValue()).b();
            boolean f3 = oq5Var.f(Q);
            Object K3 = oq5Var.K();
            if (f3 || K3 == kjnVar) {
                K3 = new jc(Q, i4);
                oq5Var.k0(K3);
            }
            fp7 b3 = r3k.b(b2, (Function0) K3, oq5Var, 0, 2);
            oq5Var.p(false);
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                K4 = gld.R(g.a, oq5Var);
                oq5Var.k0(K4);
            }
            mm6 mm6Var = (mm6) K4;
            b81 b81Var = ((v71) Q.getValue()).c().a;
            List list = ((v71) Q.getValue()).b;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((e81) it.next()).a);
            }
            boolean f4 = oq5Var.f(Q) | oq5Var.h(mm6Var) | oq5Var.f(b3);
            Object K5 = oq5Var.K();
            if (f4 || K5 == kjnVar) {
                K5 = new g3(i6, Q, mm6Var, b3);
                oq5Var.k0(K5);
            }
            qwp.a(b81Var, arrayList, (Function1) K5, null, oq5Var, 0);
            boolean z2 = ((v71) Q.getValue()).c;
            boolean z3 = (i3 & 14) == 4;
            Object K6 = oq5Var.K();
            if (z3 || K6 == kjnVar) {
                aqiVar = Q;
                fp7Var = b3;
                i2 = 10;
                z = true;
                K6 = new m71(0, t71Var, t71.class, "onRefresh", "onRefresh()V", 0, 0);
                oq5Var.k0(K6);
            } else {
                aqiVar = Q;
                fp7Var = b3;
                i2 = 10;
                z = true;
            }
            Function0 function0 = (Function0) ((h9f) K6);
            pr prVar = new pr(fp7Var, aqiVar, t71Var, o0kVar, a2, a3, 1);
            t71Var2 = t71Var;
            o0kVar2 = o0kVar;
            bfg.f(z2, function0, null, null, false, ild.C(-1265687140, prVar, oq5Var), oq5Var, 196608, 28);
            oq5Var.p(z);
        } else {
            t71Var2 = t71Var;
            o0kVar2 = o0kVar;
            i2 = 10;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new a3(t71Var2, o0kVar2, i, i2);
        }
    }

    public static final void b(float f2, float f3, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1957562019);
        if ((i & 6) == 0) {
            i2 = (oq5Var.c(f2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.c(f3) ? 32 : 16;
        }
        int i3 = i2 | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            ug3.a(androidx.compose.foundation.a.b(d.o(yciVar, f2, f3), ((d85) oq5Var.j(sb6.a)).a, vnj.i), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iu4(f2, f3, i, 1, yciVar);
        }
    }

    public static final void c(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1052214286);
        int i2 = i | 6;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            etn.l(sb6.a.a(new d85(d85.b(((ma5) oq5Var.j(pa5.a)).g() ? d85.b : d85.f, ((Number) fgq.s(fgq.D(null, oq5Var, 1), 0.05f, 0.1f, C(S(800, 0, null, 6), jyn.b, 0L, 4), null, oq5Var, 4104, 8).d.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14))), ild.C(1666170674, new t83(12), oq5Var), oq5Var, 56);
            yciVar = vci.a;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u71(yciVar, i, 16);
        }
    }

    public static final void d(rba rbaVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        rbaVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(788601503);
        int i2 = 4;
        int i3 = (oq5Var2.d(rbaVar.ordinal()) ? 4 : 2) | i | (oq5Var2.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int ordinal = rbaVar.ordinal();
            if (ordinal == 0) {
                oq5Var = oq5Var2;
                oq5Var.Z(1931846531);
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var2.Z(-243560575);
                wje s = fgq.s(fgq.D(null, oq5Var2, 1), 0.0f, 360.0f, C(S(1500, 0, nya.d, 2), null, 0L, 6), "DownloadStatusIcon_RotationAnimation", oq5Var2, 29112, 0);
                String M = rvf.M(R.string.downloading_description, oq5Var2);
                yci m = androidx.compose.foundation.layout.a.m(d.m(yciVar, 16), 1);
                boolean f2 = oq5Var2.f(M);
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (f2 || K == kjnVar) {
                    K = new wq(M, 23);
                    oq5Var2.k0(K);
                }
                yci b2 = nfp.b(m, false, (Function1) K);
                boolean f3 = oq5Var2.f(s);
                Object K2 = oq5Var2.K();
                if (f3 || K2 == kjnVar) {
                    K2 = new xp(s, i2);
                    oq5Var2.k0(K2);
                }
                ocg.g(0.5f, androidx.compose.ui.graphics.a.a(b2, (Function1) K2), 0.0f, oq5Var2, 6, 4);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            } else {
                if (ordinal != 2) {
                    throw vz1.i(oq5Var2, 1931804811, false);
                }
                oq5Var2.Z(-242633148);
                irf.r(a0g.E(R.drawable.ic_downloaded_16, 0, oq5Var2), rvf.M(R.string.downloaded_description, oq5Var2), yciVar, null, null, 0.0f, new d43(((dq0) oq5Var2.j(eq0.a)).a.f, 5), oq5Var2, (i3 << 3) & 896, 56);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(rbaVar, yciVar, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final bdn bdnVar, evo evoVar, final pv9 pv9Var, final v84 v84Var, final Function0 function0, final Function0 function02, final Function1 function1, final Function1 function12, yci yciVar, hq5 hq5Var, final int i, final int i2) {
        yci yciVar2;
        evo evoVar2;
        final yci yciVar3;
        xmn r;
        String str;
        boolean z;
        long j;
        int i3;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        boolean z5;
        bdnVar.getClass();
        evoVar.getClass();
        pv9Var.getClass();
        v84Var.getClass();
        function0.getClass();
        function02.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-567870143);
        int i4 = (oq5Var.f(bdnVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= oq5Var.d(evoVar.ordinal()) ? 32 : 16;
        }
        int i5 = i4 | (oq5Var.f(pv9Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= oq5Var.d(v84Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i5 |= oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i5 |= oq5Var.h(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= oq5Var.h(function12) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i6 = i2 & 256;
        if (i6 != 0) {
            i5 |= 100663296;
        } else if ((100663296 & i) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 67108864 : 33554432;
            if (oq5Var.P(i5 & 1, (38347923 & i5) == 38347922)) {
                evoVar2 = evoVar;
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                vci vciVar = vci.a;
                yci yciVar4 = i6 != 0 ? vciVar : yciVar2;
                ild ildVar = bdnVar.c;
                yci yciVar5 = null;
                q84 q84Var = ildVar instanceof q84 ? (q84) ildVar : null;
                boolean z6 = q84Var != null && q84Var.m;
                yci d2 = d.d(yciVar4, 1.0f);
                kfh d3 = ug3.d(b2c.f, false);
                int i7 = oq5Var.P;
                int i8 = i5;
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
                g0g.U(oq5Var, d3, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(oq5Var, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                iz2 iz2Var = b2c.e;
                b bVar = b.a;
                yci yciVar6 = yciVar4;
                aae.a(function0, androidx.compose.ui.platform.a.a(bVar.a(vciVar, iz2Var), "collapse_button"), false, fgq.b, oq5Var, ((i8 >> 12) & 14) | 24576, 12);
                float f2 = 48;
                yci o = androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), f2 + (v84Var == v84.c ? 0 : f2), 0.0f, 2);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new mvd(0);
                    oq5Var.k0(K);
                }
                yci b2 = nfp.b(o, true, (Function1) K);
                Uri uri = bdnVar.e;
                if (uri == null) {
                    oq5Var.Z(16481856);
                } else {
                    oq5Var.Z(16481857);
                    yci u = xp3.u(vciVar, ugo.a(4));
                    boolean h2 = ((i8 & 3670016) == 1048576) | oq5Var.h(uri);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == kjnVar) {
                        K2 = new zya(14, function1, uri);
                        oq5Var.k0(K2);
                    }
                    yciVar5 = androidx.compose.foundation.a.e(u, false, null, null, (Function0) K2, 7);
                }
                oq5Var.p(false);
                yci f3 = b2.f(yciVar5 == null ? vciVar : yciVar5);
                ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
                int i9 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, f3);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var, i9, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                String str2 = bdnVar.a;
                if (str2 == null) {
                    oq5Var.Z(-420516534);
                    oq5Var.p(false);
                    z2 = false;
                    i3 = 10;
                } else {
                    oq5Var.Z(-420516533);
                    yci a3 = androidx.compose.ui.platform.a.a(z6 ? wdg.V(vciVar, 10, 20) : vciVar, "context_title");
                    ges i10 = nu0.i();
                    if (z6) {
                        oq5Var.Z(750769962);
                        str = str2;
                        j = ((dq0) oq5Var.j(eq0.a)).b.a;
                        z = false;
                    } else {
                        str = str2;
                        z = false;
                        oq5Var.Z(750771020);
                        j = ((dq0) oq5Var.j(eq0.a)).b.b;
                    }
                    oq5Var.p(z);
                    long j3 = j;
                    i3 = 10;
                    xcs.b(str, a3, j3, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, i10, oq5Var, 0, 3120, 54776);
                    oq5Var = oq5Var;
                    z2 = false;
                    oq5Var.p(false);
                }
                String str3 = bdnVar.b;
                if (str3 == null) {
                    oq5Var.Z(-419926294);
                } else {
                    oq5Var.Z(-419926293);
                    yci a4 = androidx.compose.ui.platform.a.a(z6 ? vciVar : wdg.V(vciVar, i3, 20), "context_subtitle");
                    ges i11 = nu0.i();
                    if (z6) {
                        oq5Var.Z(-1978155086);
                        j2 = ((dq0) oq5Var.j(eq0.a)).b.d;
                        z3 = false;
                    } else {
                        z3 = false;
                        oq5Var.Z(-1978154061);
                        j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    }
                    oq5Var.p(z3);
                    oq5 oq5Var2 = oq5Var;
                    xcs.b(str3, a4, j2, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 1, 0, null, i11, oq5Var2, 0, 3120, 54776);
                    oq5Var = oq5Var2;
                    z2 = false;
                }
                oq5Var.p(z2);
                oq5Var.p(true);
                yci a5 = bVar.a(vciVar, b2c.g);
                nho a6 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                int i12 = oq5Var.P;
                a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, a5);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a6, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i12))) {
                    ouj.x(i12, oq5Var, i12, kb5Var3);
                }
                g0g.U(oq5Var, H3, kb5Var4);
                if (ildVar instanceof q84) {
                    oq5Var.Z(890927619);
                    q84 q84Var2 = (q84) ildVar;
                    oq5 oq5Var3 = oq5Var;
                    lxe.b(function12, q84Var2, v84Var, pv9Var, com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(vciVar, "cast_picker_button"), "is_casting", Boolean.valueOf(q84Var2.m)), oq5Var3, ((i8 >> 21) & 14) | ((i8 >> 3) & 896) | ((i8 << 3) & 7168));
                    oq5Var = oq5Var3;
                    z4 = false;
                } else {
                    z4 = false;
                    oq5Var.Z(886166763);
                }
                oq5Var.p(z4);
                if (bdnVar.d) {
                    oq5Var.Z(891403996);
                    evoVar2 = evoVar;
                    aae.a(function02, null, false, ild.C(800075113, new nha(15, evoVar2), oq5Var), oq5Var, ((i8 >> 15) & 14) | 24576, 14);
                    z5 = false;
                } else {
                    evoVar2 = evoVar;
                    z5 = false;
                    oq5Var.Z(886166763);
                }
                oq5Var.p(z5);
                oq5Var.p(true);
                oq5Var.p(true);
                yciVar3 = yciVar6;
            }
            r = oq5Var.r();
            if (r == null) {
                final evo evoVar3 = evoVar2;
                r.d = new Function2() { // from class: nvd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        weo.e(bdn.this, evoVar3, pv9Var, v84Var, function0, function02, function1, function12, yciVar3, (hq5) obj, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i5 & 1, (38347923 & i5) == 38347922)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(yci yciVar, fvf fvfVar, o0k o0kVar, ox0 ox0Var, gz2 gz2Var, jic jicVar, boolean z, qg0 qg0Var, Function1 function1, hq5 hq5Var, int i, int i2) {
        int i3;
        fvf fvfVar2;
        o0k o0kVar2;
        ox0 ox0Var2;
        int i4;
        gz2 gz2Var2;
        jic jicVar2;
        int i5;
        boolean z2;
        qg0 qg0Var2;
        int i6;
        oq5 oq5Var;
        yci yciVar2;
        fvf fvfVar3;
        o0k o0kVar3;
        ox0 ox0Var3;
        gz2 gz2Var3;
        jic jicVar3;
        boolean z3;
        xmn r;
        int i7;
        int i8;
        o0k o0kVar4;
        o0k o0kVar5;
        ox0 ox0Var4;
        qg0 qg0Var3;
        gz2 gz2Var4;
        jic jicVar4;
        boolean z4;
        yci yciVar3;
        int i9;
        int i10;
        int i11;
        int i12;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(53695811);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                fvfVar2 = fvfVar;
                if (oq5Var2.f(fvfVar2)) {
                    i12 = 32;
                    i3 |= i12;
                }
            } else {
                fvfVar2 = fvfVar;
            }
            i12 = 16;
            i3 |= i12;
        } else {
            fvfVar2 = fvfVar;
        }
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            o0kVar2 = o0kVar;
            i3 |= oq5Var2.f(o0kVar2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= oq5Var2.g(false) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    ox0Var2 = ox0Var;
                    if (oq5Var2.f(ox0Var2)) {
                        i11 = 16384;
                        i3 |= i11;
                    }
                } else {
                    ox0Var2 = ox0Var;
                }
                i11 = RemoteCameraConfig.Notification.ID;
                i3 |= i11;
            } else {
                ox0Var2 = ox0Var;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                gz2Var2 = gz2Var;
                i3 |= oq5Var2.f(gz2Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jicVar2 = jicVar;
                        if (oq5Var2.f(jicVar2)) {
                            i10 = 1048576;
                            i3 |= i10;
                        }
                    } else {
                        jicVar2 = jicVar;
                    }
                    i10 = 524288;
                    i3 |= i10;
                } else {
                    jicVar2 = jicVar;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    i3 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    i3 |= oq5Var2.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    if ((i & 100663296) != 0) {
                        if ((i2 & 256) == 0) {
                            qg0Var2 = qg0Var;
                            if (oq5Var2.f(qg0Var2)) {
                                i9 = 67108864;
                                i3 |= i9;
                            }
                        } else {
                            qg0Var2 = qg0Var;
                        }
                        i9 = 33554432;
                        i3 |= i9;
                    } else {
                        qg0Var2 = qg0Var;
                    }
                    if ((i & 805306368) != 0) {
                        i6 = i13;
                        i3 |= oq5Var2.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    } else {
                        i6 = i13;
                    }
                    if (oq5Var2.P(i3 & 1, (i3 & 306783379) == 306783378)) {
                        oq5Var = oq5Var2;
                        oq5Var.S();
                        yciVar2 = yciVar;
                        fvfVar3 = fvfVar2;
                        o0kVar3 = o0kVar2;
                        ox0Var3 = ox0Var2;
                        gz2Var3 = gz2Var2;
                        jicVar3 = jicVar2;
                        z3 = z2;
                    } else {
                        oq5Var2.U();
                        if ((i & 1) == 0 || oq5Var2.y()) {
                            yci yciVar4 = i6 != 0 ? vci.a : yciVar;
                            if ((i2 & 2) != 0) {
                                i7 = -234881025;
                                i8 = 0;
                                fvfVar2 = hvf.a(0, 0, oq5Var2, 0, 3);
                                i3 &= -113;
                            } else {
                                i7 = -234881025;
                                i8 = 0;
                            }
                            if (i14 != 0) {
                                float f2 = i8;
                                o0kVar4 = new q0k(f2, f2, f2, f2);
                            } else {
                                o0kVar4 = o0kVar2;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                                ox0Var2 = qx0.c;
                            }
                            if (i4 != 0) {
                                gz2Var2 = b2c.n;
                            }
                            if ((i2 & 64) != 0) {
                                uf7 a2 = m8r.a(oq5Var2);
                                boolean f3 = oq5Var2.f(a2);
                                Object K = oq5Var2.K();
                                if (f3 || K == gq5.a) {
                                    K = new om7(a2);
                                    oq5Var2.k0(K);
                                }
                                i3 &= -3670017;
                                jicVar2 = (om7) K;
                            }
                            if (i5 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= i7;
                                qg0Var3 = lzj.a(oq5Var2);
                                o0kVar5 = o0kVar4;
                                ox0Var4 = ox0Var2;
                            } else {
                                o0kVar5 = o0kVar4;
                                ox0Var4 = ox0Var2;
                                qg0Var3 = qg0Var2;
                            }
                            gz2Var4 = gz2Var2;
                            jicVar4 = jicVar2;
                            z4 = z2;
                            yciVar3 = yciVar4;
                        } else {
                            oq5Var2.S();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            o0kVar5 = o0kVar2;
                            ox0Var4 = ox0Var2;
                            qg0Var3 = qg0Var2;
                            gz2Var4 = gz2Var2;
                            jicVar4 = jicVar2;
                            z4 = z2;
                            yciVar3 = yciVar;
                        }
                        fvf fvfVar4 = fvfVar2;
                        oq5Var2.q();
                        int i15 = i3 >> 3;
                        oq5Var = oq5Var2;
                        bcx.l(yciVar3, fvfVar4, o0kVar5, false, true, jicVar4, z4, qg0Var3, gz2Var4, ox0Var4, null, null, function1, oq5Var, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i15) | (3670016 & i15) | (i15 & 29360128) | ((i3 << 12) & 1879048192), ((i3 >> 12) & 14) | ((i3 >> 18) & 7168), 6400);
                        yciVar2 = yciVar3;
                        fvfVar3 = fvfVar4;
                        o0kVar3 = o0kVar5;
                        jicVar3 = jicVar4;
                        z3 = z4;
                        qg0Var2 = qg0Var3;
                        gz2Var3 = gz2Var4;
                        ox0Var3 = ox0Var4;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new urf(yciVar2, fvfVar3, o0kVar3, ox0Var3, gz2Var3, jicVar3, z3, qg0Var2, function1, i, i2);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i & 100663296) != 0) {
                }
                if ((i & 805306368) != 0) {
                }
                if (oq5Var2.P(i3 & 1, (i3 & 306783379) == 306783378)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            gz2Var2 = gz2Var;
            if ((1572864 & i) == 0) {
            }
            i5 = i2 & 128;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i & 100663296) != 0) {
            }
            if ((i & 805306368) != 0) {
            }
            if (oq5Var2.P(i3 & 1, (i3 & 306783379) == 306783378)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        o0kVar2 = o0kVar;
        if ((i2 & 8) == 0) {
        }
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        gz2Var2 = gz2Var;
        if ((1572864 & i) == 0) {
        }
        i5 = i2 & 128;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) != 0) {
        }
        if (oq5Var2.P(i3 & 1, (i3 & 306783379) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(yci yciVar, fvf fvfVar, o0k o0kVar, ox0 ox0Var, gz2 gz2Var, jic jicVar, boolean z, Function1 function1, hq5 hq5Var, int i, int i2) {
        int i3;
        fvf fvfVar2;
        o0k o0kVar2;
        int i4;
        ox0 ox0Var2;
        int i5;
        gz2 gz2Var2;
        jic jicVar2;
        int i6;
        boolean z2;
        int i7;
        oq5 oq5Var;
        yci yciVar2;
        fvf fvfVar3;
        o0k o0kVar3;
        ox0 ox0Var3;
        gz2 gz2Var3;
        jic jicVar3;
        boolean z3;
        xmn r;
        o0k o0kVar4;
        int i8;
        o0k o0kVar5;
        gz2 gz2Var4;
        jic jicVar4;
        yci yciVar3;
        ox0 ox0Var4;
        fvf fvfVar4;
        int i9;
        int i10;
        int i11;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-740714857);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                fvfVar2 = fvfVar;
                if (oq5Var2.f(fvfVar2)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                fvfVar2 = fvfVar;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            fvfVar2 = fvfVar;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            o0kVar2 = o0kVar;
            i3 |= oq5Var2.f(o0kVar2) ? 256 : 128;
            i4 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    ox0Var2 = ox0Var;
                    if (oq5Var2.f(ox0Var2)) {
                        i10 = 16384;
                        i4 |= i10;
                    }
                } else {
                    ox0Var2 = ox0Var;
                }
                i10 = RemoteCameraConfig.Notification.ID;
                i4 |= i10;
            } else {
                ox0Var2 = ox0Var;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i) == 0) {
                gz2Var2 = gz2Var;
                i4 |= oq5Var2.f(gz2Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        jicVar2 = jicVar;
                        if (oq5Var2.f(jicVar2)) {
                            i9 = 1048576;
                            i4 |= i9;
                        }
                    } else {
                        jicVar2 = jicVar;
                    }
                    i9 = 524288;
                    i4 |= i9;
                } else {
                    jicVar2 = jicVar;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    i4 |= oq5Var2.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    if ((100663296 & i) == 0) {
                        i4 |= oq5Var2.h(function1) ? 67108864 : 33554432;
                    }
                    i7 = i4;
                    boolean z4 = true;
                    if (oq5Var2.P(i7 & 1, (i4 & 38347923) == 38347922)) {
                        oq5Var = oq5Var2;
                        oq5Var.S();
                        yciVar2 = yciVar;
                        fvfVar3 = fvfVar2;
                        o0kVar3 = o0kVar2;
                        ox0Var3 = ox0Var2;
                        gz2Var3 = gz2Var2;
                        jicVar3 = jicVar2;
                        z3 = z2;
                    } else {
                        oq5Var2.U();
                        if ((i & 1) == 0 || oq5Var2.y()) {
                            yci yciVar4 = i12 != 0 ? vci.a : yciVar;
                            if ((i2 & 2) != 0) {
                                fvfVar2 = hvf.a(0, 0, oq5Var2, 0, 3);
                                i7 &= -113;
                            }
                            if (i13 != 0) {
                                float f2 = 0;
                                o0kVar4 = new q0k(f2, f2, f2, f2);
                            } else {
                                o0kVar4 = o0kVar2;
                            }
                            if ((i2 & 16) != 0) {
                                i7 &= -57345;
                                ox0Var2 = qx0.c;
                            }
                            if (i5 != 0) {
                                gz2Var2 = b2c.n;
                            }
                            if ((i2 & 64) != 0) {
                                uf7 a2 = m8r.a(oq5Var2);
                                boolean f3 = oq5Var2.f(a2);
                                Object K = oq5Var2.K();
                                if (f3 || K == gq5.a) {
                                    K = new om7(a2);
                                    oq5Var2.k0(K);
                                }
                                jicVar2 = (om7) K;
                                i8 = i7 & (-3670017);
                            } else {
                                i8 = i7;
                            }
                            if (i6 != 0) {
                                o0kVar5 = o0kVar4;
                                ox0Var4 = ox0Var2;
                                gz2Var4 = gz2Var2;
                                jicVar4 = jicVar2;
                                yciVar3 = yciVar4;
                                fvfVar4 = fvfVar2;
                                oq5Var2.q();
                                oq5Var = oq5Var2;
                                f(yciVar3, fvfVar4, o0kVar5, ox0Var4, gz2Var4, jicVar4, z4, lzj.a(oq5Var2), function1, oq5Var, (33554430 & i8) | ((i8 << 3) & 1879048192), 0);
                                yciVar2 = yciVar3;
                                fvfVar3 = fvfVar4;
                                o0kVar3 = o0kVar5;
                                ox0Var3 = ox0Var4;
                                gz2Var3 = gz2Var4;
                                jicVar3 = jicVar4;
                                z3 = z4;
                            } else {
                                o0kVar5 = o0kVar4;
                                gz2Var4 = gz2Var2;
                                jicVar4 = jicVar2;
                                z4 = z2;
                                yciVar3 = yciVar4;
                            }
                        } else {
                            oq5Var2.S();
                            i8 = (i2 & 2) != 0 ? i7 & (-113) : i7;
                            if ((i2 & 16) != 0) {
                                i8 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i8 &= -3670017;
                            }
                            o0kVar5 = o0kVar2;
                            gz2Var4 = gz2Var2;
                            jicVar4 = jicVar2;
                            z4 = z2;
                            yciVar3 = yciVar;
                        }
                        fvfVar4 = fvfVar2;
                        ox0Var4 = ox0Var2;
                        oq5Var2.q();
                        oq5Var = oq5Var2;
                        f(yciVar3, fvfVar4, o0kVar5, ox0Var4, gz2Var4, jicVar4, z4, lzj.a(oq5Var2), function1, oq5Var, (33554430 & i8) | ((i8 << 3) & 1879048192), 0);
                        yciVar2 = yciVar3;
                        fvfVar3 = fvfVar4;
                        o0kVar3 = o0kVar5;
                        ox0Var3 = ox0Var4;
                        gz2Var3 = gz2Var4;
                        jicVar3 = jicVar4;
                        z3 = z4;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new hl3(yciVar2, fvfVar3, o0kVar3, ox0Var3, gz2Var3, jicVar3, z3, function1, i, i2, 2);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((100663296 & i) == 0) {
                }
                i7 = i4;
                boolean z42 = true;
                if (oq5Var2.P(i7 & 1, (i4 & 38347923) == 38347922)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            gz2Var2 = gz2Var;
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            z2 = z;
            if ((100663296 & i) == 0) {
            }
            i7 = i4;
            boolean z422 = true;
            if (oq5Var2.P(i7 & 1, (i4 & 38347923) == 38347922)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        o0kVar2 = o0kVar;
        i4 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        gz2Var2 = gz2Var;
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        z2 = z;
        if ((100663296 & i) == 0) {
        }
        i7 = i4;
        boolean z4222 = true;
        if (oq5Var2.P(i7 & 1, (i4 & 38347923) == 38347922)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(yci yciVar, fvf fvfVar, o0k o0kVar, mx0 mx0Var, hz2 hz2Var, jic jicVar, boolean z, Function1 function1, hq5 hq5Var, int i, int i2) {
        int i3;
        fvf fvfVar2;
        o0k o0kVar2;
        int i4;
        mx0 mx0Var2;
        int i5;
        hz2 hz2Var2;
        int i6;
        boolean z2;
        oq5 oq5Var;
        yci yciVar2;
        fvf fvfVar3;
        o0k o0kVar3;
        mx0 mx0Var3;
        hz2 hz2Var3;
        boolean z3;
        jic jicVar2;
        xmn r;
        o0k o0kVar4;
        jic jicVar3;
        fvf fvfVar4;
        hz2 hz2Var4;
        boolean z4;
        int i7;
        yci yciVar3;
        int i8;
        o0k o0kVar5;
        mx0 mx0Var4;
        int i9;
        int i10;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1724297413);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                fvfVar2 = fvfVar;
                if (oq5Var2.f(fvfVar2)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                fvfVar2 = fvfVar;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            fvfVar2 = fvfVar;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            o0kVar2 = o0kVar;
            i3 |= oq5Var2.f(o0kVar2) ? 256 : 128;
            i4 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    mx0Var2 = mx0Var;
                    if (oq5Var2.f(mx0Var2)) {
                        i9 = 16384;
                        i4 |= i9;
                    }
                } else {
                    mx0Var2 = mx0Var;
                }
                i9 = RemoteCameraConfig.Notification.ID;
                i4 |= i9;
            } else {
                mx0Var2 = mx0Var;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i) == 0) {
                hz2Var2 = hz2Var;
                i4 |= oq5Var2.f(hz2Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                if ((1572864 & i) == 0) {
                    i4 |= 524288;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    i4 |= oq5Var2.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    if ((100663296 & i) == 0) {
                        i4 |= oq5Var2.h(function1) ? 67108864 : 33554432;
                    }
                    if (oq5Var2.P(i4 & 1, (38347923 & i4) == 38347922)) {
                        oq5Var = oq5Var2;
                        oq5Var.S();
                        yciVar2 = yciVar;
                        fvfVar3 = fvfVar2;
                        o0kVar3 = o0kVar2;
                        mx0Var3 = mx0Var2;
                        hz2Var3 = hz2Var2;
                        z3 = z2;
                        jicVar2 = jicVar;
                    } else {
                        oq5Var2.U();
                        if ((i & 1) == 0 || oq5Var2.y()) {
                            yci yciVar4 = i11 != 0 ? vci.a : yciVar;
                            if ((i2 & 2) != 0) {
                                fvfVar2 = hvf.a(0, 0, oq5Var2, 0, 3);
                                i4 &= -113;
                            }
                            if (i12 != 0) {
                                float f2 = 0;
                                o0kVar4 = new q0k(f2, f2, f2, f2);
                            } else {
                                o0kVar4 = o0kVar2;
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                                mx0Var2 = qx0.a;
                            }
                            if (i5 != 0) {
                                hz2Var2 = b2c.k;
                            }
                            uf7 a2 = m8r.a(oq5Var2);
                            boolean f3 = oq5Var2.f(a2);
                            Object K = oq5Var2.K();
                            if (f3 || K == gq5.a) {
                                K = new om7(a2);
                                oq5Var2.k0(K);
                            }
                            int i13 = i4 & (-3670017);
                            jicVar3 = (om7) K;
                            if (i6 != 0) {
                                fvfVar4 = fvfVar2;
                                o0kVar5 = o0kVar4;
                                i7 = 3;
                                z4 = true;
                                mx0Var4 = mx0Var2;
                                hz2Var4 = hz2Var2;
                                yciVar3 = yciVar4;
                                i8 = i13;
                                oq5Var2.q();
                                oq5Var = oq5Var2;
                                i(yciVar3, fvfVar4, o0kVar5, false, mx0Var4, hz2Var4, jicVar3, z4, lzj.a(oq5Var2), function1, oq5Var, (33554430 & i8) | ((i8 << i7) & 1879048192), 0);
                                yciVar2 = yciVar3;
                                fvfVar3 = fvfVar4;
                                o0kVar3 = o0kVar5;
                                mx0Var3 = mx0Var4;
                                hz2Var3 = hz2Var4;
                                jicVar2 = jicVar3;
                                z3 = z4;
                            } else {
                                fvfVar4 = fvfVar2;
                                hz2Var4 = hz2Var2;
                                z4 = z2;
                                i7 = 3;
                                yciVar3 = yciVar4;
                                i8 = i13;
                                o0kVar5 = o0kVar4;
                            }
                        } else {
                            oq5Var2.S();
                            if ((i2 & 2) != 0) {
                                i4 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                            }
                            i8 = i4 & (-3670017);
                            jicVar3 = jicVar;
                            fvfVar4 = fvfVar2;
                            hz2Var4 = hz2Var2;
                            z4 = z2;
                            i7 = 3;
                            yciVar3 = yciVar;
                            o0kVar5 = o0kVar2;
                        }
                        mx0Var4 = mx0Var2;
                        oq5Var2.q();
                        oq5Var = oq5Var2;
                        i(yciVar3, fvfVar4, o0kVar5, false, mx0Var4, hz2Var4, jicVar3, z4, lzj.a(oq5Var2), function1, oq5Var, (33554430 & i8) | ((i8 << i7) & 1879048192), 0);
                        yciVar2 = yciVar3;
                        fvfVar3 = fvfVar4;
                        o0kVar3 = o0kVar5;
                        mx0Var3 = mx0Var4;
                        hz2Var3 = hz2Var4;
                        jicVar2 = jicVar3;
                        z3 = z4;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new hl3(yciVar2, fvfVar3, o0kVar3, mx0Var3, hz2Var3, jicVar2, z3, function1, i, i2, 3);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((100663296 & i) == 0) {
                }
                if (oq5Var2.P(i4 & 1, (38347923 & i4) == 38347922)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            hz2Var2 = hz2Var;
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            z2 = z;
            if ((100663296 & i) == 0) {
            }
            if (oq5Var2.P(i4 & 1, (38347923 & i4) == 38347922)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        o0kVar2 = o0kVar;
        i4 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        hz2Var2 = hz2Var;
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        z2 = z;
        if ((100663296 & i) == 0) {
        }
        if (oq5Var2.P(i4 & 1, (38347923 & i4) == 38347922)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(yci yciVar, fvf fvfVar, o0k o0kVar, boolean z, mx0 mx0Var, hz2 hz2Var, jic jicVar, boolean z2, qg0 qg0Var, Function1 function1, hq5 hq5Var, int i, int i2) {
        int i3;
        fvf fvfVar2;
        o0k o0kVar2;
        int i4;
        boolean z3;
        mx0 mx0Var2;
        int i5;
        hz2 hz2Var2;
        jic jicVar2;
        int i6;
        int i7;
        int i8;
        oq5 oq5Var;
        yci yciVar2;
        fvf fvfVar3;
        o0k o0kVar3;
        boolean z4;
        mx0 mx0Var3;
        hz2 hz2Var3;
        jic jicVar3;
        boolean z5;
        qg0 qg0Var2;
        xmn r;
        mx0 mx0Var4;
        jic jicVar4;
        int i9;
        qg0 qg0Var3;
        yci yciVar3;
        boolean z6;
        fvf fvfVar4;
        mx0 mx0Var5;
        o0k o0kVar4;
        hz2 hz2Var4;
        jic jicVar5;
        int i10;
        boolean z7;
        int i11;
        int i12;
        int i13;
        int i14;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1884325601);
        int i15 = i2 & 1;
        if (i15 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var2.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                fvfVar2 = fvfVar;
                if (oq5Var2.f(fvfVar2)) {
                    i14 = 32;
                    i3 |= i14;
                }
            } else {
                fvfVar2 = fvfVar;
            }
            i14 = 16;
            i3 |= i14;
        } else {
            fvfVar2 = fvfVar;
        }
        int i16 = i2 & 4;
        if (i16 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            o0kVar2 = o0kVar;
            i3 |= oq5Var2.f(o0kVar2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= oq5Var2.g(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        mx0Var2 = mx0Var;
                        if (oq5Var2.f(mx0Var2)) {
                            i13 = 16384;
                            i3 |= i13;
                        }
                    } else {
                        mx0Var2 = mx0Var;
                    }
                    i13 = RemoteCameraConfig.Notification.ID;
                    i3 |= i13;
                } else {
                    mx0Var2 = mx0Var;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    hz2Var2 = hz2Var;
                    i3 |= oq5Var2.f(hz2Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            jicVar2 = jicVar;
                            if (oq5Var2.f(jicVar2)) {
                                i12 = 1048576;
                                i3 |= i12;
                            }
                        } else {
                            jicVar2 = jicVar;
                        }
                        i12 = 524288;
                        i3 |= i12;
                    } else {
                        jicVar2 = jicVar;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                        i7 = i15;
                    } else {
                        i7 = i15;
                        if ((i & 12582912) == 0) {
                            i3 |= oq5Var2.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                        }
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0 && oq5Var2.f(qg0Var)) {
                            i11 = 67108864;
                            i3 |= i11;
                        }
                        i11 = 33554432;
                        i3 |= i11;
                    }
                    if ((i & 805306368) == 0) {
                        i3 |= oq5Var2.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                    }
                    i8 = i3;
                    if (oq5Var2.P(i8 & 1, (i3 & 306783379) == 306783378)) {
                        oq5Var = oq5Var2;
                        oq5Var.S();
                        yciVar2 = yciVar;
                        fvfVar3 = fvfVar2;
                        o0kVar3 = o0kVar2;
                        z4 = z3;
                        mx0Var3 = mx0Var2;
                        hz2Var3 = hz2Var2;
                        jicVar3 = jicVar2;
                        z5 = z2;
                        qg0Var2 = qg0Var;
                    } else {
                        oq5Var2.U();
                        if ((i & 1) == 0 || oq5Var2.y()) {
                            yci yciVar4 = i7 != 0 ? vci.a : yciVar;
                            if ((i2 & 2) != 0) {
                                fvfVar2 = hvf.a(0, 0, oq5Var2, 0, 3);
                                i8 &= -113;
                            }
                            if (i16 != 0) {
                                float f2 = 0;
                                o0kVar2 = new q0k(f2, f2, f2, f2);
                            }
                            boolean z8 = i4 == 0 ? z3 : false;
                            if ((i2 & 16) != 0) {
                                mx0Var4 = !z8 ? qx0.a : qx0.b;
                                i8 &= -57345;
                            } else {
                                mx0Var4 = mx0Var2;
                            }
                            hz2 hz2Var5 = i5 != 0 ? b2c.k : hz2Var2;
                            if ((i2 & 64) != 0) {
                                uf7 a2 = m8r.a(oq5Var2);
                                boolean f3 = oq5Var2.f(a2);
                                Object K = oq5Var2.K();
                                if (f3 || K == gq5.a) {
                                    K = new om7(a2);
                                    oq5Var2.k0(K);
                                }
                                jicVar4 = (om7) K;
                                i9 = i8 & (-3670017);
                            } else {
                                jicVar4 = jicVar2;
                                i9 = i8;
                            }
                            boolean z9 = i6 == 0 ? z2 : true;
                            if ((i2 & 256) != 0) {
                                yciVar3 = yciVar4;
                                z6 = z8;
                                fvfVar4 = fvfVar2;
                                mx0Var5 = mx0Var4;
                                o0kVar4 = o0kVar2;
                                hz2Var4 = hz2Var5;
                                jicVar5 = jicVar4;
                                qg0Var3 = lzj.a(oq5Var2);
                                z7 = z9;
                                i10 = (-234881025) & i9;
                            } else {
                                qg0Var3 = qg0Var;
                                yciVar3 = yciVar4;
                                z6 = z8;
                                fvfVar4 = fvfVar2;
                                mx0Var5 = mx0Var4;
                                o0kVar4 = o0kVar2;
                                hz2Var4 = hz2Var5;
                                jicVar5 = jicVar4;
                                i10 = i9;
                                z7 = z9;
                            }
                        } else {
                            oq5Var2.S();
                            i10 = (i2 & 2) != 0 ? i8 & (-113) : i8;
                            if ((i2 & 16) != 0) {
                                i10 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i10 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i10 &= -234881025;
                            }
                            z7 = z2;
                            qg0Var3 = qg0Var;
                            o0kVar4 = o0kVar2;
                            z6 = z3;
                            mx0Var5 = mx0Var2;
                            hz2Var4 = hz2Var2;
                            jicVar5 = jicVar2;
                            yciVar3 = yciVar;
                            fvfVar4 = fvfVar2;
                        }
                        oq5Var2.q();
                        int i17 = i10 >> 3;
                        oq5Var = oq5Var2;
                        bcx.l(yciVar3, fvfVar4, o0kVar4, z6, false, jicVar5, z7, qg0Var3, null, null, hz2Var4, mx0Var5, function1, oq5Var, (i10 & 14) | 24576 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128), ((i10 >> 12) & 112) | ((i10 >> 6) & 896) | ((i10 >> 18) & 7168), 1792);
                        yciVar2 = yciVar3;
                        fvfVar3 = fvfVar4;
                        o0kVar3 = o0kVar4;
                        z4 = z6;
                        jicVar3 = jicVar5;
                        z5 = z7;
                        qg0Var2 = qg0Var3;
                        hz2Var3 = hz2Var4;
                        mx0Var3 = mx0Var5;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new vrf(yciVar2, fvfVar3, o0kVar3, z4, mx0Var3, hz2Var3, jicVar3, z5, qg0Var2, function1, i, i2);
                        return;
                    }
                    return;
                }
                hz2Var2 = hz2Var;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i8 = i3;
                if (oq5Var2.P(i8 & 1, (i3 & 306783379) == 306783378)) {
                }
                r = oq5Var.r();
                if (r == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            hz2Var2 = hz2Var;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i8 = i3;
            if (oq5Var2.P(i8 & 1, (i3 & 306783379) == 306783378)) {
            }
            r = oq5Var.r();
            if (r == null) {
            }
        }
        o0kVar2 = o0kVar;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        hz2Var2 = hz2Var;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i8 = i3;
        if (oq5Var2.P(i8 & 1, (i3 & 306783379) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0051  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(boolean z, boolean z2, hq5 hq5Var, final int i, final int i2) {
        final boolean z3;
        int i3;
        boolean z4;
        final boolean z5;
        xmn r;
        ?? r12;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1979969353);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (oq5Var.g(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z4 = z2;
            i3 |= oq5Var.g(z4) ? 32 : 16;
            if (oq5Var.P(i3 & 1, (i3 & 19) == 18)) {
                oq5Var.S();
                z5 = z4;
            } else {
                boolean z6 = i4 != 0 ? true : z3;
                z5 = i5 != 0 ? true : z4;
                float f2 = 8;
                vci vciVar = vci.a;
                u1g.l(oq5Var, d.e(vciVar, f2));
                nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                int i6 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, vciVar);
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
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                float s = lsq.s(e9g.a);
                b(s, s, xp3.u(vciVar, o5g.E(oq5Var)), oq5Var, 0);
                yci q = androidx.compose.foundation.layout.a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci g2 = vz1.g(1.0f, q, true);
                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i7 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, g2);
                oq5Var.d0();
                boolean z7 = z6;
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
                float f3 = 20;
                m(120, f3, oq5Var, 54);
                if (z5) {
                    oq5Var.Z(54079260);
                    u1g.l(oq5Var, d.e(vciVar, 2));
                    m(80, f3, oq5Var, 54);
                    r12 = 0;
                } else {
                    r12 = 0;
                    oq5Var.Z(50062001);
                }
                oq5Var.p(r12);
                oq5Var.p(true);
                if (z7) {
                    oq5Var.Z(184810050);
                    gae.b(a0g.E(R.drawable.ic_arrow_big_right_24, r12, oq5Var), null, wyf.R(vciVar), ((d85) oq5Var.j(sb6.a)).a, oq5Var, 48, 0);
                } else {
                    oq5Var.Z(180624647);
                }
                oq5Var.p(r12);
                oq5Var.p(true);
                u1g.l(oq5Var, d.e(vciVar, f2));
                z3 = z7;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: q25
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int R = rvf.R(i | 1);
                        weo.j(z3, z5, (hq5) obj, R, i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z4 = z2;
        if (oq5Var.P(i3 & 1, (i3 & 19) == 18)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void k(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1991643401);
        if (oq5Var.P(i & 1, i != 0)) {
            vci vciVar = vci.a;
            yci d2 = d.d(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 12, 1), 1.0f);
            nho a2 = lho.a(qx0.e, b2c.k, oq5Var, 6);
            int i2 = oq5Var.P;
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f2 = 40;
            m(130, f2, oq5Var, 54);
            u1g.l(oq5Var, d.r(vciVar, 4));
            m(170, f2, oq5Var, 54);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t83(i, 13);
        }
    }

    public static o71 l() {
        List h2 = u75.h(b81.Collection, b81.Wave);
        b81 b81Var = (b81) CollectionsKt.Q(h2);
        h2.getClass();
        b81Var.getClass();
        return new o71(b81Var, h2);
    }

    public static final void m(float f2, float f3, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1650678218);
        if (oq5Var.P(i & 1, (i & 19) != 18)) {
            b(f2, f3, xp3.u(vci.a, ugo.a), oq5Var, 54);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hu4(f2, f3, i, 1);
        }
    }

    public static final boolean n(ynn ynnVar, long j) {
        float f2 = ynnVar.a;
        float f3 = ynnVar.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f2 > intBitsToFloat || intBitsToFloat > f3) {
            return false;
        }
        float f4 = ynnVar.b;
        float f5 = ynnVar.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f4 <= intBitsToFloat2 && intBitsToFloat2 <= f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cqc o(Context context) {
        ProviderInfo providerInfo;
        aqc aqcVar;
        ApplicationInfo applicationInfo;
        e3s xl7Var = Build.VERSION.SDK_INT >= 28 ? new xl7(19) : new e3s(19);
        PackageManager packageManager = context.getPackageManager();
        o5g.w(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] P = xl7Var.P(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : P) {
                    arrayList.add(signature.toByteArray());
                }
                aqcVar = new aqc(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (aqcVar != null) {
                return null;
            }
            return new cqc(new bqc(context, aqcVar));
        }
        aqcVar = null;
        if (aqcVar != null) {
        }
    }

    public static void p(String str, String str2, Object... objArr) {
        r8e r8eVar = g;
        String g2 = f1d.g("Glagol", str);
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        r8eVar.e(g2, str2);
    }

    public static void q(String str) {
        if (str.length() <= 4000) {
            p("Conversation", str, new Object[0]);
        } else {
            p("Conversation", str.substring(0, ConversationImpl.INCORRECT_TOKEN), new Object[0]);
            q(str.substring(ConversationImpl.INCORRECT_TOKEN));
        }
    }

    public static void r(String str, String str2, Object... objArr) {
        r8e r8eVar = g;
        String concat = "Glagol".concat(str);
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        r8eVar.a(concat, str2);
    }

    public static void s(String str, Throwable th, String str2, Object... objArr) {
        r8e r8eVar = g;
        String concat = "Glagol".concat(str);
        if (objArr.length > 0) {
            str2 = String.format(str2, objArr);
        }
        r8eVar.E(concat, str2, th);
    }

    public static final String t() {
        return eta.e();
    }

    public static final String u(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        String str = packageInfo != null ? packageInfo.versionName : null;
        return str == null ? "" : str;
    }

    public static void x(Context context) {
        context.getClass();
        if (l83.a() != null) {
            l83.a();
            return;
        }
        l83 l83Var = new l83(context);
        Set set = bp6.a;
        if (!set.contains(l83.class)) {
            try {
                if (!set.contains(l83Var)) {
                    try {
                        phg a2 = phg.a((Context) l83Var.b);
                        a2.getClass();
                        a2.b(l83Var, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        bp6.a(l83Var, th);
                    }
                }
            } catch (Throwable th2) {
                bp6.a(l83.class, th2);
            }
        }
        if (!bp6.a.contains(l83.class)) {
            try {
                l83.c = l83Var;
            } catch (Throwable th3) {
                bp6.a(l83.class, th3);
            }
        }
        l83.a();
    }

    public static final long y(xep xepVar, long j, xdp xdpVar) {
        wof c2;
        long P;
        long j2;
        ogi ogiVar;
        int e2;
        float c3;
        ogi ogiVar2;
        int e3;
        ogi ogiVar3;
        int e4;
        float c4;
        ogi ogiVar4;
        int e5;
        ugi c5 = xepVar.c(xdpVar);
        if (c5 == null) {
            return 9205357640488583168L;
        }
        hep hepVar = c5.c;
        wof wofVar = xepVar.k;
        if (wofVar == null || (c2 = c5.c()) == null) {
            return 9205357640488583168L;
        }
        int i = xdpVar.b;
        cds cdsVar = (cds) hepVar.invoke();
        if (i > (cdsVar == null ? 0 : c5.b(cdsVar))) {
            return 9205357640488583168L;
        }
        enj enjVar = (enj) xepVar.q.getValue();
        enjVar.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (c2.v(wofVar, enjVar.a) >> 32));
        cds cdsVar2 = (cds) hepVar.invoke();
        if (cdsVar2 == null) {
            P = rds.b;
        } else {
            ogi ogiVar5 = cdsVar2.b;
            int b2 = c5.b(cdsVar2);
            if (b2 < 1) {
                P = rds.b;
            } else {
                int e6 = ogiVar5.e(yhn.d(i, 0, b2 - 1));
                P = y5g.P(cdsVar2.e(e6), ogiVar5.d(e6, true));
            }
        }
        if (rds.b(P)) {
            cds cdsVar3 = (cds) hepVar.invoke();
            c3 = (cdsVar3 != null && (e5 = (ogiVar4 = cdsVar3.b).e(i)) < ogiVar4.f) ? ogiVar4.g(e5) : -1.0f;
            j2 = 4294967295L;
        } else {
            j2 = 4294967295L;
            int i2 = (int) (P >> 32);
            cds cdsVar4 = (cds) hepVar.invoke();
            float g2 = (cdsVar4 != null && (e3 = (ogiVar2 = cdsVar4.b).e(i2)) < ogiVar2.f) ? ogiVar2.g(e3) : -1.0f;
            int i3 = ((int) (P & 4294967295L)) - 1;
            cds cdsVar5 = (cds) hepVar.invoke();
            float d2 = (cdsVar5 != null && (e2 = (ogiVar = cdsVar5.b).e(i3)) < ogiVar.f) ? cdsVar5.d(e2) : -1.0f;
            c3 = yhn.c(intBitsToFloat, Math.min(g2, d2), Math.max(g2, d2));
        }
        if (c3 == -1.0f) {
            return 9205357640488583168L;
        }
        if (!hqe.a(j, 0L) && Math.abs(intBitsToFloat - c3) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        cds cdsVar6 = (cds) hepVar.invoke();
        if (cdsVar6 != null && (e4 = (ogiVar3 = cdsVar6.b).e(i)) < ogiVar3.f) {
            float h2 = ogiVar3.h(e4);
            c4 = ((ogiVar3.c(e4) - h2) / 2) + h2;
        } else {
            c4 = -1.0f;
        }
        if (c4 == -1.0f) {
            return 9205357640488583168L;
        }
        return wofVar.v(c2, (Float.floatToRawIntBits(c3) << 32) | (Float.floatToRawIntBits(c4) & j2));
    }

    public static String z(int i, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public float A() {
        if (this instanceof mje) {
            return (float) Math.ceil(((mje) this).i);
        }
        if (this instanceof lje) {
            return (float) Math.ceil(((lje) this).i * 2);
        }
        b6e.s();
        return 0.0f;
    }

    public abstract boolean F();

    public abstract void O(boolean z);

    public abstract void P(boolean z);

    public abstract TransformationMethod V(TransformationMethod transformationMethod);

    public abstract InputFilter[] v(InputFilter[] inputFilterArr);

    public float w() {
        if (this instanceof mje) {
            return (float) Math.ceil(((mje) this).j);
        }
        if (this instanceof lje) {
            return (float) Math.ceil(((lje) this).i * 2);
        }
        b6e.s();
        return 0.0f;
    }
}
