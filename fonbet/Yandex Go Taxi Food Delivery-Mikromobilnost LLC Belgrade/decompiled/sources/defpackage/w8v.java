package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.internal.utils.a;
import androidx.camera.core.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class w8v extends j {
    public static final r8v B = new r8v();
    public final i4u A;
    public final int q;
    public final AtomicReference r;
    public final int s;
    public int t;
    public Rational u;
    public tdp0 v;
    public dyq0 w;
    public ycv x;
    public z7x0 y;
    public eyq0 z;

    static {
        new xlo();
    }

    public w8v(x8v x8vVar) {
        super(x8vVar);
        this.r = new AtomicReference(null);
        this.t = -1;
        this.u = null;
        this.A = new i4u(this);
        x8v x8vVar2 = (x8v) this.h;
        x34 x34Var = x8v.b;
        if (x8vVar2.d(x34Var)) {
            this.q = ((Integer) x8vVar2.f(x34Var)).intValue();
        } else {
            this.q = 1;
        }
        this.s = ((Integer) x8vVar2.g(x8v.B, 0)).intValue();
        this.v = new tdp0((v8v) x8vVar2.g(x8v.D, null));
    }

    public static boolean K(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(int i, Map map) {
        return map.containsKey(Integer.valueOf(i)) && !((List) map.get(Integer.valueOf(i))).isEmpty();
    }

    @Override // androidx.camera.core.j
    public final lru0 A(lru0 lru0Var, lru0 lru0Var2) {
        Objects.toString(lru0Var);
        Objects.toString(lru0Var2);
        sgb1.g(3, "ImageCapture");
        dyq0 I = I(g(), (x8v) this.h, lru0Var);
        this.w = I;
        Object[] objArr = {I.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        r();
        return lru0Var;
    }

    @Override // androidx.camera.core.j
    public final void B() {
        tdp0 tdp0Var = this.v;
        tdp0Var.c();
        tdp0Var.b();
        z7x0 z7x0Var = this.y;
        if (z7x0Var != null) {
            z7x0Var.b();
        }
        H(false);
        f().e(null);
    }

    public final void H(boolean z) {
        z7x0 z7x0Var;
        tob1.b();
        eyq0 eyq0Var = this.z;
        if (eyq0Var != null) {
            eyq0Var.b();
            this.z = null;
        }
        ycv ycvVar = this.x;
        if (ycvVar != null) {
            ycvVar.a();
            this.x = null;
        }
        if (!z && (z7x0Var = this.y) != null) {
            z7x0Var.b();
            this.y = null;
        }
        f().i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        if (r9.contains(java.lang.Integer.valueOf(r4)) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0258 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dyq0 I(String str, x8v x8vVar, lru0 lru0Var) {
        szd a;
        HashSet hashSet;
        v74 v74Var;
        mdl0 mdl0Var;
        iiv iivVar;
        v74 v74Var2;
        boolean z;
        Integer valueOf = Integer.valueOf(Constants.INTENT_CONTAINER_ID);
        int i = 0;
        tob1.b();
        String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, lru0Var);
        Size f = lru0Var.f();
        br7 e = e();
        Objects.requireNonNull(e);
        boolean z2 = !e.q();
        CameraCharacteristics cameraCharacteristics = null;
        if (this.x != null) {
            d6z.y(null, z2);
            this.x.a();
        }
        ar7 c = e().c();
        if ((c instanceof g70) && (a = ((zi21) ((g70) c).d.g(jp7.j1, zi21.a)).a(UseCaseConfigFactory$CaptureType.IMAGE_CAPTURE, 1)) != null) {
            x34 x34Var = icv.u2;
            ug70 ug70Var = (ug70) a;
            if (ug70Var.a.containsKey(x34Var)) {
                hashSet = new HashSet();
                hashSet.add(0);
                Iterator it = ((List) ug70Var.f(x34Var)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                        hashSet.add(1);
                        break;
                    }
                }
                if (hashSet == null) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    if (c != null ? c.l().contains(valueOf) : false) {
                        hashSet.add(1);
                    }
                    if (c != null) {
                        ar7 ar7Var = c;
                        if (ar7Var.s().contains(3)) {
                            z = ar7Var.l().contains(32);
                            if (z) {
                                hashSet.add(2);
                                hashSet.add(3);
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
                xi21 xi21Var = this.h;
                x34 x34Var2 = x8v.y;
                Integer num = (Integer) xi21Var.g(x34Var2, 0);
                num.getClass();
                boolean contains = hashSet.contains(num);
                StringBuilder sb = new StringBuilder("The specified output format (");
                Integer num2 = (Integer) this.h.g(x34Var2, 0);
                num2.getClass();
                sb.append(num2.intValue());
                sb.append(") is not supported by current configuration. Supported output formats: ");
                sb.append(hashSet);
                d6z.m(sb.toString(), contains);
                if (((Boolean) this.h.g(x8v.F, Boolean.FALSE)).booleanValue()) {
                    v74Var = null;
                } else {
                    int inputFormat = x8vVar.getInputFormat();
                    m0r0 u = e().m().u();
                    if (u != null) {
                        Map d = u.d(f);
                        ArrayList arrayList = new ArrayList();
                        if (L(35, d)) {
                            arrayList.add(35);
                        }
                        if (L(256, d)) {
                            arrayList.add(256);
                        }
                        if (L(Constants.INTENT_CONTAINER_ID, d)) {
                            arrayList.add(valueOf);
                        }
                        if (!arrayList.isEmpty()) {
                            switch (((fp7) e().m().g(jp7.q1, jp7.s1)).a) {
                                case 0:
                                    x34 x34Var3 = jp7.j1;
                                    inputFormat = arrayList.contains(35) ? 35 : arrayList.contains(256) ? 256 : arrayList.contains(Integer.valueOf(Constants.INTENT_CONTAINER_ID)) ? 4101 : 0;
                                    break;
                            }
                            if (inputFormat != 0) {
                                List list = (List) d.get(Integer.valueOf(inputFormat));
                                bsj0 bsj0Var = (bsj0) this.h.g(x8v.E, null);
                                if (bsj0Var != null) {
                                    Collections.sort(list, new gvc(true));
                                    br7 e2 = e();
                                    Rect n = e2.f().n();
                                    ar7 f2 = e2.f();
                                    List e3 = a0j.e(bsj0Var, list, null, n(), new Rational(n.width(), n.height()), f2.m(), f2.d());
                                    if (e3.isEmpty()) {
                                        ny61.g("The postview ResolutionSelector cannot select a valid size for the postview.");
                                        return null;
                                    }
                                    v74Var2 = new v74(inputFormat, (Size) e3.get(0));
                                } else {
                                    v74Var2 = new v74(inputFormat, (Size) Collections.max(list, new gvc()));
                                }
                                v74Var = v74Var2;
                            }
                        }
                        inputFormat = 0;
                        if (inputFormat != 0) {
                        }
                    }
                    v74Var2 = null;
                    v74Var = v74Var2;
                }
                if (e() != null) {
                    try {
                        Object o = e().f().o();
                        if (o instanceof CameraCharacteristics) {
                            cameraCharacteristics = (CameraCharacteristics) o;
                        }
                    } catch (Exception e4) {
                        Log.e("ImageCapture", "getCameraCharacteristics failed", e4);
                    }
                }
                this.x = new ycv(x8vVar, f, cameraCharacteristics, z2, v74Var);
                if (this.y == null) {
                    Objects.requireNonNull((vi21) this.h.g(xi21.x4, new vi21()));
                    this.y = new z7x0(this.A);
                }
                z7x0 z7x0Var = this.y;
                ycv ycvVar = this.x;
                z7x0Var.getClass();
                tob1.b();
                z7x0Var.c = ycvVar;
                ycvVar.getClass();
                tob1.b();
                j4n j4nVar = ycvVar.c;
                j4nVar.getClass();
                tob1.b();
                d6z.y("The ImageReader is not initialized.", ((mdl0) j4nVar.b) == null);
                mdl0Var = (mdl0) j4nVar.b;
                synchronized (mdl0Var.c) {
                    mdl0Var.y = z7x0Var;
                }
                ycv ycvVar2 = this.x;
                dyq0 e5 = dyq0.e(ycvVar2.a, lru0Var.f());
                w34 w34Var = ycvVar2.e;
                iiv iivVar2 = w34Var.c;
                Objects.requireNonNull(iivVar2);
                q8n q8nVar = q8n.d;
                g84 a2 = gyq0.a(iivVar2);
                a2.f = q8nVar;
                e5.a.add(a2.a());
                if (w34Var.h.size() > 1 && (iivVar = w34Var.d) != null) {
                    g84 a3 = gyq0.a(iivVar);
                    a3.f = q8nVar;
                    e5.a.add(a3.a());
                }
                iiv iivVar3 = w34Var.e;
                if (iivVar3 != null) {
                    e5.i = gyq0.a(iivVar3).a();
                }
                e5.h = lru0Var.g();
                if (this.q == 2 && !lru0Var.h()) {
                    f().n(e5);
                }
                if (lru0Var.d() != null) {
                    e5.b(lru0Var.d());
                }
                eyq0 eyq0Var = this.z;
                if (eyq0Var != null) {
                    eyq0Var.b();
                }
                eyq0 eyq0Var2 = new eyq0(new p8v(i, this));
                this.z = eyq0Var2;
                e5.f = eyq0Var2;
                return e5;
            }
        }
        hashSet = null;
        if (hashSet == null) {
        }
        xi21 xi21Var2 = this.h;
        x34 x34Var22 = x8v.y;
        Integer num3 = (Integer) xi21Var2.g(x34Var22, 0);
        num3.getClass();
        boolean contains2 = hashSet.contains(num3);
        StringBuilder sb2 = new StringBuilder("The specified output format (");
        Integer num22 = (Integer) this.h.g(x34Var22, 0);
        num22.getClass();
        sb2.append(num22.intValue());
        sb2.append(") is not supported by current configuration. Supported output formats: ");
        sb2.append(hashSet);
        d6z.m(sb2.toString(), contains2);
        if (((Boolean) this.h.g(x8v.F, Boolean.FALSE)).booleanValue()) {
        }
        if (e() != null) {
        }
        this.x = new ycv(x8vVar, f, cameraCharacteristics, z2, v74Var);
        if (this.y == null) {
        }
        z7x0 z7x0Var2 = this.y;
        ycv ycvVar3 = this.x;
        z7x0Var2.getClass();
        tob1.b();
        z7x0Var2.c = ycvVar3;
        ycvVar3.getClass();
        tob1.b();
        j4n j4nVar2 = ycvVar3.c;
        j4nVar2.getClass();
        tob1.b();
        d6z.y("The ImageReader is not initialized.", ((mdl0) j4nVar2.b) == null);
        mdl0Var = (mdl0) j4nVar2.b;
        synchronized (mdl0Var.c) {
        }
    }

    public final int J() {
        int i;
        synchronized (this.r) {
            i = this.t;
            if (i == -1) {
                i = ((Integer) ((x8v) this.h).g(x8v.c, 2)).intValue();
            }
        }
        return i;
    }

    public final void M(int i) {
        sgb1.g(3, "ImageCapture");
        if (i != 0 && i != 1 && i != 2) {
            if (i != 3) {
                ny61.g(oyr.i(i, "Invalid flash mode: "));
                return;
            }
            if (this.v.a == null) {
                ny61.g("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                return;
            } else if (e() != null) {
                br7 e = e();
                if ((e != null ? e.c().d() : -1) != 0) {
                    ny61.g("Not a front camera despite setting FLASH_MODE_SCREEN");
                    return;
                }
            }
        }
        synchronized (this.r) {
            this.t = i;
            R();
        }
    }

    public final void N(int i) {
        int n = n();
        if (!D(i) || this.u == null) {
            return;
        }
        this.u = a.b(Math.abs(xdb1.g(i) - xdb1.g(n)), this.u);
    }

    public final void O(r1s r1sVar, Executor executor, u8v u8vVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            geb1.f().execute(new l9(this, r1sVar, executor, u8vVar, 15));
        } else {
            Q(executor, null, u8vVar, r1sVar);
        }
    }

    public final void P(Executor executor, t8v t8vVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            geb1.f().execute(new p7h(21, this, executor, t8vVar));
        } else {
            Q(executor, t8vVar, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(Executor executor, t8v t8vVar, u8v u8vVar, r1s r1sVar) {
        Rect rect;
        int round;
        int i;
        int i2;
        int i3;
        x8v x8vVar;
        x34 x34Var;
        int i4;
        tob1.b();
        if (J() == 3 && this.v.a == null) {
            ny61.g("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            return;
        }
        br7 e = e();
        Rect rect2 = null;
        if (e == null || !this.a) {
            ImageCaptureException imageCaptureException = new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null);
            if (t8vVar != null) {
                t8vVar.b();
                return;
            } else if (u8vVar != null) {
                u8vVar.j(imageCaptureException);
                return;
            } else {
                ny61.g("Must have either in-memory or on-disk callback.");
                return;
            }
        }
        boolean z = ((Integer) this.h.g(eav.k2, 0)).intValue() != 0;
        if (z) {
            ny61.g("Simultaneous capture RAW and JPEG needs two output file options");
            return;
        }
        z7x0 z7x0Var = this.y;
        Objects.requireNonNull(z7x0Var);
        Rect rect3 = this.k;
        Size d = d();
        Objects.requireNonNull(d);
        if (rect3 == null) {
            Rational rational = this.u;
            if (rational != null && rational.floatValue() > 0.0f && !rational.isNaN()) {
                br7 e2 = e();
                Objects.requireNonNull(e2);
                int j = j(e2, false);
                Rational rational2 = new Rational(this.u.getDenominator(), this.u.getNumerator());
                if (!lw01.d(j)) {
                    rational2 = this.u;
                }
                if (rational2 == null || rational2.floatValue() <= 0.0f || rational2.isNaN()) {
                    sgb1.g(5, "ImageUtil");
                } else {
                    int width = d.getWidth();
                    int height = d.getHeight();
                    float f = width;
                    float f2 = height;
                    float f3 = f / f2;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f3) {
                        int round2 = Math.round((f / numerator) * denominator);
                        i3 = (height - round2) / 2;
                        i2 = round2;
                        round = width;
                        i = 0;
                    } else {
                        round = Math.round((f2 / denominator) * numerator);
                        i = (width - round) / 2;
                        i2 = height;
                        i3 = 0;
                    }
                    rect2 = new Rect(i, i3, round + i, i2 + i3);
                }
                Objects.requireNonNull(rect2);
                rect = rect2;
                Matrix matrix = this.l;
                int j2 = j(e, false);
                x8vVar = (x8v) this.h;
                x34Var = x8v.C;
                if (x8vVar.d(x34Var)) {
                    int i5 = this.q;
                    if (i5 == 0) {
                        i4 = 100;
                    } else {
                        if (i5 != 1 && i5 != 2) {
                            ny61.r(oyr.j(i5, "CaptureMode ", " is invalid"));
                            return;
                        }
                        i4 = 95;
                    }
                } else {
                    i4 = ((Integer) x8vVar.f(x34Var)).intValue();
                }
                int i6 = i4;
                List unmodifiableList = Collections.unmodifiableList(this.w.e);
                d6z.m("onDiskCallback and outputFileOptions should be both null or both non-null.", (u8vVar != null) != (r1sVar != null));
                d6z.m("One and only one on-disk or in-memory callback should be present.", (u8vVar != null) ^ (t8vVar == null));
                z84 z84Var = new z84(executor, t8vVar, u8vVar, r1sVar, rect, matrix, j2, i6, this.q, z, unmodifiableList);
                if (z) {
                    Boolean bool = Boolean.FALSE;
                    HashMap hashMap = z84Var.b;
                    hashMap.put(32, bool);
                    hashMap.put(256, bool);
                }
                tob1.b();
                z7x0Var.a.offer(z84Var);
                z7x0Var.c();
            }
            rect3 = new Rect(0, 0, d.getWidth(), d.getHeight());
        }
        rect = rect3;
        Matrix matrix2 = this.l;
        int j22 = j(e, false);
        x8vVar = (x8v) this.h;
        x34Var = x8v.C;
        if (x8vVar.d(x34Var)) {
        }
        int i62 = i4;
        List unmodifiableList2 = Collections.unmodifiableList(this.w.e);
        d6z.m("onDiskCallback and outputFileOptions should be both null or both non-null.", (u8vVar != null) != (r1sVar != null));
        d6z.m("One and only one on-disk or in-memory callback should be present.", (u8vVar != null) ^ (t8vVar == null));
        z84 z84Var2 = new z84(executor, t8vVar, u8vVar, r1sVar, rect, matrix2, j22, i62, this.q, z, unmodifiableList2);
        if (z) {
        }
        tob1.b();
        z7x0Var.a.offer(z84Var2);
        z7x0Var.c();
    }

    public final void R() {
        synchronized (this.r) {
            try {
                if (this.r.get() != null) {
                    return;
                }
                f().m(J());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.j
    public final xi21 h(boolean z, zi21 zi21Var) {
        B.getClass();
        x8v x8vVar = r8v.a;
        szd a = zi21Var.a(x8vVar.y(), this.q);
        if (z) {
            a = szd.q(a, x8vVar);
        }
        if (a == null) {
            return null;
        }
        return ((q8v) o(a)).e();
    }

    @Override // androidx.camera.core.j
    public final Set m() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.j
    public final wi21 o(szd szdVar) {
        return new q8v(yy40.p(szdVar));
    }

    public final String toString() {
        return "ImageCapture:".concat(i());
    }

    @Override // androidx.camera.core.j
    public final void u() {
        d6z.v(e(), "Attached camera cannot be null");
        if (J() == 3) {
            br7 e = e();
            if ((e != null ? e.c().d() : -1) == 0) {
                return;
            }
            ny61.g("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // androidx.camera.core.j
    public final void v() {
        sgb1.g(3, "ImageCapture");
        R();
        f().e(this.v);
    }

    @Override // androidx.camera.core.j
    public final xi21 w(ar7 ar7Var, wi21 wi21Var) {
        boolean z;
        HashSet<b3u> hashSet = this.g;
        if (hashSet != null) {
            int i = 0;
            for (b3u b3uVar : hashSet) {
                if (b3uVar instanceof w9v) {
                    i = ((w9v) b3uVar).a;
                }
            }
            wi21Var.d().w(x8v.y, Integer.valueOf(i));
        }
        if (ar7Var.q().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            yy40 d = wi21Var.d();
            x34 x34Var = x8v.A;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(d.g(x34Var, bool2))) {
                sgb1.g(5, "ImageCapture");
            } else {
                sgb1.f("ImageCapture", "Requesting software JPEG due to device quirk.");
                wi21Var.d().w(x34Var, bool2);
            }
        }
        yy40 d2 = wi21Var.d();
        Boolean bool3 = Boolean.TRUE;
        x34 x34Var2 = x8v.A;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(d2.g(x34Var2, bool4))) {
            if (e() == null || e().m().u() == null) {
                z = true;
            } else {
                sgb1.g(5, "ImageCapture");
                z = false;
            }
            Integer num = (Integer) d2.g(x8v.x, null);
            if (num != null && num.intValue() != 256) {
                sgb1.g(5, "ImageCapture");
                z = false;
            }
            if (!z) {
                sgb1.g(5, "ImageCapture");
                d2.w(x34Var2, bool4);
            }
        } else {
            z = false;
        }
        Integer num2 = (Integer) wi21Var.d().g(x8v.x, null);
        if (num2 != null) {
            d6z.m("Cannot set non-JPEG buffer format with Extensions enabled.", e() == null || e().m().u() == null || num2.intValue() == 256);
            wi21Var.d().w(eav.j2, Integer.valueOf(z ? 35 : num2.intValue()));
        } else {
            yy40 d3 = wi21Var.d();
            x34 x34Var3 = x8v.y;
            if (Objects.equals(d3.g(x34Var3, null), 2)) {
                wi21Var.d().w(eav.j2, 32);
            } else if (Objects.equals(wi21Var.d().g(x34Var3, null), 3)) {
                wi21Var.d().w(eav.j2, 32);
                wi21Var.d().w(eav.k2, 256);
            } else if (Objects.equals(wi21Var.d().g(x34Var3, null), 1)) {
                wi21Var.d().w(eav.j2, Integer.valueOf(Constants.INTENT_CONTAINER_ID));
                wi21Var.d().w(eav.l2, q8n.c);
            } else if (z) {
                wi21Var.d().w(eav.j2, 35);
            } else {
                List list = (List) wi21Var.d().g(icv.u2, null);
                if (list == null) {
                    wi21Var.d().w(eav.j2, 256);
                } else if (K(256, list)) {
                    wi21Var.d().w(eav.j2, 256);
                } else if (K(35, list)) {
                    wi21Var.d().w(eav.j2, 35);
                }
            }
        }
        return wi21Var.e();
    }

    @Override // androidx.camera.core.j
    public final void y() {
        tdp0 tdp0Var = this.v;
        tdp0Var.c();
        tdp0Var.b();
        z7x0 z7x0Var = this.y;
        if (z7x0Var != null) {
            z7x0Var.b();
        }
    }

    @Override // androidx.camera.core.j
    public final o84 z(szd szdVar) {
        this.w.b.c(szdVar);
        Object[] objArr = {this.w.d()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        G(Collections.unmodifiableList(arrayList));
        j4n i = this.i.i();
        i.z = szdVar;
        return i.k();
    }
}
