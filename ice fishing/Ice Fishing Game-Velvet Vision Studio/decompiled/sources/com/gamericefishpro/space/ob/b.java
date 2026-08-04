package com.gamericefishpro.space.ob;

import android.text.TextUtils;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ c e;

    public /* synthetic */ b(c cVar, int i) {
        this.d = i;
        this.e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.gamericefishpro.space.pb.b bVarR;
        com.gamericefishpro.space.pb.b bVarG;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.a();
                return;
            case 1:
                c cVar = this.e;
                Object obj = c.m;
                synchronized (obj) {
                    try {
                        com.gamericefishpro.space.wa.g gVar = cVar.a;
                        gVar.a();
                        com.gamericefishpro.space.u6.e eVarB = com.gamericefishpro.space.u6.e.b(gVar.a);
                        try {
                            bVarR = cVar.c.r();
                            if (eVarB != null) {
                                eVarB.h();
                            }
                        } catch (Throwable th) {
                            if (eVarB != null) {
                                eVarB.h();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    int i = bVarR.b;
                    if (i == 5) {
                        bVarG = cVar.g(bVarR);
                    } else {
                        if (i == 3) {
                            bVarG = cVar.g(bVarR);
                        } else if (!cVar.d.a(bVarR)) {
                            return;
                        } else {
                            bVarG = cVar.b(bVarR);
                        }
                    }
                    synchronized (obj) {
                        try {
                            com.gamericefishpro.space.wa.g gVar2 = cVar.a;
                            gVar2.a();
                            com.gamericefishpro.space.u6.e eVarB2 = com.gamericefishpro.space.u6.e.b(gVar2.a);
                            try {
                                cVar.c.k(bVarG);
                                if (eVarB2 != null) {
                                    eVarB2.h();
                                }
                            } catch (Throwable th3) {
                                if (eVarB2 != null) {
                                    eVarB2.h();
                                }
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.k.size() != 0 && !TextUtils.equals(bVarR.a, bVarG.a)) {
                                Iterator it = cVar.k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    if (bVarG.b == 4) {
                        String str = bVarG.a;
                        synchronized (cVar) {
                            cVar.j = str;
                        }
                    }
                    int i2 = bVarG.b;
                    if (i2 == 5) {
                        cVar.h(new e());
                        return;
                    } else if (i2 == 2 || i2 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (e e) {
                    cVar.h(e);
                    return;
                }
            default:
                this.e.a();
                return;
        }
    }
}
