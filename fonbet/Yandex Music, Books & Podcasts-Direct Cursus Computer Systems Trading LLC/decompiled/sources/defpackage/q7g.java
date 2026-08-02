package defpackage;

import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes3.dex */
public abstract class q7g {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;

    public static List B(String str) {
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        if (str.endsWith(StringUtils.COMMA)) {
            str = f1d.d(1, 0, str);
        }
        return str.length() == 0 ? Collections.EMPTY_LIST : StringsKt.d0(str, new String[]{StringUtils.COMMA}, false, 0);
    }

    public static final String D(oq oqVar) {
        oqVar.getClass();
        int i = oqVar.l;
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : oqVar.F.size();
        if (intValue == 0) {
            return "";
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return ((skr) qdcVar.C(I)).b(R.plurals.plural_n_podcast_tracks, intValue, Integer.valueOf(intValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final w9t E(xci xciVar, Object obj) {
        cr crVar;
        if (!xciVar.a.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = xciVar.a.e;
        mpf F = bcx.F(xciVar);
        while (F != null) {
            if ((((xci) F.F.f).d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                while (xciVar2 != null) {
                    if ((xciVar2.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        cw7 cw7Var = xciVar2;
                        ?? r4 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof w9t) {
                                w9t w9tVar = (w9t) cw7Var;
                                if (obj.equals(w9tVar.h())) {
                                    return w9tVar;
                                }
                            } else if ((cw7Var.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar3 = cw7Var.p;
                                int i = 0;
                                cw7Var = cw7Var;
                                r4 = r4;
                                while (xciVar3 != null) {
                                    if ((xciVar3.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            cw7Var = xciVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r4.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r4.d(xciVar3);
                                        }
                                    }
                                    xciVar3 = xciVar3.f;
                                    cw7Var = cw7Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            cw7Var = bcx.p(r4);
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, sv7, w9t] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final w9t F(w9t w9tVar) {
        cr crVar;
        xci xciVar = (xci) w9tVar;
        if (!xciVar.a.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = xciVar.a.e;
        mpf F = bcx.F(w9tVar);
        while (F != null) {
            if ((((xci) F.F.f).d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                while (xciVar2 != null) {
                    if ((xciVar2.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        cw7 cw7Var = xciVar2;
                        ?? r5 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof w9t) {
                                w9t w9tVar2 = (w9t) cw7Var;
                                if (Intrinsics.d(w9tVar.h(), w9tVar2.h()) && w9tVar.getClass() == w9tVar2.getClass()) {
                                    return w9tVar2;
                                }
                            } else if ((cw7Var.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar3 = cw7Var.p;
                                int i = 0;
                                cw7Var = cw7Var;
                                r5 = r5;
                                while (xciVar3 != null) {
                                    if ((xciVar3.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            cw7Var = xciVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r5.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r5.d(xciVar3);
                                        }
                                    }
                                    xciVar3 = xciVar3.f;
                                    cw7Var = cw7Var;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            cw7Var = bcx.p(r5);
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
        return null;
    }

    public static final String G(uow uowVar) {
        uowVar.getClass();
        row rowVar = uowVar.g;
        pow powVar = rowVar instanceof pow ? (pow) rowVar : null;
        if (powVar != null) {
            return powVar.c;
        }
        return null;
    }

    public static final izs I(uow uowVar) {
        izs izsVar;
        uowVar.getClass();
        row rowVar = uowVar.g;
        pow powVar = rowVar instanceof pow ? (pow) rowVar : null;
        return (powVar == null || (izsVar = powVar.a) == null) ? hzs.a : izsVar;
    }

    public static final String J(List list, skr skrVar) {
        int i;
        list.getClass();
        skrVar.getClass();
        k7h k7hVar = (k7h) o8g.E(list).b.getValue();
        if (k7hVar instanceof h9p) {
            i = R.string.wave_header_activity;
        } else if (k7hVar instanceof i9p) {
            i = R.string.dialog_action_radio_album;
        } else if (k7hVar instanceof j9p) {
            i = R.string.dialog_action_radio_artist;
        } else if (k7hVar instanceof k9p) {
            i = R.string.wave_header_epoch;
        } else if (k7hVar instanceof l9p) {
            i = R.string.wave_header_genre;
        } else if (k7hVar instanceof n9p) {
            i = R.string.wave_header_mood;
        } else if (k7hVar instanceof p9p) {
            i = R.string.dialog_action_radio_playlist;
        } else if (k7hVar instanceof q9p) {
            i = R.string.dialog_action_radio_track;
        } else {
            if (k7hVar != null && !k7hVar.equals(r9p.a)) {
                b6e.s();
                return null;
            }
            i = R.string.rup_block_title;
        }
        return skrVar.c(i);
    }

    public static boolean K(rsr rsrVar, String str, String str2) {
        Cursor query = rsrVar.query("SELECT 1 FROM playlist WHERE uid = ? AND original_id = ? LIMIT 1", new String[]{str, str2});
        try {
            boolean moveToFirst = query.moveToFirst();
            yd5.q(query, null);
            return moveToFirst;
        } finally {
        }
    }

    public static void L(rsr rsrVar, xxq xxqVar, String str, int i, String str2) {
        rsrVar.execSQL("INSERT INTO playlist(tracks,revision,uid,name,name_surrogate,sync,login,snapshot,created,original_id,visibility,liked,playlist_for_kids) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)", new Object[]{0, -1, xxqVar.a, str, R(str), Integer.valueOf(i), xxqVar.b, 0, "1970-01-01T00:00:00+0000", str2, "public", 0, 0});
    }

    public static final yci N(yci yciVar) {
        yciVar.getClass();
        return a.a(yciVar, new gkm(2));
    }

    public static final void O(sdk sdkVar, ArrayList arrayList, x7o x7oVar) {
        sdkVar.getClass();
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (dag.y((kcp) it.next()) instanceof mfk) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            x7oVar.onSuccess(arrayList);
        }
        ((tdk) sdkVar).b(new iwe(13, arrayList, x7oVar));
    }

    public static x41 P(String str) {
        return str == null ? x41.c : str.equals("from-artist-photos") ? x41.a : x41.b;
    }

    public static String Q(Collection collection) {
        return CollectionsKt.W(collection, StringUtils.COMMA, "", "", null);
    }

    public static String R(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String replaceAll = Normalizer.normalize(str.trim().toUpperCase(Locale.ENGLISH), Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        char charAt = replaceAll.charAt(0);
        return !Character.isLetter(charAt) ? Character.isDigit(charAt) ? "\u007f".concat(replaceAll) : "\u007f".concat("\u007f".concat(replaceAll)) : replaceAll.substring(0, 1).matches("[А-Яа-я]+") ? StringUtil.SPACE.concat(replaceAll) : replaceAll;
    }

    public static String S(String str) {
        return ("%" + Normalizer.normalize(str.trim(), Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replaceAll(StringUtil.SPACE, "%") + "%").toUpperCase(Locale.ENGLISH);
    }

    public static final mqs T(h4m h4mVar) {
        h4mVar.getClass();
        long j = h4mVar.a;
        long j2 = h4mVar.c;
        ig5 ig5Var = h4mVar.b;
        i1m i1mVar = new i1m(j, j2, ig5Var.a, h4mVar.f, h4mVar.e, null);
        String str = h4mVar.h;
        String str2 = h4mVar.g;
        String str3 = h4mVar.i;
        String str4 = h4mVar.l;
        if (str4 == null) {
            str4 = "";
        }
        List w = ngg.w(str, str2, str3, str4, h4mVar.j, h4mVar.k, h4mVar.m);
        List<c01> list = w;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (c01 c01Var : list) {
            Parcelable.Creator<zp2> creator = zp2.CREATOR;
            arrayList.add(vq2.E(c01Var));
        }
        String str5 = ig5Var.F;
        String str6 = ig5Var.E;
        String str7 = ig5Var.G;
        String str8 = ig5Var.H;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        webPath$Storage.getClass();
        mqs t0 = j66.t0(ig5Var, arrayList, w, new oq(str5, str6, null, false, null, null, null, null, str7, null, 0, null, arrayList, etn.B(str8, webPath$Storage), 0, false, null, null, null, null, null, null, false, null, 536845820), i1mVar);
        tfs tfsVar = wc7.a;
        t0.w0 = wc7.a.b(h4mVar.d);
        return t0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, sv7, w9t] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void U(w9t w9tVar, Function1 function1) {
        cr crVar;
        xci xciVar = (xci) w9tVar;
        if (!xciVar.a.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = xciVar.a.e;
        mpf F = bcx.F(w9tVar);
        while (F != null) {
            if ((((xci) F.F.f).d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                while (xciVar2 != null) {
                    if ((xciVar2.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        cw7 cw7Var = xciVar2;
                        ?? r5 = 0;
                        while (cw7Var != 0) {
                            boolean z = true;
                            if (cw7Var instanceof w9t) {
                                w9t w9tVar2 = (w9t) cw7Var;
                                if (Intrinsics.d(w9tVar.h(), w9tVar2.h()) && w9tVar.getClass() == w9tVar2.getClass()) {
                                    z = ((Boolean) function1.invoke(w9tVar2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else {
                                if (((cw7Var.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) && (cw7Var instanceof cw7)) {
                                    xci xciVar3 = cw7Var.p;
                                    int i = 0;
                                    cw7Var = cw7Var;
                                    r5 = r5;
                                    while (xciVar3 != null) {
                                        if ((xciVar3.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                            i++;
                                            r5 = r5;
                                            if (i == 1) {
                                                cw7Var = xciVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new eqi(new xci[16]);
                                                }
                                                if (cw7Var != 0) {
                                                    r5.d(cw7Var);
                                                    cw7Var = 0;
                                                }
                                                r5.d(xciVar3);
                                            }
                                        }
                                        xciVar3 = xciVar3.f;
                                        cw7Var = cw7Var;
                                        r5 = r5;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            cw7Var = bcx.p(r5);
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, w9t] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void V(w9t w9tVar, Function1 function1) {
        xci xciVar = (xci) w9tVar;
        if (!xciVar.a.n) {
            sme.b("visitSubtreeIf called on an unattached node");
        }
        eqi eqiVar = new eqi(new xci[16]);
        xci xciVar2 = xciVar.a;
        xci xciVar3 = xciVar2.f;
        if (xciVar3 == null) {
            bcx.o(eqiVar, xciVar2);
        } else {
            eqiVar.d(xciVar3);
        }
        while (true) {
            int i = eqiVar.c;
            if (i == 0) {
                return;
            }
            xci xciVar4 = (xci) eqiVar.m(i - 1);
            if ((xciVar4.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                for (xci xciVar5 = xciVar4; xciVar5 != null; xciVar5 = xciVar5.f) {
                    if ((xciVar5.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        cw7 cw7Var = xciVar5;
                        ?? r7 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof w9t) {
                                w9t w9tVar2 = (w9t) cw7Var;
                                v9t v9tVar = (Intrinsics.d(w9tVar.h(), w9tVar2.h()) && w9tVar.getClass() == w9tVar2.getClass()) ? (v9t) function1.invoke(w9tVar2) : v9t.a;
                                if (v9tVar == v9t.c) {
                                    return;
                                }
                                if (v9tVar == v9t.b) {
                                    break;
                                }
                            } else if ((cw7Var.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar6 = cw7Var.p;
                                int i2 = 0;
                                cw7Var = cw7Var;
                                r7 = r7;
                                while (xciVar6 != null) {
                                    if ((xciVar6.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            cw7Var = xciVar6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r7.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r7.d(xciVar6);
                                        }
                                    }
                                    xciVar6 = xciVar6.f;
                                    cw7Var = cw7Var;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            cw7Var = bcx.p(r7);
                        }
                    }
                }
            }
            bcx.o(eqiVar, xciVar4);
        }
    }

    public static final void W(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static final void a(int i, int i2, hq5 hq5Var, yci yciVar) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-82359436);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            irf.r(a0g.E(((ma5) oq5Var.j(pa5.a)).g() ? R.drawable.beeline_promo_logo_light_theme : R.drawable.beeline_promo_logo_dark_theme, 0, oq5Var), ouj.n(rvf.M(R.string.wave_for_two_sharing_beeline_promo_text, oq5Var), rvf.M(R.string.wave_for_two_beeline_promo_logo_description, oq5Var)), d.r(androidx.compose.foundation.layout.a.o(yciVar, 10, 0.0f, 2), 224), null, null, 0.0f, null, oq5Var, 0, 120);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rl4(yciVar, i, i2, 7);
        }
    }

    public static final void b(yci yciVar, hq5 hq5Var, int i) {
        yciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1431644586);
        if ((i & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            u1g.l(oq5Var, androidx.compose.foundation.a.b(xp3.u(yciVar, o5g.D(oq5Var)), ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 24);
        }
    }

    public static final void c(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1363429449);
        if ((((oq5Var.f(yciVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci u = xp3.u(yciVar, ugo.a);
            agr agrVar = eq0.a;
            yci b2 = androidx.compose.foundation.a.b(u, ((dq0) oq5Var.j(agrVar)).c.c, vnj.i);
            kfh d2 = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            xcs.b(rvf.M(R.string.wave_for_two_chip_nda_text, oq5Var), androidx.compose.foundation.layout.a.n(b.a.a(vci.a, b2c.f), 12, 4), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 23);
        }
    }

    public static final void d(int i, hq5 hq5Var, yci yciVar, Function0 function0, Function0 function02, boolean z, boolean z2) {
        Function0 function03;
        boolean z3;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-988803738);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | (oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            function03 = function0;
            z3 = z2;
        } else {
            function03 = function0;
            z3 = z2;
            v5g.h(z ? R.drawable.ic_like_active_32 : R.drawable.ic_like_32, function03, ksw.D(yciVar, rvf.M(R.string.menu_element_like, oq5Var), rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var)), function02, z3, false, oq5Var, i2 & 64624, 32);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cae(z, function03, yciVar, function02, z3, i);
        }
    }

    public static final void e(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1852330363);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            yci m = d.m(vciVar, 48);
            kfh d2 = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, m);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            gae.b(a0g.E(R.drawable.ic_link_default_24, 0, oq5Var), null, androidx.compose.ui.platform.a.a(b.a.a(wyf.R(d.m(vciVar, 24)), b2c.f), "link_arrow"), ((dq0) oq5Var.j(eq0.a)).a.c, oq5Var, 48, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rea(i, 26);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(k4k k4kVar, lvf lvfVar, boolean z, dib dibVar, b2i b2iVar, tmb tmbVar, hq5 hq5Var, int i) {
        kjn kjnVar;
        int i2;
        kjn kjnVar2;
        boolean z2;
        kjn kjnVar3;
        kjn kjnVar4;
        boolean z3;
        Object K;
        b2i b2iVar2;
        k4kVar.getClass();
        lvfVar.getClass();
        dibVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(206722005);
        int i3 = i | (oq5Var.f(k4kVar) ? 4 : 2) | (oq5Var.h(lvfVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(dibVar) ? 2048 : 1024) | (oq5Var.f(b2iVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(tmbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            String M = rvf.M(R.string.metatag_all_playlists_header, oq5Var);
            int i4 = i3 & 57344;
            boolean z4 = i4 == 16384;
            Object K2 = oq5Var.K();
            kjn kjnVar5 = gq5.a;
            if (z4 || K2 == kjnVar5) {
                kjnVar = kjnVar5;
                i2 = i4;
                k5h k5hVar = new k5h(0, b2iVar, b2i.class, "onBackClicked", "onBackClicked()V", 0, 10);
                oq5Var.k0(k5hVar);
                K2 = k5hVar;
            } else {
                i2 = i4;
                kjnVar = kjnVar5;
            }
            Function0 function0 = (Function0) ((h9f) K2);
            boolean z5 = i2 == 16384;
            Object K3 = oq5Var.K();
            if (!z5) {
                kjn kjnVar6 = kjnVar;
                if (K3 == kjnVar6) {
                    kjnVar = kjnVar6;
                } else {
                    kjnVar2 = kjnVar6;
                    Function0 function02 = (Function0) ((h9f) K3);
                    z2 = i2 != 16384;
                    Object K4 = oq5Var.K();
                    if (z2) {
                        kjn kjnVar7 = kjnVar2;
                        if (K4 == kjnVar7) {
                            kjnVar3 = kjnVar7;
                        } else {
                            kjnVar4 = kjnVar7;
                            Function0 function03 = (Function0) ((h9f) K4);
                            z3 = i2 == 16384;
                            K = oq5Var.K();
                            if (!z3 || K == kjnVar4) {
                                K = new k5h(0, b2iVar, b2i.class, "onRetry", "onRetry()V", 0, 13);
                                b2iVar2 = b2iVar;
                                oq5Var.k0(K);
                            } else {
                                b2iVar2 = b2iVar;
                            }
                            Function0 function04 = (Function0) ((h9f) K);
                            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                            wn5 C2 = ild.C(1248850737, new t31(14, b2iVar2), oq5Var);
                            int i5 = lvf.f;
                            int i6 = i3 << 3;
                            ezf.j(k4kVar, lvfVar, M, z, dibVar, function0, function02, function03, function04, tmbVar, C, C2, oq5Var, (i3 & 14) | 64 | (i3 & 112) | (i6 & 7168) | (i6 & 57344) | 1073741824 | ((i3 << 12) & 1879048192), 48);
                        }
                    } else {
                        kjnVar3 = kjnVar2;
                    }
                    kjnVar4 = kjnVar3;
                    k5h k5hVar2 = new k5h(0, b2iVar, b2i.class, "onRefresh", "onRefresh()V", 0, 12);
                    oq5Var.k0(k5hVar2);
                    K4 = k5hVar2;
                    Function0 function032 = (Function0) ((h9f) K4);
                    if (i2 == 16384) {
                    }
                    K = oq5Var.K();
                    if (z3) {
                    }
                    K = new k5h(0, b2iVar, b2i.class, "onRetry", "onRetry()V", 0, 13);
                    b2iVar2 = b2iVar;
                    oq5Var.k0(K);
                    Function0 function042 = (Function0) ((h9f) K);
                    vm C3 = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
                    wn5 C22 = ild.C(1248850737, new t31(14, b2iVar2), oq5Var);
                    int i52 = lvf.f;
                    int i62 = i3 << 3;
                    ezf.j(k4kVar, lvfVar, M, z, dibVar, function0, function02, function032, function042, tmbVar, C3, C22, oq5Var, (i3 & 14) | 64 | (i3 & 112) | (i62 & 7168) | (i62 & 57344) | 1073741824 | ((i3 << 12) & 1879048192), 48);
                }
            }
            kjnVar2 = kjnVar;
            k5h k5hVar3 = new k5h(0, b2iVar, b2i.class, "onSortClick", "onSortClick()V", 0, 11);
            oq5Var.k0(k5hVar3);
            K3 = k5hVar3;
            Function0 function022 = (Function0) ((h9f) K3);
            if (i2 != 16384) {
            }
            Object K42 = oq5Var.K();
            if (z2) {
            }
            kjnVar4 = kjnVar3;
            k5h k5hVar22 = new k5h(0, b2iVar, b2i.class, "onRefresh", "onRefresh()V", 0, 12);
            oq5Var.k0(k5hVar22);
            K42 = k5hVar22;
            Function0 function0322 = (Function0) ((h9f) K42);
            if (i2 == 16384) {
            }
            K = oq5Var.K();
            if (z3) {
            }
            K = new k5h(0, b2iVar, b2i.class, "onRetry", "onRetry()V", 0, 13);
            b2iVar2 = b2iVar;
            oq5Var.k0(K);
            Function0 function0422 = (Function0) ((h9f) K);
            vm C32 = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            wn5 C222 = ild.C(1248850737, new t31(14, b2iVar2), oq5Var);
            int i522 = lvf.f;
            int i622 = i3 << 3;
            ezf.j(k4kVar, lvfVar, M, z, dibVar, function0, function022, function0322, function0422, tmbVar, C32, C222, oq5Var, (i3 & 14) | 64 | (i3 & 112) | (i622 & 7168) | (i622 & 57344) | 1073741824 | ((i3 << 12) & 1879048192), 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(i, 3, k4kVar, lvfVar, dibVar, b2iVar, tmbVar, z);
        }
    }

    public static final void g(boolean z, Function0 function0, yci yciVar, boolean z2, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        boolean z3;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1284435427);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.g(z2) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            z3 = z2;
        } else {
            if (z) {
                i2 = R.string.pause;
            } else {
                if (z) {
                    b6e.s();
                    return;
                }
                i2 = R.string.listen;
            }
            int i4 = z ? R.drawable.ic_pause_small_24 : R.drawable.ic_play_small_24;
            function02 = function0;
            v5g.h(i4, function02, ksw.D(yciVar, rvf.M(i2, oq5Var), null), null, false, z2, oq5Var, (i3 & 112) | ((i3 << 6) & 458752), 24);
            z3 = z2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hdj(z, function02, yciVar, z3, i);
        }
    }

    public static final void h(ayn aynVar, Object obj, yci yciVar, boolean z, boolean z2, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        boolean z3;
        aynVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1129341741);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(aynVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= oq5Var.g(z3) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.Z(-1931603123);
            Object K = oq5Var.K();
            Object obj2 = gq5.a;
            if (K == obj2) {
                K = szf.g0(new enj(0L));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            oq5Var.p(false);
            oq5Var.Z(-1931600257);
            Object K2 = oq5Var.K();
            if (K2 == obj2) {
                K2 = new kf0(aqiVar, 5);
                oq5Var.k0(K2);
            }
            oq5Var.p(false);
            yci d2 = androidx.compose.ui.layout.a.d(yciVar, (Function1) K2);
            kfh d3 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(872013070);
            int i4 = i2 & 14;
            boolean f = (i4 == 4) | oq5Var.f(obj);
            Object K3 = oq5Var.K();
            if (f || K3 == obj2) {
                K3 = new oxn(aynVar, obj, new uv2(aqiVar, 5));
                oq5Var.k0(K3);
            }
            oq5Var.p(false);
            wn5Var.invoke((oxn) K3, Boolean.valueOf(z3), oq5Var, Integer.valueOf((i2 >> 9) & 1008));
            oq5Var.p(true);
            HashSet hashSet = aynVar.r;
            Boolean valueOf = Boolean.valueOf(z);
            oq5Var.Z(-1931586729);
            boolean h = ((i2 & 7168) == 2048) | (i4 == 4) | oq5Var.h(obj);
            Object K4 = oq5Var.K();
            if (h || K4 == obj2) {
                K4 = new qk(z, aynVar, obj, (Continuation) null);
                oq5Var.k0(K4);
            }
            oq5Var.p(false);
            gld.y(hashSet, valueOf, (Function2) K4, oq5Var);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qxn(aynVar, obj, yciVar, z, z3, wn5Var, i);
        }
    }

    public static final void i(boolean z, hq5 hq5Var, int i) {
        int i2;
        boolean z2 = z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1442432906);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            float f = 8;
            vci vciVar = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(vciVar, 0.0f, f, 0.0f, f, 5);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float s = lsq.s(e9g.b);
            int i4 = i2 & 14;
            ivf.k(i4, 0, oq5Var, xp3.u(d.o(vciVar, s, s), o5g.E(oq5Var)), z2);
            yci q2 = androidx.compose.foundation.layout.a.q(vciVar, 12, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci g = vz1.g(1.0f, q2, true);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, g);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float f2 = 80;
            int i6 = i4 | 48;
            ivf.l(z2, d.r(vciVar, f2), nu0.j(), oq5Var, i6, 0);
            z2 = z;
            ivf.l(z2, d.r(vciVar, f2), nu0.i(), oq5Var, i6, 0);
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i, 4, z2, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(int i, int i2, int i3, hq5 hq5Var, yci yciVar, boolean z) {
        yci yciVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        yci yciVar3;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1480811915);
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 = i2 | 6;
            yciVar2 = yciVar;
        } else if ((i2 & 6) == 0) {
            yciVar2 = yciVar;
            i4 = (oq5Var.f(yciVar2) ? 4 : 2) | i2;
        } else {
            yciVar2 = yciVar;
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            z2 = z;
            i4 |= oq5Var.g(z2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 384) == 0) {
                i6 = i;
                i4 |= oq5Var.d(i6) ? 256 : 128;
                if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
                    yci yciVar4 = i7 != 0 ? vci.a : yciVar2;
                    if (i8 != 0) {
                        z2 = true;
                    }
                    if (i5 != 0) {
                        i6 = 1;
                    }
                    yci q = androidx.compose.foundation.layout.a.q(yciVar4, 16, 0.0f, 8, 0.0f, 10);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i9 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, q);
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
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var, i9, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    oq5Var.Z(-1441060644);
                    for (int i10 = 0; i10 < i6; i10++) {
                        i(z2, oq5Var, (i4 >> 3) & 14);
                    }
                    oq5Var.p(false);
                    oq5Var.p(true);
                    yciVar3 = yciVar4;
                } else {
                    oq5Var.S();
                    yciVar3 = yciVar2;
                }
                boolean z3 = z2;
                int i11 = i6;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new j3e(yciVar3, z3, i11, i2, i3);
                    return;
                }
                return;
            }
            i6 = i;
            if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            }
            boolean z32 = z2;
            int i112 = i6;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z2 = z;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        i6 = i;
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
        }
        boolean z322 = z2;
        int i1122 = i6;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void k(uwp uwpVar, qbp qbpVar, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-364864382);
        int i2 = i | (oq5Var2.h(uwpVar) ? 4 : 2) | (oq5Var2.h(qbpVar) ? 32 : 16);
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean h = oq5Var2.h(uwpVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                qbp qbpVar2 = new qbp(0, uwpVar, uwp.class, "onDetailsLinkClick", "onDetailsLinkClick()V", 0, 17);
                oq5Var2.k0(qbpVar2);
                K = qbpVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var2.h(uwpVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                qbp qbpVar3 = new qbp(0, uwpVar, uwp.class, "onPrivilegesLinkClick", "onPrivilegesLinkClick()V", 0, 18);
                oq5Var2.k0(qbpVar3);
                K2 = qbpVar3;
            }
            oq5Var = oq5Var2;
            gut.h(function0, (Function0) ((h9f) K2), qbpVar, ild.C(1248439085, new ion(wn5Var, 8), oq5Var2), oq5Var, ((i2 << 3) & 896) | 3072);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(uwpVar, qbpVar, wn5Var, i, 10);
        }
    }

    public static final void l(qnq qnqVar, hgp hgpVar, nnq nnqVar, fvf fvfVar, yci yciVar, Function0 function0, hq5 hq5Var, int i) {
        dlg dlgVar;
        boolean z;
        int i2;
        aqi M;
        float v;
        boolean z2;
        iz2 iz2Var = b2c.f;
        ogp ogpVar = ogp.g;
        nnqVar.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1896346173);
        int i3 = i | (oq5Var.h(qnqVar) ? 4 : 2) | (oq5Var.h(hgpVar) ? 32 : 16) | (oq5Var.f(nnqVar) ? 256 : 128) | (oq5Var.f(fvfVar) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            cpq cpqVar = (cpq) gld.M((vdr) hgpVar.g, oq5Var).getValue();
            dlg dlgVar2 = dlg.d;
            if (((Boolean) oq5Var.j((agr) dlgVar2.c)).booleanValue()) {
                oq5Var.Z(1951339961);
                i2 = 1948460991;
                dlgVar = dlgVar2;
                z = false;
                ogpVar.e(cpqVar instanceof zoq, cpqVar instanceof apq, null, oq5Var, 4096, 4);
                oq5Var = oq5Var;
            } else {
                dlgVar = dlgVar2;
                z = false;
                i2 = 1948460991;
                oq5Var.Z(1948460991);
            }
            oq5Var.p(z);
            if (Intrinsics.d(cpqVar, apq.a)) {
                oq5Var.Z(1951601570);
                c3x.m(0, 2, 0L, oq5Var, d.x(d.c(androidx.compose.foundation.layout.a.l(yciVar, ogp.A(oq5Var)), 1.0f), iz2Var, 2));
                oq5Var.p(z);
            } else {
                boolean z3 = cpqVar instanceof zoq;
                kjn kjnVar = gq5.a;
                if (z3) {
                    oq5Var.Z(1951907013);
                    if (((Boolean) oq5Var.j((agr) dlgVar.c)).booleanValue()) {
                        oq5Var.Z(1951957636);
                        q0k c2 = androidx.compose.foundation.layout.a.c(0.0f, 56, 0.0f, 0.0f, 13);
                        WeakHashMap weakHashMap = rqv.w;
                        eoe n = p6g.n(z7l.h(oq5Var).f, oq5Var);
                        nmj nmjVar = (nmj) hgpVar.a;
                        hn5 hn5Var = ((qnq) hgpVar.b).b;
                        boolean h = oq5Var.h(hgpVar);
                        Object K = oq5Var.K();
                        if (h || K == kjnVar) {
                            K = new ti1(9, hgpVar);
                            oq5Var.k0(K);
                        }
                        oq5 oq5Var2 = oq5Var;
                        jmj b2 = nmjVar.b((dmj) K, hn5Var, (tmb) hgpVar.d, 1, oq5Var2, 36352);
                        oq5Var = oq5Var2;
                        yci x = d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vci.a, ghh.C(ghh.C(n, c2), zs4.g(oq5Var))), 1.0f), bfg.C(oq5Var), false, 14), iz2Var, 2);
                        z2 = false;
                        ivf.g(b2, x, true, null, oq5Var, 384, 8);
                    } else {
                        z2 = z;
                        oq5Var.Z(i2);
                    }
                    oq5Var.p(z2);
                    oq5Var.p(z2);
                } else {
                    boolean z4 = z;
                    if (!(cpqVar instanceof bpq)) {
                        throw vz1.i(oq5Var, -1322517524, z4);
                    }
                    oq5Var.Z(1952708735);
                    v2s v2sVar = (v2s) ((vdr) hgpVar.h).getValue();
                    Continuation continuation = null;
                    vdr e2 = v2sVar != null ? v2sVar.a.e() : null;
                    if (e2 == null) {
                        oq5Var.Z(1952728078);
                        oq5Var.p(z4);
                        M = null;
                    } else {
                        oq5Var.Z(-1322482093);
                        M = gld.M(e2, oq5Var);
                        oq5Var.p(z4);
                    }
                    boolean booleanValue = M != null ? ((Boolean) M.getValue()).booleanValue() : true;
                    Object K2 = oq5Var.K();
                    if (K2 == kjnVar) {
                        K2 = szf.g0(Boolean.FALSE);
                        oq5Var.k0(K2);
                    }
                    aqi aqiVar = (aqi) K2;
                    Unit unit = Unit.a;
                    boolean h2 = oq5Var.h(hgpVar);
                    Object K3 = oq5Var.K();
                    if (h2 || K3 == kjnVar) {
                        K3 = new v5p(hgpVar, aqiVar, continuation, 22);
                        oq5Var.k0(K3);
                    }
                    gld.w(oq5Var, unit, (Function2) K3);
                    sdr b3 = pk0.b((((Boolean) aqiVar.getValue()).booleanValue() || booleanValue) ? 1.0f : 0.0f, null, "thresholdAlpha", null, oq5Var, 3072, 22);
                    oq5 oq5Var3 = oq5Var;
                    q0k c3 = androidx.compose.foundation.layout.a.c(0.0f, ((Boolean) oq5Var3.j((agr) clg.d.c)).booleanValue() ? 56 : z4 ? 1.0f : 0.0f, 0.0f, 0.0f, 13);
                    WeakHashMap weakHashMap2 = rqv.w;
                    eoe n2 = p6g.n(z7l.h(oq5Var3).f, oq5Var3);
                    bpq bpqVar = (bpq) cpqVar;
                    if (bpqVar.b) {
                        oq5Var3.Z(-1322457595);
                        oq5Var3.p(z4);
                        v = z4 ? 1.0f : 0.0f;
                    } else {
                        oq5Var3.Z(-1322457308);
                        v = ild.v(oq5Var3);
                        oq5Var3.p(z4);
                    }
                    q0k c4 = androidx.compose.foundation.layout.a.c(0.0f, v, 0.0f, 0.0f, 13);
                    float f = zs4.f(oq5Var3);
                    wn5 C = ild.C(1363975631, new voq(bpqVar, nnqVar, qnqVar, hgpVar, yciVar, b3, fvfVar, function0, n2, c4, c3, 0), oq5Var3);
                    oq5Var = oq5Var3;
                    irv.a(f, 0.0f, 0.0f, C, oq5Var, 3072, 6);
                    oq5Var.p(z4);
                }
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr((Object) qnqVar, (Object) hgpVar, (Object) nnqVar, (Object) fvfVar, yciVar, (Object) function0, i, 21);
        }
    }

    public static final void m(float f, uoi uoiVar, float f2, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-481986521);
        int i2 = (oq5Var.c(f) ? 32 : 16) | i | (oq5Var.f(uoiVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(b.a.a(androidx.compose.foundation.layout.a.q(vciVar, f, 0.0f, 0.0f, 0.0f, 14), b2c.e), "slider_thumb");
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new s2r();
                oq5Var.k0(K);
            }
            s2r s2rVar = (s2r) K;
            boolean z = (i2 & 896) == 256;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new dl3(uoiVar, s2rVar, null, 4);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, uoiVar, (Function2) K2);
            u1g.l(oq5Var, androidx.compose.foundation.a.b(androidx.compose.foundation.a.l(e.a(d.o(vciVar, f2, f2), uoiVar, eeo.a(2 * f2, 4, 0L, false)), uoiVar), d85.f, ugo.a));
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ig2(f, uoiVar, f2, i);
        }
    }

    public static final void n(g9r g9rVar, vov vovVar, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(506278848);
        int i2 = (oq5Var.h(g9rVar) ? 4 : 2) | i | (oq5Var.h(vovVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            plv plvVar = vovVar.f;
            klv klvVar = vovVar.e.c;
            p(g9rVar, plvVar, z ? klvVar.b : klvVar.a, ild.C(373760236, new k0r(5, vovVar, g9rVar), oq5Var), oq5Var, (i2 & 14) | 3072);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(g9rVar, vovVar, z, i, 20);
        }
    }

    public static final void o(g9r g9rVar, uov uovVar, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-792039915);
        int i2 = (oq5Var.h(g9rVar) ? 4 : 2) | i | (oq5Var.f(uovVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            plv plvVar = uovVar.b;
            klv klvVar = uovVar.a.c;
            p(g9rVar, plvVar, z ? klvVar.b : klvVar.a, ild.C(1986686785, new k0r(6, uovVar, g9rVar), oq5Var), oq5Var, (i2 & 14) | 3072);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(g9rVar, uovVar, z, i, 21);
        }
    }

    public static final void p(g9r g9rVar, plv plvVar, List list, wn5 wn5Var, hq5 hq5Var, int i) {
        plv plvVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2103782042);
        int i2 = (oq5Var.h(g9rVar) ? 4 : 2) | i | (oq5Var.f(plvVar) ? 32 : 16) | (oq5Var.f(list) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            plvVar2 = plvVar;
            p1g.k(xee.x(g9rVar.getContext()), o5g.z(skd.a), plvVar2, false, ild.C(-848042347, new i9r(g9rVar, wn5Var, list, plvVar), oq5Var), oq5Var, ((i2 << 3) & 896) | 24576, 8);
        } else {
            plvVar2 = plvVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i9r(g9rVar, plvVar2, list, wn5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0364  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(zds zdsVar, d85 d85Var, um0 um0Var, yci yciVar, hvq hvqVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        hvq hvqVar2;
        int i4;
        boolean h;
        Object K;
        String str;
        int i5;
        Object obj;
        float f;
        long j;
        ges e2;
        long j2;
        String str2;
        vci vciVar;
        String str3;
        boolean z;
        long j3;
        String str4;
        boolean z2;
        ftq ftqVar;
        Spanned spanned;
        Object[] objArr;
        int i6;
        String url;
        qpc qpcVar;
        long j4;
        yci yciVar2;
        zsq zsqVar2;
        hvq hvqVar3;
        xmn r;
        zsq zsqVar3 = zsqVar;
        um0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1464332117);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(zdsVar) : oq5Var.h(zdsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(d85Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 256 : 128;
        }
        int i7 = i3 | 3072;
        int i8 = i2 & 16;
        if (i8 != 0) {
            i7 = i3 | 27648;
        } else if ((i & 24576) == 0) {
            hvqVar2 = hvqVar;
            i7 |= oq5Var.h(hvqVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i2 & 32;
            int i9 = 196608;
            if (i4 == 0) {
                if ((196608 & i) == 0) {
                    i9 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(zsqVar3) : oq5Var.h(zsqVar3) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
                }
                if ((74899 & i7) == 74898 || !oq5Var.z()) {
                    if (i8 != 0) {
                        hvqVar2 = null;
                    }
                    if (i4 != 0) {
                        zsqVar3 = null;
                    }
                    vci vciVar2 = vci.a;
                    float f2 = 16;
                    yci m = androidx.compose.foundation.layout.a.m(d.c(vciVar2, 1.0f), f2);
                    h = oq5Var.h(hvqVar2) | ((458752 & i7) != 131072 || ((i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar3)));
                    K = oq5Var.K();
                    Object obj2 = gq5.a;
                    if (!h || K == obj2) {
                        K = new ko1(hvqVar2, zsqVar3, 12);
                        oq5Var.k0(K);
                    }
                    yci b2 = com.yandex.music.core.ui.compose.a.b(m, null, 0L, 0.0f, null, (Function2) K, 15);
                    gz2 gz2Var = b2c.o;
                    dtq dtqVar = zdsVar.c;
                    String str5 = zdsVar.b;
                    str = zdsVar.a;
                    ta5 a2 = sa5.a(dtqVar.a, gz2Var, oq5Var, 48);
                    i5 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, b2);
                    xp5.T.getClass();
                    zsq zsqVar4 = zsqVar3;
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    hvq hvqVar4 = hvqVar2;
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    if (str == null) {
                        oq5Var.Z(1729529741);
                        oq5Var.p(false);
                        str3 = str;
                        z = false;
                        obj = obj2;
                        str2 = str5;
                        vciVar = vciVar2;
                        f = 1.0f;
                        j = 1095216660480L;
                    } else {
                        oq5Var.Z(1729529742);
                        obj = obj2;
                        f = 1.0f;
                        j = 1095216660480L;
                        vm0 b3 = fn0.b(0, 0.0f, um0Var, oq5Var, (i7 & 896) | 6, 2);
                        s7g s7gVar = zdsVar.d;
                        if (s7gVar.equals(aes.a)) {
                            oq5Var.Z(1551669775);
                            ges f3 = nu0.f();
                            long j5 = f3.b.c;
                            v7g.p(j5);
                            e2 = ges.b(f3, 0L, 0L, null, null, 0L, 0, v7g.D(kes.c(j5) * 0.85f, j5 & 1095216660480L), null, new h6g(17, e6g.c), 0, 0, 15597567);
                            oq5Var.p(false);
                        } else {
                            if (!s7gVar.equals(bes.a)) {
                                throw vz1.i(oq5Var, 1551666682, false);
                            }
                            oq5Var.Z(1551681482);
                            e2 = nu0.e();
                            oq5Var.p(false);
                        }
                        ges gesVar = e2;
                        yci d2 = d.d(vciVar2, 1.0f);
                        boolean f4 = oq5Var.f(b3);
                        Object K2 = oq5Var.K();
                        if (f4 || K2 == obj) {
                            K2 = new a9q(b3, 23);
                            oq5Var.k0(K2);
                        }
                        yci s = wyf.s(d2, (Function0) K2);
                        if (d85Var == null) {
                            oq5Var.Z(1551690724);
                            j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(1551689608);
                            oq5Var.p(false);
                            j2 = d85Var.a;
                        }
                        long j6 = j2;
                        str2 = str5;
                        vciVar = vciVar2;
                        xcs.b(str, s, j6, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 4, 0, null, gesVar, oq5Var, 0, 3072, 56824);
                        str3 = str;
                        oq5Var = oq5Var;
                        z = false;
                        oq5Var.p(false);
                    }
                    if (str3 != null || str2 == null) {
                        oq5Var.Z(1726714787);
                    } else {
                        oq5Var.Z(1730532034);
                        u1g.l(oq5Var, d.e(vciVar, f2));
                    }
                    oq5Var.p(z);
                    if (str2 == null) {
                        oq5Var.Z(1730636286);
                        oq5Var.p(z);
                        z2 = z;
                        str4 = str2;
                    } else {
                        oq5Var.Z(1730636287);
                        vm0 b4 = fn0.b(str3 != null ? 1 : 0, 0.0f, um0Var, oq5Var, i7 & 896, 2);
                        ges j7 = nu0.j();
                        yci d3 = d.d(vciVar, f);
                        boolean f5 = oq5Var.f(b4);
                        Object K3 = oq5Var.K();
                        if (f5 || K3 == obj) {
                            K3 = new a9q(b4, 24);
                            oq5Var.k0(K3);
                        }
                        yci s2 = wyf.s(d3, (Function0) K3);
                        if (d85Var == null) {
                            oq5Var.Z(1901258349);
                            j3 = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(1901257233);
                            oq5Var.p(false);
                            j3 = d85Var.a;
                        }
                        oq5 oq5Var2 = oq5Var;
                        str4 = str2;
                        xcs.b(str4, s2, j3, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 4, 0, null, j7, oq5Var2, 0, 3072, 56824);
                        oq5Var = oq5Var2;
                        z2 = false;
                        oq5Var.p(false);
                    }
                    ftqVar = zdsVar.e;
                    if (ftqVar == null) {
                        oq5Var.Z(1731260409);
                    } else {
                        String str6 = ftqVar.a;
                        oq5Var.Z(1731260410);
                        if (str3 == null && str4 == null) {
                            oq5Var.Z(-751016992);
                            oq5Var.p(z2);
                        } else {
                            oq5Var.Z(-746429705);
                            eta.p(vciVar, 20, oq5Var, z2);
                        }
                        vm0 b5 = fn0.b((str3 == null || str4 == null) ? (str3 == null && str4 == null) ? 0 : 1 : 2, 0.0f, um0Var, oq5Var, i7 & 896, 2);
                        boolean f6 = oq5Var.f(str6);
                        Object K4 = oq5Var.K();
                        if (f6 || K4 == obj) {
                            int i10 = mn0.e;
                            aas aasVar = aas.c;
                            hds hdsVar = new hds(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, aasVar, (otp) null, 61439), null, null, null);
                            Spanned fromHtml = Html.fromHtml("<ContentHandlerReplacementTag />".concat(str6), 63, null, leu.f);
                            kn0 kn0Var = new kn0(fromHtml.length());
                            kn0Var.c(fromHtml);
                            Object[] spans = fromHtml.getSpans(0, kn0Var.a.length(), Object.class);
                            int length = spans.length;
                            int i11 = 0;
                            while (i11 < length) {
                                Object obj3 = spans[i11];
                                long P = y5g.P(fromHtml.getSpanStart(obj3), fromHtml.getSpanEnd(obj3));
                                int i12 = rds.c;
                                int i13 = (int) (P >> 32);
                                int i14 = (int) (P & 4294967295L);
                                if (obj3 instanceof AbsoluteSizeSpan) {
                                    spanned = fromHtml;
                                    objArr = spans;
                                } else {
                                    boolean z3 = obj3 instanceof AlignmentSpan;
                                    ArrayList arrayList = kn0Var.c;
                                    if (z3) {
                                        Layout.Alignment alignment = ((AlignmentSpan) obj3).getAlignment();
                                        int i15 = alignment == null ? -1 : w4e.a[alignment.ordinal()];
                                        spanned = fromHtml;
                                        objArr = spans;
                                        arrayList.add(new jn0(new x5k(i15 != 1 ? i15 != 2 ? i15 != 3 ? Integer.MIN_VALUE : 6 : 3 : 5, null, 510), i13, i14, 8));
                                    } else {
                                        spanned = fromHtml;
                                        objArr = spans;
                                        if (obj3 instanceof tn0) {
                                            tn0 tn0Var = (tn0) obj3;
                                            arrayList.add(new jn0(i13, i14, new dkr(tn0Var.b), tn0Var.a));
                                        } else if (obj3 instanceof BackgroundColorSpan) {
                                            kn0Var.a(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, c3x.f(((BackgroundColorSpan) obj3).getBackgroundColor()), (aas) null, (otp) null, 63487), i13, i14);
                                        } else {
                                            if (obj3 instanceof vj3) {
                                                long j8 = uj3.a;
                                                vj3 vj3Var = (vj3) obj3;
                                                int i16 = vj3Var.b;
                                                v7g.p(j8);
                                                long D = v7g.D(i16 * kes.c(j8), j8 & j);
                                                tj3 tj3Var = vj3Var.a;
                                                i6 = length;
                                                x5k x5kVar = new x5k(0, new fcs(D, D), 503);
                                                int i17 = 8;
                                                arrayList.add(new jn0(x5kVar, i13, i14, i17));
                                                arrayList.add(new jn0(tj3Var, i13, i14, i17));
                                            } else {
                                                i6 = length;
                                                if (obj3 instanceof ForegroundColorSpan) {
                                                    kn0Var.a(new c4r(c3x.f(((ForegroundColorSpan) obj3).getForegroundColor()), 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534), i13, i14);
                                                } else if (obj3 instanceof RelativeSizeSpan) {
                                                    kn0Var.a(new c4r(0L, v7g.D(((RelativeSizeSpan) obj3).getSizeChange(), 8589934592L), (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65533), i13, i14);
                                                } else if (obj3 instanceof StrikethroughSpan) {
                                                    kn0Var.a(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, aas.d, (otp) null, 61439), i13, i14);
                                                } else if (obj3 instanceof StyleSpan) {
                                                    int style = ((StyleSpan) obj3).getStyle();
                                                    c4r c4rVar = style != 1 ? style != 2 ? style != 3 ? null : new c4r(0L, 0L, tqc.p, new oqc(1), (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65523) : new c4r(0L, 0L, (tqc) null, new oqc(1), (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65527) : new c4r(0L, 0L, tqc.p, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65531);
                                                    if (c4rVar != null) {
                                                        kn0Var.a(c4rVar, i13, i14);
                                                    }
                                                } else if (obj3 instanceof SubscriptSpan) {
                                                    kn0Var.a(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, new wu2(-0.5f), (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65279), i13, i14);
                                                } else if (obj3 instanceof SuperscriptSpan) {
                                                    kn0Var.a(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, new wu2(0.5f), (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65279), i13, i14);
                                                } else if (obj3 instanceof TypefaceSpan) {
                                                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj3;
                                                    String family = typefaceSpan.getFamily();
                                                    if (Intrinsics.d(family, "cursive")) {
                                                        qpcVar = qpc.e;
                                                    } else if (Intrinsics.d(family, "monospace")) {
                                                        qpcVar = qpc.d;
                                                    } else if (Intrinsics.d(family, "sans-serif")) {
                                                        qpcVar = qpc.b;
                                                    } else if (Intrinsics.d(family, "serif")) {
                                                        qpcVar = qpc.c;
                                                    } else {
                                                        String family2 = typefaceSpan.getFamily();
                                                        if (family2 != null && family2.length() != 0) {
                                                            Typeface create = Typeface.create(family2, 0);
                                                            Typeface typeface = Typeface.DEFAULT;
                                                            if (Intrinsics.d(create, typeface) || Intrinsics.d(create, Typeface.create(typeface, 0))) {
                                                                create = null;
                                                            }
                                                            if (create != null) {
                                                                qpcVar = new ggg(new sld(5, create));
                                                            }
                                                        }
                                                        qpcVar = null;
                                                    }
                                                    kn0Var.a(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, qpcVar, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65503), i13, i14);
                                                } else if (obj3 instanceof UnderlineSpan) {
                                                    kn0Var.a(new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, aasVar, (otp) null, 61439), i13, i14);
                                                } else if ((obj3 instanceof URLSpan) && (url = ((URLSpan) obj3).getURL()) != null) {
                                                    arrayList.add(new jn0(new o7g(url, hdsVar), i13, i14, 8));
                                                }
                                            }
                                            i11++;
                                            fromHtml = spanned;
                                            spans = objArr;
                                            length = i6;
                                        }
                                    }
                                }
                                i6 = length;
                                i11++;
                                fromHtml = spanned;
                                spans = objArr;
                                length = i6;
                            }
                            K4 = kn0Var.h();
                            oq5Var.k0(K4);
                        }
                        mn0 mn0Var = (mn0) K4;
                        ges i18 = nu0.i();
                        yci d4 = d.d(vciVar, 1.0f);
                        boolean f7 = oq5Var.f(b5);
                        Object K5 = oq5Var.K();
                        if (f7 || K5 == obj) {
                            K5 = new a9q(b5, 25);
                            oq5Var.k0(K5);
                        }
                        yci s3 = wyf.s(d4, (Function0) K5);
                        boolean f8 = oq5Var.f(mn0Var);
                        Object K6 = oq5Var.K();
                        if (f8 || K6 == obj) {
                            K6 = new r3s(2, mn0Var);
                            oq5Var.k0(K6);
                        }
                        yci b6 = nfp.b(s3, false, (Function1) K6);
                        d85 d85Var2 = ftqVar.b;
                        if (d85Var2 == null) {
                            oq5Var.Z(668696811);
                            j4 = ((dq0) oq5Var.j(eq0.a)).b.b;
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(668695447);
                            oq5Var.p(false);
                            j4 = d85Var2.a;
                        }
                        oq5 oq5Var3 = oq5Var;
                        xcs.c(mn0Var, b6, j4, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, null, null, i18, oq5Var3, 0, 0, 130552);
                        oq5Var = oq5Var3;
                        z2 = false;
                    }
                    oq5Var.p(z2);
                    oq5Var.p(true);
                    yciVar2 = vciVar;
                    zsqVar2 = zsqVar4;
                    hvqVar3 = hvqVar4;
                } else {
                    oq5Var.S();
                    yciVar2 = yciVar;
                    zsqVar2 = zsqVar3;
                    hvqVar3 = hvqVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new fd1(zdsVar, d85Var, um0Var, yciVar2, hvqVar3, zsqVar2, i, i2, 16);
                    return;
                }
                return;
            }
            i7 |= i9;
            if ((74899 & i7) == 74898) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            vci vciVar22 = vci.a;
            float f22 = 16;
            yci m2 = androidx.compose.foundation.layout.a.m(d.c(vciVar22, 1.0f), f22);
            h = oq5Var.h(hvqVar2) | ((458752 & i7) != 131072 || ((i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar3)));
            K = oq5Var.K();
            Object obj22 = gq5.a;
            if (!h) {
            }
            K = new ko1(hvqVar2, zsqVar3, 12);
            oq5Var.k0(K);
            yci b22 = com.yandex.music.core.ui.compose.a.b(m2, null, 0L, 0.0f, null, (Function2) K, 15);
            gz2 gz2Var2 = b2c.o;
            dtq dtqVar2 = zdsVar.c;
            String str52 = zdsVar.b;
            str = zdsVar.a;
            ta5 a22 = sa5.a(dtqVar2.a, gz2Var2, oq5Var, 48);
            i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b22);
            xp5.T.getClass();
            zsq zsqVar42 = zsqVar3;
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            hvq hvqVar42 = hvqVar2;
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a22, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var2);
            g0g.U(oq5Var, H2, wp5.d);
            if (str == null) {
            }
            if (str3 != null) {
            }
            oq5Var.Z(1726714787);
            oq5Var.p(z);
            if (str2 == null) {
            }
            ftqVar = zdsVar.e;
            if (ftqVar == null) {
            }
            oq5Var.p(z2);
            oq5Var.p(true);
            yciVar2 = vciVar;
            zsqVar2 = zsqVar42;
            hvqVar3 = hvqVar42;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        hvqVar2 = hvqVar;
        i4 = i2 & 32;
        int i92 = 196608;
        if (i4 == 0) {
        }
        i7 |= i92;
        if ((74899 & i7) == 74898) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        vci vciVar222 = vci.a;
        float f222 = 16;
        yci m22 = androidx.compose.foundation.layout.a.m(d.c(vciVar222, 1.0f), f222);
        h = oq5Var.h(hvqVar2) | ((458752 & i7) != 131072 || ((i7 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar3)));
        K = oq5Var.K();
        Object obj222 = gq5.a;
        if (!h) {
        }
        K = new ko1(hvqVar2, zsqVar3, 12);
        oq5Var.k0(K);
        yci b222 = com.yandex.music.core.ui.compose.a.b(m22, null, 0L, 0.0f, null, (Function2) K, 15);
        gz2 gz2Var22 = b2c.o;
        dtq dtqVar22 = zdsVar.c;
        String str522 = zdsVar.b;
        str = zdsVar.a;
        ta5 a222 = sa5.a(dtqVar22.a, gz2Var22, oq5Var, 48);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H22 = vnj.H(oq5Var, b222);
        xp5.T.getClass();
        zsq zsqVar422 = zsqVar3;
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        hvq hvqVar422 = hvqVar2;
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a222, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var22 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var22);
        g0g.U(oq5Var, H22, wp5.d);
        if (str == null) {
        }
        if (str3 != null) {
        }
        oq5Var.Z(1726714787);
        oq5Var.p(z);
        if (str2 == null) {
        }
        ftqVar = zdsVar.e;
        if (ftqVar == null) {
        }
        oq5Var.p(z2);
        oq5Var.p(true);
        yciVar2 = vciVar;
        zsqVar2 = zsqVar422;
        hvqVar3 = hvqVar422;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.K(), java.lang.Integer.valueOf(r14)) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(int i, int i2, wn5 wn5Var, wn5 wn5Var2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        yci yciVar2;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        yci f;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1440496534);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z2 = z;
                i3 |= oq5Var.g(z2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= oq5Var.h(wn5Var2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                    yci yciVar3 = vci.a;
                    if (i7 != 0) {
                        yciVar2 = yciVar3;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    yci c2 = d.c(yciVar2, 1.0f);
                    iz2 iz2Var = b2c.b;
                    kfh d2 = ug3.d(iz2Var, false);
                    int i8 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, c2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var, d2, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var.O) {
                        i5 = i3;
                    } else {
                        i5 = i3;
                    }
                    ouj.x(i8, oq5Var, i8, kb5Var3);
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var4);
                    wn5Var2.invoke(androidx.compose.foundation.layout.a.c(0.0f, uwf.i(oq5Var), 0.0f, 0.0f, 13), oq5Var, Integer.valueOf((i5 >> 6) & 112));
                    if (z2) {
                        f = yciVar3.f(new SuspendPointerInputElement(Unit.a, null, null, new dur(new db(2, 0, null)), 6));
                        z3 = false;
                        yciVar3 = nfp.b(f, false, new u4(5));
                    } else {
                        z3 = false;
                    }
                    kfh d3 = ug3.d(iz2Var, z3);
                    i6 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, yciVar3);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d3, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var, i6, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    wn5Var.invoke(oq5Var, Integer.valueOf(i5 & 14));
                    oq5Var.p(true);
                    oq5Var.p(true);
                } else {
                    oq5Var.S();
                }
                yci yciVar4 = yciVar2;
                boolean z4 = z2;
                r = oq5Var.r();
                if (r != null) {
                    r.d = new i5d(wn5Var, yciVar4, z4, wn5Var2, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
            }
            yci yciVar32 = vci.a;
            if (i7 != 0) {
            }
            if (i4 != 0) {
            }
            yci c22 = d.c(yciVar2, 1.0f);
            iz2 iz2Var2 = b2c.b;
            kfh d22 = ug3.d(iz2Var2, false);
            int i82 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, c22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, d22, kb5Var5);
            kb5 kb5Var22 = wp5.e;
            g0g.U(oq5Var, l3, kb5Var22);
            kb5 kb5Var32 = wp5.g;
            if (oq5Var.O) {
            }
            ouj.x(i82, oq5Var, i82, kb5Var32);
            kb5 kb5Var42 = wp5.d;
            g0g.U(oq5Var, H3, kb5Var42);
            wn5Var2.invoke(androidx.compose.foundation.layout.a.c(0.0f, uwf.i(oq5Var), 0.0f, 0.0f, 13), oq5Var, Integer.valueOf((i5 >> 6) & 112));
            if (z2) {
            }
            kfh d32 = ug3.d(iz2Var2, z3);
            i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, yciVar32);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, d32, kb5Var5);
            g0g.U(oq5Var, l22, kb5Var22);
            if (!oq5Var.O) {
            }
            ouj.x(i6, oq5Var, i6, kb5Var32);
            g0g.U(oq5Var, H22, kb5Var42);
            wn5Var.invoke(oq5Var, Integer.valueOf(i5 & 14));
            oq5Var.p(true);
            oq5Var.p(true);
            yci yciVar42 = yciVar2;
            boolean z42 = z2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        yci yciVar322 = vci.a;
        if (i7 != 0) {
        }
        if (i4 != 0) {
        }
        yci c222 = d.c(yciVar2, 1.0f);
        iz2 iz2Var22 = b2c.b;
        kfh d222 = ug3.d(iz2Var22, false);
        int i822 = oq5Var.P;
        androidx.compose.runtime.internal.a l32 = oq5Var.l();
        yci H32 = vnj.H(oq5Var, c222);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var52 = wp5.f;
        g0g.U(oq5Var, d222, kb5Var52);
        kb5 kb5Var222 = wp5.e;
        g0g.U(oq5Var, l32, kb5Var222);
        kb5 kb5Var322 = wp5.g;
        if (oq5Var.O) {
        }
        ouj.x(i822, oq5Var, i822, kb5Var322);
        kb5 kb5Var422 = wp5.d;
        g0g.U(oq5Var, H32, kb5Var422);
        wn5Var2.invoke(androidx.compose.foundation.layout.a.c(0.0f, uwf.i(oq5Var), 0.0f, 0.0f, 13), oq5Var, Integer.valueOf((i5 >> 6) & 112));
        if (z2) {
        }
        kfh d322 = ug3.d(iz2Var22, z3);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, yciVar322);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d322, kb5Var52);
        g0g.U(oq5Var, l222, kb5Var222);
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var322);
        g0g.U(oq5Var, H222, kb5Var422);
        wn5Var.invoke(oq5Var, Integer.valueOf(i5 & 14));
        oq5Var.p(true);
        oq5Var.p(true);
        yci yciVar422 = yciVar2;
        boolean z422 = z2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(float f, Function1 function1, Function0 function0, Function0 function02, yci yciVar, uoi uoiVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        uoi uoiVar2;
        yci yciVar3;
        xmn r;
        function1.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1104209339);
        if ((i & 6) == 0) {
            i3 = (oq5Var.c(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i3 | 196608;
            if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
                oq5Var.S();
                uoiVar2 = uoiVar;
                yciVar3 = yciVar2;
            } else {
                yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = vz1.h(oq5Var);
                }
                uoi uoiVar3 = (uoi) K;
                bg3.a(d.e(androidx.compose.foundation.a.k(yciVar4, true, uoiVar3), 24), null, false, ild.C(1869860625, new u04(f, uoiVar3, function0, function1, function02, 3), oq5Var), oq5Var, 3072, 6);
                uoiVar2 = uoiVar3;
                yciVar3 = yciVar4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new f7m(f, function1, function0, function02, yciVar3, uoiVar2, i, i2);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i4 = i3 | 196608;
        if (oq5Var.P(i4 & 1, (74899 & i4) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void t(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var;
        yci yciVar2;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1310508811);
        int i2 = (oq5Var2.f(str) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            xcs.b(str, androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 32, 0.0f, 2), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, i2 & 14, 0, 65016);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar2, i, 16);
        }
    }

    public static final void u(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var;
        yci yciVar2;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-748656479);
        int i2 = (oq5Var2.f(str) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            xcs.b(str, androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), 32, 0.0f, 2), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.d(), oq5Var, i2 & 14, 0, 65016);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar2, i, 15);
        }
    }

    public static final Float v(Object obj, Map map) {
        Object obj2;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.d(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final String w(oq oqVar) {
        oqVar.getClass();
        Integer num = oqVar.w;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                msa msaVar = nsa.b;
                long M = yd5.M(num.intValue(), ssa.SECONDS);
                ssa ssaVar = ssa.MINUTES;
                long N = yd5.N(eeh.c(nsa.r(M, ssaVar)), ssaVar);
                long s = nsa.s(N, ssa.HOURS);
                int g = nsa.g(N);
                nsa.i(N);
                nsa.h(N);
                Long valueOf = Long.valueOf(s);
                Integer valueOf2 = Integer.valueOf(g);
                long longValue = valueOf.longValue();
                int intValue = valueOf2.intValue();
                l18 l18Var = l18.b;
                bdt I = hag.I(skr.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                skr skrVar = (skr) qdcVar.C(I);
                n8g b2 = t75.b();
                if (longValue > 0) {
                    int i = (int) longValue;
                    b2.add(skrVar.b(R.plurals.number_of_hours_rtl_support, i, Integer.valueOf(i)));
                }
                if (intValue > 0) {
                    b2.add(skrVar.b(R.plurals.number_of_minutes_rtl_support, intValue, Integer.valueOf(intValue)));
                }
                return CollectionsKt.X(t75.a(b2), StringUtil.SPACE, null, null, null, 62);
            }
        }
        return null;
    }

    public static q7n x(n7n n7nVar) {
        String str = n7nVar.a;
        String str2 = n7nVar.b;
        String X = CollectionsKt.X(n7nVar.c, StringUtils.COMMA, null, null, null, 62);
        int length = X.length();
        int i = 5381;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = X.charAt(i2);
            get getVar = het.b;
            i = (i * 33) + charAt;
        }
        return new q7n(str, str2, (int) ((i & 4294967295L) % (4294967295L & 3)));
    }

    public static String z(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            wvs.j("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b2 = byteBuffer.get(i);
            if (b2 < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b2;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b3 = byteBuffer.get(i);
            if (b3 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b3;
                int i8 = i6;
                while (i8 < i3) {
                    byte b4 = byteBuffer.get(i8);
                    if (b4 < 0) {
                        break;
                    }
                    i8++;
                    cArr[i7] = (char) b4;
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else if (b3 < -32) {
                if (i6 >= i3) {
                    throw bye.c();
                }
                i += 2;
                y5g.R(b3, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b3 < -16) {
                if (i6 >= i3 - 1) {
                    throw bye.c();
                }
                int i9 = i + 2;
                i += 3;
                y5g.S(b3, byteBuffer.get(i6), byteBuffer.get(i9), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw bye.c();
                }
                byte b5 = byteBuffer.get(i6);
                int i10 = i + 3;
                byte b6 = byteBuffer.get(i + 2);
                i += 4;
                y5g.Q(b3, b5, b6, byteBuffer.get(i10), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    public abstract String A(ByteBuffer byteBuffer, int i, int i2);

    public abstract int C(String str, byte[] bArr, int i, int i2);

    public Object H() {
        kwj kwjVar = this instanceof kwj ? (kwj) this : null;
        if (kwjVar != null) {
            return kwjVar.f;
        }
        return null;
    }

    public abstract int M(byte[] bArr, int i, int i2);

    public abstract String y(byte[] bArr, int i, int i2);
}
