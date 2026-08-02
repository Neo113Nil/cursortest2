package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.accompanist.permissions.a;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.permissions.api.Permission;
import ru.yandex.taxi.logistics.sdk.permissions.impl.b;

/* loaded from: classes5.dex */
public final class rza0 implements fza0 {
    public final b a;

    public rza0(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.fza0
    public final Object a(Permission permission, ContinuationImpl continuationImpl) {
        return this.a.a(permission, continuationImpl);
    }

    @Override // defpackage.fza0
    public final boolean b(Permission permission) {
        return this.a.b(permission);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v33, types: [u9y] */
    public final void c(Permission[] permissionArr, fid fidVar, int i) {
        dx40 dx40Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-991146075);
        int i2 = (btsVar.e(this) ? 32 : 16) | i;
        btsVar.c0(991362147, Integer.valueOf(permissionArr.length));
        int i3 = 4;
        int i4 = 0;
        int i5 = i2 | (btsVar.c(permissionArr.length) ? 4 : 0);
        for (Permission permission : permissionArr) {
            i5 |= btsVar.c(permission.ordinal()) ? 4 : 0;
        }
        btsVar.t(false);
        if ((i5 & 14) == 0) {
            i5 |= 2;
        }
        int i6 = 1;
        int i7 = 3;
        if (btsVar.V(i5 & 1, (i5 & 19) != 18)) {
            Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
            int length = permissionArr.length;
            int i8 = 0;
            while (i8 < length) {
                Permission permission2 = permissionArr[i8];
                boolean e = btsVar.e(this) | btsVar.c(permission2.ordinal());
                Object Q = btsVar.Q();
                o430 o430Var = did.a;
                if (e || Q == o430Var) {
                    Q = new xw90(13, this, permission2);
                    btsVar.o0(Q);
                }
                sls slsVar = (sls) Q;
                int i9 = qza0.a[permission2.ordinal()];
                int i10 = 2;
                if (i9 == 1) {
                    btsVar.e0(618995323);
                    boolean k = btsVar.k(slsVar);
                    Object Q2 = btsVar.Q();
                    if (k || Q2 == o430Var) {
                        Q2 = new e350(i10, slsVar);
                        btsVar.o0(Q2);
                    }
                    dx40Var = new dx40(i6, a.d("android.permission.CALL_PHONE", (tls) Q2, btsVar));
                    btsVar.t(false);
                } else if (i9 == 2) {
                    btsVar.e0(619005380);
                    List g = scc.g("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
                    boolean k2 = btsVar.k(slsVar);
                    Object Q3 = btsVar.Q();
                    if (k2 || Q3 == o430Var) {
                        Q3 = new e350(3, slsVar);
                        btsVar.o0(Q3);
                    }
                    dx40Var = new dx40(i4, a.c(g, (tls) Q3, btsVar));
                    btsVar.t(false);
                } else if (i9 != i7) {
                    int i11 = 5;
                    if (i9 == 4) {
                        btsVar.e0(619030549);
                        if (Build.VERSION.SDK_INT >= 33) {
                            btsVar.e0(2010130940);
                            boolean k3 = btsVar.k(slsVar);
                            Object Q4 = btsVar.Q();
                            if (k3 || Q4 == o430Var) {
                                Q4 = new e350(i11, slsVar);
                                btsVar.o0(Q4);
                            }
                            dx40 dx40Var2 = new dx40(i6, a.d("android.permission.POST_NOTIFICATIONS", (tls) Q4, btsVar));
                            btsVar.t(false);
                            dx40Var = dx40Var2;
                        } else {
                            btsVar.e0(2010466081);
                            Object Q5 = btsVar.Q();
                            if (Q5 == o430Var) {
                                Q5 = new u9y(context);
                                btsVar.o0(Q5);
                            }
                            btsVar.t(false);
                            dx40Var = (u9y) Q5;
                        }
                        btsVar.t(false);
                    } else {
                        if (i9 != 5) {
                            throw unr0.y(618995173, btsVar, false);
                        }
                        btsVar.e0(619048351);
                        boolean k4 = btsVar.k(slsVar);
                        Object Q6 = btsVar.Q();
                        if (k4 || Q6 == o430Var) {
                            Q6 = new e350(6, slsVar);
                            btsVar.o0(Q6);
                        }
                        dx40Var = new dx40(i6, a.d("android.permission.READ_CONTACTS", (tls) Q6, btsVar));
                        btsVar.t(false);
                    }
                } else {
                    btsVar.e0(619020438);
                    boolean k5 = btsVar.k(slsVar);
                    Object Q7 = btsVar.Q();
                    if (k5 || Q7 == o430Var) {
                        Q7 = new e350(i3, slsVar);
                        btsVar.o0(Q7);
                    }
                    dx40Var = new dx40(i6, a.d("android.permission.CAMERA", (tls) Q7, btsVar));
                    btsVar.t(false);
                }
                this.a.a.put(permission2, dx40Var);
                i8++;
                i7 = 3;
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new o990(this, permissionArr, i, 3);
        }
    }
}
