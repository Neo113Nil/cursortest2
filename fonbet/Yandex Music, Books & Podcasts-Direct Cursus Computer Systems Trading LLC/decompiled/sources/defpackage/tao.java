package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.y;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.command.ServiceCommand;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class tao implements ipr {
    public static tao f;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public tao(ibt ibtVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.a = ibtVar;
        this.d = hashMap2;
        this.e = hashMap3;
        this.c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        ibtVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    public static ArrayList a(tao taoVar) {
        ArrayList arrayList = (ArrayList) taoVar.e;
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                hbr hbrVar = (hbr) arrayList.get(i);
                if (!hbrVar.f.booleanValue() && ((String) ((n3m) taoVar.a).b).equals(hbrVar.b.trim())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ConnectableDevice.KEY_ID, hbrVar.a);
                    jSONObject.put("uri", hbrVar.d);
                    jSONObject.put("name", hbrVar.e);
                    arrayList2.add(vjp.c(jSONObject));
                }
            } catch (Exception e) {
                Log.e("StndbyDLHndlr", "get(): Error: " + e.getMessage());
                return arrayList2;
            }
        }
        return arrayList2;
    }

    public static jpg c(tao taoVar, af5 af5Var, c0p c0pVar, boolean z) {
        n5p n5pVar = (n5p) taoVar.a;
        String str = (String) taoVar.c;
        String str2 = af5Var.a;
        n1p n1pVar = af5Var.b;
        return new jpg(str2, n5pVar, c0pVar, str, z, n1pVar != null ? n1pVar.c : null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if (r1.equals("top") == false) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s0p d(n1p n1pVar) {
        String str = n1pVar != null ? n1pVar.a : null;
        if (str != null) {
            switch (str.hashCode()) {
                case -1409097913:
                    if (str.equals("artist")) {
                        return s0p.d;
                    }
                    return s0p.o;
                case -895767710:
                    if (str.equals("spoken")) {
                        return s0p.h;
                    }
                    return s0p.o;
                case -405568764:
                    if (str.equals("podcast")) {
                        return s0p.f;
                    }
                    return s0p.o;
                case -361151021:
                    if (str.equals("kids_music")) {
                        return s0p.i;
                    }
                    return s0p.o;
                case -69356017:
                    if (str.equals("spoken_playlist")) {
                        return s0p.l;
                    }
                    return s0p.o;
                case 115029:
                    break;
                case 3029737:
                    if (str.equals("book")) {
                        return s0p.g;
                    }
                    return s0p.o;
                case 3056464:
                    if (str.equals("clip")) {
                        return s0p.m;
                    }
                    return s0p.o;
                case 92896879:
                    if (str.equals("album")) {
                        return s0p.c;
                    }
                    return s0p.o;
                case 110621003:
                    if (str.equals("track")) {
                        return s0p.b;
                    }
                    return s0p.o;
                case 878699364:
                    if (str.equals("kids_playlist")) {
                        return s0p.j;
                    }
                    return s0p.o;
                case 951024294:
                    if (str.equals("concert")) {
                        return s0p.n;
                    }
                    return s0p.o;
                case 1856260468:
                    if (str.equals("kids_spoken")) {
                        return s0p.k;
                    }
                    return s0p.o;
                case 1879474642:
                    if (str.equals("playlist")) {
                        return s0p.e;
                    }
                    return s0p.o;
                default:
                    return s0p.o;
            }
        }
        return s0p.a;
    }

    public static mkb k(c0p c0pVar) {
        int ordinal = c0pVar.ordinal();
        if (ordinal == 0) {
            return mkb.Kids;
        }
        if (ordinal == 1) {
            return mkb.Podcasts;
        }
        if (ordinal == 2) {
            return mkb.Own;
        }
        if (ordinal == 3) {
            return mkb.Main;
        }
        if (ordinal == 4) {
            return mkb.Concerts;
        }
        b6e.s();
        return null;
    }

    public static bmb s(r0p r0pVar) {
        switch (r0pVar.ordinal()) {
            case 0:
                return bmb.AlbumScreen;
            case 1:
            case 5:
            case 7:
                su4.s(2, null, "navigation is not supported for " + r0pVar, null);
                return null;
            case 2:
                return bmb.PlaylistScreen;
            case 3:
                return bmb.ArtistScreen;
            case 4:
                return bmb.AlbumScreen;
            case 6:
                return bmb.VideoScreen;
            default:
                b6e.s();
                return null;
        }
    }

    public static amb t(s0p s0pVar) {
        switch (s0pVar.ordinal()) {
            case 0:
                return amb.Top;
            case 1:
                return amb.Track;
            case 2:
                return amb.Album;
            case 3:
                return amb.Artist;
            case 4:
                return amb.Playlist;
            case 5:
                return amb.Podcast;
            case 6:
                return amb.Book;
            case 7:
                return amb.Spoken;
            case 8:
                return amb.KidsMusic;
            case 9:
                return amb.KidsPlaylist;
            case 10:
                return amb.KidsSpoken;
            case 11:
                return amb.SpokenPlaylist;
            case 12:
                return amb.Video;
            case 13:
                return amb.Concert;
            case 14:
                return amb.Other;
            default:
                b6e.s();
                return null;
        }
    }

    public static cmb u(r0p r0pVar) {
        switch (r0pVar.ordinal()) {
            case 0:
                return cmb.Album;
            case 1:
                return cmb.Track;
            case 2:
                return cmb.Playlist;
            case 3:
                return cmb.Artist;
            case 4:
                return cmb.Album;
            case 5:
                return cmb.Track;
            case 6:
                return cmb.Video;
            case 7:
                return cmb.Wave;
            default:
                b6e.s();
                return null;
        }
    }

    public static void w(tao taoVar, l5x l5xVar) {
        int i = l5xVar.e;
        if (i == 2 && ((mox) taoVar.d) != null) {
            taoVar.y();
        }
        if (i == 2) {
            taoVar.d = new mox((sbx) taoVar.a, (String) taoVar.c);
        } else {
            taoVar.d = taoVar.x();
        }
        mox moxVar = (mox) taoVar.d;
        y1g.G(moxVar);
        l5xVar.d = moxVar.h;
        moxVar.b.add(l5xVar);
    }

    public void b(wj9 wj9Var) {
        Set set;
        qfq qfqVar = (qfq) ((HashMap) this.d).remove(wj9Var);
        if (qfqVar == null) {
            return;
        }
        qfqVar.a.close();
        View view = (View) qfqVar.b.get();
        if (view == null || (set = (Set) ((WeakHashMap) this.c).get(view)) == null) {
            return;
        }
        set.remove(wj9Var);
    }

    @Override // defpackage.ipr
    public int e(long j) {
        long[] jArr = (long[]) this.b;
        int a = dvt.a(jArr, j, false);
        if (a < jArr.length) {
            return a;
        }
        return -1;
    }

    public vjp f(String str) {
        ArrayList arrayList = (ArrayList) this.e;
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                hbr hbrVar = (hbr) arrayList.get(i);
                if (hbrVar.a.trim().equals(str.trim())) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ConnectableDevice.KEY_ID, hbrVar.a);
                    jSONObject.put("uri", hbrVar.d);
                    jSONObject.put("name", hbrVar.e);
                    return vjp.c(jSONObject);
                }
            } catch (Exception e) {
                Log.e("StndbyDLHndlr", "get(Duid): Error: " + e.getMessage());
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.ipr
    public List g(long j) {
        ibt ibtVar = (ibt) this.a;
        Map map = (Map) this.c;
        HashMap hashMap = (HashMap) this.d;
        HashMap hashMap2 = (HashMap) this.e;
        ArrayList arrayList = new ArrayList();
        ibtVar.g(j, ibtVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        ibtVar.i(j, false, ibtVar.h, treeMap);
        ibtVar.h(j, map, hashMap, ibtVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) hashMap2.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                kbt kbtVar = (kbt) hashMap.get(pair.first);
                kbtVar.getClass();
                arrayList2.add(new rv6(null, null, null, decodeByteArray, kbtVar.c, 0, kbtVar.e, kbtVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, kbtVar.f, kbtVar.g, false, -16777216, kbtVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            kbt kbtVar2 = (kbt) hashMap.get(entry.getKey());
            kbtVar2.getClass();
            qv6 qv6Var = (qv6) entry.getValue();
            CharSequence charSequence = qv6Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (fx7 fx7Var : (fx7[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fx7.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(fx7Var), spannableStringBuilder.getSpanEnd(fx7Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f2 = kbtVar2.c;
            int i9 = kbtVar2.d;
            qv6Var.e = f2;
            qv6Var.f = i9;
            qv6Var.g = kbtVar2.e;
            qv6Var.h = kbtVar2.b;
            qv6Var.l = kbtVar2.f;
            float f3 = kbtVar2.i;
            int i10 = kbtVar2.h;
            qv6Var.k = f3;
            qv6Var.j = i10;
            qv6Var.p = kbtVar2.j;
            arrayList2.add(qv6Var.a());
        }
        return arrayList2;
    }

    public c0p h() {
        if (!((z66) ((jyr) this.d).getValue()).a().a) {
            return c0p.c;
        }
        switch (((p0p) this.b).ordinal()) {
            case 13:
            case 14:
            case 15:
            case 22:
                return c0p.a;
            case 16:
            case 19:
            case 25:
            default:
                return (c0p) this.e;
            case 17:
            case 18:
            case 20:
            case 21:
            case 23:
            case 24:
                return c0p.b;
            case 26:
                return c0p.e;
        }
    }

    public Boolean i(String str) {
        ArrayList arrayList = (ArrayList) this.e;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((hbr) arrayList.get(i)).a.trim().equals(str.trim()) && ((String) ((n3m) this.a).b).equals(((hbr) arrayList.get(i)).b.trim())) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(View view, gc8 gc8Var, xzb xzbVar, jc8 jc8Var, ArrayList arrayList) {
        qfq qfqVar;
        HashMap hashMap = (HashMap) this.d;
        WeakHashMap weakHashMap = (WeakHashMap) this.e;
        if (!weakHashMap.containsKey(view) && (view instanceof a0c)) {
            ((a0c) view).i(new qf7(3, this, view));
            weakHashMap.put(view, Unit.a);
        }
        WeakHashMap weakHashMap2 = (WeakHashMap) this.c;
        Set<wj9> set = (Set) weakHashMap2.get(view);
        if (set == null) {
            set = q5b.a;
        }
        LinkedHashSet U = CollectionsKt.U(arrayList, set);
        LinkedHashSet z0 = CollectionsKt.z0(U);
        for (wj9 wj9Var : set) {
            if (!U.contains(wj9Var) && (qfqVar = (qfq) hashMap.remove(wj9Var)) != null) {
                qfqVar.a.close();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wj9 wj9Var2 = (wj9) it.next();
            if (!U.contains(wj9Var2)) {
                z0.add(wj9Var2);
                b(wj9Var2);
                hashMap.put(wj9Var2, new qfq(wj9Var2.isEnabled().c(xzbVar, new a03(this, gc8Var, xzbVar, view, jc8Var, wj9Var2, 10)), view));
            }
        }
        weakHashMap2.put(view, z0);
    }

    public void l(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.a).put(str, obj);
        bqi bqiVar = (bqi) ((LinkedHashMap) this.c).get(str);
        if (bqiVar != null) {
            ((xdr) bqiVar).l(obj);
        }
        bqi bqiVar2 = (bqi) ((LinkedHashMap) this.d).get(str);
        if (bqiVar2 != null) {
            ((xdr) bqiVar2).l(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m(Object obj, Exception exc, cg6 cg6Var) {
        sao saoVar;
        nm6 nm6Var;
        int i;
        Object obj2;
        Object a;
        boolean z;
        if (cg6Var instanceof sao) {
            saoVar = (sao) cg6Var;
            int i2 = saoVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                saoVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = saoVar.m;
                nm6Var = nm6.a;
                i = saoVar.o;
                boolean z2 = false;
                if (i != 0) {
                    qgg.h0(obj3);
                    ((ArrayList) this.e).add(exc);
                    nco ncoVar = (nco) this.c;
                    saoVar.j = obj;
                    saoVar.k = exc;
                    saoVar.o = 1;
                    obj3 = ncoVar.a(false, exc, saoVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = saoVar.l;
                        qgg.h0(obj3);
                        if (((Boolean) obj3).booleanValue() && z) {
                            z2 = true;
                        }
                        return Boolean.valueOf(z2);
                    }
                    exc = saoVar.k;
                    obj = saoVar.j;
                    qgg.h0(obj3);
                }
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                HashMap hashMap = (HashMap) ((jyr) this.d).getValue();
                lm4 a2 = ern.a(obj.getClass());
                obj2 = hashMap.get(a2);
                if (obj2 == null) {
                    obj2 = rvf.P((lbo) ((Function1) ((mbo) this.a).c).invoke(obj), (mx7) this.b);
                    hashMap.put(a2, obj2);
                }
                saoVar.j = null;
                saoVar.k = null;
                saoVar.l = booleanValue;
                saoVar.o = 2;
                a = ((nco) obj2).a(!booleanValue, exc, saoVar);
                if (a != nm6Var) {
                    obj3 = a;
                    z = booleanValue;
                    if (((Boolean) obj3).booleanValue()) {
                        z2 = true;
                    }
                    return Boolean.valueOf(z2);
                }
                return nm6Var;
            }
        }
        saoVar = new sao(this, cg6Var);
        Object obj32 = saoVar.m;
        nm6Var = nm6.a;
        i = saoVar.o;
        boolean z22 = false;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj32).booleanValue();
        HashMap hashMap2 = (HashMap) ((jyr) this.d).getValue();
        lm4 a22 = ern.a(obj.getClass());
        obj2 = hashMap2.get(a22);
        if (obj2 == null) {
        }
        saoVar.j = null;
        saoVar.k = null;
        saoVar.l = booleanValue2;
        saoVar.o = 2;
        a = ((nco) obj2).a(!booleanValue2, exc, saoVar);
        if (a != nm6Var) {
        }
        return nm6Var;
    }

    public void n(zwp zwpVar) {
        Context context = (Context) this.d;
        y yVar = (y) this.c;
        mvp mvpVar = (mvp) this.a;
        pu0 pu0Var = (pu0) this.b;
        fnb fnbVar = (fnb) this.e;
        mvpVar.getClass();
        pu0Var.getClass();
        yVar.getClass();
        context.getClass();
        fnbVar.getClass();
        sai saiVar = new sai(false);
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.ShareScreen, null, 6), yVar, "SHARE_BOTTOM_SHEET", saiVar, null, new wn5(new ntb(pu0Var, mvpVar, zwpVar, saiVar, context, yVar, fnbVar, 4), 1326092232, true), 48);
    }

    @Override // defpackage.ipr
    public long o(int i) {
        return ((long[]) this.b)[i];
    }

    public void p(mqs mqsVar) {
        mqsVar.getClass();
        if (!mqsVar.p() || mqsVar.C()) {
            return;
        }
        mvp mvpVar = (mvp) this.a;
        o8q o8qVar = mvpVar.c;
        mvpVar.b.getClass();
        o8qVar.getClass();
        n(new zwp(new hxp(mqsVar.a, mqsVar.l() ? mqsVar.d.a : null, mqsVar.I()), mqsVar.x0, mqsVar.c, zwf.a0(mqsVar, o8qVar, R.string.unknown_album).toString()));
    }

    @Override // defpackage.ipr
    public int q() {
        return ((long[]) this.b).length;
    }

    public void r(x1u x1uVar) {
        x1uVar.getClass();
        n(new zwp(new ixp(x1uVar.a), x1uVar.o, x1uVar.b, v5g.B(x1uVar).toString()));
    }

    public void v(vjp vjpVar, Boolean bool) {
        if (vjpVar.d.trim().equals("Samsung SmartTV")) {
            int i = 4;
            bg3.A(vjpVar.f, ServiceCommand.TYPE_GET, 30000, new qdc(i, new gbr(this, vjpVar, bool), new z7l(3)));
        }
    }

    public mox x() {
        if (((mox) this.d) == null) {
            mox moxVar = new mox((sbx) this.a, (String) this.c);
            this.d = moxVar;
            moxVar.b(1);
        }
        return (mox) this.d;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void y() {
        long j;
        vhx vhxVar;
        nhx nhxVar;
        int i;
        mox moxVar = (mox) this.d;
        if (moxVar != null) {
            Map map = moxVar.e;
            List<q4x> list = moxVar.d;
            List<g0x> list2 = moxVar.c;
            List<l5x> list3 = moxVar.b;
            p84 p84Var = moxVar.j;
            if (p84Var != null) {
                p84Var.l = null;
                moxVar.j = null;
            }
            long j2 = moxVar.i;
            nhx n = ohx.n();
            n.c();
            ohx.A((ohx) n.b, j2);
            String str = moxVar.l;
            if (str != null) {
                n.c();
                ohx.x((ohx) n.b, str);
            }
            akx m = bkx.m();
            if (!TextUtils.isEmpty(moxVar.n)) {
                String str2 = moxVar.n;
                n.c();
                ohx.t((ohx) n.b, str2);
                String str3 = moxVar.n;
                m.c();
                bkx.p((bkx) m.b, str3);
            }
            if (!TextUtils.isEmpty(moxVar.o)) {
                String str4 = moxVar.o;
                m.c();
                bkx.q((bkx) m.b, str4);
            }
            if (!TextUtils.isEmpty(moxVar.p)) {
                String str5 = moxVar.p;
                m.c();
                bkx.r((bkx) m.b, str5);
            }
            if (!TextUtils.isEmpty(moxVar.q)) {
                String str6 = moxVar.q;
                m.c();
                bkx.n((bkx) m.b, str6);
            }
            if (!TextUtils.isEmpty(moxVar.r)) {
                String str7 = moxVar.r;
                m.c();
                bkx.o((bkx) m.b, str7);
            }
            if (!TextUtils.isEmpty(moxVar.s)) {
                String str8 = moxVar.s;
                m.c();
                bkx.s((bkx) m.b, str8);
            }
            bkx bkxVar = (bkx) m.b();
            n.c();
            ohx.w((ohx) n.b, bkxVar);
            xgx m2 = ygx.m();
            String str9 = mox.v;
            m2.c();
            ygx.o((ygx) m2.b, str9);
            String str10 = moxVar.g;
            m2.c();
            ygx.n((ygx) m2.b, str10);
            ygx ygxVar = (ygx) m2.b();
            n.c();
            ohx.p((ohx) n.b, ygxVar);
            pbx pbxVar = moxVar.a;
            vhx m3 = whx.m();
            String str11 = (String) pbxVar.d();
            if (str11 != null) {
                lix m4 = mix.m();
                m4.c();
                mix.n((mix) m4.b, str11);
                mix mixVar = (mix) m4.b();
                m3.c();
                whx.s((whx) m3.b, mixVar);
            }
            String str12 = moxVar.k;
            if (str12 != null) {
                try {
                    String replace = str12.replace("-", "");
                    j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
                } catch (NumberFormatException e) {
                    msg msgVar = mox.u;
                    Log.w(msgVar.a, msgVar.d("receiverSessionId %s is not valid for hash", str12), e);
                    j = 0;
                }
                m3.c();
                whx.u((whx) m3.b, j);
            }
            if (list3.isEmpty()) {
                vhxVar = m3;
            } else {
                ArrayList arrayList = new ArrayList();
                for (l5x l5xVar : list3) {
                    l5xVar.getClass();
                    thx m5 = uhx.m();
                    int i2 = l5xVar.e;
                    m5.c();
                    uhx.r((uhx) m5.b, i2);
                    vhx vhxVar2 = m3;
                    int i3 = (int) (l5xVar.b - l5xVar.d);
                    m5.c();
                    uhx.p((uhx) m5.b, i3);
                    m5.c();
                    uhx.q((uhx) m5.b, i3);
                    Integer num = l5xVar.a;
                    if (num != null) {
                        int intValue = num.intValue();
                        m5.c();
                        uhx.o((uhx) m5.b, intValue);
                    }
                    Boolean bool = l5xVar.c;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        m5.c();
                        uhx.n((uhx) m5.b, booleanValue);
                    }
                    arrayList.add((uhx) m5.b());
                    m3 = vhxVar2;
                }
                vhx vhxVar3 = m3;
                vhxVar3.c();
                vhxVar = vhxVar3;
                whx.n((whx) vhxVar.b, arrayList);
            }
            int i4 = 1;
            if (list2.isEmpty()) {
                nhxVar = n;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (g0x g0xVar : list2) {
                    g0xVar.getClass();
                    zhx m6 = aix.m();
                    nhx nhxVar2 = n;
                    int i5 = (int) (g0xVar.b - g0xVar.c);
                    m6.c();
                    aix.n((aix) m6.b, i5);
                    int i6 = g0xVar.a;
                    int i7 = i6 != 1 ? i6 != 2 ? i6 != 3 ? 1 : 4 : 3 : 2;
                    m6.c();
                    aix.o((aix) m6.b, i7);
                    arrayList2.add((aix) m6.b());
                    n = nhxVar2;
                }
                nhxVar = n;
                vhxVar.c();
                whx.q((whx) vhxVar.b, arrayList2);
            }
            if (!list.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (q4x q4xVar : list) {
                    String str13 = q4xVar.a;
                    phx m7 = qhx.m();
                    switch (str13.hashCode()) {
                        case -1189611734:
                            if (str13.equals("queueInsert")) {
                                i = 13;
                                break;
                            }
                            break;
                        case -1109843021:
                            if (str13.equals("launch")) {
                                i = 22;
                                break;
                            }
                            break;
                        case -940430091:
                            if (str13.equals("queueRemove")) {
                                i = 15;
                                break;
                            }
                            break;
                        case -936597225:
                            if (str13.equals("queueFetchItems")) {
                                i = 19;
                                break;
                            }
                            break;
                        case -930425472:
                            if (str13.equals("setPlaybackDevices")) {
                                i = 23;
                                break;
                            }
                            break;
                        case -921113364:
                            if (str13.equals("volume-mute")) {
                                i = 9;
                                break;
                            }
                            break;
                        case -900560382:
                            if (str13.equals("skipAd")) {
                                i = 21;
                                break;
                            }
                            break;
                        case -892481550:
                            if (str13.equals("status")) {
                                i = 10;
                                break;
                            }
                            break;
                        case -844665542:
                            if (str13.equals("queueUpdate")) {
                                i = 14;
                                break;
                            }
                            break;
                        case -810883302:
                            if (str13.equals("volume")) {
                                i = 7;
                                break;
                            }
                            break;
                        case -402284771:
                            if (str13.equals("setPlaybackRate")) {
                                i = 20;
                                break;
                            }
                            break;
                        case 3327206:
                            if (str13.equals("load")) {
                                i = 2;
                                break;
                            }
                            break;
                        case 3363353:
                            if (str13.equals("mute")) {
                                i = 8;
                                break;
                            }
                            break;
                        case 3443508:
                            if (str13.equals("play")) {
                                i = 3;
                                break;
                            }
                            break;
                        case 3526264:
                            if (str13.equals("seek")) {
                                i = 6;
                                break;
                            }
                            break;
                        case 3540994:
                            if (str13.equals("stop")) {
                                i = 5;
                                break;
                            }
                            break;
                        case 106440182:
                            if (str13.equals("pause")) {
                                i = 4;
                                break;
                            }
                            break;
                        case 525402049:
                            if (str13.equals("queueFetchItemRange")) {
                                i = 18;
                                break;
                            }
                            break;
                        case 913357482:
                            if (str13.equals("queueReorder")) {
                                i = 16;
                                break;
                            }
                            break;
                        case 1148867366:
                            if (str13.equals("trackStyle")) {
                                i = 12;
                                break;
                            }
                            break;
                        case 1451542318:
                            if (str13.equals("activeTracks")) {
                                i = 11;
                                break;
                            }
                            break;
                        case 1873161788:
                            if (str13.equals("queueFetchItemIds")) {
                                i = 17;
                                break;
                            }
                            break;
                    }
                    i = i4;
                    m7.c();
                    qhx.r((qhx) m7.b, i);
                    int i8 = (int) q4xVar.b;
                    m7.c();
                    qhx.o((qhx) m7.b, i8);
                    int i9 = q4xVar.c;
                    m7.c();
                    qhx.q((qhx) m7.b, i9);
                    int i10 = (int) (q4xVar.d - q4xVar.f);
                    m7.c();
                    qhx.p((qhx) m7.b, i10);
                    int i11 = (int) (q4xVar.e - q4xVar.f);
                    m7.c();
                    qhx.n((qhx) m7.b, i11);
                    arrayList3.add((qhx) m7.b());
                    i4 = 1;
                }
                vhxVar.c();
                whx.o((whx) vhxVar.b, arrayList3);
            }
            if (moxVar.m != null) {
                ArrayList arrayList4 = new ArrayList();
                q03 q03Var = moxVar.m;
                int i12 = q03Var.c;
                rhx m8 = shx.m();
                int i13 = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? 1 : 5 : 4 : 3 : 2;
                m8.c();
                shx.o((shx) m8.b, i13);
                int i14 = (int) (q03Var.a - q03Var.b);
                m8.c();
                shx.n((shx) m8.b, i14);
                arrayList4.add((shx) m8.b());
                vhxVar.c();
                whx.p((whx) vhxVar.b, arrayList4);
            }
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (o0x o0xVar : map.values()) {
                    o0xVar.getClass();
                    xhx m9 = yhx.m();
                    int i15 = o0xVar.e;
                    m9.c();
                    yhx.q((yhx) m9.b, i15);
                    int i16 = o0xVar.d.get();
                    m9.c();
                    yhx.n((yhx) m9.b, i16);
                    int i17 = (int) (o0xVar.a - o0xVar.c);
                    m9.c();
                    yhx.o((yhx) m9.b, i17);
                    int i18 = (int) (o0xVar.b - o0xVar.c);
                    m9.c();
                    yhx.p((yhx) m9.b, i18);
                    arrayList5.add((yhx) m9.b());
                }
                vhxVar.c();
                whx.r((whx) vhxVar.b, arrayList5);
            }
            int i19 = moxVar.t;
            vhxVar.c();
            whx.t((whx) vhxVar.b, i19);
            whx whxVar = (whx) vhxVar.b();
            nhxVar.c();
            nhx nhxVar3 = nhxVar;
            ohx.z((ohx) nhxVar3.b, whxVar);
            moxVar.f.a((ohx) nhxVar3.b(), 233);
            this.d = null;
        }
    }

    public tao(fnb fnbVar, c0p c0pVar, String str) {
        fnbVar.getClass();
        str.getClass();
        c0pVar.getClass();
        this.a = fnbVar;
        this.b = str;
        this.c = c0pVar;
        this.d = qld.m();
        l18 l18Var = l18.b;
        bdt I = hag.I(zzp.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        this.e = (zzp) qdcVar.C(I);
    }

    public tao(mvp mvpVar, pu0 pu0Var, y yVar, Context context, fnb fnbVar, int i) {
        mvpVar.getClass();
        pu0Var.getClass();
        yVar.getClass();
        context.getClass();
        fnbVar.getClass();
        this.a = mvpVar;
        this.b = pu0Var;
        this.c = yVar;
        this.d = context;
        this.e = fnbVar;
    }

    public tao(Map map) {
        map.getClass();
        this.a = new LinkedHashMap(map);
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ym5(3, this);
    }

    public /* synthetic */ tao(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    public tao(mbo mboVar, mx7 mx7Var) {
        mboVar.getClass();
        this.a = mboVar;
        this.b = mx7Var;
        this.c = rvf.P((lbo) mboVar.b, mx7Var);
        this.d = btf.b(new e5o(5));
        this.e = new ArrayList();
    }
}
