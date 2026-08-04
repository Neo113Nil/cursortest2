package com.gamericefishpro.space.n9;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends com.gamericefishpro.space.i9.x implements h0 {
    public final m4 d;
    public Boolean e;
    public String f;

    public y1(m4 m4Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        com.gamericefishpro.space.v8.c0.g(m4Var);
        this.d = m4Var;
        this.f = null;
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void B(t4 t4Var) {
        G(t4Var);
        I(new t1(this, t4Var, 2));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final String C(t4 t4Var) {
        G(t4Var);
        m4 m4Var = this.d;
        try {
            return (String) m4Var.c().y(new s1(m4Var, t4Var)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m4Var.a().y.c("Failed to get app instance id. appId", v0.z(t4Var.d), e);
            return null;
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void D(t4 t4Var) {
        com.gamericefishpro.space.v8.c0.d(t4Var.d);
        com.gamericefishpro.space.v8.c0.g(t4Var.L);
        F(new t1(this, t4Var, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.gamericefishpro.space.i9.x
    public final boolean E(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        m4 m4Var = this.d;
        ArrayList arrayList = null;
        j0 i0Var = null;
        l0 k0Var = null;
        switch (i) {
            case 1:
                u uVar = (u) com.gamericefishpro.space.i9.y.a(parcel, u.CREATOR);
                t4 t4Var = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                v(uVar, t4Var);
                parcel2.writeNoException();
                return true;
            case 2:
                o4 o4Var = (o4) com.gamericefishpro.space.i9.y.a(parcel, o4.CREATOR);
                t4 t4Var2 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                i(o4Var, t4Var2);
                parcel2.writeNoException();
                return true;
            case 3:
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                t4 t4Var3 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                o(t4Var3);
                parcel2.writeNoException();
                return true;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                u uVar2 = (u) com.gamericefishpro.space.i9.y.a(parcel, u.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                com.gamericefishpro.space.i9.y.d(parcel);
                com.gamericefishpro.space.v8.c0.g(uVar2);
                com.gamericefishpro.space.v8.c0.d(string);
                H(string, true);
                I(new com.gamericefishpro.space.m6.e((Object) this, (com.gamericefishpro.space.w8.a) uVar2, (Object) string, 3));
                parcel2.writeNoException();
                return true;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                t4 t4Var4 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                B(t4Var4);
                parcel2.writeNoException();
                return true;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                t4 t4Var5 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                com.gamericefishpro.space.i9.y.d(parcel);
                G(t4Var5);
                String str = t4Var5.d;
                com.gamericefishpro.space.v8.c0.g(str);
                try {
                    List<p4> list2 = (List) m4Var.c().y(new s1(this, str, 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (p4 p4Var : list2) {
                        if (objArr != false || !r4.P(p4Var.c)) {
                            arrayList2.add(new o4(p4Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    m4Var.a().y.c("Failed to get user properties. appId", v0.z(str), e);
                } catch (ExecutionException e2) {
                    e = e2;
                    m4Var.a().y.c("Failed to get user properties. appId", v0.z(str), e);
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                u uVar3 = (u) com.gamericefishpro.space.i9.y.a(parcel, u.CREATOR);
                String string2 = parcel.readString();
                com.gamericefishpro.space.i9.y.d(parcel);
                byte[] bArrG = g(uVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrG);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                com.gamericefishpro.space.i9.y.d(parcel);
                m(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case RequestError.STOP_TRACKING /* 11 */:
                t4 t4Var6 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                String strC = C(t4Var6);
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 12:
                e eVar = (e) com.gamericefishpro.space.i9.y.a(parcel, e.CREATOR);
                t4 t4Var7 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                r(eVar, t4Var7);
                parcel2.writeNoException();
                return true;
            case 13:
                e eVar2 = (e) com.gamericefishpro.space.i9.y.a(parcel, e.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                com.gamericefishpro.space.v8.c0.g(eVar2);
                com.gamericefishpro.space.v8.c0.g(eVar2.i);
                com.gamericefishpro.space.v8.c0.d(eVar2.d);
                H(eVar2.d, true);
                I(new com.gamericefishpro.space.va.a(11, this, new e(eVar2), false));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = com.gamericefishpro.space.i9.y.a;
                z = parcel.readInt() != 0;
                t4 t4Var8 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                List listE = e(string6, string7, z, t4Var8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listE);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = com.gamericefishpro.space.i9.y.a;
                z = parcel.readInt() != 0;
                com.gamericefishpro.space.i9.y.d(parcel);
                List listF = f(string8, string9, string10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(listF);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                t4 t4Var9 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                List listY = y(string11, string12, t4Var9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                com.gamericefishpro.space.i9.y.d(parcel);
                List listP = p(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP);
                return true;
            case 18:
                t4 t4Var10 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                l(t4Var10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) com.gamericefishpro.space.i9.y.a(parcel, Bundle.CREATOR);
                t4 t4Var11 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                u(bundle, t4Var11);
                parcel2.writeNoException();
                return true;
            case 20:
                t4 t4Var12 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                D(t4Var12);
                parcel2.writeNoException();
                return true;
            case 21:
                t4 t4Var13 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                i iVarW = w(t4Var13);
                parcel2.writeNoException();
                if (iVarW == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                iVarW.writeToParcel(parcel2, 1);
                return true;
            case 24:
                t4 t4Var14 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                Bundle bundle2 = (Bundle) com.gamericefishpro.space.i9.y.a(parcel, Bundle.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                G(t4Var14);
                String str2 = t4Var14.d;
                com.gamericefishpro.space.v8.c0.g(str2);
                if (!m4Var.d0().B(null, e0.Y0)) {
                    try {
                        list = (List) m4Var.c().y(new w1(this, t4Var14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        m4Var.a().y.c("Failed to get trigger URIs. appId", v0.z(str2), e3);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) m4Var.c().z(new w1(this, t4Var14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        m4Var.a().y.c("Failed to get trigger URIs. appId", v0.z(str2), e4);
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                t4 t4Var15 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                d(t4Var15);
                parcel2.writeNoException();
                return true;
            case 26:
                t4 t4Var16 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                z(t4Var16);
                parcel2.writeNoException();
                return true;
            case 27:
                t4 t4Var17 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                n(t4Var17);
                parcel2.writeNoException();
                return true;
            case 29:
                t4 t4Var18 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                e4 e4Var = (e4) com.gamericefishpro.space.i9.y.a(parcel, e4.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    k0Var = iInterfaceQueryLocalInterface instanceof l0 ? (l0) iInterfaceQueryLocalInterface : new k0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 2);
                }
                com.gamericefishpro.space.i9.y.d(parcel);
                k(t4Var18, e4Var, k0Var);
                parcel2.writeNoException();
                return true;
            case 30:
                t4 t4Var19 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                d dVar = (d) com.gamericefishpro.space.i9.y.a(parcel, d.CREATOR);
                com.gamericefishpro.space.i9.y.d(parcel);
                q(t4Var19, dVar);
                parcel2.writeNoException();
                return true;
            case 31:
                t4 t4Var20 = (t4) com.gamericefishpro.space.i9.y.a(parcel, t4.CREATOR);
                Bundle bundle3 = (Bundle) com.gamericefishpro.space.i9.y.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    i0Var = iInterfaceQueryLocalInterface2 instanceof j0 ? (j0) iInterfaceQueryLocalInterface2 : new i0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 2);
                }
                com.gamericefishpro.space.i9.y.d(parcel);
                s(t4Var20, bundle3, i0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void F(Runnable runnable) {
        m4 m4Var = this.d;
        if (m4Var.c().x()) {
            runnable.run();
        } else {
            m4Var.c().C(runnable);
        }
    }

    public final void G(t4 t4Var) {
        com.gamericefishpro.space.v8.c0.g(t4Var);
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str);
        H(str, false);
        this.d.j0().v(t4Var.e);
    }

    public final void H(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        m4 m4Var = this.d;
        if (zIsEmpty) {
            m4Var.a().y.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.e == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f) && !com.gamericefishpro.space.z8.b.b(m4Var.E.d, Binder.getCallingUid()) && !com.gamericefishpro.space.s8.j.a(m4Var.E.d).b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.e = Boolean.valueOf(z2);
                }
                if (this.e.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                m4Var.a().y.b(v0.z(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f == null) {
            Context context = m4Var.E.d;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = com.gamericefishpro.space.s8.h.a;
            if (com.gamericefishpro.space.z8.b.d(callingUid, context, str)) {
                this.f = str;
            }
        }
        if (str.equals(this.f)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void I(Runnable runnable) {
        m4 m4Var = this.d;
        if (m4Var.c().x()) {
            runnable.run();
        } else {
            m4Var.c().A(runnable);
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void d(t4 t4Var) {
        com.gamericefishpro.space.v8.c0.d(t4Var.d);
        com.gamericefishpro.space.v8.c0.g(t4Var.L);
        F(new t1(this, t4Var, 6));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List e(String str, String str2, boolean z, t4 t4Var) {
        G(t4Var);
        String str3 = t4Var.d;
        com.gamericefishpro.space.v8.c0.g(str3);
        m4 m4Var = this.d;
        try {
            List<p4> list = (List) m4Var.c().y(new v1(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (p4 p4Var : list) {
                if (z || !r4.P(p4Var.c)) {
                    arrayList.add(new o4(p4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            m4Var.a().y.c("Failed to query user properties. appId", v0.z(str3), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            m4Var.a().y.c("Failed to query user properties. appId", v0.z(str3), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List f(String str, String str2, String str3, boolean z) {
        H(str, true);
        m4 m4Var = this.d;
        try {
            List<p4> list = (List) m4Var.c().y(new v1(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (p4 p4Var : list) {
                if (z || !r4.P(p4Var.c)) {
                    arrayList.add(new o4(p4Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            m4Var.a().y.c("Failed to get user properties as. appId", v0.z(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            m4Var.a().y.c("Failed to get user properties as. appId", v0.z(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final byte[] g(u uVar, String str) {
        com.gamericefishpro.space.v8.c0.d(str);
        com.gamericefishpro.space.v8.c0.g(uVar);
        H(str, true);
        m4 m4Var = this.d;
        t0 t0Var = m4Var.a().F;
        r1 r1Var = m4Var.E;
        p0 p0Var = r1Var.C;
        String str2 = uVar.d;
        t0Var.b(p0Var.a(str2), "Log and bundle. event");
        m4Var.e().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) m4Var.c().z(new k1(this, uVar, str)).get();
            if (bArr == null) {
                m4Var.a().y.b(v0.z(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            m4Var.e().getClass();
            m4Var.a().F.d("Log and bundle processed. event, size, time_ms", r1Var.C.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            m4Var.a().y.d("Failed to log and bundle. appId, event, error", v0.z(str), r1Var.C.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            m4Var.a().y.d("Failed to log and bundle. appId, event, error", v0.z(str), r1Var.C.a(str2), e);
            return null;
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void i(o4 o4Var, t4 t4Var) {
        com.gamericefishpro.space.v8.c0.g(o4Var);
        G(t4Var);
        I(new com.gamericefishpro.space.m6.e((Object) this, (com.gamericefishpro.space.w8.a) o4Var, (Object) t4Var, 4));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void k(t4 t4Var, e4 e4Var, l0 l0Var) {
        G(t4Var);
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.g(str);
        this.d.c().A(new com.gamericefishpro.space.d4.r0(this, str, e4Var, l0Var, 2));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void l(t4 t4Var) {
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str);
        H(str, false);
        I(new t1(this, t4Var, 3));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void m(long j, String str, String str2, String str3) {
        I(new u1(this, str2, str3, str, j, 0));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void n(t4 t4Var) {
        G(t4Var);
        I(new t1(this, t4Var, 1));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void o(t4 t4Var) {
        G(t4Var);
        I(new t1(this, t4Var, 0));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List p(String str, String str2, String str3) {
        H(str, true);
        m4 m4Var = this.d;
        try {
            return (List) m4Var.c().y(new v1(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            m4Var.a().y.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void q(t4 t4Var, d dVar) {
        G(t4Var);
        I(new com.gamericefishpro.space.m6.e((Object) this, (Object) t4Var, (Object) dVar, 5));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void r(e eVar, t4 t4Var) {
        com.gamericefishpro.space.v8.c0.g(eVar);
        com.gamericefishpro.space.v8.c0.g(eVar.i);
        G(t4Var);
        e eVar2 = new e(eVar);
        eVar2.d = t4Var.d;
        I(new com.gamericefishpro.space.m6.e((Object) this, (com.gamericefishpro.space.w8.a) eVar2, (Object) t4Var, 1));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void s(t4 t4Var, Bundle bundle, j0 j0Var) {
        G(t4Var);
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.g(str);
        this.d.c().A(new x1(this, t4Var, bundle, j0Var, str));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void u(Bundle bundle, t4 t4Var) {
        G(t4Var);
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.g(str);
        I(new com.gamericefishpro.space.d4.r0(this, bundle, str, t4Var, 4));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void v(u uVar, t4 t4Var) {
        com.gamericefishpro.space.v8.c0.g(uVar);
        G(t4Var);
        I(new com.gamericefishpro.space.m6.e((Object) this, (com.gamericefishpro.space.w8.a) uVar, (Object) t4Var, 2));
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final i w(t4 t4Var) {
        G(t4Var);
        String str = t4Var.d;
        com.gamericefishpro.space.v8.c0.d(str);
        m4 m4Var = this.d;
        try {
            return (i) m4Var.c().z(new s1(this, t4Var, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m4Var.a().y.c("Failed to get consent. appId", v0.z(str), e);
            return new i(null);
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final List y(String str, String str2, t4 t4Var) {
        G(t4Var);
        String str3 = t4Var.d;
        com.gamericefishpro.space.v8.c0.g(str3);
        m4 m4Var = this.d;
        try {
            return (List) m4Var.c().y(new v1(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            m4Var.a().y.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.gamericefishpro.space.n9.h0
    public final void z(t4 t4Var) {
        com.gamericefishpro.space.v8.c0.d(t4Var.d);
        com.gamericefishpro.space.v8.c0.g(t4Var.L);
        F(new t1(this, t4Var, 5));
    }
}
