package defpackage;

import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import androidx.core.view.b;
import com.google.firebase.messaging.RemoteMessage;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.items.Direction;
import com.yandex.div2.DivSizeUnit;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.cargo_form.async.impl.data.FormAsyncApi;
import ru.yandex.taxi.plaque.utils.MicroWidgetsUtils$applyBackground$$inlined$doOnNextLayout$1;

/* loaded from: classes10.dex */
public final class wfz implements cv3, vg6, xi40, o0p, dfv, r3t0, bw90, g0a0, c5c0, htl0, zxx0 {
    public static boolean c;
    public final /* synthetic */ int a;
    public static final wfz b = new wfz(0);
    public static final wfz w = new wfz(1);
    public static final wfz x = new wfz(3);
    public static final wfz y = new wfz(4);
    public static final c18 z = new c18(0, new bgc(12));
    public static final wfz A = new wfz(6);
    public static final wfz B = new wfz(7);
    public static final wfz C = new wfz(9);
    public static final wfz D = new wfz(10);
    public static final wfz E = new wfz(11);
    public static final wfz F = new wfz(12);
    public static final wfz G = new wfz(13);
    public static final wfz H = new wfz(17);
    public static final /* synthetic */ wfz I = new wfz(18);
    public static final i690 J = new i690();
    public static final wfz K = new wfz(19);
    public static final wfz L = new wfz(20);
    public static final wfz M = new wfz(21);
    public static final wfz N = new wfz(22);
    public static final wfz O = new wfz(24);
    public static final wfz P = new wfz(25);
    public static final dkq0 Q = new dkq0(0);
    public static final dkq0 R = new dkq0(1);
    public static final dkq0 S = new dkq0(2);
    public static final dkq0 T = new dkq0(3);
    public static final s6v0 U = new s6v0();
    public static final wfz V = new wfz(29);

    public /* synthetic */ wfz(int i) {
        this.a = i;
    }

    public static void a(View view, ofe ofeVar, String str) {
        String str2;
        if (ofeVar != null && (str2 = ofeVar.d) != null) {
            str = str2;
        }
        if (ofeVar == null && str == null) {
            return;
        }
        view.setImportantForAccessibility(ofeVar != null ? ofeVar.a : 0);
        String str3 = ofeVar != null ? ofeVar.b : null;
        String str4 = ofeVar != null ? ofeVar.c : null;
        if (str3 != null && str3.length() != 0) {
            view.setContentDescription(str3);
        }
        if (str4 == null && str == null) {
            return;
        }
        b.p(view, new yqb(str4, 3, str));
    }

    public static void b(View view, g0k g0kVar) {
        d0k d0kVar = g0kVar.a;
        view.setPaddingRelative((int) d0kVar.a, (int) d0kVar.b, (int) d0kVar.c, (int) d0kVar.d);
        view.addOnLayoutChangeListener(new MicroWidgetsUtils$applyBackground$$inlined$doOnNextLayout$1(view, g0kVar.b));
    }

