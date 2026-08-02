package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.Selection;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class e3s implements nq4, nn5, x2r, w2q, r2i, ke, r33, lr5, fk6, va6, c8q, b0q, jkp, ke3, rek {
    public static volatile SharedPreferences f;
    public final /* synthetic */ int a;
    public static final e3s b = new e3s(1);
    public static final e3s c = new e3s(2);
    public static final e3s d = new e3s(3);
    public static final e3s e = new e3s(4);
    public static final e3s g = new e3s(5);
    public static final e3s h = new e3s(6);
    public static final byte[] i = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    public static final e3s j = new e3s(9);
    public static final e3s k = new e3s(10);
    public static final e3s l = new e3s(11);

    public e3s(sml smlVar, y7k y7kVar) {
        this.a = 16;
        btf.b(new b8w(8, this));
    }

    public static mt1 K() {
        mt1 mt1Var = mt1.l;
        mt1Var.getClass();
        mt1 mt1Var2 = mt1Var.f;
        if (mt1Var2 == null) {
            long nanoTime = System.nanoTime();
            mt1.i.await(mt1.j, TimeUnit.MILLISECONDS);
            mt1 mt1Var3 = mt1.l;
            mt1Var3.getClass();
            if (mt1Var3.f != null || System.nanoTime() - nanoTime < mt1.k) {
                return null;
            }
            return mt1.l;
        }
        long nanoTime2 = mt1Var2.g - System.nanoTime();
        if (nanoTime2 > 0) {
            mt1.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        mt1 mt1Var4 = mt1.l;
        mt1Var4.getClass();
        mt1Var4.f = mt1Var2.f;
        mt1Var2.f = null;
        mt1Var2.e = 2;
        return mt1Var2;
    }

    public static ozb L(Object obj) {
        if (!(obj instanceof String)) {
            return new ozb(obj);
        }
        return new qzb(y7k.a, (String) obj);
    }

    public static List O(eu7 eu7Var) {
        eu7Var.getClass();
        cu7 cu7Var = eu7Var.a;
        int i2 = cu7Var.f;
        int i3 = eu7Var.b.b;
        Integer valueOf = Integer.valueOf(i3);
        Integer num = null;
        if (i3 < 0 || i3 >= i2) {
            valueOf = null;
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (i2 > 0 && valueOf != null) {
            num = valueOf2;
        }
        if (valueOf == null || num == null) {
            return c5b.a;
        }
        e7 e7Var = new e7(new ss5(cu7Var.a.f(), cu7Var.b), valueOf.intValue(), num.intValue());
        ArrayList arrayList = new ArrayList(v75.o(e7Var, 10));
        c7 c7Var = new c7(0, e7Var);
        while (c7Var.hasNext()) {
            arrayList.add(((jzs) c7Var.next()).a.d());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean Q(x3b x3bVar, Editable editable, int i2, int i3, boolean z) {
        int min;
        if (editable != null && i2 >= 0 && i3 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int max = Math.max(i2, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (max == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char charAt = editable.charAt(selectionStart);
                                    if (z2) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt)) {
                                        max--;
                                    } else {
                                        if (Character.isHighSurrogate(charAt)) {
                                            break loop0;
                                        }
                                        z2 = true;
                                    }
                                } else if (!z2) {
                                    selectionStart = 0;
                                }
                            }
                            max--;
                        }
                    }
                    selectionStart = -1;
                    int max2 = Math.max(i3, 0);
                    min = editable.length();
                    if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (max2 == 0) {
                                    min = selectionEnd;
                                    break loop2;
                                }
                                if (selectionEnd < min) {
                                    char charAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(charAt2)) {
                                        max2--;
                                        selectionEnd++;
                                    } else {
                                        if (Character.isLowSurrogate(charAt2)) {
                                            break loop2;
                                        }
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                }
                            }
                            max2--;
                            selectionEnd++;
                        }
                    }
                    min = -1;
                    if (selectionStart != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i2, 0);
                    min = Math.min(selectionEnd + i3, editable.length());
                }
                kdt[] kdtVarArr = (kdt[]) editable.getSpans(selectionStart, min, kdt.class);
                if (kdtVarArr != null && kdtVarArr.length > 0) {
                    for (kdt kdtVar : kdtVarArr) {
                        int spanStart = editable.getSpanStart(kdtVar);
                        int spanEnd = editable.getSpanEnd(kdtVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        min = Math.max(spanEnd, min);
                    }
                    int max3 = Math.max(selectionStart, 0);
                    int min2 = Math.min(min, editable.length());
                    x3bVar.beginBatchEdit();
                    editable.delete(max3, min2);
                    x3bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    public static void X(cvo cvoVar, y yVar, String str, sai saiVar, Function0 function0, wn5 wn5Var, int i2) {
        if ((i2 & 4) != 0) {
            str = "BOTTOM_SHEET_DIALOG_TAG";
        }
        if ((i2 & 8) != 0) {
            saiVar = new sai(false);
        }
        if ((i2 & 32) != 0) {
            function0 = null;
        }
        cvoVar.getClass();
        yVar.getClass();
        str.getClass();
        saiVar.getClass();
        if (yVar.D(str) != null) {
            return;
        }
        mai maiVar = new mai();
        maiVar.g = cvoVar;
        maiVar.k = saiVar;
        maiVar.m = function0;
        maiVar.l = wn5Var;
        maiVar.n = false;
        maiVar.show(yVar, str);
    }

    public static nxk Y(mqs mqsVar) {
        mqsVar.getClass();
        return a4g.D(gys.AudioBookHolder, mqsVar) ? gxk.a : a4g.D(gys.PodcastHolder, mqsVar) ? ixk.a : a4g.D(gys.NonMusicHolder, mqsVar) ? hxk.a : mqsVar.C() ? kxk.a : fxk.a;
    }

    public static final void e(mt1 mt1Var, long j2, boolean z) {
        mt1 mt1Var2;
        ReentrantLock reentrantLock = mt1.h;
        if (mt1.l == null) {
            mt1.l = new mt1();
            jt1 jt1Var = new jt1("Okio Watchdog");
            jt1Var.setDaemon(true);
            jt1Var.start();
        }
        long nanoTime = System.nanoTime();
        if (j2 != 0 && z) {
            mt1Var.g = Math.min(j2, mt1Var.c() - nanoTime) + nanoTime;
        } else if (j2 != 0) {
            mt1Var.g = j2 + nanoTime;
        } else {
            if (!z) {
                wvs.b();
                return;
            }
            mt1Var.g = mt1Var.c();
        }
        long j3 = mt1Var.g - nanoTime;
        mt1 mt1Var3 = mt1.l;
        mt1Var3.getClass();
        while (true) {
            mt1Var2 = mt1Var3.f;
            if (mt1Var2 == null || j3 < mt1Var2.g - nanoTime) {
                break;
            } else {
                mt1Var3 = mt1Var2;
            }
        }
        mt1Var.f = mt1Var2;
        mt1Var3.f = mt1Var;
        if (mt1Var3 == mt1.l) {
            mt1.i.signal();
        }
    }

    @Override // defpackage.r2i
    public Object A(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2];
            if (b2 < 32 || b2 >= 126 || (b2 == 37 && i2 + 2 < bArr.length)) {
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
                int i3 = 0;
                while (i3 < bArr.length) {
                    if (bArr[i3] == 37 && i3 + 2 < bArr.length) {
                        try {
                            allocate.put((byte) Integer.parseInt(new String(bArr, i3 + 1, 2, pe4.a), 16));
                            i3 += 3;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    allocate.put(bArr[i3]);
                    i3++;
                }
                return new String(allocate.array(), 0, allocate.position(), pe4.b);
            }
        }
        return new String(bArr, 0);
    }

    @Override // defpackage.b0q
    public Object B(aaq aaqVar) {
        boolean z;
        aaqVar.getClass();
        if ((aaqVar instanceof t9q) || (aaqVar instanceof u9q) || (aaqVar instanceof x9q) || Intrinsics.d(aaqVar, y9q.a) || (aaqVar instanceof paq) || (aaqVar instanceof hbq) || (aaqVar instanceof caq)) {
            z = false;
        } else {
            if (!(aaqVar instanceof uaq)) {
                b6e.s();
                return null;
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.nn5
    public Object C(rdk rdkVar) {
        Object k2 = rdkVar.k(new m5n(h73.class, Executor.class));
        k2.getClass();
        return u2x.E((Executor) k2);
    }

    @Override // defpackage.b0q
    public Object D(yc5 yc5Var) {
        yc5Var.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.jkp
    public boolean E(Object obj) {
        ((deg) obj).getClass();
        return true;
    }

    @Override // defpackage.b0q
    public Object F(doc docVar) {
        docVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.b0q
    public Object G(xc5 xc5Var) {
        xc5Var.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.jkp
    public int H(Object obj) {
        ((deg) obj).getClass();
        return 5;
    }

    @Override // defpackage.ke3
    public rf3 J() {
        dfi.r("Calling NoopBottomNavigationPlugin, selectedTab", "NoopBottomNavigationPlugin");
        return null;
    }

    @Override // defpackage.b0q
    public Object M(g1q g1qVar) {
        g1qVar.getClass();
        if ((g1qVar instanceof d1q) || (g1qVar instanceof f1q) || (g1qVar instanceof l1q) || (g1qVar instanceof s1q) || (g1qVar instanceof b2q) || (g1qVar instanceof v1q) || (g1qVar instanceof i1q)) {
            return Boolean.FALSE;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.b0q
    public Object N(cd5 cd5Var) {
        cd5Var.getClass();
        return Boolean.FALSE;
    }

    public Signature[] P(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.b0q
    public Object R(w3d w3dVar) {
        w3dVar.getClass();
        return Boolean.FALSE;
    }

    public SharedPreferences V(Context context) {
        SharedPreferences sharedPreferences;
        context.getClass();
        SharedPreferences sharedPreferences2 = f;
        if (sharedPreferences2 != null) {
            return sharedPreferences2;
        }
        synchronized (this) {
            sharedPreferences = f;
            if (sharedPreferences == null) {
                sharedPreferences = context.getApplicationContext().getSharedPreferences("YANDEX_VIDEO_PLAYER_PREFERENCES", 0);
                f = sharedPreferences;
            }
        }
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    public boolean W(jc8 jc8Var, xzb xzbVar) {
        if (!(jc8Var instanceof rb8)) {
            if (jc8Var instanceof sb8) {
                return ((Boolean) ((sb8) jc8Var).c.A.a(xzbVar)).booleanValue();
            }
            if (jc8Var instanceof hb8) {
                return ((Boolean) ((hb8) jc8Var).c.H.a(xzbVar)).booleanValue();
            }
            if (jc8Var instanceof fb8) {
                return ((Boolean) ((fb8) jc8Var).c.E.a(xzbVar)).booleanValue();
            }
            return false;
        }
        List list = ((rb8) jc8Var).c.F;
        if (list == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((tq9) it.next()).e.a(xzbVar)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r2i
    public byte[] a(Object obj) {
        byte[] bytes = ((String) obj).getBytes(pe4.b);
        int i2 = 0;
        while (i2 < bytes.length) {
            byte b2 = bytes[i2];
            if (b2 < 32 || b2 >= 126 || b2 == 37) {
                byte[] bArr = new byte[((bytes.length - i2) * 3) + i2];
                if (i2 != 0) {
                    System.arraycopy(bytes, 0, bArr, 0, i2);
                }
                int i3 = i2;
                while (i2 < bytes.length) {
                    byte b3 = bytes[i2];
                    if (b3 < 32 || b3 >= 126 || b3 == 37) {
                        bArr[i3] = 37;
                        byte[] bArr2 = i;
                        bArr[i3 + 1] = bArr2[(b3 >> 4) & 15];
                        bArr[i3 + 2] = bArr2[b3 & 15];
                        i3 += 3;
                    } else {
                        bArr[i3] = b3;
                        i3++;
                    }
                    i2++;
                }
                return Arrays.copyOf(bArr, i3);
            }
            i2++;
        }
        return bytes;
    }

    @Override // defpackage.ke3
    public void b(rf3 rf3Var) {
        rf3Var.getClass();
        Assertions.throwOrSkip("NoopBottomNavigationPlugin", new FailedAssertionException("Calling NoopBottomNavigationPlugin, selectTabSilently"));
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return dxk.a;
    }

    @Override // defpackage.b0q
    public Object d(w6u w6uVar) {
        w6uVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.c8q
    public Object f() {
        return Executors.newCachedThreadPool(xqd.e("grpc-default-executor-%d"));
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        faqVar.getClass();
        if (faqVar instanceof daq) {
            return exk.a;
        }
        if (faqVar instanceof naq) {
            return Y(((naq) faqVar).e);
        }
        if (faqVar instanceof qaq) {
            return lxk.a;
        }
        if (faqVar instanceof saq) {
            return mxk.a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return Y(jzsVar.a);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        m1qVar.getClass();
        if (m1qVar instanceof j1q) {
            return exk.a;
        }
        if (m1qVar instanceof c2q) {
            return Y(((c2q) m1qVar).f);
        }
        if (m1qVar instanceof e2q) {
            return lxk.a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return mxk.a;
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return exk.a;
    }

    @Override // defpackage.c8q
    public void l(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    @Override // defpackage.fk6
    public List loadForRequest(u7e u7eVar) {
        u7eVar.getClass();
        return c5b.a;
    }

    @Override // defpackage.r33
    public Bitmap n(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // defpackage.r33
    public void o(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ke3
    public void p(boolean z) {
        dfi.r("Calling NoopBottomNavigationPlugin, setDarkTheme", "NoopBottomNavigationPlugin");
    }

    @Override // defpackage.b0q
    public Object s(d0t d0tVar) {
        d0tVar.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.fk6
    public void saveFromResponse(u7e u7eVar, List list) {
        u7eVar.getClass();
    }

    @Override // defpackage.r33
    public Bitmap t(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public String toString() {
        switch (this.a) {
            case 23:
                return "EmptyConsumer";
            case 24:
                return "grpc-default-executor";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ke3
    public void u(boolean z) {
        dfi.r("Calling NoopBottomNavigationPlugin, transparentBackground", "NoopBottomNavigationPlugin");
    }

    @Override // defpackage.mr5
    public int v(w8 w8Var, int i2, Object obj, int i3) {
        w8Var.P(i2);
        return 0;
    }

    @Override // defpackage.b0q
    public Object w(bd5 bd5Var) {
        bd5Var.getClass();
        return Boolean.FALSE;
    }

    @Override // defpackage.b0q
    public Object x(aou aouVar) {
        aouVar.getClass();
        return Boolean.TRUE;
    }

    @Override // defpackage.ke3
    public void y(Intent... intentArr) {
        dfi.r("Calling NoopBottomNavigationPlugin, wrapCurrentTab", "NoopBottomNavigationPlugin");
    }

    @Override // defpackage.nq4
    public String z() {
        return "identity";
    }

    public /* synthetic */ e3s(int i2) {
        this.a = i2;
    }

    public void S() {
    }

    public void T() {
    }

    public void U() {
    }

    @Override // defpackage.r33
    public void q() {
    }

    @Override // defpackage.nq4
    public OutputStream I(ozh ozhVar) {
        return ozhVar;
    }

    @Override // defpackage.va6
    public void accept(Object obj) {
    }

    @Override // defpackage.r33
    public void m(int i2) {
    }

    @Override // defpackage.nq4
    public InputStream r(yjn yjnVar) {
        return yjnVar;
    }
}
