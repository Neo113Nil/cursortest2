package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.address.models.Address;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.photocontrol.domain.c;
import com.yandex.go.scooters.photocontrol.domain.f;
import com.yandex.go.scooters.photocontrol.domain.g;
import com.yandex.go.scooters.photocontrol.domain.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteMetadata;
import com.yandex.mapkit.transport.masstransit.Section;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.ShowAlertInteractor$AnalyticsTrigger;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.Screen;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.d;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.e;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.l;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import yads.b93;
import yads.bl2;
import yads.gm2;
import yads.hm2;
import yads.m30;
import yads.su;
import yads.t31;
import yads.wk2;
import yads.wm0;

/* loaded from: classes7.dex */
public final class vmn0 implements cv81 {
    public final Object a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;
    public Object y;

    public vmn0(Context context, ge71 ge71Var, int i) {
        switch (i) {
            case 19:
                sh81 sh81Var = new sh81();
                hb81 hb81Var = new hb81();
                pp61 pp61Var = new pp61();
                fp71 fp71Var = new fp71(ge71Var);
                this.a = context;
                this.b = sh81Var;
                this.c = hb81Var;
                this.w = pp61Var;
                this.x = fp71Var;
                break;
            default:
                xf81 xf81Var = new xf81();
                cf71 cf71Var = new cf71(new hlx0(context, ge71Var));
                vi71 vi71Var = new vi71(context, ge71Var, 12);
                w291 w291Var = new w291();
                mu71 mu71Var = new mu71();
                this.a = xf81Var;
                this.b = cf71Var;
                this.c = vi71Var;
                this.w = w291Var;
                this.x = mu71Var;
                this.y = context.getApplicationContext();
                break;
        }
    }

    public static v281 c(ek71 ek71Var, t31 t31Var, v281 v281Var, ie81 ie81Var) {
        int a;
        int i;
        ek71Var.v();
        yn81 yn81Var = ek71Var.b0.a;
        ek71Var.v();
        if (ek71Var.b0.a.c()) {
            a = 0;
        } else {
            hp71 hp71Var = ek71Var.b0;
            a = hp71Var.a.a(hp71Var.b.a);
        }
        Object a2 = yn81Var.c() ? null : yn81Var.a(a);
        ek71Var.v();
        if (ek71Var.b0.b.a() || yn81Var.c()) {
            i = -1;
        } else {
            ie81 a3 = yn81Var.a(a, ie81Var, false);
            ek71Var.v();
            i = a3.b(rf71.g(rf71.u(ek71Var.a(ek71Var.b0))) - ie81Var.x);
        }
        int i2 = i;
        for (int i3 = 0; i3 < t31Var.size(); i3++) {
            v281 v281Var2 = (v281) t31Var.get(i3);
            ek71Var.v();
            if (j(v281Var2, a2, ek71Var.b0.b.a(), ek71Var.o(), ek71Var.p(), i2)) {
                return v281Var2;
            }
        }
        if (t31Var.isEmpty() && v281Var != null) {
            ek71Var.v();
            if (j(v281Var, a2, ek71Var.b0.b.a(), ek71Var.o(), ek71Var.p(), i2)) {
                return v281Var;
            }
        }
        return null;
    }

