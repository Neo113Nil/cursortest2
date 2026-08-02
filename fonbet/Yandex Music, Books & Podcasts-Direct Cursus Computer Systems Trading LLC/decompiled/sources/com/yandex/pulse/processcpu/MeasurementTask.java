package com.yandex.pulse.processcpu;

import android.app.ActivityManager;
import android.content.Context;
import android.os.DeadSystemException;
import android.os.SystemClock;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.c5b;
import defpackage.cz0;
import defpackage.e5b;
import defpackage.etm;
import defpackage.lyd;
import defpackage.mdr;
import defpackage.mgr;
import defpackage.sy0;
import defpackage.syr;
import defpackage.tah;
import defpackage.tfh;
import defpackage.ugr;
import defpackage.uo7;
import defpackage.uyr;
import defpackage.v75;
import defpackage.vy0;
import defpackage.wsm;
import defpackage.xav;
import defpackage.xy0;
import defpackage.y2x;
import defpackage.ysm;
import defpackage.zav;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/yandex/pulse/processcpu/MeasurementTask;", "", "Lxav;", "handlerCallback", "Lxav;", "ysm", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public class MeasurementTask {
    public static final lyd j = y2x.y(49, "ApplicationProcessCount");
    public final Context a;
    public final ysm b;
    public final tfh c;
    public final zav d;
    public final cz0 e;
    public final xy0 f;
    public final xy0 g;
    public final AtomicBoolean h;

    @Keep
    @NotNull
    private final xav handlerCallback;
    public long i;

    public MeasurementTask(Context context, ysm ysmVar, LinkedHashSet linkedHashSet, Map map, tfh tfhVar) {
        context.getClass();
        linkedHashSet.getClass();
        map.getClass();
        this.a = context;
        this.b = ysmVar;
        this.c = tfhVar;
        uo7 uo7Var = new uo7(1, this);
        this.handlerCallback = uo7Var;
        this.d = new zav(uo7Var);
        cz0 cz0Var = new cz0(0);
        cz0Var.addAll(linkedHashSet);
        this.e = cz0Var;
        xy0 xy0Var = new xy0(map.size());
        xy0Var.putAll(map);
        this.f = xy0Var;
        this.g = new xy0(0);
        this.h = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Map map;
        int i;
        long j2;
        String a;
        long j3;
        long j4;
        long j5;
        mgr mgrVar;
        long j6;
        mdr mdrVar;
        mdr mdrVar2;
        Object systemService;
        Context context = this.a;
        context.getClass();
        try {
            systemService = context.getSystemService("activity");
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadSystemException)) {
                throw e;
            }
            map = e5b.a;
            map.getClass();
        }
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            runningAppProcesses = c5b.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : runningAppProcesses) {
            if (((ActivityManager.RunningAppProcessInfo) obj).pid != 0) {
                arrayList.add(obj);
            }
        }
        int a2 = tah.a(v75.o(arrayList, 10));
        if (a2 < 16) {
            a2 = 16;
        }
        map = new LinkedHashMap(a2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            map.put(runningAppProcessInfo.processName, Integer.valueOf(runningAppProcessInfo.pid));
        }
        String packageName = context.getPackageName();
        String str = packageName + ':';
        Iterator it2 = map.entrySet().iterator();
        char c = 0;
        int i2 = 0;
        while (it2.hasNext()) {
            String str2 = (String) ((Map.Entry) it2.next()).getKey();
            if (Intrinsics.d(str2, packageName) || c.v(str2, str, false)) {
                i2++;
            }
        }
        j.b(i2);
        cz0 cz0Var = this.e;
        boolean isEmpty = cz0Var.isEmpty();
        xy0 xy0Var = this.f;
        if (!isEmpty) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                int intValue = ((Number) entry.getValue()).intValue();
                if (cz0Var.contains(str3)) {
                    cz0Var.remove(str3);
                    xy0Var.put(str3, Integer.valueOf(intValue));
                }
            }
        }
        this.i = SystemClock.uptimeMillis();
        Iterator it3 = ((sy0) xy0Var.entrySet()).iterator();
        while (true) {
            vy0 vy0Var = (vy0) it3;
            if (!vy0Var.hasNext()) {
                return;
            }
            vy0Var.next();
            String str4 = (String) vy0Var.getKey();
            Integer num = (Integer) vy0Var.getValue();
            num.getClass();
            wsm wsmVar = new wsm(num.intValue());
            File file = wsmVar.a;
            if (file.isDirectory()) {
                String a3 = wsmVar.a("cmdline");
                if (a3 == null) {
                    a3 = null;
                } else {
                    int S = StringsKt.S(a3, c, c, 6);
                    if (S >= 0) {
                        a3 = a3.substring(c, S);
                    }
                }
                if (Intrinsics.d(str4, a3)) {
                    String a4 = wsmVar.a("stat");
                    if (a4 != null) {
                        StringTokenizer stringTokenizer = new StringTokenizer(a4, StringUtil.SPACE);
                        int i3 = c;
                        while (true) {
                            mdrVar = mdr.c;
                            if (i3 >= 13) {
                                break;
                            }
                            try {
                                stringTokenizer.nextToken();
                                i3++;
                            } catch (NumberFormatException | NoSuchElementException unused) {
                                mdrVar2 = mdrVar;
                            }
                            if (!mdrVar.equals(mdrVar2)) {
                                long j7 = mdrVar2.b;
                                i = mdrVar2.a;
                                j2 = j7;
                                int i4 = i;
                                mgr mgrVar2 = mgr.c;
                                a = wsmVar.a("statm");
                                if (a != null) {
                                    StringTokenizer stringTokenizer2 = new StringTokenizer(a, StringUtil.SPACE);
                                    try {
                                        stringTokenizer2.nextToken();
                                        String nextToken = stringTokenizer2.nextToken();
                                        nextToken.getClass();
                                        long parseLong = Long.parseLong(nextToken);
                                        String nextToken2 = stringTokenizer2.nextToken();
                                        nextToken2.getClass();
                                        long parseLong2 = Long.parseLong(nextToken2);
                                        uyr uyrVar = uyr.a;
                                        long j8 = syr.a;
                                        mgrVar = new mgr(parseLong * j8, parseLong2 * j8);
                                    } catch (NumberFormatException | NoSuchElementException unused2) {
                                        mgrVar = mgrVar2;
                                    }
                                    if (!mgrVar2.equals(mgrVar)) {
                                        try {
                                            FileReader fileReader = new FileReader(new File(file, "status"));
                                            try {
                                                j6 = ugr.a(fileReader);
                                                fileReader.close();
                                            } finally {
                                            }
                                        } catch (Exception unused3) {
                                            j6 = -1;
                                        }
                                        if (j6 != -1) {
                                            long j9 = mgrVar.a;
                                            long j10 = mgrVar.b;
                                            j4 = j10;
                                            j5 = j6 + j9;
                                            j3 = (j9 - j10) + j6;
                                            this.g.put(str4, new etm(j2, i4, j3, j4, j5));
                                            c = 0;
                                        }
                                    }
                                }
                                j3 = Long.MIN_VALUE;
                                j4 = Long.MIN_VALUE;
                                j5 = Long.MIN_VALUE;
                                this.g.put(str4, new etm(j2, i4, j3, j4, j5));
                                c = 0;
                            }
                        }
                        String nextToken3 = stringTokenizer.nextToken();
                        nextToken3.getClass();
                        long parseLong3 = Long.parseLong(nextToken3);
                        String nextToken4 = stringTokenizer.nextToken();
                        nextToken4.getClass();
                        long parseLong4 = Long.parseLong(nextToken4);
                        String nextToken5 = stringTokenizer.nextToken();
                        nextToken5.getClass();
                        long parseLong5 = Long.parseLong(nextToken5);
                        String nextToken6 = stringTokenizer.nextToken();
                        nextToken6.getClass();
                        long parseLong6 = parseLong3 + parseLong4 + parseLong5 + Long.parseLong(nextToken6);
                        stringTokenizer.nextToken();
                        stringTokenizer.nextToken();
                        String nextToken7 = stringTokenizer.nextToken();
                        nextToken7.getClass();
                        mdrVar2 = new mdr(parseLong6, Integer.parseInt(nextToken7));
                        if (!mdrVar.equals(mdrVar2)) {
                        }
                    }
                    i = -1;
                    j2 = -1;
                    int i42 = i;
                    mgr mgrVar22 = mgr.c;
                    a = wsmVar.a("statm");
                    if (a != null) {
                    }
                    j3 = Long.MIN_VALUE;
                    j4 = Long.MIN_VALUE;
                    j5 = Long.MIN_VALUE;
                    this.g.put(str4, new etm(j2, i42, j3, j4, j5));
                    c = 0;
                }
            }
            cz0Var.add(str4);
            vy0Var.remove();
            c = 0;
        }
    }
}
