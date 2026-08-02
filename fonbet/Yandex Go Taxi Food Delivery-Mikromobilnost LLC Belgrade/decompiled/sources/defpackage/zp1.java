package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.format.DateFormat;
import androidx.media3.exoplayer.f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.PriorityQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import retrofit2.Call;
import retrofit2.Response;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaFontWeight;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextOverflow;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextStyle;

/* loaded from: classes7.dex */
public final class zp1 implements yk7, t1n {
    public int a;
    public Object b;
    public final Object c;
    public final Object w;
    public Object x;
    public Object y;

    public zp1(Context context, String str, String str2, int i) {
        this.a = i;
        this.b = str2;
        yzh yzhVar = new yzh(context);
        this.c = yzhVar;
        this.w = new u1n(yzhVar);
        this.x = new zrm(3, yzhVar, str);
        this.y = new mum(yzhVar);
    }

    @Override // defpackage.t1n
    public int a() {
        int i = this.a;
        zrm zrmVar = (zrm) this.x;
        return Math.max(i, Math.max(((yzh) zrmVar.b).o((String) zrmVar.c), c()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r9 < r2.b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(long j, ef90 ef90Var) {
        ArrayDeque arrayDeque = (ArrayDeque) this.w;
        PriorityQueue priorityQueue = (PriorityQueue) this.x;
        int i = this.a;
        if (i != 0) {
            if (i != -1 && priorityQueue.size() >= this.a) {
                n0j0 n0j0Var = (n0j0) priorityQueue.peek();
                int i2 = tw21.a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.c;
            ef90 ef90Var2 = arrayDeque2.isEmpty() ? new ef90() : (ef90) arrayDeque2.pop();
            ef90Var2.H(ef90Var.a());
            System.arraycopy(ef90Var.a, ef90Var.b, ef90Var2.a, 0, ef90Var2.a());
            n0j0 n0j0Var2 = (n0j0) this.y;
            if (n0j0Var2 != null && j == n0j0Var2.b) {
                n0j0Var2.a.add(ef90Var2);
                return;
            }
            n0j0 n0j0Var3 = arrayDeque.isEmpty() ? new n0j0() : (n0j0) arrayDeque.pop();
            ArrayList arrayList = n0j0Var3.a;
            d6z.l(j != -9223372036854775807L);
            d6z.x(arrayList.isEmpty());
            n0j0Var3.b = j;
            arrayList.add(ef90Var2);
            priorityQueue.add(n0j0Var3);
            this.y = n0j0Var3;
            int i3 = this.a;
            if (i3 != -1) {
                g(i3);
                return;
            }
            return;
        }
        ((o0j0) this.b).d(j, ef90Var);
    }

    public int c() {
        u1n u1nVar = (u1n) this.w;
        int e = u1nVar.e();
        int o = ((yzh) this.c).o(String.valueOf(HexString.CHAR_SPACE));
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 6);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 18);
        CharSequence format = DateFormat.format("a", calendar);
        CharSequence format2 = DateFormat.format("a", calendar2);
        yzh yzhVar = (yzh) u1nVar.b;
        return e + o + Math.max(yzhVar.o(format), yzhVar.o(format2));
    }

    @Override // defpackage.t1n
    public int d() {
        return Math.max(this.a, ((mum) this.y).a(c(), (String) this.b));
    }

    @Override // defpackage.t1n
    public int e(String str) {
        return Math.max(this.a, ((mum) this.y).a(c(), str));
    }

    public void f() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.y = null;
        ((Call) this.b).cancel();
    }

    public void g(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.x;
        while (priorityQueue.size() > i) {
            n0j0 n0j0Var = (n0j0) priorityQueue.poll();
            int i2 = tw21.a;
            int i3 = 0;
            while (true) {
                arrayList = n0j0Var.a;
                if (i3 >= arrayList.size()) {
                    break;
                }
                ((o0j0) this.b).d(n0j0Var.b, (ef90) arrayList.get(i3));
                ((ArrayDeque) this.c).push((ef90) arrayList.get(i3));
                i3++;
            }
            arrayList.clear();
            n0j0 n0j0Var2 = (n0j0) this.y;
            if (n0j0Var2 != null && n0j0Var2.b == n0j0Var.b) {
                this.y = null;
            }
            ((ArrayDeque) this.w).push(n0j0Var);
        }
    }

    public Object h() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == ((a3x0) this.c).a.getLooper()) {
            return this.x;
        }
        d6z.x(myLooper == ((a3x0) this.b).a.getLooper());
        return this.y;
    }

    public up1 i() {
        xp1 xp1Var = (xp1) ((r0) this.c).getValue();
        if (xp1Var instanceof up1) {
            return (up1) xp1Var;
        }
        return null;
    }

    public int j() {
        up1 i = i();
        if (i != null) {
            return i.f;
        }
        return 0;
    }

    @Override // defpackage.yk7
    public void k(Call call, Throwable th) {
        int i = this.a;
        if (i >= 3 || !(th instanceof IOException) || (th instanceof SSLException)) {
            f();
            ((dzm) this.c).invoke(th);
            return;
        }
        this.a = i + 1;
        this.b = ((Call) this.b).clone();
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.y;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.y = ((ScheduledExecutorService) this.x).schedule(new js4(24, this), 3000L, TimeUnit.MILLISECONDS);
    }

    public void l(Object obj) {
        Object obj2 = this.x;
        this.x = obj;
        if (obj2.equals(obj)) {
            return;
        }
        f fVar = ((wno) this.w).b;
        ((Integer) obj2).getClass();
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        fVar.F();
        fVar.w(1, 10, num);
        fVar.w(2, 10, num);
        fVar.m.f(21, new vno(intValue, 1));
    }

    @Override // defpackage.yk7
    public void o(Call call, Response response) {
        ((tls) this.w).invoke(response);
    }

    public zp1(int[] iArr, wx71[] wx71VarArr, int[] iArr2, int[][][] iArr3, wx71 wx71Var) {
        this.b = iArr;
        this.c = wx71VarArr;
        this.x = iArr3;
        this.w = iArr2;
        this.y = wx71Var;
        this.a = iArr.length;
    }

    public zp1(String str, YaTextStyle yaTextStyle, YaFontWeight yaFontWeight, String str2, int i, YaTextOverflow yaTextOverflow) {
        this.b = str;
        this.c = yaTextStyle;
        this.w = yaFontWeight;
        this.x = str2;
        this.a = i;
        this.y = yaTextOverflow;
    }

    public zp1(yp1 yp1Var) {
        this.b = yp1Var;
        r0 c = bvf0.c(wp1.a);
        this.c = c;
        this.w = e.d(c);
    }

    public zp1(Call call, dzm dzmVar, tls tlsVar) {
        this.b = call;
        this.c = dzmVar;
        this.w = tlsVar;
        this.x = Executors.newSingleThreadScheduledExecutor();
    }

    public zp1(o0j0 o0j0Var) {
        this.b = o0j0Var;
        this.c = new ArrayDeque();
        this.w = new ArrayDeque();
        this.x = new PriorityQueue();
        this.a = -1;
    }

    public zp1(Object obj, Looper looper, Looper looper2, o2x0 o2x0Var, wno wnoVar) {
        this.b = o2x0Var.a(looper, null);
        this.c = o2x0Var.a(looper2, null);
        this.x = obj;
        this.y = obj;
        this.w = wnoVar;
    }
}
