package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.n;
import androidx.camera.core.ImageCaptureException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class ycv {
    public static int f;
    public static final xlo g = new xlo();
    public final x8v a;
    public final s38 b;
    public final j4n c;
    public final l6f0 d;
    public final w34 e;

    /* JADX WARN: Multi-variable type inference failed */
    public ycv(x8v x8vVar, Size size, CameraCharacteristics cameraCharacteristics, boolean z, v74 v74Var) {
        int i;
        ht10 ht10Var;
        e9e e9eVar;
        c920 c920Var;
        int i2;
        ht10 ht10Var2;
        uo7 uo7Var;
        tob1.b();
        this.a = x8vVar;
        uo7 uo7Var2 = null;
        n nVar = (n) x8vVar.g(xi21.m4, null);
        if (nVar == null) {
            yci0.t((String) x8vVar.g(max0.e4, x8vVar.toString()), "Implementation is missing option unpacker for ");
            throw null;
        }
        r38 r38Var = new r38();
        nVar.a(x8vVar, r38Var);
        this.b = r38Var.e();
        final j4n j4nVar = new j4n();
        j4nVar.a = null;
        j4nVar.w = null;
        this.c = j4nVar;
        Executor executor = (Executor) x8vVar.g(lyw.A2, geb1.d());
        Objects.requireNonNull(executor);
        final l6f0 l6f0Var = new l6f0(executor, cameraCharacteristics);
        this.d = l6f0Var;
        ArrayList arrayList = new ArrayList();
        if (((Integer) x8vVar.g(eav.k2, 0)).intValue() != 0) {
            arrayList.add(32);
            arrayList.add(256);
        } else {
            Integer num = (Integer) x8vVar.g(x8v.x, null);
            if (num != null) {
                i = num.intValue();
            } else {
                Integer num2 = (Integer) x8vVar.g(eav.j2, null);
                i = (num2 == null || num2.intValue() != 4101) ? (num2 == null || num2.intValue() != 32) ? 256 : 32 : 4101;
            }
            arrayList.add(Integer.valueOf(i));
        }
        int inputFormat = x8vVar.getInputFormat();
        if (x8vVar.g(x8v.z, null) != null) {
            ny61.u();
            throw null;
        }
        w34 w34Var = new w34(size, inputFormat, arrayList, z, v74Var, new hkn(), new hkn());
        this.e = w34Var;
        final int i3 = 1;
        d6z.y("CaptureNode does not support recreation yet.", ((w34) j4nVar.z) == null && ((mdl0) j4nVar.b) == null);
        j4nVar.z = w34Var;
        uo7 sn7Var = new sn7(i3, j4nVar);
        ArrayList arrayList2 = w34Var.h;
        boolean z2 = arrayList2.size() > 1;
        final int i4 = 2;
        Size size2 = w34Var.f;
        int i5 = w34Var.g;
        if (w34Var.i) {
            ht10Var = new ht10(16, c5b1.a(size2.getWidth(), size2.getHeight(), i5, 4));
            j4nVar.w = ht10Var;
            e9eVar = new e9e() { // from class: v38
                @Override // defpackage.e9e
                public final void accept(Object obj) {
                    int i6 = i3;
                    j4n j4nVar2 = j4nVar;
                    switch (i6) {
                        case 0:
                            j4nVar2.C((m6f0) obj);
                            break;
                        case 1:
                            m6f0 m6f0Var = (m6f0) obj;
                            j4nVar2.C(m6f0Var);
                            ht10 ht10Var3 = (ht10) j4nVar2.w;
                            d6z.y("Pending request should be null", ((m6f0) ht10Var3.c) == null);
                            ht10Var3.c = m6f0Var;
                            break;
                        default:
                            j4nVar2.J((w7x0) obj);
                            break;
                    }
                }
            };
            c920Var = null;
        } else {
            if (z2) {
                c920 c920Var2 = new c920(size2.getWidth(), size2.getHeight(), 256, 4);
                uo7 g2 = tdb1.g(sn7Var, c920Var2.b);
                i2 = 0;
                c920Var = new c920(size2.getWidth(), size2.getHeight(), 32, 4);
                uo7Var = tdb1.g(sn7Var, c920Var.b);
                sn7Var = g2;
                ht10Var2 = c920Var2;
            } else {
                i2 = 0;
                c920 c920Var3 = new c920(size2.getWidth(), size2.getHeight(), i5, 4);
                sn7Var = tdb1.g(sn7Var, c920Var3.b);
                c920Var = null;
                ht10Var2 = c920Var3;
                uo7Var = null;
            }
            final int i6 = i2;
            e9eVar = new e9e() { // from class: v38
                @Override // defpackage.e9e
                public final void accept(Object obj) {
                    int i62 = i6;
                    j4n j4nVar2 = j4nVar;
                    switch (i62) {
                        case 0:
                            j4nVar2.C((m6f0) obj);
                            break;
                        case 1:
                            m6f0 m6f0Var = (m6f0) obj;
                            j4nVar2.C(m6f0Var);
                            ht10 ht10Var3 = (ht10) j4nVar2.w;
                            d6z.y("Pending request should be null", ((m6f0) ht10Var3.c) == null);
                            ht10Var3.c = m6f0Var;
                            break;
                        default:
                            j4nVar2.J((w7x0) obj);
                            break;
                    }
                }
            };
            ht10 ht10Var3 = ht10Var2;
            uo7Var2 = uo7Var;
            ht10Var = ht10Var3;
        }
        w34Var.a = sn7Var;
        if (z2 && uo7Var2 != null) {
            w34Var.b = uo7Var2;
        }
        Surface surface = ht10Var.getSurface();
        Objects.requireNonNull(surface);
        d6z.y("The surface is already set.", w34Var.c == null);
        w34Var.c = new iiv(surface, size2, i5);
        j4nVar.b = new mdl0(ht10Var);
        final int i7 = 1;
        ht10Var.u(new odv() { // from class: w38
            @Override // defpackage.odv
            public final void r(pdv pdvVar) {
                int i8 = i7;
                j4n j4nVar2 = j4nVar;
                switch (i8) {
                    case 0:
                        try {
                            jdv acquireLatestImage = pdvVar.acquireLatestImage();
                            if (acquireLatestImage != null) {
                                if (((m6f0) j4nVar2.a) == null) {
                                    sgb1.g(5, "CaptureNode");
                                    acquireLatestImage.close();
                                } else {
                                    w74 w74Var = (w74) j4nVar2.y;
                                    Objects.requireNonNull(w74Var);
                                    w74Var.b.accept(new x74((m6f0) j4nVar2.a, acquireLatestImage));
                                }
                            }
                            break;
                        } catch (IllegalStateException e) {
                            sgb1.e("CaptureNode", "Failed to acquire latest image of postview", e);
                            return;
                        }
                    default:
                        try {
                            jdv acquireLatestImage2 = pdvVar.acquireLatestImage();
                            if (acquireLatestImage2 != null) {
                                j4nVar2.B(acquireLatestImage2);
                            } else {
                                m6f0 m6f0Var = (m6f0) j4nVar2.a;
                                if (m6f0Var != null) {
                                    j4nVar2.J(new y84(m6f0Var.a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                                }
                            }
                            break;
                        } catch (IllegalStateException e2) {
                            m6f0 m6f0Var2 = (m6f0) j4nVar2.a;
                            if (m6f0Var2 != null) {
                                j4nVar2.J(new y84(m6f0Var2.a, new ImageCaptureException(2, "Failed to acquire latest image", e2)));
                                return;
                            }
                            return;
                        }
                }
            }
        }, geb1.f());
        dge0 dge0Var = w34Var.j;
        if (dge0Var != null) {
            tis0 a = c5b1.a(dge0Var.b().getWidth(), dge0Var.b().getHeight(), dge0Var.a(), 4);
            final int i8 = 0;
            a.u(new odv() { // from class: w38
                @Override // defpackage.odv
                public final void r(pdv pdvVar) {
                    int i82 = i8;
                    j4n j4nVar2 = j4nVar;
                    switch (i82) {
                        case 0:
                            try {
                                jdv acquireLatestImage = pdvVar.acquireLatestImage();
                                if (acquireLatestImage != null) {
                                    if (((m6f0) j4nVar2.a) == null) {
                                        sgb1.g(5, "CaptureNode");
                                        acquireLatestImage.close();
                                    } else {
                                        w74 w74Var = (w74) j4nVar2.y;
                                        Objects.requireNonNull(w74Var);
                                        w74Var.b.accept(new x74((m6f0) j4nVar2.a, acquireLatestImage));
                                    }
                                }
                                break;
                            } catch (IllegalStateException e) {
                                sgb1.e("CaptureNode", "Failed to acquire latest image of postview", e);
                                return;
                            }
                        default:
                            try {
                                jdv acquireLatestImage2 = pdvVar.acquireLatestImage();
                                if (acquireLatestImage2 != null) {
                                    j4nVar2.B(acquireLatestImage2);
                                } else {
                                    m6f0 m6f0Var = (m6f0) j4nVar2.a;
                                    if (m6f0Var != null) {
                                        j4nVar2.J(new y84(m6f0Var.a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                                    }
                                }
                                break;
                            } catch (IllegalStateException e2) {
                                m6f0 m6f0Var2 = (m6f0) j4nVar2.a;
                                if (m6f0Var2 != null) {
                                    j4nVar2.J(new y84(m6f0Var2.a, new ImageCaptureException(2, "Failed to acquire latest image", e2)));
                                    return;
                                }
                                return;
                            }
                    }
                }
            }, geb1.f());
            j4nVar.x = new mdl0(a);
            w34Var.e = new iiv(a.getSurface(), dge0Var.b(), dge0Var.a());
        }
        if (z2 && c920Var != null) {
            Surface surface2 = c920Var.getSurface();
            d6z.y("The secondary surface is already set.", w34Var.d == null);
            w34Var.d = new iiv(surface2, size2, i5);
            j4nVar.c = new mdl0(c920Var);
            final int i9 = 1;
            c920Var.u(new odv() { // from class: w38
                @Override // defpackage.odv
                public final void r(pdv pdvVar) {
                    int i82 = i9;
                    j4n j4nVar2 = j4nVar;
                    switch (i82) {
                        case 0:
                            try {
                                jdv acquireLatestImage = pdvVar.acquireLatestImage();
                                if (acquireLatestImage != null) {
                                    if (((m6f0) j4nVar2.a) == null) {
                                        sgb1.g(5, "CaptureNode");
                                        acquireLatestImage.close();
                                    } else {
                                        w74 w74Var = (w74) j4nVar2.y;
                                        Objects.requireNonNull(w74Var);
                                        w74Var.b.accept(new x74((m6f0) j4nVar2.a, acquireLatestImage));
                                    }
                                }
                                break;
                            } catch (IllegalStateException e) {
                                sgb1.e("CaptureNode", "Failed to acquire latest image of postview", e);
                                return;
                            }
                        default:
                            try {
                                jdv acquireLatestImage2 = pdvVar.acquireLatestImage();
                                if (acquireLatestImage2 != null) {
                                    j4nVar2.B(acquireLatestImage2);
                                } else {
                                    m6f0 m6f0Var = (m6f0) j4nVar2.a;
                                    if (m6f0Var != null) {
                                        j4nVar2.J(new y84(m6f0Var.a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                                    }
                                }
                                break;
                            } catch (IllegalStateException e2) {
                                m6f0 m6f0Var2 = (m6f0) j4nVar2.a;
                                if (m6f0Var2 != null) {
                                    j4nVar2.J(new y84(m6f0Var2.a, new ImageCaptureException(2, "Failed to acquire latest image", e2)));
                                    return;
                                }
                                return;
                            }
                    }
                }
            }, geb1.f());
        }
        w34Var.k.a = e9eVar;
        w34Var.l.a = new e9e() { // from class: v38
            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i62 = i4;
                j4n j4nVar2 = j4nVar;
                switch (i62) {
                    case 0:
                        j4nVar2.C((m6f0) obj);
                        break;
                    case 1:
                        m6f0 m6f0Var = (m6f0) obj;
                        j4nVar2.C(m6f0Var);
                        ht10 ht10Var32 = (ht10) j4nVar2.w;
                        d6z.y("Pending request should be null", ((m6f0) ht10Var32.c) == null);
                        ht10Var32.c = m6f0Var;
                        break;
                    default:
                        j4nVar2.J((w7x0) obj);
                        break;
                }
            }
        };
        hkn hknVar = new hkn();
        hkn hknVar2 = new hkn();
        w74 w74Var = new w74(hknVar, hknVar2, i5, arrayList2);
        j4nVar.y = w74Var;
        l6f0Var.d = w74Var;
        final int i10 = 0;
        hknVar.a = new e9e() { // from class: j6f0
            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i11 = i10;
                final l6f0 l6f0Var2 = l6f0Var;
                final x74 x74Var = (x74) obj;
                switch (i11) {
                    case 0:
                        if (!x74Var.a.i.g) {
                            final int i12 = 1;
                            l6f0Var2.a.execute(new Runnable() { // from class: k6f0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = i12;
                                    boolean z3 = true;
                                    x74 x74Var2 = x74Var;
                                    l6f0 l6f0Var3 = l6f0Var2;
                                    switch (i13) {
                                        case 0:
                                            m6f0 m6f0Var = x74Var2.a;
                                            try {
                                                k590 k590Var = (k590) l6f0Var3.e.f(x74Var2);
                                                int e = k590Var.e();
                                                d6z.m("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + e, e == 35 || e == 256 || e == 4101);
                                                geb1.f().execute(new yo90(25, m6f0Var, (Bitmap) l6f0Var3.l.a(k590Var)));
                                                break;
                                            } catch (Exception e2) {
                                                x74Var2.b.close();
                                                sgb1.e("ProcessingNode", "process postview input packet failed.", e2);
                                                return;
                                            }
                                            break;
                                        default:
                                            m6f0 m6f0Var2 = x74Var2.a;
                                            try {
                                                if (l6f0Var3.d.d.size() <= 1) {
                                                    z3 = false;
                                                }
                                                m6f0 m6f0Var3 = x74Var2.a;
                                                if (m6f0Var3.c == null && m6f0Var3.d == null) {
                                                    geb1.f().execute(new yo90(23, m6f0Var2, l6f0Var3.a(x74Var2)));
                                                } else {
                                                    reu b = l6f0Var3.b(x74Var2);
                                                    if (!z3 || m6f0Var2.b.l()) {
                                                        geb1.f().execute(new yo90(24, m6f0Var2, b));
                                                    }
                                                }
                                                break;
                                            } catch (ImageCaptureException e3) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, e3));
                                                return;
                                            } catch (OutOfMemoryError e4) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed due to low memory.", e4)));
                                                return;
                                            } catch (RuntimeException e5) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed.", e5)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            x74Var.b.close();
                            break;
                        }
                    default:
                        if (!x74Var.a.i.g) {
                            final int i13 = 0;
                            l6f0Var2.a.execute(new Runnable() { // from class: k6f0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i132 = i13;
                                    boolean z3 = true;
                                    x74 x74Var2 = x74Var;
                                    l6f0 l6f0Var3 = l6f0Var2;
                                    switch (i132) {
                                        case 0:
                                            m6f0 m6f0Var = x74Var2.a;
                                            try {
                                                k590 k590Var = (k590) l6f0Var3.e.f(x74Var2);
                                                int e = k590Var.e();
                                                d6z.m("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + e, e == 35 || e == 256 || e == 4101);
                                                geb1.f().execute(new yo90(25, m6f0Var, (Bitmap) l6f0Var3.l.a(k590Var)));
                                                break;
                                            } catch (Exception e2) {
                                                x74Var2.b.close();
                                                sgb1.e("ProcessingNode", "process postview input packet failed.", e2);
                                                return;
                                            }
                                            break;
                                        default:
                                            m6f0 m6f0Var2 = x74Var2.a;
                                            try {
                                                if (l6f0Var3.d.d.size() <= 1) {
                                                    z3 = false;
                                                }
                                                m6f0 m6f0Var3 = x74Var2.a;
                                                if (m6f0Var3.c == null && m6f0Var3.d == null) {
                                                    geb1.f().execute(new yo90(23, m6f0Var2, l6f0Var3.a(x74Var2)));
                                                } else {
                                                    reu b = l6f0Var3.b(x74Var2);
                                                    if (!z3 || m6f0Var2.b.l()) {
                                                        geb1.f().execute(new yo90(24, m6f0Var2, b));
                                                    }
                                                }
                                                break;
                                            } catch (ImageCaptureException e3) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, e3));
                                                return;
                                            } catch (OutOfMemoryError e4) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed due to low memory.", e4)));
                                                return;
                                            } catch (RuntimeException e5) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed.", e5)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            sgb1.g(5, "ProcessingNode");
                            x74Var.b.close();
                            break;
                        }
                }
            }
        };
        final int i11 = 1;
        hknVar2.a = new e9e() { // from class: j6f0
            @Override // defpackage.e9e
            public final void accept(Object obj) {
                int i112 = i11;
                final l6f0 l6f0Var2 = l6f0Var;
                final x74 x74Var = (x74) obj;
                switch (i112) {
                    case 0:
                        if (!x74Var.a.i.g) {
                            final int i12 = 1;
                            l6f0Var2.a.execute(new Runnable() { // from class: k6f0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i132 = i12;
                                    boolean z3 = true;
                                    x74 x74Var2 = x74Var;
                                    l6f0 l6f0Var3 = l6f0Var2;
                                    switch (i132) {
                                        case 0:
                                            m6f0 m6f0Var = x74Var2.a;
                                            try {
                                                k590 k590Var = (k590) l6f0Var3.e.f(x74Var2);
                                                int e = k590Var.e();
                                                d6z.m("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + e, e == 35 || e == 256 || e == 4101);
                                                geb1.f().execute(new yo90(25, m6f0Var, (Bitmap) l6f0Var3.l.a(k590Var)));
                                                break;
                                            } catch (Exception e2) {
                                                x74Var2.b.close();
                                                sgb1.e("ProcessingNode", "process postview input packet failed.", e2);
                                                return;
                                            }
                                            break;
                                        default:
                                            m6f0 m6f0Var2 = x74Var2.a;
                                            try {
                                                if (l6f0Var3.d.d.size() <= 1) {
                                                    z3 = false;
                                                }
                                                m6f0 m6f0Var3 = x74Var2.a;
                                                if (m6f0Var3.c == null && m6f0Var3.d == null) {
                                                    geb1.f().execute(new yo90(23, m6f0Var2, l6f0Var3.a(x74Var2)));
                                                } else {
                                                    reu b = l6f0Var3.b(x74Var2);
                                                    if (!z3 || m6f0Var2.b.l()) {
                                                        geb1.f().execute(new yo90(24, m6f0Var2, b));
                                                    }
                                                }
                                                break;
                                            } catch (ImageCaptureException e3) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, e3));
                                                return;
                                            } catch (OutOfMemoryError e4) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed due to low memory.", e4)));
                                                return;
                                            } catch (RuntimeException e5) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed.", e5)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            x74Var.b.close();
                            break;
                        }
                    default:
                        if (!x74Var.a.i.g) {
                            final int i13 = 0;
                            l6f0Var2.a.execute(new Runnable() { // from class: k6f0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i132 = i13;
                                    boolean z3 = true;
                                    x74 x74Var2 = x74Var;
                                    l6f0 l6f0Var3 = l6f0Var2;
                                    switch (i132) {
                                        case 0:
                                            m6f0 m6f0Var = x74Var2.a;
                                            try {
                                                k590 k590Var = (k590) l6f0Var3.e.f(x74Var2);
                                                int e = k590Var.e();
                                                d6z.m("Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + e, e == 35 || e == 256 || e == 4101);
                                                geb1.f().execute(new yo90(25, m6f0Var, (Bitmap) l6f0Var3.l.a(k590Var)));
                                                break;
                                            } catch (Exception e2) {
                                                x74Var2.b.close();
                                                sgb1.e("ProcessingNode", "process postview input packet failed.", e2);
                                                return;
                                            }
                                            break;
                                        default:
                                            m6f0 m6f0Var2 = x74Var2.a;
                                            try {
                                                if (l6f0Var3.d.d.size() <= 1) {
                                                    z3 = false;
                                                }
                                                m6f0 m6f0Var3 = x74Var2.a;
                                                if (m6f0Var3.c == null && m6f0Var3.d == null) {
                                                    geb1.f().execute(new yo90(23, m6f0Var2, l6f0Var3.a(x74Var2)));
                                                } else {
                                                    reu b = l6f0Var3.b(x74Var2);
                                                    if (!z3 || m6f0Var2.b.l()) {
                                                        geb1.f().execute(new yo90(24, m6f0Var2, b));
                                                    }
                                                }
                                                break;
                                            } catch (ImageCaptureException e3) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, e3));
                                                return;
                                            } catch (OutOfMemoryError e4) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed due to low memory.", e4)));
                                                return;
                                            } catch (RuntimeException e5) {
                                                geb1.f().execute(new yo90(26, m6f0Var2, new ImageCaptureException(0, "Processing failed.", e5)));
                                                return;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        } else {
                            sgb1.g(5, "ProcessingNode");
                            x74Var.b.close();
                            break;
                        }
                }
            }
        };
        l6f0Var.e = new s400();
        l6f0Var.f = new reu(l6f0Var.m, 2);
        l6f0Var.i = new gly0();
        l6f0Var.g = new yz5();
        l6f0Var.h = new v9x();
        l6f0Var.j = new y9x();
        l6f0Var.l = new l7v();
        if (i5 == 35 || l6f0Var.n) {
            l6f0Var.k = new w9x();
        }
    }

    public final void a() {
        iiv iivVar;
        tob1.b();
        j4n j4nVar = this.c;
        j4nVar.getClass();
        tob1.b();
        w34 w34Var = (w34) j4nVar.z;
        Objects.requireNonNull(w34Var);
        final mdl0 mdl0Var = (mdl0) j4nVar.b;
        Objects.requireNonNull(mdl0Var);
        final mdl0 mdl0Var2 = (mdl0) j4nVar.c;
        final mdl0 mdl0Var3 = (mdl0) j4nVar.x;
        iiv iivVar2 = w34Var.c;
        Objects.requireNonNull(iivVar2);
        iivVar2.a();
        iiv iivVar3 = w34Var.c;
        Objects.requireNonNull(iivVar3);
        final int i = 0;
        ni91.g(iivVar3.e).c(new Runnable() { // from class: x38
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                mdl0 mdl0Var4 = mdl0Var;
                switch (i2) {
                    case 0:
                        mdl0Var4.d();
                        break;
                    case 1:
                        if (mdl0Var4 != null) {
                            mdl0Var4.d();
                            break;
                        }
                        break;
                    default:
                        if (mdl0Var4 != null) {
                            mdl0Var4.d();
                            break;
                        }
                        break;
                }
            }
        }, geb1.f());
        iiv iivVar4 = w34Var.e;
        final int i2 = 1;
        if (iivVar4 != null) {
            iivVar4.a();
            ni91.g(w34Var.e.e).c(new Runnable() { // from class: x38
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    mdl0 mdl0Var4 = mdl0Var3;
                    switch (i22) {
                        case 0:
                            mdl0Var4.d();
                            break;
                        case 1:
                            if (mdl0Var4 != null) {
                                mdl0Var4.d();
                                break;
                            }
                            break;
                        default:
                            if (mdl0Var4 != null) {
                                mdl0Var4.d();
                                break;
                            }
                            break;
                    }
                }
            }, geb1.f());
        }
        if (w34Var.h.size() > 1 && (iivVar = w34Var.d) != null) {
            iivVar.a();
            final int i3 = 2;
            ni91.g(w34Var.d.e).c(new Runnable() { // from class: x38
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i3;
                    mdl0 mdl0Var4 = mdl0Var2;
                    switch (i22) {
                        case 0:
                            mdl0Var4.d();
                            break;
                        case 1:
                            if (mdl0Var4 != null) {
                                mdl0Var4.d();
                                break;
                            }
                            break;
                        default:
                            if (mdl0Var4 != null) {
                                mdl0Var4.d();
                                break;
                            }
                            break;
                    }
                }
            }, geb1.f());
        }
        this.d.getClass();
    }
}
