package defpackage;

import android.app.Activity;
import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import android.media.ImageWriter;
import androidx.camera.camera2.internal.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.yandex.taxi.fragment.order.PoolRulesReminderModalView;

/* loaded from: classes10.dex */
public final /* synthetic */ class xm7 implements aa3, ruy, pdj, v0x0, ov71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ xm7(int i, Object obj, Object obj2, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.w = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:4|(2:6|(4:10|11|12|(14:14|(2:16|(15:21|22|23|(11:25|(1:27)|28|(1:30)(4:47|(1:(1:59)(1:58))(1:51)|(1:53)|54)|31|(1:37)|38|39|40|42|43)|60|(0)|28|(0)(0)|31|(3:33|35|37)|38|39|40|42|43))|64|60|(0)|28|(0)(0)|31|(0)|38|39|40|42|43)(10:65|66|(0)(0)|31|(0)|38|39|40|42|43)))|69|66|(0)(0)|31|(0)|38|39|40|42|43|2) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r10.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    @Override // defpackage.aa3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public euy apply(Object obj) {
        int i;
        ap7 ap7Var;
        zy2 zy2Var;
        jdv jdvVar;
        ImageWriter imageWriter;
        dav G0;
        an7 an7Var = (an7) this.c;
        ArrayList arrayList = (ArrayList) this.w;
        b bVar = an7Var.d;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s38 s38Var = (s38) it.next();
            r38 r38Var = new r38(s38Var);
            int i2 = s38Var.c;
            if (i2 == 5) {
                tf61 tf61Var = bVar.m;
                if (!tf61Var.e && !tf61Var.d) {
                    try {
                        jdvVar = (jdv) tf61Var.c.b();
                    } catch (NoSuchElementException unused) {
                        sgb1.d("ZslControlImpl", "dequeueImageFromBuffer no such element");
                        jdvVar = null;
                    }
                    if (jdvVar != null) {
                        sf61 sf61Var = bVar.m.j;
                        if (sf61Var != null) {
                            Image f = jdvVar.f();
                            if (sf61Var.b.get() && (imageWriter = sf61Var.a) != null && f != null) {
                                try {
                                    imageWriter.queueInputImage(f);
                                    ImageWriter imageWriter2 = sf61Var.a;
                                    final rf61 rf61Var = new rf61(jdvVar);
                                    final androidx.camera.core.impl.utils.executor.b bVar2 = sf61Var.c;
                                    imageWriter2.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: thv
                                        @Override // android.media.ImageWriter.OnImageReleasedListener
                                        public final void onImageReleased(ImageWriter imageWriter3) {
                                            bVar2.execute(new r7v(2, rf61Var, imageWriter3));
                                        }
                                    }, id00.f());
                                    G0 = jdvVar.G0();
                                } catch (IllegalStateException e) {
                                    sgb1.d("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
                                }
                                if (G0 instanceof bp7) {
                                    ap7Var = ((bp7) G0).a;
                                    if (ap7Var == null) {
                                        jdvVar.close();
                                    }
                                    i = 3;
                                    if (ap7Var != null) {
                                        r38Var.h = ap7Var;
                                    } else {
                                        int i3 = (an7Var.a != i || an7Var.f) ? (i2 == -1 || i2 == 5) ? 2 : -1 : 4;
                                        if (i3 != -1) {
                                            r38Var.c = i3;
                                        }
                                        sgb1.g(3, "Camera2CapturePipeline");
                                    }
                                    zy2Var = an7Var.e;
                                    if (zy2Var.b && this.b == 0 && zy2Var.a) {
                                        vn7 vn7Var = new vn7();
                                        vn7Var.b(CaptureRequest.CONTROL_AE_MODE, 3);
                                        r38Var.c(vn7Var.a());
                                    }
                                    androidx.concurrent.futures.b bVar3 = new androidx.concurrent.futures.b();
                                    bVar3.c = new hsj0();
                                    gl7 gl7Var = new gl7(bVar3);
                                    bVar3.b = gl7Var;
                                    bVar3.a = x4e.class;
                                    r38Var.b(new zm7(0, bVar3));
                                    bVar3.a = "submitStillCapture";
                                    arrayList2.add(gl7Var);
                                    arrayList3.add(r38Var.e());
                                }
                                ap7Var = null;
                                if (ap7Var == null) {
                                }
                                i = 3;
                                if (ap7Var != null) {
                                }
                                zy2Var = an7Var.e;
                                if (zy2Var.b) {
                                    vn7 vn7Var2 = new vn7();
                                    vn7Var2.b(CaptureRequest.CONTROL_AE_MODE, 3);
                                    r38Var.c(vn7Var2.a());
                                }
                                androidx.concurrent.futures.b bVar32 = new androidx.concurrent.futures.b();
                                bVar32.c = new hsj0();
                                gl7 gl7Var2 = new gl7(bVar32);
                                bVar32.b = gl7Var2;
                                bVar32.a = x4e.class;
                                r38Var.b(new zm7(0, bVar32));
                                bVar32.a = "submitStillCapture";
                                arrayList2.add(gl7Var2);
                                arrayList3.add(r38Var.e());
                            }
                        }
                        sgb1.d("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        ap7Var = null;
                        if (ap7Var == null) {
                        }
                        i = 3;
                        if (ap7Var != null) {
                        }
                        zy2Var = an7Var.e;
                        if (zy2Var.b) {
                        }
                        androidx.concurrent.futures.b bVar322 = new androidx.concurrent.futures.b();
                        bVar322.c = new hsj0();
                        gl7 gl7Var22 = new gl7(bVar322);
                        bVar322.b = gl7Var22;
                        bVar322.a = x4e.class;
                        r38Var.b(new zm7(0, bVar322));
                        bVar322.a = "submitStillCapture";
                        arrayList2.add(gl7Var22);
                        arrayList3.add(r38Var.e());
                    } else {
                        i = 3;
                        sgb1.g(3, "Camera2CapturePipeline");
                        ap7Var = null;
                        if (ap7Var != null) {
                        }
                        zy2Var = an7Var.e;
                        if (zy2Var.b) {
                        }
                        androidx.concurrent.futures.b bVar3222 = new androidx.concurrent.futures.b();
                        bVar3222.c = new hsj0();
                        gl7 gl7Var222 = new gl7(bVar3222);
                        bVar3222.b = gl7Var222;
                        bVar3222.a = x4e.class;
                        r38Var.b(new zm7(0, bVar3222));
                        bVar3222.a = "submitStillCapture";
                        arrayList2.add(gl7Var222);
                        arrayList3.add(r38Var.e());
                    }
                }
            }
            i = 3;
            ap7Var = null;
            if (ap7Var != null) {
            }
            zy2Var = an7Var.e;
            if (zy2Var.b) {
            }
            androidx.concurrent.futures.b bVar32222 = new androidx.concurrent.futures.b();
            bVar32222.c = new hsj0();
            gl7 gl7Var2222 = new gl7(bVar32222);
            bVar32222.b = gl7Var2222;
            bVar32222.a = x4e.class;
            r38Var.b(new zm7(0, bVar32222));
            bVar32222.a = "submitStillCapture";
            arrayList2.add(gl7Var2222);
            arrayList3.add(r38Var.e());
        }
        bVar.E(arrayList3);
        return ni91.b(arrayList2);
    }

    @Override // defpackage.v0x0
    public Object execute() {
        wd21 wd21Var = (wd21) this.c;
        wd21Var.d.o((v111) this.w, this.b + 1, false);
        return null;
    }

    @Override // defpackage.pdj
    public qdj f(tdj tdjVar, Activity activity, zch zchVar) {
        return zchVar.h(tdjVar, new PoolRulesReminderModalView(activity, (String) this.c, (String) this.w, this.b));
    }

    @Override // defpackage.ruy
    public void invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        int i2 = this.b;
        switch (i) {
            case 1:
                ((j42) obj).onMediaItemTransition((h42) obj3, (fe10) obj2, i2);
                break;
            case 2:
                xxc0 xxc0Var = (xxc0) obj;
                xxc0Var.onPositionDiscontinuity(i2);
                xxc0Var.onPositionDiscontinuity((yxc0) obj3, (yxc0) obj2, i2);
                break;
            default:
                ub81 ub81Var = (ub81) obj;
                ub81Var.getClass();
                ub81Var.o((af81) obj3, (af81) obj2, i2);
                break;
        }
    }

    public /* synthetic */ xm7(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.b = i;
    }
}