    public static g581 d(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                ny61.v(q8a1.c(readInt2, "Invalid value size: "));
                return null;
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = rf71.f;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, 10485760);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new g581(hashMap);
    }

    public static boolean j(v281 v281Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = v281Var.a;
        int i4 = v281Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && v281Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && v281Var.e == i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xz4 a(String str) {
        su suVar;
        b081 b081Var;
        String str2;
        String str3;
        a081 a081Var;
        ((k471) this.x).a.getClass();
        boolean z = ((d881) this.b).y;
        hlx0 hlx0Var = (hlx0) this.w;
        Context context = (Context) ((WeakReference) this.y).get();
        fe81 fe81Var = (fe81) this.a;
        d881 d881Var = (d881) this.b;
        cl81 cl81Var = (cl81) this.c;
        hlx0Var.getClass();
        if (context != null) {
            AtomicLong atomicLong = ol71.a;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long andSet = elapsedRealtime - ol71.a.getAndSet(elapsedRealtime);
            if (0 > andSet || andSet >= 1001) {
                a081 a081Var2 = a081.g;
                if (a081Var2 == null) {
                    synchronized (a081.f) {
                        a081Var = a081.g;
                        if (a081Var == null) {
                            a081Var = new a081();
                            a081.g = a081Var;
                        }
                    }
                    a081Var2 = a081Var;
                }
                gg81 a = a081Var2.a(context);
                ((el71) hlx0Var.x).getClass();
                boolean z2 = false;
                if (a != null && (str3 = a.V) != null) {
                    su.c.getClass();
                    su[] values = su.values();
                    int length = values.length;
                    for (int i = 0; i < length; i++) {
                        suVar = values[i];
                        if (jl40.l(suVar.b, str3)) {
                            break;
                        }
                    }
                }
                suVar = null;
                if ((z && suVar == null) || su.d == suVar) {
                    if (str.length() != 0) {
                        String k = new Regex("http(s?)://").k(str, "");
                        for (b93 b93Var : b93.values()) {
                            if (cvu0.x(k, b93Var.b, false)) {
                                break;
                            }
                        }
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        b081Var = bx71.a;
                        ((l681) hlx0Var.b).getClass();
                        str2 = ((jj71) hlx0Var.c).a(str, g8e.z("{CLICK_DEST}", n381.a(b081Var)));
                        z2 = ((mj31) hlx0Var.w).u(context, fe81Var, d881Var, cl81Var, str2);
                        cl81Var.a(9, null);
                        return !z2 ? new q781(gm2.d, b081Var, str2) : new r481(gm2.d);
                    }
                }
                b081Var = st71.a;
                ((l681) hlx0Var.b).getClass();
                str2 = ((jj71) hlx0Var.c).a(str, g8e.z("{CLICK_DEST}", n381.a(b081Var)));
                if (((g371) hlx0Var.y).a(context, str2)) {
                    cl81Var.a(7, null);
                    z2 = true;
                } else if (URLUtil.isNetworkUrl(str2)) {
                    z2 = ((mj31) hlx0Var.w).u(context, fe81Var, d881Var, cl81Var, str2);
                }
                cl81Var.a(9, null);
                if (!z2) {
                }
            }
        }
        return new r481(gm2.d);
    }

    public zj71 b(hm2 hm2Var, Map map) {
        fe81 fe81Var = (fe81) this.b;
        if (!ym11.h(map)) {
            map = null;
        }
        if (map == null) {
            map = new LinkedHashMap();
        }
        String str = g771.a;
        if (str == null) {
            map.put("adapter", StringUtils.UNDEFINED);
        } else {
            map.put("adapter", str);
        }
        hn71 a = ((f571) this.x).a(fe81Var, (d881) this.a);
        no61 no61Var = (no61) a.c;
        LinkedHashMap n = b.n(map, (Map) a.b);
        LinkedHashMap linkedHashMap = ym11.h(n) ? n : null;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        a271 a271Var = fe81Var.d.a;
        if (a271Var != null) {
            jd81 jd81Var = (jd81) a271Var;
            linkedHashMap.put("size_type", jd81Var.a.b);
            linkedHashMap.put("width", Integer.valueOf(jd81Var.b));
            linkedHashMap.put("height", Integer.valueOf(jd81Var.c));
        }
        mj31 mj31Var = (mj31) this.c;
        if (mj31Var != null) {
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put("asset_name", (String) mj31Var.b);
            mapBuilder.put("action_type", "url");
            uio0 uio0Var = (uio0) mj31Var.c;
            if (uio0Var != null) {
                mapBuilder.putAll((Map) uio0Var.b().b);
            }
            LinkedHashMap linkedHashMap2 = ((ks81) mj31Var.w).a;
            if (linkedHashMap2 != null) {
                mapBuilder.putAll(linkedHashMap2);
            }
            linkedHashMap.putAll(mapBuilder.j());
        }
        return new zj71(hm2Var.b, new LinkedHashMap(linkedHashMap), no61Var);
    }

    public hg81 e(String str) {
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        hg81 hg81Var = (hg81) hashMap.get(str);
        if (hg81Var != null) {
            return hg81Var;
        }
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        hg81 hg81Var2 = new hg81(keyAt, str, g581.c);
        hashMap.put(str, hg81Var2);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.w).put(keyAt, true);
        ((SparseArray) ((m2v) this.x).b).put(keyAt, hg81Var2);
        return hg81Var2;
    }

    public void f() {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        m2v m2vVar = (m2v) this.x;
        SparseArray sparseArray = (SparseArray) m2vVar.b;
        if (sparseArray.size() != 0) {
            try {
                SQLiteDatabase writableDatabase = ((wm0) m2vVar.a).getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i = 0; i < sparseArray.size(); i++) {
                    try {
                        hg81 hg81Var = (hg81) sparseArray.valueAt(i);
                        if (hg81Var == null) {
                            int keyAt = sparseArray.keyAt(i);
                            String str = (String) m2vVar.w;
                            str.getClass();
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            g581 g581Var = hg81Var.e;
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            Set<Map.Entry> entrySet = g581Var.b.entrySet();
                            dataOutputStream.writeInt(entrySet.size());
                            for (Map.Entry entry : entrySet) {
                                dataOutputStream.writeUTF((String) entry.getKey());
                                byte[] bArr = (byte[]) entry.getValue();
                                dataOutputStream.writeInt(bArr.length);
                                dataOutputStream.write(bArr);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("id", Integer.valueOf(hg81Var.a));
                            contentValues.put("key", hg81Var.b);
                            contentValues.put(kju0.j, byteArray);
                            String str2 = (String) m2vVar.w;
                            str2.getClass();
                            writableDatabase.replaceOrThrow(str2, null, contentValues);
                        }
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                sparseArray.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e) {
                throw new m30(e);
            }
        }
        int size = sparseBooleanArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i2));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.w).clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0180 A[Catch: all -> 0x01c6, TryCatch #4 {all -> 0x01c6, blocks: (B:19:0x0143, B:20:0x017a, B:22:0x0180, B:23:0x01a3, B:25:0x01a9, B:27:0x01c8, B:29:0x01f4), top: B:18:0x0143, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(long j) {
        SQLiteDatabase writableDatabase;
        sl81 sl81Var;
        sl81 sl81Var2;
        DataInputStream dataInputStream;
        File file;
        DataInputStream dataInputStream2;
        int readInt;
        int i;
        int hashCode;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        m2v m2vVar = (m2v) this.x;
        m2vVar.getClass();
        String hexString = Long.toHexString(j);
        m2vVar.c = hexString;
        m2vVar.w = g8e.o("ExoPlayerCacheIndex", hexString);
        SQLiteDatabase readableDatabase = ((wm0) m2vVar.a).getReadableDatabase();
        String str = (String) m2vVar.c;
        str.getClass();
        if (!(ye81.a(readableDatabase, 1, str) != -1) && (sl81Var2 = (sl81) this.y) != null) {
            rr41 rr41Var = (rr41) sl81Var2.a;
            if (((File) rr41Var.b).exists() || ((File) rr41Var.c).exists()) {
                rr41 rr41Var2 = (rr41) ((sl81) this.y).a;
                File file2 = (File) rr41Var2.b;
                File file3 = (File) rr41Var2.c;
                if (file2.exists() || file3.exists()) {
                    try {
                        if (file3.exists()) {
                            file2.delete();
                            file3.renameTo(file2);
                        }
                        dataInputStream2 = new DataInputStream(new BufferedInputStream(new FileInputStream(file2)));
                        try {
                            try {
                                readInt = dataInputStream2.readInt();
                            } catch (Throwable th) {
                                th = th;
                                dataInputStream = dataInputStream2;
                                if (dataInputStream != null) {
                                    rf71.m(dataInputStream);
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                            file = file3;
                        }
                    } catch (IOException unused2) {
                        file = file3;
                        dataInputStream2 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        dataInputStream = null;
                    }
                    if (readInt >= 0 && readInt <= 2 && (dataInputStream2.readInt() & 1) == 0) {
                        int readInt2 = dataInputStream2.readInt();
                        int i2 = 0;
                        int i3 = 0;
                        while (i3 < readInt2) {
                            hg81 d = sl81.d(readInt, dataInputStream2);
                            int i4 = d.a;
                            file = file3;
                            try {
                                String str2 = d.b;
                                hashMap.put(str2, d);
                                sparseArray.put(i4, str2);
                                int hashCode2 = str2.hashCode() + (i4 * 31);
                                g581 g581Var = d.e;
                                if (readInt < 2) {
                                    long a = j571.a(g581Var);
                                    i = readInt2;
                                    hashCode = ((int) (a ^ (a >>> 32))) + (hashCode2 * 31);
                                } else {
                                    i = readInt2;
                                    hashCode = (hashCode2 * 31) + g581Var.hashCode();
                                }
                                i2 += hashCode;
                                i3++;
                                readInt2 = i;
                                file3 = file;
                            } catch (IOException unused3) {
                                if (dataInputStream2 != null) {
                                    rf71.m(dataInputStream2);
                                }
                                hashMap.clear();
                                sparseArray.clear();
                                file2.delete();
                                file.delete();
                                writableDatabase = ((wm0) m2vVar.a).getWritableDatabase();
                                writableDatabase.beginTransactionNonExclusive();
                                try {
                                    String str3 = (String) m2vVar.c;
                                    str3.getClass();
                                    ye81.b(writableDatabase, 1, str3, 1);
                                    String str4 = (String) m2vVar.w;
                                    str4.getClass();
                                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str4));
                                    writableDatabase.execSQL("CREATE TABLE " + ((String) m2vVar.w) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                                    while (r2.hasNext()) {
                                    }
                                    writableDatabase.setTransactionSuccessful();
                                    ((SparseArray) m2vVar.b).clear();
                                    writableDatabase.endTransaction();
                                    sl81Var = (sl81) this.y;
                                    if (sl81Var != null) {
                                    }
                                } finally {
                                }
                            }
                        }
                        file = file3;
                        int readInt3 = dataInputStream2.readInt();
                        boolean z = dataInputStream2.read() == -1;
                        if (readInt3 == i2 && z) {
                            rf71.m(dataInputStream2);
                        } else {
                            rf71.m(dataInputStream2);
                            hashMap.clear();
                            sparseArray.clear();
                            file2.delete();
                            file.delete();
                        }
                    }
                    file = file3;
                    rf71.m(dataInputStream2);
                    hashMap.clear();
                    sparseArray.clear();
                    file2.delete();
                    file.delete();
                }
                try {
                    writableDatabase = ((wm0) m2vVar.a).getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    String str32 = (String) m2vVar.c;
                    str32.getClass();
                    ye81.b(writableDatabase, 1, str32, 1);
                    String str42 = (String) m2vVar.w;
                    str42.getClass();
                    writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str42));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) m2vVar.w) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                    for (hg81 hg81Var : hashMap.values()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        g581 g581Var2 = hg81Var.e;
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry> entrySet = g581Var2.b.entrySet();
                        dataOutputStream.writeInt(entrySet.size());
                        for (Map.Entry entry : entrySet) {
                            dataOutputStream.writeUTF((String) entry.getKey());
                            byte[] bArr = (byte[]) entry.getValue();
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(hg81Var.a));
                        contentValues.put("key", hg81Var.b);
                        contentValues.put(kju0.j, byteArray);
                        String str5 = (String) m2vVar.w;
                        str5.getClass();
                        writableDatabase.replaceOrThrow(str5, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    ((SparseArray) m2vVar.b).clear();
                    writableDatabase.endTransaction();
                    sl81Var = (sl81) this.y;
                    if (sl81Var != null) {
                        rr41 rr41Var3 = (rr41) sl81Var.a;
                        ((File) rr41Var3.b).delete();
                        ((File) rr41Var3.c).delete();
                        this.y = null;
                        return;
                    }
                    return;
                } catch (SQLException e) {
                    throw new m30(e);
                }
            }
        }
        wm0 wm0Var = (wm0) m2vVar.a;
        if (((SparseArray) m2vVar.b).size() == 0) {
            try {
                SQLiteDatabase readableDatabase2 = wm0Var.getReadableDatabase();
                String str6 = (String) m2vVar.c;
                str6.getClass();
                if (ye81.a(readableDatabase2, 1, str6) != 1) {
                    writableDatabase = wm0Var.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        String str7 = (String) m2vVar.c;
                        str7.getClass();
                        ye81.b(writableDatabase, 1, str7, 1);
                        String str8 = (String) m2vVar.w;
                        str8.getClass();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str8));
                        writableDatabase.execSQL("CREATE TABLE " + ((String) m2vVar.w) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                SQLiteDatabase readableDatabase3 = wm0Var.getReadableDatabase();
                String str9 = (String) m2vVar.w;
                str9.getClass();
                Cursor query = readableDatabase3.query(str9, m2v.A, null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        int i5 = query.getInt(0);
                        String string = query.getString(1);
                        string.getClass();
                        hashMap.put(string, new hg81(i5, string, d(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                        sparseArray.put(i5, string);
                    } finally {
                    }
                }
                query.close();
            } catch (SQLiteException e2) {
                hashMap.clear();
                sparseArray.clear();
                throw new m30(e2);
            }
        } else {
            ny61.k();
        }
        sl81Var = (sl81) this.y;
        if (sl81Var != null) {
        }
    }

    public void h(we6 we6Var, v281 v281Var, yn81 yn81Var) {
        if (v281Var == null) {
            return;
        }
        if (yn81Var.a(v281Var.a) != -1) {
            we6Var.c(v281Var, yn81Var);
            return;
        }
        yn81 yn81Var2 = (yn81) ((bl2) this.c).get(v281Var);
        if (yn81Var2 != null) {
            we6Var.c(v281Var, yn81Var2);
        }
    }

    public void i(yn81 yn81Var) {
        t31 t31Var;
        we6 we6Var = new we6();
        if (((t31) this.b).isEmpty()) {
            h(we6Var, (v281) this.x, yn81Var);
            if (!tja1.a((v281) this.y, (v281) this.x)) {
                h(we6Var, (v281) this.y, yn81Var);
            }
            if (!tja1.a((v281) this.w, (v281) this.x) && !tja1.a((v281) this.w, (v281) this.y)) {
                h(we6Var, (v281) this.w, yn81Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((t31) this.b).size();
                t31Var = (t31) this.b;
                if (i >= size) {
                    break;
                }
                h(we6Var, (v281) t31Var.get(i), yn81Var);
                i++;
            }
            if (!t31Var.contains((v281) this.w)) {
                h(we6Var, (v281) this.w, yn81Var);
            }
        }
        this.c = bl2.f(we6Var.b, (Object[]) we6Var.c);
    }

    public void k(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.w;
        HashMap hashMap = (HashMap) this.a;
        hg81 hg81Var = (hg81) hashMap.get(str);
        if (hg81Var != null) {
            int i = hg81Var.a;
            if (hg81Var.c.isEmpty() && hg81Var.d.isEmpty()) {
                hashMap.remove(str);
                boolean z = sparseBooleanArray.get(i);
                SparseArray sparseArray = (SparseArray) ((m2v) this.x).b;
                if (z) {
                    sparseArray.delete(i);
                } else {
                    sparseArray.put(i, null);
                }
                SparseArray sparseArray2 = (SparseArray) this.b;
                if (z) {
                    sparseArray2.remove(i);
                    sparseBooleanArray.delete(i);
                } else {
                    sparseArray2.put(i, null);
                    ((SparseBooleanArray) this.c).put(i, true);
                }
            }
        }
    }

    public com.yandex.go.scooters.photocontrol.camera_ui.take_photo.b l(ScootersExamType scootersExamType, a aVar, iio0 iio0Var) {
        zho0 cVar;
        Context context = (Context) this.a;
        fva0 fva0Var = (fva0) this.b;
        n5o0 n5o0Var = (n5o0) this.c;
        ljo0 b = ((vr) this.w).b(scootersExamType);
        hjo0 hjo0Var = (hjo0) this.x;
        s6k0 s6k0Var = (s6k0) this.y;
        g gVar = new g((tt2) ((e7g) ((wio0) s6k0Var.c).a.b).get(), aVar);
        int i = yho0.a[scootersExamType.ordinal()];
        if (i == 1) {
            cjm0 cjm0Var = ((bio0) s6k0Var.a).a;
            cVar = new c((tt2) ((e7g) cjm0Var.b).get(), (k7p) ((xvf0) cjm0Var.c).get(), aVar, gVar);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            kio0 kio0Var = ((lio0) s6k0Var.b).a;
            cVar = new f((tt2) kio0Var.b.get(), (gp60) kio0Var.a.get(), aVar, gVar);
        }
        cjm0 cjm0Var2 = hjo0Var.a;
        return new com.yandex.go.scooters.photocontrol.camera_ui.take_photo.b(context, fva0Var, b, n5o0Var, new gjo0((h) ((g1n0) cjm0Var2.b).get(), (com.yandex.go.scooters.photocontrol.data.a) ((wun0) cjm0Var2.c).get(), scootersExamType, aVar, iio0Var, cVar));
    }

    public String m() {
        return (String) this.x;
    }

    public String n() {
        return (String) this.w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0231  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [obm] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r41v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t741 o(Route route, List list, double d) {
        ?? r41;
        String str;
        String routeId;
        Iterator it;
        String str2;
        String F;
        Drawable c;
        ?? r17;
        String text;
        String str3;
        Context context;
        Address address;
        String str4;
        Time arrivalTime;
        Time departureTime;
        pwy0 pwy0Var = (pwy0) this.w;
        Context context2 = (Context) this.a;
        a640 a640Var = (a640) this.x;
        zuj0 zuj0Var = (zuj0) this.b;
        ArrayList arrayList = new ArrayList();
        Address address2 = (Address) kotlin.collections.a.R(list);
        Address address3 = (Address) kotlin.collections.a.b0(list);
        RouteMetadata metadata = route.getMetadata();
        TravelEstimation estimation = metadata.getEstimation();
        String text2 = (estimation == null || (departureTime = estimation.getDepartureTime()) == null) ? null : departureTime.getText();
        String str5 = "";
        if (text2 == null) {
            text2 = "";
        }
        String text3 = (estimation == null || (arrivalTime = estimation.getArrivalTime()) == null) ? null : arrivalTime.getText();
        if (text3 == null) {
            text3 = "";
        }
        if (text2.length() == 0 || text3.length() == 0) {
            r41 = 0;
            long currentTimeMillis = System.currentTimeMillis();
            DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(context2);
            text2 = timeFormat.format(new Date(currentTimeMillis));
            text3 = timeFormat.format(new Date((m810.a(metadata.getWeight().getTime().getValue() / 60.0d) * 60 * 1000) + currentTimeMillis));
        } else {
            r41 = 0;
        }
        String str6 = text3;
        String F2 = address2 != null ? q5z.F(address2) : r41;
        if (F2 == null) {
            F2 = "";
        }
        avj0 avj0Var = (avj0) zuj0Var;
        String h = avj0Var.h(kyh0.mt_route_start_description);
        String str7 = Extension.FIX_SPACE;
        String q = oyr.q(h, Extension.FIX_SPACE, F2, Extension.FIX_SPACE, text2);
        kj Ig = ((ru.yandex.taxi.am.g) this.y).a.Ig();
        if (Ig != null) {
            if (Ig.i) {
                Ig = r41;
            }
            if (Ig != null && (str4 = Ig.h) != null && !evu0.J(str4)) {
                str = str4;
                Integer valueOf = Integer.valueOf(q2h0.ic_transport_source);
                routeId = route.getMetadata().getRouteId();
                if (routeId == null) {
                    routeId = String.valueOf(route.hashCode());
                }
                f911 f911Var = f911.a;
                arrayList.add(new h611(F2, text2, valueOf, null, str, q, f911Var, routeId));
                it = route.getSections().iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        scc.m();
                        throw r41;
                    }
                    Section section = (Section) next;
                    double value = section.getMetadata().getWeight().getWalkingDistance().getValue();
                    if (i == 0) {
                        value += d;
                    }
                    String str8 = str7;
                    double d2 = value;
                    pwy0 pwy0Var2 = pwy0Var;
                    String text4 = (i != 0 || d <= 0.0d) ? section.getMetadata().getWeight().getWalkingDistance().getText() : a640Var.a(d2);
                    String text5 = section.getMetadata().getWeight().getTime().getText();
                    a640Var.getClass();
                    Iterator it2 = it;
                    Address address4 = address3;
                    int ceil = (int) Math.ceil(d2 / 0.71d);
                    RouteMetadata routeMetadata = metadata;
                    String str9 = str5;
                    String U = tje.U(context2, dwh0.walking_navigation_steps, kyh0.walking_navigation_steps_other, ceil, Integer.valueOf(ceil));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Drawable t = vng.t(q2h0.ic_walk_16, avj0Var.a);
                    if (t != null) {
                        context = context2;
                        address = address4;
                        spannableStringBuilder.append(" ", new CustomImageSpan(t, 2, false, false, new xjf("pedestrian-" + pwy0Var2.getThemeType()), 12, null), 33);
                    } else {
                        context = context2;
                        address = address4;
                    }
                    spannableStringBuilder.append((CharSequence) U);
                    spannableStringBuilder.append((CharSequence) " · ");
                    spannableStringBuilder.append((CharSequence) text4);
                    arrayList.add(new r611(spannableStringBuilder, text5, g8e.p(a640Var.a(d2), " · ", U), g8e.p(avj0Var.i(kyh0.mt_pedestrian_section_description, U), str8, text4), oyr.i(i, "pedestrian_")));
                    str7 = str8;
                    i = i2;
                    it = it2;
                    pwy0Var = pwy0Var2;
                    metadata = routeMetadata;
                    str5 = str9;
                    context2 = context;
                    address3 = address;
                }
                pwy0 pwy0Var3 = pwy0Var;
                Address address5 = address3;
                RouteMetadata routeMetadata2 = metadata;
                String str10 = str7;
                str2 = str5;
                F = address5 == null ? q5z.F(address5) : r41;
                if (F == null) {
                    F = str2;
                }
                String q2 = oyr.q(F, str10, avj0Var.h(kyh0.mt_route_end_description), str10, str6);
                String str11 = r41;
                c = ((zzi) this.c).c(str11);
                if (c == null) {
                    r17 = new obm("destination-" + pwy0Var3.getThemeType(), c);
                } else {
                    r17 = str11;
                }
                arrayList.add(new n611(F, str6, null, r17, q2, f911Var, "finish"));
                text = routeMetadata2.getWeight().getTime().getText();
                if (text.length() > 0 || str6.length() <= 0) {
                    str3 = text.length() <= 0 ? text : str2;
                } else {
                    String i3 = avj0Var.i(kyh0.walking_navigation_arrival_time, str6);
                    if (i3.length() > 0) {
                        i3 = ((Object) String.valueOf(i3.charAt(0)).toLowerCase(Locale.ROOT)) + i3.substring(1);
                    }
                    str3 = oyr.q(text, " ", avj0Var.h(kyh0.mt_header_text_separator), " ", i3);
                }
                String obj = evu0.k0(avj0Var.i(kyh0.mt_pedestrian_section_description, str2)).toString();
                if (str3.length() > 0) {
                    obj = g8e.p(obj, " ", str3);
                }
                return new t741(str3, obj, text, d <= 0.0d ? a640Var.a(routeMetadata2.getWeight().getWalkingDistance().getValue() + d) : routeMetadata2.getWeight().getWalkingDistance().getText(), avj0Var.h(kyh0.walking_navigation_start), arrayList);
            }
        }
        str = r41;
        Integer valueOf2 = Integer.valueOf(q2h0.ic_transport_source);
        routeId = route.getMetadata().getRouteId();
        if (routeId == null) {
        }
        f911 f911Var2 = f911.a;
        arrayList.add(new h611(F2, text2, valueOf2, null, str, q, f911Var2, routeId));
        it = route.getSections().iterator();
        int i4 = 0;
        while (it.hasNext()) {
        }
        pwy0 pwy0Var32 = pwy0Var;
        Address address52 = address3;
        RouteMetadata routeMetadata22 = metadata;
        String str102 = str7;
        str2 = str5;
        if (address52 == null) {
        }
        if (F == null) {
        }
        String q22 = oyr.q(F, str102, avj0Var.h(kyh0.mt_route_end_description), str102, str6);
        String str112 = r41;
        c = ((zzi) this.c).c(str112);
        if (c == null) {
        }
        arrayList.add(new n611(F, str6, null, r17, q22, f911Var2, "finish"));
        text = routeMetadata22.getWeight().getTime().getText();
        if (text.length() > 0) {
        }
        if (text.length() <= 0) {
        }
        String obj2 = evu0.k0(avj0Var.i(kyh0.mt_pedestrian_section_description, str2)).toString();
        if (str3.length() > 0) {
        }
        return new t741(str3, obj2, text, d <= 0.0d ? a640Var.a(routeMetadata22.getWeight().getWalkingDistance().getValue() + d) : routeMetadata22.getWeight().getWalkingDistance().getText(), avj0Var.h(kyh0.walking_navigation_start), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x03d1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean p(Screen screen, String str, ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger, sls slsVar) {
        pex0 m;
        String str2;
        Object obj;
        String str3;
        pex0 pex0Var;
        pex0 pex0Var2;
        Object obj2;
        nuq0 nuq0Var;
        nuq0 nuq0Var2;
        pex0 m2;
        String str4;
        qqo qqoVar;
        fkl0 bkl0Var;
        qqo qqoVar2;
        int i;
        Screen screen2;
        vmn0 vmn0Var = this;
        Screen screen3 = screen;
        ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.a aVar = (ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.a) vmn0Var.a;
        qqo qqoVar3 = aVar.a;
        qqo qqoVar4 = aVar.a;
        if (!((DeliveryTariffsCommentRedirectionsExperiment) qqoVar3.b()).b || (m = ((k) ((wiq0) vmn0Var.b)).m()) == null || (str2 = m.b) == null) {
            return false;
        }
        List<DeliveryTariffsCommentRedirectionsExperiment.b> list = ((DeliveryTariffsCommentRedirectionsExperiment) qqoVar4.b()).d;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (DeliveryTariffsCommentRedirectionsExperiment.b bVar : list) {
            String str5 = bVar.a;
            List<DeliveryTariffsCommentRedirectionsExperiment.a> list2 = bVar.b;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, i2));
            for (DeliveryTariffsCommentRedirectionsExperiment.a aVar2 : list2) {
                DeliveryTariffsCommentRedirectionsExperiment deliveryTariffsCommentRedirectionsExperiment = (DeliveryTariffsCommentRedirectionsExperiment) qqoVar4.b();
                ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.h hVar = aVar2.a;
                if (hVar instanceof ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.f) {
                    bkl0Var = new dkl0(((ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.f) hVar).a);
                    qqoVar = qqoVar4;
                } else if (hVar instanceof e) {
                    jsq0 jsq0Var = ((e) hVar).a;
                    ArrayList arrayList3 = new ArrayList();
                    for (DeliveryTariffsCommentRedirectionsExperiment.ScreenDto screenDto : jsq0Var.a) {
                        if (screenDto == null) {
                            qqoVar2 = qqoVar4;
                            i = -1;
                        } else {
                            qqoVar2 = qqoVar4;
                            i = l.a[screenDto.ordinal()];
                        }
                        if (i == -1) {
                            screen2 = null;
                        } else if (i == 1) {
                            screen2 = Screen.EXPLICIT_COMMENT;
                        } else {
                            if (i != 2) {
                                w511.b();
                                return false;
                            }
                            screen2 = Screen.ADDRESS_DETAILS;
                        }
                        if (screen2 != null) {
                            arrayList3.add(screen2);
                        }
                        qqoVar4 = qqoVar2;
                    }
                    qqoVar = qqoVar4;
                    bkl0Var = new ckl0(arrayList3);
                } else {
                    qqoVar = qqoVar4;
                    bkl0Var = hVar instanceof d ? new bkl0(((d) hVar).a) : ekl0.a;
                }
                arrayList2.add(new akl0(bkl0Var, aVar2.b, aVar2.c, d6z.Y(deliveryTariffsCommentRedirectionsExperiment, aVar2.d), d6z.Y(deliveryTariffsCommentRedirectionsExperiment, aVar2.e), d6z.Y(deliveryTariffsCommentRedirectionsExperiment, aVar2.f), d6z.Y(deliveryTariffsCommentRedirectionsExperiment, aVar2.g)));
                qqoVar4 = qqoVar;
            }
            qqo qqoVar5 = qqoVar4;
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                akl0 akl0Var = (akl0) next;
                if (akl0Var.d.length() > 0 && akl0Var.f.length() > 0) {
                    arrayList4.add(next);
                }
            }
            arrayList.add(new umx0(str5, arrayList4));
            qqoVar4 = qqoVar5;
            i2 = 10;
        }
        int i3 = 0;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (jl40.l(((umx0) obj).a, str2)) {
                break;
            }
        }
        umx0 umx0Var = (umx0) obj;
        if (umx0Var == null) {
            return false;
        }
        ArrayList arrayList5 = umx0Var.b;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList5) {
            akl0 akl0Var2 = (akl0) obj3;
            fkl0 fkl0Var = akl0Var2.a;
            if (fkl0Var instanceof ckl0) {
                if (!((ckl0) fkl0Var).a.isEmpty() && !((ckl0) akl0Var2.a).a.contains(screen3)) {
                }
                arrayList6.add(obj3);
            } else if (!(fkl0Var instanceof bkl0) && !(fkl0Var instanceof dkl0)) {
                if (!(fkl0Var instanceof ekl0)) {
                    w511.b();
                    return false;
                }
            } else if (screen3 == Screen.EXPLICIT_COMMENT) {
                arrayList6.add(obj3);
            }
        }
        Iterator it3 = arrayList6.iterator();
        while (it3.hasNext()) {
            akl0 akl0Var3 = (akl0) it3.next();
            v7r v7rVar = (v7r) vmn0Var.c;
            List list3 = akl0Var3.c;
            String str6 = akl0Var3.g;
            String str7 = akl0Var3.f;
            String str8 = akl0Var3.e;
            String str9 = akl0Var3.d;
            int i4 = akl0Var3.b;
            v7rVar.getClass();
            if (str != null) {
                String lowerCase = b64.k("\\p{Punct}", str, "").toLowerCase(Locale.ROOT);
                char[] cArr = new char[1];
                cArr[i3] = HexString.CHAR_SPACE;
                List Y = evu0.Y(lowerCase, cArr, i3, 6);
                Iterator it4 = list3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (Y.contains(((String) it4.next()).toLowerCase(Locale.ROOT))) {
                        fkl0 fkl0Var2 = akl0Var3.a;
                        if (fkl0Var2 instanceof ckl0) {
                            apf apfVar = (apf) vmn0Var.w;
                            t8i t8iVar = (t8i) apfVar.b;
                            if (t8iVar.b("d2d_alert_key" + screen3.getCacheKey()) < i4 && ((zof) apfVar.c).a()) {
                                slsVar.invoke();
                                ((xl10) apfVar.w).d(str9, str8, str7, null, new sb0(22, apfVar, akl0Var3, showAlertInteractor$AnalyticsTrigger), null);
                                zch zchVar = (zch) apfVar.x;
                                zchVar.getClass();
                                zchVar.l("PersonalStatePopupSuggest.Shown", zch.i(akl0Var3, showAlertInteractor$AnalyticsTrigger));
                                t8iVar.a("d2d_alert_key" + screen3.getCacheKey());
                                return true;
                            }
                        } else if (fkl0Var2 instanceof dkl0) {
                            w040 w040Var = (w040) vmn0Var.x;
                            String str10 = ((dkl0) fkl0Var2).a;
                            t8i t8iVar2 = (t8i) w040Var.d;
                            String str11 = ((m8i) w040Var.b).a.c;
                            if (str11 != null && (m2 = ((k) ((wiq0) w040Var.a)).m()) != null && (str4 = m2.b) != null) {
                                String j = b64.j(str4, str10);
                                if (t8iVar2.b(j) < i4) {
                                    if (b8r.d((b8r) w040Var.e, str10, null, 6) != null) {
                                        ((xl10) w040Var.h).d(str9, str8, str7, str6, new npb(w040Var, akl0Var3, showAlertInteractor$AnalyticsTrigger, slsVar, str10, 5), new npb(w040Var, akl0Var3, showAlertInteractor$AnalyticsTrigger, str4, str11, 6));
                                        t8iVar2.a(j);
                                        zch zchVar2 = (zch) w040Var.f;
                                        zchVar2.getClass();
                                        zchVar2.l("PersonalStatePopupSuggest.Shown", zch.i(akl0Var3, showAlertInteractor$AnalyticsTrigger));
                                        return true;
                                    }
                                }
                            }
                        } else if (fkl0Var2 instanceof bkl0) {
                            j4n j4nVar = (j4n) vmn0Var.y;
                            boolean z = ((bkl0) fkl0Var2).a;
                            t8i t8iVar3 = (t8i) j4nVar.a;
                            k kVar = (k) ((wiq0) j4nVar.x);
                            pex0 m3 = kVar.m();
                            if (m3 != null && (str3 = m3.b) != null && ((zof) j4nVar.b).a() && t8iVar3.b("d2d_redirect_alert_key") < i4) {
                                fnx0 n = kVar.n();
                                if (n != null && (pex0Var = n.c) != null) {
                                    if (ru.yandex.taxi.tariffs.model.b.i(pex0Var)) {
                                        ati atiVar = pex0Var.Z;
                                        if (atiVar == null || (nuq0Var2 = atiVar.d) == null || !nuq0Var2.a) {
                                            if (!ru.yandex.taxi.tariffs.model.b.h(pex0Var) && (pex0Var2 = pex0Var.M0) != null) {
                                                Iterator it5 = ru.yandex.taxi.tariffs.model.b.b(pex0Var2).iterator();
                                                while (true) {
                                                    if (!it5.hasNext()) {
                                                        obj2 = null;
                                                        break;
                                                    }
                                                    obj2 = it5.next();
                                                    ati atiVar2 = ((nu1) obj2).a.Z;
                                                    if (atiVar2 != null && (nuq0Var = atiVar2.d) != null && nuq0Var.a) {
                                                        break;
                                                    }
                                                }
                                                nu1 nu1Var = (nu1) obj2;
                                                if (nu1Var != null) {
                                                    pex0Var = nu1Var.a;
                                                }
                                            }
                                        }
                                    } else {
                                        pex0Var = null;
                                    }
                                    if (pex0Var != null) {
                                        ((xl10) j4nVar.c).d(str9, str8, str7, t8iVar3.b("d2d_redirect_alert_key") < i4 + (-1) ? str6 : null, new npb(j4nVar, akl0Var3, showAlertInteractor$AnalyticsTrigger, slsVar, pex0Var, 1), new dpf(0, j4nVar, akl0Var3, showAlertInteractor$AnalyticsTrigger, str3, slsVar, z));
                                        zch zchVar3 = (zch) j4nVar.w;
                                        zchVar3.getClass();
                                        zchVar3.l("PersonalStatePopupSuggest.Shown", zch.i(akl0Var3, showAlertInteractor$AnalyticsTrigger));
                                        t8iVar3.a("d2d_redirect_alert_key");
                                        return true;
                                    }
                                }
                                pex0Var = null;
                                if (pex0Var != null) {
                                }
                            }
                        }
                    } else {
                        vmn0Var = this;
                        screen3 = screen;
                    }
                }
            }
            vmn0Var = this;
            screen3 = screen;
            i3 = 0;
        }
        return false;
    }

    @Override // defpackage.cv81
    public void v(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            Context context = extendedNativeAdView.getContext();
            ujk ujkVar = (ujk) this.c;
            pey peyVar = (pey) this.y;
            String str = (String) this.x;
            Div2View div2View = new Div2View(new Div2Context(new ContextThemeWrapper(context, m0i0.Div), ujkVar, 0, peyVar, 4, null), null, 0, 6, null);
            div2View.setTag(str);
            extendedNativeAdView.addView(div2View);
            div2View.setData((omk) this.a, new zmk(UUID.randomUUID().toString()));
            y6k actionHandler = div2View.getActionHandler();
            in81 in81Var = actionHandler instanceof in81 ? (in81) actionHandler : null;
            if (in81Var == null) {
                in81Var = new in81();
                div2View.setActionHandler(in81Var);
            }
            f281 f281Var = (f281) this.b;
            f281 f281Var2 = in81Var.b;
            if (f281Var2 != null) {
                f281Var2.c.b = null;
            }
            f281Var.c.b = in81Var.a;
            in81Var.b = f281Var;
        } catch (Throwable th) {
            ((ge71) this.w).d("Failed to bind DivKit", th);
        }
    }

    public vmn0(omk omkVar, f281 f281Var, ujk ujkVar, ge71 ge71Var, pey peyVar, int i) {
        String str;
        if ((i & 16) != 0) {
            str = "";
        } else {
            str = "rootDivkitView";
        }
        this.a = omkVar;
        this.b = f281Var;
        this.c = ujkVar;
        this.w = ge71Var;
        this.x = str;
        this.y = peyVar;
    }

    public /* synthetic */ vmn0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
        this.x = obj5;
        this.y = obj6;
    }

    public vmn0(Context context, ge71 ge71Var, zy2 zy2Var) {
        Object by61Var = zy2Var.a ? new by61() : new f581();
        vi71 vi71Var = new vi71(context, new qz61());
        rr41 rr41Var = new rr41(context, ge71Var, 19);
        xv71 xv71Var = new xv71();
        w081 w081Var = new w081();
        this.a = zy2Var;
        this.b = by61Var;
        this.c = vi71Var;
        this.w = rr41Var;
        this.x = xv71Var;
        this.y = w081Var;
    }

    public vmn0(Context context, d881 d881Var, fe81 fe81Var, v981 v981Var, mj31 mj31Var) {
        Context context2 = ((n291) v981Var).a;
        ge71 c = wha1.c(context2, context2);
        f571 f571Var = new f571();
        mj31 mj31Var2 = new mj31(context, 19);
        this.a = d881Var;
        this.b = fe81Var;
        this.c = mj31Var;
        this.w = c;
        this.x = f571Var;
        this.y = mj31Var2;
    }

    public vmn0(Context context, v981 v981Var, fe81 fe81Var, d881 d881Var, cl81 cl81Var) {
        k471 k471Var;
        hlx0 hlx0Var = new hlx0(v981Var);
        k471 k471Var2 = k471.d;
        if (k471Var2 == null) {
            synchronized (k471.e) {
                k471Var = k471.d;
                if (k471Var == null) {
                    k471Var = new k471(context.getApplicationContext());
                    k471.d = k471Var;
                }
            }
            k471Var2 = k471Var;
        }
        this.a = fe81Var;
        this.b = d881Var;
        this.c = cl81Var;
        this.w = hlx0Var;
        this.x = k471Var2;
        this.y = new WeakReference(context);
    }

    public vmn0(ie81 ie81Var) {
        this.a = ie81Var;
        p481 p481Var = t31.b;
        this.b = wk2.x;
        this.c = bl2.z;
    }

    public vmn0(wm0 wm0Var, File file) {
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.w = new SparseBooleanArray();
        m2v m2vVar = new m2v();
        m2vVar.a = wm0Var;
        m2vVar.b = new SparseArray();
        sl81 sl81Var = new sl81(new File(file, "monetization_cached_content_index.exi"));
        this.x = m2vVar;
        this.y = sl81Var;
    }

    public vmn0(Activity activity, String str, String str2, kh10 kh10Var) {
        this.a = activity;
        this.b = str2;
        this.c = kh10Var;
        final int i = 0;
        final int i2 = 1;
        this.w = new AlertDialog(activity).setMessage(str).setPositiveButton(kh10Var.s, new Runnable(this) { // from class: c321
            public final /* synthetic */ vmn0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                vmn0 vmn0Var = this.b;
                switch (i3) {
                    case 0:
                        q5z.c0((String) vmn0Var.b, ((kh10) vmn0Var.c).s, (Activity) vmn0Var.a, 0);
                        Runnable runnable = (Runnable) vmn0Var.x;
                        if (runnable != null) {
                            runnable.run();
                            break;
                        }
                        break;
                    default:
                        yue yueVar = (yue) vmn0Var.y;
                        if (yueVar != null) {
                            yueVar.run();
                            break;
                        }
                        break;
                }
            }
        }).setNegativeButton(kh10Var.t).setDismissListener(new Runnable(this) { // from class: c321
            public final /* synthetic */ vmn0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i2;
                vmn0 vmn0Var = this.b;
                switch (i3) {
                    case 0:
                        q5z.c0((String) vmn0Var.b, ((kh10) vmn0Var.c).s, (Activity) vmn0Var.a, 0);
                        Runnable runnable = (Runnable) vmn0Var.x;
                        if (runnable != null) {
                            runnable.run();
                            break;
                        }
                        break;
                    default:
                        yue yueVar = (yue) vmn0Var.y;
                        if (yueVar != null) {
                            yueVar.run();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public vmn0(MotionLayout motionLayout) {
        this.b = new ArrayList();
        this.w = "ViewTransitionController";
        this.y = new ArrayList();
        this.a = motionLayout;
    }

    public vmn0(j7g j7gVar, z8n0 z8n0Var, j7g j7gVar2, z1n0 z1n0Var, n3w n3wVar, n0k0 n0k0Var) {
        this.a = j7gVar;
        this.b = z8n0Var;
        this.c = j7gVar2;
        this.w = z1n0Var;
        this.y = n3wVar;
        this.x = n0k0Var;
    }

    @Override // defpackage.cv81
    public void c() {
    }
}
