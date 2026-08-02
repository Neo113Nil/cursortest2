package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.music.shared.wizard3.network.dto.WizardArtistCoordinatesDto;
import com.yandex.music.shared.wizard3.network.dto.WizardArtistCoordinatesRequestDto;
import com.yandex.music.shared.wizard3.network.dto.WizardArtistCoverDto;
import com.yandex.music.shared.wizard3.network.dto.WizardFullArtistDto;
import com.yandex.music.shared.wizard3.network.dto.WizardProgressDto;
import com.yandex.music.shared.wizard3.network.dto.WizardSimplifiedArtistRequestDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import j$.time.LocalDate;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public abstract class o8g {
    public static final boolean A(rfk rfkVar) {
        return CollectionsKt.I(xz0.Y(new rfk[]{nfk.a, hfk.a}), rfkVar);
    }

    public static final boolean B(rfk rfkVar) {
        return (rfkVar instanceof pfk) && ((pfk) rfkVar).b;
    }

    public static final void C(rsr rsrVar, String str) {
        rsrVar.getClass();
        jch b = new Regex("^CREATE TABLE IF NOT EXISTS `([^`]+)` (\\(.+\\))$").b(str);
        if (b == null) {
            xq0.x("Table name not found");
            return;
        }
        String str2 = (String) ((fb9) b.a()).get(1);
        String str3 = (String) ((fb9) b.a()).get(2);
        Set A0 = CollectionsKt.A0(jhp.k(new o7t(Regex.c(new Regex("`([^`]+)`"), str3), new p1i(5))));
        rsrVar.execSQL("CREATE TABLE IF NOT EXISTS `_" + str2 + "` " + str3);
        Cursor query = rsrVar.query("SELECT COUNT(*) FROM sqlite_master WHERE name = ?", new String[]{str2});
        try {
            Cursor cursor = query;
            cursor.moveToFirst();
            boolean z = cursor.getInt(0) > 0;
            yd5.q(query, null);
            if (z) {
                String X = CollectionsKt.X(A0, null, null, null, null, 63);
                StringBuilder m = f1d.m("INSERT INTO _", str2, " (", X, ") SELECT ");
                m.append(X);
                m.append(" FROM ");
                m.append(str2);
                rsrVar.execSQL(m.toString());
                rsrVar.execSQL("DROP TABLE " + str2);
            }
            rsrVar.execSQL("ALTER TABLE _" + str2 + " RENAME TO " + str2);
        } finally {
        }
    }

    public static void D(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                throw new RuntimeException(hrg.n(cls.getDeclaredConstructor(null).newInstance(null), "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                S(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                S(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                S(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                S(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final s9p E(List list) {
        List split$default;
        Object h9pVar;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            Object obj = r9p.a;
            if (!hasNext) {
                if (!z && !arrayList.isEmpty()) {
                    return new s9p(arrayList);
                }
                Assertions.throwOrSkip("EmptySeeds", new FailedAssertionException(hrg.q("error parse seeds [", CollectionsKt.X(list2, null, null, null, san.d, 31), "]")));
                return new s9p(t75.c(obj));
            }
            String str = (String) it.next();
            if (!Intrinsics.d(str, "user:onyourwave")) {
                split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, false, 0, 6, null);
                if (split$default.size() == 2) {
                    String str2 = (String) split$default.get(0);
                    String str3 = (String) split$default.get(1);
                    switch (str2.hashCode()) {
                        case -1655966961:
                            if (str2.equals("activity")) {
                                h9pVar = new h9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        case -1409097913:
                            if (str2.equals("artist")) {
                                h9pVar = new j9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        case 3357431:
                            if (str2.equals("mood")) {
                                h9pVar = new n9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        case 92896879:
                            if (str2.equals("album")) {
                                h9pVar = new i9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        case 96722057:
                            if (str2.equals("epoch")) {
                                h9pVar = new k9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        case 98240899:
                            if (str2.equals("genre")) {
                                h9pVar = new l9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        case 110621003:
                            if (str2.equals("track")) {
                                h9pVar = new q9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        case 1879474642:
                            if (str2.equals("playlist")) {
                                h9pVar = new p9p(str3);
                                obj = h9pVar;
                                break;
                            }
                            obj = new o9p(str2, str3);
                            break;
                        default:
                            obj = new o9p(str2, str3);
                            break;
                    }
                } else {
                    obj = null;
                    z = true;
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
    }

    public static final Object F(Handler handler, lyr lyrVar) {
        Object obj;
        handler.getClass();
        if (Intrinsics.d(handler.getLooper(), Looper.myLooper())) {
            return lyrVar.run();
        }
        synchronized (handler) {
            moj mojVar = new moj(handler, lyrVar);
            handler.post(mojVar);
            while (!mojVar.b) {
                try {
                    handler.wait();
                } catch (InterruptedException unused) {
                }
            }
            obj = mojVar.e;
            obj.getClass();
        }
        return obj;
    }

    public static final stw G(ikn iknVar) {
        int g = iknVar.g();
        if (g != 33639248) {
            throw new IOException("bad zip: expected " + v(33639248) + " but was " + v(g));
        }
        iknVar.skip(4L);
        short z = iknVar.z();
        int i = z & 65535;
        if ((z & 1) != 0) {
            kac.f("unsupported zip: general purpose bit flag=".concat(v(i)));
            return null;
        }
        int z2 = iknVar.z() & 65535;
        int z3 = iknVar.z() & 65535;
        int z4 = iknVar.z() & 65535;
        long g2 = iknVar.g() & 4294967295L;
        wqn wqnVar = new wqn();
        wqnVar.a = iknVar.g() & 4294967295L;
        wqn wqnVar2 = new wqn();
        wqnVar2.a = iknVar.g() & 4294967295L;
        int z5 = iknVar.z() & 65535;
        int z6 = iknVar.z() & 65535;
        int z7 = iknVar.z() & 65535;
        iknVar.skip(8L);
        wqn wqnVar3 = new wqn();
        wqnVar3.a = iknVar.g() & 4294967295L;
        String D = iknVar.D(z5);
        if (StringsKt.N(D, (char) 0)) {
            kac.f("bad zip: filename contains 0x00");
            return null;
        }
        long j = wqnVar2.a == 4294967295L ? 8 : 0L;
        if (wqnVar.a == 4294967295L) {
            j += 8;
        }
        if (wqnVar3.a == 4294967295L) {
            j += 8;
        }
        long j2 = j;
        xqn xqnVar = new xqn();
        xqn xqnVar2 = new xqn();
        xqn xqnVar3 = new xqn();
        tqn tqnVar = new tqn();
        H(iknVar, z6, new vtw(tqnVar, j2, wqnVar2, iknVar, wqnVar, wqnVar3, xqnVar, xqnVar2, xqnVar3));
        if (j2 > 0 && !tqnVar.a) {
            kac.f("bad zip: zip64 extra required but absent");
            return null;
        }
        String D2 = iknVar.D(z7);
        String str = cak.b;
        return new stw(h1b.M("/").d(D), c.n(D, "/", false), D2, g2, wqnVar.a, wqnVar2.a, z2, wqnVar3.a, z4, z3, (Long) xqnVar.a, (Long) xqnVar2.a, (Long) xqnVar3.a, 57344);
    }

    public static final void H(ikn iknVar, int i, Function2 function2) {
        hi3 hi3Var = iknVar.b;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                kac.f("bad zip: truncated header in extra field");
                return;
            }
            int z = iknVar.z() & 65535;
            long z2 = iknVar.z() & 65535;
            long j2 = j - 4;
            if (j2 < z2) {
                kac.f("bad zip: truncated value in extra field");
                return;
            }
            iknVar.a0(z2);
            long j3 = hi3Var.b;
            function2.invoke(Integer.valueOf(z), Long.valueOf(z2));
            long j4 = (hi3Var.b + z2) - j3;
            if (j4 < 0) {
                kac.f(k5r.i(z, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    hi3Var.skip(j4);
                }
                j = j2 - z2;
            }
        }
    }

    public static final stw I(ikn iknVar, stw stwVar) {
        int g = iknVar.g();
        if (g != 67324752) {
            throw new IOException("bad zip: expected " + v(67324752) + " but was " + v(g));
        }
        iknVar.skip(2L);
        short z = iknVar.z();
        int i = z & 65535;
        if ((z & 1) != 0) {
            kac.f("unsupported zip: general purpose bit flag=".concat(v(i)));
            return null;
        }
        iknVar.skip(18L);
        int z2 = iknVar.z() & 65535;
        iknVar.skip(iknVar.z() & 65535);
        if (stwVar == null) {
            iknVar.skip(z2);
            return null;
        }
        xqn xqnVar = new xqn();
        xqn xqnVar2 = new xqn();
        xqn xqnVar3 = new xqn();
        H(iknVar, z2, new utw(iknVar, xqnVar, xqnVar2, xqnVar3));
        return new stw(stwVar.a, stwVar.b, stwVar.c, stwVar.d, stwVar.e, stwVar.f, stwVar.g, stwVar.h, stwVar.i, stwVar.j, stwVar.k, stwVar.l, stwVar.m, (Integer) xqnVar.a, (Integer) xqnVar2.a, (Integer) xqnVar3.a);
    }

    public static final Object J(nyf nyfVar, lyf lyfVar, Function2 function2, Continuation continuation) {
        if (lyfVar == lyf.b) {
            xq0.x("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            return null;
        }
        if (nyfVar.b() == lyf.a) {
            return Unit.a;
        }
        Object Q = gld.Q(new rfg(nyfVar, lyfVar, function2, (Continuation) null), continuation);
        return Q == nm6.a ? Q : Unit.a;
    }

    public static final Object K(dzf dzfVar, lyf lyfVar, Function2 function2, Continuation continuation) {
        Object J = J(dzfVar.getLifecycle(), lyfVar, function2, continuation);
        return J == nm6.a ? J : Unit.a;
    }

    public static final void L(int i, int i2, Object[] objArr) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static lbt M(lbt lbtVar, String[] strArr, Map map) {
        int i = 0;
        if (lbtVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (lbt) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                lbt lbtVar2 = new lbt();
                int length = strArr.length;
                while (i < length) {
                    lbtVar2.a((lbt) map.get(strArr[i]));
                    i++;
                }
                return lbtVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                lbtVar.a((lbt) map.get(strArr[0]));
                return lbtVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    lbtVar.a((lbt) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return lbtVar;
    }

    public static final ArrayList N(Parcelable[] parcelableArr) {
        if (parcelableArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            parcelable.getClass();
            arrayList.add((rfk) parcelable);
        }
        return CollectionsKt.h0(arrayList, jfk.a);
    }

    public static final long O(long j, bxj bxjVar) {
        bxjVar.getClass();
        int ordinal = bxjVar.ordinal();
        if (ordinal == 0) {
            return swf.i(enj.e(j), -enj.f(j));
        }
        if (ordinal == 1) {
            return swf.i(-enj.e(j), enj.f(j));
        }
        b6e.s();
        return 0L;
    }

    public static final long P(long j) {
        if (j < 0) {
            return 0L;
        }
        if (j < 100) {
            return (j / 20) * 20;
        }
        if (j < 1000) {
            return (j / 100) * 100;
        }
        if (j < 2000) {
            return (j / 200) * 200;
        }
        if (j < 5000) {
            return (j / 500) * 500;
        }
        if (j < 10000) {
            return (j / 1000) * 1000;
        }
        if (j < 20000) {
            return (j / 2000) * 2000;
        }
        if (j < 50000) {
            return (j / 5000) * 5000;
        }
        return 50000L;
    }

    public static final String Q(g9p g9pVar) {
        g9pVar.getClass();
        return ouj.o(g9pVar.getType(), StringUtils.PROCESS_POSTFIX_DELIMITER, g9pVar.getTag());
    }

    public static final ArrayList R(s9p s9pVar) {
        s9pVar.getClass();
        List list = s9pVar.a;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Q((g9p) it.next()));
        }
        return arrayList;
    }

    public static void S(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(tlm.j("Unable to instantiate GlideModule implementation for ", cls), reflectiveOperationException);
    }

    public static final long T(long j) {
        dqf dqfVar = dqf.a;
        return ia6.a(ga6.k(j), ga6.i(j), ga6.j(j), ga6.h(j));
    }

    public static o1t U(zqt zqtVar) {
        int ordinal = zqtVar.ordinal();
        if (ordinal == 0) {
            return o1t.b;
        }
        if (ordinal == 1) {
            return o1t.c;
        }
        if (ordinal == 2) {
            return o1t.d;
        }
        if (ordinal == 3) {
            return o1t.e;
        }
        if (ordinal == 4) {
            return o1t.a;
        }
        b6e.s();
        return null;
    }

    public static n1t V(ve veVar, mqs mqsVar, o1t o1tVar) {
        boolean z;
        boolean z2;
        mqsVar.getClass();
        muo muoVar = veVar.a;
        muo muoVar2 = muo.TRAILER;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = muoVar != muoVar2;
        if (muoVar != muoVar2) {
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!mqsVar.p() || mqsVar.C()) {
            z2 = false;
        } else {
            z2 = false;
            z4 = z;
        }
        return new n1t(o1tVar, z5, z3, z4, muoVar == muo.DISLIKES ? z : z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList W(List list, boolean z) {
        boolean z2;
        String id;
        String name;
        wrv wrvVar;
        String uri;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WizardFullArtistDto wizardFullArtistDto = (WizardFullArtistDto) it.next();
            yrv yrvVar = null;
            if (wizardFullArtistDto != null && (id = wizardFullArtistDto.getId()) != null && (name = wizardFullArtistDto.getName()) != null) {
                WizardArtistCoverDto cover = wizardFullArtistDto.getCover();
                jcv jcvVar = (cover == null || (uri = cover.getUri()) == null) ? null : new jcv(uri, WebPath$Storage.AVATARS_NO_CROP);
                WizardArtistCoordinatesDto coordinates = wizardFullArtistDto.getCoordinates();
                if (coordinates != null) {
                    Integer x = coordinates.getX();
                    if (x != null) {
                        int intValue = x.intValue();
                        Integer y = coordinates.getY();
                        if (y != null) {
                            wrvVar = new wrv(intValue, y.intValue());
                            if (wrvVar != null) {
                                z2 = z;
                                yrvVar = new yrv(id, wrvVar, name, jcvVar, z2);
                                if (yrvVar == null) {
                                    arrayList.add(yrvVar);
                                }
                                z = z2;
                            }
                        }
                    }
                    wrvVar = null;
                    if (wrvVar != null) {
                    }
                }
            }
            z2 = z;
            if (yrvVar == null) {
            }
            z = z2;
        }
        return arrayList;
    }

    public static final b0w X(WizardProgressDto wizardProgressDto) {
        Integer minArtistsForPassedWizard;
        Object obj;
        String text = wizardProgressDto.getText();
        if (text != null && (minArtistsForPassedWizard = wizardProgressDto.getMinArtistsForPassedWizard()) != null) {
            int intValue = minArtistsForPassedWizard.intValue();
            Integer countOfLikedArtists = wizardProgressDto.getCountOfLikedArtists();
            if (countOfLikedArtists != null) {
                int intValue2 = countOfLikedArtists.intValue();
                Integer upperBoundOfLikes = wizardProgressDto.getUpperBoundOfLikes();
                if (upperBoundOfLikes != null) {
                    int intValue3 = upperBoundOfLikes.intValue();
                    Integer passBoundOfLikes = wizardProgressDto.getPassBoundOfLikes();
                    if (passBoundOfLikes != null) {
                        int intValue4 = passBoundOfLikes.intValue();
                        String type = wizardProgressDto.getType();
                        if (type != null) {
                            a0w.b.getClass();
                            Iterator it = a0w.d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((a0w) obj).a.equalsIgnoreCase(type)) {
                                    break;
                                }
                            }
                            a0w a0wVar = (a0w) obj;
                            if (a0wVar != null) {
                                return new b0w(text, intValue, intValue2, intValue3, intValue4, a0wVar);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final ArrayList Y(List list) {
        list.getClass();
        List<asv> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (asv asvVar : list2) {
            asvVar.getClass();
            String id = asvVar.getId();
            wrv b = asvVar.b();
            arrayList.add(new WizardSimplifiedArtistRequestDto(id, new WizardArtistCoordinatesRequestDto(b.a, b.b)));
        }
        return arrayList;
    }

    public static ArrayList Z(oq oqVar, mq mqVar) {
        Object gcjVar;
        LocalDate d;
        oqVar.getClass();
        mqVar.getClass();
        mq f = oqVar.f();
        List list = oqVar.F;
        if (mqVar != f) {
            list = CollectionsKt.j0(list);
        }
        List<ezs> A = avf.A(list);
        ArrayList arrayList = new ArrayList(v75.o(A, 10));
        for (ezs ezsVar : A) {
            if (ezsVar instanceof fzs) {
                mqs mqsVar = ((fzs) ezsVar).a;
                mqsVar.getClass();
                String j = mqsVar.j();
                boolean z = mqsVar.d.g;
                boolean z2 = mqsVar.m == WarningContent.EXPLICIT;
                jzb i = mqsVar.i();
                boolean o = mqsVar.o();
                Date date = mqsVar.x;
                gcjVar = new fcj(new dej(j, z, z2, i, o, (date == null || (d = gkg.d(date)) == null) ? null : new g0t(gkg.a(d), gkg.c(d)), true), mqsVar);
            } else {
                if (!(ezsVar instanceof gzs)) {
                    b6e.s();
                    return null;
                }
                gcjVar = new gcj(((gzs) ezsVar).a);
            }
            arrayList.add(gcjVar);
        }
        return arrayList;
    }

    public static final void a(int i, hq5 hq5Var, yci yciVar, String str) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1036225072);
        int i2 = i | (oq5Var.f(str) ? 4 : 2);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else if (str == null || StringsKt.U(str)) {
            oq5Var.Z(2043920382);
            yci u = xp3.u(yciVar, ugo.a);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, u);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ivf.k(6, 2, oq5Var, null, false);
            oq5Var.p(true);
            oq5Var.p(false);
        } else {
            oq5Var.Z(2044063571);
            w1g.j(str, null, null, null, null, b2c.f, hd6.a, 0.0f, null, 0, ild.C(-201941356, new wv3(yciVar, 1), oq5Var), oq5Var, (i2 & 14) | 1769520, 924);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cb1(str, yciVar, i, 17);
        }
    }

    public static void a0(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        q0(i, 4, parcel);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static final void b(ub7 ub7Var, fvf fvfVar, o0k o0kVar, boolean z, lti ltiVar, tmb tmbVar, hq5 hq5Var, int i) {
        int i2;
        ogp ogpVar = ogp.g;
        fvfVar.getClass();
        o0kVar.getClass();
        ltiVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(56965428);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(ub7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? oq5Var.f(ltiVar) : oq5Var.h(ltiVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i2 |= (262144 & i) == 0 ? oq5Var.f(tmbVar) : oq5Var.h(tmbVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var.P(i2 & 1, (74899 & i2) != 74898)) {
            lvf a = ovf.a(ub7Var, oq5Var);
            mb5 e = a.e();
            qu2 qu2Var = e.a;
            boolean z2 = qu2Var instanceof lfg;
            Object obj = gq5.a;
            if (z2 && a.d() == 0) {
                oq5Var.Z(545455078);
                ogpVar.e(true, false, null, oq5Var, 4102, 6);
                yci x = d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vci.a, o0kVar), 1.0f), bfg.C(oq5Var), false, 14), b2c.f, 2);
                boolean h = oq5Var.h(a);
                Object K = oq5Var.K();
                if (h || K == obj) {
                    K = new kti(a, 0);
                    oq5Var.k0(K);
                }
                rvf.j((Function1) K, tmbVar, x, 0, true, null, oq5Var, 24640 | ((i2 >> 12) & 112), 40);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                mfg mfgVar = mfg.b;
                if (Intrinsics.d(qu2Var, mfgVar) && a.d() == 0) {
                    oq5Var.Z(545982760);
                    ogpVar.e(false, true, null, oq5Var, 4144, 5);
                    dag.c(o0kVar, null, oq5Var, (i2 >> 6) & 14);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(546190398);
                    ogpVar.e(false, false, null, oq5Var, 4096, 7);
                    boolean d = Intrinsics.d(qu2Var, mfgVar);
                    boolean h2 = oq5Var.h(a);
                    Object K2 = oq5Var.K();
                    if (h2 || K2 == obj) {
                        K2 = new ul1(a, 1);
                        oq5Var.k0(K2);
                    }
                    bfg.f(d, (Function0) K2, o0kVar, null, false, ild.C(-1929801328, new k5b(fvfVar, o0kVar, e, a, ltiVar, z), oq5Var), oq5Var, (i2 & 896) | 196608, 24);
                    oq5Var.p(false);
                }
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(i, 12, ub7Var, fvfVar, o0kVar, ltiVar, tmbVar, z);
        }
    }

    public static void b0(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeBundle(bundle);
        p0(parcel, o0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0500, code lost:
    
        if (r5 == r4) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ea, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r15.K(), java.lang.Integer.valueOf(r0)) == false) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a4  */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v1, types: [hq5, java.lang.Object, oq5] */
    /* JADX WARN: Type inference failed for: r2v24, types: [lke] */
    /* JADX WARN: Type inference failed for: r32v0, types: [java.lang.Object, wn5] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [vtb] */
    /* JADX WARN: Type inference failed for: r8v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25, types: [vtb] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final na0 na0Var, h4b h4bVar, aqi aqiVar, wn5 wn5Var, sdr sdrVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Object ckgVar;
        jx7 jx7Var;
        kjn kjnVar;
        iz2 iz2Var;
        int i3;
        h4b h4bVar2;
        agr agrVar;
        final fk0 fk0Var;
        kb5 kb5Var;
        kb5 kb5Var2;
        kjn kjnVar2;
        kb5 kb5Var3;
        iz2 iz2Var2;
        Integer num;
        kb5 kb5Var4;
        kb5 kb5Var5;
        int i4;
        boolean z;
        fk0 fk0Var2;
        float f;
        ja0 ja0Var;
        ?? r8;
        boolean z2;
        boolean z3;
        kjn kjnVar3;
        Object obj;
        Object obj2;
        final float f2;
        kb5 kb5Var6;
        kb5 kb5Var7;
        kb5 kb5Var8;
        yci yciVar2;
        aqi aqiVar2;
        aqi aqiVar3;
        boolean z4;
        vtb vtbVar;
        boolean z5;
        vtb vtbVar2;
        yci yciVar3;
        int i5;
        ?? r2;
        boolean z6;
        vdr vdrVar = (vdr) h4bVar.a;
        iz2 iz2Var3 = b2c.b;
        aqiVar.getClass();
        sdrVar.getClass();
        ?? r15 = (oq5) hq5Var;
        r15.b0(38743882);
        if ((i & 6) == 0) {
            i2 = (r15.f(na0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= r15.f(h4bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= r15.f(aqiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= r15.h(wn5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= r15.f(sdrVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= r15.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i6 = i2;
        if (r15.P(i6 & 1, (i6 & 74899) != 74898)) {
            agr agrVar2 = es5.h;
            jx7 jx7Var2 = (jx7) r15.j(agrVar2);
            Object K = r15.K();
            kjn kjnVar4 = gq5.a;
            Object obj3 = K;
            if (K == kjnVar4) {
                x6k g0 = szf.g0(vdrVar.getValue());
                r15.k0(g0);
                obj3 = g0;
            }
            aqi aqiVar4 = (aqi) obj3;
            Object K2 = r15.K();
            Object obj4 = K2;
            if (K2 == kjnVar4) {
                x6k g02 = szf.g0(null);
                r15.k0(g02);
                obj4 = g02;
            }
            aqi aqiVar5 = (aqi) obj4;
            Object K3 = r15.K();
            Object obj5 = K3;
            if (K3 == kjnVar4) {
                fk0 a = vq2.a(((lke) vdrVar.getValue()) != null ? 1.0f : 0.0f);
                r15.k0(a);
                obj5 = a;
            }
            fk0 fk0Var3 = (fk0) obj5;
            float Q = ff7.Q(qt4.j(r15), r15);
            boolean h = ((i6 & 112) == 32) | r15.h(fk0Var3) | r15.f(jx7Var2);
            Object K4 = r15.K();
            if (h || K4 == kjnVar4) {
                jx7Var = jx7Var2;
                kjnVar = kjnVar4;
                iz2Var = iz2Var3;
                i3 = 0;
                h4bVar2 = h4bVar;
                agrVar = agrVar2;
                fk0Var = fk0Var3;
                ckgVar = new ckg(h4bVar2, fk0Var, aqiVar4, jx7Var, aqiVar5, null, 14);
                r15.k0(ckgVar);
            } else {
                ckgVar = K4;
                jx7Var = jx7Var2;
                kjnVar = kjnVar4;
                iz2Var = iz2Var3;
                i3 = 0;
                h4bVar2 = h4bVar;
                agrVar = agrVar2;
                fk0Var = fk0Var3;
            }
            gld.y(h4bVar2, jx7Var, (Function2) ckgVar, r15);
            final o6g E = jf0.E(r15);
            final long j = ((dq0) r15.j(eq0.a)).c.a;
            ja0 ja0Var2 = na0Var.e;
            Object K5 = r15.K();
            Object obj6 = K5;
            if (K5 == kjnVar) {
                x6k g03 = szf.g0(Integer.valueOf(i3));
                r15.k0(g03);
                obj6 = g03;
            }
            aqi aqiVar6 = (aqi) obj6;
            agr agrVar3 = agrVar;
            final aqi aqiVar7 = aqiVar5;
            vtb vtbVar3 = new vtb(14, aqiVar, na0Var, ja0Var2);
            Object K6 = r15.K();
            Object obj7 = K6;
            if (K6 == kjnVar) {
                x80 x80Var = new x80(aqiVar6, 18);
                r15.k0(x80Var);
                obj7 = x80Var;
            }
            Function1 function1 = (Function1) obj7;
            ja0Var2.getClass();
            function1.getClass();
            gab gabVar = new gab(9, ja0Var2, function1);
            vci vciVar = vci.a;
            yci f3 = yciVar.f(androidx.compose.ui.layout.a.b(vciVar, gabVar));
            Object K7 = r15.K();
            Object obj8 = K7;
            if (K7 == kjnVar) {
                yh0 yh0Var = new yh0(1, aqiVar4, aqiVar6);
                r15.k0(yh0Var);
                obj8 = yh0Var;
            }
            kfh kfhVar = (kfh) obj8;
            int i7 = r15.P;
            a l = r15.l();
            yci H = vnj.H(r15, f3);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            r15.d0();
            final aqi aqiVar8 = aqiVar4;
            if (r15.O) {
                r15.k(grbVar);
            } else {
                r15.n0();
            }
            kb5 kb5Var9 = wp5.f;
            g0g.U(r15, kfhVar, kb5Var9);
            kb5 kb5Var10 = wp5.e;
            g0g.U(r15, l, kb5Var10);
            kb5 kb5Var11 = wp5.g;
            if (r15.O) {
                kb5Var = kb5Var10;
            } else {
                kb5Var = kb5Var10;
            }
            ouj.x(i7, r15, i7, kb5Var11);
            kb5 kb5Var12 = wp5.d;
            g0g.U(r15, H, kb5Var12);
            if (((Boolean) sdrVar.getValue()).booleanValue()) {
                kb5Var2 = kb5Var12;
                kjnVar2 = kjnVar;
                kb5Var3 = kb5Var11;
                iz2Var2 = iz2Var;
                ?? r12 = i3;
                num = 6;
                kb5Var4 = kb5Var9;
                kb5Var5 = kb5Var;
                i4 = -158237489;
                z = true;
                fk0Var2 = fk0Var;
                f = Q;
                ja0Var = ja0Var2;
                r8 = vtbVar3;
                r15.Z(-158237489);
                r15.p(r12);
                z2 = r12;
            } else {
                r15.Z(-153240971);
                yci d = d.d(vciVar, 1.0f);
                boolean f4 = r15.f(ja0Var2);
                Object K8 = r15.K();
                Object obj9 = K8;
                if (f4 || K8 == kjnVar) {
                    q90 q90Var = new q90(ja0Var2, 6);
                    r15.k0(q90Var);
                    obj9 = q90Var;
                }
                yci s = wyf.s(d, (Function0) obj9);
                int i8 = ((i6 & 14) == 4 ? 1 : i3) | (r15.c(Q) ? 1 : 0) | (r15.h(fk0Var) ? 1 : 0) | (r15.f(jx7Var) ? 1 : 0) | (r15.e(j) ? 1 : 0) | (r15.f(E) ? 1 : 0);
                Object K9 = r15.K();
                if (i8 != 0 || K9 == kjnVar) {
                    ja0Var = ja0Var2;
                    f2 = Q;
                    kb5Var6 = kb5Var12;
                    final jx7 jx7Var3 = jx7Var;
                    kb5Var7 = kb5Var11;
                    kb5Var8 = kb5Var;
                    yciVar2 = s;
                    obj2 = new Function1() { // from class: jjl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj10) {
                            jpa jpaVar = (jpa) obj10;
                            jpaVar.getClass();
                            float l2 = o8g.l(na0.this, f2, aqiVar8, fk0Var);
                            ocg I = ugo.c(l2, l2).I(jpaVar.e(), jpaVar.getLayoutDirection(), jx7Var3);
                            if (aqiVar7.getValue() != null) {
                                pcg.z(jpaVar, I, j, null, 60);
                            } else {
                                pcg.y(jpaVar, I, E, 0.0f, 60);
                            }
                            return Unit.a;
                        }
                    };
                    aqiVar2 = aqiVar8;
                    aqiVar3 = aqiVar7;
                    r15.k0(obj2);
                } else {
                    kb5Var6 = kb5Var12;
                    obj2 = K9;
                    kb5Var7 = kb5Var11;
                    f2 = Q;
                    aqiVar3 = aqiVar7;
                    aqiVar2 = aqiVar8;
                    kb5Var8 = kb5Var;
                    yciVar2 = s;
                    ja0Var = ja0Var2;
                }
                ?? r82 = i3;
                ug3.a(androidx.compose.ui.layout.a.c(androidx.compose.ui.draw.a.a(yciVar2, (Function1) obj2), "CommonBackground"), r15, r82 == true ? 1 : 0);
                iz2 iz2Var4 = b2c.f;
                yci d2 = d.d(vciVar, 1.0f);
                boolean f5 = r15.f(ja0Var);
                Object K10 = r15.K();
                Object obj10 = K10;
                if (f5 || K10 == kjnVar) {
                    q90 q90Var2 = new q90(ja0Var, 7);
                    r15.k0(q90Var2);
                    obj10 = q90Var2;
                }
                yci s2 = wyf.s(d2, (Function0) obj10);
                boolean h2 = r15.h(fk0Var);
                Object K11 = r15.K();
                Object obj11 = K11;
                if (h2 || K11 == kjnVar) {
                    in6 in6Var = new in6(fk0Var, 1);
                    r15.k0(in6Var);
                    obj11 = in6Var;
                }
                yci c = androidx.compose.ui.layout.a.c(androidx.compose.ui.layout.a.b(s2, (pyc) obj11), "InformerLayoutId");
                kfh d3 = ug3.d(iz2Var4, r82);
                int i9 = r15.P;
                a l2 = r15.l();
                yci H2 = vnj.H(r15, c);
                r15.d0();
                if (r15.O) {
                    r15.k(grbVar);
                } else {
                    r15.n0();
                }
                kb5Var4 = kb5Var9;
                g0g.U(r15, d3, kb5Var4);
                kb5Var5 = kb5Var8;
                g0g.U(r15, l2, kb5Var5);
                if (r15.O || !Intrinsics.d(r15.K(), Integer.valueOf(i9))) {
                    kb5Var3 = kb5Var7;
                    ouj.x(i9, r15, i9, kb5Var3);
                } else {
                    kb5Var3 = kb5Var7;
                }
                kb5Var2 = kb5Var6;
                g0g.U(r15, H2, kb5Var2);
                lke lkeVar = (lke) aqiVar2.getValue();
                if (lkeVar != null) {
                    r15.Z(-1499298161);
                    boolean z7 = ja0Var.h.getValue() == lf3.c;
                    if (z7) {
                        aqiVar8 = aqiVar2;
                        if (lkeVar.d().contains(vke.a)) {
                            z5 = true;
                            if (z7 || z5) {
                                r15.Z(-1498744346);
                                r15.Z(-186888428);
                                yci e = d.e(vciVar, lkeVar.c((jx7) r15.j(agrVar3)));
                                if (lkeVar.d().contains(wke.a)) {
                                    num = 6;
                                    vtbVar2 = vtbVar3;
                                    yciVar3 = vciVar;
                                } else {
                                    num = 6;
                                    ?? r83 = vtbVar3;
                                    yciVar3 = (yci) r83.invoke(vciVar, r15, 6);
                                    vtbVar2 = r83;
                                }
                                yci f6 = e.f(yciVar3);
                                r15.p(false);
                                aqiVar7 = aqiVar3;
                                iz2Var2 = iz2Var;
                                fk0Var2 = fk0Var;
                                kfh d4 = ug3.d(iz2Var2, false);
                                i5 = r15.P;
                                f = f2;
                                a l3 = r15.l();
                                yci H3 = vnj.H(r15, f6);
                                r15.d0();
                                kjnVar2 = kjnVar;
                                if (r15.O) {
                                    r15.n0();
                                } else {
                                    r15.k(grbVar);
                                }
                                g0g.U(r15, d4, kb5Var4);
                                g0g.U(r15, l3, kb5Var5);
                                if (!r15.O || !Intrinsics.d(r15.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, r15, i5, kb5Var3);
                                }
                                g0g.U(r15, H3, kb5Var2);
                                r2 = (lke) aqiVar8.getValue();
                                if (r2 != 0) {
                                    r15.Z(-1795105319);
                                    z6 = false;
                                } else {
                                    z6 = false;
                                    r15.Z(-889190616);
                                    r2.b(0, r15);
                                }
                                r15.p(z6);
                                z = true;
                                r15.p(true);
                                r15.p(z6);
                                vtbVar = vtbVar2;
                                z4 = z6;
                            } else {
                                r15.Z(-1506663513);
                                r15.p(false);
                                aqiVar7 = aqiVar3;
                                z4 = false;
                                kjnVar2 = kjnVar;
                                iz2Var2 = iz2Var;
                                num = 6;
                                vtbVar = vtbVar3;
                                z = true;
                                f = f2;
                                fk0Var2 = fk0Var;
                            }
                        }
                    } else {
                        aqiVar8 = aqiVar2;
                    }
                    z5 = false;
                    if (z7) {
                    }
                    r15.Z(-1498744346);
                    r15.Z(-186888428);
                    yci e2 = d.e(vciVar, lkeVar.c((jx7) r15.j(agrVar3)));
                    if (lkeVar.d().contains(wke.a)) {
                    }
                    yci f62 = e2.f(yciVar3);
                    r15.p(false);
                    aqiVar7 = aqiVar3;
                    iz2Var2 = iz2Var;
                    fk0Var2 = fk0Var;
                    kfh d42 = ug3.d(iz2Var2, false);
                    i5 = r15.P;
                    f = f2;
                    a l32 = r15.l();
                    yci H32 = vnj.H(r15, f62);
                    r15.d0();
                    kjnVar2 = kjnVar;
                    if (r15.O) {
                    }
                    g0g.U(r15, d42, kb5Var4);
                    g0g.U(r15, l32, kb5Var5);
                    if (!r15.O) {
                    }
                    ouj.x(i5, r15, i5, kb5Var3);
                    g0g.U(r15, H32, kb5Var2);
                    r2 = (lke) aqiVar8.getValue();
                    if (r2 != 0) {
                    }
                    r15.p(z6);
                    z = true;
                    r15.p(true);
                    r15.p(z6);
                    vtbVar = vtbVar2;
                    z4 = z6;
                } else {
                    aqiVar8 = aqiVar2;
                    aqiVar7 = aqiVar3;
                    z4 = r82 == true ? 1 : 0;
                    kjnVar2 = kjnVar;
                    iz2Var2 = iz2Var;
                    num = 6;
                    vtbVar = vtbVar3;
                    z = true;
                    f = f2;
                    fk0Var2 = fk0Var;
                    r15.Z(-1506663513);
                }
                r15.p(z4);
                r15.p(z);
                r15.p(z4);
                i4 = -158237489;
                r8 = vtbVar;
                z2 = z4;
            }
            yci yciVar4 = (yci) r8.invoke(androidx.compose.ui.layout.a.c(d.d(vciVar, 1.0f), "PlayerScreenBottomSheetCapLayoutId"), r15, num);
            kfh d5 = ug3.d(iz2Var2, z2);
            int i10 = r15.P;
            a l4 = r15.l();
            yci H4 = vnj.H(r15, yciVar4);
            r15.d0();
            if (r15.O) {
                r15.k(grbVar);
            } else {
                r15.n0();
            }
            g0g.U(r15, d5, kb5Var4);
            g0g.U(r15, l4, kb5Var5);
            if (r15.O || !Intrinsics.d(r15.K(), Integer.valueOf(i10))) {
                ouj.x(i10, r15, i10, kb5Var3);
            }
            g0g.U(r15, H4, kb5Var2);
            wn5Var.invoke(r15, Integer.valueOf((i6 >> 9) & 14));
            r15.p(z);
            kke kkeVar = (kke) aqiVar7.getValue();
            if (kkeVar == null || ((Boolean) sdrVar.getValue()).booleanValue()) {
                z3 = false;
                r15.Z(i4);
            } else {
                r15.Z(-149371830);
                final long F = nt0.F(Integer.valueOf(kkeVar.a), r15, 0);
                final boolean g = ((ma5) r15.j(pa5.a)).g();
                yci d6 = d.d(vciVar, 1.0f);
                boolean f7 = r15.f(ja0Var);
                Object K12 = r15.K();
                if (f7) {
                    kjnVar3 = kjnVar2;
                } else {
                    kjnVar3 = kjnVar2;
                    obj = K12;
                }
                q90 q90Var3 = new q90(ja0Var, 8);
                r15.k0(q90Var3);
                obj = q90Var3;
                yci s3 = wyf.s(d6, (Function0) obj);
                final float f8 = f;
                final fk0 fk0Var4 = fk0Var2;
                boolean e3 = r15.e(F) | ((i6 & 14) == 4 ? z : false) | r15.c(f8) | r15.h(fk0Var4) | r15.g(g);
                Object K13 = r15.K();
                if (e3 || K13 == kjnVar3) {
                    final aqi aqiVar9 = aqiVar8;
                    Function1 function12 = new Function1() { // from class: kjl
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj12) {
                            np3 np3Var = (np3) obj12;
                            np3Var.getClass();
                            float d7 = nmq.d(np3Var.a.e());
                            float b = nmq.b(np3Var.a.e());
                            float density = np3Var.getDensity() * o8g.l(na0Var, f8, aqiVar9, fk0Var4);
                            nh0 a2 = ph0.a();
                            eak.a(a2, cb0.l(ywf.d(0L, np3Var.a.e()), x97.f(density, density), x97.f(density, density), x97.f(0.0f, 0.0f), x97.f(0.0f, 0.0f)));
                            float f9 = g ? 0.2f : 0.32f;
                            Float valueOf = Float.valueOf(0.0f);
                            long j2 = F;
                            float f10 = 2;
                            return np3Var.b(new jke(a2, (((np3Var.getDensity() * 80) * f10) + d7) / b, y9w.N(new Pair[]{new Pair(valueOf, new d85(d85.b(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.55f), new d85(d85.b(j2, 0.58f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, b / f10, 10), f9, 1));
                        }
                    };
                    r15.k0(function12);
                    K13 = function12;
                }
                z3 = false;
                ug3.a(androidx.compose.ui.layout.a.c(androidx.compose.ui.draw.a.b(s3, (Function1) K13), "InformerGlowLayoutId"), r15, 0);
            }
            r15.p(z3);
            r15.p(z);
        } else {
            r15.S();
        }
        xmn r = r15.r();
        if (r != null) {
            r.d = new uu0(na0Var, h4bVar, aqiVar, (Object) wn5Var, sdrVar, yciVar, i, 12);
        }
    }

    public static void c0(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeByteArray(bArr);
        p0(parcel, o0);
    }

    public static final void d(qzc qzcVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        qzcVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1284470306);
        int i2 = (oq5Var.f(qzcVar) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new s8i(25, qzcVar);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            androidx.compose.ui.viewinterop.a.a(i2 & 112, 4, oq5Var, yciVar2, (Function1) K, null);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(qzcVar, yciVar2, i, 18);
        }
    }

    public static void d0(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeStrongBinder(iBinder);
        p0(parcel, o0);
    }

    public static final void e(otb otbVar, zfr zfrVar, Function1 function1, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        otbVar.getClass();
        zfrVar.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1411303808);
        if ((i & 48) == 0) {
            i2 = (oq5Var2.f(zfrVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = 0;
        if (oq5Var2.P(i2 & 1, (74897 & i2) != 74896)) {
            boolean z = (57344 & i2) == 16384;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            Continuation continuation = null;
            if (z || K == kjnVar) {
                K = new om0(function02, continuation, 3);
                oq5Var2.k0(K);
            }
            int i4 = i2 >> 3;
            gld.w(oq5Var2, zfrVar, (Function2) K);
            two C = bfg.C(oq5Var2);
            boolean f = oq5Var2.f(C) | ((i2 & 7168) == 2048);
            Object K2 = oq5Var2.K();
            if (f || K2 == kjnVar) {
                K2 = new v0r(function0, C, continuation, 10);
                oq5Var2.k0(K2);
            }
            int i5 = i2 & 112;
            gld.y(C, zfrVar, (Function2) K2, oq5Var2);
            yci c = d.c(yciVar, 1.0f);
            o6g o6gVar = u2h.a;
            c.getClass();
            yci q1 = gut.q1(i4 & 112, oq5Var2, androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(c, new s2h(i3)), new s2h(2)), function1);
            kfh d = ug3.d(b2c.b, false);
            int i6 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, q1);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean z2 = i5 == 32;
            Object K3 = oq5Var2.K();
            if (z2 || K3 == kjnVar) {
                K3 = new kzp(22, zfrVar);
                oq5Var2.k0(K3);
            }
            weo.f(null, null, null, null, null, null, false, null, (Function1) K3, oq5Var2, 0, 511);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(otbVar, zfrVar, function1, function0, function02, yciVar, i, 13);
        }
    }

    public static void e0(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeIntArray(iArr);
        p0(parcel, o0);
    }

    public static final void f(final mcu mcuVar, boolean z, hq5 hq5Var, int i) {
        mcuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1143571699);
        int i2 = (oq5Var.f(mcuVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pbu pbuVar = (pbu) mcuVar.d().getValue();
            if (Intrinsics.d(pbuVar, lbu.a) || (pbuVar instanceof mbu) || Intrinsics.d(pbuVar, nbu.a)) {
                oq5Var.Z(-539217001);
                oq5Var.p(false);
            } else {
                if (!(pbuVar instanceof obu)) {
                    throw vz1.i(oq5Var, -539221389, false);
                }
                oq5Var.Z(464203907);
                ExoPlayer exoPlayer = ((obu) pbuVar).a;
                oq5Var.Z(-539207872);
                yci yciVar = vci.a;
                yci c = d.c(yciVar, 1.0f);
                int i3 = i2 & 14;
                boolean z2 = i3 == 4;
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (z2 || K == kjnVar) {
                    final int i4 = 0;
                    K = new Function0() { // from class: fcu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            float c2;
                            switch (i4) {
                                case 0:
                                    c2 = mcuVar.c();
                                    break;
                                default:
                                    c2 = mcuVar.a();
                                    break;
                            }
                            return Float.valueOf(c2);
                        }
                    };
                    oq5Var.k0(K);
                }
                yci s = wyf.s(c, (Function0) K);
                if (mcuVar.e()) {
                    long j = ((dq0) oq5Var.j(eq0.a)).c.d;
                    boolean z3 = i3 == 4;
                    Object K2 = oq5Var.K();
                    if (z3 || K2 == kjnVar) {
                        final int i5 = 1;
                        K2 = new Function0() { // from class: fcu
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float c2;
                                switch (i5) {
                                    case 0:
                                        c2 = mcuVar.c();
                                        break;
                                    default:
                                        c2 = mcuVar.a();
                                        break;
                                }
                                return Float.valueOf(c2);
                            }
                        };
                        oq5Var.k0(K2);
                    }
                    yciVar = androidx.compose.ui.draw.a.c(yciVar, new q4m(1, j, (Function0) K2, z));
                }
                yci f = s.f(yciVar);
                oq5Var.p(false);
                y7g.f(exoPlayer, f, null, null, oq5Var, 0, 12);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl3(mcuVar, z, i, 9);
        }
    }

    public static void f0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int o0 = o0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        p0(parcel, o0);
    }

    public static final void g(Function0 function0, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1012027774);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            s7g.k(ff7.d, ff7.e, ff7.f, ild.C(1241801043, new xtp(5, function0), oq5Var), vciVar, false, ff7.h, oq5Var, ((i2 << 9) & 57344) | 12586422, 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i80(function0, i, 7);
        }
    }

    public static void g0(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        q0(i, 4, parcel);
        parcel.writeInt(num.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0204, code lost:
    
        if (r9 == r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0110, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r3.K(), java.lang.Integer.valueOf(r15)) == false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(z8v z8vVar, n7v n7vVar, hq5 hq5Var, int i) {
        int i2;
        ges g;
        String str;
        kjn kjnVar;
        grb grbVar;
        kb5 kb5Var;
        float f;
        kb5 kb5Var2;
        kb5 kb5Var3;
        grb grbVar2;
        float f2;
        kb5 kb5Var4;
        kb5 kb5Var5;
        kjn kjnVar2;
        vci vciVar;
        int i3;
        boolean z;
        oq5 oq5Var;
        int i4;
        m6v m6vVar;
        boolean z2;
        int i5;
        z8vVar.getClass();
        n7vVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-687182392);
        int i6 = 2;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? oq5Var2.f(z8vVar) : oq5Var2.h(z8vVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(n7vVar) ? 32 : 16;
        }
        int i7 = i2;
        if ((i7 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            l6v l6vVar = z8vVar.b;
            m6v m6vVar2 = z8vVar.a;
            String str2 = l6vVar != null ? l6vVar.b : m6vVar2.b;
            byte b = 0;
            if (str2.length() > 128) {
                oq5Var2.Z(-2036293589);
                g = nu0.j();
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(-2036240889);
                g = nu0.g();
                oq5Var2.p(false);
            }
            ges gesVar = g;
            lx0 lx0Var = qx0.g;
            gz2 gz2Var = b2c.o;
            vci vciVar2 = vci.a;
            float f3 = 16;
            float f4 = 8;
            yci p = androidx.compose.foundation.layout.a.p(d.c(vciVar2, 1.0f), f3, 40, f3, f4);
            ynn i8 = irv.i(oq5Var2);
            boolean h = oq5Var2.h(n7vVar);
            Object K = oq5Var2.K();
            kjn kjnVar3 = gq5.a;
            if (h || K == kjnVar3) {
                K = new m7v(n7vVar, i6, b);
                oq5Var2.k0(K);
            }
            yci b2 = com.yandex.music.core.ui.compose.a.b(p, i8, 0L, 0.0f, null, (Function2) K, 8);
            ta5 a = sa5.a(lx0Var, gz2Var, oq5Var2, 54);
            int i9 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, b2);
            xp5.T.getClass();
            grb grbVar3 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar3);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var6 = wp5.f;
            g0g.U(oq5Var2, a, kb5Var6);
            kb5 kb5Var7 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var7);
            kb5 kb5Var8 = wp5.g;
            if (oq5Var2.O) {
                str = str2;
            } else {
                str = str2;
            }
            ouj.x(i9, oq5Var2, i9, kb5Var8);
            kb5 kb5Var9 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var9);
            agr agrVar = eq0.a;
            xcs.b(str, androidx.compose.foundation.layout.a.o(vciVar2, f3, 0.0f, 2), ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 0, 0, null, gesVar, oq5Var2, 48, 48, 62968);
            oq5 oq5Var3 = oq5Var2;
            c8v c8vVar = z8vVar.c;
            if (c8vVar.equals(b8v.a)) {
                oq5Var3.Z(1937720802);
                oq5Var3.p(false);
                f = f3;
                f2 = f4;
                grbVar2 = grbVar3;
                kb5Var2 = kb5Var6;
                kb5Var4 = kb5Var7;
                kb5Var5 = kb5Var8;
                kb5Var3 = kb5Var9;
                kjnVar2 = kjnVar3;
                vciVar = vciVar2;
                i3 = 1;
            } else {
                if (!(c8vVar instanceof a8v)) {
                    throw vz1.i(oq5Var3, 1937718998, false);
                }
                oq5Var3.Z(-60119935);
                u1g.l(oq5Var3, d.e(vciVar2, f4));
                iz2 iz2Var = b2c.f;
                yci n = androidx.compose.foundation.layout.a.n(vciVar2, f3, f4);
                boolean h2 = oq5Var3.h(n7vVar) | ((i7 & 14) == 4 || ((i7 & 8) != 0 && oq5Var3.h(z8vVar))) | oq5Var3.h(c8vVar);
                Object K2 = oq5Var3.K();
                if (h2) {
                    kjnVar = kjnVar3;
                } else {
                    kjnVar = kjnVar3;
                }
                K2 = new ftr(12, n7vVar, z8vVar, c8vVar);
                oq5Var3.k0(K2);
                yci e = androidx.compose.foundation.a.e(n, false, null, null, (Function0) K2, 7);
                kfh d = ug3.d(iz2Var, false);
                int i10 = oq5Var3.P;
                a l2 = oq5Var3.l();
                yci H2 = vnj.H(oq5Var3, e);
                oq5Var3.d0();
                if (oq5Var3.O) {
                    grbVar = grbVar3;
                    oq5Var3.k(grbVar);
                } else {
                    grbVar = grbVar3;
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, d, kb5Var6);
                g0g.U(oq5Var3, l2, kb5Var7);
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i10))) {
                    kb5Var = kb5Var8;
                    ouj.x(i10, oq5Var3, i10, kb5Var);
                } else {
                    kb5Var = kb5Var8;
                }
                g0g.U(oq5Var3, H2, kb5Var9);
                f = f3;
                kb5Var2 = kb5Var6;
                kb5Var3 = kb5Var9;
                grbVar2 = grbVar;
                f2 = f4;
                kb5Var4 = kb5Var7;
                kb5Var5 = kb5Var;
                kjnVar2 = kjnVar;
                vciVar = vciVar2;
                i3 = 1;
                xcs.b(((a8v) c8vVar).a.a, androidx.compose.foundation.layout.a.o(vciVar2, f3, 0.0f, 2), ((dq0) oq5Var3.j(agrVar)).b.d, 0L, null, 0L, null, null, 0L, 2, false, 0, 0, null, nu0.j(), oq5Var3, 48, 48, 63480);
                oq5Var3 = oq5Var3;
                oq5Var3.p(true);
                oq5Var3.p(false);
            }
            if (z8vVar.d.isEmpty()) {
                z = false;
                oq5Var3.Z(-63811260);
            } else {
                oq5Var3.Z(-59296575);
                pm0.a(null, ild.C(2018838448, new u0v(4, z8vVar, n7vVar), oq5Var3), oq5Var3, 48, i3);
                z = false;
            }
            oq5Var3.p(z);
            vci vciVar3 = vciVar;
            oq5 oq5Var4 = oq5Var3;
            xcs.b(vz1.o(vciVar3, 48, oq5Var3, R.string.wave_words_feedback_actions_title, oq5Var3), null, ((dq0) oq5Var3.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 2, false, 0, 0, null, nu0.j(), oq5Var4, 0, 48, 62970);
            oq5Var = oq5Var4;
            u1g.l(oq5Var, d.e(vciVar3, f));
            float f5 = 24;
            nho a2 = lho.a(qx0.h(f5, gz2Var), b2c.k, oq5Var, 6);
            int i11 = oq5Var.P;
            a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, vciVar3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var2);
            g0g.U(oq5Var, l3, kb5Var4);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i11))) {
                ouj.x(i11, oq5Var, i11, kb5Var5);
            }
            g0g.U(oq5Var, H3, kb5Var3);
            boolean z3 = z8vVar.e == o6v.a;
            int i12 = i7 & 14;
            boolean h3 = oq5Var.h(n7vVar) | (i12 == 4 || ((i7 & 8) != 0 && oq5Var.h(z8vVar))) | oq5Var.g(z3);
            Object K3 = oq5Var.K();
            kjn kjnVar4 = kjnVar2;
            if (h3 || K3 == kjnVar4) {
                i4 = 4;
                K3 = new axb(n7vVar, z8vVar, z3, i4);
                oq5Var.k0(K3);
            } else {
                i4 = 4;
            }
            u7g.w(0, oq5Var, null, (Function0) K3, z3);
            boolean h4 = oq5Var.h(n7vVar) | (i12 == i4 || ((i7 & 8) != 0 && oq5Var.h(z8vVar)));
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar4) {
                K4 = new xes(26, n7vVar, z8vVar);
                oq5Var.k0(K4);
            }
            u7g.v((Function0) K4, null, oq5Var, 0);
            oq5Var.p(true);
            if (m6vVar2.j) {
                oq5Var.Z(-56366238);
                u1g.l(oq5Var, d.e(vciVar3, f5));
                m6vVar = m6vVar2;
                xcs.b(rvf.M(R.string.wave_words_feedback_disclaimer_description, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.c, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.h(), oq5Var, 0, 0, 65018);
                oq5Var = oq5Var;
                z2 = false;
                oq5Var.p(false);
                i5 = -63811260;
            } else {
                m6vVar = m6vVar2;
                z2 = false;
                i5 = -63811260;
                oq5Var.Z(-63811260);
                oq5Var.p(false);
            }
            if (m6vVar.i || m6vVar.h) {
                oq5Var.Z(-55967857);
                u1g.l(oq5Var, d.e(vciVar3, f2));
            } else {
                oq5Var.Z(i5);
            }
            oq5Var.p(z2);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(z8vVar, n7vVar, i, 3);
        }
    }

    public static void h0(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeLongArray(jArr);
        p0(parcel, o0);
    }

    public static final Object i(a0q a0qVar, b0q b0qVar) {
        a0qVar.getClass();
        if (a0qVar instanceof xc5) {
            return b0qVar.G((xc5) a0qVar);
        }
        if (a0qVar instanceof yc5) {
            return b0qVar.D((yc5) a0qVar);
        }
        if (a0qVar instanceof bd5) {
            return b0qVar.w((bd5) a0qVar);
        }
        if (a0qVar instanceof cd5) {
            return b0qVar.N((cd5) a0qVar);
        }
        if (a0qVar instanceof d0t) {
            return b0qVar.s((d0t) a0qVar);
        }
        if (a0qVar instanceof w6u) {
            return b0qVar.d((w6u) a0qVar);
        }
        if (a0qVar instanceof aou) {
            return b0qVar.x((aou) a0qVar);
        }
        if (a0qVar instanceof doc) {
            return b0qVar.F((doc) a0qVar);
        }
        if (a0qVar instanceof w3d) {
            return b0qVar.R((w3d) a0qVar);
        }
        if (a0qVar instanceof g1q) {
            return b0qVar.M((g1q) a0qVar);
        }
        if (a0qVar instanceof aaq) {
            return b0qVar.B((aaq) a0qVar);
        }
        kac.j(a0qVar, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public static void i0(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        p0(parcel, o0);
    }

    public static final String j(Object[] objArr, int i, int i2, h8 h8Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == h8Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void j0(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeString(str);
        p0(parcel, o0);
    }

    public static final LinkedHashMap k(ArrayList arrayList) {
        String str = cak.b;
        cak M = h1b.M("/");
        LinkedHashMap g = uah.g(new Pair(M, new stw(M, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (stw stwVar : CollectionsKt.o0(arrayList, new t1n(18))) {
            if (((stw) g.put(stwVar.a, stwVar)) == null) {
                while (true) {
                    cak cakVar = stwVar.a;
                    cak b = cakVar.b();
                    if (b != null) {
                        stw stwVar2 = (stw) g.get(b);
                        if (stwVar2 != null) {
                            stwVar2.q.add(cakVar);
                            break;
                        }
                        stw stwVar3 = new stw(b, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        g.put(b, stwVar3);
                        stwVar3.q.add(cakVar);
                        stwVar = stwVar3;
                    }
                }
            }
        }
        return g;
    }

    public static void k0(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeStringArray(strArr);
        p0(parcel, o0);
    }

    public static final float l(na0 na0Var, float f, aqi aqiVar, fk0 fk0Var) {
        ja0 ja0Var = na0Var.e;
        int b = eeh.b(ja0Var.g());
        float d = ja0Var.c().d(lf3.a);
        float c = (Float.isNaN(d) ? 0.0f : f - yhn.c(b - d, 0.0f, f)) / f;
        lke lkeVar = (lke) aqiVar.getValue();
        return ((Number) fk0Var.e()).floatValue() * (lkeVar != null ? lkeVar.f() : 0) * c;
    }

    public static void l0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeStringList(list);
        p0(parcel, o0);
    }

    public static final mn0 m(CharSequence charSequence, long j, hq5 hq5Var, int i, int i2) {
        c4r c4rVar;
        c4r c4rVar2;
        charSequence.getClass();
        long j2 = (i2 & 1) != 0 ? ((dq0) ((oq5) hq5Var).j(eq0.a)).b.d : j;
        oq5 oq5Var = (oq5) hq5Var;
        boolean f = oq5Var.f(charSequence) | ((((i & 112) ^ 48) > 32 && oq5Var.e(j2)) || (i & 48) == 32);
        Object K = oq5Var.K();
        if (f || K == gq5.a) {
            Spanned fromHtml = Html.fromHtml(charSequence.toString(), 63, null, new bx6(new mes(j2, 0)));
            fromHtml.getClass();
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(fromHtml.toString());
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            spans.getClass();
            for (Object obj : spans) {
                obj.getClass();
                if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        c4rVar2 = new c4r(0L, 0L, tqc.p, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65531);
                    } else if (style != 2) {
                        if (style == 3) {
                            c4rVar2 = new c4r(0L, 0L, tqc.p, new oqc(1), (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65523);
                        }
                        c4rVar2 = null;
                    } else {
                        c4rVar2 = new c4r(0L, 0L, (tqc) null, new oqc(1), (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65527);
                    }
                } else {
                    if (obj instanceof UnderlineSpan) {
                        c4rVar = new c4r(0L, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, aas.c, (otp) null, 61439);
                    } else {
                        if (obj instanceof ForegroundColorSpan) {
                            c4rVar = new c4r(c3x.f(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534);
                        }
                        c4rVar2 = null;
                    }
                    c4rVar2 = c4rVar;
                }
                if (c4rVar2 != null) {
                    arrayList.add(new jn0(c4rVar2, fromHtml.getSpanStart(obj), fromHtml.getSpanEnd(obj), 8));
                }
            }
            String sb2 = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((jn0) arrayList.get(i3)).a(sb.length()));
            }
            K = new mn0(sb2, arrayList2);
            oq5Var.k0(K);
        }
        return (mn0) K;
    }

    public static void m0(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int o0 = o0(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        p0(parcel, o0);
    }

    public static long n(long j, dqf dqfVar) {
        dqf dqfVar2 = dqf.a;
        return ia6.a(dqfVar == dqfVar2 ? ga6.k(j) : ga6.j(j), dqfVar == dqfVar2 ? ga6.i(j) : ga6.h(j), dqfVar == dqfVar2 ? ga6.j(j) : ga6.k(j), dqfVar == dqfVar2 ? ga6.h(j) : ga6.i(j));
    }

    public static void n0(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int o0 = o0(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        p0(parcel, o0);
    }

    public static long o(int i, long j) {
        return ia6.a(0, ga6.i(j), (i & 4) != 0 ? ga6.j(j) : 0, ga6.h(j));
    }

    public static int o0(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final List p(List list) {
        list.getClass();
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return list;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((rfk) it.next()) instanceof kfk) {
                list = new ArrayList();
                for (Object obj : list2) {
                    if (!(((rfk) obj) instanceof lfk)) {
                        list.add(obj);
                    }
                }
            }
        }
        return list;
    }

    public static void p0(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static Activity q(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return q(((ContextWrapper) context).getBaseContext());
        }
        kac.j(context, "Unsupported context ");
        return null;
    }

    public static void q0(int i, int i2, Parcel parcel) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static final rfk r(String str, List list) {
        Object obj;
        List list2;
        list.getClass();
        str.getClass();
        Iterator it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            rfk rfkVar = (rfk) next;
            boolean z = true;
            if (!Intrinsics.d(w(rfkVar), str)) {
                rfkVar.getClass();
                if (Intrinsics.d(rfkVar, gfk.a) ? true : Intrinsics.d(rfkVar, jfk.a) ? true : Intrinsics.d(rfkVar, lfk.a) ? true : Intrinsics.d(rfkVar, ofk.a) ? true : Intrinsics.d(rfkVar, kfk.a) ? true : Intrinsics.d(rfkVar, ifk.a) ? true : Intrinsics.d(rfkVar, nfk.a) ? true : Intrinsics.d(rfkVar, hfk.a)) {
                    list2 = null;
                } else if (rfkVar instanceof ffk) {
                    list2 = ((ffk) rfkVar).h;
                } else if (rfkVar instanceof pfk) {
                    list2 = ((pfk) rfkVar).f;
                } else {
                    if (!(rfkVar instanceof mfk)) {
                        b6e.s();
                        return null;
                    }
                    list2 = ((mfk) rfkVar).h;
                }
                if (!qdq.B(list2 != null ? Boolean.valueOf(list2.contains(str)) : null)) {
                    z = false;
                }
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (rfk) obj;
    }

    public static kml s(cml cmlVar, int i) {
        sxk a = rxk.a(null, 511);
        eml emlVar = eml.d;
        cml cmlVar2 = new cml(a, dml.a());
        if ((i & 2) != 0) {
            cmlVar = new cml(rxk.a(null, 511), dml.a());
        }
        return new kml(cmlVar2, cmlVar, new cml(rxk.a(null, 511), dml.a()));
    }

    public static final String t(s9p s9pVar) {
        List list = s9pVar.a;
        g9p g9pVar = (g9p) CollectionsKt.firstOrNull(list);
        if (g9pVar == null) {
            dfi.r("Seeds.items must not be empty", "EmptySeeds");
            return "";
        }
        List L = CollectionsKt.L(list, 1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : L) {
            if (obj instanceof k7h) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.X(CollectionsKt.g0(t75.c(g9pVar), arrayList), "_", null, null, new d0p(20), 30);
    }

    public static final float u(long j, bxj bxjVar) {
        bxjVar.getClass();
        int ordinal = bxjVar.ordinal();
        if (ordinal == 0) {
            return enj.f(j);
        }
        if (ordinal == 1) {
            return enj.e(j);
        }
        b6e.s();
        return 0.0f;
    }

    public static final String v(int i) {
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        num.getClass();
        return "0x".concat(num);
    }

    public static final String w(rfk rfkVar) {
        return rfkVar instanceof gfk ? "CASH" : rfkVar instanceof jfk ? "NEW_CARD" : rfkVar instanceof lfk ? "SBP_ID" : rfkVar instanceof kfk ? "NEW_SBP_TOKEN_ID" : rfkVar instanceof ifk ? "GOOGLE_PAY" : rfkVar instanceof ffk ? ((ffk) rfkVar).a.a : rfkVar instanceof pfk ? ((pfk) rfkVar).a : rfkVar instanceof mfk ? ((mfk) rfkVar).a : rfkVar instanceof hfk ? "CHALLENGE_POLLING_ID" : rfkVar instanceof nfk ? "SPLIT_ID" : "";
    }

    public static final mn0 x(String str, int i, int i2, hq5 hq5Var) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-1047860202);
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(str);
        arrayList.add(new jn0(new c4r(((dq0) oq5Var.j(eq0.a)).b.d, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534), i, i + i2, 8));
        String sb2 = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((jn0) arrayList.get(i3)).a(sb.length()));
        }
        mn0 mn0Var = new mn0(sb2, arrayList2);
        oq5Var.p(false);
        return mn0Var;
    }

    public static final boolean y(rfk rfkVar) {
        return Intrinsics.d(w(rfkVar), "NEW_CARD");
    }

    public static final boolean z(s9p s9pVar) {
        s9pVar.getClass();
        List list = s9pVar.a;
        if (list.size() == 1) {
            String tag = ((g9p) list.get(0)).getTag();
            o9p o9pVar = m9p.a;
            if (c.v(tag, o9pVar.b, true)) {
                String lowerCase = ((g9p) list.get(0)).getType().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (lowerCase.equals(o9pVar.a)) {
                    return true;
                }
            }
        }
        return false;
    }
}
