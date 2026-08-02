package defpackage;

import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.session.i;
import com.connectsdk.service.capability.RemoteCameraControl;
import com.connectsdk.service.capability.ScreenMirroringControl;
import com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx;
import com.connectsdk.service.webos.lgcast.remotecamera.api.RemoteCameraApi;
import com.connectsdk.service.webos.lgcast.screenmirroring.api.ScreenMirroringApi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.y1;
import com.yandex.passport.common.account.a;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.social.authenticators.c;
import com.yandex.passport.internal.ui.social.authenticators.e;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.a0;
import com.yandex.passport.legacy.lx.g;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.core.theme.d;
import com.yandex.pulse.LibraryParams;
import com.yandex.pulse.PulseService;
import com.yandex.pulse.histogram.ComponentHistograms;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.appmetrica.analytics.screenshot.impl.C0946n;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class u13 implements ag6, iyr, zs7, aqr, gu3, jpj, ws3, ycg, rth, jr1, ua6, lyr, LocalBroadcastEx.BroadcastListener, zjo, hka, arr, g, FunctionWithThrowable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ u13(CoroutineContext coroutineContext, pm6 pm6Var, Function2 function2) {
        this.a = 8;
        this.b = coroutineContext;
        this.c = pm6Var;
        this.d = (aur) function2;
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        ryc rycVar = (ryc) this.b;
        cme cmeVar = (cme) this.c;
        bme bmeVar = (bme) this.d;
        view.getClass();
        rycVar.invoke(view, kqvVar, cmeVar, bmeVar);
        return kqvVar;
    }

    @Override // defpackage.rth
    public void a(wrh wrhVar) {
        sth sthVar = (sth) this.b;
        alp alpVar = (alp) this.c;
        Bundle bundle = (Bundle) this.d;
        i iVar = sthVar.h;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        iVar.o(wrhVar, alpVar, bundle);
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        x0 x0Var = (x0) this.b;
        ((bwh) obj).f(x0Var.b, (uvh) this.c, (boh) this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090 A[SYNTHETIC] */
    @Override // defpackage.zjo, defpackage.myc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        xqg xqgVar;
        xqg xqgVar2;
        int i = this.a;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        xqg xqgVar3 = xqg.CACHE_FULL;
        int i5 = 2;
        int i6 = 0;
        int i7 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 16:
                bko bkoVar = (bko) obj4;
                cd2 cd2Var = (cd2) obj3;
                i6b i6bVar = cd2Var.c;
                String str = cd2Var.a;
                de2 de2Var = (de2) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = bkoVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * bkoVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                dd2 dd2Var = bkoVar.d;
                if (simpleQueryForLong >= dd2Var.a) {
                    bkoVar.z(1L, xqgVar3, str);
                    return -1L;
                }
                Long b = bko.b(sQLiteDatabase, de2Var);
                if (b != null) {
                    insert = b.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", de2Var.a);
                    contentValues.put("priority", Integer.valueOf(qsm.a(de2Var.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = de2Var.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i8 = dd2Var.e;
                byte[] bArr2 = i6bVar.b;
                boolean z = bArr2.length <= i8;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(cd2Var.d));
                contentValues2.put("uptime_ms", Long.valueOf(cd2Var.e));
                contentValues2.put("payload_encoding", i6bVar.a.a);
                contentValues2.put("code", cd2Var.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                contentValues2.put("product_id", cd2Var.g);
                contentValues2.put("pseudonymous_id", cd2Var.h);
                contentValues2.put("experiment_ids_clear_blob", cd2Var.i);
                contentValues2.put("experiment_ids_encrypted_blob", cd2Var.j);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i8);
                    for (int i9 = 1; i9 <= ceil; i9++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i9 - 1) * i8, Math.min(i9 * i8, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i9));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(cd2Var.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put(Constants.KEY_VALUE, (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 17:
                bko bkoVar2 = (bko) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                de2 de2Var2 = (de2) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (true) {
                    if (cursor2.moveToNext()) {
                        long j = cursor2.getLong(0);
                        int i10 = cursor2.getInt(7) != 0 ? i7 : 0;
                        m mVar = new m();
                        mVar.g = new HashMap();
                        String string = cursor2.getString(i7);
                        if (string != null) {
                            mVar.b = string;
                            mVar.e = Long.valueOf(cursor2.getLong(i5));
                            mVar.f = Long.valueOf(cursor2.getLong(3));
                            if (i10 != 0) {
                                String string2 = cursor2.getString(4);
                                mVar.d = new i6b(string2 == null ? bko.f : new p6b(string2), cursor2.getBlob(5));
                            } else {
                                String string3 = cursor2.getString(4);
                                p6b p6bVar = string3 == null ? bko.f : new p6b(string3);
                                Cursor query = bkoVar2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                                try {
                                    Cursor cursor3 = query;
                                    ArrayList arrayList2 = new ArrayList();
                                    int i11 = 0;
                                    while (cursor3.moveToNext()) {
                                        byte[] blob = cursor3.getBlob(0);
                                        arrayList2.add(blob);
                                        i11 += blob.length;
                                    }
                                    byte[] bArr3 = new byte[i11];
                                    int i12 = 0;
                                    int i13 = 0;
                                    while (i12 < arrayList2.size()) {
                                        byte[] bArr4 = (byte[]) arrayList2.get(i12);
                                        cursor = query;
                                        try {
                                            int i14 = i12;
                                            System.arraycopy(bArr4, 0, bArr3, i13, bArr4.length);
                                            i13 += bArr4.length;
                                            i12 = i14 + 1;
                                            query = cursor;
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor.close();
                                            throw th;
                                        }
                                    }
                                    query.close();
                                    mVar.d = new i6b(p6bVar, bArr3);
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = query;
                                }
                            }
                            if (!cursor2.isNull(6)) {
                                mVar.c = Integer.valueOf(cursor2.getInt(6));
                            }
                            if (!cursor2.isNull(8)) {
                                mVar.h = Integer.valueOf(cursor2.getInt(8));
                            }
                            if (!cursor2.isNull(9)) {
                                mVar.i = cursor2.getString(9);
                            }
                            if (!cursor2.isNull(10)) {
                                mVar.j = cursor2.getBlob(10);
                            }
                            if (!cursor2.isNull(11)) {
                                mVar.k = cursor2.getBlob(11);
                            }
                            arrayList.add(new qd2(j, de2Var2, mVar.c()));
                            i5 = 2;
                            i7 = 1;
                        } else {
                            jj4.j("Null transportName");
                        }
                    }
                }
                return null;
            case 18:
                bko bkoVar3 = (bko) obj4;
                HashMap hashMap = (HashMap) obj3;
                kkp kkpVar = (kkp) obj2;
                ArrayList arrayList3 = (ArrayList) kkpVar.d;
                Cursor cursor4 = (Cursor) obj;
                bkoVar3.getClass();
                while (cursor4.moveToNext()) {
                    String string4 = cursor4.getString(i6);
                    int i15 = cursor4.getInt(1);
                    xqg xqgVar4 = xqg.REASON_UNKNOWN;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            xqgVar4 = xqg.MESSAGE_TOO_OLD;
                        } else if (i15 == 2) {
                            xqgVar = xqgVar3;
                            xqgVar2 = xqgVar;
                            long j2 = cursor4.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new yqg(j2, xqgVar));
                            xqgVar3 = xqgVar2;
                            i2 = 5;
                            i3 = 4;
                            i4 = 3;
                            i6 = 0;
                        } else if (i15 == i4) {
                            xqgVar4 = xqg.PAYLOAD_TOO_BIG;
                        } else if (i15 == i3) {
                            xqgVar4 = xqg.MAX_RETRIES_REACHED;
                        } else if (i15 == i2) {
                            xqgVar4 = xqg.INVALID_PAYLOD;
                        } else if (i15 == 6) {
                            xqgVar4 = xqg.SERVER_ERROR;
                        } else {
                            tyf.q("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                    }
                    xqgVar2 = xqgVar3;
                    xqgVar = xqgVar4;
                    long j22 = cursor4.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new yqg(j22, xqgVar));
                    xqgVar3 = xqgVar2;
                    i2 = 5;
                    i3 = 4;
                    i4 = 3;
                    i6 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i16 = dsg.c;
                    new ArrayList();
                    arrayList3.add(new dsg((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                kkpVar.c = (iis) bkoVar3.g(new vuh(bkoVar3.b.a()));
                kkpVar.e = new zld(new rhr(bkoVar3.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * bkoVar3.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), dd2.f.a));
                kkpVar.b = (String) bkoVar3.e.get();
                return new ko4((iis) kkpVar.c, Collections.unmodifiableList(arrayList3), (zld) kkpVar.e, (String) kkpVar.b);
            default:
                return d0.a((g0) obj4, (d0) obj3, (C0946n) obj2, (ActivityManager) obj);
        }
    }

    @Override // com.yandex.passport.legacy.lx.g
    public Object b(Object obj) {
        int i = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 23:
                c cVar = (c) obj4;
                Context context = (Context) obj;
                int i2 = WebViewActivity.h;
                l lVar = cVar.k;
                b bVar = lVar.d.a;
                context.getClass();
                y1 y1Var = lVar.e;
                a0 a0Var = a0.NATIVE_SOCIAL_AUTH;
                com.yandex.passport.internal.a0 a0Var2 = cVar.l;
                a0Var2.getClass();
                Bundle bundle = new Bundle();
                bundle.putParcelable("social-provider", a0Var2);
                bundle.putString("social-token", (String) obj3);
                bundle.putString("application-client-id", (String) obj2);
                return com.yandex.passport.data.network.token.i.e(bVar, context, y1Var, a0Var, bundle);
            default:
                e eVar = (e) obj4;
                Context context2 = (Context) obj;
                int i3 = WebViewActivity.h;
                l lVar2 = eVar.k;
                b bVar2 = lVar2.d.a;
                context2.getClass();
                y1 y1Var2 = lVar2.e;
                a0 a0Var3 = a0.BIND_SOCIAL_NATIVE;
                com.yandex.passport.internal.a0 a0Var4 = eVar.l;
                a aVar = eVar.v;
                a0Var4.getClass();
                aVar.getClass();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("social-provider", a0Var4);
                bundle2.putString("social-token", (String) obj3);
                bundle2.putString("application-id", (String) obj2);
                bundle2.putString("master-token", aVar.e());
                return com.yandex.passport.data.network.token.i.e(bVar2, context2, y1Var2, a0Var3, bundle2);
        }
    }

    @Override // defpackage.hka
    public void c(float f, long j) {
        wqn wqnVar = (wqn) this.b;
        avs avsVar = (avs) this.c;
        tqn tqnVar = (tqn) this.d;
        wqnVar.a = j;
        if (j >= avsVar.l) {
            tqnVar.a = true;
            avsVar.j.cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.ws3
    public Object d(vs3 vs3Var) {
        switch (this.a) {
            case 7:
                Executor executor = (Executor) this.b;
                String str = (String) this.c;
                Function0 function0 = (Function0) this.d;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                mcg mcgVar = new mcg(atomicBoolean, 0);
                d48 d48Var = d48.a;
                h2o h2oVar = vs3Var.c;
                if (h2oVar != null) {
                    h2oVar.a(mcgVar, d48Var);
                }
                executor.execute(new ncg(atomicBoolean, vs3Var, function0, 0));
                return str;
            default:
                CoroutineContext coroutineContext = (CoroutineContext) this.b;
                pm6 pm6Var = (pm6) this.c;
                ?? r2 = (aur) this.d;
                sr7 sr7Var = new sr7(26, (r2f) coroutineContext.get(o6c.l));
                d48 d48Var2 = d48.a;
                h2o h2oVar2 = vs3Var.c;
                if (h2oVar2 != null) {
                    h2oVar2.a(sr7Var, d48Var2);
                }
                return x97.y(gld.e(coroutineContext), null, pm6Var, new akc((Function2) r2, vs3Var, (Continuation) null), 1);
        }
    }

    public int e() {
        com.yandex.plus.home.plaque.plugin.internal.di.c cVar = (com.yandex.plus.home.plaque.plugin.internal.di.c) this.b;
        return ((d) cVar.c.getValue()).a((Context) this.c, (com.yandex.plus.ui.core.theme.a) ((fkn) this.d).a.getValue());
    }

    @Override // defpackage.iyr
    public Object execute() {
        eq7 eq7Var = (eq7) this.b;
        de2 de2Var = (de2) this.c;
        cd2 cd2Var = (cd2) this.d;
        bko bkoVar = eq7Var.d;
        bkoVar.getClass();
        lsm lsmVar = de2Var.c;
        String str = cd2Var.a;
        String str2 = de2Var.a;
        String z = tyf.z("SQLiteEventStore");
        if (Log.isLoggable(z, 3)) {
            Log.d(z, "Storing event with priority=" + lsmVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) bkoVar.g(new u13(16, bkoVar, cd2Var, de2Var))).getClass();
        eq7Var.a.K(de2Var, 1, false);
        return null;
    }

    @Override // defpackage.arr
    public Object get() {
        dcl dclVar = (dcl) this.b;
        fcl fclVar = (fcl) this.c;
        le3 le3Var = (le3) this.d;
        ru.yandex.video.m3.player.b bVar = (ru.yandex.video.m3.player.b) dclVar;
        bVar.getClass();
        gsa gsaVar = bVar.i;
        rsb rsbVar = bVar.h;
        Context context = bVar.a;
        erb erbVar = bVar.j;
        bt2 bt2Var = fclVar.e;
        Looper looper = fclVar.b;
        Boolean bool = fclVar.v;
        mnn c = bt2Var != null ? bt2Var.c("CodecDebugReporter", new anf(fclVar.q)) : null;
        if (c == null) {
            c = r7j.a;
        }
        xqr xqrVar = erbVar.c;
        if (xqrVar.a) {
            rsbVar.c = true;
            rsbVar.d = bVar.k;
        }
        lnm lnmVar = erbVar.d;
        if ((lnmVar != null ? lnmVar.a : null) == null) {
            Log.w("ExoPlayerDelegateFactor", "Экземпляр preloadPriorityTaskManager должен отличаться от экземпляра priorityTaskManager!");
        }
        yjj yjjVar = new yjj();
        zle yleVar = Intrinsics.d(bool, Boolean.TRUE) ? new yle() : Intrinsics.d(bool, Boolean.FALSE) ? ame.a : ame.a;
        qk2 qk2Var = yleVar instanceof yle ? new qk2(context) : null;
        cl2 cl2Var = new cl2((fclVar.g ? new n20(fclVar.h) : bVar.e).q(context, yleVar));
        mkv mkvVar = new mkv(bVar.b);
        hr4 hr4Var = fclVar.i ? new hr4(c, (mm6) ru.yandex.video.m3.player.b.l.getValue()) : null;
        sea seaVar = new sea(5, fclVar, hr4Var);
        qsb qsbVar = new qsb(rsbVar.e);
        qsbVar.b = Boolean.valueOf(rsbVar.f);
        qsbVar.c = rsbVar.g;
        qsbVar.d = Boolean.valueOf(rsbVar.h);
        qsbVar.e = Boolean.valueOf(rsbVar.i);
        qsbVar.f = Integer.valueOf(rsbVar.j);
        qsbVar.g = rsbVar.k.toString();
        qsbVar.h = rsbVar.m;
        qsbVar.i = Boolean.valueOf(rsbVar.n);
        qsbVar.j = Boolean.valueOf(rsbVar.o);
        qsbVar.k = Boolean.valueOf(rsbVar.p);
        qsbVar.l = Boolean.valueOf(rsbVar.s);
        qsbVar.m = Boolean.valueOf(rsbVar.t);
        qsbVar.n = Boolean.valueOf(rsbVar.u);
        qsbVar.o = rsbVar.l;
        qsbVar.p = rsbVar.q;
        qsbVar.q = rsbVar.r;
        qsbVar.r = Boolean.valueOf(rsbVar.w);
        seaVar.invoke(qsbVar);
        rsb a = qsbVar.a();
        b1t a2 = bVar.f.a(fclVar.c);
        le3 le3Var2 = new le3();
        le3Var2.a = looper;
        le3Var2.b = new Handler(looper);
        axh f = bVar.g.f();
        mnn mnnVar = c;
        hr4 hr4Var2 = hr4Var;
        Object l = le3Var2.l(new me8(bVar, a, a2, f, cl2Var, fclVar, new bo7(1, dvt.Y(20L), dvt.Y(500L)), 2));
        l.getClass();
        ExoPlayer exoPlayer = (ExoPlayer) l;
        exoPlayer.c1(gsaVar);
        if (hr4Var2 != null) {
            exoPlayer.c1(hr4Var2);
        }
        fau fauVar = (fau) le3Var2.l(new zg(bVar, fclVar, exoPlayer, le3Var2, 8));
        cwh cwhVar = bVar.c;
        so7 so7Var = cwhVar instanceof so7 ? (so7) cwhVar : null;
        veg vegVar = so7Var != null ? so7Var.e.b : null;
        cbh cbhVar = bVar.d;
        nue nueVar = bVar.k;
        lnm lnmVar2 = erbVar.d;
        pv9 pv9Var = fclVar.a;
        boolean z = xqrVar.b;
        boolean z2 = xqrVar.c;
        Boolean bool2 = fclVar.w;
        return new crb(exoPlayer, cwhVar, a2, mkvVar, cbhVar, le3Var2, cl2Var, gsaVar, fauVar, nueVar, looper, f, lnmVar2, pv9Var, mnnVar, le3Var, yjjVar, vegVar, qk2Var, z, z2, bool2 != null ? bool2.booleanValue() : false, fclVar.x, fclVar.y);
    }

    @Override // defpackage.zs7
    public qsn h(int i, xvs xvsVar, int[] iArr) {
        androidx.media3.exoplayer.trackselection.a aVar = (androidx.media3.exoplayer.trackselection.a) this.b;
        String str = (String) this.c;
        String str2 = (String) this.d;
        tde u = yde.u();
        for (int i2 = 0; i2 < xvsVar.a; i2++) {
            u.a(new ys7(i, xvsVar, i2, aVar, iArr[i2], str, str2));
        }
        return u.f();
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        mmo mmoVar = (mmo) this.b;
        mmo mmoVar2 = (mmo) this.c;
        Integer num = (Integer) this.d;
        ((f8l) obj).u(num.intValue(), ((rdl) mmoVar.b).c.a, ((rdl) mmoVar2.b).c.a);
    }

    @Override // defpackage.aqr
    public Task l(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str = (String) this.c;
        x8a x8aVar = (x8a) this.d;
        String str2 = (String) obj;
        ttm c = FirebaseMessaging.c(firebaseMessaging.b);
        aec aecVar = firebaseMessaging.a;
        aecVar.a();
        String f = "[DEFAULT]".equals(aecVar.b) ? "" : aecVar.f();
        String c2 = firebaseMessaging.h.c();
        synchronized (c) {
            String c3 = x8a.c(System.currentTimeMillis(), str2, c2);
            if (c3 != null) {
                SharedPreferences.Editor edit = c.a.edit();
                edit.putString(f + "|T|" + str + "|*", c3);
                edit.commit();
            }
        }
        if (x8aVar == null || !str2.equals((String) x8aVar.b)) {
            aec aecVar2 = firebaseMessaging.a;
            aecVar2.a();
            if ("[DEFAULT]".equals(aecVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    aecVar2.a();
                    sb.append(aecVar2.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new nnk(firebaseMessaging.b).H(intent);
            }
        }
        return ywf.w(str2);
    }

    @Override // defpackage.gu3
    public void onCancel() {
        Runnable runnable = (Runnable) this.b;
        b8t b8tVar = (b8t) this.c;
        Runnable runnable2 = (Runnable) this.d;
        if (runnable != null) {
            runnable.run();
        } else {
            b8tVar.cancel();
            runnable2.run();
        }
    }

    @Override // com.connectsdk.service.webos.lgcast.common.utils.LocalBroadcastEx.BroadcastListener
    public void onReceive(Intent intent) {
        switch (this.a) {
            case 15:
                ((RemoteCameraApi) this.b).lambda$stopRemoteCamera$2((RemoteCameraControl.RemoteCameraStopListener) this.c, (Context) this.d, intent);
                break;
            default:
                ((ScreenMirroringApi) this.b).lambda$stopMirroring$2((ScreenMirroringControl.ScreenMirroringStopListener) this.c, (Context) this.d, intent);
                break;
        }
    }

    @Override // defpackage.ag6
    public Object p(Task task) {
        i8s i8sVar = (i8s) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        rp7 rp7Var = (rp7) this.d;
        if (task.l()) {
            i8sVar.d(task.h());
        } else if (task.g() != null) {
            i8sVar.c(task.g());
        } else if (atomicBoolean.getAndSet(true)) {
            ((onx) ((sml) rp7Var.a).a).s(null);
        }
        return ywf.w(null);
    }

    @Override // defpackage.lyr
    public ComponentHistograms run() {
        ComponentHistograms m19registerLib$lambda1;
        m19registerLib$lambda1 = PulseService.m19registerLib$lambda1((PulseService) this.b, (String) this.c, (LibraryParams) this.d);
        return m19registerLib$lambda1;
    }

    public /* synthetic */ u13(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.jr1
    /* renamed from: apply, reason: collision with other method in class */
    public lcg mo34apply(Object obj) {
        int i = this.a;
        int i2 = 4;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 11:
                i iVar = (i) obj4;
                Handler handler = iVar.l;
                juc jucVar = new juc(iVar, (wrh) obj3, new cy1(22, iVar, (tuh) obj2, (xrh) obj));
                ump umpVar = new ump(0);
                int i3 = dvt.a;
                xop xopVar = new xop();
                dvt.c0(handler, new gtm(i2, xopVar, jucVar, umpVar));
                return xopVar;
            default:
                i iVar2 = (i) obj4;
                wrh wrhVar = (wrh) obj3;
                List list = (List) obj;
                Handler handler2 = iVar2.l;
                juc jucVar2 = new juc(iVar2, wrhVar, new r8(iVar2, (evh) obj2, wrhVar, list, 10));
                ump umpVar2 = new ump(0);
                int i4 = dvt.a;
                xop xopVar2 = new xop();
                dvt.c0(handler2, new gtm(i2, xopVar2, jucVar2, umpVar2));
                return xopVar2;
        }
    }
}
