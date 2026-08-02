package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z68 implements Callable {
    public final /* synthetic */ int a;
    public final Object b;

    public z68(View view) {
        this.a = 3;
        this.b = new WeakReference(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0236  */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [evj] */
    /* JADX WARN: Type inference failed for: r4v33 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Bundle bundle;
        String str;
        int i;
        int i2;
        String str2;
        boolean z;
        int i3;
        q1x q1xVar;
        qz2 qz2Var;
        switch (this.a) {
            case 0:
                synchronized (((j78) this.b)) {
                    try {
                        j78 j78Var = (j78) this.b;
                        if (j78Var.i == null) {
                            return null;
                        }
                        j78Var.X();
                        if (((j78) this.b).H()) {
                            ((j78) this.b).R();
                            ((j78) this.b).k = 0;
                        }
                        return null;
                    } finally {
                    }
                }
            case 1:
                aqd aqdVar = (aqd) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) aqdVar.c;
                try {
                    Context context = j3c.g;
                    if (context != null) {
                        aqdVar.b = context.getCacheDir();
                        return null;
                    }
                    Intrinsics.j("applicationContext");
                    throw null;
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 2:
                it1 it1Var = (it1) this.b;
                it1Var.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    it1Var.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th) {
                    try {
                        it1Var.c.set(true);
                        throw th;
                    } finally {
                        it1Var.b(null);
                    }
                }
            case 3:
                View view = (View) ((WeakReference) this.b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return "";
                }
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                encodeToString.getClass();
                return encodeToString;
            case 4:
                rlh rlhVar = (rlh) this.b;
                synchronized (((qz2) rlhVar.c).a) {
                    try {
                        if (((qz2) rlhVar.c).b != 3) {
                            int i4 = ((qz2) rlhVar.c).b;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                qz2 qz2Var2 = (qz2) rlhVar.c;
                                l8x.b(bundle, qz2Var2.c, qz2Var2.z.longValue());
                            }
                            try {
                                synchronized (((qz2) rlhVar.c).a) {
                                    try {
                                        try {
                                            q1xVar = ((qz2) rlhVar.c).h;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            while (true) {
                                                try {
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        boolean z2 = i4 != 1;
                                        l8x.h("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                        if (e instanceof DeadObjectException) {
                                            i2 = 101;
                                        } else if (e instanceof RemoteException) {
                                            i2 = 100;
                                        } else if (e instanceof SecurityException) {
                                            i2 = 102;
                                        } else {
                                            i = 42;
                                            String a = i != 42 ? v5x.a(e) : str;
                                            ((qz2) rlhVar.c).o(0);
                                            boolean z3 = z2;
                                            str2 = a;
                                            z = z3;
                                            i3 = 6;
                                            if (i3 == 0) {
                                            }
                                        }
                                        i = i2;
                                        if (i != 42) {
                                        }
                                        ((qz2) rlhVar.c).o(0);
                                        boolean z32 = z2;
                                        str2 = a;
                                        z = z32;
                                        i3 = 6;
                                        if (i3 == 0) {
                                        }
                                    }
                                }
                                qz2Var = (qz2) rlhVar.c;
                            } catch (Exception e2) {
                                e = e2;
                                str = null;
                            }
                            if (q1xVar != null) {
                                String packageName = qz2Var.f.getPackageName();
                                int i5 = 23;
                                i3 = 3;
                                int i6 = 23;
                                while (true) {
                                    if (i6 >= 3) {
                                        if (bundle == null) {
                                            l1x l1xVar = (l1x) q1xVar;
                                            Parcel Q0 = l1xVar.Q0();
                                            Q0.writeInt(i6);
                                            Q0.writeString(packageName);
                                            Q0.writeString("subs");
                                            Parcel R0 = l1xVar.R0(Q0, 1);
                                            int readInt = R0.readInt();
                                            R0.recycle();
                                            i3 = readInt;
                                        } else {
                                            i3 = ((l1x) q1xVar).S0(i6, packageName, "subs", bundle);
                                        }
                                        if (i3 == 0) {
                                            StringBuilder sb = new StringBuilder();
                                            str = null;
                                            sb.append("highestLevelSupportedForSubs: ");
                                            sb.append(i6);
                                            l8x.f("BillingClient", sb.toString());
                                        } else {
                                            i6--;
                                        }
                                    } else {
                                        str = null;
                                        i6 = 0;
                                    }
                                }
                                ((qz2) rlhVar.c).j = i6 >= 3;
                                if (i6 < 3) {
                                    l8x.f("BillingClient", "In-app billing API does not support subscription on this device.");
                                    i = 9;
                                } else {
                                    i = 1;
                                }
                                while (true) {
                                    if (i5 >= 3) {
                                        if (bundle == null) {
                                            l1x l1xVar2 = (l1x) q1xVar;
                                            Parcel Q02 = l1xVar2.Q0();
                                            Q02.writeInt(i5);
                                            Q02.writeString(packageName);
                                            Q02.writeString("inapp");
                                            Parcel R02 = l1xVar2.R0(Q02, 1);
                                            int readInt2 = R02.readInt();
                                            R02.recycle();
                                            i3 = readInt2;
                                        } else {
                                            i3 = ((l1x) q1xVar).S0(i5, packageName, "inapp", bundle);
                                        }
                                        if (i3 == 0) {
                                            ((qz2) rlhVar.c).k = i5;
                                            l8x.f("BillingClient", "mHighestLevelSupportedForInApp: " + i5);
                                        } else {
                                            i5--;
                                        }
                                    }
                                }
                                qz2 qz2Var3 = (qz2) rlhVar.c;
                                int i7 = qz2Var3.k;
                                qz2Var3.u = i7 >= 21;
                                qz2Var3.t = i7 >= 20;
                                qz2Var3.s = i7 >= 19;
                                qz2Var3.r = i7 >= 18;
                                qz2Var3.q = i7 >= 17;
                                qz2Var3.p = i7 >= 16;
                                qz2Var3.o = i7 >= 15;
                                qz2Var3.n = i7 >= 14;
                                qz2Var3.m = i7 >= 9;
                                qz2Var3.l = i7 >= 6;
                                if (i7 < 3) {
                                    l8x.g("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                    i = 36;
                                }
                                if (i3 == 0) {
                                    synchronized (((qz2) rlhVar.c).a) {
                                        try {
                                            if (((qz2) rlhVar.c).b == 3) {
                                                return str;
                                            }
                                            z = i4 != 1;
                                            ((qz2) rlhVar.c).o(2);
                                            ?? r4 = ((qz2) rlhVar.c).e != null ? ((qz2) rlhVar.c).e : str;
                                            if (r4 != 0) {
                                                r4.n(((qz2) rlhVar.c).u);
                                            }
                                        } finally {
                                        }
                                    }
                                } else {
                                    z = i4 != 1;
                                    ((qz2) rlhVar.c).o(0);
                                }
                                str2 = str;
                                if (i3 == 0) {
                                    qz2 qz2Var4 = (qz2) rlhVar.c;
                                    try {
                                        if (true != z) {
                                            try {
                                                qz2Var4.n(v5x.d(6));
                                            } catch (Throwable th4) {
                                                l8x.h("BillingClient", "Unable to log.", th4);
                                            }
                                        } else {
                                            atn atnVar = qz2Var4.g;
                                            hgx o = igx.o();
                                            lfx r = mfx.r();
                                            r.d();
                                            mfx.p((mfx) r.b, 0);
                                            o.d();
                                            igx.n((igx) o.b, (mfx) r.c());
                                            atnVar.Z((igx) o.c());
                                        }
                                    } catch (Throwable th5) {
                                        l8x.h("BillingClient", "Unable to log.", th5);
                                    }
                                    rlhVar.a(b6x.j);
                                    return str;
                                }
                                uz2 uz2Var = b6x.a;
                                try {
                                    if (true != z) {
                                        ((qz2) rlhVar.c).z(i, 6, uz2Var, str2);
                                    } else {
                                        lfx r2 = mfx.r();
                                        int i8 = uz2Var.a;
                                        r2.d();
                                        mfx.p((mfx) r2.b, i8);
                                        String str3 = uz2Var.b;
                                        r2.d();
                                        mfx.o((mfx) r2.b, str3);
                                        r2.e(i);
                                        if (str2 != null) {
                                            r2.d();
                                            mfx.n((mfx) r2.b, str2);
                                        }
                                        atn atnVar2 = ((qz2) rlhVar.c).g;
                                        hgx o2 = igx.o();
                                        mfx mfxVar = (mfx) r2.c();
                                        o2.d();
                                        igx.n((igx) o2.b, mfxVar);
                                        atnVar2.Z((igx) o2.c());
                                    }
                                } catch (Throwable th6) {
                                    l8x.h("BillingClient", "Unable to log.", th6);
                                }
                                rlhVar.a(b6x.a);
                                return str;
                            }
                            qz2Var.o(0);
                            qz2 qz2Var5 = (qz2) rlhVar.c;
                            uz2 uz2Var2 = b6x.k;
                            qz2Var5.y(119, 6, uz2Var2);
                            rlhVar.a(uz2Var2);
                        }
                    } finally {
                    }
                }
                return null;
            default:
                return ((Context) this.b).getSharedPreferences("google_sdk_flags", 0);
        }
    }

    public /* synthetic */ z68(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