    public static final boolean c(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1890328395:
                return str.equals("scroll_to_item_id");
            case -1789088446:
                return str.equals("set_next_item");
            case -1509135083:
                return str.equals("scroll_backward");
            case -1348467885:
                return str.equals("scroll_forward");
            case -1280379330:
                return str.equals("set_previous_item");
            case -770388272:
                return str.equals("scroll_to_start");
            case -88123690:
                return str.equals("set_current_item");
            case 633820873:
                return str.equals("scroll_to_end");
            case 1099321339:
                return str.equals("scroll_to_position");
            default:
                return false;
        }
    }

    public static final void d(Serializable serializable) {
        if (c) {
            serializable.toString();
        }
    }

    public static void e(ArrayList arrayList, ArrayList arrayList2, int i, tls tlsVar) {
        if (i == arrayList.size()) {
            tlsVar.invoke(a.J0(arrayList2));
            return;
        }
        Iterator it = ((Iterable) arrayList.get(i)).iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
            e(arrayList, arrayList2, i + 1, tlsVar);
            arrayList2.remove(scc.f(arrayList2));
        }
    }

    public static final void f(Exception exc, String str) {
        if (c) {
            String obj = str.toString();
            if (obj == null) {
                obj = "null";
            }
            Log.e("PhotoManager", obj, exc);
        }
    }

    public static final void h(Object obj) {
        if (c) {
            String localizedMessage = obj instanceof Exception ? ((Exception) obj).getLocalizedMessage() : obj != null ? obj.toString() : null;
            if (localizedMessage == null) {
                localizedMessage = "null";
            }
            Log.e("PhotoManager", localizedMessage);
        }
    }

    public static FormAsyncApi i(t0k0 t0k0Var) {
        return (FormAsyncApi) t0k0Var.b(FormAsyncApi.class);
    }

    public static int j(Uri uri) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter == null) {
            return 1;
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public static final boolean k(Uri uri, fpl fplVar, rvo rvoVar) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3 = uri.getQueryParameter("id");
        if (queryParameter3 == null) {
            return false;
        }
        String authority = uri.getAuthority();
        g191 y2 = m501.y(queryParameter3, fplVar, rvoVar, jl40.l(authority, "set_previous_item") ? Direction.PREVIOUS : jl40.l(authority, "set_next_item") ? Direction.NEXT : Direction.NEXT);
        if (y2 == null) {
            return false;
        }
        oj91 oj91Var = (oj91) y2.a;
        String queryParameter4 = uri.getQueryParameter("animated");
        boolean parseBoolean = queryParameter4 != null ? Boolean.parseBoolean(queryParameter4) : true;
        if (authority == null) {
            return false;
        }
        switch (authority.hashCode()) {
            case -1890328395:
                if (!authority.equals("scroll_to_item_id") || (queryParameter = uri.getQueryParameter("item_id")) == null) {
                    return false;
                }
                try {
                    y2.R(queryParameter, parseBoolean);
                    break;
                } catch (RuntimeException e) {
                    Div2View div2View = fplVar instanceof Div2View ? (Div2View) fplVar : null;
                    if (div2View == null) {
                        return false;
                    }
                    div2View.logError(e);
                    return false;
                }
            case -1789088446:
                if (!authority.equals("set_next_item")) {
                    return false;
                }
                y2.E(j(uri), uri.getQueryParameter("overflow"), parseBoolean);
                return true;
            case -1509135083:
                if (!authority.equals("scroll_backward")) {
                    return false;
                }
                y2.Q(-j(uri), uri.getQueryParameter("overflow"), parseBoolean);
                return true;
            case -1348467885:
                if (!authority.equals("scroll_forward")) {
                    return false;
                }
                y2.Q(j(uri), uri.getQueryParameter("overflow"), parseBoolean);
                return true;
            case -1280379330:
                if (!authority.equals("set_previous_item")) {
                    return false;
                }
                y2.E(-j(uri), uri.getQueryParameter("overflow"), parseBoolean);
                return true;
            case -770388272:
                if (!authority.equals("scroll_to_start")) {
                    return false;
                }
                y2.S(0, parseBoolean);
                return true;
            case -88123690:
                if (!authority.equals("set_current_item") || (queryParameter2 = uri.getQueryParameter("item")) == null) {
                    return false;
                }
                try {
                    y2.S(Integer.parseInt(queryParameter2), parseBoolean);
                    break;
                } catch (NumberFormatException unused) {
                    return false;
                }
                break;
            case 633820873:
                if (!authority.equals("scroll_to_end")) {
                    return false;
                }
                oj91Var.j(parseBoolean);
                return true;
            case 1099321339:
                if (!authority.equals("scroll_to_position")) {
                    return false;
                }
                oj91Var.i(j(uri), DivSizeUnit.DP, parseBoolean);
                return true;
            default:
                return false;
        }
        return true;
    }

    public static final void l(Object obj) {
        String str;
        if (c) {
            if (obj == null || (str = obj.toString()) == null) {
                str = "null";
            }
            Log.i("PhotoManager", str);
        }
    }

    public static final void m(Cursor cursor) {
        String j;
        d("The cursor row: " + cursor.getCount());
        cursor.moveToPosition(-1);
        while (cursor.moveToNext()) {
            StringBuilder sb = new StringBuilder();
            int columnIndex = cursor.getColumnIndex("bucket_id");
            if (columnIndex != -1) {
                String string = cursor.getString(columnIndex);
                sb.append("\nid: ");
                sb.append(string);
                sb.append("\n");
            }
            String[] columnNames = cursor.getColumnNames();
            int i = 0;
            while (true) {
                if (i < columnNames.length) {
                    int i2 = i + 1;
                    try {
                        String str = columnNames[i];
                        int columnIndex2 = cursor.getColumnIndex(str);
                        try {
                            j = cursor.getString(columnIndex2);
                        } catch (Exception unused) {
                            j = oyr.j(cursor.getBlob(columnIndex2).length, "blob(", Extension.C_BRAKE);
                        }
                        if (!cvu0.t(str, "bucket_id", true)) {
                            g8e.D(sb, "|--", str, " : ", j);
                            sb.append("\n");
                        }
                        i = i2;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        w511.i(e.getMessage());
                        return;
                    }
                }
            }
            d(sb);
        }
        cursor.moveToPosition(-1);
    }

    public static r330 n(pzr0 pzr0Var) {
        r330 c2 = pzr0Var.c();
        return c2 == null ? qwn.a : c2;
    }

    public static byx o() {
        return new byx(Screen.MULTIORDER, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, k12] */
    public static final int[][] p(List list, String[][] strArr) {
        int[][] iArr;
        int i = 0;
        String[] strArr2 = (String[]) list.toArray(new String[0]);
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArr2[i2];
            if (str.charAt(0) == '`' && g8e.a(1, str) == '`') {
                str = oyr.g(1, 1, str);
            }
            strArr2[i2] = str.toLowerCase(Locale.ROOT);
        }
        int length2 = strArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            int length3 = strArr[i3].length;
            for (int i4 = 0; i4 < length3; i4++) {
                String[] strArr3 = strArr[i3];
                strArr3[i4] = strArr3[i4].toLowerCase(Locale.ROOT);
            }
        }
        SetBuilder setBuilder = new SetBuilder();
        for (String[] strArr4 : strArr) {
            ycc.t(setBuilder, strArr4);
        }
        SetBuilder b2 = setBuilder.b();
        ListBuilder a = rcc.a();
        int length4 = strArr2.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length4) {
            String str2 = strArr2[i5];
            int i7 = i6 + 1;
            if (b2.contains(str2)) {
                a.add(new j12(str2, i6));
            }
            i5++;
            i6 = i7;
        }
        ListBuilder j = a.j();
        int length5 = strArr.length;
        ArrayList arrayList = new ArrayList(length5);
        for (int i8 = 0; i8 < length5; i8++) {
            arrayList.add(new ArrayList());
        }
        int length6 = strArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length6) {
            String[] strArr5 = strArr[i9];
            int i11 = i10 + 1;
            wkb0 wkb0Var = new wkb0(strArr5, arrayList, i10, 2);
            int length7 = strArr5.length;
            int i12 = i;
            int i13 = i12;
            while (i12 < length7) {
                i13 += strArr5[i12].hashCode();
                i12++;
            }
            int length8 = strArr5.length;
            ListIterator listIterator = ((ListBuilder.BuilderSubList) j.subList(i, length8)).listIterator(i);
            int i14 = i;
            while (true) {
                kotlin.collections.builders.a aVar = (kotlin.collections.builders.a) listIterator;
                if (!aVar.hasNext()) {
                    break;
                }
                i14 += ((j12) aVar.next()).a.hashCode();
            }
            int i15 = i;
            while (true) {
                if (i13 == i14) {
                    iArr = null;
                    wkb0Var.invoke(Integer.valueOf(i15), Integer.valueOf(length8), j.subList(i15, length8));
                } else {
                    iArr = null;
                }
                int i16 = i15 + 1;
                int i17 = length8 + 1;
                if (i17 > j.size()) {
                    break;
                }
                i14 = (i14 - ((j12) j.get(i15)).a.hashCode()) + ((j12) j.get(length8)).a.hashCode();
                i15 = i16;
                length8 = i17;
            }
            if (((List) arrayList.get(i10)).isEmpty()) {
                ArrayList arrayList2 = new ArrayList(strArr5.length);
                for (String str3 : strArr5) {
                    ListBuilder a2 = rcc.a();
                    ListIterator listIterator2 = j.listIterator(0);
                    while (true) {
                        qqy qqyVar = (qqy) listIterator2;
                        if (!qqyVar.hasNext()) {
                            break;
                        }
                        j12 j12Var = (j12) qqyVar.next();
                        if (jl40.l(str3, j12Var.a)) {
                            a2.add(Integer.valueOf(j12Var.b));
                        }
                    }
                    ListBuilder j2 = a2.j();
                    if (j2.isEmpty()) {
                        xfo.g(oyr.p("Column ", str3, " not found in result"));
                        return iArr;
                    }
                    arrayList2.add(j2);
                }
                e(arrayList2, new ArrayList(), 0, new g12(i10, 0, arrayList));
            }
            i9++;
            i10 = i11;
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((List) it.next()).isEmpty()) {
                    ny61.r("Failed to find matches for all mappings");
                    return null;
                }
            }
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = k12.w;
        e(arrayList, new ArrayList(), 0, new h12(0, ref$ObjectRef));
        List list2 = ((k12) ref$ObjectRef.element).a;
        ArrayList arrayList3 = new ArrayList(tcc.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(a.I0(((i12) it2.next()).b));
        }
        return (int[][]) arrayList3.toArray(new int[0][]);
    }

    public static lhn q(v9g v9gVar, q4s0 q4s0Var) {
        q4s0Var.getClass();
        ShortcutViewSourceType[] shortcutViewSourceTypeArr = q4s0Var.b;
        ShortcutViewSourceType[] shortcutViewSourceTypeArr2 = (ShortcutViewSourceType[]) Arrays.copyOf(shortcutViewSourceTypeArr, shortcutViewSourceTypeArr.length);
        int d = gw00.d(shortcutViewSourceTypeArr2.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (ShortcutViewSourceType shortcutViewSourceType : shortcutViewSourceTypeArr2) {
            linkedHashMap.put(shortcutViewSourceType, q4s0Var.a.a(v9gVar, shortcutViewSourceType));
        }
        return new lhn(linkedHashMap);
    }

    public static String r(xjp xjpVar) {
        StringBuilder sb = new StringBuilder("Service : FCM\n");
        xjpVar.getClass();
        RemoteMessage remoteMessage = xjpVar.a;
        sb.append("Message id : " + remoteMessage.getMessageId());
        sb.append('\n');
        xjp xjpVar2 = (xjp) xjpVar.b.a;
        vvi0 notification = xjpVar2.a.getNotification();
        String str = notification != null ? notification.a : null;
        vvi0 notification2 = xjpVar2.a.getNotification();
        sb.append("Notification : " + str + "," + (notification2 != null ? notification2.b : null));
        sb.append("\nData : \n");
        for (Map.Entry<String, String> entry : remoteMessage.getData().entrySet()) {
            sb.append("key : " + entry.getKey() + ", value : " + entry.getValue());
            sb.append('\n');
        }
        return sb.toString();
    }

    @Override // defpackage.xi40
    public boolean g(float f) {
        return !(f >= 13.0f && f < 16.5f);
    }

    public String toString() {
        switch (this.a) {
            case 29:
                return "main_tracking_click";
            default:
                return super.toString();
        }
    }
}
