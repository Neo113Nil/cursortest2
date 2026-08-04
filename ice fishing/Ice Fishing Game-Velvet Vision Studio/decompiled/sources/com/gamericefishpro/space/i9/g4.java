package com.gamericefishpro.space.i9;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 {
    public static g4 d;
    public boolean a;
    public Object b;
    public Object c;

    public g4(int i) {
        switch (i) {
            case 3:
                this.b = new Object();
                break;
            default:
                this.a = false;
                this.b = null;
                this.c = null;
                break;
        }
    }

    public static g4 c(Context context) {
        g4 g4Var;
        g4 g4Var2;
        synchronized (g4.class) {
            try {
                if (d == null) {
                    if (com.gamericefishpro.space.s3.a.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        g4Var2 = new g4();
                        g4Var2.a = false;
                        g4Var2.b = context;
                        g4Var2.c = new f4(null);
                    } else {
                        g4Var2 = new g4(0);
                    }
                    d = g4Var2;
                }
                g4 g4Var3 = d;
                if (g4Var3 != null && ((f4) g4Var3.c) != null && !g4Var3.a) {
                    try {
                        context.getContentResolver().registerContentObserver(x3.a, true, (f4) d.c);
                        g4 g4Var4 = d;
                        g4Var4.getClass();
                        g4Var4.a = true;
                    } catch (SecurityException e) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e);
                    }
                }
                g4Var = d;
                g4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return g4Var;
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((com.gamericefishpro.space.u6.c) this.c).d;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (com.gamericefishpro.space.u6.f.s(((com.gamericefishpro.space.b2.o) obj).a, j)) {
                break;
            }
            i++;
        }
        com.gamericefishpro.space.b2.o oVar = (com.gamericefishpro.space.b2.o) obj;
        if (oVar != null) {
            return oVar.h;
        }
        return false;
    }

    public void b(com.gamericefishpro.space.t8.a aVar, com.gamericefishpro.space.r9.h hVar) {
        com.gamericefishpro.space.tb.u uVar = (com.gamericefishpro.space.tb.u) ((com.gamericefishpro.space.tb.u) this.c).e;
        uVar.getClass();
        com.gamericefishpro.space.x8.a aVar2 = (com.gamericefishpro.space.x8.a) ((com.gamericefishpro.space.x8.c) aVar).u();
        com.gamericefishpro.space.v8.n nVar = (com.gamericefishpro.space.v8.n) uVar.e;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar2.f);
        int i = com.gamericefishpro.space.f9.b.a;
        if (nVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            nVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar2.e.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            hVar.a(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public void d(com.gamericefishpro.space.r9.m mVar) {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0057 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:9:0x0010, B:11:0x0014, B:18:0x001e, B:20:0x0022, B:21:0x002c, B:34:0x0057, B:35:0x0059, B:24:0x0032, B:26:0x0038, B:30:0x0045, B:32:0x0053), top: B:61:0x0010, inners: #4 }] */
    public String e(String str) {
        Object objA;
        Context context = (Context) this.b;
        if (context != null) {
            boolean z = true;
            if (!a4.b) {
                synchronized (a4.class) {
                    try {
                        if (!a4.b) {
                            int i = 1;
                            while (true) {
                                boolean z2 = false;
                                if (i <= 2) {
                                    if (a4.a == null) {
                                        a4.a = (UserManager) context.getSystemService(UserManager.class);
                                    }
                                    UserManager userManager = a4.a;
                                    if (userManager == null) {
                                        z2 = true;
                                    } else {
                                        try {
                                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                                z2 = true;
                                            }
                                        } catch (NullPointerException e) {
                                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                            a4.a = null;
                                            i++;
                                        }
                                    }
                                    if (z2) {
                                        a4.b = true;
                                    }
                                    z = z2;
                                }
                                if (z2) {
                                    a4.a = null;
                                }
                                if (z2) {
                                    a4.b = true;
                                }
                                z = z2;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                try {
                    try {
                        t tVar = new t(this, str);
                        try {
                            objA = tVar.a();
                        } catch (SecurityException unused) {
                            long jClearCallingIdentity = Binder.clearCallingIdentity();
                            try {
                                objA = tVar.a();
                            } finally {
                                Binder.restoreCallingIdentity(jClearCallingIdentity);
                            }
                        }
                        return (String) objA;
                    } catch (SecurityException e2) {
                        e = e2;
                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    e = e3;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                } catch (NullPointerException e4) {
                    e = e4;
                    Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e);
                    return null;
                }
            }
        }
        return null;
    }

    public void f(Task task) {
        com.gamericefishpro.space.r9.m mVar;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            mVar = (com.gamericefishpro.space.r9.m) ((ArrayDeque) this.c).poll();
                            if (mVar == null) {
                                this.a = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    mVar.b(task);
                }
            }
        }
    }
}
