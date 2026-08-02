package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.yandex.music.databases.user.UserDatabase;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.pulse.metrics.o;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class qi extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                qi qiVar = new qi(this.l, continuation, 0);
                qiVar.k = obj;
                return qiVar;
            case 1:
                return new qi((rk) this.k, (xxq) this.l, continuation, 1);
            case 2:
                return new qi((mx) this.k, (d0o) this.l, continuation, 2);
            case 3:
                return new qi(continuation, (ay) this.k, (oq) this.l, 3);
            case 4:
                return new qi(continuation, (ay) this.k, (mt) this.l, 4);
            case 5:
                qi qiVar2 = new qi((e10) this.l, continuation, 5);
                qiVar2.k = obj;
                return qiVar2;
            case 6:
                qi qiVar3 = new qi(continuation, (g41) this.l);
                qiVar3.k = obj;
                return qiVar3;
            case 7:
                return new qi((q0d) this.k, (sdr) this.l, continuation, 7);
            case 8:
                return new qi((yi1) this.k, (dj1) this.l, continuation, 8);
            case 9:
                return new qi((il1) this.k, (String) this.l, continuation, 9);
            case 10:
                qi qiVar4 = new qi((w62) this.l, continuation, 10);
                qiVar4.k = obj;
                return qiVar4;
            case 11:
                return new qi(continuation, (a72) this.k, (css) this.l, 11);
            case 12:
                qi qiVar5 = new qi((hou) this.l, continuation, 12);
                qiVar5.k = obj;
                return qiVar5;
            case 13:
                return new qi((xf2) this.k, (xxq) this.l, continuation, 13);
            case 14:
                qi qiVar6 = new qi((fj2) this.l, continuation, 14);
                qiVar6.k = obj;
                return qiVar6;
            case 15:
                return new qi((rx2) this.k, (Intent) this.l, continuation, 15);
            case 16:
                return new qi((Function1) this.k, (sdr) this.l, continuation, 16);
            case 17:
                return new qi((dv3) this.k, (ltm) this.l, continuation, 17);
            case 18:
                return new qi((ny3) this.k, (fp7) this.l, continuation, 18);
            case 19:
                return new qi((i44) this.k, (String) this.l, continuation, 19);
            case 20:
                qi qiVar7 = new qi((a44) this.l, continuation, 20);
                qiVar7.k = obj;
                return qiVar7;
            case 21:
                qi qiVar8 = new qi((c74) this.l, continuation, 21);
                qiVar8.k = obj;
                return qiVar8;
            case 22:
                return new qi((h84) this.k, (p5d) this.l, continuation, 22);
            case 23:
                return new qi((h84) this.k, (h4q) this.l, continuation, 23);
            case 24:
                return new qi((List) this.k, (List) this.l, continuation, 24);
            case 25:
                qi qiVar9 = new qi((xv4) this.l, continuation, 25);
                qiVar9.k = obj;
                return qiVar9;
            case 26:
                return new qi(continuation, (oq) this.k, (u12) this.l, 26);
            case 27:
                return new qi((xiu) this.k, (drf) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new qi((rd5) this.k, (xd5) this.l, continuation, 28);
            default:
                return new qi((d31) this.k, (g31) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((qi) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.database.Cursor] */
    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        q0d q0dVar;
        boolean contains;
        FailedAssertionException failedAssertionException;
        int columnIndex;
        int intValue;
        Object obj2;
        List o0;
        int i = 6;
        int i2 = 0;
        Continuation continuation = null;
        continuation = null;
        int i3 = 1;
        switch (this.j) {
            case 0:
                Object obj3 = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!Intrinsics.d(obj3, this.l));
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(ost.a(((rk) this.k).a, (xxq) this.l).a.getBoolean("add_tracks_to_start_of_playlist", true));
            case 2:
                d0o d0oVar = (d0o) this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                try {
                    ((mx) this.k).b.b(d0oVar).execute();
                } catch (IOException e) {
                    ssg.a(6, "AlbumPromoReporter", "Error while sending reports at: " + d0oVar.a, e);
                }
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ss ssVar = ((ay) this.k).a;
                oq oqVar = (oq) this.l;
                String str = oqVar.a;
                int i4 = oqVar.q;
                str.getClass();
                x97.D(g.a, new rs(ssVar, str, i4, null, 0));
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ss ssVar2 = ((ay) this.k).a;
                oq oqVar2 = ((mt) this.l).a;
                String str2 = oqVar2.a;
                int i5 = oqVar2.q;
                str2.getClass();
                x97.D(g.a, new rs(ssVar2, str2, i5, null, 0));
                return Unit.a;
            case 5:
                mm6 mm6Var = (mm6) this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                e10 e10Var = (e10) this.l;
                ox6.B(e10Var.t.a(), mm6Var, new w00(e10Var, i2));
                ox6.B(e10Var.s.c(), mm6Var, new w00(e10Var, i3));
                return Unit.a;
            case 6:
                Object obj4 = this.k;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                t41 t41Var = (t41) obj4;
                g41 g41Var = (g41) this.l;
                if (!g41Var.g && (t41Var instanceof r41)) {
                    g41Var.g = true;
                    rmb.h(g41Var.d, ((r41) t41Var).b.size(), 2);
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                if (!((Boolean) ((sdr) this.l).getValue()).booleanValue() && (q0dVar = (q0d) this.k) != null) {
                    q0dVar.m();
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                yi1 yi1Var = (yi1) this.k;
                String str3 = ((dj1) this.l).a;
                zh1 zh1Var = yi1Var.e;
                zh1Var.getClass();
                bi1 bi1Var = zh1Var.a;
                np2 np2Var = (np2) bi1Var.b;
                jyr jyrVar = im1.i;
                String uri = ff7.t(str3).toString();
                uri.getClass();
                w1g.y(np2Var, uri, true);
                ((np2) bi1Var.b).finish();
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                ArrayList b = ((il1) this.k).a.b((String) this.l);
                ArrayList arrayList = new ArrayList();
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    z75.t(arrayList, ((oq) it.next()).F);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    mqs mqsVar = (mqs) next;
                    if (mqsVar == null) {
                        su4.s(2, null, "PermanentCachedTrackPredicate: track is null", null);
                        contains = false;
                    } else {
                        l18 l18Var = l18.b;
                        bdt I = hag.I(uaa.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        contains = ((lja) ((e6q) ((uaa) qdcVar.C(I))).e.getValue()).a.contains(mqsVar.a);
                    }
                    if (contains) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            case 10:
                UserDatabase userDatabase = (UserDatabase) this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                return new u62(bg3.v(userDatabase.w().a, false, new String[]{"auto_tracks_cache_info"}, new uv1(18)), (w62) this.l, i2);
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                yfx yfxVar = ((a72) this.k).a;
                css cssVar = (css) this.l;
                cssVar.getClass();
                xdr xdrVar = saa.a;
                String str4 = ((frt) yfxVar.c).c().a;
                str4.getClass();
                ssg.a(4, "AutoDownloadTracksCacheInfoDatabaseImpl", "get all for user " + str4 + ", cacheType=" + cssVar, null);
                hb2 a = ((w62) yfxVar.b).a(str4);
                a.getClass();
                return w62.c((List) up6.F(a.a, true, false, new gb2(cssVar, i3)));
            case 12:
                Integer num = (Integer) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                ArrayList arrayList3 = ((hou) this.l).c;
                return num != null ? CollectionsKt.q0(arrayList3, num.intValue()) : arrayList3;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(ost.a(((xf2) this.k).a, (xxq) this.l).a.getBoolean("autoplay_enabled", true));
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(Context.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                Context context = (Context) qdcVar2.C(I2);
                fj2 fj2Var = (fj2) this.l;
                try {
                    r7o r7oVar = z7o.b;
                    if (fj2Var.h()) {
                        new File(context.getFilesDir(), "details_enabled").createNewFile();
                    } else {
                        new File(context.getFilesDir(), "details_enabled").delete();
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                return Unit.a;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                wnd wndVar = ((rx2) this.k).e;
                Intent intent = (Intent) this.l;
                Context context2 = wndVar.b;
                if (intent != null) {
                    Intent addFlags = new Intent(intent).addFlags(268435456);
                    if (addFlags.resolveActivity(context2.getPackageManager()) != null) {
                        try {
                            context2.startActivity(addFlags);
                        } catch (ActivityNotFoundException unused2) {
                        }
                        return Unit.a;
                    }
                }
                y5g.o0(context2, context2.getString(R.string.error_unknown));
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                Function1 function1 = (Function1) this.k;
                Boolean bool = (Boolean) ((sdr) this.l).getValue();
                bool.booleanValue();
                function1.invoke(bool);
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                dv3 dv3Var = (dv3) this.k;
                ContentResolver contentResolver = dv3Var.a.getContentResolver();
                contentResolver.getClass();
                try {
                    continuation = contentResolver.query((Uri) dv3Var.b.getValue(), new String[]{"CarConnectionState"}, null, null, null);
                } catch (IllegalArgumentException e2) {
                    ssg.a(6, "CarConnectionTracker", "ContentProvider argument error", e2);
                    failedAssertionException = new FailedAssertionException("error querying car connection");
                    Assertions.throwOrSkip("CarConnectionTracker", failedAssertionException);
                } catch (IllegalStateException e3) {
                    ssg.a(6, "CarConnectionTracker", "ContentProvider state error", e3);
                    failedAssertionException = new FailedAssertionException("error querying car connection");
                    Assertions.throwOrSkip("CarConnectionTracker", failedAssertionException);
                } catch (SecurityException e4) {
                    ssg.a(6, "CarConnectionTracker", "ContentProvider authority error", e4);
                    failedAssertionException = new FailedAssertionException("error querying car connection");
                    Assertions.throwOrSkip("CarConnectionTracker", failedAssertionException);
                } catch (RuntimeException e5) {
                    ssg.a(6, "CarConnectionTracker", "ContentProvider runtime error", e5);
                }
                if (continuation != null) {
                    Closeable closeable = (Closeable) continuation;
                    mm6 mm6Var2 = (ltm) this.l;
                    try {
                        Cursor cursor = (Cursor) closeable;
                        if (cursor.moveToNext() && (columnIndex = cursor.getColumnIndex("CarConnectionState")) >= 0) {
                            int i6 = cursor.getInt(columnIndex);
                            Object obj5 = av3.a;
                            if (i6 != 0) {
                                if (i6 == 1) {
                                    obj5 = zu3.a;
                                } else if (i6 != 2) {
                                    Assertions.throwOrSkip("CarConnectionTracker", new FailedAssertionException("Unknown connection state: " + i6));
                                } else {
                                    obj5 = yu3.a;
                                }
                            }
                            ((oc4) mm6Var2).c(obj5);
                        }
                        closeable.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            yd5.q(closeable, th);
                            throw th2;
                        }
                    }
                }
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                ny3 ny3Var = (ny3) this.k;
                int q = ((fp7) this.l).q();
                az3 az3Var = ny3Var.b;
                Integer c = ny3Var.c();
                if (c != null && q != (intValue = c.intValue())) {
                    p6g p6gVar = wur.a;
                    int i7 = q - intValue;
                    if (i7 <= 0) {
                        if (i7 < 0) {
                            p6gVar = vur.a;
                        } else {
                            dfi.r("Diff must not be zero", "SwipeDirection");
                        }
                    }
                    az3Var.H(q);
                    ny3Var.d(intValue, p6gVar);
                    bz2 bz2Var = az3Var.o;
                    Integer b2 = ny3Var.b();
                    nmb nmbVar = (nmb) bz2Var.c;
                    emb[] embVarArr = emb.a;
                    int intValue2 = b2 != null ? b2.intValue() : -1;
                    nmbVar.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("stories_type", "promo_stories");
                    ouj.y(intValue2, linkedHashMap, "stories_count", q, "stories_pos");
                    dfi.p(1, "stories_name", "", "_meta", linkedHashMap);
                    nmbVar.C("Stories.Showed", linkedHashMap);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                i44 i44Var = (i44) this.k;
                i44Var.f.l(null);
                i44Var.b((String) this.l);
                return Unit.a;
            case 20:
                f34 f34Var = (f34) this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                return new e44((a44) this.l, f34Var);
            case 21:
                xxq xxqVar = (xxq) this.k;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                ((c74) this.l).d = xxqVar.a;
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                h84 h84Var = (h84) this.k;
                p5d p5dVar = (p5d) this.l;
                h84.y(h84Var, p5dVar.a, p5dVar.b, p5dVar.d, p5dVar.e.a);
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                m64 m64Var = ((h84) this.k).e;
                m64Var.i = ((h4q) this.l).a;
                if (m64Var.e != null) {
                    x97.y(m64Var.a, null, null, new k64(m64Var, continuation, 5), 3);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                List<oq> list = (List) this.k;
                ArrayList arrayList4 = new ArrayList(v75.o(list, 10));
                for (oq oqVar3 : list) {
                    oqVar3.getClass();
                    arrayList4.add(new q75(oqVar3));
                }
                List<kjm> list2 = (List) this.l;
                ArrayList arrayList5 = new ArrayList(v75.o(list2, 10));
                for (kjm kjmVar : list2) {
                    kjmVar.getClass();
                    arrayList5.add(new r75(kjmVar));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    q75 q75Var = (q75) it3.next();
                    q75Var.getClass();
                    linkedHashMap2.put(q75Var.a.a, q75Var);
                }
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    r75 r75Var = (r75) it4.next();
                    r75Var.getClass();
                    linkedHashMap2.putIfAbsent(r75Var.a.b, r75Var);
                }
                return CollectionsKt.w0(linkedHashMap2.values());
            case 25:
                vat vatVar = (vat) this.k;
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                List list3 = (List) vatVar.a;
                List list4 = (List) vatVar.b;
                rj6 rj6Var = (rj6) vatVar.c;
                xv4 xv4Var = (xv4) this.l;
                ((yv4) xv4Var.s.getValue()).getClass();
                list3.getClass();
                Iterator it5 = list3.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj2 = it5.next();
                        if (((vbc) obj2).b()) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                vbc vbcVar = (vbc) obj2;
                int ordinal = (vbcVar != null ? yv4.a(vbcVar) : dk1.a).ordinal();
                if (ordinal == 0) {
                    o0 = CollectionsKt.o0(list4, new dl4(7));
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    o0 = CollectionsKt.o0(list4, new dl4(i));
                }
                return new uv4(xv4Var, list4, o0, (to1) jf0.F(rj6Var));
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                oq oqVar4 = (oq) this.k;
                cus cusVar = (cus) ((u12) this.l).c.getValue();
                String str5 = oqVar4.a;
                cusVar.getClass();
                oqVar4.k(cus.b(str5, true));
                return oqVar4;
            case 27:
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                return ((xh1) ((xiu) this.k).c).d(((drf) this.l).a());
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                rd5 rd5Var = (rd5) this.k;
                sdl sdlVar = ((wd5) ((xd5) this.l)).e;
                rd5Var.getClass();
                rd5Var.a.b(sdlVar);
                rd5Var.b.b(sdlVar);
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                d31 d31Var = (d31) this.k;
                tdl tdlVar = ((f31) ((g31) this.l)).c;
                d31Var.getClass();
                d31Var.a.b(tdlVar);
                d31Var.b.b(tdlVar);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(Continuation continuation, g41 g41Var) {
        super(2, continuation);
        this.j = 6;
        this.l = g41Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qi(Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }
}
